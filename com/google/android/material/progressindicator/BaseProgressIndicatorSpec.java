/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors;
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int n3, int n4) {
        Object object = new int[]{};
        this.indicatorColors = object;
        object = context.getResources();
        int n7 = R$dimen.mtrl_progress_track_thickness;
        int n8 = object.getDimensionPixelSize(n7);
        int[] nArray = R$styleable.BaseProgressIndicator;
        int[] nArray2 = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        n3 = R$styleable.BaseProgressIndicator_trackThickness;
        this.trackThickness = n3 = MaterialResources.getDimensionPixelSize(context, (TypedArray)attributeSet, n3, n8);
        n3 = R$styleable.BaseProgressIndicator_trackCornerRadius;
        n3 = MaterialResources.getDimensionPixelSize(context, (TypedArray)attributeSet, n3, 0);
        n4 = this.trackThickness / 2;
        this.trackCornerRadius = n3 = Math.min(n3, n4);
        n3 = R$styleable.BaseProgressIndicator_showAnimationBehavior;
        this.showAnimationBehavior = n3 = attributeSet.getInt(n3, 0);
        n3 = R$styleable.BaseProgressIndicator_hideAnimationBehavior;
        this.hideAnimationBehavior = n3 = attributeSet.getInt(n3, 0);
        n3 = R$styleable.BaseProgressIndicator_indicatorTrackGapSize;
        this.indicatorTrackGapSize = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        this.loadIndicatorColors(context, (TypedArray)attributeSet);
        this.loadTrackColor(context, (TypedArray)attributeSet);
        attributeSet.recycle();
    }

    private void loadIndicatorColors(Context object, TypedArray typedArray) {
        int n3 = R$styleable.BaseProgressIndicator_indicatorColor;
        n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
        int n4 = -1;
        if (n3 == 0) {
            int n7 = R$attr.colorPrimary;
            int n8 = MaterialColors.getColor(object, n7, n4);
            object = new int[]{n8};
            this.indicatorColors = (int[])object;
            return;
        }
        n3 = R$styleable.BaseProgressIndicator_indicatorColor;
        TypedValue typedValue = typedArray.peekValue(n3);
        n3 = typedValue.type;
        int n10 = 1;
        if (n3 != n10) {
            int n14 = R$styleable.BaseProgressIndicator_indicatorColor;
            n14 = typedArray.getColor(n14, n4);
            object = new int[]{n14};
            this.indicatorColors = (int[])object;
            return;
        }
        object = object.getResources();
        n3 = R$styleable.BaseProgressIndicator_indicatorColor;
        int n15 = typedArray.getResourceId(n3, n4);
        object = object.getIntArray(n15);
        this.indicatorColors = (int[])object;
        int n16 = ((Context)object).length;
        if (n16 != 0) {
            return;
        }
        object = new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        throw object;
    }

    private void loadTrackColor(Context context, TypedArray object) {
        int n3;
        int n4 = R$styleable.BaseProgressIndicator_trackColor;
        if ((n4 = (int)(object.hasValue(n4) ? 1 : 0)) != 0) {
            int n7 = R$styleable.BaseProgressIndicator_trackColor;
            this.trackColor = n7 = object.getColor(n7, -1);
            return;
        }
        this.trackColor = n3 = this.indicatorColors[0];
        context = context.getTheme();
        object = new int[]{0x1010033};
        context = context.obtainStyledAttributes((int[])object);
        float f5 = context.getFloat(0, 0.2f);
        context.recycle();
        int n8 = (int)(f5 * 255.0f);
        this.trackColor = n8 = MaterialColors.compositeARGBWithAlpha(this.trackColor, n8);
    }

    public boolean isHideAnimationEnabled() {
        int n3 = this.hideAnimationBehavior;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isShowAnimationEnabled() {
        int n3 = this.showAnimationBehavior;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public void validateSpec() {
        int n3 = this.indicatorTrackGapSize;
        if (n3 >= 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        throw illegalArgumentException;
    }
}

