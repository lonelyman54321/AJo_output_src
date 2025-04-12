/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class dk1
implements dl1_1,
Rj1 {
    public final bp1_0 a;
    public final /* synthetic */ Rj1 b;

    public dk1(Rj1 rj1, bp1_0 bp1_02) {
        this.a = bp1_02;
        this.b = rj1;
    }

    public final float D0(int n3) {
        return this.b.D0(n3);
    }

    public final float E0(float f5) {
        return this.b.E0(f5);
    }

    public final float H(long l2) {
        return this.b.H(l2);
    }

    public final float H0() {
        return this.b.H0();
    }

    public final float J0(float f5) {
        return this.b.J0(f5);
    }

    public final long O(float f5) {
        return this.b.O(f5);
    }

    public final int O0(long l2) {
        return this.b.O0(l2);
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.e(n3, n4, map2, function1);
    }

    public final boolean W() {
        return this.b.W();
    }

    public final long Z0(long l2) {
        return this.b.Z0(l2);
    }

    public final bl1_0 e(int n3, int n4, Map object, Function1 object2) {
        int n7;
        int n8 = 0;
        object2 = null;
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if ((n7 = n3 & (n8 = -16777216)) == 0 && (n8 &= n4) == 0) {
            object2 = new ck1((Map)object, n3, n4);
            return object2;
        }
        object = new StringBuilder("Size(");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" x ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(") is out of range. Each dimension must be between 0 and 16777215.");
        bh1_1.c(((StringBuilder)object).toString());
        throw null;
    }

    public final int e0(float f5) {
        return this.b.e0(f5);
    }

    public final float getDensity() {
        return this.b.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.a;
    }

    public final float h0(long l2) {
        return this.b.h0(l2);
    }

    public final long z(long l2) {
        return this.b.z(l2);
    }
}

