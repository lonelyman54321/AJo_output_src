/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.View$OnLongClickListener
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.customviews.widgets.RecyclingImageView;
import com.ril.ajio.customviews.widgets.photoviewer.IPhotoView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnMatrixChangedListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnPhotoTapListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnScaleChangeListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnViewTapListener;

public class PhotoView
extends RecyclingImageView
implements IPhotoView,
PhotoViewAttacher$OnScaleChangeListener {
    private PhotoViewAttacher$OnScaleChangeListener listener;
    private PhotoViewAttacher mAttacher;
    private ImageView.ScaleType mPendingScaleType;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet);
        context = ImageView.ScaleType.MATRIX;
        super.setScaleType((ImageView.ScaleType)context);
        this.init();
    }

    private void init() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher == null || (photoViewAttacher = photoViewAttacher.getImageView()) == null) {
            this.mAttacher = photoViewAttacher = new PhotoViewAttacher(this);
        }
        if ((photoViewAttacher = this.mPendingScaleType) != null) {
            this.setScaleType((ImageView.ScaleType)photoViewAttacher);
            photoViewAttacher = null;
            this.mPendingScaleType = null;
        }
    }

    public boolean canZoom() {
        return this.mAttacher.canZoom();
    }

    public Matrix getDisplayMatrix() {
        return this.mAttacher.getDisplayMatrix();
    }

    public RectF getDisplayRect() {
        return this.mAttacher.getDisplayRect();
    }

    public IPhotoView getIPhotoViewImplementation() {
        return this.mAttacher;
    }

    public PhotoViewAttacher$OnScaleChangeListener getListener() {
        return this.listener;
    }

    public float getMaxScale() {
        return this.getMaximumScale();
    }

    public float getMaximumScale() {
        return this.mAttacher.getMaximumScale();
    }

    public float getMediumScale() {
        return this.mAttacher.getMediumScale();
    }

    public float getMidScale() {
        return this.getMediumScale();
    }

    public float getMinScale() {
        return this.getMinimumScale();
    }

    public float getMinimumScale() {
        return this.mAttacher.getMinimumScale();
    }

    public PhotoViewAttacher$OnPhotoTapListener getOnPhotoTapListener() {
        return this.mAttacher.getOnPhotoTapListener();
    }

    public PhotoViewAttacher$OnViewTapListener getOnViewTapListener() {
        return this.mAttacher.getOnViewTapListener();
    }

    public float getScale() {
        return this.mAttacher.getScale();
    }

    public ImageView.ScaleType getScaleType() {
        return this.mAttacher.getScaleType();
    }

    public Bitmap getVisibleRectangleBitmap() {
        return this.mAttacher.getVisibleRectangleBitmap();
    }

    public void onAttachedToWindow() {
        this.init();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.mAttacher.cleanup();
        super.onDetachedFromWindow();
    }

    public void onScaleChange(float f5, float f6, float f7) {
        this.listener.onScaleChange(f5, f6, f7);
    }

    public void setAllowParentInterceptOnEdge(boolean bl2) {
        this.mAttacher.setAllowParentInterceptOnEdge(bl2);
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        return this.mAttacher.setDisplayMatrix(matrix);
    }

    public void setImageDrawable(Drawable object) {
        super.setImageDrawable((Drawable)object);
        object = this.mAttacher;
        if (object != null) {
            ((PhotoViewAttacher)object).update();
        }
    }

    public void setImageResource(int n3) {
        super.setImageResource(n3);
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    public void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.mAttacher;
        if (object != null) {
            ((PhotoViewAttacher)object).update();
        }
    }

    public void setListener(PhotoViewAttacher$OnScaleChangeListener photoViewAttacher$OnScaleChangeListener) {
        this.listener = photoViewAttacher$OnScaleChangeListener;
    }

    public void setMaxScale(float f5) {
        this.setMaximumScale(f5);
    }

    public void setMaximumScale(float f5) {
        this.mAttacher.setMaximumScale(f5);
    }

    public void setMediumScale(float f5) {
        this.mAttacher.setMediumScale(f5);
    }

    public void setMidScale(float f5) {
        this.setMediumScale(f5);
    }

    public void setMinScale(float f5) {
        this.setMinimumScale(f5);
    }

    public void setMinimumScale(float f5) {
        this.mAttacher.setMinimumScale(f5);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mAttacher.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mAttacher.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMatrixChangeListener(PhotoViewAttacher$OnMatrixChangedListener photoViewAttacher$OnMatrixChangedListener) {
        this.mAttacher.setOnMatrixChangeListener(photoViewAttacher$OnMatrixChangedListener);
    }

    public void setOnPhotoTapListener(PhotoViewAttacher$OnPhotoTapListener photoViewAttacher$OnPhotoTapListener) {
        this.mAttacher.setOnPhotoTapListener(photoViewAttacher$OnPhotoTapListener);
    }

    public void setOnScaleChangeListener(PhotoViewAttacher$OnScaleChangeListener photoViewAttacher$OnScaleChangeListener) {
        this.mAttacher.setOnScaleChangeListener(photoViewAttacher$OnScaleChangeListener);
        this.listener = photoViewAttacher$OnScaleChangeListener;
    }

    public void setOnViewTapListener(PhotoViewAttacher$OnViewTapListener photoViewAttacher$OnViewTapListener) {
        this.mAttacher.setOnViewTapListener(photoViewAttacher$OnViewTapListener);
    }

    public void setPhotoViewRotation(float f5) {
        this.mAttacher.setRotationTo(f5);
    }

    public void setRotationBy(float f5) {
        this.mAttacher.setRotationBy(f5);
    }

    public void setRotationTo(float f5) {
        this.mAttacher.setRotationTo(f5);
    }

    public void setScale(float f5) {
        this.mAttacher.setScale(f5);
    }

    public void setScale(float f5, float f6, float f7, boolean bl2) {
        this.mAttacher.setScale(f5, f6, f7, bl2);
    }

    public void setScale(float f5, boolean bl2) {
        this.mAttacher.setScale(f5, bl2);
    }

    public void setScaleLevels(float f5, float f6, float f7) {
        this.mAttacher.setScaleLevels(f5, f6, f7);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScaleType(scaleType);
        } else {
            this.mPendingScaleType = scaleType;
        }
    }

    public void setZoomTransitionDuration(int n3) {
        this.mAttacher.setZoomTransitionDuration(n3);
    }

    public void setZoomable(boolean bl2) {
        this.mAttacher.setZoomable(bl2);
    }

    public void updateUi(float f5, PhotoView photoView) {
        this.listener.updateUi(f5, photoView);
    }
}

