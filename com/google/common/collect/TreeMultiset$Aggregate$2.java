/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TreeMultiset$Aggregate;
import com.google.common.collect.TreeMultiset$AvlNode;

final class TreeMultiset$Aggregate$2
extends TreeMultiset$Aggregate {
    public int nodeAggregate(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        return 1;
    }

    public long treeAggregate(TreeMultiset$AvlNode treeMultiset$AvlNode) {
        long l2;
        if (treeMultiset$AvlNode == null) {
            l2 = 0L;
        } else {
            int n3 = TreeMultiset$AvlNode.access$400(treeMultiset$AvlNode);
            l2 = n3;
        }
        return l2;
    }
}

