/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from fa3
 */
public final class fa3_0
implements Iterator,
KMappedMarker {
    public int a;
    public final /* synthetic */ ca3 b;

    public fa3_0(ca3 ca32) {
        this.b = ca32;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        ca3 ca32 = this.b;
        int n4 = ca32.j();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        int n4 = this.a;
        this.a = n3 = n4 + 1;
        return this.b.k(n4);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

