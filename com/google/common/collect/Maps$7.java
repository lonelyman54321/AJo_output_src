/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;
import java.util.Map;

class Maps$7
extends AbstractMapEntry {
    final /* synthetic */ Map.Entry val$entry;

    public Maps$7(Map.Entry entry) {
        this.val$entry = entry;
    }

    public Object getKey() {
        return this.val$entry.getKey();
    }

    public Object getValue() {
        return this.val$entry.getValue();
    }
}

