/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/*
 * Renamed from PR1$a
 */
public final class pr1$a_0
extends fT2$a
implements KMutableSet {
    public final /* synthetic */ pr1_1 b;

    public pr1$a_0(pr1_1 pr1_12) {
        this.b = pr1_12;
        super(pr1_12);
    }

    public final boolean add(Object object) {
        return this.b.d(object);
    }

    public final boolean addAll(Collection object) {
        boolean bl2;
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(object, string2);
        object = (Iterable)object;
        pr1_1 pr1_12 = this.b;
        pr1_12.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = pr1_12.d;
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            int n4 = pr1_12.f(string2);
            Object[] objectArray = pr1_12.b;
            objectArray[n4] = string2;
        }
        int n7 = pr1_12.d;
        if (n3 != n7) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        return n7 != 0;
    }

    public final void clear() {
        this.b.e();
    }

    public final Iterator iterator() {
        pr1_1 pr1_12 = this.b;
        PR1$a$a pR1$a$a = new PR1$a$a(pr1_12);
        return pR1$a$a;
    }

    public final boolean remove(Object object) {
        return this.b.j(object);
    }

    public final boolean removeAll(Collection collection) {
        int n3;
        Object object = collection;
        Intrinsics.checkNotNullParameter(collection, "elements");
        pr1_1 pr1_12 = this.b;
        int n4 = pr1_12.d;
        object = collection.iterator();
        block0: while (true) {
            int n7;
            boolean bl2 = object.hasNext();
            n3 = 1;
            int n8 = 0;
            if (!bl2) break;
            Object e2 = object.next();
            if (e2 != null) {
                pr1_12.getClass();
                n7 = e2.hashCode();
            } else {
                n7 = 0;
            }
            int n10 = (n7 *= -862048943) << 16;
            n7 ^= n10;
            n10 = n7 & 0x7F;
            int n14 = pr1_12.c;
            n7 = n7 >>> 7 & n14;
            while (true) {
                int n15;
                block11: {
                    long l2;
                    block10: {
                        long l3;
                        long l4;
                        long[] lArray = pr1_12.a;
                        int n16 = n7 >> 3;
                        int n17 = (n7 & 7) << 3;
                        long l7 = lArray[n16] >>> n17;
                        long l8 = lArray[n16 += n3];
                        int n18 = 64 - n17;
                        long l12 = l8 << n18;
                        n15 = n8;
                        long l14 = -((long)n17);
                        n17 = 63;
                        l14 = l14 >> n17 & l12 | l7;
                        l12 = n10;
                        long l15 = 0x101010101010101L;
                        l12 = l12 * l15 ^ l14;
                        l15 = l12 - l15;
                        l12 = (l12 ^ (long)-1) & l15;
                        l15 = -9187201950435737472L;
                        l12 &= l15;
                        while ((l2 = (l4 = l12 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                            l2 = (Long.numberOfTrailingZeros(l12) >> 3) + n7 & n14;
                            Object object2 = pr1_12.b[l2];
                            n17 = (int)(Intrinsics.areEqual(object2, e2) ? 1 : 0);
                            if (n17 == 0) {
                                l15 = l12 - 1L;
                                l12 &= l15;
                                l15 = -9187201950435737472L;
                                continue;
                            }
                            break block10;
                        }
                        l12 = l14 ^ (long)-1;
                        n17 = 6;
                        l14 &= (l12 <<= n17);
                        l12 = -9187201950435737472L;
                        long l16 = (l14 &= l12) - l3;
                        n18 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                        if (n18 == 0) break block11;
                        l2 = -1;
                    }
                    if (l2 < 0) continue block0;
                    pr1_12.k((int)l2);
                    continue block0;
                }
                n8 = n15 + 8;
                n7 = n7 + n8 & n14;
                n3 = 1;
            }
            break;
        }
        int n19 = pr1_12.d;
        n3 = n4 != n19 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean retainAll(Collection collection) {
        boolean bl2;
        block5: {
            float f5;
            Collection collection2 = collection;
            Intrinsics.checkNotNullParameter(collection, "elements");
            pr1_1 pr1_12 = this.b;
            long[] lArray = pr1_12.a;
            int n3 = lArray.length + -2;
            boolean bl3 = false;
            float f6 = 0.0f;
            if (n3 >= 0) {
                int n4 = 0;
                bl2 = false;
                f5 = 0.0f;
                while (true) {
                    long l2 = lArray[n4];
                    long l3 = l2 ^ (long)-1;
                    int n7 = 7;
                    l3 = l3 << n7 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object != false) {
                        int n8 = ~(n4 - n3) >>> 31;
                        int n10 = 8;
                        n8 = 8 - n8;
                        for (n7 = 0; n7 < n8; ++n7) {
                            int n14;
                            Object object2;
                            long l8 = 0xFFL & l2;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object3 < 0 && (object = (Object)collection2.contains(object2 = pr1_12.b[n14 = (n4 << 3) + n7])) == false) {
                                pr1_12.k(n14);
                                bl2 = true;
                                f5 = Float.MIN_VALUE;
                            }
                            l2 >>= n10;
                        }
                        if (n8 != n10) break block5;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
                bl3 = bl2;
                f6 = f5;
            }
            bl2 = bl3;
            f5 = f6;
        }
        return bl2;
    }
}

