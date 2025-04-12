/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dT2
 */
public abstract class dt2_0 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;

    public dt2_0() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = A62.c;
        this.b = objectArray;
        this.c = objectArray;
    }

    public final boolean a(Object object) {
        dt2_0 dt2_02 = this;
        Object object2 = object;
        boolean bl2 = false;
        int n3 = object != null ? object.hashCode() : 0;
        int n4 = (n3 *= -862048943) << 16;
        n3 ^= n4;
        n4 = n3 & 0x7F;
        int n7 = dt2_02.d;
        n3 = n3 >>> 7 & n7;
        int n8 = 0;
        while (true) {
            block9: {
                long l2;
                block8: {
                    long l3;
                    long l4;
                    long[] lArray = dt2_02.a;
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
                        Object object3 = dt2_02.b[l2];
                        boolean bl3 = Intrinsics.areEqual(object3, object2);
                        if (!bl3) {
                            l3 = l14 - 1L;
                            l14 &= l3;
                            continue;
                        }
                        break block8;
                    }
                    l14 = l12 ^ (long)-1;
                    l2 = 6;
                    long l15 = (l12 = l12 & (l14 <<= l2) & l8) - l3;
                    n14 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                    if (n14 == 0) break block9;
                    l2 = -1;
                }
                if (l2 >= 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = n3 + (n8 += 8) & n7;
        }
    }

    public final Object b(Object object) {
        int n3 = 0;
        int n4 = object != null ? object.hashCode() : 0;
        int n7 = (n4 *= -862048943) << 16;
        n4 ^= n7;
        n7 = n4 & 0x7F;
        int n8 = this.d;
        n4 >>>= 7;
        while (true) {
            block8: {
                int n10;
                block7: {
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
                        break block7;
                    }
                    l14 = l12 ^ (long)-1;
                    l4 = 6;
                    long l16 = (l12 = l12 & (l14 <<= l4) & l15) - l2;
                    n15 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n15 == 0) break block8;
                    n10 = -1;
                }
                object = n10 >= 0 ? this.c[n10] : null;
                return object;
            }
            n4 += (n3 += 8);
        }
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof dt2_0;
        if (n3 == 0) {
            return false;
        }
        object2 = (dt2_0)object;
        n3 = ((dt2_0)object2).e;
        int n4 = this.e;
        if (n3 != n4) {
            return false;
        }
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
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
                            Object object5 = objectArray[n16];
                            Object object6 = objectArray2[n16];
                            if (object6 == null ? (object6 = ((dt2_0)object2).b(object5)) != null || (n16 = (int)(((dt2_0)object2).a(object5) ? 1 : 0)) == 0 : (n16 = (int)(Intrinsics.areEqual(object6, object5 = ((dt2_0)object2).b(object5)) ? 1 : 0)) == 0) {
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
        block9: {
            Object[] objectArray = this.b;
            Object[] objectArray2 = this.c;
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
                                Object object3 = objectArray[n16];
                                Object object4 = objectArray2[n16];
                                if (object3 != null) {
                                    object = object3.hashCode();
                                } else {
                                    object = 0;
                                    object3 = null;
                                }
                                if (object4 != null) {
                                    n16 = object4.hashCode();
                                } else {
                                    n16 = 0;
                                    object4 = null;
                                }
                                n3 += (n16 ^= object);
                            }
                            l2 >>= n15;
                        }
                        if (n14 != n15) break block9;
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
        dt2_0 dt2_02 = this;
        int n3 = this.e;
        if (n3 == 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder("{");
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
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
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object != false) {
                    int n14 = ~(n7 - n4) >>> 31;
                    int n15 = 8;
                    n14 = 8 - n14;
                    for (n10 = 0; n10 < n14; ++n10) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object2 < 0) {
                            int n16 = (n7 << 3) + n10;
                            Object object3 = objectArray[n16];
                            Object object4 = objectArray2[n16];
                            String string2 = "(this)";
                            if (object3 == dt2_02) {
                                object3 = string2;
                            }
                            ((StringBuilder)charSequence).append(object3);
                            object3 = "=";
                            ((StringBuilder)charSequence).append((String)object3);
                            if (object4 == dt2_02) {
                                object4 = string2;
                            }
                            ((StringBuilder)charSequence).append(object4);
                            n16 = dt2_02.e;
                            if (++n8 < n16) {
                                object4 = ", ";
                                ((StringBuilder)charSequence).append((String)object4);
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

