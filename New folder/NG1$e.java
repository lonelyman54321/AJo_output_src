/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class NG1$e
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
            Object object = ng1_22.a[n3];
            this.c();
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

