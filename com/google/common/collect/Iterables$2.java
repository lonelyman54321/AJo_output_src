/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;

class Iterables$2
extends FluentIterable {
    final /* synthetic */ Iterable val$iterable;
    final /* synthetic */ int val$size;

    public Iterables$2(Iterable iterable, int n3) {
        this.val$iterable = iterable;
        this.val$size = n3;
    }

    public Iterator iterator() {
        Iterator iterator = this.val$iterable.iterator();
        int n3 = this.val$size;
        return Iterators.partition(iterator, n3);
    }
}

