/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class It3$a
implements Iterator,
KMappedMarker {
    public final int[] a;
    public int b;

    public It3$a(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
        this.a = nArray;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        int[] nArray = this.a;
        int n4 = nArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        Object object = this.a;
        int n4 = ((int[])object).length;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            n3 = object[n3];
            object = new ht3_0;
            object(n3);
            return object;
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

