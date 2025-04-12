/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets$2;
import java.util.Iterator;

class Multisets$2$1
extends AbstractIterator {
    final /* synthetic */ Multisets$2 this$0;
    final /* synthetic */ Iterator val$iterator1;

    public Multisets$2$1(Multisets$2 multisets$2, Iterator iterator) {
        this.this$0 = multisets$2;
        this.val$iterator1 = iterator;
    }

    public Multiset$Entry computeNext() {
        Object object;
        int n3;
        while ((n3 = (object = this.val$iterator1).hasNext()) != 0) {
            object = (Multiset$Entry)this.val$iterator1.next();
            Object object2 = object.getElement();
            n3 = object.getCount();
            Multiset multiset = this.this$0.val$multiset2;
            int n4 = multiset.count(object2);
            if ((n3 = Math.min(n3, n4)) <= 0) continue;
            return Multisets.immutableEntry(object2, n3);
        }
        return (Multiset$Entry)this.endOfData();
    }
}

