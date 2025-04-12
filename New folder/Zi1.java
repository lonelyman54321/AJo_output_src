/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class Zi1 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;

    public Zi1() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = aj1.a;
        this.b = (int[])objectArray;
    }

    public final boolean a(int n3) {
        Zi1 zi1 = this;
        int n4 = n3;
        int n7 = -862048943 * n3;
        int n8 = n7 << 16;
        n7 ^= n8;
        n8 = n7 & 0x7F;
        int n10 = this.c;
        n7 = n7 >>> 7 & n10;
        boolean bl2 = false;
        int n14 = 0;
        while (true) {
            block9: {
                long l2;
                block8: {
                    long l3;
                    long l4;
                    long[] lArray = zi1.a;
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
                        int[] nArray = zi1.b;
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
                    n16 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
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

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Zi1;
        if (n3 == 0) {
            return false;
        }
        object2 = (Zi1)object;
        n3 = ((Zi1)object2).d;
        int n4 = this.d;
        if (n3 != n4) {
            return false;
        }
        int[] nArray = this.b;
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
                            n16 = nArray[n16];
                            if ((n16 = (int)(((Zi1)object2).a(n16) ? 1 : 0)) == 0) {
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
            int[] nArray = this.b;
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
                                n16 = nArray[n16];
                                n3 += n16;
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

    public final String toString() {
        CharSequence charSequence;
        block7: {
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
                    long l2 = lArray[n4];
                    long l3 = l2 ^ (long)-1;
                    int n8 = 7;
                    l3 = l3 << n8 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object2 != false) {
                        Object object3;
                        int n10 = ~(n4 - n3) >>> 31;
                        int n14 = 8;
                        n10 = 8 - n10;
                        for (n8 = 0; n8 < n10; ++n8) {
                            long l8 = l2 & 0xFFL;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object4 < 0) {
                                int n15 = (n4 << 3) + n8;
                                object3 = object[n15];
                                n14 = -1;
                                if (n7 == n14) {
                                    ((StringBuilder)charSequence).append((CharSequence)string4);
                                    break block7;
                                }
                                if (n7 != 0) {
                                    ((StringBuilder)charSequence).append((CharSequence)string2);
                                }
                                ((StringBuilder)charSequence).append((int)object3);
                                ++n7;
                            }
                            object3 = 8;
                            l2 >>= object3;
                            n14 = 8;
                        }
                        object3 = 8;
                        if (n10 != object3) break;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            ((StringBuilder)charSequence).append((CharSequence)string3);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

