/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.DispatchedContinuation;

/*
 * Renamed from iU
 */
public final class iu_2
extends cl1_2 {
    public final CancellableContinuationImpl e;

    public iu_2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = cancellableContinuationImpl;
    }

    public final boolean i() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(Throwable object) {
        object = this.h();
        CancellableContinuationImpl cancellableContinuationImpl = this.e;
        object = cancellableContinuationImpl.o((JobSupport)object);
        boolean bl2 = cancellableContinuationImpl.u();
        if (bl2) {
            f80_0 f80_02 = cancellableContinuationImpl.d;
            Object object2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>";
            Intrinsics.checkNotNull(f80_02, (String)object2);
            f80_02 = (DispatchedContinuation)f80_02;
            f80_02.getClass();
            block0: while (true) {
                Object v4;
                boolean bl3;
                gh3_2 gh3_22;
                Object v5;
                boolean bl4;
                if (!(bl4 = Intrinsics.areEqual(v5 = ((AtomicReferenceFieldUpdater)(object2 = DispatchedContinuation.h)).get(f80_02), gh3_22 = dr0_2.b))) {
                    bl3 = v5 instanceof Throwable;
                    if (bl3) {
                        return;
                    }
                } else {
                    do {
                        boolean bl5;
                        if (!(bl5 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(f80_02, gh3_22, object))) continue;
                        return;
                    } while ((v5 = ((AtomicReferenceFieldUpdater)object2).get(f80_02)) == gh3_22);
                    continue;
                }
                do {
                    Object var7_9 = null;
                    bl3 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(f80_02, v5, null);
                    if (bl3) break block0;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object2).get(f80_02)) == v5);
            }
        }
        cancellableContinuationImpl.e((Throwable)object);
        boolean bl6 = cancellableContinuationImpl.u();
        if (bl6) return;
        cancellableContinuationImpl.l();
    }
}

