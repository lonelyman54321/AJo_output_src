/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 */
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public final class Fs3$b
implements UW2 {
    public final Vm2 a;
    public final SparseArray b;
    public final SparseIntArray c;
    public final int d;
    public final /* synthetic */ Fs3 e;

    public Fs3$b(Fs3 object, int n3) {
        this.e = object;
        int n4 = 5;
        byte[] byArray = new byte[n4];
        this.a = object = new Vm2(byArray, n4);
        object = new SparseArray();
        this.b = object;
        object = new SparseIntArray();
        this.c = object;
        this.d = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = var1_1.w();
        if (var4_4 != (var5_5 = 2)) {
            return;
        }
        var6_6 = this.e;
        var7_7 = var6_6.a;
        var8_8 = 1;
        var9_9 = 0;
        var10_10 = null;
        var11_11 = var6_6.d;
        if (var7_7 != var8_8 && var7_7 != var5_5 && (var7_7 = var6_6.o) != var8_8) {
            var13_13 = (On3)var11_11.get(0);
            var14_14 = var13_13.d();
            var12_12 = new On3(var14_14);
            var11_11.add(var12_12);
        } else {
            var12_12 = (On3)var11_11.get(0);
        }
        var16_15 = var1_1.w() & 128;
        if (var16_15 == 0) {
            return;
        }
        var3_3.J(var8_8);
        var16_15 = var1_1.C();
        var17_16 = 3;
        var3_3.J(var17_16);
        var18_17 = var2_2.a;
        var19_18 = var18_17.a;
        var3_3.g(0, var19_18, var5_5);
        var18_17.m(0);
        var18_17.o(var17_16);
        var20_19 = 13;
        var6_6.u = var21_20 = var18_17.g(var20_19);
        var22_21 /* !! */  = var18_17.a;
        var3_3.g(0, var22_21 /* !! */ , var5_5);
        var18_17.m(0);
        var21_20 = 4;
        var18_17.o(var21_20);
        var23_22 = 12;
        var24_23 = var18_17.g(var23_22);
        var3_3.J(var24_23);
        var25_24 = var6_6.g;
        var26_25 = var6_6.a;
        var27_26 = 8192;
        var8_8 = 21;
        if (var26_25 == var5_5 && (var28_27 = var6_6.s) == null) {
            var29_28 = gz3.f;
            var30_29 = 21;
            var28_27 = new Gs3$b(var30_29, null, 0, null, var29_28);
            var6_6.s = var28_27 = var25_24.a(var8_8, (Gs3$b)var28_27);
            if (var28_27 != null) {
                var31_30 = var6_6.n;
                var22_21 /* !! */  = (byte[])new Gs3$d;
                var22_21 /* !! */ (var16_15, var8_8, var27_26);
                var28_27.b((On3)var12_12, var31_30, (Gs3$d)var22_21 /* !! */ );
            }
        }
        var28_27 = var2_2.b;
        var28_27.clear();
        var22_21 /* !! */  = (byte[])var2_2.c;
        var22_21 /* !! */ .clear();
        var23_22 = var1_1.a();
        while (true) {
            block45: {
                block47: {
                    block46: {
                        block44: {
                            var32_31 = var6_6.j;
                            if (var23_22 <= 0) break;
                            var33_32 = var18_17.a;
                            var3_3.g(0, var33_32, 5);
                            var18_17.m(0);
                            var8_8 = var18_17.g(8);
                            var18_17.o(var17_16);
                            var17_16 = var18_17.g(13);
                            var18_17.o(4);
                            var34_33 = var18_17.g(12);
                            var9_9 = var3_3.b;
                            var20_19 = var9_9 + var34_33;
                            var35_34 = -1;
                            var36_35 = null;
                            var37_36 = null;
                            var38_37 = 0;
                            var39_38 = var18_17;
                            while (true) {
                                block39: {
                                    block42: {
                                        block43: {
                                            block41: {
                                                block40: {
                                                    if ((var40_39 = var3_3.b) >= var20_19) break;
                                                    var40_39 = var1_1.w();
                                                    var41_40 = var1_1.w();
                                                    var42_41 = var3_3.b + var41_40;
                                                    if (var42_41 > var20_19) {
                                                        break;
                                                    }
                                                    var41_40 = 172;
                                                    var44_43 = var12_12;
                                                    var7_7 = 5;
                                                    if (var40_39 == var7_7) {
                                                        var47_46 = var1_1.y();
                                                        cfr_temp_0 = var47_46 - (var49_47 = 1094921523L);
                                                        var7_7 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                        if (var7_7 == 0) {
                                                            var35_34 = 129;
                                                        } else {
                                                            var49_47 = 1161904947L;
                                                            cfr_temp_1 = var47_46 - var49_47;
                                                            var7_7 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                            if (var7_7 == 0) {
                                                                var35_34 = 135;
                                                            } else {
                                                                var49_47 = 1094921524L;
                                                                cfr_temp_2 = var47_46 - var49_47;
                                                                var7_7 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                                if (var7_7 == 0) {
                                                                    while (true) {
                                                                        var35_34 = 172;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    var51_48 = 1212503619L;
                                                                    cfr_temp_3 = var47_46 - var51_48;
                                                                    var7_7 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                                    if (var7_7 == 0) {
                                                                        var35_34 = 36;
                                                                    }
                                                                }
                                                            }
                                                        }
lbl114:
                                                        // 9 sources

                                                        while (true) {
                                                            var43_42 = var28_27;
lbl116:
                                                            // 2 sources

                                                            while (true) {
                                                                var45_44 = var16_15;
                                                                var46_45 = var17_16;
                                                                var16_15 = 4;
                                                                break block39;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var7_7 = 106;
                                                    if (var40_39 != var7_7) break block40;
                                                    var43_42 = var28_27;
                                                    var45_44 = var16_15;
                                                    var46_45 = var17_16;
                                                    var16_15 = 4;
                                                    var35_34 = 129;
                                                    break block39;
                                                }
                                                var7_7 = 122;
                                                if (var40_39 != var7_7) break block41;
                                                var43_42 = var28_27;
                                                var45_44 = var16_15;
                                                var46_45 = var17_16;
                                                var16_15 = 4;
                                                var35_34 = 135;
                                                break block39;
                                            }
                                            var7_7 = 127;
                                            if (var40_39 != var7_7) break block42;
                                            if ((var7_7 = var1_1.w()) == (var40_39 = 21)) ** continue;
                                            var40_39 = 14;
                                            if (var7_7 != var40_39) break block43;
                                            var35_34 = 136;
                                            ** GOTO lbl114
                                        }
                                        var40_39 = 33;
                                        if (var7_7 != var40_39) ** GOTO lbl114
                                        var35_34 = 139;
                                        ** continue;
                                    }
                                    var7_7 = 123;
                                    if (var40_39 == var7_7) {
                                        var7_7 = 138;
                                        var43_42 = var28_27;
                                        var45_44 = var16_15;
                                        var46_45 = var17_16;
                                        var16_15 = 4;
                                        var35_34 = 138;
                                    } else {
                                        var7_7 = 10;
                                        if (var40_39 == var7_7) {
                                            var12_12 = StandardCharsets.UTF_8;
                                            var40_39 = 3;
                                            var12_12 = var3_3.u(var40_39, (Charset)var12_12).trim();
                                            var38_37 = var1_1.w();
                                            var43_42 = var28_27;
                                            var36_35 = var12_12;
                                            ** continue;
                                        }
                                        var7_7 = 89;
                                        if (var40_39 == var7_7) {
                                            var18_17 = new ArrayList();
                                            while ((var7_7 = var3_3.b) < var42_41) {
                                                var12_12 = StandardCharsets.UTF_8;
                                                var45_44 = var16_15;
                                                var12_12 = var3_3.u(3, (Charset)var12_12).trim();
                                                var1_1.w();
                                                var43_42 = var28_27;
                                                var16_15 = 4;
                                                var28_27 = new byte[var16_15];
                                                var46_45 = var17_16;
                                                var3_3.g(0, (byte[])var28_27, var16_15);
                                                var13_13 = new Gs3$a((String)var12_12, (byte[])var28_27);
                                                var18_17.add(var13_13);
                                                var28_27 = var43_42;
                                                var16_15 = var45_44;
                                            }
                                            var43_42 = var28_27;
                                            var45_44 = var16_15;
                                            var46_45 = var17_16;
                                            var16_15 = 4;
                                            var37_36 = var18_17;
                                            var35_34 = 89;
                                        } else {
                                            var43_42 = var28_27;
                                            var45_44 = var16_15;
                                            var46_45 = var17_16;
                                            var16_15 = 4;
                                            var5_5 = 111;
                                            if (var40_39 == var5_5) {
                                                var5_5 = 257;
                                                var35_34 = 257;
                                            }
                                        }
                                    }
                                }
                                var5_5 = var3_3.b;
                                var3_3.J(var42_41 -= var5_5);
                                var2_2 = this;
                                var28_27 = var43_42;
                                var12_12 = var44_43;
                                var16_15 = var45_44;
                                var17_16 = var46_45;
                            }
                            var43_42 = var28_27;
                            var44_43 = var12_12;
                            var45_44 = var16_15;
                            var46_45 = var17_16;
                            var16_15 = 4;
                            var3_3.I(var20_19);
                            var28_27 = var3_3.a;
                            var53_49 = Arrays.copyOfRange((byte[])var28_27, var9_9, var20_19);
                            var2_2 = new Gs3$b(var35_34, (String)var36_35, var38_37, (ArrayList)var37_36, var53_49);
                            var5_5 = 6;
                            if (var8_8 == var5_5 || var8_8 == (var5_5 = 5)) {
                                var8_8 = var35_34;
                            }
                            var23_22 -= (var34_33 += 5);
                            var5_5 = 2;
                            var7_7 = var26_25 == var5_5 ? var8_8 : var46_45;
                            var9_9 = (int)var32_31.get(var7_7);
                            if (var9_9 == 0) break block44;
                            var28_27 = var43_42;
                            var9_9 = 21;
                            break block45;
                        }
                        var9_9 = 21;
                        var2_2 = var26_25 == var5_5 && var8_8 == var9_9 ? var6_6.s : var25_24.a(var8_8, (Gs3$b)var2_2);
                        if (var26_25 != var5_5) break block46;
                        var8_8 = var22_21 /* !! */ .get(var7_7, 8192);
                        var5_5 = var46_45;
                        if (var46_45 < var8_8) break block47;
                        var28_27 = var43_42;
                        break block45;
                    }
                    var5_5 = var46_45;
                }
                var22_21 /* !! */ .put(var7_7, var5_5);
                var28_27 = var43_42;
                var43_42.put(var7_7, var2_2);
            }
            var2_2 = this;
            var18_17 = var39_38;
            var12_12 = var44_43;
            var16_15 = var45_44;
            var8_8 = 21;
            var9_9 = 0;
            var10_10 = null;
            var17_16 = 3;
            var20_19 = 13;
        }
        var44_43 = var12_12;
        var45_44 = var16_15;
        var42_41 = var22_21 /* !! */ .size();
        var17_16 = 0;
        var13_13 = null;
        while (true) {
            var3_3 = var6_6.i;
            if (var17_16 >= var42_41) break;
            var7_7 = var22_21 /* !! */ .keyAt(var17_16);
            var8_8 = var22_21 /* !! */ .valueAt(var17_16);
            var9_9 = 1;
            var32_31.put(var7_7, (boolean)var9_9);
            var11_11 = var6_6.k;
            var11_11.put(var8_8, (boolean)var9_9);
            var10_10 = (Gs3)var28_27.valueAt(var17_16);
            if (var10_10 != null) {
                var11_11 = var6_6.s;
                if (var10_10 != var11_11) {
                    var11_11 = var6_6.n;
                    var20_19 = var45_44;
                    var23_22 = 8192;
                    var18_17 = new Gs3$d(var45_44, var7_7, var23_22);
                    var12_12 = var44_43;
                    var10_10.b((On3)var44_43, (gi0_0)var11_11, (Gs3$d)var18_17);
                } else {
                    var12_12 = var44_43;
                    var20_19 = var45_44;
                    var23_22 = 8192;
                }
                var3_3.put(var8_8, var10_10);
            } else {
                var12_12 = var44_43;
                var20_19 = var45_44;
                var23_22 = 8192;
            }
            ++var17_16;
            var44_43 = var12_12;
            var45_44 = var20_19;
        }
        var8_8 = 2;
        if (var26_25 == var8_8) {
            var42_41 = (int)var6_6.p;
            if (var42_41 == 0) {
                var6_6.n.j();
                var42_41 = 0;
                var2_2 = null;
                var6_6.o = 0;
                var5_5 = 1;
                var6_6.p = var5_5;
            }
            var12_12 = this;
        } else {
            var12_12 = this;
            var42_41 = 0;
            var2_2 = null;
            var5_5 = 1;
            var8_8 = this.d;
            var3_3.remove(var8_8);
            if (var26_25 == var5_5) {
                var9_9 = 0;
                var10_10 = null;
            } else {
                var42_41 = var6_6.o;
                var9_9 = var42_41 + -1;
            }
            var6_6.o = var9_9;
            if (var9_9 == 0) {
                var2_2 = var6_6.n;
                var2_2.j();
                var6_6.p = var5_5;
            }
        }
    }

    public final void b(On3 on3, gi0_0 gi0_02, Gs3$d gs3$d) {
    }
}

