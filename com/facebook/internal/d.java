/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.internal.d$c;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final int a;
    public final Executor b;
    public final ReentrantLock c;
    public d$c d;
    public d$c e;
    public int f;

    public d(int n3) {
        ReentrantLock reentrantLock;
        Executor executor = FacebookSdk.d();
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = n3;
        this.b = executor;
        this.c = reentrantLock = new ReentrantLock();
    }

    public static d$c a(d d2, Runnable object) {
        d2.getClass();
        Intrinsics.checkNotNullParameter(object, "callback");
        d$c d$c = new d$c(d2, (Runnable)object);
        object = d2.c;
        ((ReentrantLock)object).lock();
        try {
            Object object2 = d2.d;
            boolean bl2 = true;
            object2 = d$c.b((d$c)object2, bl2);
            d2.d = object2;
            object2 = Unit.a;
            d2.b(null);
            return d$c;
        }
        finally {
            ((ReentrantLock)object).unlock();
        }
    }

    public final void b(d$c object) {
        int n3;
        int n4;
        d$c d$c;
        Object object2 = this.c;
        ((ReentrantLock)object2).lock();
        if (object != null) {
            d$c = this.e;
            object = ((d$c)object).c(d$c);
            this.e = object;
            this.f = n4 = this.f + -1;
        }
        if ((n4 = this.f) < (n3 = this.a)) {
            object = this.d;
            if (object != null) {
                this.d = d$c = ((d$c)object).c((d$c)object);
                d$c = this.e;
                this.e = d$c = ((d$c)object).b(d$c, false);
                n3 = this.f;
                int n7 = 1;
                this.f = n3 += n7;
                ((d$c)object).d = n7;
            }
        } else {
            n4 = 0;
            object = null;
        }
        ((ReentrantLock)object2).unlock();
        if (object != null) {
            object2 = new ai3_2((d$c)object, this);
            object = this.b;
            object.execute((Runnable)object2);
        }
    }
}

