/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/*
 * Renamed from Ob3
 */
public final class ob3_2
implements ListIterator,
KMutableListIterator {
    public final p83_0 a;
    public int b;
    public int c;
    public int d;

    public ob3_2(p83_0 p83_02, int n3) {
        int n4;
        this.a = p83_02;
        this.b = n3 += -1;
        this.c = -1;
        this.d = n4 = p83_02.c();
    }

    public final void a() {
        int n3;
        Object object = this.a;
        int n4 = ((p83_0)object).c();
        if (n4 == (n3 = this.d)) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final void add(Object object) {
        int n3;
        this.a();
        int n4 = this.b + 1;
        p83_0 p83_02 = this.a;
        p83_02.add(n4, object);
        this.c = -1;
        this.b = n3 = this.b + 1;
        this.d = n3 = p83_02.c();
    }

    public final boolean hasNext() {
        int n3 = this.b;
        p83_0 p83_02 = this.a;
        int n4 = p83_02.size();
        int n7 = 1;
        if (n3 >= (n4 -= n7)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.b;
        n3 = n3 >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        this.a();
        this.c = n3 = this.b + 1;
        Object object = this.a;
        int n4 = ((p83_0)object).size();
        Q83.a(n3, n4);
        object = ((p83_0)object).get(n3);
        this.b = n3;
        return object;
    }

    public final int nextIndex() {
        return this.b + 1;
    }

    public final Object previous() {
        int n3;
        this.a();
        int n4 = this.b;
        p83_0 p83_02 = this.a;
        int n7 = p83_02.size();
        Q83.a(n4, n7);
        this.c = n4 = this.b;
        Object object = p83_02.get(n4);
        this.b = n3 = this.b + -1;
        return object;
    }

    public final int previousIndex() {
        return this.b;
    }

    public final void remove() {
        this.a();
        int n3 = this.b;
        p83_0 p83_02 = this.a;
        p83_02.remove(n3);
        n3 = this.b;
        int n4 = -1;
        this.b = n3 += n4;
        this.c = n4;
        this.d = n3 = p83_02.c();
    }

    public final void set(Object object) {
        this.a();
        int n3 = this.c;
        if (n3 >= 0) {
            int n4;
            p83_0 p83_02 = this.a;
            p83_02.set(n3, object);
            this.d = n4 = p83_02.c();
            return;
        }
        String string2 = "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

