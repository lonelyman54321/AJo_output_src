/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.AbstractMapBasedMultiset$Itr;

class AbstractMapBasedMultiset$1
extends AbstractMapBasedMultiset$Itr {
    final /* synthetic */ AbstractMapBasedMultiset this$0;

    public AbstractMapBasedMultiset$1(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        this.this$0 = abstractMapBasedMultiset;
        super(abstractMapBasedMultiset);
    }

    public Object result(int n3) {
        return this.this$0.backingMap.getKey(n3);
    }
}

