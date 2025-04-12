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

public final class SD3$b
extends sd3_0 {
    public String k;
    public SparseArray l;
    public SparseArray m;
    public float[] n;

    public SD3$b() {
        throw null;
    }

    public final void b(float f5, float f6, float f7, int n3, int n4) {
        RuntimeException runtimeException = new RuntimeException("Wrong call for custom attribute");
        throw runtimeException;
    }

    public final void c(int n3) {
        int n4;
        SD3$b sD3$b = this;
        Object object = this.l;
        int n7 = object.size();
        a a2 = (a)object.valueAt(0);
        int n8 = a2.c();
        double[] dArray = new double[n7];
        int n10 = n8 + 2;
        Object[] objectArray = new float[n10];
        this.n = objectArray;
        objectArray = new float[n8];
        this.g = objectArray;
        objectArray = new int[2];
        int n14 = 1;
        objectArray[n14] = n10;
        objectArray[0] = n7;
        double[][] dArray2 = (double[][])Array.newInstance(Double.TYPE, (int[])objectArray);
        objectArray = null;
        for (n4 = 0; n4 < n7; ++n4) {
            Object object2;
            int n15;
            int n16 = object.keyAt(n4);
            Object object3 = (a)object.valueAt(n4);
            float[] fArray = (float[])sD3$b.m.valueAt(n4);
            double d2 = n16;
            double d5 = 0.01;
            dArray[n4] = d2 *= d5;
            Object[] objectArray2 = sD3$b.n;
            ((a)object3).b((float[])objectArray2);
            objectArray2 = null;
            for (n16 = 0; n16 < (n15 = ((Object)(object3 = (Object)sD3$b.n)).length); ++n16) {
                double d7;
                double[] dArray3 = dArray2[n4];
                object2 = object3[n16];
                dArray3[n16] = d7 = (double)object2;
            }
            objectArray2 = dArray2[n4];
            object2 = fArray[0];
            d2 = (double)object2;
            objectArray2[n8] = (float)d2;
            int n17 = n8 + 1;
            float f5 = fArray[n14];
            double d9 = f5;
            objectArray2[n17] = (float)d9;
        }
        n4 = n3;
        object = zf0_1.a(n3, dArray, dArray2);
        sD3$b.a = object;
    }

    public final boolean e(float f5, long l2, Tn1 tn1, View view) {
        float[] fArray;
        int n3;
        Object object;
        String string2;
        SD3$b sD3$b = this;
        long l3 = l2;
        View view2 = view;
        Object object2 = this.a;
        float f6 = f5;
        double d2 = f5;
        float[] fArray2 = this.n;
        ((zf0_1)object2).d(d2, fArray2);
        object2 = this.n;
        int n4 = ((Object)object2).length + -2;
        f6 = (float)object2[n4];
        int n7 = ((Object)object2).length;
        int n8 = 1;
        Object object3 = object2[n7 -= n8];
        long l4 = this.i;
        l4 = l2 - l4;
        float f7 = this.j;
        n7 = (int)(Float.isNaN(f7) ? 1 : 0);
        if (n7 != 0) {
            string2 = this.k;
            object = tn1;
            this.j = f7 = tn1.a(view, string2);
            n7 = (int)(Float.isNaN(f7) ? 1 : 0);
            if (n7 != 0) {
                this.j = 0.0f;
            }
        }
        double d5 = sD3$b.j;
        double d7 = (double)l4 * 1.0E-9;
        double d9 = f6;
        d7 = d7 * d9 + d5;
        d5 = 1.0;
        sD3$b.j = f7 = (float)(d7 %= d5);
        sD3$b.i = l3;
        float f8 = sD3$b.a(f7);
        float[] fArray3 = null;
        sD3$b.h = false;
        f7 = 0.0f;
        string2 = null;
        for (n7 = 0; n7 < (n3 = (fArray = sD3$b.g).length); ++n7) {
            n3 = (int)(sD3$b.h ? 1 : 0);
            object = sD3$b.n;
            reference var34_27 = object[n7];
            double d12 = (double)var34_27;
            double d13 = 0.0;
            double d14 = d12 - d13;
            Object object4 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            int n10 = object4 != false ? 1 : 0;
            sD3$b.h = n3 |= n10;
            var34_27 = var34_27 * f8 + object3;
            fArray[n7] = (float)var34_27;
        }
        a a2 = (a)sD3$b.l.valueAt(0);
        fArray3 = sD3$b.g;
        Qf0.b(a2, view2, fArray3);
        float f11 = f6 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            sD3$b.h = n8;
        }
        return sD3$b.h;
    }
}

