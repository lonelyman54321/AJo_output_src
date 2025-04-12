/*
 * Decompiled with CFR 0.152.
 */
public final class Hs3 {
    public static long a(Xm2 xm2, int n3, int n4) {
        xm2.I(n3);
        n3 = xm2.a();
        int n7 = 5;
        long l2 = -9223372036854775807L;
        if (n3 < n7) {
            return l2;
        }
        n3 = xm2.i();
        n7 = 0x800000 & n3;
        if (n7 != 0) {
            return l2;
        }
        n7 = (0x1FFF00 & n3) >> 8;
        if (n7 != n4) {
            return l2;
        }
        if ((n3 &= 0x20) != 0 && (n3 = xm2.w()) >= (n4 = 7) && (n3 = xm2.a()) >= n4) {
            n3 = xm2.w();
            n7 = 16;
            if ((n3 &= n7) == n7) {
                n3 = 6;
                byte[] byArray = new byte[n3];
                xm2.g(0, byArray, n3);
                long l3 = byArray[0];
                l2 = 255L;
                l3 = (l3 & l2) << 25;
                int n8 = 1;
                long l4 = ((long)byArray[n8] & l2) << 17;
                l3 |= l4;
                l4 = ((long)byArray[2] & l2) << 9;
                l3 |= l4;
                long l7 = ((long)byArray[3] & l2) << n8;
                long l8 = ((long)byArray[4] & l2) >> n4;
                return (l3 |= l7) | l8;
            }
        }
        return l2;
    }
}

