/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets;
import com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;

class ImmutableMap$MapViewOfValuesAsSingletonSets$1
extends UnmodifiableIterator {
    final /* synthetic */ Iterator val$backingIterator;

    public ImmutableMap$MapViewOfValuesAsSingletonSets$1(ImmutableMap$MapViewOfValuesAsSingletonSets immutableMap$MapViewOfValuesAsSingletonSets, Iterator iterator) {
        this.val$backingIterator = iterator;
    }

    public boolean hasNext() {
        return this.val$backingIterator.hasNext();
    }

    public Map.Entry next() {
        Map.Entry entry = (Map.Entry)this.val$backingIterator.next();
        ImmutableMap$MapViewOfValuesAsSingletonSets$1$1 immutableMap$MapViewOfValuesAsSingletonSets$1$1 = new ImmutableMap$MapViewOfValuesAsSingletonSets$1$1(this, entry);
        return immutableMap$MapViewOfValuesAsSingletonSets$1$1;
    }
}

