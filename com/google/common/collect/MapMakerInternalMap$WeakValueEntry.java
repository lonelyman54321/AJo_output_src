/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;

interface MapMakerInternalMap$WeakValueEntry
extends MapMakerInternalMap$InternalEntry {
    public MapMakerInternalMap$WeakValueReference getValueReference();
}

