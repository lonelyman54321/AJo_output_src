/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

public final class CircularImageView$GradientDirection
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ CircularImageView$GradientDirection[] $VALUES;
    public static final /* enum */ CircularImageView$GradientDirection BOTTOM_TO_TOP;
    public static final /* enum */ CircularImageView$GradientDirection LEFT_TO_RIGHT;
    public static final /* enum */ CircularImageView$GradientDirection RIGHT_TO_LEFT;
    public static final /* enum */ CircularImageView$GradientDirection TOP_TO_BOTTOM;
    private final int value;

    private static final /* synthetic */ CircularImageView$GradientDirection[] $values() {
        CircularImageView$GradientDirection circularImageView$GradientDirection = LEFT_TO_RIGHT;
        circularImageView$GradientDirection = RIGHT_TO_LEFT;
        circularImageView$GradientDirection = TOP_TO_BOTTOM;
        circularImageView$GradientDirection = BOTTOM_TO_TOP;
        CircularImageView$GradientDirection[] circularImageView$GradientDirectionArray = new CircularImageView$GradientDirection[]{circularImageView$GradientDirection, circularImageView$GradientDirection, circularImageView$GradientDirection, circularImageView$GradientDirection};
        return circularImageView$GradientDirectionArray;
    }

    static {
        int n3 = 1;
        Enum[] enumArray = new CircularImageView$GradientDirection("LEFT_TO_RIGHT", 0, n3);
        LEFT_TO_RIGHT = enumArray;
        int n4 = 2;
        enumArray = new CircularImageView$GradientDirection("RIGHT_TO_LEFT", n3, n4);
        RIGHT_TO_LEFT = enumArray;
        n3 = 3;
        enumArray = new CircularImageView$GradientDirection("TOP_TO_BOTTOM", n4, n3);
        TOP_TO_BOTTOM = enumArray;
        enumArray = new CircularImageView$GradientDirection("BOTTOM_TO_TOP", n3, 4);
        BOTTOM_TO_TOP = enumArray;
        enumArray = CircularImageView$GradientDirection.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CircularImageView$GradientDirection() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static CircularImageView$GradientDirection valueOf(String string2) {
        return Enum.valueOf(CircularImageView$GradientDirection.class, string2);
    }

    public static CircularImageView$GradientDirection[] values() {
        return (CircularImageView$GradientDirection[])$VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

