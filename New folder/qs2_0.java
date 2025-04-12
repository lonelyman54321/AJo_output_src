/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qs2
 */
public final class qs2_0
extends se3_0 {
    public final void a0(int n3, int n4, int n7, int n8) {
        int n10 = this.D0;
        int n14 = this.E0;
        int n15 = this.z0;
        int n16 = this.A0;
        n10 += n14;
        n15 += n16;
        n14 = this.y0;
        n16 = 0;
        if (n14 > 0) {
            n14 = this.x0[0].v();
            n10 += n14;
            Y50 y50 = this.x0[0];
            n14 = y50.p();
            n15 += n14;
        }
        n10 = Math.max(this.f0, n10);
        n14 = Math.max(this.g0, n15);
        n15 = -1 << -1;
        int n17 = 0x40000000;
        if (n3 != n17) {
            n4 = n3 == n15 ? Math.min(n10, n4) : (n3 == 0 ? n10 : 0);
        }
        if (n7 != n17) {
            n8 = n7 == n15 ? Math.min(n14, n8) : (n7 == 0 ? n14 : 0);
        }
        this.G0 = n4;
        this.H0 = n8;
        this.W(n4);
        this.R(n8);
        n3 = this.y0;
        if (n3 > 0) {
            n16 = 1;
        }
        this.F0 = n16;
    }

    public final void f(Eu1 object, boolean bl2) {
        super.f((Eu1)object, bl2);
        int n3 = this.y0;
        if (n3 > 0) {
            float f5;
            object = this.x0;
            bl2 = false;
            object = object[0];
            ((Y50)object).I();
            ((Y50)object).i0 = f5 = 0.5f;
            ((Y50)object).h0 = f5;
            v50$a v50$a = v50$a.LEFT;
            ((Y50)object).i(v50$a, this, v50$a, 0);
            v50$a = v50$a.RIGHT;
            ((Y50)object).i(v50$a, this, v50$a, 0);
            v50$a = v50$a.TOP;
            ((Y50)object).i(v50$a, this, v50$a, 0);
            v50$a = v50$a.BOTTOM;
            ((Y50)object).i(v50$a, this, v50$a, 0);
        }
    }
}

