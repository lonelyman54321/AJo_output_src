/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.RegularContiguousSet;

class RegularContiguousSet$1
extends AbstractSequentialIterator {
    final Comparable last;
    final /* synthetic */ RegularContiguousSet this$0;

    public RegularContiguousSet$1(RegularContiguousSet object, Comparable comparable) {
        this.this$0 = object;
        super(comparable);
        this.last = object = ((RegularContiguousSet)object).last();
    }

    public Comparable computeNext(Comparable comparable) {
        Object object = this.last;
        boolean bl2 = RegularContiguousSet.access$000(comparable, (Comparable)object);
        if (bl2) {
            comparable = null;
        } else {
            object = this.this$0.domain;
            comparable = ((DiscreteDomain)object).next(comparable);
        }
        return comparable;
    }
}

