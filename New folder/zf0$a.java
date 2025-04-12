/*
 * Decompiled with CFR 0.152.
 */
public final class zf0$a
extends zf0_1 {
    public double a;
    public double[] b;

    public final double b(double d2) {
        return this.b[0];
    }

    public final void c(double d2, double[] dArray) {
        double[] dArray2 = this.b;
        int n3 = dArray2.length;
        System.arraycopy(dArray2, 0, dArray, 0, n3);
    }

    public final void d(double d2, float[] fArray) {
        double[] dArray;
        int n3;
        for (int i3 = 0; i3 < (n3 = (dArray = this.b).length); ++i3) {
            float f5;
            double d5 = dArray[i3];
            fArray[i3] = f5 = (float)d5;
        }
    }

    public final double e(double d2) {
        return 0.0;
    }

    public final void f(double d2, double[] dArray) {
        double[] dArray2;
        int n3;
        for (int i3 = 0; i3 < (n3 = (dArray2 = this.b).length); ++i3) {
            double d5;
            dArray[i3] = d5 = 0.0;
        }
    }

    public final double[] g() {
        double d2 = this.a;
        double[] dArray = new double[]{d2};
        return dArray;
    }
}

