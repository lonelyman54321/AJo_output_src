/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewAnimationUtils
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.circularreveal.CircularRevealWidget$CircularRevealScrimColorProperty;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.google.android.material.transformation.FabTransformationBehavior$1;
import com.google.android.material.transformation.FabTransformationBehavior$2;
import com.google.android.material.transformation.FabTransformationBehavior$3;
import com.google.android.material.transformation.FabTransformationBehavior$4;
import com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec;
import com.google.android.material.transformation.TransformationChildCard;
import com.google.android.material.transformation.TransformationChildLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public abstract class FabTransformationBehavior
extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    public FabTransformationBehavior() {
        Object object;
        this.tmpRect = object = new Rect();
        this.tmpRectF1 = object;
        super();
        this.tmpRectF2 = object;
        object = new int[2];
        this.tmpArray = (int[])object;
    }

    public FabTransformationBehavior(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        super();
        this.tmpRect = object;
        super();
        this.tmpRectF1 = object;
        super();
        this.tmpRectF2 = object;
        object = new int[2];
        this.tmpArray = (int[])object;
    }

    private ViewGroup calculateChildContentContainer(View view) {
        int n3 = R$id.mtrl_child_content_container;
        View view2 = view.findViewById(n3);
        if (view2 != null) {
            return this.toViewGroupOrNull(view2);
        }
        n3 = view instanceof TransformationChildLayout;
        if (n3 == 0 && (n3 = view instanceof TransformationChildCard) == 0) {
            return this.toViewGroupOrNull(view);
        }
        view = ((ViewGroup)view).getChildAt(0);
        return this.toViewGroupOrNull(view);
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(View view, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, MotionTiming motionTiming, MotionTiming motionTiming2, float f5, float f6, float f7, float f8, RectF rectF) {
        float f11 = this.calculateValueOfAnimationAtEndOfExpansion(fabTransformationBehavior$FabTransformationSpec, motionTiming, f5, f7);
        float f12 = this.calculateValueOfAnimationAtEndOfExpansion(fabTransformationBehavior$FabTransformationSpec, motionTiming2, f6, f8);
        motionTiming2 = this.tmpRect;
        view.getWindowVisibleDisplayFrame((Rect)motionTiming2);
        RectF rectF2 = this.tmpRectF1;
        rectF2.set((Rect)motionTiming2);
        motionTiming2 = this.tmpRectF2;
        this.calculateWindowBounds(view, (RectF)motionTiming2);
        motionTiming2.offset(f11, f12);
        motionTiming2.intersect(rectF2);
        rectF.set((RectF)motionTiming2);
    }

    private void calculateDependencyWindowBounds(View view, RectF rectF) {
        this.calculateWindowBounds(view, rectF);
        float f5 = this.dependencyOriginalTranslationX;
        float f6 = this.dependencyOriginalTranslationY;
        rectF.offset(f5, f6);
    }

    private Pair calculateMotionTiming(float f5, float f6, boolean bl2, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec) {
        String string2;
        Object object;
        MotionTiming motionTiming;
        float f7;
        float f8 = f5 - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 != false && (object2 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false) {
            float f11;
            float f12;
            if (bl2 && (f12 = (f11 = f6 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0 || !bl2 && object2 > 0) {
                motionTiming = fabTransformationBehavior$FabTransformationSpec.timings.getTiming("translationXCurveUpwards");
                object = fabTransformationBehavior$FabTransformationSpec.timings;
                string2 = "translationYCurveUpwards";
                object = ((MotionSpec)object).getTiming(string2);
            } else {
                motionTiming = fabTransformationBehavior$FabTransformationSpec.timings.getTiming("translationXCurveDownwards");
                object = fabTransformationBehavior$FabTransformationSpec.timings;
                string2 = "translationYCurveDownwards";
                object = ((MotionSpec)object).getTiming(string2);
            }
        } else {
            motionTiming = fabTransformationBehavior$FabTransformationSpec.timings.getTiming("translationXLinear");
            object = fabTransformationBehavior$FabTransformationSpec.timings;
            string2 = "translationYLinear";
            object = ((MotionSpec)object).getTiming(string2);
        }
        string2 = new Pair((Object)motionTiming, object);
        return string2;
    }

    private float calculateRevealCenterX(View view, View view2, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        this.calculateDependencyWindowBounds(view, rectF);
        this.calculateWindowBounds(view2, rectF2);
        float f5 = -this.calculateTranslationX(view, view2, positioning);
        rectF2.offset(f5, 0.0f);
        f5 = rectF.centerX();
        float f6 = rectF2.left;
        return f5 - f6;
    }

    private float calculateRevealCenterY(View view, View view2, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        this.calculateDependencyWindowBounds(view, rectF);
        this.calculateWindowBounds(view2, rectF2);
        float f5 = -this.calculateTranslationY(view, view2, positioning);
        rectF2.offset(0.0f, f5);
        f5 = rectF.centerY();
        float f6 = rectF2.top;
        return f5 - f6;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float calculateTranslationX(View view, View view2, Positioning positioning) {
        float f5;
        float f6;
        block3: {
            block4: {
                RectF rectF;
                RectF rectF2;
                block0: {
                    block1: {
                        block2: {
                            rectF2 = this.tmpRectF1;
                            rectF = this.tmpRectF2;
                            this.calculateDependencyWindowBounds(view, rectF2);
                            this.calculateWindowBounds(view2, rectF);
                            int n3 = positioning.gravity & 7;
                            int n4 = 1;
                            f6 = Float.MIN_VALUE;
                            if (n3 == n4) break block0;
                            n4 = 3;
                            f6 = 4.2E-45f;
                            if (n3 == n4) break block1;
                            n4 = 5;
                            f6 = 7.0E-45f;
                            if (n3 == n4) break block2;
                            n3 = 0;
                            f5 = 0.0f;
                            view = null;
                            break block3;
                        }
                        f5 = rectF.right;
                        f6 = rectF2.right;
                        break block4;
                    }
                    f5 = rectF.left;
                    f6 = rectF2.left;
                    break block4;
                }
                f5 = rectF.centerX();
                f6 = rectF2.centerX();
            }
            f5 -= f6;
        }
        f6 = positioning.xAdjustment;
        return f5 + f6;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float calculateTranslationY(View view, View view2, Positioning positioning) {
        float f5;
        float f6;
        block3: {
            block4: {
                RectF rectF;
                RectF rectF2;
                block0: {
                    block1: {
                        block2: {
                            rectF2 = this.tmpRectF1;
                            rectF = this.tmpRectF2;
                            this.calculateDependencyWindowBounds(view, rectF2);
                            this.calculateWindowBounds(view2, rectF);
                            int n3 = positioning.gravity & 0x70;
                            int n4 = 16;
                            f6 = 2.2E-44f;
                            if (n3 == n4) break block0;
                            n4 = 48;
                            f6 = 6.7E-44f;
                            if (n3 == n4) break block1;
                            n4 = 80;
                            f6 = 1.12E-43f;
                            if (n3 == n4) break block2;
                            n3 = 0;
                            f5 = 0.0f;
                            view = null;
                            break block3;
                        }
                        f5 = rectF.bottom;
                        f6 = rectF2.bottom;
                        break block4;
                    }
                    f5 = rectF.top;
                    f6 = rectF2.top;
                    break block4;
                }
                f5 = rectF.centerY();
                f6 = rectF2.centerY();
            }
            f5 -= f6;
        }
        f6 = positioning.yAdjustment;
        return f5 + f6;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(FabTransformationBehavior$FabTransformationSpec object, MotionTiming motionTiming, float f5, float f6) {
        long l2 = motionTiming.getDelay();
        long l3 = motionTiming.getDuration();
        object = ((FabTransformationBehavior$FabTransformationSpec)object).timings.getTiming("expansion");
        long l4 = ((MotionTiming)object).getDelay();
        float f7 = ((MotionTiming)object).getDuration() + l4 + (long)17 - l2;
        float f8 = l3;
        f7 /= f8;
        f7 = motionTiming.getInterpolator().getInterpolation(f7);
        return AnimationUtils.lerp(f5, f6, f7);
    }

    private void calculateWindowBounds(View view, RectF rectF) {
        float f5 = view.getWidth();
        float f6 = view.getHeight();
        rectF.set(0.0f, 0.0f, f5, f6);
        int[] nArray = this.tmpArray;
        view.getLocationInWindow(nArray);
        f6 = nArray[0];
        f5 = nArray[1];
        rectF.offsetTo(f6, f5);
        f5 = (int)(-view.getTranslationX());
        float f7 = (int)(-view.getTranslationY());
        rectF.offset(f5, f7);
    }

    private void createChildrenFadeAnimation(View view, View view2, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, List list, List list2) {
        view = null;
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        int n4 = view2 instanceof ViewGroup;
        if (n4 == 0) {
            return;
        }
        n4 = view2 instanceof CircularRevealWidget;
        if (n4 != 0 && (n4 = CircularRevealHelper.STRATEGY) == 0) {
            return;
        }
        if ((view2 = this.calculateChildContentContainer(view2)) == null) {
            return;
        }
        n4 = 0;
        if (bl2) {
            Object object;
            Property property;
            if (!bl3) {
                property = ChildrenAlphaProperty.CHILDREN_ALPHA;
                object = Float.valueOf(0.0f);
                property.set((Object)view2, object);
            }
            property = ChildrenAlphaProperty.CHILDREN_ALPHA;
            object = new float[n3];
            n3 = 1065353216;
            f5 = 1.0f;
            object[0] = f5;
            view = ObjectAnimator.ofFloat((Object)view2, (Property)property, (float[])object);
        } else {
            Property property = ChildrenAlphaProperty.CHILDREN_ALPHA;
            float[] fArray = new float[n3];
            fArray[0] = 0.0f;
            view = ObjectAnimator.ofFloat((Object)view2, (Property)property, (float[])fArray);
        }
        fabTransformationBehavior$FabTransformationSpec.timings.getTiming("contentFade").apply((Animator)view);
        list.add(view);
    }

    private void createColorAnimation(View object, View object2, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, List list, List list2) {
        int n3 = object2 instanceof CircularRevealWidget;
        if (n3 == 0) {
            return;
        }
        object2 = (CircularRevealWidget)object2;
        int n4 = this.getBackgroundTint((View)object);
        n3 = 0xFFFFFF & n4;
        if (bl2) {
            if (!bl3) {
                object2.setCircularRevealScrimColor(n4);
            }
            object = CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR;
            int[] nArray = new int[]{n3};
            object = ObjectAnimator.ofInt((Object)object2, (Property)object, (int[])nArray);
        } else {
            Property property = CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR;
            object = new int[]{n4};
            object = ObjectAnimator.ofInt((Object)object2, (Property)property, (int[])object);
        }
        object2 = ArgbEvaluatorCompat.getInstance();
        object.setEvaluator((TypeEvaluator)object2);
        fabTransformationBehavior$FabTransformationSpec.timings.getTiming("color").apply((Animator)object);
        list.add(object);
    }

    private void createDependencyTranslationAnimation(View view, View view2, boolean bl2, FabTransformationBehavior$FabTransformationSpec object, List list) {
        int n3 = 1;
        Positioning positioning = ((FabTransformationBehavior$FabTransformationSpec)object).positioning;
        float f5 = this.calculateTranslationX(view, view2, positioning);
        Object object2 = ((FabTransformationBehavior$FabTransformationSpec)object).positioning;
        float f6 = this.calculateTranslationY(view, view2, (Positioning)object2);
        object = this.calculateMotionTiming(f5, f6, bl2, (FabTransformationBehavior$FabTransformationSpec)object);
        object2 = (MotionTiming)((Pair)object).first;
        object = (MotionTiming)((Pair)object).second;
        Property property = View.TRANSLATION_X;
        if (!bl2) {
            f5 = this.dependencyOriginalTranslationX;
        }
        float[] fArray = new float[n3];
        fArray[0] = f5;
        positioning = ObjectAnimator.ofFloat((Object)view, (Property)property, (float[])fArray);
        property = View.TRANSLATION_Y;
        if (!bl2) {
            f6 = this.dependencyOriginalTranslationY;
        }
        float[] fArray2 = new float[n3];
        fArray2[0] = f6;
        view = ObjectAnimator.ofFloat((Object)view, (Property)property, (float[])fArray2);
        ((MotionTiming)object2).apply((Animator)positioning);
        ((MotionTiming)object).apply((Animator)view);
        list.add(positioning);
        list.add(view);
    }

    private void createElevationAnimation(View view, View view2, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, List list, List list2) {
        int n3 = 1;
        float f5 = ViewCompat$c.e(view2);
        float f6 = ViewCompat$c.e(view);
        f5 -= f6;
        if (bl2) {
            if (!bl3) {
                f6 = -f5;
                view2.setTranslationZ(f6);
            }
            view = View.TRANSLATION_Z;
            float[] fArray = new float[n3];
            bl3 = false;
            Object var12_12 = null;
            fArray[0] = 0.0f;
            view = ObjectAnimator.ofFloat((Object)view2, (Property)view, (float[])fArray);
        } else {
            view = View.TRANSLATION_Z;
            float f7 = -f5;
            float[] fArray = new float[n3];
            fArray[0] = f7;
            view = ObjectAnimator.ofFloat((Object)view2, (Property)view, (float[])fArray);
        }
        fabTransformationBehavior$FabTransformationSpec.timings.getTiming("elevation").apply((Animator)view);
        list.add(view);
    }

    private void createExpansionAnimation(View view, View view2, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, float f5, float f6, List list, List list2) {
        FabTransformationBehavior fabTransformationBehavior = this;
        Object object = view;
        FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec2 = fabTransformationBehavior$FabTransformationSpec;
        boolean bl4 = view2 instanceof CircularRevealWidget;
        if (!bl4) {
            return;
        }
        Object object2 = view2;
        object2 = (CircularRevealWidget)view2;
        Object object3 = fabTransformationBehavior$FabTransformationSpec.positioning;
        float f7 = this.calculateRevealCenterX(view, view2, (Positioning)object3);
        Object object4 = fabTransformationBehavior$FabTransformationSpec.positioning;
        float f8 = this.calculateRevealCenterY(view, view2, (Positioning)object4);
        object = (FloatingActionButton)view;
        object4 = this.tmpRect;
        object.getContentRect((Rect)object4);
        int n3 = this.tmpRect.width();
        float f11 = n3;
        float f12 = 2.0f;
        float f14 = f11 / f12;
        object = fabTransformationBehavior$FabTransformationSpec.timings;
        object4 = "expansion";
        MotionTiming motionTiming = object.getTiming((String)object4);
        if (bl2) {
            if (!bl3) {
                object = new CircularRevealWidget$RevealInfo(f7, f8, f14);
                object2.setRevealInfo((CircularRevealWidget$RevealInfo)object);
            }
            if (bl3) {
                object = object2.getRevealInfo();
                f14 = f11 = object.radius;
            }
            f12 = f7;
            float f15 = f5;
            f11 = MathUtils.distanceToFurthestCorner(f7, f8, 0.0f, 0.0f, f5, f6);
            fabTransformationBehavior$FabTransformationSpec2 = CircularRevealCompat.createCircularReveal((CircularRevealWidget)object2, f7, f8, f11);
            object = new FabTransformationBehavior$4(fabTransformationBehavior, (CircularRevealWidget)object2);
            fabTransformationBehavior$FabTransformationSpec2.addListener((Animator.AnimatorListener)object);
            long l2 = motionTiming.getDelay();
            int n4 = (int)f7;
            int n7 = (int)f8;
            object = this;
            object3 = view2;
            f15 = f14;
            this.createPreFillRadialExpansion(view2, l2, n4, n7, f14, list);
        } else {
            float f16 = object2.getRevealInfo().radius;
            Animator animator2 = CircularRevealCompat.createCircularReveal((CircularRevealWidget)object2, f7, f8, f14);
            long l3 = motionTiming.getDelay();
            int n8 = (int)f7;
            int n10 = (int)f8;
            object = this;
            object3 = view2;
            int n14 = n8;
            int n15 = n10;
            this.createPreFillRadialExpansion(view2, l3, n8, n10, f16, list);
            l3 = motionTiming.getDelay();
            long l4 = motionTiming.getDuration();
            long l7 = fabTransformationBehavior$FabTransformationSpec.timings.getTotalDuration();
            object = this;
            f8 = f14;
            this.createPostFillRadialExpansion(view2, l3, l4, l7, n8, n10, f14, list);
            fabTransformationBehavior$FabTransformationSpec2 = animator2;
        }
        motionTiming.apply((Animator)fabTransformationBehavior$FabTransformationSpec2);
        object = list;
        list.add(fabTransformationBehavior$FabTransformationSpec2);
        object = CircularRevealCompat.createCircularRevealListener((CircularRevealWidget)object2);
        object3 = list2;
        list2.add(object);
    }

    private void createIconFadeAnimation(View view, View object, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, List list, List list2) {
        boolean bl4 = object instanceof CircularRevealWidget;
        if (bl4 && (bl4 = view instanceof ImageView)) {
            Object object2;
            Property property;
            Object object3 = object;
            object3 = (CircularRevealWidget)object;
            if ((view = ((ImageView)view).getDrawable()) == null) {
                return;
            }
            view.mutate();
            int n3 = 255;
            if (bl2) {
                if (!bl3) {
                    view.setAlpha(n3);
                }
                property = DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT;
                bl3 = false;
                object2 = new int[]{0};
                property = ObjectAnimator.ofInt((Object)view, (Property)property, (int[])object2);
            } else {
                property = DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT;
                object2 = new int[]{n3};
                property = ObjectAnimator.ofInt((Object)view, (Property)property, (int[])object2);
            }
            object2 = new FabTransformationBehavior$2;
            object2(this, (View)object);
            property.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
            object = fabTransformationBehavior$FabTransformationSpec.timings;
            object2 = "iconFade";
            object.getTiming((String)object2).apply((Animator)property);
            list.add(property);
            object = new FabTransformationBehavior$3(this, (CircularRevealWidget)object3, (Drawable)view);
            list2.add(object);
        }
    }

    private void createPostFillRadialExpansion(View view, long l2, long l3, long l4, int n3, int n4, float f5, List list) {
        long l7 = (l2 += l3) - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            view = ViewAnimationUtils.createCircularReveal((View)view, (int)n3, (int)n4, (float)f5, (float)f5);
            view.setStartDelay(l2);
            view.setDuration(l4 -= l2);
            list.add(view);
        }
    }

    private void createPreFillRadialExpansion(View view, long l2, int n3, int n4, float f5, List list) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            view = ViewAnimationUtils.createCircularReveal((View)view, (int)n3, (int)n4, (float)f5, (float)f5);
            view.setStartDelay(l3);
            view.setDuration(l2);
            list.add(view);
        }
    }

    private void createTranslationAnimation(View view, View view2, boolean bl2, boolean bl3, FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        Object object;
        View view3 = view2;
        Object object2 = fabTransformationBehavior$FabTransformationSpec;
        List list3 = list;
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        Object object3 = fabTransformationBehavior$FabTransformationSpec.positioning;
        float f6 = this.calculateTranslationX(view, view2, (Positioning)object3);
        Object object4 = fabTransformationBehavior$FabTransformationSpec.positioning;
        float f7 = this.calculateTranslationY(view, view2, (Positioning)object4);
        object4 = this.calculateMotionTiming(f6, f7, bl2, fabTransformationBehavior$FabTransformationSpec);
        Object object5 = object = ((Pair)object4).first;
        object5 = (MotionTiming)object;
        Object object6 = object4 = ((Pair)object4).second;
        object6 = (MotionTiming)object4;
        if (bl2) {
            if (!bl3) {
                float f8 = -f6;
                view2.setTranslationX(f8);
                f8 = -f7;
                view2.setTranslationY(f8);
            }
            Object object7 = View.TRANSLATION_X;
            object4 = null;
            object = new float[n3];
            object[0] = 0.0f;
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view3, (Property)object7, (float[])object);
            object7 = View.TRANSLATION_Y;
            float[] fArray = new float[n3];
            fArray[0] = 0.0f;
            objectAnimator = ObjectAnimator.ofFloat((Object)view3, (Property)object7, (float[])fArray);
            f5 = -f6;
            f6 = -f7;
            object = null;
            view3 = view2;
            object7 = fabTransformationBehavior$FabTransformationSpec;
            object2 = object5;
            this.calculateChildVisibleBoundsAtEndOfExpansion(view2, fabTransformationBehavior$FabTransformationSpec, (MotionTiming)object5, (MotionTiming)object6, f5, f6, 0.0f, 0.0f, rectF);
        } else {
            Property property = View.TRANSLATION_X;
            float f11 = -f6;
            object3 = new float[n3];
            object3[0] = f11;
            objectAnimator2 = ObjectAnimator.ofFloat((Object)view2, (Property)property, (float[])object3);
            property = View.TRANSLATION_Y;
            f7 = -f7;
            object2 = new float[n3];
            object2[0] = f7;
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, (Property)property, (float[])object2);
        }
        ((MotionTiming)object5).apply((Animator)objectAnimator2);
        ((MotionTiming)object6).apply((Animator)objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int getBackgroundTint(View object) {
        WeakHashMap weakHashMap = ViewCompat.a;
        weakHashMap = ViewCompat$c.c(object);
        if (weakHashMap != null) {
            object = object.getDrawableState();
            int n3 = weakHashMap.getDefaultColor();
            return weakHashMap.getColorForState((int[])object, n3);
        }
        return 0;
    }

    private ViewGroup toViewGroupOrNull(View view) {
        boolean bl2 = view instanceof ViewGroup;
        if (bl2) {
            return (ViewGroup)view;
        }
        return null;
    }

    public boolean layoutDependsOn(CoordinatorLayout object, View view, View object2) {
        int n3;
        int n4 = view.getVisibility();
        if (n4 != (n3 = 8)) {
            int n7;
            n4 = object2 instanceof FloatingActionButton;
            n3 = 0;
            if (n4 != 0 && ((n4 = ((FloatingActionButton)(object2 = (FloatingActionButton)object2)).getExpandedComponentIdHint()) == 0 || n4 == (n7 = view.getId()))) {
                n3 = 1;
            }
            return n3 != 0;
        }
        object = new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        throw object;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
        int n3 = coordinatorLayout$e.h;
        if (n3 == 0) {
            coordinatorLayout$e.h = n3 = 80;
        }
    }

    public AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean bl2, boolean bl3) {
        FabTransformationBehavior fabTransformationBehavior = this;
        boolean bl4 = bl2;
        Object object = view2.getContext();
        FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec = this.onCreateMotionSpec((Context)object, bl2);
        if (bl2) {
            float f5;
            this.dependencyOriginalTranslationX = f5 = view.getTranslationX();
            this.dependencyOriginalTranslationY = f5 = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        object = this;
        Object object2 = view;
        this.createElevationAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, arrayList, arrayList2);
        Object object3 = fabTransformationBehavior.tmpRectF1;
        this.createTranslationAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, arrayList, arrayList2, (RectF)object3);
        float f6 = object3.width();
        float f7 = object3.height();
        this.createDependencyTranslationAnimation(view, view2, bl2, fabTransformationBehavior$FabTransformationSpec, arrayList);
        this.createIconFadeAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, arrayList, arrayList2);
        object3 = arrayList2;
        this.createExpansionAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, f6, f7, arrayList, arrayList2);
        this.createColorAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, arrayList, arrayList2);
        this.createChildrenFadeAnimation(view, view2, bl2, bl3, fabTransformationBehavior$FabTransformationSpec, arrayList, arrayList2);
        object = new AnimatorSet();
        AnimatorSetCompat.playTogether((AnimatorSet)object, arrayList);
        View view3 = view2;
        object2 = new FabTransformationBehavior$1(this, bl4, view2, view);
        object.addListener((Animator.AnimatorListener)object2);
        int n3 = arrayList2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            view3 = (Animator.AnimatorListener)arrayList2.get(i3);
            object.addListener((Animator.AnimatorListener)view3);
        }
        return object;
    }

    public abstract FabTransformationBehavior$FabTransformationSpec onCreateMotionSpec(Context var1, boolean var2);
}

