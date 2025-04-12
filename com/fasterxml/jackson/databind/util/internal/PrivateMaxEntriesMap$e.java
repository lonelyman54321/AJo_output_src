/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$d;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class PrivateMaxEntriesMap$e
extends AbstractSet {
    public final PrivateMaxEntriesMap a;
    public final /* synthetic */ PrivateMaxEntriesMap b;

    public PrivateMaxEntriesMap$e(PrivateMaxEntriesMap privateMaxEntriesMap) {
        this.b = privateMaxEntriesMap;
        this.a = privateMaxEntriesMap;
    }

    public final boolean add(Object object) {
        object = (Map.Entry)object;
        object = new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map.Entry;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (Map.Entry)object;
        Object object2 = this.a.a;
        Object k2 = object.getKey();
        if ((object2 = (PrivateMaxEntriesMap$h)((ConcurrentHashMap)object2).get(k2)) != null && (bl2 = (object2 = ((PrivateMaxEntriesMap$h)object2).d()).equals(object = object.getValue()))) {
            bl4 = true;
        }
        return bl4;
    }

    public final Iterator iterator() {
        PrivateMaxEntriesMap privateMaxEntriesMap = this.b;
        PrivateMaxEntriesMap$d privateMaxEntriesMap$d = new PrivateMaxEntriesMap$d(privateMaxEntriesMap);
        return privateMaxEntriesMap$d;
    }

    public final boolean remove(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (!bl2) {
            return false;
        }
        object = (Map.Entry)object;
        Object k2 = object.getKey();
        object = object.getValue();
        return this.a.remove(k2, object);
    }

    public final int size() {
        return this.a.size();
    }
}

