/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from gS
 */
public abstract class gs_2
implements Iterator,
KMappedMarker {
    public final Character next() {
        return Character.valueOf(this.nextChar());
    }

    public abstract char nextChar();

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

