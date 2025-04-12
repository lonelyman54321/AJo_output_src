/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class zO2$a
implements ListIterator,
KMappedMarker {
    public final ListIterator a;
    public final /* synthetic */ zo2_2 b;

    public zO2$a(zo2_2 object, int n3) {
        this.b = object;
        List list = ((zo2_2)object).b;
        int n4 = dx_2.A(n3, (List)object);
        this.a = object = list.listIterator(n4);
    }

    public final void add(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean hasNext() {
        return this.a.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.a.hasNext();
    }

    public final Object next() {
        return this.a.previous();
    }

    public final int nextIndex() {
        int n3 = this.a.previousIndex();
        return xx_2.h(this.b) - n3;
    }

    public final Object previous() {
        return this.a.next();
    }

    public final int previousIndex() {
        int n3 = this.a.nextIndex();
        return xx_2.h(this.b) - n3;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final void set(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }
}

