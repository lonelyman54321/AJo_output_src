/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.DiscreteDomain;
import java.util.NoSuchElementException;

final class Cut$BelowAll
extends Cut {
    private static final Cut$BelowAll INSTANCE;
    private static final long serialVersionUID;

    static {
        Cut$BelowAll cut$BelowAll;
        INSTANCE = cut$BelowAll = new Cut$BelowAll();
    }

    private Cut$BelowAll() {
        super((Comparable)((Object)""));
    }

    public static /* synthetic */ Cut$BelowAll access$000() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public Cut canonical(DiscreteDomain object) {
        try {
            object = ((DiscreteDomain)object).minValue();
        }
        catch (NoSuchElementException noSuchElementException) {
            return this;
        }
        return Cut.belowValue((Comparable)object);
    }

    public int compareTo(Cut cut) {
        int n3;
        if (cut == this) {
            n3 = 0;
            cut = null;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public void describeAsLowerBound(StringBuilder stringBuilder) {
        stringBuilder.append("(-\u221e");
    }

    public void describeAsUpperBound(StringBuilder object) {
        object = new AssertionError();
        throw object;
    }

    public Comparable endpoint() {
        IllegalStateException illegalStateException = new IllegalStateException("range unbounded on this side");
        throw illegalStateException;
    }

    public Comparable greatestValueBelow(DiscreteDomain object) {
        object = new AssertionError();
        throw object;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isLessThan(Comparable comparable) {
        return true;
    }

    public Comparable leastValueAbove(DiscreteDomain discreteDomain) {
        return discreteDomain.minValue();
    }

    public String toString() {
        return "-\u221e";
    }

    public BoundType typeAsLowerBound() {
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public BoundType typeAsUpperBound() {
        AssertionError assertionError = new AssertionError((Object)"this statement should be unreachable");
        throw assertionError;
    }

    public Cut withLowerBoundType(BoundType object, DiscreteDomain discreteDomain) {
        object = new IllegalStateException();
        throw object;
    }

    public Cut withUpperBoundType(BoundType object, DiscreteDomain discreteDomain) {
        object = new AssertionError((Object)"this statement should be unreachable");
        throw object;
    }
}

