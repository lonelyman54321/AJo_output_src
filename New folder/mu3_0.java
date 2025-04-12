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
 * Renamed from mu3
 */
public final class mu3_0
implements Collection,
KMappedMarker {
    public final short[] a;

    public /* synthetic */ mu3_0(short[] sArray) {
        this.a = sArray;
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
        boolean bl2 = object instanceof lu3_0;
        if (!bl2) {
            return false;
        }
        short s7 = ((lu3_0)object).a;
        return tp_2.x(this.a, s7);
    }

    public final boolean containsAll(Collection object) {
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object = (Iterable)object;
        object2 = object;
        short s7 = object2.isEmpty();
        boolean bl2 = true;
        if (s7 == 0) {
            object = object.iterator();
            while ((s7 = object.hasNext()) != 0) {
                object2 = object.next();
                boolean bl3 = object2 instanceof lu3_0;
                if (bl3) {
                    object2 = (lu3_0)object2;
                    s7 = ((lu3_0)object2).a;
                    short[] sArray = this.a;
                    if ((s7 = (short)(tp_2.x(sArray, s7) ? 1 : 0)) != 0) continue;
                }
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        short[] sArray;
        boolean bl2;
        boolean bl3 = object instanceof mu3_0;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(sArray = this.a, object = (Object)((mu3_0)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final boolean isEmpty() {
        short[] sArray = this.a;
        boolean bl2 = sArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            sArray = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        short[] sArray = this.a;
        mu3$a mu3$a = new mu3$a(sArray);
        return mu3$a;
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
        StringBuilder stringBuilder = new StringBuilder("UShortArray(storage=");
        String string2 = Arrays.toString(this.a);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

