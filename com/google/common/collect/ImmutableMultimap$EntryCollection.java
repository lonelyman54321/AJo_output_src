/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

class ImmutableMultimap$EntryCollection
extends ImmutableCollection {
    private static final long serialVersionUID;
    final ImmutableMultimap multimap;

    public ImmutableMultimap$EntryCollection(ImmutableMultimap immutableMultimap) {
        this.multimap = immutableMultimap;
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            object = (Map.Entry)object;
            ImmutableMultimap immutableMultimap = this.multimap;
            Object k2 = object.getKey();
            object = object.getValue();
            return immutableMultimap.containsEntry(k2, object);
        }
        return false;
    }

    public boolean isPartialView() {
        return this.multimap.isPartialView();
    }

    public UnmodifiableIterator iterator() {
        return this.multimap.entryIterator();
    }

    public int size() {
        return this.multimap.size();
    }
}

