/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.R$drawable;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularDrawingDelegate;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.LinearDrawingDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.List;

public final class IndeterminateDrawable
extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate animatorDelegate;
    private DrawingDelegate drawingDelegate;
    private Drawable staticDummyDrawable;

    public IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate, IndeterminateAnimatorDelegate indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.setDrawingDelegate(drawingDelegate);
        this.setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    public static IndeterminateDrawable createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate(circularProgressIndicatorSpec);
        return IndeterminateDrawable.createCircularDrawable(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    public static IndeterminateDrawable createCircularDrawable(Context object, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec);
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable((Context)object, circularProgressIndicatorSpec, circularDrawingDelegate, circularIndeterminateAnimatorDelegate);
        object = object.getResources();
        object = aa3_1.a(R$drawable.indeterminate_static, null, (Resources)object);
        indeterminateDrawable.setStaticDummyDrawable((Drawable)object);
        return indeterminateDrawable;
    }

    public static IndeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate(linearProgressIndicatorSpec);
        return IndeterminateDrawable.createLinearDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    public static IndeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        int n3 = linearProgressIndicatorSpec.indeterminateAnimationType;
        IndeterminateAnimatorDelegate indeterminateAnimatorDelegate = n3 == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec);
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate, indeterminateAnimatorDelegate);
        return indeterminateDrawable;
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        boolean bl2 = false;
        if (animatorDurationScaleProvider != null) {
            ContentResolver contentResolver = this.context.getContentResolver();
            float f5 = animatorDurationScaleProvider.getSystemAnimatorDurationScale(contentResolver);
            contentResolver = null;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object == false) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public void draw(Canvas canvas) {
        int n3;
        Object object = new Rect();
        Rect rect = this.getBounds();
        int n4 = rect.isEmpty();
        if (n4 == 0 && (n4 = this.isVisible()) != 0 && (n3 = canvas.getClipBounds(object)) != 0) {
            int n7;
            int n8;
            int n10;
            float f5;
            Paint paint;
            int n14;
            n3 = this.isSystemAnimatorDisabled();
            n4 = 0;
            rect = null;
            if (n3 != 0 && (object = this.staticDummyDrawable) != null) {
                Rect rect2 = this.getBounds();
                object.setBounds(rect2);
                object = this.staticDummyDrawable;
                n4 = this.baseSpec.indicatorColors[0];
                object.setTint(n4);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            Object object2 = this.drawingDelegate;
            Object object3 = this.getBounds();
            float f6 = this.getGrowFraction();
            int n15 = this.isShowing();
            int n16 = this.isHiding();
            Object object4 = canvas;
            ((DrawingDelegate)object2).validateSpecAndAdjustCanvas(canvas, (Rect)object3, f6, n15 != 0, n16 != 0);
            object = this.baseSpec;
            n3 = object.indicatorTrackGapSize;
            int n17 = this.getAlpha();
            if (n3 == 0) {
                object2 = this.drawingDelegate;
                object3 = this.paint;
                n16 = this.baseSpec.trackColor;
                n14 = 0;
                f6 = 0.0f;
                paint = null;
                n15 = 1065353216;
                f5 = 1.0f;
                object4 = canvas;
                n10 = n17;
                ((DrawingDelegate)object2).fillTrack(canvas, (Paint)object3, 0.0f, f5, n16, n17, 0);
            } else {
                object2 = (DrawingDelegate$ActiveIndicator)this.animatorDelegate.activeIndicators.get(0);
                object4 = this.animatorDelegate.activeIndicators;
                object4 = on_2.d(1, (List)object4);
                Object object5 = object4;
                object5 = (DrawingDelegate$ActiveIndicator)object4;
                object4 = this.drawingDelegate;
                n8 = object4 instanceof LinearDrawingDelegate;
                if (n8 != 0) {
                    object3 = this.paint;
                    f5 = ((DrawingDelegate$ActiveIndicator)object2).startFraction;
                    n16 = this.baseSpec.trackColor;
                    n14 = 0;
                    paint = null;
                    object2 = object4;
                    object4 = canvas;
                    n10 = n17;
                    ((DrawingDelegate)object2).fillTrack(canvas, (Paint)object3, 0.0f, f5, n16, n17, n3);
                    object2 = this.drawingDelegate;
                    object3 = this.paint;
                    f6 = object5.endFraction;
                    n16 = this.baseSpec.trackColor;
                    n15 = 1065353216;
                    f5 = 1.0f;
                    object4 = canvas;
                    ((DrawingDelegate)object2).fillTrack(canvas, (Paint)object3, f6, f5, n16, n17, n3);
                } else {
                    object3 = this.paint;
                    f6 = object5.endFraction;
                    float f7 = ((DrawingDelegate$ActiveIndicator)object2).startFraction;
                    n15 = 1065353216;
                    f5 = 1.0f + f7;
                    n16 = this.baseSpec.trackColor;
                    n17 = 0;
                    object2 = object4;
                    object4 = canvas;
                    n10 = 0;
                    ((DrawingDelegate)object2).fillTrack(canvas, (Paint)object3, f6, f5, n16, 0, n3);
                }
            }
            while (n4 < (n7 = (object2 = this.animatorDelegate.activeIndicators).size())) {
                object2 = (DrawingDelegate$ActiveIndicator)this.animatorDelegate.activeIndicators.get(n4);
                object4 = this.drawingDelegate;
                object3 = this.paint;
                n14 = this.getAlpha();
                ((DrawingDelegate)object4).fillIndicator(canvas, (Paint)object3, (DrawingDelegate$ActiveIndicator)object2, n14);
                if (n4 > 0 && n3 > 0) {
                    object4 = this.animatorDelegate.activeIndicators;
                    n8 = n4 + -1;
                    object4 = (DrawingDelegate$ActiveIndicator)object4.get(n8);
                    object3 = this.drawingDelegate;
                    paint = this.paint;
                    f5 = ((DrawingDelegate$ActiveIndicator)object4).endFraction;
                    float f8 = ((DrawingDelegate$ActiveIndicator)object2).startFraction;
                    n10 = this.baseSpec.trackColor;
                    object2 = object3;
                    object4 = canvas;
                    object3 = paint;
                    f6 = f5;
                    f5 = f8;
                    n16 = n10;
                    n10 = n17;
                    ((DrawingDelegate)object2).fillTrack(canvas, paint, f6, f8, n16, n17, n3);
                }
                ++n4;
            }
            canvas.restore();
        }
    }

    public IndeterminateAnimatorDelegate getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    public DrawingDelegate getDrawingDelegate() {
        return this.drawingDelegate;
    }

    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    public void setAnimatorDelegate(IndeterminateAnimatorDelegate indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    public void setDrawingDelegate(DrawingDelegate drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    public void setStaticDummyDrawable(Drawable drawable2) {
        this.staticDummyDrawable = drawable2;
    }

    public boolean setVisibleInternal(boolean bl2, boolean bl3, boolean bl4) {
        Drawable drawable2;
        boolean bl5 = super.setVisibleInternal(bl2, bl3, bl4);
        boolean bl6 = this.isSystemAnimatorDisabled();
        if (bl6 && (drawable2 = this.staticDummyDrawable) != null) {
            return drawable2.setVisible(bl2, bl3);
        }
        bl3 = this.isRunning();
        if (!bl3) {
            IndeterminateAnimatorDelegate indeterminateAnimatorDelegate = this.animatorDelegate;
            indeterminateAnimatorDelegate.cancelAnimatorImmediately();
        }
        if (bl2 && (bl4 || (bl2 = Build.VERSION.SDK_INT) <= (bl3 = 22) && !(bl2 = this.isSystemAnimatorDisabled()))) {
            IndeterminateAnimatorDelegate indeterminateAnimatorDelegate = this.animatorDelegate;
            indeterminateAnimatorDelegate.startAnimator();
        }
        return bl5;
    }
}

