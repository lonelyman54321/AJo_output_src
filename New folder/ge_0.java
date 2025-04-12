/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

/*
 * Renamed from gE
 */
public final class ge_0
extends y0_0 {
    public final Object[] c;

    public ge_0(Object[] objectArray, int n3, int n4) {
        super(n3, n4);
        this.c = objectArray;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            n3 = this.a;
            this.a = n4 = n3 + 1;
            return this.c[n3];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.a = n3 = this.a + -1;
            return this.c[n3];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

