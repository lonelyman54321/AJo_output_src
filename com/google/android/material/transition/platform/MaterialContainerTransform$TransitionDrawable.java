/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.Shader
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.transition.PathMotion
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.WindowManager
 */
package com.google.android.material.transition.platform;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.transition.platform.FadeModeEvaluator;
import com.google.android.material.transition.platform.FadeModeResult;
import com.google.android.material.transition.platform.FitModeEvaluator;
import com.google.android.material.transition.platform.FitModeResult;
import com.google.android.material.transition.platform.MaskEvaluator;
import com.google.android.material.transition.platform.MaterialContainerTransform$1;
import com.google.android.material.transition.platform.MaterialContainerTransform$ProgressThresholds;
import com.google.android.material.transition.platform.MaterialContainerTransform$ProgressThresholdsGroup;
import com.google.android.material.transition.platform.MaterialContainerTransform$TransitionDrawable$1;
import com.google.android.material.transition.platform.MaterialContainerTransform$TransitionDrawable$2;
import com.google.android.material.transition.platform.TransitionUtils;

final class MaterialContainerTransform$TransitionDrawable
extends Drawable {
    private static final int COMPAT_SHADOW_COLOR = 0x888888;
    private static final int SHADOW_COLOR = 0x2D000000;
    private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
    private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
    private final MaterialShapeDrawable compatShadowDrawable;
    private final Paint containerPaint;
    private float currentElevation;
    private float currentElevationDy;
    private final RectF currentEndBounds;
    private final RectF currentEndBoundsMasked;
    private RectF currentMaskBounds;
    private final RectF currentStartBounds;
    private final RectF currentStartBoundsMasked;
    private final Paint debugPaint;
    private final Path debugPath;
    private final float displayHeight;
    private final float displayWidth;
    private final boolean drawDebugEnabled;
    private final boolean elevationShadowEnabled;
    private final RectF endBounds;
    private final Paint endContainerPaint;
    private final float endElevation;
    private final ShapeAppearanceModel endShapeAppearanceModel;
    private final View endView;
    private final boolean entering;
    private final FadeModeEvaluator fadeModeEvaluator;
    private FadeModeResult fadeModeResult;
    private final FitModeEvaluator fitModeEvaluator;
    private FitModeResult fitModeResult;
    private final MaskEvaluator maskEvaluator;
    private final float motionPathLength;
    private final PathMeasure motionPathMeasure;
    private final float[] motionPathPosition;
    private float progress;
    private final MaterialContainerTransform$ProgressThresholdsGroup progressThresholds;
    private final Paint scrimPaint;
    private final Paint shadowPaint;
    private final RectF startBounds;
    private final Paint startContainerPaint;
    private final float startElevation;
    private final ShapeAppearanceModel startShapeAppearanceModel;
    private final View startView;

    private MaterialContainerTransform$TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int n3, int n4, int n7, int n8, boolean bl2, boolean bl3, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup, boolean bl4) {
        float f7;
        float f8;
        Path path;
        Paint paint;
        MaterialShapeDrawable materialShapeDrawable;
        MaskEvaluator maskEvaluator;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        RectF rectF3 = rectF;
        this.containerPaint = paint5 = new Paint();
        this.startContainerPaint = paint4 = new Paint();
        this.endContainerPaint = paint3 = new Paint();
        this.shadowPaint = paint2 = new Paint();
        this.scrimPaint = paint2 = new Paint();
        this.maskEvaluator = maskEvaluator = new MaskEvaluator();
        int n10 = 2;
        float[] fArray = new float[n10];
        this.motionPathPosition = fArray;
        this.compatShadowDrawable = materialShapeDrawable = new MaterialShapeDrawable();
        this.debugPaint = paint = new Paint();
        this.debugPath = path = new Path();
        path = view;
        this.startView = view;
        this.startBounds = rectF;
        this.startShapeAppearanceModel = shapeAppearanceModel;
        this.startElevation = f5;
        this.endView = view2;
        this.endBounds = rectF2;
        Object object = shapeAppearanceModel2;
        this.endShapeAppearanceModel = shapeAppearanceModel2;
        this.endElevation = f6;
        this.entering = bl2;
        this.elevationShadowEnabled = bl3;
        object = fadeModeEvaluator;
        this.fadeModeEvaluator = fadeModeEvaluator;
        object = fitModeEvaluator;
        this.fitModeEvaluator = fitModeEvaluator;
        object = materialContainerTransform$ProgressThresholdsGroup;
        this.progressThresholds = materialContainerTransform$ProgressThresholdsGroup;
        this.drawDebugEnabled = bl4;
        path = (WindowManager)view.getContext().getSystemService("window");
        object = new DisplayMetrics();
        path.getDefaultDisplay().getMetrics((DisplayMetrics)object);
        this.displayWidth = f8 = (float)((DisplayMetrics)object).widthPixels;
        this.displayHeight = f8 = (float)((DisplayMetrics)object).heightPixels;
        paint5.setColor(n3);
        paint4.setColor(n4);
        paint3.setColor(n7);
        paint4 = ColorStateList.valueOf((int)0);
        materialShapeDrawable.setFillColor((ColorStateList)paint4);
        materialShapeDrawable.setShadowCompatibilityMode(n10);
        materialShapeDrawable.setShadowBitmapDrawingEnable(false);
        materialShapeDrawable.setShadowColor(-7829368);
        super(rectF);
        this.currentStartBounds = paint4;
        super((RectF)paint4);
        this.currentStartBoundsMasked = paint3;
        super((RectF)paint4);
        this.currentEndBounds = paint3;
        super((RectF)paint3);
        this.currentEndBoundsMasked = paint4;
        paint4 = MaterialContainerTransform$TransitionDrawable.getMotionPathPoint(rectF);
        paint3 = MaterialContainerTransform$TransitionDrawable.getMotionPathPoint(rectF2);
        float f11 = paint4.x;
        float f12 = paint4.y;
        float f14 = paint3.x;
        float f15 = paint3.y;
        path = pathMotion;
        paint4 = pathMotion.getPath(f11, f12, f14, f15);
        super((Path)paint4, false);
        this.motionPathMeasure = paint3;
        this.motionPathLength = f12 = paint3.getLength();
        fArray[0] = f12 = rectF.centerX();
        fArray[1] = f7 = rectF.top;
        rectF3 = Paint.Style.FILL;
        paint2.setStyle((Paint.Style)rectF3);
        rectF3 = TransitionUtils.createColorShader(n8);
        paint2.setShader((Shader)rectF3);
        rectF3 = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)rectF3);
        paint.setStrokeWidth(10.0f);
        this.updateProgress(0.0f);
    }

    public /* synthetic */ MaterialContainerTransform$TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f6, int n3, int n4, int n7, int n8, boolean bl2, boolean bl3, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup, boolean bl4, MaterialContainerTransform$1 materialContainerTransform$1) {
        this(pathMotion, view, rectF, shapeAppearanceModel, f5, view2, rectF2, shapeAppearanceModel2, f6, n3, n4, n7, n8, bl2, bl3, fadeModeEvaluator, fitModeEvaluator, materialContainerTransform$ProgressThresholdsGroup, bl4);
    }

    public static /* synthetic */ void access$200(MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable, float f5) {
        materialContainerTransform$TransitionDrawable.setProgress(f5);
    }

    public static /* synthetic */ View access$800(MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable) {
        return materialContainerTransform$TransitionDrawable.startView;
    }

    public static /* synthetic */ View access$900(MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable) {
        return materialContainerTransform$TransitionDrawable.endView;
    }

    private static float calculateElevationDxMultiplier(RectF rectF, float f5) {
        float f6 = rectF.centerX();
        return (f6 / (f5 /= 2.0f) - 1.0f) * 0.3f;
    }

    private static float calculateElevationDyMultiplier(RectF rectF, float f5) {
        return rectF.centerY() / f5 * 1.5f;
    }

    private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, int n3) {
        rectF = MaterialContainerTransform$TransitionDrawable.getMotionPathPoint(rectF);
        float f5 = this.progress;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            path.reset();
            float f7 = rectF.x;
            float f8 = rectF.y;
            path.moveTo(f7, f8);
        } else {
            f5 = rectF.x;
            float f11 = rectF.y;
            path.lineTo(f5, f11);
            this.debugPaint.setColor(n3);
            rectF = this.debugPaint;
            canvas.drawPath(path, (Paint)rectF);
        }
    }

    private void drawDebugRect(Canvas canvas, RectF rectF, int n3) {
        this.debugPaint.setColor(n3);
        Paint paint = this.debugPaint;
        canvas.drawRect(rectF, paint);
    }

    private void drawElevationShadow(Canvas canvas) {
        canvas.save();
        Path path = this.maskEvaluator.getPath();
        Region.Op op2 = Region.Op.DIFFERENCE;
        canvas.clipPath(path, op2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 > n4) {
            this.drawElevationShadowWithPaintShadowLayer(canvas);
        } else {
            this.drawElevationShadowWithMaterialShapeDrawable(canvas);
        }
        canvas.restore();
    }

    private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.compatShadowDrawable;
        Object object = this.currentMaskBounds;
        int n3 = (int)object.left;
        int n4 = (int)object.top;
        int n7 = (int)object.right;
        int n8 = (int)object.bottom;
        materialShapeDrawable.setBounds(n3, n4, n7, n8);
        materialShapeDrawable = this.compatShadowDrawable;
        float f5 = this.currentElevation;
        materialShapeDrawable.setElevation(f5);
        materialShapeDrawable = this.compatShadowDrawable;
        n8 = (int)this.currentElevationDy;
        materialShapeDrawable.setShadowVerticalOffset(n8);
        materialShapeDrawable = this.compatShadowDrawable;
        object = this.maskEvaluator.getCurrentShapeAppearanceModel();
        materialShapeDrawable.setShapeAppearanceModel((ShapeAppearanceModel)object);
        this.compatShadowDrawable.draw(canvas);
    }

    private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
        RectF rectF;
        Object object = this.maskEvaluator.getCurrentShapeAppearanceModel();
        boolean bl2 = ((ShapeAppearanceModel)object).isRoundRect(rectF = this.currentMaskBounds);
        if (bl2) {
            object = ((ShapeAppearanceModel)object).getTopLeftCornerSize();
            rectF = this.currentMaskBounds;
            float f5 = object.getCornerSize(rectF);
            rectF = this.currentMaskBounds;
            Paint paint = this.shadowPaint;
            canvas.drawRoundRect(rectF, f5, f5, paint);
        } else {
            object = this.maskEvaluator.getPath();
            rectF = this.shadowPaint;
            canvas.drawPath((Path)object, (Paint)rectF);
        }
    }

    private void drawEndView(Canvas canvas) {
        Paint paint = this.endContainerPaint;
        this.maybeDrawContainerColor(canvas, paint);
        Rect rect = this.getBounds();
        paint = this.currentEndBounds;
        float f5 = paint.left;
        float f6 = paint.top;
        float f7 = this.fitModeResult.endScale;
        int n3 = this.fadeModeResult.endAlpha;
        MaterialContainerTransform$TransitionDrawable$2 materialContainerTransform$TransitionDrawable$2 = new MaterialContainerTransform$TransitionDrawable$2(this);
        TransitionUtils.transform(canvas, rect, f5, f6, f7, n3, materialContainerTransform$TransitionDrawable$2);
    }

    private void drawStartView(Canvas canvas) {
        Paint paint = this.startContainerPaint;
        this.maybeDrawContainerColor(canvas, paint);
        Rect rect = this.getBounds();
        paint = this.currentStartBounds;
        float f5 = paint.left;
        float f6 = paint.top;
        float f7 = this.fitModeResult.startScale;
        int n3 = this.fadeModeResult.startAlpha;
        MaterialContainerTransform$TransitionDrawable$1 materialContainerTransform$TransitionDrawable$1 = new MaterialContainerTransform$TransitionDrawable$1(this);
        TransitionUtils.transform(canvas, rect, f5, f6, f7, n3, materialContainerTransform$TransitionDrawable$1);
    }

    private static PointF getMotionPathPoint(RectF rectF) {
        float f5 = rectF.centerX();
        float f6 = rectF.top;
        PointF pointF = new PointF(f5, f6);
        return pointF;
    }

    private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
        int n3 = paint.getColor();
        if (n3 != 0 && (n3 = paint.getAlpha()) > 0) {
            Rect rect = this.getBounds();
            canvas.drawRect(rect, paint);
        }
    }

    private void setProgress(float f5) {
        float f6 = this.progress;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.updateProgress(f5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateProgress(float f5) {
        Object object;
        Object object2;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        this.progress = f5;
        Object object3 = this.scrimPaint;
        int n3 = this.entering;
        int n4 = 1132396544;
        float f14 = 255.0f;
        float f15 = n3 != 0 ? TransitionUtils.lerp(0.0f, f14, f5) : TransitionUtils.lerp(f14, 0.0f, f5);
        n3 = (int)f15;
        object3.setAlpha(n3);
        object3 = this.motionPathMeasure;
        f15 = this.motionPathLength * f5;
        Object object4 = this.motionPathPosition;
        float f16 = 0.0f;
        Object object5 = null;
        object3.getPosTan(f15, (float[])object4, null);
        object3 = this.motionPathPosition;
        n3 = 0;
        f15 = 0.0f;
        Object object6 = null;
        f14 = (float)object3[0];
        int n7 = 1;
        float f17 = Float.MIN_VALUE;
        Object object7 = object3[n7];
        float f18 = 1.0f;
        float f19 = f5 == f18 ? 0 : (f5 > f18 ? 1 : -1);
        if (f19 > 0 || (f12 = (f11 = f5 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0) {
            if (f19 > 0) {
                f8 = (f5 - f18) / 0.00999999f;
                f12 = 1065185444;
                f7 = 0.99f;
            } else {
                f12 = 1008981770;
                f7 = 0.01f;
                f8 = f5 / f7;
                f6 = -1.0f;
                f8 *= f6;
            }
            PathMeasure pathMeasure = this.motionPathMeasure;
            object2 = this.motionPathLength * f7;
            pathMeasure.getPosTan((float)object2, (float[])object3, null);
            object3 = this.motionPathPosition;
            f15 = (float)object3[0];
            object = object3[n7];
            f14 = xu0_1.a(f14, f15, f8, f14);
            object7 = xu0_1.a((float)object7, (float)object, f8, (float)object7);
        }
        f6 = f14;
        object2 = object7;
        f14 = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1000(MaterialContainerTransform$ProgressThresholdsGroup.access$500(this.progressThresholds))).floatValue();
        f16 = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1100(MaterialContainerTransform$ProgressThresholdsGroup.access$500(this.progressThresholds))).floatValue();
        object3 = this.fitModeEvaluator;
        f17 = this.startBounds.width();
        object7 = this.startBounds.height();
        f8 = this.endBounds.width();
        f7 = this.endBounds.height();
        f15 = f5;
        this.fitModeResult = object3 = object3.evaluate(f5, f14, f16, f17, (float)object7, f8, f7);
        object6 = this.currentStartBounds;
        f14 = ((FitModeResult)object3).currentStartWidth;
        f16 = 2.0f;
        f17 = f14 / f16;
        f17 = f6 - f17;
        f14 = f14 / f16 + f6;
        object = ((FitModeResult)object3).currentStartHeight + object2;
        object6.set(f17, (float)object2, f14, (float)object);
        object3 = this.currentEndBounds;
        object6 = this.fitModeResult;
        f14 = ((FitModeResult)object6).currentEndWidth;
        f17 = f14 / f16;
        f17 = f6 - f17;
        f14 = f14 / f16 + f6;
        f15 = ((FitModeResult)object6).currentEndHeight + object2;
        object3.set(f17, (float)object2, f14, f15);
        object3 = this.currentStartBoundsMasked;
        object6 = this.currentStartBounds;
        object3.set((RectF)object6);
        object3 = this.currentEndBoundsMasked;
        object6 = this.currentEndBounds;
        object3.set((RectF)object6);
        object3 = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1000(MaterialContainerTransform$ProgressThresholdsGroup.access$600(this.progressThresholds)));
        object = ((Float)object3).floatValue();
        object6 = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1100(MaterialContainerTransform$ProgressThresholdsGroup.access$600(this.progressThresholds)));
        f15 = ((Float)object6).floatValue();
        object4 = this.fitModeEvaluator;
        object5 = this.fitModeResult;
        n4 = (int)(object4.shouldMaskStartBounds((FitModeResult)object5) ? 1 : 0);
        object5 = n4 != 0 ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
        object = TransitionUtils.lerp(0.0f, f18, (float)object, f15, f5);
        if (n4 == 0) {
            object = f18 - object;
        }
        object6 = this.fitModeEvaluator;
        object4 = this.fitModeResult;
        object6.applyMask((RectF)object5, (float)object, (FitModeResult)object4);
        f15 = this.currentStartBoundsMasked.left;
        f14 = this.currentEndBoundsMasked.left;
        f15 = Math.min(f15, f14);
        f14 = this.currentStartBoundsMasked.top;
        f16 = this.currentEndBoundsMasked.top;
        f14 = Math.min(f14, f16);
        f16 = this.currentStartBoundsMasked.right;
        f17 = this.currentEndBoundsMasked.right;
        f16 = Math.max(f16, f17);
        f17 = this.currentStartBoundsMasked.bottom;
        object7 = this.currentEndBoundsMasked.bottom;
        f17 = Math.max(f17, (float)object7);
        object3 = new RectF(f15, f14, f16, f17);
        this.currentMaskBounds = object3;
        object3 = this.maskEvaluator;
        object4 = this.startShapeAppearanceModel;
        object5 = this.endShapeAppearanceModel;
        RectF rectF = this.currentStartBounds;
        RectF rectF2 = this.currentStartBoundsMasked;
        RectF rectF3 = this.currentEndBoundsMasked;
        MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds = MaterialContainerTransform$ProgressThresholdsGroup.access$700(this.progressThresholds);
        f15 = f5;
        ((MaskEvaluator)object3).evaluate(f5, (ShapeAppearanceModel)object4, (ShapeAppearanceModel)object5, rectF, rectF2, rectF3, materialContainerTransform$ProgressThresholds);
        object = this.startElevation;
        f15 = this.endElevation;
        object = TransitionUtils.lerp((float)object, f15, f5);
        this.currentElevation = (float)object;
        object3 = this.currentMaskBounds;
        f15 = this.displayWidth;
        object = MaterialContainerTransform$TransitionDrawable.calculateElevationDxMultiplier((RectF)object3, f15);
        object6 = this.currentMaskBounds;
        f14 = this.displayHeight;
        f15 = MaterialContainerTransform$TransitionDrawable.calculateElevationDyMultiplier((RectF)object6, f14);
        f14 = this.currentElevation;
        object = (float)((int)(object * f14));
        n3 = (int)(f15 * f14);
        this.currentElevationDy = f15 = (float)n3;
        object5 = this.shadowPaint;
        n7 = 0x2D000000;
        f17 = 7.275958E-12f;
        object5.setShadowLayer(f14, (float)object, f15, n7);
        object = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1000(MaterialContainerTransform$ProgressThresholdsGroup.access$400(this.progressThresholds))).floatValue();
        object6 = Float.valueOf(MaterialContainerTransform$ProgressThresholds.access$1100(MaterialContainerTransform$ProgressThresholdsGroup.access$400(this.progressThresholds)));
        f15 = ((Float)object6).floatValue();
        object4 = this.fadeModeEvaluator;
        f16 = 0.35f;
        this.fadeModeResult = object3 = object4.evaluate(f5, (float)object, f15, f16);
        object3 = this.startContainerPaint;
        int n8 = object3.getColor();
        if (n8 != 0) {
            object3 = this.startContainerPaint;
            object6 = this.fadeModeResult;
            n3 = ((FadeModeResult)object6).startAlpha;
            object3.setAlpha(n3);
        }
        if ((n8 = (object3 = this.endContainerPaint).getColor()) != 0) {
            object3 = this.endContainerPaint;
            object6 = this.fadeModeResult;
            n3 = ((FadeModeResult)object6).endAlpha;
            object3.setAlpha(n3);
        }
        this.invalidateSelf();
    }

    public void draw(Canvas canvas) {
        int n3;
        float f5;
        Object object;
        Paint paint = this.scrimPaint;
        int n4 = paint.getAlpha();
        if (n4 > 0) {
            paint = this.getBounds();
            object = this.scrimPaint;
            canvas.drawRect((Rect)paint, object);
        }
        n4 = (n4 = (int)(this.drawDebugEnabled ? 1 : 0)) != 0 ? canvas.save() : -1;
        Object object2 = this.elevationShadowEnabled;
        if (object2 != 0) {
            f5 = this.currentElevation;
            n3 = 0;
            float f6 = f5 - 0.0f;
            object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                this.drawElevationShadow(canvas);
            }
        }
        this.maskEvaluator.clip(canvas);
        object = this.containerPaint;
        this.maybeDrawContainerColor(canvas, (Paint)object);
        object = this.fadeModeResult;
        object2 = object.endOnTop;
        if (object2 != 0) {
            this.drawStartView(canvas);
            this.drawEndView(canvas);
        } else {
            this.drawEndView(canvas);
            this.drawStartView(canvas);
        }
        object2 = this.drawDebugEnabled;
        if (object2 != 0) {
            canvas.restoreToCount(n4);
            paint = this.currentStartBounds;
            object = this.debugPath;
            n3 = -65281;
            this.drawDebugCumulativePath(canvas, (RectF)paint, (Path)object, n3);
            paint = this.currentStartBoundsMasked;
            this.drawDebugRect(canvas, (RectF)paint, -256);
            paint = this.currentStartBounds;
            this.drawDebugRect(canvas, (RectF)paint, -16711936);
            paint = this.currentEndBoundsMasked;
            this.drawDebugRect(canvas, (RectF)paint, -16711681);
            paint = this.currentEndBounds;
            object2 = -16776961;
            f5 = -1.7014636E38f;
            this.drawDebugRect(canvas, (RectF)paint, (int)object2);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Setting alpha on is not supported");
        throw unsupportedOperationException;
    }

    public void setColorFilter(ColorFilter object) {
        object = new UnsupportedOperationException("Setting a color filter is not supported");
        throw object;
    }
}

