/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

public final class Writer$FieldOrder
extends Enum {
    private static final /* synthetic */ Writer$FieldOrder[] $VALUES;
    public static final /* enum */ Writer$FieldOrder ASCENDING;
    public static final /* enum */ Writer$FieldOrder DESCENDING;

    static {
        Writer$FieldOrder writer$FieldOrder;
        Writer$FieldOrder writer$FieldOrder2;
        ASCENDING = writer$FieldOrder2 = new Writer$FieldOrder("ASCENDING", 0);
        int n3 = 1;
        DESCENDING = writer$FieldOrder = new Writer$FieldOrder("DESCENDING", n3);
        Writer$FieldOrder[] writer$FieldOrderArray = new Writer$FieldOrder[2];
        writer$FieldOrderArray[0] = writer$FieldOrder2;
        writer$FieldOrderArray[n3] = writer$FieldOrder;
        $VALUES = writer$FieldOrderArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Writer$FieldOrder() {
        void var2_-1;
        void var1_-1;
    }

    public static Writer$FieldOrder valueOf(String string2) {
        return Enum.valueOf(Writer$FieldOrder.class, string2);
    }

    public static Writer$FieldOrder[] values() {
        return (Writer$FieldOrder[])$VALUES.clone();
    }
}

