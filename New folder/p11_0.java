/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from P11
 */
public final class p11_0
implements Iterator,
KMappedMarker {
    public final l73 a;
    public final int b;
    public int c;
    public final int d;

    public p11_0(l73 object, int n3, int n4) {
        this.a = object;
        this.b = n4;
        this.c = n3;
        this.d = n3 = ((l73)object).g;
        boolean bl2 = ((l73)object).f;
        if (!bl2) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final boolean hasNext() {
        int n3 = this.c;
        int n4 = this.b;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        Object object = this.a;
        int n3 = ((l73)object).g;
        int n4 = this.d;
        if (n3 == n4) {
            int n7;
            n3 = this.c;
            this.c = n7 = n73.e(((l73)object).a, n3) + n3;
            m73 m732 = new m73((l73)object, n3, n4);
            return m732;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

