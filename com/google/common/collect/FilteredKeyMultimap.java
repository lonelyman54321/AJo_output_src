/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.FilteredKeyMultimap$AddRejectingList;
import com.google.common.collect.FilteredKeyMultimap$AddRejectingSet;
import com.google.common.collect.FilteredKeyMultimap$Entries;
import com.google.common.collect.FilteredMultimap;
import com.google.common.collect.FilteredMultimapValues;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class FilteredKeyMultimap
extends AbstractMultimap
implements FilteredMultimap {
    final Predicate keyPredicate;
    final Multimap unfiltered;

    public FilteredKeyMultimap(Multimap object, Predicate predicate) {
        object = (Multimap)Preconditions.checkNotNull(object);
        this.unfiltered = object;
        this.keyPredicate = object = (Predicate)Preconditions.checkNotNull(predicate);
    }

    public void clear() {
        this.keySet().clear();
    }

    public boolean containsKey(Object object) {
        Multimap multimap = this.unfiltered;
        boolean bl2 = multimap.containsKey(object);
        if (bl2) {
            return this.keyPredicate.apply(object);
        }
        return false;
    }

    public Map createAsMap() {
        Map map2 = this.unfiltered.asMap();
        Predicate predicate = this.keyPredicate;
        return Maps.filterKeys(map2, predicate);
    }

    public Collection createEntries() {
        FilteredKeyMultimap$Entries filteredKeyMultimap$Entries = new FilteredKeyMultimap$Entries(this);
        return filteredKeyMultimap$Entries;
    }

    public Set createKeySet() {
        Set set = this.unfiltered.keySet();
        Predicate predicate = this.keyPredicate;
        return Sets.filter(set, predicate);
    }

    public Multiset createKeys() {
        Multiset multiset = this.unfiltered.keys();
        Predicate predicate = this.keyPredicate;
        return Multisets.filter(multiset, predicate);
    }

    public Collection createValues() {
        FilteredMultimapValues filteredMultimapValues = new FilteredMultimapValues(this);
        return filteredMultimapValues;
    }

    public Iterator entryIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Predicate entryPredicate() {
        return Maps.keyPredicateOnEntries(this.keyPredicate);
    }

    public Collection get(Object object) {
        Object object2 = this.keyPredicate;
        boolean bl2 = object2.apply(object);
        if (bl2) {
            return this.unfiltered.get(object);
        }
        object2 = this.unfiltered;
        bl2 = object2 instanceof SetMultimap;
        if (bl2) {
            object2 = new FilteredKeyMultimap$AddRejectingSet(object);
            return object2;
        }
        object2 = new FilteredKeyMultimap$AddRejectingList(object);
        return object2;
    }

    public Collection removeAll(Object object) {
        boolean bl2 = this.containsKey(object);
        if (bl2) {
            Multimap multimap = this.unfiltered;
            object = multimap.removeAll(object);
        } else {
            object = this.unmodifiableEmptyCollection();
        }
        return object;
    }

    public int size() {
        int n3;
        Iterator iterator = this.asMap().values().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Collection collection = (Collection)iterator.next();
            n3 = collection.size();
            n4 += n3;
        }
        return n4;
    }

    public Multimap unfiltered() {
        return this.unfiltered;
    }

    public Collection unmodifiableEmptyCollection() {
        Multimap multimap = this.unfiltered;
        boolean bl2 = multimap instanceof SetMultimap;
        if (bl2) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }
}

