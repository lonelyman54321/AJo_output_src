/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class DF$a
implements Iterator {
    public final Object next() {
        Object object = this;
        object = (cf_1)this;
        int n3 = ((cf_1)object).a;
        int n4 = ((cf_1)object).b;
        if (n3 < n4) {
            ((cf_1)object).a = n4 = n3 + 1;
            return ((cf_1)object).c.d(n3);
        }
        object = new NoSuchElementException();
        throw object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

