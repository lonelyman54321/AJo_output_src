/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.MultiEdgesConnecting;
import java.util.Iterator;
import java.util.Map;

class MultiEdgesConnecting$1
extends AbstractIterator {
    final /* synthetic */ MultiEdgesConnecting this$0;
    final /* synthetic */ Iterator val$entries;

    public MultiEdgesConnecting$1(MultiEdgesConnecting multiEdgesConnecting, Iterator iterator) {
        this.this$0 = multiEdgesConnecting;
        this.val$entries = iterator;
    }

    public Object computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.val$entries).hasNext()) {
            Object v4;
            object = (Map.Entry)this.val$entries.next();
            Object object2 = MultiEdgesConnecting.access$000(this.this$0);
            boolean bl3 = object2.equals(v4 = object.getValue());
            if (!bl3) continue;
            return object.getKey();
        }
        return this.endOfData();
    }
}

