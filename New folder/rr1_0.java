/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rR1
 */
public final class rr1_0
extends Li1 {
    public int f;

    public rr1_0() {
        int n3 = et2_1.g(6);
        this.f(n3);
    }

    public final void d() {
        int n3;
        int n4 = 0;
        this.e = 0;
        long[] lArray = this.a;
        long[] lArray2 = et2_1.a;
        if (lArray != lArray2) {
            rp_1.q(lArray);
            lArray = this.a;
            n3 = this.d;
            int n7 = n3 >> 3;
            n3 = (n3 & 7) << 3;
            long l2 = lArray[n7];
            long l3 = 255L << n3;
            long l4 = l3 ^ (long)-1;
            lArray[n7] = l2 = l2 & l4 | l3;
        }
        n4 = et2_1.c(this.d);
        n3 = this.e;
        this.f = n4 -= n3;
    }

    public final int e(int n3) {
        int n4 = this.d;
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

    public final void f(int n3) {
        long l2;
        Object[] objectArray;
        int[] nArray;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            nArray = null;
        }
        this.d = n3;
        if (n3 == 0) {
            objectArray = et2_1.a;
        } else {
            n4 = (n3 + 15 & 0xFFFFFFF8) >> 3;
            objectArray = new long[n4];
            rp_1.q(objectArray);
        }
        this.a = objectArray;
        int n7 = n3 >> 3;
        int n8 = (n3 & 7) << 3;
        long l3 = objectArray[n7];
        long l4 = 255L << n8;
        long l7 = l4 ^ (long)-1;
        objectArray[n7] = l2 = l3 & l7 | l4;
        n4 = et2_1.c(this.d);
        n7 = this.e;
        this.f = n4 -= n7;
        objectArray = new int[n3];
        this.b = (int[])objectArray;
        nArray = new int[n3];
        this.c = nArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void g(int n3, int n4) {
        int n7;
        block19: {
            long l2;
            long[] lArray;
            int n8;
            long l3;
            int n10;
            long l4;
            long l7;
            long l8;
            int n14;
            int n15;
            int n16;
            rr1_0 rr1_02;
            block20: {
                int n17;
                block25: {
                    void var11_15;
                    long[] lArray2;
                    int[] nArray;
                    int n18;
                    long l12;
                    int n19;
                    int n20;
                    int n21;
                    int n22;
                    long l14;
                    int n24;
                    int n25;
                    int n26;
                    block21: {
                        int n27;
                        int n28;
                        int[] nArray2;
                        long[] lArray3;
                        long l15;
                        long l16;
                        long l17;
                        rr1_02 = this;
                        n7 = n3;
                        n17 = 1;
                        n16 = -862048943;
                        n15 = n3 * n16;
                        n26 = n15 << 16;
                        n15 ^= n26;
                        n26 = n15 >>> 7;
                        n15 &= 0x7F;
                        int n29 = this.d;
                        n14 = n26 & n29;
                        boolean bl2 = false;
                        int[] nArray3 = null;
                        while (true) {
                            int n30;
                            Object object;
                            block22: {
                                int[] nArray4;
                                long l18;
                                block24: {
                                    block23: {
                                        long l19;
                                        long[] lArray4 = rr1_02.a;
                                        n25 = n14 >> 3;
                                        n24 = (n14 & 7) << 3;
                                        long l20 = lArray4[n25] >>> n24;
                                        l14 = lArray4[n25 += n17];
                                        n22 = 64 - n24;
                                        l8 = l14 << n22;
                                        n21 = object;
                                        l7 = -((long)n24);
                                        n24 = 63;
                                        l7 = l7 >> n24 & l8 | l20;
                                        l8 = n15;
                                        l4 = 0x101010101010101L;
                                        long l21 = l8 * l4;
                                        n30 = n15;
                                        l18 = l7 ^ l21;
                                        l4 = l18 - l4;
                                        l18 = (l18 ^ (long)-1) & l4;
                                        l4 = -9187201950435737472L;
                                        l18 &= l4;
                                        while ((l17 = (l19 = l18 - (l21 = 0L)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) != false) {
                                            n20 = Long.numberOfTrailingZeros(l18) >> 3;
                                            nArray4 = rr1_02.b;
                                            n10 = nArray4[n20 = n14 + n20 & n29];
                                            if (n10 == n7) {
                                                n7 = n20;
                                                break block19;
                                            }
                                            l21 = l18 - 1L;
                                            l18 &= l21;
                                        }
                                        l18 = l7 ^ (long)-1;
                                        n10 = 6;
                                        l18 = l18 << n10 & l7 & l4;
                                        n19 = 8;
                                        object = l18 == l21 ? 0 : (l18 < l21 ? -1 : 1);
                                        if (object == false) break block22;
                                        n16 = rr1_02.e(n26);
                                        n15 = rr1_02.f;
                                        l16 = 128L;
                                        l4 = 255L;
                                        if (n15 != 0) break block23;
                                        long[] lArray5 = rr1_02.a;
                                        int n32 = n16 >> 3;
                                        long l22 = lArray5[n32];
                                        n15 = (n16 & 7) << 3;
                                        l15 = 254L;
                                        long l23 = (l22 = l22 >> n15 & l4) - l15;
                                        if ((n15 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1))) != 0) break block24;
                                    }
                                    l3 = l8;
                                    n8 = 1;
                                    break block20;
                                }
                                n16 = rr1_02.d;
                                if (n16 > n19) {
                                    n15 = rr1_02.e;
                                    l7 = n15;
                                    Mt3$a mt3$a = mt3_0.b;
                                    l7 *= (long)32;
                                    l18 = (long)n16 * (long)25;
                                    l12 = Long.MIN_VALUE;
                                    n16 = Long.compare(l7 ^= l12, l18 ^= l12);
                                    if (n16 <= 0) {
                                        lArray3 = rr1_02.a;
                                        n15 = rr1_02.d;
                                        nArray2 = rr1_02.b;
                                        nArray3 = rr1_02.c;
                                        et2_1.a(lArray3, n15);
                                        n10 = 0;
                                        nArray4 = null;
                                        n28 = -1;
                                        break;
                                    }
                                }
                                n18 = n26;
                                l3 = l8;
                                n26 = 0;
                                n7 = et2_1.e(rr1_02.d);
                                lArray = rr1_02.a;
                                int[] nArray5 = rr1_02.b;
                                nArray = rr1_02.c;
                                n15 = rr1_02.d;
                                rr1_02.f(n7);
                                lArray2 = rr1_02.a;
                                int[] nArray6 = rr1_02.b;
                                int[] nArray7 = rr1_02.c;
                                n19 = rr1_02.d;
                                boolean bl3 = false;
                                nArray3 = null;
                                break block21;
                            }
                            n17 = n26;
                            n8 = 1;
                            object = n21 + 8;
                            n14 = n14 + object & n29;
                            n7 = n3;
                            n15 = n30;
                            n17 = 1;
                            n16 = -862048943;
                        }
                        while (n10 != n15) {
                            void var70_66;
                            String string2;
                            long l24;
                            long[] lArray6;
                            long l25;
                            n21 = n10 >> 3;
                            long l26 = lArray3[n21];
                            int n34 = (n10 & 7) << 3;
                            long l27 = (l26 = l26 >> n34 & l4) - l16;
                            Object object = l27 == 0L ? 0 : (l27 < 0L ? -1 : 1);
                            if (object == false) {
                                n21 = n10 + 1;
                                n28 = n10;
                                n10 = n21;
                                continue;
                            }
                            object = l26 == l15 ? 0 : (l26 < l15 ? -1 : 1);
                            if (object != false) {
                                n10 += n17;
                                continue;
                            }
                            int n35 = nArray2[n10] * -862048943;
                            l17 = n10;
                            int n36 = n35 << 16;
                            n10 = (n35 ^= n36) >>> 7;
                            object = rr1_02.e(n10);
                            int n37 = object - (n10 &= n15) & n15;
                            n20 = 8;
                            n8 = n37 / 8;
                            n10 = (l17 - n10 & n15) / 8;
                            long l28 = 0xFFFFFFFFFFFFFFL;
                            String string3 = "<this>";
                            if (n8 == n10) {
                                l25 = n35 & 0x7F;
                                long l29 = lArray3[n21];
                                lArray6 = lArray3;
                                l24 = l4 << n34 ^ (long)-1;
                                l24 = l29 & l24;
                                lArray3[n21] = l25 = l25 << n34 | l24;
                                Intrinsics.checkNotNullParameter(lArray3, string3);
                                n7 = lArray3.length;
                                n8 = 1;
                                Object var70_63 = null;
                                long l30 = lArray3[0];
                                lArray3[n7 -= n8] = l24 = l30 & l28 | l12;
                                n10 = (int)(l17 + true);
                                n17 = 1;
                                l16 = 128L;
                                n7 = n3;
                                continue;
                            }
                            lArray6 = lArray3;
                            n7 = (int)(object >> 3);
                            long l31 = lArray3[n7];
                            n16 = (object & 7) << 3;
                            l3 = l31 >> n16 & l4;
                            long l34 = 128L;
                            long l35 = l3 - l34;
                            n37 = (int)(l35 == 0L ? 0 : (l35 < 0L ? -1 : 1));
                            if (n37 == 0) {
                                n10 = n35 & 0x7F;
                                l3 = l8;
                                l8 = n10;
                                n27 = n26;
                                string2 = string3;
                                l2 = l4 << n16 ^ (long)-1;
                                l31 &= l2;
                                l2 = l8 << n16;
                                lArray3[n7] = l31 |= l2;
                                l25 = lArray3[n21];
                                l24 = l4 << n34 ^ (long)-1;
                                l25 &= l24;
                                l24 = 128L;
                                l2 = l24 << n34;
                                lArray3[n21] = l25 |= l2;
                                nArray2[object] = n7 = nArray2[l17];
                                Object var81_80 = null;
                                nArray2[l17] = 0;
                                nArray3[object] = n8 = nArray3[l17];
                                nArray3[l17] = 0;
                                n8 = (int)l17;
                                n28 = (int)l17;
                                String string4 = string3;
                                n7 = -1;
                            } else {
                                n27 = n26;
                                string2 = string3;
                                l3 = l8;
                                n26 = n35 & 0x7F;
                                l2 = n26;
                                l8 = l4 << n16 ^ (long)-1;
                                l31 &= l8;
                                lArray3[n7] = l31 |= (l2 <<= n16);
                                n8 = n28;
                                n7 = -1;
                                if (n28 == n7) {
                                    n7 = 1;
                                    n8 = (int)(l17 + true);
                                    n28 = et2_1.b(lArray3, n8, n15);
                                }
                                nArray2[n28] = n7 = nArray2[object];
                                nArray2[object] = n7 = nArray2[l17];
                                nArray2[l17] = n7 = nArray2[n28];
                                nArray3[n28] = n7 = nArray3[object];
                                nArray3[object] = n7 = nArray3[l17];
                                nArray3[l17] = n7 = nArray3[n28];
                                n7 = -1;
                                n8 = (int)(l17 + -1);
                                String string5 = string2;
                            }
                            Intrinsics.checkNotNullParameter(lArray6, (String)var70_66);
                            n17 = lArray6.length;
                            n16 = 1;
                            lArray6[n17 -= n16] = l8 = lArray6[0] & l28 | l12;
                            n7 = n3;
                            n10 = n8 += n16;
                            lArray3 = lArray6;
                            l8 = l3;
                            n26 = n27;
                            n17 = 1;
                            l16 = 128L;
                        }
                        n27 = n26;
                        l3 = l8;
                        n26 = 0;
                        n7 = et2_1.c(rr1_02.d);
                        n8 = rr1_02.e;
                        rr1_02.f = n7 -= n8;
                        n17 = n27;
                        n8 = 1;
                        break block25;
                    }
                    while (var11_15 < n15) {
                        void var86_86;
                        long[] lArray7;
                        void var70_68;
                        n22 = var11_15 >> 3;
                        l8 = lArray[n22];
                        int n38 = (var11_15 & 7) << 3;
                        l14 = 128L;
                        long l36 = (l8 = l8 >> n38 & l4) - l14;
                        n20 = (int)(l36 == 0L ? 0 : (l36 < 0L ? -1 : 1));
                        if (n20 < 0) {
                            n22 = var70_68[var11_15];
                            n38 = n22 * -862048943;
                            n21 = n38 << 16;
                            n26 = (n38 ^= n21) >>> 7;
                            n26 = rr1_02.e(n26);
                            l4 = n38 & 0x7F;
                            n25 = n26 >> 3;
                            int n39 = (n26 & 7) << 3;
                            l12 = lArray2[n25];
                            lArray7 = lArray;
                            void var86_87 = var70_68;
                            l14 = 255L;
                            long l37 = l14 << n39 ^ (long)-1;
                            l37 = l12 & l37;
                            lArray2[n25] = l37 |= (l4 <<= n39);
                            n25 = n26 + -7 & n19;
                            n24 = n19 & 7;
                            n25 = n25 + n24 >> 3;
                            lArray2[n25] = l37;
                            nArray6[n26] = n22;
                            nArray7[n26] = n8 = nArray[var11_15];
                        } else {
                            lArray7 = lArray;
                            void var86_88 = var70_68;
                        }
                        n8 = 1;
                        var11_15 += n8;
                        lArray = lArray7;
                        void var70_69 = var86_86;
                        n26 = 0;
                        l4 = 255L;
                    }
                    n8 = 1;
                    n17 = n18;
                }
                n16 = rr1_02.e(n17);
            }
            rr1_02.e = n7 = rr1_02.e + n8;
            n7 = rr1_02.f;
            long[] lArray8 = rr1_02.a;
            n15 = n16 >> 3;
            l2 = lArray8[n15];
            n14 = (n16 & 7) << 3;
            l7 = l2 >> n14;
            l8 = 255L;
            l4 = 128L;
            long l38 = (l7 &= l8) - l4;
            n10 = (int)(l38 == 0L ? 0 : (l38 < 0L ? -1 : 1));
            if (n10 != 0) {
                n8 = 0;
                lArray = null;
            }
            rr1_02.f = n7 -= n8;
            n7 = rr1_02.d;
            l7 = l8 << n14 ^ (long)-1;
            l2 &= l7;
            long l39 = l3 << n14;
            lArray8[n15] = l2 |= l39;
            n8 = n16 + -7 & n7;
            n7 = (n8 += (n7 &= 7)) >> 3;
            lArray8[n7] = l2;
            n7 = ~n16;
        }
        if (n7 < 0) {
            n7 ^= 0xFFFFFFFF;
        }
        rr1_02.b[n7] = n3;
        rr1_02.c[n7] = n4;
    }
}

