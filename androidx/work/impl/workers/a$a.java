/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ MH3 b;
    public final /* synthetic */ EI3 c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ ListenableFuture e;

    public a$a(MH3 mH3, EI3 eI3, AtomicInteger atomicInteger, ListenableFuture listenableFuture, f80_0 f80_02) {
        this.b = mH3;
        this.c = eI3;
        this.d = atomicInteger;
        this.e = listenableFuture;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AtomicInteger atomicInteger = this.d;
        ListenableFuture listenableFuture = this.e;
        MH3 mH3 = this.b;
        EI3 eI3 = this.c;
        object = new a$a(mH3, eI3, atomicInteger, listenableFuture, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = bl3;
            object = this.b;
            EI3 eI3 = this.c;
            object = V50.a((MH3)object, eI3, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        int n3 = ((Number)object).intValue();
        this.d.set(n3);
        this.e.cancel(bl3);
        return Unit.a;
    }
}

