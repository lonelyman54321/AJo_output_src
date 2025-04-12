/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from ku
 */
public final class ku_0
implements eI0 {
    public final Xm2 a;
    public final ku$b b;
    public final boolean c;
    public final vf3$a_0 d;
    public int e;
    public gi0_0 f;
    public lu_1 g;
    public long h;
    public HU[] i;
    public long j;
    public HU k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public ku_0(int n3, vf3$a_0 vf3$a_0) {
        long l2;
        this.d = vf3$a_0;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            n4 = 0;
            vf3$a_0 = null;
        }
        this.c = n4;
        HU[] hUArray = new Xm2(12);
        this.a = hUArray;
        hUArray = new Object();
        this.b = hUArray;
        hUArray = new Object();
        this.f = hUArray;
        hUArray = new HU[]{};
        this.i = hUArray;
        this.m = l2 = (long)-1;
        this.n = l2;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        var3_3 = this;
        var4_4 /* !! */  = var1_1;
        var5_5 = 1;
        var6_6 = this.j;
        var8_7 = 0;
        var9_8 = null;
        var10_9 = -1;
        cfr_temp_0 = var6_6 - var10_9;
        var12_10 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var12_10 /* !! */  == false) ** GOTO lbl25
        var13_11 = var1_1;
        var13_11 = (il0_0)var1_1;
        var14_12 = var13_11.d;
        cfr_temp_1 = var6_6 - var14_12;
        var16_13 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
        if (var16_13 /* !! */  < 0 || (var19_15 = (int)((cfr_temp_2 = var6_6 - (var17_14 = 262144L + var14_12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) > 0) {
            var13_11 = var2_2;
            var2_2.a = var6_6;
            var22_18 = 1;
        } else {
            var20_16 = (int)(var6_6 -= var14_12);
            var21_17 = var1_1;
            var21_17 = (il0_0)var1_1;
            var21_17.j(var20_16);
lbl25:
            // 2 sources

            var22_18 = 0;
            var21_17 = null;
        }
        var3_3.j = var10_9;
        if (var22_18 != 0) {
            return var5_5;
        }
        var22_18 = var3_3.e;
        var20_16 = 0;
        var23_19 = null;
        var19_15 = 16;
        var24_20 = 1769369453;
        var25_21 = 8;
        var12_10 /* !! */  = 1414744396;
        var26_22 = 8;
        var28_23 = 12;
        var29_24 = var3_3.b;
        var30_25 = var3_3.a;
        switch (var22_18) {
            default: {
                var4_4 /* !! */  = new AssertionError();
                throw var4_4 /* !! */ ;
            }
            case 6: {
                var21_17 = var4_4 /* !! */ ;
                var21_17 = (il0_0)var4_4 /* !! */ ;
                var10_9 = var21_17.d;
                var17_14 = var3_3.n;
                var22_18 = (int)(var10_9 == var17_14 ? 0 : (var10_9 < var17_14 ? -1 : 1));
                if (var22_18 >= 0) {
                    var8_7 = -1;
                } else {
                    var21_17 = var3_3.k;
                    if (var21_17 != null) {
                        var31_26 = var21_17.g;
                        var32_31 = var21_17.a;
                        var33_34 = var32_31.c((mi0_0)var4_4 /* !! */ , var31_26, false);
                        var21_17.g = var31_26 -= var33_34;
                        if (var31_26 == 0) {
                            var33_34 = 1;
                        } else {
                            var33_34 = 0;
                            var4_4 /* !! */  = null;
                        }
                        if (var33_34 != 0) {
                            var31_26 = var21_17.f;
                            if (var31_26 > 0) {
                                var31_26 = var21_17.h;
                                var34_39 = var21_17.d;
                                var36_41 = var31_26;
                                var34_39 *= var36_41;
                                var28_23 = var21_17.e;
                                var36_41 = var28_23;
                                var38_42 = var34_39 / var36_41;
                                var32_31 = var21_17.m;
                                if ((var31_26 = Arrays.binarySearch((int[])var32_31, var31_26)) >= 0) {
                                    var40_44 = 1;
                                } else {
                                    var40_44 = 0;
                                    var30_25 = null;
                                }
                                var25_21 = var21_17.f;
                                var41_46 = var21_17.a;
                                var41_46.a(var38_42, var40_44, var25_21, 0, null);
                            }
                            var21_17.h = var31_26 = var21_17.h + var5_5;
                        }
                        if (var33_34 != 0) {
                            var3_3.k = null;
                        }
                    } else {
                        var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                        var10_9 = var4_4 /* !! */ .d;
                        var17_14 = 1L;
                        cfr_temp_3 = (var10_9 &= var17_14) - var17_14;
                        var22_18 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var22_18 == 0) {
                            var4_4 /* !! */ .j(var5_5);
                        }
                        var21_17 = var30_25.a;
                        var4_4 /* !! */ .b((byte[])var21_17, 0, var28_23, false);
                        var30_25.I(0);
                        var22_18 = var30_25.k();
                        if (var22_18 == var12_10 /* !! */ ) {
                            var30_25.I(var25_21);
                            var5_5 = var30_25.k();
                            if (var5_5 == var24_20) {
                                var25_21 = 12;
                            }
                            var4_4 /* !! */ .j(var25_21);
                            var4_4 /* !! */ .f = 0;
                        } else {
                            var31_27 = var30_25.k();
                            var42_48 = 1263424842;
                            if (var22_18 == var42_48) {
                                var43_51 = var4_4 /* !! */ .d;
                                var6_6 = var31_27;
                                var3_3.j = var43_51 = var43_51 + var6_6 + var26_22;
                            } else {
                                var4_4 /* !! */ .j(var25_21);
                                var4_4 /* !! */ .f = 0;
                                var32_32 = var3_3.i;
                                var12_10 /* !! */  = var32_32.length;
                                var45_58 = null;
                                for (var28_23 = 0; var28_23 < var12_10 /* !! */ ; var28_23 += var5_5) {
                                    var29_24 = var32_32[var28_23];
                                    var46_60 = var29_24.b;
                                    if (var46_60 != var22_18 && (var46_60 = var29_24.c) != var22_18) {
                                        continue;
                                    }
                                    var23_19 = var29_24;
                                    break;
                                }
                                if (var23_19 == null) {
                                    var43_52 = var4_4 /* !! */ .d;
                                    var6_6 = var31_27;
                                    var3_3.j = var43_52 += var6_6;
                                } else {
                                    var23_19.f = var31_27;
                                    var23_19.g = var31_27;
                                    var3_3.k = var23_19;
                                }
                            }
                        }
                    }
                }
                return var8_7;
            }
            case 5: {
                var12_10 /* !! */  = var3_3.o;
                var21_17 = new Xm2((int)var12_10 /* !! */ );
                var13_11 = var21_17.a;
                var28_23 = var3_3.o;
                var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                var4_4 /* !! */ .e((byte[])var13_11, 0, var28_23, false);
                var33_35 = var21_17.a();
                if (var33_35 < var19_15) {
                    var14_12 = 0L;
                } else {
                    var33_35 = var21_17.b;
                    var21_17.J(var25_21);
                    var47_64 = var21_17.k();
                    var14_12 = var3_3.m;
                    var16_13 /* !! */  = var47_64 == var14_12 ? 0 : (var47_64 < var14_12 ? -1 : 1);
                    var14_12 = var16_13 /* !! */  > 0 ? 0L : (var14_12 += var26_22);
                    var21_17.I(var33_35);
                }
                block10: while ((var33_35 = var21_17.a()) >= var19_15) {
                    var33_35 = var21_17.k();
                    var16_13 /* !! */  = var21_17.k();
                    var24_20 = var21_17.k();
                    var47_64 = (long)var24_20 + var14_12;
                    var21_17.k();
                    var49_65 = var3_3.i;
                    var20_16 = var49_65.length;
                    while (var8_7 < var20_16) {
                        var41_47 = var49_65[var8_7];
                        var31_28 = var41_47.b;
                        if (var31_28 != var33_35 && (var31_28 = var41_47.c) != var33_35) {
                            var8_7 += var5_5;
                            var10_9 = -1;
                            continue;
                        }
                        ** GOTO lbl174
                    }
                    var46_61 = false;
                    var41_47 = null;
lbl174:
                    // 2 sources

                    if (var41_47 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var20_16 = 0;
                            var23_19 = null;
                            var8_7 = 0;
                            var9_8 = null;
                            var10_9 = -1;
                            continue block10;
                            break;
                        }
                    }
                    var33_35 = var16_13 /* !! */  & 16;
                    if (var33_35 == var19_15) {
                        var33_35 = 1;
                    } else {
                        var33_35 = 0;
                        var4_4 /* !! */  = null;
                    }
                    var50_66 = var41_47.k;
                    var10_9 = -1;
                    var16_13 /* !! */  = var50_66 == var10_9 ? 0 : (var50_66 < var10_9 ? -1 : 1);
                    if (var16_13 /* !! */  == false) {
                        var41_47.k = var47_64;
                    }
                    if (var33_35 != 0) {
                        var33_35 = var41_47.j;
                        var23_19 = var41_47.m;
                        var20_16 = ((Object)var23_19).length;
                        if (var33_35 == var20_16) {
                            var4_4 /* !! */  = (HU[])var41_47.l;
                            var20_16 = var4_4 /* !! */ .length;
                            var8_7 = 3;
                            var20_16 *= 3;
                            var31_28 = 2;
                            var4_4 /* !! */  = (HU[])Arrays.copyOf((long[])var4_4 /* !! */ , var20_16 /= var31_28);
                            var41_47.l = (long[])var4_4 /* !! */ ;
                            var4_4 /* !! */  = (HU[])var41_47.m;
                            var20_16 = var4_4 /* !! */ .length * 3 / var31_28;
                            var4_4 /* !! */  = (HU[])Arrays.copyOf((int[])var4_4 /* !! */ , var20_16);
                            var41_47.m = (int[])var4_4 /* !! */ ;
                        }
                        var4_4 /* !! */  = (HU[])var41_47.l;
                        var20_16 = var41_47.j;
                        var4_4 /* !! */ [var20_16] = (HU)var47_64;
                        var4_4 /* !! */  = (HU[])var41_47.m;
                        var8_7 = var41_47.i;
                        var4_4 /* !! */ [var20_16] = (HU)var8_7;
                        var41_47.j = var20_16 += var5_5;
                    }
                    var41_47.i = var33_35 = var41_47.i + var5_5;
                    ** continue;
                }
                var4_4 /* !! */  = var3_3.i;
                var22_18 = var4_4 /* !! */ .length;
                var23_19 = null;
                for (var20_16 = 0; var20_16 < var22_18; var20_16 += var5_5) {
                    var9_8 = var4_4 /* !! */ [var20_16];
                    var52_69 /* !! */  = var9_8.l;
                    var42_49 = var9_8.j;
                    var9_8.l = var52_69 /* !! */  = Arrays.copyOf(var52_69 /* !! */ , var42_49);
                    var52_69 /* !! */  = var9_8.m;
                    var42_49 = var9_8.j;
                    var52_69 /* !! */  = Arrays.copyOf((int[])var52_69 /* !! */ , var42_49);
                    var9_8.m = (int[])var52_69 /* !! */ ;
                }
                var3_3.p = var5_5;
                var4_4 /* !! */  = var3_3.f;
                var6_6 = var3_3.h;
                var53_72 = new ku$a(var3_3, var6_6);
                var4_4 /* !! */ .h(var53_72);
                var3_3.e = 6;
                var3_3.j = var43_53 = var3_3.m;
                return 0;
            }
            case 4: {
                var53_73 = null;
                var21_17 = var30_25.a;
                var23_19 = var4_4 /* !! */ ;
                var23_19 = (il0_0)var4_4 /* !! */ ;
                var23_19.e((byte[])var21_17, 0, var25_21, false);
                var30_25.I(0);
                var5_5 = var30_25.k();
                var22_18 = var30_25.k();
                var20_16 = 829973609;
                if (var5_5 == var20_16) {
                    var3_3.e = var33_36 = 5;
                    var3_3.o = var22_18;
lbl253:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                var43_54 = var4_4 /* !! */ .d;
                var6_6 = var22_18;
                var3_3.j = var43_54 += var6_6;
                ** continue;
                var22_18 = 0;
                var21_17 = null;
                return 0;
            }
            case 3: {
                var22_18 = 0;
                var21_17 = null;
                var50_67 = var3_3.m;
                var10_9 = -1;
                var46_62 /* !! */  = var50_67 == var10_9 ? 0 : (var50_67 < var10_9 ? -1 : 1);
                if (var46_62 /* !! */  != false) {
                    var52_70 = var4_4 /* !! */ ;
                    var52_70 = (il0_0)var4_4 /* !! */ ;
                    var10_9 = var52_70.d;
                    cfr_temp_4 = var10_9 - var50_67;
                    var46_62 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var46_62 /* !! */  != false) {
                        var3_3.j = var50_67;
                        return 0;
                    }
                }
                var23_19 = var30_25.a;
                var9_8 = var4_4 /* !! */ ;
                var9_8 = (il0_0)var4_4 /* !! */ ;
                var9_8.b((byte[])var23_19, 0, var28_23, false);
                var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                var4_4 /* !! */ .f = 0;
                var30_25.I(0);
                var29_24.getClass();
                var29_24.a = var20_16 = var30_25.k();
                var29_24.b = var20_16 = var30_25.k();
                var29_24.c = 0;
                var20_16 = var30_25.k();
                var8_7 = var29_24.a;
                var31_29 = 1179011410;
                if (var8_7 == var31_29) {
                    var4_4 /* !! */ .j(var28_23);
                    return 0;
                }
                if (var8_7 == var12_10 /* !! */  && var20_16 == var24_20) {
                    var3_3.m = var6_6 = var4_4 /* !! */ .d;
                    var8_7 = var29_24.b;
                    var54_76 = var8_7;
                    var3_3.n = var6_6 = var6_6 + var54_76 + var26_22;
                    var22_18 = (int)var3_3.p;
                    if (var22_18 == 0) {
                        var21_17 = var3_3.g;
                        var21_17.getClass();
                        var22_18 = var21_17.b & var19_15;
                        if (var22_18 == var19_15) {
                            var3_3.e = var22_18 = 4;
                            var3_3.j = var43_55 = var3_3.n;
lbl311:
                            // 2 sources

                            return 0;
                        }
                        var21_17 = var3_3.f;
                        var54_76 = var3_3.h;
                        var23_19 = new dX2$b(var54_76);
                        var21_17.h((dx2_1)var23_19);
                        var3_3.p = var5_5;
                    }
                    var3_3.j = var43_56 = var4_4 /* !! */ .d + (long)12;
                    var3_3.e = 6;
                    return 0;
                }
                var22_18 = 0;
                var21_17 = null;
                var43_57 = var4_4 /* !! */ .d;
                var50_67 = var29_24.b;
                var3_3.j = var43_57 = var43_57 + var50_67 + var26_22;
                return 0;
            }
            case 2: {
                var22_18 = 0;
                var20_16 = var3_3.l;
                var8_7 = 4;
                var9_8 = new Xm2(var20_16 -= var8_7);
                var52_71 /* !! */  = var9_8.a;
                var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                var4_4 /* !! */ .e(var52_71 /* !! */ , 0, var20_16, false);
                var33_37 = 1819436136;
                var21_17 = xu1_1.b(var33_37, (Xm2)var9_8);
                var20_16 = var21_17.b;
                if (var20_16 != var33_37) ** GOTO lbl411
                var4_4 /* !! */  = (lu_1)var21_17.a(lu_1.class);
                if (var4_4 /* !! */  == null) ** GOTO lbl410
                var3_3.g = var4_4 /* !! */ ;
                var20_16 = var4_4 /* !! */ .c;
                var50_68 = var20_16;
                var33_37 = var4_4 /* !! */ .a;
                var10_9 = var33_37;
                var3_3.h = var50_68 *= var10_9;
                var4_4 /* !! */  = new ArrayList();
                var21_17 = var21_17.a.iterator();
                var8_7 = 0;
                var9_8 = null;
                while ((var20_16 = (int)var21_17.hasNext()) != 0) {
                    var23_19 = (ju)var21_17.next();
                    var31_30 = var23_19.getType();
                    if (var31_30 != (var42_50 = 1819440243)) continue;
                    var23_19 = (xu1_1)var23_19;
                    var46_63 = var8_7 + 1;
                    var52_71 /* !! */  = (byte[])((mu_0)var23_19.a(mu_0.class));
                    var32_33 = (vd3_0)var23_19.a(vd3_0.class);
                    if (var52_71 /* !! */  != null) ** GOTO lbl367
                    var23_19 = "Missing Stream Header";
                    Cx.f((String)var23_19);
lbl363:
                    // 3 sources

                    while (true) {
                        var40_45 = false;
                        var30_25 = null;
                        ** GOTO lbl400
                        break;
                    }
lbl367:
                    // 1 sources

                    if (var32_33 != null) ** GOTO lbl371
                    var23_19 = "Missing Stream Format";
                    Cx.f((String)var23_19);
                    ** GOTO lbl363
lbl371:
                    // 1 sources

                    var38_43 = var52_71 /* !! */ .d;
                    var14_12 = var52_71 /* !! */ .b;
                    var56_77 = 1000000L * var14_12;
                    var12_10 /* !! */  = var52_71 /* !! */ .c;
                    var14_12 = var12_10 /* !! */ ;
                    var16_13 /* !! */  = gz3.a;
                    var58_78 = RoundingMode.DOWN;
                    var26_22 = var14_12;
                    var38_43 = gz3.O(var38_43, var56_77, var14_12, var58_78);
                    var32_33 = var32_33.a;
                    var13_11 = var32_33.a();
                    var45_59 = Integer.toString(var8_7);
                    var13_11.a = var45_59;
                    var28_23 = var52_71 /* !! */ .e;
                    if (var28_23 != 0) {
                        var13_11.o = var28_23;
                    }
                    if ((var23_19 = (yd3_1)var23_19.a((Class)(var45_59 = yd3_1.class))) != null) {
                        var13_11.b = var23_19 = var23_19.a;
                    }
                    if ((var42_50 = ip1_0.g((String)(var23_19 = var32_33.o))) == var5_5 || var42_50 == (var20_16 = 2)) ** break;
                    ** continue;
                    var29_24 = var3_3.f.n(var8_7, var42_50);
                    var23_19 = new d((d$a)var13_11);
                    var29_24.d((d)var23_19);
                    var28_23 = var52_71 /* !! */ .d;
                    var23_19 = var30_25;
                    var31_30 = var42_50;
                    var34_40 = var38_43;
                    var30_25 = new HU(var8_7, var42_50, var38_43, var28_23, (wp3)var29_24);
                    var3_3.h = var50_68 = Math.max(var3_3.h, var38_43);
lbl400:
                    // 2 sources

                    if (var30_25 != null) {
                        var4_4 /* !! */ .add(var30_25);
                    }
                    var8_7 = var46_63;
                }
                var53_74 = new HU[]{};
                var3_3.i = var4_4 /* !! */  = var4_4 /* !! */ .toArray(var53_74);
                var3_3.f.j();
                var3_3.e = 3;
                return 0;
lbl410:
                // 1 sources

                throw ParserException.a("AviHeader not found", null);
lbl411:
                // 1 sources

                var4_4 /* !! */  = new StringBuilder("Unexpected header list type ");
                var4_4 /* !! */ .append(var20_16);
                throw ParserException.a(var4_4 /* !! */ .toString(), null);
            }
            case 1: {
                var53_75 = var30_25.a;
                var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
                var22_18 = 0;
                var21_17 = null;
                var4_4 /* !! */ .e(var53_75, 0, var28_23, false);
                var30_25.I(0);
                var29_24.getClass();
                var29_24.a = var33_38 = var30_25.k();
                var29_24.b = var33_38 = var30_25.k();
                var29_24.c = 0;
                var33_38 = var29_24.a;
                if (var33_38 == var12_10 /* !! */ ) {
                    var29_24.c = var33_38 = var30_25.k();
                    var5_5 = 1819436136;
                    if (var33_38 == var5_5) {
                        var3_3.l = var33_38 = var29_24.b;
                        var3_3.e = 2;
                        return 0;
                    }
                    var4_4 /* !! */  = new StringBuilder("hdrl expected, found: ");
                    var5_5 = var29_24.c;
                    var4_4 /* !! */ .append(var5_5);
                    throw ParserException.a(var4_4 /* !! */ .toString(), null);
                }
                var4_4 /* !! */  = new StringBuilder("LIST expected, found: ");
                var5_5 = var29_24.a;
                var4_4 /* !! */ .append(var5_5);
                throw ParserException.a(var4_4 /* !! */ .toString(), null);
            }
            case 0: 
        }
        var22_18 = 0;
        var21_17 = null;
        var20_16 = (int)this.b(var1_1);
        if (var20_16 != 0) {
            var4_4 /* !! */  = (il0_0)var4_4 /* !! */ ;
            var4_4 /* !! */ .j(var28_23);
            var3_3.e = var5_5;
            ** continue;
        }
        throw ParserException.a("AVI Header List not found", null);
    }

    public final boolean b(fi0_0 fi0_02) {
        Xm2 xm2 = this.a;
        byte[] byArray = xm2.a;
        fi0_02 = (il0_0)fi0_02;
        boolean bl2 = false;
        int n3 = 12;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        xm2.I(0);
        int n4 = xm2.k();
        int n7 = 1179011410;
        if (n4 != n7) {
            return false;
        }
        xm2.J(4);
        n4 = xm2.k();
        int n8 = 541677121;
        if (n4 == n8) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        this.j = l3 = (long)-1;
        this.k = null;
        for (HU hU : this.i) {
            int n3 = hU.j;
            if (n3 == 0) {
                hU.h = 0;
                continue;
            }
            long[] lArray = hU.l;
            boolean bl2 = true;
            n3 = gz3.d(lArray, l2, bl2);
            int[] nArray = hU.m;
            hU.h = n3 = nArray[n3];
        }
        l3 = 0L;
        long l4 = l2 - l3;
        int n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n4 == 0) {
            HU[] hUArray = this.i;
            int n7 = hUArray.length;
            this.e = n7 == 0 ? 0 : (n7 = 3);
            return;
        }
        this.e = 6;
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        wf3_1 wf3_12 = null;
        this.e = 0;
        boolean bl2 = this.c;
        if (bl2) {
            vf3$a_0 vf3$a_0 = this.d;
            wf3_12 = new wf3_1(gi0_02, vf3$a_0);
            gi0_02 = wf3_12;
        }
        this.f = gi0_02;
        this.j = -1;
    }

    public final void release() {
    }
}

