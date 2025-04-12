/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Lists$AbstractListWrapper;
import java.util.List;
import java.util.ListIterator;

class Lists$2
extends Lists$AbstractListWrapper {
    private static final long serialVersionUID;

    public Lists$2(List list) {
        super(list);
    }

    public ListIterator listIterator(int n3) {
        return this.backingList.listIterator(n3);
    }
}

