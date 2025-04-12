/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Cut;
import com.google.common.collect.Maps;
import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

class TreeRangeSet$SubRangeSetRangesByLowerBound$2
extends AbstractIterator {
    final /* synthetic */ TreeRangeSet$SubRangeSetRangesByLowerBound this$0;
    final /* synthetic */ Iterator val$completeRangeItr;

    public TreeRangeSet$SubRangeSetRangesByLowerBound$2(TreeRangeSet$SubRangeSetRangesByLowerBound treeRangeSet$SubRangeSetRangesByLowerBound, Iterator iterator) {
        this.this$0 = treeRangeSet$SubRangeSetRangesByLowerBound;
        this.val$completeRangeItr = iterator;
    }

    public Map.Entry computeNext() {
        Object object = this.val$completeRangeItr;
        boolean bl2 = object.hasNext();
        if (!bl2) {
            return (Map.Entry)this.endOfData();
        }
        object = (Range)this.val$completeRangeItr.next();
        Serializable serializable = TreeRangeSet$SubRangeSetRangesByLowerBound.access$300((TreeRangeSet$SubRangeSetRangesByLowerBound)this.this$0).lowerBound;
        Cut cut = ((Range)object).upperBound;
        int n3 = ((Cut)serializable).compareTo(cut);
        if (n3 >= 0) {
            return (Map.Entry)this.endOfData();
        }
        serializable = TreeRangeSet$SubRangeSetRangesByLowerBound.access$300(this.this$0);
        object = ((Range)object).intersection((Range)serializable);
        serializable = TreeRangeSet$SubRangeSetRangesByLowerBound.access$400(this.this$0);
        n3 = (int)(((Range)serializable).contains(cut = ((Range)object).lowerBound) ? 1 : 0);
        if (n3 != 0) {
            return Maps.immutableEntry(((Range)object).lowerBound, object);
        }
        return (Map.Entry)this.endOfData();
    }
}

