/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapePath$PathArcOperation;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;

class ShapePath$ArcShadowOperation
extends ShapePath$ShadowCompatOperation {
    private final ShapePath$PathArcOperation operation;

    public ShapePath$ArcShadowOperation(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        this.operation = shapePath$PathArcOperation;
    }

    public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int n3, Canvas canvas) {
        float f5 = ShapePath$PathArcOperation.access$800(this.operation);
        float f6 = ShapePath$PathArcOperation.access$900(this.operation);
        float f7 = ShapePath$PathArcOperation.access$1000(this.operation);
        float f8 = ShapePath$PathArcOperation.access$1100(this.operation);
        float f11 = ShapePath$PathArcOperation.access$1200(this.operation);
        float f12 = ShapePath$PathArcOperation.access$1300(this.operation);
        RectF rectF = new RectF(f7, f8, f11, f12);
        shadowRenderer.drawCornerShadow(canvas, matrix, rectF, n3, f5, f6);
    }
}

