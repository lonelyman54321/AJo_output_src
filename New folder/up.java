/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class up
extends zf0_1 {
    public final double[] a;
    public final up$a[] b;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public up(int[] nArray, double[] dArray, double[][] dArray2) {
        up up2 = this;
        double[] dArray3 = dArray;
        this.a = dArray;
        int n3 = dArray.length;
        int n4 = 1;
        up$a[] up$aArray = new up$a[n3 - n4];
        this.b = up$aArray;
        n3 = 0;
        up$aArray = null;
        int n7 = 0;
        int n8 = 1;
        float f5 = Float.MIN_VALUE;
        int n10 = 1;
        while (true) {
            void var13_13;
            double d2;
            double d5;
            double d7;
            double d9;
            double d12;
            double d13;
            up$a up$a;
            int n14;
            int n15;
            int n16;
            up$a[] up$aArray2;
            int n17;
            block28: {
                block24: {
                    block25: {
                        block26: {
                            block27: {
                                if (n7 >= (n17 = (up$aArray2 = up2.b).length)) {
                                    return;
                                }
                                n17 = nArray[n7];
                                n16 = 5;
                                n15 = 4;
                                n14 = 3;
                                if (n17 == 0) break block24;
                                if (n17 == n4) break block25;
                                int n18 = 2;
                                if (n17 == n18) break block26;
                                if (n17 == n14) break block27;
                                if (n17 != n15) {
                                    if (n17 == n16) {
                                        n10 = 5;
                                    }
                                    break block28;
                                } else {
                                    n10 = 4;
                                }
                                break block28;
                            }
                            if (n8 == n4) {
                                n8 = 2;
                                f5 = 2.8E-45f;
                            } else {
                                n8 = 1;
                                f5 = Float.MIN_VALUE;
                            }
                            n10 = n8;
                            break block28;
                        }
                        n8 = 2;
                        f5 = 2.8E-45f;
                        n10 = 2;
                        break block28;
                    }
                    n8 = 1;
                    f5 = Float.MIN_VALUE;
                    n10 = 1;
                    break block28;
                }
                n10 = 3;
            }
            double d14 = dArray3[n7];
            int n19 = n7 + 1;
            double d15 = d14;
            double d16 = dArray3[n19];
            double[] dArray4 = dArray2[n7];
            double d17 = dArray4[0];
            double d18 = dArray4[n4];
            dArray4 = dArray2[n19];
            int n20 = n19;
            double d19 = dArray4[0];
            int n21 = n7;
            int n22 = n8;
            float f6 = f5;
            double d20 = dArray4[n4];
            up$a.r = false;
            double d22 = d19 - d17;
            double d23 = d19;
            double d24 = d20 - d18;
            double d25 = 0.0;
            int n24 = 1;
            if (n10 != n24) {
                n24 = 4;
                if (n10 != n24) {
                    n24 = 5;
                    if (n10 != n24) {
                        n24 = 0;
                        up$a.q = false;
                    } else {
                        n24 = 0;
                        Object object = d24 == d25 ? 0 : (d24 < d25 ? -1 : 1);
                        if (object < 0) {
                            n24 = 1;
                        }
                        up$a.q = n24;
                    }
                } else {
                    n24 = (int)(d24 == d25 ? 0 : (d24 > d25 ? 1 : -1));
                    n24 = n24 > 0 ? 1 : 0;
                    up$a.q = n24;
                }
                d13 = d17;
                d17 = d15;
                n24 = 1;
            } else {
                up$a.q = n24;
                d13 = d17;
                d17 = d14;
            }
            up$a.c = d17;
            up$a.d = d16;
            d16 -= d17;
            up$a.i = d17 = 1.0 / d16;
            up$a[] up$aArray3 = up$aArray2;
            int n25 = 3;
            if (n25 == n10) {
                up$a.r = n24;
            }
            if ((n24 = (int)(up$a.r ? 1 : 0)) != 0 || (n24 = (int)((d12 = (d9 = Math.abs(d22)) - (d7 = 0.001)) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1))) < 0 || (n24 = (int)((d5 = (d9 = Math.abs(d24)) - d7) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) < 0) {
                up$a up$a2 = up$a;
                n17 = 1;
                up$a.r = n17;
                d25 = d17;
                d2 = d13;
                up$a.e = d13;
                d2 = d23;
                up$a.f = d23;
                up$a.g = d18;
                up$a.h = d20;
                up$a.b = d18 = Math.hypot(d24, d22);
                up$a.n = d18 *= d17;
                up$a.l = d22 /= d16;
                up$a.m = d24 /= d16;
            } else {
                int n26;
                double d26;
                double[] dArray5;
                double[] dArray6 = new double[101];
                up$a.a = dArray6;
                n16 = (int)(up$a.q ? 1 : 0);
                n14 = n16 != 0 ? -1 : 1;
                up$a.j = d16 = (double)n14 * d22;
                n14 = n16 != 0 ? 1 : -1;
                d16 = n14;
                up$a.k = d24 *= d16;
                d16 = n16 != 0 ? d23 : d13;
                up$a.l = d16;
                d16 = n16 != 0 ? d18 : d20;
                up$a.m = d16;
                d18 -= d20;
                d16 = d25;
                d24 = d25;
                double d27 = d25;
                n7 = 0;
                while (true) {
                    dArray5 = up$a.s;
                    n16 = 91;
                    n24 = 90;
                    if (n7 >= n16) break;
                    up$a up$a3 = up$a;
                    double d28 = (double)n7 * 90.0;
                    d23 = d16;
                    d26 = n24;
                    d28 = Math.toRadians(d28 / d26);
                    d17 = Math.sin(d28);
                    d28 = Math.cos(d28);
                    d17 *= d22;
                    d28 *= d18;
                    if (n7 > 0) {
                        d16 = d17 - d24;
                        d24 = d28 - d27;
                        dArray5[n7] = d16 = Math.hypot(d16, d24) + d23;
                    }
                    ++n7;
                    d27 = d28;
                    d24 = d17;
                    up$a = up$a3;
                }
                up$a up$a4 = up$a;
                up$a.b = d16;
                up2 = null;
                for (n26 = 0; n26 < n16; ++n26) {
                    double d29;
                    dArray5[n26] = d29 = dArray5[n26] / d16;
                }
                up2 = null;
                for (n26 = 0; n26 < (n3 = (dArray3 = up$a4.a).length); ++n26) {
                    d22 = n26;
                    n7 = dArray3.length;
                    n17 = 1;
                    d2 = n7 - n17;
                    if ((n7 = Arrays.binarySearch(dArray5, d22 /= d2)) >= 0) {
                        d22 = n7;
                        d2 = n24;
                        dArray3[n26] = d22 /= d2;
                        n17 = -1;
                        continue;
                    }
                    n17 = -1;
                    if (n7 == n17) {
                        dArray3[n26] = d25;
                        continue;
                    }
                    n7 = -n7;
                    n16 = n7 + -2;
                    n15 = 1;
                    d26 = n16;
                    d14 = dArray5[n16];
                    d22 -= d14;
                    d13 = dArray5[n7 -= n15] - d14;
                    d22 = d22 / d13 + d26;
                    d17 = n24;
                    dArray3[n26] = d22 /= d17;
                }
                d18 = up$a4.b;
                d22 = up$a4.i;
                up$a4.n = d18 *= d22;
            }
            up$aArray3[n21] = var13_13;
            up2 = this;
            dArray3 = dArray;
            n7 = n20;
            n8 = n22;
            f5 = f6;
            n3 = 0;
            up$aArray = null;
            n4 = 1;
        }
    }

    public final double b(double d2) {
        int n3;
        up$a[] up$aArray = this.b;
        up$a up$a = up$aArray[0];
        double d5 = up$a.c;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 -= d5;
            object = up$a.r;
            if (object != false) {
                double d9 = up$a.c(d5);
                double d12 = up$aArray[0].l;
                return d2 * d12 + d9;
            }
            up$a.g(d5);
            double d13 = up$aArray[0].e();
            return up$aArray[0].a() * d2 + d13;
        }
        int n4 = up$aArray.length + -1;
        up$a = up$aArray[n4];
        double d14 = up$a.d;
        double d15 = d2 - d14;
        Object object2 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            n3 = up$aArray.length + -1;
            double d16 = up$aArray[n3].d;
            d2 -= d16;
            int n7 = up$aArray.length + -1;
            d16 = up$aArray[n7].c(d16);
            d5 = up$aArray[n7].l;
            return d2 * d5 + d16;
        }
        for (n3 = 0; n3 < (n4 = up$aArray.length); ++n3) {
            up$a = up$aArray[n3];
            d5 = up$a.d;
            double d17 = d2 - d5;
            object = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
            if (object > 0) continue;
            boolean bl2 = up$a.r;
            if (bl2) {
                return up$a.c(d2);
            }
            up$a.g(d2);
            return up$aArray[n3].e();
        }
        return 0.0 / 0.0;
    }

    public final void c(double d2, double[] dArray) {
        int n3;
        Object object = this.b;
        Object object2 = object[0];
        double d5 = ((up$a)object2).c;
        int n4 = 1;
        Object object3 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object3 < 0) {
            d2 -= d5;
            object3 = ((up$a)object2).r;
            if (object3 != false) {
                double d7;
                double d9 = ((up$a)object2).c(d5);
                object2 = object[0];
                dArray[0] = d7 = ((up$a)object2).l * d2 + d9;
                double d12 = ((up$a)object2).d(d5);
                object = object[0];
                double d13 = ((up$a)object).m;
                dArray[n4] = d2 = d2 * d13 + d12;
            } else {
                double d14;
                double d15;
                ((up$a)object2).g(d5);
                double d16 = object[0].e();
                up$a up$a = object[0];
                dArray[0] = d15 = up$a.a() * d2 + d16;
                object2 = object[0];
                d16 = ((up$a)object2).f();
                object = object[0];
                dArray[n4] = d14 = ((up$a)object).b() * d2 + d16;
            }
            return;
        }
        int n7 = ((up$a[])object).length - n4;
        object2 = object[n7];
        double d17 = ((up$a)object2).d;
        double d18 = d2 - d17;
        Object object4 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
        if (object4 > 0) {
            n7 = ((up$a[])object).length - n4;
            object2 = object[n7];
            d17 = ((up$a)object2).d;
            double d19 = d2 - d17;
            object4 = ((up$a[])object).length - n4;
            Object object5 = object[object4];
            boolean bl2 = ((up$a)object5).r;
            if (bl2) {
                double d20;
                d2 = ((up$a)object5).c(d17);
                object5 = object[object4];
                dArray[0] = d20 = ((up$a)object5).l * d19 + d2;
                d2 = ((up$a)object5).d(d17);
                object = object[object4];
                double d22 = ((up$a)object).m;
                dArray[n4] = d19 = d19 * d22 + d2;
            } else {
                double d23;
                ((up$a)object5).g(d2);
                d2 = ((up$a)object[object4]).e();
                object2 = object[object4];
                dArray[0] = d17 = ((up$a)object2).a() * d19 + d2;
                Object object6 = object[object4];
                d2 = ((up$a)object6).f();
                object = object[object4];
                dArray[n4] = d23 = ((up$a)object).b() * d19 + d2;
            }
            return;
        }
        object2 = null;
        for (n7 = 0; n7 < (n3 = ((up$a[])object).length); ++n7) {
            up$a up$a = object[n7];
            double d24 = up$a.d;
            double d25 = d2 - d24;
            object4 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
            if (object4 > 0) continue;
            object4 = up$a.r;
            if (object4 != false) {
                dArray[0] = d5 = up$a.c(d2);
                dArray[n4] = d2 = ((up$a)object[n7]).d(d2);
                return;
            }
            up$a.g(d2);
            dArray[0] = d2 = ((up$a)object[n7]).e();
            dArray[n4] = d2 = ((up$a)object[n7]).f();
            return;
        }
    }

    public final void d(double d2, float[] fArray) {
        int n3;
        Object object = this.b;
        up$a up$a = object[0];
        double d5 = up$a.c;
        int n4 = 1;
        Object object2 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object2 < 0) {
            d2 -= d5;
            object2 = up$a.r;
            if (object2 != false) {
                float f5;
                float f6;
                double d7 = up$a.c(d5);
                up$a = object[0];
                double d9 = up$a.l * d2 + d7;
                fArray[0] = f6 = (float)d9;
                double d12 = up$a.d(d5);
                object = object[0];
                double d13 = ((up$a)object).m;
                d2 = d2 * d13 + d12;
                fArray[n4] = f5 = (float)d2;
            } else {
                float f7;
                float f8;
                up$a.g(d5);
                double d14 = object[0].e();
                up$a up$a2 = object[0];
                double d15 = up$a2.a() * d2 + d14;
                fArray[0] = f8 = (float)d15;
                up$a = object[0];
                d14 = up$a.f();
                object = object[0];
                double d16 = ((up$a)object).b() * d2 + d14;
                fArray[n4] = f7 = (float)d16;
            }
            return;
        }
        int n7 = ((up$a[])object).length - n4;
        up$a = object[n7];
        double d17 = up$a.d;
        double d18 = d2 - d17;
        Object object3 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
        if (object3 > 0) {
            n7 = ((up$a[])object).length - n4;
            up$a = object[n7];
            d17 = up$a.d;
            double d19 = d2 - d17;
            object3 = ((up$a[])object).length - n4;
            Object object4 = object[object3];
            boolean bl2 = ((up$a)object4).r;
            if (bl2) {
                float f11;
                d2 = ((up$a)object4).c(d17);
                object4 = object[object3];
                double d20 = ((up$a)object4).l * d19 + d2;
                fArray[0] = f11 = (float)d20;
                d2 = ((up$a)object4).d(d17);
                object = object[object3];
                double d22 = ((up$a)object).m;
                d19 = d19 * d22 + d2;
                fArray[n4] = f11 = (float)d19;
            } else {
                float f12;
                ((up$a)object4).g(d2);
                fArray[0] = f12 = (float)((up$a)object[object3]).e();
                Object object5 = object[object3];
                d2 = ((up$a)object5).f();
                fArray[n4] = f12 = (float)d2;
            }
            return;
        }
        float f14 = 0.0f;
        up$a = null;
        for (n7 = 0; n7 < (n3 = ((up$a[])object).length); ++n7) {
            float f15;
            up$a up$a3 = object[n7];
            double d23 = up$a3.d;
            double d24 = d2 - d23;
            object3 = d24 == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
            if (object3 > 0) continue;
            object3 = up$a3.r;
            if (object3 != false) {
                float f16;
                float f17;
                fArray[0] = f17 = (float)up$a3.c(d2);
                fArray[n4] = f16 = (float)((up$a)object[n7]).d(d2);
                return;
            }
            up$a3.g(d2);
            fArray[0] = f15 = (float)((up$a)object[n7]).e();
            fArray[n4] = f15 = (float)((up$a)object[n7]).f();
            return;
        }
    }

    public final double e(double d2) {
        up$a[] up$aArray = this.b;
        int n3 = 0;
        up$a up$a = up$aArray[0];
        double d5 = up$a.c;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 = d5;
        }
        int n4 = up$aArray.length + -1;
        up$a = up$aArray[n4];
        d5 = up$a.d;
        double d9 = d2 - d5;
        object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object > 0) {
            int n7 = up$aArray.length + -1;
            up$a up$a2 = up$aArray[n7];
            d2 = up$a2.d;
        }
        while (n3 < (n4 = up$aArray.length)) {
            up$a = up$aArray[n3];
            double d12 = up$a.d;
            double d13 = d2 - d12;
            Object object2 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object2 <= 0) {
                boolean bl2 = up$a.r;
                if (bl2) {
                    return up$a.l;
                }
                up$a.g(d2);
                return up$aArray[n3].a();
            }
            ++n3;
        }
        return 0.0 / 0.0;
    }

    public final void f(double d2, double[] dArray) {
        int n3;
        int n4;
        up$a[] up$aArray = this.b;
        up$a up$a = up$aArray[0];
        double d5 = up$a.c;
        int n7 = 1;
        Object object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object < 0) {
            d2 = d5;
        } else {
            n4 = up$aArray.length - n7;
            up$a = up$aArray[n4];
            d5 = up$a.d;
            double d7 = d2 - d5;
            object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object > 0) {
                int n8 = up$aArray.length - n7;
                up$a up$a2 = up$aArray[n8];
                d2 = up$a2.d;
            }
        }
        up$a = null;
        for (n4 = 0; n4 < (n3 = up$aArray.length); ++n4) {
            up$a up$a3 = up$aArray[n4];
            double d9 = up$a3.d;
            double d12 = d2 - d9;
            Object object2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
            if (object2 > 0) continue;
            object = up$a3.r;
            if (object != false) {
                dArray[0] = d2 = up$a3.l;
                dArray[n7] = d2 = up$a3.m;
                return;
            }
            up$a3.g(d2);
            dArray[0] = d2 = up$aArray[n4].a();
            dArray[n7] = d2 = up$aArray[n4].b();
            return;
        }
    }

    public final double[] g() {
        return this.a;
    }
}

