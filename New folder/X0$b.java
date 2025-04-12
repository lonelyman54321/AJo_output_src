/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

public class X0$b
implements Iterator,
KMappedMarker {
    public int a;
    public final /* synthetic */ x0_0 b;

    public X0$b(x0_0 x0_02) {
        this.b = x0_02;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        x0_0 x0_02 = this.b;
        int n4 = x0_02.a();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            n3 = this.a;
            this.a = n4 = n3 + 1;
            return this.b.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

