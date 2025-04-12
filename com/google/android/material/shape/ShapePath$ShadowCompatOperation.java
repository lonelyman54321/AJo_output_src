/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 */
package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;

abstract class ShapePath$ShadowCompatOperation {
    static final Matrix IDENTITY_MATRIX;
    final Matrix renderMatrix;

    static {
        Matrix matrix;
        IDENTITY_MATRIX = matrix = new Matrix();
    }

    public ShapePath$ShadowCompatOperation() {
        Matrix matrix;
        this.renderMatrix = matrix = new Matrix();
    }

    public abstract void draw(Matrix var1, ShadowRenderer var2, int var3, Canvas var4);

    public final void draw(ShadowRenderer shadowRenderer, int n3, Canvas canvas) {
        Matrix matrix = IDENTITY_MATRIX;
        this.draw(matrix, shadowRenderer, n3, canvas);
    }
}

