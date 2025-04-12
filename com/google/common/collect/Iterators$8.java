/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;

class Iterators$8
extends UnmodifiableIterator {
    final /* synthetic */ Iterator val$iterator;

    public Iterators$8(Iterator iterator) {
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Object next() {
        Object e2 = this.val$iterator.next();
        this.val$iterator.remove();
        return e2;
    }

    public String toString() {
        return "Iterators.consumingIterator(...)";
    }
}

