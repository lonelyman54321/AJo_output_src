/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.DescendingImmutableSortedSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.EmptyContiguousSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet$Builder;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import com.google.common.collect.RegularContiguousSet;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class ContiguousSet
extends ImmutableSortedSet {
    final DiscreteDomain domain;

    public ContiguousSet(DiscreteDomain discreteDomain) {
        Ordering ordering = Ordering.natural();
        super(ordering);
        this.domain = discreteDomain;
    }

    public static ImmutableSortedSet$Builder builder() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public static ContiguousSet closed(int n3, int n4) {
        Serializable serializable = n3;
        Object object = n4;
        serializable = Range.closed(serializable, (Comparable)object);
        object = DiscreteDomain.integers();
        return ContiguousSet.create((Range)serializable, (DiscreteDomain)object);
    }

    public static ContiguousSet closed(long l2, long l3) {
        Serializable serializable = l2;
        Object object = l3;
        serializable = Range.closed(serializable, (Comparable)object);
        object = DiscreteDomain.longs();
        return ContiguousSet.create((Range)serializable, (DiscreteDomain)object);
    }

    public static ContiguousSet closedOpen(int n3, int n4) {
        Serializable serializable = n3;
        Object object = n4;
        serializable = Range.closedOpen(serializable, (Comparable)object);
        object = DiscreteDomain.integers();
        return ContiguousSet.create((Range)serializable, (DiscreteDomain)object);
    }

    public static ContiguousSet closedOpen(long l2, long l3) {
        Serializable serializable = l2;
        Object object = l3;
        serializable = Range.closedOpen(serializable, (Comparable)object);
        object = DiscreteDomain.longs();
        return ContiguousSet.create((Range)serializable, (DiscreteDomain)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ContiguousSet create(Range object, DiscreteDomain object2) {
        NoSuchElementException noSuchElementException2;
        block6: {
            Object object3;
            Object object4;
            block5: {
                block4: {
                    Preconditions.checkNotNull(object);
                    Preconditions.checkNotNull(object2);
                    try {
                        boolean bl2 = ((Range)object).hasLowerBound();
                        if (bl2) break block4;
                        object4 = ((DiscreteDomain)object2).minValue();
                        object4 = Range.atLeast((Comparable)object4);
                        object4 = ((Range)object).intersection((Range)object4);
                        break block5;
                    }
                    catch (NoSuchElementException noSuchElementException2) {
                        break block6;
                    }
                }
                object4 = object;
            }
            boolean bl3 = ((Range)object).hasUpperBound();
            if (!bl3) {
                object3 = ((DiscreteDomain)object2).maxValue();
                object3 = Range.atMost((Comparable)object3);
                object4 = ((Range)object4).intersection((Range)object3);
            }
            if (!(bl3 = ((Range)object4).isEmpty())) {
                object3 = ((Range)object).lowerBound.leastValueAbove((DiscreteDomain)object2);
                Objects.requireNonNull(object3);
                object3 = (Comparable)object3;
                object = ((Range)object).upperBound.greatestValueBelow((DiscreteDomain)object2);
                Objects.requireNonNull(object);
                object = (Comparable)object;
                int n3 = Range.compareOrThrow((Comparable)object3, (Comparable)object);
                if (n3 > 0) return new EmptyContiguousSet((DiscreteDomain)object2);
                return new RegularContiguousSet((Range)object4, (DiscreteDomain)object2);
            }
            return new EmptyContiguousSet((DiscreteDomain)object2);
        }
        object2 = new IllegalArgumentException(noSuchElementException2);
        throw object2;
    }

    public ImmutableSortedSet createDescendingSet() {
        DescendingImmutableSortedSet descendingImmutableSortedSet = new DescendingImmutableSortedSet(this);
        return descendingImmutableSortedSet;
    }

    public ContiguousSet headSet(Comparable comparable) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        return this.headSetImpl(comparable, false);
    }

    public ContiguousSet headSet(Comparable comparable, boolean bl2) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        return this.headSetImpl(comparable, bl2);
    }

    public abstract ContiguousSet headSetImpl(Comparable var1, boolean var2);

    public abstract ContiguousSet intersection(ContiguousSet var1);

    public abstract Range range();

    public abstract Range range(BoundType var1, BoundType var2);

    /*
     * WARNING - void declaration
     */
    public ContiguousSet subSet(Comparable comparable, Comparable comparable2) {
        void var4_7;
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        Comparator comparator = this.comparator();
        int bl2 = comparator.compare(comparable, comparable2);
        boolean bl3 = true;
        if (bl2 <= 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            comparator = null;
        }
        Preconditions.checkArgument((boolean)var4_7);
        return this.subSetImpl(comparable, bl3, comparable2, false);
    }

    /*
     * WARNING - void declaration
     */
    public ContiguousSet subSet(Comparable comparable, boolean bl2, Comparable comparable2, boolean bl3) {
        void var6_9;
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        Comparator comparator = this.comparator();
        int bl4 = comparator.compare(comparable, comparable2);
        if (bl4 <= 0) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            comparator = null;
        }
        Preconditions.checkArgument((boolean)var6_9);
        return this.subSetImpl(comparable, bl2, comparable2, bl3);
    }

    public abstract ContiguousSet subSetImpl(Comparable var1, boolean var2, Comparable var3, boolean var4);

    public ContiguousSet tailSet(Comparable comparable) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        return this.tailSetImpl(comparable, true);
    }

    public ContiguousSet tailSet(Comparable comparable, boolean bl2) {
        comparable = (Comparable)Preconditions.checkNotNull(comparable);
        return this.tailSetImpl(comparable, bl2);
    }

    public abstract ContiguousSet tailSetImpl(Comparable var1, boolean var2);

    public String toString() {
        return this.range().toString();
    }
}

