/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$InternalEntry;

abstract class MapMakerInternalMap$AbstractStrongKeyEntry
implements MapMakerInternalMap$InternalEntry {
    final int hash;
    final Object key;

    public MapMakerInternalMap$AbstractStrongKeyEntry(Object object, int n3) {
        this.key = object;
        this.hash = n3;
    }

    public final int getHash() {
        return this.hash;
    }

    public final Object getKey() {
        return this.key;
    }

    public MapMakerInternalMap$InternalEntry getNext() {
        return null;
    }
}

