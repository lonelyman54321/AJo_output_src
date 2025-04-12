/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.Matrix
 */
package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class MatrixEvaluator
implements TypeEvaluator {
    private final float[] tempEndValues;
    private final Matrix tempMatrix;
    private final float[] tempStartValues;

    public MatrixEvaluator() {
        int n3 = 9;
        float[] fArray = new float[n3];
        this.tempStartValues = fArray;
        Object object = new float[n3];
        this.tempEndValues = object;
        object = new Matrix;
        this.tempMatrix = (Matrix)object;
    }

    public Matrix evaluate(float f5, Matrix object, Matrix object2) {
        int n3;
        float[] fArray = this.tempStartValues;
        object.getValues(fArray);
        object = this.tempEndValues;
        object2.getValues((float[])object);
        object = null;
        for (int i3 = 0; i3 < (n3 = 9); ++i3) {
            object2 = this.tempEndValues;
            Object object3 = object2[i3];
            float[] fArray2 = this.tempStartValues;
            float f6 = fArray2[i3];
            object2[i3] = object3 = (Object)xu0_1.a((float)object3, f6, f5, f6);
        }
        Matrix matrix = this.tempMatrix;
        object = this.tempEndValues;
        matrix.setValues((float[])object);
        return this.tempMatrix;
    }
}

