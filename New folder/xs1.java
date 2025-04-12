/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class xs1 {
    public final yy2_0 a;
    public final Function1 b;
    public final wy2 c;
    public vy2_0 d;

    public xs1() {
        this(null, 3);
    }

    public /* synthetic */ xs1(yy2_0 yy2_02, int n3) {
        if ((n3 &= 1) != 0) {
            yy2_02 = null;
        }
        this(yy2_02, null);
    }

    public xs1(yy2_0 object, Function1 function1) {
        this.a = object;
        this.b = function1;
        this.c = object = new wy2();
    }

    public final xs1$b a(int n3, long l2) {
        xs1$b xs1$b;
        vy2_0 vy2_02 = this.d;
        if (vy2_02 != null) {
            wy2 wy22 = this.c;
            xs1$b = new vy2$a_0(vy2_02, n3, l2, wy22);
            yy2_0 yy2_02 = vy2_02.c;
            yy2_02.a((vy2$a_0)xs1$b);
        } else {
            xs1$b = ww0_1.a;
        }
        return xs1$b;
    }
}

