/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

public final class VerticalSide
extends Enum {
    private static final /* synthetic */ VerticalSide[] $VALUES;
    public static final /* enum */ VerticalSide Bottom;
    public static final /* enum */ VerticalSide Top;

    private static final /* synthetic */ VerticalSide[] $values() {
        VerticalSide verticalSide = Top;
        verticalSide = Bottom;
        VerticalSide[] verticalSideArray = new VerticalSide[]{verticalSide, verticalSide};
        return verticalSideArray;
    }

    static {
        VerticalSide verticalSide;
        Top = verticalSide = new VerticalSide("Top", 0);
        Bottom = verticalSide = new VerticalSide("Bottom", 1);
        $VALUES = VerticalSide.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private VerticalSide() {
        void var2_-1;
        void var1_-1;
    }

    public static VerticalSide valueOf(String string2) {
        return Enum.valueOf(VerticalSide.class, string2);
    }

    public static VerticalSide[] values() {
        return (VerticalSide[])$VALUES.clone();
    }
}

