/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Nt3
 */
public final class nt3_0
implements Collection,
KMappedMarker {
    public final long[] a;

    public /* synthetic */ nt3_0(long[] lArray) {
        this.a = lArray;
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
        boolean bl2 = object instanceof mt3_0;
        if (!bl2) {
            return false;
        }
        long l2 = ((mt3_0)object).a;
        return tp_2.v(this.a, l2);
    }

    public final boolean containsAll(Collection object) {
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object = (Iterable)object;
        object2 = object;
        boolean bl2 = object2.isEmpty();
        boolean bl3 = true;
        if (!bl2) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                long l2;
                object2 = object.next();
                boolean bl4 = object2 instanceof mt3_0;
                if (bl4 && (bl2 = tp_2.v((long[])(object2 = (Object)this.a), l2 = ((mt3_0)object2).a))) continue;
                bl3 = false;
                break;
            }
        }
        return bl3;
    }

    public final boolean equals(Object object) {
        long[] lArray;
        boolean bl2;
        boolean bl3 = object instanceof nt3_0;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(lArray = this.a, object = (Object)((nt3_0)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final boolean isEmpty() {
        long[] lArray = this.a;
        boolean bl2 = lArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            lArray = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        long[] lArray = this.a;
        Nt3$a nt3$a = new Nt3$a(lArray);
        return nt3$a;
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
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ULongArray(storage=");
        String string2 = Arrays.toString(this.a);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

