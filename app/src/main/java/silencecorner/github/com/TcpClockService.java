package silencecorner.github.com;

import static android.provider.Telephony.Carriers.PORT;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableField;
import android.graphics.Color;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.github.silencecorner.Clock;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class TcpClockService extends Service {
    private final AtomicBoolean working = new AtomicBoolean(false);
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private String ip;
    private int port;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    @Override
    public void onCreate() {
        ObservableField<String> observableField = new ObservableField<>();
        observableField.set(LocalDateTime.now().format(dateTimeFormatter));
        MainActivity.CLOCK_MODEL.setTime(observableField);
        this.ip = "192.168.0.100";
        this.port = 1234;
        executorService.execute(this::start0);
        startMeForeground();
        // retry
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            if (!working.get()){
                start0();
                executorService.execute(this::start0);
                startMeForeground();
            }
            Log.e("retry connecting","");
        },10,5, TimeUnit.SECONDS);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    public void start0(){
        Socket socket = null;
        try {
            InetAddress inetAddress = InetAddress.getByName(ip);
            socket = new Socket(inetAddress, port);
            working.set(true);
        } catch (IOException e) {
            Log.w("客户端连接服务端错误",e);
            working.set(false);
        }
        if (!working.get()){
            return;
        }
        try {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (working.get()){
               Clock clock = Clock.parseDelimitedFrom(socket.getInputStream());
               if (!Clock.getDefaultInstance().equals(clock)) {
                   MainActivity.CLOCK_MODEL.getTime().set(LocalDateTime.ofEpochSecond(clock.getNow(), 0, ZoneOffset.of("+8")).format(dateTimeFormatter));
               }
            }
        } catch (IOException e) {
            Log.w("读取数据错误",e);
            working.set(false);
            try {
                socket.close();
            } catch (IOException ioException) {
                Log.w("关闭连接错误",e);
            }
        }
    }
    private void startMeForeground() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String NOTIFICATION_CHANNEL_ID = this.getClass().getPackage().getName();
            String channelName = "Tcp Client Background Service";
            NotificationChannel chan = new NotificationChannel(NOTIFICATION_CHANNEL_ID, channelName, NotificationManager.IMPORTANCE_NONE);
            chan.setLightColor(Color.BLUE);
            chan.setLockscreenVisibility( Notification.VISIBILITY_PRIVATE);
            NotificationManager manager = (NotificationManager)(getSystemService(Context.NOTIFICATION_SERVICE));
            manager.createNotificationChannel(chan);
            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);
            Notification notification = notificationBuilder.setOngoing(true)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentTitle("服务器时钟tcp连接正在后台运行")
                    .setPriority(NotificationManager.IMPORTANCE_MIN)
                    .setCategory(Notification.CATEGORY_SERVICE)
                    .build();
            startForeground(2, notification);
        } else {
            startForeground(1, new Notification());
        }
    }
}
