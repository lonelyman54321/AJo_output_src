/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

class ImmutableMap$1
extends UnmodifiableIterator {
    final /* synthetic */ UnmodifiableIterator val$entryIterator;

    public ImmutableMap$1(ImmutableMap immutableMap, UnmodifiableIterator unmodifiableIterator) {
        this.val$entryIterator = unmodifiableIterator;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Object next() {
        return ((Map.Entry)this.val$entryIterator.next()).getKey();
    }
}

