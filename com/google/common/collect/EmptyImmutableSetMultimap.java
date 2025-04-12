/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;

class EmptyImmutableSetMultimap
extends ImmutableSetMultimap {
    static final EmptyImmutableSetMultimap INSTANCE;
    private static final long serialVersionUID;

    static {
        EmptyImmutableSetMultimap emptyImmutableSetMultimap;
        INSTANCE = emptyImmutableSetMultimap = new EmptyImmutableSetMultimap();
    }

    private EmptyImmutableSetMultimap() {
        ImmutableMap immutableMap = ImmutableMap.of();
        super(immutableMap, 0, null);
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public ImmutableMap asMap() {
        return super.asMap();
    }
}

