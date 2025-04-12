/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class cs3
implements Iterator,
KMappedMarker {
    public final Function1 a;
    public final ArrayList b;
    public Iterator c;

    public cs3(uc3_1 uc3_12, Function1 arrayList) {
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        this.c = uc3_12;
    }

    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final Object next() {
        boolean bl2;
        Object e2 = this.c.next();
        Iterator iterator = (Iterator)this.a.invoke(e2);
        ArrayList arrayList = this.b;
        if (iterator != null && (bl2 = iterator.hasNext())) {
            Iterator iterator2 = this.c;
            arrayList.add(iterator2);
            this.c = iterator;
        } else {
            boolean bl3;
            while (!(bl3 = (iterator = this.c).hasNext()) && (bl3 = arrayList.isEmpty() ^ true)) {
                this.c = iterator = (Iterator)CollectionsKt.S(arrayList);
                cx_2.y(arrayList);
            }
        }
        return e2;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

