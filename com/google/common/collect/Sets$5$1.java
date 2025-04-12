/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Sets$5;
import com.google.common.collect.Sets$5$1$1;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Set;

class Sets$5$1
extends AbstractIterator {
    final BitSet bits;
    final /* synthetic */ Sets$5 this$0;

    public Sets$5$1(Sets$5 sets$5) {
        BitSet bitSet;
        this.this$0 = sets$5;
        int n3 = sets$5.val$index.size();
        this.bits = bitSet = new BitSet(n3);
    }

    public Set computeNext() {
        BitSet bitSet = this.bits;
        int n3 = bitSet.isEmpty();
        Object object = null;
        if (n3 != 0) {
            bitSet = this.bits;
            Sets$5 sets$5 = this.this$0;
            int n4 = sets$5.val$size;
            bitSet.set(0, n4);
        } else {
            Serializable serializable;
            int n7;
            BitSet bitSet2 = this.bits;
            bitSet = this.bits;
            n3 = bitSet.nextSetBit(0);
            int n8 = bitSet2.nextClearBit(n3);
            if (n8 == (n7 = (serializable = this.this$0.val$index).size())) {
                return (Set)this.endOfData();
            }
            serializable = this.bits;
            n3 = n8 - n3 + -1;
            ((BitSet)serializable).set(0, n3);
            object = this.bits;
            ((BitSet)object).clear(n3, n8);
            bitSet = this.bits;
            bitSet.set(n8);
        }
        bitSet = (BitSet)this.bits.clone();
        object = new Sets$5$1$1(this, bitSet);
        return object;
    }
}

