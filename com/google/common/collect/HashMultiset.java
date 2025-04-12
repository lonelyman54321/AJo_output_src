/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectCountHashMap;

public final class HashMultiset
extends AbstractMapBasedMultiset {
    private static final long serialVersionUID;

    public HashMultiset(int n3) {
        super(n3);
    }

    public static HashMultiset create() {
        return HashMultiset.create(3);
    }

    public static HashMultiset create(int n3) {
        HashMultiset hashMultiset = new HashMultiset(n3);
        return hashMultiset;
    }

    public static HashMultiset create(Iterable iterable) {
        HashMultiset hashMultiset = HashMultiset.create(Multisets.inferDistinctElements(iterable));
        Iterables.addAll(hashMultiset, iterable);
        return hashMultiset;
    }

    public ObjectCountHashMap newBackingMap(int n3) {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap(n3);
        return objectCountHashMap;
    }
}

