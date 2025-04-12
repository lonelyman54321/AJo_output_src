/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TreeMultiset$1;
import com.google.common.collect.TreeMultiset$Aggregate$1;
import com.google.common.collect.TreeMultiset$Aggregate$2;
import com.google.common.collect.TreeMultiset$AvlNode;

abstract class TreeMultiset$Aggregate
extends Enum {
    private static final /* synthetic */ TreeMultiset$Aggregate[] $VALUES;
    public static final /* enum */ TreeMultiset$Aggregate DISTINCT;
    public static final /* enum */ TreeMultiset$Aggregate SIZE;

    private static /* synthetic */ TreeMultiset$Aggregate[] $values() {
        TreeMultiset$Aggregate treeMultiset$Aggregate = SIZE;
        treeMultiset$Aggregate = DISTINCT;
        TreeMultiset$Aggregate[] treeMultiset$AggregateArray = new TreeMultiset$Aggregate[]{treeMultiset$Aggregate, treeMultiset$Aggregate};
        return treeMultiset$AggregateArray;
    }

    static {
        TreeMultiset$Aggregate treeMultiset$Aggregate = new TreeMultiset$Aggregate$1();
        SIZE = treeMultiset$Aggregate;
        treeMultiset$Aggregate = new TreeMultiset$Aggregate$2();
        DISTINCT = treeMultiset$Aggregate;
        $VALUES = TreeMultiset$Aggregate.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TreeMultiset$Aggregate() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ TreeMultiset$Aggregate(TreeMultiset.1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static TreeMultiset$Aggregate valueOf(String string2) {
        return Enum.valueOf(TreeMultiset$Aggregate.class, string2);
    }

    public static TreeMultiset$Aggregate[] values() {
        return (TreeMultiset$Aggregate[])$VALUES.clone();
    }

    public abstract int nodeAggregate(TreeMultiset$AvlNode var1);

    public abstract long treeAggregate(TreeMultiset$AvlNode var1);
}

