/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class Qi1 {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;

    public Qi1() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = aj1.a;
        this.b = (int[])objectArray;
        objectArray = A62.c;
        this.c = objectArray;
    }

    public final boolean a(int n3) {
        Qi1 qi1 = this;
        int n4 = n3;
        int n7 = -862048943 * n3;
        int n8 = n7 << 16;
        n7 ^= n8;
        n8 = n7 & 0x7F;
        int n10 = this.d;
        n7 = n7 >>> 7 & n10;
        boolean bl2 = false;
        int n14 = 0;
        while (true) {
            block9: {
                long l2;
                block8: {
                    long l3;
                    long l4;
                    long[] lArray = qi1.a;
                    int n15 = n7 >> 3;
                    int n16 = (n7 & 7) << 3;
                    long l7 = lArray[n15] >>> n16;
                    int n17 = 1;
                    long l8 = lArray[n15 += n17];
                    int n18 = 64 - n16;
                    long l12 = l8 << n18;
                    l8 = -((long)n16);
                    n16 = 63;
                    l12 = l12 & (l8 >>= n16) | l7;
                    long l14 = n8;
                    l8 = 0x101010101010101L;
                    l14 = l14 * l8 ^ l12;
                    l8 = l14 - l8;
                    l14 = (l14 ^ (long)-1) & l8;
                    l8 = -9187201950435737472L;
                    l14 &= l8;
                    while ((l2 = (l4 = l14 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                        int[] nArray = qi1.b;
                        l2 = (Long.numberOfTrailingZeros(l14) >> 3) + n7 & n10;
                        int n19 = nArray[l2];
                        if (n19 != n4) {
                            l3 = l14 - 1L;
                            l14 &= l3;
                            continue;
                        }
                        break block8;
                    }
                    l14 = l12 ^ (long)-1;
                    l2 = 6;
                    long l15 = (l12 = l12 & (l14 <<= l2) & l8) - l3;
                    n16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (n16 == 0) break block9;
                    l2 = -1;
                }
                if (l2 >= 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n7 = n7 + (n14 += 8) & n10;
        }
    }

    public final boolean b(int n3) {
        Qi1 qi1 = this;
        int n4 = n3;
        int n7 = -862048943 * n3;
        int n8 = n7 << 16;
        n7 ^= n8;
        n8 = n7 & 0x7F;
        int n10 = this.d;
        n7 = n7 >>> 7 & n10;
        boolean bl2 = false;
        int n14 = 0;
        while (true) {
            block9: {
                long l2;
                block8: {
                    long l3;
                    long l4;
                    long[] lArray = qi1.a;
                    int n15 = n7 >> 3;
                    int n16 = (n7 & 7) << 3;
                    long l7 = lArray[n15] >>> n16;
                    int n17 = 1;
                    long l8 = lArray[n15 += n17];
                    int n18 = 64 - n16;
                    long l12 = l8 << n18;
                    l8 = -((long)n16);
                    n16 = 63;
                    l12 = l12 & (l8 >>= n16) | l7;
                    long l14 = n8;
                    l8 = 0x101010101010101L;
                    l14 = l14 * l8 ^ l12;
                    l8 = l14 - l8;
                    l14 = (l14 ^ (long)-1) & l8;
                    l8 = -9187201950435737472L;
                    l14 &= l8;
                    while ((l2 = (l4 = l14 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                        int[] nArray = qi1.b;
                        l2 = (Long.numberOfTrailingZeros(l14) >> 3) + n7 & n10;
                        int n19 = nArray[l2];
                        if (n19 != n4) {
                            l3 = l14 - 1L;
                            l14 &= l3;
                            continue;
                        }
                        break block8;
                    }
                    l14 = l12 ^ (long)-1;
                    l2 = 6;
                    long l15 = (l12 = l12 & (l14 <<= l2) & l8) - l3;
                    n16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (n16 == 0) break block9;
                    l2 = -1;
                }
                if (l2 >= 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n7 = n7 + (n14 += 8) & n10;
        }
    }

    public final Object c(int n3) {
        int n4 = -862048943 * n3;
        int n7 = n4 << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 = n4 >>> 7 & n8;
        int n10 = 0;
        while (true) {
            block10: {
                Object object;
                int n14;
                block9: {
                    long l2;
                    long l3;
                    long l4;
                    long[] lArray = this.a;
                    int n15 = n4 >> 3;
                    int n16 = (n4 & 7) << 3;
                    long l7 = lArray[n15] >>> n16;
                    long l8 = lArray[++n15];
                    int n17 = 64 - n16;
                    long l12 = l8 << n17;
                    l8 = -((long)n16);
                    n16 = 63;
                    l12 = l12 & (l8 >>= n16) | l7;
                    long l14 = n7;
                    long l15 = 0x101010101010101L;
                    l14 = l14 * l15 ^ l12;
                    l15 = l14 - l15;
                    l14 = (l14 ^ (long)-1) & l15;
                    l15 = -9187201950435737472L;
                    l14 &= l15;
                    while ((l4 = (l3 = l14 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                        int[] nArray = this.b;
                        n14 = (Long.numberOfTrailingZeros(l14) >> 3) + n4 & n8;
                        int n18 = nArray[n14];
                        if (n18 != n3) {
                            l2 = l14 - 1L;
                            l14 &= l2;
                            continue;
                        }
                        break block9;
                    }
                    l14 = l12 ^ (long)-1;
                    l4 = 6;
                    long l16 = (l12 = l12 & (l14 <<= l4) & l15) - l2;
                    n16 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (n16 == 0) break block10;
                    n14 = -1;
                }
                if (n14 >= 0) {
                    object = this.c[n14];
                } else {
                    n3 = 0;
                    object = null;
                }
                return object;
            }
            n4 = n4 + (n10 += 8) & n8;
        }
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Qi1;
        if (n3 == 0) {
            return false;
        }
        object2 = (Qi1)object;
        n3 = ((Qi1)object2).e;
        int n4 = this.e;
        if (n3 != n4) {
            return false;
        }
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray = this.a;
        int n7 = lArray.length + -2;
        if (n7 >= 0) {
            int n8 = 0;
            while (true) {
                long l2 = lArray[n8];
                long l3 = l2 ^ (long)-1;
                int n10 = 7;
                l3 = l3 << n10 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (l8 != false) {
                    int n14 = ~(n8 - n7) >>> 31;
                    int n15 = 8;
                    n14 = 8 - n14;
                    for (n10 = 0; n10 < n14; ++n10) {
                        long l12 = 0xFFL & l2;
                        long l14 = 128L;
                        long l15 = l12 - l14;
                        long l16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (l16 < 0) {
                            Object object3;
                            int n16 = (n8 << 3) + n10;
                            l8 = nArray[n16];
                            Object object4 = objectArray[n16];
                            if (object4 == null ? (object4 = ((Qi1)object2).c((int)l8)) != null || (n16 = (int)(((Qi1)object2).b((int)l8) ? 1 : 0)) == 0 : (n16 = (int)(Intrinsics.areEqual(object4, object3 = ((Qi1)object2).c((int)l8)) ? 1 : 0)) == 0) {
                                return false;
                            }
                        }
                        l2 >>= n15;
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
            int[] nArray = this.b;
            Object[] objectArray = this.c;
            long[] lArray = this.a;
            int n4 = lArray.length + -2;
            int n7 = 0;
            if (n4 >= 0) {
                int n8 = 0;
                n3 = 0;
                while (true) {
                    long l2 = lArray[n8];
                    long l3 = l2 ^ (long)-1;
                    int n10 = 7;
                    l3 = l3 << n10 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (l8 != false) {
                        int n14 = ~(n8 - n4) >>> 31;
                        int n15 = 8;
                        n14 = 8 - n14;
                        for (n10 = 0; n10 < n14; ++n10) {
                            long l12 = 0xFFL & l2;
                            long l14 = 128L;
                            long l15 = l12 - l14;
                            long l16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                            if (l16 < 0) {
                                int n16 = (n8 << 3) + n10;
                                l8 = nArray[n16];
                                Object object = objectArray[n16];
                                if (object != null) {
                                    n16 = object.hashCode();
                                } else {
                                    n16 = 0;
                                    object = null;
                                }
                                n3 += (n16 ^= l8);
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
        Qi1 qi1 = this;
        int n3 = this.e;
        if (n3 == 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder("{");
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray = this.a;
        int n4 = lArray.length + -2;
        if (n4 >= 0) {
            int n7 = 0;
            int n8 = 0;
            while (true) {
                long l2 = lArray[n7];
                long l3 = l2 ^ (long)-1;
                int n10 = 7;
                l3 = l3 << n10 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (l8 != false) {
                    int n14 = ~(n7 - n4) >>> 31;
                    int n15 = 8;
                    n14 = 8 - n14;
                    for (n10 = 0; n10 < n14; ++n10) {
                        long l12 = 0xFFL & l2;
                        long l14 = 128L;
                        long l15 = l12 - l14;
                        long l16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (l16 < 0) {
                            int n16 = (n7 << 3) + n10;
                            l8 = nArray[n16];
                            Object object = objectArray[n16];
                            ((StringBuilder)charSequence).append((int)l8);
                            String string2 = "=";
                            ((StringBuilder)charSequence).append(string2);
                            if (object == qi1) {
                                object = "(this)";
                            }
                            ((StringBuilder)charSequence).append(object);
                            n16 = qi1.e;
                            if (++n8 < n16) {
                                object = ", ";
                                ((StringBuilder)charSequence).append((String)object);
                            }
                        }
                        l2 >>= n15;
                    }
                    if (n14 != n15) break;
                }
                if (n7 == n4) break;
                ++n7;
            }
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "s.append('}').toString()");
        return charSequence;
    }
}

