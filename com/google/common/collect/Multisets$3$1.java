/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets$3;
import java.util.Iterator;

class Multisets$3$1
extends AbstractIterator {
    final /* synthetic */ Multisets$3 this$0;
    final /* synthetic */ Iterator val$iterator1;
    final /* synthetic */ Iterator val$iterator2;

    public Multisets$3$1(Multisets$3 multisets$3, Iterator iterator, Iterator iterator2) {
        this.this$0 = multisets$3;
        this.val$iterator1 = iterator;
        this.val$iterator2 = iterator2;
    }

    public Multiset$Entry computeNext() {
        Object object = this.val$iterator1;
        int n3 = object.hasNext();
        if (n3 != 0) {
            object = (Multiset$Entry)this.val$iterator1.next();
            Object object2 = object.getElement();
            n3 = object.getCount();
            int n4 = this.this$0.val$multiset2.count(object2) + n3;
            return Multisets.immutableEntry(object2, n4);
        }
        while ((n3 = (object = this.val$iterator2).hasNext()) != 0) {
            Multiset multiset = this.this$0.val$multiset1;
            object = (Multiset$Entry)this.val$iterator2.next();
            Object object3 = object.getElement();
            boolean bl2 = multiset.contains(object3);
            if (bl2) continue;
            n3 = object.getCount();
            return Multisets.immutableEntry(object3, n3);
        }
        return (Multiset$Entry)this.endOfData();
    }
}

