/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

abstract class TransformedIterator
implements Iterator {
    final Iterator backingIterator;

    public TransformedIterator(Iterator iterator) {
        this.backingIterator = iterator = (Iterator)Preconditions.checkNotNull(iterator);
    }

    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    public final Object next() {
        Object e2 = this.backingIterator.next();
        return this.transform(e2);
    }

    public final void remove() {
        this.backingIterator.remove();
    }

    public abstract Object transform(Object var1);
}

