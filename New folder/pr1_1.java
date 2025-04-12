/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PR1
 */
public final class pr1_1
extends ft2_0 {
    public int e;

    public pr1_1() {
        this(null);
    }

    public pr1_1(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.h(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public /* synthetic */ pr1_1(Object object) {
        this(6);
    }

    public final boolean d(Object object) {
        int n3 = this.d;
        int n4 = this.f(object);
        Object[] objectArray = this.b;
        objectArray[n4] = object;
        int n7 = this.d;
        if (n7 != n3) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        return n7 != 0;
    }

    public final void e() {
        int n3;
        int n4 = 0;
        this.d = 0;
        Object[] objectArray = this.a;
        long[] lArray = et2_1.a;
        if (objectArray != lArray) {
            rp_1.q(objectArray);
            objectArray = this.a;
            int n7 = this.c;
            n3 = n7 >> 3;
            n7 = (n7 & 7) << 3;
            long l2 = objectArray[n3];
            long l3 = 255L << n7;
            long l4 = l3 ^ (long)-1;
            objectArray[n3] = l2 = l2 & l4 | l3;
        }
        objectArray = this.b;
        n3 = this.c;
        rp_1.n(0, n3, null, objectArray);
        n4 = et2_1.c(this.c);
        int n8 = this.d;
        this.e = n4 -= n8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int f(Object object) {
        Object object2;
        long l2;
        long[] lArray;
        Object[] objectArray;
        long l3;
        long l4;
        int n3;
        int n4;
        long l7;
        long l8;
        int n7;
        int n8;
        int n10;
        pr1_1 pr1_12;
        block23: {
            int n14;
            block28: {
                int n15;
                Object object3;
                long l12;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                int n21;
                Object object4;
                block24: {
                    int n22;
                    long l14;
                    Object object5;
                    long l15;
                    int n24;
                    Object[] objectArray2;
                    pr1_12 = this;
                    object4 = object;
                    n10 = 1;
                    if (object != null) {
                        n8 = object.hashCode();
                    } else {
                        n8 = 0;
                        objectArray2 = null;
                    }
                    n21 = -862048943;
                    n20 = (n8 *= n21) << 16;
                    n8 ^= n20;
                    n20 = n8 >>> 7;
                    n8 &= 0x7F;
                    n7 = pr1_12.c;
                    n19 = n20 & n7;
                    n18 = 0;
                    while (true) {
                        block25: {
                            long l16;
                            block27: {
                                block26: {
                                    int n25;
                                    long l17;
                                    long[] lArray2 = pr1_12.a;
                                    n17 = n19 >> 3;
                                    int n26 = (n19 & 7) << 3;
                                    long l18 = lArray2[n17] >>> n26;
                                    long l19 = lArray2[n17 += n10];
                                    n16 = 64 - n26;
                                    l8 = l19 << n16;
                                    l12 = -((long)n26);
                                    n26 = 63;
                                    l12 = l12 >> n26 & l8 | l18;
                                    l8 = n8;
                                    l7 = 0x101010101010101L;
                                    object3 = l8 * l7;
                                    n24 = n8;
                                    l16 = l12 ^ object3;
                                    l7 = l16 - l7;
                                    l16 = (l16 ^ (long)-1) & l7;
                                    l7 = -9187201950435737472L;
                                    l16 &= l7;
                                    while ((l15 = (l17 = l16 - (object3 = 0L)) == 0L ? 0 : (l17 < 0L ? -1 : 1)) != false) {
                                        int n27 = Long.numberOfTrailingZeros(l16) >> 3;
                                        object5 = pr1_12.b[n27 = n19 + n27 & n7];
                                        n25 = (int)(Intrinsics.areEqual(object5, object4) ? 1 : 0);
                                        if (n25 != 0) {
                                            return n27;
                                        }
                                        object3 = l16 - 1L;
                                        l16 &= object3;
                                    }
                                    l16 = l12 ^ (long)-1;
                                    n25 = 6;
                                    l12 = l12 & (l16 <<= n25) & l7;
                                    n14 = 8;
                                    n8 = (int)(l12 == object3 ? 0 : (l12 < object3 ? -1 : 1));
                                    if (n8 == 0) break block25;
                                    n4 = pr1_12.g(n20);
                                    n3 = pr1_12.e;
                                    l4 = 128L;
                                    l7 = 255L;
                                    if (n3 != 0) break block26;
                                    long[] lArray3 = pr1_12.a;
                                    n10 = n4 >> 3;
                                    object3 = lArray3[n10];
                                    n3 = (n4 & 7) << 3;
                                    l12 = object3 >> n3 & l7;
                                    long l20 = l12 - (object3 = 254L);
                                    n8 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
                                    if (n8 != 0) break block27;
                                }
                                l3 = l8;
                                n10 = 1;
                                l15 = 0;
                                break block23;
                            }
                            n4 = pr1_12.c;
                            if (n4 > n14) {
                                n3 = pr1_12.d;
                                l12 = n3;
                                objectArray2 = mt3_0.b;
                                long l21 = 32;
                                l14 = Long.MIN_VALUE;
                                long l22 = (l12 *= l21) ^ l14;
                                l16 = (long)n4 * (long)25;
                                long l23 = l16 ^ l14;
                                if ((n4 = Long.compare(l22, l23)) <= 0) {
                                    object4 = pr1_12.a;
                                    n3 = pr1_12.c;
                                    objectArray = pr1_12.b;
                                    et2_1.a((long[])object4, n3);
                                    n14 = 0;
                                    lArray = null;
                                    n8 = -1;
                                    break;
                                }
                            }
                            n15 = n20;
                            l3 = l8;
                            l15 = 0;
                            n4 = et2_1.e(pr1_12.c);
                            long[] lArray4 = pr1_12.a;
                            objectArray = pr1_12.b;
                            n14 = pr1_12.c;
                            pr1_12.h(n4);
                            object4 = pr1_12.a;
                            objectArray2 = pr1_12.b;
                            n21 = pr1_12.c;
                            break block24;
                        }
                        n14 = n20;
                        n3 = -1;
                        n10 = 1;
                        l15 = 0;
                        n19 = n19 + (n18 += 8) & n7;
                        n8 = n24;
                        n21 = -862048943;
                    }
                    while (n14 != n3) {
                        n18 = n14 >> 3;
                        reference var53_50 = object4[n18];
                        n24 = (n14 & 7) << 3;
                        reference cfr_temp_2 = (var53_50 = var53_50 >> n24 & l7) - l4;
                        Object object6 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        if (object6 == false) {
                            object6 = true;
                            int n28 = n14 + 1;
                            n8 = n14;
                            n14 = n28;
                            continue;
                        }
                        object6 = true;
                        Object object7 = var53_50 == object3 ? 0 : (var53_50 < object3 ? -1 : 1);
                        if (object7 != false) {
                            n14 += object6;
                            continue;
                        }
                        object5 = objectArray[n14];
                        if (object5 != null) {
                            object6 = object5.hashCode();
                        } else {
                            object6 = false;
                            object5 = null;
                        }
                        Object object8 = (object6 *= n21) << 16;
                        object8 = object6 ^ object8;
                        object6 = object8 >>> 7;
                        int n29 = pr1_12.g((int)object6);
                        object6 = object6 & n3;
                        n22 = n29 - object6 & n3;
                        n21 = n22 / 8;
                        object6 = (n14 - object6 & n3) / 8;
                        long l24 = 0xFFFFFFFFFFFFFFL;
                        String string2 = "<this>";
                        if (n21 == object6) {
                            n21 = object8 & 0x7F;
                            l3 = l8;
                            l8 = n21;
                            var53_50 = object4[n18];
                            n22 = n20;
                            l2 = l7 << n24 ^ (long)-1;
                            l2 = (long)(var53_50 & l2);
                            object4[n18] = l2 |= (l8 <<= n24);
                            Intrinsics.checkNotNullParameter(object4, string2);
                            n21 = ((Object)object4).length;
                            n20 = 1;
                            n7 = 0;
                            string2 = null;
                            object2 = object4[0];
                            l4 = object2 & l24 | l14;
                            object4[n21 -= n20] = l4;
                            n14 += n20;
                            n20 = n22;
                            l8 = l3;
                        } else {
                            Object object9;
                            Object[] objectArray3;
                            n22 = n20;
                            l3 = l8;
                            n21 = n29 >> 3;
                            l8 = (long)object4[n21];
                            n20 = (n29 & 7) << 3;
                            long l25 = l8 >> n20 & l7;
                            long l26 = 128L;
                            long l27 = l25 - l26;
                            n19 = (int)(l27 == 0L ? 0 : (l27 < 0L ? -1 : 1));
                            if (n19 == 0) {
                                Object object10;
                                n8 = object8 & 0x7F;
                                object = string2;
                                l4 = n8;
                                l15 = n3;
                                objectArray3 = objectArray;
                                l12 = (l7 << n20 ^ (long)-1) & l8;
                                long l28 = l4 << n20;
                                object4[n21] = l12 |= l28;
                                l12 = (long)object4[n18];
                                long l29 = l7 << n24 ^ (long)-1;
                                l12 &= l29;
                                l29 = 128L;
                                l28 = l29 << n24;
                                object4[n18] = l12 |= l28;
                                objectArray[n29] = object10 = objectArray[n14];
                                Object var40_39 = null;
                                objectArray[n14] = null;
                                object9 = string2;
                                n8 = n14;
                                n10 = n3;
                                n3 = -1;
                            } else {
                                l15 = n3;
                                objectArray3 = objectArray;
                                object = string2;
                                l12 = object8 & 0x7F;
                                l4 = (l7 << n20 ^ (long)-1) & l8;
                                l12 = l12 << n20 | l4;
                                object4[n21] = l12;
                                n3 = -1;
                                if (n8 == n3) {
                                    n8 = n14 + 1;
                                    n10 = (int)l15;
                                    n8 = et2_1.b((long[])object4, n8, (int)l15);
                                } else {
                                    n10 = (int)l15;
                                }
                                objectArray3[n8] = object9 = objectArray3[n29];
                                objectArray3[n29] = object9 = objectArray3[n14];
                                objectArray3[n14] = object9 = objectArray3[n8];
                                n14 += n3;
                                object9 = object;
                            }
                            Intrinsics.checkNotNullParameter(object4, (String)object9);
                            n21 = ((Object)object4).length;
                            n20 = 1;
                            l15 = 0;
                            l4 = (long)(object4[0] & l24 | l14);
                            object4[n21 -= n20] = l4;
                            n14 += n20;
                            n3 = n10;
                            n20 = n22;
                            l8 = l3;
                            objectArray = objectArray3;
                        }
                        n21 = -862048943;
                        l4 = 128L;
                    }
                    n22 = n20;
                    l3 = l8;
                    l15 = 0;
                    n4 = et2_1.c(pr1_12.c);
                    n3 = pr1_12.d;
                    pr1_12.e = n4 -= n3;
                    n14 = n20;
                    n10 = 1;
                    break block28;
                }
                for (n20 = 0; n20 < n14; n20 += n10) {
                    Object[] objectArray4;
                    void var79_69;
                    void var40_41;
                    n7 = n20 >> 3;
                    l4 = var40_41[n7];
                    n18 = (n20 & 7) << 3;
                    long l30 = 128L;
                    long l31 = (l4 = l4 >> n18 & l7) - l30;
                    n17 = (int)(l31 == 0L ? 0 : (l31 < 0L ? -1 : 1));
                    if (n17 < 0) {
                        Object object11 = objectArray[n20];
                        n19 = object11 != null ? object11.hashCode() : 0;
                        n16 = -862048943;
                        n18 = (n19 *= n16) << 16;
                        n19 ^= n18;
                        n18 = n19 >>> 7;
                        n18 = pr1_12.g(n18);
                        l8 = n19 & 0x7F;
                        n19 = n18 >> 3;
                        int n30 = (n18 & 7) << 3;
                        object3 = object4[n19];
                        var79_69 = var40_41;
                        objectArray4 = objectArray;
                        l12 = l7 << n30 ^ (long)-1;
                        l12 = object3 & l12;
                        object4[n19] = l12 |= (l8 <<= n30);
                        n19 = n18 + -7 & n21;
                        n16 = n21 & 7;
                        n19 = n19 + n16 >> 3;
                        object4[n19] = l12;
                        objectArray2[n18] = object11;
                    } else {
                        var79_69 = var40_41;
                        objectArray4 = objectArray;
                    }
                    n10 = 1;
                    void var40_42 = var79_69;
                    objectArray = objectArray4;
                }
                n10 = 1;
                n14 = n15;
            }
            n4 = pr1_12.g(n14);
        }
        pr1_12.d = n3 = pr1_12.d + n10;
        n3 = pr1_12.e;
        lArray = pr1_12.a;
        n8 = n4 >> 3;
        l2 = lArray[n8];
        n7 = (n4 & 7) << 3;
        object2 = l2 >> n7 & l7;
        l8 = 128L;
        long l34 = object2 == l8 ? 0 : (object2 < l8 ? -1 : 1);
        if (l34 != false) {
            n10 = 0;
            objectArray = null;
        }
        pr1_12.e = n3 -= n10;
        n3 = pr1_12.c;
        object2 = l7 << n7 ^ (long)-1;
        l2 &= object2;
        l4 = l3 << n7;
        lArray[n8] = l2 |= l4;
        n10 = n4 + -7 & n3;
        n3 &= 7;
        n3 = n10 + n3 >> 3;
        lArray[n3] = l2;
        return n4;
    }

    public final int g(int n3) {
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

    public final void h(int n3) {
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
        objectArray = new Object[n3];
        this.b = objectArray;
    }

    public final void i(ft2_0 object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        Object[] objectArray = ((ft2_0)object).b;
        object = ((ft2_0)object).a;
        int n3 = ((Object)object).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                reference var5_5 = object[n4];
                reference var7_6 = var5_5 ^ (long)-1;
                int n7 = 7;
                var7_6 = var7_6 << n7 & var5_5;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var7_6 &= l2) - l2;
                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object2 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l3 = 0xFFL & var5_5;
                        long l4 = 128L;
                        long l7 = l3 - l4;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            int n14 = (n4 << 3) + n7;
                            Object object4 = objectArray[n14];
                            object2 = this.f(object4);
                            Object[] objectArray2 = this.b;
                            objectArray2[object2] = object4;
                        }
                        var5_5 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
    }

    public final boolean j(Object object) {
        pr1_1 pr1_12 = this;
        Object object2 = object;
        boolean bl2 = false;
        int n3 = object != null ? object.hashCode() : 0;
        int n4 = (n3 *= -862048943) << 16;
        n3 ^= n4;
        n4 = n3 & 0x7F;
        int n7 = pr1_12.c;
        n3 = n3 >>> 7 & n7;
        int n8 = 0;
        while (true) {
            block10: {
                long l2;
                block9: {
                    long l3;
                    long l4;
                    long[] lArray = pr1_12.a;
                    int n10 = n3 >> 3;
                    int n14 = (n3 & 7) << 3;
                    long l7 = lArray[n10] >>> n14;
                    int n15 = 1;
                    long l8 = lArray[n10 += n15];
                    int n16 = 64 - n14;
                    long l12 = l8 << n16;
                    l8 = -((long)n14);
                    n14 = 63;
                    l12 = l12 & (l8 >>= n14) | l7;
                    long l14 = n4;
                    l8 = 0x101010101010101L;
                    l14 = l14 * l8 ^ l12;
                    l8 = l14 - l8;
                    l14 = (l14 ^ (long)-1) & l8;
                    l8 = -9187201950435737472L;
                    l14 &= l8;
                    while ((l2 = (l4 = l14 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                        l2 = (Long.numberOfTrailingZeros(l14) >> 3) + n3 & n7;
                        Object object3 = pr1_12.b[l2];
                        boolean bl3 = Intrinsics.areEqual(object3, object2);
                        if (!bl3) {
                            l3 = l14 - 1L;
                            l14 &= l3;
                            continue;
                        }
                        break block9;
                    }
                    l14 = l12 ^ (long)-1;
                    l2 = 6;
                    long l15 = (l12 = l12 & (l14 <<= l2) & l8) - l3;
                    n14 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                    if (n14 == 0) break block10;
                    l2 = -1;
                }
                if (l2 >= 0) {
                    bl2 = true;
                }
                if (bl2) {
                    pr1_12.k((int)l2);
                }
                return bl2;
            }
            n3 = n3 + (n8 += 8) & n7;
        }
    }

    public final void k(int n3) {
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
        n8 = n3 + -7 & n7;
        n7 &= 7;
        n7 = n8 + n7 >> 3;
        lArray[n7] = l2;
        this.b[n3] = null;
    }
}

