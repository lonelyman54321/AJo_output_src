/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractTable;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;

class AbstractTable$1
extends TransformedIterator {
    public AbstractTable$1(AbstractTable abstractTable, Iterator iterator) {
        super(iterator);
    }

    public Object transform(Table$Cell table$Cell) {
        return table$Cell.getValue();
    }
}

