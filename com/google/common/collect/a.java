/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.FilteredEntryMultimap$Keys$1;
import java.util.Map;

public final class a
implements Predicate {
    public final /* synthetic */ Predicate a;

    public /* synthetic */ a(Predicate predicate) {
        this.a = predicate;
    }

    public final boolean apply(Object object) {
        Predicate predicate = this.a;
        object = (Map.Entry)object;
        return FilteredEntryMultimap$Keys$1.a(predicate, (Map.Entry)object);
    }
}

