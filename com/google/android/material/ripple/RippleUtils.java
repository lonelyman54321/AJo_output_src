/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.StateSet
 */
package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import com.google.android.material.ripple.RippleUtils$RippleUtilsLollipop;

public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET;
    private static final int[] FOCUSED_STATE_SET;
    private static final int[] HOVERED_FOCUSED_STATE_SET;
    private static final int[] HOVERED_STATE_SET;
    static final String LOG_TAG;
    private static final int[] PRESSED_STATE_SET;
    private static final int[] SELECTED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_STATE_SET;
    private static final int[] SELECTED_PRESSED_STATE_SET;
    private static final int[] SELECTED_STATE_SET;
    static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    public static final boolean USE_FRAMEWORK_RIPPLE;

    static {
        USE_FRAMEWORK_RIPPLE = true;
        int n3 = 16842919;
        PRESSED_STATE_SET = new int[]{n3};
        int n4 = 16843623;
        int n7 = 16842908;
        HOVERED_FOCUSED_STATE_SET = new int[]{n4, n7};
        FOCUSED_STATE_SET = new int[]{n7};
        HOVERED_STATE_SET = new int[]{n4};
        int n8 = 0x10100A1;
        SELECTED_PRESSED_STATE_SET = new int[]{n8, n3};
        SELECTED_HOVERED_FOCUSED_STATE_SET = new int[]{n8, n4, n7};
        SELECTED_FOCUSED_STATE_SET = new int[]{n8, n7};
        SELECTED_HOVERED_STATE_SET = new int[]{n8, n4};
        SELECTED_STATE_SET = new int[]{n8};
        ENABLED_PRESSED_STATE_SET = new int[]{16842910, n3};
        LOG_TAG = "RippleUtils";
    }

    private RippleUtils() {
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList object) {
        int n3;
        int n4;
        int n7 = USE_FRAMEWORK_RIPPLE;
        int n8 = 2;
        int n10 = 1;
        int n14 = 3;
        int n15 = 0;
        int[] nArray = null;
        if (n7 != 0) {
            int n16;
            int n17;
            int[][] nArrayArray = new int[n14][];
            int[] nArray2 = new int[n14];
            int[] nArray3 = SELECTED_STATE_SET;
            nArrayArray[0] = nArray3;
            nArray3 = SELECTED_PRESSED_STATE_SET;
            nArray2[0] = n17 = RippleUtils.getColorForState(object, nArray3);
            nArray = FOCUSED_STATE_SET;
            nArrayArray[n10] = nArray;
            nArray2[n10] = n15 = RippleUtils.getColorForState(object, nArray);
            int[] nArray4 = StateSet.NOTHING;
            nArrayArray[n8] = nArray4;
            nArray4 = PRESSED_STATE_SET;
            nArray2[n8] = n16 = RippleUtils.getColorForState(object, nArray4);
            object = new ColorStateList((int[][])nArrayArray, nArray2);
            return object;
        }
        n7 = 10;
        int[][] nArrayArray = new int[n7][];
        int[] nArray5 = new int[n7];
        int[] nArray6 = SELECTED_PRESSED_STATE_SET;
        nArrayArray[0] = nArray6;
        nArray5[0] = n4 = RippleUtils.getColorForState(object, nArray6);
        nArray6 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        nArrayArray[n10] = nArray6;
        nArray5[n10] = n4 = RippleUtils.getColorForState(object, nArray6);
        int[] nArray7 = SELECTED_FOCUSED_STATE_SET;
        nArrayArray[n8] = nArray7;
        nArray5[n8] = n10 = RippleUtils.getColorForState(object, nArray7);
        int[] nArray8 = SELECTED_HOVERED_STATE_SET;
        nArrayArray[n14] = nArray8;
        nArray5[n14] = n8 = RippleUtils.getColorForState(object, nArray8);
        nArray8 = SELECTED_STATE_SET;
        n10 = 4;
        nArrayArray[n10] = nArray8;
        nArray5[n10] = 0;
        nArray8 = PRESSED_STATE_SET;
        n10 = 5;
        nArrayArray[n10] = nArray8;
        nArray5[n10] = n8 = RippleUtils.getColorForState(object, nArray8);
        nArray8 = HOVERED_FOCUSED_STATE_SET;
        n10 = 6;
        nArrayArray[n10] = nArray8;
        nArray5[n10] = n8 = RippleUtils.getColorForState(object, nArray8);
        nArray8 = FOCUSED_STATE_SET;
        n10 = 7;
        nArrayArray[n10] = nArray8;
        nArray5[n10] = n8 = RippleUtils.getColorForState(object, nArray8);
        nArray8 = HOVERED_STATE_SET;
        n10 = 8;
        nArrayArray[n10] = nArray8;
        nArray5[n10] = n3 = RippleUtils.getColorForState(object, nArray8);
        object = StateSet.NOTHING;
        n8 = 9;
        nArrayArray[n8] = (int[])object;
        nArray5[n8] = 0;
        object = new ColorStateList((int[][])nArrayArray, nArray5);
        return object;
    }

    public static Drawable createOvalRippleLollipop(Context context, int n3) {
        return RippleUtils$RippleUtilsLollipop.access$000(context, n3);
    }

    private static int doubleAlpha(int n3) {
        int n4 = Math.min(Color.alpha((int)n3) * 2, 255);
        return hZ.i(n3, n4);
    }

    private static int getColorForState(ColorStateList colorStateList, int[] nArray) {
        int n3;
        if (colorStateList != null) {
            int n4 = colorStateList.getDefaultColor();
            n3 = colorStateList.getColorForState(nArray, n4);
        } else {
            n3 = 0;
            colorStateList = null;
        }
        boolean bl2 = USE_FRAMEWORK_RIPPLE;
        if (bl2) {
            n3 = RippleUtils.doubleAlpha(n3);
        }
        return n3;
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
        int n3 = 0;
        if (colorStateList != null) {
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 22;
            if (n4 >= n7 && n4 <= (n7 = 27) && (n4 = Color.alpha((int)colorStateList.getDefaultColor())) == 0) {
                int[] nArray = ENABLED_PRESSED_STATE_SET;
                n3 = colorStateList.getColorForState(nArray, 0);
                Color.alpha((int)n3);
            }
            return colorStateList;
        }
        return ColorStateList.valueOf((int)0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean shouldDrawRippleCompat(int[] nArray) {
        int n3 = nArray.length;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            int n7 = 16842910;
            if (n4 == n7) {
                bl3 = true;
                continue;
            }
            n7 = 16842908;
            if (n4 != n7 && n4 != (n7 = 16842919) && n4 != (n7 = 16843623)) continue;
            bl4 = true;
        }
        if (!bl3) return bl2;
        if (!bl4) return bl2;
        return true;
    }
}

