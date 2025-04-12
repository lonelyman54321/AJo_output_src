/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 */
package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Context context, Typeface typeface) {
        return TypefaceUtils.maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Configuration configuration, Typeface typeface) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4 && (n3 = Qf.a(configuration)) != (n4 = -1 >>> 1) && (n3 = Qf.a(configuration)) != 0 && typeface != null) {
            n3 = zt3.a(typeface);
            int n7 = PK1.b(Qf.a(configuration) + n3, 1, 1000);
            n3 = (int)(typeface.isItalic() ? 1 : 0);
            return gt2_0.a(typeface, n7, n3 != 0);
        }
        return null;
    }
}

