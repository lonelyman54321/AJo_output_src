/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.manager;

import com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
import com.bumptech.glide.manager.a$a;

class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 b;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24 singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24, boolean bl2) {
        this.b = singletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24;
        this.a = bl2;
    }

    public final void run() {
        a$a a$a = this.b.b;
        boolean bl2 = this.a;
        a$a.a(bl2);
    }
}

