/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.NullnessCasts;
import com.google.common.collect.PeekingIterator;
import java.util.Iterator;

class Iterators$PeekingImpl
implements PeekingIterator {
    private boolean hasPeeked;
    private final Iterator iterator;
    private Object peekedElement;

    public Iterators$PeekingImpl(Iterator iterator) {
        this.iterator = iterator = (Iterator)Preconditions.checkNotNull(iterator);
    }

    public boolean hasNext() {
        Iterator iterator;
        boolean bl2 = this.hasPeeked;
        if (!bl2 && !(bl2 = (iterator = this.iterator).hasNext())) {
            bl2 = false;
            iterator = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object next() {
        boolean bl2 = this.hasPeeked;
        if (!bl2) {
            return this.iterator.next();
        }
        Object object = NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        this.hasPeeked = false;
        this.peekedElement = null;
        return object;
    }

    public Object peek() {
        boolean bl2 = this.hasPeeked;
        if (!bl2) {
            Object e2 = this.iterator.next();
            this.peekedElement = e2;
            this.hasPeeked = bl2 = true;
        }
        return NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
    }

    public void remove() {
        Preconditions.checkState(this.hasPeeked ^ true, "Can't remove after you've peeked at next");
        this.iterator.remove();
    }
}

