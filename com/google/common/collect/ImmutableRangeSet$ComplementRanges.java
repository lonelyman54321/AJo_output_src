/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.util.AbstractCollection;

final class ImmutableRangeSet$ComplementRanges
extends ImmutableList {
    private final boolean positiveBoundedAbove;
    private final boolean positiveBoundedBelow;
    private final int size;
    final /* synthetic */ ImmutableRangeSet this$0;

    public ImmutableRangeSet$ComplementRanges(ImmutableRangeSet serializable) {
        boolean bl2;
        boolean bl3;
        this.this$0 = serializable;
        Range range = (Range)ImmutableRangeSet.access$000((ImmutableRangeSet)serializable).get(0);
        this.positiveBoundedBelow = bl3 = range.hasLowerBound();
        Range range2 = (Range)Iterables.getLast(ImmutableRangeSet.access$000((ImmutableRangeSet)serializable));
        this.positiveBoundedAbove = bl2 = range2.hasUpperBound();
        serializable = ImmutableRangeSet.access$000((ImmutableRangeSet)serializable);
        int n3 = ((AbstractCollection)((Object)serializable)).size();
        int n4 = n3 + -1;
        if (!bl3) {
            n3 = n4;
        }
        if (bl2) {
            ++n3;
        }
        this.size = n3;
    }

    public Range get(int n3) {
        Cut cut;
        int n4;
        Serializable serializable;
        int n7 = this.size;
        Preconditions.checkElementIndex(n3, n7);
        n7 = (int)(this.positiveBoundedBelow ? 1 : 0);
        if (n7 != 0) {
            if (n3 == 0) {
                serializable = Cut.belowAll();
            } else {
                serializable = ImmutableRangeSet.access$000(this.this$0);
                n4 = n3 + -1;
                serializable = ((Range)serializable.get((int)n4)).upperBound;
            }
        } else {
            serializable = ((Range)ImmutableRangeSet.access$000((ImmutableRangeSet)this.this$0).get((int)n3)).upperBound;
        }
        n4 = this.positiveBoundedAbove;
        if (n4 != 0 && n3 == (n4 = this.size + -1)) {
            cut = Cut.aboveAll();
        } else {
            ImmutableList immutableList = ImmutableRangeSet.access$000(this.this$0);
            int n8 = this.positiveBoundedBelow ^ 1;
            cut = ((Range)immutableList.get((int)(n3 += n8))).lowerBound;
        }
        return Range.create((Cut)serializable, cut);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.size;
    }
}

