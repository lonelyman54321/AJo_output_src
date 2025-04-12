/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.transition.ArcMotion
 *  android.transition.PathMotion
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionValues
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.platform.FadeModeEvaluator;
import com.google.android.material.transition.platform.FadeModeEvaluators;
import com.google.android.material.transition.platform.FitModeEvaluator;
import com.google.android.material.transition.platform.FitModeEvaluators;
import com.google.android.material.transition.platform.MaterialArcMotion;
import com.google.android.material.transition.platform.MaterialContainerTransform$1;
import com.google.android.material.transition.platform.MaterialContainerTransform$2;
import com.google.android.material.transition.platform.MaterialContainerTransform$ProgressThresholds;
import com.google.android.material.transition.platform.MaterialContainerTransform$ProgressThresholdsGroup;
import com.google.android.material.transition.platform.MaterialContainerTransform$TransitionDrawable;
import com.google.android.material.transition.platform.TransitionUtils;
import java.util.Map;
import java.util.WeakHashMap;

public final class MaterialContainerTransform
extends Transition {
    private static final MaterialContainerTransform$ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS;
    private static final MaterialContainerTransform$ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC;
    private static final MaterialContainerTransform$ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
    private static final MaterialContainerTransform$ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final String[] TRANSITION_PROPS;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private ShapeAppearanceModel endShapeAppearanceModel;
    private View endView;
    private int endViewId;
    private int fadeMode;
    private MaterialContainerTransform$ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private MaterialContainerTransform$ProgressThresholds scaleMaskProgressThresholds;
    private MaterialContainerTransform$ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private MaterialContainerTransform$ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private ShapeAppearanceModel startShapeAppearanceModel;
    private View startView;
    private int startViewId;
    private int transitionDirection;

    static {
        MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup;
        TRANSITION_PROPS = new String[]{PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds = new MaterialContainerTransform$ProgressThresholds(0.0f, 0.25f);
        float f5 = 1.0f;
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds2 = new MaterialContainerTransform$ProgressThresholds(0.0f, f5);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds3 = new MaterialContainerTransform$ProgressThresholds(0.0f, f5);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds4 = new MaterialContainerTransform$ProgressThresholds(0.0f, 0.75f);
        DEFAULT_ENTER_THRESHOLDS = materialContainerTransform$ProgressThresholdsGroup = new MaterialContainerTransform$ProgressThresholdsGroup(materialContainerTransform$ProgressThresholds, materialContainerTransform$ProgressThresholds2, materialContainerTransform$ProgressThresholds3, materialContainerTransform$ProgressThresholds4, null);
        float f6 = 0.6f;
        float f7 = 0.9f;
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds5 = new MaterialContainerTransform$ProgressThresholds(f6, f7);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds6 = new MaterialContainerTransform$ProgressThresholds(0.0f, f5);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds7 = new MaterialContainerTransform$ProgressThresholds(0.0f, f7);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds8 = new MaterialContainerTransform$ProgressThresholds(0.3f, f7);
        DEFAULT_RETURN_THRESHOLDS = materialContainerTransform$ProgressThresholdsGroup = new MaterialContainerTransform$ProgressThresholdsGroup(materialContainerTransform$ProgressThresholds5, materialContainerTransform$ProgressThresholds6, materialContainerTransform$ProgressThresholds7, materialContainerTransform$ProgressThresholds8, null);
        float f8 = 0.1f;
        materialContainerTransform$ProgressThresholds2 = new MaterialContainerTransform$ProgressThresholds(f8, 0.4f);
        materialContainerTransform$ProgressThresholds3 = new MaterialContainerTransform$ProgressThresholds(f8, f5);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds9 = new MaterialContainerTransform$ProgressThresholds(f8, f5);
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds10 = new MaterialContainerTransform$ProgressThresholds(f8, f7);
        DEFAULT_ENTER_THRESHOLDS_ARC = materialContainerTransform$ProgressThresholdsGroup = new MaterialContainerTransform$ProgressThresholdsGroup(materialContainerTransform$ProgressThresholds2, materialContainerTransform$ProgressThresholds3, materialContainerTransform$ProgressThresholds9, materialContainerTransform$ProgressThresholds10, null);
        materialContainerTransform$ProgressThresholds5 = new MaterialContainerTransform$ProgressThresholds(f6, f7);
        materialContainerTransform$ProgressThresholds6 = new MaterialContainerTransform$ProgressThresholds(0.0f, f7);
        materialContainerTransform$ProgressThresholds7 = new MaterialContainerTransform$ProgressThresholds(0.0f, f7);
        materialContainerTransform$ProgressThresholds8 = new MaterialContainerTransform$ProgressThresholds(0.2f, f7);
        DEFAULT_RETURN_THRESHOLDS_ARC = materialContainerTransform$ProgressThresholdsGroup = new MaterialContainerTransform$ProgressThresholdsGroup(materialContainerTransform$ProgressThresholds5, materialContainerTransform$ProgressThresholds6, materialContainerTransform$ProgressThresholds7, materialContainerTransform$ProgressThresholds8, null);
    }

    public MaterialContainerTransform() {
        int n3;
        boolean bl2 = false;
        float f5 = 0.0f;
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = 0x1020002;
        this.startViewId = n3 = -1;
        this.endViewId = n3;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 0x52000000;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        this.elevationShadowEnabled = bl2;
        this.startElevation = f5 = -1.0f;
        this.endElevation = f5;
    }

    public MaterialContainerTransform(Context context, boolean bl2) {
        int n3;
        boolean bl3 = false;
        float f5 = 0.0f;
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = 0x1020002;
        this.startViewId = n3 = -1;
        this.endViewId = n3;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 0x52000000;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        boolean bl4 = true;
        if (n3 >= n4) {
            bl3 = true;
            f5 = Float.MIN_VALUE;
        }
        this.elevationShadowEnabled = bl3;
        this.startElevation = f5 = -1.0f;
        this.endElevation = f5;
        this.maybeApplyThemeValues(context, bl2);
        this.appliedThemeValues = bl4;
    }

    public static /* synthetic */ boolean access$300(MaterialContainerTransform materialContainerTransform) {
        return materialContainerTransform.holdAtEndEnabled;
    }

    private MaterialContainerTransform$ProgressThresholdsGroup buildThresholdsGroup(boolean bl2) {
        boolean bl3;
        Object object = this.getPathMotion();
        boolean bl4 = object instanceof ArcMotion;
        if (!bl4 && !(bl3 = object instanceof MaterialArcMotion)) {
            object = DEFAULT_ENTER_THRESHOLDS;
            MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup = DEFAULT_RETURN_THRESHOLDS;
            return this.getThresholdsOrDefault(bl2, (MaterialContainerTransform$ProgressThresholdsGroup)object, materialContainerTransform$ProgressThresholdsGroup);
        }
        object = DEFAULT_ENTER_THRESHOLDS_ARC;
        MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup = DEFAULT_RETURN_THRESHOLDS_ARC;
        return this.getThresholdsOrDefault(bl2, (MaterialContainerTransform$ProgressThresholdsGroup)object, materialContainerTransform$ProgressThresholdsGroup);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f5, float f6) {
        if (view2 != null) {
            view = TransitionUtils.getLocationOnScreen(view2);
            view.offset(f5, f6);
            return view;
        }
        f5 = view.getWidth();
        float f7 = view.getHeight();
        view2 = new RectF(0.0f, 0.0f, f5, f7);
        return view2;
    }

    private static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.convertToRelativeCornerSizes(MaterialContainerTransform.getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    private static void captureValues(TransitionValues object, View object2, int n3, ShapeAppearanceModel shapeAppearanceModel) {
        String string2;
        WeakHashMap weakHashMap;
        int n4 = -1;
        if (n3 != n4) {
            ((TransitionValues)object).view = object2 = TransitionUtils.findDescendantOrAncestorById(((TransitionValues)object).view, n3);
        } else if (object2 != null) {
            ((TransitionValues)object).view = object2;
        } else {
            object2 = ((TransitionValues)object).view;
            n3 = R$id.mtrl_motion_snapshot_view;
            boolean bl2 = (object2 = object2.getTag(n3)) instanceof View;
            if (bl2) {
                object2 = ((TransitionValues)object).view;
                n3 = R$id.mtrl_motion_snapshot_view;
                object2 = (View)object2.getTag(n3);
                weakHashMap = ((TransitionValues)object).view;
                n4 = R$id.mtrl_motion_snapshot_view;
                string2 = null;
                weakHashMap.setTag(n4, null);
                ((TransitionValues)object).view = object2;
            }
        }
        object2 = ((TransitionValues)object).view;
        weakHashMap = ViewCompat.a;
        n3 = (int)(object2.isLaidOut() ? 1 : 0);
        if (n3 != 0 || (n3 = object2.getWidth()) != 0 || (n3 = object2.getHeight()) != 0) {
            weakHashMap = object2.getParent();
            weakHashMap = weakHashMap == null ? TransitionUtils.getRelativeBounds(object2) : TransitionUtils.getLocationOnScreen(object2);
            Object object3 = ((TransitionValues)object).values;
            string2 = PROP_BOUNDS;
            object3.put(string2, weakHashMap);
            object = ((TransitionValues)object).values;
            object3 = PROP_SHAPE_APPEARANCE;
            object2 = MaterialContainerTransform.captureShapeAppearance(object2, (RectF)weakHashMap, shapeAppearanceModel);
            object.put(object3, object2);
        }
    }

    private static float getElevationOrDefault(float f5, View view) {
        float f6 = -1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = ViewCompat$c.e(view);
        }
        return f5;
    }

    private static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel object) {
        int n3;
        if (object != null) {
            return object;
        }
        int n4 = R$id.mtrl_motion_snapshot_view;
        object = view.getTag(n4);
        if ((n4 = object instanceof ShapeAppearanceModel) != 0) {
            n4 = R$id.mtrl_motion_snapshot_view;
            return (ShapeAppearanceModel)view.getTag(n4);
        }
        object = view.getContext();
        int n7 = MaterialContainerTransform.getTransitionShapeAppearanceResId((Context)object);
        if (n7 != (n3 = -1)) {
            return ShapeAppearanceModel.builder((Context)object, n7, 0).build();
        }
        n4 = view instanceof Shapeable;
        if (n4 != 0) {
            return ((Shapeable)view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    private MaterialContainerTransform$ProgressThresholdsGroup getThresholdsOrDefault(boolean bl2, MaterialContainerTransform$ProgressThresholdsGroup object, MaterialContainerTransform$ProgressThresholdsGroup object2) {
        MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup;
        if (!bl2) {
            object = object2;
        }
        object2 = this.fadeProgressThresholds;
        Object object3 = MaterialContainerTransform$ProgressThresholdsGroup.access$400((MaterialContainerTransform$ProgressThresholdsGroup)object);
        Object object4 = object2 = TransitionUtils.defaultIfNull(object2, object3);
        object4 = (MaterialContainerTransform$ProgressThresholds)object2;
        object2 = this.scaleProgressThresholds;
        object3 = MaterialContainerTransform$ProgressThresholdsGroup.access$500((MaterialContainerTransform$ProgressThresholdsGroup)object);
        Object object5 = object2 = TransitionUtils.defaultIfNull(object2, object3);
        object5 = (MaterialContainerTransform$ProgressThresholds)object2;
        object2 = this.scaleMaskProgressThresholds;
        object3 = MaterialContainerTransform$ProgressThresholdsGroup.access$600((MaterialContainerTransform$ProgressThresholdsGroup)object);
        Object object6 = object2 = TransitionUtils.defaultIfNull(object2, object3);
        object6 = (MaterialContainerTransform$ProgressThresholds)object2;
        object2 = this.shapeMaskProgressThresholds;
        object = MaterialContainerTransform$ProgressThresholdsGroup.access$700((MaterialContainerTransform$ProgressThresholdsGroup)object);
        Object object7 = object = TransitionUtils.defaultIfNull(object2, object);
        object7 = (MaterialContainerTransform$ProgressThresholds)object;
        object3 = materialContainerTransform$ProgressThresholdsGroup;
        materialContainerTransform$ProgressThresholdsGroup = new MaterialContainerTransform$ProgressThresholdsGroup((MaterialContainerTransform$ProgressThresholds)object4, (MaterialContainerTransform$ProgressThresholds)object5, (MaterialContainerTransform$ProgressThresholds)object6, (MaterialContainerTransform$ProgressThresholds)object7, null);
        return materialContainerTransform$ProgressThresholdsGroup;
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        int n3 = R$attr.transitionShapeAppearance;
        int[] nArray = new int[]{n3};
        context = context.obtainStyledAttributes(nArray);
        n3 = context.getResourceId(0, -1);
        context.recycle();
        return n3;
    }

    private boolean isEntering(RectF object, RectF object2) {
        float f5;
        int n3 = this.transitionDirection;
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                int n7 = 2;
                float f6 = 2.8E-45f;
                if (n3 == n7) {
                    return false;
                }
                object2 = new StringBuilder("Invalid transition direction: ");
                n3 = this.transitionDirection;
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            return n4 != 0;
        }
        float f7 = TransitionUtils.calculateArea((RectF)object2);
        float f8 = f7 - (f5 = TransitionUtils.calculateArea(object));
        Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object3 > 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    private void maybeApplyThemeValues(Context context, boolean bl2) {
        void var2_5;
        int n3 = R$attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TransitionUtils.maybeApplyThemeInterpolator(this, context, n3, timeInterpolator);
        if (bl2) {
            int n4 = R$attr.motionDurationLong2;
        } else {
            int n7 = R$attr.motionDurationMedium4;
        }
        TransitionUtils.maybeApplyThemeDuration(this, context, (int)var2_5);
        boolean bl3 = this.pathMotionCustom;
        if (!bl3) {
            int n8 = R$attr.motionPath;
            TransitionUtils.maybeApplyThemePath(this, context, n8);
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = this.endView;
        int n3 = this.endViewId;
        ShapeAppearanceModel shapeAppearanceModel = this.endShapeAppearanceModel;
        MaterialContainerTransform.captureValues(transitionValues, view, n3, shapeAppearanceModel);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = this.startView;
        int n3 = this.startViewId;
        ShapeAppearanceModel shapeAppearanceModel = this.startShapeAppearanceModel;
        MaterialContainerTransform.captureValues(transitionValues, view, n3, shapeAppearanceModel);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        MaterialContainerTransform materialContainerTransform = this;
        Object object = transitionValues;
        Object object2 = transitionValues2;
        View view = null;
        if (transitionValues != null && transitionValues2 != null) {
            Map map2 = transitionValues.values;
            String string2 = PROP_BOUNDS;
            map2 = map2.get(string2);
            Map map3 = map2;
            map3 = (RectF)map2;
            map2 = transitionValues.values;
            String string3 = PROP_SHAPE_APPEARANCE;
            map2 = map2.get(string3);
            Object object3 = map2;
            object3 = (ShapeAppearanceModel)((Object)map2);
            if (map3 != null && object3 != null) {
                Map map4 = map2 = transitionValues2.values.get(string2);
                map4 = (RectF)map2;
                map2 = transitionValues2.values.get(string3);
                Object object4 = map2;
                object4 = (ShapeAppearanceModel)((Object)map2);
                if (map4 != null && object4 != null) {
                    string2 = transitionValues.view;
                    int n3 = materialContainerTransform.drawingViewId;
                    string3 = transitionValues2.view;
                    object = string3.getParent();
                    object = object != null ? string3 : string2;
                    int n4 = object.getId();
                    if (n3 == n4) {
                        view = (View)object.getParent();
                        object2 = object;
                    } else {
                        n3 = materialContainerTransform.drawingViewId;
                        view = TransitionUtils.findAncestorById((View)object, n3);
                        n3 = 0;
                        object2 = null;
                    }
                    map2 = TransitionUtils.getLocationOnScreen(view);
                    float f5 = -((RectF)map2).left;
                    float f6 = -((RectF)map2).top;
                    object2 = MaterialContainerTransform.calculateDrawableBounds(view, (View)object2, f5, f6);
                    map3.offset(f5, f6);
                    map4.offset(f5, f6);
                    n4 = (int)(materialContainerTransform.isEntering((RectF)map3, (RectF)map4) ? 1 : 0);
                    int n7 = materialContainerTransform.appliedThemeValues;
                    if (n7 == 0) {
                        object = object.getContext();
                        materialContainerTransform.maybeApplyThemeValues((Context)object, n4 != 0);
                    }
                    Object object5 = object;
                    Object object6 = this.getPathMotion();
                    float f7 = MaterialContainerTransform.getElevationOrDefault(materialContainerTransform.startElevation, (View)string2);
                    float f8 = MaterialContainerTransform.getElevationOrDefault(materialContainerTransform.endElevation, (View)string3);
                    int n8 = materialContainerTransform.containerColor;
                    int n10 = materialContainerTransform.startContainerColor;
                    int n14 = materialContainerTransform.endContainerColor;
                    int n15 = materialContainerTransform.scrimColor;
                    boolean bl2 = materialContainerTransform.elevationShadowEnabled;
                    FadeModeEvaluator fadeModeEvaluator = FadeModeEvaluators.get(materialContainerTransform.fadeMode, n4 != 0);
                    FitModeEvaluator fitModeEvaluator = FitModeEvaluators.get(materialContainerTransform.fitMode, n4 != 0, map3, (RectF)map4);
                    MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup = materialContainerTransform.buildThresholdsGroup(n4 != 0);
                    boolean bl3 = materialContainerTransform.drawDebugEnabled;
                    object = new MaterialContainerTransform$TransitionDrawable((PathMotion)object6, (View)string2, (RectF)map3, (ShapeAppearanceModel)object3, f7, (View)string3, (RectF)map4, (ShapeAppearanceModel)object4, f8, n8, n10, n14, n15, n4 != 0, bl2, fadeModeEvaluator, fitModeEvaluator, materialContainerTransform$ProgressThresholdsGroup, bl3, null);
                    n4 = Math.round(object2.left);
                    n7 = Math.round(object2.top);
                    int n16 = Math.round(object2.right);
                    n3 = Math.round(object2.bottom);
                    object.setBounds(n4, n7, n16, n3);
                    Object object7 = object2 = (Object)new float[2];
                    object7[0] = (TransitionValues)0.0f;
                    object7[1] = (TransitionValues)1.0f;
                    object5 = ValueAnimator.ofFloat((float[])object2);
                    object2 = new MaterialContainerTransform$1(materialContainerTransform, (MaterialContainerTransform$TransitionDrawable)((Object)object));
                    object5.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
                    map2 = object;
                    object = object6;
                    object2 = this;
                    object6 = new MaterialContainerTransform$2(this, view, (MaterialContainerTransform$TransitionDrawable)((Object)map2), (View)string2, (View)string3);
                    materialContainerTransform.addListener((Transition.TransitionListener)object6);
                    return object5;
                }
            }
        }
        return null;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public MaterialContainerTransform$ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public MaterialContainerTransform$ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public MaterialContainerTransform$ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public MaterialContainerTransform$ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int n3) {
        this.containerColor = n3;
        this.startContainerColor = n3;
        this.endContainerColor = n3;
    }

    public void setContainerColor(int n3) {
        this.containerColor = n3;
    }

    public void setDrawDebugEnabled(boolean bl2) {
        this.drawDebugEnabled = bl2;
    }

    public void setDrawingViewId(int n3) {
        this.drawingViewId = n3;
    }

    public void setElevationShadowEnabled(boolean bl2) {
        this.elevationShadowEnabled = bl2;
    }

    public void setEndContainerColor(int n3) {
        this.endContainerColor = n3;
    }

    public void setEndElevation(float f5) {
        this.endElevation = f5;
    }

    public void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int n3) {
        this.endViewId = n3;
    }

    public void setFadeMode(int n3) {
        this.fadeMode = n3;
    }

    public void setFadeProgressThresholds(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds) {
        this.fadeProgressThresholds = materialContainerTransform$ProgressThresholds;
    }

    public void setFitMode(int n3) {
        this.fitMode = n3;
    }

    public void setHoldAtEndEnabled(boolean bl2) {
        this.holdAtEndEnabled = bl2;
    }

    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds) {
        this.scaleMaskProgressThresholds = materialContainerTransform$ProgressThresholds;
    }

    public void setScaleProgressThresholds(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds) {
        this.scaleProgressThresholds = materialContainerTransform$ProgressThresholds;
    }

    public void setScrimColor(int n3) {
        this.scrimColor = n3;
    }

    public void setShapeMaskProgressThresholds(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds) {
        this.shapeMaskProgressThresholds = materialContainerTransform$ProgressThresholds;
    }

    public void setStartContainerColor(int n3) {
        this.startContainerColor = n3;
    }

    public void setStartElevation(float f5) {
        this.startElevation = f5;
    }

    public void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int n3) {
        this.startViewId = n3;
    }

    public void setTransitionDirection(int n3) {
        this.transitionDirection = n3;
    }
}

