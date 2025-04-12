/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class a1$d$a
implements Iterator,
KMappedMarker {
    public final /* synthetic */ Iterator a;

    public a1$d$a(Iterator iterator) {
        this.a = iterator;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry)this.a.next()).getValue();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

