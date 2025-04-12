/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.c;

/*
 * Renamed from NG1
 */
public final class ng1_2
implements Map,
Serializable,
KMutableMap {
    public static final ng1$a_0 n;
    public static final ng1_2 o;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public pg1_2 j;
    public qg1_2 k;
    public og1_2 l;
    public boolean m;

    static {
        Object object = new ng1$a_0(null);
        n = object;
        object = new ng1_2(0);
        ((ng1_2)object).m = true;
        o = object;
    }

    public ng1_2() {
        this(8);
    }

    public ng1_2(int n3) {
        if (n3 >= 0) {
            Object[] objectArray = new Object[n3];
            int[] nArray = new int[n3];
            ng1$a_0 ng1$a_0 = n;
            ng1$a_0.getClass();
            int n4 = 1;
            if (n3 < n4) {
                n3 = 1;
            }
            n3 = Integer.highestOneBit(n3 * 3);
            int[] nArray2 = new int[n3];
            this.a = objectArray;
            this.b = null;
            this.c = nArray;
            this.d = nArray2;
            this.e = 2;
            this.f = 0;
            this.g = n3 = Integer.numberOfLeadingZeros(n3) + n4;
            return;
        }
        String string2 = "capacity must be non-negative.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    private final Object writeReplace() {
        boolean bl2 = this.m;
        if (bl2) {
            d03_0 d03_02 = new d03_0(this);
            return d03_02;
        }
        NotSerializableException notSerializableException = new NotSerializableException("The map cannot be serialized while it is being built.");
        throw notSerializableException;
    }

    public final int a(Object object) {
        this.e();
        block0: while (true) {
            int n3 = this.l(object);
            int n4 = this.e * 2;
            int[] nArray = this.d;
            int n7 = nArray.length / 2;
            if (n4 > n7) {
                n4 = n7;
            }
            n7 = 0;
            nArray = null;
            while (true) {
                int[] nArray2;
                int n8;
                Object object2 = this.d;
                int n10 = object2[n3];
                int n14 = 1;
                if (n10 <= 0) {
                    int n15;
                    n4 = this.f;
                    Object[] objectArray = this.a;
                    n8 = objectArray.length;
                    if (n4 >= n8) {
                        this.h(n14);
                        continue block0;
                    }
                    this.f = n8 = n4 + 1;
                    objectArray[n4] = object;
                    object = this.c;
                    object[n4] = n3;
                    object2[n3] = n8;
                    this.i = n15 = this.i + n14;
                    this.h = n15 = this.h + n14;
                    n15 = this.e;
                    if (n7 > n15) {
                        this.e = n7;
                    }
                    return n4;
                }
                object2 = this.a;
                n8 = n10 + -1;
                int n16 = Intrinsics.areEqual(object2 = (Object)object2[n8], object);
                if (n16 != 0) {
                    return -n10;
                }
                if (++n7 > n4) {
                    nArray2 = this.d;
                    n3 = nArray2.length * 2;
                    this.m(n3);
                    continue block0;
                }
                n16 = n3 + -1;
                if (n3 == 0) {
                    nArray2 = this.d;
                    n3 = nArray2.length - n14;
                    continue;
                }
                n3 = n16;
            }
            break;
        }
    }

    public final ng1_2 c() {
        ng1_2 ng1_22;
        this.e();
        this.m = true;
        int n3 = this.i;
        if (n3 > 0) {
            ng1_22 = this;
        } else {
            ng1_22 = o;
            String string2 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>";
            Intrinsics.checkNotNull(ng1_22, string2);
        }
        return ng1_22;
    }

    public final void clear() {
        int n3;
        this.e();
        int n4 = this.f;
        int n7 = 1;
        KMappedMarker kMappedMarker = new c(0, n4 -= n7, n7);
        kMappedMarker = ((c)kMappedMarker).d();
        while ((n4 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
            int[] nArray = this.c;
            n4 = ((ui1_2)kMappedMarker).nextInt();
            int n8 = nArray[n4];
            if (n8 < 0) continue;
            int[] nArray2 = this.d;
            nArray2[n8] = 0;
            nArray[n4] = n8 = -1;
        }
        kMappedMarker = this.a;
        n4 = this.f;
        wu1_2.a((Object[])kMappedMarker, 0, n4);
        kMappedMarker = this.b;
        if (kMappedMarker != null) {
            n4 = this.f;
            wu1_2.a((Object[])kMappedMarker, 0, n4);
        }
        this.i = 0;
        this.f = 0;
        this.h = n3 = this.h + n7;
    }

    public final boolean containsKey(Object object) {
        int n3 = this.i(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final boolean containsValue(Object object) {
        int n3 = this.j(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final void e() {
        boolean bl2 = this.m;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Set entrySet() {
        og1_2 og1_22 = this.l;
        if (og1_22 == null) {
            this.l = og1_22 = new og1_2(this);
        }
        return og1_22;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        int n4;
        if (!(object == this || (n4 = object instanceof Map) != 0 && (n4 = this.i) == (n3 = (object = (Map)object).size()) && (bl2 = this.f((Collection)(object = (Collection)object.entrySet()))))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f(Collection iterator) {
        boolean bl2;
        Object object = "m";
        Intrinsics.checkNotNullParameter(iterator, (String)object);
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            if (object != null) {
                object = (Map.Entry)object;
                bl2 = this.g((Map.Entry)object);
                if (bl2) continue;
            }
            return false;
        }
        return true;
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public final boolean g(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object object = entry.getKey();
        int n3 = this.i(object);
        if (n3 < 0) {
            return false;
        }
        Object[] objectArray = this.b;
        Intrinsics.checkNotNull(objectArray);
        object = objectArray[n3];
        entry = entry.getValue();
        return Intrinsics.areEqual(object, entry);
    }

    public final Object get(Object object) {
        int n3 = this.i(object);
        if (n3 < 0) {
            return null;
        }
        Object[] objectArray = this.b;
        Intrinsics.checkNotNull(objectArray);
        return objectArray[n3];
    }

    public final void h(int n3) {
        block10: {
            block9: {
                int n4;
                Object object;
                block8: {
                    object = this.a;
                    int n7 = ((Object[])object).length;
                    n4 = this.f;
                    int n8 = this.i;
                    n8 = n4 - n8;
                    if ((n7 -= n4) >= n3 || (n7 += n8) < n3 || n8 < (n7 = ((Object[])object).length / 4)) break block8;
                    int[] nArray = this.d;
                    n3 = nArray.length;
                    this.m(n3);
                    break block9;
                }
                if ((n4 += n3) < 0) break block10;
                n3 = ((Object[])object).length;
                if (n4 > n3) {
                    X0$a x0$a = x0_0.a;
                    int n10 = ((Object[])object).length;
                    x0$a.getClass();
                    n3 = X0$a.e(n10, n4);
                    object = this.a;
                    String string2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = Arrays.copyOf(object, n3);
                    String string3 = "copyOf(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    this.a = object;
                    object = this.b;
                    if (object != null) {
                        Intrinsics.checkNotNullParameter(object, string2);
                        object = Arrays.copyOf(object, n3);
                        Intrinsics.checkNotNullExpressionValue(object, string3);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    this.b = object;
                    object = Arrays.copyOf(this.c, n3);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    this.c = (int[])object;
                    object = n;
                    object.getClass();
                    n10 = 1;
                    if (n3 < n10) {
                        n3 = 1;
                    }
                    if ((n3 = Integer.highestOneBit(n3 * 3)) > (n10 = ((Object[])(object = (Object)this.d)).length)) {
                        this.m(n3);
                    }
                }
            }
            return;
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
        throw outOfMemoryError;
    }

    public final int hashCode() {
        int n3;
        Intrinsics.checkNotNullParameter(this, "map");
        Object object = new NG1$d(this);
        int n4 = 0;
        while ((n3 = ((NG1$d)object).hasNext()) != 0) {
            n3 = ((NG1$d)object).b;
            Object object2 = ((NG1$d)object).a;
            int n7 = ((ng1_2)object2).f;
            if (n3 < n7) {
                int n8;
                ((NG1$d)object).b = n7 = n3 + 1;
                ((NG1$d)object).c = n3;
                Object[] objectArray = ((ng1_2)object2).a;
                Object object3 = objectArray[n3];
                if (object3 != null) {
                    n3 = object3.hashCode();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object2 = ((ng1_2)object2).b;
                Intrinsics.checkNotNull(object2);
                n7 = ((NG1$d)object).c;
                object2 = object2[n7];
                if (object2 != null) {
                    n8 = object2.hashCode();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                ((NG1$d)object).c();
                n4 += (n3 ^= n8);
                continue;
            }
            object = new NoSuchElementException();
            throw object;
        }
        return n4;
    }

    public final int i(Object object) {
        int n3 = this.l(object);
        int n4 = this.e;
        while (true) {
            int[] nArray = this.d;
            int n7 = nArray[n3];
            int n8 = -1;
            if (n7 == 0) {
                return n8;
            }
            if (n7 > 0) {
                Object object2 = this.a;
                boolean bl2 = Intrinsics.areEqual(object2 = object2[n7 += -1], object);
                if (bl2) {
                    return n7;
                }
            }
            if ((n4 += n8) < 0) {
                return n8;
            }
            n7 = n3 + -1;
            if (n3 == 0) {
                int[] nArray2 = this.d;
                n3 = nArray2.length + -1;
                continue;
            }
            n3 = n7;
        }
    }

    public final boolean isEmpty() {
        int n3 = this.i;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final int j(Object object) {
        int n3;
        int n4 = this.f;
        while ((n4 += (n3 = -1)) >= 0) {
            Object object2 = this.c;
            n3 = object2[n4];
            if (n3 < 0) continue;
            object2 = this.b;
            Intrinsics.checkNotNull(object2);
            n3 = (int)(Intrinsics.areEqual(object2 = (Object)object2[n4], object) ? 1 : 0);
            if (n3 == 0) continue;
            return n4;
        }
        return n3;
    }

    public final Set keySet() {
        pg1_2 pg1_22 = this.j;
        if (pg1_22 == null) {
            this.j = pg1_22 = new pg1_2(this);
        }
        return pg1_22;
    }

    public final int l(Object object) {
        int n3;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = this.g;
        return (n3 *= -1640531527) >>> n4;
    }

    public final void m(int n3) {
        int n4;
        int[] nArray;
        Object[] objectArray;
        Object object;
        int n7;
        this.h = n7 = this.h + 1;
        n7 = this.f;
        int n8 = this.i;
        int n10 = 0;
        if (n7 > n8) {
            object = this.b;
            objectArray = null;
            int n14 = 0;
            nArray = null;
            for (n8 = 0; n8 < (n4 = this.f); ++n8) {
                int n15;
                Object object2 = this.c;
                n4 = object2[n8];
                if (n4 < 0) continue;
                object2 = this.a;
                object2[n14] = n15 = object2[n8];
                if (object != null) {
                    object2 = object[n8];
                    object[n14] = object2;
                }
                ++n14;
            }
            objectArray = this.a;
            wu1_2.a(objectArray, n14, n4);
            if (object != null) {
                n8 = this.f;
                wu1_2.a((Object[])object, n14, n8);
            }
            this.f = n14;
        }
        if (n3 != (n8 = ((Object[])(object = (Object)this.d)).length)) {
            object = new int[n3];
            this.d = (int[])object;
            object = n;
            object.getClass();
            this.g = n3 = Integer.numberOfLeadingZeros(n3) + 1;
        } else {
            n3 = ((Object[])object).length;
            objectArray = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)objectArray);
            Arrays.fill((int[])object, 0, n3, 0);
        }
        block1: while (n10 < (n3 = this.f)) {
            n3 = n10 + 1;
            object = this.a[n10];
            n7 = this.l(object);
            n8 = this.e;
            while (true) {
                if ((n4 = (nArray = this.d)[n7]) == 0) {
                    nArray[n7] = n3;
                    objectArray = this.c;
                    objectArray[n10] = n7;
                    n10 = n3;
                    continue block1;
                }
                if ((n8 += -1) < 0) break;
                n4 = n7 + -1;
                if (n7 == 0) {
                    n7 = nArray.length + -1;
                    continue;
                }
                n7 = n4;
            }
            IllegalStateException illegalStateException = new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            throw illegalStateException;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(int n3) {
        int n4;
        block8: {
            int n7;
            Object[] objectArray = this.a;
            Intrinsics.checkNotNullParameter(objectArray, "<this>");
            objectArray[n3] = null;
            int[] nArray = this.c;
            int n8 = nArray[n3];
            int n10 = this.e * 2;
            int[] nArray2 = this.d;
            int n14 = nArray2.length / 2;
            if (n10 > n14) {
                n7 = n14;
            }
            n14 = 0;
            nArray2 = null;
            int n15 = n7;
            int n16 = 0;
            int[] nArray3 = null;
            int n17 = n8;
            do {
                int n18;
                int n19;
                int n20 = n19 + -1;
                if (n19 == 0) {
                    int[] nArray4 = this.d;
                    n19 = nArray4.length + -1;
                } else {
                    n19 = n20;
                }
                n20 = this.e;
                n4 = -1;
                if (++n16 > n20) {
                    int[] nArray5 = this.d;
                    nArray5[n18] = 0;
                    break block8;
                }
                int[] nArray6 = this.d;
                int n21 = nArray6[n19];
                if (n21 == 0) {
                    nArray6[n18] = 0;
                    break block8;
                }
                if (n21 < 0) {
                    nArray6[n18] = n4;
                } else {
                    Object[] objectArray2 = this.a;
                    int n22 = n21 + -1;
                    Object object = objectArray2[n22];
                    n20 = this.l(object) - n19;
                    int[] nArray7 = this.d;
                    int n24 = nArray7.length + -1;
                    if ((n20 &= n24) < n16) continue;
                    nArray7[n18] = n21;
                    nArray3 = this.c;
                    nArray3[n22] = n18;
                }
                n18 = n19;
                n16 = 0;
                nArray3 = null;
            } while ((n15 += n4) >= 0);
            int[] nArray8 = this.d;
            nArray8[n18] = n4;
        }
        this.c[n3] = n4;
        this.i = n3 = this.i + n4;
        this.h = n3 = this.h + 1;
    }

    public final Object put(Object object, Object object2) {
        block5: {
            Object[] objectArray;
            int n3;
            block4: {
                this.e();
                n3 = this.a(object);
                objectArray = this.b;
                if (objectArray != null) break block4;
                objectArray = this.a;
                int n4 = objectArray.length;
                if (n4 < 0) break block5;
                this.b = objectArray = new Object[n4];
            }
            if (n3 < 0) {
                n3 = -n3 + -1;
                Object object3 = objectArray[n3];
                objectArray[n3] = object2;
                return object3;
            }
            objectArray[n3] = object2;
            return null;
        }
        object2 = "capacity must be non-negative.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void putAll(Map object) {
        block5: {
            Object object2 = "from";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            this.e();
            object = object.entrySet();
            int n3 = object.isEmpty();
            if (n3 != 0) break block5;
            n3 = object.size();
            this.h(n3);
            object = object.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                block7: {
                    Object[] objectArray;
                    int n4;
                    block6: {
                        object2 = (Map.Entry)object.next();
                        Object k2 = object2.getKey();
                        n4 = this.a(k2);
                        objectArray = this.b;
                        if (objectArray != null) break block6;
                        objectArray = this.a;
                        int n7 = objectArray.length;
                        if (n7 < 0) break block7;
                        this.b = objectArray = new Object[n7];
                    }
                    if (n4 >= 0) {
                        objectArray[n4] = object2 = object2.getValue();
                        continue;
                    }
                    n4 = -n4 + -1;
                    Object object3 = objectArray[n4];
                    Object v4 = object2.getValue();
                    boolean bl2 = Intrinsics.areEqual(v4, object3);
                    if (bl2) continue;
                    objectArray[n4] = object2 = object2.getValue();
                    continue;
                }
                object2 = "capacity must be non-negative.".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final Object remove(Object object) {
        this.e();
        int n3 = this.i(object);
        if (n3 < 0) {
            n3 = -1;
        } else {
            this.n(n3);
        }
        if (n3 < 0) {
            return null;
        }
        Object[] objectArray = this.b;
        Intrinsics.checkNotNull(objectArray);
        Object object2 = objectArray[n3];
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        objectArray[n3] = null;
        return object2;
    }

    public final int size() {
        return this.i;
    }

    public final String toString() {
        char c2;
        int n3 = this.i * 3 + 2;
        Object object = new StringBuilder(n3);
        ((StringBuilder)object).append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        ng1$b_0 ng1$b_0 = new NG1$d(this);
        int n4 = 0;
        while ((c2 = ng1$b_0.hasNext()) != '\u0000') {
            Object object2;
            if (n4 > 0) {
                object2 = ", ";
                ((StringBuilder)object).append((String)object2);
            }
            object2 = "sb";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            c2 = ng1$b_0.b;
            ng1_2 ng1_22 = ng1$b_0.a;
            int n7 = ng1_22.f;
            if (c2 < n7) {
                ng1$b_0.b = n7 = c2 + 1;
                ng1$b_0.c = c2;
                object2 = ng1_22.a[c2];
                String string2 = "(this Map)";
                if (object2 == ng1_22) {
                    ((StringBuilder)object).append(string2);
                } else {
                    ((StringBuilder)object).append(object2);
                }
                c2 = '=';
                ((StringBuilder)object).append(c2);
                object2 = ng1_22.b;
                Intrinsics.checkNotNull(object2);
                int n8 = ng1$b_0.c;
                object2 = object2[n8];
                if (object2 == ng1_22) {
                    ((StringBuilder)object).append(string2);
                } else {
                    ((StringBuilder)object).append(object2);
                }
                ng1$b_0.c();
                ++n4;
                continue;
            }
            object = new NoSuchElementException();
            throw object;
        }
        ((StringBuilder)object).append("}");
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public final Collection values() {
        qg1_2 qg1_22 = this.k;
        if (qg1_22 == null) {
            this.k = qg1_22 = new qg1_2(this);
        }
        return qg1_22;
    }
}

