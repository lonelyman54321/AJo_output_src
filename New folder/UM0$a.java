/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class UM0$a
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public int b;
    public Object c;
    public final /* synthetic */ um0_2 d;

    public UM0$a(um0_2 object) {
        this.d = object;
        this.a = object = ((um0_2)object).a.iterator();
        this.b = -1;
    }

    public final void a() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.a).hasNext()) {
            iterator = iterator.next();
            um0_2 um0_22 = this.d;
            Boolean bl3 = (Boolean)um0_22.c.invoke(iterator);
            boolean bl4 = bl3;
            if (bl4 != (bl2 = um0_22.b)) continue;
            this.c = iterator;
            this.b = 1;
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

