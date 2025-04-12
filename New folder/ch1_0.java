/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 */
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*
 * Renamed from cH1
 */
public abstract class ch1_0
extends Gp3 {
    public final void c(cH1$a cH1$a) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Hp3 e(o[] var1_1, sp3 var2_2, j$b var3_3, g var4_4) {
        block81: {
            var5_5 /* !! */  = var1_1;
            var6_7 = var2_2;
            var7_8 = var1_1.length;
            var8_9 = 1;
            var9_10 = new int[var7_8 += var8_9];
            var10_11 = var1_1.length + var8_9;
            var11_12 = new qp3[var10_11][];
            var12_13 = var1_1.length + var8_9;
            var13_14 = new int[var12_13][][];
            var15_16 /* !! */  = null;
            for (var14_15 /* !! */  = 0; var14_15 /* !! */  < var10_11; ++var14_15 /* !! */ ) {
                var16_17 /* !! */  = var6_7.a;
                var17_18 /* !! */  = new qp3[var16_17 /* !! */ ];
                var11_12[var14_15 /* !! */ ] = var17_18 /* !! */ ;
                var18_19 /* !! */  = new int[var16_17 /* !! */ ][];
                var13_14[var14_15 /* !! */ ] = var18_19 /* !! */ ;
            }
            var10_11 = var5_5 /* !! */ .length;
            var19_20 = new int[var10_11];
            var15_16 /* !! */  = null;
            for (var14_15 /* !! */  = 0; var14_15 /* !! */  < var10_11; ++var14_15 /* !! */ ) {
                var18_19 /* !! */  = (int[][])var5_5 /* !! */ [var14_15 /* !! */ ];
                var19_20[var14_15 /* !! */ ] = var16_17 /* !! */  = var18_19 /* !! */ .u();
            }
            var10_11 = 0;
            var20_21 = null;
            while (true) {
                block86: {
                    block85: {
                        if (var10_11 >= (var14_15 /* !! */  = var6_7.a)) break block85;
                        var15_16 /* !! */  = var6_7.a(var10_11);
                        var16_17 /* !! */  = var15_16 /* !! */ .c;
                        var21_22 /* !! */  = 5;
                        if (var16_17 /* !! */  == var21_22 /* !! */ ) {
                            var16_17 /* !! */  = 1;
                        } else {
                            var16_17 /* !! */  = 0;
                            var18_19 /* !! */  = null;
                        }
                        var21_22 /* !! */  = var5_5 /* !! */ .length;
                        var23_24 /* !! */  = null;
                        var24_25 = 0;
                        var25_26 /* !! */  = null;
                        var26_27 /* !! */  = 1;
                        break block86;
                    }
                    var17_18 /* !! */  = new sp3[var5_5 /* !! */ .length];
                    var32_33 = var5_5 /* !! */ .length;
                    var6_7 = new String[var32_33];
                    var18_19 /* !! */  = (int[][])new int[var5_5 /* !! */ .length];
                    var29_30 /* !! */  = null;
                    for (var8_9 = 0; var8_9 < (var10_11 = var5_5 /* !! */ .length); ++var8_9) {
                        var10_11 = var9_10[var8_9];
                        var23_24 /* !! */  = var11_12[var8_9];
                        var23_24 /* !! */  = (qp3[])gz3.K(var10_11, var23_24 /* !! */ );
                        var15_16 /* !! */  = new sp3((qp3[])var23_24 /* !! */ );
                        var17_18 /* !! */ [var8_9] = var15_16 /* !! */ ;
                        var15_16 /* !! */  = (Looper)var13_14[var8_9];
                        var13_14[var8_9] = var20_21 = (int[][])gz3.K(var10_11, (Object[])var15_16 /* !! */ );
                        var20_21 = var5_5 /* !! */ [var8_9].getName();
                        var6_7[var8_9] = var20_21;
                        var20_21 = (b)var5_5 /* !! */ [var8_9];
                        var10_11 = var20_21.b;
                        var18_19 /* !! */ [var8_9] = (int[])var10_11;
                    }
                    var32_33 = var5_5 /* !! */ .length;
                    var32_33 = var9_10[var32_33];
                    var34_35 = var5_5 /* !! */ .length;
                    var5_5 /* !! */  = var11_12[var34_35];
                    var5_5 /* !! */  = (qp3[])gz3.K(var32_33, var5_5 /* !! */ );
                    var33_34 = new sp3((qp3[])var5_5 /* !! */ );
                    var15_16 /* !! */  = var5_5 /* !! */ ;
                    var23_24 /* !! */  = (Object[])var19_20;
                    var25_26 /* !! */  = var13_14;
                    var5_5 /* !! */  = new cH1$a((int[])var18_19 /* !! */ , (sp3[])var17_18 /* !! */ , (int[])var19_20, (int[][][])var13_14, (sp3)var33_34);
                    var6_7 = this;
                    var6_7 = (zn0)this;
                    var9_10 = var6_7.c;
                    synchronized (var9_10) {
                        try {
                            var29_30 /* !! */  = (int[])var6_7.g;
                            var10_11 = (int)var29_30 /* !! */ .N;
                            var35_36 /* !! */  = 32;
                            if (var10_11 == 0 || (var10_11 = gz3.a) < var35_36 /* !! */  || (var20_21 = (Object)var6_7.h) == null) break;
                            var15_16 /* !! */  = Looper.myLooper();
                            ct3.h(var15_16 /* !! */ );
                            var18_19 /* !! */  = (int[][])var20_21.d;
                            if (var18_19 /* !! */  != null || (var18_19 /* !! */  = (int[][])var20_21.c) != null) break;
                            var18_19 /* !! */  = (int[][])new Hn0;
                            var18_19 /* !! */ ((zn0)var6_7);
                            var20_21.d = var18_19 /* !! */ ;
                            var18_19 /* !! */  = (int[][])new Handler;
                            var18_19 /* !! */ (var15_16 /* !! */ );
                            var20_21.c = (Handler)var18_19 /* !! */ ;
                            var15_16 /* !! */  = var20_21.a;
                            var17_18 /* !! */  = new dl0_0((Handler)var18_19 /* !! */ );
                            var20_21 = var20_21.d;
                            Cn0.a((Spatializer)var15_16 /* !! */ , (dl0_0)var17_18 /* !! */ , (Hn0)var20_21);
                            break;
                        }
                        catch (Throwable var5_6) {
                            ** break block87
                        }
                    }
                }
                for (var22_23 /* !! */  = 0; var22_23 /* !! */  < (var27_28 = var5_5 /* !! */ .length); ++var22_23 /* !! */ ) {
                    var28_29 = var5_5 /* !! */ [var22_23 /* !! */ ];
                    var8_9 = 0;
                    var29_30 /* !! */  = null;
                    var31_32 = null;
                    for (var30_31 = 0; var30_31 < (var32_33 = var15_16 /* !! */ .a); ++var30_31) {
                        var6_7 = var15_16 /* !! */ .d[var30_31];
                        var32_33 = var28_29.a((d)var6_7) & 7;
                        var8_9 = Math.max(var8_9, var32_33);
                    }
                    var32_33 = var9_10[var22_23 /* !! */ ];
                    if (var32_33 == 0) {
                        var32_33 = 1;
                    } else {
                        var32_33 = 0;
                        var6_7 = null;
                    }
                    if (var8_9 > var24_25 || var8_9 == var24_25 && var16_17 /* !! */  != 0 && var26_27 /* !! */  == 0 && var32_33 != 0) {
                        var26_27 /* !! */  = var32_33;
                        var24_25 = var8_9;
                        var21_22 /* !! */  = var22_23 /* !! */ ;
                    }
                    var6_7 = var2_2;
                    var8_9 = 1;
                }
                var32_33 = var5_5 /* !! */ .length;
                if (var21_22 /* !! */  == var32_33) {
                    var32_33 = var15_16 /* !! */ .a;
                    var6_7 = new int[var32_33];
                } else {
                    var6_7 = var5_5 /* !! */ [var21_22 /* !! */ ];
                    var8_9 = var15_16 /* !! */ .a;
                    var29_30 /* !! */  = new int[var8_9];
                    var18_19 /* !! */  = null;
                    for (var16_17 /* !! */  = 0; var16_17 /* !! */  < (var22_23 /* !! */  = var15_16 /* !! */ .a); ++var16_17 /* !! */ ) {
                        var23_24 /* !! */  = var15_16 /* !! */ .d[var16_17 /* !! */ ];
                        var29_30 /* !! */ [var16_17 /* !! */ ] = var22_23 /* !! */  = var6_7.a((d)var23_24 /* !! */ );
                    }
                    var6_7 = var29_30 /* !! */ ;
                }
                var8_9 = var9_10[var21_22 /* !! */ ];
                var18_19 /* !! */  = (int[][])var11_12[var21_22 /* !! */ ];
                var18_19 /* !! */ [var8_9] = (int[])var15_16 /* !! */ ;
                var15_16 /* !! */  = (Looper)var13_14[var21_22 /* !! */ ];
                var15_16 /* !! */ [var8_9] = var6_7;
                var32_33 = 1;
                var9_10[var21_22 /* !! */ ] = var8_9 += var32_33;
                ++var10_11;
                var6_7 = var2_2;
                var8_9 = 1;
            }
            var7_8 = var5_5 /* !! */ .a;
            var20_21 = new DF0$a[var7_8];
            var29_30 /* !! */ .s.getClass();
            var15_16 /* !! */  = new un0_1((zn0$d)var29_30 /* !! */ , (int[])var19_20);
            var18_19 /* !! */  = (int[][])new vn0;
            var18_19 /* !! */ ();
            var21_22 /* !! */  = 2;
            var15_16 /* !! */  = zn0.n(var21_22 /* !! */ , (cH1$a)var5_5 /* !! */ , (int[][][])var13_14, (zn0$h$a)var15_16 /* !! */ , (Comparator)var18_19 /* !! */ );
            var16_17 /* !! */  = (int)var29_30 /* !! */ .x;
            var23_24 /* !! */  = var29_30 /* !! */ .s;
            var24_25 = 4;
            if (var16_17 /* !! */  == 0 && var15_16 /* !! */  != null) {
                var16_17 /* !! */  = 0;
                var18_19 /* !! */  = null;
            } else {
                var23_24 /* !! */ .getClass();
                var18_19 /* !! */  = (int[][])new i9_0;
                var30_31 = 3;
                var18_19 /* !! */ (var29_30 /* !! */ , var30_31);
                var31_32 = new Object();
                var18_19 /* !! */  = zn0.n(var24_25, (cH1$a)var5_5 /* !! */ , (int[][][])var13_14, (zn0$h$a)var18_19 /* !! */ , (Comparator)var31_32);
            }
            if (var18_19 /* !! */  != null) {
                var15_16 /* !! */  = (Integer)var18_19 /* !! */ .second;
                var14_15 /* !! */  = var15_16 /* !! */ .intValue();
                var18_19 /* !! */  = (DF0$a)var18_19 /* !! */ .first;
                var20_21[var14_15 /* !! */ ] = (int[])var18_19 /* !! */ ;
            } else if (var15_16 /* !! */  != null) {
                var18_19 /* !! */  = (int[][])((Integer)var15_16 /* !! */ .second);
                var16_17 /* !! */  = var18_19 /* !! */ .intValue();
                var15_16 /* !! */  = (DF0$a)var15_16 /* !! */ .first;
                var20_21[var16_17 /* !! */ ] = (int[])var15_16 /* !! */ ;
            }
            var14_15 /* !! */  = 0;
            var15_16 /* !! */  = null;
            while (true) {
                var18_19 /* !! */  = var5_5 /* !! */ .c;
                var31_32 = var5_5 /* !! */ .b;
                var27_28 = var5_5 /* !! */ .a;
                if (var14_15 /* !! */  >= var27_28) break;
                var27_28 = (int)var31_32[var14_15 /* !! */ ];
                if (var21_22 /* !! */  == var27_28) {
                    var28_29 = var18_19 /* !! */ [var14_15 /* !! */ ];
                    var27_28 = var28_29.a;
                    if (var27_28 > 0) {
                        var14_15 /* !! */  = 1;
                        break block81;
                    }
                }
                ++var14_15 /* !! */ ;
            }
            var14_15 /* !! */  = 0;
            var15_16 /* !! */  = null;
        }
        var28_29 = new sn0((zn0)var6_7, (zn0$d)var29_30 /* !! */ , (boolean)var14_15 /* !! */ , (int[])var19_20);
        var15_16 /* !! */  = new Object();
        var36_37 = true;
        var15_16 /* !! */  = zn0.n(var36_37, (cH1$a)var5_5 /* !! */ , (int[][][])var13_14, (zn0$h$a)var28_29, (Comparator)var15_16 /* !! */ );
        if (var15_16 /* !! */  != null) {
            var19_20 = (Integer)var15_16 /* !! */ .second;
            var36_37 = var19_20.intValue();
            var28_29 = (DF0$a)var15_16 /* !! */ .first;
            var20_21[var36_37] = (int[])var28_29;
        }
        if (var15_16 /* !! */  == null) {
            var14_15 /* !! */  = 0;
            var15_16 /* !! */  = null;
        } else {
            var15_16 /* !! */  = (DF0$a)var15_16 /* !! */ .first;
            var19_20 = var15_16 /* !! */ .a;
            var15_16 /* !! */  = (Looper)var15_16 /* !! */ .b;
            var27_28 = 0;
            var28_29 = null;
            var14_15 /* !! */  = var15_16 /* !! */ [0];
            var19_20 = var19_20.d;
            var15_16 /* !! */  = var19_20[var14_15 /* !! */ ].d;
        }
        var23_24 /* !! */ .getClass();
        var23_24 /* !! */  = new wn0((zn0$d)var29_30 /* !! */ , (String)var15_16 /* !! */ );
        var15_16 /* !! */  = new Object();
        var36_37 = 3 != 0;
        var15_16 /* !! */  = zn0.n(var36_37, (cH1$a)var5_5 /* !! */ , (int[][][])var13_14, (zn0$h$a)var23_24 /* !! */ , (Comparator)var15_16 /* !! */ );
        if (var15_16 /* !! */  != null) {
            var23_24 /* !! */  = (Integer)var15_16 /* !! */ .second;
            var22_23 /* !! */  = var23_24 /* !! */ .intValue();
            var15_16 /* !! */  = (DF0$a)var15_16 /* !! */ .first;
            var20_21[var22_23 /* !! */ ] = (int[])var15_16 /* !! */ ;
        }
        var15_16 /* !! */  = null;
        for (var14_15 /* !! */  = 0; var14_15 /* !! */  < var7_8; ++var14_15 /* !! */ ) {
            block93: {
                block88: {
                    var22_23 /* !! */  = (int)var31_32[var14_15 /* !! */ ];
                    if (var22_23 /* !! */  == var21_22 /* !! */  || var22_23 /* !! */  == (var27_28 = 1) || var22_23 /* !! */  == var36_37 || var22_23 /* !! */  == var24_25) break block88;
                    var23_24 /* !! */  = var18_19 /* !! */ [var14_15 /* !! */ ];
                    var28_29 = var13_14[var14_15 /* !! */ ];
                    var24_25 = 0;
                    var25_26 /* !! */  = null;
                    var19_20 = null;
                    var37_38 = 0;
                    var38_39 /* !! */  = null;
                    var39_40 = 0;
                    var40_41 = null;
                    for (var36_37 = false; var36_37 < (var35_36 /* !! */  = var23_24 /* !! */ .a); ++var36_37) {
                        var11_12 = var23_24 /* !! */ .a(var36_37);
                        var41_42 = var28_29[var36_37];
                        var17_18 /* !! */  = var40_41;
                        var39_40 = var37_38;
                        var38_39 /* !! */  = var25_26 /* !! */ ;
                        var25_26 /* !! */  = null;
                        for (var24_25 = 0; var24_25 < (var26_27 /* !! */  = var11_12.a); ++var24_25) {
                            block91: {
                                block89: {
                                    block92: {
                                        block90: {
                                            var26_27 /* !! */  = (int)var41_42[var24_25];
                                            var42_43 = var18_19 /* !! */ ;
                                            var16_17 /* !! */  = (int)var29_30 /* !! */ .O;
                                            if ((var16_17 /* !! */  = tj2_0.d(var26_27 /* !! */ , (boolean)var16_17 /* !! */ )) == 0) break block89;
                                            var18_19 /* !! */  = (int[][])var11_12.d[var24_25];
                                            var43_44 = var11_12;
                                            var35_36 /* !! */  = (int)var41_42[var24_25];
                                            var33_34 = new zn0$c((d)var18_19 /* !! */ , var35_36 /* !! */ );
                                            if (var17_18 /* !! */  == null) break block90;
                                            var11_12 = ComparisonChain.start();
                                            var16_17 /* !! */  = (int)var17_18 /* !! */ .b;
                                            var44_45 = var23_24 /* !! */ ;
                                            var22_23 /* !! */  = (int)var33_34.b;
                                            var11_12 = var11_12.compareFalseFirst((boolean)var22_23 /* !! */ , (boolean)var16_17 /* !! */ );
                                            var16_17 /* !! */  = (int)var33_34.a;
                                            var22_23 /* !! */  = (int)var17_18 /* !! */ .a;
                                            var35_36 /* !! */  = (var11_12 = var11_12.compareFalseFirst((boolean)var16_17 /* !! */ , (boolean)var22_23 /* !! */ )).result();
                                            if (var35_36 /* !! */  <= 0) break block91;
                                            break block92;
                                        }
                                        var44_45 = var23_24 /* !! */ ;
                                    }
                                    var39_40 = var24_25;
                                    var17_18 /* !! */  = var33_34;
                                    var38_39 /* !! */  = (int[][][])var43_44;
                                    break block91;
                                }
                                var43_44 = var11_12;
                                var44_45 = var23_24 /* !! */ ;
                            }
                            var18_19 /* !! */  = (int[][])var42_43;
                            var11_12 = var43_44;
                            var23_24 /* !! */  = var44_45;
                        }
                        var42_43 = var18_19 /* !! */ ;
                        var44_45 = var23_24 /* !! */ ;
                        var25_26 /* !! */  = var38_39 /* !! */ ;
                        var37_38 = var39_40;
                        var40_41 = var17_18 /* !! */ ;
                        var21_22 /* !! */  = 2;
                    }
                    var42_43 = var18_19 /* !! */ ;
                    if (var25_26 /* !! */  == null) {
                        var35_36 /* !! */  = 0;
                        var11_12 = null;
                    } else {
                        var18_19 /* !! */  = (int[][])new int[]{var37_38};
                        var11_12 = new DF0$a((qp3)var25_26 /* !! */ , (int[])var18_19 /* !! */ );
                    }
                    var20_21[var14_15 /* !! */ ] = (int[])var11_12;
                    break block93;
                }
                var42_43 = var18_19 /* !! */ ;
            }
            var18_19 /* !! */  = var42_43;
            var35_36 /* !! */  = 32;
            var21_22 /* !! */  = 2;
            var24_25 = 4;
            var36_37 = 3 != 0;
        }
        var35_36 /* !! */  = var5_5 /* !! */ .a;
        var15_16 /* !! */  = new HashMap();
        var16_17 /* !! */  = 0;
        var18_19 /* !! */  = null;
        while (true) {
            var17_18 /* !! */  = var5_5 /* !! */ .c;
            if (var16_17 /* !! */  >= var35_36 /* !! */ ) break;
            var17_18 /* !! */  = var17_18 /* !! */ [var16_17 /* !! */ ];
            zn0.i((sp3)var17_18 /* !! */ , (Fp3)var29_30 /* !! */ , (HashMap)var15_16 /* !! */ );
            ++var16_17 /* !! */ ;
        }
        zn0.i(var5_5 /* !! */ .f, (Fp3)var29_30 /* !! */ , (HashMap)var15_16 /* !! */ );
        var16_17 /* !! */  = 0;
        var18_19 /* !! */  = null;
        while (true) {
            block94: {
                var22_23 /* !! */  = -1 != 0;
                if (var16_17 /* !! */  >= var35_36 /* !! */ ) break;
                var24_25 = var5_5 /* !! */ .b[var16_17 /* !! */ ];
                var25_26 /* !! */  = (int[][][])var24_25;
                if ((var25_26 /* !! */  = (int[][][])((Ep3)var15_16 /* !! */ .get(var25_26 /* !! */ ))) == null) break block94;
                var33_34 = var25_26 /* !! */ .b;
                var30_31 = (int)var33_34.isEmpty();
                if (var30_31 != 0) ** GOTO lbl-1000
                var31_32 = var17_18 /* !! */ [var16_17 /* !! */ ];
                var31_32 = var31_32.b;
                var25_26 /* !! */  = (int[][][])var25_26 /* !! */ .a;
                var30_31 = var31_32.indexOf(var25_26 /* !! */ );
                if (var30_31 < 0) {
                    var30_31 = -1;
                }
                if (var30_31 != var22_23 /* !! */ ) {
                    var33_34 = Ints.toArray((Collection)var33_34);
                    var23_24 /* !! */  = new DF0$a((qp3)var25_26 /* !! */ , (int[])var33_34);
                } else lbl-1000:
                // 2 sources

                {
                    var22_23 /* !! */  = false;
                    var23_24 /* !! */  = null;
                }
                var20_21[var16_17 /* !! */ ] = (int[])var23_24 /* !! */ ;
            }
            ++var16_17 /* !! */ ;
        }
        var35_36 /* !! */  = var5_5 /* !! */ .a;
        var15_16 /* !! */  = null;
        for (var14_15 /* !! */  = 0; var14_15 /* !! */  < var35_36 /* !! */ ; ++var14_15 /* !! */ ) {
            var18_19 /* !! */  = var5_5 /* !! */ .c[var14_15 /* !! */ ];
            var17_18 /* !! */  = (Map)var29_30 /* !! */ .S.get(var14_15 /* !! */ );
            if (var17_18 /* !! */  == null || (var21_22 /* !! */  = (int)var17_18 /* !! */ .containsKey(var18_19 /* !! */ )) == 0) continue;
            var17_18 /* !! */  = (Map)var29_30 /* !! */ .S.get(var14_15 /* !! */ );
            if (var17_18 /* !! */  != null) {
                var18_19 /* !! */  = (int[][])((zn0$e)var17_18 /* !! */ .get(var18_19 /* !! */ ));
            } else {
                var16_17 /* !! */  = 0;
                var18_19 /* !! */  = null;
            }
            if (var18_19 /* !! */  != null) {
                throw null;
            }
            var16_17 /* !! */  = 0;
            var18_19 /* !! */  = null;
            var20_21[var14_15 /* !! */ ] = null;
        }
        var11_12 = null;
        for (var35_36 /* !! */  = 0; var35_36 /* !! */  < var7_8; ++var35_36 /* !! */ ) {
            var15_16 /* !! */  = (Looper)var5_5 /* !! */ .b;
            var14_15 /* !! */  = (int)var15_16 /* !! */ [var35_36 /* !! */ ];
            var18_19 /* !! */  = (int[][])var29_30 /* !! */ .T;
            var16_17 /* !! */  = (int)var18_19 /* !! */ .get(var35_36 /* !! */ );
            if (var16_17 /* !! */  != 0 || (var14_15 /* !! */  = (int)(var18_19 /* !! */  = (int[][])var29_30 /* !! */ .B).contains(var15_16 /* !! */  = Integer.valueOf(var14_15 /* !! */ ))) != 0) {
                var16_17 /* !! */  = 0;
                var18_19 /* !! */  = null;
                var20_21[var35_36 /* !! */ ] = null;
                continue;
            }
            var16_17 /* !! */  = 0;
            var18_19 /* !! */  = null;
        }
        var16_17 /* !! */  = 0;
        var18_19 /* !! */  = null;
        var11_12 = var6_7.e;
        var6_7 = var6_7.b;
        ct3.h(var6_7);
        var6_7 = var11_12.a((DF0$a[])var20_21, (iv_0)var6_7);
        var20_21 = new uJ2[var7_8];
        var11_12 = null;
        for (var35_36 /* !! */  = 0; var35_36 /* !! */  < var7_8; ++var35_36 /* !! */ ) {
            var15_16 /* !! */  = (Looper)var5_5 /* !! */ .b;
            var14_15 /* !! */  = (int)var15_16 /* !! */ [var35_36 /* !! */ ];
            var17_18 /* !! */  = var29_30 /* !! */ .T;
            var21_22 /* !! */  = (int)var17_18 /* !! */ .get(var35_36 /* !! */ );
            if (var21_22 /* !! */  == 0 && (var14_15 /* !! */  = (int)(var17_18 /* !! */  = var29_30 /* !! */ .B).contains(var15_16 /* !! */  = Integer.valueOf(var14_15 /* !! */ ))) == 0 && ((var14_15 /* !! */  = (int)(var15_16 /* !! */  = (Looper)var5_5 /* !! */ .b)[var35_36 /* !! */ ]) == (var21_22 /* !! */  = -2) || (var15_16 /* !! */  = var6_7[var35_36 /* !! */ ]) != null)) {
                var15_16 /* !! */  = uJ2.c;
            } else {
                var14_15 /* !! */  = 0;
                var15_16 /* !! */  = null;
            }
            var20_21[var35_36 /* !! */ ] = (int[])var15_16 /* !! */ ;
        }
        var7_8 = (int)var29_30 /* !! */ .P;
        if (var7_8 != 0) {
            block83: {
                var9_10 = null;
                var35_36 /* !! */  = -1;
                var14_15 /* !! */  = -1;
                for (var7_8 = 0; var7_8 < (var21_22 /* !! */  = var5_5 /* !! */ .a); ++var7_8) {
                    block82: {
                        var17_18 /* !! */  = var5_5 /* !! */ .b;
                        var21_22 /* !! */  = (int)var17_18 /* !! */ [var7_8];
                        var25_26 /* !! */  = (int[][][])var6_7[var7_8];
                        var26_27 /* !! */  = 1;
                        if (var21_22 /* !! */  != var26_27 /* !! */ ) {
                            var26_27 /* !! */  = 2;
                            if (var21_22 /* !! */  != var26_27 /* !! */ ) {
                                while (true) {
                                    var26_27 /* !! */  = 32;
                                    break block82;
                                    break;
                                }
                            }
                        } else {
                            var26_27 /* !! */  = 2;
                        }
                        if (var25_26 /* !! */  == null) ** continue;
                        var31_32 = var13_14[var7_8];
                        var19_20 = var5_5 /* !! */ .c[var7_8];
                        var19_20 = var19_20.b;
                        var28_29 = var25_26 /* !! */ .d();
                        var36_37 = var19_20.indexOf(var28_29);
                        if (var36_37 < 0) {
                            var36_37 = -1;
                        }
                        var28_29 = null;
                        for (var27_28 = 0; var27_28 < (var16_17 /* !! */  = var25_26 /* !! */ .length()); ++var27_28) {
                            var18_19 /* !! */  = (int[][])var31_32[var36_37];
                            var37_38 = var25_26 /* !! */ .b(var27_28);
                            var16_17 /* !! */  = (int)var18_19 /* !! */ [var37_38];
                            var26_27 /* !! */  = 32;
                            if ((var16_17 /* !! */  &= var26_27 /* !! */ ) == var26_27 /* !! */ ) {
                                var26_27 /* !! */  = 2;
                                continue;
                            }
                            break block82;
                        }
                        var16_17 /* !! */  = 1;
                        var26_27 /* !! */  = 32;
                        if (var21_22 /* !! */  == var16_17 /* !! */ ) {
                            if (var14_15 /* !! */  != var22_23 /* !! */ ) {
                                while (true) {
                                    var7_8 = 0;
                                    var9_10 = null;
                                    break block83;
                                    break;
                                }
                            }
                            var14_15 /* !! */  = var7_8;
                        } else {
                            if (var35_36 /* !! */  != var22_23 /* !! */ ) ** continue;
                            var35_36 /* !! */  = var7_8;
                        }
                    }
                    var16_17 /* !! */  = 0;
                    var18_19 /* !! */  = null;
                }
                var7_8 = 1;
            }
            if (var14_15 /* !! */  != var22_23 /* !! */  && var35_36 /* !! */  != var22_23 /* !! */ ) {
                var12_13 = 1;
            } else {
                var12_13 = 0;
                var13_14 = null;
            }
            if ((var7_8 &= var12_13) != 0) {
                var9_10 = new uJ2;
                var12_13 = 1;
                var16_17 /* !! */  = 0;
                var18_19 /* !! */  = null;
                var9_10(0, (boolean)var12_13);
                var20_21[var14_15 /* !! */ ] = var9_10;
                var20_21[var35_36 /* !! */ ] = var9_10;
            }
        }
        var29_30 /* !! */ .s.getClass();
        var6_7 = Pair.create((Object)var20_21, (Object)var6_7);
        var9_10 = (Cp3[])var6_7.second;
        var8_9 = ((int[])var9_10).length;
        var29_30 /* !! */  = (int[])new List[var8_9];
        var28_29 = null;
        for (var27_28 = 0; var27_28 < (var10_11 = ((int[])var9_10).length); ++var27_28) {
            var20_21 = var9_10[var27_28];
            var20_21 = var20_21 != null ? (Object)ImmutableList.of(var20_21) : (Object)ImmutableList.of();
            var29_30 /* !! */ [var27_28] = (int)var20_21;
        }
        var9_10 = new ImmutableList$Builder;
        var9_10();
        var28_29 = null;
        for (var27_28 = 0; var27_28 < (var10_11 = var5_5 /* !! */ .a); ++var27_28) {
            var20_21 = var5_5 /* !! */ .c;
            var11_12 = var20_21[var27_28];
            var13_14 = var29_30 /* !! */ [var27_28];
            var15_16 /* !! */  = null;
            for (var14_15 /* !! */  = 0; var14_15 /* !! */  < (var16_17 /* !! */  = var11_12.a); ++var14_15 /* !! */ ) {
                var18_19 /* !! */  = (int[][])var11_12.a(var14_15 /* !! */ );
                var17_18 /* !! */  = var20_21[var27_28].a(var14_15 /* !! */ );
                var21_22 /* !! */  = var17_18 /* !! */ .a;
                var25_26 /* !! */  = (int[][][])new int[var21_22 /* !! */ ];
                var33_34 = null;
                var30_31 = 0;
                var31_32 = null;
                for (var26_27 /* !! */  = 0; var26_27 /* !! */  < var21_22 /* !! */ ; ++var26_27 /* !! */ ) {
                    var19_20 = var5_5 /* !! */ .e[var27_28][var14_15 /* !! */ ];
                    var36_37 = var19_20[var26_27 /* !! */ ] & 7;
                    var22_23 /* !! */  = 4;
                    if (var36_37 == var22_23 /* !! */ ) {
                        var36_37 = var30_31 + 1;
                        var25_26 /* !! */ [var30_31] = (int[][])var26_27 /* !! */ ;
                        var30_31 = var36_37;
                    }
                    var22_23 /* !! */  = -1;
                }
                var22_23 /* !! */  = 4;
                var17_18 /* !! */  = Arrays.copyOf((int[])var25_26 /* !! */ , var30_31);
                var24_25 = 0;
                var25_26 /* !! */  = null;
                var26_27 /* !! */  = 16;
                var31_32 = null;
                var36_37 = 0;
                var19_20 = null;
                var37_38 = 0;
                var38_39 /* !! */  = null;
                for (var30_31 = 0; var30_31 < (var22_23 /* !! */  = var17_18 /* !! */ .length); ++var30_31) {
                    var22_23 /* !! */  = (int)var17_18 /* !! */ [var30_31];
                    var40_41 = var29_30 /* !! */ ;
                    var29_30 /* !! */  = (int[])var20_21[var27_28].a((int)var14_15 /* !! */ ).d[var22_23 /* !! */ ].o;
                    var22_23 /* !! */  = var37_38 + 1;
                    if (var37_38 == 0) {
                        var25_26 /* !! */  = (int[][][])var29_30 /* !! */ ;
                        var37_38 = 1;
                    } else {
                        var8_9 = (int)Objects.equals(var25_26 /* !! */ , var29_30 /* !! */ );
                        var37_38 = 1;
                        var36_37 = var8_9 = var8_9 ^ 1 | var36_37;
                    }
                    var8_9 = var5_5 /* !! */ .e[var27_28][var14_15 /* !! */ ][var30_31] & 24;
                    var26_27 /* !! */  = Math.min(var26_27 /* !! */ , var8_9);
                    var37_38 = var22_23 /* !! */ ;
                    var29_30 /* !! */  = (int[])var40_41;
                }
                var40_41 = var29_30 /* !! */ ;
                var37_38 = 1;
                if (var36_37 != 0) {
                    var29_30 /* !! */  = var5_5 /* !! */ .d;
                    var8_9 = var29_30 /* !! */ [var27_28];
                    var26_27 /* !! */  = Math.min(var26_27 /* !! */ , var8_9);
                }
                if (var26_27 /* !! */  != 0) {
                    var8_9 = 1;
                } else {
                    var8_9 = 0;
                    var29_30 /* !! */  = null;
                }
                var21_22 /* !! */  = var18_19 /* !! */ .a;
                var23_24 /* !! */  = new int[var21_22 /* !! */ ];
                var17_18 /* !! */  = new boolean[var21_22 /* !! */ ];
                var25_26 /* !! */  = null;
                for (var24_25 = 0; var24_25 < (var26_27 /* !! */  = var18_19 /* !! */ .a); ++var24_25) {
                    block84: {
                        var26_27 /* !! */  = var5_5 /* !! */ .e[var27_28][var14_15 /* !! */ ][var24_25] & 7;
                        var23_24 /* !! */ [var24_25] = var26_27 /* !! */ ;
                        var33_34 = null;
                        for (var26_27 /* !! */  = 0; var26_27 /* !! */  < (var30_31 = var13_14.size()); ++var26_27 /* !! */ ) {
                            var31_32 = (Cp3)var13_14.get(var26_27 /* !! */ );
                            var19_20 = var31_32.d();
                            var36_37 = (int)var19_20.equals(var18_19 /* !! */ );
                            if (var36_37 != 0) {
                                var30_31 = var31_32.c(var24_25);
                                if (var30_31 == (var36_37 = -1)) continue;
                                var26_27 /* !! */  = 1;
                                break block84;
                            }
                            var36_37 = -1;
                        }
                        var36_37 = -1;
                        var26_27 /* !! */  = 0;
                        var33_34 = null;
                    }
                    var17_18 /* !! */ [var24_25] = var26_27 /* !! */ ;
                }
                var36_37 = -1;
                var25_26 /* !! */  = (int[][][])new bq3$a;
                var25_26 /* !! */ ((qp3)var18_19 /* !! */ , (boolean)var8_9, (int[])var23_24 /* !! */ , (boolean[])var17_18 /* !! */ );
                var9_10.add(var25_26 /* !! */ );
                var29_30 /* !! */  = (int[])var40_41;
                var22_23 /* !! */  = -1;
            }
            var40_41 = var29_30 /* !! */ ;
            var36_37 = -1;
            var37_38 = 1;
            var22_23 /* !! */  = -1;
        }
        var27_28 = 0;
        var28_29 = null;
        while (true) {
            var29_30 /* !! */  = (int[])var5_5 /* !! */ .f;
            var10_11 = var29_30 /* !! */ .a;
            if (var27_28 >= var10_11) {
                var29_30 /* !! */  = (int[])new bq3;
                var9_10 = var9_10.build();
                var29_30 /* !! */ ((ImmutableList)var9_10);
                var20_21 = (uJ2[])var6_7.first;
                var6_7 = (DF0[])var6_7.second;
                return new Hp3((uJ2[])var20_21, (DF0[])var6_7, (bq3)var29_30 /* !! */ , (cH1$a)var5_5 /* !! */ );
            }
            var29_30 /* !! */  = (int[])var29_30 /* !! */ .a(var27_28);
            var10_11 = var29_30 /* !! */ .a;
            var20_21 = new int[var10_11];
            var35_36 /* !! */  = 0;
            var11_12 = null;
            Arrays.fill((int[])var20_21, 0);
            var12_13 = var29_30 /* !! */ .a;
            var13_14 = new boolean[var12_13];
            var15_16 /* !! */  = new bq3$a((qp3)var29_30 /* !! */ , false, (int[])var20_21, (boolean[])var13_14);
            var9_10.add(var15_16 /* !! */ );
            ++var27_28;
        }
lbl-1000:
        // 1 sources

        {
            throw var5_6;
        }
    }
}

