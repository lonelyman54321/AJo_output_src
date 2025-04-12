/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class JO0$a
implements Iterator,
KMappedMarker {
    public final Iterator a;
    public Iterator b;
    public final /* synthetic */ jo0_1 c;

    public JO0$a(jo0_1 object) {
        this.c = object;
        this.a = object = ((jo0_1)object).a.iterator();
    }

    public final boolean a() {
        boolean bl2;
        block3: {
            Function1 function1;
            boolean bl3;
            boolean bl4;
            Object object = this.b;
            if (object != null && !(bl4 = object.hasNext())) {
                bl4 = false;
                object = null;
                this.b = null;
            }
            do {
                object = this.b;
                bl2 = true;
                if (object != null) break block3;
                object = this.a;
                bl3 = object.hasNext();
                if (!bl3) {
                    return false;
                }
                object = object.next();
                Object object2 = this.c;
                function1 = ((jo0_1)object2).c;
                object2 = ((jo0_1)object2).b;
                object = object2.invoke(object);
            } while (!(bl3 = (object = (Iterator)function1.invoke(object)).hasNext()));
            this.b = object;
        }
        return bl2;
    }

    public final boolean hasNext() {
        return this.a();
    }

    public final Object next() {
        boolean bl2 = this.a();
        if (bl2) {
            Iterator iterator = this.b;
            Intrinsics.checkNotNull(iterator);
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

