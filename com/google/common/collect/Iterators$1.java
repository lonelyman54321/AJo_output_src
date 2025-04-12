/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;

class Iterators$1
extends UnmodifiableIterator {
    final /* synthetic */ Iterator val$iterator;

    public Iterators$1(Iterator iterator) {
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Object next() {
        return this.val$iterator.next();
    }
}

