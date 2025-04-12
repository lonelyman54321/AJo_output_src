/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractCollection;
import java.util.Iterator;

class CompactHashMap$ValuesView
extends AbstractCollection {
    final /* synthetic */ CompactHashMap this$0;

    public CompactHashMap$ValuesView(CompactHashMap compactHashMap) {
        this.this$0 = compactHashMap;
    }

    public void clear() {
        this.this$0.clear();
    }

    public Iterator iterator() {
        return this.this$0.valuesIterator();
    }

    public int size() {
        return this.this$0.size();
    }
}

