/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.DiscreteDomain;
import com.google.common.primitives.Ints;
import java.io.Serializable;

final class DiscreteDomain$IntegerDomain
extends DiscreteDomain
implements Serializable {
    private static final DiscreteDomain$IntegerDomain INSTANCE;
    private static final long serialVersionUID;

    static {
        DiscreteDomain$IntegerDomain discreteDomain$IntegerDomain;
        INSTANCE = discreteDomain$IntegerDomain = new DiscreteDomain$IntegerDomain();
    }

    public DiscreteDomain$IntegerDomain() {
        super(true, null);
    }

    public static /* synthetic */ DiscreteDomain$IntegerDomain access$000() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public long distance(Integer n3, Integer n4) {
        long l2 = n4.intValue();
        long l3 = n3.intValue();
        return l2 - l3;
    }

    public Integer maxValue() {
        return -1 >>> 1;
    }

    public Integer minValue() {
        return -1 << -1;
    }

    public Integer next(Integer n3) {
        int n4;
        int n7 = n3;
        if (n7 == (n4 = -1 >>> 1)) {
            n7 = 0;
            n3 = null;
        } else {
            n3 = ++n7;
        }
        return n3;
    }

    public Integer offset(Integer n3, long l2) {
        CollectPreconditions.checkNonnegative(l2, "distance");
        return Ints.checkedCast(n3.longValue() + l2);
    }

    public Integer previous(Integer n3) {
        int n4;
        int n7 = n3;
        if (n7 == (n4 = -1 << -1)) {
            n7 = 0;
            n3 = null;
        } else {
            n3 = n7 += -1;
        }
        return n3;
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }
}

