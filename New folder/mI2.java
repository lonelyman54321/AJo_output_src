/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class mI2
implements EC1 {
    public final /* synthetic */ bl_2 a;

    public mI2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void onResult(Object object) {
        object = (Throwable)object;
        bl_2 bl_22 = this.a;
        boolean bl2 = bl_22.n();
        if (!bl2) {
            Intrinsics.checkNotNull(object);
            object = vl2_2.a((Throwable)object);
            bl_22.resumeWith(object);
        }
    }
}

