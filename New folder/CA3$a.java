/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class CA3$a
implements Iterator,
KMappedMarker {
    public final Iterator a;

    public CA3$a(ca3_0 object) {
        this.a = object = ((ca3_0)object).j.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return (EA3)this.a.next();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

