/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets$PowerSet;
import com.google.common.collect.Sets$SubSet;
import java.util.Set;

class Sets$PowerSet$1
extends AbstractIndexedListIterator {
    final /* synthetic */ Sets$PowerSet this$0;

    public Sets$PowerSet$1(Sets$PowerSet sets$PowerSet, int n3) {
        this.this$0 = sets$PowerSet;
        super(n3);
    }

    public Set get(int n3) {
        ImmutableMap immutableMap = this.this$0.inputSet;
        Sets$SubSet sets$SubSet = new Sets$SubSet(immutableMap, n3);
        return sets$SubSet;
    }
}

