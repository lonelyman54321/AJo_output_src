/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 *  android.graphics.Typeface
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.text.DynamicLayout
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewManager
 *  android.view.ViewOutlineProvider
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.AccelerateDecelerateInterpolator
 */
package com.getkeepsafe.taptargetview;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$EndListener;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView$1;
import com.getkeepsafe.taptargetview.TapTargetView$12;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;
import com.getkeepsafe.taptargetview.UiUtil;
import com.getkeepsafe.taptargetview.ViewUtil;

public class TapTargetView
extends View {
    final int CIRCLE_PADDING;
    final int GUTTER_DIM;
    final int SHADOW_DIM;
    final int SHADOW_JITTER_DIM;
    final int TARGET_PADDING;
    final int TARGET_PULSE_RADIUS;
    final int TARGET_RADIUS;
    final int TEXT_MAX_WIDTH;
    final int TEXT_PADDING;
    final int TEXT_POSITIONING_BIAS;
    final int TEXT_SAFE_AREA_PADDING;
    final int TEXT_SPACING;
    private ValueAnimator[] animators;
    int bottomBoundary;
    final ViewGroup boundingParent;
    int calculatedOuterCircleRadius;
    boolean cancelable;
    boolean debug;
    DynamicLayout debugLayout;
    Paint debugPaint;
    SpannableStringBuilder debugStringBuilder;
    TextPaint debugTextPaint;
    CharSequence description;
    StaticLayout descriptionLayout;
    final TextPaint descriptionPaint;
    int dimColor;
    final ValueAnimator dismissAnimation;
    private final ValueAnimator dismissConfirmAnimation;
    Rect drawingBounds;
    final ValueAnimator expandAnimation;
    final FloatValueAnimatorBuilder$UpdateListener expandContractUpdateListener;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    boolean isDark;
    private boolean isDismissed;
    private boolean isDismissing;
    private boolean isInteractable;
    float lastTouchX;
    float lastTouchY;
    TapTargetView$Listener listener;
    int outerCircleAlpha;
    int[] outerCircleCenter;
    final Paint outerCirclePaint;
    Path outerCirclePath;
    float outerCircleRadius;
    final Paint outerCircleShadowPaint;
    ViewOutlineProvider outlineProvider;
    final ViewManager parent;
    final ValueAnimator pulseAnimation;
    boolean shouldDrawShadow;
    boolean shouldTintTarget;
    final TapTarget target;
    final Rect targetBounds;
    int targetCircleAlpha;
    final Paint targetCirclePaint;
    int targetCirclePulseAlpha;
    final Paint targetCirclePulsePaint;
    float targetCirclePulseRadius;
    float targetCircleRadius;
    int textAlpha;
    Rect textBounds;
    Bitmap tintedTarget;
    CharSequence title;
    StaticLayout titleLayout;
    final TextPaint titlePaint;
    int topBoundary;
    boolean visible;

    public TapTargetView(Context object, ViewManager object2, ViewGroup viewGroup, TapTarget tapTarget, TapTargetView$Listener tapTargetView$Listener) {
        super(object);
        boolean bl2;
        boolean bl3 = false;
        this.isDismissed = false;
        this.isDismissing = false;
        this.isInteractable = bl2 = true;
        Object object3 = new TapTargetView$1(this);
        this.expandContractUpdateListener = object3;
        object3 = new FloatValueAnimatorBuilder();
        long l2 = 250L;
        object3 = ((FloatValueAnimatorBuilder)object3).duration(l2).delayBy(l2);
        Object object4 = new AccelerateDecelerateInterpolator();
        object3 = ((FloatValueAnimatorBuilder)object3).interpolator((TimeInterpolator)object4);
        super(this);
        object3 = ((FloatValueAnimatorBuilder)object3).onUpdate((FloatValueAnimatorBuilder$UpdateListener)object4);
        super(this);
        object3 = ((FloatValueAnimatorBuilder)object3).onEnd((FloatValueAnimatorBuilder$EndListener)object4).build();
        this.expandAnimation = object3;
        super();
        long l3 = 1000L;
        object4 = ((FloatValueAnimatorBuilder)object4).duration(l3);
        int n3 = -1;
        object4 = ((FloatValueAnimatorBuilder)object4).repeat(n3);
        Object object5 = new AccelerateDecelerateInterpolator();
        object4 = ((FloatValueAnimatorBuilder)object4).interpolator((TimeInterpolator)object5);
        super(this);
        object4 = ((FloatValueAnimatorBuilder)object4).onUpdate((FloatValueAnimatorBuilder$UpdateListener)object5).build();
        this.pulseAnimation = object4;
        super(bl2);
        object5 = ((FloatValueAnimatorBuilder)object5).duration(l2);
        Object object6 = new AccelerateDecelerateInterpolator();
        object5 = ((FloatValueAnimatorBuilder)object5).interpolator((TimeInterpolator)object6);
        super(this);
        object5 = ((FloatValueAnimatorBuilder)object5).onUpdate((FloatValueAnimatorBuilder$UpdateListener)object6);
        super(this);
        object5 = ((FloatValueAnimatorBuilder)object5).onEnd((FloatValueAnimatorBuilder$EndListener)object6).build();
        this.dismissAnimation = object5;
        super();
        Object object7 = ((FloatValueAnimatorBuilder)object6).duration(l2);
        Object object8 = new AccelerateDecelerateInterpolator();
        object7 = object7.interpolator((TimeInterpolator)object8);
        super(this);
        object7 = object7.onUpdate((FloatValueAnimatorBuilder$UpdateListener)object8);
        super(this);
        object7 = object7.onEnd((FloatValueAnimatorBuilder$EndListener)object8).build();
        this.dismissConfirmAnimation = object7;
        int n4 = 4;
        object8 = new ValueAnimator[n4];
        object8[0] = object3;
        object8[bl2] = object4;
        object8[2] = object7;
        int n7 = 3;
        float f5 = 4.2E-45f;
        object8[n7] = object5;
        this.animators = object8;
        if (tapTarget != null) {
            boolean bl4;
            int n8;
            int n10;
            this.target = tapTarget;
            this.parent = object2;
            this.boundingParent = viewGroup;
            if (tapTargetView$Listener == null) {
                tapTargetView$Listener = new TapTargetView$Listener();
            }
            this.listener = tapTargetView$Listener;
            object2 = tapTarget.title;
            this.title = object2;
            object2 = tapTarget.description;
            this.description = object2;
            int n14 = 20;
            this.TARGET_PADDING = n10 = UiUtil.dp(object, n14);
            n10 = 40;
            this.CIRCLE_PADDING = n7 = UiUtil.dp(object, n10);
            n7 = tapTarget.targetRadius;
            this.TARGET_RADIUS = n7 = UiUtil.dp(object, n7);
            this.TEXT_PADDING = n10 = UiUtil.dp(object, n10);
            n10 = 8;
            this.TEXT_SPACING = n8 = UiUtil.dp(object, n10);
            this.TEXT_MAX_WIDTH = n8 = UiUtil.dp(object, 360);
            this.TEXT_POSITIONING_BIAS = n14 = UiUtil.dp(object, n14);
            this.TEXT_SAFE_AREA_PADDING = n14 = UiUtil.dp(this.getContext(), 10);
            this.GUTTER_DIM = n14 = UiUtil.dp(object, 88);
            this.SHADOW_DIM = n14 = UiUtil.dp(object, n10);
            this.SHADOW_JITTER_DIM = n14 = UiUtil.dp(object, (int)(bl2 ? 1 : 0));
            float f6 = 0.1f;
            this.TARGET_PULSE_RADIUS = n10 = (int)((float)n7 * f6);
            super();
            this.outerCirclePath = tapTargetView$Listener;
            super();
            this.targetBounds = tapTargetView$Listener;
            super();
            this.drawingBounds = tapTargetView$Listener;
            super();
            this.titlePaint = tapTargetView$Listener;
            f5 = tapTarget.titleTextSizePx((Context)object);
            tapTargetView$Listener.setTextSize(f5);
            object3 = Typeface.create((String)"sans-serif-medium", (int)0);
            tapTargetView$Listener.setTypeface((Typeface)object3);
            tapTargetView$Listener.setAntiAlias(bl2);
            super();
            this.descriptionPaint = tapTargetView$Listener;
            f5 = tapTarget.descriptionTextSizePx((Context)object);
            tapTargetView$Listener.setTextSize(f5);
            object3 = Typeface.create((Typeface)Typeface.SANS_SERIF, (int)0);
            tapTargetView$Listener.setTypeface((Typeface)object3);
            tapTargetView$Listener.setAntiAlias(bl2);
            tapTargetView$Listener.setAlpha(137);
            super();
            this.outerCirclePaint = tapTargetView$Listener;
            tapTargetView$Listener.setAntiAlias(bl2);
            f5 = tapTarget.outerCircleAlpha;
            n8 = 1132396544;
            float f7 = 255.0f;
            n7 = (int)(f5 * f7);
            tapTargetView$Listener.setAlpha(n7);
            super();
            this.outerCircleShadowPaint = tapTargetView$Listener;
            tapTargetView$Listener.setAntiAlias(bl2);
            n7 = 50;
            f5 = 7.0E-44f;
            tapTargetView$Listener.setAlpha(n7);
            object3 = Paint.Style.STROKE;
            tapTargetView$Listener.setStyle((Paint.Style)object3);
            float f8 = n14;
            tapTargetView$Listener.setStrokeWidth(f8);
            f8 = -1.7014118E38f;
            tapTargetView$Listener.setColor(-16777216);
            super();
            this.targetCirclePaint = object2;
            object2.setAntiAlias(bl2);
            super();
            this.targetCirclePulsePaint = object2;
            object2.setAntiAlias(bl2);
            this.applyTargetOptions((Context)object);
            n14 = object instanceof Activity;
            if (n14 != 0) {
                object2 = object;
                object2 = ((Activity)object).getWindow().getAttributes();
                n14 = object2.flags & 0x200;
                if (n14 != 0) {
                    bl3 = true;
                }
                bl4 = bl3;
            } else {
                bl4 = false;
                object6 = null;
            }
            object3 = object2;
            object7 = this;
            object8 = tapTarget;
            object4 = viewGroup;
            object5 = object;
            super(this, tapTarget, viewGroup, (Context)object, bl4);
            this.globalLayoutListener = object2;
            this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
            this.setFocusableInTouchMode(bl2);
            this.setClickable(bl2);
            super(this);
            this.setOnClickListener((View.OnClickListener)object);
            super(this);
            this.setOnLongClickListener((View.OnLongClickListener)object);
            return;
        }
        super("Target cannot be null");
        throw object;
    }

    public static /* synthetic */ boolean access$000(TapTargetView tapTargetView) {
        return tapTargetView.isInteractable;
    }

    public static /* synthetic */ boolean access$002(TapTargetView tapTargetView, boolean bl2) {
        tapTargetView.isInteractable = bl2;
        return bl2;
    }

    public static /* synthetic */ void access$100(TapTargetView tapTargetView, boolean bl2) {
        tapTargetView.finishDismiss(bl2);
    }

    public static /* synthetic */ boolean access$200(TapTargetView tapTargetView) {
        return tapTargetView.isDismissing;
    }

    public static /* synthetic */ void access$300(TapTargetView tapTargetView) {
        tapTargetView.startExpandAnimation();
    }

    private void finishDismiss(boolean bl2) {
        this.onDismiss(bl2);
        ViewUtil.removeView(this.parent, this);
    }

    public static TapTargetView showFor(Activity activity, TapTarget tapTarget) {
        return TapTargetView.showFor(activity, tapTarget, null);
    }

    public static TapTargetView showFor(Activity object, TapTarget tapTarget, TapTargetView$Listener tapTargetView$Listener) {
        if (object != null) {
            TapTargetView tapTargetView;
            View view;
            ViewGroup viewGroup = (ViewGroup)object.getWindow().getDecorView();
            int n3 = -1;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n3);
            View view2 = view = viewGroup.findViewById(0x1020002);
            view2 = (ViewGroup)view;
            view = tapTargetView;
            tapTargetView = new TapTargetView((Context)object, (ViewManager)viewGroup, (ViewGroup)view2, tapTarget, tapTargetView$Listener);
            viewGroup.addView((View)tapTargetView, layoutParams);
            return tapTargetView;
        }
        object = new IllegalArgumentException("Activity is null");
        throw object;
    }

    public static TapTargetView showFor(Dialog dialog, TapTarget tapTarget) {
        return TapTargetView.showFor(dialog, tapTarget, null);
    }

    public static TapTargetView showFor(Dialog object, TapTarget tapTarget, TapTargetView$Listener tapTargetView$Listener) {
        if (object != null) {
            int n3;
            Context context = object.getContext();
            object = (WindowManager)context.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = 2;
            layoutParams.format = 1;
            layoutParams.flags = 0;
            layoutParams.gravity = 0x800033;
            layoutParams.x = 0;
            layoutParams.y = 0;
            layoutParams.width = n3 = -1;
            layoutParams.height = n3;
            TapTargetView tapTargetView = new TapTargetView(context, (ViewManager)object, null, tapTarget, tapTargetView$Listener);
            object.addView((View)tapTargetView, (ViewGroup.LayoutParams)layoutParams);
            return tapTargetView;
        }
        object = new IllegalArgumentException("Dialog is null");
        throw object;
    }

    private void startExpandAnimation() {
        boolean bl2 = this.visible;
        if (!bl2) {
            this.isInteractable = false;
            ValueAnimator valueAnimator = this.expandAnimation;
            valueAnimator.start();
            this.visible = bl2 = true;
        }
    }

    public void applyTargetOptions(Context object) {
        Paint paint;
        float f5;
        int n3;
        PorterDuff.Mode mode;
        boolean bl2;
        Object object2 = this.target;
        int n4 = ((TapTarget)object2).transparentTarget;
        int n7 = 0;
        int n8 = 1;
        float f6 = Float.MIN_VALUE;
        if (n4 == 0 && (bl2 = ((TapTarget)object2).tintTarget)) {
            bl2 = true;
        } else {
            bl2 = false;
            mode = null;
        }
        this.shouldTintTarget = bl2;
        this.shouldDrawShadow = bl2 = ((TapTarget)object2).drawShadow;
        this.cancelable = n3 = ((TapTarget)object2).cancelable;
        if (bl2 && n4 == 0) {
            object2 = new TapTargetView$12(this);
            this.outlineProvider = object2;
            this.setOutlineProvider((ViewOutlineProvider)object2);
            n3 = this.SHADOW_DIM;
            f5 = n3;
            this.setElevation(f5);
        }
        n3 = 2;
        f5 = 2.8E-45f;
        this.setLayerType(n3, null);
        object2 = object.getTheme();
        Object object3 = "isLightTheme";
        n4 = UiUtil.themeIntAttr((Context)object, (String)object3);
        if (n4 == 0) {
            n7 = 1;
        }
        this.isDark = n7;
        object3 = this.target.outerCircleColorInt((Context)object);
        n7 = -1;
        if (object3 != null) {
            object2 = this.outerCirclePaint;
            n4 = (Integer)object3;
            object2.setColor(n4);
        } else if (object2 != null) {
            object2 = this.outerCirclePaint;
            object3 = "colorPrimary";
            n4 = UiUtil.themeIntAttr((Context)object, (String)object3);
            object2.setColor(n4);
        } else {
            object2 = this.outerCirclePaint;
            object2.setColor(n7);
        }
        object2 = this.target.targetCircleColorInt((Context)object);
        n4 = -16777216;
        if (object2 != null) {
            paint = this.targetCirclePaint;
            n3 = (Integer)object2;
            paint.setColor(n3);
        } else {
            object2 = this.targetCirclePaint;
            n8 = this.isDark;
            if (n8 != 0) {
                n8 = -16777216;
                f6 = -1.7014118E38f;
            } else {
                n8 = -1;
                f6 = 0.0f / 0.0f;
            }
            object2.setColor(n8);
        }
        object2 = this.target;
        n3 = (int)(((TapTarget)object2).transparentTarget ? 1 : 0);
        if (n3 != 0) {
            object2 = this.targetCirclePaint;
            mode = PorterDuff.Mode.CLEAR;
            paint = new PorterDuffXfermode(mode);
            object2.setXfermode((Xfermode)paint);
        }
        object2 = this.targetCirclePulsePaint;
        paint = this.targetCirclePaint;
        n8 = paint.getColor();
        object2.setColor(n8);
        object2 = this.target.dimColorInt((Context)object);
        if (object2 != null) {
            n3 = (Integer)object2;
            n8 = 1050253722;
            f6 = 0.3f;
            this.dimColor = n3 = UiUtil.setAlpha(n3, f6);
        } else {
            this.dimColor = n7;
        }
        object2 = this.target.titleTextColorInt((Context)object);
        if (object2 != null) {
            object3 = this.titlePaint;
            n3 = (Integer)object2;
            object3.setColor(n3);
        } else {
            object2 = this.titlePaint;
            n8 = (int)(this.isDark ? 1 : 0);
            if (n8 != 0) {
                n7 = -16777216;
            }
            object2.setColor(n7);
        }
        object2 = this.target;
        object = ((TapTarget)object2).descriptionTextColorInt((Context)object);
        if (object != null) {
            object2 = this.descriptionPaint;
            int n10 = (Integer)object;
            object2.setColor(n10);
        } else {
            object = this.descriptionPaint;
            object2 = this.titlePaint;
            n3 = object2.getColor();
            object.setColor(n3);
        }
        object = this.target.titleTypeface;
        if (object != null) {
            object2 = this.titlePaint;
            object2.setTypeface((Typeface)object);
        }
        if ((object = this.target.descriptionTypeface) != null) {
            object2 = this.descriptionPaint;
            object2.setTypeface((Typeface)object);
        }
    }

    public void calculateDimensions() {
        Object object;
        this.textBounds = object = this.getTextBounds();
        object = this.getOuterCircleCenterPoint();
        this.outerCircleCenter = (int[])object;
        Rect rect = object[0];
        Object object2 = object[1];
        Rect rect2 = this.textBounds;
        Rect rect3 = this.targetBounds;
        object2 = this.getOuterCircleRadius((int)rect, (int)object2, rect2, rect3);
        this.calculatedOuterCircleRadius = (int)object2;
    }

    public void calculateDrawingBounds() {
        int n3;
        int n4;
        Object object = this.outerCircleCenter;
        if (object == null) {
            return;
        }
        Object object2 = this.drawingBounds;
        float f5 = object[0];
        float f6 = this.outerCircleRadius;
        object2.left = n4 = (int)Math.max(0.0f, f5 -= f6);
        object = this.drawingBounds;
        object2 = this.outerCircleCenter;
        int n7 = 1;
        float f7 = (float)object2[n7];
        float f8 = this.outerCircleRadius;
        object.top = n3 = (int)Math.min(0.0f, f7 -= f8);
        object = this.drawingBounds;
        f7 = this.getWidth();
        float f11 = this.outerCircleCenter[0];
        f6 = this.outerCircleRadius;
        f11 += f6;
        f6 = this.CIRCLE_PADDING;
        object.right = n3 = (int)Math.min(f7, f11 += f6);
        object = this.drawingBounds;
        f7 = this.getHeight();
        f11 = this.outerCircleCenter[n7];
        f6 = this.outerCircleRadius;
        f11 += f6;
        f6 = this.CIRCLE_PADDING;
        object.bottom = n3 = (int)Math.min(f7, f11 += f6);
    }

    public float delayedLerp(float f5, float f6) {
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object < 0) {
            return 0.0f;
        }
        float f7 = 1.0f - f6;
        return (f5 -= f6) / f7;
    }

    public void dismiss(boolean bl2) {
        this.isDismissing = true;
        this.pulseAnimation.cancel();
        Object object = this.expandAnimation;
        object.cancel();
        boolean bl3 = this.visible;
        if (bl3 && (object = (Object)this.outerCircleCenter) != null) {
            if (bl2) {
                ValueAnimator valueAnimator = this.dismissConfirmAnimation;
                valueAnimator.start();
            } else {
                ValueAnimator valueAnimator = this.dismissAnimation;
                valueAnimator.start();
            }
            return;
        }
        this.finishDismiss(bl2);
    }

    public double distance(int n3, int n4, int n7, int n8) {
        double d2 = n7 - n3;
        double d5 = 2.0;
        d2 = Math.pow(d2, d5);
        return Math.sqrt(Math.pow(n8 - n4, d5) + d2);
    }

    public void drawDebugInformation(Canvas canvas) {
        float f5;
        int n3;
        float f6;
        int n4;
        Object object;
        Object object2 = this.debugPaint;
        Object object3 = 1;
        float f7 = Float.MIN_VALUE;
        int n7 = 255;
        if (object2 == null) {
            object2 = new Paint();
            this.debugPaint = object2;
            object2.setARGB(n7, n7, 0, 0);
            object2 = this.debugPaint;
            object = Paint.Style.STROKE;
            object2.setStyle(object);
            object2 = this.debugPaint;
            object = this.getContext();
            n4 = UiUtil.dp((Context)object, object3);
            f6 = n4;
            object2.setStrokeWidth(f6);
        }
        if ((object2 = this.debugTextPaint) == null) {
            object2 = new TextPaint();
            this.debugTextPaint = object2;
            object2.setColor(-65536);
            object2 = this.debugTextPaint;
            object = this.getContext();
            n3 = 16;
            f5 = 2.2E-44f;
            n4 = UiUtil.sp((Context)object, n3);
            f6 = n4;
            object2.setTextSize(f6);
        }
        object2 = this.debugPaint;
        object = Paint.Style.STROKE;
        object2.setStyle(object);
        object2 = this.textBounds;
        object = this.debugPaint;
        canvas.drawRect((Rect)object2, (Paint)object);
        object2 = this.targetBounds;
        object = this.debugPaint;
        canvas.drawRect((Rect)object2, (Paint)object);
        object2 = this.outerCircleCenter;
        f6 = (float)object2[0];
        float f8 = (float)object2[object3];
        Object object4 = this.debugPaint;
        canvas.drawCircle(f6, f8, 10.0f, object4);
        object2 = this.outerCircleCenter;
        f6 = (float)object2[0];
        f8 = (float)object2[object3];
        n3 = this.calculatedOuterCircleRadius;
        int n8 = this.CIRCLE_PADDING;
        f5 = n3 - n8;
        object4 = this.debugPaint;
        canvas.drawCircle(f6, f8, f5, object4);
        int n10 = this.targetBounds.centerX();
        f8 = n10;
        n4 = this.targetBounds.centerY();
        f6 = n4;
        n3 = this.TARGET_RADIUS;
        n8 = this.TARGET_PADDING;
        f5 = n3 + n8;
        object4 = this.debugPaint;
        canvas.drawCircle(f8, f6, f5, object4);
        object2 = this.debugPaint;
        object = Paint.Style.FILL;
        object2.setStyle(object);
        object2 = new StringBuilder("Text bounds: ");
        object = this.textBounds.toShortString();
        ((StringBuilder)object2).append((String)object);
        object = "\nTarget bounds: ";
        ((StringBuilder)object2).append((String)object);
        String string2 = this.targetBounds.toShortString();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("\nCenter: ");
        n3 = this.outerCircleCenter[0];
        ((StringBuilder)object2).append(n3);
        string2 = " ";
        ((StringBuilder)object2).append(string2);
        object4 = this.outerCircleCenter;
        object3 = object4[object3];
        ((StringBuilder)object2).append((int)object3);
        ((StringBuilder)object2).append("\nView size: ");
        object3 = this.getWidth();
        ((StringBuilder)object2).append((int)object3);
        ((StringBuilder)object2).append(string2);
        object3 = this.getHeight();
        ((StringBuilder)object2).append((int)object3);
        ((StringBuilder)object2).append((String)object);
        String string3 = this.targetBounds.toShortString();
        ((StringBuilder)object2).append(string3);
        string2 = ((StringBuilder)object2).toString();
        object2 = this.debugStringBuilder;
        if (object2 == null) {
            object2 = new SpannableStringBuilder((CharSequence)string2);
            this.debugStringBuilder = object2;
        } else {
            object2.clear();
            object2 = this.debugStringBuilder;
            object2.append((CharSequence)string2);
        }
        object2 = this.debugLayout;
        if (object2 == null) {
            object4 = this.debugTextPaint;
            int n14 = this.getWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            float f11 = 1.0f;
            object = object2;
            object2 = new DynamicLayout((CharSequence)string2, (TextPaint)object4, n14, alignment, f11, 0.0f, false);
            this.debugLayout = object2;
        }
        n10 = canvas.save();
        this.debugPaint.setARGB(220, 0, 0, 0);
        f7 = this.topBoundary;
        canvas.translate(0.0f, f7);
        float f12 = this.debugLayout.getWidth();
        float f14 = this.debugLayout.getHeight();
        Paint paint = this.debugPaint;
        object = canvas;
        canvas.drawRect(0.0f, 0.0f, f12, f14, paint);
        this.debugPaint.setARGB(n7, n7, 0, 0);
        this.debugLayout.draw(canvas);
        canvas.restoreToCount(n10);
    }

    /*
     * WARNING - void declaration
     */
    public void drawJitteredShadow(Canvas canvas) {
        void var10_13;
        int n3 = this.outerCircleAlpha;
        float f5 = (float)n3 * 0.2f;
        Object object = this.outerCircleShadowPaint;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        object.setStyle(style2);
        object = this.outerCircleShadowPaint;
        int n4 = (int)f5;
        object.setAlpha(n4);
        object = this.outerCircleCenter;
        n4 = 0;
        style2 = null;
        Paint paint = object[0];
        float f6 = (float)paint;
        int n7 = 1;
        Paint paint2 = object[n7];
        Object object2 = this.SHADOW_DIM;
        float f7 = (float)(paint2 + object2);
        float f8 = this.outerCircleRadius;
        Paint paint3 = this.outerCircleShadowPaint;
        canvas.drawCircle(f6, f7, f8, paint3);
        object = this.outerCircleShadowPaint;
        Object object3 = Paint.Style.STROKE;
        object.setStyle(object3);
        int n8 = 6;
        f7 = 8.4E-45f;
        while (var10_13 > 0) {
            object3 = this.outerCircleShadowPaint;
            object2 = (int)((float)var10_13 / 7.0f * f5);
            object3.setAlpha(object2);
            object3 = this.outerCircleCenter;
            object2 = object3[0];
            f8 = object2;
            reference var7_8 = object3[n7];
            int n10 = this.SHADOW_DIM;
            f6 = (float)(var7_8 += n10);
            float f11 = this.outerCircleRadius;
            int n14 = 7 - var10_13;
            int n15 = this.SHADOW_JITTER_DIM;
            float f12 = n14 *= n15;
            Paint paint4 = this.outerCircleShadowPaint;
            canvas.drawCircle(f8, f6, f11 += f12, paint4);
            var10_13 += -1;
        }
    }

    public void drawTintedTarget() {
        Drawable drawable2 = this.target.icon;
        int n3 = this.shouldTintTarget;
        if (n3 != 0 && drawable2 != null) {
            Bitmap bitmap = this.tintedTarget;
            if (bitmap != null) {
                return;
            }
            n3 = drawable2.getIntrinsicWidth();
            int n4 = drawable2.getIntrinsicHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmap2 = this.tintedTarget = (bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config));
            bitmap = new Canvas(bitmap2);
            int n7 = this.outerCirclePaint.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            bitmap2 = new PorterDuffColorFilter(n7, mode);
            drawable2.setColorFilter((ColorFilter)bitmap2);
            drawable2.draw((Canvas)bitmap);
            drawable2.setColorFilter(null);
            return;
        }
        this.tintedTarget = null;
    }

    public int[] getOuterCircleCenterPoint() {
        Object object = this.targetBounds;
        int n3 = object.centerY();
        if ((n3 = (int)(this.inGutter(n3) ? 1 : 0)) == 0) {
            object = this.target;
            n3 = (int)(object.forceCenteredTarget ? 1 : 0);
            if (n3 == 0) {
                object = this.targetBounds;
                n3 = object.width();
                Rect rect = this.targetBounds;
                int n4 = rect.height();
                n3 = Math.max(n3, n4) / 2;
                n4 = this.TARGET_PADDING;
                n3 += n4;
                n4 = this.getTotalTextHeight();
                Rect rect2 = this.targetBounds;
                int n7 = rect2.centerY();
                int n8 = this.TARGET_RADIUS;
                n7 -= n8;
                n8 = this.TARGET_PADDING;
                n7 = n7 - n8 - n4;
                n8 = 0;
                if (n7 > 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    rect2 = null;
                }
                Rect rect3 = this.textBounds;
                int n10 = rect3.left;
                int n14 = this.targetBounds.left - n3;
                n10 = Math.min(n10, n14);
                n14 = this.textBounds.right;
                Rect rect4 = this.targetBounds;
                int n15 = rect4.right + n3;
                n3 = Math.max(n14, n15);
                StaticLayout staticLayout = this.titleLayout;
                if (staticLayout != null) {
                    n8 = staticLayout.getHeight();
                }
                if (n7 != 0) {
                    rect2 = this.targetBounds;
                    n7 = rect2.centerY();
                    n14 = this.TARGET_RADIUS;
                    n7 -= n14;
                    n14 = this.TARGET_PADDING;
                    n7 = n7 - n14 - n4 + n8;
                } else {
                    rect = this.targetBounds;
                    n4 = rect.centerY();
                    n7 = this.TARGET_RADIUS;
                    n4 += n7;
                    n7 = this.TARGET_PADDING;
                    n4 += n7;
                    n7 = n4 + n8;
                }
                n10 = (n10 + n3) / 2;
                return new int[]{n10, n7};
            }
        }
        n3 = this.targetBounds.centerX();
        int n16 = this.targetBounds.centerY();
        return new int[]{n3, n16};
    }

    public int getOuterCircleRadius(int n3, int n4, Rect rect, Rect rect2) {
        int n7 = rect2.centerX();
        int n8 = rect2.centerY();
        int n10 = (int)((float)this.TARGET_RADIUS * 1.1f);
        Rect rect3 = new Rect(n7, n8, n7, n8);
        n8 = -n10;
        rect3.inset(n8, n8);
        int n14 = this.maxDistanceToPoints(n3, n4, rect);
        n3 = this.maxDistanceToPoints(n3, n4, rect3);
        n3 = Math.max(n14, n3);
        n4 = this.CIRCLE_PADDING;
        return n3 + n4;
    }

    public Rect getTextBounds() {
        int n3;
        Rect rect;
        int n4;
        int n7 = this.getTotalTextHeight();
        int n8 = this.getTotalTextWidth();
        Rect rect2 = this.targetBounds;
        int n10 = rect2.centerY();
        int n14 = this.TARGET_RADIUS;
        n10 -= n14;
        n14 = this.TARGET_PADDING;
        if ((n10 = n10 - n14 - n7) > (n14 = this.topBoundary)) {
            Rect rect3 = new Rect();
            this.getWindowVisibleDisplayFrame(rect3);
            n4 = 0;
            rect = null;
            n3 = this.TEXT_SAFE_AREA_PADDING;
            rect3.inset(0, n3);
            n14 = rect3.top;
            n10 = Math.max(n10, n14);
        } else {
            rect2 = this.targetBounds;
            n10 = rect2.centerY();
            n14 = this.TARGET_RADIUS;
            n10 += n14;
            n14 = this.TARGET_PADDING;
            n10 += n14;
        }
        n14 = this.getWidth() / 2;
        rect = this.targetBounds;
        n4 = rect.centerX();
        n14 = (n14 -= n4) < 0 ? -this.TEXT_POSITIONING_BIAS : this.TEXT_POSITIONING_BIAS;
        n4 = this.TEXT_PADDING;
        n3 = this.targetBounds.centerX() - n14 - n8;
        n14 = Math.max(n4, n3);
        n4 = this.getWidth();
        n3 = this.TEXT_PADDING;
        n8 += n14;
        n8 = Math.min(n4 -= n3, n8);
        rect = new Rect(n14, n10, n8, n7 += n10);
        return rect;
    }

    public int getTotalTextHeight() {
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout == null) {
            return 0;
        }
        StaticLayout staticLayout2 = this.descriptionLayout;
        if (staticLayout2 == null) {
            int n3 = staticLayout.getHeight();
            int n4 = this.TEXT_SPACING;
            return n3 + n4;
        }
        int n7 = staticLayout.getHeight();
        int n8 = this.descriptionLayout.getHeight() + n7;
        n7 = this.TEXT_SPACING;
        return n8 + n7;
    }

    public int getTotalTextWidth() {
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout == null) {
            return 0;
        }
        StaticLayout staticLayout2 = this.descriptionLayout;
        if (staticLayout2 == null) {
            return staticLayout.getWidth();
        }
        int n3 = staticLayout.getWidth();
        int n4 = this.descriptionLayout.getWidth();
        return Math.max(n3, n4);
    }

    public float halfwayLerp(float f5) {
        float f6 = 0.5f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            return f5 / f6;
        }
        return (1.0f - f5) / f6;
    }

    public boolean inGutter(int n3) {
        int n4 = this.bottomBoundary;
        boolean bl2 = true;
        if (n4 > 0) {
            int n7 = this.GUTTER_DIM;
            if (n3 >= n7 && n3 <= (n4 -= n7)) {
                bl2 = false;
            }
            return bl2;
        }
        n4 = this.GUTTER_DIM;
        if (n3 >= n4) {
            n4 = this.getHeight();
            int n8 = this.GUTTER_DIM;
            if (n3 <= (n4 -= n8)) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public void invalidateViewAndOutline(Rect rect) {
        this.invalidate(rect);
        rect = this.outlineProvider;
        if (rect != null) {
            this.invalidateOutline();
        }
    }

    public boolean isVisible() {
        boolean bl2 = this.isDismissed;
        bl2 = !bl2 && (bl2 = this.visible);
        return bl2;
    }

    public int maxDistanceToPoints(int n3, int n4, Rect rect) {
        int n7 = rect.left;
        int n8 = rect.top;
        double d2 = this.distance(n3, n4, n7, n8);
        int n10 = rect.right;
        int n14 = rect.top;
        double d5 = this.distance(n3, n4, n10, n14);
        int n15 = rect.left;
        int n16 = rect.bottom;
        double d7 = this.distance(n3, n4, n15, n16);
        int n17 = rect.right;
        int n18 = rect.bottom;
        double d9 = this.distance(n3, n4, n17, n18);
        d9 = Math.max(d7, d9);
        d9 = Math.max(d5, d9);
        return (int)Math.max(d2, d9);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onDismiss(false);
    }

    public void onDismiss(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.isDismissed;
        if (bl4) {
            return;
        }
        bl4 = false;
        TapTargetView$Listener tapTargetView$Listener = null;
        this.isDismissing = false;
        this.isDismissed = bl3 = true;
        for (ValueAnimator valueAnimator : this.animators) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.globalLayoutListener;
        ViewUtil.removeOnGlobalLayoutListener(viewTreeObserver, onGlobalLayoutListener2);
        this.visible = false;
        tapTargetView$Listener = this.listener;
        if (tapTargetView$Listener != null) {
            tapTargetView$Listener.onTargetDismissed(this, bl2);
        }
    }

    public void onDraw(Canvas canvas) {
        Object object;
        int n3 = this.isDismissed;
        if (n3 == 0 && (object = this.outerCircleCenter) != null) {
            int n4;
            float f5;
            Object object2;
            Path path;
            int n7;
            int n8;
            n3 = this.topBoundary;
            int n10 = 0;
            float f6 = 0.0f;
            Rect rect = null;
            if (n3 > 0 && (n8 = this.bottomBoundary) > 0) {
                n8 = this.getWidth();
                n7 = this.bottomBoundary;
                canvas.clipRect(0, n3, n8, n7);
            }
            n3 = this.dimColor;
            n8 = -1;
            float f7 = 0.0f / 0.0f;
            if (n3 != n8) {
                canvas.drawColor(n3);
            }
            object = this.outerCirclePaint;
            n8 = this.outerCircleAlpha;
            object.setAlpha(n8);
            n3 = (int)(this.shouldDrawShadow ? 1 : 0);
            if (n3 != 0 && (object = (Object)this.outlineProvider) == null) {
                n3 = canvas.save();
                path = this.outerCirclePath;
                object2 = Region.Op.DIFFERENCE;
                canvas.clipPath(path, object2);
                this.drawJitteredShadow(canvas);
                canvas.restoreToCount(n3);
            }
            object = this.outerCircleCenter;
            f6 = object[0];
            n8 = 1;
            float f8 = object[n8];
            f7 = this.outerCircleRadius;
            object2 = this.outerCirclePaint;
            canvas.drawCircle(f6, f8, f7, (Paint)object2);
            object = this.targetCirclePaint;
            n10 = this.targetCircleAlpha;
            object.setAlpha(n10);
            n3 = this.targetCirclePulseAlpha;
            if (n3 > 0) {
                this.targetCirclePulsePaint.setAlpha(n3);
                object = this.targetBounds;
                n3 = object.centerX();
                f8 = n3;
                rect = this.targetBounds;
                n10 = rect.centerY();
                f6 = n10;
                f7 = this.targetCirclePulseRadius;
                object2 = this.targetCirclePulsePaint;
                canvas.drawCircle(f8, f6, f7, (Paint)object2);
            }
            object = this.targetBounds;
            f8 = object.centerX();
            f6 = this.targetBounds.centerY();
            f7 = this.targetCircleRadius;
            object2 = this.targetCirclePaint;
            canvas.drawCircle(f8, f6, f7, (Paint)object2);
            n3 = canvas.save();
            rect = this.textBounds;
            f7 = rect.left;
            n10 = rect.top;
            f6 = n10;
            canvas.translate(f7, f6);
            rect = this.titlePaint;
            n8 = this.textAlpha;
            rect.setAlpha(n8);
            rect = this.titleLayout;
            if (rect != null) {
                rect.draw(canvas);
            }
            rect = this.descriptionLayout;
            n8 = 0;
            f7 = 0.0f;
            path = null;
            if (rect != null && (rect = this.titleLayout) != null) {
                n10 = rect.getHeight();
                n7 = this.TEXT_SPACING;
                f6 = n10 += n7;
                canvas.translate(0.0f, f6);
                rect = this.descriptionPaint;
                object2 = this.target;
                f5 = object2.descriptionTextAlpha;
                n4 = this.textAlpha;
                float f11 = n4;
                n7 = (int)(f5 *= f11);
                rect.setAlpha(n7);
                rect = this.descriptionLayout;
                rect.draw(canvas);
            }
            canvas.restoreToCount(n3);
            n3 = canvas.save();
            rect = this.tintedTarget;
            if (rect != null) {
                n10 = this.targetBounds.centerX();
                n7 = this.tintedTarget.getWidth() / 2;
                f6 = n10 -= n7;
                n7 = this.targetBounds.centerY();
                Bitmap bitmap = this.tintedTarget;
                n4 = bitmap.getHeight() / 2;
                f5 = n7 -= n4;
                canvas.translate(f6, f5);
                rect = this.tintedTarget;
                object2 = this.targetCirclePaint;
                canvas.drawBitmap((Bitmap)rect, 0.0f, 0.0f, (Paint)object2);
            } else {
                rect = this.target.icon;
                if (rect != null) {
                    n10 = this.targetBounds.centerX();
                    n8 = this.target.icon.getBounds().width() / 2;
                    f6 = n10 -= n8;
                    n8 = this.targetBounds.centerY();
                    object2 = this.target.icon.getBounds();
                    n7 = object2.height() / 2;
                    f7 = n8 - n7;
                    canvas.translate(f6, f7);
                    rect = this.target.icon;
                    path = this.targetCirclePaint;
                    n8 = path.getAlpha();
                    rect.setAlpha(n8);
                    rect = this.target.icon;
                    rect.draw(canvas);
                }
            }
            canvas.restoreToCount(n3);
            n3 = (int)(this.debug ? 1 : 0);
            if (n3 != 0) {
                this.drawDebugInformation(canvas);
            }
        }
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        int n4 = this.isVisible();
        if (n4 != 0 && (n4 = this.cancelable) != 0 && n3 == (n4 = 4)) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int n3, KeyEvent keyEvent) {
        int n4 = this.isVisible();
        if (n4 != 0 && (n4 = this.isInteractable) != 0 && (n4 = this.cancelable) != 0 && n3 == (n4 = 4) && (n3 = (int)(keyEvent.isTracking() ? 1 : 0)) != 0 && (n3 = (int)(keyEvent.isCanceled() ? 1 : 0)) == 0) {
            this.isInteractable = false;
            TapTargetView$Listener tapTargetView$Listener = this.listener;
            if (tapTargetView$Listener != null) {
                tapTargetView$Listener.onTargetCancel(this);
            } else {
                tapTargetView$Listener = new TapTargetView$Listener();
                tapTargetView$Listener.onTargetCancel(this);
            }
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f5;
        this.lastTouchX = f5 = motionEvent.getX();
        this.lastTouchY = f5 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setDrawDebug(boolean bl2) {
        boolean bl3 = this.debug;
        if (bl3 != bl2) {
            this.debug = bl2;
            this.postInvalidate();
        }
    }

    public void updateTextLayouts() {
        Object object;
        int n3 = this.getWidth();
        int n4 = this.TEXT_MAX_WIDTH;
        n3 = Math.min(n3, n4);
        n4 = this.TEXT_PADDING * 2;
        if ((n3 -= n4) <= 0) {
            return;
        }
        CharSequence charSequence = this.title;
        TextPaint textPaint = this.titlePaint;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        float f5 = 1.0f;
        this.titleLayout = object = new StaticLayout(charSequence, textPaint, n3, alignment, f5, 0.0f, false);
        object = this.description;
        if (object != null) {
            charSequence = this.description;
            textPaint = this.descriptionPaint;
            f5 = 1.0f;
            this.descriptionLayout = object = new StaticLayout(charSequence, textPaint, n3, alignment, f5, 0.0f, false);
        } else {
            n3 = 0;
            this.descriptionLayout = null;
        }
    }
}

