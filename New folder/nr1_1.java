/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NR1
 */
public final class nr1_1
extends dt2_0 {
    public int f;

    public nr1_1() {
        this(null);
    }

    public nr1_1(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.f(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public /* synthetic */ nr1_1(Object object) {
        this(6);
    }

    public final void c() {
        int n3;
        int n4 = 0;
        this.e = 0;
        Object[] objectArray = this.a;
        long[] lArray = et2_1.a;
        if (objectArray != lArray) {
            rp_1.q(objectArray);
            objectArray = this.a;
            n3 = this.d;
            int n7 = n3 >> 3;
            n3 = (n3 & 7) << 3;
            long l2 = objectArray[n7];
            long l3 = 255L << n3;
            long l4 = l3 ^ (long)-1;
            objectArray[n7] = l2 = l2 & l4 | l3;
        }
        objectArray = this.c;
        n3 = this.d;
        rp_1.n(0, n3, null, objectArray);
        objectArray = this.b;
        n3 = this.d;
        rp_1.n(0, n3, null, objectArray);
        n4 = et2_1.c(this.d);
        int n8 = this.e;
        this.f = n4 -= n8;
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
        int n7;
        long l7;
        long l8;
        int n8;
        int n10;
        int n14;
        nr1_1 nr1_12;
        block23: {
            int n15;
            block28: {
                Object[] objectArray;
                int n16;
                long l12;
                long l14;
                long l15;
                int n17;
                int n18;
                long[] lArray;
                Object object3;
                int n19;
                int n20;
                Object object4;
                block24: {
                    int n21;
                    Object[] objectArray2;
                    long l16;
                    Object object5;
                    long l17;
                    int n22;
                    nr1_12 = this;
                    object4 = object;
                    n14 = 1;
                    n10 = object != null ? object.hashCode() : 0;
                    int n24 = -862048943;
                    int n25 = (n10 *= n24) << 16;
                    n10 ^= n25;
                    n25 = n10 >>> 7;
                    n10 &= 0x7F;
                    n8 = nr1_12.d;
                    n20 = n25 & n8;
                    n19 = 0;
                    object3 = null;
                    while (true) {
                        block25: {
                            long l18;
                            block27: {
                                block26: {
                                    long l19;
                                    lArray = nr1_12.a;
                                    n18 = n20 >> 3;
                                    int n26 = (n20 & 7) << 3;
                                    long l20 = lArray[n18] >>> n26;
                                    long l21 = lArray[n18 += n14];
                                    n17 = 64 - n26;
                                    l8 = l21 << n17;
                                    l15 = -((long)n26);
                                    n26 = 63;
                                    l15 = l15 >> n26 & l8 | l20;
                                    l8 = n10;
                                    l7 = 0x101010101010101L;
                                    l14 = l8 * l7;
                                    n22 = n10;
                                    l18 = l15 ^ l14;
                                    l7 = l18 - l7;
                                    l18 = (l18 ^ (long)-1) & l7;
                                    l7 = -9187201950435737472L;
                                    l18 &= l7;
                                    while ((l17 = (l19 = l18 - (l14 = 0L)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) != false) {
                                        int n27 = Long.numberOfTrailingZeros(l18) >> 3;
                                        object5 = nr1_12.b[n27 = n20 + n27 & n8];
                                        n7 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0);
                                        if (n7 != 0) {
                                            return n27;
                                        }
                                        l14 = l18 - 1L;
                                        l18 &= l14;
                                    }
                                    l18 = l15 ^ (long)-1;
                                    n7 = 6;
                                    l15 = l15 & (l18 <<= n7) & l7;
                                    n15 = 8;
                                    n10 = (int)(l15 == l14 ? 0 : (l15 < l14 ? -1 : 1));
                                    if (n10 == 0) break block25;
                                    n4 = nr1_12.d(n25);
                                    n3 = nr1_12.f;
                                    object2 = 128L;
                                    l7 = 255L;
                                    if (n3 != 0) break block26;
                                    long[] lArray2 = nr1_12.a;
                                    n14 = n4 >> 3;
                                    l14 = lArray2[n14];
                                    n3 = (n4 & 7) << 3;
                                    l15 = l14 >> n3 & l7;
                                    long l22 = l15 - (l14 = 254L);
                                    n10 = (int)(l22 == 0L ? 0 : (l22 < 0L ? -1 : 1));
                                    if (n10 != 0) break block27;
                                }
                                l4 = l8;
                                n3 = 1;
                                l17 = 0;
                                break block23;
                            }
                            n4 = nr1_12.d;
                            if (n4 > n15) {
                                n3 = nr1_12.e;
                                l15 = n3;
                                l12 = 32;
                                l16 = Long.MIN_VALUE;
                                long l23 = (l15 *= l12) ^ l16;
                                l18 = (long)n4 * (long)25;
                                long l24 = l18 ^ l16;
                                if ((n4 = Long.compare(l23, l24)) <= 0) {
                                    object4 = nr1_12.a;
                                    n3 = nr1_12.d;
                                    Object[] objectArray3 = nr1_12.b;
                                    objectArray2 = nr1_12.c;
                                    et2_1.a((long[])object4, n3);
                                    n10 = 0;
                                    n19 = -1;
                                    break;
                                }
                            }
                            n16 = n25;
                            l4 = l8;
                            l17 = 0;
                            n4 = et2_1.e(nr1_12.d);
                            long[] lArray3 = nr1_12.a;
                            Object[] objectArray4 = nr1_12.b;
                            objectArray = nr1_12.c;
                            n10 = nr1_12.d;
                            nr1_12.f(n4);
                            object4 = nr1_12.a;
                            Object[] objectArray5 = nr1_12.b;
                            Object[] objectArray6 = nr1_12.c;
                            n8 = nr1_12.d;
                            break block24;
                        }
                        n15 = n25;
                        n3 = 1;
                        l17 = 0;
                        n20 = n20 + (n19 += 8) & n8;
                        n10 = n22;
                        n14 = 1;
                        n24 = -862048943;
                    }
                    while (n10 != n3) {
                        void var51_48;
                        n22 = n10 >> 3;
                        l16 = (long)object4[n22];
                        int n28 = (n10 & 7) << 3;
                        long l25 = (l16 = l16 >> n28 & l7) - object2;
                        n7 = (int)(l25 == 0L ? 0 : (l25 < 0L ? -1 : 1));
                        if (n7 == 0) {
                            n7 = 1;
                            int n29 = n10 + 1;
                            n19 = n10;
                            n10 = n29;
                            continue;
                        }
                        n7 = 1;
                        Object object6 = l16 == l14 ? 0 : (l16 < l14 ? -1 : 1);
                        if (object6 != false) {
                            n10 += n7;
                            continue;
                        }
                        object5 = var51_48[n10];
                        if (object5 != null) {
                            n7 = object5.hashCode();
                        } else {
                            n7 = 0;
                            object5 = null;
                        }
                        int n30 = (n7 *= n24) << 16;
                        n30 = n7 ^ n30;
                        n7 = n30 >>> 7;
                        int n32 = nr1_12.d(n7);
                        n21 = n32 - (n7 &= n3) & n3;
                        n24 = n21 / 8;
                        n7 = (n10 - n7 & n3) / 8;
                        String string2 = "<this>";
                        if (n24 == n7) {
                            n24 = n30 & 0x7F;
                            l4 = l8;
                            l8 = n24;
                            l16 = (long)object4[n22];
                            n21 = n25;
                            l3 = l7 << n28 ^ (long)-1;
                            l3 = l16 & l3;
                            object4[n22] = l3 |= (l8 <<= n28);
                            Intrinsics.checkNotNullParameter(object4, string2);
                            n24 = ((Object)object4).length;
                            n25 = 1;
                            n8 = 0;
                            string2 = null;
                            l8 = (long)object4[0];
                            object4[n24 -= n25] = l8;
                            n10 += n25;
                            n25 = n21;
                            l8 = l4;
                        } else {
                            Object object7;
                            void var68_77;
                            n21 = n25;
                            l4 = l8;
                            n24 = n32 >> 3;
                            l8 = (long)object4[n24];
                            n25 = (n32 & 7) << 3;
                            long l26 = l8 >> n25 & l7;
                            long l27 = 128L;
                            long l28 = l26 - l27;
                            n20 = (int)(l28 == 0L ? 0 : (l28 < 0L ? -1 : 1));
                            if (n20 == 0) {
                                Object object8;
                                void var40_34;
                                n20 = n30 & 0x7F;
                                l2 = n20;
                                l17 = n3;
                                var68_77 = var51_48;
                                l15 = (l7 << n25 ^ (long)-1) & l8;
                                object4[n24] = l15 |= (l2 <<= n25);
                                l15 = (long)object4[n22];
                                l3 = l7 << n28 ^ (long)-1;
                                l15 &= l3;
                                l3 = 128L;
                                l2 = l3 << n28;
                                object4[n22] = l15 |= l2;
                                var51_48[n32] = var40_34 = var51_48[n10];
                                Object var40_35 = null;
                                var51_48[n10] = null;
                                objectArray2[n32] = object8 = objectArray2[n10];
                                objectArray2[n10] = null;
                                n19 = n10;
                                object7 = string2;
                                n14 = -1;
                            } else {
                                Object object9;
                                Object object10;
                                Object object11;
                                void var51_52;
                                void var51_51;
                                void var51_50;
                                l17 = n3;
                                var68_77 = var51_48;
                                l15 = n30 & 0x7F;
                                object = string2;
                                object2 = (l7 << n25 ^ (long)-1) & l8;
                                l15 = l15 << n25 | object2;
                                object4[n24] = l15;
                                n3 = -1;
                                if (n19 == n3) {
                                    n14 = n10 + 1;
                                    n3 = (int)l17;
                                    n19 = et2_1.b((long[])object4, n14, (int)l17);
                                } else {
                                    n3 = (int)l17;
                                }
                                var68_77[n19] = var51_50 = var68_77[n32];
                                var68_77[n32] = var51_51 = var68_77[n10];
                                var68_77[n10] = var51_52 = var68_77[n19];
                                objectArray2[n19] = object11 = objectArray2[n32];
                                objectArray2[n32] = object10 = objectArray2[n10];
                                objectArray2[n10] = object9 = objectArray2[n19];
                                n14 = -1;
                                n10 += n14;
                                object7 = object;
                            }
                            Intrinsics.checkNotNullParameter(object4, (String)object7);
                            n24 = ((Object)object4).length;
                            n25 = 1;
                            l17 = 0;
                            object2 = object4[0];
                            object4[n24 -= n25] = object2;
                            n10 += n25;
                            n25 = n21;
                            l8 = l4;
                            void var51_57 = var68_77;
                        }
                        n24 = -862048943;
                        object2 = 128L;
                    }
                    n21 = n25;
                    l4 = l8;
                    l17 = 0;
                    n4 = et2_1.c(nr1_12.d);
                    n3 = nr1_12.e;
                    nr1_12.f = n4 -= n3;
                    n15 = n25;
                    n3 = 1;
                    break block28;
                }
                for (n20 = 0; n20 < n10; n20 += n3) {
                    void var79_86;
                    void var78_85;
                    void var51_59;
                    void var40_37;
                    n19 = n20 >> 3;
                    void var71_81 = var40_37[n19];
                    n18 = (n20 & 7) << 3;
                    long l29 = 128L;
                    void cfr_temp_4 = (var71_81 = var71_81 >> n18 & l7) - l29;
                    if ((n18 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1)) < 0) {
                        Object object12;
                        object3 = var51_59[n20];
                        if (object3 != null) {
                            n17 = object3.hashCode();
                        } else {
                            n17 = 0;
                            lArray = null;
                        }
                        n18 = -862048943;
                        n7 = (n17 *= n18) << 16;
                        n17 ^= n7;
                        n7 = n17 >>> 7;
                        n7 = nr1_12.d(n7);
                        long l30 = n17 & 0x7F;
                        n17 = n7 >> 3;
                        int n34 = (n7 & 7) << 3;
                        l12 = (long)object4[n17];
                        var78_85 = var40_37;
                        var79_86 = var51_59;
                        l14 = 255L;
                        l15 = l14 << n34 ^ (long)-1;
                        l15 = l12 & l15;
                        object4[n17] = l15 |= (l30 <<= n34);
                        n17 = n7 + -7 & n8;
                        n18 = n8 & 7;
                        n17 = n17 + n18 >> 3;
                        object4[n17] = l15;
                        objectArray5[n7] = object3;
                        objectArray6[n7] = object12 = objectArray[n20];
                    } else {
                        var78_85 = var40_37;
                        var79_86 = var51_59;
                    }
                    n3 = 1;
                    void var40_40 = var78_85;
                    void var51_60 = var79_86;
                    l7 = 255L;
                }
                n3 = 1;
                n15 = n16;
            }
            n4 = nr1_12.d(n15);
        }
        nr1_12.e = n14 = nr1_12.e + n3;
        n14 = nr1_12.f;
        long[] lArray = nr1_12.a;
        n10 = n4 >> 3;
        l3 = lArray[n10];
        n8 = (n4 & 7) << 3;
        l2 = l3 >> n8;
        l8 = 255L;
        l7 = 128L;
        long l31 = (l2 &= l8) - l7;
        n7 = (int)(l31 == 0L ? 0 : (l31 < 0L ? -1 : 1));
        if (n7 != 0) {
            n3 = 0;
            Object var40_41 = null;
        }
        nr1_12.f = n14 -= n3;
        n3 = nr1_12.d;
        l2 = l8 << n8 ^ (long)-1;
        l3 &= l2;
        object2 = l4 << n8;
        lArray[n10] = l3 |= object2;
        n14 = n4 + -7 & n3;
        n3 &= 7;
        n3 = n14 + n3 >> 3;
        lArray[n3] = l3;
        return ~n4;
    }

    public final void f(int n3) {
        long l2;
        Object[] objectArray;
        Object[] objectArray2;
        int n4;
        if (n3 > 0) {
            n3 = et2_1.f(n3);
            n4 = 7;
            n3 = Math.max(n4, n3);
        } else {
            n3 = 0;
            objectArray2 = null;
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
        objectArray2 = new Object[n3];
        this.c = objectArray2;
    }

    public final Object g(Object object) {
        int n3 = 0;
        int n4 = object != null ? object.hashCode() : 0;
        int n7 = (n4 *= -862048943) << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 >>>= 7;
        while (true) {
            block9: {
                int n10;
                block8: {
                    long l2;
                    long l3;
                    long l4;
                    long[] lArray = this.a;
                    int n14 = (n4 &= n8) >> 3;
                    int n15 = (n4 & 7) << 3;
                    long l7 = lArray[n14] >>> n15;
                    long l8 = lArray[++n14];
                    int n16 = 64 - n15;
                    long l12 = l8 << n16;
                    l8 = -((long)n15);
                    n15 = 63;
                    l12 = l12 & (l8 >>= n15) | l7;
                    long l14 = n7;
                    long l15 = 0x101010101010101L;
                    l14 = l14 * l15 ^ l12;
                    l15 = l14 - l15;
                    l14 = (l14 ^ (long)-1) & l15;
                    l15 = -9187201950435737472L;
                    l14 &= l15;
                    while ((l4 = (l3 = l14 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                        n10 = (Long.numberOfTrailingZeros(l14) >> 3) + n4 & n8;
                        Object object2 = this.b[n10];
                        boolean bl2 = Intrinsics.areEqual(object2, object);
                        if (!bl2) {
                            l2 = l14 - 1L;
                            l14 &= l2;
                            continue;
                        }
                        break block8;
                    }
                    l14 = l12 ^ (long)-1;
                    l4 = 6;
                    long l16 = (l12 = l12 & (l14 <<= l4) & l15) - l2;
                    n15 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n15 == 0) break block9;
                    n10 = -1;
                }
                if (n10 >= 0) {
                    return this.h(n10);
                }
                return null;
            }
            n4 += (n3 += 8);
        }
    }

    public final Object h(int n3) {
        long l2;
        int n4;
        this.e = n4 = this.e + -1;
        Object[] objectArray = this.a;
        int n7 = this.d;
        int n8 = n3 >> 3;
        int n10 = (n3 & 7) << 3;
        long l3 = objectArray[n8];
        long l4 = 255L << n10 ^ (long)-1;
        l3 &= l4;
        l4 = 254L << n10;
        objectArray[n8] = l2 = l3 | l4;
        n8 = n3 + -7 & n7;
        n7 &= 7;
        n7 = n8 + n7 >> 3;
        objectArray[n7] = l2;
        this.b[n3] = null;
        objectArray = this.c;
        long l7 = objectArray[n3];
        objectArray[n3] = (long)null;
        return l7;
    }

    public final void i(Object object, Object object2) {
        int n3 = this.e(object);
        if (n3 < 0) {
            n3 ^= 0xFFFFFFFF;
        }
        this.b[n3] = object;
        this.c[n3] = object2;
    }
}

