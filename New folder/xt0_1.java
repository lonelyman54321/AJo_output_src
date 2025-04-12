/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from xT0
 */
public final class xt0_1
extends D41 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public ds0_1 n0;
    public HashMap o0;
    public HashMap p0;
    public HashMap q0;
    public int r0 = 0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public xt0_1(Fb3 object, Fb3$d fb3$d) {
        super((Fb3)object, fb3$d);
        float f5;
        int n3;
        int n4;
        this.s0 = n4 = -1;
        this.t0 = n4;
        this.u0 = n4;
        this.v0 = n4;
        this.w0 = n4;
        this.x0 = n4;
        this.y0 = n3 = 2;
        this.z0 = n3;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = n4;
        this.H0 = 0;
        int n7 = 0x3F000000;
        this.I0 = f5 = 0.5f;
        this.J0 = f5;
        this.K0 = f5;
        this.L0 = f5;
        object = Fb3$d.VERTICAL_FLOW;
        if (fb3$d == object) {
            n7 = 1;
            f5 = Float.MIN_VALUE;
            this.H0 = n7;
        }
    }

    public final void apply() {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        int n3;
        this.s();
        ds0_1 ds0_12 = this.n0;
        this.b(ds0_12);
        ds0_12 = this.n0;
        ds0_12.c1 = n3 = this.H0;
        ds0_12.a1 = n3 = this.r0;
        n3 = this.G0;
        int n4 = -1;
        if (n3 != n4) {
            ds0_12.b1 = n3;
        }
        if ((n3 = this.C0) != 0) {
            ds0_12.D0 = n3;
        }
        if ((n3 = this.E0) != 0) {
            ds0_12.z0 = n3;
        }
        if ((n3 = this.D0) != 0) {
            ds0_12.E0 = n3;
        }
        if ((n3 = this.F0) != 0) {
            ds0_12.A0 = n3;
        }
        if ((n3 = this.B0) != 0) {
            ds0_12.W0 = n3;
        }
        if ((n3 = this.A0) != 0) {
            ds0_12.X0 = n3;
        }
        float f12 = this.h;
        int n7 = 0x3F000000;
        float f14 = 0.5f;
        float f15 = f12 - f14;
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object != false) {
            ds0_12.Q0 = f12;
        }
        if ((object = (f11 = (f12 = this.K0) - f14) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) != false) {
            ds0_12.S0 = f12;
        }
        if ((object = (f8 = (f12 = this.L0) - f14) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) != false) {
            ds0_12.U0 = f12;
        }
        if ((object = (f7 = (f12 = this.i) - f14) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false) {
            ds0_12.R0 = f12;
        }
        if ((object = (f6 = (f12 = this.I0) - f14) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            ds0_12.T0 = f12;
        }
        if ((n7 = (int)((f5 = (f12 = this.J0) - f14) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0) {
            ds0_12.V0 = f12;
        }
        n3 = this.z0;
        n7 = 2;
        f14 = 2.8E-45f;
        if (n3 != n7) {
            ds0_12.Y0 = n3;
        }
        if ((n3 = this.y0) != n7) {
            ds0_12.Z0 = n3;
        }
        if ((n3 = this.s0) != n4) {
            ds0_12.L0 = n3;
        }
        if ((n3 = this.t0) != n4) {
            ds0_12.N0 = n3;
        }
        if ((n3 = this.u0) != n4) {
            ds0_12.P0 = n3;
        }
        if ((n3 = this.v0) != n4) {
            ds0_12.K0 = n3;
        }
        if ((n3 = this.w0) != n4) {
            ds0_12.M0 = n3;
        }
        if ((n3 = this.x0) != n4) {
            ds0_12.O0 = n3;
        }
        this.r();
    }

    public final F41 s() {
        ds0_1 ds0_12 = this.n0;
        if (ds0_12 == null) {
            this.n0 = ds0_12 = new ds0_1();
        }
        return this.n0;
    }
}

