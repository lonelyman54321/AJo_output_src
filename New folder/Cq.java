/*
 * Decompiled with CFR 0.152.
 */
import androidx.paging.AsyncPagingDataDiffer$LoadStateListenerRunnable$1;
import androidx.recyclerview.widget.b_0;
import androidx.recyclerview.widget.k$e;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Cq {
    public final k$e a;
    public final iv1_0 b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final kb3_2 e;
    public int f;
    public final AtomicReference g;
    public final aq_0 h;
    public final AtomicInteger i;
    public final es0_2 j;
    public final ee2_2 k;
    public final AtomicReference l;
    public final CopyOnWriteArrayList m;
    public final yq n;
    public final hh3_2 o;
    public final AsyncPagingDataDiffer$LoadStateListenerRunnable$1 p;

    public Cq(k$e object, b_0 b_02, CoroutineContext object2, CoroutineContext object3) {
        Intrinsics.checkNotNullParameter(object, "diffCallback");
        Intrinsics.checkNotNullParameter(b_02, "updateCallback");
        Intrinsics.checkNotNullParameter(object2, "mainDispatcher");
        Intrinsics.checkNotNullParameter(object3, "workerDispatcher");
        this.a = object;
        this.b = b_02;
        this.c = object2;
        this.d = object3;
        this.e = object = lb3_2.a(Boolean.FALSE);
        object = new AtomicReference(null);
        this.g = object;
        this.h = object = new aq_0(this, (CoroutineContext)object2);
        this.i = object2 = new AtomicInteger(0);
        object3 = ((Sl2)object).j;
        object2 = new ut0_2((es0_2)object3);
        object2 = ms0_1.c((es0_2)object2, -1);
        object3 = new bq_1((es0_2)object2, null, this);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = bg1_1.a;
        this.j = object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        this.k = object = ms0_1.a(((Sl2)object).k);
        object = new AtomicReference(null);
        this.l = object;
        this.m = object;
        super(this);
        this.n = object;
        object = yr1_2.b(xq.c);
        this.o = object;
        this.p = object = new AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }
}

