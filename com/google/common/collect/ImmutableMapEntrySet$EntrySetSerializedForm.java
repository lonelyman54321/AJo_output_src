/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;

class ImmutableMapEntrySet$EntrySetSerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final ImmutableMap map;

    public ImmutableMapEntrySet$EntrySetSerializedForm(ImmutableMap immutableMap) {
        this.map = immutableMap;
    }

    public Object readResolve() {
        return this.map.entrySet();
    }
}

