/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.ShapePath$PathOperation;

public class ShapePath$PathArcOperation
extends ShapePath$PathOperation {
    private static final RectF rectF;
    public float bottom;
    public float left;
    public float right;
    public float startAngle;
    public float sweepAngle;
    public float top;

    static {
        RectF rectF;
        ShapePath$PathArcOperation.rectF = rectF = new RectF();
    }

    public ShapePath$PathArcOperation(float f5, float f6, float f7, float f8) {
        this.setLeft(f5);
        this.setTop(f6);
        this.setRight(f7);
        this.setBottom(f8);
    }

    public static /* synthetic */ float access$1000(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getLeft();
    }

    public static /* synthetic */ float access$1100(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getTop();
    }

    public static /* synthetic */ float access$1200(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getRight();
    }

    public static /* synthetic */ float access$1300(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getBottom();
    }

    public static /* synthetic */ void access$600(ShapePath$PathArcOperation shapePath$PathArcOperation, float f5) {
        shapePath$PathArcOperation.setStartAngle(f5);
    }

    public static /* synthetic */ void access$700(ShapePath$PathArcOperation shapePath$PathArcOperation, float f5) {
        shapePath$PathArcOperation.setSweepAngle(f5);
    }

    public static /* synthetic */ float access$800(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getStartAngle();
    }

    public static /* synthetic */ float access$900(ShapePath$PathArcOperation shapePath$PathArcOperation) {
        return shapePath$PathArcOperation.getSweepAngle();
    }

    private float getBottom() {
        return this.bottom;
    }

    private float getLeft() {
        return this.left;
    }

    private float getRight() {
        return this.right;
    }

    private float getStartAngle() {
        return this.startAngle;
    }

    private float getSweepAngle() {
        return this.sweepAngle;
    }

    private float getTop() {
        return this.top;
    }

    private void setBottom(float f5) {
        this.bottom = f5;
    }

    private void setLeft(float f5) {
        this.left = f5;
    }

    private void setRight(float f5) {
        this.right = f5;
    }

    private void setStartAngle(float f5) {
        this.startAngle = f5;
    }

    private void setSweepAngle(float f5) {
        this.sweepAngle = f5;
    }

    private void setTop(float f5) {
        this.top = f5;
    }

    public void applyToPath(Matrix matrix, Path path) {
        Matrix matrix2 = this.matrix;
        matrix.invert(matrix2);
        path.transform(matrix2);
        matrix2 = rectF;
        float f5 = this.getLeft();
        float f6 = this.getTop();
        float f7 = this.getRight();
        float f8 = this.getBottom();
        matrix2.set(f5, f6, f7, f8);
        f5 = this.getStartAngle();
        f6 = this.getSweepAngle();
        path.arcTo((RectF)matrix2, f5, f6, false);
        path.transform(matrix);
    }
}

