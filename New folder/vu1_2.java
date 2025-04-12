/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vu1
 */
public final class vu1_2
extends e1_0
implements RandomAccess,
Serializable {
    public static final vu1_2 g;
    public Object[] a;
    public final int b;
    public int c;
    public boolean d;
    public final vu1_2 e;
    public final vu1_2 f;

    static {
        vu1_2 vu1_22 = new vu1_2(0);
        vu1_22.d = true;
        g = vu1_22;
    }

    public vu1_2() {
        this(10);
    }

    public vu1_2(int n3) {
        if (n3 >= 0) {
            Object[] objectArray = new Object[n3];
            vu1_2 vu1_22 = this;
            this(objectArray, 0, 0, false, null, null);
            return;
        }
        String string2 = "capacity must be non-negative.".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public vu1_2(Object[] objectArray, int n3, int n4, boolean bl2, vu1_2 vu1_22, vu1_2 vu1_23) {
        this.a = objectArray;
        this.b = n3;
        this.c = n4;
        this.d = bl2;
        this.e = vu1_22;
        this.f = vu1_23;
        if (vu1_22 != null) {
            int n7;
            this.modCount = n7 = vu1_22.modCount;
        }
    }

    public static final /* synthetic */ int d(vu1_2 vu1_22) {
        return vu1_22.modCount;
    }

    private final Object writeReplace() {
        Serializable serializable;
        boolean bl2 = this.d;
        if (!(bl2 || (serializable = this.f) != null && (bl2 = ((vu1_2)serializable).d))) {
            serializable = new NotSerializableException("The list cannot be serialized while it is being built.");
            throw serializable;
        }
        serializable = new c03_0(0, this);
        return serializable;
    }

    public final int a() {
        this.g();
        return this.c;
    }

    public final void add(int n3, Object object) {
        this.h();
        this.g();
        X0$a x0$a = x0_0.a;
        int n4 = this.c;
        x0$a.getClass();
        X0$a.c(n3, n4);
        int n7 = this.b + n3;
        this.f(n7, object);
    }

    public final boolean add(Object object) {
        this.h();
        this.g();
        int n3 = this.b;
        int n4 = this.c;
        this.f(n3 += n4, object);
        return true;
    }

    public final boolean addAll(int n3, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.h();
        this.g();
        X0$a x0$a = x0_0.a;
        int n4 = this.c;
        x0$a.getClass();
        X0$a.c(n3, n4);
        int n7 = collection.size();
        n4 = this.b + n3;
        this.e(n4, collection, n7);
        n3 = n7 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        boolean bl2;
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(collection, string2);
        this.h();
        this.g();
        int n3 = collection.size();
        int n4 = this.b;
        int n7 = this.c;
        this.e(n4 += n7, collection, n3);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            collection = null;
        }
        return bl2;
    }

    public final Object c(int n3) {
        this.h();
        this.g();
        X0$a x0$a = x0_0.a;
        int n4 = this.c;
        x0$a.getClass();
        X0$a.b(n3, n4);
        int n7 = this.b + n3;
        return this.j(n7);
    }

    public final void clear() {
        this.h();
        this.g();
        int n3 = this.b;
        int n4 = this.c;
        this.l(n3, n4);
    }

    public final void e(int n3, Collection object, int n4) {
        int n7;
        this.modCount = n7 = this.modCount + 1;
        vu1_2 vu1_22 = this.e;
        if (vu1_22 != null) {
            Object[] objectArray;
            vu1_22.e(n3, (Collection)object, n4);
            this.a = objectArray = vu1_22.a;
            this.c = n3 = this.c + n4;
        } else {
            this.i(n3, n4);
            object = object.iterator();
            vu1_22 = null;
            for (n7 = 0; n7 < n4; ++n7) {
                Object[] objectArray = this.a;
                int n8 = n3 + n7;
                Object e2 = object.next();
                objectArray[n8] = e2;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        this.g();
        if (object == this) return true;
        boolean bl2 = object instanceof List;
        boolean bl3 = false;
        if (!bl2) return bl3;
        object = (List)object;
        Object[] objectArray = this.a;
        int n3 = this.c;
        int n4 = object.size();
        if (n3 != n4) return bl3;
        n4 = 0;
        while (n4 < n3) {
            int n7 = this.b + n4;
            Object object2 = objectArray[n7];
            Object e2 = object.get(n4);
            if ((n7 = (int)(Intrinsics.areEqual(object2, e2) ? 1 : 0)) == 0) return bl3;
            ++n4;
        }
        return true;
    }

    public final void f(int n3, Object object) {
        int n4 = this.modCount;
        int n7 = 1;
        this.modCount = n4 += n7;
        Object[] objectArray = this.e;
        if (objectArray != null) {
            Object[] objectArray2;
            objectArray.f(n3, object);
            this.a = objectArray2 = objectArray.a;
            this.c = n3 = this.c + n7;
        } else {
            this.i(n3, n7);
            objectArray = this.a;
            objectArray[n3] = object;
        }
    }

    public final void g() {
        int n3;
        int n4;
        Serializable serializable = this.f;
        if (serializable != null && (n4 = serializable.modCount) != (n3 = this.modCount)) {
            serializable = new ConcurrentModificationException();
            throw serializable;
        }
    }

    public final Object get(int n3) {
        this.g();
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.b(n3, n4);
        objectArray = this.a;
        n4 = this.b + n3;
        return objectArray[n4];
    }

    public final void h() {
        Serializable serializable;
        boolean bl2 = this.d;
        if (!(bl2 || (serializable = this.f) != null && (bl2 = ((vu1_2)serializable).d))) {
            return;
        }
        serializable = new UnsupportedOperationException();
        throw serializable;
    }

    public final int hashCode() {
        this.g();
        Object[] objectArray = this.a;
        int n3 = this.c;
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = this.b + i3;
            Object object = objectArray[n7];
            n4 *= 31;
            if (object != null) {
                n7 = object.hashCode();
            } else {
                n7 = 0;
                object = null;
            }
            n4 += n7;
        }
        return n4;
    }

    public final void i(int n3, int n4) {
        int n7 = this.c + n4;
        if (n7 >= 0) {
            Object[] objectArray;
            int n8;
            Object object = this.a;
            int n10 = ((Object[])object).length;
            if (n7 > n10) {
                Object object2 = x0_0.a;
                n8 = ((Object[])object).length;
                object2.getClass();
                n7 = X0$a.e(n8, n7);
                object = this.a;
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                objectArray = Arrays.copyOf(object, n7);
                object = "copyOf(...)";
                Intrinsics.checkNotNullExpressionValue(objectArray, (String)object);
                this.a = objectArray;
            }
            objectArray = this.a;
            n8 = this.b;
            n10 = this.c;
            n8 += n10;
            n10 = n3 + n4;
            rp_1.i(objectArray, n10, objectArray, n3, n8);
            this.c = n3 = this.c + n4;
            return;
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
        throw outOfMemoryError;
    }

    public final int indexOf(Object object) {
        int n3;
        this.g();
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            Object object2 = this.a;
            int n4 = this.b + i3;
            n3 = (int)(Intrinsics.areEqual(object2 = object2[n4], object) ? 1 : 0);
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isEmpty() {
        void var1_4;
        this.g();
        int bl2 = this.c;
        if (bl2 == 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_4;
    }

    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final Object j(int n3) {
        int n4;
        this.modCount = n4 = this.modCount + 1;
        Object[] objectArray = this.e;
        if (objectArray != null) {
            Object object = objectArray.j(n3);
            this.c = n4 = this.c + -1;
            return object;
        }
        objectArray = this.a;
        Object object = objectArray[n3];
        int n7 = n3 + 1;
        int n8 = this.c;
        int n10 = this.b;
        rp_1.i(objectArray, n3, objectArray, n7, n8 += n10);
        Object[] objectArray2 = this.a;
        n4 = this.c;
        n10 = n10 + n4 + -1;
        Intrinsics.checkNotNullParameter(objectArray2, "<this>");
        objectArray2[n10] = null;
        this.c = n3 = this.c + -1;
        return object;
    }

    public final void l(int n3, int n4) {
        Object[] objectArray;
        int n7;
        if (n4 > 0) {
            this.modCount = n7 = this.modCount + 1;
        }
        if ((objectArray = this.e) != null) {
            objectArray.l(n3, n4);
        } else {
            objectArray = this.a;
            int n8 = n3 + n4;
            int n10 = this.c;
            rp_1.i(objectArray, n3, objectArray, n8, n10);
            Object[] objectArray2 = this.a;
            n7 = this.c;
            n8 = n7 - n4;
            wu1_2.a(objectArray2, n8, n7);
        }
        this.c = n3 = this.c - n4;
    }

    public final int lastIndexOf(Object object) {
        this.g();
        for (int i3 = this.c + -1; i3 >= 0; i3 += -1) {
            Object object2 = this.a;
            int n3 = this.b + i3;
            boolean bl2 = Intrinsics.areEqual(object2 = object2[n3], object);
            if (!bl2) continue;
            return i3;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n3) {
        this.g();
        Object object = x0_0.a;
        int n4 = this.c;
        object.getClass();
        X0$a.c(n3, n4);
        object = new vu1$a_0(this, n3);
        return object;
    }

    public final int m(int n3, int n4, Collection collection, boolean bl2) {
        vu1_2 vu1_22 = this.e;
        if (vu1_22 != null) {
            n3 = vu1_22.m(n3, n4, collection, bl2);
        } else {
            int n7 = 0;
            vu1_22 = null;
            int n8 = 0;
            while (n7 < n4) {
                Object object = this.a;
                int n10 = n3 + n7;
                boolean bl3 = collection.contains(object = object[n10]);
                if (bl3 == bl2) {
                    Object object2;
                    object = this.a;
                    int n14 = n8 + 1;
                    ++n7;
                    object[n8 += n3] = object2 = object[n10];
                    n8 = n14;
                    continue;
                }
                ++n7;
            }
            int n15 = n4 - n8;
            Object[] objectArray = this.a;
            n4 += n3;
            n7 = this.c;
            rp_1.i(objectArray, n3 += n8, objectArray, n4, n7);
            Object[] objectArray2 = this.a;
            n4 = this.c;
            int n16 = n4 - n15;
            wu1_2.a(objectArray2, n16, n4);
            n3 = n15;
        }
        if (n3 > 0) {
            this.modCount = n4 = this.modCount + 1;
        }
        this.c = n4 = this.c - n3;
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean remove(Object object) {
        void var2_5;
        this.h();
        this.g();
        int bl2 = this.indexOf(object);
        if (bl2 >= 0) {
            this.c(bl2);
        }
        if (bl2 >= 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var2_5;
    }

    public final boolean removeAll(Collection collection) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(collection, string2);
        this.h();
        this.g();
        int n3 = this.c;
        int n4 = this.b;
        boolean bl2 = false;
        int n7 = this.m(n4, n3, collection, false);
        if (n7 > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(collection, string2);
        this.h();
        this.g();
        int n3 = this.c;
        int n4 = this.b;
        boolean bl2 = true;
        int n7 = this.m(n4, n3, collection, bl2);
        if (n7 <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public final Object set(int n3, Object object) {
        this.h();
        this.g();
        Object[] objectArray = x0_0.a;
        int n4 = this.c;
        objectArray.getClass();
        X0$a.b(n3, n4);
        objectArray = this.a;
        n4 = this.b + n3;
        Object object2 = objectArray[n4];
        objectArray[n4] = object;
        return object2;
    }

    public final List subList(int n3, int n4) {
        Object object = x0_0.a;
        int n7 = this.c;
        object.getClass();
        X0$a.d(n3, n4, n7);
        Object[] objectArray = this.a;
        n7 = this.b;
        int n8 = n7 + n3;
        int n10 = n4 - n3;
        boolean bl2 = this.d;
        vu1_2 vu1_22 = this.f;
        vu1_2 vu1_23 = vu1_22 == null ? this : vu1_22;
        object = new vu1_2(objectArray, n8, n10, bl2, this, vu1_23);
        return object;
    }

    public final Object[] toArray() {
        this.g();
        Object[] objectArray = this.a;
        int n3 = this.c;
        int n4 = this.b;
        return rp_1.m(objectArray, n4, n3 += n4);
    }

    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2 = "destination";
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        this.g();
        int n3 = objectArray.length;
        int n4 = this.c;
        int n7 = this.b;
        if (n3 < n4) {
            objectArray2 = this.a;
            objectArray = objectArray.getClass();
            objectArray = Arrays.copyOfRange(objectArray2, n7, n4 += n7, (Class<? extends T[]>)objectArray);
            Intrinsics.checkNotNullExpressionValue(objectArray, "copyOfRange(...)");
            return objectArray;
        }
        objectArray2 = this.a;
        rp_1.i(objectArray2, 0, objectArray, n7, n4 += n7);
        n3 = this.c;
        String string2 = "array";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        n4 = objectArray.length;
        if (n3 < n4) {
            n4 = 0;
            string2 = null;
            objectArray[n3] = null;
        }
        return objectArray;
    }

    public final String toString() {
        this.g();
        Object object = this.a;
        int n3 = this.c;
        int n4 = n3 * 3 + 2;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append("[");
        for (n4 = 0; n4 < n3; ++n4) {
            int n7;
            Object object2;
            if (n4 > 0) {
                object2 = ", ";
                stringBuilder.append((String)object2);
            }
            if ((object2 = object[n7 = this.b + n4]) == this) {
                object2 = "(this Collection)";
                stringBuilder.append((String)object2);
                continue;
            }
            stringBuilder.append(object2);
        }
        stringBuilder.append("]");
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

