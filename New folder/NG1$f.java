/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class NG1$f
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
            Object object = ng1_22.b;
            Intrinsics.checkNotNull(object);
            int n7 = this.c;
            object = object[n7];
            this.c();
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

