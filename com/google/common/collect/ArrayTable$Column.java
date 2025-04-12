/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.ArrayTable$ArrayMap;
import com.google.common.collect.ImmutableMap;

class ArrayTable$Column
extends ArrayTable$ArrayMap {
    final int columnIndex;
    final /* synthetic */ ArrayTable this$0;

    public ArrayTable$Column(ArrayTable serializable, int n3) {
        this.this$0 = serializable;
        serializable = ArrayTable.access$300(serializable);
        super((ImmutableMap)serializable, null);
        this.columnIndex = n3;
    }

    public String getKeyRole() {
        return "Row";
    }

    public Object getValue(int n3) {
        ArrayTable arrayTable = this.this$0;
        int n4 = this.columnIndex;
        return arrayTable.at(n3, n4);
    }

    public Object setValue(int n3, Object object) {
        ArrayTable arrayTable = this.this$0;
        int n4 = this.columnIndex;
        return arrayTable.set(n3, n4, object);
    }
}

