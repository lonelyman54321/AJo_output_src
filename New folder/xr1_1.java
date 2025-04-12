/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from xR1
 */
public final class xr1_1
implements wr1_1 {
    public final i23_0 a;

    public xr1_1() {
        Object object = he_2.DROP_OLDEST;
        object = k23_0.b(0, 16, object, 1);
        this.a = object;
    }

    public final Object a(kj1 object, f80_0 object2) {
        i23_0 i23_02 = this.a;
        if ((object = i23_02.emit(object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final i23_0 b() {
        return this.a;
    }

    public final boolean c(kj1 kj12) {
        return this.a.a(kj12);
    }
}

