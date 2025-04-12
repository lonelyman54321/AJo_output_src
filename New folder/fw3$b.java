/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class fw3$b
implements Iterator {
    public final Iterator a;

    public fw3$b(fw3 object) {
        this.a = object = ((fw3)object).a.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return (String)this.a.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

