/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Arrays;
import java.util.Collections;

public final class d21
implements qy0_0 {
    public static final double[] q;
    public String a;
    public wp3 b;
    public final tx3 c;
    public final Xm2 d;
    public final BS1 e;
    public final boolean[] f;
    public final d21$a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    static {
        double[] dArray;
        double[] dArray2 = dArray = new double[8];
        double[] dArray3 = dArray;
        dArray2[0] = 23.976023976023978;
        dArray3[1] = 24.0;
        dArray2[2] = 25.0;
        dArray3[3] = 29.97002997002997;
        dArray2[4] = 30.0;
        dArray3[5] = 50.0;
        dArray2[6] = 59.94005994005994;
        dArray3[7] = 60.0;
        q = dArray;
    }

    public d21(tx3 object) {
        long l2;
        this.c = object;
        int n3 = 4;
        Object object2 = new boolean[n3];
        this.f = object2;
        object2 = new d21$a;
        int n4 = 128;
        byte[] byArray = new byte[n4];
        object2.d = byArray;
        this.g = object2;
        if (object != null) {
            n3 = 178;
            this.e = object = new BS1(n3);
            this.d = object = new Xm2();
        } else {
            object = null;
            this.e = null;
            this.d = null;
        }
        this.l = l2 = -9223372036854775807L;
        this.n = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 4;
        var5_5 = 3;
        var6_6 = this.b;
        ct3.h(var6_6);
        var7_7 = var1_1.b;
        var8_8 = var1_1.c;
        var9_9 = var1_1.a;
        var10_10 = this.h;
        var12_11 = var1_1.a();
        var13_12 = var12_11;
        this.h = var10_10 += var13_12;
        var15_13 = this.b;
        var16_14 = var1_1.a();
        var15_13.f(var16_14, var1_1);
        while (true) {
            block37: {
                block33: {
                    block36: {
                        block34: {
                            block32: {
                                block35: {
                                    var15_13 = var2_2.f;
                                    var17_15 = DS1.b(var9_9, var7_7, var8_8, (boolean[])var15_13);
                                    var18_16 = var2_2.g;
                                    var19_17 = var2_2.e;
                                    if (var17_15 == var8_8) {
                                        var20_46 = var2_2.j;
                                        if (!var20_46) {
                                            var18_16.a(var7_7, var9_9, var8_8);
                                        }
                                        if (var19_17 != null) {
                                            var19_17.a(var7_7, var9_9, var8_8);
                                        }
                                        return;
                                    }
                                    var21_18 = var3_3.a;
                                    var22_19 = var17_15 + 3;
                                    var23_20 = var21_18[var22_19] & 255;
                                    var24_21 = var17_15 - var7_7;
                                    var25_22 = var2_2.j;
                                    var26_23 = 0;
                                    var27_24 /* !! */  = null;
                                    if (var25_22 != 0) break block33;
                                    if (var24_21 > 0) {
                                        var18_16.a(var7_7, var9_9, var17_15);
                                    }
                                    if (var24_21 < 0) {
                                        var25_22 = -var24_21;
                                    } else {
                                        var25_22 = 0;
                                        var28_25 = null;
                                    }
                                    var5_5 = (int)var18_16.a;
                                    if (var5_5 == 0) break block34;
                                    var18_16.b = var5_5 = var18_16.b - var25_22;
                                    var25_22 = var18_16.c;
                                    if (var25_22 != 0 || var23_20 != (var25_22 = 181)) break block35;
                                    var18_16.c = var5_5;
                                    var29_26 = var8_8;
                                    var30_27 = var22_19;
                                    var22_19 = var7_7;
                                    break block36;
                                }
                                var18_16.a = false;
                                var31_28 = var2_2.a;
                                var31_28.getClass();
                                var28_25 = var18_16.d;
                                var26_23 = var18_16.b;
                                var27_24 /* !! */  = Arrays.copyOf(var28_25, var26_23);
                                var25_22 = var27_24 /* !! */ [var4_4] & 255;
                                var32_29 = 5;
                                var33_30 = var27_24 /* !! */ [var32_29];
                                var4_4 = var33_30 & 255;
                                var30_27 = var22_19;
                                var22_19 = var27_24 /* !! */ [6] & 255;
                                var29_26 = var8_8;
                                var8_8 = 4;
                                var34_31 = 5.6E-45f;
                                var4_4 = var4_4 >> var8_8 | (var25_22 <<= var8_8);
                                var33_30 = (var33_30 & 15) << 8 | var22_19;
                                var25_22 = (var27_24 /* !! */ [7] & 240) >> var8_8;
                                var22_19 = 2;
                                var35_32 = 2.8E-45f;
                                if (var25_22 == var22_19) ** GOTO lbl95
                                var22_19 = 3;
                                var35_32 = 4.2E-45f;
                                if (var25_22 == var22_19) ** GOTO lbl91
                                if (var25_22 != var8_8) {
                                    var8_8 = 1065353216;
                                    var34_31 = 1.0f;
                                } else {
                                    var8_8 = var33_30 * 121;
                                    var34_31 = var8_8;
                                    var22_19 = var4_4 * 100;
lbl87:
                                    // 2 sources

                                    while (true) {
                                        var35_32 = var22_19;
                                        var34_31 /= var35_32;
                                        break block32;
                                        break;
                                    }
lbl91:
                                    // 1 sources

                                    var8_8 = var33_30 * 16;
                                    var34_31 = var8_8;
                                    var22_19 = var4_4 * 9;
                                    ** continue;
lbl95:
                                    // 1 sources

                                    var22_19 = var33_30 * 4;
                                    var35_32 = var22_19;
                                    var25_22 = 3;
                                    var8_8 = var4_4 * 3;
                                    var34_31 = var8_8;
                                    var34_31 = var35_32 / var34_31;
                                }
                            }
                            var36_33 = new d$a();
                            var36_33.a = var31_28;
                            var36_33.n = var31_28 = ip1_0.l("video/mpeg2");
                            var36_33.u = var4_4;
                            var36_33.v = var33_30;
                            var36_33.y = var34_31;
                            var37_34 = Collections.singletonList(var27_24 /* !! */ );
                            var36_33.q = var37_34;
                            var37_34 = new d;
                            var37_34(var36_33);
                            var4_4 = var27_24 /* !! */ [7] & 15;
                            var5_5 = 1;
                            if ((var4_4 -= var5_5) >= 0 && var4_4 < (var5_5 = 8)) {
                                var31_28 = d21.q;
                                var38_35 = var31_28[var4_4];
                                var4_4 = var18_16.c + 9;
                                var4_4 = var27_24 /* !! */ [var4_4];
                                var26_23 = (var4_4 & 96) >> 5;
                                if (var26_23 != (var4_4 &= 31)) {
                                    var40_36 = var26_23;
                                    var42_37 = 1.0;
                                    var40_36 += var42_37;
                                    var8_8 = 1;
                                    var34_31 = 1.4E-45f;
                                    var22_19 = var7_7;
                                    var44_38 = var4_4 += var8_8;
                                    var38_35 *= (var40_36 /= var44_38);
                                } else {
                                    var22_19 = var7_7;
                                }
                                var46_39 = 1000000.0 / var38_35;
                                var48_40 = (long)var46_39;
                            } else {
                                var22_19 = var7_7;
                                var48_40 = 0L;
                                var46_39 = 0.0;
                            }
                            var50_41 = var48_40;
                            var37_34 = Pair.create((Object)var37_34, (Object)var50_41);
                            var50_41 = var2_2.b;
                            var27_24 /* !! */  = (byte[])((d)var37_34.first);
                            var50_41.d((d)var27_24 /* !! */ );
                            var37_34 = (Long)var37_34.second;
                            var2_2.k = var51_42 = var37_34.longValue();
                            var33_30 = 1;
                            var2_2.j = var33_30;
                            var26_23 = 3;
                            break block37;
                        }
                        var29_26 = var8_8;
                        var30_27 = var22_19;
                        var33_30 = 1;
                        var4_4 = 179;
                        var22_19 = var7_7;
                        if (var23_20 == var4_4) {
                            var18_16.a = var33_30;
                        }
                    }
                    var37_34 = d21$a.e;
                    var4_4 = 0;
                    var50_41 = null;
                    var26_23 = 3;
                    var18_16.a(0, (byte[])var37_34, var26_23);
                    break block37;
                }
                var29_26 = var8_8;
                var30_27 = var22_19;
                var26_23 = 3;
                var22_19 = var7_7;
            }
            if (var19_17 == null) ** GOTO lbl-1000
            if (var24_21 > 0) {
                var19_17.a(var22_19, var9_9, var17_15);
                var4_4 = 0;
                var50_41 = null;
            } else {
                var4_4 = -var24_21;
            }
            var33_30 = (int)var19_17.b(var4_4);
            if (var33_30 != 0) {
                var37_34 = var19_17.d;
                var33_30 = DS1.k(var19_17.e, (byte[])var37_34);
                var4_4 = gz3.a;
                var50_41 = var19_17.d;
                var31_28 = var2_2.d;
                var31_28.G(var33_30, (byte[])var50_41);
                var51_42 = var2_2.n;
                var6_6 = var2_2.c;
                var6_6.a(var51_42, (Xm2)var31_28);
            }
            if (var23_20 == (var33_30 = 178)) {
                var37_34 = var3_3.a;
                var4_4 = 2;
                var5_5 = var17_15 + 2;
                var33_30 = var37_34[var5_5];
                if (var33_30 == (var5_5 = 1)) {
                    var19_17.d(var23_20);
                }
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 2;
                var5_5 = 1;
            }
            if (var23_20 != 0 && var23_20 != (var33_30 = 179)) {
                var33_30 = 184;
                if (var23_20 == var33_30) {
                    var2_2.o = var5_5;
                }
                var4_4 = 1;
            } else {
                var8_8 = var29_26 - var17_15;
                var33_30 = (int)var2_2.p;
                var53_43 = -9223372036854775807L;
                if (var33_30 != 0 && (var33_30 = (int)var2_2.j) != 0 && (var33_30 = (int)((cfr_temp_0 = (var10_10 = var2_2.n) - var53_43) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) != 0) {
                    var33_30 = (int)var2_2.o;
                    var55_44 = var2_2.h;
                    var48_40 = var2_2.m;
                    var4_4 = (int)(var55_44 -= var48_40);
                    var57_45 = var4_4 - var8_8;
                    var50_41 = var2_2.b;
                    var50_41.a(var10_10, var33_30, var57_45, var8_8, null);
                }
                if ((var33_30 = (int)var2_2.i) != 0 && (var33_30 = (int)var2_2.p) == 0) {
                    var33_30 = 0;
                    var37_34 = null;
                    var4_4 = 1;
                } else {
                    var51_42 = var2_2.h;
                    var10_10 = var8_8;
                    var2_2.m = var51_42 -= var10_10;
                    var51_42 = var2_2.l;
                    cfr_temp_1 = var51_42 - var53_43;
                    var26_23 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var26_23 == 0) {
                        var51_42 = var2_2.n;
                        cfr_temp_2 = var51_42 - var53_43;
                        var26_23 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var26_23 != 0) {
                            var10_10 = var2_2.k;
                            var51_42 += var10_10;
                        } else {
                            var51_42 = var53_43;
                        }
                    }
                    var2_2.n = var51_42;
                    var33_30 = 0;
                    var37_34 = null;
                    var2_2.o = false;
                    var2_2.l = var53_43;
                    var4_4 = 1;
                    var2_2.i = var4_4;
                }
                if (var23_20 == 0) {
                    var26_23 = 1;
                } else {
                    var26_23 = 0;
                    var27_24 /* !! */  = null;
                }
                var2_2.p = var26_23;
            }
            var8_8 = var29_26;
            var7_7 = var30_27;
            var4_4 = 4;
            var5_5 = 3;
        }
    }

    public final void c() {
        long l2;
        DS1.a(this.f);
        Object object = this.g;
        ((d21$a)object).a = false;
        ((d21$a)object).b = 0;
        ((d21$a)object).c = 0;
        object = this.e;
        if (object != null) {
            ((BS1)object).c();
        }
        this.h = 0L;
        this.i = false;
        this.l = l2 = -9223372036854775807L;
        this.n = l2;
    }

    public final void d(boolean bl2) {
        wp3 wp32 = this.b;
        ct3.h(wp32);
        if (bl2) {
            int n3 = this.o;
            long l2 = this.h;
            long l3 = this.m;
            int n4 = (int)(l2 -= l3);
            wp3 wp33 = this.b;
            l3 = this.n;
            wp33.a(l3, n3, n4, 0, null);
        }
    }

    public final void e(gi0_0 gi0_02, Gs3$d gs3$d) {
        gs3$d.a();
        gs3$d.b();
        Object object = gs3$d.e;
        this.a = object;
        gs3$d.b();
        int n3 = gs3$d.d;
        int n4 = 2;
        this.b = object = gi0_02.n(n3, n4);
        object = this.c;
        if (object != null) {
            ((tx3)object).b(gi0_02, gs3$d);
        }
    }

    public final void f(int n3, long l2) {
        this.l = l2;
    }
}

