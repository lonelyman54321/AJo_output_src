/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.util.Log
 */
package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.util.Log;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$b;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$c;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$d$a;
import com.bumptech.glide.manager.a$a;

public final class SingletonConnectivityReceiver$d
implements SingletonConnectivityReceiver$c {
    public boolean a;
    public final a$a b;
    public final ZZ0 c;
    public final SingletonConnectivityReceiver$d$a d;

    public SingletonConnectivityReceiver$d(yz0_0 yz0_02, SingletonConnectivityReceiver$b singletonConnectivityReceiver$b) {
        SingletonConnectivityReceiver$d$a singletonConnectivityReceiver$d$a;
        this.d = singletonConnectivityReceiver$d$a = new SingletonConnectivityReceiver$d$a(this);
        this.c = yz0_02;
        this.b = singletonConnectivityReceiver$b;
    }

    public final boolean a() {
        boolean bl2;
        Object object = this.c;
        Object object2 = jk2_0.a((ConnectivityManager)object.get());
        boolean bl3 = true;
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.a = bl2;
        try {
            object = object.get();
        }
        catch (RuntimeException runtimeException) {
            Log.isLoggable((String)"ConnectivityMonitor", (int)5);
            return false;
        }
        object = (ConnectivityManager)object;
        object2 = this.d;
        v63.a((ConnectivityManager)object, (SingletonConnectivityReceiver$d$a)((Object)object2));
        return bl3;
    }

    public final void unregister() {
        ConnectivityManager connectivityManager = (ConnectivityManager)this.c.get();
        SingletonConnectivityReceiver$d$a singletonConnectivityReceiver$d$a = this.d;
        connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)singletonConnectivityReceiver$d$a);
    }
}

