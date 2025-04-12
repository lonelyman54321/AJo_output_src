/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class Bi3$a
implements Iterator,
KMappedMarker {
    public int a;
    public final Iterator b;

    public Bi3$a(bi3_2 object) {
        int n3;
        this.a = n3 = ((bi3_2)object).b;
        this.b = object = ((bi3_2)object).a.iterator();
    }

    public final boolean hasNext() {
        Iterator iterator;
        int n3 = this.a;
        if (n3 > 0 && (n3 = (int)((iterator = this.b).hasNext() ? 1 : 0))) {
            n3 = 1;
        } else {
            n3 = 0;
            iterator = null;
        }
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.a;
        if (n3 != 0) {
            this.a = n3 += -1;
            return this.b.next();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

