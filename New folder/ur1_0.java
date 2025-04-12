/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uR1
 */
public final class ur1_0
extends Zi1 {
    public int e;

    public ur1_0(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.e(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public /* synthetic */ ur1_0(Object object) {
        this(6);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b(int n3) {
        int n4;
        int n7;
        int n8;
        ur1_0 ur1_02;
        block18: {
            long[] lArray;
            long l2;
            long l3;
            int n10;
            int n14;
            long l4;
            long l7;
            long l8;
            long l12;
            int n15;
            int n16;
            int n17;
            int n18;
            block19: {
                block24: {
                    long[] lArray2;
                    int[] nArray;
                    int n19;
                    int n20;
                    long l14;
                    int n21;
                    int n22;
                    int n24;
                    int n25;
                    int n26;
                    block20: {
                        int n27;
                        int n28;
                        int n29;
                        int[] nArray2;
                        long[] lArray3;
                        long l15;
                        long l16;
                        ur1_02 = this;
                        n8 = n3;
                        n7 = 1;
                        n18 = this.d;
                        n26 = -862048943;
                        int n30 = n3 * n26;
                        n17 = n30 << 16;
                        n30 ^= n17;
                        n17 = n30 >>> 7;
                        n30 &= 0x7F;
                        n16 = this.c;
                        n15 = n17 & n16;
                        int n32 = 0;
                        while (true) {
                            block21: {
                                block23: {
                                    block22: {
                                        long l17;
                                        long l18;
                                        long[] lArray4 = ur1_02.a;
                                        n25 = n15 >> 3;
                                        n24 = (n15 & 7) << 3;
                                        long l19 = lArray4[n25] >>> n24;
                                        long l20 = lArray4[n25 += n7];
                                        n22 = 64 - n24;
                                        l12 = l20 << n22;
                                        n21 = n32;
                                        l8 = -((long)n24);
                                        n24 = 63;
                                        l8 = l8 >> n24 & l12 | l19;
                                        l12 = n30;
                                        l7 = 0x101010101010101L;
                                        l14 = l12 * l7;
                                        n20 = n30;
                                        l4 = l8 ^ l14;
                                        l7 = l4 - l7;
                                        l4 = (l4 ^ (long)-1) & l7;
                                        l7 = -9187201950435737472L;
                                        l4 &= l7;
                                        while ((l18 = (l17 = l4 - (l14 = 0L)) == 0L ? 0 : (l17 < 0L ? -1 : 1)) != false) {
                                            n14 = Long.numberOfTrailingZeros(l4) >> 3;
                                            int[] nArray3 = ur1_02.b;
                                            n10 = nArray3[n14 = n15 + n14 & n16];
                                            if (n10 == n8) {
                                                n4 = n18;
                                                n17 = 1;
                                                break block18;
                                            }
                                            l14 = l4 - 1L;
                                            l4 &= l14;
                                        }
                                        l4 = (l8 ^ (long)-1) << 6 & l8 & l7;
                                        n10 = 8;
                                        Object object = l4 == l14 ? 0 : (l4 < l14 ? -1 : 1);
                                        if (object == false) break block21;
                                        n26 = ur1_02.d(n17);
                                        n30 = ur1_02.e;
                                        l3 = 128L;
                                        l8 = 255L;
                                        if (n30 != 0) break block22;
                                        long[] lArray5 = ur1_02.a;
                                        n24 = n26 >> 3;
                                        l7 = lArray5[n24];
                                        n30 = (n26 & 7) << 3;
                                        l16 = 254L;
                                        long l21 = (l7 = l7 >> n30 & l8) - l16;
                                        if ((n30 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1))) != 0) break block23;
                                    }
                                    n4 = n18;
                                    l2 = l12;
                                    n17 = 1;
                                    n14 = n26;
                                    break block19;
                                }
                                n26 = ur1_02.c;
                                if (n26 > n10) {
                                    n30 = ur1_02.d;
                                    l7 = n30;
                                    Mt3$a mt3$a = mt3_0.b;
                                    l7 *= (long)32;
                                    l4 = (long)n26 * (long)25;
                                    l15 = Long.MIN_VALUE;
                                    n26 = Long.compare(l7 ^= l15, l4 ^= l15);
                                    if (n26 <= 0) {
                                        lArray3 = ur1_02.a;
                                        n30 = ur1_02.c;
                                        nArray2 = ur1_02.b;
                                        et2_1.a(lArray3, n30);
                                        n29 = 0;
                                        n28 = -1;
                                        break;
                                    }
                                }
                                n4 = n18;
                                n19 = n17;
                                l2 = l12;
                                n17 = 0;
                                n10 = et2_1.e(ur1_02.c);
                                lArray = ur1_02.a;
                                nArray = ur1_02.b;
                                n26 = ur1_02.c;
                                ur1_02.e(n10);
                                lArray2 = ur1_02.a;
                                int[] nArray4 = ur1_02.b;
                                n16 = ur1_02.c;
                                break block20;
                            }
                            n7 = n18;
                            n10 = n17;
                            n32 = n21 + 8;
                            n15 = n15 + n32 & n16;
                            n30 = n20;
                            n7 = 1;
                            n26 = -862048943;
                        }
                        while (n29 != n30) {
                            long l22;
                            long l23;
                            int n34 = n29 >> 3;
                            long l24 = lArray3[n34];
                            int n35 = (n29 & 7) << 3;
                            long l25 = (l24 = l24 >> n35 & l8) - l3;
                            Object object = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                            if (object == false) {
                                int n36 = n29 + 1;
                                n28 = n29;
                                n29 = n36;
                                continue;
                            }
                            object = l24 == l16 ? 0 : (l24 < l16 ? -1 : 1);
                            if (object != false) {
                                n29 += n7;
                                continue;
                            }
                            int n37 = nArray2[n29];
                            int n38 = -862048943;
                            int n39 = (n37 *= n38) << 16;
                            n16 = (n37 ^= n39) >>> 7;
                            n15 = ur1_02.d(n16);
                            n39 = n15 - (n16 &= n30) & n30;
                            n7 = n39 / 8;
                            n16 = (n29 - n16 & n30) / n10;
                            long l26 = 0xFFFFFFFFFFFFFFL;
                            String string2 = "<this>";
                            if (n7 == n16) {
                                l3 = n37 & 0x7F;
                                l23 = lArray3[n34];
                                n4 = n18;
                                l22 = l8 << n35 ^ (long)-1;
                                l22 = l23 & l22;
                                lArray3[n34] = l22 |= (l3 <<= n35);
                                Intrinsics.checkNotNullParameter(lArray3, string2);
                                n10 = lArray3.length;
                                n7 = 1;
                                Object var66_60 = null;
                                lArray3[n10 -= n7] = l3 = lArray3[0] & l26 | l15;
                                n29 += n7;
                            } else {
                                long l27;
                                n4 = n18;
                                n7 = n15 >> 3;
                                l23 = lArray3[n7];
                                n18 = (n15 & 7) << 3;
                                l2 = l23 >> n18 & l8;
                                long l28 = 128L;
                                long l29 = l2 - l28;
                                n16 = (int)(l29 == 0L ? 0 : (l29 < 0L ? -1 : 1));
                                if (n16 == 0) {
                                    n16 = n37 & 0x7F;
                                    l2 = l12;
                                    l12 = n16;
                                    n27 = n17;
                                    l27 = l8 << n18 ^ (long)-1;
                                    l27 = l23 & l27;
                                    lArray3[n7] = l27 |= (l12 <<= n18);
                                    l22 = lArray3[n34];
                                    l27 = l8 << n35 ^ (long)-1;
                                    l22 &= l27;
                                    l27 = 128L;
                                    l12 = l27 << n35;
                                    lArray3[n34] = l22 |= l12;
                                    nArray2[n15] = n7 = nArray2[n29];
                                    n7 = 0;
                                    lArray = null;
                                    nArray2[n29] = 0;
                                    n28 = n29;
                                    n18 = -1;
                                } else {
                                    n27 = n17;
                                    l2 = l12;
                                    n17 = n37 & 0x7F;
                                    l27 = n17;
                                    l12 = l8 << n18 ^ (long)-1;
                                    l12 = l23 & l12;
                                    lArray3[n7] = l27 = l27 << n18 | l12;
                                    n7 = n28;
                                    n18 = -1;
                                    if (n28 == n18) {
                                        n17 = 1;
                                        n7 = n29 + 1;
                                        n28 = et2_1.b(lArray3, n7, n30);
                                    }
                                    nArray2[n28] = n7 = nArray2[n15];
                                    nArray2[n15] = n7 = nArray2[n29];
                                    nArray2[n29] = n7 = nArray2[n28];
                                    n29 += n18;
                                }
                                Intrinsics.checkNotNullParameter(lArray3, string2);
                                n10 = lArray3.length;
                                n7 = 1;
                                lArray3[n10 -= n7] = l3 = lArray3[0] & l26 | l15;
                                n29 += n7;
                                n18 = n4;
                                l12 = l2;
                                n17 = n27;
                            }
                            n10 = 8;
                            l3 = 128L;
                        }
                        n4 = n18;
                        n27 = n17;
                        l2 = l12;
                        n10 = et2_1.c(ur1_02.c);
                        n7 = ur1_02.d;
                        ur1_02.e = n10 -= n7;
                        n10 = n17;
                        n17 = 1;
                        break block24;
                    }
                    for (n15 = 0; n15 < n26; n15 += n17) {
                        n22 = n15 >> 3;
                        l12 = lArray[n22];
                        n24 = (n15 & 7) << 3;
                        l7 = 128L;
                        long l30 = (l12 = l12 >> n24 & l8) - l7;
                        Object object = l30 == 0L ? 0 : (l30 < 0L ? -1 : 1);
                        if (object < 0) {
                            n22 = nArray[n15];
                            n24 = n22 * -862048943;
                            int n41 = n24 << 16;
                            n24 ^= n41;
                            n41 = n24 >>> 7;
                            n41 = ur1_02.d(n41);
                            long l31 = n24 & 0x7F;
                            object = n41 >> 3;
                            n21 = (n41 & 7) << 3;
                            l14 = lArray2[object];
                            n20 = n16;
                            long l34 = l8 << n21 ^ (long)-1;
                            l34 = l14 & l34;
                            lArray2[object] = l34 |= (l31 <<= n21);
                            n25 = n41 + -7 & n16;
                            n24 = n16 & 7;
                            n25 = n25 + n24 >> 3;
                            lArray2[n25] = l34;
                            nArray4[n41] = n22;
                        } else {
                            n20 = n16;
                        }
                        n17 = 1;
                        n16 = n20;
                        n17 = 0;
                    }
                    n17 = 1;
                    n10 = n19;
                }
                n14 = n10 = ur1_02.d(n10);
            }
            ur1_02.d = n10 = ur1_02.d + n17;
            n10 = ur1_02.e;
            lArray = ur1_02.a;
            n18 = n14 >> 3;
            l4 = lArray[n18];
            n16 = (n14 & 7) << 3;
            l12 = l4 >> n16 & l8;
            l7 = 128L;
            n15 = (int)(l12 == l7 ? 0 : (l12 < l7 ? -1 : 1));
            n15 = n15 == 0 ? 1 : 0;
            ur1_02.e = n10 -= n15;
            n10 = ur1_02.c;
            long l35 = l8 << n16 ^ (long)-1;
            l4 &= l35;
            l3 = l2 << n16;
            lArray[n18] = l4 |= l3;
            n18 = n14 + -7 & n10;
            n10 = (n18 += (n10 &= 7)) >> 3;
            lArray[n10] = l4;
        }
        int[] nArray = ur1_02.b;
        nArray[n14] = n8;
        n8 = ur1_02.d;
        n7 = n4;
        if (n8 == n4) return 0 != 0;
        return 1 != 0;
    }

    public final void c() {
        int n3;
        int n4 = 0;
        this.d = 0;
        long[] lArray = this.a;
        long[] lArray2 = et2_1.a;
        if (lArray != lArray2) {
            rp_1.q(lArray);
            lArray = this.a;
            n3 = this.c;
            int n7 = n3 >> 3;
            n3 = (n3 & 7) << 3;
            long l2 = lArray[n7];
            long l3 = 255L << n3;
            long l4 = l3 ^ (long)-1;
            lArray[n7] = l2 = l2 & l4 | l3;
        }
        n4 = et2_1.c(this.c);
        n3 = this.d;
        this.e = n4 -= n3;
    }

    public final int d(int n3) {
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

    public final void e(int n3) {
        long l2;
        long[] lArray;
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
        nArray = new int[n3];
        this.b = nArray;
    }

    public final void f(int n3) {
        long l2;
        int n4;
        this.d = n4 = this.d + -1;
        long[] lArray = this.a;
        int n7 = this.c;
        int n8 = n3 >> 3;
        int n10 = (n3 & 7) << 3;
        long l3 = lArray[n8];
        long l4 = 255L << n10 ^ (long)-1;
        l3 &= l4;
        l4 = 254L << n10;
        lArray[n8] = l2 = l3 | l4;
        n3 = n3 + -7 & n7;
        n3 = n3 + (n7 &= 7) >> 3;
        lArray[n3] = l2;
    }
}

