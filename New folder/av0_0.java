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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from aV0
 */
public final class av0_0
extends RU0
implements List,
KMappedMarker {
    public final List f;

    public av0_0(List object) {
        this.f = object;
        object = (Collection)object;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2) {
            return;
        }
        String string2 = "At least one font should be passed to FontFamily".toString();
        object = new IllegalStateException(string2);
        throw object;
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
        boolean bl2 = object instanceof LU0;
        if (!bl2) {
            return false;
        }
        object = (LU0)object;
        return this.f.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.f.containsAll(collection);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof av0_0;
        if (!bl3) {
            return false;
        }
        List list = this.f;
        object = ((av0_0)object).f;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object get(int n3) {
        return (LU0)this.f.get(n3);
    }

    public final int hashCode() {
        return ((Object)this.f).hashCode();
    }

    public final int indexOf(Object object) {
        boolean bl2 = object instanceof LU0;
        if (!bl2) {
            return -1;
        }
        object = (LU0)object;
        return this.f.indexOf(object);
    }

    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    public final Iterator iterator() {
        return this.f.iterator();
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof LU0;
        if (!bl2) {
            return -1;
        }
        object = (LU0)object;
        return this.f.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        return this.f.listIterator();
    }

    public final ListIterator listIterator(int n3) {
        return this.f.listIterator(n3);
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
        return this.f.size();
    }

    public final void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        return this.f.subList(n3, n4);
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FontListFontFamily(fonts=");
        List list = this.f;
        stringBuilder.append(list);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

