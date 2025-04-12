/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.ImmutableList;

class ImmutableList$Itr
extends AbstractIndexedListIterator {
    private final ImmutableList list;

    public ImmutableList$Itr(ImmutableList immutableList, int n3) {
        int n4 = immutableList.size();
        super(n4, n3);
        this.list = immutableList;
    }

    public Object get(int n3) {
        return this.list.get(n3);
    }
}

