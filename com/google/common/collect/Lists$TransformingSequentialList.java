/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists$TransformingSequentialList$1;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

class Lists$TransformingSequentialList
extends AbstractSequentialList
implements Serializable {
    private static final long serialVersionUID;
    final List fromList;
    final Function function;

    public Lists$TransformingSequentialList(List object, Function function) {
        object = (List)Preconditions.checkNotNull(object);
        this.fromList = object;
        this.function = object = (Function)Preconditions.checkNotNull(function);
    }

    public ListIterator listIterator(int n3) {
        ListIterator listIterator = this.fromList.listIterator(n3);
        Lists$TransformingSequentialList$1 lists$TransformingSequentialList$1 = new Lists$TransformingSequentialList$1(this, listIterator);
        return lists$TransformingSequentialList$1;
    }

    public void removeRange(int n3, int n4) {
        this.fromList.subList(n3, n4).clear();
    }

    public int size() {
        return this.fromList.size();
    }
}

