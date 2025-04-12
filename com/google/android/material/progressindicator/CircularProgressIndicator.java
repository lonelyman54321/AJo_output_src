/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularDrawingDelegate;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.progressindicator.IndeterminateDrawable;

public class CircularProgressIndicator
extends BaseProgressIndicator {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_CircularProgressIndicator;
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.circularProgressIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int n3) {
        int n4 = DEF_STYLE_RES;
        super(context, attributeSet, n3, n4);
        this.initializeDrawables();
    }

    private void initializeDrawables() {
        Object object = (CircularProgressIndicatorSpec)this.spec;
        Object object2 = new CircularDrawingDelegate((CircularProgressIndicatorSpec)object);
        object = this.getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)this.spec;
        object = IndeterminateDrawable.createCircularDrawable((Context)object, circularProgressIndicatorSpec, object2);
        this.setIndeterminateDrawable((Drawable)object);
        object = this.getContext();
        circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)this.spec;
        object2 = DeterminateDrawable.createCircularDrawable((Context)object, circularProgressIndicatorSpec, object2);
        this.setProgressDrawable((Drawable)object2);
    }

    public CircularProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = new CircularProgressIndicatorSpec(context, attributeSet);
        return circularProgressIndicatorSpec;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec)this.spec).indicatorDirection;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec)this.spec).indicatorInset;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec)this.spec).indicatorSize;
    }

    public void setIndicatorDirection(int n3) {
        ((CircularProgressIndicatorSpec)this.spec).indicatorDirection = n3;
        this.invalidate();
    }

    public void setIndicatorInset(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = baseProgressIndicatorSpec = this.spec;
        baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
        int n4 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec2).indicatorInset;
        if (n4 != n3) {
            baseProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
            ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec).indicatorInset = n3;
            this.invalidate();
        }
    }

    public void setIndicatorSize(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        int n4 = this.getTrackThickness() * 2;
        n3 = Math.max(n3, n4);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = baseProgressIndicatorSpec = this.spec;
        baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
        int n7 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec2).indicatorSize;
        if (n7 != n3) {
            baseProgressIndicatorSpec2 = baseProgressIndicatorSpec;
            baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
            ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec2).indicatorSize = n3;
            baseProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
            baseProgressIndicatorSpec.validateSpec();
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setTrackThickness(int n3) {
        super.setTrackThickness(n3);
        ((CircularProgressIndicatorSpec)this.spec).validateSpec();
    }
}

