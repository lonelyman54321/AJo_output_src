/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.ArrayTable$ArrayMap;

class ArrayTable$ArrayMap$1
extends AbstractMapEntry {
    final /* synthetic */ ArrayTable$ArrayMap this$0;
    final /* synthetic */ int val$index;

    public ArrayTable$ArrayMap$1(ArrayTable$ArrayMap arrayMap, int n3) {
        this.this$0 = arrayMap;
        this.val$index = n3;
    }

    public Object getKey() {
        ArrayTable$ArrayMap arrayTable$ArrayMap = this.this$0;
        int n3 = this.val$index;
        return arrayTable$ArrayMap.getKey(n3);
    }

    public Object getValue() {
        ArrayTable$ArrayMap arrayTable$ArrayMap = this.this$0;
        int n3 = this.val$index;
        return arrayTable$ArrayMap.getValue(n3);
    }

    public Object setValue(Object object) {
        ArrayTable$ArrayMap arrayTable$ArrayMap = this.this$0;
        int n3 = this.val$index;
        return arrayTable$ArrayMap.setValue(n3, object);
    }
}

