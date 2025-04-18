/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.IndexedImmutableSet$1;
import com.google.common.collect.UnmodifiableIterator;

abstract class IndexedImmutableSet
extends ImmutableSet {
    public int copyIntoArray(Object[] objectArray, int n3) {
        return this.asList().copyIntoArray(objectArray, n3);
    }

    public ImmutableList createAsList() {
        IndexedImmutableSet$1 indexedImmutableSet$1 = new IndexedImmutableSet$1(this);
        return indexedImmutableSet$1;
    }

    public abstract Object get(int var1);

    public UnmodifiableIterator iterator() {
        return this.asList().iterator();
    }
}

