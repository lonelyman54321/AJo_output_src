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

public final class WR1$b
implements List,
KMutableList {
    public final List a;
    public final int b;
    public int c;

    public WR1$b(int n3, int n4, List list) {
        this.a = list;
        this.b = n3;
        this.c = n4;
    }

    public final void add(int n3, Object object) {
        int n4 = this.b;
        this.a.add(n3 += n4, object);
        this.c = n3 = this.c + 1;
    }

    public final boolean add(Object object) {
        int n3;
        int n4 = this.c;
        this.c = n3 = n4 + 1;
        this.a.add(n4, object);
        return true;
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4 = this.b;
        List list = this.a;
        list.addAll(n3 += n4, collection);
        n3 = this.c;
        this.c = n4 = collection.size() + n3;
        n3 = collection.size();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean addAll(Collection collection) {
        void var5_8;
        List list = this.a;
        int n3 = this.c;
        list.addAll(n3, collection);
        int n4 = this.c;
        this.c = n3 = collection.size() + n4;
        int bl2 = collection.size();
        if (bl2 > 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            collection = null;
        }
        return (boolean)var5_8;
    }

    public final void clear() {
        int n3 = this.b;
        int n4 = this.c + -1;
        if (n3 <= n4) {
            while (true) {
                List list = this.a;
                list.remove(n4);
                if (n4 == n3) break;
                n4 += -1;
            }
        }
        this.c = n3;
    }

    public final boolean contains(Object object) {
        int n3 = this.c;
        for (int i3 = this.b; i3 < n3; ++i3) {
            Object e2 = this.a.get(i3);
            boolean bl2 = Intrinsics.areEqual(e2, object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = this.contains(e2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final Object get(int n3) {
        XR1.a(n3, this);
        int n4 = this.b;
        return this.a.get(n3 += n4);
    }

    public final int indexOf(Object object) {
        int n3;
        int n4 = this.c;
        for (int i3 = n3 = this.b; i3 < n4; ++i3) {
            Object e2 = this.a.get(i3);
            boolean bl2 = Intrinsics.areEqual(e2, object);
            if (!bl2) continue;
            return i3 - n3;
        }
        return -1;
    }

    public final boolean isEmpty() {
        int n3 = this.c;
        int n4 = this.b;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        WR1$c wR1$c = new WR1$c(this, 0);
        return wR1$c;
    }

    public final int lastIndexOf(Object object) {
        int n3 = this.b;
        int n4 = this.c + -1;
        if (n3 <= n4) {
            while (true) {
                Object e2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(e2 = this.a.get(n4), object)) {
                    return n4 - n3;
                }
                if (n4 == n3) break;
                n4 += -1;
            }
        }
        return -1;
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
        int n4 = this.b;
        Object e2 = this.a.remove(n3 += n4);
        this.c = n4 = this.c + -1;
        return e2;
    }

    public final boolean remove(Object object) {
        int n3 = this.c;
        for (int i3 = this.b; i3 < n3; ++i3) {
            int n4;
            List list = this.a;
            Object e2 = list.get(i3);
            boolean bl2 = Intrinsics.areEqual(e2, object);
            if (!bl2) continue;
            list.remove(i3);
            this.c = n4 = this.c + -1;
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection object) {
        boolean bl2;
        int n3 = this.c;
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            this.remove(e2);
        }
        int n4 = this.c;
        if (n3 != n4) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final boolean retainAll(Collection collection) {
        int n3;
        int n4 = this.b;
        int n7 = this.c;
        int n8 = n7 + -1;
        if (n4 <= n8) {
            while (true) {
                List list;
                Object e2;
                boolean bl2;
                if (!(bl2 = collection.contains(e2 = (list = this.a).get(n8)))) {
                    int n10;
                    list.remove(n8);
                    this.c = n10 = this.c + -1;
                }
                if (n8 == n4) break;
                n8 += -1;
            }
        }
        if (n7 != (n3 = this.c)) {
            n3 = 1;
        } else {
            n3 = 0;
            collection = null;
        }
        return n3;
    }

    public final Object set(int n3, Object object) {
        XR1.a(n3, this);
        int n4 = this.b;
        return this.a.set(n3 += n4, object);
    }

    public final int size() {
        int n3 = this.c;
        int n4 = this.b;
        return n3 - n4;
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

