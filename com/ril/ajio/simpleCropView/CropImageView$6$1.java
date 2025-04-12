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
import com.ril.ajio.simpleCropView.a;

class CropImageView$6$1
implements Runnable {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ a00_0 b;
    public final /* synthetic */ a c;

    public CropImageView$6$1(a a2, Bitmap bitmap, v00$a v00$a) {
        this.c = a2;
        this.a = bitmap;
        this.b = v00$a;
    }

    public final void run() {
        float f5;
        a a2 = this.c;
        CropImageView cropImageView = a2.d;
        cropImageView.d = f5 = (float)cropImageView.y;
        a2 = a2.d.getResources();
        Bitmap bitmap = this.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources)a2, bitmap);
        CropImageView.b(cropImageView, bitmapDrawable);
        ((v00$a)this.b).a();
    }
}

