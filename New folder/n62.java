/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public abstract class n62 {
    public long[] a;
    public Object[] b;
    public long[] c;
    public int d;
    public int e;

    public n62() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = A62.c;
        this.b = objectArray;
        objectArray = ob1_0.a;
        this.c = objectArray;
    }

    public final int a(Object object) {
        int n3 = 0;
        int n4 = object != null ? object.hashCode() : 0;
        int n7 = (n4 *= -862048943) << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 >>>= 7;
        while (true) {
            long l2;
            long l3;
            long l4;
            long[] lArray = this.a;
            int n10 = (n4 &= n8) >> 3;
            int n14 = (n4 & 7) << 3;
            long l7 = lArray[n10] >>> n14;
            long l8 = lArray[++n10];
            int n15 = 64 - n14;
            long l12 = l8 << n15;
            l8 = -((long)n14);
            n14 = 63;
            l12 = l12 & (l8 >>= n14) | l7;
            long l14 = n7;
            long l15 = 0x101010101010101L;
            l14 = l14 * l15 ^ l12;
            l15 = l14 - l15;
            l14 = (l14 ^ (long)-1) & l15;
            l15 = -9187201950435737472L;
            l14 &= l15;
            while ((l4 = (l3 = l14 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                int n16 = (Long.numberOfTrailingZeros(l14) >> 3) + n4 & n8;
                Object object2 = this.b[n16];
                boolean bl2 = Intrinsics.areEqual(object2, object);
                if (bl2) {
                    return n16;
                }
                l2 = l14 - 1L;
                l14 &= l2;
            }
            l14 = l12 ^ (long)-1;
            l4 = 6;
            long l16 = (l12 = l12 & (l14 <<= l4) & l15) - l2;
            n14 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
            if (n14 != 0) {
                return -1;
            }
            n4 += (n3 += 8);
        }
    }

    public final long b(Object object) {
        int n3 = this.a(object);
        if (n3 >= 0) {
            return this.c[n3];
        }
        StringBuilder stringBuilder = new StringBuilder("There is no key ");
        stringBuilder.append(object);
        stringBuilder.append(" in the map");
        object = stringBuilder.toString();
        NoSuchElementException noSuchElementException = new NoSuchElementException((String)object);
        throw noSuchElementException;
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof n62;
        if (n3 == 0) {
            return false;
        }
        object2 = (n62)object;
        n3 = ((n62)object2).e;
        int n4 = this.e;
        if (n3 != n4) {
            return false;
        }
        Object[] objectArray = this.b;
        long[] lArray = this.c;
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
                        Object object4;
                        int n16;
                        long l8;
                        long l12 = 0xFFL & l2;
                        long l14 = 128L;
                        long l15 = l12 - l14;
                        Object object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object5 < 0 && (object5 = (l8 = (l14 = lArray[n16 = (n8 << 3) + n10]) - (l12 = ((n62)object2).b(object4 = objectArray[n16]))) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                            return false;
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
            Object[] objectArray = this.b;
            long[] lArray = this.c;
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
                                Object object3 = objectArray[n16];
                                l12 = lArray[n16];
                                n16 = object3 != null ? object3.hashCode() : 0;
                                object = 32;
                                long l15 = l12 >>> object;
                                long l16 = l12 ^ l15;
                                int n17 = (int)l16;
                                n3 += (n16 ^= n17);
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
        n62 n622 = this;
        int n3 = this.e;
        if (n3 == 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder("{");
        Object[] objectArray = this.b;
        long[] lArray = this.c;
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
                            Object object3 = objectArray[n18];
                            n15 = n7;
                            long l15 = lArray[n18];
                            if (object3 == n622) {
                                object3 = "(this)";
                            }
                            ((StringBuilder)charSequence).append(object3);
                            String string2 = "=";
                            ((StringBuilder)charSequence).append(string2);
                            ((StringBuilder)charSequence).append(l15);
                            n10 = n622.e;
                            if (++n8 < n10) {
                                String string3 = ", ";
                                ((StringBuilder)charSequence).append(string3);
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

