/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 */
package com.ril.ajio.simpleCropView;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.ril.ajio.simpleCropView.CropImageView;

class CropImageView$7
implements Runnable {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ CropImageView b;

    public CropImageView$7(CropImageView cropImageView, Bitmap bitmap) {
        this.b = cropImageView;
        this.a = bitmap;
    }

    public final void run() {
        float f5;
        CropImageView cropImageView = this.b;
        cropImageView.d = f5 = (float)cropImageView.y;
        Resources resources = cropImageView.getResources();
        Bitmap bitmap = this.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        CropImageView.b(cropImageView, bitmapDrawable);
    }
}

