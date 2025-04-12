/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.ImmutableMap;

final class DenseImmutableTable$Column
extends DenseImmutableTable$ImmutableArrayMap {
    private final int columnIndex;
    final /* synthetic */ DenseImmutableTable this$0;

    public DenseImmutableTable$Column(DenseImmutableTable denseImmutableTable, int n3) {
        this.this$0 = denseImmutableTable;
        int n4 = DenseImmutableTable.access$500(denseImmutableTable)[n3];
        super(n4);
        this.columnIndex = n3;
    }

    public Object getValue(int n3) {
        Object[] objectArray = DenseImmutableTable.access$400(this.this$0)[n3];
        int n4 = this.columnIndex;
        return objectArray[n4];
    }

    public boolean isPartialView() {
        return true;
    }

    public ImmutableMap keyToIndex() {
        return DenseImmutableTable.access$600(this.this$0);
    }
}

