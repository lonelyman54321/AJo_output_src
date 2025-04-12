/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.Maskable;
import com.google.android.material.carousel.OnMaskChangedListener;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

public class MaskableFrameLayout
extends FrameLayout
implements Maskable,
Shapeable {
    private static final int NOT_SET = 255;
    private final RectF maskRect;
    private float maskXPercentage = -1.0f;
    private OnMaskChangedListener onMaskChangedListener;
    private Boolean savedForceCompatClippingEnabled;
    private ShapeAppearanceModel shapeAppearanceModel;
    private final ShapeableDelegate shapeableDelegate;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        Object object2;
        this.maskRect = object2 = new RectF();
        object2 = ShapeableDelegate.create((View)this);
        this.shapeableDelegate = object2;
        this.savedForceCompatClippingEnabled = null;
        object = ShapeAppearanceModel.builder(object, attributeSet, n3, 0, 0).build();
        this.setShapeAppearanceModel((ShapeAppearanceModel)object);
    }

    public static /* synthetic */ CornerSize a(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    public static /* synthetic */ void b(MaskableFrameLayout maskableFrameLayout, Canvas canvas) {
        maskableFrameLayout.lambda$dispatchDraw$1(canvas);
    }

    private /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        boolean bl2 = cornerSize instanceof AbsoluteCornerSize;
        if (bl2) {
            cornerSize = ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize)cornerSize);
        }
        return cornerSize;
    }

    private void onMaskChanged() {
        Object object = this.shapeableDelegate;
        RectF rectF = this.maskRect;
        ((ShapeableDelegate)object).onMaskChanged((View)this, rectF);
        object = this.onMaskChangedListener;
        if (object != null) {
            rectF = this.maskRect;
            object.onMaskChanged(rectF);
        }
    }

    private void updateMaskRectForMaskXPercentage() {
        float f5 = this.maskXPercentage;
        float f6 = -1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            object = this.getWidth();
            f5 = (float)object / 2.0f;
            f6 = 1.0f;
            float f8 = this.maskXPercentage;
            f5 = AnimationUtils.lerp(0.0f, f5, 0.0f, f6, f8);
            int n3 = this.getWidth();
            f8 = (float)n3 - f5;
            int n4 = this.getHeight();
            float f11 = n4;
            RectF rectF = new RectF(f5, 0.0f, f8, f11);
            this.setMaskRectF(rectF);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.shapeableDelegate;
        nh1_1 nh1_12 = new nh1_1(this, 0);
        shapeableDelegate.maybeClip(canvas, nh1_12);
    }

    public void getFocusedRect(Rect rect) {
        RectF rectF = this.maskRect;
        int n3 = (int)rectF.left;
        int n4 = (int)rectF.top;
        int n7 = (int)rectF.right;
        int n8 = (int)rectF.bottom;
        rect.set(n3, n4, n7, n8);
    }

    public RectF getMaskRectF() {
        return this.maskRect;
    }

    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bl2 = this.savedForceCompatClippingEnabled;
        if (bl2 != null) {
            ShapeableDelegate shapeableDelegate = this.shapeableDelegate;
            boolean bl3 = bl2;
            shapeableDelegate.setForceCompatClippingEnabled((View)this, bl3);
        }
    }

    public void onDetachedFromWindow() {
        Boolean bl2;
        this.savedForceCompatClippingEnabled = bl2 = Boolean.valueOf(this.shapeableDelegate.isForceCompatClippingEnabled());
        this.shapeableDelegate.setForceCompatClippingEnabled((View)this, true);
        super.onDetachedFromWindow();
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        float f5 = this.maskXPercentage;
        n4 = -1082130432;
        float f6 = -1.0f;
        n3 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
        if (n3 != 0) {
            this.updateMaskRectForMaskXPercentage();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f5;
        float f6;
        RectF rectF;
        RectF rectF2 = this.maskRect;
        int n3 = rectF2.isEmpty();
        if (n3 == 0 && (n3 = motionEvent.getAction()) == 0 && (n3 = (int)((rectF = this.maskRect).contains(f6 = motionEvent.getX(), f5 = motionEvent.getY()) ? 1 : 0)) == 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean bl2) {
        this.shapeableDelegate.setForceCompatClippingEnabled((View)this, bl2);
    }

    public void setMaskRectF(RectF rectF) {
        this.maskRect.set(rectF);
        this.onMaskChanged();
    }

    public void setMaskXPercentage(float f5) {
        float f6 = this.maskXPercentage;
        float f7 = 1.0f;
        float f8 = f6 - (f5 = PK1.a(f5, 0.0f, f7));
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object != false) {
            this.maskXPercentage = f5;
            this.updateMaskRectForMaskXPercentage();
        }
    }

    public void setOnMaskChangedListener(OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        mh1_1 mh1_12 = new Object();
        this.shapeAppearanceModel = shapeAppearanceModel = shapeAppearanceModel.withTransformedCornerSizes(mh1_12);
        this.shapeableDelegate.onShapeAppearanceChanged((View)this, shapeAppearanceModel);
    }
}

