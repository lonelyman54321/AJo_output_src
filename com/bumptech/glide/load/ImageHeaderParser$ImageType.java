/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser$a;

public final class ImageHeaderParser$ImageType
extends Enum {
    private static final /* synthetic */ ImageHeaderParser$ImageType[] $VALUES;
    public static final /* enum */ ImageHeaderParser$ImageType ANIMATED_AVIF;
    public static final /* enum */ ImageHeaderParser$ImageType ANIMATED_WEBP;
    public static final /* enum */ ImageHeaderParser$ImageType AVIF;
    public static final /* enum */ ImageHeaderParser$ImageType GIF;
    public static final /* enum */ ImageHeaderParser$ImageType JPEG;
    public static final /* enum */ ImageHeaderParser$ImageType PNG;
    public static final /* enum */ ImageHeaderParser$ImageType PNG_A;
    public static final /* enum */ ImageHeaderParser$ImageType RAW;
    public static final /* enum */ ImageHeaderParser$ImageType UNKNOWN;
    public static final /* enum */ ImageHeaderParser$ImageType WEBP;
    public static final /* enum */ ImageHeaderParser$ImageType WEBP_A;
    private final boolean hasAlpha;

    private static /* synthetic */ ImageHeaderParser$ImageType[] $values() {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType = GIF;
        imageHeaderParser$ImageType = JPEG;
        imageHeaderParser$ImageType = RAW;
        imageHeaderParser$ImageType = PNG_A;
        imageHeaderParser$ImageType = PNG;
        imageHeaderParser$ImageType = WEBP_A;
        imageHeaderParser$ImageType = WEBP;
        imageHeaderParser$ImageType = ANIMATED_WEBP;
        imageHeaderParser$ImageType = AVIF;
        imageHeaderParser$ImageType = ANIMATED_AVIF;
        imageHeaderParser$ImageType = UNKNOWN;
        ImageHeaderParser$ImageType[] imageHeaderParser$ImageTypeArray = new ImageHeaderParser$ImageType[]{imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType, imageHeaderParser$ImageType};
        return imageHeaderParser$ImageTypeArray;
    }

    static {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        boolean bl2 = true;
        GIF = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("GIF", 0, bl2);
        JPEG = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("JPEG", (int)(bl2 ? 1 : 0), false);
        RAW = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("RAW", 2, false);
        PNG_A = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("PNG_A", 3, bl2);
        PNG = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("PNG", 4, false);
        WEBP_A = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("WEBP_A", 5, bl2);
        WEBP = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("WEBP", 6, false);
        ANIMATED_WEBP = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("ANIMATED_WEBP", 7, bl2);
        AVIF = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("AVIF", 8, bl2);
        ANIMATED_AVIF = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("ANIMATED_AVIF", 9, bl2);
        UNKNOWN = imageHeaderParser$ImageType = new ImageHeaderParser$ImageType("UNKNOWN", 10, false);
        $VALUES = ImageHeaderParser$ImageType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ImageHeaderParser$ImageType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.hasAlpha = var3_2;
    }

    public static ImageHeaderParser$ImageType valueOf(String string2) {
        return Enum.valueOf(ImageHeaderParser$ImageType.class, string2);
    }

    public static ImageHeaderParser$ImageType[] values() {
        return (ImageHeaderParser$ImageType[])$VALUES.clone();
    }

    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    public boolean isWebp() {
        int n3;
        int[] nArray = ImageHeaderParser$a.a;
        int n4 = this.ordinal();
        int n7 = nArray[n4];
        if (n7 != (n4 = 1) && n7 != (n3 = 2) && n7 != (n3 = 3)) {
            return false;
        }
        return n4;
    }
}

