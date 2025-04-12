/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VW2
 */
public final class vw2_0
implements Gs3 {
    public final UW2 a;
    public final Xm2 b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public vw2_0(UW2 object) {
        this.a = object;
        this.b = object = new Xm2(32);
    }

    public final void a(int n3, Xm2 xm2) {
        int n4;
        int n7;
        UW2 uW2;
        int n8 = 1;
        if ((n3 &= n8) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            uW2 = null;
        }
        int n10 = -1;
        if (n3 != 0) {
            n7 = xm2.w();
            n4 = xm2.b + n7;
        } else {
            n4 = -1;
        }
        n7 = (int)(this.f ? 1 : 0);
        if (n7 != 0) {
            if (n3 == 0) {
                return;
            }
            this.f = false;
            xm2.I(n4);
            this.d = 0;
        }
        while ((n3 = xm2.a()) > 0) {
            byte[] byArray;
            int n14;
            n3 = this.d;
            n7 = 3;
            Xm2 xm22 = this.b;
            if (n3 < n7) {
                if (n3 == 0) {
                    n3 = xm2.w();
                    n14 = xm2.b - n8;
                    xm2.I(n14);
                    n14 = 255;
                    if (n3 == n14) {
                        this.f = n8;
                        return;
                    }
                }
                n3 = xm2.a();
                n14 = this.d;
                n14 = 3 - n14;
                n3 = Math.min(n3, n14);
                byte[] byArray2 = xm22.a;
                int n15 = this.d;
                xm2.g(n15, byArray2, n3);
                this.d = n14 = this.d + n3;
                if (n14 != n7) continue;
                xm22.I(0);
                xm22.H(n7);
                xm22.J(n8);
                n3 = xm22.w();
                n14 = xm22.w();
                n15 = n3 & 0x80;
                n15 = n15 != 0 ? 1 : 0;
                this.e = n15;
                this.c = n3 = ((n3 & 0xF) << 8 | n14) + n7;
                byArray = xm22.a;
                n14 = byArray.length;
                if (n14 >= n3) continue;
                n7 = byArray.length * 2;
                n3 = Math.max(n3, n7);
                n7 = 4098;
                n3 = Math.min(n7, n3);
                xm22.b(n3);
                continue;
            }
            n3 = xm2.a();
            n7 = this.c;
            n14 = this.d;
            n3 = Math.min(n3, n7 -= n14);
            byArray = xm22.a;
            n14 = this.d;
            xm2.g(n14, byArray, n3);
            this.d = n7 = this.d + n3;
            n3 = this.c;
            if (n7 != n3) continue;
            n7 = (int)(this.e ? 1 : 0);
            if (n7 != 0) {
                byArray = xm22.a;
                if ((n3 = gz3.j(0, byArray, n3, n10)) != 0) {
                    this.f = n8;
                    return;
                }
                n3 = this.c + -4;
                xm22.H(n3);
            } else {
                xm22.H(n3);
            }
            xm22.I(0);
            uW2 = this.a;
            uW2.a(xm22);
            this.d = 0;
        }
    }

    public final void b(On3 on3, gi0_0 gi0_02, Gs3$d gs3$d) {
        this.a.b(on3, gi0_02, gs3$d);
        this.f = true;
    }

    public final void c() {
        this.f = true;
    }
}

