/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 */
package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;

class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3
implements Runnable {
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 a;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24) {
        this.a = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
    }

    public final void run() {
        Object object = this.a;
        boolean bl2 = object.e;
        if (!bl2) {
            return;
        }
        this.a.e = false;
        object = this.a;
        Context context = object.a;
        object = object.f;
        context.unregisterReceiver((BroadcastReceiver)object);
    }
}

