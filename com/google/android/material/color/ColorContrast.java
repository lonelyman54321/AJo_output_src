/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.ContextThemeWrapper
 */
package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.material.color.ColorContrast$ColorContrastActivityLifecycleCallbacks;
import com.google.android.material.color.ColorContrastOptions;
import com.google.android.material.color.ThemeUtils;

public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(Application application, ColorContrastOptions colorContrastOptions) {
        boolean bl2 = ColorContrast.isContrastAvailable();
        if (!bl2) {
            return;
        }
        ColorContrast$ColorContrastActivityLifecycleCallbacks colorContrast$ColorContrastActivityLifecycleCallbacks = new ColorContrast$ColorContrastActivityLifecycleCallbacks(colorContrastOptions);
        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)colorContrast$ColorContrastActivityLifecycleCallbacks);
    }

    public static void applyToActivityIfAvailable(Activity activity, ColorContrastOptions colorContrastOptions) {
        boolean bl2 = ColorContrast.isContrastAvailable();
        if (!bl2) {
            return;
        }
        int n3 = ColorContrast.getContrastThemeOverlayResourceId((Context)activity, colorContrastOptions);
        if (n3 != 0) {
            ThemeUtils.applyThemeOverlay((Context)activity, n3);
        }
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        String string2 = "uimode";
        context = (UiModeManager)context.getSystemService(string2);
        int n3 = ColorContrast.isContrastAvailable();
        if (n3 != 0 && context != null) {
            float f5 = px_1.a((UiModeManager)context);
            n3 = colorContrastOptions.getMediumContrastThemeOverlay();
            int n4 = colorContrastOptions.getHighContrastThemeOverlay();
            float f6 = 0.6666667f;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object >= 0) {
                if (n4 != 0) {
                    n3 = n4;
                }
                return n3;
            }
            object = 1051372203;
            f6 = 0.33333334f;
            float f8 = f5 - f6;
            Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object2 >= 0) {
                if (n3 == 0) {
                    n3 = n4;
                }
                return n3;
            }
        }
        return 0;
    }

    public static boolean isContrastAvailable() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public static Context wrapContextIfAvailable(Context context, ColorContrastOptions colorContrastOptions) {
        boolean bl2 = ColorContrast.isContrastAvailable();
        if (!bl2) {
            return context;
        }
        int n3 = ColorContrast.getContrastThemeOverlayResourceId(context, colorContrastOptions);
        if (n3 == 0) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
        return contextThemeWrapper;
    }
}

