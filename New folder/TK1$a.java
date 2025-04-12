/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.Arrays;

public final class TK1$a
implements fx0 {
    public final /* synthetic */ tk1_1 a;

    public TK1$a(tk1_1 tk1_12) {
        this.a = tk1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(int var1_1, int var2_2, il0_0 var3_3) {
        block42: {
            block44: {
                block46: {
                    block34: {
                        block45: {
                            block43: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block39: {
                                                block40: {
                                                    block41: {
                                                        var4_4 = var1_1;
                                                        var5_5 = var2_2;
                                                        var6_6 = var3_3;
                                                        var7_7 = this.a;
                                                        var8_8 /* !! */  = var7_7.c;
                                                        var9_9 = 4;
                                                        var10_10 = 2;
                                                        var11_11 = 0;
                                                        var12_12 /* !! */  = null;
                                                        var13_13 = 1;
                                                        var14_14 = 161;
                                                        var15_15 = 163;
                                                        var16_16 = 0;
                                                        var17_17 /* !! */  = null;
                                                        if (var1_1 == var14_14 || var1_1 == var15_15) break block36;
                                                        var14_14 = 165;
                                                        if (var1_1 == var14_14) break block37;
                                                        var18_18 = 16877;
                                                        if (var1_1 == var18_18) break block38;
                                                        var18_18 = 16981;
                                                        if (var1_1 == var18_18) break block39;
                                                        var18_18 = 18402;
                                                        if (var1_1 == var18_18) break block40;
                                                        var18_18 = 21419;
                                                        if (var1_1 == var18_18) break block41;
                                                        var18_18 = 25506;
                                                        if (var1_1 == var18_18) ** GOTO lbl41
                                                        var18_18 = 30322;
                                                        if (var1_1 == var18_18) {
                                                            var7_7.f(var1_1);
                                                            var19_21 = var7_7.w;
                                                            var8_8 /* !! */  = (SparseArray)new byte[var2_2];
                                                            var19_21.w = (byte[])var8_8 /* !! */ ;
                                                            var3_3.e((byte[])var8_8 /* !! */ , 0, var2_2, false);
                                                        } else {
                                                            var20_31 = new StringBuilder("Unexpected id: ");
                                                            var20_31.append(var1_1);
                                                            throw ParserException.a(var20_31.toString(), null);
lbl41:
                                                            // 1 sources

                                                            var7_7.f(var1_1);
                                                            var19_22 = var7_7.w;
                                                            var8_8 /* !! */  = (SparseArray)new byte[var2_2];
                                                            var19_22.k = (byte[])var8_8 /* !! */ ;
                                                            var3_3.e((byte[])var8_8 /* !! */ , 0, var2_2, false);
                                                        }
                                                        break block42;
                                                    }
                                                    var19_23 = var7_7.k;
                                                    Arrays.fill(var19_23.a, (byte)0);
                                                    var8_8 /* !! */  = (SparseArray)var19_23.a;
                                                    var9_9 = 4 - var2_2;
                                                    var3_3.e((byte[])var8_8 /* !! */ , var9_9, var2_2, false);
                                                    var19_23.I(0);
                                                    var21_34 = var19_23.y();
                                                    var7_7.y = var5_5 = (int)var21_34;
                                                    break block42;
                                                }
                                                var8_8 /* !! */  = (SparseArray)new byte[var2_2];
                                                var3_3.e((byte[])var8_8 /* !! */ , 0, var2_2, false);
                                                var7_7.f(var1_1);
                                                var19_24 = var7_7.w;
                                                var19_24.j = var20_32 = new wp3$a(var13_13, (byte[])var8_8 /* !! */ , 0, 0);
                                                break block42;
                                            }
                                            var7_7.f(var1_1);
                                            var19_25 = var7_7.w;
                                            var8_8 /* !! */  = (SparseArray)new byte[var2_2];
                                            var19_25.i = (byte[])var8_8 /* !! */ ;
                                            var3_3.e((byte[])var8_8 /* !! */ , 0, var2_2, false);
                                            break block42;
                                        }
                                        var7_7.f(var1_1);
                                        var19_26 = var7_7.w;
                                        var18_18 = var19_26.g;
                                        var9_9 = 1685485123;
                                        if (var18_18 != var9_9 && var18_18 != (var9_9 = 1685480259)) {
                                            var3_3.j(var2_2);
                                        } else {
                                            var8_8 /* !! */  = (SparseArray)new byte[var5_5];
                                            var19_26.O = (byte[])var8_8 /* !! */ ;
                                            var6_6.e((byte[])var8_8 /* !! */ , 0, var5_5, false);
                                        }
                                        break block42;
                                    }
                                    var4_4 = var7_7.I;
                                    if (var4_4 != var10_10) break block42;
                                    var4_4 = var7_7.O;
                                    var19_27 = (TK1$b)var8_8 /* !! */ .get(var4_4);
                                    var18_19 = var7_7.R;
                                    if (var18_19 == var9_9 && (var4_4 = (int)(var8_8 /* !! */  = "V_VP9").equals(var19_27 = var19_27.b)) != 0) {
                                        var19_27 = var7_7.p;
                                        var19_27.F(var2_2);
                                        var19_27 = var19_27.a;
                                        var3_3.e((byte[])var19_27, 0, var2_2, false);
                                    } else {
                                        var6_6.j(var5_5);
                                    }
                                    break block42;
                                }
                                var14_14 = var7_7.I;
                                var23_35 = 8;
                                var24_36 = var7_7.i;
                                if (var14_14 == 0) {
                                    var25_37 = var7_7.b;
                                    var26_38 = var25_37.c(var6_6, false, (boolean)var13_13, var23_35);
                                    var7_7.O = var16_16 = (int)var26_38;
                                    var7_7.P = var14_14 = var25_37.c;
                                    var7_7.K = var28_39 = -9223372036854775807L;
                                    var7_7.I = var13_13;
                                    var24_36.F(0);
                                }
                                var14_14 = var7_7.O;
                                var17_17 /* !! */  = var8_8 /* !! */  = var8_8 /* !! */ .get(var14_14);
                                var17_17 /* !! */  = (TK1$b)var8_8 /* !! */ ;
                                if (var17_17 /* !! */  != null) break block43;
                                var4_4 = var7_7.P;
                                var4_4 = var5_5 - var4_4;
                                var6_6.j(var4_4);
                                var7_7.I = 0;
                                break block42;
                            }
                            var8_8 /* !! */  = var17_17 /* !! */ .Y;
                            var8_8 /* !! */ .getClass();
                            var18_20 /* !! */  = var7_7.I;
                            if (var18_20 /* !! */  != var13_13) break block44;
                            var18_20 /* !! */  = 3;
                            var7_7.j(var6_6, var18_20 /* !! */ );
                            var25_37 = var24_36.a;
                            var14_14 = (var25_37[var10_10] & 6) >> var13_13;
                            var15_15 = 255;
                            if (var14_14 == 0) {
                                var7_7.M = var13_13;
                                var30_40 /* !! */  = var7_7.N;
                                if (var30_40 /* !! */  == null) {
                                    var30_40 /* !! */  = new int[var13_13];
                                } else {
                                    var14_14 = var30_40 /* !! */ .length;
                                    if (var14_14 < var13_13) {
                                        var9_9 = Math.max(var30_40 /* !! */ .length * 2, var13_13);
                                        var30_40 /* !! */  = new int[var9_9];
                                    }
                                }
                                var7_7.N = var30_40 /* !! */ ;
                                var14_14 = var7_7.P;
                                var30_40 /* !! */ [0] = var5_5 = var5_5 - var14_14 - var18_20 /* !! */ ;
lbl148:
                                // 3 sources

                                while (true) {
                                    var31_45 /* !! */  = var17_17 /* !! */ ;
                                    break block34;
                                    break;
                                }
                            }
                            var7_7.j(var6_6, var9_9);
                            var32_41 /* !! */  = var24_36.a;
                            var7_7.M = var33_42 = (var32_41 /* !! */ [var18_20 /* !! */ ] & var15_15) + var13_13;
                            var34_43 = var7_7.N;
                            if (var34_43 == null) {
                                var34_43 = new int[var33_42];
                            } else {
                                var18_20 /* !! */  = var34_43.length;
                                if (var18_20 /* !! */  < var33_42) {
                                    var18_20 /* !! */  = Math.max(var34_43.length * 2, var33_42);
                                    var34_43 = new int[var18_20 /* !! */ ];
                                }
                            }
                            var7_7.N = var34_43;
                            if (var14_14 != var10_10) break block45;
                            var18_20 /* !! */  = var7_7.P;
                            var5_5 = var5_5 - var18_20 /* !! */  - var9_9;
                            var18_20 /* !! */  = var7_7.M;
                            Arrays.fill(var34_43, 0, var18_20 /* !! */ , var5_5 /= var18_20 /* !! */ );
                            ** GOTO lbl148
                        }
                        if (var14_14 == var13_13) {
                            var8_8 /* !! */  = null;
                            var14_14 = 0;
                            var25_37 = null;
                            block1: for (var18_20 /* !! */  = 0; var18_20 /* !! */  < (var23_35 = var7_7.M - var13_13); ++var18_20 /* !! */ ) {
                                var34_43 = var7_7.N;
                                var34_43[var18_20 /* !! */ ] = 0;
                                while (true) {
                                    var23_35 = var9_9 + 1;
                                    var7_7.j(var6_6, var23_35);
                                    var9_9 = var24_36.a[var9_9] & var15_15;
                                    var32_41 /* !! */  = (byte[])var7_7.N;
                                    var32_41 /* !! */ [var18_20 /* !! */ ] = var35_44 = var32_41 /* !! */ [var18_20 /* !! */ ] + var9_9;
                                    if (var9_9 != var15_15) {
                                        var14_14 += var35_44;
                                        var9_9 = var23_35;
                                        continue block1;
                                    }
                                    var9_9 = var23_35;
                                }
                            }
                            var8_8 /* !! */  = (SparseArray)var7_7.N;
                            var33_42 = var7_7.P;
                            var5_5 = var5_5 - var33_42 - var9_9 - var14_14;
                            var8_8 /* !! */ [var23_35] = (SparseArray)var5_5;
                            ** continue;
                        }
                        var18_20 /* !! */  = 3;
                        if (var14_14 != var18_20 /* !! */ ) break block46;
                        var8_8 /* !! */  = null;
                        var14_14 = 0;
                        var25_37 = null;
                        for (var18_20 /* !! */  = 0; var18_20 /* !! */  < (var23_35 = var7_7.M - var13_13); ++var18_20 /* !! */ ) {
                            var34_43 = var7_7.N;
                            var34_43[var18_20 /* !! */ ] = 0;
                            var23_35 = var9_9 + 1;
                            var7_7.j(var6_6, var23_35);
                            var32_41 /* !! */  = var24_36.a;
                            var33_42 = var32_41 /* !! */ [var9_9];
                            if (var33_42 != 0) {
                                block35: {
                                    for (var10_10 = 0; var10_10 < (var33_42 = 8); ++var10_10) {
                                        var33_42 = 7 - var10_10;
                                        var36_46 = var24_36.a;
                                        if ((var13_13 = var36_46[var9_9] & (var33_42 = var13_13 << var33_42)) != 0) {
                                            var13_13 = var23_35 + var10_10;
                                            var7_7.j(var6_6, var13_13);
                                            var9_9 = var24_36.a[var9_9] & var15_15;
                                            var11_11 = ~var33_42;
                                            var12_12 /* !! */  = var17_17 /* !! */ ;
                                            var26_38 = var9_9 &= var11_11;
                                            while (var23_35 < var13_13) {
                                                var26_38 <<= 8;
                                                var30_40 /* !! */  = var24_36.a;
                                                var37_47 = var23_35 + 1;
                                                var9_9 = var30_40 /* !! */ [var23_35] & 255;
                                                var31_45 /* !! */  = var12_12 /* !! */ ;
                                                var38_48 = var13_13;
                                                var39_49 = var9_9;
                                                var26_38 |= var39_49;
                                                var23_35 = var37_47;
                                            }
                                            var31_45 /* !! */  = var12_12 /* !! */ ;
                                            var38_48 = var13_13;
                                            if (var18_20 /* !! */  > 0) {
                                                var10_10 = var10_10 * 7 + 6;
                                                var39_49 = 1L;
                                                var41_50 = (var39_49 << var10_10) - var39_49;
                                                var26_38 -= var41_50;
                                            }
                                            var9_9 = var38_48;
                                            break block35;
                                        }
                                        var31_45 /* !! */  = var17_17 /* !! */ ;
                                        var15_15 = 255;
                                        var11_11 = 0;
                                        var12_12 /* !! */  = null;
                                        var13_13 = 1;
                                    }
                                    var31_45 /* !! */  = var17_17 /* !! */ ;
                                    var26_38 = 0L;
                                    var9_9 = var23_35;
                                }
                                var39_49 = 0x80000000L;
                                var10_10 = (int)(var26_38 == var39_49 ? 0 : (var26_38 < var39_49 ? -1 : 1));
                                if (var10_10 >= 0 && (var10_10 = (int)((cfr_temp_0 = var26_38 - (var39_49 = 0x7FFFFFFFL)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) <= 0) {
                                    var10_10 = (int)var26_38;
                                    var43_51 = var7_7.N;
                                    if (var18_20 /* !! */  != 0) {
                                        var16_16 = var18_20 /* !! */  + -1;
                                        var16_16 = var43_51[var16_16];
                                        var10_10 += var16_16;
                                    }
                                    var43_51[var18_20 /* !! */ ] = var10_10;
                                    var14_14 += var10_10;
                                    var17_17 /* !! */  = var31_45 /* !! */ ;
                                    var10_10 = 2;
                                    var15_15 = 255;
                                    var11_11 = 0;
                                    var12_12 /* !! */  = null;
                                    var13_13 = 1;
                                    continue;
                                }
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            throw ParserException.a("No valid varint length mask found", null);
                        }
                        var31_45 /* !! */  = var17_17 /* !! */ ;
                        var8_8 /* !! */  = (SparseArray)var7_7.N;
                        var10_10 = var7_7.P;
                        var5_5 = var5_5 - var10_10 - var9_9 - var14_14;
                        var8_8 /* !! */ [var23_35] = (SparseArray)var5_5;
                    }
                    var20_33 /* !! */  = (SparseArray)var24_36.a;
                    var8_8 /* !! */  = null;
                    var18_20 /* !! */  = (int)(var20_33 /* !! */ [0] << 8);
                    var5_5 = var20_33 /* !! */ [1] & 255 | var18_20 /* !! */ ;
                    var44_52 = var7_7.D;
                    var46_53 = var5_5;
                    var7_7.J = var46_53 = var7_7.m(var46_53) + var44_52;
                    var20_33 /* !! */  = var31_45 /* !! */ ;
                    var18_20 /* !! */  = var31_45 /* !! */ .d;
                    var9_9 = 2;
                    if (var18_20 /* !! */  == var9_9) ** GOTO lbl-1000
                    var18_20 /* !! */  = 163;
                    if (var4_4 != var18_20 /* !! */ ) ** GOTO lbl-1000
                    var8_8 /* !! */  = (SparseArray)var24_36.a;
                    var18_20 /* !! */  = (int)var8_8 /* !! */ [var9_9];
                    var10_10 = 128;
                    if ((var18_20 /* !! */  &= var10_10) != var10_10) lbl-1000:
                    // 2 sources

                    {
                        var18_20 /* !! */  = 0;
                        var8_8 /* !! */  = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var18_20 /* !! */  = 1;
                    }
                    var7_7.Q = var18_20 /* !! */ ;
                    var7_7.I = var9_9;
                    var18_20 /* !! */  = 0;
                    var8_8 /* !! */  = null;
                    var7_7.L = 0;
lbl299:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var19_28 = new StringBuilder("Unexpected lacing value: ");
                var19_28.append(var14_14);
                throw ParserException.a(var19_28.toString(), null);
            }
            var20_33 /* !! */  = var17_17 /* !! */ ;
            ** while (true)
            var18_20 /* !! */  = 163;
            if (var4_4 == var18_20 /* !! */ ) {
                while ((var4_4 = var7_7.L) < (var18_20 /* !! */  = var7_7.M)) {
                    var4_4 = var7_7.N[var4_4];
                    var16_16 = var7_7.n(var6_6, (TK1$b)var20_33 /* !! */ , var4_4, false);
                    var44_52 = var7_7.J;
                    var4_4 = var7_7.L;
                    var10_10 = var20_33 /* !! */ .e;
                    var4_4 = var4_4 * var10_10 / 1000;
                    var46_53 = (long)var4_4 + var44_52;
                    var15_15 = var7_7.Q;
                    var23_35 = 0;
                    var34_43 = null;
                    var8_8 /* !! */  = var7_7;
                    var30_40 /* !! */  = (int[])var20_33 /* !! */ ;
                    var19_29 /* !! */  = var20_33 /* !! */ ;
                    var7_7.g((TK1$b)var20_33 /* !! */ , var46_53, var15_15, var16_16, 0);
                    var5_5 = var7_7.L;
                    var18_20 /* !! */  = 1;
                    var7_7.L = var5_5 += var18_20 /* !! */ ;
                }
                var5_5 = 0;
                var20_33 /* !! */  = null;
                var7_7.I = 0;
            } else {
                var19_30 /* !! */  = var20_33 /* !! */ ;
                var18_20 /* !! */  = 1;
                while ((var5_5 = var7_7.L) < (var9_9 = var7_7.M)) {
                    var30_40 /* !! */  = var7_7.N;
                    var10_10 = var30_40 /* !! */ [var5_5];
                    var30_40 /* !! */ [var5_5] = var10_10 = var7_7.n(var6_6, (TK1$b)var19_30 /* !! */ , var10_10, (boolean)var18_20 /* !! */ );
                    var7_7.L = var5_5 = var7_7.L + var18_20 /* !! */ ;
                }
            }
        }
    }

    public final void b(int n3, long l2) {
        String string2;
        block63: {
            block62: {
                block60: {
                    long l3;
                    block61: {
                        tk1_1 tk1_12 = this.a;
                        tk1_12.getClass();
                        int n4 = 20529;
                        string2 = " not supported";
                        if (n3 == n4) break block60;
                        n4 = 20530;
                        l3 = 1L;
                        if (n3 == n4) break block61;
                        n4 = 0;
                        int n7 = 3;
                        int n8 = 2;
                        int n10 = 1;
                        switch (n3) {
                            default: {
                                n4 = -1;
                                switch (n3) {
                                    default: {
                                        break;
                                    }
                                    case 21949: {
                                        int n14;
                                        tk1_12.f(n3);
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.D = n14 = (int)l2;
                                        break;
                                    }
                                    case 21948: {
                                        int n15;
                                        tk1_12.f(n3);
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.C = n15 = (int)l2;
                                        break;
                                    }
                                    case 21947: {
                                        tk1_12.f(n3);
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.y = n10;
                                        n3 = VX.f((int)l2);
                                        if (n3 != n4) {
                                            TK1$b tK1$b2 = tk1_12.w;
                                            tK1$b2.z = n3;
                                            break;
                                        }
                                        break block62;
                                    }
                                    case 21946: {
                                        tk1_12.f(n3);
                                        n3 = VX.g((int)l2);
                                        if (n3 != n4) {
                                            TK1$b tK1$b = tk1_12.w;
                                            tK1$b.A = n3;
                                            break;
                                        }
                                        break block62;
                                    }
                                    case 21945: {
                                        tk1_12.f(n3);
                                        n3 = (int)l2;
                                        if (n3 != n10) {
                                            if (n3 != n8) break;
                                            TK1$b tK1$b = tk1_12.w;
                                            tK1$b.B = n10;
                                            break;
                                        }
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.B = n8;
                                        break;
                                    }
                                }
                                break block62;
                            }
                            case 2807729: {
                                tk1_12.t = l2;
                                break;
                            }
                            case 2352003: {
                                int n16;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.e = n16 = (int)l2;
                                break;
                            }
                            case 30321: {
                                tk1_12.f(n3);
                                n3 = (int)l2;
                                if (n3 != 0) {
                                    if (n3 != n10) {
                                        if (n3 != n8) {
                                            if (n3 != n7) break;
                                            TK1$b tK1$b = tk1_12.w;
                                            tK1$b.s = n7;
                                            break;
                                        }
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.s = n8;
                                        break;
                                    }
                                    TK1$b tK1$b = tk1_12.w;
                                    tK1$b.s = n10;
                                    break;
                                }
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.s = 0;
                                break;
                            }
                            case 30114: {
                                tk1_12.T = l2;
                                break;
                            }
                            case 25188: {
                                int n17;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.Q = n17 = (int)l2;
                                break;
                            }
                            case 22203: {
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.T = l2;
                                break;
                            }
                            case 22186: {
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.S = l2;
                                break;
                            }
                            case 21998: {
                                int n18;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.f = n18 = (int)l2;
                                break;
                            }
                            case 21938: {
                                int n19;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.y = n10;
                                tK1$b.o = n19 = (int)l2;
                                break;
                            }
                            case 21930: {
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                if (l4 == false) {
                                    n4 = 1;
                                }
                                tK1$b.V = n4;
                                break;
                            }
                            case 21690: {
                                int n20;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.q = n20 = (int)l2;
                                break;
                            }
                            case 21682: {
                                int n21;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.r = n21 = (int)l2;
                                break;
                            }
                            case 21680: {
                                int n22;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.p = n22 = (int)l2;
                                break;
                            }
                            case 21432: {
                                int n24 = (int)l2;
                                tk1_12.f(n3);
                                if (n24 != 0) {
                                    if (n24 != n10) {
                                        if (n24 != n7) {
                                            n3 = 15;
                                            if (n24 != n3) break;
                                            TK1$b tK1$b = tk1_12.w;
                                            tK1$b.x = n7;
                                            break;
                                        }
                                        TK1$b tK1$b = tk1_12.w;
                                        tK1$b.x = n10;
                                        break;
                                    }
                                    TK1$b tK1$b = tk1_12.w;
                                    tK1$b.x = n8;
                                    break;
                                }
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.x = 0;
                                break;
                            }
                            case 21420: {
                                long l7 = tk1_12.s;
                                tk1_12.z = l2 += l7;
                                break;
                            }
                            case 18408: {
                                n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                                if (n3 == 0) break;
                                StringBuilder stringBuilder = new StringBuilder("AESSettingsCipherMode ");
                                stringBuilder.append(l2);
                                stringBuilder.append(string2);
                                throw ParserException.a(stringBuilder.toString(), null);
                            }
                            case 18401: {
                                long l8 = 5;
                                n3 = (int)(l2 == l8 ? 0 : (l2 < l8 ? -1 : 1));
                                if (n3 == 0) break;
                                StringBuilder stringBuilder = new StringBuilder("ContentEncAlgo ");
                                stringBuilder.append(l2);
                                stringBuilder.append(string2);
                                throw ParserException.a(stringBuilder.toString(), null);
                            }
                            case 17143: {
                                n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                                if (n3 == 0) break;
                                StringBuilder stringBuilder = new StringBuilder("EBMLReadVersion ");
                                stringBuilder.append(l2);
                                stringBuilder.append(string2);
                                throw ParserException.a(stringBuilder.toString(), null);
                            }
                            case 17029: {
                                long l12;
                                long l14;
                                n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                                if (n3 >= 0 && (n3 = (int)((l14 = l2 - (l12 = (long)2)) == 0L ? 0 : (l14 < 0L ? -1 : 1))) <= 0) break;
                                StringBuilder stringBuilder = new StringBuilder("DocTypeReadVersion ");
                                stringBuilder.append(l2);
                                stringBuilder.append(string2);
                                throw ParserException.a(stringBuilder.toString(), null);
                            }
                            case 16980: {
                                long l15 = 3;
                                n3 = (int)(l2 == l15 ? 0 : (l2 < l15 ? -1 : 1));
                                if (n3 == 0) break;
                                StringBuilder stringBuilder = new StringBuilder("ContentCompAlgo ");
                                stringBuilder.append(l2);
                                stringBuilder.append(string2);
                                throw ParserException.a(stringBuilder.toString(), null);
                            }
                            case 16871: {
                                int n25;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.g = n25 = (int)l2;
                                break;
                            }
                            case 251: {
                                tk1_12.S = n10;
                                break;
                            }
                            case 241: {
                                n4 = (int)(tk1_12.G ? 1 : 0);
                                if (n4 == 0) {
                                    tk1_12.d(n3);
                                    ZA1 zA1 = tk1_12.F;
                                    zA1.a(l2);
                                    tk1_12.G = n10;
                                    break;
                                }
                                break block62;
                            }
                            case 238: {
                                tk1_12.R = n3 = (int)l2;
                                break;
                            }
                            case 231: {
                                long l16;
                                tk1_12.D = l16 = tk1_12.m(l2);
                                break;
                            }
                            case 215: {
                                int n26;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.c = n26 = (int)l2;
                                break;
                            }
                            case 186: {
                                int n27;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.n = n27 = (int)l2;
                                break;
                            }
                            case 179: {
                                tk1_12.d(n3);
                                ZA1 zA1 = tk1_12.E;
                                l2 = tk1_12.m(l2);
                                zA1.a(l2);
                                break;
                            }
                            case 176: {
                                int n28;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.m = n28 = (int)l2;
                                break;
                            }
                            case 159: {
                                int n29;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.P = n29 = (int)l2;
                                break;
                            }
                            case 155: {
                                long l17;
                                tk1_12.K = l17 = tk1_12.m(l2);
                                break;
                            }
                            case 136: {
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                long l18 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                if (l18 == false) {
                                    n4 = 1;
                                }
                                tK1$b.W = n4;
                                break;
                            }
                            case 131: {
                                int n30;
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.d = n30 = (int)l2;
                                break;
                            }
                        }
                        break block62;
                    }
                    n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (n3 != 0) {
                        StringBuilder stringBuilder = new StringBuilder("ContentEncodingScope ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw ParserException.a(stringBuilder.toString(), null);
                    }
                    break block62;
                }
                long l19 = 0L;
                long l20 = l2 - l19;
                n3 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
                if (n3 != 0) break block63;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("ContentEncodingOrder ");
        stringBuilder.append(l2);
        stringBuilder.append(string2);
        throw ParserException.a(stringBuilder.toString(), null);
    }

    public final void c(int n3, long l2, long l3) {
        tk1_1 tk1_12 = this.a;
        gi0_0 gi0_02 = tk1_12.d0;
        ct3.h(gi0_02);
        int n4 = 160;
        if (n3 != n4) {
            n4 = 174;
            if (n3 != n4) {
                n4 = 187;
                if (n3 != n4) {
                    n4 = 19899;
                    long l4 = -1;
                    if (n3 != n4) {
                        n4 = 20533;
                        boolean bl2 = true;
                        if (n3 != n4) {
                            n4 = 21968;
                            if (n3 != n4) {
                                n4 = 408125543;
                                if (n3 != n4) {
                                    int n7 = 475249515;
                                    if (n3 != n7) {
                                        n7 = 524531317;
                                        if (n3 == n7 && (n3 = (int)(tk1_12.x ? 1 : 0)) == 0) {
                                            long l7;
                                            long l8;
                                            long l12;
                                            n3 = (int)(tk1_12.d ? 1 : 0);
                                            if (n3 != 0 && (l12 = (l8 = (l7 = tk1_12.B) - l4) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                                                tk1_12.A = bl2;
                                            } else {
                                                gi0_0 gi0_03 = tk1_12.d0;
                                                long l14 = tk1_12.v;
                                                dX2$b dX2$b = new dX2$b(l14);
                                                gi0_03.h(dX2$b);
                                                tk1_12.x = bl2;
                                            }
                                        }
                                    } else {
                                        ZA1 zA1;
                                        tk1_12.E = zA1 = new ZA1();
                                        tk1_12.F = zA1 = new ZA1();
                                    }
                                } else {
                                    long l15 = tk1_12.s;
                                    long l16 = l15 - l4;
                                    n3 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                                    if (n3 != 0 && (n3 = (int)(l15 == l2 ? 0 : (l15 < l2 ? -1 : 1))) != 0) {
                                        throw ParserException.a("Multiple Segment elements not supported", null);
                                    }
                                    tk1_12.s = l2;
                                    tk1_12.r = l3;
                                }
                            } else {
                                tk1_12.f(n3);
                                TK1$b tK1$b = tk1_12.w;
                                tK1$b.y = bl2;
                            }
                        } else {
                            tk1_12.f(n3);
                            TK1$b tK1$b = tk1_12.w;
                            tK1$b.h = bl2;
                        }
                    } else {
                        tk1_12.y = n3 = -1;
                        tk1_12.z = l4;
                    }
                } else {
                    tk1_12.G = false;
                }
            } else {
                TK1$b tK1$b;
                tk1_12.w = tK1$b = new TK1$b();
            }
        } else {
            long l17;
            tk1_12.S = false;
            tk1_12.T = l17 = 0L;
        }
    }
}

