/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 */
package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.progressindicator.BaseProgressIndicator$1;
import com.google.android.material.progressindicator.BaseProgressIndicator$3;
import com.google.android.material.progressindicator.BaseProgressIndicator$4;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.IndeterminateDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;

public abstract class BaseProgressIndicator
extends ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = 0;
    public static final int HIDE_ESCAPE = 3;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final Mj hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    BaseProgressIndicatorSpec spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final Mj switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_ProgressIndicator;
    }

    public BaseProgressIndicator(Context object, AttributeSet attributeSet, int n3, int n4) {
        int n7 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, n7);
        super(object, attributeSet, n3);
        this.lastShowStartTime = -1;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        Object object2 = new BaseProgressIndicator$1(this);
        this.delayedShow = object2;
        super(this);
        this.delayedHide = object2;
        this.switchIndeterminateModeCallback = object2 = new BaseProgressIndicator$3(this);
        this.hideAnimationCallback = object2 = new BaseProgressIndicator$4(this);
        Context context = this.getContext();
        this.spec = object2 = this.createSpec(context, attributeSet);
        int[] nArray = R$styleable.BaseProgressIndicator;
        int[] nArray2 = new int[]{};
        object = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        int n8 = R$styleable.BaseProgressIndicator_showDelay;
        n3 = -1;
        this.showDelay = n8 = object.getInt(n8, n3);
        n8 = R$styleable.BaseProgressIndicator_minHideDelay;
        this.minHideDelay = n8 = Math.min(object.getInt(n8, n3), 1000);
        object.recycle();
        super();
        this.animatorDurationScaleProvider = object;
        this.isParentDoneInitializing = true;
    }

    public static /* synthetic */ void access$000(BaseProgressIndicator baseProgressIndicator) {
        baseProgressIndicator.internalShow();
    }

    public static /* synthetic */ void access$100(BaseProgressIndicator baseProgressIndicator) {
        baseProgressIndicator.internalHide();
    }

    public static /* synthetic */ long access$202(BaseProgressIndicator baseProgressIndicator, long l2) {
        baseProgressIndicator.lastShowStartTime = l2;
        return l2;
    }

    public static /* synthetic */ int access$300(BaseProgressIndicator baseProgressIndicator) {
        return baseProgressIndicator.storedProgress;
    }

    public static /* synthetic */ boolean access$400(BaseProgressIndicator baseProgressIndicator) {
        return baseProgressIndicator.storedProgressAnimated;
    }

    public static /* synthetic */ boolean access$500(BaseProgressIndicator baseProgressIndicator) {
        return baseProgressIndicator.isIndeterminateModeChangeRequested;
    }

    public static /* synthetic */ int access$600(BaseProgressIndicator baseProgressIndicator) {
        return baseProgressIndicator.visibilityAfterHide;
    }

    private DrawingDelegate getCurrentDrawingDelegate() {
        boolean bl2 = this.isIndeterminate();
        DrawingDelegate drawingDelegate = null;
        if (bl2) {
            Drawable drawable2 = this.getIndeterminateDrawable();
            if (drawable2 != null) {
                drawable2 = this.getIndeterminateDrawable();
                drawingDelegate = drawable2.getDrawingDelegate();
            }
            return drawingDelegate;
        }
        Drawable drawable3 = this.getProgressDrawable();
        if (drawable3 != null) {
            drawable3 = this.getProgressDrawable();
            drawingDelegate = drawable3.getDrawingDelegate();
        }
        return drawingDelegate;
    }

    private void internalHide() {
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange)this.getCurrentDrawable();
        boolean bl2 = true;
        drawableWithAnimatedVisibilityChange.setVisible(false, false, bl2);
        int n3 = this.isNoLongerNeedToBeVisible();
        if (n3 != 0) {
            n3 = 4;
            this.setVisibility(n3);
        }
    }

    private void internalShow() {
        int n3 = this.minHideDelay;
        if (n3 > 0) {
            long l2;
            this.lastShowStartTime = l2 = SystemClock.uptimeMillis();
        }
        this.setVisibility(0);
    }

    private boolean isNoLongerNeedToBeVisible() {
        boolean bl2;
        Drawable drawable2 = this.getProgressDrawable();
        if (drawable2 != null && (bl2 = (drawable2 = this.getProgressDrawable()).isVisible()) || (drawable2 = this.getIndeterminateDrawable()) != null && (bl2 = (drawable2 = this.getIndeterminateDrawable()).isVisible())) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private void registerAnimationCallbacks() {
        Mj mj;
        Object object = this.getProgressDrawable();
        if (object != null && (object = this.getIndeterminateDrawable()) != null) {
            object = this.getIndeterminateDrawable().getAnimatorDelegate();
            mj = this.switchIndeterminateModeCallback;
            ((IndeterminateAnimatorDelegate)object).registerAnimatorsCompleteCallback(mj);
        }
        if ((object = this.getProgressDrawable()) != null) {
            object = this.getProgressDrawable();
            mj = this.hideAnimationCallback;
            ((DeterminateDrawable)((Object)object)).registerAnimationCallback(mj);
        }
        if ((object = this.getIndeterminateDrawable()) != null) {
            object = this.getIndeterminateDrawable();
            mj = this.hideAnimationCallback;
            ((IndeterminateDrawable)((Object)object)).registerAnimationCallback(mj);
        }
    }

    private void unregisterAnimationCallbacks() {
        Mj mj;
        Object object = this.getIndeterminateDrawable();
        if (object != null) {
            object = this.getIndeterminateDrawable();
            mj = this.hideAnimationCallback;
            ((IndeterminateDrawable)((Object)object)).unregisterAnimationCallback(mj);
            object = this.getIndeterminateDrawable().getAnimatorDelegate();
            ((IndeterminateAnimatorDelegate)object).unregisterAnimatorsCompleteCallback();
        }
        if ((object = this.getProgressDrawable()) != null) {
            object = this.getProgressDrawable();
            mj = this.hideAnimationCallback;
            ((DeterminateDrawable)((Object)object)).unregisterAnimationCallback(mj);
        }
    }

    public void applyNewVisibility(boolean bl2) {
        boolean bl3 = this.isParentDoneInitializing;
        if (!bl3) {
            return;
        }
        DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange)this.getCurrentDrawable();
        boolean bl4 = this.visibleToUser();
        drawableWithAnimatedVisibilityChange.setVisible(bl4, false, bl2);
    }

    public abstract BaseProgressIndicatorSpec createSpec(Context var1, AttributeSet var2);

    public Drawable getCurrentDrawable() {
        boolean bl2 = this.isIndeterminate();
        Drawable drawable2 = bl2 ? this.getIndeterminateDrawable() : this.getProgressDrawable();
        return drawable2;
    }

    public int getHideAnimationBehavior() {
        return this.spec.hideAnimationBehavior;
    }

    public IndeterminateDrawable getIndeterminateDrawable() {
        return (IndeterminateDrawable)super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.spec.indicatorColors;
    }

    public int getIndicatorTrackGapSize() {
        return this.spec.indicatorTrackGapSize;
    }

    public DeterminateDrawable getProgressDrawable() {
        return (DeterminateDrawable)super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.spec.showAnimationBehavior;
    }

    public int getTrackColor() {
        return this.spec.trackColor;
    }

    public int getTrackCornerRadius() {
        return this.spec.trackCornerRadius;
    }

    public int getTrackThickness() {
        return this.spec.trackThickness;
    }

    public void hide() {
        int n3 = this.getVisibility();
        if (n3 != 0) {
            Runnable runnable2 = this.delayedShow;
            this.removeCallbacks(runnable2);
            return;
        }
        Runnable runnable3 = this.delayedHide;
        this.removeCallbacks(runnable3);
        long l2 = SystemClock.uptimeMillis();
        long l3 = this.lastShowStartTime;
        int n4 = this.minHideDelay;
        long l4 = n4;
        long l7 = (l2 -= l3) - l4;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 >= 0) {
            this.delayedHide.run();
            return;
        }
        Runnable runnable4 = this.delayedHide;
        long l12 = (long)n4 - l2;
        this.postDelayed(runnable4, l12);
    }

    public void invalidate() {
        super.invalidate();
        Drawable drawable2 = this.getCurrentDrawable();
        if (drawable2 != null) {
            drawable2 = this.getCurrentDrawable();
            drawable2.invalidateSelf();
        }
    }

    public boolean isEffectivelyVisible() {
        BaseProgressIndicator baseProgressIndicator = this;
        while (true) {
            boolean bl2 = baseProgressIndicator.getVisibility();
            boolean bl3 = false;
            if (bl2) {
                return false;
            }
            baseProgressIndicator = baseProgressIndicator.getParent();
            bl2 = true;
            if (baseProgressIndicator == null) {
                int n3 = this.getWindowVisibility();
                if (n3 == 0) {
                    bl3 = true;
                }
                return bl3;
            }
            bl3 = baseProgressIndicator instanceof View;
            if (!bl3) {
                return bl2;
            }
            baseProgressIndicator = (View)baseProgressIndicator;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.registerAnimationCallbacks();
        boolean bl2 = this.visibleToUser();
        if (bl2) {
            this.internalShow();
        }
    }

    public void onDetachedFromWindow() {
        Runnable runnable2 = this.delayedHide;
        this.removeCallbacks(runnable2);
        runnable2 = this.delayedShow;
        this.removeCallbacks(runnable2);
        ((DrawableWithAnimatedVisibilityChange)this.getCurrentDrawable()).hideNow();
        this.unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDraw(Canvas var1_1) {
        synchronized (this) {
            block8: {
                try {
                    var2_3 = var1_1.save();
                    var3_4 = this.getPaddingLeft();
                    if (var3_4 != 0 || (var3_4 = this.getPaddingTop()) != 0) {
                    }
                    ** GOTO lbl15
                }
                catch (Throwable var1_2) {
                    break block8;
                }
                var3_4 = this.getPaddingLeft();
                var4_5 = var3_4;
                {
                    var5_6 = this.getPaddingTop();
                }
                var6_7 = var5_6;
                {
                    var1_1.translate(var4_5, var6_7);
lbl15:
                    // 2 sources

                    if ((var3_4 = this.getPaddingRight()) == 0 && (var3_4 = this.getPaddingBottom()) == 0) ** GOTO lbl26
                    var3_4 = this.getWidth();
                    var5_6 = this.getPaddingLeft();
                    var7_8 = this.getPaddingRight();
                    var3_4 -= (var5_6 += var7_8);
                }
                {
                    var5_6 = this.getHeight();
                    var7_8 = this.getPaddingTop();
                    var8_9 = this.getPaddingBottom();
                    var7_8 = 0;
                }
                {
                    var1_1.clipRect(0, 0, var3_4, var5_6 -= (var7_8 += var8_9));
lbl26:
                    // 2 sources

                    var9_10 = this.getCurrentDrawable();
                    var9_10.draw(var1_1);
                    var1_1.restoreToCount(var2_3);
                    return;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onMeasure(int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                DrawingDelegate drawingDelegate;
                block8: {
                    try {
                        drawingDelegate = this.getCurrentDrawingDelegate();
                        if (drawingDelegate != null) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    return;
                }
                int n7 = drawingDelegate.getPreferredWidth();
                if (n7 < 0) {
                    n7 = this.getSuggestedMinimumWidth();
                    n3 = View.getDefaultSize((int)n7, (int)n3);
                } else {
                    n3 = drawingDelegate.getPreferredWidth();
                    n7 = this.getPaddingLeft();
                    n3 += n7;
                    n7 = this.getPaddingRight();
                    n3 += n7;
                }
                n7 = drawingDelegate.getPreferredHeight();
                if (n7 < 0) {
                    int n8 = this.getSuggestedMinimumHeight();
                    n4 = View.getDefaultSize((int)n8, (int)n4);
                } else {
                    n4 = drawingDelegate.getPreferredHeight();
                    int n10 = this.getPaddingTop();
                    n4 += n10;
                    n10 = this.getPaddingBottom();
                    n4 += n10;
                }
                this.setMeasuredDimension(n3, n4);
                return;
            }
            throw throwable2;
        }
    }

    public void onVisibilityChanged(View view, int n3) {
        boolean bl2;
        super.onVisibilityChanged(view, n3);
        if (n3 == 0) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        this.applyNewVisibility(bl2);
    }

    public void onWindowVisibilityChanged(int n3) {
        super.onWindowVisibilityChanged(n3);
        this.applyNewVisibility(false);
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.animatorDurationScaleProvider = animatorDurationScaleProvider;
        Drawable drawable2 = this.getProgressDrawable();
        if (drawable2 != null) {
            drawable2 = this.getProgressDrawable();
            drawable2.animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
        if ((drawable2 = this.getIndeterminateDrawable()) != null) {
            drawable2 = this.getIndeterminateDrawable();
            drawable2.animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int n3) {
        this.spec.hideAnimationBehavior = n3;
        this.invalidate();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setIndeterminate(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    boolean bl3;
                    Object object;
                    block7: {
                        boolean bl4;
                        block6: {
                            try {
                                bl4 = this.isIndeterminate();
                                if (bl2 != bl4) break block6;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        Drawable drawable2 = this.getCurrentDrawable();
                        drawable2 = (DrawableWithAnimatedVisibilityChange)drawable2;
                        if (drawable2 != null) {
                            drawable2.hideNow();
                        }
                        super.setIndeterminate(bl2);
                        object = this.getCurrentDrawable();
                        object = (DrawableWithAnimatedVisibilityChange)((Object)object);
                        bl4 = false;
                        drawable2 = null;
                        if (object == null) break block7;
                        bl3 = this.visibleToUser();
                        ((DrawableWithAnimatedVisibilityChange)((Object)object)).setVisible(bl3, false, false);
                    }
                    if (!(bl3 = object instanceof IndeterminateDrawable)) break block8;
                    bl3 = this.visibleToUser();
                    if (!bl3) break block8;
                    object = (IndeterminateDrawable)((Object)object);
                    object = ((IndeterminateDrawable)((Object)object)).getAnimatorDelegate();
                    ((IndeterminateAnimatorDelegate)object).startAnimator();
                    break block9;
                }
                this.isIndeterminateModeChangeRequested = false;
                return;
            }
            throw throwable2;
        }
    }

    public void setIndeterminateDrawable(Drawable object) {
        if (object == null) {
            super.setIndeterminateDrawable(null);
            return;
        }
        boolean bl2 = object instanceof IndeterminateDrawable;
        if (bl2) {
            ((DrawableWithAnimatedVisibilityChange)((Object)object)).hideNow();
            super.setIndeterminateDrawable(object);
            return;
        }
        object = new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        throw object;
    }

    public void setIndicatorColor(int ... object) {
        Object object2;
        int n3 = ((int[])object).length;
        if (n3 == 0) {
            int n4 = 1;
            object = new int[n4];
            object2 = this.getContext();
            int n7 = R$attr.colorPrimary;
            int n8 = -1;
            n3 = MaterialColors.getColor((Context)object2, n7, n8);
            n7 = 0;
            object[0] = n3;
        }
        if ((n3 = (int)(Arrays.equals(object2 = this.getIndicatorColor(), (int[])object) ? 1 : 0)) == 0) {
            object2 = this.spec;
            object2.indicatorColors = object;
            object = this.getIndeterminateDrawable().getAnimatorDelegate();
            ((IndeterminateAnimatorDelegate)object).invalidateSpecValues();
            this.invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int n4 = baseProgressIndicatorSpec.indicatorTrackGapSize;
        if (n4 != n3) {
            baseProgressIndicatorSpec.indicatorTrackGapSize = n3;
            baseProgressIndicatorSpec.validateSpec();
            this.invalidate();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setProgress(int n3) {
        synchronized (this) {
            boolean bl2 = this.isIndeterminate();
            if (bl2) {
                return;
            }
            bl2 = false;
            this.setProgressCompat(n3, false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setProgressCompat(int n3, boolean bl2) {
        Drawable drawable2;
        boolean bl3 = this.isIndeterminate();
        if (!bl3) {
            super.setProgress(n3);
            Drawable drawable3 = this.getProgressDrawable();
            if (drawable3 == null) return;
            if (bl2) return;
            drawable3 = this.getProgressDrawable();
            drawable3.jumpToCurrentState();
            return;
        }
        Drawable drawable4 = this.getProgressDrawable();
        if (drawable4 == null) return;
        this.storedProgress = n3;
        this.storedProgressAnimated = bl2;
        float f5 = Float.MIN_VALUE;
        this.isIndeterminateModeChangeRequested = true;
        Object object = this.getIndeterminateDrawable();
        n3 = (int)(object.isVisible() ? 1 : 0);
        if (n3 != 0) {
            object = this.animatorDurationScaleProvider;
            drawable2 = this.getContext().getContentResolver();
            f5 = ((AnimatorDurationScaleProvider)object).getSystemAnimatorDurationScale((ContentResolver)drawable2);
            bl2 = false;
            drawable2 = null;
            float f6 = f5 - 0.0f;
            n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n3 != 0) {
                object = this.getIndeterminateDrawable().getAnimatorDelegate();
                ((IndeterminateAnimatorDelegate)object).requestCancelAnimatorAfterCurrentCycle();
                return;
            }
        }
        object = this.switchIndeterminateModeCallback;
        drawable2 = this.getIndeterminateDrawable();
        ((Mj)object).onAnimationEnd(drawable2);
    }

    public void setProgressDrawable(Drawable object) {
        if (object == null) {
            super.setProgressDrawable(null);
            return;
        }
        boolean bl2 = object instanceof DeterminateDrawable;
        if (bl2) {
            object = (DeterminateDrawable)((Object)object);
            ((DeterminateDrawable)((Object)object)).hideNow();
            super.setProgressDrawable((Drawable)object);
            float f5 = this.getProgress();
            float f6 = this.getMax();
            ((DeterminateDrawable)((Object)object)).setLevelByFraction(f5 /= f6);
            return;
        }
        object = new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        throw object;
    }

    public void setShowAnimationBehavior(int n3) {
        this.spec.showAnimationBehavior = n3;
        this.invalidate();
    }

    public void setTrackColor(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int n4 = baseProgressIndicatorSpec.trackColor;
        if (n4 != n3) {
            baseProgressIndicatorSpec.trackColor = n3;
            this.invalidate();
        }
    }

    public void setTrackCornerRadius(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int n4 = baseProgressIndicatorSpec.trackCornerRadius;
        if (n4 != n3) {
            n4 = baseProgressIndicatorSpec.trackThickness / 2;
            baseProgressIndicatorSpec.trackCornerRadius = n3 = Math.min(n3, n4);
            this.invalidate();
        }
    }

    public void setTrackThickness(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int n4 = baseProgressIndicatorSpec.trackThickness;
        if (n4 != n3) {
            baseProgressIndicatorSpec.trackThickness = n3;
            this.requestLayout();
        }
    }

    public void setVisibilityAfterHide(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 4) && n3 != (n4 = 8)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
            throw illegalArgumentException;
        }
        this.visibilityAfterHide = n3;
    }

    public void show() {
        int n3 = this.showDelay;
        if (n3 > 0) {
            Runnable runnable2 = this.delayedShow;
            this.removeCallbacks(runnable2);
            runnable2 = this.delayedShow;
            int n4 = this.showDelay;
            long l2 = n4;
            this.postDelayed(runnable2, l2);
        } else {
            Runnable runnable3 = this.delayedShow;
            runnable3.run();
        }
    }

    public boolean visibleToUser() {
        boolean bl2 = this.isAttachedToWindow();
        bl2 = bl2 && !(bl2 = this.getWindowVisibility()) && (bl2 = this.isEffectivelyVisible());
        return bl2;
    }
}

