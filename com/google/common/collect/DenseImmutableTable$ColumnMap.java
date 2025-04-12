/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.DenseImmutableTable$1;
import com.google.common.collect.DenseImmutableTable$Column;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.ImmutableMap;

final class DenseImmutableTable$ColumnMap
extends DenseImmutableTable$ImmutableArrayMap {
    final /* synthetic */ DenseImmutableTable this$0;

    private DenseImmutableTable$ColumnMap(DenseImmutableTable denseImmutableTable) {
        this.this$0 = denseImmutableTable;
        int n3 = DenseImmutableTable.access$500(denseImmutableTable).length;
        super(n3);
    }

    public /* synthetic */ DenseImmutableTable$ColumnMap(DenseImmutableTable denseImmutableTable, DenseImmutableTable$1 denseImmutableTable$1) {
        this(denseImmutableTable);
    }

    public ImmutableMap getValue(int n3) {
        DenseImmutableTable denseImmutableTable = this.this$0;
        DenseImmutableTable$Column denseImmutableTable$Column = new DenseImmutableTable$Column(denseImmutableTable, n3);
        return denseImmutableTable$Column;
    }

    public boolean isPartialView() {
        return false;
    }

    public ImmutableMap keyToIndex() {
        return DenseImmutableTable.access$300(this.this$0);
    }
}

