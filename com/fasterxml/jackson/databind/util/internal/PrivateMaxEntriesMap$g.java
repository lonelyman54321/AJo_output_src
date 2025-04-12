/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$f;
import java.util.AbstractSet;
import java.util.Iterator;

public final class PrivateMaxEntriesMap$g
extends AbstractSet {
    public final PrivateMaxEntriesMap a;
    public final /* synthetic */ PrivateMaxEntriesMap b;

    public PrivateMaxEntriesMap$g(PrivateMaxEntriesMap privateMaxEntriesMap) {
        this.b = privateMaxEntriesMap;
        this.a = privateMaxEntriesMap;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    public final Iterator iterator() {
        PrivateMaxEntriesMap privateMaxEntriesMap = this.b;
        PrivateMaxEntriesMap$f privateMaxEntriesMap$f = new PrivateMaxEntriesMap$f(privateMaxEntriesMap);
        return privateMaxEntriesMap$f;
    }

    public final boolean remove(Object object) {
        boolean bl2;
        PrivateMaxEntriesMap privateMaxEntriesMap = this.a;
        if ((object = privateMaxEntriesMap.remove(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int size() {
        return this.a.size();
    }

    public final Object[] toArray() {
        return this.a.a.keySet().toArray();
    }

    public final Object[] toArray(Object[] objectArray) {
        return this.a.a.keySet().toArray(objectArray);
    }
}

