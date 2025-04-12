/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists$TransformingRandomAccessList$1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

class Lists$TransformingRandomAccessList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final List fromList;
    final Function function;

    public Lists$TransformingRandomAccessList(List object, Function function) {
        object = (List)Preconditions.checkNotNull(object);
        this.fromList = object;
        this.function = object = (Function)Preconditions.checkNotNull(function);
    }

    public Object get(int n3) {
        Function function = this.function;
        Object e2 = this.fromList.get(n3);
        return function.apply(e2);
    }

    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    public Iterator iterator() {
        return this.listIterator();
    }

    public ListIterator listIterator(int n3) {
        ListIterator listIterator = this.fromList.listIterator(n3);
        Lists$TransformingRandomAccessList$1 lists$TransformingRandomAccessList$1 = new Lists$TransformingRandomAccessList$1(this, listIterator);
        return lists$TransformingRandomAccessList$1;
    }

    public Object remove(int n3) {
        Function function = this.function;
        Object e2 = this.fromList.remove(n3);
        return function.apply(e2);
    }

    public void removeRange(int n3, int n4) {
        this.fromList.subList(n3, n4).clear();
    }

    public int size() {
        return this.fromList.size();
    }
}

