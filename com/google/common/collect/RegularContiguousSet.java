/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.Collections2;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.Cut;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.EmptyContiguousSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import com.google.common.collect.RegularContiguousSet$1;
import com.google.common.collect.RegularContiguousSet$2;
import com.google.common.collect.RegularContiguousSet$3;
import com.google.common.collect.RegularContiguousSet$SerializedForm;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Objects;

final class RegularContiguousSet
extends ContiguousSet {
    private static final long serialVersionUID;
    private final Range range;

    public RegularContiguousSet(Range range, DiscreteDomain discreteDomain) {
        super(discreteDomain);
        this.range = range;
    }

    public static /* synthetic */ boolean access$000(Comparable comparable, Comparable comparable2) {
        return RegularContiguousSet.equalsOrThrow(comparable, comparable2);
    }

    private static boolean equalsOrThrow(Comparable comparable, Comparable comparable2) {
        boolean bl2;
        if (comparable2 != null && !(bl2 = Range.compareOrThrow(comparable, comparable2))) {
            bl2 = true;
        } else {
            bl2 = false;
            comparable = null;
        }
        return bl2;
    }

    private ContiguousSet intersectionInCurrentDomain(Range serializable) {
        Object object = this.range;
        boolean bl2 = ((Range)object).isConnected((Range)serializable);
        if (bl2) {
            serializable = this.range.intersection((Range)serializable);
            object = this.domain;
            serializable = ContiguousSet.create(serializable, (DiscreteDomain)object);
        } else {
            object = this.domain;
            serializable = new EmptyContiguousSet((DiscreteDomain)object);
        }
        return serializable;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        Range range;
        if (object == null) {
            return false;
        }
        try {
            range = this.range;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        object = (Comparable)object;
        return range.contains((Comparable)object);
    }

    public boolean containsAll(Collection collection) {
        return Collections2.containsAllImpl(this, collection);
    }

    public ImmutableList createAsList() {
        Object object = this.domain;
        boolean bl2 = ((DiscreteDomain)object).supportsFastOffset;
        if (bl2) {
            object = new RegularContiguousSet$3(this);
            return object;
        }
        return super.createAsList();
    }

    public UnmodifiableIterator descendingIterator() {
        Comparable comparable = this.last();
        RegularContiguousSet$2 regularContiguousSet$2 = new RegularContiguousSet$2(this, comparable);
        return regularContiguousSet$2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof RegularContiguousSet;
        if (bl3) {
            Object object2 = object;
            object2 = (RegularContiguousSet)object;
            Object object3 = this.domain;
            DiscreteDomain discreteDomain = ((ContiguousSet)object2).domain;
            boolean bl4 = object3.equals(discreteDomain);
            if (bl4) {
                object = this.first();
                boolean bl5 = object.equals(object3 = ((RegularContiguousSet)object2).first());
                if (!bl5 || !(bl5 = (object = this.last()).equals(object2 = ((RegularContiguousSet)object2).last()))) {
                    bl2 = false;
                }
                return bl2;
            }
        }
        return super.equals(object);
    }

    public Comparable first() {
        Comparable comparable = this.range.lowerBound;
        DiscreteDomain discreteDomain = this.domain;
        comparable = comparable.leastValueAbove(discreteDomain);
        Objects.requireNonNull(comparable);
        return comparable;
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public ContiguousSet headSetImpl(Comparable object, boolean bl2) {
        BoundType boundType = BoundType.forBoolean(bl2);
        object = Range.upTo((Comparable)object, boundType);
        return this.intersectionInCurrentDomain((Range)object);
    }

    public int indexOf(Object object) {
        int n3;
        boolean bl2 = this.contains(object);
        if (bl2) {
            DiscreteDomain discreteDomain = this.domain;
            Comparable comparable = this.first();
            Objects.requireNonNull(object);
            object = (Comparable)object;
            long l2 = discreteDomain.distance(comparable, (Comparable)object);
            n3 = (int)l2;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public ContiguousSet intersection(ContiguousSet object) {
        Preconditions.checkNotNull(object);
        Object object2 = this.domain;
        Object object3 = ((ContiguousSet)object).domain;
        Preconditions.checkArgument(object2.equals(object3));
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (bl2) {
            return object;
        }
        object2 = Ordering.natural();
        object3 = this.first();
        Comparable comparable = (Comparable)((ImmutableSortedSet)object).first();
        object2 = (Comparable)((Ordering)object2).max(object3, comparable);
        object3 = Ordering.natural();
        comparable = this.last();
        object = (Comparable)((ImmutableSortedSet)object).last();
        int n3 = object2.compareTo(object = (Comparable)((Ordering)object3).min(comparable, object));
        if (n3 <= 0) {
            object = Range.closed((Comparable)object2, (Comparable)object);
            object2 = this.domain;
            object = ContiguousSet.create((Range)object, (DiscreteDomain)object2);
        } else {
            object2 = this.domain;
            object = new EmptyContiguousSet((DiscreteDomain)object2);
        }
        return object;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isPartialView() {
        return false;
    }

    public UnmodifiableIterator iterator() {
        Comparable comparable = this.first();
        RegularContiguousSet$1 regularContiguousSet$1 = new RegularContiguousSet$1(this, comparable);
        return regularContiguousSet$1;
    }

    public Comparable last() {
        Comparable comparable = this.range.upperBound;
        DiscreteDomain discreteDomain = this.domain;
        comparable = comparable.greatestValueBelow(discreteDomain);
        Objects.requireNonNull(comparable);
        return comparable;
    }

    public Range range() {
        BoundType boundType = BoundType.CLOSED;
        return this.range(boundType, boundType);
    }

    public Range range(BoundType object, BoundType object2) {
        Cut cut = this.range.lowerBound;
        DiscreteDomain discreteDomain = this.domain;
        object = cut.withLowerBoundType((BoundType)((Object)object), discreteDomain);
        cut = this.range.upperBound;
        discreteDomain = this.domain;
        object2 = cut.withUpperBoundType((BoundType)((Object)object2), discreteDomain);
        return Range.create((Cut)object, (Cut)object2);
    }

    public int size() {
        int n3;
        long l2;
        Comparable comparable;
        DiscreteDomain discreteDomain = this.domain;
        Comparable comparable2 = this.first();
        long l3 = discreteDomain.distance(comparable2, comparable = this.last());
        long l4 = l3 - (l2 = Integer.MAX_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            n3 = -1 >>> 1;
        } else {
            int n4 = (int)l3;
            n3 = n4 + 1;
        }
        return n3;
    }

    public ContiguousSet subSetImpl(Comparable object, boolean bl2, Comparable comparable, boolean bl3) {
        int n3 = object.compareTo(comparable);
        if (n3 == 0 && !bl2 && !bl3) {
            DiscreteDomain discreteDomain = this.domain;
            object = new EmptyContiguousSet(discreteDomain);
            return object;
        }
        BoundType boundType = BoundType.forBoolean(bl2);
        BoundType boundType2 = BoundType.forBoolean(bl3);
        object = Range.range((Comparable)object, boundType, comparable, boundType2);
        return this.intersectionInCurrentDomain((Range)object);
    }

    public ContiguousSet tailSetImpl(Comparable object, boolean bl2) {
        BoundType boundType = BoundType.forBoolean(bl2);
        object = Range.downTo((Comparable)object, boundType);
        return this.intersectionInCurrentDomain((Range)object);
    }

    public Object writeReplace() {
        Range range = this.range;
        DiscreteDomain discreteDomain = this.domain;
        RegularContiguousSet$SerializedForm regularContiguousSet$SerializedForm = new RegularContiguousSet$SerializedForm(range, discreteDomain, null);
        return regularContiguousSet$SerializedForm;
    }
}

