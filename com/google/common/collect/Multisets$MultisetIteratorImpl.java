/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

final class Multisets$MultisetIteratorImpl
implements Iterator {
    private boolean canRemove;
    private Multiset$Entry currentEntry;
    private final Iterator entryIterator;
    private int laterCount;
    private final Multiset multiset;
    private int totalCount;

    public Multisets$MultisetIteratorImpl(Multiset multiset, Iterator iterator) {
        this.multiset = multiset;
        this.entryIterator = iterator;
    }

    public boolean hasNext() {
        Iterator iterator;
        int n3 = this.laterCount;
        if (n3 <= 0 && !(n3 = (iterator = this.entryIterator).hasNext())) {
            n3 = 0;
            iterator = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            Multiset$Entry multiset$Entry;
            n3 = this.laterCount;
            if (n3 == 0) {
                this.currentEntry = multiset$Entry = (Multiset$Entry)this.entryIterator.next();
                this.laterCount = n3 = multiset$Entry.getCount();
                this.totalCount = n3;
            }
            n3 = this.laterCount;
            int n4 = 1;
            this.laterCount = n3 -= n4;
            this.canRemove = n4;
            multiset$Entry = this.currentEntry;
            Objects.requireNonNull(multiset$Entry);
            return multiset$Entry.getElement();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        CollectPreconditions.checkRemove(this.canRemove);
        int n3 = this.totalCount;
        int n4 = 1;
        if (n3 == n4) {
            Iterator iterator = this.entryIterator;
            iterator.remove();
        } else {
            Multiset multiset = this.multiset;
            Object object = this.currentEntry;
            Objects.requireNonNull(object);
            object = object.getElement();
            multiset.remove(object);
        }
        this.totalCount = n3 = this.totalCount - n4;
        this.canRemove = false;
    }
}

