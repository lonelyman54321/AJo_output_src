/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry
extends MapMakerInternalMap$WeakKeyStrongValueEntry {
    private final MapMakerInternalMap$WeakKeyStrongValueEntry next;

    private MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry) {
        super(referenceQueue, object, n3, null);
        this.next = mapMakerInternalMap$WeakKeyStrongValueEntry;
    }

    public /* synthetic */ MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(referenceQueue, object, n3, mapMakerInternalMap$WeakKeyStrongValueEntry);
    }

    public MapMakerInternalMap$WeakKeyStrongValueEntry getNext() {
        return this.next;
    }
}

