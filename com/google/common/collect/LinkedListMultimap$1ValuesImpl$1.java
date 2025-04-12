/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.LinkedListMultimap$1ValuesImpl;
import com.google.common.collect.LinkedListMultimap$NodeIterator;
import com.google.common.collect.TransformedListIterator;
import java.util.ListIterator;
import java.util.Map;

class LinkedListMultimap$1ValuesImpl$1
extends TransformedListIterator {
    final /* synthetic */ LinkedListMultimap$NodeIterator val$nodeItr;

    public LinkedListMultimap$1ValuesImpl$1(LinkedListMultimap$1ValuesImpl linkedListMultimap$1ValuesImpl, ListIterator listIterator, LinkedListMultimap$NodeIterator linkedListMultimap$NodeIterator) {
        this.val$nodeItr = linkedListMultimap$NodeIterator;
        super(listIterator);
    }

    public void set(Object object) {
        this.val$nodeItr.setValue(object);
    }

    public Object transform(Map.Entry entry) {
        return entry.getValue();
    }
}

