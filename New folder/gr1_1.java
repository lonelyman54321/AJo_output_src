/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GR1
 */
public final class gr1_1
extends i62 {
    public int f;

    public gr1_1() {
        this(null);
    }

    public gr1_1(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.f(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public /* synthetic */ gr1_1(Object object) {
        this(6);
    }

    public final int d(int n3) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int e(Object object) {
        long l2;
        long l3;
        long l4;
        Object object2;
        int n3;
        int n4;
        long l7;
        long l8;
        int n7;
        int n8;
        int n10;
        gr1_1 gr1_12;
        block23: {
            int n14;
            block28: {
                int[] nArray;
                int n15;
                long l12;
                long l14;
                long l15;
                int n16;
                int n17;
                long[] lArray;
                Object object3;
                int n18;
                int n19;
                Object object4;
                block24: {
                    int n20;
                    int[] nArray2;
                    long l16;
                    Object object5;
                    long l17;
                    int n21;
                    gr1_12 = this;
                    object4 = object;
                    n10 = 1;
                    n8 = object != null ? object.hashCode() : 0;
                    int n22 = -862048943;
                    int n24 = (n8 *= n22) << 16;
                    n8 ^= n24;
                    n24 = n8 >>> 7;
                    n8 &= 0x7F;
                    n7 = gr1_12.d;
                    n19 = n24 & n7;
                    n18 = 0;
                    object3 = null;
                    while (true) {
                        block25: {
                            long l18;
                            block27: {
                                block26: {
                                    int n25;
                                    long l19;
                                    lArray = gr1_12.a;
                                    n17 = n19 >> 3;
                                    int n26 = (n19 & 7) << 3;
                                    long l20 = lArray[n17] >>> n26;
                                    long l21 = lArray[n17 += n10];
                                    n16 = 64 - n26;
                                    l8 = l21 << n16;
                                    l15 = -((long)n26);
                                    n26 = 63;
                                    l15 = l15 >> n26 & l8 | l20;
                                    l8 = n8;
                                    l7 = 0x101010101010101L;
                                    l14 = l8 * l7;
                                    n21 = n8;
                                    l18 = l15 ^ l14;
                                    l7 = l18 - l7;
                                    l18 = (l18 ^ (long)-1) & l7;
                                    l7 = -9187201950435737472L;
                                    l18 &= l7;
                                    while ((l17 = (l19 = l18 - (l14 = 0L)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) != false) {
                                        int n27 = Long.numberOfTrailingZeros(l18) >> 3;
                                        object5 = gr1_12.b[n27 = n19 + n27 & n7];
                                        n25 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0);
                                        if (n25 != 0) {
                                            return n27;
                                        }
                                        l14 = l18 - 1L;
                                        l18 &= l14;
                                    }
                                    l18 = l15 ^ (long)-1;
                                    n25 = 6;
                                    l15 = l15 & (l18 <<= n25) & l7;
                                    n14 = 8;
                                    n8 = (int)(l15 == l14 ? 0 : (l15 < l14 ? -1 : 1));
                                    if (n8 == 0) break block25;
                                    n4 = gr1_12.d(n24);
                                    n3 = gr1_12.f;
                                    object2 = 128L;
                                    l7 = 255L;
                                    if (n3 != 0) break block26;
                                    long[] lArray2 = gr1_12.a;
                                    n10 = n4 >> 3;
                                    l14 = lArray2[n10];
                                    n3 = (n4 & 7) << 3;
                                    l15 = l14 >> n3 & l7;
                                    long l22 = l15 - (l14 = 254L);
                                    n8 = (int)(l22 == 0L ? 0 : (l22 < 0L ? -1 : 1));
                                    if (n8 != 0) break block27;
                                }
                                l4 = l8;
                                n3 = 1;
                                l17 = 0;
                                break block23;
                            }
                            n4 = gr1_12.d;
                            if (n4 > n14) {
                                n3 = gr1_12.e;
                                l15 = n3;
                                l12 = 32;
                                l16 = Long.MIN_VALUE;
                                long l23 = (l15 *= l12) ^ l16;
                                l18 = (long)n4 * (long)25;
                                long l24 = l18 ^ l16;
                                if ((n4 = Long.compare(l23, l24)) <= 0) {
                                    object4 = gr1_12.a;
                                    n3 = gr1_12.d;
                                    Object[] objectArray = gr1_12.b;
                                    nArray2 = gr1_12.c;
                                    et2_1.a((long[])object4, n3);
                                    n8 = 0;
                                    n18 = -1;
                                    break;
                                }
                            }
                            n15 = n24;
                            l4 = l8;
                            l17 = 0;
                            n4 = et2_1.e(gr1_12.d);
                            long[] lArray3 = gr1_12.a;
                            Object[] objectArray = gr1_12.b;
                            nArray = gr1_12.c;
                            n8 = gr1_12.d;
                            gr1_12.f(n4);
                            object4 = gr1_12.a;
                            Object[] objectArray2 = gr1_12.b;
                            int[] nArray3 = gr1_12.c;
                            n7 = gr1_12.d;
                            break block24;
                        }
                        n14 = n24;
                        n3 = 1;
                        l17 = 0;
                        n19 = n19 + (n18 += 8) & n7;
                        n8 = n21;
                        n10 = 1;
                        n22 = -862048943;
                    }
                    while (n8 != n3) {
                        void var51_50;
                        n21 = n8 >> 3;
                        reference var53_63 = object4[n21];
                        int n28 = (n8 & 7) << 3;
                        reference cfr_temp_2 = (var53_63 = var53_63 >> n28 & l7) - object2;
                        Object object6 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        if (object6 == false) {
                            object6 = true;
                            int n29 = n8 + 1;
                            n18 = n8;
                            n8 = n29;
                            continue;
                        }
                        object6 = true;
                        Object object7 = var53_63 == l14 ? 0 : (var53_63 < l14 ? -1 : 1);
                        if (object7 != false) {
                            n8 += object6;
                            continue;
                        }
                        object5 = var51_50[n8];
                        if (object5 != null) {
                            object6 = object5.hashCode();
                        } else {
                            object6 = false;
                            object5 = null;
                        }
                        Object object8 = (object6 *= n22) << 16;
                        object8 = object6 ^ object8;
                        object6 = object8 >>> 7;
                        int n30 = gr1_12.d((int)object6);
                        object6 = object6 & n3;
                        n20 = n30 - object6 & n3;
                        n22 = n20 / 8;
                        object6 = (n8 - object6 & n3) / 8;
                        long l25 = 0xFFFFFFFFFFFFFFL;
                        String string2 = "<this>";
                        if (n22 == object6) {
                            n22 = object8 & 0x7F;
                            l4 = l8;
                            l8 = n22;
                            var53_63 = object4[n21];
                            n20 = n24;
                            l3 = l7 << n28 ^ (long)-1;
                            l3 = (long)(var53_63 & l3);
                            object4[n21] = l3 |= (l8 <<= n28);
                            Intrinsics.checkNotNullParameter(object4, string2);
                            n22 = ((Object)object4).length;
                            n24 = 1;
                            n7 = 0;
                            string2 = null;
                            object2 = object4[0] & l25 | l16;
                            object4[n22 -= n24] = object2;
                            n8 += n24;
                            n24 = n20;
                            l8 = l4;
                        } else {
                            Object object9;
                            void var72_77;
                            n20 = n24;
                            l4 = l8;
                            n22 = n30 >> 3;
                            l8 = (long)object4[n22];
                            n24 = (n30 & 7) << 3;
                            long l26 = l8 >> n24 & l7;
                            long l27 = 128L;
                            long l28 = l26 - l27;
                            n19 = (int)(l28 == 0L ? 0 : (l28 < 0L ? -1 : 1));
                            if (n19 == 0) {
                                void var40_38;
                                n19 = object8 & 0x7F;
                                l2 = n19;
                                l17 = n3;
                                var72_77 = var51_50;
                                l15 = (l7 << n24 ^ (long)-1) & l8;
                                object4[n22] = l15 |= (l2 <<= n24);
                                l15 = (long)object4[n21];
                                l3 = l7 << n28 ^ (long)-1;
                                l15 &= l3;
                                l3 = 128L;
                                l2 = l3 << n28;
                                object4[n21] = l15 |= l2;
                                var51_50[n30] = var40_38 = var51_50[n8];
                                var51_50[n8] = null;
                                nArray2[n30] = n3 = nArray2[n8];
                                Object var40_39 = null;
                                nArray2[n8] = 0;
                                n18 = n8;
                                object9 = string2;
                                n3 = (int)l17;
                                n10 = -1;
                            } else {
                                void var51_53;
                                void var51_52;
                                void var51_51;
                                l17 = n3;
                                var72_77 = var51_50;
                                l15 = object8 & 0x7F;
                                object = string2;
                                object2 = (l7 << n24 ^ (long)-1) & l8;
                                l15 = l15 << n24 | object2;
                                object4[n22] = l15;
                                n3 = -1;
                                if (n18 == n3) {
                                    n10 = n8 + 1;
                                    n3 = (int)l17;
                                    n18 = et2_1.b((long[])object4, n10, (int)l17);
                                } else {
                                    n3 = (int)l17;
                                }
                                var72_77[n18] = var51_51 = var72_77[n30];
                                var72_77[n30] = var51_52 = var72_77[n8];
                                var72_77[n8] = var51_53 = var72_77[n18];
                                nArray2[n18] = n10 = nArray2[n30];
                                nArray2[n30] = n10 = nArray2[n8];
                                nArray2[n8] = n10 = nArray2[n18];
                                n10 = -1;
                                n8 += n10;
                                object9 = object;
                            }
                            Intrinsics.checkNotNullParameter(object4, (String)object9);
                            n22 = ((Object)object4).length;
                            n24 = 1;
                            l17 = 0;
                            object2 = object4[0] & l25 | l16;
                            object4[n22 -= n24] = object2;
                            n8 += n24;
                            n24 = n20;
                            l8 = l4;
                            void var51_55 = var72_77;
                        }
                        n22 = -862048943;
                        object2 = 128L;
                    }
                    n20 = n24;
                    l4 = l8;
                    l17 = 0;
                    n4 = et2_1.c(gr1_12.d);
                    n3 = gr1_12.e;
                    gr1_12.f = n4 -= n3;
                    n14 = n24;
                    n3 = 1;
                    break block28;
                }
                for (n19 = 0; n19 < n8; n19 += n3) {
                    void var83_86;
                    void var82_85;
                    void var51_57;
                    void var40_41;
                    n18 = n19 >> 3;
                    void var75_81 = var40_41[n18];
                    n17 = (n19 & 7) << 3;
                    long l29 = 128L;
                    void cfr_temp_4 = (var75_81 = var75_81 >> n17 & l7) - l29;
                    if ((n17 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1)) < 0) {
                        object3 = var51_57[n19];
                        if (object3 != null) {
                            n16 = object3.hashCode();
                        } else {
                            n16 = 0;
                            lArray = null;
                        }
                        n17 = -862048943;
                        int n32 = (n16 *= n17) << 16;
                        n16 ^= n32;
                        int n32 = n16 >>> 7;
                        n32 = gr1_12.d(n32);
                        long l30 = n16 & 0x7F;
                        n16 = n32 >> 3;
                        int n34 = (n32 & 7) << 3;
                        l12 = (long)object4[n16];
                        var82_85 = var40_41;
                        var83_86 = var51_57;
                        l14 = 255L;
                        l15 = l14 << n34 ^ (long)-1;
                        l15 = l12 & l15;
                        object4[n16] = l15 |= (l30 <<= n34);
                        n16 = n32 + -7 & n7;
                        n17 = n7 & 7;
                        n16 = n16 + n17 >> 3;
                        object4[n16] = l15;
                        objectArray2[n32] = object3;
                        nArray3[n32] = n3 = nArray[n19];
                    } else {
                        var82_85 = var40_41;
                        var83_86 = var51_57;
                    }
                    n3 = 1;
                    void var40_42 = var82_85;
                    void var51_58 = var83_86;
                    l7 = 255L;
                }
                n3 = 1;
                n14 = n15;
            }
            n4 = gr1_12.d(n14);
        }
        gr1_12.e = n10 = gr1_12.e + n3;
        n10 = gr1_12.f;
        long[] lArray = gr1_12.a;
        n8 = n4 >> 3;
        l3 = lArray[n8];
        n7 = (n4 & 7) << 3;
        l2 = l3 >> n7;
        l8 = 255L;
        l7 = 128L;
        long l31 = (l2 &= l8) - l7;
        long l34 = l31 == 0L ? 0 : (l31 < 0L ? -1 : 1);
        if (l34 != false) {
            n3 = 0;
            Object var40_43 = null;
        }
        gr1_12.f = n10 -= n3;
        n3 = gr1_12.d;
        l2 = l8 << n7 ^ (long)-1;
        l3 &= l2;
        object2 = l4 << n7;
        lArray[n8] = l3 |= object2;
        n10 = n4 + -7 & n3;
        n3 &= 7;
        n3 = n10 + n3 >> 3;
        lArray[n3] = l3;
        return ~n4;
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
        objectArray = new Object[n3];
        this.b = objectArray;
        nArray = new int[n3];
        this.c = nArray;
    }

    public final void g(int n3) {
        long l2;
        int n4;
        this.e = n4 = this.e + -1;
        long[] lArray = this.a;
        int n7 = this.d;
        int n8 = n3 >> 3;
        int n10 = (n3 & 7) << 3;
        long l3 = lArray[n8];
        long l4 = 255L << n10 ^ (long)-1;
        l3 &= l4;
        l4 = 254L << n10;
        lArray[n8] = l2 = l3 | l4;
        n8 = n3 + -7 & n7;
        n7 &= 7;
        n7 = n8 + n7 >> 3;
        lArray[n7] = l2;
        this.b[n3] = null;
    }

    public final void h(Object object, int n3) {
        int n4 = this.e(object);
        if (n4 < 0) {
            n4 ^= 0xFFFFFFFF;
        }
        this.b[n4] = object;
        this.c[n4] = n3;
    }
}

