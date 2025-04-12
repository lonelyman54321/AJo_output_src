/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.Path
 *  android.util.TypedValue
 *  android.view.animation.AnimationUtils
 *  android.view.animation.PathInterpolator
 */
package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.material.resources.MaterialAttributes;

public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] object, int n3) {
        float f5;
        object = object[n3];
        float f6 = Float.parseFloat((String)object);
        float f7 = 0.0f;
        IllegalArgumentException illegalArgumentException = null;
        float f8 = f6 - 0.0f;
        n3 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
        if (n3 >= 0 && (n3 = (int)((f5 = f6 - (f7 = 1.0f)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) {
            return f6;
        }
        StringBuilder stringBuilder = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
        stringBuilder.append(f6);
        object = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private static String getLegacyEasingContent(String string2, String string3) {
        int n3 = string3.length() + 1;
        int n4 = string2.length() + -1;
        return string2.substring(n3, n4);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String object) {
        Object object2 = EASING_TYPE_CUBIC_BEZIER;
        int n3 = MotionUtils.isLegacyEasingType((String)object, (String)object2);
        if (n3 != 0) {
            object = MotionUtils.getLegacyEasingContent((String)object, (String)object2);
            object2 = ",";
            object = object.split((String)object2);
            int n4 = ((String[])object).length;
            n3 = 4;
            float f5 = 5.6E-45f;
            if (n4 == n3) {
                float f6 = MotionUtils.getLegacyControlPoint((String[])object, 0);
                f5 = MotionUtils.getLegacyControlPoint((String[])object, 1);
                float f7 = MotionUtils.getLegacyControlPoint((String[])object, 2);
                float f8 = MotionUtils.getLegacyControlPoint((String[])object, 3);
                PathInterpolator pathInterpolator = new PathInterpolator(f6, f5, f7, f8);
                return pathInterpolator;
            }
            StringBuilder stringBuilder = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            int n7 = ((Path)object).length;
            stringBuilder.append(n7);
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object2 = EASING_TYPE_PATH;
        n3 = MotionUtils.isLegacyEasingType((String)object, (String)object2);
        if (n3 != 0) {
            object = rn2.d(MotionUtils.getLegacyEasingContent((String)object, (String)object2));
            object2 = new PathInterpolator(object);
            return object2;
        }
        object = kp1_0.c("Invalid motion easing type: ", (String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private static boolean isLegacyEasingAttribute(String string2) {
        boolean bl2;
        String string3 = EASING_TYPE_CUBIC_BEZIER;
        boolean bl3 = MotionUtils.isLegacyEasingType(string2, string3);
        if (!bl3 && !(bl2 = MotionUtils.isLegacyEasingType(string2, string3 = EASING_TYPE_PATH))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static boolean isLegacyEasingType(String string2, String string3) {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(EASING_TYPE_FORMAT_START);
        string3 = stringBuilder.toString();
        boolean bl3 = string2.startsWith(string3);
        if (bl3 && (bl2 = string2.endsWith(string3 = EASING_TYPE_FORMAT_END))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static int resolveThemeDuration(Context context, int n3, int n4) {
        return MaterialAttributes.resolveInteger(context, n3, n4);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context object, int n3, TimeInterpolator timeInterpolator) {
        boolean bl2;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = object.getTheme();
        n3 = (int)(theme.resolveAttribute(n3, typedValue, bl2 = true) ? 1 : 0);
        if (n3 == 0) {
            return timeInterpolator;
        }
        n3 = typedValue.type;
        int n4 = 3;
        if (n3 == n4) {
            String string2 = String.valueOf(typedValue.string);
            n4 = (int)(MotionUtils.isLegacyEasingAttribute(string2) ? 1 : 0);
            if (n4 != 0) {
                return MotionUtils.getLegacyThemeInterpolator(string2);
            }
            n3 = typedValue.resourceId;
            return AnimationUtils.loadInterpolator((Context)object, (int)n3);
        }
        object = new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        throw object;
    }
}

