/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import java.io.Serializable;

class ImmutableMultiset$EntrySetSerializedForm
implements Serializable {
    final ImmutableMultiset multiset;

    public ImmutableMultiset$EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
        this.multiset = immutableMultiset;
    }

    public Object readResolve() {
        return this.multiset.entrySet();
    }
}

