/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.FilteredEntryMultimap;
import com.google.common.collect.FilteredEntryMultimap$Keys$1;
import com.google.common.collect.Multimaps$Keys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class FilteredEntryMultimap$Keys
extends Multimaps$Keys {
    final /* synthetic */ FilteredEntryMultimap this$0;

    public FilteredEntryMultimap$Keys(FilteredEntryMultimap filteredEntryMultimap) {
        this.this$0 = filteredEntryMultimap;
        super(filteredEntryMultimap);
    }

    public Set entrySet() {
        FilteredEntryMultimap$Keys$1 filteredEntryMultimap$Keys$1 = new FilteredEntryMultimap$Keys$1(this);
        return filteredEntryMultimap$Keys$1;
    }

    public int remove(Object object, int n3) {
        boolean bl2;
        Iterator iterator = "occurrences";
        CollectPreconditions.checkNonnegative(n3, (String)((Object)iterator));
        if (n3 == 0) {
            return this.count(object);
        }
        iterator = (Collection)this.this$0.unfiltered.asMap().get(object);
        int n4 = 0;
        if (iterator == null) {
            return 0;
        }
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            FilteredEntryMultimap filteredEntryMultimap = this.this$0;
            Object e2 = iterator.next();
            bl2 = FilteredEntryMultimap.access$000(filteredEntryMultimap, object, e2);
            if (!bl2 || ++n4 > n3) continue;
            iterator.remove();
        }
        return n4;
    }
}

