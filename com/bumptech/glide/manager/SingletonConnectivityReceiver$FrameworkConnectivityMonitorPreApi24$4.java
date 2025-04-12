/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5;

class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4
implements Runnable {
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 a;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24) {
        this.a = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a;
        boolean bl3 = ((SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24)object).d;
        SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 = this.a;
        singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24.d = bl2 = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24.b();
        singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 = this.a;
        boolean bl4 = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24.d;
        if (bl3 != bl4) {
            object = "ConnectivityMonitor";
            int n3 = 3;
            bl3 = Log.isLoggable((String)object, (int)n3);
            if (bl3) {
                object = this.a;
                bl3 = ((SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24)object).d;
            }
            object = this.a;
            boolean bl5 = ((SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24)object).d;
            SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5 = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5((SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24)object, bl5);
            object = dz3.f();
            object.post((Runnable)singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5);
        }
    }
}

