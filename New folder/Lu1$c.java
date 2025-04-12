/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class Lu1$c
implements Iterator {
    public ku1_1 a;

    public Lu1$c(ku1_1 ku1_12) {
        this.a = ku1_12;
    }

    public abstract ku1_1 a();

    public final boolean hasNext() {
        boolean bl2;
        ku1_1 ku1_12 = this.a;
        if (ku1_12 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            ku1_12 = null;
        }
        return bl2;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            ku1_1 ku1_12;
            ku1_1 ku1_13 = this.a;
            this.a = ku1_12 = this.a();
            return ku1_13;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

