/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class jP2
implements Lg1 {
    public final boolean a;
    public final float b;
    public final ib3_0 c;

    public jP2() {
        throw null;
    }

    public jP2(boolean bl2, float f5, tr1_0 tr1_02) {
        this.a = bl2;
        this.b = f5;
        this.c = tr1_02;
    }

    public final Mg1 b(wr1_1 wr1_12, b30_0 b30_02) {
        int n3;
        long l2;
        int n4;
        int n7 = 988743187;
        b30_02.K(n7);
        Object object = AP2.a;
        object = (zP2)b30_02.j((H30)object);
        Object object2 = this.c;
        Object object3 = (OX)object2.getValue();
        long l3 = ((OX)object3).a;
        long l4 = 16;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            n4 = -303571590;
            b30_02.K(n4);
            b30_02.E();
            object2 = (OX)object2.getValue();
            l2 = ((OX)object2).a;
        } else {
            n3 = -303521246;
            b30_02.K(n3);
            l2 = object.b(b30_02);
            b30_02.E();
        }
        OX oX = new OX(l2);
        tr1_0 tr1_02 = J83.j(oX, b30_02);
        tr1_0 tr1_03 = J83.j(object.a(b30_02), b30_02);
        l7 = (long)this.a;
        float f5 = this.b;
        object = this.c(wr1_12, (boolean)l7, f5, tr1_02, tr1_03, b30_02, 0);
        n3 = (int)(b30_02.J(wr1_12) ? 1 : 0);
        n4 = (int)(b30_02.x(object) ? 1 : 0);
        object3 = b30_02.v();
        if ((n3 |= n4) != 0 || object3 == (object2 = b30$a.a)) {
            n3 = 0;
            object2 = null;
            object3 = new ip2_0(wr1_12, (uP2)object, null);
            b30_02.o(object3);
        }
        object3 = (Function2)object3;
        ly0_0.e(object, wr1_12, (Function2)object3, b30_02);
        b30_02.E();
        return object;
    }

    public abstract Ri c(wr1_1 var1, boolean var2, float var3, tr1_0 var4, tr1_0 var5, b30_0 var6, int var7);

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof jP2;
        if (!bl3) {
            return false;
        }
        object = (jP2)object;
        boolean bl4 = this.a;
        bl3 = ((jP2)object).a;
        if (bl4 != bl3) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((jP2)object).b;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        ib3_0 ib3_02 = this.c;
        object = ((jP2)object).c;
        boolean bl5 = Intrinsics.areEqual(ib3_02, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a;
        n3 = n3 != 0 ? 1231 : 1237;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, 31);
        return this.c.hashCode() + n3;
    }
}

