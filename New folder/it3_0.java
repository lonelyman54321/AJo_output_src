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
 * Renamed from It3
 */
public final class it3_0
implements Collection,
KMappedMarker {
    public final int[] a;

    public /* synthetic */ it3_0(int[] nArray) {
        this.a = nArray;
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
        boolean bl2 = object instanceof ht3_0;
        if (!bl2) {
            return false;
        }
        int n3 = ((ht3_0)object).a;
        return tp_2.u(this.a, n3);
    }

    public final boolean containsAll(Collection object) {
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object = (Iterable)object;
        object2 = object;
        int n3 = object2.isEmpty();
        boolean bl2 = true;
        if (n3 == 0) {
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = object.next();
                boolean bl3 = object2 instanceof ht3_0;
                if (bl3) {
                    object2 = (ht3_0)object2;
                    n3 = ((ht3_0)object2).a;
                    int[] nArray = this.a;
                    if ((n3 = (int)(tp_2.u(nArray, n3) ? 1 : 0)) != 0) continue;
                }
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        int[] nArray;
        boolean bl2;
        boolean bl3 = object instanceof it3_0;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(nArray = this.a, object = (Object)((it3_0)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final boolean isEmpty() {
        int[] nArray = this.a;
        boolean bl2 = nArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        int[] nArray = this.a;
        It3$a it3$a = new It3$a(nArray);
        return it3$a;
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
        StringBuilder stringBuilder = new StringBuilder("UIntArray(storage=");
        String string2 = Arrays.toString(this.a);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

