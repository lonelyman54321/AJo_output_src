/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class Dt3$a
implements Iterator,
KMappedMarker {
    public final byte[] a;
    public int b;

    public Dt3$a(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "array");
        this.a = byArray;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        byte[] byArray = this.a;
        int n4 = byArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        Object object = this.a;
        int n4 = ((byte[])object).length;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            n3 = object[n3];
            object = new ct3_0;
            object((byte)n3);
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

