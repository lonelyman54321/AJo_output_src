/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from nZ2
 */
public final class nz2_1
implements fs0_2 {
    public final fz2_1 a;

    public nz2_1(fz2_1 fz2_12) {
        this.a = fz2_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        fz2_1 fz2_12 = this.a;
        if ((object = fz2_12.o((f80_0)object2, object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

