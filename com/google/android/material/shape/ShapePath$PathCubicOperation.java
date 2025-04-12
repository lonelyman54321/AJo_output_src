/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.material.shape.ShapePath$PathOperation;

public class ShapePath$PathCubicOperation
extends ShapePath$PathOperation {
    private float controlX1;
    private float controlX2;
    private float controlY1;
    private float controlY2;
    private float endX;
    private float endY;

    public ShapePath$PathCubicOperation(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.setControlX1(f5);
        this.setControlY1(f6);
        this.setControlX2(f7);
        this.setControlY2(f8);
        this.setEndX(f11);
        this.setEndY(f12);
    }

    private float getControlX1() {
        return this.controlX1;
    }

    private float getControlX2() {
        return this.controlX2;
    }

    private float getControlY1() {
        return this.controlY1;
    }

    private float getControlY2() {
        return this.controlY1;
    }

    private float getEndX() {
        return this.endX;
    }

    private float getEndY() {
        return this.endY;
    }

    private void setControlX1(float f5) {
        this.controlX1 = f5;
    }

    private void setControlX2(float f5) {
        this.controlX2 = f5;
    }

    private void setControlY1(float f5) {
        this.controlY1 = f5;
    }

    private void setControlY2(float f5) {
        this.controlY2 = f5;
    }

    private void setEndX(float f5) {
        this.endX = f5;
    }

    private void setEndY(float f5) {
        this.endY = f5;
    }

    public void applyToPath(Matrix matrix, Path path) {
        Matrix matrix2 = this.matrix;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f5 = this.controlX1;
        float f6 = this.controlY1;
        float f7 = this.controlX2;
        float f8 = this.controlY2;
        float f11 = this.endX;
        float f12 = this.endY;
        path.cubicTo(f5, f6, f7, f8, f11, f12);
        path.transform(matrix);
    }
}

