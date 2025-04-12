/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.bumptech.glide.manager;

import android.content.Context;
import android.os.Build;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$a;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$b;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$c;
import java.util.HashSet;

public final class SingletonConnectivityReceiver {
    public static volatile SingletonConnectivityReceiver d;
    public final SingletonConnectivityReceiver$c a;
    public final HashSet b;
    public boolean c;

    public SingletonConnectivityReceiver(Context object) {
        Object object2 = new HashSet();
        this.b = object2;
        object2 = new SingletonConnectivityReceiver$a((Context)object);
        yz0_0 yz0_02 = new yz0_0((ZZ0)object2);
        object2 = new SingletonConnectivityReceiver$b(this);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            super(yz0_02, (SingletonConnectivityReceiver$b)object2);
        } else {
            SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24((Context)object, yz0_02, (SingletonConnectivityReceiver$b)object2);
            object = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
        }
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static SingletonConnectivityReceiver a(Context context) {
        Object object = d;
        if (object != null) return d;
        object = SingletonConnectivityReceiver.class;
        synchronized (object) {
            try {
                SingletonConnectivityReceiver singletonConnectivityReceiver = d;
                if (singletonConnectivityReceiver != null) return d;
                context = context.getApplicationContext();
                d = singletonConnectivityReceiver = new SingletonConnectivityReceiver(context);
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

