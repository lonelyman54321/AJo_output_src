/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.collect.ImmutableSortedSet;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;

public final class ImmutableSortedSet$Builder
extends ImmutableSet$Builder {
    private final Comparator comparator;

    public ImmutableSortedSet$Builder(Comparator comparator) {
        this.comparator = comparator = (Comparator)Preconditions.checkNotNull(comparator);
    }

    public ImmutableSortedSet$Builder add(Object object) {
        super.add(object);
        return this;
    }

    public ImmutableSortedSet$Builder add(Object ... objectArray) {
        super.add(objectArray);
        return this;
    }

    public ImmutableSortedSet$Builder addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public ImmutableSortedSet$Builder addAll(Iterator iterator) {
        super.addAll(iterator);
        return this;
    }

    public ImmutableSortedSet build() {
        int n3;
        Object object = this.contents;
        Comparator comparator = this.comparator;
        int n4 = this.size;
        object = ImmutableSortedSet.construct(comparator, n4, (Object[])object);
        this.size = n3 = ((AbstractCollection)object).size();
        this.forceCopy = true;
        return object;
    }

    public ImmutableSortedSet$Builder combine(ImmutableSet$Builder immutableSet$Builder) {
        super.combine(immutableSet$Builder);
        return this;
    }
}

