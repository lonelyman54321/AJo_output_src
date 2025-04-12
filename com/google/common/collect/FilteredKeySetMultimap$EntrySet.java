/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FilteredKeyMultimap$Entries;
import com.google.common.collect.FilteredKeySetMultimap;
import com.google.common.collect.Sets;
import java.util.Set;

class FilteredKeySetMultimap$EntrySet
extends FilteredKeyMultimap$Entries
implements Set {
    public FilteredKeySetMultimap$EntrySet(FilteredKeySetMultimap filteredKeySetMultimap) {
        super(filteredKeySetMultimap);
    }

    public boolean equals(Object object) {
        return Sets.equalsImpl(this, object);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }
}

