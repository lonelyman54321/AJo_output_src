/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

public final class BoundType
extends Enum {
    private static final /* synthetic */ BoundType[] $VALUES;
    public static final /* enum */ BoundType CLOSED;
    public static final /* enum */ BoundType OPEN;
    final boolean inclusive;

    private static /* synthetic */ BoundType[] $values() {
        BoundType boundType = OPEN;
        boundType = CLOSED;
        BoundType[] boundTypeArray = new BoundType[]{boundType, boundType};
        return boundTypeArray;
    }

    static {
        BoundType boundType;
        OPEN = boundType = new BoundType("OPEN", 0, false);
        boolean bl2 = true;
        CLOSED = boundType = new BoundType("CLOSED", (int)(bl2 ? 1 : 0), bl2);
        $VALUES = BoundType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BoundType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.inclusive = var3_2;
    }

    public static BoundType forBoolean(boolean bl2) {
        BoundType boundType = bl2 ? CLOSED : OPEN;
        return boundType;
    }

    public static BoundType valueOf(String string2) {
        return Enum.valueOf(BoundType.class, string2);
    }

    public static BoundType[] values() {
        return (BoundType[])$VALUES.clone();
    }
}

