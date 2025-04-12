/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ril.ajio.customviews.widgets.photoviewer.IPhotoView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher;

class DefaultOnDoubleTapListener
implements GestureDetector.OnDoubleTapListener {
    private PhotoViewAttacher photoViewAttacher;

    public DefaultOnDoubleTapListener(PhotoViewAttacher photoViewAttacher) {
        this.setPhotoViewAttacher(photoViewAttacher);
    }

    private void setPhotoViewAttacher(PhotoViewAttacher photoViewAttacher) {
        this.photoViewAttacher = photoViewAttacher;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onDoubleTap(MotionEvent object) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
        boolean bl2;
        block5: {
            float f5;
            Object object2;
            block6: {
                float f6;
                float f7;
                block4: {
                    object2 = this.photoViewAttacher;
                    if (object2 == null) {
                        return false;
                    }
                    bl2 = true;
                    try {
                        float f8 = ((PhotoViewAttacher)object2).getScale();
                        f7 = object.getX();
                        f5 = object.getY();
                        PhotoViewAttacher photoViewAttacher = this.photoViewAttacher;
                        f6 = photoViewAttacher.getMediumScale();
                        float f11 = f8 == f6 ? 0 : (f8 < f6 ? -1 : 1);
                        if (f11 >= 0) break block4;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                        break block5;
                    }
                    object2 = this.photoViewAttacher;
                    f6 = ((PhotoViewAttacher)object2).getMaximumScale();
                    ((PhotoViewAttacher)object2).setScale(f6, f7, f5, bl2);
                    object = this.photoViewAttacher;
                    f5 = ((PhotoViewAttacher)object).getMaximumScale();
                    break block6;
                }
                object2 = this.photoViewAttacher;
                f6 = ((PhotoViewAttacher)object2).getMinimumScale();
                ((PhotoViewAttacher)object2).setScale(f6, f7, f5, bl2);
                object = this.photoViewAttacher;
                f5 = ((PhotoViewAttacher)object).getMinimumScale();
            }
            object2 = this.photoViewAttacher;
            object2 = ((PhotoViewAttacher)object2).getOnScaleChangeListener();
            if (object2 == null) return bl2;
            object2 = this.photoViewAttacher;
            object2 = ((PhotoViewAttacher)object2).getOnScaleChangeListener();
            IPhotoView iPhotoView = this.photoViewAttacher;
            iPhotoView = iPhotoView.getImageView();
            iPhotoView = (PhotoView)iPhotoView;
            object2.updateUi(f5, (PhotoView)iPhotoView);
            return bl2;
        }
        yn3_0.a(arrayIndexOutOfBoundsException2);
        return bl2;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        float f5;
        float f6;
        boolean bl2;
        PhotoViewAttacher photoViewAttacher = this.photoViewAttacher;
        if (photoViewAttacher == null) {
            return false;
        }
        photoViewAttacher = photoViewAttacher.getImageView();
        Object object = this.photoViewAttacher.getOnPhotoTapListener();
        if (object != null && (object = this.photoViewAttacher.getDisplayRect()) != null && (bl2 = object.contains(f6 = motionEvent.getX(), f5 = motionEvent.getY()))) {
            float f7 = ((RectF)object).left;
            f6 -= f7;
            f7 = object.width();
            f6 /= f7;
            f7 = ((RectF)object).top;
            f5 -= f7;
            f7 = object.height();
            this.photoViewAttacher.getOnPhotoTapListener().onPhotoTap((View)photoViewAttacher, f6, f5 /= f7);
            return true;
        }
        object = this.photoViewAttacher.getOnViewTapListener();
        if (object != null) {
            object = this.photoViewAttacher.getOnViewTapListener();
            f6 = motionEvent.getX();
            float f8 = motionEvent.getY();
            object.onViewTap((View)photoViewAttacher, f6, f8);
        }
        return false;
    }
}

