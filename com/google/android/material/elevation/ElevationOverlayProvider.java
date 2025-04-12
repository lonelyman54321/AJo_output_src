/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.view.View
 */
package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int)Math.round(5.1000000000000005);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        int n3 = R$attr.elevationOverlayEnabled;
        boolean bl2 = MaterialAttributes.resolveBoolean(context, n3, false);
        n3 = R$attr.elevationOverlayColor;
        int n4 = MaterialColors.getColor(context, n3, 0);
        n3 = R$attr.elevationOverlayAccentColor;
        int n7 = MaterialColors.getColor(context, n3, 0);
        n3 = R$attr.colorSurface;
        int n8 = MaterialColors.getColor(context, n3, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this(bl2, n4, n7, n8, f5);
    }

    public ElevationOverlayProvider(boolean bl2, int n3, int n4, int n7, float f5) {
        this.elevationOverlayEnabled = bl2;
        this.elevationOverlayColor = n3;
        this.elevationOverlayAccentColor = n4;
        this.colorSurface = n7;
        this.displayDensity = f5;
    }

    private boolean isThemeSurfaceColor(int n3) {
        int n4;
        n3 = (n3 = hZ.i(n3, 255)) == (n4 = this.colorSurface) ? 1 : 0;
        return n3 != 0;
    }

    public int calculateOverlayAlpha(float f5) {
        return Math.round(this.calculateOverlayAlphaFraction(f5) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f5) {
        float f6;
        float f7 = this.displayDensity;
        float f8 = f7 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object > 0 && (object = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) > 0) {
            return Math.min(((float)Math.log1p(f5 / f7) * 4.5f + 2.0f) / 100.0f, 1.0f);
        }
        return 0.0f;
    }

    public int compositeOverlay(int n3, float f5) {
        f5 = this.calculateOverlayAlphaFraction(f5);
        int n4 = Color.alpha((int)n3);
        n3 = hZ.i(n3, 255);
        int n7 = this.elevationOverlayColor;
        n3 = MaterialColors.layer(n3, n7, f5);
        n7 = 0;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0 && (object = (Object)this.elevationOverlayAccentColor) != false) {
            n7 = OVERLAY_ACCENT_COLOR_ALPHA;
            object = hZ.i((int)object, n7);
            n3 = MaterialColors.layer(n3, (int)object);
        }
        return hZ.i(n3, n4);
    }

    public int compositeOverlay(int n3, float f5, View view) {
        float f6 = this.getParentAbsoluteElevation(view) + f5;
        return this.compositeOverlay(n3, f6);
    }

    public int compositeOverlayIfNeeded(int n3, float f5) {
        boolean bl2 = this.elevationOverlayEnabled;
        if (bl2 && (bl2 = this.isThemeSurfaceColor(n3))) {
            n3 = this.compositeOverlay(n3, f5);
        }
        return n3;
    }

    public int compositeOverlayIfNeeded(int n3, float f5, View view) {
        float f6 = this.getParentAbsoluteElevation(view) + f5;
        return this.compositeOverlayIfNeeded(n3, f6);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5) {
        int n3 = this.colorSurface;
        return this.compositeOverlayIfNeeded(n3, f5);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f5, View view) {
        float f6 = this.getParentAbsoluteElevation(view) + f5;
        return this.compositeOverlayWithThemeSurfaceColorIfNeeded(f6);
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }
}

