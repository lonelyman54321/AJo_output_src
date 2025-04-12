/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.ril.ajio.simpleCropView;

import android.graphics.RectF;
import com.ril.ajio.simpleCropView.CropImageView;

public final class CropImageView$b
implements f53_0 {
    public final /* synthetic */ RectF a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ RectF f;
    public final /* synthetic */ CropImageView g;

    public CropImageView$b(CropImageView cropImageView, RectF rectF, float f5, float f6, float f7, float f8, RectF rectF2) {
        this.g = cropImageView;
        this.a = rectF;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = rectF2;
    }

    public final void a() {
        this.g.s = true;
    }

    public final void b(float f5) {
        RectF rectF = this.a;
        float f6 = rectF.left;
        float f7 = this.b * f5 + f6;
        f6 = rectF.top;
        float f8 = this.c * f5 + f6;
        f6 = rectF.right;
        float f11 = this.d * f5 + f6;
        float f12 = rectF.bottom;
        f6 = this.e * f5 + f12;
        RectF rectF2 = new RectF(f7, f8, f11, f6);
        CropImageView cropImageView = this.g;
        cropImageView.m = rectF2;
        cropImageView.invalidate();
    }

    public final void c() {
        RectF rectF;
        CropImageView cropImageView = this.g;
        cropImageView.m = rectF = this.f;
        cropImageView.invalidate();
        cropImageView.s = false;
    }
}

