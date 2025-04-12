/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class Rl0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public Rl0(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public final il_0 a(wr1_1 object, b30_0 b30_02, int n3) {
        Object object2;
        float f5;
        float f6;
        float f7;
        int n4;
        b30_02.K(-478475335);
        int n7 = n3 & 0xE ^ 6;
        int n8 = 0;
        int n10 = 4;
        if (n7 > n10 && (n4 = b30_02.J(object)) != 0 || (n4 = n3 & 6) == n10) {
            n4 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f7 = 0.0f;
        }
        Object object3 = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (n4 != 0 || object3 == b30$a$a) {
            f7 = this.b;
            f6 = this.c;
            f5 = this.a;
            float f8 = this.d;
            object3 = new rS0(f5, f7, f6, f8);
            b30_02.o(object3);
        }
        object3 = (rS0)object3;
        n4 = b30_02.x(object3) ? 1 : 0;
        int n14 = n3 & 0x70 ^ 0x30;
        int n15 = 32;
        f5 = 4.5E-44f;
        if (n14 > n15 && (n14 = (int)(b30_02.J(this) ? 1 : 0)) != 0 || (n14 = n3 & 0x30) == n15) {
            n14 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n14 = 0;
            f6 = 0.0f;
            object2 = null;
        }
        object2 = b30_02.v();
        n15 = 0;
        f5 = 0.0f;
        if ((n4 |= n14) != 0 || object2 == b30$a$a) {
            object2 = new ol0_0((rS0)object3, this, null);
            b30_02.o(object2);
        }
        object2 = (Function2)object2;
        ly0_0.d(b30_02, this, (Function2)object2);
        if (n7 > n10 && (n7 = (int)(b30_02.J(object) ? 1 : 0)) != 0 || (n3 &= 6) == n10) {
            n8 = 1;
        }
        n3 = b30_02.x(object3) | n8;
        Object object4 = b30_02.v();
        if (n3 != 0 || object4 == b30$a$a) {
            object4 = new ql0_0((wr1_1)object, (rS0)object3, null);
            b30_02.o(object4);
        }
        object4 = (Function2)object4;
        ly0_0.d(b30_02, object, (Function2)object4);
        object = ((rS0)object3).e.c;
        b30_02.E();
        return object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof Rl0;
        if (!bl2) {
            return false;
        }
        object = (Rl0)object;
        float f5 = this.a;
        float f6 = ((Rl0)object).a;
        bl2 = xs0_0.a(f5, f6);
        if (!bl2) {
            return false;
        }
        f6 = this.b;
        f5 = ((Rl0)object).b;
        bl2 = xs0_0.a(f6, f5);
        if (!bl2) {
            return false;
        }
        f6 = this.c;
        f5 = ((Rl0)object).c;
        bl2 = xs0_0.a(f6, f5);
        if (!bl2) {
            return false;
        }
        f6 = this.d;
        float f7 = ((Rl0)object).d;
        return xs0_0.a(f6, f7);
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }
}

