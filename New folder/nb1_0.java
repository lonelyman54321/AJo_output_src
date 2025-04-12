/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nB1
 */
public abstract class nb1_0 {
    public long[] a;
    public long[] b;
    public int c;
    public int d;

    public nb1_0() {
        long[] lArray = et2_1.a;
        this.a = lArray;
        lArray = ob1_0.a;
        this.b = lArray;
    }

    public final boolean a(long l2) {
        nb1_0 nb1_02 = this;
        long l3 = l2 >>> 32;
        l3 = l2 ^ l3;
        int n3 = (int)l3 * -862048943;
        int n4 = n3 << 16 ^ n3;
        n3 = n4 & 0x7F;
        int n7 = this.c;
        n4 = n4 >>> 7 & n7;
        boolean bl2 = false;
        int n8 = 0;
        while (true) {
            block9: {
                long l4;
                block8: {
                    long l7;
                    long l8;
                    long[] lArray = nb1_02.a;
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
                        long[] lArray2 = nb1_02.b;
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

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof nb1_0;
        if (n3 == 0) {
            return false;
        }
        object2 = (nb1_0)object;
        n3 = ((nb1_0)object2).d;
        int n4 = this.d;
        if (n3 != n4) {
            return false;
        }
        long[] lArray = this.b;
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
                    for (n10 = 0; n10 < n14; ++n10) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object4 < 0) {
                            int n16 = (n8 << 3) + n10;
                            l8 = lArray[n16];
                            if ((n16 = (int)(((nb1_0)object2).a(l8) ? 1 : 0)) == 0) {
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
        block5: {
            long[] lArray = this.b;
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
                                l8 = lArray[n16];
                                int n17 = 32;
                                l12 = l8 >>> n17;
                                object = (int)(l8 ^= l12);
                                n3 += object;
                            }
                            l2 >>= n15;
                        }
                        if (n14 != n15) break block5;
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

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        CharSequence charSequence;
        block9: {
            String string2 = ", ";
            Intrinsics.checkNotNullParameter(string2, "separator");
            Object object = "[";
            Intrinsics.checkNotNullParameter(object, "prefix");
            String string3 = "]";
            Intrinsics.checkNotNullParameter(string3, "postfix");
            String string4 = "...";
            Intrinsics.checkNotNullParameter(string4, "truncated");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((CharSequence)object);
            object = this.b;
            long[] lArray = this.a;
            int n3 = lArray.length + -2;
            if (n3 >= 0) {
                int n4 = 0;
                int n7 = 0;
                while (true) {
                    int n8;
                    long l2 = lArray[n4];
                    long l3 = l2 ^ (long)-1;
                    int n10 = 7;
                    l3 = l3 << n10 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object2 == false) {
                        n8 = n4;
                    } else {
                        int n14;
                        int n15 = ~(n4 - n3) >>> 31;
                        int n16 = 8;
                        n15 = 8 - n15;
                        for (n10 = 0; n10 < n15; l2 >>= n8, ++n10) {
                            long l8 = l2 & 0xFFL;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object3 < 0) {
                                int n17 = (n4 << 3) + n10;
                                n14 = n4;
                                Object object4 = object[n17];
                                n16 = -1;
                                if (n7 == n16) {
                                    ((StringBuilder)charSequence).append((CharSequence)string4);
                                    break block9;
                                }
                                if (n7 != 0) {
                                    ((StringBuilder)charSequence).append((CharSequence)string2);
                                }
                                ((StringBuilder)charSequence).append((long)object4);
                                ++n7;
                            } else {
                                n14 = n4;
                            }
                            n8 = 8;
                            n4 = n14;
                            n16 = 8;
                        }
                        n14 = n4;
                        n8 = 8;
                        if (n15 != n8) break;
                        n8 = n4;
                    }
                    if (n8 == n3) break;
                    n4 = n8 + 1;
                }
            }
            ((StringBuilder)charSequence).append((CharSequence)string3);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

