/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from ks0
 */
public abstract class ks0_1
implements Iterator,
KMappedMarker {
    public final Double next() {
        return this.nextDouble();
    }

    public abstract double nextDouble();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

