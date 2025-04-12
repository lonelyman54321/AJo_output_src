/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.os.AsyncTask
 *  android.util.Log
 */
package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.util.Log;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$b;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$c;
import com.bumptech.glide.manager.a$a;
import java.util.concurrent.Executor;

public final class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24
implements SingletonConnectivityReceiver$c {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;
    public final a$a b;
    public final ZZ0 c;
    public volatile boolean d;
    public volatile boolean e;
    public final SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a f;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24(Context context, yz0_0 yz0_02, SingletonConnectivityReceiver$b singletonConnectivityReceiver$b) {
        SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a;
        this.f = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a(this);
        this.a = context = context.getApplicationContext();
        this.c = yz0_02;
        this.b = singletonConnectivityReceiver$b;
    }

    public final boolean a() {
        SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2 = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2(this);
        g.execute(singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2);
        return true;
    }

    public final boolean b() {
        boolean bl2;
        Object object;
        boolean bl3 = true;
        try {
            object = this.c;
        }
        catch (RuntimeException runtimeException) {
            Log.isLoggable((String)"ConnectivityMonitor", (int)5);
            return bl3;
        }
        object = object.get();
        object = (ConnectivityManager)object;
        object = object.getActiveNetworkInfo();
        if (object == null || !(bl2 = object.isConnected())) {
            bl3 = false;
        }
        return bl3;
    }

    public final void unregister() {
        SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3 = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3(this);
        g.execute(singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3);
    }
}

