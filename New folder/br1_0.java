/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BR1
 */
public final class br1_0
extends eB1 {
    public int f;

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
        long[] lArray;
        Object[] objectArray;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            objectArray = null;
        }
        this.d = n3;
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
        n4 = et2_1.c(this.d);
        n7 = this.e;
        this.f = n4 -= n7;
        lArray = new long[n3];
        this.b = lArray;
        objectArray = new Object[n3];
        this.c = objectArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e(long l2, hr1_0 hr1_02) {
        block18: {
            long l3;
            Object object;
            int n3;
            long l4;
            int n4;
            int n7;
            long l7;
            long l8;
            long l12;
            int n8;
            int n10;
            int n14;
            int n15;
            Object object2;
            block19: {
                block24: {
                    void var14_16;
                    int n16;
                    long[] lArray;
                    Object[] objectArray;
                    long[] lArray2;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    long l14;
                    int n21;
                    int n22;
                    int n24;
                    block20: {
                        int n25;
                        int n26;
                        int n27;
                        long[] lArray3;
                        long[] lArray4;
                        long l15;
                        long l16;
                        long l17;
                        long l18;
                        int n28;
                        long l19;
                        object2 = this;
                        n15 = 1;
                        n14 = 32;
                        long l20 = l2 >>> n14;
                        l20 = l2 ^ l20;
                        n10 = (int)l20;
                        int n29 = -862048943;
                        n24 = (n10 *= n29) << 16;
                        n10 ^= n24;
                        n24 = n10 >>> 7;
                        n10 &= 0x7F;
                        n22 = this.d;
                        n8 = n24 & n22;
                        boolean bl2 = false;
                        Object[] objectArray2 = null;
                        while (true) {
                            Object object3;
                            block21: {
                                long[] lArray5;
                                block23: {
                                    block22: {
                                        long l21;
                                        long l22;
                                        long[] lArray6 = ((eB1)object2).a;
                                        int n30 = n8 >> 3;
                                        n21 = (n8 & 7) << 3;
                                        long l23 = lArray6[n30] >>> n21;
                                        l14 = lArray6[n30 += n15];
                                        n20 = 64 - n21;
                                        l12 = l14 << n20;
                                        n19 = object3;
                                        l8 = -((long)n21);
                                        n21 = 63;
                                        l8 = l8 >> n21 & l12 | l23;
                                        l12 = n10;
                                        l7 = 0x101010101010101L;
                                        l19 = l12 * l7;
                                        n28 = n10;
                                        l20 = l8 ^ l19;
                                        l7 = l20 - l7;
                                        l20 = (l20 ^ (long)-1) & l7;
                                        l7 = -9187201950435737472L;
                                        l20 &= l7;
                                        while ((l18 = (l22 = l20 - (l19 = 0L)) == 0L ? 0 : (l22 < 0L ? -1 : 1)) != false) {
                                            n7 = Long.numberOfTrailingZeros(l20) >> 3;
                                            lArray5 = ((eB1)object2).b;
                                            l21 = lArray5[n7 = n8 + n7 & n22];
                                            long l24 = l21 - l2;
                                            n4 = (int)(l24 == 0L ? 0 : (l24 < 0L ? -1 : 1));
                                            if (n4 != 0) {
                                                l19 = l20 - 1L;
                                                l20 &= l19;
                                                continue;
                                            }
                                            break block18;
                                        }
                                        l20 = l8 ^ (long)-1;
                                        n4 = 6;
                                        l20 = l20 << n4 & l8 & l7;
                                        n18 = 8;
                                        object3 = l20 == l19 ? 0 : (l20 < l19 ? -1 : 1);
                                        if (object3 == false) break block21;
                                        n29 = ((br1_0)object2).c(n24);
                                        n10 = ((br1_0)object2).f;
                                        l17 = 128L;
                                        l7 = 255L;
                                        if (n10 != 0) break block22;
                                        long[] lArray7 = ((eB1)object2).a;
                                        int n32 = n29 >> 3;
                                        l21 = lArray7[n32];
                                        n10 = (n29 & 7) << 3;
                                        l16 = 254L;
                                        long l25 = (l21 = l21 >> n10 & l7) - l16;
                                        if ((n10 = (int)(l25 == 0L ? 0 : (l25 < 0L ? -1 : 1))) != 0) break block23;
                                    }
                                    l4 = l12;
                                    n3 = n29;
                                    break block19;
                                }
                                n29 = ((eB1)object2).d;
                                if (n29 > n18) {
                                    n10 = ((eB1)object2).e;
                                    l8 = n10;
                                    Mt3$a mt3$a = mt3_0.b;
                                    l8 *= (long)32;
                                    l20 = (long)n29 * (long)25;
                                    l15 = Long.MIN_VALUE;
                                    n29 = Long.compare(l8 ^= l15, l20 ^= l15);
                                    if (n29 <= 0) {
                                        lArray4 = ((eB1)object2).a;
                                        n10 = ((eB1)object2).d;
                                        lArray3 = ((eB1)object2).b;
                                        objectArray2 = ((eB1)object2).c;
                                        et2_1.a(lArray4, n10);
                                        n4 = 0;
                                        lArray5 = null;
                                        n27 = -1;
                                        break;
                                    }
                                }
                                object = object2;
                                n17 = n24;
                                l4 = l12;
                                n24 = 0;
                                int n34 = et2_1.e(((eB1)object2).d);
                                long[] lArray8 = ((eB1)object2).a;
                                lArray2 = ((eB1)object2).b;
                                objectArray = ((eB1)object2).c;
                                n10 = ((eB1)object2).d;
                                ((br1_0)object2).d(n34);
                                object2 = ((eB1)object2).a;
                                lArray = ((eB1)object).b;
                                Object[] objectArray3 = ((eB1)object).c;
                                n18 = ((eB1)object).d;
                                boolean bl3 = false;
                                objectArray2 = null;
                                break block20;
                            }
                            n14 = n24;
                            n3 = -1;
                            n16 = 32;
                            object3 = n19 + 8;
                            n8 = n8 + object3 & n22;
                            n10 = n28;
                            n14 = 32;
                            n29 = -862048943;
                        }
                        while (n4 != n10) {
                            long l26;
                            long l27;
                            String string2;
                            String string3;
                            long l28;
                            long l29;
                            n19 = n4 >> 3;
                            long l30 = lArray4[n19];
                            n28 = (n4 & 7) << 3;
                            long l31 = (l30 = l30 >> n28 & l7) - l17;
                            Object object4 = l31 == 0L ? 0 : (l31 < 0L ? -1 : 1);
                            if (object4 == false) {
                                n19 = n4 + 1;
                                n27 = n4;
                                n4 = n19;
                                continue;
                            }
                            object4 = l30 == l16 ? 0 : (l30 < l16 ? -1 : 1);
                            if (object4 != false) {
                                n4 += n15;
                                continue;
                            }
                            l30 = lArray3[n4];
                            long l34 = l30 >>> n14;
                            l17 = l30 ^ l34;
                            n8 = (int)l17 * -862048943;
                            n22 = n4;
                            l18 = n8 << 16;
                            n4 = (n8 ^= l18) >>> 7;
                            object4 = ((br1_0)object2).c(n4);
                            int n35 = object4 - (n4 &= n10) & n10;
                            int n36 = 8;
                            n14 = n35 / 8;
                            n4 = (n22 - n4 & n10) / 8;
                            l34 = 0xFFFFFFFFFFFFFFL;
                            String string4 = "<this>";
                            if (n14 == n4) {
                                l29 = n8 & 0x7F;
                                l28 = lArray4[n19];
                                l4 = l12;
                                l12 = l7 << n28 ^ (long)-1;
                                l12 = l28 & l12;
                                lArray4[n19] = l29 = l29 << n28 | l12;
                                Intrinsics.checkNotNullParameter(lArray4, string4);
                                n3 = lArray4.length;
                                n15 = 1;
                                string3 = null;
                                lArray4[n3 -= n15] = l12 = lArray4[0] & l34 | l15;
                                n4 = n3 = n22 + 1;
                                l12 = l4;
                                n14 = 32;
                                l17 = 128L;
                                continue;
                            }
                            l4 = l12;
                            n15 = (int)(object4 >> 3);
                            l12 = lArray4[n15];
                            n14 = (object4 & 7) << 3;
                            l28 = l12 >> n14 & l7;
                            long l35 = 128L;
                            long l36 = l28 - l35;
                            Object object5 = l36 == 0L ? 0 : (l36 < 0L ? -1 : 1);
                            if (object5 == false) {
                                string2 = string4;
                                l27 = n8 &= 0x7F;
                                object5 = n10;
                                n26 = n24;
                                l26 = (l7 << n14 ^ (long)-1) & l12;
                                lArray4[n15] = l27 = l27 << n14 | l26;
                                l27 = lArray4[n19];
                                l29 = l7 << n28 ^ (long)-1;
                                l27 &= l29;
                                l29 = 128L;
                                l26 = l29 << n28;
                                lArray4[n19] = l27 |= l26;
                                lArray3[object4] = l27 = lArray3[n22];
                                lArray3[n22] = l19;
                                objectArray2[object4] = object2 = objectArray2[n22];
                                object2 = null;
                                objectArray2[n22] = null;
                                n15 = n22;
                                n27 = n22;
                                string3 = string4;
                                n25 = n10;
                                n3 = -1;
                            } else {
                                Object object6;
                                Object object7;
                                Object object8;
                                long l37;
                                string2 = string4;
                                object5 = n10;
                                n26 = n24;
                                l27 = n8 & 0x7F;
                                l26 = (l7 << n14 ^ (long)-1) & l12;
                                lArray4[n15] = l27 = l27 << n14 | l26;
                                n3 = n27;
                                n25 = -1;
                                if (n27 == n25) {
                                    n3 = n22 + 1;
                                    n25 = n10;
                                    n27 = et2_1.b(lArray4, n3, n10);
                                } else {
                                    n25 = n10;
                                }
                                lArray3[n27] = l37 = lArray3[object4];
                                lArray3[object4] = l37 = lArray3[n22];
                                lArray3[n22] = l37 = lArray3[n27];
                                objectArray2[n27] = object8 = objectArray2[object4];
                                objectArray2[object4] = object7 = objectArray2[n22];
                                objectArray2[n22] = object6 = objectArray2[n27];
                                n3 = -1;
                                n15 = n22 + -1;
                                string3 = string2;
                            }
                            Intrinsics.checkNotNullParameter(lArray4, string3);
                            n14 = lArray4.length;
                            n10 = 1;
                            lArray4[n14 -= n10] = l17 = lArray4[0] & l34 | l15;
                            n15 += n10;
                            n14 = 32;
                            l17 = 128L;
                            n10 = n25;
                            n4 = n15;
                            n24 = n26;
                            l12 = l4;
                            n15 = 1;
                            object2 = this;
                        }
                        object = object2;
                        n26 = n24;
                        l4 = l12;
                        n24 = 0;
                        n25 = et2_1.c(((eB1)object2).d);
                        n3 = ((eB1)object2).e;
                        ((br1_0)object2).f = n25 -= n3;
                        n14 = n26;
                        n15 = 1;
                        break block24;
                    }
                    while (var14_16 < n10) {
                        void var90_89;
                        long[] lArray9;
                        void var60_63;
                        n20 = var14_16 >> 3;
                        l12 = var60_63[n20];
                        n16 = (var14_16 & 7) << 3;
                        l14 = 128L;
                        long l38 = (l12 = l12 >> n16 & l7) - l14;
                        n7 = (int)(l38 == 0L ? 0 : (l38 < 0L ? -1 : 1));
                        if (n7 < 0) {
                            Object object9;
                            l12 = lArray2[var14_16];
                            n16 = 32;
                            long l39 = l12 >>> n16;
                            lArray9 = lArray;
                            l3 = l12 ^ l39;
                            n22 = (int)l3 * -862048943;
                            n19 = n22 << 16;
                            n24 = (n22 ^= n19) >>> 7;
                            n24 = ((br1_0)object).c(n24);
                            l7 = n22 & 0x7F;
                            n22 = n24 >> 3;
                            int n37 = (n24 & 7) << 3;
                            Object object10 = object2[n22];
                            var90_89 = var60_63;
                            l39 = 255L;
                            long l41 = l39 << n37 ^ (long)-1;
                            l41 = (long)(object10 & l41);
                            object2[n22] = l41 |= (l7 <<= n37);
                            n22 = n24 + -7 & n18;
                            n21 = n18 & 7;
                            n22 = n22 + n21 >> 3;
                            object2[n22] = l41;
                            lArray[n24] = l12;
                            objectArray3[n24] = object9 = objectArray[var14_16];
                        } else {
                            var90_89 = var60_63;
                            lArray9 = lArray;
                            n16 = 32;
                        }
                        n15 = 1;
                        var14_16 += n15;
                        lArray = lArray9;
                        void var60_66 = var90_89;
                        n24 = 0;
                        l7 = 255L;
                        object = this;
                    }
                    n15 = 1;
                    object2 = this;
                    n14 = n17;
                }
                n3 = ((br1_0)object2).c(n14);
            }
            ((eB1)object2).e = n14 = ((eB1)object2).e + n15;
            n14 = ((br1_0)object2).f;
            long[] lArray = ((eB1)object2).a;
            n10 = n3 >> 3;
            l3 = lArray[n10];
            n8 = (n3 & 7) << 3;
            l8 = l3 >> n8;
            l12 = 255L;
            l7 = 128L;
            long l42 = (l8 &= l12) - l7;
            n4 = (int)(l42 == 0L ? 0 : (l42 < 0L ? -1 : 1));
            if (n4 != 0) {
                n15 = 0;
                object = null;
            }
            ((br1_0)object2).f = n14 -= n15;
            n15 = ((eB1)object2).d;
            l8 = l12 << n8 ^ (long)-1;
            l3 &= l8;
            long l43 = l4 << n8;
            lArray[n10] = l3 |= l43;
            n14 = n3 + -7 & n15;
            n15 = (n14 += (n15 &= 7)) >> 3;
            lArray[n15] = l3;
            n7 = n3;
        }
        ((eB1)object2).b[n7] = l2;
        ((eB1)object2).c[n7] = hr1_02;
    }
}

