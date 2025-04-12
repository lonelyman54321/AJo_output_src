/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;

class Iterables$4
extends FluentIterable {
    final /* synthetic */ Predicate val$retainIfTrue;
    final /* synthetic */ Iterable val$unfiltered;

    public Iterables$4(Iterable iterable, Predicate predicate) {
        this.val$unfiltered = iterable;
        this.val$retainIfTrue = predicate;
    }

    public Iterator iterator() {
        Iterator iterator = this.val$unfiltered.iterator();
        Predicate predicate = this.val$retainIfTrue;
        return Iterators.filter(iterator, predicate);
    }
}

