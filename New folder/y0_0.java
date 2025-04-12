/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Y0
 */
public abstract class y0_0
implements ListIterator,
KMappedMarker {
    public int a;
    public int b;

    public y0_0(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public void add(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        int n4 = this.b;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.a;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final int nextIndex() {
        return this.a;
    }

    public final int previousIndex() {
        return this.a + -1;
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public void set(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }
}

