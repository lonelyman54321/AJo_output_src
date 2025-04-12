/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 */
package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$d;

public final class SingletonConnectivityReceiver$d$a
extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ SingletonConnectivityReceiver$d a;

    public SingletonConnectivityReceiver$d$a(SingletonConnectivityReceiver$d singletonConnectivityReceiver$d) {
        this.a = singletonConnectivityReceiver$d;
    }

    public final void onAvailable(Network object) {
        object = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1(this, true);
        dz3.f().post((Runnable)object);
    }

    public final void onLost(Network object) {
        object = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1(this, false);
        dz3.f().post((Runnable)object);
    }
}

