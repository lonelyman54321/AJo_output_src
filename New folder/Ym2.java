/*
 * Decompiled with CFR 0.152.
 */
public final class Ym2 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public Ym2(byte[] byArray, int n3, int n4) {
        this.a = byArray;
        this.c = n3;
        this.b = n4;
        this.d = 0;
        this.a();
    }

    public final void a() {
        int n3;
        int n4 = this.c;
        n4 = n4 >= 0 && (n4 < (n3 = this.b) || n4 == n3 && (n4 = this.d) == 0) ? 1 : 0;
        ct3.f(n4 != 0);
    }

    public final void b() {
        int n3 = this.d;
        if (n3 > 0) {
            n3 = 8 - n3;
            this.l(n3);
        }
    }

    public final boolean c(int n3) {
        int n4 = this.c;
        int n7 = n3 / 8;
        int n8 = n4 + n7;
        int n10 = this.d + n3;
        n3 = 7;
        if ((n10 -= (n7 *= 8)) > n3) {
            ++n8;
            n10 += -8;
        }
        n3 = 1;
        while ((n4 += n3) <= n8 && n8 < (n7 = this.b)) {
            n7 = (int)(this.j(n4) ? 1 : 0);
            if (n7 == 0) continue;
            ++n8;
            n4 += 2;
        }
        n4 = this.b;
        if (n8 >= n4 && (n8 != n4 || n10 != 0)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final boolean d() {
        int n3;
        int n4;
        int n7 = this.c;
        int n8 = this.d;
        boolean bl2 = false;
        int n10 = 0;
        while ((n4 = this.c) < (n3 = this.b) && (n4 = (int)(this.e() ? 1 : 0)) == 0) {
            ++n10;
        }
        n4 = this.c;
        n3 = this.b;
        int n14 = 1;
        n4 = n4 == n3 ? 1 : 0;
        this.c = n7;
        this.d = n8;
        if (n4 == 0 && (n7 = (int)(this.c(n10 = n10 * 2 + n14) ? 1 : 0)) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean e() {
        byte[] byArray = this.a;
        int n3 = this.c;
        int n4 = byArray[n3];
        int n7 = this.d;
        n3 = 128 >> n7;
        if ((n4 &= n3) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            byArray = null;
        }
        this.k();
        return n4 != 0;
    }

    public final int f(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        this.d = n14 = this.d + n3;
        n14 = 0;
        int n15 = 0;
        while (true) {
            n10 = this.d;
            n8 = 2;
            n7 = 8;
            if (n10 <= n7) break;
            this.d = n10 += -8;
            byte[] byArray = this.a;
            n4 = this.c;
            n7 = byArray[n4] & 0xFF;
            n10 = n7 << n10;
            n15 |= n10;
            n10 = n4 + 1;
            if ((n10 = (int)(this.j(n10) ? 1 : 0)) == 0) {
                n8 = 1;
            }
            this.c = n4 += n8;
        }
        byte[] byArray = this.a;
        int n16 = this.c;
        n4 = byArray[n16] & 0xFF;
        int n17 = 8 - n10;
        n3 = 32 - n3;
        n4 = -1;
        n3 = n4 >>> n3 & (n15 |= (n4 >>= n17));
        if (n10 == n7) {
            this.d = 0;
            n14 = n16 + 1;
            if ((n14 = (int)(this.j(n14) ? 1 : 0)) == 0) {
                n8 = 1;
            }
            this.c = n16 += n8;
        }
        this.a();
        return n3;
    }

    public final int g() {
        int n3;
        int n4 = 0;
        int n7 = 0;
        while ((n3 = this.e()) == 0) {
            ++n7;
        }
        n3 = 1;
        int n8 = (n3 << n7) - n3;
        if (n7 > 0) {
            n4 = this.f(n7);
        }
        return n8 + n4;
    }

    public final int h() {
        int n3 = this.g();
        int n4 = n3 % 2;
        int n7 = 1;
        n4 = n4 == 0 ? -1 : 1;
        return (n3 + n7) / 2 * n4;
    }

    public final int i() {
        return this.g();
    }

    public final boolean j(int n3) {
        int n4;
        block3: {
            block2: {
                int n7;
                byte[] byArray;
                int n8 = 2;
                if (n8 > n3 || n3 >= (n8 = this.b) || (n4 = (byArray = this.a)[n3]) != (n7 = 3)) break block2;
                n4 = n3 + -2;
                if ((n4 = byArray[n4]) != 0) break block2;
                n4 = 1;
                n3 -= n4;
                if ((n3 = byArray[n3]) == 0) break block3;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public final void k() {
        int n3 = this.d;
        int n4 = 1;
        this.d = n3 += n4;
        int n7 = 8;
        if (n3 == n7) {
            this.d = 0;
            n3 = this.c;
            n7 = n3 + 1;
            if ((n7 = (int)(this.j(n7) ? 1 : 0)) != 0) {
                n4 = 2;
            }
            this.c = n3 += n4;
        }
        this.a();
    }

    public final void l(int n3) {
        int n4 = this.c;
        int n7 = n3 / 8;
        int n8 = n4 + n7;
        this.c = n8++;
        int n10 = this.d;
        this.d = n3 = n3 - (n7 *= 8) + n10;
        n7 = 7;
        if (n3 > n7) {
            this.c = n8;
            this.d = n3 += -8;
        }
        while (++n4 <= (n3 = this.c)) {
            n3 = (int)(this.j(n4) ? 1 : 0);
            if (n3 == 0) continue;
            this.c = n3 = this.c + 1;
            n4 += 2;
        }
        this.a();
    }
}

