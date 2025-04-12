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

class ShapePath$InnerCornerShadowOperation
extends ShapePath$ShadowCompatOperation {
    private final ShapePath$PathLineOperation operation1;
    private final ShapePath$PathLineOperation operation2;
    private final float startX;
    private final float startY;

    public ShapePath$InnerCornerShadowOperation(ShapePath$PathLineOperation shapePath$PathLineOperation, ShapePath$PathLineOperation shapePath$PathLineOperation2, float f5, float f6) {
        this.operation1 = shapePath$PathLineOperation;
        this.operation2 = shapePath$PathLineOperation2;
        this.startX = f5;
        this.startY = f6;
    }

    public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int n3, Canvas canvas) {
        ShapePath$InnerCornerShadowOperation shapePath$InnerCornerShadowOperation = this;
        Matrix matrix2 = matrix;
        Object object = canvas;
        float f5 = this.getSweepAngle();
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            return;
        }
        Object object3 = this.operation1;
        float f8 = ShapePath$PathLineOperation.access$000((ShapePath$PathLineOperation)object3);
        float f11 = this.startX;
        double d2 = f8 -= f11;
        float f12 = ShapePath$PathLineOperation.access$100(this.operation1);
        float f14 = this.startY;
        double d5 = f12 - f14;
        d2 = Math.hypot(d2, d5);
        ShapePath$PathLineOperation shapePath$PathLineOperation = this.operation2;
        f12 = ShapePath$PathLineOperation.access$000(shapePath$PathLineOperation);
        ShapePath$PathLineOperation shapePath$PathLineOperation2 = this.operation1;
        f14 = ShapePath$PathLineOperation.access$000(shapePath$PathLineOperation2);
        d5 = f12 - f14;
        Object object4 = this.operation2;
        float f15 = ShapePath$PathLineOperation.access$100((ShapePath$PathLineOperation)object4);
        ShapePath$PathLineOperation shapePath$PathLineOperation3 = this.operation1;
        float f16 = ShapePath$PathLineOperation.access$100(shapePath$PathLineOperation3);
        double d7 = f15 -= f16;
        double d9 = Math.hypot(d5, d7);
        d5 = n3;
        d7 = Math.min(d2, d9);
        d5 = Math.min(d5, d7);
        f12 = (float)d5;
        double d12 = f12;
        f16 = -f5;
        float f17 = 2.0f;
        double d13 = Math.tan(Math.toRadians(f16 /= f17)) * d12;
        double d14 = d2 - d13;
        Object object5 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        if (object5 > 0) {
            f8 = (float)(d2 -= d13);
            shapePath$PathLineOperation3 = new RectF(0.0f, 0.0f, f8, 0.0f);
            this.renderMatrix.set(matrix);
            object3 = this.renderMatrix;
            f11 = this.startX;
            f6 = this.startY;
            object3.preTranslate(f11, f6);
            object3 = this.renderMatrix;
            f11 = this.getStartAngle();
            object3.preRotate(f11);
            object3 = this.renderMatrix;
            shadowRenderer.drawEdgeShadow(canvas, (Matrix)object3, (RectF)shapePath$PathLineOperation3, n3);
        }
        f8 = 2.0f * f12;
        shapePath$PathLineOperation3 = new RectF(0.0f, 0.0f, f8, f8);
        shapePath$InnerCornerShadowOperation.renderMatrix.set(matrix2);
        Object object6 = shapePath$InnerCornerShadowOperation.renderMatrix;
        float f18 = ShapePath$PathLineOperation.access$000(shapePath$InnerCornerShadowOperation.operation1);
        object = shapePath$InnerCornerShadowOperation.operation1;
        float f19 = ShapePath$PathLineOperation.access$100((ShapePath$PathLineOperation)object);
        object6.preTranslate(f18, f19);
        object6 = shapePath$InnerCornerShadowOperation.renderMatrix;
        f18 = this.getStartAngle();
        object6.preRotate(f18);
        object6 = shapePath$InnerCornerShadowOperation.renderMatrix;
        double d15 = -d13 - d12;
        f18 = (float)d15;
        f19 = -2.0f * f12;
        object6.preTranslate(f18, f19);
        Object object7 = shapePath$InnerCornerShadowOperation.renderMatrix;
        int n4 = (int)f12;
        f11 = (float)(d12 += d13);
        object4 = new float[2];
        f12 = 0.0f;
        object4[0] = f11;
        int n7 = 1;
        f11 = Float.MIN_VALUE;
        object4[n7] = f8;
        int n8 = 1138819072;
        float f20 = 450.0f;
        object3 = shadowRenderer;
        object6 = canvas;
        shapePath$PathLineOperation = object7;
        shapePath$PathLineOperation2 = shapePath$PathLineOperation3;
        object7 = object4;
        object5 = n8;
        f16 = f20;
        shadowRenderer.drawInnerCornerShadow(canvas, (Matrix)shapePath$PathLineOperation, (RectF)shapePath$PathLineOperation3, n4, f20, f5, (float[])object4);
        object2 = d9 == d13 ? 0 : (d9 > d13 ? 1 : -1);
        if (object2 > 0) {
            f11 = (float)(d9 -= d13);
            object3 = new RectF(0.0f, 0.0f, f11, 0.0f);
            shapePath$InnerCornerShadowOperation.renderMatrix.set(matrix2);
            matrix2 = shapePath$InnerCornerShadowOperation.renderMatrix;
            f11 = ShapePath$PathLineOperation.access$000(shapePath$InnerCornerShadowOperation.operation1);
            f12 = ShapePath$PathLineOperation.access$100(shapePath$InnerCornerShadowOperation.operation1);
            matrix2.preTranslate(f11, f12);
            matrix2 = shapePath$InnerCornerShadowOperation.renderMatrix;
            f11 = this.getEndAngle();
            matrix2.preRotate(f11);
            matrix2 = shapePath$InnerCornerShadowOperation.renderMatrix;
            f11 = (float)d13;
            f12 = 0.0f;
            shapePath$PathLineOperation = null;
            matrix2.preTranslate(f11, 0.0f);
            matrix2 = shapePath$InnerCornerShadowOperation.renderMatrix;
            object6 = shadowRenderer;
            shapePath$PathLineOperation2 = canvas;
            shadowRenderer.drawEdgeShadow(canvas, matrix2, (RectF)object3, n3);
        }
    }

    public float getEndAngle() {
        float f5 = ShapePath$PathLineOperation.access$100(this.operation2);
        float f6 = ShapePath$PathLineOperation.access$100(this.operation1);
        f5 -= f6;
        f6 = ShapePath$PathLineOperation.access$000(this.operation2);
        float f7 = ShapePath$PathLineOperation.access$000(this.operation1);
        return (float)Math.toDegrees(Math.atan(f5 / (f6 -= f7)));
    }

    public float getStartAngle() {
        float f5 = ShapePath$PathLineOperation.access$100(this.operation1);
        float f6 = this.startY;
        f5 -= f6;
        f6 = ShapePath$PathLineOperation.access$000(this.operation1);
        float f7 = this.startX;
        return (float)Math.toDegrees(Math.atan(f5 / (f6 -= f7)));
    }

    public float getSweepAngle() {
        float f5 = this.getEndAngle();
        float f6 = this.getStartAngle();
        f5 -= f6;
        f6 = 360.0f;
        float f7 = 180.0f;
        float f8 = (f5 = (f5 + f6) % f6) - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object <= 0) {
            return f5;
        }
        return f5 - f6;
    }
}

