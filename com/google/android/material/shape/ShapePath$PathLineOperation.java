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

public class ShapePath$PathLineOperation
extends ShapePath$PathOperation {
    private float x;
    private float y;

    public static /* synthetic */ float access$000(ShapePath$PathLineOperation shapePath$PathLineOperation) {
        return shapePath$PathLineOperation.x;
    }

    public static /* synthetic */ float access$002(ShapePath$PathLineOperation shapePath$PathLineOperation, float f5) {
        shapePath$PathLineOperation.x = f5;
        return f5;
    }

    public static /* synthetic */ float access$100(ShapePath$PathLineOperation shapePath$PathLineOperation) {
        return shapePath$PathLineOperation.y;
    }

    public static /* synthetic */ float access$102(ShapePath$PathLineOperation shapePath$PathLineOperation, float f5) {
        shapePath$PathLineOperation.y = f5;
        return f5;
    }

    public void applyToPath(Matrix matrix, Path path) {
        Matrix matrix2 = this.matrix;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f5 = this.x;
        float f6 = this.y;
        path.lineTo(f5, f6);
        path.transform(matrix);
    }
}

