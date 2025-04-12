/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from lz0
 */
public final class lz0_2
implements ListIterator,
KMappedMarker {
    public static final lz0_2 a;

    static {
        lz0_2 lz0_22;
        a = lz0_22 = new Object();
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final Object next() {
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int nextIndex() {
        return 0;
    }

    public final Object previous() {
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

