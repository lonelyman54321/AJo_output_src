/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

public final class or2
extends y0_0 {
    public final Object[] c;
    public final gs3_0 d;

    public or2(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        super(n3, n4);
        gs3_0 gs3_02;
        this.c = objectArray2;
        int n8 = (n4 += -1) & 0xFFFFFFE0;
        if (n3 > n8) {
            n3 = n8;
        }
        this.d = gs3_02 = new gs3_0(objectArray, n3, n8, n7);
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            gs3_0 gs3_02 = this.d;
            int n7 = gs3_02.hasNext();
            if (n7 != 0) {
                this.a = n7 = this.a + 1;
                return gs3_02.next();
            }
            n7 = this.a;
            this.a = n4 = n7 + 1;
            n3 = gs3_02.b;
            return this.c[n7 -= n3];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            n3 = this.a;
            gs3_0 gs3_02 = this.d;
            int n4 = gs3_02.b;
            if (n3 > n4) {
                this.a = n3 += -1;
                return this.c[n3 -= n4];
            }
            this.a = n3 += -1;
            return gs3_02.previous();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

