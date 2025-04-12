/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.io.Serializable;

class ImmutableRangeMap$1
extends ImmutableList {
    final /* synthetic */ ImmutableRangeMap this$0;
    final /* synthetic */ int val$len;
    final /* synthetic */ int val$off;
    final /* synthetic */ Range val$range;

    public ImmutableRangeMap$1(ImmutableRangeMap immutableRangeMap, int n3, int n4, Range range) {
        this.this$0 = immutableRangeMap;
        this.val$len = n3;
        this.val$off = n4;
        this.val$range = range;
    }

    public Range get(int n3) {
        int n4 = this.val$len;
        Preconditions.checkElementIndex(n3, n4);
        if (n3 != 0 && n3 != (n4 = this.val$len + -1)) {
            ImmutableList immutableList = ImmutableRangeMap.access$000(this.this$0);
            int n7 = this.val$off;
            return (Range)immutableList.get(n3 += n7);
        }
        Serializable serializable = ImmutableRangeMap.access$000(this.this$0);
        int n8 = this.val$off;
        Range range = (Range)serializable.get(n3 += n8);
        serializable = this.val$range;
        return range.intersection((Range)serializable);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.val$len;
    }
}

