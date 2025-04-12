/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.util.TypedValue
 *  android.view.View
 */
package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.transition.MaterialArcMotion;
import com.google.android.material.transition.TransitionUtils$1;
import com.google.android.material.transition.TransitionUtils$CornerSizeBinaryOperator;
import com.google.android.material.transition.a;

class TransitionUtils {
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = 255;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR;
    private static final RectF transformAlphaRectF;

    static {
        RectF rectF;
        transformAlphaRectF = rectF = new RectF();
    }

    private TransitionUtils() {
    }

    public static /* synthetic */ CornerSize a(RectF rectF, CornerSize cornerSize) {
        return TransitionUtils.lambda$convertToRelativeCornerSizes$0(rectF, cornerSize);
    }

    public static float calculateArea(RectF rectF) {
        float f5 = rectF.width();
        return rectF.height() * f5;
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        a a2 = new a(rectF);
        return shapeAppearanceModel.withTransformedCornerSizes(a2);
    }

    public static Shader createColorShader(int n3) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, n3, n3, tileMode);
        return linearGradient;
    }

    public static Object defaultIfNull(Object object, Object object2) {
        if (object == null) {
            object = object2;
        }
        return object;
    }

    public static View findAncestorById(View object, int n3) {
        String string2 = object.getResources().getResourceName(n3);
        while (object != null) {
            int n4 = object.getId();
            if (n4 == n3) {
                return object;
            }
            n4 = (object = object.getParent()) instanceof View;
            if (n4 != 0) continue;
        }
        String string3 = Ft2.a(string2, " is not a valid ancestor");
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public static View findDescendantOrAncestorById(View view, int n3) {
        View view2 = view.findViewById(n3);
        if (view2 != null) {
            return view2;
        }
        return TransitionUtils.findAncestorById(view, n3);
    }

    public static RectF getLocationOnScreen(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        int n3 = nArray[0];
        int n4 = nArray[1];
        int n7 = view.getWidth() + n3;
        int n8 = view.getHeight() + n4;
        float f5 = n3;
        float f6 = n4;
        float f7 = n7;
        float f8 = n8;
        RectF rectF = new RectF(f5, f6, f7, f8);
        return rectF;
    }

    public static RectF getRelativeBounds(View view) {
        float f5 = view.getLeft();
        float f6 = view.getTop();
        float f7 = view.getRight();
        float f8 = view.getBottom();
        RectF rectF = new RectF(f5, f6, f7, f8);
        return rectF;
    }

    public static Rect getRelativeBoundsRect(View view) {
        int n3 = view.getLeft();
        int n4 = view.getTop();
        int n7 = view.getRight();
        int n8 = view.getBottom();
        Rect rect = new Rect(n3, n4, n7, n8);
        return rect;
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel object, RectF rectF) {
        float f5;
        float f6;
        boolean bl2;
        float f7;
        float f8;
        CornerSize cornerSize = ((ShapeAppearanceModel)object).getTopLeftCornerSize();
        float f11 = cornerSize.getCornerSize(rectF);
        float f12 = f11 - 0.0f;
        Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object2 == false && (object2 = (f8 = (f11 = (cornerSize = ((ShapeAppearanceModel)object).getTopRightCornerSize()).getCornerSize(rectF)) - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) == false && (object2 = (f7 = (f11 = (cornerSize = ((ShapeAppearanceModel)object).getBottomRightCornerSize()).getCornerSize(rectF)) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false && !(bl2 = (f6 = (f5 = (object = ((ShapeAppearanceModel)object).getBottomLeftCornerSize()).getCornerSize(rectF)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) {
            bl2 = false;
            f5 = 0.0f;
            object = null;
        } else {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        return bl2;
    }

    private static /* synthetic */ CornerSize lambda$convertToRelativeCornerSizes$0(RectF rectF, CornerSize cornerSize) {
        return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
    }

    public static float lerp(float f5, float f6, float f7) {
        return xu0_1.a(f6, f5, f7, f5);
    }

    public static float lerp(float f5, float f6, float f7, float f8, float f11) {
        return TransitionUtils.lerp(f5, f6, f7, f8, f11, false);
    }

    public static float lerp(float f5, float f6, float f7, float f8, float f11, boolean object) {
        if (object != 0) {
            float f12;
            float f14 = 0.0f;
            float f15 = f11 - 0.0f;
            object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (object < 0 || (object = (Object)((f12 = f11 - (f14 = 1.0f)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) > 0) {
                return TransitionUtils.lerp(f5, f6, f11);
            }
        }
        if ((object = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1)) < 0) {
            return f5;
        }
        object = f11 == f8 ? 0 : (f11 > f8 ? 1 : -1);
        if (object > 0) {
            return f6;
        }
        f11 -= f7;
        return TransitionUtils.lerp(f5, f6, f11 /= (f8 -= f7));
    }

    public static int lerp(int n3, int n4, float f5, float f6, float f7) {
        Object object = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
        if (object < 0) {
            return n3;
        }
        object = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
        if (object > 0) {
            return n4;
        }
        float f8 = n3;
        float f11 = n4;
        f7 -= f5;
        return (int)TransitionUtils.lerp(f8, f11, f7 /= (f6 -= f5));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f5, float f6, float f7) {
        Object object = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
        if (object < 0) {
            return shapeAppearanceModel;
        }
        object = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
        if (object > 0) {
            return shapeAppearanceModel2;
        }
        TransitionUtils$1 transitionUtils$1 = new TransitionUtils$1(rectF, rectF2, f5, f6, f7);
        return TransitionUtils.transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, transitionUtils$1);
    }

    public static void maybeAddTransition(TransitionSet transitionSet, Transition transition2) {
        if (transition2 != null) {
            transitionSet.b(transition2);
        }
    }

    public static boolean maybeApplyThemeDuration(Transition transition2, Context context, int n3) {
        int n4;
        int n7;
        long l2;
        long l3;
        long l4;
        long l7;
        if (n3 != 0 && (l7 = (l4 = (l3 = transition2.getDuration()) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n7 = MotionUtils.resolveThemeDuration(context, n3, n4 = -1)) != n4) {
            long l8 = n7;
            transition2.setDuration(l8);
            return true;
        }
        return false;
    }

    public static boolean maybeApplyThemeInterpolator(Transition transition2, Context context, int n3, TimeInterpolator timeInterpolator) {
        TimeInterpolator timeInterpolator2;
        if (n3 != 0 && (timeInterpolator2 = transition2.getInterpolator()) == null) {
            context = MotionUtils.resolveThemeInterpolator(context, n3, timeInterpolator);
            transition2.setInterpolator((TimeInterpolator)context);
            return true;
        }
        return false;
    }

    public static boolean maybeApplyThemePath(Transition transition2, Context object, int n3) {
        if (n3 != 0 && (object = TransitionUtils.resolveThemePath(object, n3)) != null) {
            transition2.setPathMotion((PathMotion)object);
            return true;
        }
        return false;
    }

    public static void maybeRemoveTransition(TransitionSet transitionSet, Transition transition2) {
        if (transition2 != null) {
            transitionSet.e(transition2);
        }
    }

    public static PathMotion resolveThemePath(Context object, int n3) {
        TypedValue typedValue = new TypedValue();
        object = object.getTheme();
        int n4 = 1;
        int n7 = object.resolveAttribute(n3, typedValue, n4 != 0);
        n3 = 0;
        Object object2 = null;
        if (n7 != 0) {
            n7 = typedValue.type;
            int n8 = 16;
            if (n7 == n8) {
                n7 = typedValue.data;
                if (n7 == 0) {
                    return null;
                }
                if (n7 == n4) {
                    object = new MaterialArcMotion();
                    return object;
                }
                object = hj0_0.a(n7, "Invalid motion path type: ");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            n3 = 3;
            if (n7 == n3) {
                object = String.valueOf(typedValue.string);
                object = rn2.d((String)object);
                object2 = new PatternPathMotion((Path)object);
                return object2;
            }
            object = new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
            throw object;
        }
        return null;
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int n3) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, n3);
    }

    public static void transform(Canvas canvas, Rect rect, float f5, float f6, float f7, int n3, CanvasCompat$CanvasOperation canvasCompat$CanvasOperation) {
        if (n3 <= 0) {
            return;
        }
        int n4 = canvas.save();
        canvas.translate(f5, f6);
        canvas.scale(f7, f7);
        int n7 = 255;
        f5 = 3.57E-43f;
        if (n3 < n7) {
            TransitionUtils.saveLayerAlphaCompat(canvas, rect, n3);
        }
        canvasCompat$CanvasOperation.run(canvas);
        canvas.restoreToCount(n4);
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel object, ShapeAppearanceModel object2, RectF object3, TransitionUtils$CornerSizeBinaryOperator transitionUtils$CornerSizeBinaryOperator) {
        boolean bl2 = TransitionUtils.isShapeAppearanceSignificant((ShapeAppearanceModel)object, (RectF)object3);
        object3 = bl2 ? object : object2;
        object3 = ((ShapeAppearanceModel)object3).toBuilder();
        CornerSize cornerSize = ((ShapeAppearanceModel)object).getTopLeftCornerSize();
        CornerSize cornerSize2 = ((ShapeAppearanceModel)object2).getTopLeftCornerSize();
        cornerSize = transitionUtils$CornerSizeBinaryOperator.apply(cornerSize, cornerSize2);
        object3 = ((ShapeAppearanceModel$Builder)object3).setTopLeftCornerSize(cornerSize);
        cornerSize = ((ShapeAppearanceModel)object).getTopRightCornerSize();
        cornerSize2 = ((ShapeAppearanceModel)object2).getTopRightCornerSize();
        cornerSize = transitionUtils$CornerSizeBinaryOperator.apply(cornerSize, cornerSize2);
        object3 = ((ShapeAppearanceModel$Builder)object3).setTopRightCornerSize(cornerSize);
        cornerSize = ((ShapeAppearanceModel)object).getBottomLeftCornerSize();
        cornerSize2 = ((ShapeAppearanceModel)object2).getBottomLeftCornerSize();
        cornerSize = transitionUtils$CornerSizeBinaryOperator.apply(cornerSize, cornerSize2);
        object3 = ((ShapeAppearanceModel$Builder)object3).setBottomLeftCornerSize(cornerSize);
        object = ((ShapeAppearanceModel)object).getBottomRightCornerSize();
        object2 = ((ShapeAppearanceModel)object2).getBottomRightCornerSize();
        object = transitionUtils$CornerSizeBinaryOperator.apply((CornerSize)object, (CornerSize)object2);
        return ((ShapeAppearanceModel$Builder)object3).setBottomRightCornerSize((CornerSize)object).build();
    }
}

