/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.ArrayTable$ArrayMap;
import com.google.common.collect.ImmutableMap;

class ArrayTable$Row
extends ArrayTable$ArrayMap {
    final int rowIndex;
    final /* synthetic */ ArrayTable this$0;

    public ArrayTable$Row(ArrayTable serializable, int n3) {
        this.this$0 = serializable;
        serializable = ArrayTable.access$600(serializable);
        super((ImmutableMap)serializable, null);
        this.rowIndex = n3;
    }

    public String getKeyRole() {
        return "Column";
    }

    public Object getValue(int n3) {
        ArrayTable arrayTable = this.this$0;
        int n4 = this.rowIndex;
        return arrayTable.at(n4, n3);
    }

    public Object setValue(int n3, Object object) {
        ArrayTable arrayTable = this.this$0;
        int n4 = this.rowIndex;
        return arrayTable.set(n4, n3, object);
    }
}

