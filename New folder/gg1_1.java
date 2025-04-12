/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/*
 * Renamed from Gg1
 */
public abstract class gg1_1
implements Iterator,
KMutableIterator {
    public int a;
    public int b;
    public boolean c;

    public gg1_1(int n3) {
        this.a = n3;
    }

    public abstract Object a(int var1);

    public abstract void c(int var1);

    public final boolean hasNext() {
        int n3 = this.b;
        int n4 = this.a;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            n3 = this.b;
            Object object = this.a(n3);
            int n4 = this.b;
            int n7 = 1;
            this.b = n4 += n7;
            this.c = n7;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        int n3 = this.c;
        if (n3 != 0) {
            this.b = n3 = this.b + -1;
            this.c(n3);
            this.a = n3 = this.a + -1;
            this.c = false;
            return;
        }
        String string2 = "Call next() before removing an element.";
        Intrinsics.checkNotNullParameter(string2, "message");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

