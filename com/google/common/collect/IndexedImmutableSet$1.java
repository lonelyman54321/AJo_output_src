/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.IndexedImmutableSet;

class IndexedImmutableSet$1
extends ImmutableList {
    final /* synthetic */ IndexedImmutableSet this$0;

    public IndexedImmutableSet$1(IndexedImmutableSet indexedImmutableSet) {
        this.this$0 = indexedImmutableSet;
    }

    public Object get(int n3) {
        return this.this$0.get(n3);
    }

    public boolean isPartialView() {
        return this.this$0.isPartialView();
    }

    public int size() {
        return this.this$0.size();
    }
}

