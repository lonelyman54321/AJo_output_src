/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractTable;
import java.util.AbstractCollection;
import java.util.Iterator;

class AbstractTable$Values
extends AbstractCollection {
    final /* synthetic */ AbstractTable this$0;

    public AbstractTable$Values(AbstractTable abstractTable) {
        this.this$0 = abstractTable;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object object) {
        return this.this$0.containsValue(object);
    }

    public Iterator iterator() {
        return this.this$0.valuesIterator();
    }

    public int size() {
        return this.this$0.size();
    }
}

