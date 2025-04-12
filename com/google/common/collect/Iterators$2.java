/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Iterators$2
implements Iterator {
    Iterator iterator;
    final /* synthetic */ Iterable val$iterable;

    public Iterators$2(Iterable object) {
        this.val$iterable = object;
        this.iterator = object = Iterators.emptyModifiableIterator();
    }

    public boolean hasNext() {
        Iterator iterator = this.iterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2 && !(bl2 = (iterator = this.val$iterable.iterator()).hasNext())) {
            bl2 = false;
            iterator = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object next() {
        Iterator iterator = this.iterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            iterator = this.val$iterable.iterator();
            this.iterator = iterator;
            bl2 = iterator.hasNext();
            if (!bl2) {
                iterator = new NoSuchElementException();
                throw iterator;
            }
        }
        return this.iterator.next();
    }

    public void remove() {
        this.iterator.remove();
    }
}

