/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.RegularImmutableBiMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public final class ImmutableBiMap$Builder
extends ImmutableMap$Builder {
    public ImmutableBiMap$Builder() {
    }

    public ImmutableBiMap$Builder(int n3) {
        super(n3);
    }

    public ImmutableBiMap build() {
        return this.buildOrThrow();
    }

    public ImmutableBiMap buildKeepingLast() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Not supported for bimaps");
        throw unsupportedOperationException;
    }

    public ImmutableBiMap buildOrThrow() {
        Object[] objectArray;
        int n3 = this.size;
        if (n3 == 0) {
            return ImmutableBiMap.of();
        }
        Object[] objectArray2 = this.valueComparator;
        if (objectArray2 != null) {
            int n4 = this.entriesUsed;
            if (n4 != 0) {
                objectArray2 = this.alternatingKeysAndValues;
                objectArray = Arrays.copyOf(objectArray2, n3 *= 2);
                this.alternatingKeysAndValues = objectArray;
            }
            objectArray = this.alternatingKeysAndValues;
            n4 = this.size;
            Comparator comparator = this.valueComparator;
            ImmutableMap$Builder.sortEntries(objectArray, n4, comparator);
        }
        this.entriesUsed = true;
        objectArray2 = this.alternatingKeysAndValues;
        int n7 = this.size;
        objectArray = new RegularImmutableBiMap(objectArray2, n7);
        return objectArray;
    }

    public ImmutableBiMap$Builder combine(ImmutableMap$Builder immutableMap$Builder) {
        super.combine(immutableMap$Builder);
        return this;
    }

    public ImmutableBiMap$Builder orderEntriesByValue(Comparator comparator) {
        super.orderEntriesByValue(comparator);
        return this;
    }

    public ImmutableBiMap$Builder put(Object object, Object object2) {
        super.put(object, object2);
        return this;
    }

    public ImmutableBiMap$Builder put(Map.Entry entry) {
        super.put(entry);
        return this;
    }

    public ImmutableBiMap$Builder putAll(Iterable iterable) {
        super.putAll(iterable);
        return this;
    }

    public ImmutableBiMap$Builder putAll(Map map2) {
        super.putAll(map2);
        return this;
    }
}

