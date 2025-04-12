/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$ElementSet;
import java.util.Iterator;

class AbstractMultiset$ElementSet
extends Multisets$ElementSet {
    final /* synthetic */ AbstractMultiset this$0;

    public AbstractMultiset$ElementSet(AbstractMultiset abstractMultiset) {
        this.this$0 = abstractMultiset;
    }

    public Iterator iterator() {
        return this.this$0.elementIterator();
    }

    public Multiset multiset() {
        return this.this$0;
    }
}

