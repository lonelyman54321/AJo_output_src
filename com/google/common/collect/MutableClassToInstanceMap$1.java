/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Map;

class MutableClassToInstanceMap$1
extends ForwardingMapEntry {
    final /* synthetic */ Map.Entry val$entry;

    public MutableClassToInstanceMap$1(Map.Entry entry) {
        this.val$entry = entry;
    }

    public Map.Entry delegate() {
        return this.val$entry;
    }

    public Object setValue(Object object) {
        MutableClassToInstanceMap.access$000((Class)this.getKey(), object);
        return super.setValue(object);
    }
}

