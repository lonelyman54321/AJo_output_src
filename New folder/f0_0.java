/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from F0
 */
public abstract class f0_0
implements Collection,
KMappedMarker {
    public abstract int a();

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

    public boolean contains(Object object) {
        boolean bl2 = this.isEmpty();
        boolean bl3 = false;
        if (!bl2) {
            boolean bl4;
            Iterator iterator = this.iterator();
            while (bl4 = iterator.hasNext()) {
                Object t3 = iterator.next();
                bl4 = Intrinsics.areEqual(t3, object);
                if (!bl4) continue;
                bl3 = true;
                break;
            }
        }
        return bl3;
    }

    public boolean containsAll(Collection object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        object = (Iterable)object;
        Iterable iterable = object;
        iterable = object;
        boolean bl2 = iterable.isEmpty();
        boolean bl3 = true;
        if (!bl2) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                iterable = object.next();
                bl2 = this.contains(iterable);
                if (bl2) continue;
                bl3 = false;
                break;
            }
        }
        return bl3;
    }

    public boolean isEmpty() {
        int n3 = this.a();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
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

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        F0$a f0$a = new F0$a(this);
        return CollectionsKt.R(this, ", ", "[", "]", f0$a, 24);
    }
}

