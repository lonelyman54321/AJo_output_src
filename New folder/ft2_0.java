/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fT2
 */
public abstract class ft2_0 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public ft2_0() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = A62.c;
        this.b = objectArray;
    }

    public final boolean a(Object object) {
        ft2_0 ft2_02 = this;
        Object object2 = object;
        boolean bl2 = false;
        int n3 = object != null ? object.hashCode() : 0;
        int n4 = (n3 *= -862048943) << 16;
        n3 ^= n4;
        n4 = n3 & 0x7F;
        int n7 = ft2_02.c;
        n3 = n3 >>> 7 & n7;
        int n8 = 0;
        while (true) {
            block9: {
                long l2;
                block8: {
                    long l3;
                    long l4;
                    long[] lArray = ft2_02.a;
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
                        Object object3 = ft2_02.b[l2];
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

    public final boolean b() {
        int n3 = this.d;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean c() {
        int n3 = this.d;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        Object object2 = object;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof ft2_0;
        if (n3 == 0) {
            return false;
        }
        object2 = (ft2_0)object;
        n3 = ((ft2_0)object2).d;
        int n4 = this.d;
        if (n3 != n4) {
            return false;
        }
        Object[] objectArray = this.b;
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
                            if ((n16 = (int)(((ft2_0)object2).a(object5) ? 1 : 0)) == 0) {
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
            Object[] objectArray = this.b;
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
                                if (object3 != null) {
                                    n16 = object3.hashCode();
                                } else {
                                    n16 = 0;
                                    object3 = null;
                                }
                                n3 += n16;
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
        StringBuilder stringBuilder;
        Object object;
        block7: {
            object = this;
            ft2$b_0 ft2$b_0 = new ft2$b_0(this);
            String string2 = ", ";
            Intrinsics.checkNotNullParameter(string2, "separator");
            Object[] objectArray = "[";
            Intrinsics.checkNotNullParameter(objectArray, "prefix");
            String string3 = "]";
            Intrinsics.checkNotNullParameter(string3, "postfix");
            String string4 = "...";
            Intrinsics.checkNotNullParameter(string4, "truncated");
            stringBuilder = new StringBuilder();
            stringBuilder.append((CharSequence)objectArray);
            objectArray = this.b;
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
                        int n10;
                        int n14 = ~(n4 - n3) >>> 31;
                        n14 = 8 - n14;
                        for (int i3 = 0; i3 < n14; ++i3) {
                            long l8 = l2 & 0xFFL;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object3 < 0) {
                                int n15 = (n4 << 3) + i3;
                                Object object4 = objectArray[n15];
                                n10 = -1;
                                if (n7 == n10) {
                                    stringBuilder.append((CharSequence)string4);
                                    break block7;
                                }
                                if (n7 != 0) {
                                    stringBuilder.append((CharSequence)string2);
                                }
                                object = (CharSequence)ft2$b_0.invoke(object4);
                                stringBuilder.append((CharSequence)object);
                                ++n7;
                            }
                            n10 = 8;
                            l2 >>= n10;
                            object = this;
                        }
                        n10 = 8;
                        if (n14 != n10) break;
                    }
                    if (n4 == n3) break;
                    ++n4;
                    object = this;
                }
            }
            stringBuilder.append((CharSequence)string3);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }
}

