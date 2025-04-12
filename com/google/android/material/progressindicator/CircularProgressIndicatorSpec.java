/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.resources.MaterialResources;

public final class CircularProgressIndicatorSpec
extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.circularProgressIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int n3) {
        int n4 = CircularProgressIndicator.DEF_STYLE_RES;
        this(context, attributeSet, n3, n4);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        int n7;
        Resources resources = context.getResources();
        int n8 = R$dimen.mtrl_progress_circular_size_medium;
        int n10 = resources.getDimensionPixelSize(n8);
        Resources resources2 = context.getResources();
        int n14 = R$dimen.mtrl_progress_circular_inset_medium;
        n8 = resources2.getDimensionPixelSize(n14);
        int[] nArray = R$styleable.CircularProgressIndicator;
        int[] nArray2 = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        n3 = R$styleable.CircularProgressIndicator_indicatorSize;
        n3 = MaterialResources.getDimensionPixelSize(context, (TypedArray)attributeSet, n3, n10);
        n4 = this.trackThickness * 2;
        this.indicatorSize = n3 = Math.max(n3, n4);
        n3 = R$styleable.CircularProgressIndicator_indicatorInset;
        this.indicatorInset = n7 = MaterialResources.getDimensionPixelSize(context, (TypedArray)attributeSet, n3, n8);
        n7 = R$styleable.CircularProgressIndicator_indicatorDirectionCircular;
        this.indicatorDirection = n7 = attributeSet.getInt(n7, 0);
        attributeSet.recycle();
        this.validateSpec();
    }

    public int getIndicatorTrackGapSizeDegree() {
        int n3 = this.indicatorTrackGapSize;
        if (n3 == 0) {
            return 0;
        }
        int n4 = this.indicatorSize;
        int n7 = this.indicatorInset * 2;
        n4 -= n7;
        n7 = this.trackThickness;
        double d2 = (double)(n4 - n7) * Math.PI;
        n4 = this.trackCornerRadius;
        double d5 = n3 + n4;
        return (int)Math.round(360.0 / (d2 /= d5));
    }
}

