/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

class ImmutableMap$MapViewOfValuesAsSingletonSets$1$1
extends AbstractMapEntry {
    final /* synthetic */ Map.Entry val$backingEntry;

    public ImmutableMap$MapViewOfValuesAsSingletonSets$1$1(ImmutableMap$MapViewOfValuesAsSingletonSets.1 var1_1, Map.Entry entry) {
        this.val$backingEntry = entry;
    }

    public Object getKey() {
        return this.val$backingEntry.getKey();
    }

    public ImmutableSet getValue() {
        return ImmutableSet.of(this.val$backingEntry.getValue());
    }
}

