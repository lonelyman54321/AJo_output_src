/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;

class MapMakerInternalMap$StrongKeyWeakValueEntry
extends MapMakerInternalMap$AbstractStrongKeyEntry
implements MapMakerInternalMap$WeakValueEntry {
    private volatile MapMakerInternalMap$WeakValueReference valueReference;

    private MapMakerInternalMap$StrongKeyWeakValueEntry(Object object, int n3) {
        super(object, n3);
        this.valueReference = object = MapMakerInternalMap.unsetWeakValueReference();
    }

    public /* synthetic */ MapMakerInternalMap$StrongKeyWeakValueEntry(Object object, int n3, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(object, n3);
    }

    public static /* synthetic */ MapMakerInternalMap$WeakValueReference access$400(MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry) {
        return mapMakerInternalMap$StrongKeyWeakValueEntry.valueReference;
    }

    public static /* synthetic */ MapMakerInternalMap$WeakValueReference access$402(MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry, MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference) {
        mapMakerInternalMap$StrongKeyWeakValueEntry.valueReference = mapMakerInternalMap$WeakValueReference;
        return mapMakerInternalMap$WeakValueReference;
    }

    public final Object getValue() {
        return this.valueReference.get();
    }

    public final MapMakerInternalMap$WeakValueReference getValueReference() {
        return this.valueReference;
    }
}

