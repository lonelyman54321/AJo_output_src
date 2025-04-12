/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import java.io.Serializable;

class ImmutableSet$SerializedForm
implements Serializable {
    private static final long serialVersionUID;
    final Object[] elements;

    public ImmutableSet$SerializedForm(Object[] objectArray) {
        this.elements = objectArray;
    }

    public Object readResolve() {
        return ImmutableSet.copyOf(this.elements);
    }
}

