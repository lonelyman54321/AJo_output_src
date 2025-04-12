/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.TreeBasedTable;
import java.util.Comparator;
import java.util.Iterator;

class TreeBasedTable$1
extends AbstractIterator {
    Object lastValue;
    final /* synthetic */ Comparator val$comparator;
    final /* synthetic */ Iterator val$merged;

    public TreeBasedTable$1(TreeBasedTable treeBasedTable, Iterator iterator, Comparator comparator) {
        this.val$merged = iterator;
        this.val$comparator = comparator;
    }

    public Object computeNext() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.val$merged).hasNext()) {
            Comparator comparator;
            int n3;
            iterator = this.val$merged.next();
            Object object = this.lastValue;
            if (object != null && (n3 = (comparator = this.val$comparator).compare(iterator, object)) == 0) continue;
            this.lastValue = iterator;
            return iterator;
        }
        this.lastValue = null;
        return this.endOfData();
    }
}

