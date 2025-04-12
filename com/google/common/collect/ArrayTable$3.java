/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ArrayTable;

class ArrayTable$3
extends AbstractIndexedListIterator {
    final /* synthetic */ ArrayTable this$0;

    public ArrayTable$3(ArrayTable arrayTable, int n3) {
        this.this$0 = arrayTable;
        super(n3);
    }

    public Object get(int n3) {
        return ArrayTable.access$800(this.this$0, n3);
    }
}

