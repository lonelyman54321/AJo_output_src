/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 */
package com.google.android.material.resources;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;

public class MaterialAttributes {
    public static TypedValue resolve(Context context, int n3) {
        boolean bl2;
        TypedValue typedValue = new TypedValue();
        boolean bl3 = (context = context.getTheme()).resolveAttribute(n3, typedValue, bl2 = true);
        if (bl3) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int n3, boolean bl2) {
        int n4;
        if ((context = MaterialAttributes.resolve(context, n3)) != null && (n3 = context.type) == (n4 = 18)) {
            int n7 = context.data;
            bl2 = n7 != 0;
        }
        return bl2;
    }

    public static boolean resolveBooleanOrThrow(Context context, int n3, String string2) {
        int n4 = MaterialAttributes.resolveOrThrow(context, n3, string2);
        if (n4) {
            n4 = 1;
        } else {
            n4 = 0;
            context = null;
        }
        return n4 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int resolveDimension(Context context, int n3, int n4) {
        float f5;
        int n7;
        int n8;
        TypedValue typedValue = MaterialAttributes.resolve(context, n3);
        if (typedValue != null && (n8 = typedValue.type) == (n7 = 5)) {
            context = context.getResources().getDisplayMetrics();
            f5 = typedValue.getDimension((DisplayMetrics)context);
            return (int)f5;
        }
        context = context.getResources();
        f5 = context.getDimension(n4);
        return (int)f5;
    }

    public static int resolveInteger(Context context, int n3, int n4) {
        int n7;
        if ((context = MaterialAttributes.resolve(context, n3)) != null && (n3 = context.type) == (n7 = 16)) {
            n4 = context.data;
        }
        return n4;
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        int n3 = R$attr.minTouchTargetSize;
        int n4 = R$dimen.mtrl_min_touch_target_size;
        return MaterialAttributes.resolveDimension(context, n3, n4);
    }

    public static int resolveOrThrow(Context context, int n3, String string2) {
        return MaterialAttributes.resolveTypedValueOrThrow((Context)context, (int)n3, (String)string2).data;
    }

    public static int resolveOrThrow(View view, int n3) {
        return MaterialAttributes.resolveTypedValueOrThrow((View)view, (int)n3).data;
    }

    public static TypedValue resolveTypedValueOrThrow(Context object, int n3, String string2) {
        Object object2 = MaterialAttributes.resolve(object, n3);
        if (object2 != null) {
            return object2;
        }
        object = object.getResources().getResourceName(n3);
        Object[] objectArray = new Object[]{string2, object};
        object = String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", objectArray);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static TypedValue resolveTypedValueOrThrow(View object, int n3) {
        Context context = object.getContext();
        object = object.getClass().getCanonicalName();
        return MaterialAttributes.resolveTypedValueOrThrow(context, n3, (String)object);
    }
}

