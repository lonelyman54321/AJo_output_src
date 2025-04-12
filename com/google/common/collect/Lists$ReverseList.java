/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Lists$ReverseList$1;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Lists$ReverseList
extends AbstractList {
    private final List forwardList;

    public Lists$ReverseList(List list) {
        this.forwardList = list = (List)Preconditions.checkNotNull(list);
    }

    public static /* synthetic */ int access$000(Lists$ReverseList lists$ReverseList, int n3) {
        return lists$ReverseList.reversePosition(n3);
    }

    private int reverseIndex(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        return n4 + -1 - n3;
    }

    private int reversePosition(int n3) {
        int n4 = this.size();
        Preconditions.checkPositionIndex(n3, n4);
        return n4 - n3;
    }

    public void add(int n3, Object object) {
        List list = this.forwardList;
        n3 = this.reversePosition(n3);
        list.add(n3, object);
    }

    public void clear() {
        this.forwardList.clear();
    }

    public Object get(int n3) {
        List list = this.forwardList;
        n3 = this.reverseIndex(n3);
        return list.get(n3);
    }

    public List getForwardList() {
        return this.forwardList;
    }

    public Iterator iterator() {
        return this.listIterator();
    }

    public ListIterator listIterator(int n3) {
        n3 = this.reversePosition(n3);
        ListIterator listIterator = this.forwardList.listIterator(n3);
        Lists$ReverseList$1 lists$ReverseList$1 = new Lists$ReverseList$1(this, listIterator);
        return lists$ReverseList$1;
    }

    public Object remove(int n3) {
        List list = this.forwardList;
        n3 = this.reverseIndex(n3);
        return list.remove(n3);
    }

    public void removeRange(int n3, int n4) {
        this.subList(n3, n4).clear();
    }

    public Object set(int n3, Object object) {
        List list = this.forwardList;
        n3 = this.reverseIndex(n3);
        return list.set(n3, object);
    }

    public int size() {
        return this.forwardList.size();
    }

    public List subList(int n3, int n4) {
        int n7 = this.size();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        List list = this.forwardList;
        n4 = this.reversePosition(n4);
        n3 = this.reversePosition(n3);
        return Lists.reverse(list.subList(n4, n3));
    }
}

