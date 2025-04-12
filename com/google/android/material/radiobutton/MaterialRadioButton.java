/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialRadioButton
extends AppCompatRadioButton {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES;
    private ColorStateList materialThemeColorsTintList;
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

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.radioButtonStyle;
        this(context, attributeSet, n3);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int n3) {
        int n4 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, attributeSet, n3, n4);
        super(context, attributeSet, n3);
        context = this.getContext();
        int[] nArray = R$styleable.MaterialRadioButton;
        int[] nArray2 = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        n3 = R$styleable.MaterialRadioButton_buttonTint;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.MaterialRadioButton_buttonTint;
            context = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
            this.setButtonTintList((ColorStateList)context);
        }
        int n7 = R$styleable.MaterialRadioButton_useMaterialThemeColors;
        n7 = (int)(attributeSet.getBoolean(n7, false) ? 1 : 0);
        this.useMaterialThemeColors = n7;
        attributeSet.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.materialThemeColorsTintList;
        if (colorStateList == null) {
            int n3;
            int n4 = R$attr.colorControlActivated;
            n4 = MaterialColors.getColor((View)this, n4);
            int n7 = R$attr.colorOnSurface;
            n7 = MaterialColors.getColor((View)this, n7);
            int n8 = R$attr.colorSurface;
            n8 = MaterialColors.getColor((View)this, n8);
            int[][] nArray = ENABLED_CHECKED_STATES;
            int n10 = nArray.length;
            int[] nArray2 = new int[n10];
            nArray2[0] = n4 = MaterialColors.layer(n8, n4, 1.0f);
            nArray2[1] = n4 = MaterialColors.layer(n8, n7, 0.54f);
            float f5 = 0.38f;
            nArray2[2] = n3 = MaterialColors.layer(n8, n7, f5);
            n4 = 3;
            nArray2[n4] = n7 = MaterialColors.layer(n8, n7, f5);
            this.materialThemeColorsTintList = colorStateList = new ColorStateList(nArray, nArray2);
        }
        return this.materialThemeColorsTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void onAttachedToWindow() {
        ColorStateList colorStateList;
        super.onAttachedToWindow();
        boolean bl2 = this.useMaterialThemeColors;
        if (bl2 && (colorStateList = this.getButtonTintList()) == null) {
            bl2 = true;
            this.setUseMaterialThemeColors(bl2);
        }
    }

    public void setUseMaterialThemeColors(boolean bl2) {
        this.useMaterialThemeColors = bl2;
        if (bl2) {
            ColorStateList colorStateList = this.getMaterialThemeColorsTintList();
            this.setButtonTintList(colorStateList);
        } else {
            bl2 = false;
            Object var2_3 = null;
            this.setButtonTintList(null);
        }
    }
}

