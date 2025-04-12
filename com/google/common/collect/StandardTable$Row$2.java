/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.StandardTable$Row;
import java.util.Map;

class StandardTable$Row$2
extends ForwardingMapEntry {
    final /* synthetic */ Map.Entry val$entry;

    public StandardTable$Row$2(StandardTable$Row standardTable$Row, Map.Entry entry) {
        this.val$entry = entry;
    }

    public Map.Entry delegate() {
        return this.val$entry;
    }

    public boolean equals(Object object) {
        return this.standardEquals(object);
    }

    public Object setValue(Object object) {
        object = Preconditions.checkNotNull(object);
        return super.setValue(object);
    }
}

