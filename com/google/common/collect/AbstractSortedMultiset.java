/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.AbstractSortedMultiset$1DescendingMultisetImpl;
import com.google.common.collect.BoundType;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.Ordering;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.SortedMultisets$NavigableElementSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

abstract class AbstractSortedMultiset
extends AbstractMultiset
implements SortedMultiset {
    final Comparator comparator;
    private transient SortedMultiset descendingMultiset;

    public AbstractSortedMultiset() {
        Ordering ordering = Ordering.natural();
        this(ordering);
    }

    public AbstractSortedMultiset(Comparator comparator) {
        this.comparator = comparator = (Comparator)Preconditions.checkNotNull(comparator);
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public SortedMultiset createDescendingMultiset() {
        AbstractSortedMultiset$1DescendingMultisetImpl abstractSortedMultiset$1DescendingMultisetImpl = new AbstractSortedMultiset$1DescendingMultisetImpl(this);
        return abstractSortedMultiset$1DescendingMultisetImpl;
    }

    public NavigableSet createElementSet() {
        SortedMultisets$NavigableElementSet sortedMultisets$NavigableElementSet = new SortedMultisets$NavigableElementSet(this);
        return sortedMultisets$NavigableElementSet;
    }

    public abstract Iterator descendingEntryIterator();

    public Iterator descendingIterator() {
        return Multisets.iteratorImpl(this.descendingMultiset());
    }

    public SortedMultiset descendingMultiset() {
        SortedMultiset sortedMultiset = this.descendingMultiset;
        if (sortedMultiset == null) {
            this.descendingMultiset = sortedMultiset = this.createDescendingMultiset();
        }
        return sortedMultiset;
    }

    public NavigableSet elementSet() {
        return (NavigableSet)super.elementSet();
    }

    public Multiset$Entry firstEntry() {
        Object object = this.entryIterator();
        boolean bl2 = object.hasNext();
        object = bl2 ? (Multiset$Entry)object.next() : null;
        return object;
    }

    public Multiset$Entry lastEntry() {
        Object object = this.descendingEntryIterator();
        boolean bl2 = object.hasNext();
        object = bl2 ? (Multiset$Entry)object.next() : null;
        return object;
    }

    public Multiset$Entry pollFirstEntry() {
        Iterator iterator = this.entryIterator();
        int n3 = iterator.hasNext();
        if (n3 != 0) {
            Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
            Object object = multiset$Entry.getElement();
            n3 = multiset$Entry.getCount();
            multiset$Entry = Multisets.immutableEntry(object, n3);
            iterator.remove();
            return multiset$Entry;
        }
        return null;
    }

    public Multiset$Entry pollLastEntry() {
        Iterator iterator = this.descendingEntryIterator();
        int n3 = iterator.hasNext();
        if (n3 != 0) {
            Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
            Object object = multiset$Entry.getElement();
            n3 = multiset$Entry.getCount();
            multiset$Entry = Multisets.immutableEntry(object, n3);
            iterator.remove();
            return multiset$Entry;
        }
        return null;
    }

    public SortedMultiset subMultiset(Object object, BoundType boundType, Object object2, BoundType boundType2) {
        Preconditions.checkNotNull((Object)boundType);
        Preconditions.checkNotNull((Object)boundType2);
        return this.tailMultiset(object, boundType).headMultiset(object2, boundType2);
    }
}

