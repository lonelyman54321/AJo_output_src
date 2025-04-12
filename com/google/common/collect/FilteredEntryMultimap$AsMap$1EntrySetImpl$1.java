/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.FilteredEntryMultimap;
import com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl;
import com.google.common.collect.FilteredEntryMultimap$ValuePredicate;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class FilteredEntryMultimap$AsMap$1EntrySetImpl$1
extends AbstractIterator {
    final Iterator backingIterator;
    final /* synthetic */ FilteredEntryMultimap$AsMap$1EntrySetImpl this$2;

    public FilteredEntryMultimap$AsMap$1EntrySetImpl$1(FilteredEntryMultimap$AsMap$1EntrySetImpl object) {
        this.this$2 = object;
        this.backingIterator = object = ((FilteredEntryMultimap$AsMap$1EntrySetImpl)object).this$1.this$0.unfiltered.asMap().entrySet().iterator();
    }

    public Map.Entry computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.backingIterator).hasNext()) {
            object = (Map.Entry)this.backingIterator.next();
            Object k2 = object.getKey();
            object = (Collection)object.getValue();
            FilteredEntryMultimap filteredEntryMultimap = this.this$2.this$1.this$0;
            FilteredEntryMultimap$ValuePredicate filteredEntryMultimap$ValuePredicate = new FilteredEntryMultimap$ValuePredicate(filteredEntryMultimap, k2);
            boolean bl3 = (object = FilteredEntryMultimap.filterCollection((Collection)object, filteredEntryMultimap$ValuePredicate)).isEmpty();
            if (bl3) continue;
            return Maps.immutableEntry(k2, object);
        }
        return (Map.Entry)this.endOfData();
    }
}

