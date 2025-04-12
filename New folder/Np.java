/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

public final class Np
implements Collection,
Set,
KMutableCollection,
KMutableSet {
    public int[] a;
    public Object[] b;
    public int c;

    public Np() {
        this(0);
    }

    public Np(int n3) {
        Object[] objectArray = A62.a;
        this.a = objectArray;
        objectArray = A62.c;
        this.b = objectArray;
        if (n3 > 0) {
            op_0.b(this, n3);
        }
    }

    public final Object a(int n3) {
        Object object;
        block12: {
            Object object2;
            block11: {
                int n4;
                Object[] objectArray;
                int n7;
                block10: {
                    n7 = this.c;
                    objectArray = this.b;
                    object2 = objectArray[n3];
                    n4 = 1;
                    if (n7 > n4) break block10;
                    this.clear();
                    break block11;
                }
                n4 = n7 + -1;
                Object[] objectArray2 = this.a;
                int n8 = objectArray2.length;
                int n10 = 8;
                if (n8 > n10 && n7 < (n8 = objectArray2.length / 3)) {
                    Object[] objectArray3;
                    if (n7 > n10) {
                        n8 = n7 >> 1;
                        n10 = n7 + n8;
                    }
                    op_0.b(this, n10);
                    if (n3 > 0) {
                        objectArray3 = this.a;
                        n10 = 0;
                        int n14 = 6;
                        rp_1.j(0, n3, n14, objectArray2, objectArray3);
                        objectArray3 = this.b;
                        rp_1.k(objectArray, 0, objectArray3, n3, n14);
                    }
                    if (n3 < n4) {
                        objectArray3 = this.a;
                        n10 = n3 + 1;
                        rp_1.f(n3, n10, n7, objectArray2, objectArray3);
                        objectArray2 = this.b;
                        rp_1.i(objectArray, n3, objectArray2, n10, n7);
                    }
                } else {
                    int n15;
                    if (n3 < n4) {
                        n15 = n3 + 1;
                        rp_1.f(n3, n15, n7, objectArray2, objectArray2);
                        objectArray2 = this.b;
                        rp_1.i(objectArray2, n3, objectArray2, n15, n7);
                    }
                    object = this.b;
                    n15 = 0;
                    objectArray = null;
                    object[n4] = null;
                }
                if (n7 != (n3 = this.c)) break block12;
                this.c = n4;
            }
            return object2;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final boolean add(Object object) {
        block15: {
            int n3;
            block14: {
                Object[] objectArray;
                int n4;
                int n7;
                int n8;
                int n10 = this.c;
                n3 = 0;
                Object[] objectArray2 = null;
                if (object == null) {
                    Intrinsics.checkNotNullParameter(this, "<this>");
                    n8 = op_0.c(this, null, 0);
                    n7 = 0;
                } else {
                    n8 = object.hashCode();
                    int n14 = op_0.c(this, object, n8);
                    n7 = n8;
                    n8 = n14;
                }
                if (n8 >= 0) break block14;
                n8 ^= 0xFFFFFFFF;
                Object[] objectArray3 = this.a;
                int n15 = objectArray3.length;
                int n16 = 1;
                if (n10 >= n15) {
                    n15 = 8;
                    if (n10 >= n15) {
                        n15 = (n10 >> 1) + n10;
                    } else {
                        int n17 = 4;
                        if (n10 < n17) {
                            n15 = 4;
                        }
                    }
                    Object[] objectArray4 = this.b;
                    op_0.b(this, n15);
                    n15 = this.c;
                    if (n10 == n15) {
                        int[] nArray = this.a;
                        int n18 = nArray.length;
                        n18 = n18 == 0 ? 1 : 0;
                        if ((n18 ^= n16) != 0) {
                            n18 = objectArray3.length;
                            int n19 = 6;
                            rp_1.j(0, n18, n19, objectArray3, nArray);
                            objectArray3 = this.b;
                            n15 = objectArray4.length;
                            rp_1.k(objectArray4, 0, objectArray3, n15, n19);
                        }
                    } else {
                        object = new ConcurrentModificationException();
                        throw object;
                    }
                }
                if (n8 < n10) {
                    objectArray2 = this.a;
                    n4 = n8 + 1;
                    rp_1.f(n4, n8, n10, objectArray2, objectArray2);
                    objectArray2 = this.b;
                    rp_1.i(objectArray2, n4, objectArray2, n8, n10);
                }
                if (n10 != (n3 = this.c) || n8 >= (n4 = (objectArray = this.a).length)) break block15;
                objectArray[n8] = n7;
                objectArray = this.b;
                objectArray[n8] = (int)object;
                this.c = n3 += n16;
                n3 = 1;
            }
            return n3 != 0;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final boolean addAll(Collection iterator) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(iterator, string2);
        int n3 = this.c;
        int n4 = iterator.size() + n3;
        n3 = this.c;
        int[] nArray = this.a;
        int n7 = nArray.length;
        int n8 = 0;
        if (n7 < n4) {
            Object[] objectArray = this.b;
            op_0.b(this, n4);
            n4 = this.c;
            if (n4 > 0) {
                int[] nArray2 = this.a;
                int n10 = 6;
                rp_1.j(0, n4, n10, nArray, nArray2);
                Object[] objectArray2 = this.b;
                int n14 = this.c;
                rp_1.k(objectArray, 0, objectArray2, n14, n10);
            }
        }
        if ((n4 = this.c) == n3) {
            iterator = iterator.iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                string2 = iterator.next();
                n3 = (int)(this.add(string2) ? 1 : 0);
                n8 |= n3;
            }
            return n8 != 0;
        }
        iterator = new Iterator();
        throw iterator;
    }

    public final void clear() {
        Object object;
        int n3 = this.c;
        if (n3 != 0) {
            object = A62.a;
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string2);
            this.a = object;
            object = A62.c;
            Intrinsics.checkNotNullParameter(object, string2);
            this.b = object;
            n3 = 0;
            object = null;
            this.c = 0;
        }
        if ((n3 = this.c) == 0) {
            return;
        }
        object = new ConcurrentModificationException;
        object();
        throw object;
    }

    public final boolean contains(Object object) {
        int n3;
        boolean bl2 = false;
        if (object == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            object = null;
            n3 = op_0.c(this, null, 0);
        } else {
            int n4 = object.hashCode();
            n3 = op_0.c(this, object, n4);
        }
        if (n3 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            boolean bl3;
            String string2 = "elements";
            Intrinsics.checkNotNullParameter(object, string2);
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                string2 = object.next();
                bl3 = this.contains(string2);
                if (bl3) continue;
                bl2 = false;
                object = null;
                break block1;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Set;
        if (n3 == 0) return false;
        n3 = this.c;
        Object object2 = object;
        object2 = (Set)object;
        int n4 = object2.size();
        if (n3 != n4) return false;
        try {
            n3 = this.c;
            n4 = 0;
            object2 = null;
            while (n4 < n3) {
                Object[] objectArray = this.b;
                Object object3 = objectArray[n4];
                Object object4 = object;
                object4 = (Set)object;
                boolean bl3 = object4.contains(object3);
                if (!bl3) return false;
                ++n4;
            }
            return bl2;
        }
        catch (ClassCastException | NullPointerException runtimeException) {}
        return false;
    }

    public final int hashCode() {
        int[] nArray = this.a;
        int n3 = this.c;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            n4 += n7;
        }
        return n4;
    }

    public final boolean isEmpty() {
        int n3 = this.c;
        n3 = n3 <= 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        Np$a np$a = new Np$a(this);
        return np$a;
    }

    public final boolean remove(Object object) {
        int n3;
        boolean bl2 = false;
        if (object == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            object = null;
            n3 = op_0.c(this, null, 0);
        } else {
            int n4 = object.hashCode();
            n3 = op_0.c(this, object, n4);
        }
        if (n3 >= 0) {
            this.a(n3);
            bl2 = true;
        }
        return bl2;
    }

    public final boolean removeAll(Collection object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "elements");
        object = object.iterator();
        boolean bl3 = false;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = this.remove(e2);
            bl3 |= bl2;
        }
        return bl3;
    }

    public final boolean retainAll(Collection collection) {
        int n3;
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(collection, string2);
        int n4 = this.c;
        int n7 = 1;
        n4 -= n7;
        boolean bl2 = false;
        while ((n3 = -1) < n4) {
            Iterable iterable = collection;
            iterable = collection;
            Object object = this.b[n4];
            n3 = (int)(CollectionsKt.F(iterable, object) ? 1 : 0);
            if (n3 == 0) {
                this.a(n4);
                bl2 = true;
            }
            n4 += -1;
        }
        return bl2;
    }

    public final int size() {
        return this.c;
    }

    public final Object[] toArray() {
        Object[] objectArray = this.b;
        int n3 = this.c;
        return rp_1.m(objectArray, 0, n3);
    }

    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2 = "array";
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        int n3 = this.c;
        int n4 = objectArray.length;
        if (n4 < n3) {
            objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n3);
        } else {
            n4 = objectArray.length;
            if (n4 > n3) {
                n4 = 0;
                objectArray[n3] = null;
            }
        }
        objectArray2 = this.b;
        n4 = this.c;
        rp_1.i(objectArray2, 0, objectArray, 0, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray, "result");
        return objectArray;
    }

    public final String toString() {
        String string2;
        int n3 = this.isEmpty();
        if (n3 != 0) {
            string2 = "{}";
        } else {
            n3 = this.c * 14;
            CharSequence charSequence = new StringBuilder(n3);
            ((StringBuilder)charSequence).append('{');
            n3 = this.c;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                if (i3 > 0) {
                    object = ", ";
                    ((StringBuilder)charSequence).append((String)object);
                }
                if ((object = this.b[i3]) != this) {
                    ((StringBuilder)charSequence).append(object);
                    continue;
                }
                object = "(this Set)";
                ((StringBuilder)charSequence).append((String)object);
            }
            n3 = 125;
            ((StringBuilder)charSequence).append((char)n3);
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "StringBuilder(capacity).\u2026builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(string2, (String)charSequence);
        }
        return string2;
    }
}

