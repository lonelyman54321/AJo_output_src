/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.willy.ratingbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

class PartialView
extends RelativeLayout {
    public ImageView a;
    public ImageView b;
    public int c = 0;
    public int d = 0;

    public PartialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a();
    }

    public PartialView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a();
    }

    public final void a() {
        ImageView imageView;
        int n3;
        float f5 = 1.0f;
        int n4 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n4, n4, f5);
        this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        int n7 = this.c;
        if (n7 == 0) {
            n7 = -2;
            f5 = 0.0f / 0.0f;
        }
        if ((n3 = this.d) != 0) {
            n4 = n3;
        }
        layoutParams = new RelativeLayout.LayoutParams(n7, n4);
        layoutParams.addRule(13);
        Context context = this.getContext();
        this.a = imageView = new ImageView(context);
        context = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType((ImageView.ScaleType)context);
        imageView = this.a;
        this.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
        Context context2 = this.getContext();
        this.b = imageView = new ImageView(context2);
        imageView.setScaleType((ImageView.ScaleType)context);
        imageView = this.b;
        this.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
        this.b();
    }

    public final void b() {
        this.a.setImageLevel(0);
        this.b.setImageLevel(10000);
    }

    public final void c(float f5) {
        f5 = f5 % 1.0f * 10000.0f;
        int n3 = (int)f5;
        int n4 = 10000;
        if (n3 == 0) {
            n3 = 10000;
            f5 = 1.4013E-41f;
        }
        this.a.setImageLevel(n3);
        ImageView imageView = this.b;
        imageView.setImageLevel(n4 -= n3);
    }
}

