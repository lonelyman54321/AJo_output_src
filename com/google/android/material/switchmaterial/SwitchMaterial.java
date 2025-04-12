/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class SwitchMaterial
extends SwitchCompat {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] ENABLED_CHECKED_STATES;
    private final ElevationOverlayProvider elevationOverlayProvider;
    private ColorStateList materialThemeColorsThumbTintList;
    private ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    static {
        int[][] nArrayArray = new int[4][];
        int n3 = 16842910;
        int n4 = 0x10100A0;
        int[] nArray = new int[]{n3, n4};
        nArrayArray[0] = nArray;
        int n7 = -16842912;
        int[] nArray2 = new int[]{n3, n7};
        nArrayArray[1] = nArray2;
        n3 = -16842910;
        int[] nArray3 = new int[]{n3, n4};
        nArrayArray[2] = nArray3;
        nArray2 = new int[]{n3, n7};
        nArrayArray[3] = nArray2;
        ENABLED_CHECKED_STATES = nArrayArray;
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.switchStyle;
        this(context, attributeSet, n3);
    }

    public SwitchMaterial(Context object, AttributeSet attributeSet, int n3) {
        boolean bl2;
        int n4 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, n4);
        super((Context)object, attributeSet, n3);
        Context context = this.getContext();
        super(context);
        this.elevationOverlayProvider = object;
        int[] nArray = R$styleable.SwitchMaterial;
        int[] nArray2 = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        n3 = R$styleable.SwitchMaterial_useMaterialThemeColors;
        this.useMaterialThemeColors = bl2 = attributeSet.getBoolean(n3, false);
        attributeSet.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        ColorStateList colorStateList = this.materialThemeColorsThumbTintList;
        if (colorStateList == null) {
            int n3;
            int n4 = R$attr.colorSurface;
            n4 = MaterialColors.getColor((View)this, n4);
            int n7 = R$attr.colorControlActivated;
            n7 = MaterialColors.getColor((View)this, n7);
            Resources resources = this.getResources();
            int n8 = R$dimen.mtrl_switch_thumb_elevation;
            float f5 = resources.getDimension(n8);
            Object object = this.elevationOverlayProvider;
            n8 = (int)(((ElevationOverlayProvider)object).isThemeElevationOverlayEnabled() ? 1 : 0);
            if (n8 != 0) {
                float f6 = ViewUtils.getParentAbsoluteElevation((View)this);
                f5 += f6;
            }
            int n10 = this.elevationOverlayProvider.compositeOverlayIfNeeded(n4, f5);
            object = ENABLED_CHECKED_STATES;
            int n14 = ((Object)object).length;
            int[] nArray = new int[n14];
            nArray[0] = n3 = MaterialColors.layer(n4, n7, 1.0f);
            nArray[1] = n10;
            n3 = 1052938076;
            float f7 = 0.38f;
            n4 = MaterialColors.layer(n4, n7, f7);
            n7 = 2;
            nArray[n7] = n4;
            n4 = 3;
            nArray[n4] = n10;
            this.materialThemeColorsThumbTintList = colorStateList = new ColorStateList((int[][])object, nArray);
        }
        return this.materialThemeColorsThumbTintList;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        Object object = this.materialThemeColorsTrackTintList;
        if (object == null) {
            ColorStateList colorStateList;
            int n3;
            object = ENABLED_CHECKED_STATES;
            int n4 = ((ColorStateList)object).length;
            int[] nArray = new int[n4];
            int n7 = R$attr.colorSurface;
            n7 = MaterialColors.getColor((View)this, n7);
            int n8 = R$attr.colorControlActivated;
            n8 = MaterialColors.getColor((View)this, n8);
            int n10 = R$attr.colorOnSurface;
            n10 = MaterialColors.getColor((View)this, n10);
            nArray[0] = n3 = MaterialColors.layer(n7, n8, 0.54f);
            nArray[1] = n3 = MaterialColors.layer(n7, n10, 0.32f);
            n3 = 2;
            float f5 = 0.12f;
            nArray[n3] = n8 = MaterialColors.layer(n7, n8, f5);
            n8 = 3;
            nArray[n8] = n7 = MaterialColors.layer(n7, n10, f5);
            this.materialThemeColorsTrackTintList = colorStateList = new ColorStateList((int[][])object, nArray);
        }
        return this.materialThemeColorsTrackTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void onAttachedToWindow() {
        ColorStateList colorStateList;
        super.onAttachedToWindow();
        boolean bl2 = this.useMaterialThemeColors;
        if (bl2 && (colorStateList = this.getThumbTintList()) == null) {
            colorStateList = this.getMaterialThemeColorsThumbTintList();
            this.setThumbTintList(colorStateList);
        }
        if ((bl2 = this.useMaterialThemeColors) && (colorStateList = this.getTrackTintList()) == null) {
            colorStateList = this.getMaterialThemeColorsTrackTintList();
            this.setTrackTintList(colorStateList);
        }
    }

    public void setUseMaterialThemeColors(boolean bl2) {
        this.useMaterialThemeColors = bl2;
        if (bl2) {
            ColorStateList colorStateList = this.getMaterialThemeColorsThumbTintList();
            this.setThumbTintList(colorStateList);
            colorStateList = this.getMaterialThemeColorsTrackTintList();
            this.setTrackTintList(colorStateList);
        } else {
            bl2 = false;
            Object var2_3 = null;
            this.setThumbTintList(null);
            this.setTrackTintList(null);
        }
    }
}

