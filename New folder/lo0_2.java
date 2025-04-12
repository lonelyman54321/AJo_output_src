/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/*
 * Renamed from lo0
 */
public final class lo0_2
implements Set,
KMutableSet {
    public final Set a;
    public final Function1 b;
    public final Function1 c;
    public final int d;

    public lo0_2(Set set, Function1 function1, Function1 function12) {
        int n3;
        Intrinsics.checkNotNullParameter(set, "delegate");
        Intrinsics.checkNotNullParameter(function1, "convertTo");
        Intrinsics.checkNotNullParameter(function12, "convert");
        this.a = set;
        this.b = function1;
        this.c = function12;
        this.d = n3 = set.size();
    }

    public final ArrayList a(Collection object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList arrayList = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = object.next();
            Function1 function1 = this.c;
            object2 = function1.invoke(object2);
            arrayList.add(object2);
        }
        return arrayList;
    }

    public final boolean add(Object object) {
        object = this.c.invoke(object);
        return this.a.add(object);
    }

    public final boolean addAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        collection = this.a(collection);
        return this.a.addAll(collection);
    }

    public final ArrayList c(Collection object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList arrayList = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = object.next();
            Function1 function1 = this.b;
            object2 = function1.invoke(object2);
            arrayList.add(object2);
        }
        return arrayList;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        object = this.c.invoke(object);
        return this.a.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        collection = this.a(collection);
        return this.a.containsAll(collection);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = false;
        if (object != null && (bl2 = object instanceof Set)) {
            boolean bl4;
            Collection collection = this.a;
            collection = this.c(collection);
            Object object2 = object;
            object2 = (Set)object;
            boolean bl5 = object2.containsAll(collection);
            if (bl5 && (bl4 = collection.containsAll((Collection<?>)(object = (Collection)object)))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        lo0$a lo0$a = new lo0$a(this);
        return lo0$a;
    }

    public final boolean remove(Object object) {
        object = this.c.invoke(object);
        return this.a.remove(object);
    }

    public final boolean removeAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        collection = CollectionsKt.o0(this.a(collection));
        return this.a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        collection = CollectionsKt.o0(this.a(collection));
        return this.a.retainAll(collection);
    }

    public final int size() {
        return this.d;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        Collection collection = this.a;
        return ((Object)this.c(collection)).toString();
    }
}

