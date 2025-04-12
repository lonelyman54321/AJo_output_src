/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.Quantiles$Scale;
import com.google.common.math.Quantiles$ScaleAndIndex;

public final class Quantiles {
    public static /* synthetic */ void access$300(int n3, int n4) {
        Quantiles.checkIndex(n3, n4);
    }

    public static /* synthetic */ double[] access$400(long[] lArray) {
        return Quantiles.longsToDoubles(lArray);
    }

    public static /* synthetic */ double[] access$500(int[] nArray) {
        return Quantiles.intsToDoubles(nArray);
    }

    public static /* synthetic */ boolean access$600(double[] dArray) {
        return Quantiles.containsNaN(dArray);
    }

    public static /* synthetic */ void access$700(int n3, double[] dArray, int n4, int n7) {
        Quantiles.selectInPlace(n3, dArray, n4, n7);
    }

    public static /* synthetic */ double access$800(double d2, double d5, double d7, double d9) {
        return Quantiles.interpolate(d2, d5, d7, d9);
    }

    public static /* synthetic */ void access$900(int[] nArray, int n3, int n4, double[] dArray, int n7, int n8) {
        Quantiles.selectAllInPlace(nArray, n3, n4, dArray, n7, n8);
    }

    private static void checkIndex(int n3, int n4) {
        if (n3 >= 0 && n3 <= n4) {
            return;
        }
        String string2 = hj0_0.a(n4, "Quantile indexes must be between 0 and the scale, which is ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    private static int chooseNextSelection(int[] nArray, int n3, int n4, int n7, int n8) {
        int n10;
        if (n3 == n4) {
            return n3;
        }
        n7 += n8;
        n8 = n7 >>> 1;
        while (n4 > (n10 = n3 + 1)) {
            n10 = n3 + n4 >>> 1;
            int n14 = nArray[n10];
            if (n14 > n8) {
                n4 = n10;
                continue;
            }
            if (n14 < n8) {
                n3 = n10;
                continue;
            }
            return n10;
        }
        n8 = nArray[n3];
        n7 -= n8;
        int n15 = nArray[n4];
        if ((n7 -= n15) > 0) {
            return n4;
        }
        return n3;
    }

    private static boolean containsNaN(double ... dArray) {
        for (double d2 : dArray) {
            boolean bl2 = Double.isNaN(d2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private static double interpolate(double d2, double d5, double d7, double d9) {
        double d12 = 1.0 / 0.0;
        double d13 = -1.0 / 0.0;
        double d14 = d2 - d13;
        Object object = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        if (object == false) {
            Object object2 = d5 == d12 ? 0 : (d5 > d12 ? 1 : -1);
            if (object2 == false) {
                return 0.0 / 0.0;
            }
            return d13;
        }
        Object object3 = d5 == d12 ? 0 : (d5 > d12 ? 1 : -1);
        if (object3 == false) {
            return d12;
        }
        return (d5 - d2) * d7 / d9 + d2;
    }

    private static double[] intsToDoubles(int[] nArray) {
        int n3 = nArray.length;
        double[] dArray = new double[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2;
            int n4 = nArray[i3];
            dArray[i3] = d2 = (double)n4;
        }
        return dArray;
    }

    private static double[] longsToDoubles(long[] lArray) {
        int n3 = lArray.length;
        double[] dArray = new double[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2;
            long l2 = lArray[i3];
            dArray[i3] = d2 = (double)l2;
        }
        return dArray;
    }

    public static Quantiles$ScaleAndIndex median() {
        return Quantiles.scale(2).index(1);
    }

    private static void movePivotToStartOfSlice(double[] dArray, int n3, int n4) {
        int n7 = n3 + n4;
        double d2 = dArray[n4];
        int n8 = 1;
        double d5 = dArray[n7 >>>= n8];
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        object = object < 0 ? (Object)true : (Object)false;
        double d9 = dArray[n3];
        double d12 = d5 == d9 ? 0 : (d5 < d9 ? -1 : 1);
        boolean bl2 = d12 < 0;
        Object object2 = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1);
        if (object2 >= 0) {
            n8 = 0;
        }
        if (object == bl2) {
            Quantiles.swap(dArray, n7, n3);
        } else if (object != n8) {
            Quantiles.swap(dArray, n3, n4);
        }
    }

    private static int partition(double[] dArray, int n3, int n4) {
        Quantiles.movePivotToStartOfSlice(dArray, n3, n4);
        double d2 = dArray[n3];
        int n7 = n4;
        while (n4 > n3) {
            double d5 = dArray[n4];
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object > 0) {
                Quantiles.swap(dArray, n7, n4);
                n7 += -1;
            }
            n4 += -1;
        }
        Quantiles.swap(dArray, n3, n7);
        return n7;
    }

    public static Quantiles$Scale percentiles() {
        return Quantiles.scale(100);
    }

    public static Quantiles$Scale quartiles() {
        return Quantiles.scale(4);
    }

    public static Quantiles$Scale scale(int n3) {
        Quantiles$Scale quantiles$Scale = new Quantiles$Scale(n3, null);
        return quantiles$Scale;
    }

    private static void selectAllInPlace(int[] nArray, int n3, int n4, double[] dArray, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        int n16 = Quantiles.chooseNextSelection(nArray, n3, n4, n7, n8);
        int n17 = nArray[n16];
        Quantiles.selectInPlace(n17, dArray, n7, n8);
        for (n15 = n14 = n16 + -1; n15 >= n3 && (n14 = nArray[n15]) == n17; n15 += -1) {
        }
        if (n15 >= n3) {
            int n18 = n17 + -1;
            Quantiles.selectAllInPlace(nArray, n3, n15, dArray, n7, n18);
        }
        for (n10 = ++n16; n10 <= n4 && (n3 = nArray[n10]) == n17; ++n10) {
        }
        if (n10 <= n4) {
            int n19 = n17 + 1;
            Quantiles.selectAllInPlace(nArray, n10, n4, dArray, n19, n8);
        }
    }

    private static void selectInPlace(int n3, double[] dArray, int n4, int n7) {
        if (n3 == n4) {
            int n8 = n4;
            for (n3 = n4 + 1; n3 <= n7; ++n3) {
                double d2 = dArray[n8];
                double d5 = dArray[n3];
                double d7 = d2 - d5;
                Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                if (object <= 0) continue;
                n8 = n3;
            }
            if (n8 != n4) {
                Quantiles.swap(dArray, n8, n4);
            }
            return;
        }
        while (n7 > n4) {
            int n10 = Quantiles.partition(dArray, n4, n7);
            if (n10 >= n3) {
                n7 = n10 + -1;
            }
            if (n10 > n3) continue;
            n4 = ++n10;
        }
    }

    private static void swap(double[] dArray, int n3, int n4) {
        double d2;
        double d5 = dArray[n3];
        dArray[n3] = d2 = dArray[n4];
        dArray[n4] = d5;
    }
}

