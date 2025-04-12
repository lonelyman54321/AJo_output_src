/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.CancellableContinuationImpl;

public final class lI2
implements EC1 {
    public final /* synthetic */ bl_2 a;

    public lI2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    public final void onResult(Object object) {
        bl_2 bl_22 = this.a;
        boolean bl2 = bl_22.n();
        if (!bl2) {
            bl_22.resumeWith(object);
        }
    }
}

