/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal;

import com.facebook.internal.d;
import com.facebook.internal.d$a;
import com.facebook.internal.d$b;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class d$c
implements d$b {
    public final Runnable a;
    public d$c b;
    public d$c c;
    public boolean d;
    public final /* synthetic */ d e;

    public d$c(d d2, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "callback");
        this.e = d2;
        this.a = runnable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block3: {
            Object object;
            block2: {
                object = this.e;
                reentrantLock = ((d)object).c;
                reentrantLock.lock();
                try {
                    boolean bl2 = this.d;
                    if (bl2) break block2;
                    d$c d$c = ((d)object).d;
                    ((d)object).d = d$c = this.c(d$c);
                    boolean bl3 = true;
                    ((d)object).d = d$c = this.b(d$c, bl3);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            object = Unit.a;
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public final d$c b(d$c d$c, boolean bl2) {
        boolean bl3;
        d$c d$c2 = this.b;
        boolean bl4 = false;
        d$c d$c3 = null;
        if (d$c2 == null) {
            bl3 = true;
        } else {
            bl3 = false;
            d$c2 = null;
        }
        d$a.a(bl3);
        d$c2 = this.c;
        if (d$c2 == null) {
            bl4 = true;
        }
        d$a.a(bl4);
        if (d$c == null) {
            this.c = this;
            this.b = this;
            d$c = this;
        } else {
            this.b = d$c;
            this.c = d$c2 = d$c.c;
            if (d$c2 != null) {
                d$c2.b = this;
            }
            d$c3 = this.b;
            if (d$c3 != null) {
                if (d$c2 != null) {
                    d$c2 = d$c2.b;
                } else {
                    bl3 = false;
                    d$c2 = null;
                }
                d$c3.c = d$c2;
            }
        }
        if (bl2) {
            d$c = this;
        }
        return d$c;
    }

    public final d$c c(d$c d$c) {
        d$c d$c2;
        boolean bl2;
        d$c d$c3 = this.b;
        boolean bl3 = false;
        d$c d$c4 = null;
        if (d$c3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            d$c3 = null;
        }
        d$a.a(bl2);
        d$c3 = this.c;
        if (d$c3 != null) {
            bl3 = true;
        }
        d$a.a(bl3);
        bl2 = false;
        d$c3 = null;
        if (d$c == this && (d$c = this.b) == this) {
            d$c = null;
        }
        if ((d$c4 = this.b) != null) {
            d$c4.c = d$c2 = this.c;
        }
        d$c2 = this.c;
        if (d$c2 != null) {
            d$c2.b = d$c4;
        }
        this.c = null;
        this.b = null;
        return d$c;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean cancel() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block4: {
            Object object = this.e;
            reentrantLock = ((d)object).c;
            reentrantLock.lock();
            try {
                boolean bl2 = this.d;
                if (!bl2) {
                    d$c d$c = ((d)object).d;
                    ((d)object).d = d$c = this.c(d$c);
                    reentrantLock.unlock();
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            {
                object = Unit.a;
                reentrantLock.unlock();
                return false;
            }
        }
        reentrantLock.unlock();
        throw throwable2;
    }
}

