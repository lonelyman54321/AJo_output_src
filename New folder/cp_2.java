/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Cp
 */
public final class cp_2
implements Collection,
KMappedMarker {
    public final Object[] a;
    public final boolean b;

    public cp_2(Object[] objectArray, boolean bl2) {
        Intrinsics.checkNotNullParameter(objectArray, "values");
        this.a = objectArray;
        this.b = bl2;
    }

    public final boolean add(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
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
        return tp_2.w(this.a, object);
    }

    public final boolean containsAll(Collection object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        object = (Iterable)object;
        Iterable iterable = object;
        iterable = object;
        boolean bl2 = iterable.isEmpty();
        boolean bl3 = true;
        if (!bl2) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object[] objectArray = this.a;
                iterable = object.next();
                bl2 = tp_2.w(objectArray, iterable);
                if (bl2) continue;
                bl3 = false;
                break;
            }
        }
        return bl3;
    }

    public final boolean isEmpty() {
        Object[] objectArray = this.a;
        boolean bl2 = objectArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            objectArray = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        return ArrayIteratorKt.iterator(this.a);
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

    public final int size() {
        return this.a.length;
    }

    public final Object[] toArray() {
        Object[] objectArray = this.a;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        int n3 = this.b;
        Class<Object[]> clazz = Object[].class;
        if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object = objectArray.getClass(), clazz) ? 1 : 0)) == 0) {
            n3 = objectArray.length;
            objectArray = Arrays.copyOf(objectArray, n3, clazz);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(objectArray, (String)object);
        }
        return objectArray;
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }
}

