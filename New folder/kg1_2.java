/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Kg1
 */
public final class kg1_2
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public int b;

    public kg1_2(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.a = iterator;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        int n3;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        if (n4 >= 0) {
            Object e2 = this.a.next();
            IndexedValue indexedValue = new IndexedValue(n4, e2);
            return indexedValue;
        }
        xx_2.n();
        throw null;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

