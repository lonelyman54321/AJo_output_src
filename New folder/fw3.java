/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class fw3
extends AbstractList
implements Dt1,
RandomAccess {
    public final Dt1 a;

    public fw3(Dt1 dt1) {
        this.a = dt1;
    }

    public final Object get(int n3) {
        return (String)this.a.get(n3);
    }

    public final Object getRaw(int n3) {
        return this.a.getRaw(n3);
    }

    public final List getUnderlyingElements() {
        return this.a.getUnderlyingElements();
    }

    public final Dt1 getUnmodifiableView() {
        return this;
    }

    public final Iterator iterator() {
        fw3$b fw3$b = new fw3$b(this);
        return fw3$b;
    }

    public final ListIterator listIterator(int n3) {
        fw3$a fw3$a = new fw3$a(this, n3);
        return fw3$a;
    }

    public final void n(DF serializable) {
        serializable = new UnsupportedOperationException();
        throw serializable;
    }

    public final int size() {
        return this.a.size();
    }
}

