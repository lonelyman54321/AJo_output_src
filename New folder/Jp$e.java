/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class Jp$e
implements Collection {
    public final /* synthetic */ Jp a;

    public Jp$e(Jp jp) {
        this.a = jp;
    }

    public final boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        Jp jp = this.a;
        int n3 = jp.a(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = this.contains(e2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        Jp jp = this.a;
        Jp$f jp$f = new Jp$f(jp);
        return jp$f;
    }

    public final boolean remove(Object object) {
        Jp jp = this.a;
        int n3 = jp.a(object);
        if (n3 >= 0) {
            jp.j(n3);
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        int n3;
        Jp jp = this.a;
        int n4 = jp.c;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object = jp.l(i3);
            boolean bl3 = collection.contains(object);
            n3 = 1;
            if (!bl3) continue;
            jp.j(i3);
            i3 += -1;
            n4 += -1;
            bl2 = true;
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        int n3;
        Jp jp = this.a;
        int n4 = jp.c;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object = jp.l(i3);
            boolean bl3 = collection.contains(object);
            n3 = 1;
            if (bl3) continue;
            jp.j(i3);
            i3 += -1;
            n4 += -1;
            bl2 = true;
        }
        return bl2;
    }

    public final int size() {
        return this.a.c;
    }

    public final Object[] toArray() {
        Jp jp = this.a;
        int n3 = jp.c;
        Object[] objectArray = new Object[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            objectArray[i3] = object = jp.l(i3);
        }
        return objectArray;
    }

    public final Object[] toArray(Object[] objectArray) {
        Jp jp = this.a;
        int n3 = objectArray.length;
        int n4 = jp.c;
        if (n3 < n4) {
            objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n4);
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Object object;
            objectArray[n3] = object = jp.l(n3);
        }
        int n7 = objectArray.length;
        if (n7 > n4) {
            n7 = 0;
            jp = null;
            objectArray[n4] = null;
        }
        return objectArray;
    }
}

