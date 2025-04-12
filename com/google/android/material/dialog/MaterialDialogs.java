/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 */
package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class MaterialDialogs {
    private MaterialDialogs() {
    }

    public static Rect getDialogBackgroundInsets(Context context, int n3, int n4) {
        Object object = R$styleable.MaterialAlertDialog;
        int[] nArray = new int[]{};
        Context context2 = context;
        int n7 = n3;
        int n8 = n4;
        TypedArray typedArray = ThemeEnforcement.obtainStyledAttributes(context, null, object, n3, n4, nArray);
        n4 = R$styleable.MaterialAlertDialog_backgroundInsetStart;
        context2 = context.getResources();
        int n10 = R$dimen.mtrl_alert_dialog_background_inset_start;
        int n14 = context2.getDimensionPixelSize(n10);
        n4 = typedArray.getDimensionPixelSize(n4, n14);
        n14 = R$styleable.MaterialAlertDialog_backgroundInsetTop;
        Resources resources = context.getResources();
        int n15 = R$dimen.mtrl_alert_dialog_background_inset_top;
        n10 = resources.getDimensionPixelSize(n15);
        n14 = typedArray.getDimensionPixelSize(n14, n10);
        n10 = R$styleable.MaterialAlertDialog_backgroundInsetEnd;
        object = context.getResources();
        n7 = R$dimen.mtrl_alert_dialog_background_inset_end;
        n15 = object.getDimensionPixelSize(n7);
        n10 = typedArray.getDimensionPixelSize(n10, n15);
        n15 = R$styleable.MaterialAlertDialog_backgroundInsetBottom;
        Resources resources2 = context.getResources();
        n8 = R$dimen.mtrl_alert_dialog_background_inset_bottom;
        n7 = resources2.getDimensionPixelSize(n8);
        n15 = typedArray.getDimensionPixelSize(n15, n7);
        typedArray.recycle();
        context = context.getResources().getConfiguration();
        int n16 = context.getLayoutDirection();
        n3 = 1;
        if (n16 == n3) {
            int n17 = n10;
            n10 = n4;
            n4 = n17;
        }
        context = new Rect(n4, n14, n10, n15);
        return context;
    }

    public static InsetDrawable insetDrawable(Drawable drawable2, Rect rect) {
        int n3 = rect.left;
        int n4 = rect.top;
        int n7 = rect.right;
        int n8 = rect.bottom;
        InsetDrawable insetDrawable = new InsetDrawable(drawable2, n3, n4, n7, n8);
        return insetDrawable;
    }
}

