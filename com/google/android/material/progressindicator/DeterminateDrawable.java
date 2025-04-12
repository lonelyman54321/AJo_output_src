/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 */
package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.b$q;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.d;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularDrawingDelegate;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable$1;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.LinearDrawingDelegate;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;

public final class DeterminateDrawable
extends DrawableWithAnimatedVisibilityChange {
    static final float GAP_RAMP_DOWN_THRESHOLD = 0.01f;
    private static final jS0 INDICATOR_LENGTH_IN_LEVEL;
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private final DrawingDelegate$ActiveIndicator activeIndicator;
    private DrawingDelegate drawingDelegate;
    private boolean skipAnimationOnLevelChange = false;
    private final c springAnimation;
    private final d springForce;

    static {
        DeterminateDrawable$1 determinateDrawable$1 = new DeterminateDrawable$1("indicatorLevel");
        INDICATOR_LENGTH_IN_LEVEL = determinateDrawable$1;
    }

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec object, DrawingDelegate object2) {
        super(context, (BaseProgressIndicatorSpec)object);
        this.setDrawingDelegate((DrawingDelegate)object2);
        this.activeIndicator = object = new DrawingDelegate$ActiveIndicator();
        this.springForce = object = new d();
        ((d)object).a();
        ((d)object).b(50.0f);
        jS0 jS02 = INDICATOR_LENGTH_IN_LEVEL;
        object2 = new b((Object)this, jS02);
        ((c)object2).t = Float.MAX_VALUE;
        ((c)object2).u = false;
        this.springAnimation = object2;
        ((c)object2).s = object;
        this.setGrowFraction(1.0f);
    }

    public static /* synthetic */ float access$000(DeterminateDrawable determinateDrawable) {
        return determinateDrawable.getIndicatorFraction();
    }

    public static /* synthetic */ void access$100(DeterminateDrawable determinateDrawable, float f5) {
        determinateDrawable.setIndicatorFraction(f5);
    }

    public static DeterminateDrawable createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate(circularProgressIndicatorSpec);
        return DeterminateDrawable.createCircularDrawable(context, circularProgressIndicatorSpec, circularDrawingDelegate);
    }

    public static DeterminateDrawable createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, CircularDrawingDelegate circularDrawingDelegate) {
        DeterminateDrawable determinateDrawable = new DeterminateDrawable(context, circularProgressIndicatorSpec, circularDrawingDelegate);
        return determinateDrawable;
    }

    public static DeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate(linearProgressIndicatorSpec);
        return DeterminateDrawable.createLinearDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate);
    }

    public static DeterminateDrawable createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, LinearDrawingDelegate linearDrawingDelegate) {
        DeterminateDrawable determinateDrawable = new DeterminateDrawable(context, linearProgressIndicatorSpec, linearDrawingDelegate);
        return determinateDrawable;
    }

    private float getIndicatorFraction() {
        return this.activeIndicator.endFraction;
    }

    private void setIndicatorFraction(float f5) {
        this.activeIndicator.endFraction = f5;
        this.invalidateSelf();
    }

    public void addSpringAnimationEndListener(b$q b$q) {
        ArrayList arrayList = this.springAnimation.k;
        boolean bl2 = arrayList.contains(b$q);
        if (!bl2) {
            arrayList.add(b$q);
        }
    }

    public void draw(Canvas canvas) {
        int n3;
        Object object = new Rect();
        Object object2 = this.getBounds();
        boolean bl2 = object2.isEmpty();
        if (!bl2 && (bl2 = this.isVisible()) && (n3 = canvas.getClipBounds((Rect)object)) != 0) {
            int n4;
            canvas.save();
            object = this.drawingDelegate;
            Object object3 = this.getBounds();
            float f5 = this.getGrowFraction();
            int n7 = this.isShowing();
            int n8 = this.isHiding();
            object2 = canvas;
            ((DrawingDelegate)object).validateSpecAndAdjustCanvas(canvas, (Rect)object3, f5, n7 != 0, n8 != 0);
            object = this.paint;
            object2 = Paint.Style.FILL;
            object.setStyle((Paint.Style)object2);
            object = this.paint;
            bl2 = true;
            float f6 = Float.MIN_VALUE;
            object.setAntiAlias(bl2);
            object = this.activeIndicator;
            object2 = this.baseSpec;
            object3 = object2.indicatorColors;
            Object object4 = object3[0];
            ((DrawingDelegate$ActiveIndicator)object).color = (int)object4;
            n3 = object2.indicatorTrackGapSize;
            if (n3 > 0) {
                object2 = this.drawingDelegate;
                bl2 = object2 instanceof LinearDrawingDelegate;
                if (!bl2) {
                    float f7 = n3;
                    f6 = this.getIndicatorFraction();
                    object4 = false;
                    object3 = null;
                    n4 = 1008981770;
                    f5 = 0.01f;
                    f6 = PK1.a(f6, 0.0f, f5) * f7 / f5;
                    n3 = (int)f6;
                }
                object = this.drawingDelegate;
                object3 = this.paint;
                f5 = this.getIndicatorFraction();
                n8 = this.baseSpec.trackColor;
                int n10 = this.getAlpha();
                n7 = 1065353216;
                float f8 = 1.0f;
                object2 = canvas;
                ((DrawingDelegate)object).fillTrack(canvas, (Paint)object3, f5, f8, n8, n10, n3);
            } else {
                object = this.drawingDelegate;
                object3 = this.paint;
                n8 = object2.trackColor;
                int n14 = this.getAlpha();
                n4 = 0;
                f5 = 0.0f;
                n7 = 1065353216;
                float f11 = 1.0f;
                object2 = canvas;
                ((DrawingDelegate)object).fillTrack(canvas, (Paint)object3, 0.0f, f11, n8, n14, 0);
            }
            object = this.drawingDelegate;
            object2 = this.paint;
            object3 = this.activeIndicator;
            n4 = this.getAlpha();
            ((DrawingDelegate)object).fillIndicator(canvas, (Paint)object2, (DrawingDelegate$ActiveIndicator)object3, n4);
            object = this.drawingDelegate;
            object2 = this.paint;
            object3 = this.baseSpec.indicatorColors;
            object4 = object3[0];
            n4 = this.getAlpha();
            ((DrawingDelegate)object).drawStopIndicator(canvas, (Paint)object2, (int)object4, n4);
            canvas.restore();
        }
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

    public void jumpToCurrentState() {
        this.springAnimation.f();
        float f5 = (float)this.getLevel() / 10000.0f;
        this.setIndicatorFraction(f5);
    }

    public boolean onLevelChange(int n3) {
        boolean bl2 = this.skipAnimationOnLevelChange;
        boolean bl3 = true;
        float f5 = 10000.0f;
        if (bl2) {
            c c2 = this.springAnimation;
            c2.f();
            float f6 = (float)n3 / f5;
            this.setIndicatorFraction(f6);
        } else {
            float f7;
            c c3 = this.springAnimation;
            c3.b = f7 = this.getIndicatorFraction() * f5;
            c3.c = bl3;
            c3 = this.springAnimation;
            float f8 = n3;
            c3.d(f8);
        }
        return bl3;
    }

    public void removeSpringAnimationEndListener(b$q b$q) {
        ArrayList arrayList = this.springAnimation.k;
        int n3 = arrayList.indexOf(b$q);
        if (n3 >= 0) {
            arrayList.set(n3, null);
        }
    }

    public void setDrawingDelegate(DrawingDelegate drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    public void setLevelByFraction(float f5) {
        int n3 = (int)(f5 * 10000.0f);
        this.setLevel(n3);
    }

    public boolean setVisibleInternal(boolean bl2, boolean bl3, boolean object) {
        bl2 = super.setVisibleInternal(bl2, bl3, (boolean)object);
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        Object object2 = this.context.getContentResolver();
        float f5 = animatorDurationScaleProvider.getSystemAnimatorDurationScale((ContentResolver)object2);
        object2 = null;
        float f6 = f5 - 0.0f;
        object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (!object) {
            bl3 = true;
            f5 = Float.MIN_VALUE;
            this.skipAnimationOnLevelChange = bl3;
        } else {
            object = false;
            this.skipAnimationOnLevelChange = false;
            object2 = this.springForce;
            float f7 = 50.0f / f5;
            ((d)object2).b(f7);
        }
        return bl2;
    }
}

