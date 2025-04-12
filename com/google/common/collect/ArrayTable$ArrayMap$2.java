/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ArrayTable$ArrayMap;
import java.util.Map;

class ArrayTable$ArrayMap$2
extends AbstractIndexedListIterator {
    final /* synthetic */ ArrayTable$ArrayMap this$0;

    public ArrayTable$ArrayMap$2(ArrayTable$ArrayMap arrayTable$ArrayMap, int n3) {
        this.this$0 = arrayTable$ArrayMap;
        super(n3);
    }

    public Map.Entry get(int n3) {
        return this.this$0.getEntry(n3);
    }
}

