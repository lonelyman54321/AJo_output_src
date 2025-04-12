/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultimap;
import java.io.Serializable;

final class ImmutableMultimap$KeysSerializedForm
implements Serializable {
    final ImmutableMultimap multimap;

    public ImmutableMultimap$KeysSerializedForm(ImmutableMultimap immutableMultimap) {
        this.multimap = immutableMultimap;
    }

    public Object readResolve() {
        return this.multimap.keys();
    }
}

