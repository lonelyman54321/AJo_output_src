/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Iterables$6;
import java.util.Iterator;

class Iterables$6$1
implements Iterator {
    boolean atStart = true;
    final /* synthetic */ Iterator val$iterator;

    public Iterables$6$1(Iterables.6 var1_1, Iterator iterator) {
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Object next() {
        Object e2 = this.val$iterator.next();
        this.atStart = false;
        return e2;
    }

    public void remove() {
        CollectPreconditions.checkRemove(this.atStart ^ true);
        this.val$iterator.remove();
    }
}

