/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class IR1
extends n62 {
    public int f;

    public IR1(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.d(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public final int c(int n3) {
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

    public final void d(int n3) {
        long l2;
        Object[] objectArray;
        long[] lArray;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            lArray = null;
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
        objectArray = new Object[n3];
        this.b = objectArray;
        lArray = new long[n3];
        this.c = lArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e(long l2, Object object) {
        int n3;
        block25: {
            long l3;
            long l4;
            void var4_4;
            long l7;
            int n4;
            int n7;
            long l8;
            long l12;
            long l14;
            int n8;
            int n10;
            int n14;
            block26: {
                block31: {
                    void var12_32;
                    long[] lArray;
                    long[] lArray2;
                    long[] lArray3;
                    int n15;
                    int n16;
                    long l15;
                    Object object2;
                    int n17;
                    int n18;
                    int n19;
                    long[] lArray4;
                    int n20;
                    IR1 iR1;
                    block27: {
                        int n21;
                        void var12_30;
                        long[] lArray5;
                        Object[] objectArray;
                        long[] lArray6;
                        long l16;
                        long l17;
                        long l18;
                        long l19;
                        long l20;
                        iR1 = this;
                        Object object3 = object;
                        n14 = 1;
                        int n22 = object.hashCode();
                        n10 = -862048943;
                        n20 = (n22 *= n10) << 16;
                        n22 ^= n20;
                        n20 = n22 >>> 7;
                        n22 &= 0x7F;
                        int n24 = this.d;
                        n8 = n20 & n24;
                        boolean bl2 = false;
                        while (true) {
                            Object object4;
                            block28: {
                                long l21;
                                block30: {
                                    block29: {
                                        long l22;
                                        lArray4 = iR1.a;
                                        n19 = n8 >> 3;
                                        n18 = (n8 & 7) << 3;
                                        long l23 = lArray4[n19] >>> n18;
                                        long l24 = lArray4[n19 += n14];
                                        n17 = 64 - n18;
                                        l14 = l24 << n17;
                                        object2 = object4;
                                        l12 = -((long)n18);
                                        n18 = 63;
                                        l12 = l12 >> n18 & l14 | l23;
                                        l14 = n22;
                                        l8 = 0x101010101010101L;
                                        l20 = l14 * l8;
                                        l15 = l12 ^ l20;
                                        l8 = l15 - l8;
                                        l15 = (l15 ^ (long)-1) & l8;
                                        l8 = -9187201950435737472L;
                                        l15 &= l8;
                                        while ((l19 = (l22 = l15 - (l20 = 0L)) == 0L ? 0 : (l22 < 0L ? -1 : 1)) != false) {
                                            void var5_11;
                                            int n25 = Long.numberOfTrailingZeros(l15) >> 3;
                                            Object object5 = iR1.b[n25 = n8 + n25 & n24];
                                            n7 = (int)(Intrinsics.areEqual(object5, var5_11) ? 1 : 0);
                                            if (n7 != 0) {
                                                n3 = n25;
                                                break block25;
                                            }
                                            l20 = l15 - 1L;
                                            l15 &= l20;
                                        }
                                        l15 = l12 ^ (long)-1;
                                        n7 = 6;
                                        l15 = l15 << n7 & l12 & l8;
                                        n16 = 8;
                                        object4 = l15 == l20 ? 0 : (l15 < l20 ? -1 : 1);
                                        if (object4 == false) break block28;
                                        n4 = iR1.c(n20);
                                        n14 = iR1.f;
                                        l18 = 128L;
                                        l8 = 255L;
                                        if (n14 != 0) break block29;
                                        long[] lArray7 = iR1.a;
                                        n22 = n4 >> 3;
                                        l17 = lArray7[n22];
                                        n14 = (n4 & 7) << 3;
                                        l21 = l17 >> n14 & l8;
                                        long l25 = l21 - (l17 = 254L);
                                        Object object6 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                                        if (object6 != false) break block30;
                                    }
                                    l7 = l14;
                                    n14 = 1;
                                    break block26;
                                }
                                n4 = iR1.d;
                                if (n4 > n16) {
                                    n14 = iR1.e;
                                    l21 = n14;
                                    long l26 = 32;
                                    l12 = (long)n4 * (long)25;
                                    l16 = Long.MIN_VALUE;
                                    l15 = (l21 *= l26) ^ l16;
                                    n4 = Long.compare(l15, l12 ^= l16);
                                    if (n4 <= 0) {
                                        lArray6 = iR1.a;
                                        n14 = iR1.d;
                                        objectArray = iR1.b;
                                        lArray5 = iR1.c;
                                        et2_1.a(lArray6, n14);
                                        boolean bl3 = false;
                                        n7 = -1;
                                        break;
                                    }
                                }
                                n15 = n20;
                                l7 = l14;
                                n20 = 0;
                                n3 = et2_1.e(iR1.d);
                                lArray3 = iR1.a;
                                Object[] objectArray2 = iR1.b;
                                lArray2 = iR1.c;
                                n10 = iR1.d;
                                iR1.d(n3);
                                lArray = iR1.a;
                                Object[] objectArray3 = iR1.b;
                                long[] lArray8 = iR1.c;
                                n16 = iR1.d;
                                boolean bl4 = false;
                                break block27;
                            }
                            n4 = n20;
                            n3 = -1;
                            n14 = 1;
                            n7 = -862048943;
                            object4 = object2 + 8;
                            n8 = n8 + object4 & n24;
                            Object object7 = object;
                            n10 = -862048943;
                        }
                        while (var12_30 != n14) {
                            long l27;
                            int n26;
                            object2 = var12_30 >> 3;
                            long l28 = lArray6[object2];
                            int n27 = (var12_30 & 7) << 3;
                            long l29 = (l28 = l28 >> n27 & l8) - l18;
                            Object object8 = l29 == 0L ? 0 : (l29 < 0L ? -1 : 1);
                            if (object8 == false) {
                                void var59_73 = var12_30 + true;
                                n7 = var12_30;
                                var12_30 = var59_73;
                                continue;
                            }
                            object8 = l28 == l17 ? 0 : (l28 < l17 ? -1 : 1);
                            if (object8 != false) {
                                ++var12_30;
                                continue;
                            }
                            Object object9 = objectArray[var12_30];
                            if (object9 != null) {
                                n26 = object9.hashCode();
                            } else {
                                n26 = 0;
                                object9 = null;
                            }
                            int n28 = (n26 *= n10) << 16;
                            n10 = (n26 ^= n28) >>> 7;
                            object8 = var4_4.c(n10);
                            int n29 = object8 - (n10 &= n14) & n14;
                            n24 = n29 / 8;
                            n10 = (var12_30 - n10 & n14) / 8;
                            long l30 = 0xFFFFFFFFFFFFFFL;
                            String string2 = "<this>";
                            if (n24 == n10) {
                                n10 = n26 & 0x7F;
                                l7 = l14;
                                l14 = n10;
                                long l31 = lArray6[object2];
                                n21 = n20;
                                l27 = l8 << n27 ^ (long)-1;
                                l27 = l31 & l27;
                                lArray6[object2] = l27 |= (l14 <<= n27);
                                Intrinsics.checkNotNullParameter(lArray6, string2);
                                n10 = lArray6.length;
                                n20 = 1;
                                n24 = 0;
                                Object var72_85 = null;
                                l14 = lArray6[0];
                                lArray6[n10 -= n20] = l18 = l14 & l30 | l16;
                                var12_30 += n20;
                            } else {
                                void var4_8;
                                int n30;
                                long[] lArray9;
                                String string3;
                                long l34;
                                n21 = n20;
                                l7 = l14;
                                n10 = (int)(object8 >> 3);
                                l4 = lArray6[n10];
                                n17 = (object8 & 7) << 3;
                                long l35 = l4 >> n17 & l8;
                                long l36 = 128L;
                                long l37 = l35 - l36;
                                n19 = (int)(l37 == 0L ? 0 : (l37 < 0L ? -1 : 1));
                                if (n19 == 0) {
                                    Object object10;
                                    n19 = n26 & 0x7F;
                                    l34 = n19;
                                    string3 = string2;
                                    lArray9 = lArray5;
                                    l3 = l8 << n17 ^ (long)-1;
                                    lArray6[n10] = l34 = l34 << n17 | (l4 &= l3);
                                    l34 = lArray6[object2];
                                    l27 = l8 << n27 ^ (long)-1;
                                    l34 &= l27;
                                    l27 = 128L;
                                    l18 = l27 << n27;
                                    lArray6[object2] = l34 |= l18;
                                    objectArray[object8] = object10 = objectArray[var12_30];
                                    n30 = 0;
                                    objectArray[var12_30] = null;
                                    lArray5[object8] = l34 = lArray5[var12_30];
                                    lArray5[var12_30] = l20;
                                    n7 = var12_30;
                                    String string4 = string2;
                                    n3 = -1;
                                } else {
                                    Object object11;
                                    Object object12;
                                    Object object13;
                                    string3 = string2;
                                    lArray9 = lArray5;
                                    l34 = n26 & 0x7F;
                                    l3 = l8 << n17 ^ (long)-1;
                                    lArray6[n10] = l34 = l34 << n17 | (l4 &= l3);
                                    n30 = -1;
                                    if (n7 == n30) {
                                        n3 = var12_30 + true;
                                        n30 = et2_1.b(lArray6, n3, n14);
                                    } else {
                                        l19 = n7;
                                        n30 = n7;
                                    }
                                    objectArray[n30] = object13 = objectArray[object8];
                                    objectArray[object8] = object12 = objectArray[var12_30];
                                    objectArray[var12_30] = object11 = objectArray[n30];
                                    lArray9[n30] = l27 = lArray9[object8];
                                    lArray9[object8] = l27 = lArray9[var12_30];
                                    lArray9[var12_30] = l27 = lArray9[n30];
                                    n3 = -1;
                                    var12_30 += n3;
                                    n7 = n30;
                                    String string5 = string3;
                                }
                                Intrinsics.checkNotNullParameter(lArray6, (String)var4_8);
                                n30 = lArray6.length;
                                n10 = 1;
                                n20 = 0;
                                lArray6[n30 -= n10] = l18 = lArray6[0] & l30 | l16;
                                var12_30 += n10;
                                IR1 iR12 = this;
                                Object object14 = object;
                                lArray5 = lArray9;
                            }
                            l14 = l7;
                            n20 = n21;
                            n10 = -862048943;
                            l18 = 128L;
                        }
                        n21 = n20;
                        l7 = l14;
                        n20 = 0;
                        n3 = et2_1.c(var4_4.d);
                        n4 = var4_4.e;
                        var4_4.f = n3 -= n4;
                        n4 = n21;
                        n14 = 1;
                        break block31;
                    }
                    while (var12_32 < n10) {
                        void var93_101;
                        long[] lArray10;
                        void var41_55;
                        n17 = var12_32 >> 3;
                        l14 = lArray3[n17];
                        n7 = (var12_32 & 7) << 3;
                        long l38 = 128L;
                        long l39 = (l14 = l14 >> n7 & l8) - l38;
                        object2 = l39 == 0L ? 0 : (l39 < 0L ? -1 : 1);
                        if (object2 < 0) {
                            lArray4 = var41_55[var12_32];
                            if (lArray4 != null) {
                                n19 = lArray4.hashCode();
                            } else {
                                n19 = 0;
                                Object var82_93 = null;
                            }
                            n7 = -862048943;
                            int n32 = (n19 *= n7) << 16;
                            n20 = (n19 ^= n32) >>> 7;
                            n20 = iR1.c(n20);
                            l8 = n19 & 0x7F;
                            n19 = n20 >> 3;
                            int n34 = (n20 & 7) << 3;
                            long l41 = lArray[n19];
                            lArray10 = lArray3;
                            void var93_102 = var41_55;
                            long l42 = 255L;
                            l15 = l42 << n34 ^ (long)-1;
                            l15 = l41 & l15;
                            lArray[n19] = l15 |= (l8 <<= n34);
                            n19 = n20 + -7 & n16;
                            n18 = n16 & 7;
                            n19 = n19 + n18 >> 3;
                            lArray[n19] = l15;
                            objectArray3[n20] = lArray4;
                            lArray8[n20] = l15 = lArray2[var12_32];
                        } else {
                            lArray10 = lArray3;
                            void var93_103 = var41_55;
                            n7 = -862048943;
                        }
                        n14 = 1;
                        var12_32 += n14;
                        lArray3 = lArray10;
                        void var41_56 = var93_101;
                        n20 = 0;
                        l8 = 255L;
                    }
                    n14 = 1;
                    n4 = n15;
                }
                n4 = var4_4.c(n4);
            }
            var4_4.e = n3 = var4_4.e + n14;
            n3 = var4_4.f;
            long[] lArray = var4_4.a;
            n10 = n4 >> 3;
            l4 = lArray[n10];
            n8 = (n4 & 7) << 3;
            l12 = l4 >> n8;
            l14 = 255L;
            l8 = 128L;
            long l43 = (l12 &= l14) - l8;
            n7 = (int)(l43 == 0L ? 0 : (l43 < 0L ? -1 : 1));
            if (n7 != 0) {
                n14 = 0;
                Object var41_57 = null;
            }
            var4_4.f = n3 -= n14;
            n3 = var4_4.d;
            l12 = l14 << n8 ^ (long)-1;
            l4 &= l12;
            l3 = l7 << n8;
            lArray[n10] = l4 |= l3;
            n14 = n4 + -7 & n3;
            n3 = (n14 += (n3 &= 7)) >> 3;
            lArray[n3] = l4;
            n3 = ~n4;
        }
        if (n3 < 0) {
            n3 ^= 0xFFFFFFFF;
        }
        var4_4.b[n3] = object;
        var4_4.c[n3] = l2;
    }
}

