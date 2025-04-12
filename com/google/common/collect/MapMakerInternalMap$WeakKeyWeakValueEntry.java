/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import java.lang.ref.ReferenceQueue;

class MapMakerInternalMap$WeakKeyWeakValueEntry
extends MapMakerInternalMap$AbstractWeakKeyEntry
implements MapMakerInternalMap$WeakValueEntry {
    private volatile MapMakerInternalMap$WeakValueReference valueReference;

    public MapMakerInternalMap$WeakKeyWeakValueEntry(ReferenceQueue object, Object object2, int n3) {
        super((ReferenceQueue)object, object2, n3);
        this.valueReference = object = MapMakerInternalMap.unsetWeakValueReference();
    }

    public static /* synthetic */ MapMakerInternalMap$WeakValueReference access$1400(MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry) {
        return mapMakerInternalMap$WeakKeyWeakValueEntry.valueReference;
    }

    public static /* synthetic */ MapMakerInternalMap$WeakValueReference access$1402(MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry, MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference) {
        mapMakerInternalMap$WeakKeyWeakValueEntry.valueReference = mapMakerInternalMap$WeakValueReference;
        return mapMakerInternalMap$WeakValueReference;
    }

    public final Object getValue() {
        return this.valueReference.get();
    }

    public final MapMakerInternalMap$WeakValueReference getValueReference() {
        return this.valueReference;
    }
}

