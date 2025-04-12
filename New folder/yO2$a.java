/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

public final class yO2$a
implements ListIterator,
KMutableListIterator {
    public final ListIterator a;
    public final /* synthetic */ yo2_2 b;

    public yO2$a(yo2_2 object, int n3) {
        this.b = object;
        List list = ((yo2_2)object).a;
        int n4 = dx_2.A(n3, (List)object);
        this.a = object = list.listIterator(n4);
    }

    public final void add(Object object) {
        ListIterator listIterator = this.a;
        listIterator.add(object);
        listIterator.previous();
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
        this.a.remove();
    }

    public final void set(Object object) {
        this.a.set(object);
    }
}

