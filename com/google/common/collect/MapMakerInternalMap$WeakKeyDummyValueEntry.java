/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMaker$Dummy;
import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry;
import com.google.common.collect.MapMakerInternalMap$StrongValueEntry;
import java.lang.ref.ReferenceQueue;

class MapMakerInternalMap$WeakKeyDummyValueEntry
extends MapMakerInternalMap$AbstractWeakKeyEntry
implements MapMakerInternalMap$StrongValueEntry {
    private MapMakerInternalMap$WeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object object, int n3) {
        super(referenceQueue, object, n3);
    }

    public /* synthetic */ MapMakerInternalMap$WeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object object, int n3, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(referenceQueue, object, n3);
    }

    public final MapMaker$Dummy getValue() {
        return MapMaker$Dummy.VALUE;
    }
}

