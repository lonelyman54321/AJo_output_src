/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.simpleCropView;

public final class CropImageView$c
extends Enum {
    private static final /* synthetic */ CropImageView$c[] $VALUES;
    public static final /* enum */ CropImageView$c CIRCLE;
    public static final /* enum */ CropImageView$c CIRCLE_SQUARE;
    public static final /* enum */ CropImageView$c CUSTOM;
    public static final /* enum */ CropImageView$c FIT_IMAGE;
    public static final /* enum */ CropImageView$c FREE;
    public static final /* enum */ CropImageView$c RATIO_16_9;
    public static final /* enum */ CropImageView$c RATIO_3_4;
    public static final /* enum */ CropImageView$c RATIO_4_3;
    public static final /* enum */ CropImageView$c RATIO_9_16;
    public static final /* enum */ CropImageView$c SQUARE;
    private final int ID;

    private static /* synthetic */ CropImageView$c[] $values() {
        CropImageView$c cropImageView$c = FIT_IMAGE;
        cropImageView$c = RATIO_4_3;
        cropImageView$c = RATIO_3_4;
        cropImageView$c = SQUARE;
        cropImageView$c = RATIO_16_9;
        cropImageView$c = RATIO_9_16;
        cropImageView$c = FREE;
        cropImageView$c = CUSTOM;
        cropImageView$c = CIRCLE;
        cropImageView$c = CIRCLE_SQUARE;
        CropImageView$c[] cropImageView$cArray = new CropImageView$c[]{cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c, cropImageView$c};
        return cropImageView$cArray;
    }

    static {
        CropImageView$c cropImageView$c;
        FIT_IMAGE = cropImageView$c = new CropImageView$c("FIT_IMAGE", 0, 0);
        int n3 = 1;
        RATIO_4_3 = cropImageView$c = new CropImageView$c("RATIO_4_3", n3, n3);
        n3 = 2;
        RATIO_3_4 = cropImageView$c = new CropImageView$c("RATIO_3_4", n3, n3);
        n3 = 3;
        SQUARE = cropImageView$c = new CropImageView$c("SQUARE", n3, n3);
        n3 = 4;
        RATIO_16_9 = cropImageView$c = new CropImageView$c("RATIO_16_9", n3, n3);
        n3 = 5;
        RATIO_9_16 = cropImageView$c = new CropImageView$c("RATIO_9_16", n3, n3);
        n3 = 6;
        FREE = cropImageView$c = new CropImageView$c("FREE", n3, n3);
        n3 = 7;
        CUSTOM = cropImageView$c = new CropImageView$c("CUSTOM", n3, n3);
        n3 = 8;
        CIRCLE = cropImageView$c = new CropImageView$c("CIRCLE", n3, n3);
        n3 = 9;
        CIRCLE_SQUARE = cropImageView$c = new CropImageView$c("CIRCLE_SQUARE", n3, n3);
        $VALUES = CropImageView$c.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CropImageView$c() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.ID = var3_2;
    }

    public static CropImageView$c valueOf(String string2) {
        return Enum.valueOf(CropImageView$c.class, string2);
    }

    public static CropImageView$c[] values() {
        return (CropImageView$c[])$VALUES.clone();
    }

    public int getId() {
        return this.ID;
    }
}

