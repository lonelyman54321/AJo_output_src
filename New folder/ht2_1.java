/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from hT2
 */
public final class ht2_1
implements Set,
KMappedMarker {
    public final ft2_0 a;

    public ht2_1(ft2_0 ft2_02) {
        this.a = ft2_02;
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
        return this.a.a(object);
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block4: {
            Iterable iterable;
            boolean bl3;
            block3: {
                object = (Iterable)object;
                bl3 = object instanceof Collection;
                bl2 = true;
                if (!bl3) break block3;
                iterable = object;
                iterable = (Collection)object;
                bl3 = iterable.isEmpty();
                if (bl3) break block4;
            }
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                ft2_0 ft2_02 = this.a;
                iterable = object.next();
                bl3 = ft2_02.a(iterable);
                if (bl3) continue;
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final boolean isEmpty() {
        return this.a.b();
    }

    public final Iterator iterator() {
        hT2$a hT2$a = new hT2$a(this, null);
        return zz2_1.a(hT2$a);
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
        return this.a.d;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

