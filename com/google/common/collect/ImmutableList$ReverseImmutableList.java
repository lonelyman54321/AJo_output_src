/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

class ImmutableList$ReverseImmutableList
extends ImmutableList {
    private final transient ImmutableList forwardList;

    public ImmutableList$ReverseImmutableList(ImmutableList immutableList) {
        this.forwardList = immutableList;
    }

    private int reverseIndex(int n3) {
        return this.size() + -1 - n3;
    }

    private int reversePosition(int n3) {
        return this.size() - n3;
    }

    public boolean contains(Object object) {
        return this.forwardList.contains(object);
    }

    public Object get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        ImmutableList immutableList = this.forwardList;
        n3 = this.reverseIndex(n3);
        return immutableList.get(n3);
    }

    public int indexOf(Object object) {
        ImmutableList immutableList = this.forwardList;
        int n3 = immutableList.lastIndexOf(object);
        n3 = n3 >= 0 ? this.reverseIndex(n3) : -1;
        return n3;
    }

    public boolean isPartialView() {
        return this.forwardList.isPartialView();
    }

    public int lastIndexOf(Object object) {
        ImmutableList immutableList = this.forwardList;
        int n3 = immutableList.indexOf(object);
        n3 = n3 >= 0 ? this.reverseIndex(n3) : -1;
        return n3;
    }

    public ImmutableList reverse() {
        return this.forwardList;
    }

    public int size() {
        return this.forwardList.size();
    }

    public ImmutableList subList(int n3, int n4) {
        int n7 = this.size();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        ImmutableList immutableList = this.forwardList;
        n4 = this.reversePosition(n4);
        n3 = this.reversePosition(n3);
        return immutableList.subList(n4, n3).reverse();
    }
}

