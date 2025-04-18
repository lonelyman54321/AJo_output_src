/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.AbstractMultimap$Entries;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$EntryTransformer;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Multimaps$TransformedEntriesMultimap
extends AbstractMultimap {
    final Multimap fromMultimap;
    final Maps$EntryTransformer transformer;

    public Multimaps$TransformedEntriesMultimap(Multimap object, Maps$EntryTransformer maps$EntryTransformer) {
        object = (Multimap)Preconditions.checkNotNull(object);
        this.fromMultimap = object;
        this.transformer = object = (Maps$EntryTransformer)Preconditions.checkNotNull(maps$EntryTransformer);
    }

    public static /* synthetic */ Collection a(Multimaps$TransformedEntriesMultimap multimaps$TransformedEntriesMultimap, Object object, Collection collection) {
        return multimaps$TransformedEntriesMultimap.lambda$createAsMap$0(object, collection);
    }

    private /* synthetic */ Collection lambda$createAsMap$0(Object object, Collection collection) {
        return this.transform(object, collection);
    }

    public void clear() {
        this.fromMultimap.clear();
    }

    public boolean containsKey(Object object) {
        return this.fromMultimap.containsKey(object);
    }

    public Map createAsMap() {
        Map map2 = this.fromMultimap.asMap();
        f f5 = new f(this);
        return Maps.transformEntries(map2, (Maps$EntryTransformer)f5);
    }

    public Collection createEntries() {
        AbstractMultimap$Entries abstractMultimap$Entries = new AbstractMultimap$Entries(this);
        return abstractMultimap$Entries;
    }

    public Set createKeySet() {
        return this.fromMultimap.keySet();
    }

    public Multiset createKeys() {
        return this.fromMultimap.keys();
    }

    public Collection createValues() {
        Collection collection = this.fromMultimap.entries();
        Function function = Maps.asEntryToValueFunction(this.transformer);
        return Collections2.transform(collection, function);
    }

    public Iterator entryIterator() {
        Iterator iterator = this.fromMultimap.entries().iterator();
        Function function = Maps.asEntryToEntryFunction(this.transformer);
        return Iterators.transform(iterator, function);
    }

    public Collection get(Object object) {
        Collection collection = this.fromMultimap.get(object);
        return this.transform(object, collection);
    }

    public boolean isEmpty() {
        return this.fromMultimap.isEmpty();
    }

    public boolean put(Object object, Object object2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public boolean putAll(Multimap object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public boolean putAll(Object object, Iterable iterable) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public boolean remove(Object object, Object object2) {
        return this.get(object).remove(object2);
    }

    public Collection removeAll(Object object) {
        Collection collection = this.fromMultimap.removeAll(object);
        return this.transform(object, collection);
    }

    public Collection replaceValues(Object object, Iterable iterable) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public int size() {
        return this.fromMultimap.size();
    }

    public Collection transform(Object object, Collection collection) {
        Maps$EntryTransformer maps$EntryTransformer = this.transformer;
        object = Maps.asValueToValueFunction(maps$EntryTransformer, object);
        boolean bl2 = collection instanceof List;
        if (bl2) {
            return Lists.transform((List)collection, (Function)object);
        }
        return Collections2.transform(collection, (Function)object);
    }
}

