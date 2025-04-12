/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package com.getkeepsafe.taptargetview;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

class UiUtil {
    public static int dp(Context context, int n3) {
        float f5 = n3;
        context = context.getResources().getDisplayMetrics();
        return (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)context);
    }

    public static int setAlpha(int n3, float f5) {
        int n4;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            n4 = 1065353216;
            f5 = 1.0f;
        } else {
            f6 = 0.0f;
            float f8 = f5 - 0.0f;
            object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object <= 0) {
                n4 = 0;
                f5 = 0.0f;
            }
        }
        n4 = (int)((float)(n3 >>> 24) * f5) << 24;
        return n3 & 0xFFFFFF | n4;
    }

    public static int sp(Context context, int n3) {
        float f5 = n3;
        context = context.getResources().getDisplayMetrics();
        return (int)TypedValue.applyDimension((int)2, (float)f5, (DisplayMetrics)context);
    }

    public static int themeIntAttr(Context object, String string2) {
        String string3;
        Resources.Theme theme = object.getTheme();
        int n3 = -1;
        if (theme == null) {
            return n3;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = object.getResources();
        int n4 = resources.getIdentifier(string2, string3 = "attr", (String)(object = object.getPackageName()));
        if (n4 == 0) {
            return n3;
        }
        theme.resolveAttribute(n4, typedValue, true);
        return typedValue.data;
    }
}

