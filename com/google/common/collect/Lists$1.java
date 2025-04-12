/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Lists$RandomAccessListWrapper;
import java.util.List;
import java.util.ListIterator;

class Lists$1
extends Lists$RandomAccessListWrapper {
    private static final long serialVersionUID;

    public Lists$1(List list) {
        super(list);
    }

    public ListIterator listIterator(int n3) {
        return this.backingList.listIterator(n3);
    }
}

