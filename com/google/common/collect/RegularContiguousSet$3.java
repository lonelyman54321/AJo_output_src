/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableAsList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.RegularContiguousSet;

class RegularContiguousSet$3
extends ImmutableAsList {
    final /* synthetic */ RegularContiguousSet this$0;

    public RegularContiguousSet$3(RegularContiguousSet regularContiguousSet) {
        this.this$0 = regularContiguousSet;
    }

    public ImmutableSortedSet delegateCollection() {
        return this.this$0;
    }

    public Comparable get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        Object object = this.this$0;
        DiscreteDomain discreteDomain = ((ContiguousSet)object).domain;
        object = ((RegularContiguousSet)object).first();
        long l2 = n3;
        return discreteDomain.offset((Comparable)object, l2);
    }
}

