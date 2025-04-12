/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.customviews.widgets.photoviewer.Compat;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher;

class PhotoViewAttacher$AnimatedZoomRunnable
implements Runnable {
    private final float mFocalX;
    private final float mFocalY;
    private final long mStartTime;
    private final float mZoomEnd;
    private final float mZoomStart;
    final /* synthetic */ PhotoViewAttacher this$0;

    public PhotoViewAttacher$AnimatedZoomRunnable(PhotoViewAttacher photoViewAttacher, float f5, float f6, float f7, float f8) {
        long l2;
        this.this$0 = photoViewAttacher;
        this.mFocalX = f7;
        this.mFocalY = f8;
        this.mStartTime = l2 = System.currentTimeMillis();
        this.mZoomStart = f5;
        this.mZoomEnd = f6;
    }

    private float interpolate() {
        long l2 = System.currentTimeMillis();
        long l3 = this.mStartTime;
        float f5 = l2 - l3;
        float f6 = 1.0f;
        f5 *= f6;
        float f7 = PhotoViewAttacher.a(this.this$0);
        f5 /= f7;
        f5 = Math.min(f6, f5);
        return PhotoViewAttacher.g().getInterpolation(f5);
    }

    public void run() {
        ImageView imageView = this.this$0.getImageView();
        if (imageView == null) {
            return;
        }
        float f5 = this.interpolate();
        float f6 = this.mZoomStart;
        f6 = xu0_1.a(this.mZoomEnd, f6, f5, f6);
        float f7 = this.this$0.getScale();
        PhotoViewAttacher photoViewAttacher = this.this$0;
        float f8 = this.mFocalX;
        float f11 = this.mFocalY;
        photoViewAttacher.onScale(f6 /= f7, f8, f11);
        f6 = 1.0f;
        float f12 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f12 < 0) {
            Compat.postOnAnimation((View)imageView, this);
        }
    }
}

