/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.Maps;
import java.util.Map;

class DenseImmutableTable$ImmutableArrayMap$1
extends AbstractIterator {
    private int index = -1;
    private final int maxIndex;
    final /* synthetic */ DenseImmutableTable$ImmutableArrayMap this$0;

    public DenseImmutableTable$ImmutableArrayMap$1(DenseImmutableTable$ImmutableArrayMap denseImmutableTable$ImmutableArrayMap) {
        int n3;
        this.this$0 = denseImmutableTable$ImmutableArrayMap;
        this.maxIndex = n3 = denseImmutableTable$ImmutableArrayMap.keyToIndex().size();
    }

    public Map.Entry computeNext() {
        int n3;
        int n4 = this.index;
        while ((n4 = (this.index = ++n4)) < (n3 = this.maxIndex)) {
            DenseImmutableTable$ImmutableArrayMap denseImmutableTable$ImmutableArrayMap = this.this$0;
            Object object = denseImmutableTable$ImmutableArrayMap.getValue(n4);
            if (object != null) {
                denseImmutableTable$ImmutableArrayMap = this.this$0;
                int n7 = this.index;
                return Maps.immutableEntry(denseImmutableTable$ImmutableArrayMap.getKey(n7), object);
            }
            n4 = this.index;
        }
        return (Map.Entry)this.endOfData();
    }
}

