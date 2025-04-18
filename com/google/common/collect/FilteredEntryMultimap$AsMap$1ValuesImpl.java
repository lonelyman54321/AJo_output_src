/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FilteredEntryMultimap;
import com.google.common.collect.FilteredEntryMultimap$AsMap;
import com.google.common.collect.FilteredEntryMultimap$ValuePredicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$Values;
import java.util.Collection;
import java.util.Iterator;

class FilteredEntryMultimap$AsMap$1ValuesImpl
extends Maps$Values {
    final /* synthetic */ FilteredEntryMultimap$AsMap this$1;

    public FilteredEntryMultimap$AsMap$1ValuesImpl(FilteredEntryMultimap$AsMap filteredEntryMultimap$AsMap) {
        this.this$1 = filteredEntryMultimap$AsMap;
        super(filteredEntryMultimap$AsMap);
    }

    public boolean remove(Object object) {
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            int n3;
            object = (Collection)object;
            Iterator iterator = this.this$1.this$0.unfiltered.asMap().entrySet().iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                FilteredEntryMultimap filteredEntryMultimap;
                FilteredEntryMultimap$ValuePredicate filteredEntryMultimap$ValuePredicate;
                Object object2 = iterator.next();
                Object object3 = object2.getKey();
                Collection collection = (Collection)object2.getValue();
                object3 = FilteredEntryMultimap.filterCollection(collection, filteredEntryMultimap$ValuePredicate = new FilteredEntryMultimap$ValuePredicate(filteredEntryMultimap = this.this$1.this$0, object3));
                boolean bl3 = object3.isEmpty();
                if (bl3 || !(bl3 = object.equals(object3))) continue;
                int n4 = object3.size();
                if (n4 == (n3 = (object2 = (Collection)object2.getValue()).size())) {
                    iterator.remove();
                } else {
                    object3.clear();
                }
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection object) {
        FilteredEntryMultimap filteredEntryMultimap = this.this$1.this$0;
        object = Maps.valuePredicateOnEntries(Predicates.in((Collection)object));
        return filteredEntryMultimap.removeEntriesIf((Predicate)object);
    }

    public boolean retainAll(Collection object) {
        FilteredEntryMultimap filteredEntryMultimap = this.this$1.this$0;
        object = Maps.valuePredicateOnEntries(Predicates.not(Predicates.in((Collection)object)));
        return filteredEntryMultimap.removeEntriesIf((Predicate)object);
    }
}

