/*
 * Decompiled with CFR 0.152.
 */
public final class CR1
extends nb1_0 {
    public int e;

    public CR1(int n3) {
        if (n3 >= 0) {
            n3 = et2_1.g(n3);
            this.c(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public final int b(int n3) {
        int n4 = this.c;
        n3 &= n4;
        int n7 = 0;
        while (true) {
            long[] lArray = this.a;
            int n8 = n3 >> 3;
            int n10 = (n3 & 7) << 3;
            long l2 = lArray[n8] >>> n10;
            long l3 = lArray[++n8];
            int n14 = 64 - n10;
            long l4 = l3 << n14;
            l3 = -((long)n10);
            n10 = 63;
            l4 = l4 & (l3 >>= n10) | l2;
            long l7 = (l4 ^ (long)-1) << 7;
            long l8 = (l4 = l4 & l7 & 0x8080808080808080L) - (l7 = 0L);
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) {
                n7 = Long.numberOfTrailingZeros(l4) >> 3;
                return n3 + n7 & n4;
            }
            n3 = n3 + (n7 += 8) & n4;
        }
    }

    public final void c(int n3) {
        long l2;
        long[] lArray;
        long[] lArray2;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            lArray2 = null;
        }
        this.c = n3;
        if (n3 == 0) {
            lArray = et2_1.a;
        } else {
            n4 = (n3 + 15 & 0xFFFFFFF8) >> 3;
            lArray = new long[n4];
            rp_1.q(lArray);
        }
        this.a = lArray;
        int n7 = n3 >> 3;
        int n8 = (n3 & 7) << 3;
        long l3 = lArray[n7];
        long l4 = 255L << n8;
        long l7 = l4 ^ (long)-1;
        lArray[n7] = l2 = l3 & l7 | l4;
        n4 = et2_1.c(this.c);
        n7 = this.d;
        this.e = n4 -= n7;
        lArray2 = new long[n3];
        this.b = lArray2;
    }
}

