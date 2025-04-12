/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.ArrayTable$1;
import com.google.common.collect.ArrayTable$ArrayMap;
import com.google.common.collect.ArrayTable$Column;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

class ArrayTable$ColumnMap
extends ArrayTable$ArrayMap {
    final /* synthetic */ ArrayTable this$0;

    private ArrayTable$ColumnMap(ArrayTable serializable) {
        this.this$0 = serializable;
        serializable = ArrayTable.access$600(serializable);
        super((ImmutableMap)serializable, null);
    }

    public /* synthetic */ ArrayTable$ColumnMap(ArrayTable arrayTable, ArrayTable$1 arrayTable$1) {
        this(arrayTable);
    }

    public String getKeyRole() {
        return "Column";
    }

    public Map getValue(int n3) {
        ArrayTable arrayTable = this.this$0;
        ArrayTable$Column arrayTable$Column = new ArrayTable$Column(arrayTable, n3);
        return arrayTable$Column;
    }

    public Map put(Object object, Map map2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Map setValue(int n3, Map map2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

