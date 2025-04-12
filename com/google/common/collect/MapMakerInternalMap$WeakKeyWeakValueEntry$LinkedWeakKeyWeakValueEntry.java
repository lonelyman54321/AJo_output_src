/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry
extends MapMakerInternalMap$WeakKeyWeakValueEntry {
    private final MapMakerInternalMap$WeakKeyWeakValueEntry next;

    public MapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry) {
        super(referenceQueue, object, n3);
        this.next = mapMakerInternalMap$WeakKeyWeakValueEntry;
    }

    public MapMakerInternalMap$WeakKeyWeakValueEntry getNext() {
        return this.next;
    }
}

