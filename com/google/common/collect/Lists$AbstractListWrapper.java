/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

class Lists$AbstractListWrapper
extends AbstractList {
    final List backingList;

    public Lists$AbstractListWrapper(List list) {
        this.backingList = list = (List)Preconditions.checkNotNull(list);
    }

    public void add(int n3, Object object) {
        this.backingList.add(n3, object);
    }

    public boolean addAll(int n3, Collection collection) {
        return this.backingList.addAll(n3, collection);
    }

    public boolean contains(Object object) {
        return this.backingList.contains(object);
    }

    public Object get(int n3) {
        return this.backingList.get(n3);
    }

    public Object remove(int n3) {
        return this.backingList.remove(n3);
    }

    public Object set(int n3, Object object) {
        return this.backingList.set(n3, object);
    }

    public int size() {
        return this.backingList.size();
    }
}

