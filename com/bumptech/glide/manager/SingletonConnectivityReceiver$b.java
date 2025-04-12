/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.manager;

import com.bumptech.glide.manager.SingletonConnectivityReceiver;
import com.bumptech.glide.manager.a$a;
import java.util.ArrayList;

public final class SingletonConnectivityReceiver$b
implements a$a {
    public final /* synthetic */ SingletonConnectivityReceiver a;

    public SingletonConnectivityReceiver$b(SingletonConnectivityReceiver singletonConnectivityReceiver) {
        this.a = singletonConnectivityReceiver;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        Object object;
        dz3.a();
        Object object2 = this.a;
        synchronized (object2) {
            Object object3 = this.a;
            object3 = ((SingletonConnectivityReceiver)object3).b;
            object = new ArrayList(object3);
        }
        object2 = ((ArrayList)object).iterator();
        boolean bl3;
        while (bl3 = object2.hasNext()) {
            object = (a$a)object2.next();
            object.a(bl2);
        }
        return;
    }
}

