/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.Path$Op
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.os.Build$VERSION
 */
package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds;
import com.google.android.material.transition.TransitionUtils;

class MaskEvaluator {
    private ShapeAppearanceModel currentShapeAppearanceModel;
    private final Path endPath;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    private final Path startPath;

    public MaskEvaluator() {
        Object object;
        this.path = object = new Path();
        this.startPath = object = new Path();
        this.endPath = object = new Path();
        object = ShapeAppearancePathProvider.getInstance();
        this.pathProvider = object;
    }

    public void clip(Canvas canvas) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            Path path = this.path;
            canvas.clipPath(path);
        } else {
            Path path = this.startPath;
            canvas.clipPath(path);
            path = this.endPath;
            Region.Op op2 = Region.Op.UNION;
            canvas.clipPath(path, op2);
        }
    }

    public void evaluate(float f5, ShapeAppearanceModel object, ShapeAppearanceModel shapeAppearanceModel, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds) {
        float f6 = materialContainerTransform$ProgressThresholds.getStart();
        float f7 = materialContainerTransform$ProgressThresholds.getEnd();
        Object object2 = TransitionUtils.lerp((ShapeAppearanceModel)object, shapeAppearanceModel, rectF, rectF3, f6, f7, f5);
        this.currentShapeAppearanceModel = object2;
        object = this.pathProvider;
        shapeAppearanceModel = this.startPath;
        float f8 = 1.0f;
        ((ShapeAppearancePathProvider)object).calculatePath((ShapeAppearanceModel)object2, f8, rectF2, (Path)shapeAppearanceModel);
        object2 = this.pathProvider;
        object = this.currentShapeAppearanceModel;
        shapeAppearanceModel = this.endPath;
        ((ShapeAppearancePathProvider)object2).calculatePath((ShapeAppearanceModel)object, f8, rectF3, (Path)shapeAppearanceModel);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            object2 = this.path;
            object = this.startPath;
            shapeAppearanceModel = this.endPath;
            rectF = Path.Op.UNION;
            object2.op((Path)object, (Path)shapeAppearanceModel, (Path.Op)rectF);
        }
    }

    public ShapeAppearanceModel getCurrentShapeAppearanceModel() {
        return this.currentShapeAppearanceModel;
    }

    public Path getPath() {
        return this.path;
    }
}

