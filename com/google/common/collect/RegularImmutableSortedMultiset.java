/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.Ordering;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.primitives.Ints;
import java.util.Comparator;

final class RegularImmutableSortedMultiset
extends ImmutableSortedMultiset {
    static final ImmutableSortedMultiset NATURAL_EMPTY_MULTISET;
    private static final long[] ZERO_CUMULATIVE_COUNTS;
    private final transient long[] cumulativeCounts;
    final transient RegularImmutableSortedSet elementSet;
    private final transient int length;
    private final transient int offset;

    static {
        Object object = new long[]{0L};
        ZERO_CUMULATIVE_COUNTS = object;
        object = new RegularImmutableSortedMultiset;
        Ordering ordering = Ordering.natural();
        object(ordering);
        NATURAL_EMPTY_MULTISET = object;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] lArray, int n3, int n4) {
        this.elementSet = regularImmutableSortedSet;
        this.cumulativeCounts = lArray;
        this.offset = n3;
        this.length = n4;
    }

    public RegularImmutableSortedMultiset(Comparator object) {
        this.elementSet = object = ImmutableSortedSet.emptySet((Comparator)object);
        object = ZERO_CUMULATIVE_COUNTS;
        this.cumulativeCounts = (long[])object;
        this.offset = 0;
        this.length = 0;
    }

    private int getCount(int n3) {
        long[] lArray = this.cumulativeCounts;
        int n4 = this.offset;
        int n7 = n4 + n3 + 1;
        long l2 = lArray[n7];
        long l3 = lArray[n4 += n3];
        return (int)(l2 - l3);
    }

    public int count(Object object) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet;
        int n3 = regularImmutableSortedSet.indexOf(object);
        if (n3 >= 0) {
            n3 = this.getCount(n3);
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public ImmutableSortedSet elementSet() {
        return this.elementSet;
    }

    public Multiset$Entry firstEntry() {
        Multiset$Entry multiset$Entry;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            multiset$Entry = null;
        } else {
            bl2 = false;
            multiset$Entry = this.getEntry(0);
        }
        return multiset$Entry;
    }

    public Multiset$Entry getEntry(int n3) {
        Object e2 = this.elementSet.asList().get(n3);
        n3 = this.getCount(n3);
        return Multisets.immutableEntry(e2, n3);
    }

    public ImmutableSortedMultiset getSubMultiset(int n3, int n4) {
        int n7 = this.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        if (n3 == n4) {
            return ImmutableSortedMultiset.emptyMultiset(this.comparator());
        }
        if (n3 == 0 && n4 == (n7 = this.length)) {
            return this;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet.getSubSet(n3, n4);
        long[] lArray = this.cumulativeCounts;
        int n8 = this.offset + n3;
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = new RegularImmutableSortedMultiset(regularImmutableSortedSet, lArray, n8, n4 -= n3);
        return regularImmutableSortedMultiset;
    }

    public ImmutableSortedMultiset headMultiset(Object object, BoundType object2) {
        boolean bl2;
        BoundType boundType;
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet;
        if ((object2 = Preconditions.checkNotNull(object2)) == (boundType = BoundType.CLOSED)) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        int n3 = regularImmutableSortedSet.headIndex(object, bl2);
        return this.getSubMultiset(0, n3);
    }

    public boolean isPartialView() {
        long[] lArray;
        int n3;
        int n4 = this.offset;
        int n7 = 1;
        if (n4 <= 0 && (n4 = this.length) >= (n3 = (lArray = this.cumulativeCounts).length - n7)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public Multiset$Entry lastEntry() {
        Multiset$Entry multiset$Entry;
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = 0;
            multiset$Entry = null;
        } else {
            n3 = this.length + -1;
            multiset$Entry = this.getEntry(n3);
        }
        return multiset$Entry;
    }

    public int size() {
        long[] lArray = this.cumulativeCounts;
        int n3 = this.offset;
        int n4 = this.length + n3;
        long l2 = lArray[n4];
        long l3 = lArray[n3];
        return Ints.saturatedCast(l2 - l3);
    }

    public ImmutableSortedMultiset tailMultiset(Object object, BoundType object2) {
        int n3;
        BoundType boundType;
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet;
        if ((object2 = Preconditions.checkNotNull(object2)) == (boundType = BoundType.CLOSED)) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        int n4 = regularImmutableSortedSet.tailIndex(object, n3 != 0);
        n3 = this.length;
        return this.getSubMultiset(n4, n3);
    }
}

