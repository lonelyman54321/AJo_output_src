/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps$EntryTransformer;
import java.util.Map;

class Maps$11
implements Function {
    final /* synthetic */ Maps$EntryTransformer val$transformer;

    public Maps$11(Maps$EntryTransformer maps$EntryTransformer) {
        this.val$transformer = maps$EntryTransformer;
    }

    public Object apply(Map.Entry entry) {
        Maps$EntryTransformer maps$EntryTransformer = this.val$transformer;
        Object k2 = entry.getKey();
        entry = entry.getValue();
        return maps$EntryTransformer.transformEntry(k2, entry);
    }
}

