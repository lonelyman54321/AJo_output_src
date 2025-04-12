/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.os.Build$VERSION
 *  android.view.ContextThemeWrapper
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$style;
import com.google.android.material.color.HarmonizedColorAttributes;
import com.google.android.material.color.HarmonizedColorsOptions;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.ResourcesLoaderUtils;
import com.google.android.material.color.ThemeUtils;
import java.util.HashMap;
import java.util.Map;

public class HarmonizedColors {
    private static final String TAG = "HarmonizedColors";

    private HarmonizedColors() {
    }

    private static void addHarmonizedColorAttributesToReplacementMap(Map map2, TypedArray typedArray, TypedArray typedArray2, int n3) {
        int n4;
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i3 = 0; i3 < (n4 = typedArray.getIndexCount()); ++i3) {
            int n7;
            n4 = typedArray2.getResourceId(i3, 0);
            if (n4 == 0 || (n7 = typedArray.hasValue(i3)) == 0 || (n7 = ResourcesLoaderUtils.isColorResource(typedArray.getType(i3))) == 0) continue;
            n7 = typedArray.getColor(i3, 0);
            Integer n8 = n4;
            n7 = MaterialColors.harmonize(n7, n3);
            Integer n10 = n7;
            map2.put(n8, n10);
        }
    }

    public static void applyToContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        boolean bl2 = HarmonizedColors.isHarmonizedColorAvailable();
        if (!bl2) {
            return;
        }
        Map map2 = HarmonizedColors.createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
        int n3 = harmonizedColorsOptions.getThemeOverlayResourceId(0);
        bl2 = ResourcesLoaderUtils.addResourcesLoaderToContext(context, map2);
        if (bl2 && n3 != 0) {
            ThemeUtils.applyThemeOverlay(context, n3);
        }
    }

    private static Map createHarmonizedColorReplacementMap(Context context, HarmonizedColorsOptions object) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int n3 = ((HarmonizedColorsOptions)object).getColorAttributeToHarmonizeWith();
        Object object2 = TAG;
        n3 = MaterialColors.getColor(context, n3, (String)object2);
        object2 = ((HarmonizedColorsOptions)object).getColorResourceIds();
        int n4 = ((Object)object2).length;
        ContextThemeWrapper contextThemeWrapper = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object3 = object2[i3];
            int n7 = MaterialColors.harmonize(t70.getColor(context, (int)object3), n3);
            Integer n8 = (int)object3;
            Integer n10 = n7;
            hashMap.put(n8, n10);
        }
        if ((object = ((HarmonizedColorsOptions)object).getColorAttributes()) != null && (n4 = ((Object)(object2 = (Object)((HarmonizedColorAttributes)object).getAttributes())).length) > 0) {
            int n14 = ((HarmonizedColorAttributes)object).getThemeOverlay();
            TypedArray typedArray = context.obtainStyledAttributes((int[])object2);
            if (n14 != 0) {
                contextThemeWrapper = new ContextThemeWrapper(context, n14);
                context = contextThemeWrapper.obtainStyledAttributes((int[])object2);
            } else {
                context = null;
            }
            HarmonizedColors.addHarmonizedColorAttributesToReplacementMap(hashMap, typedArray, (TypedArray)context, n3);
            typedArray.recycle();
            if (context != null) {
                context.recycle();
            }
        }
        return hashMap;
    }

    public static boolean isHarmonizedColorAvailable() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }

    public static Context wrapContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        boolean bl2 = HarmonizedColors.isHarmonizedColorAvailable();
        if (!bl2) {
            return context;
        }
        Map map2 = HarmonizedColors.createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
        int n3 = R$style.ThemeOverlay_Material3_HarmonizedColors_Empty;
        int n4 = harmonizedColorsOptions.getThemeOverlayResourceId(n3);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n4);
        harmonizedColorsOptions = new Configuration();
        contextThemeWrapper.applyOverrideConfiguration((Configuration)harmonizedColorsOptions);
        n4 = (int)(ResourcesLoaderUtils.addResourcesLoaderToContext((Context)contextThemeWrapper, map2) ? 1 : 0);
        if (n4 != 0) {
            context = contextThemeWrapper;
        }
        return context;
    }
}

