/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$FilteredMapValues;
import com.google.common.collect.Maps$ViewCachingAbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class Maps$AbstractFilteredMap
extends Maps$ViewCachingAbstractMap {
    final Predicate predicate;
    final Map unfiltered;

    public Maps$AbstractFilteredMap(Map map2, Predicate predicate) {
        this.unfiltered = map2;
        this.predicate = predicate;
    }

    public boolean apply(Object object, Object object2) {
        Predicate predicate = this.predicate;
        object = Maps.immutableEntry(object, object2);
        return predicate.apply(object);
    }

    public boolean containsKey(Object object) {
        boolean bl2;
        Map map2 = this.unfiltered;
        boolean bl3 = map2.containsKey(object);
        if (bl3 && (bl2 = this.apply(object, map2 = this.unfiltered.get(object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Collection createValues() {
        Map map2 = this.unfiltered;
        Predicate predicate = this.predicate;
        Maps$FilteredMapValues maps$FilteredMapValues = new Maps$FilteredMapValues(this, map2, predicate);
        return maps$FilteredMapValues;
    }

    public Object get(Object object) {
        boolean bl2;
        Object v4 = this.unfiltered.get(object);
        if (v4 == null || !(bl2 = this.apply(object, v4))) {
            v4 = null;
        }
        return v4;
    }

    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }

    public Object put(Object object, Object object2) {
        Preconditions.checkArgument(this.apply(object, object2));
        return this.unfiltered.put(object, object2);
    }

    public void putAll(Map map2) {
        boolean bl2;
        Iterator iterator = map2.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            bl2 = this.apply(k2, entry);
            Preconditions.checkArgument(bl2);
        }
        this.unfiltered.putAll(map2);
    }

    public Object remove(Object object) {
        boolean bl2 = this.containsKey(object);
        if (bl2) {
            Map map2 = this.unfiltered;
            object = map2.remove(object);
        } else {
            object = null;
        }
        return object;
    }
}

