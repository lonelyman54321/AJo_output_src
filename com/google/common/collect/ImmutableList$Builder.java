/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection$ArrayBasedBuilder;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public final class ImmutableList$Builder
extends ImmutableCollection$ArrayBasedBuilder {
    public ImmutableList$Builder() {
        this(4);
    }

    public ImmutableList$Builder(int n3) {
        super(n3);
    }

    public ImmutableList$Builder add(Object object) {
        super.add(object);
        return this;
    }

    public ImmutableList$Builder add(Object ... objectArray) {
        super.add(objectArray);
        return this;
    }

    public ImmutableList$Builder addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public ImmutableList$Builder addAll(Iterator iterator) {
        super.addAll(iterator);
        return this;
    }

    public ImmutableList build() {
        this.forceCopy = true;
        Object[] objectArray = this.contents;
        int n3 = this.size;
        return ImmutableList.asImmutableList(objectArray, n3);
    }

    public ImmutableList$Builder combine(ImmutableList$Builder immutableList$Builder) {
        Object[] objectArray = immutableList$Builder.contents;
        int n3 = immutableList$Builder.size;
        this.addAll(objectArray, n3);
        return this;
    }
}

