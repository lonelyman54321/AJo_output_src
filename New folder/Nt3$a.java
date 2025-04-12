/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class Nt3$a
implements Iterator,
KMappedMarker {
    public final long[] a;
    public int b;

    public Nt3$a(long[] lArray) {
        Intrinsics.checkNotNullParameter(lArray, "array");
        this.a = lArray;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        long[] lArray = this.a;
        int n4 = lArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        Object object = this.a;
        int n4 = ((long[])object).length;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            long l2 = object[n3];
            mt3_0 mt3_02 = new mt3_0(l2);
            return mt3_02;
        }
        object = String.valueOf(this.b);
        NoSuchElementException noSuchElementException = new NoSuchElementException((String)object);
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

