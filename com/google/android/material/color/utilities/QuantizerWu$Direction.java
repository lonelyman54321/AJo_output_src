/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

final class QuantizerWu$Direction
extends Enum {
    private static final /* synthetic */ QuantizerWu$Direction[] $VALUES;
    public static final /* enum */ QuantizerWu$Direction BLUE;
    public static final /* enum */ QuantizerWu$Direction GREEN;
    public static final /* enum */ QuantizerWu$Direction RED;

    static {
        QuantizerWu$Direction quantizerWu$Direction;
        QuantizerWu$Direction quantizerWu$Direction2;
        QuantizerWu$Direction quantizerWu$Direction3;
        RED = quantizerWu$Direction3 = new QuantizerWu$Direction("RED", 0);
        int n3 = 1;
        GREEN = quantizerWu$Direction2 = new QuantizerWu$Direction("GREEN", n3);
        int n4 = 2;
        BLUE = quantizerWu$Direction = new QuantizerWu$Direction("BLUE", n4);
        QuantizerWu$Direction[] quantizerWu$DirectionArray = new QuantizerWu$Direction[3];
        quantizerWu$DirectionArray[0] = quantizerWu$Direction3;
        quantizerWu$DirectionArray[n3] = quantizerWu$Direction2;
        quantizerWu$DirectionArray[n4] = quantizerWu$Direction;
        $VALUES = quantizerWu$DirectionArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QuantizerWu$Direction() {
        void var2_-1;
        void var1_-1;
    }

    public static QuantizerWu$Direction valueOf(String string2) {
        return Enum.valueOf(QuantizerWu$Direction.class, string2);
    }

    public static QuantizerWu$Direction[] values() {
        return (QuantizerWu$Direction[])$VALUES.clone();
    }
}

