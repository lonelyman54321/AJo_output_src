/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.DiscreteDomain$1;
import com.google.common.collect.DiscreteDomain$BigIntegerDomain;
import com.google.common.collect.DiscreteDomain$IntegerDomain;
import com.google.common.collect.DiscreteDomain$LongDomain;
import java.util.NoSuchElementException;

public abstract class DiscreteDomain {
    final boolean supportsFastOffset;

    public DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean bl2) {
        this.supportsFastOffset = bl2;
    }

    public /* synthetic */ DiscreteDomain(boolean bl2, DiscreteDomain$1 discreteDomain$1) {
        this(bl2);
    }

    public static DiscreteDomain bigIntegers() {
        return DiscreteDomain$BigIntegerDomain.access$300();
    }

    public static DiscreteDomain integers() {
        return DiscreteDomain$IntegerDomain.access$000();
    }

    public static DiscreteDomain longs() {
        return DiscreteDomain$LongDomain.access$200();
    }

    public abstract long distance(Comparable var1, Comparable var2);

    public Comparable maxValue() {
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public Comparable minValue() {
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public abstract Comparable next(Comparable var1);

    public Comparable offset(Comparable object, long l2) {
        long l3;
        Object object2 = "distance";
        CollectPreconditions.checkNonnegative(l2, (String)object2);
        long l4 = 0L;
        Comparable comparable = object;
        while ((l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) < 0) {
            if ((comparable = this.next(comparable)) != null) {
                long l7 = 1L;
                l4 += l7;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder("overflowed computing offset(");
            stringBuilder.append(object);
            stringBuilder.append(", ");
            stringBuilder.append(l2);
            stringBuilder.append(")");
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        return comparable;
    }

    public abstract Comparable previous(Comparable var1);
}

