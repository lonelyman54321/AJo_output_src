/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from is3
 */
public abstract class is3_0
implements Iterator,
KMappedMarker {
    public Object[] a;
    public int b;
    public int c;

    public is3_0() {
        Object[] objectArray = hs3_0.e.d;
        this.a = objectArray;
    }

    public final void a(Object[] objectArray, int n3, int n4) {
        this.a = objectArray;
        this.b = n3;
        this.c = n4;
    }

    public final boolean hasNext() {
        int n3 = this.c;
        int n4 = this.b;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

