/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multisets$AbstractEntry;
import com.google.common.collect.TreeMultiset;
import com.google.common.collect.TreeMultiset$AvlNode;

class TreeMultiset$1
extends Multisets$AbstractEntry {
    final /* synthetic */ TreeMultiset this$0;
    final /* synthetic */ TreeMultiset$AvlNode val$baseEntry;

    public TreeMultiset$1(TreeMultiset treeMultiset, TreeMultiset$AvlNode treeMultiset$AvlNode) {
        this.this$0 = treeMultiset;
        this.val$baseEntry = treeMultiset$AvlNode;
    }

    public int getCount() {
        Object object = this.val$baseEntry;
        int n3 = ((TreeMultiset$AvlNode)object).getCount();
        if (n3 == 0) {
            object = this.this$0;
            Object object2 = this.getElement();
            n3 = ((TreeMultiset)object).count(object2);
        }
        return n3;
    }

    public Object getElement() {
        return this.val$baseEntry.getElement();
    }
}

