/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Cut$1;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

final class Cut$AboveValue
extends Cut {
    private static final long serialVersionUID;

    public Cut$AboveValue(Comparable comparable) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        super(comparable);
    }

    public Cut canonical(DiscreteDomain object) {
        object = (object = this.leastValueAbove((DiscreteDomain)object)) != null ? Cut.belowValue((Comparable)object) : Cut.aboveAll();
        return object;
    }

    public void describeAsLowerBound(StringBuilder stringBuilder) {
        stringBuilder.append('(');
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
    }

    public void describeAsUpperBound(StringBuilder stringBuilder) {
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
        stringBuilder.append(']');
    }

    public Comparable greatestValueBelow(DiscreteDomain discreteDomain) {
        return this.endpoint;
    }

    public int hashCode() {
        return ~this.endpoint.hashCode();
    }

    public boolean isLessThan(Comparable comparable) {
        Comparable comparable2 = this.endpoint;
        int n3 = Range.compareOrThrow(comparable2, comparable);
        if (n3 < 0) {
            n3 = 1;
        } else {
            n3 = 0;
            comparable = null;
        }
        return n3 != 0;
    }

    public Comparable leastValueAbove(DiscreteDomain discreteDomain) {
        Comparable comparable = this.endpoint;
        return discreteDomain.next(comparable);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("/");
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
        stringBuilder.append("\\");
        return stringBuilder.toString();
    }

    public BoundType typeAsLowerBound() {
        return BoundType.OPEN;
    }

    public BoundType typeAsUpperBound() {
        return BoundType.CLOSED;
    }

    public Cut withLowerBoundType(BoundType object, DiscreteDomain discreteDomain) {
        int[] nArray = Cut$1.$SwitchMap$com$google$common$collect$BoundType;
        int n3 = object.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 == n7) {
                return this;
            }
            object = new AssertionError();
            throw object;
        }
        object = this.endpoint;
        object = (object = discreteDomain.next((Comparable)object)) == null ? Cut.belowAll() : Cut.belowValue((Comparable)object);
        return object;
    }

    public Cut withUpperBoundType(BoundType object, DiscreteDomain discreteDomain) {
        int[] nArray = Cut$1.$SwitchMap$com$google$common$collect$BoundType;
        int n3 = object.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 == n4) {
                object = this.endpoint;
                object = (object = discreteDomain.next((Comparable)object)) == null ? Cut.aboveAll() : Cut.belowValue((Comparable)object);
                return object;
            }
            object = new AssertionError();
            throw object;
        }
        return this;
    }
}

