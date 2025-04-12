/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 *  android.view.ViewParent
 */
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/*
 * Renamed from GJ
 */
public final class gj_0
implements DJ {
    public final Matrix a;
    public final int[] b;

    public gj_0() {
        Object object;
        this.a = object = new Matrix();
        object = new int[2];
        this.b = (int[])object;
    }

    public void a(View view, float[] fArray) {
        boolean bl2;
        Matrix matrix = this.a;
        matrix.reset();
        FJ.b(view, matrix);
        Object object = view.getParent();
        while (bl2 = object instanceof View) {
            view = object;
            view = (View)object;
            object = view.getParent();
        }
        object = this.b;
        view.getLocationOnScreen((int[])object);
        ViewParent viewParent = object[0];
        int n3 = 1;
        ViewParent viewParent2 = object[n3];
        view.getLocationInWindow((int[])object);
        ViewParent viewParent3 = object[0];
        ViewParent viewParent4 = object[n3];
        float f5 = (float)(viewParent3 - viewParent);
        float f6 = (float)(viewParent4 - viewParent2);
        matrix.postTranslate(f5, f6);
        wu1_2.c(matrix, fArray);
    }
}

