/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.os.Build
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
import com.google.android.material.R$attr;
import com.google.android.material.color.DynamicColors$1;
import com.google.android.material.color.DynamicColors$DeviceSupportCondition;
import com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks;
import com.google.android.material.color.DynamicColors$Precondition;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.DynamicColorsOptions$Builder;
import com.google.android.material.color.MaterialColorUtilitiesHelper;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.ThemeUtils;
import com.google.android.material.color.a;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class DynamicColors {
    private static final DynamicColors$DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    private static final Map DYNAMIC_COLOR_SUPPORTED_BRANDS;
    private static final Map DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE;
    private static final DynamicColors$DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    private static final String TAG;
    private static final int USE_DEFAULT_THEME_OVERLAY;

    static {
        int n3 = R$attr.dynamicColorThemeOverlay;
        DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = new int[]{n3};
        DynamicColors$1 dynamicColors$1 = new DynamicColors$1();
        DEFAULT_DEVICE_SUPPORT_CONDITION = dynamicColors$1;
        HashMap<String, DynamicColors$1> hashMap = new HashMap<String, DynamicColors$1>();
        SAMSUNG_DEVICE_SUPPORT_CONDITION = hashMap;
        HashMap<String, DynamicColors$DeviceSupportCondition> hashMap2 = new HashMap<String, DynamicColors$DeviceSupportCondition>();
        hashMap2.put("fcnt", dynamicColors$1);
        hashMap2.put("google", dynamicColors$1);
        hashMap2.put("hmd global", dynamicColors$1);
        hashMap2.put("infinix", dynamicColors$1);
        hashMap2.put("infinix mobility limited", dynamicColors$1);
        hashMap2.put("itel", dynamicColors$1);
        hashMap2.put("kyocera", dynamicColors$1);
        hashMap2.put("lenovo", dynamicColors$1);
        hashMap2.put("lge", dynamicColors$1);
        hashMap2.put("meizu", dynamicColors$1);
        hashMap2.put("motorola", dynamicColors$1);
        hashMap2.put("nothing", dynamicColors$1);
        hashMap2.put("oneplus", dynamicColors$1);
        hashMap2.put("oppo", dynamicColors$1);
        hashMap2.put("realme", dynamicColors$1);
        hashMap2.put("robolectric", dynamicColors$1);
        hashMap2.put("samsung", (DynamicColors$DeviceSupportCondition)((Object)hashMap));
        hashMap2.put("sharp", dynamicColors$1);
        hashMap2.put("shift", dynamicColors$1);
        hashMap2.put("sony", dynamicColors$1);
        hashMap2.put("tcl", dynamicColors$1);
        hashMap2.put("tecno", dynamicColors$1);
        hashMap2.put("tecno mobile limited", dynamicColors$1);
        hashMap2.put("vivo", dynamicColors$1);
        hashMap2.put("wingtech", dynamicColors$1);
        hashMap2.put("xiaomi", dynamicColors$1);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = Collections.unmodifiableMap(hashMap2);
        hashMap = new HashMap<String, DynamicColors$1>();
        hashMap.put("asus", dynamicColors$1);
        hashMap.put("jio", dynamicColors$1);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = Collections.unmodifiableMap(hashMap);
        TAG = "DynamicColors";
    }

    private DynamicColors() {
    }

    public static void applyIfAvailable(Activity activity) {
        DynamicColors.applyToActivityIfAvailable(activity);
    }

    public static void applyIfAvailable(Activity activity, int n3) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        DynamicColorsOptions dynamicColorsOptions = dynamicColorsOptions$Builder.setThemeOverlay(n3).build();
        DynamicColors.applyToActivityIfAvailable(activity, dynamicColorsOptions);
    }

    public static void applyIfAvailable(Activity activity, DynamicColors$Precondition object) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        object = dynamicColorsOptions$Builder.setPrecondition((DynamicColors$Precondition)object).build();
        DynamicColors.applyToActivityIfAvailable(activity, (DynamicColorsOptions)object);
    }

    public static void applyToActivitiesIfAvailable(Application application) {
        Object object = new DynamicColorsOptions$Builder();
        object = ((DynamicColorsOptions$Builder)object).build();
        DynamicColors.applyToActivitiesIfAvailable(application, (DynamicColorsOptions)object);
    }

    public static void applyToActivitiesIfAvailable(Application application, int n3) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        DynamicColorsOptions dynamicColorsOptions = dynamicColorsOptions$Builder.setThemeOverlay(n3).build();
        DynamicColors.applyToActivitiesIfAvailable(application, dynamicColorsOptions);
    }

    public static void applyToActivitiesIfAvailable(Application application, int n3, DynamicColors$Precondition dynamicColors$Precondition) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        DynamicColorsOptions dynamicColorsOptions = dynamicColorsOptions$Builder.setThemeOverlay(n3).setPrecondition(dynamicColors$Precondition).build();
        DynamicColors.applyToActivitiesIfAvailable(application, dynamicColorsOptions);
    }

    public static void applyToActivitiesIfAvailable(Application application, DynamicColors$Precondition object) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        object = dynamicColorsOptions$Builder.setPrecondition((DynamicColors$Precondition)object).build();
        DynamicColors.applyToActivitiesIfAvailable(application, (DynamicColorsOptions)object);
    }

    public static void applyToActivitiesIfAvailable(Application application, DynamicColorsOptions dynamicColorsOptions) {
        DynamicColors$DynamicColorsActivityLifecycleCallbacks dynamicColors$DynamicColorsActivityLifecycleCallbacks = new DynamicColors$DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions);
        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)dynamicColors$DynamicColorsActivityLifecycleCallbacks);
    }

    public static void applyToActivityIfAvailable(Activity activity) {
        Object object = new DynamicColorsOptions$Builder();
        object = ((DynamicColorsOptions$Builder)object).build();
        DynamicColors.applyToActivityIfAvailable(activity, (DynamicColorsOptions)object);
    }

    public static void applyToActivityIfAvailable(Activity activity, DynamicColorsOptions object) {
        int n3 = DynamicColors.isDynamicColorAvailable();
        if (n3 == 0) {
            return;
        }
        Object object2 = ((DynamicColorsOptions)object).getContentBasedSeedColor();
        if (object2 == null) {
            n3 = ((DynamicColorsOptions)object).getThemeOverlay();
            if (n3 == 0) {
                object2 = DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE;
                n3 = DynamicColors.getDefaultThemeOverlay((Context)activity, (int[])object2);
            } else {
                n3 = ((DynamicColorsOptions)object).getThemeOverlay();
            }
        } else {
            n3 = 0;
            object2 = null;
        }
        Object object3 = ((DynamicColorsOptions)object).getPrecondition();
        int n4 = object3.shouldApplyDynamicColors(activity, n3);
        if (n4 != 0) {
            object3 = ((DynamicColorsOptions)object).getContentBasedSeedColor();
            if (object3 != null) {
                n4 = ((DynamicColorsOptions)object).getContentBasedSeedColor();
                object3 = Hct.fromInt(n4);
                boolean bl2 = MaterialColors.isLightTheme((Context)activity) ^ true;
                float f5 = DynamicColors.getSystemContrast((Context)activity);
                double d2 = f5;
                object2 = new SchemeContent((Hct)object3, bl2, d2);
                object3 = a.a();
                if (object3 == null) {
                    return;
                }
                n3 = (int)(object3.applyIfPossible((Context)activity, (Map)(object2 = MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues((DynamicScheme)object2))) ? 1 : 0);
                if (n3 == 0) {
                    return;
                }
            } else {
                ThemeUtils.applyThemeOverlay((Context)activity, n3);
            }
            object = ((DynamicColorsOptions)object).getOnAppliedCallback();
            object.onApplied(activity);
        }
    }

    private static int getDefaultThemeOverlay(Context context, int[] nArray) {
        context = context.obtainStyledAttributes(nArray);
        int n3 = context.getResourceId(0, 0);
        context.recycle();
        return n3;
    }

    private static float getSystemContrast(Context context) {
        float f5;
        int n3;
        int n4;
        String string2 = "uimode";
        if ((context = (UiModeManager)context.getSystemService(string2)) != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            f5 = px_1.a((UiModeManager)context);
        } else {
            f5 = 0.0f;
            context = null;
        }
        return f5;
    }

    public static boolean isDynamicColorAvailable() {
        boolean bl2;
        block6: {
            String string2;
            Object object;
            boolean bl3;
            int n3;
            block7: {
                n3 = Build.VERSION.SDK_INT;
                int n4 = 31;
                bl3 = false;
                if (n3 < n4) {
                    return false;
                }
                n4 = tE.a;
                n4 = 33;
                bl2 = true;
                if (n3 >= n4) break block6;
                n4 = 32;
                if (n3 < n4) break block7;
                object = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(object, "CODENAME");
                string2 = "Tiramisu";
                n3 = (int)(tE.a(string2, (String)object) ? 1 : 0);
                if (n3 != 0) break block6;
            }
            object = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
            string2 = Build.MANUFACTURER;
            Locale locale = Locale.ROOT;
            if ((object = (DynamicColors$DeviceSupportCondition)object.get(string2 = string2.toLowerCase(locale))) == null) {
                object = DYNAMIC_COLOR_SUPPORTED_BRANDS;
                string2 = Build.BRAND.toLowerCase(locale);
                object = (DynamicColors$DeviceSupportCondition)object.get(string2);
            }
            if (object != null && (n3 = (int)(object.isSupported() ? 1 : 0)) != 0) {
                bl3 = true;
            }
            return bl3;
        }
        return bl2;
    }

    public static Context wrapContextIfAvailable(Context context) {
        return DynamicColors.wrapContextIfAvailable(context, 0);
    }

    public static Context wrapContextIfAvailable(Context context, int n3) {
        DynamicColorsOptions$Builder dynamicColorsOptions$Builder = new DynamicColorsOptions$Builder();
        DynamicColorsOptions dynamicColorsOptions = dynamicColorsOptions$Builder.setThemeOverlay(n3).build();
        return DynamicColors.wrapContextIfAvailable(context, dynamicColorsOptions);
    }

    public static Context wrapContextIfAvailable(Context context, DynamicColorsOptions object) {
        Object object2;
        int n3 = DynamicColors.isDynamicColorAvailable();
        if (n3 == 0) {
            return context;
        }
        n3 = ((DynamicColorsOptions)object).getThemeOverlay();
        if (n3 == 0) {
            object2 = DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE;
            n3 = DynamicColors.getDefaultThemeOverlay(context, object2);
        }
        if (n3 == 0) {
            return context;
        }
        Object object3 = ((DynamicColorsOptions)object).getContentBasedSeedColor();
        if (object3 != null) {
            int n4 = ((DynamicColorsOptions)object).getContentBasedSeedColor();
            object = Hct.fromInt(n4);
            boolean bl2 = MaterialColors.isLightTheme(context) ^ true;
            float f5 = DynamicColors.getSystemContrast(context);
            double d2 = f5;
            object3 = new SchemeContent((Hct)object, bl2, d2);
            object = a.a();
            if (object != null) {
                object2 = MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues((DynamicScheme)object3);
                return object.wrapContextIfPossible(context, (Map)object2);
            }
        }
        object = new ContextThemeWrapper(context, n3);
        return object;
    }
}

