/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4;

public final class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a
extends BroadcastReceiver {
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 a;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$a(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24) {
        this.a = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
    }

    public final void onReceive(Context object, Intent object2) {
        object = this.a;
        object.getClass();
        object2 = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4((SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24)object);
        SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24.g.execute((Runnable)object2);
    }
}

