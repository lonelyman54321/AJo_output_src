/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps$Values;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class Maps$FilteredMapValues
extends Maps$Values {
    final Predicate predicate;
    final Map unfiltered;

    public Maps$FilteredMapValues(Map map2, Map map3, Predicate predicate) {
        super(map2);
        this.unfiltered = map3;
        this.predicate = predicate;
    }

    public boolean remove(Object object) {
        boolean bl2;
        Iterator iterator = this.unfiltered.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Map.Entry entry = iterator.next();
            boolean bl3 = predicate.apply(entry);
            if (!bl3 || !(bl2 = Objects.equal(entry = entry.getValue(), object))) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.unfiltered.entrySet().iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Map.Entry entry = iterator.next();
            boolean bl4 = predicate.apply(entry);
            if (!bl4 || !(bl2 = collection.contains(entry = entry.getValue()))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public boolean retainAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.unfiltered.entrySet().iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Predicate predicate = this.predicate;
            Map.Entry entry = iterator.next();
            boolean bl4 = predicate.apply(entry);
            if (!bl4 || (bl2 = collection.contains(entry = entry.getValue()))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public Object[] toArray() {
        return Lists.newArrayList(this.iterator()).toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return Lists.newArrayList(this.iterator()).toArray(objectArray);
    }
}

