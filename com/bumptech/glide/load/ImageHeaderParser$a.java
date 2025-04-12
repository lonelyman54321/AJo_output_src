/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

public final class ImageHeaderParser$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        int n7 = ImageHeaderParser$ImageType.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.WEBP;
            n4 = imageHeaderParser$ImageType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.WEBP_A;
            n4 = imageHeaderParser$ImageType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.ANIMATED_WEBP;
            n4 = imageHeaderParser$ImageType.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

