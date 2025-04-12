/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets$FilteredSortedSet;
import java.util.Iterator;
import java.util.NavigableSet;

class Sets$FilteredNavigableSet
extends Sets$FilteredSortedSet
implements NavigableSet {
    public Sets$FilteredNavigableSet(NavigableSet navigableSet, Predicate predicate) {
        super(navigableSet, predicate);
    }

    public Object ceiling(Object navigableSet) {
        navigableSet = this.unfiltered().tailSet(navigableSet, true);
        Predicate predicate = this.predicate;
        return Iterables.find(navigableSet, predicate, null);
    }

    public Iterator descendingIterator() {
        Iterator iterator = this.unfiltered().descendingIterator();
        Predicate predicate = this.predicate;
        return Iterators.filter(iterator, predicate);
    }

    public NavigableSet descendingSet() {
        NavigableSet navigableSet = this.unfiltered().descendingSet();
        Predicate predicate = this.predicate;
        return Sets.filter(navigableSet, predicate);
    }

    public Object floor(Object iterator) {
        iterator = this.unfiltered().headSet(iterator, true).descendingIterator();
        Predicate predicate = this.predicate;
        return Iterators.find(iterator, predicate, null);
    }

    public NavigableSet headSet(Object navigableSet, boolean bl2) {
        navigableSet = this.unfiltered().headSet(navigableSet, bl2);
        Predicate predicate = this.predicate;
        return Sets.filter(navigableSet, predicate);
    }

    public Object higher(Object navigableSet) {
        navigableSet = this.unfiltered().tailSet(navigableSet, false);
        Predicate predicate = this.predicate;
        return Iterables.find(navigableSet, predicate, null);
    }

    public Object last() {
        Iterator iterator = this.unfiltered().descendingIterator();
        Predicate predicate = this.predicate;
        return Iterators.find(iterator, predicate);
    }

    public Object lower(Object iterator) {
        iterator = this.unfiltered().headSet(iterator, false).descendingIterator();
        Predicate predicate = this.predicate;
        return Iterators.find(iterator, predicate, null);
    }

    public Object pollFirst() {
        NavigableSet navigableSet = this.unfiltered();
        Predicate predicate = this.predicate;
        return Iterables.removeFirstMatching(navigableSet, predicate);
    }

    public Object pollLast() {
        NavigableSet navigableSet = this.unfiltered().descendingSet();
        Predicate predicate = this.predicate;
        return Iterables.removeFirstMatching(navigableSet, predicate);
    }

    public NavigableSet subSet(Object navigableSet, boolean bl2, Object object, boolean bl3) {
        navigableSet = this.unfiltered().subSet(navigableSet, bl2, object, bl3);
        Predicate predicate = this.predicate;
        return Sets.filter(navigableSet, predicate);
    }

    public NavigableSet tailSet(Object navigableSet, boolean bl2) {
        navigableSet = this.unfiltered().tailSet(navigableSet, bl2);
        Predicate predicate = this.predicate;
        return Sets.filter(navigableSet, predicate);
    }

    public NavigableSet unfiltered() {
        return (NavigableSet)this.unfiltered;
    }
}

