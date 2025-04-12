/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

public final class HorizontalSide
extends Enum {
    private static final /* synthetic */ HorizontalSide[] $VALUES;
    public static final /* enum */ HorizontalSide Left;
    public static final /* enum */ HorizontalSide Right;

    private static final /* synthetic */ HorizontalSide[] $values() {
        HorizontalSide horizontalSide = Left;
        horizontalSide = Right;
        HorizontalSide[] horizontalSideArray = new HorizontalSide[]{horizontalSide, horizontalSide};
        return horizontalSideArray;
    }

    static {
        HorizontalSide horizontalSide;
        Left = horizontalSide = new HorizontalSide("Left", 0);
        Right = horizontalSide = new HorizontalSide("Right", 1);
        $VALUES = HorizontalSide.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HorizontalSide() {
        void var2_-1;
        void var1_-1;
    }

    public static HorizontalSide valueOf(String string2) {
        return Enum.valueOf(HorizontalSide.class, string2);
    }

    public static HorizontalSide[] values() {
        return (HorizontalSide[])$VALUES.clone();
    }
}

