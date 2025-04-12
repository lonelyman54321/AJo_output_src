/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from fZ0$a
 */
public final class fz0$a_0
implements Iterator,
KMappedMarker {
    public Object a;
    public int b = -2;
    public final /* synthetic */ fz0_2 c;

    public fz0$a_0(fz0_2 fz0_22) {
        this.c = fz0_22;
    }

    public final void a() {
        Object object;
        int n3 = this.b;
        int n4 = -2;
        fz0_2 fz0_22 = this.c;
        if (n3 == n4) {
            object = fz0_22.a.invoke();
        } else {
            object = fz0_22.b;
            Object object2 = this.a;
            Intrinsics.checkNotNull(object2);
            object = object.invoke(object2);
        }
        this.a = object;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        this.b = n3;
    }

    public final boolean hasNext() {
        int n3;
        int n4 = this.b;
        if (n4 < 0) {
            this.a();
        }
        if ((n4 = this.b) != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        if (n3 < 0) {
            this.a();
        }
        if ((n3 = this.b) != 0) {
            Object object = this.a;
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

