/*
 * Decompiled with CFR 0.152.
 */
public final class SB2 {
    public final On3 a;
    public final Xm2 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public SB2() {
        long l2;
        Object object = new On3(0L);
        this.a = object;
        this.f = l2 = -9223372036854775807L;
        this.g = l2;
        this.h = l2;
        this.b = object = new Xm2();
    }

    public static int b(int n3, byte[] byArray) {
        int n4 = (byArray[n3] & 0xFF) << 24;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 16;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 8;
        return byArray[n3 += 3] & 0xFF | (n4 |= n7);
    }

    public static long c(Xm2 xm2) {
        int n3;
        int n4 = xm2.b;
        int n7 = xm2.a();
        long l2 = -9223372036854775807L;
        int n8 = 9;
        if (n7 < n8) {
            return l2;
        }
        byte[] byArray = new byte[n8];
        int n10 = 0;
        xm2.g(0, byArray, n8);
        xm2.I(n4);
        byte by2 = byArray[0];
        n4 = by2 & 0xC4;
        n8 = 68;
        if (n4 == n8 && (n8 = (n4 = byArray[2]) & 4) == (n10 = 4) && (n3 = (n8 = byArray[n10]) & 4) == n10) {
            n10 = 5;
            n3 = byArray[n10];
            int n14 = 1;
            if ((n3 &= n14) == n14) {
                n3 = byArray[8];
                int n15 = 3;
                if ((n3 &= n15) == n15) {
                    l2 = by2;
                    long l3 = ((long)56 & l2) >> n15 << 30;
                    long l4 = 3;
                    l2 = (l2 & l4) << 28 | l3;
                    long l7 = byArray[n14];
                    l3 = 255L;
                    l7 = (l7 & l3) << 20;
                    l2 |= l7;
                    long l8 = n4;
                    l7 = 248L;
                    long l12 = (l8 & l7) >> n15 << 15;
                    l8 = (l8 & l4) << 13 | (l2 |= l12);
                    long l14 = ((long)byArray[n15] & l3) << n10;
                    l8 |= l14;
                    l14 = ((long)n8 & l7) >> n15;
                    return l8 | l14;
                }
            }
        }
        return l2;
    }

    public final void a(il0_0 il0_02) {
        byte[] byArray = gz3.f;
        Xm2 xm2 = this.b;
        xm2.getClass();
        int n3 = byArray.length;
        xm2.G(n3, byArray);
        this.c = true;
        il0_02.f = 0;
    }
}

