/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry;

final class MapMakerInternalMap$StrongKeyStrongValueEntry$LinkedStrongKeyStrongValueEntry
extends MapMakerInternalMap$StrongKeyStrongValueEntry {
    private final MapMakerInternalMap$StrongKeyStrongValueEntry next;

    public MapMakerInternalMap$StrongKeyStrongValueEntry$LinkedStrongKeyStrongValueEntry(Object object, int n3, MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry) {
        super(object, n3, null);
        this.next = mapMakerInternalMap$StrongKeyStrongValueEntry;
    }

    public MapMakerInternalMap$StrongKeyStrongValueEntry getNext() {
        return this.next;
    }
}

