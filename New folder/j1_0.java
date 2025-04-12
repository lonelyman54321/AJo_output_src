/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from j1
 */
public abstract class j1_0
extends x0_0
implements ir2 {
    public ir2 addAll(Collection collection) {
        nr2 nr22 = this.b();
        nr22.addAll(collection);
        return nr22.d();
    }

    public final boolean contains(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block4: {
            Iterable iterable;
            boolean bl3;
            block3: {
                object = (Iterable)object;
                bl3 = object instanceof Collection;
                bl2 = true;
                if (!bl3) break block3;
                iterable = object;
                iterable = (Collection)object;
                bl3 = iterable.isEmpty();
                if (bl3) break block4;
            }
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                iterable = object.next();
                bl3 = this.contains(iterable);
                if (bl3) continue;
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ir2 remove(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 != (n3 = -1)) {
            return this.k(n4);
        }
        return this;
    }

    public final ir2 removeAll(Collection collection) {
        j1$a j1$a = new j1$a(collection);
        return this.A(j1$a);
    }

    public final List subList(int n3, int n4) {
        Xe1$a xe1$a = new Xe1$a(this, n3, n4);
        return xe1$a;
    }
}

