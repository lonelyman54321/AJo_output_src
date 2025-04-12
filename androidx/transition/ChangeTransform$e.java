/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 */
package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

public final class ChangeTransform$e {
    public final Matrix a;
    public final View b;
    public final float[] c;
    public float d;
    public float e;

    public ChangeTransform$e(View object, float[] fArray) {
        Matrix matrix;
        this.a = matrix = new Matrix();
        this.b = object;
        object = (float[])fArray.clone();
        this.c = (float[])object;
        View view = object[2];
        this.d = (float)view;
        View view2 = object[5];
        this.e = (float)view2;
        this.a();
    }

    public final void a() {
        float f5;
        float f6 = this.d;
        Object object = this.c;
        object[2] = f6;
        object[5] = f5 = this.e;
        Matrix matrix = this.a;
        matrix.setValues((float[])object);
        object = ee3_0.a;
        View view = this.b;
        ((je3_0)object).e(view, matrix);
    }
}

