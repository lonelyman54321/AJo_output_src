/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterators;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$1;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.Tables;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class StandardTable$CellIterator
implements Iterator {
    Iterator columnIterator;
    Map.Entry rowEntry;
    final Iterator rowIterator;
    final /* synthetic */ StandardTable this$0;

    private StandardTable$CellIterator(StandardTable object) {
        this.this$0 = object;
        this.rowIterator = object = ((StandardTable)object).backingMap.entrySet().iterator();
        this.columnIterator = object = Iterators.emptyModifiableIterator();
    }

    public /* synthetic */ StandardTable$CellIterator(StandardTable standardTable, StandardTable$1 standardTable$1) {
        this(standardTable);
    }

    public boolean hasNext() {
        Iterator iterator = this.rowIterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2 && !(bl2 = (iterator = this.columnIterator).hasNext())) {
            bl2 = false;
            iterator = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Table$Cell next() {
        Iterator iterator = this.columnIterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            iterator = (Map.Entry)this.rowIterator.next();
            this.rowEntry = iterator;
            this.columnIterator = iterator = ((Map)iterator.getValue()).entrySet().iterator();
        }
        Objects.requireNonNull(this.rowEntry);
        iterator = (Map.Entry)this.columnIterator.next();
        Object k2 = this.rowEntry.getKey();
        Object k3 = iterator.getKey();
        iterator = iterator.getValue();
        return Tables.immutableCell(k2, k3, iterator);
    }

    public void remove() {
        this.columnIterator.remove();
        Object object = this.rowEntry;
        Objects.requireNonNull(object);
        object = (Map)object.getValue();
        boolean bl2 = object.isEmpty();
        if (bl2) {
            this.rowIterator.remove();
            bl2 = false;
            object = null;
            this.rowEntry = null;
        }
    }
}

