/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class iw1
implements Collection,
KMappedMarker {
    public static final iw1 c;
    public final List a;
    public final int b;

    static {
        iw1 iw12;
        mz0_2 mz0_22 = mz0_2.a;
        c = iw12 = new iw1(mz0_22);
    }

    public iw1(List list) {
        int n3;
        this.a = list;
        this.b = n3 = list.size();
    }

    public final hw1 a() {
        return (hw1)this.a.get(0);
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
        boolean bl2 = object instanceof hw1;
        if (!bl2) {
            return false;
        }
        object = (hw1)object;
        return this.a.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof iw1;
        if (!bl3) {
            return false;
        }
        List list = this.a;
        object = ((iw1)object).a;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeIf(Predicate object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocaleList(localeList=");
        List list = this.a;
        stringBuilder.append(list);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

