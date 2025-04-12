/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.c;

public final class kS1$a
implements bl_2,
me3_2 {
    public final CancellableContinuationImpl a;
    public final Object b;
    public final /* synthetic */ ks1_1 c;

    public kS1$a(ks1_1 ks1_12, CancellableContinuationImpl cancellableContinuationImpl, Object object) {
        this.c = ks1_12;
        this.a = cancellableContinuationImpl;
        this.b = object;
    }

    public final void B(Function1 function1, Object object) {
        object = (Unit)object;
        this.a.B(function1, object);
    }

    public final void E(c c2, Object object) {
        object = (Unit)object;
        this.a.E(c2, object);
    }

    public final void F(Object object, gx0_2 object2) {
        object = (Unit)object;
        object2 = ks1_1.h;
        Object object3 = this.b;
        ks1_1 ks1_12 = this.c;
        ((AtomicReferenceFieldUpdater)object2).set(ks1_12, object3);
        object2 = new js1_2(ks1_12, this);
        this.a.B((Function1)object2, object);
    }

    public final void J(Object object) {
        this.a.J(object);
    }

    public final void a(wx2_2 wx2_22, int n3) {
        this.a.a(wx2_22, n3);
    }

    public final boolean e(Throwable throwable) {
        return this.a.e(throwable);
    }

    public final CoroutineContext getContext() {
        return this.a.e;
    }

    public final boolean n() {
        return this.a.n();
    }

    public final boolean p() {
        return this.a.p();
    }

    public final void resumeWith(Object object) {
        this.a.resumeWith(object);
    }

    public final gh3_2 v(Object object, gx0_2 object2) {
        object = (Unit)object;
        Object object3 = this.a;
        ks1_1 ks1_12 = this.c;
        object2 = new is1_2(ks1_12, this);
        if ((object = ((CancellableContinuationImpl)object3).G(object, (gx0_2)object2)) != null) {
            object2 = ks1_1.h;
            object3 = this.b;
            ((AtomicReferenceFieldUpdater)object2).set(ks1_12, object3);
        }
        return object;
    }

    public final void x(Function1 function1) {
        this.a.x(function1);
    }

    public final gh3_2 y(Throwable throwable) {
        return this.a.y(throwable);
    }
}

