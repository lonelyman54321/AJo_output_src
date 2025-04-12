/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$SerializedForm;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap$Builder;
import java.util.Comparator;

class ImmutableSortedMap$SerializedForm
extends ImmutableMap$SerializedForm {
    private static final long serialVersionUID;
    private final Comparator comparator;

    public ImmutableSortedMap$SerializedForm(ImmutableSortedMap object) {
        super((ImmutableMap)object);
        this.comparator = object = ((ImmutableSortedMap)object).comparator();
    }

    public ImmutableSortedMap$Builder makeBuilder(int n3) {
        Comparator comparator = this.comparator;
        ImmutableSortedMap$Builder immutableSortedMap$Builder = new ImmutableSortedMap$Builder(comparator);
        return immutableSortedMap$Builder;
    }
}

