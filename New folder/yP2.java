/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class yP2
implements Qg1 {
    public final boolean a;
    public final float b;
    public final gy_1 c;
    public final long d;

    public yP2(boolean bl2, float f5, long l2) {
        this.a = bl2;
        this.b = f5;
        this.c = null;
        this.d = l2;
    }

    public final fo0 a(wr1_1 wr1_12) {
        gy_1 gy_12 = this.c;
        if (gy_12 == null) {
            gy_12 = new yP2$a(this);
        }
        float f5 = this.b;
        boolean bl2 = this.a;
        to0_1 to0_12 = new to0_1(wr1_12, bl2, f5, gy_12);
        return to0_12;
    }

    public final Mg1 b(wr1_1 wr1_12, b30_0 b30_02) {
        b30_02.K(1257603829);
        b30_02.E();
        return K32.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof yP2;
        if (!bl2) {
            return false;
        }
        object = (yP2)object;
        boolean bl3 = this.a;
        bl2 = ((yP2)object).a;
        if (bl3 != bl2) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((yP2)object).b;
        bl2 = xs0_0.a(f5, f6);
        if (!bl2) {
            return false;
        }
        gy_1 gy_12 = this.c;
        gy_1 gy_13 = ((yP2)object).c;
        bl2 = Intrinsics.areEqual(gy_12, gy_13);
        if (!bl2) {
            return false;
        }
        long l2 = this.d;
        long l3 = ((yP2)object).d;
        return OX.c(l2, l3);
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a;
        n4 = n4 != 0 ? 1231 : 1237;
        int n7 = 31;
        n4 *= 31;
        float f5 = this.b;
        n4 = UR0.a(f5, n4, n7);
        gy_1 gy_12 = this.c;
        if (gy_12 != null) {
            n3 = gy_12.hashCode();
        } else {
            n3 = 0;
            f5 = 0.0f;
            gy_12 = null;
        }
        n4 = (n4 + n3) * 31;
        n7 = OX.m;
        return mt3_0.a(this.d) + n4;
    }
}

