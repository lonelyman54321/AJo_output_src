/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class AbstractMultimap
implements Multimap {
    private transient Map asMap;
    private transient Collection entries;
    private transient Set keySet;
    private transient Multiset keys;
    private transient Collection values;

    public Map asMap() {
        Map map2 = this.asMap;
        if (map2 == null) {
            this.asMap = map2 = this.createAsMap();
        }
        return map2;
    }

    public boolean containsEntry(Object object, Object object2) {
        boolean bl2;
        Map map2 = this.asMap();
        object = (Collection)map2.get(object);
        if (object != null && (bl2 = object.contains(object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsValue(Object object) {
        boolean bl2;
        Iterator iterator = this.asMap().values().iterator();
        while (bl2 = iterator.hasNext()) {
            Collection collection = (Collection)iterator.next();
            bl2 = collection.contains(object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public abstract Map createAsMap();

    public abstract Collection createEntries();

    public abstract Set createKeySet();

    public abstract Multiset createKeys();

    public abstract Collection createValues();

    public Collection entries() {
        Collection collection = this.entries;
        if (collection == null) {
            this.entries = collection = this.createEntries();
        }
        return collection;
    }

    public abstract Iterator entryIterator();

    public boolean equals(Object object) {
        return Multimaps.equalsImpl(this, object);
    }

    public int hashCode() {
        return this.asMap().hashCode();
    }

    public boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            this.keySet = set = this.createKeySet();
        }
        return set;
    }

    public Multiset keys() {
        Multiset multiset = this.keys;
        if (multiset == null) {
            this.keys = multiset = this.createKeys();
        }
        return multiset;
    }

    public boolean put(Object object, Object object2) {
        return this.get(object).add(object2);
    }

    public boolean putAll(Multimap object) {
        boolean bl2;
        object = object.entries().iterator();
        boolean bl3 = false;
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            bl2 = this.put(k2, entry);
            bl3 |= bl2;
        }
        return bl3;
    }

    public boolean putAll(Object object, Iterable object2) {
        boolean bl2;
        Preconditions.checkNotNull(object2);
        boolean bl3 = object2 instanceof Collection;
        boolean bl4 = false;
        if (bl3) {
            boolean bl5;
            bl3 = (object2 = (Collection)object2).isEmpty();
            if (!bl3 && (bl5 = (object = this.get(object)).addAll(object2))) {
                bl4 = true;
            }
            return bl4;
        }
        bl3 = (object2 = object2.iterator()).hasNext();
        if (bl3 && (bl2 = Iterators.addAll((Collection)(object = this.get(object)), (Iterator)object2))) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean remove(Object object, Object object2) {
        boolean bl2;
        Map map2 = this.asMap();
        object = (Collection)map2.get(object);
        if (object != null && (bl2 = object.remove(object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Collection replaceValues(Object object, Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        Collection collection = this.removeAll(object);
        this.putAll(object, iterable);
        return collection;
    }

    public String toString() {
        return this.asMap().toString();
    }

    public Iterator valueIterator() {
        return Maps.valueIterator(this.entries().iterator());
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            this.values = collection = this.createValues();
        }
        return collection;
    }
}

