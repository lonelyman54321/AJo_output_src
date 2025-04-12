/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Iterators$7
implements Iterator {
    private int count;
    final /* synthetic */ Iterator val$iterator;
    final /* synthetic */ int val$limitSize;

    public Iterators$7(int n3, Iterator iterator) {
        this.val$limitSize = n3;
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        Iterator iterator;
        int n3 = this.count;
        int n4 = this.val$limitSize;
        if (n3 < n4 && (n3 = (int)((iterator = this.val$iterator).hasNext() ? 1 : 0))) {
            n3 = 1;
        } else {
            n3 = 0;
            iterator = null;
        }
        return n3 != 0;
    }

    public Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            this.count = n3 = this.count + 1;
            return this.val$iterator.next();
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        this.val$iterator.remove();
    }
}

