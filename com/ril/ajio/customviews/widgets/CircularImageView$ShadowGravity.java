/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

public final class CircularImageView$ShadowGravity
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ CircularImageView$ShadowGravity[] $VALUES;
    public static final /* enum */ CircularImageView$ShadowGravity BOTTOM;
    public static final /* enum */ CircularImageView$ShadowGravity CENTER;
    public static final /* enum */ CircularImageView$ShadowGravity END;
    public static final /* enum */ CircularImageView$ShadowGravity START;
    public static final /* enum */ CircularImageView$ShadowGravity TOP;
    private final int value;

    private static final /* synthetic */ CircularImageView$ShadowGravity[] $values() {
        CircularImageView$ShadowGravity circularImageView$ShadowGravity = CENTER;
        circularImageView$ShadowGravity = TOP;
        circularImageView$ShadowGravity = BOTTOM;
        circularImageView$ShadowGravity = START;
        circularImageView$ShadowGravity = END;
        CircularImageView$ShadowGravity[] circularImageView$ShadowGravityArray = new CircularImageView$ShadowGravity[]{circularImageView$ShadowGravity, circularImageView$ShadowGravity, circularImageView$ShadowGravity, circularImageView$ShadowGravity, circularImageView$ShadowGravity};
        return circularImageView$ShadowGravityArray;
    }

    static {
        int n3 = 1;
        Enum[] enumArray = new CircularImageView$ShadowGravity("CENTER", 0, n3);
        CENTER = enumArray;
        int n4 = 2;
        enumArray = new CircularImageView$ShadowGravity("TOP", n3, n4);
        TOP = enumArray;
        n3 = 3;
        enumArray = new CircularImageView$ShadowGravity("BOTTOM", n4, n3);
        BOTTOM = enumArray;
        n4 = 4;
        enumArray = new CircularImageView$ShadowGravity("START", n3, n4);
        START = enumArray;
        enumArray = new CircularImageView$ShadowGravity("END", n4, 5);
        END = enumArray;
        enumArray = CircularImageView$ShadowGravity.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CircularImageView$ShadowGravity() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static CircularImageView$ShadowGravity valueOf(String string2) {
        return Enum.valueOf(CircularImageView$ShadowGravity.class, string2);
    }

    public static CircularImageView$ShadowGravity[] values() {
        return (CircularImageView$ShadowGravity[])$VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

