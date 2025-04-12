/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets$SubSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.NoSuchElementException;

class Sets$SubSet$1
extends UnmodifiableIterator {
    final ImmutableList elements;
    int remainingSetBits;
    final /* synthetic */ Sets$SubSet this$0;

    public Sets$SubSet$1(Sets$SubSet sets$SubSet) {
        int n3;
        ImmutableList immutableList;
        this.this$0 = sets$SubSet;
        this.elements = immutableList = Sets$SubSet.access$100(sets$SubSet).keySet().asList();
        this.remainingSetBits = n3 = Sets$SubSet.access$200(sets$SubSet);
    }

    public boolean hasNext() {
        int n3 = this.remainingSetBits;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public Object next() {
        int n3;
        int n4 = Integer.numberOfTrailingZeros(this.remainingSetBits);
        if (n4 != (n3 = 32)) {
            n3 = this.remainingSetBits;
            int n7 = ~(1 << n4);
            this.remainingSetBits = n3 &= n7;
            return this.elements.get(n4);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

