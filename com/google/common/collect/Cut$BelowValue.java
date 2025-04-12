/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Cut$1;
import com.google.common.collect.Cut$AboveValue;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

final class Cut$BelowValue
extends Cut {
    private static final long serialVersionUID;

    public Cut$BelowValue(Comparable comparable) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        super(comparable);
    }

    public void describeAsLowerBound(StringBuilder stringBuilder) {
        stringBuilder.append('[');
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
    }

    public void describeAsUpperBound(StringBuilder stringBuilder) {
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
        stringBuilder.append(')');
    }

    public Comparable greatestValueBelow(DiscreteDomain discreteDomain) {
        Comparable comparable = this.endpoint;
        return discreteDomain.previous(comparable);
    }

    public int hashCode() {
        return this.endpoint.hashCode();
    }

    public boolean isLessThan(Comparable comparable) {
        Comparable comparable2 = this.endpoint;
        int n3 = Range.compareOrThrow(comparable2, comparable);
        if (n3 <= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            comparable = null;
        }
        return n3 != 0;
    }

    public Comparable leastValueAbove(DiscreteDomain discreteDomain) {
        return this.endpoint;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\\");
        Comparable comparable = this.endpoint;
        stringBuilder.append(comparable);
        stringBuilder.append("/");
        return stringBuilder.toString();
    }

    public BoundType typeAsLowerBound() {
        return BoundType.CLOSED;
    }

    public BoundType typeAsUpperBound() {
        return BoundType.OPEN;
    }

    public Cut withLowerBoundType(BoundType object, DiscreteDomain object2) {
        int[] nArray = Cut$1.$SwitchMap$com$google$common$collect$BoundType;
        int n3 = object.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 == n4) {
                object = this.endpoint;
                if ((object = ((DiscreteDomain)object2).previous((Comparable)object)) == null) {
                    object = Cut.belowAll();
                } else {
                    object2 = new Cut$AboveValue((Comparable)object);
                    object = object2;
                }
                return object;
            }
            object = new AssertionError();
            throw object;
        }
        return this;
    }

    public Cut withUpperBoundType(BoundType object, DiscreteDomain object2) {
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
        if ((object = ((DiscreteDomain)object2).previous((Comparable)object)) == null) {
            object = Cut.aboveAll();
        } else {
            object2 = new Cut$AboveValue((Comparable)object);
            object = object2;
        }
        return object;
    }
}

