/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends LiveData {
    public final FP2 l;
    public final ik1_0 m;
    public final boolean n;
    public final Callable o;
    public final d p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final L7 t;
    public final M7 u;

    public e(FP2 object, ik1_0 object2, Callable callable, String[] stringArray) {
        Intrinsics.checkNotNullParameter(object, "database");
        Intrinsics.checkNotNullParameter(object2, "container");
        Intrinsics.checkNotNullParameter(callable, "computeFunction");
        Intrinsics.checkNotNullParameter(stringArray, "tableNames");
        this.l = object;
        this.m = object2;
        this.n = false;
        this.o = callable;
        this.p = object2 = new d(stringArray, this);
        this.q = object2 = new AtomicBoolean(true);
        this.r = object2 = new AtomicBoolean(false);
        this.s = object2 = new AtomicBoolean(false);
        this.t = object = new L7(this, 2);
        this.u = object = new M7(this, 1);
    }

    public final void g() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        Object object = this.m;
        object.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        object = ((ik1_0)object).b;
        object.add(this);
        boolean bl2 = this.n;
        Object object2 = this.l;
        object = bl2 ? ((FP2)object2).getTransactionExecutor() : ((FP2)object2).getQueryExecutor();
        object2 = this.t;
        object.execute((Runnable)object2);
    }

    public final void h() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        ik1_0 ik1_02 = this.m;
        ik1_02.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        ik1_02.b.remove(this);
    }
}

