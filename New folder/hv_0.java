/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.d;

/*
 * Renamed from HV
 */
public class hv_0
extends B0 {
    public hv_0() {
        throw null;
    }

    public final Object v1(hw2_0 object, f80_0 object2) {
        FV fV = new FV(this, null);
        GV gV = new GV(this);
        dy2_1 dy2_12 = new dy2_1((Vo0)object);
        gi3_1 gi3_12 = new gi3_1((hw2_0)object, fV, gV, dy2_12, null);
        if ((object = kotlinx.coroutines.d.c(gi3_12, object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }
}

