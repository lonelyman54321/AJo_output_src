/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.simpleCropView;

import com.ril.ajio.simpleCropView.CropImageView$c;
import com.ril.ajio.simpleCropView.CropImageView$d;
import com.ril.ajio.simpleCropView.CropImageView$e;

public final class CropImageView$a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10;
        Object object4;
        int n14;
        Object object5;
        int n15;
        Object object6;
        int n16 = CropImageView$d.values().length;
        int[] nArray = new int[n16];
        c = nArray;
        int n17 = 1;
        try {
            object6 = CropImageView$d.SHOW_ALWAYS;
            n15 = object6.ordinal();
            nArray[n15] = n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n16 = 2;
        try {
            object6 = c;
            object5 = CropImageView$d.NOT_SHOW;
            n14 = object5.ordinal();
            object6[n14] = (CropImageView$d)n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n15 = 3;
        try {
            object5 = c;
            object4 = CropImageView$d.SHOW_ON_TOUCH;
            n10 = ((Enum)object4).ordinal();
            object5[n10] = (CropImageView$d)n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n14 = CropImageView$c.values().length;
        object5 = new int[n14];
        b = (int[])object5;
        try {
            object4 = CropImageView$c.FIT_IMAGE;
            n10 = ((Enum)object4).ordinal();
            object5[n10] = (CropImageView$d)n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object5 = b;
            object4 = CropImageView$c.FREE;
            n10 = ((Enum)object4).ordinal();
            object5[n10] = (CropImageView$d)n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object5 = b;
            object4 = CropImageView$c.RATIO_4_3;
            n10 = ((Enum)object4).ordinal();
            object5[n10] = (CropImageView$d)n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n14 = 4;
        try {
            object4 = b;
            object3 = CropImageView$c.RATIO_3_4;
            n8 = object3.ordinal();
            object4[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 5;
        try {
            object3 = b;
            object2 = CropImageView$c.RATIO_16_9;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (CropImageView$c)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 6;
        try {
            object2 = b;
            enum_ = CropImageView$c.RATIO_9_16;
            n4 = enum_.ordinal();
            object2[n4] = (CropImageView$c)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CropImageView$c.SQUARE;
            n4 = enum_.ordinal();
            n3 = 7;
            object2[n4] = (CropImageView$c)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CropImageView$c.CIRCLE;
            n4 = enum_.ordinal();
            n3 = 8;
            object2[n4] = (CropImageView$c)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CropImageView$c.CIRCLE_SQUARE;
            n4 = enum_.ordinal();
            n3 = 9;
            object2[n4] = (CropImageView$c)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = CropImageView$c.CUSTOM;
            n4 = enum_.ordinal();
            n3 = 10;
            object2[n4] = (CropImageView$c)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = CropImageView$e.values().length;
        object2 = new int[n7];
        a = (int[])object2;
        try {
            enum_ = CropImageView$e.CENTER;
            n4 = enum_.ordinal();
            object2[n4] = (CropImageView$c)n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = CropImageView$e.LEFT_TOP;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)CropImageView$e.RIGHT_TOP;
            n17 = ((Enum)object).ordinal();
            nArray[n17] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = CropImageView$e.LEFT_BOTTOM;
            n17 = ((Enum)object).ordinal();
            nArray[n17] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = CropImageView$e.RIGHT_BOTTOM;
            n17 = ((Enum)object).ordinal();
            nArray[n17] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = CropImageView$e.OUT_OF_BOUNDS;
            n17 = ((Enum)object).ordinal();
            nArray[n17] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

