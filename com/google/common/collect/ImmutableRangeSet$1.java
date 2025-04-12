/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.io.Serializable;

class ImmutableRangeSet$1
extends ImmutableList {
    final /* synthetic */ ImmutableRangeSet this$0;
    final /* synthetic */ int val$fromIndex;
    final /* synthetic */ int val$length;
    final /* synthetic */ Range val$range;

    public ImmutableRangeSet$1(ImmutableRangeSet immutableRangeSet, int n3, int n4, Range range) {
        this.this$0 = immutableRangeSet;
        this.val$length = n3;
        this.val$fromIndex = n4;
        this.val$range = range;
    }

    public Range get(int n3) {
        int n4 = this.val$length;
        Preconditions.checkElementIndex(n3, n4);
        if (n3 != 0 && n3 != (n4 = this.val$length + -1)) {
            ImmutableList immutableList = ImmutableRangeSet.access$000(this.this$0);
            int n7 = this.val$fromIndex;
            return (Range)immutableList.get(n3 += n7);
        }
        Serializable serializable = ImmutableRangeSet.access$000(this.this$0);
        int n8 = this.val$fromIndex;
        Range range = (Range)serializable.get(n3 += n8);
        serializable = this.val$range;
        return range.intersection((Range)serializable);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.val$length;
    }
}

