/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.manager;

import com.bumptech.glide.manager.SingletonConnectivityReceiver$d;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$d$a;

class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ SingletonConnectivityReceiver$d$a b;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1(SingletonConnectivityReceiver$d$a a2, boolean bl2) {
        this.b = a2;
        this.a = bl2;
    }

    public final void run() {
        boolean bl2;
        Object object = this.b;
        object.getClass();
        dz3.a();
        object = ((SingletonConnectivityReceiver$d$a)((Object)object)).a;
        boolean bl3 = ((SingletonConnectivityReceiver$d)object).a;
        ((SingletonConnectivityReceiver$d)object).a = bl2 = this.a;
        if (bl3 != bl2) {
            object = ((SingletonConnectivityReceiver$d)object).b;
            object.a(bl2);
        }
    }
}

