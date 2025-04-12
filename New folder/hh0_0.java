/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hh0
 */
public final class hh0_0
extends q90_0 {
    public final q90_0 b(eq2_1 eq2_12, eq2_1 eq2_13, eq2_1 eq2_14, eq2_1 eq2_15) {
        hh0_0 hh0_02 = new q90_0(eq2_12, eq2_13, eq2_14, eq2_15);
        return hh0_02;
    }

    public final Cg2 c(long l2, float f5, float f6, float f7, float f8, bp1_0 bp1_02) {
        Cg2 cg2;
        float f11 = f5 + f6 + f8 + f7;
        float f12 = f11 - 0.0f;
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object == false) {
            long l3 = 0L;
            aG2 aG22 = cg2_0.d(l3, l2);
            cg2 = new Cg2$b(aG22);
        } else {
            ki ki2 = ni.a();
            bp1_0 bp1_03 = bp1_0.Ltr;
            float f14 = bp1_02 == bp1_03 ? f5 : f6;
            ki2.a(0.0f, f14);
            ki2.d(f14, 0.0f);
            if (bp1_02 == bp1_03) {
                f5 = f6;
            }
            f6 = C63.d(l2) - f5;
            ki2.d(f6, 0.0f);
            f6 = C63.d(l2);
            ki2.d(f6, f5);
            f5 = bp1_02 == bp1_03 ? f7 : f8;
            f6 = C63.d(l2);
            f14 = C63.b(l2) - f5;
            ki2.d(f6, f14);
            f6 = C63.d(l2) - f5;
            f5 = C63.b(l2);
            ki2.d(f6, f5);
            if (bp1_02 == bp1_03) {
                f7 = f8;
            }
            f5 = C63.b(l2);
            ki2.d(f7, f5);
            float f15 = C63.b(l2) - f7;
            ki2.d(0.0f, f15);
            ki2.close();
            cg2 = new Cg2$a(ki2);
        }
        return cg2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof hh0_0;
        if (!bl3) {
            return false;
        }
        object = (hh0_0)object;
        t90_0 t90_02 = this.a;
        t90_0 t90_03 = ((q90_0)object).a;
        bl3 = Intrinsics.areEqual(t90_02, t90_03);
        if (!bl3) {
            return false;
        }
        t90_02 = this.b;
        t90_03 = ((q90_0)object).b;
        bl3 = Intrinsics.areEqual(t90_02, t90_03);
        if (!bl3) {
            return false;
        }
        t90_02 = this.c;
        t90_03 = ((q90_0)object).c;
        bl3 = Intrinsics.areEqual(t90_02, t90_03);
        if (!bl3) {
            return false;
        }
        t90_03 = this.d;
        object = ((q90_0)object).d;
        boolean bl4 = Intrinsics.areEqual(t90_03, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CutCornerShape(topStart = ");
        t90_0 t90_02 = this.a;
        stringBuilder.append(t90_02);
        stringBuilder.append(", topEnd = ");
        t90_02 = this.b;
        stringBuilder.append(t90_02);
        stringBuilder.append(", bottomEnd = ");
        t90_02 = this.c;
        stringBuilder.append(t90_02);
        stringBuilder.append(", bottomStart = ");
        t90_02 = this.d;
        stringBuilder.append(t90_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

