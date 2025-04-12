/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FilteredEntryMultimap;
import com.google.common.collect.FilteredEntryMultimap$Keys;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets$EntrySet;
import com.google.common.collect.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class FilteredEntryMultimap$Keys$1
extends Multisets$EntrySet {
    final /* synthetic */ FilteredEntryMultimap$Keys this$1;

    public FilteredEntryMultimap$Keys$1(FilteredEntryMultimap$Keys keys) {
        this.this$1 = keys;
    }

    public static /* synthetic */ boolean a(Predicate predicate, Map.Entry entry) {
        return FilteredEntryMultimap$Keys$1.lambda$removeEntriesIf$0(predicate, entry);
    }

    private static /* synthetic */ boolean lambda$removeEntriesIf$0(Predicate predicate, Map.Entry object) {
        Object k2 = object.getKey();
        int n3 = ((Collection)object.getValue()).size();
        object = Multisets.immutableEntry(k2, n3);
        return predicate.apply(object);
    }

    private boolean removeEntriesIf(Predicate predicate) {
        FilteredEntryMultimap filteredEntryMultimap = this.this$1.this$0;
        a a2 = new a(predicate);
        return filteredEntryMultimap.removeEntriesIf(a2);
    }

    public Iterator iterator() {
        return this.this$1.entryIterator();
    }

    public Multiset multiset() {
        return this.this$1;
    }

    public boolean removeAll(Collection object) {
        object = Predicates.in((Collection)object);
        return this.removeEntriesIf((Predicate)object);
    }

    public boolean retainAll(Collection object) {
        object = Predicates.not(Predicates.in((Collection)object));
        return this.removeEntriesIf((Predicate)object);
    }

    public int size() {
        return this.this$1.this$0.keySet().size();
    }
}

