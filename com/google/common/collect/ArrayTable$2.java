/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Tables$AbstractCell;

class ArrayTable$2
extends Tables$AbstractCell {
    final int columnIndex;
    final int rowIndex;
    final /* synthetic */ ArrayTable this$0;
    final /* synthetic */ int val$index;

    public ArrayTable$2(ArrayTable arrayTable, int n3) {
        this.this$0 = arrayTable;
        this.val$index = n3;
        int n4 = ArrayTable.access$100(arrayTable).size();
        this.rowIndex = n4 = n3 / n4;
        int n7 = ArrayTable.access$100(arrayTable).size();
        this.columnIndex = n3 %= n7;
    }

    public Object getColumnKey() {
        ImmutableList immutableList = ArrayTable.access$100(this.this$0);
        int n3 = this.columnIndex;
        return immutableList.get(n3);
    }

    public Object getRowKey() {
        ImmutableList immutableList = ArrayTable.access$200(this.this$0);
        int n3 = this.rowIndex;
        return immutableList.get(n3);
    }

    public Object getValue() {
        ArrayTable arrayTable = this.this$0;
        int n3 = this.rowIndex;
        int n4 = this.columnIndex;
        return arrayTable.at(n3, n4);
    }
}

