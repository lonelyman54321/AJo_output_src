/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.FadeThroughUtils;

public class FadeThroughDrawable
extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;

    public FadeThroughDrawable(Drawable object, Drawable drawable2) {
        this.fadeOutDrawable = object = object.getConstantState().newDrawable().mutate();
        this.fadeInDrawable = object = drawable2.getConstantState().newDrawable().mutate();
        object.setAlpha(0);
        object = new float[2];
        this.alphas = (float[])object;
    }

    public void draw(Canvas canvas) {
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
    }

    public int getIntrinsicHeight() {
        int n3 = this.fadeOutDrawable.getIntrinsicHeight();
        int n4 = this.fadeInDrawable.getIntrinsicHeight();
        return Math.max(n3, n4);
    }

    public int getIntrinsicWidth() {
        int n3 = this.fadeOutDrawable.getIntrinsicWidth();
        int n4 = this.fadeInDrawable.getIntrinsicWidth();
        return Math.max(n3, n4);
    }

    public int getMinimumHeight() {
        int n3 = this.fadeOutDrawable.getMinimumHeight();
        int n4 = this.fadeInDrawable.getMinimumHeight();
        return Math.max(n3, n4);
    }

    public int getMinimumWidth() {
        int n3 = this.fadeOutDrawable.getMinimumWidth();
        int n4 = this.fadeInDrawable.getMinimumWidth();
        return Math.max(n3, n4);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        Drawable drawable2 = this.fadeOutDrawable;
        boolean bl2 = drawable2.isStateful();
        if (!bl2 && !(bl2 = (drawable2 = this.fadeInDrawable).isStateful())) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public void setAlpha(int n3) {
        float f5 = this.progress;
        float f6 = 0.5f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object <= 0) {
            Drawable drawable2 = this.fadeOutDrawable;
            drawable2.setAlpha(n3);
            Drawable drawable3 = this.fadeInDrawable;
            drawable3.setAlpha(0);
        } else {
            this.fadeOutDrawable.setAlpha(0);
            Drawable drawable4 = this.fadeInDrawable;
            drawable4.setAlpha(n3);
        }
        this.invalidateSelf();
    }

    public void setBounds(int n3, int n4, int n7, int n8) {
        super.setBounds(n3, n4, n7, n8);
        this.fadeOutDrawable.setBounds(n3, n4, n7, n8);
        this.fadeInDrawable.setBounds(n3, n4, n7, n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.fadeOutDrawable.setColorFilter(colorFilter);
        this.fadeInDrawable.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public void setProgress(float f5) {
        float f6 = this.progress;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.progress = f5;
            float[] fArray = this.alphas;
            FadeThroughUtils.calculateFadeOutAndInAlphas(f5, fArray);
            Drawable drawable2 = this.fadeOutDrawable;
            f6 = this.alphas[0];
            float f8 = 255.0f;
            object = (int)(f6 * f8);
            drawable2.setAlpha((int)object);
            drawable2 = this.fadeInDrawable;
            fArray = this.alphas;
            int n3 = 1;
            f6 = fArray[n3] * f8;
            object = (int)f6;
            drawable2.setAlpha((int)object);
            this.invalidateSelf();
        }
    }

    public boolean setState(int[] nArray) {
        Drawable drawable2 = this.fadeOutDrawable;
        boolean bl2 = drawable2.setState(nArray);
        Drawable drawable3 = this.fadeInDrawable;
        boolean bl3 = drawable3.setState(nArray);
        if (!bl2 && !bl3) {
            bl3 = false;
            nArray = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }
}

