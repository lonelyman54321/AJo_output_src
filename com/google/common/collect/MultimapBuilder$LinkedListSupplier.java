/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Supplier;
import java.util.LinkedList;
import java.util.List;

final class MultimapBuilder$LinkedListSupplier
extends Enum
implements Supplier {
    private static final /* synthetic */ MultimapBuilder$LinkedListSupplier[] $VALUES;
    public static final /* enum */ MultimapBuilder$LinkedListSupplier INSTANCE;

    private static /* synthetic */ MultimapBuilder$LinkedListSupplier[] $values() {
        MultimapBuilder$LinkedListSupplier multimapBuilder$LinkedListSupplier = INSTANCE;
        MultimapBuilder$LinkedListSupplier[] multimapBuilder$LinkedListSupplierArray = new MultimapBuilder$LinkedListSupplier[]{multimapBuilder$LinkedListSupplier};
        return multimapBuilder$LinkedListSupplierArray;
    }

    static {
        MultimapBuilder$LinkedListSupplier multimapBuilder$LinkedListSupplier;
        INSTANCE = multimapBuilder$LinkedListSupplier = new MultimapBuilder$LinkedListSupplier("INSTANCE", 0);
        $VALUES = MultimapBuilder$LinkedListSupplier.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MultimapBuilder$LinkedListSupplier() {
        void var2_-1;
        void var1_-1;
    }

    public static Supplier instance() {
        return INSTANCE;
    }

    public static MultimapBuilder$LinkedListSupplier valueOf(String string2) {
        return Enum.valueOf(MultimapBuilder$LinkedListSupplier.class, string2);
    }

    public static MultimapBuilder$LinkedListSupplier[] values() {
        return (MultimapBuilder$LinkedListSupplier[])$VALUES.clone();
    }

    public List get() {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }
}

