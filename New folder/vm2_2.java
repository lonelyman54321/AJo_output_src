/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from vM2
 */
public final class vm2_2
extends cl1_2 {
    public final f80_0 e;

    public vm2_2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.e = cancellableContinuationImpl;
    }

    public final boolean i() {
        return false;
    }

    public final void j(Throwable object) {
        object = tl2_2.b;
        object = Unit.a;
        this.e.resumeWith(object);
    }
}

