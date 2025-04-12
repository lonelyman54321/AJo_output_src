/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Objects;

class ImmutableMultiset$1
extends UnmodifiableIterator {
    Object element;
    int remaining;
    final /* synthetic */ Iterator val$entryIterator;

    public ImmutableMultiset$1(ImmutableMultiset immutableMultiset, Iterator iterator) {
        this.val$entryIterator = iterator;
    }

    public boolean hasNext() {
        Iterator iterator;
        int n3 = this.remaining;
        if (n3 <= 0 && !(n3 = (iterator = this.val$entryIterator).hasNext())) {
            n3 = 0;
            iterator = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public Object next() {
        Object object;
        int n3 = this.remaining;
        if (n3 <= 0) {
            Object object2;
            object = (Multiset$Entry)this.val$entryIterator.next();
            this.element = object2 = object.getElement();
            this.remaining = n3 = object.getCount();
        }
        this.remaining = n3 = this.remaining + -1;
        object = this.element;
        Objects.requireNonNull(object);
        return object;
    }
}

