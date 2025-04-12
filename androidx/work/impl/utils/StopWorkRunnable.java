/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.utils;

import kotlin.jvm.internal.Intrinsics;

public final class StopWorkRunnable
implements Runnable {
    public final kz2_0 a;
    public final xb3_0 b;
    public final boolean c;
    public final int d;

    public StopWorkRunnable(kz2_0 kz2_02, xb3_0 xb3_02, boolean bl2, int n3) {
        Intrinsics.checkNotNullParameter(kz2_02, "processor");
        Intrinsics.checkNotNullParameter(xb3_02, "token");
        this.a = kz2_02;
        this.b = xb3_02;
        this.c = bl2;
        this.d = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2;
        boolean bl2 = this.c;
        if (bl2) {
            object2 = this.a;
            object = this.b;
            int n3 = this.d;
            object2.getClass();
            object = ((xb3_0)object).a.a;
            Object object3 = ((kz2_0)object2).k;
            synchronized (object3) {
                object2 = ((kz2_0)object2).b((String)object);
            }
            kz2_0.e((WI3)object2, n3);
        } else {
            object2 = this.a;
            object = this.b;
            int n4 = this.d;
            ((kz2_0)object2).i((xb3_0)object, n4);
        }
        object2 = qx1.a();
        qx1.b("StopWorkRunnable");
        object = this.b.a.a;
        object2.getClass();
    }
}

