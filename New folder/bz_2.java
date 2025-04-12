/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from bz
 */
public abstract class bz_2
implements Iterator,
KMappedMarker {
    public final Boolean next() {
        return this.nextBoolean();
    }

    public abstract boolean nextBoolean();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

