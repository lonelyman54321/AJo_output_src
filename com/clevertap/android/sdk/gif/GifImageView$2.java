/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.widget.ImageView$ScaleType
 */
package com.clevertap.android.sdk.gif;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.clevertap.android.sdk.gif.GifImageView;

class GifImageView$2
implements Runnable {
    public final /* synthetic */ GifImageView a;

    public GifImageView$2(GifImageView gifImageView) {
        this.a = gifImageView;
    }

    public final void run() {
        boolean bl2;
        GifImageView gifImageView = this.a;
        Bitmap bitmap = gifImageView.h;
        if (bitmap != null && !(bl2 = bitmap.isRecycled())) {
            bitmap = gifImageView.h;
            gifImageView.setImageBitmap(bitmap);
            bitmap = ImageView.ScaleType.FIT_CENTER;
            gifImageView.setScaleType((ImageView.ScaleType)bitmap);
        }
    }
}

