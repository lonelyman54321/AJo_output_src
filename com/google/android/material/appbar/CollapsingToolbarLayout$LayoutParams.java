/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$styleable;

public class CollapsingToolbarLayout$LayoutParams
extends FrameLayout.LayoutParams {
    public static final int COLLAPSE_MODE_OFF = 0;
    public static final int COLLAPSE_MODE_PARALLAX = 2;
    public static final int COLLAPSE_MODE_PIN = 1;
    private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
    int collapseMode = 0;
    float parallaxMult;

    public CollapsingToolbarLayout$LayoutParams(int n3, int n4) {
        super(n3, n4);
        this.parallaxMult = 0.5f;
    }

    public CollapsingToolbarLayout$LayoutParams(int n3, int n4, int n7) {
        super(n3, n4, n7);
        this.parallaxMult = 0.5f;
    }

    public CollapsingToolbarLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        this.parallaxMult = f5 = 0.5f;
        int[] nArray = R$styleable.CollapsingToolbarLayout_Layout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode;
        this.collapseMode = n3 = context.getInt(n3, 0);
        n3 = R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier;
        float f6 = context.getFloat(n3, f5);
        this.setParallaxMultiplier(f6);
        context.recycle();
    }

    public CollapsingToolbarLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.parallaxMult = 0.5f;
    }

    public CollapsingToolbarLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.parallaxMult = 0.5f;
    }

    public CollapsingToolbarLayout$LayoutParams(FrameLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.parallaxMult = 0.5f;
    }

    public CollapsingToolbarLayout$LayoutParams(CollapsingToolbarLayout$LayoutParams collapsingToolbarLayout$LayoutParams) {
        super((FrameLayout.LayoutParams)collapsingToolbarLayout$LayoutParams);
        float f5;
        int n3;
        this.parallaxMult = 0.5f;
        this.collapseMode = n3 = collapsingToolbarLayout$LayoutParams.collapseMode;
        this.parallaxMult = f5 = collapsingToolbarLayout$LayoutParams.parallaxMult;
    }

    public int getCollapseMode() {
        return this.collapseMode;
    }

    public float getParallaxMultiplier() {
        return this.parallaxMult;
    }

    public void setCollapseMode(int n3) {
        this.collapseMode = n3;
    }

    public void setParallaxMultiplier(float f5) {
        this.parallaxMult = f5;
    }
}

