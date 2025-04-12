/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyWeakValueSegment
extends MapMakerInternalMap$Segment {
    private final ReferenceQueue queueForKeys;
    private final ReferenceQueue queueForValues;

    public MapMakerInternalMap$WeakKeyWeakValueSegment(MapMakerInternalMap referenceQueue, int n3) {
        super((MapMakerInternalMap)((Object)referenceQueue), n3);
        this.queueForKeys = referenceQueue = new ReferenceQueue();
        this.queueForValues = referenceQueue = new ReferenceQueue();
    }

    public static /* synthetic */ ReferenceQueue access$1500(MapMakerInternalMap$WeakKeyWeakValueSegment mapMakerInternalMap$WeakKeyWeakValueSegment) {
        return mapMakerInternalMap$WeakKeyWeakValueSegment.queueForValues;
    }

    public static /* synthetic */ ReferenceQueue access$1600(MapMakerInternalMap$WeakKeyWeakValueSegment mapMakerInternalMap$WeakKeyWeakValueSegment) {
        return mapMakerInternalMap$WeakKeyWeakValueSegment.queueForKeys;
    }

    public MapMakerInternalMap$WeakKeyWeakValueEntry castForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        return (MapMakerInternalMap$WeakKeyWeakValueEntry)mapMakerInternalMap$InternalEntry;
    }

    public ReferenceQueue getKeyReferenceQueueForTesting() {
        return this.queueForKeys;
    }

    public ReferenceQueue getValueReferenceQueueForTesting() {
        return this.queueForValues;
    }

    public MapMakerInternalMap$WeakValueReference getWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        return ((MapMakerInternalMap$WeakKeyWeakValueEntry)this.castForTesting(mapMakerInternalMap$InternalEntry)).getValueReference();
    }

    public void maybeClearReferenceQueues() {
        ReferenceQueue referenceQueue = this.queueForKeys;
        this.clearReferenceQueue(referenceQueue);
    }

    public void maybeDrainReferenceQueues() {
        ReferenceQueue referenceQueue = this.queueForKeys;
        this.drainKeyReferenceQueue(referenceQueue);
        referenceQueue = this.queueForValues;
        this.drainValueReferenceQueue(referenceQueue);
    }

    public MapMakerInternalMap$WeakValueReference newWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, Object object) {
        ReferenceQueue referenceQueue = this.queueForValues;
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        MapMakerInternalMap$WeakValueReferenceImpl mapMakerInternalMap$WeakValueReferenceImpl = new MapMakerInternalMap$WeakValueReferenceImpl(referenceQueue, object, mapMakerInternalMap$InternalEntry);
        return mapMakerInternalMap$WeakValueReferenceImpl;
    }

    public MapMakerInternalMap$WeakKeyWeakValueSegment self() {
        return this;
    }

    public void setWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference) {
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference2 = MapMakerInternalMap$WeakKeyWeakValueEntry.access$1400((MapMakerInternalMap$WeakKeyWeakValueEntry)mapMakerInternalMap$InternalEntry);
        MapMakerInternalMap$WeakKeyWeakValueEntry.access$1402((MapMakerInternalMap$WeakKeyWeakValueEntry)mapMakerInternalMap$InternalEntry, mapMakerInternalMap$WeakValueReference);
        mapMakerInternalMap$WeakValueReference2.clear();
    }
}

