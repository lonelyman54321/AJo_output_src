/*
 * Decompiled with CFR 0.152.
 */
public final class X83 {
    public final Xm2 a;
    public int b;

    public X83() {
        Xm2 xm2;
        this.a = xm2 = new Xm2(8);
    }

    public final long a(il0_0 il0_02) {
        int n3;
        int n4;
        Xm2 xm2 = this.a;
        byte[] byArray = xm2.a;
        int n7 = 0;
        int n8 = 1;
        il0_02.b(byArray, 0, n8, false);
        byArray = xm2.a;
        int n10 = byArray[0] & 0xFF;
        if (n10 == 0) {
            return Long.MIN_VALUE;
        }
        int n14 = 128;
        int n15 = 0;
        while ((n4 = n10 & n14) == 0) {
            n14 >>= 1;
            ++n15;
        }
        n10 &= (n14 ^= 0xFFFFFFFF);
        byte[] byArray2 = xm2.a;
        il0_02.b(byArray2, n8, n15, false);
        while (n7 < n15) {
            n3 = n10 << 8;
            byArray = xm2.a;
            n10 = (byArray[++n7] & 0xFF) + n3;
        }
        n3 = this.b;
        this.b = n15 = n15 + n8 + n3;
        return n10;
    }
}

