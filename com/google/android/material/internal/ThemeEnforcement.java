/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialAttributes;

public final class ThemeEnforcement {
    private static final int[] APPCOMPAT_CHECK_ATTRS;
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final int[] MATERIAL_CHECK_ATTRS;
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";

    static {
        int n3 = R$attr.colorPrimary;
        APPCOMPAT_CHECK_ATTRS = new int[]{n3};
        n3 = R$attr.colorPrimaryVariant;
        MATERIAL_CHECK_ATTRS = new int[]{n3};
    }

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(Context context) {
        int[] nArray = APPCOMPAT_CHECK_ATTRS;
        ThemeEnforcement.checkTheme(context, nArray, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(Context context, AttributeSet attributeSet, int n3, int n4) {
        int[] nArray = R$styleable.ThemeEnforcement;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        n3 = R$styleable.ThemeEnforcement_enforceMaterialTheme;
        n4 = 0;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        attributeSet.recycle();
        if (n3 != 0) {
            int n7;
            boolean bl2;
            attributeSet = new TypedValue();
            Resources.Theme theme = context.getTheme();
            n3 = (int)(theme.resolveAttribute(n4 = R$attr.isMaterialTheme, (TypedValue)attributeSet, bl2 = true) ? 1 : 0);
            if (n3 == 0 || (n3 = attributeSet.type) == (n4 = 18) && (n7 = attributeSet.data) == 0) {
                ThemeEnforcement.checkMaterialTheme(context);
            }
        }
        ThemeEnforcement.checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(Context context) {
        int[] nArray = MATERIAL_CHECK_ATTRS;
        ThemeEnforcement.checkTheme(context, nArray, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(Context object, AttributeSet attributeSet, int[] nArray, int n3, int n4, int ... nArray2) {
        int n7;
        Object object2 = R$styleable.ThemeEnforcement;
        object2 = object.obtainStyledAttributes(attributeSet, object2, n3, n4);
        int n8 = R$styleable.ThemeEnforcement_enforceTextAppearance;
        int n10 = 0;
        if ((n8 = (int)(object2.getBoolean(n8, false) ? 1 : 0)) == 0) {
            object2.recycle();
            return;
        }
        if (nArray2 != null && (n8 = nArray2.length) != 0) {
            n7 = (int)(ThemeEnforcement.isCustomTextAppearanceValid(object, attributeSet, nArray, n3, n4, nArray2) ? 1 : 0);
        } else {
            n7 = R$styleable.ThemeEnforcement_android_textAppearance;
            int n14 = -1;
            if ((n7 = object2.getResourceId(n7, n14)) != n14) {
                n10 = 1;
            }
            n7 = n10;
        }
        object2.recycle();
        if (n7 != 0) {
            return;
        }
        object = new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        throw object;
    }

    private static void checkTheme(Context object, int[] object2, String string2) {
        boolean bl2 = ThemeEnforcement.isTheme(object, object2);
        if (bl2) {
            return;
        }
        object2 = cP.a("The style on this component requires your app theme to be ", string2, " (or a descendant).");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static boolean isAppCompatTheme(Context context) {
        int[] nArray = APPCOMPAT_CHECK_ATTRS;
        return ThemeEnforcement.isTheme(context, nArray);
    }

    private static boolean isCustomTextAppearanceValid(Context context, AttributeSet attributeSet, int[] nArray, int n3, int n4, int ... nArray2) {
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        int n7 = nArray2.length;
        nArray = null;
        for (n3 = 0; n3 < n7; ++n3) {
            n4 = nArray2[n3];
            int n8 = -1;
            if ((n4 = context.getResourceId(n4, n8)) != n8) continue;
            context.recycle();
            return false;
        }
        context.recycle();
        return true;
    }

    public static boolean isMaterial3Theme(Context context) {
        int n3 = R$attr.isMaterial3Theme;
        return MaterialAttributes.resolveBoolean(context, n3, false);
    }

    public static boolean isMaterialTheme(Context context) {
        int[] nArray = MATERIAL_CHECK_ATTRS;
        return ThemeEnforcement.isTheme(context, nArray);
    }

    private static boolean isTheme(Context context, int[] nArray) {
        int n3;
        context = context.obtainStyledAttributes(nArray);
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = (int)(context.hasValue(i3) ? 1 : 0);
            if (n3 != 0) continue;
            context.recycle();
            return false;
        }
        context.recycle();
        return true;
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] nArray, int n3, int n4, int ... nArray2) {
        ThemeEnforcement.checkCompatibleTheme(context, attributeSet, n3, n4);
        ThemeEnforcement.checkTextAppearance(context, attributeSet, nArray, n3, n4, nArray2);
        return context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
    }

    public static Tn3 obtainTintedStyledAttributes(Context context, AttributeSet attributeSet, int[] nArray, int n3, int n4, int ... nArray2) {
        ThemeEnforcement.checkCompatibleTheme(context, attributeSet, n3, n4);
        ThemeEnforcement.checkTextAppearance(context, attributeSet, nArray, n3, n4, nArray2);
        return Tn3.f(context, attributeSet, nArray, n3, n4);
    }
}

