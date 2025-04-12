/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Iterators$ConcatenatedIterator
implements Iterator {
    private Iterator iterator;
    private Deque metaIterators;
    private Iterator toRemove;
    private Iterator topMetaIterator;

    public Iterators$ConcatenatedIterator(Iterator iterator) {
        UnmodifiableIterator unmodifiableIterator = Iterators.emptyIterator();
        this.iterator = unmodifiableIterator;
        this.topMetaIterator = iterator = (Iterator)Preconditions.checkNotNull(iterator);
    }

    private Iterator getTopMetaIterator() {
        while (true) {
            boolean bl2;
            Object object;
            if ((object = this.topMetaIterator) != null && (bl2 = object.hasNext())) {
                return this.topMetaIterator;
            }
            object = this.metaIterators;
            if (object == null || (bl2 = object.isEmpty())) break;
            this.topMetaIterator = object = (Iterator)this.metaIterators.removeFirst();
        }
        return null;
    }

    public boolean hasNext() {
        Iterator iterator;
        boolean bl2;
        while (!(bl2 = (iterator = (Iterator)Preconditions.checkNotNull(this.iterator)).hasNext())) {
            this.topMetaIterator = iterator = this.getTopMetaIterator();
            if (iterator == null) {
                return false;
            }
            this.iterator = iterator = (Iterator)iterator.next();
            boolean bl3 = iterator instanceof Iterators$ConcatenatedIterator;
            if (!bl3) continue;
            iterator = (Iterators$ConcatenatedIterator)iterator;
            Deque<Iterator> deque = ((Iterators$ConcatenatedIterator)iterator).iterator;
            this.iterator = deque;
            deque = this.metaIterators;
            if (deque == null) {
                deque = new Deque<Iterator>();
                this.metaIterators = deque;
            }
            deque = this.metaIterators;
            Iterator iterator2 = this.topMetaIterator;
            deque.addFirst(iterator2);
            deque = ((Iterators$ConcatenatedIterator)iterator).metaIterators;
            if (deque != null) {
                while (!(bl3 = (deque = ((Iterators$ConcatenatedIterator)iterator).metaIterators).isEmpty())) {
                    deque = this.metaIterators;
                    iterator2 = (Iterator)((Iterators$ConcatenatedIterator)iterator).metaIterators.removeLast();
                    deque.addFirst(iterator2);
                }
            }
            this.topMetaIterator = iterator = ((Iterators$ConcatenatedIterator)iterator).topMetaIterator;
        }
        return true;
    }

    public Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Iterator iterator;
            this.toRemove = iterator = this.iterator;
            return iterator.next();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        Object object = this.toRemove;
        if (object != null) {
            object.remove();
            this.toRemove = null;
            return;
        }
        object = new IllegalStateException("no calls to next() since the last call to remove()");
        throw object;
    }
}

