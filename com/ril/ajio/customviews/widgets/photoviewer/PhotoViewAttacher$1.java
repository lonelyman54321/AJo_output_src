/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher;

class PhotoViewAttacher$1
extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ PhotoViewAttacher this$0;

    public PhotoViewAttacher$1(PhotoViewAttacher photoViewAttacher) {
        this.this$0 = photoViewAttacher;
    }

    public void onLongPress(MotionEvent motionEvent) {
        motionEvent = PhotoViewAttacher.b(this.this$0);
        if (motionEvent != null) {
            motionEvent = PhotoViewAttacher.b(this.this$0);
            ImageView imageView = this.this$0.getImageView();
            motionEvent.onLongClick((View)imageView);
        }
    }
}

