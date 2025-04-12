/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.View
 */
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;

public final class JD3$b
extends jd3_0 {
    public SparseArray f;
    public float[] g;

    public JD3$b() {
        throw null;
    }

    public final void b(float f5, int n3) {
        RuntimeException runtimeException = new RuntimeException("call of custom attribute setPoint");
        throw runtimeException;
    }

    public final void c(int n3) {
        zf0_1 zf0_12;
        SparseArray sparseArray = this.f;
        int n4 = sparseArray.size();
        int n7 = ((a)sparseArray.valueAt(0)).c();
        double[] dArray = new double[n4];
        Object[] objectArray = new float[n7];
        this.g = objectArray;
        objectArray = new int[2];
        int n8 = 1;
        objectArray[n8] = n7;
        objectArray[0] = n4;
        double[][] dArray2 = (double[][])Array.newInstance(Double.TYPE, (int[])objectArray);
        objectArray = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n10;
            n8 = sparseArray.keyAt(i3);
            Object object = (a)sparseArray.valueAt(i3);
            double d2 = n8;
            double d5 = 0.01;
            dArray[i3] = d2 *= d5;
            float[] fArray = this.g;
            ((a)object).b(fArray);
            fArray = null;
            for (n8 = 0; n8 < (n10 = ((Object)(object = (Object)this.g)).length); ++n8) {
                double d7;
                double[] dArray3 = dArray2[i3];
                Object object2 = object[n8];
                dArray3[n8] = d7 = (double)object2;
            }
        }
        this.a = zf0_12 = zf0_1.a(n3, dArray, dArray2);
    }

    public final void d(float f5, View view) {
        Object object = this.a;
        double d2 = f5;
        Object object2 = this.g;
        ((zf0_1)object).d(d2, (float[])object2);
        object2 = (a)this.f.valueAt(0);
        object = this.g;
        Qf0.b((a)object2, view, (float[])object);
    }
}

