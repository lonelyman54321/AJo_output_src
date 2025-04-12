/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Ci3$a
 */
public final class ci3$a_0
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public int b;
    public Object c;
    public final /* synthetic */ ci3_2 d;

    public ci3$a_0(ci3_2 object) {
        this.d = object;
        this.a = object = ((ci3_2)object).a.iterator();
        this.b = -1;
    }

    public final void a() {
        Boolean bl2;
        Iterator iterator = this.a;
        boolean bl3 = iterator.hasNext();
        if (bl3 && (bl3 = (bl2 = (Boolean)this.d.b.invoke(iterator = iterator.next())).booleanValue())) {
            this.b = 1;
            this.c = iterator;
            return;
        }
        this.b = 0;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        int n4 = -1;
        if (n3 == n4) {
            this.a();
        }
        if ((n3 = this.b) != (n4 = 1)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final Object next() {
        int n3 = this.b;
        int n4 = -1;
        if (n3 == n4) {
            this.a();
        }
        if ((n3 = this.b) != 0) {
            Object object = this.c;
            this.c = null;
            this.b = n4;
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

