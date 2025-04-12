/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableRangeSet$Builder {
    private final List ranges;

    public ImmutableRangeSet$Builder() {
        ArrayList arrayList = Lists.newArrayList();
        this.ranges = arrayList;
    }

    public ImmutableRangeSet$Builder add(Range range) {
        Preconditions.checkArgument(range.isEmpty() ^ true, "range must not be empty, but was %s", (Object)range);
        this.ranges.add(range);
        return this;
    }

    public ImmutableRangeSet$Builder addAll(RangeSet object) {
        object = object.asRanges();
        return this.addAll((Iterable)object);
    }

    public ImmutableRangeSet$Builder addAll(Iterable object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Range range = (Range)object.next();
            this.add(range);
        }
        return this;
    }

    public ImmutableRangeSet build() {
        int n3;
        int n4 = this.ranges.size();
        Object object = new ImmutableList$Builder(n4);
        Object object2 = this.ranges;
        Object object3 = Range.rangeLexOrdering();
        Collections.sort(object2, object3);
        object2 = Iterators.peekingIterator(this.ranges.iterator());
        while ((n3 = object2.hasNext()) != 0) {
            Range range;
            boolean bl2;
            boolean bl3;
            object3 = (Range)object2.next();
            while ((bl3 = object2.hasNext()) && (bl2 = ((Range)object3).isConnected(range = (Range)object2.peek()))) {
                Range range2 = ((Range)object3).intersection(range);
                bl2 = range2.isEmpty();
                String string2 = "Overlapping ranges not permitted but found %s overlapping %s";
                Preconditions.checkArgument(bl2, string2, object3, (Object)range);
                range = (Range)object2.next();
                object3 = ((Range)object3).span(range);
            }
            ((ImmutableList$Builder)object).add(object3);
        }
        n4 = (int)(((AbstractCollection)(object = ((ImmutableList$Builder)object).build())).isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return ImmutableRangeSet.of();
        }
        n4 = ((AbstractCollection)object).size();
        if (n4 == (n3 = 1) && (n4 = (int)(((Range)(object2 = (Range)Iterables.getOnlyElement((Iterable)object))).equals(object3 = Range.all()) ? 1 : 0)) != 0) {
            return ImmutableRangeSet.all();
        }
        object2 = new ImmutableRangeSet((ImmutableList)object);
        return object2;
    }

    public ImmutableRangeSet$Builder combine(ImmutableRangeSet$Builder object) {
        object = ((ImmutableRangeSet$Builder)object).ranges;
        this.addAll((Iterable)object);
        return this;
    }
}

