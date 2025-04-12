/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from kr2
 */
public final class kr2_0
implements Iterator,
KMappedMarker {
    public Object a;
    public final Map b;
    public int c;

    public kr2_0(Object object, Map map2) {
        this.a = object;
        this.b = map2;
    }

    public final boolean hasNext() {
        int n3 = this.c;
        Map map2 = this.b;
        int n4 = map2.size();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            int n3;
            Object object = this.a;
            this.c = n3 = this.c + 1;
            Object object2 = this.b.get(object);
            if (object2 != null) {
                object2 = ((Su1)object2).b;
                this.a = object2;
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder("Hash code of an element (");
            stringBuilder.append(object);
            stringBuilder.append(") has changed after it was added to the persistent set.");
            object = stringBuilder.toString();
            object2 = new Object((String)object);
            throw object2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

