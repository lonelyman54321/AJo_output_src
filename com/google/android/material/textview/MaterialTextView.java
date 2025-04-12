/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 */
package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialTextView
extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int n3) {
        context = MaterialThemeOverlay.wrap(context, attributeSet, n3, 0);
        super(context, attributeSet, n3);
        this.initialize(attributeSet, n3, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int n3, int n4) {
        context = MaterialThemeOverlay.wrap(context, attributeSet, n3, n4);
        super(context, attributeSet, n3);
        this.initialize(attributeSet, n3, n4);
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int n3) {
        int[] nArray = R$styleable.MaterialTextAppearance;
        theme = theme.obtainStyledAttributes(n3, nArray);
        Context context = this.getContext();
        int n4 = R$styleable.MaterialTextAppearance_android_lineHeight;
        int n7 = R$styleable.MaterialTextAppearance_lineHeight;
        nArray = new int[]{n4, n7};
        n3 = MaterialTextView.readFirstAvailableDimension(context, (TypedArray)theme, nArray);
        theme.recycle();
        if (n3 >= 0) {
            this.setLineHeight(n3);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        int n3 = R$attr.textAppearanceLineHeightEnabled;
        return MaterialAttributes.resolveBoolean(context, n3, true);
    }

    private static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int n3, int n4) {
        int[] nArray = R$styleable.MaterialTextView;
        theme = theme.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        int n7 = R$styleable.MaterialTextView_android_textAppearance;
        n7 = theme.getResourceId(n7, -1);
        theme.recycle();
        return n7;
    }

    private void initialize(AttributeSet attributeSet, int n3, int n4) {
        int n7;
        Resources.Theme theme;
        boolean bl2;
        Context context = this.getContext();
        boolean bl3 = MaterialTextView.canApplyTextAppearanceLineHeight(context);
        if (bl3 && !(bl2 = MaterialTextView.viewAttrsHasLineHeight(context, theme = context.getTheme(), attributeSet, n3, n4)) && (n7 = MaterialTextView.findViewAppearanceResourceId(theme, attributeSet, n3, n4)) != (n3 = -1)) {
            this.applyLineHeightFromViewAppearance(theme, n7);
        }
    }

    private static int readFirstAvailableDimension(Context context, TypedArray typedArray, int ... nArray) {
        int n3;
        int n4 = -1;
        int n7 = -1;
        for (int i3 = 0; i3 < (n3 = nArray.length) && n7 < 0; ++i3) {
            n7 = nArray[i3];
            n7 = MaterialResources.getDimensionPixelSize(context, typedArray, n7, n4);
        }
        return n7;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet object, int n3, int n4) {
        void var7_10;
        int[] nArray = R$styleable.MaterialTextView;
        theme = theme.obtainStyledAttributes(object, nArray, n3, n4);
        int n7 = R$styleable.MaterialTextView_android_lineHeight;
        n3 = R$styleable.MaterialTextView_lineHeight;
        object = new int[]{n7, n3};
        int bl2 = MaterialTextView.readFirstAvailableDimension(context, (TypedArray)theme, (int[])object);
        theme.recycle();
        int n8 = -1;
        if (bl2 != n8) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            context = null;
        }
        return (boolean)var7_10;
    }

    public void setTextAppearance(Context context, int n3) {
        super.setTextAppearance(context, n3);
        boolean bl2 = MaterialTextView.canApplyTextAppearanceLineHeight(context);
        if (bl2) {
            context = context.getTheme();
            this.applyLineHeightFromViewAppearance((Resources.Theme)context, n3);
        }
    }
}

