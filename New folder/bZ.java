/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace
 *  android.graphics.ColorSpace$Named
 *  android.graphics.ColorSpace$Rgb
 *  android.graphics.ColorSpace$Rgb$TransferParameters
 */
import android.graphics.ColorSpace;
import kotlin.jvm.internal.Intrinsics;

public final class bZ {
    public static final ColorSpace a(py_1 py_12) {
        Object object = py_12;
        Object object2 = eZ.c;
        boolean bl2 = Intrinsics.areEqual(py_12, object2);
        if (bl2) {
            object = BY.a(sy_0.a());
        } else {
            object2 = eZ.o;
            bl2 = Intrinsics.areEqual(py_12, object2);
            if (bl2) {
                object = BY.a(Os.a());
            } else {
                object2 = eZ.p;
                bl2 = Intrinsics.areEqual(py_12, object2);
                if (bl2) {
                    object = BY.a(qs_0.a());
                } else {
                    object2 = eZ.m;
                    bl2 = Intrinsics.areEqual(py_12, object2);
                    if (bl2) {
                        object = BY.a(rs_0.a());
                    } else {
                        object2 = eZ.h;
                        bl2 = Intrinsics.areEqual(py_12, object2);
                        if (bl2) {
                            object = BY.a(ss_0.a());
                        } else {
                            object2 = eZ.g;
                            bl2 = Intrinsics.areEqual(py_12, object2);
                            if (bl2) {
                                object = BY.a(vs_0.a());
                            } else {
                                object2 = eZ.r;
                                bl2 = Intrinsics.areEqual(py_12, object2);
                                if (bl2) {
                                    object = BY.a(LY.a());
                                } else {
                                    object2 = eZ.q;
                                    bl2 = Intrinsics.areEqual(py_12, object2);
                                    if (bl2) {
                                        object = BY.a(RY.a());
                                    } else {
                                        object2 = eZ.i;
                                        bl2 = Intrinsics.areEqual(py_12, object2);
                                        if (bl2) {
                                            object = BY.a(SY.a());
                                        } else {
                                            object2 = eZ.j;
                                            bl2 = Intrinsics.areEqual(py_12, object2);
                                            if (bl2) {
                                                object = BY.a(TY.a());
                                            } else {
                                                object2 = eZ.e;
                                                bl2 = Intrinsics.areEqual(py_12, object2);
                                                if (bl2) {
                                                    object = BY.a(UY.a());
                                                } else {
                                                    object2 = eZ.f;
                                                    bl2 = Intrinsics.areEqual(py_12, object2);
                                                    if (bl2) {
                                                        object = BY.a(VY.a());
                                                    } else {
                                                        object2 = eZ.d;
                                                        bl2 = Intrinsics.areEqual(py_12, object2);
                                                        if (bl2) {
                                                            object = BY.a(WY.a());
                                                        } else {
                                                            object2 = eZ.k;
                                                            bl2 = Intrinsics.areEqual(py_12, object2);
                                                            if (bl2) {
                                                                object = BY.a(ty_0.a());
                                                            } else {
                                                                object2 = eZ.n;
                                                                bl2 = Intrinsics.areEqual(py_12, object2);
                                                                if (bl2) {
                                                                    object = BY.a(uy_0.a());
                                                                } else {
                                                                    object2 = eZ.l;
                                                                    bl2 = Intrinsics.areEqual(py_12, object2);
                                                                    if (bl2) {
                                                                        object = BY.a(V1.a());
                                                                    } else {
                                                                        bl2 = py_12 instanceof gp2_0;
                                                                        if (bl2) {
                                                                            object2 = py_12;
                                                                            object2 = (gp2_0)py_12;
                                                                            float[] fArray = ((gp2_0)object2).d.a();
                                                                            Object object3 = ((gp2_0)object2).g;
                                                                            if (object3 != null) {
                                                                                PY.a();
                                                                                double d2 = ((Lq3)object3).g;
                                                                                double d5 = ((Lq3)object3).a;
                                                                                double d7 = ((Lq3)object3).b;
                                                                                double d9 = ((Lq3)object3).c;
                                                                                double d12 = ((Lq3)object3).d;
                                                                                double d13 = ((Lq3)object3).e;
                                                                                double d14 = d5;
                                                                                d5 = ((Lq3)object3).f;
                                                                                double d15 = d14;
                                                                                d14 = d2;
                                                                                object3 = MY.a(d7, d9, d12, d13, d5, d2, d15);
                                                                            } else {
                                                                                object3 = null;
                                                                            }
                                                                            if (object3 != null) {
                                                                                QY.a();
                                                                                object = ((py_1)object).a;
                                                                                object2 = ((gp2_0)object2).h;
                                                                                object = NY.a((String)object, (float[])object2, fArray, (ColorSpace.Rgb.TransferParameters)object3);
                                                                            } else {
                                                                                QY.a();
                                                                                String string2 = ((py_1)object).a;
                                                                                object3 = ((gp2_0)object2).l;
                                                                                XY xY = new XY((gP2$c)object3);
                                                                                object3 = ((gp2_0)object2).o;
                                                                                YY yY = new YY((gp2$b_0)object3);
                                                                                object = (gp2_0)object;
                                                                                float f5 = ((gp2_0)object).e;
                                                                                float f6 = ((gp2_0)object).f;
                                                                                float[] fArray2 = ((gp2_0)object2).h;
                                                                                object = OY.a(string2, fArray2, fArray, xY, yY, f5, f6);
                                                                            }
                                                                            object = Ps.a(object);
                                                                        } else {
                                                                            object = BY.a(sy_0.a());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final py_1 b(ColorSpace colorSpace) {
        void var31_75;
        gp2_0 gp2_02;
        void var3_40;
        void var1_20;
        ColorSpace.Named named;
        int n3;
        ColorSpace colorSpace2 = colorSpace;
        int n4 = Ts.a(colorSpace);
        if (n4 == (n3 = Us.a(named = sy_0.a()))) {
            gp2_0 gp2_03 = eZ.c;
            return var1_20;
        }
        ColorSpace.Named named2 = Os.a();
        n3 = Us.a(named2);
        if (n4 == n3) {
            gp2_0 gp2_04 = eZ.o;
            return var1_20;
        }
        ColorSpace.Named named3 = qs_0.a();
        n3 = Us.a(named3);
        if (n4 == n3) {
            gp2_0 gp2_05 = eZ.p;
            return var1_20;
        }
        ColorSpace.Named named4 = rs_0.a();
        n3 = Us.a(named4);
        if (n4 == n3) {
            gp2_0 gp2_06 = eZ.m;
            return var1_20;
        }
        ColorSpace.Named named5 = ss_0.a();
        n3 = Us.a(named5);
        if (n4 == n3) {
            gp2_0 gp2_07 = eZ.h;
            return var1_20;
        }
        ColorSpace.Named named6 = vs_0.a();
        n3 = Us.a(named6);
        if (n4 == n3) {
            gp2_0 gp2_08 = eZ.g;
            return var1_20;
        }
        ColorSpace.Named named7 = LY.a();
        n3 = Us.a(named7);
        if (n4 == n3) {
            ep1_1 ep1_12 = eZ.r;
            return var1_20;
        }
        ColorSpace.Named named8 = RY.a();
        n3 = Us.a(named8);
        if (n4 == n3) {
            vj3_1 vj3_12 = eZ.q;
            return var1_20;
        }
        ColorSpace.Named named9 = SY.a();
        n3 = Us.a(named9);
        if (n4 == n3) {
            gp2_0 gp2_09 = eZ.i;
            return var1_20;
        }
        ColorSpace.Named named10 = TY.a();
        n3 = Us.a(named10);
        if (n4 == n3) {
            gp2_0 gp2_010 = eZ.j;
            return var1_20;
        }
        ColorSpace.Named named11 = UY.a();
        n3 = Us.a(named11);
        if (n4 == n3) {
            gp2_0 gp2_011 = eZ.e;
            return var1_20;
        }
        ColorSpace.Named named12 = VY.a();
        n3 = Us.a(named12);
        if (n4 == n3) {
            gp2_0 gp2_012 = eZ.f;
            return var1_20;
        }
        ColorSpace.Named named13 = WY.a();
        n3 = Us.a(named13);
        if (n4 == n3) {
            gp2_0 gp2_013 = eZ.d;
            return var1_20;
        }
        ColorSpace.Named named14 = ty_0.a();
        n3 = Us.a(named14);
        if (n4 == n3) {
            gp2_0 gp2_014 = eZ.k;
            return var1_20;
        }
        ColorSpace.Named named15 = uy_0.a();
        n3 = Us.a(named15);
        if (n4 == n3) {
            gp2_0 gp2_015 = eZ.n;
            return var1_20;
        }
        ColorSpace.Named named16 = V1.a();
        n3 = Us.a(named16);
        if (n4 == n3) {
            gp2_0 gp2_016 = eZ.l;
            return var1_20;
        }
        n4 = (int)(d2_0.c(colorSpace) ? 1 : 0);
        if (n4 == 0) {
            gp2_0 gp2_017 = eZ.c;
            return var1_20;
        }
        ColorSpace.Rgb.TransferParameters transferParameters = Xs.a(e2_0.a(colorSpace));
        float[] fArray = g2.c(e2_0.a(colorSpace));
        n3 = fArray.length;
        int n7 = 3;
        float f5 = 4.2E-45f;
        int n8 = 1;
        float f6 = Float.MIN_VALUE;
        float f7 = 0.0f;
        Object var11_55 = null;
        if (n3 == n7) {
            float[] fArray2 = g2.c(e2_0.a(colorSpace));
            f5 = fArray2[0];
            f6 = g2.c(e2_0.a(colorSpace))[n8];
            float[] fArray3 = g2.c(e2_0.a(colorSpace));
            int n10 = 2;
            f7 = fArray3[n10];
            float f8 = f5 + f6 + f7;
            SF3 sF3 = new SF3(f5 /= f8, f6 /= f8);
        } else {
            float[] fArray4 = g2.c(e2_0.a(colorSpace));
            f5 = fArray4[0];
            float[] fArray5 = g2.c(e2_0.a(colorSpace));
            f6 = fArray5[n8];
            SF3 sF3 = new SF3(f5, f6);
        }
        void var15_63 = var3_40;
        if (transferParameters != null) {
            Lq3 lq3;
            double d2 = vy_0.a(transferParameters);
            double d5 = wy_0.a(transferParameters);
            double d7 = xy_0.a(transferParameters);
            double d9 = yy_0.a(transferParameters);
            double d12 = zY.a(transferParameters);
            double d13 = AY.a(transferParameters);
            double d14 = CY.a(transferParameters);
            Lq3 lq32 = lq3;
            Lq3 lq33 = lq3 = new Lq3(d2, d5, d7, d9, d12, d13, d14);
        } else {
            n4 = 0;
            Object var5_47 = null;
            Object var31_74 = null;
        }
        String string2 = DY.a(e2_0.a(colorSpace));
        float[] fArray6 = EY.a(e2_0.a(colorSpace));
        ColorSpace.Rgb rgb = e2_0.a(colorSpace);
        float[] fArray7 = FY.a(rgb);
        zy_1 zy_12 = new zy_1(colorSpace2);
        az_0 az_02 = new az_0(colorSpace2);
        float f11 = GY.a(colorSpace);
        float f12 = HY.a(colorSpace);
        int n14 = IY.a(e2_0.a(colorSpace));
        gp2_0 gp2_018 = gp2_02;
        gp2_0 gp2_019 = gp2_02 = new gp2_0(string2, fArray6, (SF3)var15_63, fArray7, zy_12, az_02, f11, f12, (Lq3)var31_75, n14);
        return var1_20;
    }
}

