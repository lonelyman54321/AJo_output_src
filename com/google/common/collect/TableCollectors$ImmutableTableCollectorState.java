/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableCollectors$1;
import com.google.common.collect.TableCollectors$MutableCell;
import java.io.Serializable;
import java.util.List;
import java.util.function.BinaryOperator;

final class TableCollectors$ImmutableTableCollectorState {
    final List insertionOrder;
    final Table table;

    private TableCollectors$ImmutableTableCollectorState() {
        Serializable serializable;
        this.insertionOrder = serializable = new Serializable();
        serializable = HashBasedTable.create();
        this.table = serializable;
    }

    public /* synthetic */ TableCollectors$ImmutableTableCollectorState(TableCollectors$1 tableCollectors$1) {
        this();
    }

    public TableCollectors$ImmutableTableCollectorState combine(TableCollectors$ImmutableTableCollectorState object, BinaryOperator binaryOperator) {
        boolean bl2;
        object = ((TableCollectors$ImmutableTableCollectorState)object).insertionOrder.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (TableCollectors$MutableCell)object.next();
            Object object3 = ((TableCollectors$MutableCell)object2).getRowKey();
            Object object4 = ((TableCollectors$MutableCell)object2).getColumnKey();
            object2 = ((TableCollectors$MutableCell)object2).getValue();
            this.put(object3, object4, object2, binaryOperator);
        }
        return this;
    }

    public void put(Object object, Object object2, Object object3, BinaryOperator object4) {
        TableCollectors$MutableCell tableCollectors$MutableCell = (TableCollectors$MutableCell)this.table.get(object, object2);
        if (tableCollectors$MutableCell == null) {
            object4 = new TableCollectors$MutableCell(object, object2, object3);
            this.insertionOrder.add(object4);
            object3 = this.table;
            object3.put(object, object2, object4);
        } else {
            tableCollectors$MutableCell.merge(object3, (BinaryOperator)object4);
        }
    }

    public ImmutableTable toTable() {
        return ImmutableTable.copyOf(this.insertionOrder);
    }
}

