/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from uM2
 */
public final class um2_1
extends cl1_2 {
    public final CancellableContinuationImpl e;

    public um2_1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = cancellableContinuationImpl;
    }

    public final boolean i() {
        return false;
    }

    public final void j(Throwable object) {
        object = this.h();
        object.getClass();
        Object object2 = JobSupport.a;
        object = ((AtomicReferenceFieldUpdater)object2).get(object);
        boolean bl2 = object instanceof m00_0;
        CancellableContinuationImpl cancellableContinuationImpl = this.e;
        if (bl2) {
            object2 = tl2_2.b;
            object = vl2_2.a(((m00_0)object).a);
            cancellableContinuationImpl.resumeWith(object);
        } else {
            object2 = tl2_2.b;
            object = y61.b(object);
            cancellableContinuationImpl.resumeWith(object);
        }
    }
}

