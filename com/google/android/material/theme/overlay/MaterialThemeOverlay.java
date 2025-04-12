/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.material.theme.overlay;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R$attr;

public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS;
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR;

    static {
        int n3 = R$attr.theme;
        ANDROID_THEME_OVERLAY_ATTRS = new int[]{0x1010000, n3};
        int n4 = R$attr.materialThemeOverlay;
        MATERIAL_THEME_OVERLAY_ATTR = new int[]{n4};
    }

    private MaterialThemeOverlay() {
    }

    private static int obtainAndroidThemeOverlayId(Context context, AttributeSet attributeSet) {
        int[] nArray = ANDROID_THEME_OVERLAY_ATTRS;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = null;
        int n3 = context.getResourceId(0, 0);
        int n4 = 1;
        int n7 = context.getResourceId(n4, 0);
        context.recycle();
        if (n3 == 0) {
            n3 = n7;
        }
        return n3;
    }

    private static int obtainMaterialThemeOverlayId(Context context, AttributeSet attributeSet, int n3, int n4) {
        int[] nArray = MATERIAL_THEME_OVERLAY_ATTR;
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        int n7 = context.getResourceId(0, 0);
        context.recycle();
        return n7;
    }

    /*
     * Unable to fully structure code
     */
    public static Context wrap(Context var0, AttributeSet var1_1, int var2_2, int var3_3) {
        var2_2 = MaterialThemeOverlay.obtainMaterialThemeOverlayId(var0, var1_1, var2_2, var3_3);
        var3_3 = var0 instanceof d80;
        var4_4 = true;
        if (var3_3 == 0) ** GOTO lbl-1000
        var5_5 = var0;
        var5_5 = (d80)var0;
        var3_3 = var5_5.a;
        if (var3_3 == var2_2) {
            var3_3 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var5_5 = null;
        }
        if (var2_2 != 0 && var3_3 == 0) {
            var5_5 = new d80(var0, var2_2);
            var6_6 = MaterialThemeOverlay.obtainAndroidThemeOverlayId(var0, var1_1);
            if (var6_6 != 0) {
                var1_1 = var5_5.getTheme();
                var1_1.applyStyle(var6_6, var4_4);
            }
            return var5_5;
        }
        return var0;
    }
}

