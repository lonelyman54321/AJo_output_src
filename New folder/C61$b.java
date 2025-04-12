/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class C61$b
implements List,
KMappedMarker {
    public final int a;
    public final int b;
    public final /* synthetic */ C61 c;

    public C61$b(C61 c61, int n3, int n4) {
        this.c = c61;
        this.a = n3;
        this.b = n4;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
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
        int n3 = object instanceof LP1$c;
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.indexOf(object = (LP1$c)object);
        if (n4 != (n3 = -1)) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            LP1$c lP1$c = (LP1$c)object.next();
            bl2 = this.contains(lP1$c);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final Object get(int n3) {
        Object[] objectArray = this.c.a;
        int n4 = this.a;
        Object object = objectArray[n3 += n4];
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (LP1$c)object;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof LP1$c;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (LP1$c)object;
        n3 = this.a;
        int n7 = this.b;
        if (n3 <= n7) {
            int n8 = n3;
            while (true) {
                Object object2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(object2 = this.c.a[n8], object)) {
                    n4 = n8 - n3;
                    break;
                }
                if (n8 == n7) break;
                ++n8;
            }
        }
        return n4;
    }

    public final boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        int n3 = this.a;
        int n4 = this.b;
        C61 c61 = this.c;
        C61$a c61$a = new C61$a(c61, n3, n3, n4);
        return c61$a;
    }

    public final int lastIndexOf(Object object) {
        int n3 = object instanceof LP1$c;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (LP1$c)object;
        int n7 = this.a;
        n3 = this.b;
        if (n7 <= n3) {
            while (true) {
                Object object2;
                boolean bl2;
                if (bl2 = Intrinsics.areEqual(object2 = this.c.a[n3], object)) {
                    n4 = n3 - n7;
                    break;
                }
                if (n3 == n7) break;
                n3 += -1;
            }
        }
        return n4;
    }

    public final ListIterator listIterator() {
        int n3 = this.a;
        int n4 = this.b;
        C61 c61 = this.c;
        C61$a c61$a = new C61$a(c61, n3, n3, n4);
        return c61$a;
    }

    public final ListIterator listIterator(int n3) {
        int n4 = this.a;
        int n7 = this.b;
        C61 c61 = this.c;
        C61$a c61$a = new C61$a(c61, n3 += n4, n4, n7);
        return c61$a;
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void replaceAll(UnaryOperator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        int n3 = this.b;
        int n4 = this.a;
        return n3 - n4;
    }

    public final void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        int n7 = this.a;
        n3 += n7;
        C61 c61 = this.c;
        C61$b c61$b = new C61$b(c61, n3, n7 += n4);
        return c61$b;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }
}

