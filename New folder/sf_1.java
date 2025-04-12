/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from sF
 */
public abstract class sf_1
implements Iterator,
KMappedMarker {
    public final Byte next() {
        return this.nextByte();
    }

    public abstract byte nextByte();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

