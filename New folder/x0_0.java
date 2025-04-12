/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from X0
 */
public abstract class x0_0
extends f0_0
implements List {
    public static final X0$a a;

    static {
        X0$a x0$a;
        a = x0$a = new X0$a(null);
    }

    public final void add(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object iterator) {
        Object e2;
        Object e5;
        boolean bl2 = true;
        if (iterator == this) {
            return bl2;
        }
        int n3 = iterator instanceof List;
        if (n3 == 0) {
            return false;
        }
        Iterator iterator2 = a;
        iterator = (Collection)((Object)iterator);
        iterator2.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        iterator2 = "other";
        Intrinsics.checkNotNullParameter(iterator, (String)((Object)iterator2));
        n3 = this.size();
        int n4 = iterator.size();
        if (n3 != n4) {
            return false;
        }
        iterator = iterator.iterator();
        iterator2 = this.iterator();
        do {
            if ((n4 = (int)(iterator2.hasNext() ? 1 : 0)) == 0) return bl2;
        } while ((n4 = (int)(Intrinsics.areEqual(e5 = iterator2.next(), e2 = iterator.next()) ? 1 : 0)) != 0);
        return false;
    }

    public final int hashCode() {
        int n3;
        a.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator iterator = this.iterator();
        int n4 = 1;
        while ((n3 = iterator.hasNext()) != 0) {
            Object e2 = iterator.next();
            n4 *= 31;
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3;
        block2: {
            boolean bl2;
            Iterator iterator = this.iterator();
            n3 = 0;
            while (bl2 = iterator.hasNext()) {
                Object e2 = iterator.next();
                bl2 = Intrinsics.areEqual(e2, object);
                if (!bl2) {
                    ++n3;
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    public Iterator iterator() {
        X0$b x0$b = new X0$b(this);
        return x0$b;
    }

    public int lastIndexOf(Object object) {
        int n3;
        block1: {
            boolean bl2;
            int n4 = this.size();
            ListIterator listIterator = this.listIterator(n4);
            while (bl2 = listIterator.hasPrevious()) {
                Object e2 = listIterator.previous();
                bl2 = Intrinsics.areEqual(e2, object);
                if (!bl2) continue;
                n3 = listIterator.nextIndex();
                break block1;
            }
            n3 = -1;
        }
        return n3;
    }

    public ListIterator listIterator() {
        X0$c x0$c = new X0$c(this, 0);
        return x0$c;
    }

    public ListIterator listIterator(int n3) {
        X0$c x0$c = new X0$c(this, n3);
        return x0$c;
    }

    public final Object remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final Object set(int n3, Object object) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public List subList(int n3, int n4) {
        X0$d x0$d = new X0$d(this, n3, n4);
        return x0$d;
    }
}

