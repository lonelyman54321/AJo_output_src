/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from dB1
 */
public abstract class db1_1
implements Iterator,
KMappedMarker {
    public final Long next() {
        return this.nextLong();
    }

    public abstract long nextLong();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

