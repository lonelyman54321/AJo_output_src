/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ConsumingQueueIterator;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Queue;

class Iterables$8
extends FluentIterable {
    final /* synthetic */ Iterable val$iterable;

    public Iterables$8(Iterable iterable) {
        this.val$iterable = iterable;
    }

    public Iterator iterator() {
        Iterator iterator;
        Object object = this.val$iterable;
        boolean bl2 = object instanceof Queue;
        if (bl2) {
            object = (Queue)object;
            iterator = new ConsumingQueueIterator((Queue)object);
        } else {
            object = object.iterator();
            iterator = Iterators.consumingIterator((Iterator)object);
        }
        return iterator;
    }

    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}

