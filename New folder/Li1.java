/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public abstract class Li1 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;

    public Li1() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = aj1.a;
        this.b = (int[])objectArray;
        this.c = (int[])objectArray;
    }

    public final int a(int n3) {
        int n4 = -862048943 * n3;
        int n7 = n4 << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 = n4 >>> 7 & n8;
        int n10 = 0;
        while (true) {
            long l2;
            long l3;
            long l4;
            long[] lArray = this.a;
            int n14 = n4 >> 3;
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
                int[] nArray = this.b;
                int n17 = (Long.numberOfTrailingZeros(l14) >> 3) + n4 & n8;
                int n18 = nArray[n17];
                if (n18 == n3) {
                    return n17;
                }
                l2 = l14 - 1L;
                l14 &= l2;
            }
            l14 = l12 ^ (long)-1;
            l4 = 6;
            long l16 = (l12 = l12 & (l14 <<= l4) & l15) - l2;
            n15 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (n15 != 0) {
                return -1;
            }
            n4 = n4 + (n10 += 8) & n8;
        }
    }

    public final int b(int n3) {
        int n4 = this.a(n3);
        if (n4 >= 0) {
            return this.c[n4];
        }
        String string2 = hj0_0.a(n3, "Cannot find value for key ");
        NoSuchElementException noSuchElementException = new NoSuchElementException(string2);
        throw noSuchElementException;
    }

    public final int c(int n3) {
        if ((n3 = this.a(n3)) >= 0) {
            return this.c[n3];
        }
        return -1;
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Li1;
        if (n3 == 0) {
            return false;
        }
        object2 = (Li1)object;
        n3 = ((Li1)object2).e;
        int n4 = this.e;
        if (n3 != n4) {
            return false;
        }
        int[] nArray = this.b;
        int[] nArray2 = this.c;
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
                            int n16 = (n8 << 3) + n10;
                            l8 = nArray[n16];
                            if ((n16 = nArray2[n16]) != (l8 = (long)((Li1)object2).b((int)l8))) {
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
            int[] nArray2 = this.c;
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
                                n16 = nArray2[n16] ^ l8;
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
        Li1 li1 = this;
        int n3 = this.e;
        if (n3 == 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder("{");
        int[] nArray = this.b;
        int[] nArray2 = this.c;
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
                            n16 = nArray2[n16];
                            ((StringBuilder)charSequence).append((int)l8);
                            String string2 = "=";
                            ((StringBuilder)charSequence).append(string2);
                            ((StringBuilder)charSequence).append(n16);
                            n16 = li1.e;
                            if (++n8 < n16) {
                                String string3 = ", ";
                                ((StringBuilder)charSequence).append(string3);
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

