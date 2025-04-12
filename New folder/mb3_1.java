/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Mb3
 */
public final class mb3_1
extends r1_0 {
    public final AtomicReference a;

    public mb3_1() {
        AtomicReference<Object> atomicReference;
        this.a = atomicReference = new AtomicReference<Object>(null);
    }

    public final boolean a(p1_0 object) {
        boolean bl2;
        object = (kb3_2)object;
        object = this.a;
        Object object2 = ((AtomicReference)object).get();
        if (object2 != null) {
            bl2 = false;
            object = null;
        } else {
            object2 = lb3_2.a;
            ((AtomicReference)object).set(object2);
            bl2 = true;
        }
        return bl2;
    }

    public final f80_0[] b(p1_0 p1_02) {
        p1_02 = (kb3_2)p1_02;
        this.a.set(null);
        return q1_0.a;
    }

    public final Object c(kb3$a_0 kb3$a_0) {
        boolean bl2;
        Object object = zj1_2.b(kb3$a_0);
        int n3 = 1;
        Object object2 = new CancellableContinuationImpl(n3, (f80_0)object);
        ((CancellableContinuationImpl)object2).r();
        object = this.a;
        Object object3 = lb3_2.a;
        while (!(bl2 = ((AtomicReference)object).compareAndSet(object3, object2))) {
            Object v4 = ((AtomicReference)object).get();
            if (v4 == object3) continue;
            object = tl2_2.b;
            object = Unit.a;
            ((CancellableContinuationImpl)object2).resumeWith(object);
            break;
        }
        if ((object2 = ((CancellableContinuationImpl)object2).q()) == (object = j90_0.COROUTINE_SUSPENDED)) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(kb3$a_0, (String)object3);
        }
        if (object2 == object) {
            return object2;
        }
        return Unit.a;
    }
}

