/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.UnmodifiableIterator;

class ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl
extends ImmutableMapEntrySet {
    final /* synthetic */ ImmutableMap$IteratorBasedImmutableMap this$0;

    public ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl(ImmutableMap$IteratorBasedImmutableMap immutableMap$IteratorBasedImmutableMap) {
        this.this$0 = immutableMap$IteratorBasedImmutableMap;
    }

    public UnmodifiableIterator iterator() {
        return this.this$0.entryIterator();
    }

    public ImmutableMap map() {
        return this.this$0;
    }
}

