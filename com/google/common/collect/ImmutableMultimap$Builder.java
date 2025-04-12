/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.google.common.collect.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class ImmutableMultimap$Builder {
    final Map builderMap;
    Comparator keyComparator;
    Comparator valueComparator;

    public ImmutableMultimap$Builder() {
        Map map2;
        this.builderMap = map2 = Platform.preservesInsertionOrderOnPutsMap();
    }

    public ImmutableMultimap build() {
        Collection collection = this.builderMap.entrySet();
        Comparator comparator = this.keyComparator;
        if (comparator != null) {
            comparator = Ordering.from(comparator).onKeys();
            collection = ((Ordering)comparator).immutableSortedCopy(collection);
        }
        comparator = this.valueComparator;
        return ImmutableListMultimap.fromMapEntries(collection, comparator);
    }

    public ImmutableMultimap$Builder combine(ImmutableMultimap$Builder object) {
        boolean bl2;
        object = ((ImmutableMultimap$Builder)object).builderMap.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object k2 = object2.getKey();
            object2 = (Iterable)object2.getValue();
            this.putAll(k2, (Iterable)object2);
        }
        return this;
    }

    public Collection newMutableValueCollection() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public ImmutableMultimap$Builder orderKeysBy(Comparator comparator) {
        this.keyComparator = comparator = (Comparator)Preconditions.checkNotNull(comparator);
        return this;
    }

    public ImmutableMultimap$Builder orderValuesBy(Comparator comparator) {
        this.valueComparator = comparator = (Comparator)Preconditions.checkNotNull(comparator);
        return this;
    }

    public ImmutableMultimap$Builder put(Object object, Object object2) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        Object object3 = (Collection)this.builderMap.get(object);
        if (object3 == null) {
            object3 = this.builderMap;
            Collection collection = this.newMutableValueCollection();
            object3.put(object, collection);
            object3 = collection;
        }
        object3.add(object2);
        return this;
    }

    public ImmutableMultimap$Builder put(Map.Entry entry) {
        Object k2 = entry.getKey();
        entry = entry.getValue();
        return this.put(k2, entry);
    }

    public ImmutableMultimap$Builder putAll(Multimap object) {
        boolean bl2;
        object = object.asMap().entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object k2 = object2.getKey();
            object2 = (Iterable)object2.getValue();
            this.putAll(k2, (Iterable)object2);
        }
        return this;
    }

    public ImmutableMultimap$Builder putAll(Iterable object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            this.put(entry);
        }
        return this;
    }

    public ImmutableMultimap$Builder putAll(Object object, Iterable object2) {
        if (object != null) {
            boolean bl2;
            Collection collection = (Collection)this.builderMap.get(object);
            if (collection != null) {
                boolean bl3;
                object2 = object2.iterator();
                while (bl3 = object2.hasNext()) {
                    Object t3 = object2.next();
                    CollectPreconditions.checkEntryNotNull(object, t3);
                    collection.add(t3);
                }
                return this;
            }
            boolean bl4 = (object2 = object2.iterator()).hasNext();
            if (!bl4) {
                return this;
            }
            collection = this.newMutableValueCollection();
            while (bl2 = object2.hasNext()) {
                Object e2 = object2.next();
                CollectPreconditions.checkEntryNotNull(object, e2);
                collection.add(e2);
            }
            this.builderMap.put(object, collection);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("null key in entry: null=");
        object2 = Iterables.toString((Iterable)object2);
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        object = new NullPointerException((String)object2);
        throw object;
    }

    public ImmutableMultimap$Builder putAll(Object object, Object ... object2) {
        object2 = Arrays.asList(object2);
        return this.putAll(object, (Iterable)object2);
    }
}

