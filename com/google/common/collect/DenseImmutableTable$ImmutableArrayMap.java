/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;

abstract class DenseImmutableTable$ImmutableArrayMap
extends ImmutableMap$IteratorBasedImmutableMap {
    private final int size;

    public DenseImmutableTable$ImmutableArrayMap(int n3) {
        this.size = n3;
    }

    private boolean isFull() {
        int n3 = this.size;
        ImmutableMap immutableMap = this.keyToIndex();
        int n4 = immutableMap.size();
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public ImmutableSet createKeySet() {
        boolean bl2 = this.isFull();
        ImmutableSet immutableSet = bl2 ? this.keyToIndex().keySet() : super.createKeySet();
        return immutableSet;
    }

    public UnmodifiableIterator entryIterator() {
        DenseImmutableTable$ImmutableArrayMap$1 denseImmutableTable$ImmutableArrayMap$1 = new DenseImmutableTable$ImmutableArrayMap$1(this);
        return denseImmutableTable$ImmutableArrayMap$1;
    }

    public Object get(Object object) {
        ImmutableMap immutableMap = this.keyToIndex();
        object = (Integer)immutableMap.get(object);
        if (object == null) {
            boolean bl2 = false;
            object = null;
        } else {
            int n3 = (Integer)object;
            object = this.getValue(n3);
        }
        return object;
    }

    public Object getKey(int n3) {
        return this.keyToIndex().keySet().asList().get(n3);
    }

    public abstract Object getValue(int var1);

    public abstract ImmutableMap keyToIndex();

    public int size() {
        return this.size;
    }
}

