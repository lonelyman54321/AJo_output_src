/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from A21
 */
public final class a21_0
implements Runnable {
    public final /* synthetic */ bl_2 a;
    public final /* synthetic */ c21_0 b;

    public /* synthetic */ a21_0(CancellableContinuationImpl cancellableContinuationImpl, c21_0 c21_02) {
        this.a = cancellableContinuationImpl;
        this.b = c21_02;
    }

    public final void run() {
        Unit unit = Unit.a;
        bl_2 bl_22 = this.a;
        c21_0 c21_02 = this.b;
        bl_22.E(c21_02, unit);
    }
}

