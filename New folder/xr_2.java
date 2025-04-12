/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XR
 */
public final class xr_2
extends bg2$e_0 {
    public final Function2 a;
    public final k70_0 b;
    public final ub1_2 c;
    public final Long d;

    public xr_2(to1_2 to1_22, k70_0 k70_02) {
        Intrinsics.checkNotNullParameter(to1_22, "body");
        this.a = to1_22;
        this.b = k70_02;
        this.c = null;
        this.d = null;
    }

    public final Long a() {
        return this.d;
    }

    public final k70_0 b() {
        return this.b;
    }

    public final ub1_2 d() {
        return this.c;
    }

    public final Object e(gf_2 object, f80_0 object2) {
        Function2 function2 = this.a;
        if ((object = function2.invoke(object, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

