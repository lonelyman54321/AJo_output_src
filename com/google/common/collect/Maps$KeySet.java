/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Iterator;
import java.util.Map;

class Maps$KeySet
extends Sets$ImprovedAbstractSet {
    final Map map;

    public Maps$KeySet(Map map2) {
        this.map = map2 = (Map)Preconditions.checkNotNull(map2);
    }

    public void clear() {
        this.map().clear();
    }

    public boolean contains(Object object) {
        return this.map().containsKey(object);
    }

    public boolean isEmpty() {
        return this.map().isEmpty();
    }

    public Iterator iterator() {
        return Maps.keyIterator(this.map().entrySet().iterator());
    }

    public Map map() {
        return this.map;
    }

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (bl2) {
            this.map().remove(object);
            return true;
        }
        return false;
    }

    public int size() {
        return this.map().size();
    }
}

