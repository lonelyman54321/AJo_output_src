/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap$Builder;
import com.google.common.collect.ImmutableMap$SerializedForm;

class ImmutableBiMap$SerializedForm
extends ImmutableMap$SerializedForm {
    private static final long serialVersionUID;

    public ImmutableBiMap$SerializedForm(ImmutableBiMap immutableBiMap) {
        super(immutableBiMap);
    }

    public ImmutableBiMap$Builder makeBuilder(int n3) {
        ImmutableBiMap$Builder immutableBiMap$Builder = new ImmutableBiMap$Builder(n3);
        return immutableBiMap$Builder;
    }
}

