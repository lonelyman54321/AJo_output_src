/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

public final class WR1$c
implements ListIterator,
KMutableListIterator {
    public final List a;
    public int b;

    public WR1$c(List list, int n3) {
        this.a = list;
        this.b = n3;
    }

    public final void add(Object object) {
        int n3;
        List list = this.a;
        int n4 = this.b;
        list.add(n4, object);
        this.b = n3 = this.b + 1;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        List list = this.a;
        int n4 = list.size();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.b;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        return this.a.get(n4);
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        int n3;
        this.b = n3 = this.b + -1;
        return this.a.get(n3);
    }

    public final int previousIndex() {
        return this.b + -1;
    }

    public final void remove() {
        int n3;
        this.b = n3 = this.b + -1;
        this.a.remove(n3);
    }

    public final void set(Object object) {
        List list = this.a;
        int n3 = this.b;
        list.set(n3, object);
    }
}

