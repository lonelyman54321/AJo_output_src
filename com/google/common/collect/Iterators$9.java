/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.NoSuchElementException;

class Iterators$9
extends UnmodifiableIterator {
    boolean done;
    final /* synthetic */ Object val$value;

    public Iterators$9(Object object) {
        this.val$value = object;
    }

    public boolean hasNext() {
        return this.done ^ true;
    }

    public Object next() {
        boolean bl2 = this.done;
        if (!bl2) {
            this.done = true;
            return this.val$value;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

