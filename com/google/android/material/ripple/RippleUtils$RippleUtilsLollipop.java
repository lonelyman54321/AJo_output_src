/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 */
package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;

class RippleUtils$RippleUtilsLollipop {
    private RippleUtils$RippleUtilsLollipop() {
    }

    public static /* synthetic */ Drawable access$000(Context context, int n3) {
        return RippleUtils$RippleUtilsLollipop.createOvalRipple(context, n3);
    }

    private static Drawable createOvalRipple(Context context, int n3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable)gradientDrawable, n3, n3, n3, n3);
        int n4 = R$attr.colorControlHighlight;
        gradientDrawable = ColorStateList.valueOf((int)0);
        context = MaterialColors.getColorStateList(context, n4, (ColorStateList)gradientDrawable);
        RippleDrawable rippleDrawable = new RippleDrawable((ColorStateList)context, null, (Drawable)insetDrawable);
        return rippleDrawable;
    }
}

