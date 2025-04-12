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
import com.google.android.material.shape.ShapePath$PathLineOperation;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;

class ShapePath$LineShadowOperation
extends ShapePath$ShadowCompatOperation {
    private final ShapePath$PathLineOperation operation;
    private final float startX;
    private final float startY;

    public ShapePath$LineShadowOperation(ShapePath$PathLineOperation shapePath$PathLineOperation, float f5, float f6) {
        this.operation = shapePath$PathLineOperation;
        this.startX = f5;
        this.startY = f6;
    }

    public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int n3, Canvas canvas) {
        float f5 = ShapePath$PathLineOperation.access$100(this.operation);
        float f6 = this.startY;
        f5 -= f6;
        f6 = ShapePath$PathLineOperation.access$000(this.operation);
        float f7 = this.startX;
        double d2 = f5;
        double d5 = f6 -= f7;
        f5 = (float)Math.hypot(d2, d5);
        RectF rectF = new RectF(0.0f, 0.0f, f5, 0.0f);
        this.renderMatrix.set(matrix);
        matrix = this.renderMatrix;
        f5 = this.startX;
        f6 = this.startY;
        matrix.preTranslate(f5, f6);
        matrix = this.renderMatrix;
        f5 = this.getAngle();
        matrix.preRotate(f5);
        matrix = this.renderMatrix;
        shadowRenderer.drawEdgeShadow(canvas, matrix, rectF, n3);
    }

    public float getAngle() {
        float f5 = ShapePath$PathLineOperation.access$100(this.operation);
        float f6 = this.startY;
        f5 -= f6;
        f6 = ShapePath$PathLineOperation.access$000(this.operation);
        float f7 = this.startX;
        return (float)Math.toDegrees(Math.atan(f5 / (f6 -= f7)));
    }
}

