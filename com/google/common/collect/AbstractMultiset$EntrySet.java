/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$EntrySet;
import java.util.Iterator;

class AbstractMultiset$EntrySet
extends Multisets$EntrySet {
    final /* synthetic */ AbstractMultiset this$0;

    public AbstractMultiset$EntrySet(AbstractMultiset abstractMultiset) {
        this.this$0 = abstractMultiset;
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public Multiset multiset() {
        return this.this$0;
    }

    public int size() {
        return this.this$0.distinctElements();
    }
}

