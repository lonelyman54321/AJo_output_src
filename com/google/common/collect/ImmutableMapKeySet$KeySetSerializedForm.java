/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;

class ImmutableMapKeySet$KeySetSerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final ImmutableMap map;

    public ImmutableMapKeySet$KeySetSerializedForm(ImmutableMap immutableMap) {
        this.map = immutableMap;
    }

    public Object readResolve() {
        return this.map.keySet();
    }
}

