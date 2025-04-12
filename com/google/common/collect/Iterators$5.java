/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

class Iterators$5
extends AbstractIterator {
    final /* synthetic */ Predicate val$retainIfTrue;
    final /* synthetic */ Iterator val$unfiltered;

    public Iterators$5(Iterator iterator, Predicate predicate) {
        this.val$unfiltered = iterator;
        this.val$retainIfTrue = predicate;
    }

    public Object computeNext() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.val$unfiltered).hasNext()) {
            Predicate predicate = this.val$retainIfTrue;
            iterator = this.val$unfiltered.next();
            boolean bl3 = predicate.apply(iterator);
            if (!bl3) continue;
            return iterator;
        }
        return this.endOfData();
    }
}

