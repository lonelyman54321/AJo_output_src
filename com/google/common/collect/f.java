/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Maps$EntryTransformer;
import com.google.common.collect.Multimaps$TransformedEntriesMultimap;
import java.util.Collection;

public final class f
implements Maps$EntryTransformer {
    public final /* synthetic */ Multimaps$TransformedEntriesMultimap a;

    public /* synthetic */ f(Multimaps$TransformedEntriesMultimap multimaps$TransformedEntriesMultimap) {
        this.a = multimaps$TransformedEntriesMultimap;
    }

    public final Object transformEntry(Object object, Object object2) {
        Multimaps$TransformedEntriesMultimap multimaps$TransformedEntriesMultimap = this.a;
        object2 = (Collection)object2;
        return Multimaps$TransformedEntriesMultimap.a(multimaps$TransformedEntriesMultimap, object, (Collection)object2);
    }
}

