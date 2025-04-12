/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.Traverser$1;
import com.google.common.graph.Traverser$InsertionOrder$1;
import com.google.common.graph.Traverser$InsertionOrder$2;
import java.util.Deque;

abstract class Traverser$InsertionOrder
extends Enum {
    private static final /* synthetic */ Traverser$InsertionOrder[] $VALUES;
    public static final /* enum */ Traverser$InsertionOrder BACK;
    public static final /* enum */ Traverser$InsertionOrder FRONT;

    private static /* synthetic */ Traverser$InsertionOrder[] $values() {
        Traverser$InsertionOrder traverser$InsertionOrder = FRONT;
        traverser$InsertionOrder = BACK;
        Traverser$InsertionOrder[] traverser$InsertionOrderArray = new Traverser$InsertionOrder[]{traverser$InsertionOrder, traverser$InsertionOrder};
        return traverser$InsertionOrderArray;
    }

    static {
        Traverser$InsertionOrder traverser$InsertionOrder = new Traverser$InsertionOrder$1();
        FRONT = traverser$InsertionOrder;
        traverser$InsertionOrder = new Traverser$InsertionOrder$2();
        BACK = traverser$InsertionOrder;
        $VALUES = Traverser$InsertionOrder.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Traverser$InsertionOrder() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Traverser$InsertionOrder(Traverser.1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Traverser$InsertionOrder valueOf(String string2) {
        return Enum.valueOf(Traverser$InsertionOrder.class, string2);
    }

    public static Traverser$InsertionOrder[] values() {
        return (Traverser$InsertionOrder[])$VALUES.clone();
    }

    public abstract void insertInto(Deque var1, Object var2);
}

