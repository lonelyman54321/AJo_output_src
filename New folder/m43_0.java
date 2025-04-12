/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from m43
 */
public abstract class m43_0
implements Iterator,
KMappedMarker {
    public final Short next() {
        return this.nextShort();
    }

    public abstract short nextShort();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

