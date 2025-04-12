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
import com.google.android.material.shape.ShapePath;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;
import java.util.List;

class ShapePath$1
extends ShapePath$ShadowCompatOperation {
    final /* synthetic */ ShapePath this$0;
    final /* synthetic */ List val$operations;
    final /* synthetic */ Matrix val$transformCopy;

    public ShapePath$1(ShapePath shapePath, List list, Matrix matrix) {
        this.this$0 = shapePath;
        this.val$operations = list;
        this.val$transformCopy = matrix;
    }

    public void draw(Matrix object, ShadowRenderer shadowRenderer, int n3, Canvas canvas) {
        boolean bl2;
        object = this.val$operations.iterator();
        while (bl2 = object.hasNext()) {
            ShapePath$ShadowCompatOperation shapePath$ShadowCompatOperation = (ShapePath$ShadowCompatOperation)object.next();
            Matrix matrix = this.val$transformCopy;
            shapePath$ShadowCompatOperation.draw(matrix, shadowRenderer, n3, canvas);
        }
    }
}

