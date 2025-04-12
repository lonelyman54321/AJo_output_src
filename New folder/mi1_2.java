/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Mi1
 */
public abstract class mi1_2
implements Iterator,
KMappedMarker {
    public final Integer next() {
        return this.nextInt();
    }

    public abstract int nextInt();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

