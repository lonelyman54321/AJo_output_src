/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class yf3$a
implements Collection,
KMappedMarker {
    public final Set a;

    public yf3$a(int n3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
    }

    public final boolean add(Object object) {
        return this.a.add(object);
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final boolean remove(Object object) {
        return this.a.remove(object);
    }

    public final boolean removeAll(Collection collection) {
        return this.a.remove(collection);
    }

    public final boolean removeIf(Predicate object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection collection) {
        return this.a.retainAll(collection);
    }

    public final int size() {
        return this.a.size();
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

