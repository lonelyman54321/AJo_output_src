/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from vz0
 */
public final class vz0_2
implements Set,
Serializable,
KMappedMarker {
    public static final vz0_2 a;
    private static final long serialVersionUID = 3406603774387020532L;

    static {
        vz0_2 vz0_22;
        a = vz0_22 = new Object();
    }

    private final Object readResolve() {
        return a;
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
        boolean bl3 = object instanceof Set;
        if (bl3 && (bl2 = (object = (Set)object).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return lz0_2.a;
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

