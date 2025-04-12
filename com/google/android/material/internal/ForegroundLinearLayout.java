/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.Gravity
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class ForegroundLinearLayout
extends LinearLayoutCompat {
    private Drawable foreground;
    boolean foregroundBoundsChanged;
    private int foregroundGravity;
    protected boolean mForegroundInPadding;
    private final Rect overlayBounds;
    private final Rect selfBounds;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        boolean bl2;
        Rect rect;
        this.selfBounds = rect = new Rect();
        this.overlayBounds = rect = new Rect();
        this.foregroundGravity = 119;
        this.mForegroundInPadding = bl2 = true;
        this.foregroundBoundsChanged = false;
        int[] nArray = R$styleable.ForegroundLinearLayout;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, 0, nArray2);
        int n4 = R$styleable.ForegroundLinearLayout_android_foregroundGravity;
        n3 = this.foregroundGravity;
        this.foregroundGravity = n4 = context.getInt(n4, n3);
        n4 = R$styleable.ForegroundLinearLayout_android_foreground;
        attributeSet = context.getDrawable(n4);
        if (attributeSet != null) {
            this.setForeground((Drawable)attributeSet);
        }
        n4 = R$styleable.ForegroundLinearLayout_foregroundInsidePadding;
        n4 = (int)(context.getBoolean(n4, bl2) ? 1 : 0);
        this.mForegroundInPadding = n4;
        context.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable2 = this.foreground;
        if (drawable2 != null) {
            int n3 = this.foregroundBoundsChanged;
            if (n3 != 0) {
                n3 = 0;
                this.foregroundBoundsChanged = false;
                Rect rect = this.selfBounds;
                Rect rect2 = this.overlayBounds;
                int n4 = this.getRight();
                int n7 = this.getLeft();
                n4 -= n7;
                n7 = this.getBottom();
                int n8 = this.getTop();
                n7 -= n8;
                n8 = (int)(this.mForegroundInPadding ? 1 : 0);
                if (n8 != 0) {
                    rect.set(0, 0, n4, n7);
                } else {
                    n3 = this.getPaddingLeft();
                    n8 = this.getPaddingTop();
                    int n10 = this.getPaddingRight();
                    n4 -= n10;
                    n10 = this.getPaddingBottom();
                    rect.set(n3, n8, n4, n7 -= n10);
                }
                n3 = this.foregroundGravity;
                n4 = drawable2.getIntrinsicWidth();
                n7 = drawable2.getIntrinsicHeight();
                Gravity.apply((int)n3, (int)n4, (int)n7, (Rect)rect, (Rect)rect2);
                drawable2.setBounds(rect2);
            }
            drawable2.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        Drawable drawable2 = this.foreground;
        if (drawable2 != null) {
            drawable2.setHotspot(f5, f6);
        }
    }

    public void drawableStateChanged() {
        boolean bl2;
        super.drawableStateChanged();
        Drawable drawable2 = this.foreground;
        if (drawable2 != null && (bl2 = drawable2.isStateful())) {
            drawable2 = this.foreground;
            int[] nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
    }

    public Drawable getForeground() {
        return this.foreground;
    }

    public int getForegroundGravity() {
        return this.foregroundGravity;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.foreground;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        n3 = (int)(this.foregroundBoundsChanged ? 1 : 0);
        this.foregroundBoundsChanged = bl2 |= n3;
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        this.foregroundBoundsChanged = true;
    }

    public void setForeground(Drawable drawable2) {
        Object object = this.foreground;
        if (object != drawable2) {
            int n3;
            int n4;
            if (object != null) {
                n4 = 0;
                object.setCallback(null);
                object = this.foreground;
                this.unscheduleDrawable((Drawable)object);
            }
            this.foreground = drawable2;
            this.foregroundBoundsChanged = n3 = 1;
            if (drawable2 != null) {
                object = null;
                this.setWillNotDraw(false);
                drawable2.setCallback((Drawable.Callback)this);
                n3 = drawable2.isStateful();
                if (n3 != 0) {
                    object = this.getDrawableState();
                    drawable2.setState((int[])object);
                }
                if ((n3 = this.foregroundGravity) == (n4 = 119)) {
                    object = new Rect();
                    drawable2.getPadding((Rect)object);
                }
            } else {
                this.setWillNotDraw(n3 != 0);
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setForegroundGravity(int n3) {
        int n4 = this.foregroundGravity;
        if (n4 != n3) {
            Drawable drawable2;
            n4 = 0x800007 & n3;
            if (n4 == 0) {
                n4 = 0x800003;
                n3 |= n4;
            }
            if ((n4 = n3 & 0x70) == 0) {
                n3 |= 0x30;
            }
            this.foregroundGravity = n3;
            n4 = 119;
            if (n3 == n4 && (drawable2 = this.foreground) != null) {
                drawable2 = new Rect();
                Drawable drawable3 = this.foreground;
                drawable3.getPadding((Rect)drawable2);
            }
            this.requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.foreground)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

