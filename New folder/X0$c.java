/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class X0$c
extends X0$b
implements ListIterator {
    public final /* synthetic */ x0_0 c;

    public X0$c(x0_0 x0_02, int n3) {
        this.c = x0_02;
        super(x0_02);
        X0$a x0$a = x0_0.a;
        int n4 = x0_02.a();
        x0$a.getClass();
        X0$a.c(n3, n4);
        this.a = n3;
    }

    public final void add(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean hasPrevious() {
        int n3 = this.a;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final int nextIndex() {
        return this.a;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.a = n3 = this.a + -1;
            return this.c.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int previousIndex() {
        return this.a + -1;
    }

    public final void set(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }
}

