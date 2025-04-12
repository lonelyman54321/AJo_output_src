/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tR1
 */
public final class tr1_1
extends Qi1 {
    public int f;

    public /* synthetic */ tr1_1() {
        this(6);
    }

    public tr1_1(int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            n3 = et2_1.g(n3);
            this.g(n3);
            return;
        }
        iv2_2.c("Capacity must be a positive value.");
        throw null;
    }

    public final void d() {
        int n3;
        int n4 = 0;
        this.e = 0;
        Object[] objectArray = this.a;
        long[] lArray = et2_1.a;
        if (objectArray != lArray) {
            rp_1.q(objectArray);
            objectArray = this.a;
            int n7 = this.d;
            n3 = n7 >> 3;
            n7 = (n7 & 7) << 3;
            long l2 = objectArray[n3];
            long l3 = 255L << n7;
            long l4 = l3 ^ (long)-1;
            objectArray[n3] = l2 = l2 & l4 | l3;
        }
        objectArray = this.c;
        n3 = this.d;
        rp_1.n(0, n3, null, objectArray);
        n4 = et2_1.c(this.d);
        int n8 = this.e;
        this.f = n4 -= n8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int e(int n3) {
        int n4;
        long l2;
        long l3;
        int n7;
        long l4;
        int n8;
        long l7;
        long l8;
        long l12;
        int n10;
        int n14;
        int n15;
        int n16;
        tr1_1 tr1_12;
        block18: {
            int n17;
            block23: {
                void var10_16;
                long[] lArray;
                Object[] objectArray;
                int[] nArray;
                Object var50_55;
                int n18;
                long l14;
                long l15;
                int n19;
                Object object;
                int n20;
                int n21;
                int n22;
                block19: {
                    int n24;
                    void var10_14;
                    Object[] objectArray2;
                    int[] nArray2;
                    long[] lArray2;
                    long l16;
                    long l17;
                    long l18;
                    int n25;
                    tr1_12 = this;
                    n16 = n3;
                    n15 = 1;
                    n17 = -862048943;
                    n14 = n3 * n17;
                    int n26 = n14 << 16;
                    n14 ^= n26;
                    n26 = n14 >>> 7;
                    n14 &= 0x7F;
                    int n27 = this.d;
                    n10 = n26 & n27;
                    boolean bl2 = false;
                    while (true) {
                        Object object2;
                        block20: {
                            long l19;
                            block22: {
                                block21: {
                                    long l20;
                                    long[] lArray3 = tr1_12.a;
                                    n22 = n10 >> 3;
                                    n21 = (n10 & 7) << 3;
                                    long l21 = lArray3[n22] >>> n21;
                                    long l22 = lArray3[n22 += n15];
                                    n20 = 64 - n21;
                                    l12 = l22 << n20;
                                    object = object2;
                                    l8 = -((long)n21);
                                    n21 = 63;
                                    l8 = l8 >> n21 & l12 | l21;
                                    l12 = n14;
                                    l7 = 0x101010101010101L;
                                    long l23 = l12 * l7;
                                    n25 = n14;
                                    l19 = l8 ^ l23;
                                    l7 = l19 - l7;
                                    l19 = (l19 ^ (long)-1) & l7;
                                    l7 = -9187201950435737472L;
                                    l19 &= l7;
                                    while ((l18 = (l20 = l19 - (l23 = 0L)) == 0L ? 0 : (l20 < 0L ? -1 : 1)) != false) {
                                        int n28 = Long.numberOfTrailingZeros(l19) >> 3;
                                        int[] nArray3 = tr1_12.b;
                                        n8 = nArray3[n28 = n10 + n28 & n27];
                                        if (n8 == n16) {
                                            return n28;
                                        }
                                        l23 = l19 - 1L;
                                        l19 &= l23;
                                    }
                                    l19 = l8 ^ (long)-1;
                                    n8 = 6;
                                    l19 = l19 << n8 & l8 & l7;
                                    n19 = 8;
                                    object2 = l19 == l23 ? 0 : (l19 < l23 ? -1 : 1);
                                    if (object2 == false) break block20;
                                    n16 = tr1_12.f(n26);
                                    n17 = tr1_12.f;
                                    l17 = 128L;
                                    l7 = 255L;
                                    if (n17 != 0) break block21;
                                    long[] lArray4 = tr1_12.a;
                                    n14 = n16 >> 3;
                                    l15 = lArray4[n14];
                                    n17 = (n16 & 7) << 3;
                                    l19 = l15 >> n17 & l7;
                                    long l24 = l19 - (l15 = 254L);
                                    Object object3 = l24 == 0L ? 0 : (l24 < 0L ? -1 : 1);
                                    if (object3 != false) break block22;
                                }
                                l4 = l12;
                                n7 = 1;
                                break block18;
                            }
                            n16 = tr1_12.d;
                            if (n16 > n19) {
                                n17 = tr1_12.e;
                                l19 = n17;
                                l14 = 32;
                                l19 *= l14;
                                l8 = (long)n16 * (long)25;
                                l16 = Long.MIN_VALUE;
                                n16 = Long.compare(l19 ^= l16, l8 ^= l16);
                                if (n16 <= 0) {
                                    lArray2 = tr1_12.a;
                                    n17 = tr1_12.d;
                                    nArray2 = tr1_12.b;
                                    objectArray2 = tr1_12.c;
                                    et2_1.a(lArray2, n17);
                                    boolean bl3 = false;
                                    n8 = -1;
                                    break;
                                }
                            }
                            n18 = n26;
                            l4 = l12;
                            n19 = 0;
                            var50_55 = null;
                            n16 = et2_1.e(tr1_12.d);
                            long[] lArray5 = tr1_12.a;
                            nArray = tr1_12.b;
                            objectArray = tr1_12.c;
                            n14 = tr1_12.d;
                            tr1_12.g(n16);
                            lArray = tr1_12.a;
                            int[] nArray4 = tr1_12.b;
                            Object[] objectArray3 = tr1_12.c;
                            n10 = tr1_12.d;
                            boolean bl4 = false;
                            break block19;
                        }
                        n17 = n26;
                        n7 = 1;
                        object2 = object + 8;
                        n10 = n10 + object2 & n27;
                        n14 = n25;
                        n15 = 1;
                        n17 = -862048943;
                    }
                    while (var10_14 != n17) {
                        long l25;
                        long l26;
                        long l27;
                        n25 = var10_14 >> 3;
                        long l28 = lArray2[n25];
                        int n29 = (var10_14 & 7) << 3;
                        long l29 = (l28 = l28 >> n29 & l7) - l17;
                        Object object4 = l29 == 0L ? 0 : (l29 < 0L ? -1 : 1);
                        if (object4 == false) {
                            void var55_59 = var10_14 + true;
                            n8 = var10_14;
                            var10_14 = var55_59;
                            continue;
                        }
                        object4 = l28 == l15 ? 0 : (l28 < l15 ? -1 : 1);
                        if (object4 != false) {
                            var10_14 += n15;
                            continue;
                        }
                        int n30 = nArray2[var10_14] * -862048943;
                        l18 = n30 << 16;
                        l18 = n30 ^ l18;
                        n7 = (int)(l18 >>> 7);
                        int n32 = tr1_12.f(n7);
                        object4 = n32 - (n7 &= n17) & n17;
                        n27 = (int)(object4 / 8);
                        n7 = (var10_14 - n7 & n17) / 8;
                        long l30 = 0xFFFFFFFFFFFFFFL;
                        String string2 = "<this>";
                        if (n27 == n7) {
                            n7 = l18 & 0x7F;
                            n27 = n17;
                            l27 = n7;
                            l26 = lArray2[n25];
                            l4 = l12;
                            l12 = l7 << n29 ^ (long)-1;
                            l12 = l26 & l12;
                            lArray2[n25] = l25 = l27 << n29 | l12;
                            Intrinsics.checkNotNullParameter(lArray2, string2);
                            n7 = lArray2.length;
                            n15 = 1;
                            Object var38_39 = null;
                            lArray2[n7 -= n15] = l12 = lArray2[0] & l30 | l16;
                            var10_14 += n15;
                            l12 = l4;
                        } else {
                            void var38_43;
                            Object[] objectArray4;
                            String string3;
                            n27 = n17;
                            l4 = l12;
                            n7 = n32 >> 3;
                            l27 = lArray2[n7];
                            n20 = (n32 & 7) << 3;
                            l26 = l27 >> n20 & l7;
                            long l31 = 128L;
                            long l34 = l26 - l31;
                            n22 = (int)(l34 == 0L ? 0 : (l34 < 0L ? -1 : 1));
                            if (n22 == 0) {
                                Object object5;
                                n22 = l18 & 0x7F;
                                n24 = n26;
                                l3 = n22;
                                string3 = string2;
                                objectArray4 = objectArray2;
                                l2 = l7 << n20 ^ (long)-1;
                                l27 &= l2;
                                lArray2[n7] = l27 |= (l3 <<= n20);
                                l25 = lArray2[n25];
                                l3 = l7 << n29 ^ (long)-1;
                                l25 &= l3;
                                l3 = 128L;
                                l2 = l3 << n29;
                                lArray2[n25] = l25 |= l2;
                                nArray2[n32] = n7 = nArray2[var10_14];
                                nArray2[var10_14] = 0;
                                objectArray2[n32] = object5 = objectArray2[var10_14];
                                Object var76_75 = null;
                                objectArray2[var10_14] = null;
                                n8 = var10_14;
                                n7 = n17;
                                String string4 = string2;
                                n15 = -1;
                            } else {
                                Object object6;
                                n24 = n26;
                                string3 = string2;
                                objectArray4 = objectArray2;
                                n26 = l18 & 0x7F;
                                l3 = n26;
                                l2 = l7 << n20 ^ (long)-1;
                                l27 &= l2;
                                lArray2[n7] = l27 |= (l3 <<= n20);
                                n7 = -1;
                                if (n8 == n7) {
                                    n15 = var10_14 + true;
                                    n7 = n17;
                                    n8 = et2_1.b(lArray2, n15, n17);
                                } else {
                                    n7 = n17;
                                }
                                nArray2[n8] = n15 = nArray2[n32];
                                nArray2[n32] = n15 = nArray2[var10_14];
                                nArray2[var10_14] = n15 = nArray2[n8];
                                objectArray4[n8] = object6 = objectArray4[n32];
                                objectArray4[n32] = object6 = objectArray4[var10_14];
                                objectArray4[var10_14] = object6 = objectArray4[n8];
                                n15 = -1;
                                var10_14 += n15;
                                String string5 = string3;
                            }
                            Intrinsics.checkNotNullParameter(lArray2, (String)var38_43);
                            n17 = lArray2.length;
                            n26 = 1;
                            n19 = 0;
                            lArray2[n17 -= n26] = l17 = lArray2[0] & l30 | l16;
                            var10_14 += n26;
                            n17 = n7;
                            objectArray2 = objectArray4;
                            n26 = n24;
                            l12 = l4;
                            n15 = 1;
                        }
                        l17 = 128L;
                    }
                    n24 = n26;
                    l4 = l12;
                    n19 = 0;
                    objectArray2 = null;
                    n16 = et2_1.c(tr1_12.d);
                    n7 = tr1_12.e;
                    tr1_12.f = n16 -= n7;
                    n17 = n26;
                    n7 = 1;
                    break block23;
                }
                while (var10_16 < n14) {
                    int[] nArray5;
                    void var86_90;
                    void var76_78;
                    n20 = var10_16 >> 3;
                    l12 = var76_78[n20];
                    n8 = (var10_16 & 7) << 3;
                    long l35 = 128L;
                    long l36 = (l12 = l12 >> n8 & l7) - l35;
                    object = l36 == 0L ? 0 : (l36 < 0L ? -1 : 1);
                    if (object < 0) {
                        Object object7;
                        n20 = nArray[var10_16];
                        n8 = n20 * -862048943;
                        n4 = n8 << 16;
                        n19 = (n8 ^= n4) >>> 7;
                        n19 = tr1_12.f(n19);
                        long l37 = n8 & 0x7F;
                        int n34 = n19 >> 3;
                        n8 = (n19 & 7) << 3;
                        l14 = lArray[n34];
                        var86_90 = var76_78;
                        nArray5 = nArray;
                        l15 = 255L;
                        long l38 = l15 << n8 ^ (long)-1;
                        l38 = l14 & l38;
                        lArray[n34] = l38 |= (l37 <<= n8);
                        n22 = n19 + -7 & n10;
                        n21 = n10 & 7;
                        n22 = n22 + n21 >> 3;
                        lArray[n22] = l38;
                        nArray4[n19] = n20;
                        objectArray3[n19] = object7 = objectArray[var10_16];
                    } else {
                        var86_90 = var76_78;
                        nArray5 = nArray;
                    }
                    n7 = 1;
                    var10_16 += n7;
                    void var76_81 = var86_90;
                    nArray = nArray5;
                    n19 = 0;
                    var50_55 = null;
                    l7 = 255L;
                }
                n7 = 1;
                n17 = n18;
            }
            n16 = tr1_12.f(n17);
        }
        tr1_12.e = n15 = tr1_12.e + n7;
        n15 = tr1_12.f;
        long[] lArray = tr1_12.a;
        n14 = n16 >> 3;
        l3 = lArray[n14];
        n10 = (n16 & 7) << 3;
        l8 = l3 >> n10;
        l12 = 255L;
        l7 = 128L;
        long l39 = (l8 &= l12) - l7;
        n8 = (int)(l39 == 0L ? 0 : (l39 < 0L ? -1 : 1));
        n4 = n8 == 0 ? 1 : 0;
        tr1_12.f = n15 -= n4;
        n7 = tr1_12.d;
        l8 = l12 << n10 ^ (long)-1;
        l3 &= l8;
        l2 = l4 << n10;
        lArray[n14] = l3 |= l2;
        n15 = n16 + -7 & n7;
        n7 &= 7;
        n7 = n15 + n7 >> 3;
        lArray[n7] = l3;
        return n16;
    }

    public final int f(int n3) {
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

    public final void g(int n3) {
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
        objectArray = new int[n3];
        this.b = (int[])objectArray;
        objectArray2 = new Object[n3];
        this.c = objectArray2;
    }

    public final Object h(int n3) {
        int n4 = -862048943 * n3;
        int n7 = n4 << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 = n4 >>> 7 & n8;
        int n10 = 0;
        while (true) {
            block9: {
                int n14;
                long l2;
                long l3;
                block8: {
                    long l4;
                    long l7;
                    long l8;
                    long[] lArray = this.a;
                    int n15 = n4 >> 3;
                    int n16 = (n4 & 7) << 3;
                    long l12 = lArray[n15] >>> n16;
                    long l14 = lArray[++n15];
                    int n17 = 64 - n16;
                    l3 = l14 << n17;
                    l14 = -((long)n16);
                    n16 = 63;
                    l3 = l3 & (l14 >>= n16) | l12;
                    l2 = n7;
                    long l15 = 0x101010101010101L;
                    l2 = l2 * l15 ^ l3;
                    l15 = l2 - l15;
                    l2 = (l2 ^ (long)-1) & l15;
                    l15 = -9187201950435737472L;
                    l2 &= l15;
                    while ((l8 = (l7 = l2 - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                        int[] nArray = this.b;
                        n14 = (Long.numberOfTrailingZeros(l2) >> 3) + n4 & n8;
                        int n18 = nArray[n14];
                        if (n18 != n3) {
                            l4 = l2 - 1L;
                            l2 &= l4;
                            continue;
                        }
                        break block8;
                    }
                    l2 = l3 ^ (long)-1;
                    l8 = 6;
                    long l16 = (l3 = l3 & (l2 <<= l8) & l15) - l4;
                    n16 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n16 == 0) break block9;
                    n14 = -1;
                }
                n3 = 0;
                if (n14 >= 0) {
                    long l17;
                    this.e = n4 = this.e + -1;
                    Object[] objectArray = this.a;
                    n7 = this.d;
                    n8 = n14 >> 3;
                    n10 = (n14 & 7) << 3;
                    l3 = objectArray[n8];
                    l2 = 255L << n10 ^ (long)-1;
                    l3 &= l2;
                    l2 = 254L << n10;
                    objectArray[n8] = l17 = l3 | l2;
                    n8 = n14 + -7 & n7;
                    n7 &= 7;
                    n7 = n8 + n7 >> 3;
                    objectArray[n7] = l17;
                    objectArray = this.c;
                    long l18 = objectArray[n14];
                    objectArray[n14] = (long)null;
                    return l18;
                }
                return null;
            }
            n4 = n4 + (n10 += 8) & n8;
        }
    }

    public final void i(int n3, Object object) {
        int n4 = this.e(n3);
        this.b[n4] = n3;
        this.c[n4] = object;
    }
}

