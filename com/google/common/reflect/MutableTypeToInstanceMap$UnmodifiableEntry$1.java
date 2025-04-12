/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ForwardingSet;
import com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry;
import java.util.Iterator;
import java.util.Set;

class MutableTypeToInstanceMap$UnmodifiableEntry$1
extends ForwardingSet {
    final /* synthetic */ Set val$entries;

    public MutableTypeToInstanceMap$UnmodifiableEntry$1(Set set) {
        this.val$entries = set;
    }

    public Set delegate() {
        return this.val$entries;
    }

    public Iterator iterator() {
        return MutableTypeToInstanceMap$UnmodifiableEntry.access$000(super.iterator());
    }

    public Object[] toArray() {
        return this.standardToArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return this.standardToArray(objectArray);
    }
}

