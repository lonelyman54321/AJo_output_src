/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.widget.FrameLayout
 *  android.widget.ScrollView
 */
package in.juspay.hypersdk.mystique;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import in.juspay.hypersdk.mystique.AccordionLayout$1;

public class AccordionLayout
extends FrameLayout {
    private static final int COLLAPSE = 0;
    private static final int EXPAND = 1;
    private float alphaDelta;
    private int animationDuration;
    private ValueAnimator animator;
    private Context context;
    private float delta;
    private float parallaxDelta;
    private int parentScrollViewId;
    private boolean postLayout;
    private float target;

    public AccordionLayout(Context context) {
        super(context);
        float f5;
        this.delta = f5 = 1.0f;
        this.target = f5;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = f5;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        this.delta = f5 = 1.0f;
        this.target = f5;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = f5;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        this.delta = f5 = 1.0f;
        this.target = f5;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = f5;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        float f5;
        this.delta = f5 = 1.0f;
        this.target = f5;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = f5;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public static /* synthetic */ float access$002(AccordionLayout accordionLayout, float f5) {
        accordionLayout.delta = f5;
        return f5;
    }

    public static /* synthetic */ boolean access$100(AccordionLayout accordionLayout) {
        return accordionLayout.postLayout;
    }

    public static /* synthetic */ void access$200(AccordionLayout accordionLayout) {
        accordionLayout.scrollParent();
    }

    private int getRelativeTop(View view, ScrollView scrollView) {
        boolean bl2;
        ViewParent viewParent = view.getParent();
        if (viewParent != scrollView && (bl2 = viewParent instanceof View)) {
            int n3 = view.getTop();
            viewParent = (View)viewParent;
            int n4 = this.getRelativeTop((View)viewParent, scrollView);
            return n3 + n4;
        }
        return view.getTop();
    }

    private void scrollParent() {
        float f5 = this.target;
        int n3 = 1065353216;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            object = this.parentScrollViewId;
            n3 = -1;
            f6 = 0.0f / 0.0f;
            if (object != n3) {
                Context context = this.getContext();
                object = context instanceof Activity;
                if (object == false) {
                    return;
                }
                context = (Activity)this.getContext();
                n3 = this.parentScrollViewId;
                if ((context = (ScrollView)context.findViewById(n3)) == null) {
                    return;
                }
                n3 = context.getScrollY();
                int n4 = context.getHeight() + n3;
                int n7 = this.getRelativeTop((View)this, (ScrollView)context);
                int n8 = this.getHeight() + n7;
                if (n7 < n3 || n8 > n4) {
                    n7 = n7 < n3 ? (n7 -= n3) : n8 - n4;
                    n3 = context.getScrollY() + n7;
                    n4 = 0;
                    context.scrollTo(0, n3);
                }
            }
        }
    }

    public void onMeasure(int n3, int n4) {
        View view;
        float f5;
        float f6;
        int n7;
        super.onMeasure(n3, n4);
        n3 = this.getMeasuredHeight();
        float f7 = this.delta;
        float f8 = n3;
        n4 = (int)(f7 *= f8);
        int n8 = 0;
        f8 = 0.0f;
        if (n4 < 0) {
            n4 = 0;
            f7 = 0.0f;
        }
        if (n4 == 0 && (n7 = (f6 = (f5 = this.target) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == 0) {
            n7 = 8;
            f5 = 1.1E-44f;
        } else {
            n7 = 0;
            f5 = 0.0f;
            view = null;
        }
        this.setVisibility(n7);
        while (n8 < (n7 = this.getChildCount())) {
            view = this.getChildAt(n8);
            float f11 = n4 - n3;
            float f12 = this.parallaxDelta;
            int n10 = (int)(f11 * f12);
            f11 = n10;
            view.setTranslationY(f11);
            f11 = this.alphaDelta;
            float f14 = f11 - 0.0f;
            float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (f15 != false) {
                float f16;
                f12 = this.delta * f11;
                view.setAlpha(f12);
                f11 = this.target;
                f15 = 1065353216;
                f12 = 1.0f;
                n10 = (int)(f11 == f12 ? 0 : (f11 > f12 ? 1 : -1));
                if (n10 == 0 && (n10 = (int)((f16 = (f11 = this.delta) - f12) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1))) == 0) {
                    view.setAlpha(f12);
                }
            }
            ++n8;
        }
        n3 = this.getMeasuredWidth();
        this.setMeasuredDimension(n3, n4);
        this.postLayout = true;
    }

    public void setDefaultExpand(boolean bl2) {
        float f5;
        if (bl2) {
            int n3 = 1065353216;
            f5 = 1.0f;
        } else {
            boolean bl3 = false;
            f5 = 0.0f;
        }
        this.target = f5;
        this.delta = f5;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 == false) {
            int n4 = 8;
            f5 = 1.1E-44f;
            this.setVisibility(n4);
        }
    }

    public void setExpand(boolean bl2) {
        Thread thread2;
        float[] fArray;
        float f5;
        int n3;
        AccordionLayout$1 accordionLayout$1 = null;
        int n4 = 0;
        float f6 = 0.0f;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = null;
        int n7 = 1065353216;
        float f7 = 1.0f;
        if (bl2) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = 0;
            f5 = 0.0f;
            fArray = null;
        }
        float f8 = this.target;
        float f11 = f8 == f5 ? 0 : (f8 > f5 ? 1 : -1);
        if (f11 == false) {
            return;
        }
        this.target = f5;
        Thread thread3 = Looper.getMainLooper().getThread();
        if (thread3 == (thread2 = Thread.currentThread())) {
            float f12;
            float f14;
            float f15;
            float f16;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if ((f16 = (f15 = (f14 = this.target) - f7) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) == false) {
                this.setVisibility(0);
            }
            if ((n4 = (f12 = (f5 = (f14 = this.target) - (f7 = this.delta)) - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0) {
                f5 = f7 - f14;
            }
            f6 = this.animationDuration;
            n4 = (int)(f5 * f6);
            n3 = 2;
            f5 = 2.8E-45f;
            fArray = new float[n3];
            fArray[0] = f7;
            n7 = 1;
            f7 = Float.MIN_VALUE;
            fArray[n7] = f14;
            this.animator = valueAnimator = ValueAnimator.ofFloat((float[])fArray);
            long l2 = n4;
            valueAnimator.setDuration(l2);
            valueAnimator = this.animator;
            accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            valueAnimator.setInterpolator((TimeInterpolator)accelerateDecelerateInterpolator);
            this.postLayout = false;
            valueAnimator = this.animator;
            accordionLayout$1 = new AccordionLayout$1(this);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)accordionLayout$1);
            valueAnimator = this.animator;
            valueAnimator.start();
        } else if (bl2) {
            this.setVisibility(0);
            this.delta = f5;
            this.scrollParent();
        } else {
            int n8 = 8;
            float f17 = 1.1E-44f;
            this.setVisibility(n8);
        }
    }

    public void setExpandAlpha(float f5) {
        this.alphaDelta = f5;
    }

    public void setExpandDuration(int n3) {
        this.animationDuration = n3;
    }

    public void setExpandParallax(float f5) {
        this.parallaxDelta = f5;
    }

    public void setScrollParent(int n3) {
        this.parentScrollViewId = n3;
    }
}

