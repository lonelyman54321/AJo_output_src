/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry;

final class MapMakerInternalMap$StrongKeyWeakValueEntry$LinkedStrongKeyWeakValueEntry
extends MapMakerInternalMap$StrongKeyWeakValueEntry {
    private final MapMakerInternalMap$StrongKeyWeakValueEntry next;

    public MapMakerInternalMap$StrongKeyWeakValueEntry$LinkedStrongKeyWeakValueEntry(Object object, int n3, MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry) {
        super(object, n3, null);
        this.next = mapMakerInternalMap$StrongKeyWeakValueEntry;
    }

    public MapMakerInternalMap$StrongKeyWeakValueEntry getNext() {
        return this.next;
    }
}

