/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from zf0
 */
public abstract class zf0_1 {
    public static zf0_1 a(int n3, double[] dArray, double[][] dArray2) {
        int n4 = dArray.length;
        int n7 = 1;
        int n8 = 2;
        if (n4 == n7) {
            n3 = 2;
        }
        if (n3 != 0) {
            n4 = 0;
            if (n3 != n8) {
                au1_1 au1_12 = new Object();
                double[] dArray3 = dArray2[0];
                n7 = dArray3.length;
                double[] dArray4 = new double[n7];
                au1_12.c = dArray4;
                au1_12.a = dArray;
                au1_12.b = dArray2;
                if (n7 > n8) {
                    int n10;
                    double d2;
                    double d5 = d2 = 0.0;
                    for (int i3 = 0; i3 < (n10 = dArray.length); ++i3) {
                        double[] dArray5 = dArray2[i3];
                        double d7 = dArray5[0];
                        if (i3 > 0) {
                            d2 = d7 - d2;
                            d5 = d7 - d5;
                            Math.hypot(d2, d5);
                        }
                        d2 = d7;
                        d5 = d7;
                    }
                }
                return au1_12;
            }
            double d9 = dArray[0];
            dArray = dArray2[0];
            zf0$a zf0$a = new Object();
            zf0$a.a = d9;
            zf0$a.b = dArray;
            return zf0$a;
        }
        XP1 xP1 = new XP1(dArray, dArray2);
        return xP1;
    }

    public abstract double b(double var1);

    public abstract void c(double var1, double[] var3);

    public abstract void d(double var1, float[] var3);

    public abstract double e(double var1);

    public abstract void f(double var1, double[] var3);

    public abstract double[] g();
}

