package silencecorner.github.com;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import silencecorner.github.com.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    public static final ClockModel CLOCK_MODEL = new ClockModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Clock
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(CLOCK_MODEL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(new Intent(this, TcpClockService.class));
        } else {
            startService(new Intent(this, TcpClockService.class));
        }
    }
}