/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.TextAppearance;

public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    public static ColorStateList getColorStateList(Context context, Tn3 tn3, int n3) {
        TypedArray typedArray = tn3.b;
        int n4 = typedArray.hasValue(n3);
        if (n4 != 0 && (n4 = (typedArray = tn3.b).getResourceId(n3, 0)) != 0 && (context = t70.getColorStateList(context, n4)) != null) {
            return context;
        }
        return tn3.a(n3);
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int n3) {
        int n4 = typedArray.hasValue(n3);
        if (n4 != 0 && (n4 = typedArray.getResourceId(n3, 0)) != 0 && (context = t70.getColorStateList(context, n4)) != null) {
            return context;
        }
        return typedArray.getColorStateList(n3);
    }

    private static int getComplexUnit(TypedValue typedValue) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        if (n3 >= n4) {
            return vk2_2.a(typedValue);
        }
        return typedValue.data & 0xF;
    }

    public static int getDimensionPixelSize(Context context, TypedArray object, int n3, int n4) {
        int n7;
        TypedValue typedValue = new TypedValue();
        int n8 = object.getValue(n3, typedValue);
        if (n8 != 0 && (n8 = typedValue.type) == (n7 = 2)) {
            context = context.getTheme();
            int n10 = typedValue.data;
            object = new int[]{n10};
            context = context.obtainStyledAttributes((int[])object);
            n10 = context.getDimensionPixelSize(0, n4);
            context.recycle();
            return n10;
        }
        return object.getDimensionPixelSize(n3, n4);
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int n3) {
        int n4 = typedArray.hasValue(n3);
        if (n4 != 0 && (n4 = typedArray.getResourceId(n3, 0)) != 0 && (context = xn.a(context, n4)) != null) {
            return context;
        }
        return typedArray.getDrawable(n3);
    }

    public static float getFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int getIndexWithValue(TypedArray typedArray, int n3, int n4) {
        boolean bl2 = typedArray.hasValue(n3);
        if (bl2) {
            return n3;
        }
        return n4;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int n3) {
        boolean bl2 = typedArray.hasValue(n3);
        if (bl2) {
            bl2 = false;
            int n4 = typedArray.getResourceId(n3, 0);
            if (n4 != 0) {
                TextAppearance textAppearance = new TextAppearance(context, n4);
                return textAppearance;
            }
        }
        return null;
    }

    public static int getUnscaledTextSize(Context context, int n3, int n4) {
        if (n3 == 0) {
            return n4;
        }
        Object object = R$styleable.TextAppearance;
        TypedArray typedArray = context.obtainStyledAttributes(n3, object);
        object = new TypedValue;
        object();
        int n7 = R$styleable.TextAppearance_android_textSize;
        n7 = (int)(typedArray.getValue(n7, (TypedValue)object) ? 1 : 0);
        typedArray.recycle();
        if (n7 == 0) {
            return n4;
        }
        n3 = MaterialResources.getComplexUnit((TypedValue)object);
        if (n3 == (n4 = 2)) {
            float f5 = TypedValue.complexToFloat((int)object.data);
            float f6 = context.getResources().getDisplayMetrics().density;
            return Math.round(f5 * f6);
        }
        n3 = object.data;
        context = context.getResources().getDisplayMetrics();
        return TypedValue.complexToDimensionPixelSize((int)n3, (DisplayMetrics)context);
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        context = context.getResources().getConfiguration();
        float f5 = context.fontScale;
        float f6 = 1.3f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
            context = null;
        }
        return (boolean)object;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        context = context.getResources().getConfiguration();
        float f5 = context.fontScale;
        float f6 = 2.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
            context = null;
        }
        return (boolean)object;
    }
}

