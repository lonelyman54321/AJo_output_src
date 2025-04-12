/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class Jp$c
implements Set {
    public final /* synthetic */ Jp a;

    public Jp$c(Jp jp) {
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
        return this.a.containsKey(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.m(collection);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block7: {
            bl2 = true;
            if (this != object) {
                block6: {
                    int n3 = object instanceof Set;
                    if (n3 != 0) {
                        object = (Set)object;
                        n3 = this.size();
                        int n4 = object.size();
                        if (n3 != n4) break block6;
                        try {
                            boolean bl3 = this.containsAll((Collection)object);
                            if (!bl3) break block6;
                            break block7;
                        }
                        catch (ClassCastException | NullPointerException runtimeException) {}
                    }
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        Jp jp = this.a;
        int n3 = 0;
        for (int i3 = jp.c + -1; i3 >= 0; i3 += -1) {
            int n4;
            Object object = jp.h(i3);
            if (object == null) {
                n4 = 0;
                object = null;
            } else {
                n4 = object.hashCode();
            }
            n3 += n4;
        }
        return n3;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        Jp jp = this.a;
        Jp$b jp$b = new Jp$b(jp);
        return jp$b;
    }

    public final boolean remove(Object object) {
        Jp jp = this.a;
        int n3 = jp.f(object);
        if (n3 >= 0) {
            jp.j(n3);
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        return this.a.n(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.a.o(collection);
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
            objectArray[i3] = object = jp.h(i3);
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
            objectArray[n3] = object = jp.h(n3);
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

