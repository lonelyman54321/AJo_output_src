/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.UnmodifiableIterator;

final class ImmutableMultimap$Values
extends ImmutableCollection {
    private static final long serialVersionUID;
    private final transient ImmutableMultimap multimap;

    public ImmutableMultimap$Values(ImmutableMultimap immutableMultimap) {
        this.multimap = immutableMultimap;
    }

    public boolean contains(Object object) {
        return this.multimap.containsValue(object);
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.multimap.map.values().iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            ImmutableCollection immutableCollection = (ImmutableCollection)unmodifiableIterator.next();
            n3 = immutableCollection.copyIntoArray(objectArray, n3);
        }
        return n3;
    }

    public boolean isPartialView() {
        return true;
    }

    public UnmodifiableIterator iterator() {
        return this.multimap.valueIterator();
    }

    public int size() {
        return this.multimap.size();
    }
}

