/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.util.TypedValue
 *  android.view.View
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.color.ColorRoles;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int n3, int n4) {
        int n7 = Color.alpha((int)n3) * n4 / 255;
        return hZ.i(n3, n7);
    }

    public static int getColor(Context object, int n3, int n4) {
        if ((object = MaterialColors.getColorOrNull((Context)object, n3)) != null) {
            n4 = (Integer)object;
        }
        return n4;
    }

    public static int getColor(Context context, int n3, String string2) {
        TypedValue typedValue = MaterialAttributes.resolveTypedValueOrThrow(context, n3, string2);
        return MaterialColors.resolveColor(context, typedValue);
    }

    public static int getColor(View view, int n3) {
        Context context = view.getContext();
        view = MaterialAttributes.resolveTypedValueOrThrow(view, n3);
        return MaterialColors.resolveColor(context, (TypedValue)view);
    }

    public static int getColor(View view, int n3, int n4) {
        return MaterialColors.getColor(view.getContext(), n3, n4);
    }

    public static Integer getColorOrNull(Context object, int n3) {
        TypedValue typedValue = MaterialAttributes.resolve(object, n3);
        if (typedValue != null) {
            int n4 = MaterialColors.resolveColor(object, typedValue);
            object = n4;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    private static int getColorRole(int n3, int n4) {
        Hct hct = Hct.fromInt(n3);
        double d2 = n4;
        hct.setTone(d2);
        return hct.toInt();
    }

    private static int getColorRole(int n3, int n4, int n7) {
        Hct hct = Hct.fromInt(MaterialColors.getColorRole(n3, n4));
        double d2 = n7;
        hct.setChroma(d2);
        return hct.toInt();
    }

    public static ColorRoles getColorRoles(int n3, boolean bl2) {
        ColorRoles colorRoles;
        int n4 = 90;
        if (bl2) {
            int n7 = MaterialColors.getColorRole(n3, 40);
            int n8 = MaterialColors.getColorRole(n3, 100);
            n4 = MaterialColors.getColorRole(n3, n4);
            int n10 = 10;
            n3 = MaterialColors.getColorRole(n3, n10);
            colorRoles = new ColorRoles(n7, n8, n4, n3);
        } else {
            int n14 = MaterialColors.getColorRole(n3, 80);
            int n15 = MaterialColors.getColorRole(n3, 20);
            int n16 = MaterialColors.getColorRole(n3, 30);
            n3 = MaterialColors.getColorRole(n3, n4);
            colorRoles = new ColorRoles(n14, n15, n16, n3);
        }
        return colorRoles;
    }

    public static ColorRoles getColorRoles(Context context, int n3) {
        boolean bl2 = MaterialColors.isLightTheme(context);
        return MaterialColors.getColorRoles(n3, bl2);
    }

    public static ColorStateList getColorStateList(Context object, int n3, ColorStateList colorStateList) {
        TypedValue typedValue = MaterialAttributes.resolve(object, n3);
        if ((object = typedValue != null ? MaterialColors.resolveColorStateList(object, typedValue) : null) != null) {
            colorStateList = object;
        }
        return colorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int n3) {
        TypedValue typedValue = MaterialAttributes.resolve(context, n3);
        if (typedValue == null) {
            return null;
        }
        int n4 = typedValue.resourceId;
        if (n4 != 0) {
            return t70.getColorStateList(context, n4);
        }
        int n7 = typedValue.data;
        if (n7 != 0) {
            return ColorStateList.valueOf((int)n7);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(Context context, int n3) {
        int n4 = MaterialColors.isLightTheme(context);
        n4 = n4 != 0 ? 94 : 12;
        return MaterialColors.getColorRole(n3, n4, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int n3) {
        int n4 = MaterialColors.isLightTheme(context);
        n4 = n4 != 0 ? 92 : 17;
        return MaterialColors.getColorRole(n3, n4, 6);
    }

    public static int harmonize(int n3, int n4) {
        return Blend.harmonize(n3, n4);
    }

    public static int harmonizeWithPrimary(Context context, int n3) {
        int n4 = R$attr.colorPrimary;
        String string2 = MaterialColors.class.getCanonicalName();
        int n7 = MaterialColors.getColor(context, n4, string2);
        return MaterialColors.harmonize(n3, n7);
    }

    public static boolean isColorLight(int n3) {
        double d2;
        double d5;
        double d7;
        n3 = n3 != 0 && (n3 = (int)((d7 = (d5 = hZ.e(n3)) - (d2 = 0.5)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1))) > 0 ? 1 : 0;
        return n3 != 0;
    }

    public static boolean isLightTheme(Context context) {
        int n3 = R$attr.isLightTheme;
        return MaterialAttributes.resolveBoolean(context, n3, true);
    }

    public static int layer(int n3, int n4) {
        return hZ.g(n4, n3);
    }

    public static int layer(int n3, int n4, float f5) {
        int n7 = Math.round((float)Color.alpha((int)n4) * f5);
        n4 = hZ.i(n4, n7);
        return MaterialColors.layer(n3, n4);
    }

    public static int layer(View view, int n3, int n4) {
        return MaterialColors.layer(view, n3, n4, 1.0f);
    }

    public static int layer(View view, int n3, int n4, float f5) {
        n3 = MaterialColors.getColor(view, n3);
        int n7 = MaterialColors.getColor(view, n4);
        return MaterialColors.layer(n3, n7, f5);
    }

    private static int resolveColor(Context context, TypedValue typedValue) {
        int n3 = typedValue.resourceId;
        if (n3 != 0) {
            return t70.getColor(context, n3);
        }
        return typedValue.data;
    }

    private static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        int n3 = typedValue.resourceId;
        if (n3 != 0) {
            return t70.getColorStateList(context, n3);
        }
        return ColorStateList.valueOf((int)typedValue.data);
    }
}

