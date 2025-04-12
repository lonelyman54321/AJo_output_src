/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
package com.google.android.material.floatingactionbutton;

import android.graphics.Matrix;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;

class FloatingActionButtonImpl$3
extends MatrixEvaluator {
    final /* synthetic */ FloatingActionButtonImpl this$0;

    public FloatingActionButtonImpl$3(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
    }

    public Matrix evaluate(float f5, Matrix matrix, Matrix matrix2) {
        FloatingActionButtonImpl.access$202(this.this$0, f5);
        return super.evaluate(f5, matrix, matrix2);
    }
}

