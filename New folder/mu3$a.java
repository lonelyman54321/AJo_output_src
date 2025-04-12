/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class mu3$a
implements Iterator,
KMappedMarker {
    public final short[] a;
    public int b;

    public mu3$a(short[] sArray) {
        Intrinsics.checkNotNullParameter(sArray, "array");
        this.a = sArray;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        short[] sArray = this.a;
        int n4 = sArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        Object object = this.a;
        int n4 = ((short[])object).length;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            n3 = object[n3];
            object = new lu3_0;
            object((short)n3);
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

