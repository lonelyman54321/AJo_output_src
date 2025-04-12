/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Y11
 */
public final class y11_0
implements ni0_0,
qg2_0 {
    public final Fb3 a;
    public int b;
    public w11_0 c;
    public int d;
    public int e;
    public float f;
    public Object g;

    public y11_0(Fb3 fb3) {
        int n3;
        this.d = n3 = -1;
        this.e = n3;
        this.f = 0.0f;
        this.a = fb3;
    }

    public final Y50 a() {
        w11_0 w11_02 = this.c;
        if (w11_02 == null) {
            this.c = w11_02 = new w11_0();
        }
        return this.c;
    }

    public final void apply() {
        w11_0 w11_02 = this.c;
        int n3 = this.b;
        w11_02.a0(n3);
        int n4 = this.d;
        n3 = -1082130432;
        float f5 = -1.0f;
        int n7 = -1;
        if (n4 != n7) {
            w11_0 w11_03 = this.c;
            if (n4 > n7) {
                w11_03.x0 = f5;
                w11_03.y0 = n4;
                w11_03.z0 = n7;
            } else {
                w11_03.getClass();
            }
        } else {
            n4 = this.e;
            if (n4 != n7) {
                w11_0 w11_04 = this.c;
                if (n4 > n7) {
                    w11_04.x0 = f5;
                    w11_04.y0 = n7;
                    w11_04.z0 = n4;
                } else {
                    w11_04.getClass();
                }
            } else {
                w11_02 = this.c;
                float f6 = this.f;
                float f7 = f6 - f5;
                n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n3 > 0) {
                    w11_02.x0 = f6;
                    w11_02.y0 = n7;
                    w11_02.z0 = n7;
                } else {
                    w11_02.getClass();
                }
            }
        }
    }

    public final void b(Y50 y50) {
        boolean bl2 = y50 instanceof w11_0;
        if (bl2) {
            y50 = (w11_0)y50;
            this.c = y50;
        } else {
            y50 = null;
            this.c = null;
        }
    }

    public final ni0_0 c() {
        return null;
    }

    public final Object getKey() {
        return this.g;
    }
}

