/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DescendingImmutableSortedSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableRangeSet$AsSet$1;
import com.google.common.collect.ImmutableRangeSet$AsSet$2;
import com.google.common.collect.ImmutableRangeSet$AsSetSerializedForm;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Range;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Objects;

final class ImmutableRangeSet$AsSet
extends ImmutableSortedSet {
    private final DiscreteDomain domain;
    private transient Integer size;
    final /* synthetic */ ImmutableRangeSet this$0;

    public ImmutableRangeSet$AsSet(ImmutableRangeSet object, DiscreteDomain discreteDomain) {
        this.this$0 = object;
        object = Ordering.natural();
        super((Comparator)object);
        this.domain = discreteDomain;
    }

    public static /* synthetic */ DiscreteDomain access$100(ImmutableRangeSet$AsSet immutableRangeSet$AsSet) {
        return immutableRangeSet$AsSet.domain;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        try {
            object = (Comparable)object;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        ImmutableRangeSet immutableRangeSet = this.this$0;
        return immutableRangeSet.contains((Comparable)object);
    }

    public ImmutableSortedSet createDescendingSet() {
        DescendingImmutableSortedSet descendingImmutableSortedSet = new DescendingImmutableSortedSet(this);
        return descendingImmutableSortedSet;
    }

    public UnmodifiableIterator descendingIterator() {
        ImmutableRangeSet$AsSet$2 immutableRangeSet$AsSet$2 = new ImmutableRangeSet$AsSet$2(this);
        return immutableRangeSet$AsSet$2;
    }

    public ImmutableSortedSet headSetImpl(Comparable object, boolean bl2) {
        BoundType boundType = BoundType.forBoolean(bl2);
        object = Range.upTo((Comparable)object, boundType);
        return this.subSet((Range)object);
    }

    public int indexOf(Object object) {
        boolean bl2 = this.contains(object);
        if (bl2) {
            int n3;
            Objects.requireNonNull(object);
            object = (Comparable)object;
            Object object2 = ImmutableRangeSet.access$000(this.this$0).iterator();
            long l2 = 0L;
            while ((n3 = object2.hasNext()) != 0) {
                long l3;
                Serializable serializable = (Range)object2.next();
                boolean bl3 = ((Range)serializable).contains((Comparable)object);
                if (bl3) {
                    object2 = this.domain;
                    l3 = ContiguousSet.create((Range)serializable, (DiscreteDomain)object2).indexOf(object);
                    return Ints.saturatedCast(l2 + l3);
                }
                DiscreteDomain discreteDomain = this.domain;
                serializable = ContiguousSet.create((Range)serializable, discreteDomain);
                n3 = ((AbstractCollection)((Object)serializable)).size();
                l3 = n3;
                l2 += l3;
            }
            object = new AssertionError((Object)"impossible");
            throw object;
        }
        return -1;
    }

    public boolean isPartialView() {
        return ImmutableRangeSet.access$000(this.this$0).isPartialView();
    }

    public UnmodifiableIterator iterator() {
        ImmutableRangeSet$AsSet$1 immutableRangeSet$AsSet$1 = new ImmutableRangeSet$AsSet$1(this);
        return immutableRangeSet$AsSet$1;
    }

    public int size() {
        Object object = this.size;
        if (object == null) {
            int n3;
            object = ImmutableRangeSet.access$000(this.this$0).iterator();
            long l2 = 0L;
            while ((n3 = object.hasNext()) != 0) {
                Serializable serializable = (Range)object.next();
                DiscreteDomain discreteDomain = this.domain;
                serializable = ContiguousSet.create((Range)serializable, discreteDomain);
                n3 = ((AbstractCollection)((Object)serializable)).size();
                long l3 = n3;
                long l4 = (l2 += l3) - (l3 = Integer.MAX_VALUE);
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 < 0) continue;
            }
            int n4 = Ints.saturatedCast(l2);
            this.size = object = Integer.valueOf(n4);
        }
        return (Integer)object;
    }

    public ImmutableSortedSet subSet(Range serializable) {
        serializable = this.this$0.subRangeSet((Range)serializable);
        DiscreteDomain discreteDomain = this.domain;
        return ((ImmutableRangeSet)serializable).asSet(discreteDomain);
    }

    public ImmutableSortedSet subSetImpl(Comparable object, boolean bl2, Comparable comparable, boolean bl3) {
        int n3;
        if (!bl2 && !bl3 && (n3 = Range.compareOrThrow((Comparable)object, comparable)) == 0) {
            return ImmutableSortedSet.of();
        }
        BoundType boundType = BoundType.forBoolean(bl2);
        BoundType boundType2 = BoundType.forBoolean(bl3);
        object = Range.range((Comparable)object, boundType, comparable, boundType2);
        return this.subSet((Range)object);
    }

    public ImmutableSortedSet tailSetImpl(Comparable object, boolean bl2) {
        BoundType boundType = BoundType.forBoolean(bl2);
        object = Range.downTo((Comparable)object, boundType);
        return this.subSet((Range)object);
    }

    public String toString() {
        return ((Object)ImmutableRangeSet.access$000(this.this$0)).toString();
    }

    public Object writeReplace() {
        ImmutableList immutableList = ImmutableRangeSet.access$000(this.this$0);
        DiscreteDomain discreteDomain = this.domain;
        ImmutableRangeSet$AsSetSerializedForm immutableRangeSet$AsSetSerializedForm = new ImmutableRangeSet$AsSetSerializedForm(immutableList, discreteDomain);
        return immutableRangeSet$AsSetSerializedForm;
    }
}

