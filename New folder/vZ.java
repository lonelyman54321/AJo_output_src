/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class vZ
extends B0 {
    public String H;
    public Function0 I;
    public Function0 J;

    public vZ() {
        throw null;
    }

    public final void u1(UY2 uY2) {
        Object object = this.I;
        if (object != null) {
            object = this.H;
            vZ$a vZ$a = new vZ$a(this);
            Object object2 = RY2.a;
            object2 = yY2.c;
            H1 h1 = new H1((String)object, vZ$a);
            uY2.a((TY2)object2, h1);
        }
    }

    public final Object v1(hw2_0 object, f80_0 object2) {
        fx0_2 fx0_22;
        boolean bl2 = this.t;
        fx0_2 fx0_23 = bl2 && (fx0_22 = this.J) != null ? (fx0_22 = new vZ$b(this)) : null;
        bl2 = this.t;
        fx0_2 fx0_24 = bl2 && (fx0_22 = this.I) != null ? (fx0_22 = new vZ$c(this)) : null;
        vZ$d vZ$d = new vZ$d(this, null);
        vZ$e vZ$e = new vZ$e(this);
        fx0_22 = Di3.a;
        fx0_22 = new hi3_1((hw2_0)object, vZ$d, (Function1)fx0_24, (Function1)fx0_23, vZ$e, null);
        if ((object = kotlinx.coroutines.d.c((Function2)fx0_22, object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }
}

