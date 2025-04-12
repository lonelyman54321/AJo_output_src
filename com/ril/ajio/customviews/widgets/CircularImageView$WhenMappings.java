/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets;

import android.widget.ImageView;
import com.ril.ajio.customviews.widgets.CircularImageView$GradientDirection;
import com.ril.ajio.customviews.widgets.CircularImageView$ShadowGravity;

public final class CircularImageView$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        ImageView.ScaleType scaleType;
        int n3;
        Enum enum_;
        int n4;
        Enum enum_2;
        int n7;
        int n8;
        int n10 = CircularImageView$GradientDirection.values().length;
        int[] nArray = new int[n10];
        int n14 = 1;
        try {
            CircularImageView$GradientDirection circularImageView$GradientDirection = CircularImageView$GradientDirection.LEFT_TO_RIGHT;
            n8 = circularImageView$GradientDirection.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            CircularImageView$GradientDirection circularImageView$GradientDirection = CircularImageView$GradientDirection.RIGHT_TO_LEFT;
            n7 = circularImageView$GradientDirection.ordinal();
            nArray[n7] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            enum_2 = CircularImageView$GradientDirection.TOP_TO_BOTTOM;
            n4 = enum_2.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 4;
        try {
            enum_ = CircularImageView$GradientDirection.BOTTOM_TO_TOP;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n10 = CircularImageView$ShadowGravity.values().length;
        nArray = new int[n10];
        try {
            enum_ = CircularImageView$ShadowGravity.CENTER;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = CircularImageView$ShadowGravity.TOP;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = CircularImageView$ShadowGravity.BOTTOM;
            n3 = enum_.ordinal();
            nArray[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = CircularImageView$ShadowGravity.START;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_2 = CircularImageView$ShadowGravity.END;
            n4 = enum_2.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n10 = ImageView.ScaleType.values().length;
        nArray = new int[n10];
        try {
            enum_2 = ImageView.ScaleType.CENTER_CROP;
            n4 = enum_2.ordinal();
            nArray[n4] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
            n14 = scaleType.ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            n14 = scaleType.ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
    }
}

