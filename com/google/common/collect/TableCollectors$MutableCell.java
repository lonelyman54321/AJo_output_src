/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Tables$AbstractCell;
import java.util.function.BinaryOperator;

final class TableCollectors$MutableCell
extends Tables$AbstractCell {
    private final Object column;
    private final Object row;
    private Object value;

    public TableCollectors$MutableCell(Object object, Object object2, Object object3) {
        this.row = object = Preconditions.checkNotNull(object, "row");
        this.column = object = Preconditions.checkNotNull(object2, "column");
        this.value = object = Preconditions.checkNotNull(object3, "value");
    }

    public Object getColumnKey() {
        return this.column;
    }

    public Object getRowKey() {
        return this.row;
    }

    public Object getValue() {
        return this.value;
    }

    public void merge(Object object, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(object, "value");
        Object object2 = this.value;
        this.value = object = Preconditions.checkNotNull(fi3_2.a(binaryOperator, object2, object), "mergeFunction.apply");
    }
}

