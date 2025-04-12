/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.Matrix
 */
package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public final class h$b
implements TypeEvaluator {
    public final float[] a;
    public final float[] b;
    public final Matrix c;

    public h$b() {
        int n3 = 9;
        float[] fArray = new float[n3];
        this.a = fArray;
        Object object = new float[n3];
        this.b = object;
        object = new Matrix;
        this.c = (Matrix)object;
    }

    public final Object evaluate(float f5, Object object, Object object2) {
        object = (Matrix)object;
        object2 = (Matrix)object2;
        float[] fArray = this.a;
        object.getValues(fArray);
        object = this.b;
        object2.getValues((float[])object);
        int n3 = 0;
        object2 = null;
        while (true) {
            int n4 = 9;
            float f6 = 1.3E-44f;
            if (n3 >= n4) break;
            f6 = (float)object[n3];
            float f7 = fArray[n3];
            f6 = xu0_1.a(f6, f7, f5, f7);
            object[n3] = f6;
            ++n3;
        }
        Matrix matrix = this.c;
        matrix.setValues((float[])object);
        return matrix;
    }
}

