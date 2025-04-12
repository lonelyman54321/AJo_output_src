/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table$Cell;

class ArrayTable$1
extends AbstractIndexedListIterator {
    final /* synthetic */ ArrayTable this$0;

    public ArrayTable$1(ArrayTable arrayTable, int n3) {
        this.this$0 = arrayTable;
        super(n3);
    }

    public Table$Cell get(int n3) {
        return ArrayTable.access$000(this.this$0, n3);
    }
}

