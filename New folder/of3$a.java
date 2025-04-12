/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.markers.KMutableListIterator;

public final class of3$a
implements ListIterator,
KMutableListIterator {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ of3_1 b;

    public of3$a(Ref$IntRef ref$IntRef, of3_1 of3_12) {
        this.a = ref$IntRef;
        this.b = of3_12;
    }

    public final void add(Object object) {
        String string2 = "Cannot modify a state list through an iterator".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final boolean hasNext() {
        Ref$IntRef ref$IntRef = this.a;
        int n3 = ref$IntRef.element;
        of3_1 of3_12 = this.b;
        int n4 = of3_12.d;
        int n7 = 1;
        if (n3 >= (n4 -= n7)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final boolean hasPrevious() {
        Ref$IntRef ref$IntRef = this.a;
        int n3 = ref$IntRef.element;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            ref$IntRef = null;
        }
        return n3 != 0;
    }

    public final Object next() {
        Ref$IntRef ref$IntRef = this.a;
        int n3 = ref$IntRef.element + 1;
        of3_1 of3_12 = this.b;
        int n4 = of3_12.d;
        Q83.a(n3, n4);
        ref$IntRef.element = n3;
        return of3_12.get(n3);
    }

    public final int nextIndex() {
        return this.a.element + 1;
    }

    public final Object previous() {
        Ref$IntRef ref$IntRef = this.a;
        int n3 = ref$IntRef.element;
        of3_1 of3_12 = this.b;
        int n4 = of3_12.d;
        Q83.a(n3, n4);
        ref$IntRef.element = n4 = n3 + -1;
        return of3_12.get(n3);
    }

    public final int previousIndex() {
        return this.a.element;
    }

    public final void remove() {
        String string2 = "Cannot modify a state list through an iterator".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void set(Object object) {
        String string2 = "Cannot modify a state list through an iterator".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

