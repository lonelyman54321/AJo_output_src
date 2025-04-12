/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry
extends MapMakerInternalMap$WeakKeyDummyValueEntry {
    private final MapMakerInternalMap$WeakKeyDummyValueEntry next;

    private MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry) {
        super(referenceQueue, object, n3, null);
        this.next = mapMakerInternalMap$WeakKeyDummyValueEntry;
    }

    public /* synthetic */ MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(referenceQueue, object, n3, mapMakerInternalMap$WeakKeyDummyValueEntry);
    }

    public MapMakerInternalMap$WeakKeyDummyValueEntry getNext() {
        return this.next;
    }
}

