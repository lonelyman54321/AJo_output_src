/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from g80
 */
public final class g80_0
implements wj_2,
Function1 {
    public final ij_2 a;
    public final bl_2 b;

    public g80_0(ij_2 ij_22, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = ij_22;
        this.b = cancellableContinuationImpl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        object = (Throwable)object;
        try {
            object = this.a;
        }
        catch (Throwable throwable) {
            return Unit.a;
        }
        object.cancel();
        return Unit.a;
    }

    public final void onFailure(ij_2 object, IOException object2) {
        boolean bl2 = object.a();
        if (!bl2) {
            object = tl2_2.b;
            object = vl2_2.a((Throwable)object2);
            object2 = this.b;
            object2.resumeWith(object);
        }
    }

    public final void onResponse(ij_2 ij_22, cl2_2 cl2_22) {
        this.b.resumeWith(cl2_22);
    }
}

