/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMaker$Dummy;
import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry;
import com.google.common.collect.MapMakerInternalMap$StrongValueEntry;

class MapMakerInternalMap$StrongKeyDummyValueEntry
extends MapMakerInternalMap$AbstractStrongKeyEntry
implements MapMakerInternalMap$StrongValueEntry {
    private MapMakerInternalMap$StrongKeyDummyValueEntry(Object object, int n3) {
        super(object, n3);
    }

    public /* synthetic */ MapMakerInternalMap$StrongKeyDummyValueEntry(Object object, int n3, MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this(object, n3);
    }

    public final MapMaker$Dummy getValue() {
        return MapMaker$Dummy.VALUE;
    }
}

