/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

abstract class MapMakerInternalMap$AbstractWeakKeyEntry
extends WeakReference
implements MapMakerInternalMap$InternalEntry {
    final int hash;

    public MapMakerInternalMap$AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object object, int n3) {
        super(object, referenceQueue);
        this.hash = n3;
    }

    public final int getHash() {
        return this.hash;
    }

    public final Object getKey() {
        return this.get();
    }

    public MapMakerInternalMap$InternalEntry getNext() {
        return null;
    }
}

