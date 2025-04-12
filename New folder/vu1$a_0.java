/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/*
 * Renamed from Vu1$a
 */
public final class vu1$a_0
implements ListIterator,
KMutableListIterator {
    public final vu1_2 a;
    public int b;
    public int c;
    public int d;

    public vu1$a_0(vu1_2 vu1_22, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(vu1_22, "list");
        this.a = vu1_22;
        this.b = n3;
        this.c = -1;
        this.d = n4 = vu1_2.d(vu1_22);
    }

    public final void a() {
        int n3;
        Serializable serializable = this.a;
        int n4 = vu1_2.d(serializable);
        if (n4 == (n3 = this.d)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public final void add(Object object) {
        int n3;
        int n4;
        this.a();
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        vu1_2 vu1_22 = this.a;
        vu1_22.add(n7, object);
        this.c = -1;
        this.d = n3 = vu1_2.d(vu1_22);
    }

    public final boolean hasNext() {
        int n3 = this.b;
        vu1_2 vu1_22 = this.a;
        int n4 = vu1_22.c;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.b;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        this.a();
        int n3 = this.b;
        vu1_2 vu1_22 = this.a;
        int n4 = vu1_22.c;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            this.c = n3;
            Object[] objectArray = vu1_22.a;
            int n7 = vu1_22.b + n3;
            return objectArray[n7];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        this.a();
        int n3 = this.b;
        if (n3 > 0) {
            this.b = n3 += -1;
            this.c = n3;
            vu1_2 vu1_22 = this.a;
            Object[] objectArray = vu1_22.a;
            int n4 = vu1_22.b + n3;
            return objectArray[n4];
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int previousIndex() {
        return this.b + -1;
    }

    public final void remove() {
        this.a();
        int n3 = this.c;
        int n4 = -1;
        if (n3 != n4) {
            vu1_2 vu1_22 = this.a;
            vu1_22.c(n3);
            this.b = n3 = this.c;
            this.c = n4;
            this.d = n3 = vu1_2.d(vu1_22);
            return;
        }
        String string2 = "Call next() or previous() before removing element from the iterator.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void set(Object object) {
        this.a();
        int n3 = this.c;
        int n4 = -1;
        if (n3 != n4) {
            this.a.set(n3, object);
            return;
        }
        String string2 = "Call next() or previous() before replacing element from the iterator.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

