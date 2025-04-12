/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from rf3$a
 */
public final class rf3$a_0
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public int b;
    public final /* synthetic */ rf3_2 c;

    public rf3$a_0(rf3_2 object) {
        this.c = object;
        this.a = object = ((rf3_2)object).a.iterator();
    }

    public final boolean hasNext() {
        Iterator iterator;
        int n3;
        rf3_2 rf3_22;
        int n4;
        while (true) {
            n4 = this.b;
            rf3_22 = this.c;
            int n7 = rf3_22.b;
            n3 = 1;
            iterator = this.a;
            if (n4 >= n7 || (n4 = (int)(iterator.hasNext() ? 1 : 0)) == 0) break;
            iterator.next();
            this.b = n4 = this.b + n3;
        }
        n4 = this.b;
        int n8 = rf3_22.c;
        if (n4 >= n8 || (n4 = (int)(iterator.hasNext() ? 1 : 0)) == 0) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final Object next() {
        Iterator iterator;
        rf3_2 rf3_22;
        int n3;
        while (true) {
            n3 = this.b;
            rf3_22 = this.c;
            int n4 = rf3_22.b;
            iterator = this.a;
            if (n3 >= n4 || (n3 = (int)(iterator.hasNext() ? 1 : 0)) == 0) break;
            iterator.next();
            this.b = n3 = this.b + 1;
        }
        n3 = this.b;
        int n7 = rf3_22.c;
        if (n3 < n7) {
            this.b = ++n3;
            return iterator.next();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

