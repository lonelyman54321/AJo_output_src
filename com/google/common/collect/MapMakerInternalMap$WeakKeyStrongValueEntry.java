/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry;
import com.google.common.collect.MapMakerInternalMap$StrongValueEntry;
import java.lang.ref.ReferenceQueue;

class MapMakerInternalMap$WeakKeyStrongValueEntry
extends MapMakerInternalMap$AbstractWeakKeyEntry
implements MapMakerInternalMap$StrongValueEntry {
    private volatile Object value = null;

    private MapMakerInternalMap$WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object object, int n3) {
        super(referenceQueue, object, n3);
    }

    public /* synthetic */ MapMakerInternalMap$WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(referenceQueue, object, n3);
    }

    public static /* synthetic */ Object access$1100(MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry) {
        return mapMakerInternalMap$WeakKeyStrongValueEntry.value;
    }

    public static /* synthetic */ Object access$1102(MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry, Object object) {
        mapMakerInternalMap$WeakKeyStrongValueEntry.value = object;
        return object;
    }

    public final Object getValue() {
        return this.value;
    }
}

