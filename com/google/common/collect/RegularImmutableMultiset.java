/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.collect.RegularImmutableMultiset$ElementSet;
import com.google.common.collect.RegularImmutableMultiset$SerializedForm;
import com.google.common.primitives.Ints;

class RegularImmutableMultiset
extends ImmutableMultiset {
    static final RegularImmutableMultiset EMPTY;
    final transient ObjectCountHashMap contents;
    private transient ImmutableSet elementSet;
    private final transient int size;

    static {
        RegularImmutableMultiset regularImmutableMultiset;
        ObjectCountHashMap objectCountHashMap = ObjectCountHashMap.create();
        EMPTY = regularImmutableMultiset = new RegularImmutableMultiset(objectCountHashMap);
    }

    public RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        int n3;
        int n4;
        this.contents = objectCountHashMap;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n4 = objectCountHashMap.size()); ++i3) {
            n4 = objectCountHashMap.getValue(i3);
            long l3 = n4;
            l2 += l3;
        }
        this.size = n3 = Ints.saturatedCast(l2);
    }

    public int count(Object object) {
        return this.contents.get(object);
    }

    public ImmutableSet elementSet() {
        ImmutableSet immutableSet = this.elementSet;
        if (immutableSet == null) {
            this.elementSet = immutableSet = new RegularImmutableMultiset$ElementSet(this, null);
        }
        return immutableSet;
    }

    public Multiset$Entry getEntry(int n3) {
        return this.contents.getEntry(n3);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }

    public Object writeReplace() {
        RegularImmutableMultiset$SerializedForm regularImmutableMultiset$SerializedForm = new RegularImmutableMultiset$SerializedForm(this);
        return regularImmutableMultiset$SerializedForm;
    }
}

