/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Sets$5$1$1;
import java.io.Serializable;
import java.util.BitSet;

class Sets$5$1$1$1
extends AbstractIterator {
    int i = -1;
    final /* synthetic */ Sets$5$1$1 this$2;

    public Sets$5$1$1$1(Sets$5$1$1 sets$5$1$1) {
        this.this$2 = sets$5$1$1;
    }

    public Object computeNext() {
        int n3;
        Serializable serializable = this.this$2.val$copy;
        int n4 = this.i + 1;
        this.i = n3 = ((BitSet)serializable).nextSetBit(n4);
        n4 = -1;
        if (n3 == n4) {
            return this.endOfData();
        }
        serializable = this.this$2.this$1.this$0.val$index.keySet().asList();
        n4 = this.i;
        return serializable.get(n4);
    }
}

