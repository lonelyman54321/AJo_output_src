/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ClockHandView$1;
import com.google.android.material.timepicker.ClockHandView$OnActionUpListener;
import com.google.android.material.timepicker.ClockHandView$OnRotateListener;
import com.google.android.material.timepicker.a;
import java.util.List;

class ClockHandView
extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List listeners;
    private ClockHandView$OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialClockStyle;
        this(context, attributeSet, n3);
    }

    public ClockHandView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        int n4;
        float f5;
        TimeInterpolator timeInterpolator;
        RectF rectF;
        Object object2;
        this.rotationAnimator = object2 = new ValueAnimator();
        super();
        this.listeners = object2;
        super();
        this.paint = object2;
        this.selectorBox = rectF = new RectF();
        boolean bl2 = true;
        this.currentLevel = bl2;
        Object object3 = R$styleable.ClockHandView;
        int n7 = R$style.Widget_MaterialComponents_TimePicker_Clock;
        attributeSet = object.obtainStyledAttributes(attributeSet, object3, n3, n7);
        n3 = R$attr.motionDurationLong2;
        this.animationDuration = n3 = MotionUtils.resolveThemeDuration(object, n3, 200);
        n3 = R$attr.motionEasingEmphasizedInterpolator;
        object3 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        this.animationInterpolator = timeInterpolator = MotionUtils.resolveThemeInterpolator(object, n3, (TimeInterpolator)object3);
        n3 = R$styleable.ClockHandView_materialCircleRadius;
        this.circleRadius = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.ClockHandView_selectorSize;
        this.selectorRadius = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        timeInterpolator = this.getResources();
        n7 = R$dimen.material_clock_hand_stroke_width;
        this.selectorStrokeWidth = n7 = timeInterpolator.getDimensionPixelSize(n7);
        n7 = R$dimen.material_clock_hand_center_dot_radius;
        this.centerDotRadius = f5 = (float)timeInterpolator.getDimensionPixelSize(n7);
        n3 = R$styleable.ClockHandView_clockHandColor;
        n3 = attributeSet.getColor(n3, 0);
        object2.setAntiAlias(bl2);
        object2.setColor(n3);
        this.setHandRotation(0.0f);
        this.scaledTouchSlop = n4 = ViewConfiguration.get((Context)object).getScaledTouchSlop();
        object = ViewCompat.a;
        this.setImportantForAccessibility(2);
        attributeSet.recycle();
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.lambda$setHandRotation$0(valueAnimator);
    }

    private void adjustLevel(float f5, float f6) {
        int n3 = this.getWidth();
        int n4 = 2;
        int n7 = this.getHeight() / n4;
        float f7 = n3 /= n4;
        float f8 = n7;
        f5 = MathUtils.dist(f7, f8, f5, f6);
        int n8 = this.getLeveledCircleRadius(n4);
        Context context = this.getContext();
        n7 = 12;
        f8 = 1.7E-44f;
        f7 = ViewUtils.dpToPx(context, n7);
        f6 = (float)n8 + f7;
        float f11 = f5 - f6;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object > 0) {
            n4 = 1;
        }
        this.currentLevel = n4;
    }

    private void drawSelector(Canvas canvas) {
        int n3 = this.getHeight() / 2;
        int n4 = this.getWidth() / 2;
        int n7 = this.currentLevel;
        n7 = this.getLeveledCircleRadius(n7);
        float f5 = n4;
        float f6 = n7;
        float f7 = (float)Math.cos(this.degRad) * f6 + f5;
        float f8 = n3;
        float f11 = (float)Math.sin(this.degRad);
        f6 = f6 * f11 + f8;
        this.paint.setStrokeWidth(0.0f);
        f11 = this.selectorRadius;
        Paint paint = this.paint;
        canvas.drawCircle(f7, f6, f11, paint);
        double d2 = Math.sin(this.degRad);
        double d5 = Math.cos(this.degRad);
        int n8 = this.selectorRadius;
        double d7 = n7 - n8;
        n7 = (int)(d5 * d7);
        float f12 = n4 + n7;
        n4 = (int)(d7 * d2);
        float f14 = n3 + n4;
        Paint paint2 = this.paint;
        float f15 = this.selectorStrokeWidth;
        paint2.setStrokeWidth(f15);
        Paint paint3 = this.paint;
        f7 = f5;
        f11 = f8;
        canvas.drawLine(f5, f8, f12, f14, paint3);
        float f16 = this.centerDotRadius;
        Paint paint4 = this.paint;
        canvas.drawCircle(f5, f8, f16, paint4);
    }

    private int getDegreesFromXY(float f5, float f6) {
        float f7;
        double d2;
        int n3 = this.getWidth() / 2;
        int n4 = this.getHeight() / 2;
        f5 = n4;
        double d5 = Math.toDegrees(Math.atan2(f6 -= f5, d2 = (double)(f5 - (f7 = (float)n3))));
        int n7 = (int)d5;
        int n8 = n7 + 90;
        if (n8 < 0) {
            n8 = n7 + 450;
        }
        return n8;
    }

    private int getLeveledCircleRadius(int n3) {
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4) {
            float f6 = this.circleRadius;
            n4 = 1059648963;
            f5 = 0.66f;
            n3 = Math.round(f6 *= f5);
        } else {
            n3 = this.circleRadius;
        }
        return n3;
    }

    private Pair getValuesForAnimation(float f5) {
        float f6 = this.getHandRotation();
        float f7 = Math.abs(f6 - f5);
        int n3 = 0x43340000;
        float f8 = 180.0f;
        float f11 = f7 - f8;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = 1135869952;
            f7 = 360.0f;
            Object object2 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
            if (object2 > 0 && (object2 = f5 == f8 ? 0 : (f5 < f8 ? -1 : 1)) < 0) {
                f5 += f7;
            }
            if ((object2 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1)) < 0 && (n3 = (int)(f5 == f8 ? 0 : (f5 > f8 ? 1 : -1))) > 0) {
                f6 += f7;
            }
        }
        Float f12 = Float.valueOf(f6);
        Float f14 = Float.valueOf(f5);
        Pair pair = new Pair((Object)f12, (Object)f14);
        return pair;
    }

    private boolean handleTouchInput(float f5, float f6, boolean bl2, boolean bl3, boolean bl4) {
        int n3 = this.getDegreesFromXY(f5, f6);
        f6 = this.getHandRotation();
        f5 = n3;
        boolean bl5 = false;
        boolean bl6 = true;
        Object object = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        if (object != false) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
        }
        if (bl3 && object != false) {
            return bl6;
        }
        if (object == false && !bl2) {
            return false;
        }
        if (bl4 && (object = (Object)this.animatingOnTouchUp) != false) {
            bl5 = true;
        }
        this.setHandRotation(f5, bl5);
        return bl6;
    }

    private /* synthetic */ void lambda$setHandRotation$0(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.setHandRotationInternal(f5, true);
    }

    private void setHandRotationInternal(float f5, boolean bl2) {
        double d2;
        this.originalDeg = f5 %= 360.0f;
        this.degRad = d2 = Math.toRadians(f5 - 90.0f);
        int n3 = this.getHeight() / 2;
        int n4 = this.getWidth() / 2;
        int n7 = this.currentLevel;
        n7 = this.getLeveledCircleRadius(n7);
        float f6 = n4;
        float f7 = n7;
        double d5 = Math.cos(this.degRad);
        float f8 = (float)d5 * f7 + f6;
        float f11 = n3;
        double d7 = Math.sin(this.degRad);
        f6 = (float)d7;
        f7 = f7 * f6 + f11;
        Object object = this.selectorBox;
        n4 = this.selectorRadius;
        float f12 = n4;
        f12 = f8 - f12;
        float f14 = n4;
        f14 = f7 - f14;
        float f15 = n4;
        f6 = n4;
        object.set(f12, f14, f8 += f15, f7 += f6);
        object = this.listeners.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ClockHandView$OnRotateListener clockHandView$OnRotateListener = (ClockHandView$OnRotateListener)object.next();
            clockHandView$OnRotateListener.onRotate(f5, bl2);
        }
        this.invalidate();
    }

    public void addOnRotateListener(ClockHandView$OnRotateListener clockHandView$OnRotateListener) {
        this.listeners.add(clockHandView$OnRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.drawSelector(canvas);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        ValueAnimator valueAnimator = this.rotationAnimator;
        bl2 = valueAnimator.isRunning();
        if (!bl2) {
            float f5 = this.getHandRotation();
            this.setHandRotation(f5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        var2_2 = var1_1.getActionMasked();
        var3_3 = var1_1.getX();
        var4_4 = var1_1.getY();
        var5_5 = 1;
        var6_6 = false;
        if (var2_2 == 0) ** GOTO lbl42
        if (var2_2 == var5_5) ** GOTO lbl-1000
        var7_7 = 2;
        var8_8 = 2.8E-45f;
        if (var2_2 != var7_7) {
            var2_2 = 0;
            var9_9 = null;
            var10_10 = false;
lbl14:
            // 2 sources

            while (true) {
                var11_12 = false;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = this.downX;
            var8_8 = var3_3 - var8_8;
            var7_7 = (int)var8_8;
            var12_11 = this.downY;
            var12_11 = var4_4 - var12_11;
            var13_13 = (int)var12_11;
            var7_7 *= var7_7;
            if ((var13_13 = var13_13 * var13_13 + var7_7) > (var7_7 = this.scaledTouchSlop)) {
                var7_7 = 1;
                var8_8 = 1.4E-45f;
            } else {
                var7_7 = 0;
                var8_8 = 0.0f;
            }
            this.isInTapRegion = var7_7;
            var7_7 = this.changedDuringTouch;
            if (var2_2 == var5_5) {
                var2_2 = 1;
            } else {
                var2_2 = 0;
                var9_9 = null;
            }
            var13_13 = (int)this.isMultiLevel;
            if (var13_13 != 0) {
                this.adjustLevel(var3_3, var4_4);
            }
            var10_10 = var7_7;
            ** continue;
lbl42:
            // 1 sources

            this.downX = var3_3;
            this.downY = var4_4;
            this.isInTapRegion = var5_5;
            this.changedDuringTouch = false;
            var2_2 = 0;
            var9_9 = null;
            var10_10 = false;
            var11_12 = true;
        }
        var14_14 = this.changedDuringTouch;
        var8_8 = var3_3;
        var12_11 = var4_4;
        this.changedDuringTouch = var6_6 = this.handleTouchInput(var3_3, var4_4, var10_10, var11_12, (boolean)var2_2) | var14_14;
        if (var6_6 && var2_2 != 0 && (var9_9 = this.onActionUpListener) != null) {
            var15_15 = this.getDegreesFromXY(var3_3, var4_4);
            var4_4 = var15_15;
            var6_6 = this.isInTapRegion;
            var9_9.onActionUp(var4_4, var6_6);
        }
        return (boolean)var5_5;
    }

    public void setAnimateOnTouchUp(boolean bl2) {
        this.animatingOnTouchUp = bl2;
    }

    public void setCircleRadius(int n3) {
        this.circleRadius = n3;
        this.invalidate();
    }

    public void setCurrentLevel(int n3) {
        this.currentLevel = n3;
        this.invalidate();
    }

    public void setHandRotation(float f5) {
        this.setHandRotation(f5, false);
    }

    public void setHandRotation(float f5, boolean bl2) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!bl2) {
            this.setHandRotationInternal(f5, false);
            return;
        }
        Pair pair = this.getValuesForAnimation(f5);
        Object object = this.rotationAnimator;
        float f6 = ((Float)pair.first).floatValue();
        f5 = ((Float)pair.second).floatValue();
        float[] fArray = new float[]{f6, f5};
        object.setFloatValues(fArray);
        pair = this.rotationAnimator;
        long l2 = this.animationDuration;
        pair.setDuration(l2);
        pair = this.rotationAnimator;
        object = this.animationInterpolator;
        pair.setInterpolator((TimeInterpolator)object);
        pair = this.rotationAnimator;
        object = new a(this);
        pair.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        pair = this.rotationAnimator;
        object = new ClockHandView$1(this);
        pair.addListener((Animator.AnimatorListener)object);
        this.rotationAnimator.start();
    }

    public void setMultiLevel(boolean bl2) {
        boolean bl3 = this.isMultiLevel;
        if (bl3 && !bl2) {
            bl3 = true;
            this.currentLevel = (int)(bl3 ? 1 : 0);
        }
        this.isMultiLevel = bl2;
        this.invalidate();
    }

    public void setOnActionUpListener(ClockHandView$OnActionUpListener clockHandView$OnActionUpListener) {
        this.onActionUpListener = clockHandView$OnActionUpListener;
    }
}

