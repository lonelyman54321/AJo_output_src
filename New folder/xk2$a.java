/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class xk2$a
implements fs0_2 {
    public final /* synthetic */ x53_0 a;

    public xk2$a(x53_0 x53_02) {
        this.a = x53_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (rk2_0)object;
        x53_0 x53_02 = this.a;
        if ((object = x53_02.o((f80_0)object2, object)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }
}

