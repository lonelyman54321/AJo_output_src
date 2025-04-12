/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from mz0
 */
public final class mz0_2
implements List,
Serializable,
RandomAccess,
KMappedMarker {
    public static final mz0_2 a;
    private static final long serialVersionUID = -7390468764508069838L;

    static {
        mz0_2 mz0_22;
        a = mz0_22 = new Object();
    }

    private final Object readResolve() {
        return a;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Void;
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNullParameter((Void)object, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof List;
        if (bl3 && (bl2 = (object = (List)object).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Object get(int n3) {
        StringBuilder stringBuilder = new StringBuilder("Empty list doesn't contain element at index ");
        stringBuilder.append(n3);
        stringBuilder.append('.');
        String string2 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object object) {
        boolean bl2 = object instanceof Void;
        int n3 = -1;
        if (!bl2) {
            return n3;
        }
        Intrinsics.checkNotNullParameter((Void)object, "element");
        return n3;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return lz0_2.a;
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof Void;
        int n3 = -1;
        if (!bl2) {
            return n3;
        }
        Intrinsics.checkNotNullParameter((Void)object, "element");
        return n3;
    }

    public final ListIterator listIterator() {
        return lz0_2.a;
    }

    public final ListIterator listIterator(int n3) {
        if (n3 == 0) {
            return lz0_2.a;
        }
        String string2 = hj0_0.a(n3, "Index: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        if (n3 == 0 && n4 == 0) {
            return this;
        }
        String string2 = D70.b(n3, n4, "fromIndex: ", ", toIndex: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        return "[]";
    }
}

