/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.StandardTable$Row;
import java.util.Iterator;
import java.util.Map;

class StandardTable$Row$1
implements Iterator {
    final /* synthetic */ StandardTable$Row this$1;
    final /* synthetic */ Iterator val$iterator;

    public StandardTable$Row$1(StandardTable$Row row, Iterator iterator) {
        this.this$1 = row;
        this.val$iterator = iterator;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public Map.Entry next() {
        StandardTable$Row standardTable$Row = this.this$1;
        Map.Entry entry = (Map.Entry)this.val$iterator.next();
        return standardTable$Row.wrapEntry(entry);
    }

    public void remove() {
        this.val$iterator.remove();
        this.this$1.maintainEmptyInvariant();
    }
}

