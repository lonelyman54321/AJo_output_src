/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class lo0$a
implements Iterator,
KMutableIterator {
    public final Iterator a;
    public final /* synthetic */ lo0_2 b;

    public lo0$a(lo0_2 object) {
        this.b = object;
        this.a = object = ((lo0_2)object).a.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Function1 function1 = this.b.b;
        Object e2 = this.a.next();
        return function1.invoke(e2);
    }

    public final void remove() {
        this.a.remove();
    }
}

