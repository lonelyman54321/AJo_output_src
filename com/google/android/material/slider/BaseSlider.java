/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.SeekBar
 */
package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider$1;
import com.google.android.material.slider.BaseSlider$2;
import com.google.android.material.slider.BaseSlider$3;
import com.google.android.material.slider.BaseSlider$AccessibilityEventSender;
import com.google.android.material.slider.BaseSlider$AccessibilityHelper;
import com.google.android.material.slider.BaseSlider$FullCornerDirection;
import com.google.android.material.slider.BaseSlider$SliderState;
import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.a;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class BaseSlider
extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    static final int DEF_STYLE_RES = 0;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = 0;
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private BaseSlider$AccessibilityEventSender accessibilityEventSender;
    private final BaseSlider$AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List changeListeners;
    private final RectF cornerRect;
    private Drawable customThumbDrawable;
    private List customThumbDrawablesForValues;
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;
    private final List labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private final Paint stopIndicatorPaint;
    private int thumbHeight;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackInsideCornerSize;
    private final Path trackPath;
    private final RectF trackRect;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList values;
    private int widgetHeight;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_Slider;
        LABEL_ANIMATION_ENTER_DURATION_ATTR = R$attr.motionDurationMedium4;
        LABEL_ANIMATION_EXIT_DURATION_ATTR = R$attr.motionDurationShort3;
        LABEL_ANIMATION_ENTER_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;
        LABEL_ANIMATION_EXIT_EASING_ATTR = R$attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.sliderStyle;
        this(context, attributeSet, n3);
    }

    public BaseSlider(Context object, AttributeSet attributeSet, int n3) {
        int n4;
        Paint paint;
        boolean bl2;
        int n7;
        int bl22 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, attributeSet, n3, bl22);
        super((Context)object, attributeSet, n3);
        this.labels = object = new ArrayList();
        this.changeListeners = object = new ArrayList();
        this.touchListeners = object = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = n7 = -1;
        this.defaultThumbTrackGapSize = n7;
        this.thumbIsPressed = false;
        Object object2 = new ArrayList();
        this.values = object2;
        this.activeThumbIdx = n7;
        this.focusedThumbIdx = n7;
        this.stepSize = 0.0f;
        this.tickVisible = bl2 = true;
        this.isLongPress = false;
        object2 = new Path();
        this.trackPath = object2;
        super();
        this.trackRect = object2;
        super();
        this.cornerRect = object2;
        super();
        this.defaultThumbDrawable = object2;
        this.customThumbDrawablesForValues = paint = Collections.emptyList();
        this.separationUnit = 0;
        object = new a(this);
        this.onScrollChangedListener = object;
        object = this.getContext();
        this.inactiveTrackPaint = paint = new Paint();
        this.activeTrackPaint = paint = new Paint();
        this.thumbPaint = paint = new Paint((int)(bl2 ? 1 : 0));
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)porterDuffXfermode);
        this.haloPaint = paint = new Paint((int)(bl2 ? 1 : 0));
        paint.setStyle(style2);
        this.inactiveTicksPaint = paint = new Paint();
        porterDuffXfermode = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)porterDuffXfermode);
        mode = Paint.Cap.ROUND;
        paint.setStrokeCap((Paint.Cap)mode);
        this.activeTicksPaint = paint = new Paint();
        paint.setStyle((Paint.Style)porterDuffXfermode);
        paint.setStrokeCap((Paint.Cap)mode);
        this.stopIndicatorPaint = paint = new Paint();
        paint.setStyle(style2);
        paint.setStrokeCap((Paint.Cap)mode);
        paint = object.getResources();
        this.loadResources((Resources)paint);
        this.processAttributes((Context)object, attributeSet, n3);
        this.setFocusable(bl2);
        this.setClickable(bl2);
        ((MaterialShapeDrawable)object2).setShadowCompatibilityMode(2);
        this.scaledTouchSlop = n4 = ViewConfiguration.get((Context)object).getScaledTouchSlop();
        this.accessibilityHelper = object = new BaseSlider$AccessibilityHelper(this);
        ViewCompat.s(this, (androidx.core.view.a)object);
        object = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.accessibilityManager = object;
    }

    public static /* synthetic */ void a(BaseSlider baseSlider) {
        baseSlider.updateLabels();
    }

    public static /* synthetic */ List access$000(BaseSlider baseSlider) {
        return baseSlider.labels;
    }

    public static /* synthetic */ BaseSlider$AccessibilityHelper access$200(BaseSlider baseSlider) {
        return baseSlider.accessibilityHelper;
    }

    public static /* synthetic */ String access$400(BaseSlider baseSlider, float f5) {
        return baseSlider.formatValue(f5);
    }

    public static /* synthetic */ boolean access$500(BaseSlider baseSlider, int n3, float f5) {
        return baseSlider.snapThumbToValue(n3, f5);
    }

    public static /* synthetic */ void access$600(BaseSlider baseSlider) {
        baseSlider.updateHaloHotspot();
    }

    public static /* synthetic */ float access$700(BaseSlider baseSlider, int n3) {
        return baseSlider.calculateStepIncrement(n3);
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable2) {
        int n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight();
        int n7 = -1;
        float f5 = 0.0f / 0.0f;
        if (n3 == n7 && n4 == n7) {
            n3 = this.thumbWidth;
            n4 = this.thumbHeight;
            drawable2.setBounds(0, 0, n3, n4);
        } else {
            n7 = this.thumbWidth;
            int n8 = this.thumbHeight;
            n7 = Math.max(n7, n8);
            f5 = n7;
            n8 = Math.max(n3, n4);
            float f6 = n8;
            float f7 = (float)n3 * (f5 /= f6);
            n3 = (int)f7;
            float f8 = (float)n4 * f5;
            n4 = (int)f8;
            drawable2.setBounds(0, 0, n3, n4);
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup viewGroup = ViewUtils.getContentView(this);
        tooltipDrawable.setRelativeToView((View)viewGroup);
    }

    private Float calculateIncrementForKey(int n3) {
        float f5;
        int n4 = this.isLongPress;
        if (n4 != 0) {
            n4 = 20;
            f5 = this.calculateStepIncrement(n4);
        } else {
            f5 = this.calculateStepIncrement();
        }
        int n7 = 21;
        if (n3 != n7) {
            n7 = 22;
            if (n3 != n7) {
                n7 = 69;
                if (n3 != n7) {
                    n7 = 70;
                    if (n3 != n7 && n3 != (n7 = 81)) {
                        return null;
                    }
                    return Float.valueOf(f5);
                }
                return Float.valueOf(-f5);
            }
            n3 = (int)(this.isRtl() ? 1 : 0);
            if (n3 != 0) {
                f5 = -f5;
            }
            return Float.valueOf(f5);
        }
        n3 = (int)(this.isRtl() ? 1 : 0);
        if (n3 == 0) {
            f5 = -f5;
        }
        return Float.valueOf(f5);
    }

    private float calculateStepIncrement() {
        float f5 = this.stepSize;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = 1.0f;
        }
        return f5;
    }

    private float calculateStepIncrement(int n3) {
        float f5 = this.calculateStepIncrement();
        float f6 = this.valueTo;
        float f7 = this.valueFrom;
        float f8 = n3;
        float f11 = (f6 = (f6 - f7) / f5) - f8;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0) {
            return f5;
        }
        return (float)Math.round(f6 / f8) * f5;
    }

    private int calculateTrackCenter() {
        int n3 = this.widgetHeight / 2;
        int n4 = this.labelBehavior;
        int n7 = 1;
        int n8 = 0;
        if (n4 == n7 || (n4 = (int)(this.shouldAlwaysShowLabel() ? 1 : 0)) != 0) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable)this.labels.get(0);
            n8 = tooltipDrawable.getIntrinsicHeight();
        }
        return n3 + n8;
    }

    /*
     * WARNING - void declaration
     */
    private ValueAnimator createLabelAnimator(boolean bl2) {
        void var1_4;
        Object object;
        ValueAnimator valueAnimator;
        float f5;
        int n3;
        float f6 = 1.0f;
        int n4 = 0;
        Object object2 = null;
        if (bl2) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            n3 = 1065353216;
            f5 = 1.0f;
        }
        ValueAnimator valueAnimator2 = bl2 ? this.labelsOutAnimator : this.labelsInAnimator;
        f5 = BaseSlider.getAnimatorCurrentValueOrDefault(valueAnimator2, f5);
        if (!bl2) {
            f6 = 0.0f;
            valueAnimator = null;
        }
        n4 = 2;
        object2 = new float[n4];
        valueAnimator2 = null;
        object2[0] = f5;
        n3 = 1;
        f5 = Float.MIN_VALUE;
        object2[n3] = f6;
        valueAnimator = ValueAnimator.ofFloat((float[])object2);
        if (bl2) {
            object = this.getContext();
            n4 = LABEL_ANIMATION_ENTER_DURATION_ATTR;
            f5 = 1.16E-43f;
            int n7 = MotionUtils.resolveThemeDuration(object, n4, 83);
            object2 = this.getContext();
            n3 = LABEL_ANIMATION_ENTER_EASING_ATTR;
            valueAnimator2 = AnimationUtils.DECELERATE_INTERPOLATOR;
            object2 = MotionUtils.resolveThemeInterpolator((Context)object2, n3, (TimeInterpolator)valueAnimator2);
        } else {
            object = this.getContext();
            n4 = LABEL_ANIMATION_EXIT_DURATION_ATTR;
            f5 = 1.64E-43f;
            int n8 = MotionUtils.resolveThemeDuration(object, n4, 117);
            object2 = this.getContext();
            n3 = LABEL_ANIMATION_EXIT_EASING_ATTR;
            valueAnimator2 = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            object2 = MotionUtils.resolveThemeInterpolator((Context)object2, n3, (TimeInterpolator)valueAnimator2);
        }
        long l2 = (long)var1_4;
        valueAnimator.setDuration(l2);
        valueAnimator.setInterpolator((TimeInterpolator)object2);
        object = new BaseSlider$1(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        return valueAnimator;
    }

    private void createLabelPool() {
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3 = this.labels;
        int n8 = object3.size();
        if (n8 > (n7 = ((ArrayList)(object2 = this.values)).size())) {
            object3 = this.labels;
            n7 = this.values.size();
            object = this.labels;
            n4 = object.size();
            object3 = object3.subList(n7, n4);
            object2 = object3.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object = (TooltipDrawable)object2.next();
                n3 = (int)(this.isAttachedToWindow() ? 1 : 0);
                if (n3 == 0) continue;
                this.detachLabelFromContentView((TooltipDrawable)object);
            }
            object3.clear();
        }
        while (true) {
            object3 = this.labels;
            n8 = object3.size();
            object2 = this.values;
            n7 = ((ArrayList)object2).size();
            n4 = 0;
            object = null;
            if (n8 >= n7) break;
            object3 = this.getContext();
            n3 = this.labelStyle;
            object3 = TooltipDrawable.createFromAttributes((Context)object3, null, 0, n3);
            this.labels.add(object3);
            object2 = ViewCompat.a;
            n7 = (int)(this.isAttachedToWindow() ? 1 : 0);
            if (n7 == 0) continue;
            this.attachLabelToContentView((TooltipDrawable)object3);
        }
        object3 = this.labels;
        n8 = object3.size();
        if (n8 != (n7 = 1)) {
            n4 = 1;
        }
        object3 = this.labels.iterator();
        while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object2 = (TooltipDrawable)object3.next();
            float f5 = n4;
            ((MaterialShapeDrawable)object2).setStrokeWidth(f5);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl viewOverlayImpl = ViewUtils.getContentViewOverlay(this);
        if (viewOverlayImpl != null) {
            viewOverlayImpl.remove(tooltipDrawable);
            viewOverlayImpl = ViewUtils.getContentView(this);
            tooltipDrawable.detachView((View)viewOverlayImpl);
        }
    }

    private float dimenToValue(float f5) {
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return 0.0f;
        }
        f6 = this.trackSidePadding;
        f5 -= f6;
        f6 = this.trackWidth;
        f5 /= f6;
        f6 = this.valueFrom;
        float f8 = this.valueTo;
        return xu0_1.a(f6, f8, f5, f6);
    }

    private void dispatchOnChangedFromUser(int n3) {
        boolean bl2;
        boolean bl3;
        AccessibilityManager accessibilityManager = this.changeListeners.iterator();
        while (bl3 = accessibilityManager.hasNext()) {
            BaseOnChangeListener baseOnChangeListener = (BaseOnChangeListener)accessibilityManager.next();
            Float f5 = (Float)this.values.get(n3);
            float f6 = f5.floatValue();
            boolean bl4 = true;
            baseOnChangeListener.onValueChange((Object)this, f6, bl4);
        }
        accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && (bl2 = accessibilityManager.isEnabled())) {
            this.scheduleAccessibilityEventSender(n3);
        }
    }

    private void dispatchOnChangedProgrammatically() {
        boolean bl2;
        Iterator iterator = this.changeListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            BaseOnChangeListener baseOnChangeListener = (BaseOnChangeListener)iterator.next();
            Iterator iterator2 = this.values.iterator();
            while (bl3 = iterator2.hasNext()) {
                Float f5 = (Float)iterator2.next();
                float f6 = f5.floatValue();
                baseOnChangeListener.onValueChange((Object)this, f6, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void drawActiveTrack(Canvas canvas, int n3, int n4) {
        int n7;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection;
        Object object = this.getActiveRange();
        int n8 = this.trackSidePadding;
        float f5 = n8;
        int n10 = 1;
        float f6 = object[n10];
        float f7 = n3;
        float f8 = (f6 *= f7) + f5;
        float f11 = n8;
        int n14 = 0;
        f5 = 0.0f;
        float f12 = object[0] * f7;
        float f14 = f12 + f11;
        n3 = (int)(this.hasGapBetweenThumbAndTrack() ? 1 : 0);
        if (n3 != 0) {
            baseSlider$FullCornerDirection = BaseSlider$FullCornerDirection.NONE;
            object = this.values;
            n7 = ((ArrayList)object).size();
            if (n7 == n10) {
                n3 = (int)(this.isRtl() ? 1 : 0);
                baseSlider$FullCornerDirection = n3 != 0 ? BaseSlider$FullCornerDirection.RIGHT : BaseSlider$FullCornerDirection.LEFT;
            }
        } else {
            Paint paint = this.activeTrackPaint;
            object = Paint.Style.STROKE;
            paint.setStyle((Paint.Style)object);
            paint = this.activeTrackPaint;
            object = Paint.Cap.ROUND;
            paint.setStrokeCap((Paint.Cap)object);
            float f15 = n4;
            Paint paint2 = this.activeTrackPaint;
            float f16 = f15;
            canvas.drawLine(f14, f15, f8, f15, paint2);
            return;
        }
        while (n14 < (n7 = ((ArrayList)(object = this.values)).size())) {
            block12: {
                block13: {
                    block10: {
                        block11: {
                            object = this.values;
                            n7 = ((ArrayList)object).size();
                            if (n7 > n10) {
                                if (n14 > 0) {
                                    object = this.values;
                                    n8 = n14 + -1;
                                    object = (Float)((ArrayList)object).get(n8);
                                    f12 = ((Float)object).floatValue();
                                    f14 = this.valueToX(f12);
                                }
                                object = (Float)this.values.get(n14);
                                f12 = ((Float)object).floatValue();
                                f12 = this.valueToX(f12);
                                n8 = (int)(this.isRtl() ? 1 : 0);
                                if (n8 != 0) {
                                    f8 = f14;
                                    f14 = f12;
                                } else {
                                    f8 = f12;
                                }
                            }
                            object = BaseSlider$3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
                            n8 = baseSlider$FullCornerDirection.ordinal();
                            n7 = (int)object[n8];
                            n8 = 0x40000000;
                            f11 = 2.0f;
                            if (n7 == n10) break block10;
                            int n15 = 2;
                            f6 = 2.8E-45f;
                            if (n7 == n15) break block11;
                            n15 = 3;
                            f6 = 4.2E-45f;
                            if (n7 == n15) {
                                f12 = this.thumbTrackGapSize;
                                f14 += f12;
                                n7 = this.trackHeight;
                                f8 = f12 = (float)n7 / f11 + f8;
                            }
                            break block12;
                        }
                        f12 = (float)this.trackHeight / f11;
                        f14 -= f12;
                        n7 = this.thumbTrackGapSize;
                        break block13;
                    }
                    n7 = this.thumbTrackGapSize;
                    f6 = n7;
                    f14 += f6;
                }
                f12 = n7;
                f8 -= f12;
            }
            n7 = (int)(f14 == f8 ? 0 : (f14 > f8 ? 1 : -1));
            if (n7 < 0) {
                object = this.trackRect;
                f6 = n4;
                int n16 = this.trackHeight;
                float f17 = (float)n16 / f11;
                f17 = f6 - f17;
                float f18 = (float)n16 / f11 + f6;
                object.set(f14, f17, f8, f18);
                object = this.activeTrackPaint;
                RectF rectF = this.trackRect;
                this.updateTrack(canvas, (Paint)object, rectF, baseSlider$FullCornerDirection);
            }
            ++n14;
        }
    }

    private void drawInactiveTrack(Canvas canvas, int n3, int n4) {
        Object object;
        RectF rectF;
        float f5;
        float f6;
        Object object2 = this.getActiveRange();
        int n7 = this.trackSidePadding;
        float f7 = n7;
        int n8 = 1;
        float f8 = object2[n8];
        float f11 = n3;
        float f12 = (f8 *= f11) + f7;
        float f14 = n7 + n3;
        f7 = 2.0f;
        n7 = (int)(f12 == f14 ? 0 : (f12 < f14 ? -1 : 1));
        if (n7 < 0) {
            n7 = (int)(this.hasGapBetweenThumbAndTrack() ? 1 : 0);
            if (n7 != 0) {
                RectF rectF2 = this.trackRect;
                n8 = this.thumbTrackGapSize;
                f8 = n8;
                f12 += f8;
                f8 = n4;
                int n10 = this.trackHeight;
                f6 = (float)n10 / f7;
                f6 = f8 - f6;
                int n14 = this.trackSidePadding + n3;
                f5 = n14;
                float f15 = (float)n10 / f7 + f5;
                f5 = (float)n10 / f7 + f8;
                rectF2.set(f12, f6, f15, f5);
                rectF = this.inactiveTrackPaint;
                rectF2 = this.trackRect;
                object = BaseSlider$FullCornerDirection.RIGHT;
                this.updateTrack(canvas, (Paint)rectF, rectF2, (BaseSlider$FullCornerDirection)((Object)object));
            } else {
                Paint paint = this.inactiveTrackPaint;
                object = Paint.Style.STROKE;
                paint.setStyle(object);
                paint = this.inactiveTrackPaint;
                object = Paint.Cap.ROUND;
                paint.setStrokeCap((Paint.Cap)object);
                float f16 = n4;
                n7 = this.trackSidePadding + n3;
                float f17 = n7;
                Paint paint2 = this.inactiveTrackPaint;
                f6 = f16;
                canvas.drawLine(f12, f16, f17, f16, paint2);
            }
        }
        n3 = this.trackSidePadding;
        f14 = n3;
        n8 = 0;
        f8 = 0.0f;
        object = null;
        float f18 = object2[0] * f11;
        f12 = f18 + f14;
        f5 = n3;
        float f19 = f12 - f5;
        if ((n3 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1))) > 0) {
            n3 = (int)(this.hasGapBetweenThumbAndTrack() ? 1 : 0);
            if (n3 != 0) {
                rectF = this.trackRect;
                int n15 = this.trackSidePadding;
                f18 = n15;
                n7 = this.trackHeight;
                f8 = (float)n7 / f7;
                f18 -= f8;
                float f20 = n4;
                f8 = (float)n7 / f7;
                f8 = f20 - f8;
                int n16 = this.thumbTrackGapSize;
                f11 = n16;
                f14 = (float)n7 / f7 + f20;
                rectF.set(f18, f8, f12 -= f11, f14);
                rectF = this.inactiveTrackPaint;
                RectF rectF3 = this.trackRect;
                object2 = (Object)BaseSlider$FullCornerDirection.LEFT;
                this.updateTrack(canvas, (Paint)rectF, rectF3, (BaseSlider$FullCornerDirection)((Object)object2));
            } else {
                rectF = this.inactiveTrackPaint;
                object2 = Paint.Style.STROKE;
                rectF.setStyle((Paint.Style)object2);
                rectF = this.inactiveTrackPaint;
                object2 = Paint.Cap.ROUND;
                rectF.setStrokeCap((Paint.Cap)object2);
                n3 = this.trackSidePadding;
                f11 = n3;
                f6 = n4;
                Paint paint = this.inactiveTrackPaint;
                object = canvas;
                canvas.drawLine(f11, f6, f12, f6, paint);
            }
        }
    }

    private void drawThumbDrawable(Canvas canvas, int n3, int n4, float f5, Drawable drawable2) {
        canvas.save();
        int n7 = this.trackSidePadding;
        f5 = this.normalizeValue(f5);
        float f6 = n3;
        n3 = (int)(f5 * f6);
        f6 = n7 + n3;
        f5 = drawable2.getBounds().width();
        float f7 = 2.0f;
        float f8 = n4;
        f5 = (float)drawable2.getBounds().height() / f7;
        canvas.translate(f6 -= (f5 /= f7), f8 -= f5);
        drawable2.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(Canvas canvas, int n3, int n4) {
        Object object;
        int n7;
        for (int i3 = 0; i3 < (n7 = ((ArrayList)(object = this.values)).size()); ++i3) {
            object = (Float)this.values.get(i3);
            float f5 = ((Float)object).floatValue();
            Object object2 = this.customThumbDrawable;
            if (object2 != null) {
                this.drawThumbDrawable(canvas, n3, n4, f5, (Drawable)object2);
                continue;
            }
            object = this.customThumbDrawablesForValues;
            n7 = object.size();
            if (i3 < n7) {
                object = this.customThumbDrawablesForValues.get(i3);
                object2 = object;
                object2 = (Drawable)object;
                this.drawThumbDrawable(canvas, n3, n4, f5, (Drawable)object2);
                continue;
            }
            n7 = (int)(this.isEnabled() ? 1 : 0);
            if (n7 == 0) {
                n7 = this.trackSidePadding;
                float f6 = n7;
                float f7 = this.normalizeValue(f5);
                float f8 = n3;
                f7 = f7 * f8 + f6;
                f6 = n4;
                int n8 = this.getThumbRadius();
                f8 = n8;
                Paint paint = this.thumbPaint;
                canvas.drawCircle(f7, f6, f8, paint);
            }
            object2 = this.defaultThumbDrawable;
            this.drawThumbDrawable(canvas, n3, n4, f5, (Drawable)object2);
        }
    }

    private void ensureLabelsAdded() {
        Object object;
        Object object2;
        int n3;
        Integer n4;
        int n7;
        Object object3;
        Object object4 = null;
        int n8 = 1;
        float f5 = Float.MIN_VALUE;
        int n10 = this.labelsAreAnimatedIn;
        if (n10 == 0) {
            this.labelsAreAnimatedIn = n8;
            object3 = this.createLabelAnimator(n8 != 0);
            this.labelsInAnimator = object3;
            n7 = 0;
            n4 = null;
            this.labelsOutAnimator = null;
            object3.start();
        }
        object3 = this.labels.iterator();
        n4 = null;
        for (n7 = 0; n7 < (n3 = ((ArrayList)(object2 = this.values)).size()) && (n3 = (int)(object3.hasNext() ? 1 : 0)) != 0; n7 += n8) {
            n3 = this.focusedThumbIdx;
            if (n7 == n3) continue;
            object2 = (TooltipDrawable)object3.next();
            object = (Float)this.values.get(n7);
            float f6 = ((Float)object).floatValue();
            this.setValueForLabel((TooltipDrawable)object2, f6);
        }
        n7 = (int)(object3.hasNext() ? 1 : 0);
        if (n7 != 0) {
            object4 = (TooltipDrawable)object3.next();
            ArrayList arrayList = this.values;
            n10 = this.focusedThumbIdx;
            f5 = ((Float)arrayList.get(n10)).floatValue();
            this.setValueForLabel((TooltipDrawable)object4, f5);
            return;
        }
        n4 = this.labels.size();
        object2 = this.values.size();
        object = new Object[2];
        object[0] = n4;
        object[n8] = object2;
        object4 = String.format("Not enough labels(%d) to display all the values(%d)", (Object[])object);
        object3 = new IllegalStateException((String)object4);
        throw object3;
    }

    private void ensureLabelsRemoved() {
        boolean bl2 = this.labelsAreAnimatedIn;
        if (bl2) {
            ValueAnimator valueAnimator;
            bl2 = false;
            this.labelsAreAnimatedIn = false;
            this.labelsOutAnimator = valueAnimator = this.createLabelAnimator(false);
            this.labelsInAnimator = null;
            BaseSlider$2 baseSlider$2 = new BaseSlider$2(this);
            valueAnimator.addListener((Animator.AnimatorListener)baseSlider$2);
            valueAnimator = this.labelsOutAnimator;
            valueAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int n3) {
        int n4 = 1;
        int n7 = -1 >>> 1;
        if (n3 != n4) {
            n4 = 2;
            int n8 = -1 << -1;
            if (n3 != n4) {
                n4 = 17;
                if (n3 != n4) {
                    n4 = 66;
                    if (n3 == n4) {
                        this.moveFocusInAbsoluteDirection(n8);
                    }
                } else {
                    this.moveFocusInAbsoluteDirection(n7);
                }
            } else {
                this.moveFocus(n8);
            }
        } else {
            this.moveFocus(n7);
        }
    }

    private String formatValue(float f5) {
        Object object = this.hasLabelFormatter();
        if (object) {
            return this.formatter.getFormattedValue(f5);
        }
        float f6 = (int)f5;
        float f7 = f6 - f5;
        object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        String string2 = !object ? "%.0f" : "%.2f";
        Float f8 = Float.valueOf(f5);
        Object[] objectArray = new Object[]{f8};
        return String.format(string2, objectArray);
    }

    private float[] getActiveRange() {
        Float f5 = (Float)this.values.get(0);
        float f6 = f5.floatValue();
        Serializable serializable = this.values;
        int n3 = 1;
        serializable = (Float)pp_0.a(n3, (ArrayList)serializable);
        float f7 = ((Float)serializable).floatValue();
        Object object = this.values;
        int n4 = ((ArrayList)object).size();
        if (n4 == n3) {
            f6 = this.valueFrom;
        }
        f6 = this.normalizeValue(f6);
        f7 = this.normalizeValue(f7);
        n4 = (int)(this.isRtl() ? 1 : 0);
        int n7 = 2;
        if (n4 != 0) {
            object = new float[n7];
            object[0] = f7;
            object[n3] = f6;
        } else {
            object = new float[n7];
            object[0] = f6;
            object[n3] = f7;
        }
        return object;
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f5) {
        boolean bl2;
        if (valueAnimator != null && (bl2 = valueAnimator.isRunning())) {
            Float f6 = (Float)valueAnimator.getAnimatedValue();
            f5 = f6.floatValue();
            valueAnimator.cancel();
        }
        return f5;
    }

    private float getClampedValue(int n3, float f5) {
        float f6;
        float f7;
        ArrayList arrayList;
        int n4;
        float f8 = this.getMinSeparation();
        int n7 = this.separationUnit;
        if (n7 == 0) {
            f8 = this.dimenToValue(f8);
        }
        if ((n7 = (int)(this.isRtl() ? 1 : 0)) != 0) {
            f8 = -f8;
        }
        if ((n7 = n3 + 1) >= (n4 = (arrayList = this.values).size())) {
            f7 = this.valueTo;
        } else {
            arrayList = this.values;
            Float f11 = (Float)arrayList.get(n7);
            f7 = f11.floatValue() - f8;
        }
        if ((n3 += -1) < 0) {
            f6 = this.valueFrom;
        } else {
            arrayList = this.values;
            Float f12 = (Float)arrayList.get(n3);
            f6 = f12.floatValue() + f8;
        }
        return PK1.a(f5, f6, f7);
    }

    private int getColorForState(ColorStateList colorStateList) {
        int[] nArray = this.getDrawableState();
        int n3 = colorStateList.getDefaultColor();
        return colorStateList.getColorForState(nArray, n3);
    }

    private float[] getCornerRadii(float f5, float f6) {
        float[] fArray = new float[]{f5, f5, f6, f6, f6, f6, f5, f5};
        return fArray;
    }

    private float getValueOfTouchPosition() {
        double d2;
        float f5 = this.touchPosition;
        double d5 = this.snapPosition(f5);
        boolean bl2 = this.isRtl();
        if (bl2) {
            d2 = 1.0;
            d5 = d2 - d5;
        }
        float f6 = this.valueTo;
        float f7 = this.valueFrom;
        double d7 = f6 - f7;
        d2 = f7;
        return (float)((d5 *= d7) + d2);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f5;
        float f6 = this.touchPosition;
        int n3 = this.isRtl();
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = 1.0f;
            f6 = f5 - f6;
        }
        f5 = this.valueTo;
        float f7 = this.valueFrom;
        return xu0_1.a(f5, f7, f6, f7);
    }

    private boolean hasGapBetweenThumbAndTrack() {
        int n3 = this.thumbTrackGapSize;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable2) {
        drawable2 = drawable2.mutate().getConstantState().newDrawable();
        this.adjustCustomThumbDrawableBounds(drawable2);
        return drawable2;
    }

    private void invalidateTrack() {
        Paint paint = this.inactiveTrackPaint;
        float f5 = this.trackHeight;
        paint.setStrokeWidth(f5);
        paint = this.activeTrackPaint;
        f5 = this.trackHeight;
        paint.setStrokeWidth(f5);
    }

    private boolean isInVerticalScrollingContainer() {
        boolean bl2;
        ViewParent viewParent = this.getParent();
        while (bl2 = viewParent instanceof ViewGroup) {
            ViewParent viewParent2 = viewParent;
            viewParent2 = (ViewGroup)viewParent;
            boolean bl3 = true;
            boolean bl4 = viewParent2.canScrollVertically((int)(bl3 ? 1 : 0));
            if ((bl4 || (bl4 = viewParent2.canScrollVertically(-1))) && (bl2 = viewParent2.shouldDelayChildPressedState())) {
                return bl3;
            }
            viewParent = viewParent.getParent();
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        int n3;
        boolean bl2 = false;
        int n4 = motionEvent.getToolType(0);
        if (n4 == (n3 = 3)) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isMultipleOfStepSize(double d2) {
        boolean bl2;
        double d5;
        Object object = Double.toString(d2);
        BigDecimal bigDecimal = new BigDecimal((String)object);
        float f5 = this.stepSize;
        Object object2 = Float.toString(f5);
        object = new BigDecimal((String)object2);
        object2 = MathContext.DECIMAL64;
        object = bigDecimal.divide((BigDecimal)object, (MathContext)object2);
        d2 = ((BigDecimal)object).doubleValue();
        double d7 = (d2 = Math.abs((double)Math.round(d2) - d2)) - (d5 = 1.0E-4);
        Object object3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object3 < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        boolean bl2 = BaseSlider.isMouseEvent(motionEvent);
        if (!bl2 && (bl2 = this.isInVerticalScrollingContainer())) {
            bl2 = true;
        } else {
            bl2 = false;
            motionEvent = null;
        }
        return bl2;
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return this.getLocalVisibleRect(rect);
    }

    private void loadResources(Resources resources) {
        int n3;
        int n4 = R$dimen.mtrl_slider_widget_height;
        this.minWidgetHeight = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_track_side_padding;
        this.minTrackSidePadding = n4 = resources.getDimensionPixelOffset(n4);
        this.trackSidePadding = n4;
        n4 = R$dimen.mtrl_slider_thumb_radius;
        this.defaultThumbRadius = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_track_height;
        this.defaultTrackHeight = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_tick_radius;
        this.defaultTickActiveRadius = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_tick_radius;
        this.defaultTickInactiveRadius = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_tick_min_spacing;
        this.minTickSpacing = n4 = resources.getDimensionPixelSize(n4);
        n4 = R$dimen.mtrl_slider_label_padding;
        this.labelPadding = n3 = resources.getDimensionPixelSize(n4);
    }

    private void maybeCalculateTicksCoordinates() {
        float f5;
        float f6 = this.stepSize;
        int n3 = 0;
        float f7 = 0.0f;
        float[] fArray = null;
        float f8 = f6 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object <= 0) {
            return;
        }
        this.validateConfigurationIfDirty();
        f6 = this.valueTo;
        f7 = this.valueFrom;
        f6 -= f7;
        f7 = this.stepSize;
        f6 /= f7;
        f7 = 1.0f;
        object = (int)(f6 += f7);
        n3 = this.trackWidth;
        int n4 = this.minTickSpacing;
        n3 = n3 / n4 + 1;
        object = Math.min((int)object, n3);
        fArray = this.ticksCoordinates;
        if (fArray == null || (n3 = fArray.length) != (n4 = (int)(object * 2))) {
            n3 = (int)(object * 2);
            this.ticksCoordinates = fArray = new float[n3];
        }
        n3 = this.trackWidth;
        f7 = n3;
        float f11 = object + -1;
        f7 /= f11;
        f11 = 0.0f;
        for (n4 = 0; n4 < (f5 = object * 2); n4 += 2) {
            float[] fArray2 = this.ticksCoordinates;
            float f12 = this.trackSidePadding;
            float f14 = n4;
            float f15 = 2.0f;
            fArray2[n4] = f14 = f14 / f15 * f7 + f12;
            int n7 = n4 + 1;
            int n8 = this.calculateTrackCenter();
            fArray2[n7] = f14 = (float)n8;
        }
    }

    private void maybeDrawCompatHalo(Canvas canvas, int n3, int n4) {
        int n7 = this.shouldDrawCompatHalo();
        if (n7 != 0) {
            float f5 = this.trackSidePadding;
            Serializable serializable = this.values;
            int n8 = this.focusedThumbIdx;
            serializable = (Float)((ArrayList)serializable).get(n8);
            float f6 = ((Float)serializable).floatValue();
            f6 = this.normalizeValue(f6);
            float f7 = n3;
            n3 = (int)(f6 * f7 + f5);
            n7 = Build.VERSION.SDK_INT;
            int n10 = 28;
            f6 = 3.9E-44f;
            if (n7 < n10) {
                n7 = this.haloRadius;
                float f8 = n3 - n7;
                float f11 = n4 - n7;
                n10 = n3 + n7;
                float f12 = n10;
                float f14 = n7 += n4;
                Region.Op op2 = Region.Op.UNION;
                canvas.clipRect(f8, f11, f12, f14, op2);
            }
            f7 = n3;
            float f15 = n4;
            n7 = this.haloRadius;
            f5 = n7;
            serializable = this.haloPaint;
            canvas.drawCircle(f7, f15, f5, (Paint)serializable);
        }
    }

    private void maybeDrawStopIndicator(Canvas canvas, int n3) {
        float f5;
        int n4 = this.trackStopIndicatorSize;
        if (n4 <= 0) {
            return;
        }
        Serializable serializable = this.values;
        n4 = ((ArrayList)serializable).size();
        int n7 = 1;
        float f6 = Float.MIN_VALUE;
        if (n4 >= n7) {
            float f7;
            serializable = this.values;
            f5 = ((Float)(serializable = (Float)pp_0.a(n7, (ArrayList)serializable))).floatValue();
            float f8 = f5 - (f7 = this.valueTo);
            n4 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
            if (n4 < 0) {
                f5 = this.valueToX(f7);
                f7 = n3;
                Paint paint = this.stopIndicatorPaint;
                canvas.drawPoint(f5, f7, paint);
            }
        }
        if ((n4 = ((ArrayList)(serializable = this.values)).size()) > n7) {
            serializable = this.values;
            n7 = 0;
            Paint paint = null;
            f5 = ((Float)(serializable = (Float)((ArrayList)serializable).get(0))).floatValue();
            float f11 = f5 - (f6 = this.valueFrom);
            n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
            if (n4 > 0) {
                f5 = this.valueToX(f6);
                float f12 = n3;
                paint = this.stopIndicatorPaint;
                canvas.drawPoint(f5, f12, paint);
            }
        }
    }

    private void maybeDrawTicks(Canvas canvas) {
        Object object = this.tickVisible;
        if (object != 0) {
            float f5 = this.stepSize;
            float[] fArray = null;
            float f6 = f5 - 0.0f;
            object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (object > 0) {
                float[] fArray2 = this.getActiveRange();
                fArray = null;
                float f7 = fArray2[0];
                Object object2 = this.ticksCoordinates;
                float f8 = ((float[])object2).length;
                int n3 = 0x40000000;
                float f11 = 2.0f;
                int n4 = 1065353216;
                float f12 = 1.0f;
                double d2 = Math.ceil(((f8 /= f11) - f12) * f7);
                int n7 = (int)d2;
                int n8 = 1;
                f8 = Float.MIN_VALUE;
                f5 = fArray2[n8];
                Object object3 = this.ticksCoordinates;
                int n10 = ((float[])object3).length;
                float f14 = ((float)n10 / f11 - f12) * f5;
                double d5 = Math.floor(f14);
                object = (int)d5;
                if (n7 > 0) {
                    float[] fArray3 = this.ticksCoordinates;
                    n4 = n7 * 2;
                    object3 = this.inactiveTicksPaint;
                    canvas.drawPoints(fArray3, 0, n4, (Paint)object3);
                }
                if (n7 <= object) {
                    fArray = this.ticksCoordinates;
                    n3 = n7 * 2;
                    n7 = (object - n7 + n8) * 2;
                    Paint paint = this.activeTicksPaint;
                    canvas.drawPoints(fArray, n3, n7, paint);
                }
                if ((object = (object + n8) * 2) < (n7 = (fArray = this.ticksCoordinates).length)) {
                    n7 = fArray.length - object;
                    object2 = this.inactiveTicksPaint;
                    canvas.drawPoints(fArray, object, n7, (Paint)object2);
                }
            }
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int n3 = this.thumbWidth / 2;
        int n4 = this.defaultThumbRadius;
        n3 -= n4;
        n4 = 0;
        n3 = Math.max(n3, 0);
        int n7 = this.trackHeight;
        int n8 = this.defaultTrackHeight;
        n7 = Math.max((n7 - n8) / 2, 0);
        n8 = this.tickActiveRadius;
        int n10 = this.defaultTickActiveRadius;
        n8 = Math.max(n8 - n10, 0);
        n10 = this.tickInactiveRadius;
        int n14 = this.defaultTickInactiveRadius;
        n10 = Math.max(n10 - n14, 0);
        n14 = this.minTrackSidePadding;
        n3 = Math.max(n3, n7);
        n7 = Math.max(n8, n10);
        n7 = this.trackSidePadding;
        if (n7 == (n3 = Math.max(n3, n7) + n14)) {
            return false;
        }
        this.trackSidePadding = n3;
        n3 = (int)(this.isLaidOut() ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getWidth();
            this.updateTrackWidth(n3);
        }
        return true;
    }

    private boolean maybeIncreaseWidgetHeight() {
        int n3 = this.getPaddingTop();
        int n4 = this.getPaddingBottom() + n3;
        n3 = this.trackHeight + n4;
        n4 = this.thumbHeight;
        int n7 = this.getPaddingTop() + n4;
        n4 = this.getPaddingBottom() + n7;
        n7 = this.minWidgetHeight;
        n3 = Math.max(n3, n4);
        if ((n3 = Math.max(n7, n3)) == (n4 = this.widgetHeight)) {
            return false;
        }
        this.widgetHeight = n3;
        return true;
    }

    private boolean moveFocus(int n3) {
        int n4 = this.focusedThumbIdx;
        long l2 = n4;
        long l3 = n3;
        ArrayList arrayList = this.values;
        n3 = arrayList.size();
        int n7 = 1;
        long l4 = n3 - n7;
        long l7 = 0L;
        long l8 = (l2 += l3) - l7;
        n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
        if (n3 < 0) {
            l2 = l7;
        } else {
            n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
            if (n3 > 0) {
                l2 = l4;
            }
        }
        this.focusedThumbIdx = n3 = (int)l2;
        if (n3 == n4) {
            return false;
        }
        n4 = this.activeThumbIdx;
        int n8 = -1;
        if (n4 != n8) {
            this.activeThumbIdx = n3;
        }
        this.updateHaloHotspot();
        this.postInvalidate();
        return n7 != 0;
    }

    private boolean moveFocusInAbsoluteDirection(int n3) {
        int n4 = this.isRtl();
        if (n4 != 0) {
            n4 = -1 << -1;
            n3 = n3 == n4 ? -1 >>> 1 : -n3;
        }
        return this.moveFocus(n3);
    }

    private float normalizeValue(float f5) {
        float f6 = this.valueFrom;
        f5 -= f6;
        float f7 = this.valueTo - f6;
        f5 /= f7;
        boolean bl2 = this.isRtl();
        if (bl2) {
            return 1.0f - f5;
        }
        return f5;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Boolean onKeyDownNoActiveThumb(int var1_1, KeyEvent var2_2) {
        block8: {
            block9: {
                var3_3 = 61;
                var4_4 = -1;
                var5_5 = 1;
                if (var1_1 == var3_3) break block8;
                var6_6 = 66;
                if (var1_1 == var6_6) break block9;
                var6_6 = 81;
                if (var1_1 == var6_6) ** GOTO lbl27
                var6_6 = 69;
                if (var1_1 == var6_6) {
                    this.moveFocus(var4_4);
                    return Boolean.TRUE;
                }
                var6_6 = 70;
                if (var1_1 == var6_6) ** GOTO lbl27
                switch (var1_1) {
                    default: {
                        return null;
                    }
                    case 22: {
                        this.moveFocusInAbsoluteDirection(var5_5);
                        return Boolean.TRUE;
                    }
                    case 21: {
                        this.moveFocusInAbsoluteDirection(var4_4);
                        return Boolean.TRUE;
                    }
lbl27:
                    // 2 sources

                    this.moveFocus(var5_5);
                    return Boolean.TRUE;
                    case 23: 
                }
            }
            this.activeThumbIdx = var1_1 = this.focusedThumbIdx;
            this.postInvalidate();
            return Boolean.TRUE;
        }
        var1_1 = (int)var2_2.hasNoModifiers();
        if (var1_1 != 0) {
            return this.moveFocus(var5_5);
        }
        var1_1 = (int)var2_2.isShiftPressed();
        if (var1_1 != 0) {
            return this.moveFocus(var4_4);
        }
        return Boolean.FALSE;
    }

    private void onStartTrackingTouch() {
        boolean bl2;
        Iterator iterator = this.touchListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            BaseOnSliderTouchListener baseOnSliderTouchListener = (BaseOnSliderTouchListener)iterator.next();
            baseOnSliderTouchListener.onStartTrackingTouch((Object)this);
        }
    }

    private void onStopTrackingTouch() {
        boolean bl2;
        Iterator iterator = this.touchListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            BaseOnSliderTouchListener baseOnSliderTouchListener = (BaseOnSliderTouchListener)iterator.next();
            baseOnSliderTouchListener.onStopTrackingTouch((Object)this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f5) {
        int n3 = this.trackSidePadding;
        f5 = this.normalizeValue(f5);
        float f6 = this.trackWidth;
        int n4 = (int)(f5 * f6);
        n3 += n4;
        n4 = tooltipDrawable.getIntrinsicWidth() / 2;
        n3 -= n4;
        n4 = this.calculateTrackCenter();
        int n7 = this.labelPadding;
        int n8 = this.thumbHeight / 2 + n7;
        n7 = tooltipDrawable.getIntrinsicHeight();
        n7 = (n4 -= n8) - n7;
        n8 = tooltipDrawable.getIntrinsicWidth() + n3;
        tooltipDrawable.setBounds(n3, n7, n8, n4);
        Rect rect = tooltipDrawable.getBounds();
        Rect rect2 = new Rect(rect);
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect2);
        tooltipDrawable.setBounds(rect2);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int n3) {
        float f5;
        Object object = R$styleable.Slider;
        int n4 = DEF_STYLE_RES;
        int[] nArray = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, (int[])object, n3, n4, nArray);
        n3 = R$styleable.Slider_labelStyle;
        int n7 = R$style.Widget_MaterialComponents_Tooltip;
        this.labelStyle = n3 = attributeSet.getResourceId(n3, n7);
        n3 = R$styleable.Slider_android_valueFrom;
        n7 = 0;
        this.valueFrom = f5 = attributeSet.getFloat(n3, 0.0f);
        n3 = R$styleable.Slider_android_valueTo;
        this.valueTo = f5 = attributeSet.getFloat(n3, 1.0f);
        Float f6 = Float.valueOf(this.valueFrom);
        boolean bl2 = true;
        object = new Float[bl2];
        object[0] = (int)f6;
        this.setValues((Float[])object);
        n3 = R$styleable.Slider_android_stepSize;
        this.stepSize = f5 = attributeSet.getFloat(n3, 0.0f);
        f6 = this.getContext();
        f5 = (float)Math.ceil(ViewUtils.dpToPx((Context)f6, 48));
        int n8 = R$styleable.Slider_minTouchTargetSize;
        f5 = attributeSet.getDimension(n8, f5);
        double d2 = Math.ceil(f5);
        this.minTouchTargetSize = n3 = (int)d2;
        n3 = R$styleable.Slider_trackColor;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        n8 = n3 != 0 ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorInactive;
        n3 = n3 != 0 ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorActive;
        object = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n8);
        if (object == null) {
            n8 = R$color.material_slider_inactive_track_color;
            object = t70.getColorStateList(context, n8);
        }
        this.setTrackInactiveTintList((ColorStateList)object);
        f6 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
        if (f6 == null) {
            n3 = R$color.material_slider_active_track_color;
            f6 = t70.getColorStateList(context, n3);
        }
        this.setTrackActiveTintList((ColorStateList)f6);
        n3 = R$styleable.Slider_thumbColor;
        f6 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
        object = this.defaultThumbDrawable;
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)f6);
        n3 = R$styleable.Slider_thumbStrokeColor;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.Slider_thumbStrokeColor;
            f6 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
            this.setThumbStrokeColor((ColorStateList)f6);
        }
        n3 = R$styleable.Slider_thumbStrokeWidth;
        f5 = attributeSet.getDimension(n3, 0.0f);
        this.setThumbStrokeWidth(f5);
        n3 = R$styleable.Slider_haloColor;
        f6 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
        if (f6 == null) {
            n3 = R$color.material_slider_halo_color;
            f6 = t70.getColorStateList(context, n3);
        }
        this.setHaloTintList((ColorStateList)f6);
        n3 = R$styleable.Slider_tickVisible;
        n3 = (int)(attributeSet.getBoolean(n3, bl2) ? 1 : 0);
        this.tickVisible = n3;
        n3 = R$styleable.Slider_tickColor;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        n8 = n3 != 0 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorInactive;
        n3 = n3 != 0 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorActive;
        object = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n8);
        if (object == null) {
            n8 = R$color.material_slider_inactive_tick_marks_color;
            object = t70.getColorStateList(context, n8);
        }
        this.setTickInactiveTintList((ColorStateList)object);
        f6 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3);
        if (f6 == null) {
            n3 = R$color.material_slider_active_tick_marks_color;
            f6 = t70.getColorStateList(context, n3);
        }
        this.setTickActiveTintList((ColorStateList)f6);
        int n10 = R$styleable.Slider_thumbTrackGapSize;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        this.setThumbTrackGapSize(n10);
        n10 = R$styleable.Slider_trackStopIndicatorSize;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        this.setTrackStopIndicatorSize(n10);
        n10 = R$styleable.Slider_trackInsideCornerSize;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        this.setTrackInsideCornerSize(n10);
        n10 = R$styleable.Slider_thumbRadius;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        n3 = R$styleable.Slider_thumbWidth;
        n3 = attributeSet.getDimensionPixelSize(n3, n10 *= 2);
        n8 = R$styleable.Slider_thumbHeight;
        n10 = attributeSet.getDimensionPixelSize(n8, n10);
        this.setThumbWidth(n3);
        this.setThumbHeight(n10);
        n10 = R$styleable.Slider_haloRadius;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        this.setHaloRadius(n10);
        n10 = R$styleable.Slider_thumbElevation;
        float f7 = attributeSet.getDimension(n10, 0.0f);
        this.setThumbElevation(f7);
        n10 = R$styleable.Slider_trackHeight;
        n10 = attributeSet.getDimensionPixelSize(n10, 0);
        this.setTrackHeight(n10);
        n10 = R$styleable.Slider_tickRadiusActive;
        n3 = this.trackStopIndicatorSize / 2;
        n10 = attributeSet.getDimensionPixelSize(n10, n3);
        this.setTickActiveRadius(n10);
        n10 = R$styleable.Slider_tickRadiusInactive;
        n3 = this.trackStopIndicatorSize / 2;
        n10 = attributeSet.getDimensionPixelSize(n10, n3);
        this.setTickInactiveRadius(n10);
        n10 = R$styleable.Slider_labelBehavior;
        n10 = attributeSet.getInt(n10, 0);
        this.setLabelBehavior(n10);
        n10 = R$styleable.Slider_android_enabled;
        n10 = (int)(attributeSet.getBoolean(n10, bl2) ? 1 : 0);
        if (n10 == 0) {
            this.setEnabled(false);
        }
        attributeSet.recycle();
    }

    private void scheduleAccessibilityEventSender(int n3) {
        BaseSlider$AccessibilityEventSender baseSlider$AccessibilityEventSender = this.accessibilityEventSender;
        if (baseSlider$AccessibilityEventSender == null) {
            this.accessibilityEventSender = baseSlider$AccessibilityEventSender = new BaseSlider$AccessibilityEventSender(this, null);
        } else {
            this.removeCallbacks(baseSlider$AccessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(n3);
        BaseSlider$AccessibilityEventSender baseSlider$AccessibilityEventSender2 = this.accessibilityEventSender;
        this.postDelayed(baseSlider$AccessibilityEventSender2, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f5) {
        String string2 = this.formatValue(f5);
        tooltipDrawable.setText(string2);
        this.positionLabel(tooltipDrawable, f5);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void setValuesInternal(ArrayList serializable) {
        boolean n3 = ((ArrayList)serializable).isEmpty();
        if (!n3) {
            boolean bl2;
            Collections.sort(serializable);
            ArrayList arrayList = this.values;
            int n4 = arrayList.size();
            int n7 = ((ArrayList)serializable).size();
            if (n4 == n7 && (bl2 = (arrayList = this.values).equals(serializable))) {
                return;
            }
            this.values = serializable;
            this.dirtyConfig = true;
            this.focusedThumbIdx = 0;
            this.updateHaloHotspot();
            this.createLabelPool();
            this.dispatchOnChangedProgrammatically();
            this.postInvalidate();
            return;
        }
        serializable = new IllegalArgumentException("At least one value must be set");
        throw serializable;
    }

    private boolean shouldAlwaysShowLabel() {
        int n3 = this.labelBehavior;
        int n4 = 3;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    private boolean shouldDrawCompatHalo() {
        Drawable drawable2;
        boolean bl2 = this.forceDrawCompatHalo;
        if (!bl2 && (bl2 = (drawable2 = this.getBackground()) instanceof RippleDrawable)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private boolean snapActiveThumbToValue(float f5) {
        int n3 = this.activeThumbIdx;
        return this.snapThumbToValue(n3, f5);
    }

    private double snapPosition(float f5) {
        float f6 = this.stepSize;
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0) {
            f7 = this.valueTo;
            float f11 = this.valueFrom;
            int n3 = (int)((f7 - f11) / f6);
            f7 = n3;
            double d2 = Math.round(f5 * f7);
            double d5 = n3;
            return d2 / d5;
        }
        return f5;
    }

    private boolean snapThumbToValue(int n3, float f5) {
        double d2;
        this.focusedThumbIdx = n3;
        Serializable serializable = (Float)this.values.get(n3);
        float f6 = ((Float)serializable).floatValue();
        double d5 = f6 = Math.abs(f5 - f6);
        double d7 = d5 - (d2 = 1.0E-4);
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            return false;
        }
        f5 = this.getClampedValue(n3, f5);
        serializable = this.values;
        Float f7 = Float.valueOf(f5);
        ((ArrayList)serializable).set(n3, f7);
        this.dispatchOnChangedFromUser(n3);
        return true;
    }

    private boolean snapTouchPosition() {
        float f5 = this.getValueOfTouchPosition();
        return this.snapActiveThumbToValue(f5);
    }

    private void updateHaloHotspot() {
        Drawable drawable2;
        int n3;
        int n4 = this.shouldDrawCompatHalo();
        if (n4 == 0 && (n4 = this.getMeasuredWidth()) > 0 && (n3 = (drawable2 = this.getBackground()) instanceof RippleDrawable) != 0) {
            Serializable serializable = this.values;
            int n7 = this.focusedThumbIdx;
            serializable = (Float)((ArrayList)serializable).get(n7);
            float f5 = ((Float)serializable).floatValue();
            f5 = this.normalizeValue(f5);
            float f6 = this.trackWidth;
            f5 *= f6;
            f6 = this.trackSidePadding;
            n3 = (int)(f5 += f6);
            n7 = this.calculateTrackCenter();
            int n8 = this.haloRadius;
            int n10 = n3 - n8;
            int n14 = n7 - n8;
            drawable2.setHotspotBounds(n10, n14, n3 += n8, n7 += n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateLabels() {
        int n3;
        int n4 = this.labelBehavior;
        if (n4 != 0 && n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 == n3) {
                this.ensureLabelsRemoved();
                return;
            }
            n3 = 3;
            if (n4 != n3) {
                StringBuilder stringBuilder = new StringBuilder("Unexpected labelBehavior: ");
                int n7 = this.labelBehavior;
                stringBuilder.append(n7);
                String string2 = stringBuilder.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            n4 = (int)(this.isEnabled() ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(this.isSliderVisibleOnScreen() ? 1 : 0)) != 0) {
                this.ensureLabelsAdded();
                return;
            }
            this.ensureLabelsRemoved();
            return;
        }
        n4 = this.activeThumbIdx;
        n3 = -1;
        if (n4 != n3 && (n4 = (int)(this.isEnabled() ? 1 : 0)) != 0) {
            this.ensureLabelsAdded();
            return;
        }
        this.ensureLabelsRemoved();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, BaseSlider$FullCornerDirection baseSlider$FullCornerDirection) {
        float f5;
        int n3;
        int n4;
        int n7;
        int n8;
        int[] nArray;
        float f6;
        float f7;
        float f8;
        block9: {
            int n10;
            block10: {
                block7: {
                    block8: {
                        n10 = this.trackHeight;
                        f8 = n10;
                        f7 = 2.0f;
                        f8 /= f7;
                        f6 = (float)n10 / f7;
                        nArray = BaseSlider$3.$SwitchMap$com$google$android$material$slider$BaseSlider$FullCornerDirection;
                        n8 = baseSlider$FullCornerDirection.ordinal();
                        n8 = nArray[n8];
                        n7 = 3;
                        n4 = 2;
                        n3 = 1;
                        f5 = Float.MIN_VALUE;
                        if (n8 == n3) break block7;
                        if (n8 == n4) break block8;
                        if (n8 == n7) {
                            int n14 = this.trackInsideCornerSize;
                            f8 = n14;
                        }
                        break block9;
                    }
                    n10 = this.trackInsideCornerSize;
                    break block10;
                }
                n10 = this.trackInsideCornerSize;
                f8 = n10;
            }
            f6 = n10;
        }
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        style2 = Paint.Cap.BUTT;
        paint.setStrokeCap((Paint.Cap)style2);
        paint.setAntiAlias(n3 != 0);
        style2 = this.trackPath;
        style2.reset();
        float f11 = rectF.width();
        f5 = f8 + f6;
        n8 = f11 == f5 ? 0 : (f11 > f5 ? 1 : -1);
        if (n8 >= 0) {
            baseSlider$FullCornerDirection = this.trackPath;
            float[] fArray = this.getCornerRadii(f8, f6);
            Path.Direction direction = Path.Direction.CW;
            baseSlider$FullCornerDirection.addRoundRect(rectF, fArray, direction);
            rectF = this.trackPath;
            canvas.drawPath((Path)rectF, paint);
            return;
        }
        f11 = Math.min(f8, f6);
        f6 = Math.max(f8, f6);
        canvas.save();
        Path path = this.trackPath;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        path = this.trackPath;
        canvas.clipPath(path);
        int n15 = baseSlider$FullCornerDirection.ordinal();
        n15 = nArray[n15];
        if (n15 != n4) {
            if (n15 != n7) {
                baseSlider$FullCornerDirection = this.cornerRect;
                f8 = rectF.centerX() - f6;
                f7 = rectF.top;
                float f12 = rectF.centerX() + f6;
                float f14 = rectF.bottom;
                baseSlider$FullCornerDirection.set(f8, f7, f12, f14);
            } else {
                baseSlider$FullCornerDirection = this.cornerRect;
                f8 = rectF.right;
                f7 *= f6;
                f7 = f8 - f7;
                float f15 = rectF.top;
                float f16 = rectF.bottom;
                baseSlider$FullCornerDirection.set(f7, f15, f8, f16);
            }
        } else {
            baseSlider$FullCornerDirection = this.cornerRect;
            f8 = rectF.left;
            float f17 = rectF.top;
            f7 = f7 * f6 + f8;
            float f18 = rectF.bottom;
            baseSlider$FullCornerDirection.set(f8, f17, f7, f18);
        }
        rectF = this.cornerRect;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        canvas.restore();
    }

    private void updateTrackWidth(int n3) {
        int n4 = this.trackSidePadding * 2;
        this.trackWidth = n3 = Math.max(n3 - n4, 0);
        this.maybeCalculateTicksCoordinates();
    }

    private void updateWidgetLayout() {
        boolean bl2 = this.maybeIncreaseWidgetHeight();
        boolean bl3 = this.maybeIncreaseTrackSidePadding();
        if (bl2) {
            this.requestLayout();
        } else if (bl3) {
            this.postInvalidate();
        }
    }

    private void validateConfigurationIfDirty() {
        boolean bl2 = this.dirtyConfig;
        if (bl2) {
            this.validateValueFrom();
            this.validateValueTo();
            this.validateStepSize();
            this.validateValues();
            this.validateMinSeparation();
            this.warnAboutFloatingPointError();
            bl2 = false;
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float f5 = this.getMinSeparation();
        String string2 = "minSeparation(";
        int n3 = 0;
        IllegalStateException illegalStateException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            float f7;
            float f8 = this.stepSize;
            float f11 = f8 - 0.0f;
            Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object2 > 0 && (n3 = (f7 = f5 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
                n3 = this.separationUnit;
                object2 = true;
                float f12 = Float.MIN_VALUE;
                String string3 = ")";
                if (n3 == object2) {
                    double d2;
                    n3 = (int)(f5 == f8 ? 0 : (f5 < f8 ? -1 : 1));
                    if (n3 < 0 || (n3 = (int)(this.isMultipleOfStepSize(d2 = (double)f5) ? 1 : 0)) == 0) {
                        f8 = this.stepSize;
                        f12 = this.stepSize;
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        stringBuilder.append(f5);
                        stringBuilder.append(") must be greater or equal and a multiple of stepSize(");
                        stringBuilder.append(f8);
                        stringBuilder.append(") when using stepSize(");
                        stringBuilder.append(f12);
                        stringBuilder.append(string3);
                        String string4 = stringBuilder.toString();
                        illegalStateException = new IllegalStateException(string4);
                        throw illegalStateException;
                    }
                } else {
                    f8 = this.stepSize;
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(f5);
                    stringBuilder.append(") cannot be set as a dimension when using stepSize(");
                    stringBuilder.append(f8);
                    stringBuilder.append(string3);
                    String string5 = stringBuilder.toString();
                    illegalStateException = new IllegalStateException(string5);
                    throw illegalStateException;
                }
            }
            return;
        }
        String string6 = g9_0.a(f5, string2, ") must be greater or equal to 0");
        illegalStateException = new IllegalStateException(string6);
        throw illegalStateException;
    }

    private void validateStepSize() {
        float f5 = this.stepSize;
        float f6 = 0.0f;
        String string2 = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0 && (object = (Object)this.valueLandsOnTick(f5 = this.valueTo)) == false) {
            f6 = this.stepSize;
            float f8 = this.valueFrom;
            float f11 = this.valueTo;
            StringBuilder stringBuilder = new StringBuilder("The stepSize(");
            stringBuilder.append(f6);
            stringBuilder.append(") must be 0, or a factor of the valueFrom(");
            stringBuilder.append(f8);
            stringBuilder.append(")-valueTo(");
            stringBuilder.append(f11);
            stringBuilder.append(") range");
            string2 = stringBuilder.toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
    }

    private void validateValueFrom() {
        float f5 = this.valueFrom;
        float f6 = this.valueTo;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object < 0) {
            return;
        }
        f6 = this.valueFrom;
        float f8 = this.valueTo;
        StringBuilder stringBuilder = new StringBuilder("valueFrom(");
        stringBuilder.append(f6);
        stringBuilder.append(") must be smaller than valueTo(");
        stringBuilder.append(f8);
        stringBuilder.append(")");
        String string2 = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    private void validateValueTo() {
        float f5 = this.valueTo;
        float f6 = this.valueFrom;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object > 0) {
            return;
        }
        f6 = this.valueTo;
        float f8 = this.valueFrom;
        StringBuilder stringBuilder = new StringBuilder("valueTo(");
        stringBuilder.append(f6);
        stringBuilder.append(") must be greater than valueFrom(");
        stringBuilder.append(f8);
        stringBuilder.append(")");
        String string2 = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    private void validateValues() {
        boolean bl2;
        Object object = this.values.iterator();
        while (bl2 = object.hasNext()) {
            float f5;
            Object object2 = (Float)object.next();
            float f6 = ((Float)object2).floatValue();
            float f7 = this.valueFrom;
            String string2 = ")";
            Object object3 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
            if (object3 >= 0 && (object3 = (f5 = (f6 = ((Float)object2).floatValue()) - (f7 = this.valueTo)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) <= 0) {
                f6 = this.stepSize;
                f7 = 0.0f;
                float f8 = f6 - 0.0f;
                object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (object3 <= 0 || (object3 = (Object)this.valueLandsOnTick(f6 = ((Float)object2).floatValue())) != false) continue;
                f6 = this.valueFrom;
                f7 = this.stepSize;
                float f11 = this.stepSize;
                StringBuilder stringBuilder = new StringBuilder("Value(");
                stringBuilder.append(object2);
                stringBuilder.append(") must be equal to valueFrom(");
                stringBuilder.append(f6);
                stringBuilder.append(") plus a multiple of stepSize(");
                stringBuilder.append(f7);
                stringBuilder.append(") when using stepSize(");
                stringBuilder.append(f11);
                stringBuilder.append(string2);
                object2 = stringBuilder.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            f6 = this.valueFrom;
            f7 = this.valueTo;
            StringBuilder stringBuilder = new StringBuilder("Slider value(");
            stringBuilder.append(object2);
            stringBuilder.append(") must be greater or equal to valueFrom(");
            stringBuilder.append(f6);
            stringBuilder.append("), and lower or equal to valueTo(");
            stringBuilder.append(f7);
            stringBuilder.append(string2);
            object2 = stringBuilder.toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
    }

    private boolean valueLandsOnTick(float f5) {
        Object object = Float.toString(f5);
        BigDecimal bigDecimal = new BigDecimal((String)object);
        Object object2 = Float.toString(this.valueFrom);
        object = new BigDecimal((String)object2);
        object2 = MathContext.DECIMAL64;
        double d2 = bigDecimal.subtract((BigDecimal)object, (MathContext)object2).doubleValue();
        return this.isMultipleOfStepSize(d2);
    }

    private float valueToX(float f5) {
        f5 = this.normalizeValue(f5);
        float f6 = this.trackWidth;
        f5 *= f6;
        f6 = this.trackSidePadding;
        return f5 + f6;
    }

    private void warnAboutFloatingPointError() {
        float f5;
        float f6;
        String string2;
        float f7 = this.stepSize;
        float f8 = 0.0f;
        StringBuilder stringBuilder = null;
        float f11 = f7 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        f8 = (int)f7;
        String string3 = "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
        object = f8 == f7 ? 0 : (f8 > f7 ? 1 : -1);
        if (object != false) {
            string2 = "Floating point value used for stepSize(";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(f7);
            stringBuilder.append(string3);
        }
        if ((object = (f6 = (f8 = (float)((int)(f7 = this.valueFrom))) - f7) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            string2 = "Floating point value used for valueFrom(";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(f7);
            stringBuilder.append(string3);
        }
        if ((object = (f5 = (f8 = (float)((int)(f7 = this.valueTo))) - f7) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
            string2 = "Floating point value used for valueTo(";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(f7);
            stringBuilder.append(string3);
        }
    }

    public void addOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        this.changeListeners.add(baseOnChangeListener);
    }

    public void addOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.touchListeners.add(baseOnSliderTouchListener);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean bl2;
        BaseSlider$AccessibilityHelper baseSlider$AccessibilityHelper = this.accessibilityHelper;
        boolean bl3 = baseSlider$AccessibilityHelper.dispatchHoverEvent(motionEvent);
        if (!bl3 && !(bl2 = super.dispatchHoverEvent(motionEvent))) {
            bl2 = false;
            motionEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.inactiveTrackPaint;
        Object object2 = this.trackColorInactive;
        int n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        object = this.activeTrackPaint;
        object2 = this.trackColorActive;
        n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        object = this.inactiveTicksPaint;
        object2 = this.tickColorInactive;
        n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        object = this.activeTicksPaint;
        object2 = this.tickColorActive;
        n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        object = this.stopIndicatorPaint;
        object2 = this.trackColorActive;
        n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        object = this.labels.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (TooltipDrawable)object.next();
            boolean bl2 = object2.isStateful();
            if (!bl2) continue;
            int[] nArray = this.getDrawableState();
            object2.setState(nArray);
        }
        object = this.defaultThumbDrawable;
        boolean bl3 = ((MaterialShapeDrawable)object).isStateful();
        if (bl3) {
            object = this.defaultThumbDrawable;
            object2 = this.getDrawableState();
            object.setState((int[])object2);
        }
        object = this.haloPaint;
        object2 = this.haloColor;
        n3 = this.getColorForState((ColorStateList)object2);
        object.setColor(n3);
        this.haloPaint.setAlpha(63);
    }

    public void forceDrawCompatHalo(boolean bl2) {
        this.forceDrawCompatHalo = bl2;
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    public int getThumbHeight() {
        return this.thumbHeight;
    }

    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    public int getThumbWidth() {
        return this.thumbWidth;
    }

    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public ColorStateList getTickTintList() {
        Object object = this.tickColorInactive;
        ColorStateList colorStateList = this.tickColorActive;
        boolean bl2 = object.equals(colorStateList);
        if (bl2) {
            return this.tickColorActive;
        }
        object = new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        throw object;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    public ColorStateList getTrackTintList() {
        Object object = this.trackColorInactive;
        ColorStateList colorStateList = this.trackColorActive;
        boolean bl2 = object.equals(colorStateList);
        if (bl2) {
            return this.trackColorActive;
        }
        object = new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        throw object;
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    public List getValues() {
        ArrayList arrayList = this.values;
        ArrayList arrayList2 = new ArrayList(arrayList);
        return arrayList2;
    }

    public boolean hasLabelFormatter() {
        boolean bl2;
        LabelFormatter labelFormatter = this.formatter;
        if (labelFormatter != null) {
            bl2 = true;
        } else {
            bl2 = false;
            labelFormatter = null;
        }
        return bl2;
    }

    public final boolean isRtl() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean isTickVisible() {
        return this.tickVisible;
    }

    public void onAttachedToWindow() {
        boolean bl2;
        super.onAttachedToWindow();
        Object object = this.getViewTreeObserver();
        Object object2 = this.onScrollChangedListener;
        object.addOnScrollChangedListener(object2);
        object = this.labels.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (TooltipDrawable)object.next();
            this.attachLabelToContentView((TooltipDrawable)object2);
        }
    }

    public void onDetachedFromWindow() {
        TooltipDrawable tooltipDrawable;
        boolean bl2;
        Object object = this.accessibilityEventSender;
        if (object != null) {
            this.removeCallbacks((Runnable)object);
        }
        this.labelsAreAnimatedIn = false;
        object = this.labels.iterator();
        while (bl2 = object.hasNext()) {
            tooltipDrawable = (TooltipDrawable)object.next();
            this.detachLabelFromContentView(tooltipDrawable);
        }
        object = this.getViewTreeObserver();
        tooltipDrawable = this.onScrollChangedListener;
        object.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)tooltipDrawable);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f5;
        float f6;
        int n3;
        ArrayList arrayList;
        int n4 = this.dirtyConfig;
        if (n4 != 0) {
            this.validateConfigurationIfDirty();
            this.maybeCalculateTicksCoordinates();
        }
        super.onDraw(canvas);
        n4 = this.calculateTrackCenter();
        Float f7 = (Float)this.values.get(0);
        float f8 = f7.floatValue();
        Serializable serializable = this.values;
        int n7 = 1;
        float f11 = Float.MIN_VALUE;
        serializable = (Float)pp_0.a(n7, (ArrayList)serializable);
        float f12 = ((Float)serializable).floatValue();
        float f14 = this.valueTo;
        float f15 = f12 == f14 ? 0 : (f12 < f14 ? -1 : 1);
        if (f15 < 0 || (f15 = (float)(arrayList = this.values).size()) > n7 && (n3 = (int)((f6 = f8 - (f11 = this.valueFrom)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
            n3 = this.trackWidth;
            this.drawInactiveTrack(canvas, n3, n4);
        }
        if ((n3 = (int)((f5 = f12 - (f8 = this.valueFrom)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
            n3 = this.trackWidth;
            this.drawActiveTrack(canvas, n3, n4);
        }
        this.maybeDrawTicks(canvas);
        this.maybeDrawStopIndicator(canvas, n4);
        n3 = (int)(this.thumbIsPressed ? 1 : 0);
        if ((n3 != 0 || (n3 = (int)(this.isFocused() ? 1 : 0)) != 0) && (n3 = (int)(this.isEnabled() ? 1 : 0)) != 0) {
            n3 = this.trackWidth;
            this.maybeDrawCompatHalo(canvas, n3, n4);
        }
        this.updateLabels();
        n3 = this.trackWidth;
        this.drawThumbs(canvas, n3, n4);
    }

    /*
     * WARNING - void declaration
     */
    public void onFocusChanged(boolean bl2, int n3, Rect rect) {
        void var3_4;
        int n4;
        super.onFocusChanged(bl2, n4, (Rect)var3_4);
        if (!bl2) {
            int n7;
            this.activeThumbIdx = n7 = -1;
            BaseSlider$AccessibilityHelper baseSlider$AccessibilityHelper = this.accessibilityHelper;
            n4 = this.focusedThumbIdx;
            baseSlider$AccessibilityHelper.clearKeyboardFocusForVirtualView(n4);
        } else {
            this.focusThumbOnFocusGained(n4);
            BaseSlider$AccessibilityHelper baseSlider$AccessibilityHelper = this.accessibilityHelper;
            n4 = this.focusedThumbIdx;
            baseSlider$AccessibilityHelper.requestKeyboardFocusForVirtualView(n4);
        }
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        int n8 = this.isEnabled();
        if (!n8) {
            return super.onKeyDown(n3, keyEvent);
        }
        Serializable serializable = this.values;
        n8 = ((ArrayList)serializable).size();
        if (n8 == (n7 = 1)) {
            this.activeThumbIdx = 0;
        }
        if ((n8 = this.activeThumbIdx) == (n4 = -1)) {
            serializable = this.onKeyDownNoActiveThumb(n3, keyEvent);
            n3 = serializable != null ? (int)(((Boolean)serializable).booleanValue() ? 1 : 0) : (int)(super.onKeyDown(n3, keyEvent) ? 1 : 0);
            return n3 != 0;
        }
        n8 = (int)(this.isLongPress ? 1 : 0);
        int n10 = keyEvent.isLongPress();
        this.isLongPress = n8 |= n10;
        serializable = this.calculateIncrementForKey(n3);
        if (serializable != null) {
            Serializable serializable2 = this.values;
            int n14 = this.activeThumbIdx;
            serializable2 = (Float)((ArrayList)serializable2).get(n14);
            float f5 = ((Float)serializable2).floatValue();
            float f6 = ((Float)serializable).floatValue() + f5;
            n3 = (int)(this.snapActiveThumbToValue(f6) ? 1 : 0);
            if (n3 != 0) {
                this.updateHaloHotspot();
                this.postInvalidate();
            }
            return n7 != 0;
        }
        n8 = 23;
        if (n3 != n8) {
            n8 = 61;
            if (n3 != n8) {
                n8 = 66;
                if (n3 != n8) {
                    return super.onKeyDown(n3, keyEvent);
                }
            } else {
                n3 = (int)(keyEvent.hasNoModifiers() ? 1 : 0);
                if (n3 != 0) {
                    return this.moveFocus(n7);
                }
                n3 = (int)(keyEvent.isShiftPressed() ? 1 : 0);
                if (n3 != 0) {
                    return this.moveFocus(n4);
                }
                return false;
            }
        }
        this.activeThumbIdx = n4;
        this.postInvalidate();
        return n7 != 0;
    }

    public boolean onKeyUp(int n3, KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(n3, keyEvent);
    }

    public void onMeasure(int n3, int n4) {
        n4 = this.widgetHeight;
        int n7 = this.labelBehavior;
        int n8 = 1;
        int n10 = 0;
        if (n7 == n8 || (n7 = (int)(this.shouldAlwaysShowLabel() ? 1 : 0)) != 0) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable)this.labels.get(0);
            n10 = tooltipDrawable.getIntrinsicHeight();
        }
        n4 = View.MeasureSpec.makeMeasureSpec((int)(n4 + n10), (int)0x40000000);
        super.onMeasure(n3, n4);
    }

    public void onRestoreInstanceState(Parcelable object) {
        float f5;
        object = (BaseSlider$SliderState)((Object)object);
        Object object2 = object.getSuperState();
        super.onRestoreInstanceState(object2);
        this.valueFrom = f5 = object.valueFrom;
        this.valueTo = f5 = object.valueTo;
        object2 = object.values;
        this.setValuesInternal((ArrayList)object2);
        this.stepSize = f5 = object.stepSize;
        boolean bl2 = object.hasFocus;
        if (bl2) {
            this.requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean bl2;
        float f5;
        Object object = super.onSaveInstanceState();
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState((Parcelable)object);
        baseSlider$SliderState.valueFrom = f5 = this.valueFrom;
        baseSlider$SliderState.valueTo = f5 = this.valueTo;
        ArrayList arrayList = this.values;
        object = new ArrayList(arrayList);
        baseSlider$SliderState.values = object;
        baseSlider$SliderState.stepSize = f5 = this.stepSize;
        baseSlider$SliderState.hasFocus = bl2 = this.hasFocus();
        return baseSlider$SliderState;
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        this.updateTrackWidth(n3);
        this.updateHaloHotspot();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        int n4;
        block16: {
            int n7;
            float f5;
            float f6;
            int n8;
            block13: {
                int n10;
                block14: {
                    float f7;
                    block15: {
                        n4 = this.isEnabled();
                        n8 = 0;
                        f6 = 0.0f;
                        if (n4 == 0) {
                            return false;
                        }
                        f5 = motionEvent.getX();
                        f7 = this.trackSidePadding;
                        f7 = f5 - f7;
                        float f8 = this.trackWidth;
                        this.touchPosition = f7 /= f8;
                        this.touchPosition = f7 = Math.max(0.0f, f7);
                        this.touchPosition = f7 = Math.min(1.0f, f7);
                        n10 = motionEvent.getActionMasked();
                        n7 = 2;
                        f8 = 2.8E-45f;
                        n3 = 1;
                        if (n10 == 0) break block13;
                        if (n10 == n3) break block14;
                        if (n10 == n7) break block15;
                        n4 = 3;
                        f5 = 4.2E-45f;
                        if (n10 == n4) break block14;
                        break block16;
                    }
                    n10 = (int)(this.thumbIsPressed ? 1 : 0);
                    if (n10 == 0) {
                        n10 = (int)(this.isPotentialVerticalScroll(motionEvent) ? 1 : 0);
                        if (n10 != 0) {
                            f7 = this.touchDownX;
                            float f11 = (f5 = Math.abs(f5 - f7)) - (f7 = (float)(n10 = this.scaledTouchSlop));
                            n4 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
                            if (n4 < 0) {
                                return false;
                            }
                        }
                        ViewParent viewParent = this.getParent();
                        viewParent.requestDisallowInterceptTouchEvent(n3 != 0);
                        this.onStartTrackingTouch();
                    }
                    if ((n4 = (int)(this.pickActiveThumb() ? 1 : 0)) != 0) {
                        this.thumbIsPressed = n3;
                        this.snapTouchPosition();
                        this.updateHaloHotspot();
                        this.invalidate();
                    }
                    break block16;
                }
                this.thumbIsPressed = false;
                MotionEvent motionEvent2 = this.lastEvent;
                if (motionEvent2 != null && (n4 = motionEvent2.getActionMasked()) == 0) {
                    motionEvent2 = this.lastEvent;
                    f5 = motionEvent2.getX();
                    f6 = motionEvent.getX();
                    float f12 = (f5 = Math.abs(f5 - f6)) - (f6 = (float)(n8 = this.scaledTouchSlop));
                    n4 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                    if (n4 <= 0) {
                        motionEvent2 = this.lastEvent;
                        f5 = motionEvent2.getY();
                        f6 = motionEvent.getY();
                        float f14 = (f5 = Math.abs(f5 - f6)) - (f6 = (float)(n8 = this.scaledTouchSlop));
                        n4 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
                        if (n4 <= 0 && (n4 = (int)(this.pickActiveThumb() ? 1 : 0)) != 0) {
                            this.onStartTrackingTouch();
                        }
                    }
                }
                n4 = this.activeThumbIdx;
                n8 = -1;
                f6 = 0.0f / 0.0f;
                if (n4 != n8) {
                    this.snapTouchPosition();
                    this.updateHaloHotspot();
                    n4 = (int)(this.hasGapBetweenThumbAndTrack() ? 1 : 0);
                    if (n4 != 0 && (n4 = this.defaultThumbWidth) != n8 && (n10 = this.defaultThumbTrackGapSize) != n8) {
                        this.setThumbWidth(n4);
                        n4 = this.defaultThumbTrackGapSize;
                        this.setThumbTrackGapSize(n4);
                    }
                    this.activeThumbIdx = n8;
                    this.onStopTrackingTouch();
                }
                this.invalidate();
                break block16;
            }
            this.touchDownX = f5;
            n4 = this.isPotentialVerticalScroll(motionEvent);
            if (n4 == 0) {
                ViewParent viewParent = this.getParent();
                viewParent.requestDisallowInterceptTouchEvent(n3 != 0);
                n4 = this.pickActiveThumb();
                if (n4 != 0) {
                    this.requestFocus();
                    this.thumbIsPressed = n3;
                    this.snapTouchPosition();
                    this.updateHaloHotspot();
                    n4 = (int)(this.hasGapBetweenThumbAndTrack() ? 1 : 0);
                    if (n4 != 0) {
                        this.defaultThumbWidth = n4 = this.thumbWidth;
                        this.defaultThumbTrackGapSize = n8 = this.thumbTrackGapSize;
                        f5 = n4;
                        f6 = 0.5f;
                        n4 = Math.round(f5 *= f6);
                        n8 = this.thumbWidth - n4;
                        this.setThumbWidth(n4);
                        n4 = this.thumbTrackGapSize;
                        this.setThumbTrackGapSize(n4 -= (n8 /= n7));
                    }
                    this.invalidate();
                    this.onStartTrackingTouch();
                }
            }
        }
        n4 = (int)(this.thumbIsPressed ? 1 : 0);
        this.setPressed(n4 != 0);
        this.lastEvent = motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        return n3 != 0;
    }

    public void onVisibilityChanged(View object, int n3) {
        super.onVisibilityChanged((View)object, n3);
        if (n3 != 0) {
            boolean bl2;
            object = ViewUtils.getContentViewOverlay(this);
            if (object == null) {
                return;
            }
            Iterator iterator = this.labels.iterator();
            while (bl2 = iterator.hasNext()) {
                TooltipDrawable tooltipDrawable = (TooltipDrawable)iterator.next();
                object.remove(tooltipDrawable);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean pickActiveThumb() {
        Serializable serializable;
        int n3;
        int n4 = this.activeThumbIdx;
        boolean bl2 = true;
        int n7 = -1;
        if (n4 != n7) {
            return bl2;
        }
        float f5 = this.getValueOfTouchPositionAbsolute();
        float f6 = this.valueToX(f5);
        this.activeThumbIdx = 0;
        Float f7 = (Float)this.values.get(0);
        float f8 = Math.abs(f7.floatValue() - f5);
        for (int i3 = 1; i3 < (n3 = ((ArrayList)(serializable = this.values)).size()); ++i3) {
            float f11;
            float f12;
            float f14;
            serializable = (Float)this.values.get(i3);
            float f15 = Math.abs(((Float)serializable).floatValue() - f5);
            Float f16 = (Float)this.values.get(i3);
            float f17 = f16.floatValue();
            f17 = this.valueToX(f17);
            int n8 = Float.compare(f15, f8);
            if (n8 > 0) break;
            n8 = (int)(this.isRtl() ? 1 : 0);
            int n10 = 0;
            float f18 = 0.0f;
            if (n8 != 0 ? (n8 = (int)((f14 = (f12 = f17 - f6) - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) > 0 : (n8 = (int)((f11 = (f12 = f17 - f6) - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1))) < 0) {
                n8 = 1;
                f12 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f12 = 0.0f;
            }
            n10 = Float.compare(f15, f8);
            if (n10 < 0) {
                this.activeThumbIdx = i3;
            } else {
                n10 = Float.compare(f15, f8);
                if (n10 != 0) continue;
                float f19 = (f17 = Math.abs(f17 - f6)) - (f18 = (float)(n10 = this.scaledTouchSlop));
                Object object = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                if (object < 0) {
                    this.activeThumbIdx = n7;
                    return false;
                }
                if (n8 == 0) continue;
                this.activeThumbIdx = i3;
            }
            f8 = f15;
        }
        if ((n4 = this.activeThumbIdx) == n7) return false;
        return bl2;
    }

    public void removeOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        this.changeListeners.remove(baseOnChangeListener);
    }

    public void removeOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.touchListeners.remove(baseOnSliderTouchListener);
    }

    public void setActiveThumbIndex(int n3) {
        this.activeThumbIdx = n3;
    }

    public void setCustomThumbDrawable(int n3) {
        Drawable drawable2 = this.getResources().getDrawable(n3);
        this.setCustomThumbDrawable(drawable2);
    }

    public void setCustomThumbDrawable(Drawable drawable2) {
        this.customThumbDrawable = drawable2 = this.initializeCustomThumbDrawable(drawable2);
        this.customThumbDrawablesForValues.clear();
        this.postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int ... nArray) {
        int n3;
        int n4 = nArray.length;
        Drawable[] drawableArray = new Drawable[n4];
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            Resources resources = this.getResources();
            int n7 = nArray[i3];
            resources = resources.getDrawable(n7);
            drawableArray[i3] = resources;
        }
        this.setCustomThumbDrawablesForValues(drawableArray);
    }

    public void setCustomThumbDrawablesForValues(Drawable ... drawableArray) {
        ArrayList arrayList;
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = arrayList = new ArrayList();
        for (Drawable drawable2 : drawableArray) {
            List list = this.customThumbDrawablesForValues;
            drawable2 = this.initializeCustomThumbDrawable(drawable2);
            list.add(drawable2);
        }
        this.postInvalidate();
    }

    public void setEnabled(boolean n3) {
        super.setEnabled(n3 != 0);
        n3 = n3 != 0 ? 0 : 2;
        this.setLayerType(n3, null);
    }

    public void setFocusedThumbIndex(int n3) {
        ArrayList arrayList;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (arrayList = this.values).size())) {
            this.focusedThumbIdx = n3;
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(n3);
            this.postInvalidate();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("index out of range");
        throw illegalArgumentException;
    }

    public void setHaloRadius(int n3) {
        int n4 = this.haloRadius;
        if (n3 == n4) {
            return;
        }
        this.haloRadius = n3;
        Drawable drawable2 = this.getBackground();
        n4 = (int)(this.shouldDrawCompatHalo() ? 1 : 0);
        if (n4 == 0 && (n4 = drawable2 instanceof RippleDrawable) != 0) {
            drawable2 = (RippleDrawable)drawable2;
            n4 = this.haloRadius;
            DrawableUtils.setRippleDrawableRadius((RippleDrawable)drawable2, n4);
            return;
        }
        this.postInvalidate();
    }

    public void setHaloRadiusResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setHaloRadius(n3);
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.haloColor;
        boolean bl2 = colorStateList.equals(colorStateList2);
        if (bl2) {
            return;
        }
        this.haloColor = colorStateList;
        colorStateList2 = this.getBackground();
        boolean bl3 = this.shouldDrawCompatHalo();
        if (!bl3 && (bl3 = colorStateList2 instanceof RippleDrawable)) {
            ((RippleDrawable)colorStateList2).setColor(colorStateList);
            return;
        }
        colorStateList2 = this.haloPaint;
        int n3 = this.getColorForState(colorStateList);
        colorStateList2.setColor(n3);
        this.haloPaint.setAlpha(63);
        this.invalidate();
    }

    public void setLabelBehavior(int n3) {
        int n4 = this.labelBehavior;
        if (n4 != n3) {
            this.labelBehavior = n3;
            this.requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setSeparationUnit(int n3) {
        this.separationUnit = n3;
        this.dirtyConfig = true;
        this.postInvalidate();
    }

    public void setStepSize(float f5) {
        float f6 = 0.0f;
        IllegalArgumentException illegalArgumentException = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object >= 0) {
            f6 = this.stepSize;
            float f8 = f6 - f5;
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object != false) {
                this.stepSize = f5;
                boolean bl2 = true;
                f5 = Float.MIN_VALUE;
                this.dirtyConfig = bl2;
                this.postInvalidate();
            }
            return;
        }
        float f11 = this.valueFrom;
        float f12 = this.valueTo;
        StringBuilder stringBuilder = new StringBuilder("The stepSize(");
        stringBuilder.append(f5);
        stringBuilder.append(") must be 0, or a factor of the valueFrom(");
        stringBuilder.append(f11);
        stringBuilder.append(")-valueTo(");
        stringBuilder.append(f12);
        stringBuilder.append(") range");
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void setThumbElevation(float f5) {
        this.defaultThumbDrawable.setElevation(f5);
    }

    public void setThumbElevationResource(int n3) {
        float f5 = this.getResources().getDimension(n3);
        this.setThumbElevation(f5);
    }

    public void setThumbHeight(int n3) {
        int n4 = this.thumbHeight;
        if (n3 == n4) {
            return;
        }
        this.thumbHeight = n3;
        MaterialShapeDrawable materialShapeDrawable = this.defaultThumbDrawable;
        int n7 = this.thumbWidth;
        materialShapeDrawable.setBounds(0, 0, n7, n3);
        Object object = this.customThumbDrawable;
        if (object != null) {
            this.adjustCustomThumbDrawableBounds((Drawable)object);
        }
        object = this.customThumbDrawablesForValues.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            materialShapeDrawable = (Drawable)object.next();
            this.adjustCustomThumbDrawableBounds(materialShapeDrawable);
        }
        this.updateWidgetLayout();
    }

    public void setThumbHeightResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setThumbHeight(n3);
    }

    public void setThumbRadius(int n3) {
        this.setThumbWidth(n3 *= 2);
        this.setThumbHeight(n3);
    }

    public void setThumbRadiusResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setThumbRadius(n3);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        this.postInvalidate();
    }

    public void setThumbStrokeColorResource(int n3) {
        if (n3 != 0) {
            Context context = this.getContext();
            ColorStateList colorStateList = t70.getColorStateList(context, n3);
            this.setThumbStrokeColor(colorStateList);
        }
    }

    public void setThumbStrokeWidth(float f5) {
        this.defaultThumbDrawable.setStrokeWidth(f5);
        this.postInvalidate();
    }

    public void setThumbStrokeWidthResource(int n3) {
        if (n3 != 0) {
            Resources resources = this.getResources();
            float f5 = resources.getDimension(n3);
            this.setThumbStrokeWidth(f5);
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.defaultThumbDrawable.getFillColor();
        boolean bl2 = colorStateList.equals(colorStateList2);
        if (bl2) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        this.invalidate();
    }

    public void setThumbTrackGapSize(int n3) {
        int n4 = this.thumbTrackGapSize;
        if (n4 == n3) {
            return;
        }
        this.thumbTrackGapSize = n3;
        this.invalidate();
    }

    public void setThumbWidth(int n3) {
        int n4 = this.thumbWidth;
        if (n3 == n4) {
            return;
        }
        this.thumbWidth = n3;
        Object object = this.defaultThumbDrawable;
        Object object2 = ShapeAppearanceModel.builder();
        float f5 = (float)this.thumbWidth / 2.0f;
        object2 = ((ShapeAppearanceModel$Builder)object2).setAllCorners(0, f5).build();
        ((MaterialShapeDrawable)object).setShapeAppearanceModel((ShapeAppearanceModel)object2);
        object = this.defaultThumbDrawable;
        n4 = this.thumbWidth;
        int n7 = this.thumbHeight;
        object.setBounds(0, 0, n4, n7);
        object = this.customThumbDrawable;
        if (object != null) {
            this.adjustCustomThumbDrawableBounds((Drawable)object);
        }
        object = this.customThumbDrawablesForValues.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Drawable)object.next();
            this.adjustCustomThumbDrawableBounds((Drawable)object2);
        }
        this.updateWidgetLayout();
    }

    public void setThumbWidthResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setThumbWidth(n3);
    }

    public void setTickActiveRadius(int n3) {
        int n4 = this.tickActiveRadius;
        if (n4 != n3) {
            this.tickActiveRadius = n3;
            Paint paint = this.activeTicksPaint;
            float f5 = n3 *= 2;
            paint.setStrokeWidth(f5);
            this.updateWidgetLayout();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.tickColorActive;
        boolean bl2 = colorStateList.equals(colorStateList2);
        if (bl2) {
            return;
        }
        this.tickColorActive = colorStateList;
        colorStateList2 = this.activeTicksPaint;
        int n3 = this.getColorForState(colorStateList);
        colorStateList2.setColor(n3);
        this.invalidate();
    }

    public void setTickInactiveRadius(int n3) {
        int n4 = this.tickInactiveRadius;
        if (n4 != n3) {
            this.tickInactiveRadius = n3;
            Paint paint = this.inactiveTicksPaint;
            float f5 = n3 *= 2;
            paint.setStrokeWidth(f5);
            this.updateWidgetLayout();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.tickColorInactive;
        boolean bl2 = colorStateList.equals(colorStateList2);
        if (bl2) {
            return;
        }
        this.tickColorInactive = colorStateList;
        colorStateList2 = this.inactiveTicksPaint;
        int n3 = this.getColorForState(colorStateList);
        colorStateList2.setColor(n3);
        this.invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        this.setTickInactiveTintList(colorStateList);
        this.setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean bl2) {
        boolean bl3 = this.tickVisible;
        if (bl3 != bl2) {
            this.tickVisible = bl2;
            this.postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.trackColorActive;
        int n3 = colorStateList.equals(colorStateList2);
        if (n3 != 0) {
            return;
        }
        this.trackColorActive = colorStateList;
        colorStateList2 = this.activeTrackPaint;
        int n4 = this.getColorForState(colorStateList);
        colorStateList2.setColor(n4);
        colorStateList = this.stopIndicatorPaint;
        colorStateList2 = this.trackColorActive;
        n3 = this.getColorForState(colorStateList2);
        colorStateList.setColor(n3);
        this.invalidate();
    }

    public void setTrackHeight(int n3) {
        int n4 = this.trackHeight;
        if (n4 != n3) {
            this.trackHeight = n3;
            this.invalidateTrack();
            this.updateWidgetLayout();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.trackColorInactive;
        boolean bl2 = colorStateList.equals(colorStateList2);
        if (bl2) {
            return;
        }
        this.trackColorInactive = colorStateList;
        colorStateList2 = this.inactiveTrackPaint;
        int n3 = this.getColorForState(colorStateList);
        colorStateList2.setColor(n3);
        this.invalidate();
    }

    public void setTrackInsideCornerSize(int n3) {
        int n4 = this.trackInsideCornerSize;
        if (n4 == n3) {
            return;
        }
        this.trackInsideCornerSize = n3;
        this.invalidate();
    }

    public void setTrackStopIndicatorSize(int n3) {
        int n4 = this.trackStopIndicatorSize;
        if (n4 == n3) {
            return;
        }
        this.trackStopIndicatorSize = n3;
        Paint paint = this.stopIndicatorPaint;
        float f5 = n3;
        paint.setStrokeWidth(f5);
        this.invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.setTrackInactiveTintList(colorStateList);
        this.setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f5) {
        this.valueFrom = f5;
        this.dirtyConfig = true;
        this.postInvalidate();
    }

    public void setValueTo(float f5) {
        this.valueTo = f5;
        this.dirtyConfig = true;
        this.postInvalidate();
    }

    public void setValues(List list) {
        ArrayList arrayList = new ArrayList(list);
        this.setValuesInternal(arrayList);
    }

    public void setValues(Float ... floatArray) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, floatArray);
        this.setValuesInternal(arrayList);
    }

    public void updateBoundsForVirtualViewId(int n3, Rect rect) {
        int n4 = this.trackSidePadding;
        float f5 = ((Float)this.getValues().get(n3)).floatValue();
        f5 = this.normalizeValue(f5);
        float f6 = this.trackWidth;
        n3 = (int)(f5 * f6);
        n4 += n3;
        n3 = this.calculateTrackCenter();
        int n7 = this.thumbWidth / 2;
        int n8 = this.minTouchTargetSize / 2;
        n7 = Math.max(n7, n8);
        n8 = this.thumbHeight / 2;
        int n10 = this.minTouchTargetSize / 2;
        n8 = Math.max(n8, n10);
        n10 = n4 - n7;
        int n14 = n3 - n8;
        rect.set(n10, n14, n4 += n7, n3 += n8);
    }
}

