/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound;
import java.util.NavigableMap;

final class TreeRangeSet$Complement
extends TreeRangeSet {
    final /* synthetic */ TreeRangeSet this$0;

    public TreeRangeSet$Complement(TreeRangeSet object) {
        this.this$0 = object;
        object = ((TreeRangeSet)object).rangesByLowerBound;
        TreeRangeSet$ComplementRangesByLowerBound treeRangeSet$ComplementRangesByLowerBound = new TreeRangeSet$ComplementRangesByLowerBound((NavigableMap)object);
        super(treeRangeSet$ComplementRangesByLowerBound, null);
    }

    public void add(Range range) {
        this.this$0.remove(range);
    }

    public RangeSet complement() {
        return this.this$0;
    }

    public boolean contains(Comparable comparable) {
        return this.this$0.contains(comparable) ^ true;
    }

    public void remove(Range range) {
        this.this$0.add(range);
    }
}

