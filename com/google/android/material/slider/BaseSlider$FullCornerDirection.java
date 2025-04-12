/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.slider;

final class BaseSlider$FullCornerDirection
extends Enum {
    private static final /* synthetic */ BaseSlider$FullCornerDirection[] $VALUES;
    public static final /* enum */ BaseSlider$FullCornerDirection BOTH;
    public static final /* enum */ BaseSlider$FullCornerDirection LEFT;
    public static final /* enum */ BaseSlider$FullCornerDirection NONE;
    public static final /* enum */ BaseSlider$FullCornerDirection RIGHT;

    static {
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection2;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection3;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection4;
        BOTH = baseSlider$FullCornerDirection4 = new BaseSlider$FullCornerDirection("BOTH", 0);
        int n3 = 1;
        LEFT = baseSlider$FullCornerDirection3 = new BaseSlider$FullCornerDirection("LEFT", n3);
        int n4 = 2;
        RIGHT = baseSlider$FullCornerDirection2 = new BaseSlider$FullCornerDirection("RIGHT", n4);
        int n7 = 3;
        NONE = baseSlider$FullCornerDirection = new BaseSlider$FullCornerDirection("NONE", n7);
        BaseSlider$FullCornerDirection[] baseSlider$FullCornerDirectionArray = new BaseSlider$FullCornerDirection[4];
        baseSlider$FullCornerDirectionArray[0] = baseSlider$FullCornerDirection4;
        baseSlider$FullCornerDirectionArray[n3] = baseSlider$FullCornerDirection3;
        baseSlider$FullCornerDirectionArray[n4] = baseSlider$FullCornerDirection2;
        baseSlider$FullCornerDirectionArray[n7] = baseSlider$FullCornerDirection;
        $VALUES = baseSlider$FullCornerDirectionArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BaseSlider$FullCornerDirection() {
        void var2_-1;
        void var1_-1;
    }

    public static BaseSlider$FullCornerDirection valueOf(String string2) {
        return Enum.valueOf(BaseSlider$FullCornerDirection.class, string2);
    }

    public static BaseSlider$FullCornerDirection[] values() {
        return (BaseSlider$FullCornerDirection[])$VALUES.clone();
    }
}

