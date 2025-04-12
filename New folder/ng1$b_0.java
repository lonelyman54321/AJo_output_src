/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/*
 * Renamed from NG1$b
 */
public final class ng1$b_0
extends NG1$d
implements Iterator,
KMutableIterator {
    public final Object next() {
        this.a();
        int n3 = this.b;
        ng1_2 ng1_22 = this.a;
        int n4 = ng1_22.f;
        if (n3 < n4) {
            this.b = n4 = n3 + 1;
            this.c = n3;
            NG1$c nG1$c = new NG1$c(ng1_22, n3);
            this.c();
            return nG1$c;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

