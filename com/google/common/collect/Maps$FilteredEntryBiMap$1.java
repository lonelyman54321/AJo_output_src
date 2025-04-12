/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

class Maps$FilteredEntryBiMap$1
implements Predicate {
    final /* synthetic */ Predicate val$forwardPredicate;

    public Maps$FilteredEntryBiMap$1(Predicate predicate) {
        this.val$forwardPredicate = predicate;
    }

    public boolean apply(Map.Entry entry) {
        Predicate predicate = this.val$forwardPredicate;
        Object v4 = entry.getValue();
        entry = entry.getKey();
        entry = Maps.immutableEntry(v4, entry);
        return predicate.apply(entry);
    }
}

