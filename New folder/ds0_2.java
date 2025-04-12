/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from dS0
 */
public abstract class ds0_2
implements Iterator,
KMappedMarker {
    public final Float next() {
        return Float.valueOf(this.nextFloat());
    }

    public abstract float nextFloat();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

