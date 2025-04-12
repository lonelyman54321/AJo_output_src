/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

class Iterators$3
extends UnmodifiableIterator {
    int index = 0;
    final /* synthetic */ Iterator[] val$elements;

    public Iterators$3(Iterator[] iteratorArray) {
        this.val$elements = iteratorArray;
    }

    public boolean hasNext() {
        int n3 = this.index;
        Iterator[] iteratorArray = this.val$elements;
        int n4 = iteratorArray.length;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public Iterator next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Object object = this.val$elements;
            int n3 = this.index;
            object = object[n3];
            Objects.requireNonNull(object);
            object = (Iterator)object;
            Iterator[] iteratorArray = this.val$elements;
            int n4 = this.index;
            iteratorArray[n4] = null;
            this.index = ++n4;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

