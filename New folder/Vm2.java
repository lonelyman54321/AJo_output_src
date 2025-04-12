/*
 * Decompiled with CFR 0.152.
 */
public final class Vm2 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public Vm2() {
        byte[] byArray = gz3.f;
        this.a = byArray;
    }

    public Vm2(byte[] byArray, int n3) {
        this.a = byArray;
        this.d = n3;
    }

    public final void a() {
        int n3;
        int n4 = this.b;
        n4 = n4 >= 0 && (n4 < (n3 = this.d) || n4 == n3 && (n4 = this.c) == 0) ? 1 : 0;
        ct3.f(n4 != 0);
    }

    public final int b() {
        int n3 = this.d;
        int n4 = this.b;
        n3 = (n3 - n4) * 8;
        n4 = this.c;
        return n3 - n4;
    }

    public final void c() {
        int n3 = this.c;
        if (n3 == 0) {
            return;
        }
        this.c = 0;
        this.b = n3 = this.b + 1;
        this.a();
    }

    public final int d() {
        int n3 = this.c;
        n3 = n3 == 0 ? 1 : 0;
        ct3.f(n3 != 0);
        return this.b;
    }

    public final int e() {
        int n3 = this.b * 8;
        int n4 = this.c;
        return n3 + n4;
    }

    public final boolean f() {
        byte[] byArray = this.a;
        int n3 = this.b;
        int n4 = byArray[n3];
        int n7 = this.c;
        n3 = 128 >> n7;
        if ((n4 &= n3) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            byArray = null;
        }
        this.n();
        return n4 != 0;
    }

    public final int g(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        if (n3 == 0) {
            return 0;
        }
        this.c = n14 = this.c + n3;
        n14 = 0;
        while ((n10 = this.c) > (n8 = 8)) {
            this.c = n10 += -8;
            byte[] byArray = this.a;
            n7 = this.b;
            this.b = n4 = n7 + 1;
            n8 = byArray[n7] & 0xFF;
            n10 = n8 << n10;
            n14 |= n10;
        }
        byte[] byArray = this.a;
        n4 = this.b;
        n7 = byArray[n4] & 0xFF;
        int n15 = 8 - n10;
        n3 = 32 - n3;
        n7 = -1;
        n3 = n7 >>> n3 & (n14 |= (n7 >>= n15));
        if (n10 == n8) {
            this.c = 0;
            this.b = ++n4;
        }
        this.a();
        return n3;
    }

    public final void h(int n3, byte[] byArray) {
        int n4;
        int n7;
        int n8;
        int n10;
        byte[] byArray2;
        int n14;
        int n15;
        int n16 = n3 >> 3;
        int n17 = 0;
        while (true) {
            n15 = 8;
            n14 = 255;
            if (n17 >= n16) break;
            byArray2 = this.a;
            n10 = this.b;
            this.b = n8 = n10 + 1;
            n10 = byArray2[n10];
            n7 = this.c;
            byArray[n17] = n10 = (int)((byte)(n10 << n7));
            n4 = byArray2[n8];
            n15 -= n7;
            byArray[n17] = n15 = (int)((byte)((n14 &= n4) >> n15 | n10));
            ++n17;
        }
        if ((n3 &= 7) == 0) {
            return;
        }
        n17 = byArray[n16];
        n4 = n14 >> n3;
        byArray[n16] = n17 = (int)((byte)(n17 & n4));
        n4 = this.c;
        n10 = n4 + n3;
        if (n10 > n15) {
            byte[] byArray3 = this.a;
            n8 = this.b;
            this.b = n7 = n8 + 1;
            n10 = (byArray3[n8] & n14) << n4;
            byArray[n16] = n17 = (int)((byte)(n17 | n10));
            this.c = n4 -= n15;
        }
        this.c = n17 = this.c + n3;
        byArray2 = this.a;
        n10 = this.b;
        n4 = byArray2[n10];
        n14 &= n4;
        n4 = 8 - n17;
        n14 >>= n4;
        n4 = byArray[n16];
        n3 = 8 - n3;
        byArray[n16] = n3 = (int)((byte)((byte)(n14 << n3) | n4));
        if (n17 == n15) {
            this.c = 0;
            this.b = ++n10;
        }
        this.a();
    }

    public final long i(int n3) {
        long l2 = 0xFFFFFFFFL;
        int n4 = 32;
        if (n3 <= n4) {
            n3 = this.g(n3);
            n4 = gz3.a;
            long l3 = n3;
            return l2 & l3;
        }
        n3 -= n4;
        n3 = this.g(n3);
        int n7 = this.g(n4);
        long l4 = ((long)n3 & l2) << n4;
        long l7 = n7;
        return l2 & l7 | l4;
    }

    public final void j(int n3, byte[] byArray) {
        int n4;
        byte[] byArray2;
        int n7 = this.c;
        if (!n7) {
            n7 = 1;
        } else {
            n7 = 0;
            byArray2 = null;
        }
        ct3.f(n7 != 0);
        byArray2 = this.a;
        int n8 = this.b;
        System.arraycopy(byArray2, n8, byArray, 0, n3);
        this.b = n4 = this.b + n3;
        this.a();
    }

    public final void k(int n3, byte[] byArray) {
        this.a = byArray;
        this.b = 0;
        this.c = 0;
        this.d = n3;
    }

    public final void l(Xm2 xm2) {
        byte[] byArray = xm2.a;
        int n3 = xm2.c;
        this.k(n3, byArray);
        int n4 = xm2.b * 8;
        this.m(n4);
    }

    public final void m(int n3) {
        int n4;
        this.b = n4 = n3 / 8;
        this.c = n3 -= (n4 *= 8);
        this.a();
    }

    public final void n() {
        int n3;
        this.c = n3 = this.c + 1;
        int n4 = 8;
        if (n3 == n4) {
            this.c = 0;
            this.b = n3 = this.b + 1;
        }
        this.a();
    }

    public final void o(int n3) {
        int n4 = n3 / 8;
        int n7 = this.b + n4;
        this.b = n7++;
        int n8 = this.c;
        this.c = n3 = n3 - (n4 *= 8) + n8;
        n4 = 7;
        if (n3 > n4) {
            this.b = n7;
            this.c = n3 += -8;
        }
        this.a();
    }

    public final void p(int n3) {
        int n4 = this.c;
        n4 = n4 == 0 ? 1 : 0;
        ct3.f(n4 != 0);
        this.b = n4 = this.b + n3;
        this.a();
    }
}

