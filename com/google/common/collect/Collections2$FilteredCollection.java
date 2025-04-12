/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class Collections2$FilteredCollection
extends AbstractCollection {
    final Predicate predicate;
    final Collection unfiltered;

    public Collections2$FilteredCollection(Collection collection, Predicate predicate) {
        this.unfiltered = collection;
        this.predicate = predicate;
    }

    public boolean add(Object object) {
        Preconditions.checkArgument(this.predicate.apply(object));
        return this.unfiltered.add(object);
    }

    public boolean addAll(Collection collection) {
        boolean bl2;
        Iterator iterator = collection.iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Predicate predicate = this.predicate;
            bl2 = predicate.apply(e2);
            Preconditions.checkArgument(bl2);
        }
        return this.unfiltered.addAll(collection);
    }

    public void clear() {
        Collection collection = this.unfiltered;
        Predicate predicate = this.predicate;
        Iterables.removeIf(collection, predicate);
    }

    public boolean contains(Object object) {
        Collection collection = this.unfiltered;
        boolean bl2 = Collections2.safeContains(collection, object);
        if (bl2) {
            return this.predicate.apply(object);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        return Collections2.containsAllImpl(this, collection);
    }

    public Collections2$FilteredCollection createCombined(Predicate predicate) {
        Collection collection = this.unfiltered;
        predicate = Predicates.and(this.predicate, predicate);
        Collections2$FilteredCollection collections2$FilteredCollection = new Collections2$FilteredCollection(collection, predicate);
        return collections2$FilteredCollection;
    }

    public boolean isEmpty() {
        Collection collection = this.unfiltered;
        Predicate predicate = this.predicate;
        return Iterables.any(collection, predicate) ^ true;
    }

    public Iterator iterator() {
        Iterator iterator = this.unfiltered.iterator();
        Predicate predicate = this.predicate;
        return Iterators.filter(iterator, predicate);
    }

    public boolean remove(Object object) {
        Collection collection;
        boolean bl2;
        boolean bl3 = this.contains(object);
        if (bl3 && (bl2 = (collection = this.unfiltered).remove(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean removeAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.unfiltered.iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Object e2 = iterator.next();
            boolean bl4 = predicate.apply(e2);
            if (!bl4 || !(bl2 = collection.contains(e2))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public boolean retainAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.unfiltered.iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Object e2 = iterator.next();
            boolean bl4 = predicate.apply(e2);
            if (!bl4 || (bl2 = collection.contains(e2))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public int size() {
        boolean bl2;
        Iterator iterator = this.unfiltered.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Object e2 = iterator.next();
            bl2 = predicate.apply(e2);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public Object[] toArray() {
        return Lists.newArrayList(this.iterator()).toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return Lists.newArrayList(this.iterator()).toArray(objectArray);
    }
}

