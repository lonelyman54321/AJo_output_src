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
 * Renamed from Dt3
 */
public final class dt3_0
implements Collection,
KMappedMarker {
    public final byte[] a;

    public /* synthetic */ dt3_0(byte[] byArray) {
        this.a = byArray;
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
        boolean bl2 = object instanceof ct3_0;
        if (!bl2) {
            return false;
        }
        byte by2 = ((ct3_0)object).a;
        return tp_2.t(this.a, by2);
    }

    public final boolean containsAll(Collection object) {
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = object = (Iterable)object;
        object2 = object;
        byte by2 = object2.isEmpty();
        boolean bl2 = true;
        if (by2 == 0) {
            object = object.iterator();
            while ((by2 = object.hasNext()) != 0) {
                object2 = object.next();
                boolean bl3 = object2 instanceof ct3_0;
                if (bl3) {
                    object2 = (ct3_0)object2;
                    by2 = ((ct3_0)object2).a;
                    byte[] byArray = this.a;
                    if ((by2 = (byte)(tp_2.t(byArray, by2) ? 1 : 0)) != 0) continue;
                }
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        byte[] byArray;
        boolean bl2;
        boolean bl3 = object instanceof dt3_0;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(byArray = this.a, object = (Object)((dt3_0)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final boolean isEmpty() {
        byte[] byArray = this.a;
        boolean bl2 = byArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            byArray = null;
        }
        return bl2;
    }

    public final Iterator iterator() {
        byte[] byArray = this.a;
        Dt3$a dt3$a = new Dt3$a(byArray);
        return dt3$a;
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
        StringBuilder stringBuilder = new StringBuilder("UByteArray(storage=");
        String string2 = Arrays.toString(this.a);
        stringBuilder.append(string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

