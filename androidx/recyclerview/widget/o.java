/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$y;

public class o
extends RecyclerView$x {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = 255;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;
    protected PointF mTargetVector;

    public o(Context context) {
        LinearInterpolator linearInterpolator;
        this.mLinearInterpolator = linearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = linearInterpolator;
        this.mHasCalculatedMillisPerPixel = false;
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        context = context.getResources().getDisplayMetrics();
        this.mDisplayMetrics = context;
    }

    private int clampApplyScroll(int n3, int n4) {
        if ((n3 *= (n4 = n3 - n4)) <= 0) {
            return 0;
        }
        return n4;
    }

    private float getSpeedPerPixel() {
        boolean bl2 = this.mHasCalculatedMillisPerPixel;
        if (!bl2) {
            float f5;
            DisplayMetrics displayMetrics = this.mDisplayMetrics;
            this.mMillisPerPixel = f5 = this.calculateSpeedPerPixel(displayMetrics);
            bl2 = true;
            f5 = Float.MIN_VALUE;
            this.mHasCalculatedMillisPerPixel = bl2;
        }
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int n3, int n4, int n7, int n8, int n10) {
        int n14 = -1;
        if (n10 != n14) {
            if (n10 != 0) {
                n3 = 1;
                if (n10 == n3) {
                    return n8 - n4;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                throw illegalArgumentException;
            }
            if ((n7 -= n3) > 0) {
                return n7;
            }
            if ((n8 -= n4) < 0) {
                return n8;
            }
            return 0;
        }
        return n7 - n3;
    }

    public int calculateDxToMakeVisible(View view, int n3) {
        int n4;
        RecyclerView$o recyclerView$o = this.getLayoutManager();
        if (recyclerView$o != null && (n4 = recyclerView$o.canScrollHorizontally()) != 0) {
            RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
            int n7 = recyclerView$o.getDecoratedLeft(view);
            int n8 = recyclerView$LayoutParams.leftMargin;
            int n10 = n7 - n8;
            int n14 = recyclerView$o.getDecoratedRight(view);
            n4 = recyclerView$LayoutParams.rightMargin;
            int n15 = n14 + n4;
            int n16 = recyclerView$o.getPaddingLeft();
            n14 = recyclerView$o.getWidth();
            int n17 = recyclerView$o.getPaddingRight();
            int n18 = n14 - n17;
            return this.calculateDtToFit(n10, n15, n16, n18, n3);
        }
        return 0;
    }

    public int calculateDyToMakeVisible(View view, int n3) {
        int n4;
        RecyclerView$o recyclerView$o = this.getLayoutManager();
        if (recyclerView$o != null && (n4 = recyclerView$o.canScrollVertically()) != 0) {
            RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
            int n7 = recyclerView$o.getDecoratedTop(view);
            int n8 = recyclerView$LayoutParams.topMargin;
            int n10 = n7 - n8;
            int n14 = recyclerView$o.getDecoratedBottom(view);
            n4 = recyclerView$LayoutParams.bottomMargin;
            int n15 = n14 + n4;
            int n16 = recyclerView$o.getPaddingTop();
            n14 = recyclerView$o.getHeight();
            int n17 = recyclerView$o.getPaddingBottom();
            int n18 = n14 - n17;
            return this.calculateDtToFit(n10, n15, n16, n18, n3);
        }
        return 0;
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float f5 = displayMetrics.densityDpi;
        return 25.0f / f5;
    }

    public int calculateTimeForDeceleration(int n3) {
        return (int)Math.ceil((double)this.calculateTimeForScrolling(n3) / 0.3356);
    }

    public int calculateTimeForScrolling(int n3) {
        float f5 = Math.abs(n3);
        float f6 = this.getSpeedPerPixel();
        return (int)Math.ceil(f5 * f6);
    }

    public int getHorizontalSnapPreference() {
        int n3;
        float f5;
        float f6;
        float f7;
        PointF pointF = this.mTargetVector;
        if (pointF != null && (f7 = (f6 = (f5 = pointF.x) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            float f8 = f5 - 0.0f;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n3 = -1;
                f5 = 0.0f / 0.0f;
            }
        } else {
            n3 = 0;
            f5 = 0.0f;
            pointF = null;
        }
        return n3;
    }

    public int getVerticalSnapPreference() {
        int n3;
        float f5;
        float f6;
        float f7;
        PointF pointF = this.mTargetVector;
        if (pointF != null && (f7 = (f6 = (f5 = pointF.y) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            float f8 = f5 - 0.0f;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 > 0) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n3 = -1;
                f5 = 0.0f / 0.0f;
            }
        } else {
            n3 = 0;
            f5 = 0.0f;
            pointF = null;
        }
        return n3;
    }

    public void onSeekTargetStep(int n3, int n4, RecyclerView$y recyclerView$y, RecyclerView$x$a recyclerView$x$a) {
        int n7 = this.getChildCount();
        if (n7 == 0) {
            this.stop();
            return;
        }
        n7 = this.mInterimTargetDx;
        this.mInterimTargetDx = n3 = this.clampApplyScroll(n7, n3);
        n3 = this.mInterimTargetDy;
        this.mInterimTargetDy = n3 = this.clampApplyScroll(n3, n4);
        n4 = this.mInterimTargetDx;
        if (n4 == 0 && n3 == 0) {
            this.updateActionForInterimTarget(recyclerView$x$a);
        }
    }

    public void onStart() {
    }

    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    public void onTargetFound(View view, RecyclerView$y recyclerView$y, RecyclerView$x$a recyclerView$x$a) {
        int n3 = this.getHorizontalSnapPreference();
        n3 = this.calculateDxToMakeVisible(view, n3);
        int n4 = this.getVerticalSnapPreference();
        int n7 = this.calculateDyToMakeVisible(view, n4);
        n4 = n3 * n3;
        int n8 = n7 * n7 + n4;
        double d2 = Math.sqrt(n8);
        n4 = (int)d2;
        if ((n4 = this.calculateTimeForDeceleration(n4)) > 0) {
            n3 = -n3;
            n7 = -n7;
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            recyclerView$x$a.b(n3, n7, (Interpolator)decelerateInterpolator, n4);
        }
    }

    public void updateActionForInterimTarget(RecyclerView$x$a recyclerView$x$a) {
        int n3 = this.getTargetPosition();
        PointF pointF = this.computeScrollVectorForPosition(n3);
        if (pointF != null) {
            float f5;
            float f6 = pointF.x;
            float f7 = 0.0f;
            LinearInterpolator linearInterpolator = null;
            float f8 = f6 - 0.0f;
            Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object != false || (object = (f5 = (f6 = pointF.y) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
                this.normalize(pointF);
                this.mTargetVector = pointF;
                f6 = pointF.x;
                f7 = 10000.0f;
                object = (int)(f6 * f7);
                this.mInterimTargetDx = (int)object;
                this.mInterimTargetDy = n3 = (int)(pointF.y * f7);
                n3 = this.calculateTimeForScrolling(10000);
                f6 = this.mInterimTargetDx;
                f7 = 1.2f;
                object = (int)(f6 * f7);
                int n4 = (int)((float)this.mInterimTargetDy * f7);
                n3 = (int)((float)n3 * f7);
                linearInterpolator = this.mLinearInterpolator;
                recyclerView$x$a.b((int)object, n4, (Interpolator)linearInterpolator, n3);
                return;
            }
        }
        recyclerView$x$a.d = n3 = this.getTargetPosition();
        this.stop();
    }
}

