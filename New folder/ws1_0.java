/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from ws1
 */
public final class ws1_0
implements List,
KMappedMarker {
    public final List a;

    public ws1_0() {
        p83_0 p83_02 = new p83_0();
        this.a = p83_02;
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
        boolean bl2 = object instanceof ws1$a;
        if (!bl2) {
            return false;
        }
        object = (ws1$a)object;
        return this.a.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public final Object get(int n3) {
        return (ws1$a)this.a.get(n3);
    }

    public final int indexOf(Object object) {
        boolean bl2 = object instanceof ws1$a;
        if (!bl2) {
            return -1;
        }
        object = (ws1$a)object;
        return this.a.indexOf(object);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof ws1$a;
        if (!bl2) {
            return -1;
        }
        object = (ws1$a)object;
        return this.a.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    public final ListIterator listIterator(int n3) {
        return this.a.listIterator(n3);
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void replaceAll(UnaryOperator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        return this.a.size();
    }

    public final void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        return this.a.subList(n3, n4);
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

