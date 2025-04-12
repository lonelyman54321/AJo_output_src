/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

public final class fw3$a
implements ListIterator {
    public final ListIterator a;

    public fw3$a(fw3 object, int n3) {
        this.a = object = ((fw3)object).a.listIterator(n3);
    }

    public final void add(Object object) {
        object = (String)object;
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public final Object next() {
        return (String)this.a.next();
    }

    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final Object previous() {
        return (String)this.a.previous();
    }

    public final int previousIndex() {
        return this.a.previousIndex();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void set(Object object) {
        object = (String)object;
        object = new UnsupportedOperationException();
        throw object;
    }
}

