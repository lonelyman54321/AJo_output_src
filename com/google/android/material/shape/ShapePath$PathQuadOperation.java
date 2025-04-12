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

public class ShapePath$PathQuadOperation
extends ShapePath$PathOperation {
    public float controlX;
    public float controlY;
    public float endX;
    public float endY;

    public static /* synthetic */ void access$200(ShapePath$PathQuadOperation shapePath$PathQuadOperation, float f5) {
        shapePath$PathQuadOperation.setControlX(f5);
    }

    public static /* synthetic */ void access$300(ShapePath$PathQuadOperation shapePath$PathQuadOperation, float f5) {
        shapePath$PathQuadOperation.setControlY(f5);
    }

    public static /* synthetic */ void access$400(ShapePath$PathQuadOperation shapePath$PathQuadOperation, float f5) {
        shapePath$PathQuadOperation.setEndX(f5);
    }

    public static /* synthetic */ void access$500(ShapePath$PathQuadOperation shapePath$PathQuadOperation, float f5) {
        shapePath$PathQuadOperation.setEndY(f5);
    }

    private float getControlX() {
        return this.controlX;
    }

    private float getControlY() {
        return this.controlY;
    }

    private float getEndX() {
        return this.endX;
    }

    private float getEndY() {
        return this.endY;
    }

    private void setControlX(float f5) {
        this.controlX = f5;
    }

    private void setControlY(float f5) {
        this.controlY = f5;
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
        float f5 = this.getControlX();
        float f6 = this.getControlY();
        float f7 = this.getEndX();
        float f8 = this.getEndY();
        path.quadTo(f5, f6, f7, f8);
        path.transform(matrix);
    }
}

