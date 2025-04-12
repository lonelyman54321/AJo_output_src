/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from qp
 */
public final class qp_0
implements Rj1,
dl1_1 {
    public final sp1_1 a;
    public pp_1 b;
    public boolean c;

    public qp_0(sp1_1 sp1_12, pp_1 pp_12) {
        this.a = sp1_12;
        this.b = pp_12;
    }

    public final float D0(int n3) {
        return this.a.D0(n3);
    }

    public final float E0(float f5) {
        float f6 = this.a.getDensity();
        return f5 / f6;
    }

    public final float H(long l2) {
        sp1_1 sp1_12 = this.a;
        sp1_12.getClass();
        return mv0_0.a(l2, sp1_12);
    }

    public final float H0() {
        return this.a.H0();
    }

    public final float J0(float f5) {
        return this.a.getDensity() * f5;
    }

    public final long O(float f5) {
        return this.a.O(f5);
    }

    public final int O0(long l2) {
        return this.a.O0(l2);
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.a.F0(n3, n4, map2, function1);
    }

    public final boolean W() {
        return false;
    }

    public final long Z0(long l2) {
        sp1_1 sp1_12 = this.a;
        sp1_12.getClass();
        return Uo0.d(l2, sp1_12);
    }

    public final int e0(float f5) {
        sp1_1 sp1_12 = this.a;
        sp1_12.getClass();
        return Uo0.a(f5, sp1_12);
    }

    public final float getDensity() {
        return this.a.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.a.m.s;
    }

    public final float h0(long l2) {
        sp1_1 sp1_12 = this.a;
        sp1_12.getClass();
        return Uo0.c(l2, sp1_12);
    }

    public final long z(long l2) {
        sp1_1 sp1_12 = this.a;
        sp1_12.getClass();
        return Uo0.b(l2, sp1_12);
    }
}

