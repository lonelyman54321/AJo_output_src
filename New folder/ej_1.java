/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 */
import android.graphics.Matrix;
import android.view.View;

/*
 * Renamed from EJ
 */
public final class ej_1
implements DJ {
    public final float[] a;
    public final int[] b;

    public ej_1(float[] objectArray) {
        this.a = objectArray;
        objectArray = new int[2];
        this.b = (int[])objectArray;
    }

    public final void a(View view, float[] fArray) {
        QK1.d(fArray);
        this.b(view, fArray);
    }

    public final void b(View view, float[] fArray) {
        Object object;
        Object object2 = view.getParent();
        int n3 = object2 instanceof View;
        float[] fArray2 = this.a;
        if (n3 != 0) {
            object2 = (View)object2;
            this.b((View)object2, fArray);
            float f5 = -((float)view.getScrollX());
            float f6 = -((float)view.getScrollY());
            QK1.d(fArray2);
            QK1.i(fArray2, f5, f6);
            Fg.b(fArray, fArray2);
            object = view.getLeft();
            f5 = object;
            n3 = view.getTop();
            f6 = n3;
            QK1.d(fArray2);
            QK1.i(fArray2, f5, f6);
            Fg.b(fArray, fArray2);
        } else {
            object2 = this.b;
            view.getLocationInWindow((int[])object2);
            float f7 = -((float)view.getScrollX());
            float f8 = -((float)view.getScrollY());
            QK1.d(fArray2);
            QK1.i(fArray2, f7, f8);
            Fg.b(fArray, fArray2);
            n3 = object2[0];
            f7 = n3;
            int n4 = 1;
            f8 = Float.MIN_VALUE;
            object = object2[n4];
            float f11 = object;
            QK1.d(fArray2);
            QK1.i(fArray2, f7, f11);
            Fg.b(fArray, fArray2);
        }
        view = view.getMatrix();
        object = view.isIdentity();
        if (object == 0) {
            wu1_2.c((Matrix)view, fArray2);
            Fg.b(fArray, fArray2);
        }
    }
}

