/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources$Theme
 */
package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

public final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(Context context, int n3) {
        Resources.Theme theme = context.getTheme();
        boolean bl2 = true;
        theme.applyStyle(n3, bl2);
        boolean bl3 = context instanceof Activity;
        if (bl3 && (context = ThemeUtils.getWindowDecorViewTheme((Activity)context)) != null) {
            context.applyStyle(n3, bl2);
        }
    }

    private static Resources.Theme getWindowDecorViewTheme(Activity activity) {
        if ((activity = activity.getWindow()) != null && (activity = activity.peekDecorView()) != null && (activity = activity.getContext()) != null) {
            return activity.getTheme();
        }
        return null;
    }
}

