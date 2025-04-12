/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.FilteredEntryMultimap;

final class FilteredEntryMultimap$ValuePredicate
implements Predicate {
    private final Object key;
    final /* synthetic */ FilteredEntryMultimap this$0;

    public FilteredEntryMultimap$ValuePredicate(FilteredEntryMultimap filteredEntryMultimap, Object object) {
        this.this$0 = filteredEntryMultimap;
        this.key = object;
    }

    public boolean apply(Object object) {
        FilteredEntryMultimap filteredEntryMultimap = this.this$0;
        Object object2 = this.key;
        return FilteredEntryMultimap.access$000(filteredEntryMultimap, object2, object);
    }
}

