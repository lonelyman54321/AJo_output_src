/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class PR1$a$a
implements Iterator,
KMutableIterator {
    public int a = -1;
    public final wz2_1 b;
    public final /* synthetic */ pr1_1 c;

    public PR1$a$a(pr1_1 object) {
        this.c = object;
        PR1$a$a$a pR1$a$a$a = new PR1$a$a$a((pr1_1)object, this, null);
        this.b = object = zz2_1.a(pR1$a$a$a);
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return this.b.next();
    }

    public final void remove() {
        int n3 = this.a;
        int n4 = -1;
        if (n3 != n4) {
            pr1_1 pr1_12 = this.c;
            pr1_12.k(n3);
            this.a = n4;
        }
    }
}

