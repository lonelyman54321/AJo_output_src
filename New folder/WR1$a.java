/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

public final class WR1$a
implements List,
KMutableList {
    public final WR1 a;

    public WR1$a(WR1 wR1) {
        this.a = wR1;
    }

    public final void add(int n3, Object object) {
        this.a.a(n3, object);
    }

    public final boolean add(Object object) {
        this.a.b(object);
        return true;
    }

    public final boolean addAll(int n3, Collection collection) {
        return this.a.e(n3, collection);
    }

    public final boolean addAll(Collection collection) {
        WR1 wR1 = this.a;
        int n3 = wR1.c;
        return wR1.e(n3, collection);
    }

    public final void clear() {
        this.a.g();
    }

    public final boolean contains(Object object) {
        return this.a.h(object);
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            boolean bl3;
            WR1 wR1 = this.a;
            wR1.getClass();
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                Object e2 = object.next();
                bl3 = wR1.h(e2);
                if (bl3) continue;
                bl2 = false;
                object = null;
                break block1;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final Object get(int n3) {
        XR1.a(n3, this);
        return this.a.a[n3];
    }

    public final int indexOf(Object object) {
        return this.a.j(object);
    }

    public final boolean isEmpty() {
        return this.a.k();
    }

    public final Iterator iterator() {
        WR1$c wR1$c = new WR1$c(this, 0);
        return wR1$c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int lastIndexOf(Object object) {
        Object object2;
        boolean bl2;
        Object[] objectArray = this.a;
        int n3 = objectArray.c;
        if (n3 <= 0) return -1;
        n3 += -1;
        objectArray = objectArray.a;
        while (!(bl2 = Intrinsics.areEqual(object, object2 = objectArray[n3]))) {
            if ((n3 += -1) >= 0) continue;
            return -1;
        }
        return n3;
    }

    public final ListIterator listIterator() {
        WR1$c wR1$c = new WR1$c(this, 0);
        return wR1$c;
    }

    public final ListIterator listIterator(int n3) {
        WR1$c wR1$c = new WR1$c(this, n3);
        return wR1$c;
    }

    public final Object remove(int n3) {
        XR1.a(n3, this);
        return this.a.n(n3);
    }

    public final boolean remove(Object object) {
        return this.a.m(object);
    }

    public final boolean removeAll(Collection object) {
        WR1 wR1 = this.a;
        wR1.getClass();
        int n3 = object.isEmpty();
        boolean bl2 = false;
        if (n3 == 0) {
            boolean bl3;
            n3 = wR1.c;
            object = ((Iterable)object).iterator();
            while (bl3 = object.hasNext()) {
                Object e2 = object.next();
                wR1.m(e2);
            }
            int n4 = wR1.c;
            if (n3 != n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        int n3;
        WR1 wR1 = this.a;
        int n4 = wR1.c;
        for (int i3 = n4 + -1; (n3 = -1) < i3; i3 += -1) {
            Object object = wR1.a[i3];
            n3 = (int)(collection.contains(object) ? 1 : 0);
            if (n3 != 0) continue;
            wR1.n(i3);
        }
        int n7 = wR1.c;
        if (n4 != n7) {
            n7 = 1;
        } else {
            n7 = 0;
            collection = null;
        }
        return n7 != 0;
    }

    public final Object set(int n3, Object object) {
        XR1.a(n3, this);
        Object[] objectArray = this.a.a;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        return object2;
    }

    public final int size() {
        return this.a.c;
    }

    public final List subList(int n3, int n4) {
        XR1.b(n3, n4, this);
        WR1$b wR1$b = new WR1$b(n3, n4, this);
        return wR1$b;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

