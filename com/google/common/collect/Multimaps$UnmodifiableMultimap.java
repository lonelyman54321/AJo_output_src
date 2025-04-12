/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.g;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class Multimaps$UnmodifiableMultimap
extends ForwardingMultimap
implements Serializable {
    private static final long serialVersionUID;
    final Multimap delegate;
    transient Collection entries;
    transient Set keySet;
    transient Multiset keys;
    transient Map map;
    transient Collection values;

    public Multimaps$UnmodifiableMultimap(Multimap multimap) {
        this.delegate = multimap = (Multimap)Preconditions.checkNotNull(multimap);
    }

    public static /* synthetic */ Collection a(Collection collection) {
        return Multimaps$UnmodifiableMultimap.lambda$asMap$0(collection);
    }

    private static /* synthetic */ Collection lambda$asMap$0(Collection collection) {
        return Multimaps.access$100(collection);
    }

    public Map asMap() {
        Map map2 = this.map;
        if (map2 == null) {
            map2 = this.delegate.asMap();
            g g3 = new Object();
            this.map = map2 = Collections.unmodifiableMap(Maps.transformValues(map2, (Function)g3));
        }
        return map2;
    }

    public void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public Multimap delegate() {
        return this.delegate;
    }

    public Collection entries() {
        Collection collection = this.entries;
        if (collection == null) {
            this.entries = collection = Multimaps.access$000(this.delegate.entries());
        }
        return collection;
    }

    public Collection get(Object object) {
        return Multimaps.access$100(this.delegate.get(object));
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            this.keySet = set = Collections.unmodifiableSet(this.delegate.keySet());
        }
        return set;
    }

    public Multiset keys() {
        Multiset multiset = this.keys;
        if (multiset == null) {
            this.keys = multiset = Multisets.unmodifiableMultiset(this.delegate.keys());
        }
        return multiset;
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
        object = new UnsupportedOperationException();
        throw object;
    }

    public Collection removeAll(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Collection replaceValues(Object object, Iterable iterable) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            this.values = collection = Collections.unmodifiableCollection(this.delegate.values());
        }
        return collection;
    }
}

