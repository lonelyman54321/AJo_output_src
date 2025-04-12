/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;

class Iterables$7
extends FluentIterable {
    final /* synthetic */ Iterable val$iterable;
    final /* synthetic */ int val$limitSize;

    public Iterables$7(Iterable iterable, int n3) {
        this.val$iterable = iterable;
        this.val$limitSize = n3;
    }

    public Iterator iterator() {
        Iterator iterator = this.val$iterable.iterator();
        int n3 = this.val$limitSize;
        return Iterators.limit(iterator, n3);
    }
}

