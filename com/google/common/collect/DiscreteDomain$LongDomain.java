/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.DiscreteDomain;
import java.io.Serializable;

final class DiscreteDomain$LongDomain
extends DiscreteDomain
implements Serializable {
    private static final DiscreteDomain$LongDomain INSTANCE;
    private static final long serialVersionUID;

    static {
        DiscreteDomain$LongDomain discreteDomain$LongDomain;
        INSTANCE = discreteDomain$LongDomain = new DiscreteDomain$LongDomain();
    }

    public DiscreteDomain$LongDomain() {
        super(true, null);
    }

    public static /* synthetic */ DiscreteDomain$LongDomain access$200() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public long distance(Long l2, Long l3) {
        long l4;
        long l7;
        long l8;
        long l12 = l3;
        long l14 = l2;
        l12 -= l14;
        l14 = l3;
        long l15 = l2;
        long l16 = 0L;
        Object object = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (object > 0 && (l8 = l12 == l16 ? 0 : (l12 < l16 ? -1 : 1)) < 0) {
            return Long.MAX_VALUE;
        }
        l14 = l3;
        long l17 = l14 - (l7 = l2.longValue());
        Object object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object2 < 0 && (l4 = l12 == l16 ? 0 : (l12 < l16 ? -1 : 1)) > 0) {
            return Long.MIN_VALUE;
        }
        return l12;
    }

    public Long maxValue() {
        return Long.MAX_VALUE;
    }

    public Long minValue() {
        return Long.MIN_VALUE;
    }

    public Long next(Long l2) {
        long l3;
        long l4 = l2;
        long l7 = l4 - (l3 = Long.MAX_VALUE);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            object = 0;
            l2 = null;
        } else {
            l3 = 1L;
            l2 = l4 += l3;
        }
        return l2;
    }

    public Long offset(Long l2, long l3) {
        String string2 = "distance";
        CollectPreconditions.checkNonnegative(l3, string2);
        long l4 = l2 + l3;
        l3 = 0L;
        long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (l7 < 0) {
            long l8 = l2;
            long l12 = l8 - l3;
            Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object < 0) {
                object = 1;
            } else {
                object = 0;
                l2 = null;
            }
            String string3 = "overflow";
            Preconditions.checkArgument((boolean)object, string3);
        }
        return l4;
    }

    public Long previous(Long l2) {
        long l3;
        long l4 = l2;
        long l7 = l4 - (l3 = Long.MIN_VALUE);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            object = 0;
            l2 = null;
        } else {
            l3 = 1L;
            l2 = l4 -= l3;
        }
        return l2;
    }

    public String toString() {
        return "DiscreteDomain.longs()";
    }
}

