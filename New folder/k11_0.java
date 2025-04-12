/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from K11
 */
public final class k11_0
extends D41 {
    public String A0;
    public int B0;
    public i11_0 n0;
    public int o0 = 0;
    public int p0 = 0;
    public int q0 = 0;
    public int r0 = 0;
    public int s0;
    public int t0;
    public int u0;
    public float v0;
    public float w0;
    public String x0;
    public String y0;
    public String z0;

    public k11_0(Fb3 object, Fb3$d fb3$d) {
        super((Fb3)object, fb3$d);
        object = Fb3$d.ROW;
        int n3 = 1;
        if (fb3$d == object) {
            this.t0 = n3;
        } else {
            object = Fb3$d.COLUMN;
            if (fb3$d == object) {
                this.u0 = n3;
            }
        }
    }

    public final void apply() {
        String string2;
        float f5;
        int n3;
        Object object;
        int n4;
        this.s();
        Object object2 = this.n0;
        int n7 = this.s0;
        object2.getClass();
        if ((n7 == 0 || n7 == (n4 = 1)) && (n4 = ((i11_0)object2).X0) != n7) {
            ((i11_0)object2).X0 = n7;
        }
        int n8 = this.t0;
        n7 = 50;
        float f6 = 7.0E-44f;
        if (n8 != 0) {
            object = this.n0;
            if (n8 > n7) {
                object.getClass();
            } else {
                n3 = ((i11_0)object).O0;
                if (n3 != n8) {
                    ((i11_0)object).O0 = n8;
                    ((i11_0)object).m0();
                    ((i11_0)object).i0();
                }
            }
        }
        if ((n8 = this.u0) != 0) {
            object = this.n0;
            if (n8 > n7) {
                object.getClass();
            } else {
                n7 = ((i11_0)object).Q0;
                if (n7 != n8) {
                    ((i11_0)object).Q0 = n8;
                    ((i11_0)object).m0();
                    ((i11_0)object).i0();
                }
            }
        }
        float f7 = this.v0;
        n7 = 0;
        f6 = 0.0f;
        String string3 = null;
        float f8 = f7 - 0.0f;
        n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            object = this.n0;
            float f11 = f7 - 0.0f;
            n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
            if (n3 < 0) {
                object.getClass();
            } else {
                float f12 = ((i11_0)object).R0;
                float f14 = f12 - f7;
                n3 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                if (n3 != 0) {
                    ((i11_0)object).R0 = f7;
                }
            }
        }
        if ((n4 = (int)((f5 = (f7 = this.w0) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0) {
            object = this.n0;
            float f15 = f7 - 0.0f;
            n7 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1));
            if (n7 < 0) {
                object.getClass();
            } else {
                f6 = ((i11_0)object).S0;
                float f16 = f6 - f7;
                n7 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
                if (n7 != 0) {
                    ((i11_0)object).S0 = f7;
                }
            }
        }
        if ((object2 = this.x0) != null && (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) == 0) {
            object2 = this.n0;
            string3 = this.x0;
            object = ((i11_0)object2).T0;
            if (object == null || (n4 = (int)(((String)object).equals(string3) ? 1 : 0)) == 0) {
                ((i11_0)object2).T0 = string3;
            }
        }
        if ((object2 = this.y0) != null && (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) == 0) {
            object2 = this.n0;
            string3 = this.y0;
            object = ((i11_0)object2).U0;
            if (object == null || (n4 = (int)(((String)object).equals(string3) ? 1 : 0)) == 0) {
                ((i11_0)object2).U0 = string3;
            }
        }
        object2 = this.z0;
        n7 = 0;
        f6 = 0.0f;
        string3 = null;
        if (object2 != null && (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) == 0) {
            String string4;
            object2 = this.n0;
            object = this.z0;
            string2 = ((i11_0)object2).V0;
            if (string2 == null || (n3 = (int)(string2.equals(string4 = ((String)object).toString()) ? 1 : 0)) == 0) {
                ((i11_0)object2).M0 = false;
                ((i11_0)object2).V0 = object = ((String)object).toString();
            }
        }
        if ((object2 = this.A0) != null && (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) == 0) {
            object2 = this.n0;
            object = this.A0;
            string2 = ((i11_0)object2).W0;
            if (string2 == null || (n3 = (int)(string2.equals(object) ? 1 : 0)) == 0) {
                ((i11_0)object2).M0 = false;
                ((i11_0)object2).W0 = object;
            }
        }
        object2 = this.n0;
        ((i11_0)object2).c1 = n7 = this.B0;
        ((se3_0)object2).B0 = n7 = this.o0;
        ((se3_0)object2).D0 = n7;
        ((se3_0)object2).E0 = n7;
        ((se3_0)object2).C0 = n7 = this.p0;
        ((se3_0)object2).z0 = n7 = this.q0;
        ((se3_0)object2).A0 = n7 = this.r0;
        this.r();
    }

    public final F41 s() {
        i11_0 i11_02 = this.n0;
        if (i11_02 == null) {
            this.n0 = i11_02 = new i11_0();
        }
        return this.n0;
    }
}

