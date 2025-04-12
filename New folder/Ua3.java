/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class Ua3 {
    public zf0_1 a;
    public int[] b;
    public float[] c;
    public int d;
    public String e;

    public Ua3() {
        int n3 = 10;
        int[] nArray = new int[n3];
        this.b = nArray;
        float[] fArray = new float[n3];
        this.c = fArray;
    }

    public final float a(float f5) {
        zf0_1 zf0_12 = this.a;
        double d2 = f5;
        return (float)zf0_12.b(d2);
    }

    public void b(float f5, int n3) {
        Object[] objectArray = this.b;
        int n4 = objectArray.length;
        int n7 = this.d + 1;
        if (n4 < n7) {
            n4 = objectArray.length * 2;
            this.b = objectArray = Arrays.copyOf(objectArray, n4);
            objectArray = this.c;
            n4 = objectArray.length * 2;
            objectArray = Arrays.copyOf((float[])objectArray, n4);
            this.c = objectArray;
        }
        objectArray = this.b;
        n4 = this.d;
        objectArray[n4] = n3;
        this.c[n4] = f5;
        this.d = ++n4;
    }

    public void c(int n3) {
        int n4;
        Ua3 ua3 = this;
        int n7 = this.d;
        if (n7 == 0) {
            return;
        }
        Object[] objectArray = this.b;
        float[] fArray = this.c;
        int n8 = 1;
        int n10 = objectArray.length + 10;
        Object object = new int[n10];
        object[0] = n7 -= n8;
        object[n8] = 0;
        n7 = 2;
        int n14 = 2;
        float f5 = 2.8E-45f;
        while (n14 > 0) {
            n4 = n14 + -1;
            int n15 = object[n4];
            int n16 = n14 + -2;
            int n17 = object[n16];
            if (n15 < n17) {
                float f6;
                int n18;
                int n19 = objectArray[n17];
                int n20 = n15;
                for (n18 = n15; n18 < n17; ++n18) {
                    float f7;
                    int n21 = objectArray[n18];
                    if (n21 > n19) continue;
                    int n22 = objectArray[n20];
                    objectArray[n20] = n21;
                    objectArray[n18] = n22;
                    float f8 = fArray[n20];
                    fArray[n20] = f7 = fArray[n18];
                    fArray[n18] = f8;
                    ++n20;
                }
                n19 = objectArray[n20];
                objectArray[n20] = n18 = objectArray[n17];
                objectArray[n17] = n19;
                float f11 = fArray[n20];
                fArray[n20] = f6 = fArray[n17];
                fArray[n17] = f11;
                object[n16] = n19 = n20 + -1;
                object[n4] = n15;
                n4 = n14 + 1;
                object[n14] = n17;
                n14 += 2;
                object[n4] = ++n20;
                continue;
            }
            n14 = n16;
        }
        int n24 = 1;
        for (int i3 = 1; i3 < (n10 = ua3.d); ++i3) {
            object = ua3.b;
            n14 = i3 + -1;
            n10 = object[i3];
            if ((n14 = object[n14]) == n10) continue;
            ++n24;
        }
        objectArray = new double[n24];
        Object object2 = new int[n7];
        object2[n8] = n8;
        object2[0] = n24;
        object2 = (double[][])Array.newInstance(Double.TYPE, object2);
        fArray = null;
        n8 = 0;
        for (n24 = 0; n24 < (n10 = ua3.d); ++n24) {
            if (n24 > 0 && (n14 = (object = ua3.b)[n24]) == (n10 = object[n4 = n24 + -1])) continue;
            n10 = ua3.b[n24];
            double d2 = n10;
            double d5 = 0.01;
            objectArray[n8] = (int)(d2 *= d5);
            object = object2[n8];
            float[] fArray2 = ua3.c;
            f5 = fArray2[n24];
            d2 = f5;
            object[0] = (int)d2;
            ++n8;
        }
        n24 = n3;
        object2 = zf0_1.a(n3, objectArray, (double[][])object2);
        ua3.a = object2;
    }

    public final String toString() {
        int n3;
        CharSequence charSequence = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i3 = 0; i3 < (n3 = this.d); ++i3) {
            charSequence = nn_2.a((String)charSequence, "[");
            n3 = this.b[i3];
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(" , ");
            float f5 = this.c[i3];
            double d2 = f5;
            String string2 = decimalFormat.format(d2);
            ((StringBuilder)charSequence).append(string2);
            string2 = "] ";
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

