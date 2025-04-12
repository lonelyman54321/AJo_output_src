/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeRangeSet;
import java.util.Collection;
import java.util.Set;

final class TreeRangeSet$AsRanges
extends ForwardingCollection
implements Set {
    final Collection delegate;

    public TreeRangeSet$AsRanges(TreeRangeSet treeRangeSet, Collection collection) {
        this.delegate = collection;
    }

    public Collection delegate() {
        return this.delegate;
    }

    public boolean equals(Object object) {
        return Sets.equalsImpl(this, object);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }
}

