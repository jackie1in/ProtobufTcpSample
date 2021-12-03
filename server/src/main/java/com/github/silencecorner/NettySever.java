package com.github.silencecorner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import reactor.netty.tcp.TcpServer;

public class NettySever {
    private static final Logger log = LoggerFactory.getLogger(NettySever.class);
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), Executors.defaultThreadFactory());

    public static void main(String[] args) {
        TcpServer.create()
                .doOnBound(disposableServer -> {
                    log.info("服务器ip[{}] port[{}]已启动", disposableServer.host(), disposableServer.port());
                })
                .doOnUnbound(disposableServer -> {
                    log.info("服务器ip[{}] port[{}]已启动", disposableServer.host(), disposableServer.port());
                })
                .doOnConnection(connection -> {
                    connection.addHandler(new LengthFieldBasedFrameDecoder(1048576, 0, 4, 0, 4));
                    connection.addHandler(new ProtobufDecoder(Clock.getDefaultInstance()));
                    connection.addHandler(new ProtobufEncoder());
                    connection.addHandler(new LengthFieldPrepender(4));
                    SCHEDULED_EXECUTOR_SERVICE.scheduleAtFixedRate(() -> {
                        connection.channel().writeAndFlush(Clock.newBuilder().setNow(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"))).build());
                    }, 1,1, TimeUnit.SECONDS);
                    InetSocketAddress remoteAddress = (InetSocketAddress)connection.channel().remoteAddress();
                    log.info("客户端ip[{}] port[{}]已连接", remoteAddress.getHostString(),remoteAddress.getPort());

                })
                .host("0.0.0.0")
                .port(1234)
                .bindNow()
                .onDispose()
                .block();

    }
}
