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
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class ScrimInsetsFrameLayout
extends FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawLeftInsetForeground;
    private boolean drawRightInsetForeground;
    private boolean drawTopInsetForeground;
    Drawable insetForeground;
    Rect insets;
    private Rect tempRect;

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context object, AttributeSet object2, int n3) {
        super(object, object2, n3);
        boolean bl2;
        Rect rect;
        this.tempRect = rect = new Rect();
        this.drawTopInsetForeground = bl2 = true;
        this.drawBottomInsetForeground = bl2;
        this.drawLeftInsetForeground = bl2;
        this.drawRightInsetForeground = bl2;
        int[] nArray = R$styleable.ScrimInsetsFrameLayout;
        int n4 = R$style.Widget_Design_ScrimInsetsFrameLayout;
        int[] nArray2 = new int[]{};
        object = ThemeEnforcement.obtainStyledAttributes(object, object2, nArray, n3, n4, nArray2);
        int n7 = R$styleable.ScrimInsetsFrameLayout_insetForeground;
        object2 = object.getDrawable(n7);
        this.insetForeground = object2;
        object.recycle();
        this.setWillNotDraw(bl2);
        super(this);
        object2 = ViewCompat.a;
        ViewCompat$c.o((View)this, (T72)object);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        Rect rect = this.insets;
        if (rect != null && (rect = this.insetForeground) != null) {
            int n7;
            Rect rect2;
            int n8;
            Rect rect3;
            int n10 = canvas.save();
            float f5 = this.getScrollX();
            float f6 = this.getScrollY();
            canvas.translate(f5, f6);
            boolean bl2 = this.drawTopInsetForeground;
            int n14 = 0;
            f6 = 0.0f;
            Rect rect4 = null;
            if (bl2) {
                rect3 = this.tempRect;
                n8 = this.insets.top;
                rect3.set(0, 0, n3, n8);
                rect3 = this.insetForeground;
                rect2 = this.tempRect;
                rect3.setBounds(rect2);
                rect3 = this.insetForeground;
                rect3.draw(canvas);
            }
            if (bl2 = this.drawBottomInsetForeground) {
                rect3 = this.tempRect;
                n8 = this.insets.bottom;
                n8 = n4 - n8;
                rect3.set(0, n8, n3, n4);
                rect3 = this.insetForeground;
                rect2 = this.tempRect;
                rect3.setBounds(rect2);
                rect3 = this.insetForeground;
                rect3.draw(canvas);
            }
            if (bl2 = this.drawLeftInsetForeground) {
                rect3 = this.tempRect;
                rect2 = this.insets;
                n7 = rect2.top;
                int n15 = rect2.left;
                n8 = rect2.bottom;
                n8 = n4 - n8;
                rect3.set(0, n7, n15, n8);
                rect3 = this.insetForeground;
                rect4 = this.tempRect;
                rect3.setBounds(rect4);
                rect3 = this.insetForeground;
                rect3.draw(canvas);
            }
            if (bl2 = this.drawRightInsetForeground) {
                rect3 = this.tempRect;
                rect4 = this.insets;
                n8 = rect4.right;
                n8 = n3 - n8;
                n7 = rect4.top;
                n14 = rect4.bottom;
                rect3.set(n8, n7, n3, n4 -= n14);
                Drawable drawable2 = this.insetForeground;
                Rect rect5 = this.tempRect;
                drawable2.setBounds(rect5);
                drawable2 = this.insetForeground;
                drawable2.draw(canvas);
            }
            canvas.restoreToCount(n10);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable2 = this.insetForeground;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable2 = this.insetForeground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
    }

    public void onInsetsChanged(f f5) {
    }

    public void setDrawBottomInsetForeground(boolean bl2) {
        this.drawBottomInsetForeground = bl2;
    }

    public void setDrawLeftInsetForeground(boolean bl2) {
        this.drawLeftInsetForeground = bl2;
    }

    public void setDrawRightInsetForeground(boolean bl2) {
        this.drawRightInsetForeground = bl2;
    }

    public void setDrawTopInsetForeground(boolean bl2) {
        this.drawTopInsetForeground = bl2;
    }

    public void setScrimInsetForeground(Drawable drawable2) {
        this.insetForeground = drawable2;
    }
}

