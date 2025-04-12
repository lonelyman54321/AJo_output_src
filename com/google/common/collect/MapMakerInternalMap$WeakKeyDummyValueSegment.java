/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyDummyValueSegment
extends MapMakerInternalMap$Segment {
    private final ReferenceQueue queueForKeys;

    public MapMakerInternalMap$WeakKeyDummyValueSegment(MapMakerInternalMap referenceQueue, int n3) {
        super((MapMakerInternalMap)((Object)referenceQueue), n3);
        this.queueForKeys = referenceQueue = new ReferenceQueue();
    }

    public static /* synthetic */ ReferenceQueue access$800(MapMakerInternalMap$WeakKeyDummyValueSegment mapMakerInternalMap$WeakKeyDummyValueSegment) {
        return mapMakerInternalMap$WeakKeyDummyValueSegment.queueForKeys;
    }

    public MapMakerInternalMap$WeakKeyDummyValueEntry castForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        return (MapMakerInternalMap$WeakKeyDummyValueEntry)mapMakerInternalMap$InternalEntry;
    }

    public ReferenceQueue getKeyReferenceQueueForTesting() {
        return this.queueForKeys;
    }

    public void maybeClearReferenceQueues() {
        ReferenceQueue referenceQueue = this.queueForKeys;
        this.clearReferenceQueue(referenceQueue);
    }

    public void maybeDrainReferenceQueues() {
        ReferenceQueue referenceQueue = this.queueForKeys;
        this.drainKeyReferenceQueue(referenceQueue);
    }

    public MapMakerInternalMap$WeakKeyDummyValueSegment self() {
        return this;
    }
}

