/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.ImmutableMap;

final class DenseImmutableTable$Row
extends DenseImmutableTable$ImmutableArrayMap {
    private final int rowIndex;
    final /* synthetic */ DenseImmutableTable this$0;

    public DenseImmutableTable$Row(DenseImmutableTable denseImmutableTable, int n3) {
        this.this$0 = denseImmutableTable;
        int n4 = DenseImmutableTable.access$200(denseImmutableTable)[n3];
        super(n4);
        this.rowIndex = n3;
    }

    public Object getValue(int n3) {
        Object[][] objectArray = DenseImmutableTable.access$400(this.this$0);
        int n4 = this.rowIndex;
        return objectArray[n4][n3];
    }

    public boolean isPartialView() {
        return true;
    }

    public ImmutableMap keyToIndex() {
        return DenseImmutableTable.access$300(this.this$0);
    }
}

