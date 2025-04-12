/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry;
import com.google.common.collect.MapMakerInternalMap$StrongValueEntry;

class MapMakerInternalMap$StrongKeyStrongValueEntry
extends MapMakerInternalMap$AbstractStrongKeyEntry
implements MapMakerInternalMap$StrongValueEntry {
    private volatile Object value = null;

    private MapMakerInternalMap$StrongKeyStrongValueEntry(Object object, int n3) {
        super(object, n3);
    }

    public /* synthetic */ MapMakerInternalMap$StrongKeyStrongValueEntry(Object object, int n3, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(object, n3);
    }

    public static /* synthetic */ Object access$200(MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry) {
        return mapMakerInternalMap$StrongKeyStrongValueEntry.value;
    }

    public static /* synthetic */ Object access$202(MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry, Object object) {
        mapMakerInternalMap$StrongKeyStrongValueEntry.value = object;
        return object;
    }

    public final Object getValue() {
        return this.value;
    }
}

