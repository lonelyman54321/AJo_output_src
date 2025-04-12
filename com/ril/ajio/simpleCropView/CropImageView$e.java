/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.simpleCropView;

public final class CropImageView$e
extends Enum {
    private static final /* synthetic */ CropImageView$e[] $VALUES;
    public static final /* enum */ CropImageView$e CENTER;
    public static final /* enum */ CropImageView$e LEFT_BOTTOM;
    public static final /* enum */ CropImageView$e LEFT_TOP;
    public static final /* enum */ CropImageView$e OUT_OF_BOUNDS;
    public static final /* enum */ CropImageView$e RIGHT_BOTTOM;
    public static final /* enum */ CropImageView$e RIGHT_TOP;

    private static /* synthetic */ CropImageView$e[] $values() {
        CropImageView$e cropImageView$e = OUT_OF_BOUNDS;
        cropImageView$e = CENTER;
        cropImageView$e = LEFT_TOP;
        cropImageView$e = RIGHT_TOP;
        cropImageView$e = LEFT_BOTTOM;
        cropImageView$e = RIGHT_BOTTOM;
        CropImageView$e[] cropImageView$eArray = new CropImageView$e[]{cropImageView$e, cropImageView$e, cropImageView$e, cropImageView$e, cropImageView$e, cropImageView$e};
        return cropImageView$eArray;
    }

    static {
        CropImageView$e cropImageView$e;
        OUT_OF_BOUNDS = cropImageView$e = new CropImageView$e("OUT_OF_BOUNDS", 0);
        CENTER = cropImageView$e = new CropImageView$e("CENTER", 1);
        LEFT_TOP = cropImageView$e = new CropImageView$e("LEFT_TOP", 2);
        RIGHT_TOP = cropImageView$e = new CropImageView$e("RIGHT_TOP", 3);
        LEFT_BOTTOM = cropImageView$e = new CropImageView$e("LEFT_BOTTOM", 4);
        RIGHT_BOTTOM = cropImageView$e = new CropImageView$e("RIGHT_BOTTOM", 5);
        $VALUES = CropImageView$e.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CropImageView$e() {
        void var2_-1;
        void var1_-1;
    }

    public static CropImageView$e valueOf(String string2) {
        return Enum.valueOf(CropImageView$e.class, string2);
    }

    public static CropImageView$e[] values() {
        return (CropImageView$e[])$VALUES.clone();
    }
}

