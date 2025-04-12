/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

final class ImmutableSetMultimap$EntrySet
extends ImmutableSet {
    private final transient ImmutableSetMultimap multimap;

    public ImmutableSetMultimap$EntrySet(ImmutableSetMultimap immutableSetMultimap) {
        this.multimap = immutableSetMultimap;
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            object = (Map.Entry)object;
            ImmutableSetMultimap immutableSetMultimap = this.multimap;
            Object k2 = object.getKey();
            object = object.getValue();
            return immutableSetMultimap.containsEntry(k2, object);
        }
        return false;
    }

    public boolean isPartialView() {
        return false;
    }

    public UnmodifiableIterator iterator() {
        return this.multimap.entryIterator();
    }

    public int size() {
        return this.multimap.size();
    }
}

