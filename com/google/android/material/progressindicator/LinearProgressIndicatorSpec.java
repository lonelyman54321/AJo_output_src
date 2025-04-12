/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public final class LinearProgressIndicatorSpec
extends BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;
    public int trackStopIndicatorSize;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.linearProgressIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int n3) {
        int n4 = LinearProgressIndicator.DEF_STYLE_RES;
        this(context, attributeSet, n3, n4);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        int[] nArray = R$styleable.LinearProgressIndicator;
        int n7 = R$attr.linearProgressIndicatorStyle;
        int n8 = LinearProgressIndicator.DEF_STYLE_RES;
        n3 = 0;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n7, n8, nArray2);
        int n10 = R$styleable.LinearProgressIndicator_indeterminateAnimationType;
        n4 = 1;
        this.indeterminateAnimationType = n10 = context.getInt(n10, n4);
        n10 = R$styleable.LinearProgressIndicator_indicatorDirectionLinear;
        this.indicatorDirection = n10 = context.getInt(n10, 0);
        n10 = R$styleable.LinearProgressIndicator_trackStopIndicatorSize;
        n10 = context.getDimensionPixelSize(n10, 0);
        int n14 = this.trackThickness;
        this.trackStopIndicatorSize = n10 = Math.min(n10, n14);
        context.recycle();
        this.validateSpec();
        int n15 = this.indicatorDirection;
        if (n15 == n4) {
            n3 = 1;
        }
        this.drawHorizontallyInverse = n3;
    }

    public void validateSpec() {
        super.validateSpec();
        int n3 = this.trackStopIndicatorSize;
        if (n3 >= 0) {
            n3 = this.indeterminateAnimationType;
            if (n3 == 0) {
                n3 = this.trackCornerRadius;
                if (n3 > 0 && (n3 = this.indicatorTrackGapSize) == 0) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                    throw illegalArgumentException;
                }
                Object object = this.indicatorColors;
                n3 = ((int[])object).length;
                int n4 = 3;
                if (n3 < n4) {
                    object = new IllegalArgumentException;
                    object("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    throw object;
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Stop indicator size must be >= 0.");
        throw illegalArgumentException;
    }
}

