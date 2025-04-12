/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

public final class K53
extends y0_0 {
    public final Object c;

    public K53(Object object, int n3) {
        super(n3, 1);
        this.c = object;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            this.a = n3 = this.a + 1;
            return this.c;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.a = n3 = this.a + -1;
            return this.c;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

