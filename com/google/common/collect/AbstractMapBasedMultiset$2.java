/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.AbstractMapBasedMultiset$Itr;
import com.google.common.collect.Multiset$Entry;

class AbstractMapBasedMultiset$2
extends AbstractMapBasedMultiset$Itr {
    final /* synthetic */ AbstractMapBasedMultiset this$0;

    public AbstractMapBasedMultiset$2(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        this.this$0 = abstractMapBasedMultiset;
        super(abstractMapBasedMultiset);
    }

    public Multiset$Entry result(int n3) {
        return this.this$0.backingMap.getEntry(n3);
    }
}

