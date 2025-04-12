/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.simpleCropView;

public final class CropImageView$d
extends Enum {
    private static final /* synthetic */ CropImageView$d[] $VALUES;
    public static final /* enum */ CropImageView$d NOT_SHOW;
    public static final /* enum */ CropImageView$d SHOW_ALWAYS;
    public static final /* enum */ CropImageView$d SHOW_ON_TOUCH;
    private final int ID;

    private static /* synthetic */ CropImageView$d[] $values() {
        CropImageView$d cropImageView$d = SHOW_ALWAYS;
        cropImageView$d = SHOW_ON_TOUCH;
        cropImageView$d = NOT_SHOW;
        CropImageView$d[] cropImageView$dArray = new CropImageView$d[]{cropImageView$d, cropImageView$d, cropImageView$d};
        return cropImageView$dArray;
    }

    static {
        CropImageView$d cropImageView$d;
        int n3 = 1;
        SHOW_ALWAYS = cropImageView$d = new CropImageView$d("SHOW_ALWAYS", 0, n3);
        int n4 = 2;
        SHOW_ON_TOUCH = cropImageView$d = new CropImageView$d("SHOW_ON_TOUCH", n3, n4);
        NOT_SHOW = cropImageView$d = new CropImageView$d("NOT_SHOW", n4, 3);
        $VALUES = CropImageView$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CropImageView$d() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.ID = var3_2;
    }

    public static CropImageView$d valueOf(String string2) {
        return Enum.valueOf(CropImageView$d.class, string2);
    }

    public static CropImageView$d[] values() {
        return (CropImageView$d[])$VALUES.clone();
    }

    public int getId() {
        return this.ID;
    }
}

