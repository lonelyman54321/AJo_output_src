/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class fr3$a
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public final /* synthetic */ fr3_0 b;

    public fr3$a(fr3_0 object) {
        this.b = object;
        this.a = object = ((fr3_0)object).a.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Function1 function1 = this.b.b;
        Object e2 = this.a.next();
        return function1.invoke(e2);
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

