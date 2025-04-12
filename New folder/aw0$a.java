/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class aw0$a
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public int b;

    public aw0$a(aw0_2 aw0_22) {
        int n3;
        Iterator iterator;
        this.a = iterator = aw0_22.a.iterator();
        this.b = n3 = aw0_22.b;
    }

    public final boolean hasNext() {
        Iterator iterator;
        while (true) {
            int n3 = this.b;
            iterator = this.a;
            if (n3 <= 0 || (n3 = (int)(iterator.hasNext() ? 1 : 0)) == 0) break;
            iterator.next();
            this.b = n3 = this.b + -1;
        }
        return iterator.hasNext();
    }

    public final Object next() {
        Iterator iterator;
        while (true) {
            int n3 = this.b;
            iterator = this.a;
            if (n3 <= 0 || (n3 = (int)(iterator.hasNext() ? 1 : 0)) == 0) break;
            iterator.next();
            this.b = n3 = this.b + -1;
        }
        return iterator.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

