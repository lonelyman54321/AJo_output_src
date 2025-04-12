/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from fi0
 */
public final class fi0_1
implements Iterable,
Iterator,
KMappedMarker {
    public final l73 a;
    public final int b;
    public int c;

    public fi0_1(l73 object, int n3) {
        int n4;
        this.a = object;
        int[] nArray = ((l73)object).a;
        int n7 = n73.d(nArray, n3);
        int n8 = ((l73)object).b;
        if (++n3 < n8) {
            object = ((l73)object).a;
            n4 = n73.d((int[])object, n3);
        } else {
            n4 = ((l73)object).d;
        }
        this.b = n4;
        this.c = n7;
    }

    public final boolean hasNext() {
        int n3 = this.c;
        int n4 = this.b;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        return this;
    }

    public final Object next() {
        Object object;
        int n3;
        int n4 = this.c;
        object = n4 >= 0 && n4 < (n3 = ((Object[])(object = this.a.c)).length) ? object[n4] : null;
        this.c = ++n4;
        return object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

