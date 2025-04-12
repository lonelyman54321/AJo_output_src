/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class eB1 {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;

    public eB1() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = ob1_0.a;
        this.b = objectArray;
        objectArray = A62.c;
        this.c = objectArray;
    }

    public final boolean a(long l2) {
        eB1 eB12 = this;
        long l3 = l2 >>> 32;
        l3 = l2 ^ l3;
        int n3 = (int)l3 * -862048943;
        int n4 = n3 << 16 ^ n3;
        n3 = n4 & 0x7F;
        int n7 = this.d;
        n4 = n4 >>> 7 & n7;
        boolean bl2 = false;
        int n8 = 0;
        while (true) {
            block9: {
                long l4;
                block8: {
                    long l7;
                    long l8;
                    long[] lArray = eB12.a;
                    int n10 = n4 >> 3;
                    int n14 = (n4 & 7) << 3;
                    long l12 = lArray[n10] >>> n14;
                    int n15 = 1;
                    long l14 = lArray[n10 += n15];
                    int n16 = 64 - n14;
                    long l15 = l14 << n16;
                    l14 = -((long)n14);
                    n14 = 63;
                    l15 = l15 & (l14 >>= n14) | l12;
                    long l16 = n3;
                    l14 = 0x101010101010101L;
                    l16 = l16 * l14 ^ l15;
                    l14 = l16 - l14;
                    l16 = (l16 ^ (long)-1) & l14;
                    l14 = -9187201950435737472L;
                    l16 &= l14;
                    while ((l4 = (l8 = l16 - (l7 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                        long[] lArray2 = eB12.b;
                        l4 = (Long.numberOfTrailingZeros(l16) >> 3) + n4 & n7;
                        long l17 = lArray2[l4];
                        long l18 = l17 - l2;
                        Object object = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                        if (object != false) {
                            l7 = l16 - 1L;
                            l16 &= l7;
                            continue;
                        }
                        break block8;
                    }
                    l16 = l15 ^ (long)-1;
                    l4 = 6;
                    long l19 = (l15 = l15 & (l16 <<= l4) & l14) - l7;
                    n14 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                    if (n14 == 0) break block9;
                    l4 = -1;
                }
                if (l4 >= 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n4 = n4 + (n8 += 8) & n7;
        }
    }

    public final Object b(long l2) {
        eB1 eB12 = this;
        long l3 = l2 >>> 32;
        l3 = l2 ^ l3;
        int n3 = (int)l3 * -862048943;
        int n4 = n3 << 16 ^ n3;
        n3 = n4 & 0x7F;
        int n7 = this.d;
        n4 = n4 >>> 7 & n7;
        int n8 = 0;
        while (true) {
            block10: {
                Object object;
                int n10;
                block9: {
                    long l4;
                    long l7;
                    long l8;
                    long[] lArray = eB12.a;
                    int n14 = n4 >> 3;
                    int n15 = (n4 & 7) << 3;
                    long l12 = lArray[n14] >>> n15;
                    long l14 = lArray[++n14];
                    int n16 = 64 - n15;
                    long l15 = l14 << n16;
                    l14 = -((long)n15);
                    n15 = 63;
                    l15 = l15 & (l14 >>= n15) | l12;
                    long l16 = n3;
                    long l17 = 0x101010101010101L;
                    l16 = l16 * l17 ^ l15;
                    l17 = l16 - l17;
                    l16 = (l16 ^ (long)-1) & l17;
                    l17 = -9187201950435737472L;
                    l16 &= l17;
                    while ((l8 = (l7 = l16 - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                        long[] lArray2 = eB12.b;
                        n10 = (Long.numberOfTrailingZeros(l16) >> 3) + n4 & n7;
                        long l18 = lArray2[n10];
                        long l19 = l18 - l2;
                        Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                        if (object2 != false) {
                            l4 = l16 - 1L;
                            l16 &= l4;
                            continue;
                        }
                        break block9;
                    }
                    l16 = l15 ^ (long)-1;
                    l8 = 6;
                    long l20 = (l15 = l15 & (l16 <<= l8) & l17) - l4;
                    n15 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
                    if (n15 == 0) break block10;
                    n10 = -1;
                }
                if (n10 >= 0) {
                    object = eB12.c[n10];
                } else {
                    n4 = 0;
                    object = null;
                }
                return object;
            }
            n4 = n4 + (n8 += 8) & n7;
        }
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof eB1;
        if (n3 == 0) {
            return false;
        }
        object2 = (eB1)object;
        n3 = ((eB1)object2).e;
        int n4 = this.e;
        if (n3 != n4) {
            return false;
        }
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray2 = this.a;
        int n7 = lArray2.length + -2;
        if (n7 >= 0) {
            int n8 = 0;
            while (true) {
                long l2 = lArray2[n8];
                long l3 = l2 ^ (long)-1;
                int n10 = 7;
                l3 = l3 << n10 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object3 != false) {
                    int n14 = ~(n8 - n7) >>> 31;
                    int n15 = 8;
                    n14 = 8 - n14;
                    n10 = 0;
                    while (n10 < n14) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object4 < 0) {
                            Object object5;
                            int n16 = (n8 << 3) + n10;
                            object3 = n10;
                            long l15 = lArray[n16];
                            Object object6 = objectArray[n16];
                            if (object6 == null ? (object6 = ((eB1)object2).b(l15)) != null || (n15 = (int)(((eB1)object2).a(l15) ? 1 : 0)) == 0 : (n15 = (int)(Intrinsics.areEqual(object6, object5 = ((eB1)object2).b(l15)) ? 1 : 0)) == 0) {
                                return false;
                            }
                            n15 = 8;
                        } else {
                            object3 = n10;
                        }
                        l2 >>= n15;
                        n10 = (int)(object3 + true);
                    }
                    if (n14 != n15) break;
                }
                if (n8 == n7) break;
                ++n8;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        block7: {
            long[] lArray = this.b;
            Object[] objectArray = this.c;
            long[] lArray2 = this.a;
            int n4 = lArray2.length + -2;
            int n7 = 0;
            if (n4 >= 0) {
                int n8 = 0;
                n3 = 0;
                while (true) {
                    long l2 = lArray2[n8];
                    long l3 = l2 ^ (long)-1;
                    int n10 = 7;
                    l3 = l3 << n10 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object != false) {
                        int n14 = ~(n8 - n4) >>> 31;
                        int n15 = 8;
                        n14 = 8 - n14;
                        for (n10 = 0; n10 < n14; ++n10) {
                            long l8 = 0xFFL & l2;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object2 < 0) {
                                int n16 = (n8 << 3) + n10;
                                long l15 = lArray[n16];
                                Object object3 = objectArray[n16];
                                int n17 = 32;
                                long l16 = l15 >>> n17;
                                int n18 = (int)(l15 ^= l16);
                                if (object3 != null) {
                                    n16 = object3.hashCode();
                                } else {
                                    n16 = 0;
                                    object3 = null;
                                }
                                n3 += (n16 ^= n18);
                            }
                            l2 >>= n15;
                        }
                        if (n14 != n15) break block7;
                    }
                    if (n8 == n4) break;
                    ++n8;
                }
                n7 = n3;
            }
            n3 = n7;
        }
        return n3;
    }

    public final String toString() {
        eB1 eB12 = this;
        int n3 = this.e;
        if (n3 == 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder("{");
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray2 = this.a;
        int n4 = lArray2.length + -2;
        if (n4 >= 0) {
            int n7 = 0;
            int n8 = 0;
            while (true) {
                int n10;
                long l2 = lArray2[n7];
                long l3 = l2 ^ (long)-1;
                int n14 = 7;
                l3 = l3 << n14 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object != false) {
                    int n15;
                    int n16 = ~(n7 - n4) >>> 31;
                    int n17 = 8;
                    n16 = 8 - n16;
                    for (n14 = 0; n14 < n16; ++n14) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object2 < 0) {
                            int n18 = (n7 << 3) + n14;
                            n15 = n7;
                            long l15 = lArray[n18];
                            Object object3 = objectArray[n18];
                            ((StringBuilder)charSequence).append(l15);
                            String string2 = "=";
                            ((StringBuilder)charSequence).append(string2);
                            if (object3 == eB12) {
                                object3 = "(this)";
                            }
                            ((StringBuilder)charSequence).append(object3);
                            n10 = eB12.e;
                            if (++n8 < n10) {
                                string2 = ", ";
                                ((StringBuilder)charSequence).append(string2);
                            }
                        } else {
                            n15 = n7;
                        }
                        l2 >>= n17;
                        n7 = n15;
                    }
                    n15 = n7;
                    if (n16 != n17) break;
                    n10 = n7;
                } else {
                    n10 = n7;
                }
                if (n10 == n4) break;
                n7 = n10 + 1;
            }
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "s.append('}').toString()");
        return charSequence;
    }
}

