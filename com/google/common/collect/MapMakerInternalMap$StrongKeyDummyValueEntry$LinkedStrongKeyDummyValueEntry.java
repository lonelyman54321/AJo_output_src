/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry;

final class MapMakerInternalMap$StrongKeyDummyValueEntry$LinkedStrongKeyDummyValueEntry
extends MapMakerInternalMap$StrongKeyDummyValueEntry {
    private final MapMakerInternalMap$StrongKeyDummyValueEntry next;

    public MapMakerInternalMap$StrongKeyDummyValueEntry$LinkedStrongKeyDummyValueEntry(Object object, int n3, MapMakerInternalMap$StrongKeyDummyValueEntry mapMakerInternalMap$StrongKeyDummyValueEntry) {
        super(object, n3, null);
        this.next = mapMakerInternalMap$StrongKeyDummyValueEntry;
    }

    public MapMakerInternalMap$StrongKeyDummyValueEntry getNext() {
        return this.next;
    }
}

