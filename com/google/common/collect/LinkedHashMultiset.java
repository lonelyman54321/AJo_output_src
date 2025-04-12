/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.collect.ObjectCountLinkedHashMap;

public final class LinkedHashMultiset
extends AbstractMapBasedMultiset {
    public LinkedHashMultiset(int n3) {
        super(n3);
    }

    public static LinkedHashMultiset create() {
        return LinkedHashMultiset.create(3);
    }

    public static LinkedHashMultiset create(int n3) {
        LinkedHashMultiset linkedHashMultiset = new LinkedHashMultiset(n3);
        return linkedHashMultiset;
    }

    public static LinkedHashMultiset create(Iterable iterable) {
        LinkedHashMultiset linkedHashMultiset = LinkedHashMultiset.create(Multisets.inferDistinctElements(iterable));
        Iterables.addAll(linkedHashMultiset, iterable);
        return linkedHashMultiset;
    }

    public ObjectCountHashMap newBackingMap(int n3) {
        ObjectCountLinkedHashMap objectCountLinkedHashMap = new ObjectCountLinkedHashMap(n3);
        return objectCountLinkedHashMap;
    }
}

