/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RP2
 */
public final class rp2_0
extends q90_0 {
    public final q90_0 b(eq2_1 eq2_12, eq2_1 eq2_13, eq2_1 eq2_14, eq2_1 eq2_15) {
        rp2_0 rp2_02 = new q90_0(eq2_12, eq2_13, eq2_14, eq2_15);
        return rp2_02;
    }

    public final Cg2 c(long l2, float f5, float f6, float f7, float f8, bp1_0 bp1_02) {
        Object object = bp1_02;
        float f11 = f5 + f6 + f7 + f8;
        float f12 = 0.0f;
        long l3 = 0L;
        float f14 = f11 - 0.0f;
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 == false) {
            aG2 aG22 = cg2_0.d(l3, l2);
            object = new Cg2$b(aG22);
        } else {
            aG2 aG23 = cg2_0.d(l3, l2);
            Object object3 = bp1_0.Ltr;
            f12 = bp1_02 == object3 ? f5 : f6;
            long l4 = s90.a(f12, f12);
            f12 = object == object3 ? f6 : f5;
            long l7 = s90.a(f12, f12);
            f12 = object == object3 ? f7 : f8;
            long l8 = s90.a(f12, f12);
            float f15 = object == object3 ? f8 : f7;
            long l12 = s90.a(f15, f15);
            float f16 = aG23.a;
            float f17 = aG23.b;
            float f18 = aG23.c;
            float f19 = aG23.d;
            object3 = new NP2(f16, f17, f18, f19, l4, l7, l8, l12);
            Cg2$c cg2$c = new Cg2$c((NP2)object3);
            object = cg2$c;
        }
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof rp2_0;
        if (!bl3) {
            return false;
        }
        object = (rp2_0)object;
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
        StringBuilder stringBuilder = new StringBuilder("RoundedCornerShape(topStart = ");
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

