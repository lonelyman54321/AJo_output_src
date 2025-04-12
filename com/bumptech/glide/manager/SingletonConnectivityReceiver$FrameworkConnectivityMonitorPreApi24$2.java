/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.util.Log
 */
package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;

class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2
implements Runnable {
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 a;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi24) {
        this.a = frameworkConnectivityMonitorPreApi24;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a;
        object.d = bl2 = object.b();
        object = this.a;
        Context context = object.a;
        object = object.f;
        String string2 = "android.net.conn.CONNECTIVITY_CHANGE";
        IntentFilter intentFilter = new IntentFilter(string2);
        context.registerReceiver((BroadcastReceiver)object, intentFilter);
        object = this.a;
        bl2 = true;
        try {
            object.e = bl2;
        }
        catch (SecurityException securityException) {
            Log.isLoggable((String)"ConnectivityMonitor", (int)5);
            object = this.a;
            bl2 = false;
            context = null;
            object.e = false;
        }
    }
}

