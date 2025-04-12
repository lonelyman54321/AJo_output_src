/*
 * Decompiled with CFR 0.152.
 */
public final class vA3 {
    public static final long[] d;
    public final byte[] a;
    public int b;
    public int c;

    static {
        long[] lArray;
        long[] lArray2 = lArray = new long[8];
        long[] lArray3 = lArray;
        lArray2[0] = 128L;
        lArray3[1] = 64;
        lArray2[2] = 32;
        lArray3[3] = 16;
        lArray2[4] = 8;
        lArray3[5] = 4;
        lArray2[6] = 2;
        lArray3[7] = 1L;
        d = lArray;
    }

    public vA3() {
        byte[] byArray = new byte[8];
        this.a = byArray;
    }

    public static long a(byte[] byArray, int n3, boolean n4) {
        long l2;
        int n7;
        byte by2 = byArray[0];
        long l3 = by2;
        long l4 = 255L;
        l3 &= l4;
        if (n4 != 0) {
            long[] lArray = d;
            n7 = n3 + -1;
            l2 = lArray[n7] ^ (long)-1;
            l3 &= l2;
        }
        for (n4 = 1; n4 < n3; ++n4) {
            l3 <<= 8;
            n7 = byArray[n4];
            l2 = (long)n7 & l4;
            l3 |= l2;
        }
        return l3;
    }

    public static int b(int n3) {
        int n4;
        block1: {
            int n7;
            for (n4 = 0; n4 < (n7 = 8); ++n4) {
                long[] lArray = d;
                long l2 = lArray[n4];
                long l3 = n3;
                long l4 = l2 & l3;
                long l7 = 0L;
                long l8 = l4 - l7;
                Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object == false) continue;
                ++n4;
                break block1;
            }
            n4 = -1;
        }
        return n4;
    }

    public final long c(il0_0 object, boolean n3, boolean bl2, int n4) {
        int n7 = this.b;
        byte[] byArray = this.a;
        int n8 = 1;
        if (n7 == 0) {
            if ((n3 = (int)(((il0_0)object).e(byArray, 0, n8, n3 != 0) ? 1 : 0)) == 0) {
                return -1;
            }
            this.c = n3 = vA3.b(byArray[0] & 0xFF);
            n7 = -1;
            if (n3 != n7) {
                this.b = n8;
            } else {
                object = new IllegalStateException("No valid varint length mask found");
                throw object;
            }
        }
        if ((n3 = this.c) > n4) {
            this.b = 0;
            return -2;
        }
        if (n3 != n8) {
            ((il0_0)object).e(byArray, n8, n3 -= n8, false);
        }
        this.b = 0;
        int n10 = this.c;
        return vA3.a(byArray, n10, bl2);
    }
}

