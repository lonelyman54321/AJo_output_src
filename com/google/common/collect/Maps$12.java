/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.Maps$EntryTransformer;
import java.util.Map;

class Maps$12
extends AbstractMapEntry {
    final /* synthetic */ Map.Entry val$entry;
    final /* synthetic */ Maps$EntryTransformer val$transformer;

    public Maps$12(Map.Entry entry, Maps$EntryTransformer maps$EntryTransformer) {
        this.val$entry = entry;
        this.val$transformer = maps$EntryTransformer;
    }

    public Object getKey() {
        return this.val$entry.getKey();
    }

    public Object getValue() {
        Maps$EntryTransformer maps$EntryTransformer = this.val$transformer;
        Object k2 = this.val$entry.getKey();
        Object v4 = this.val$entry.getValue();
        return maps$EntryTransformer.transformEntry(k2, v4);
    }
}

