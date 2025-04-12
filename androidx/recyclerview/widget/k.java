/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.k$a;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k$c;
import androidx.recyclerview.widget.k$d;
import androidx.recyclerview.widget.k$g;
import java.util.ArrayList;
import java.util.Collections;

public final class k {
    public static final k$a a;

    static {
        k$a k$a;
        a = k$a = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static k$d a(k$b var0) {
        var1_1 = var0;
        var2_2 = var0.e();
        var3_3 /* !! */  = var0.d();
        var4_4 = new ArrayList<Object>();
        var5_5 = new ArrayList<Object>();
        var6_6 = new Object();
        var7_7 /* !! */  = 0;
        var8_8 = null;
        var6_6.a = 0;
        var6_6.b = var2_2;
        var6_6.c = 0;
        var6_6.d = var3_3 /* !! */ ;
        var5_5.add(var6_6);
        var2_2 += var3_3 /* !! */ ;
        var3_3 /* !! */  = 1;
        var2_2 = (var2_2 + var3_3 /* !! */ ) / 2 * 2 + var3_3 /* !! */ ;
        var6_6 = new int[var2_2];
        var9_9 = var2_2 / 2;
        var10_10 = new int[var2_2];
        var11_11 = new ArrayList();
        while ((var12_12 = var5_5.isEmpty()) == 0) {
            block39: {
                block42: {
                    var12_12 = var5_5.size() - var3_3 /* !! */ ;
                    var13_13 = (k$g)var5_5.remove(var12_12);
                    var14_14 = var13_13.b();
                    if (var14_14 < var3_3 /* !! */  || (var14_14 = var13_13.a()) < var3_3 /* !! */ ) break block42;
                    var14_14 = var13_13.b();
                    var15_15 = (var13_13.a() + var14_14 + var3_3 /* !! */ ) / 2;
                    var14_14 = var13_13.a;
                    var16_16 = var3_3 /* !! */  + var9_9;
                    var6_6[var16_16] = var14_14;
                    var10_10[var16_16] = var14_14 = var13_13.b;
                    for (var14_14 = 0; var14_14 < var15_15; ++var14_14) {
                        block41: {
                            block38: {
                                var16_16 = var13_13.b();
                                var17_17 = var13_13.a();
                                if ((var16_16 = Math.abs(var16_16 - var17_17) % 2) == var3_3 /* !! */ ) {
                                    var16_16 = 1;
                                    var18_18 = 1.4E-45f;
                                } else {
                                    var16_16 = 0;
                                    var18_18 = 0.0f;
                                }
                                var17_17 = var13_13.b();
                                var19_19 = var13_13.a();
                                var17_17 -= var19_19;
                                for (var20_20 = var19_19 = -var14_14; var20_20 <= var14_14; var20_20 += 2) {
                                    block43: {
                                        block44: {
                                            if (var20_20 == var19_19) break block43;
                                            if (var20_20 == var14_14) break block44;
                                            var21_21 = var20_20 + 1 + var9_9;
                                            var3_3 /* !! */  = (int)var6_6[var21_21];
                                            var7_7 /* !! */  = (int)var6_6[var21_21 = var20_20 + -1 + var9_9];
                                            if (var3_3 /* !! */  > var7_7 /* !! */ ) break block43;
                                        }
                                        var3_3 /* !! */  = var20_20 + -1 + var9_9;
                                        var3_3 /* !! */  = (int)var6_6[var3_3 /* !! */ ];
                                        var7_7 /* !! */  = var3_3 /* !! */  + 1;
lbl56:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var3_3 /* !! */  = var20_20 + 1 + var9_9;
                                    var7_7 /* !! */  = var3_3 /* !! */  = (int)var6_6[var3_3 /* !! */ ];
                                    ** continue;
                                    var21_21 = var15_15;
                                    var15_15 = var13_13.c;
                                    var22_22 = var5_5;
                                    var23_23 = var13_13.a;
                                    var23_23 = var7_7 /* !! */  - var23_23 + var15_15 - var20_20;
                                    var15_15 = var14_14 != 0 && var7_7 /* !! */  == var3_3 /* !! */  ? var23_23 + -1 : var23_23;
                                    var24_24 = var11_11;
                                    while (var7_7 /* !! */  < (var25_25 = var13_13.b) && var23_23 < (var25_25 = var13_13.d) && (var25_25 = (int)var1_1.b(var7_7 /* !! */ , var23_23)) != 0) {
                                        ++var7_7 /* !! */ ;
                                        ++var23_23;
                                    }
                                    var25_25 = var20_20 + var9_9;
                                    var6_6[var25_25] = var7_7 /* !! */ ;
                                    if (var16_16 != 0) {
                                        var25_25 = var17_17 - var20_20;
                                        var26_26 = var16_16;
                                        var27_27 = var18_18;
                                        var16_16 = var19_19 + 1;
                                        if (var25_25 >= var16_16 && var25_25 <= (var16_16 = var14_14 + -1)) {
                                            var25_25 += var9_9;
                                            if ((var25_25 = var10_10[var25_25]) <= var7_7 /* !! */ ) {
                                                var11_11 = new Object();
                                                var11_11.a = var3_3 /* !! */ ;
                                                var11_11.b = var15_15;
                                                var11_11.c = var7_7 /* !! */ ;
                                                var11_11.d = var23_23;
                                                var3_3 /* !! */  = 0;
                                                var28_28 = null;
                                                var11_11.e = false;
                                                break block38;
                                            }
                                        }
lbl92:
                                        // 5 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var26_26 = var16_16;
                                    var27_27 = var18_18;
                                    ** continue;
                                    var3_3 /* !! */  = 0;
                                    var28_28 = null;
                                    var15_15 = var21_21;
                                    var5_5 = var22_22;
                                    var11_11 = var24_24;
                                    var16_16 = var26_26;
                                    var18_18 = var27_27;
                                    var3_3 /* !! */  = 1;
                                    var7_7 /* !! */  = 0;
                                    var8_8 = null;
                                }
                                var22_22 = var5_5;
                                var24_24 = var11_11;
                                var21_21 = var15_15;
                                var3_3 /* !! */  = 0;
                                var28_28 = null;
                                var25_25 = 0;
                                var11_11 = null;
                            }
                            if (var11_11 != null) {
                                var29_29 = var11_11;
                                var30_30 = var13_13;
                                break block39;
                            }
                            var23_23 = var13_13.b();
                            var7_7 /* !! */  = var13_13.a();
                            if ((var23_23 = (var23_23 - var7_7 /* !! */ ) % 2) == 0) {
                                var23_23 = 1;
                            } else {
                                var23_23 = 0;
                                var5_5 = null;
                            }
                            var7_7 /* !! */  = var13_13.b();
                            var25_25 = var13_13.a();
                            var7_7 /* !! */  -= var25_25;
                            for (var25_25 = var19_19; var25_25 <= var14_14; var25_25 += 2) {
                                block40: {
                                    if (var25_25 == var19_19) ** GOTO lbl-1000
                                    if (var25_25 == var14_14) ** GOTO lbl-1000
                                    var20_20 = var25_25 + 1 + var9_9;
                                    var20_20 = var10_10[var20_20];
                                    var15_15 = var25_25 + -1 + var9_9;
                                    if (var20_20 >= (var15_15 = var10_10[var15_15])) lbl-1000:
                                    // 2 sources

                                    {
                                        var20_20 = var25_25 + -1 + var9_9;
                                        var20_20 = var10_10[var20_20];
                                        var15_15 = var20_20 + -1;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var20_20 = var25_25 + 1 + var9_9;
                                        var15_15 = var20_20 = var10_10[var20_20];
                                    }
                                    var16_16 = var13_13.d;
                                    var17_17 = var13_13.b - var15_15 - var25_25;
                                    var16_16 -= var17_17;
                                    var17_17 = var14_14 != 0 && var15_15 == var20_20 ? var16_16 + 1 : var16_16;
                                    while (var15_15 > (var3_3 /* !! */  = var13_13.a) && var16_16 > (var3_3 /* !! */  = var13_13.c)) {
                                        var3_3 /* !! */  = var15_15 + -1;
                                        var30_30 = var13_13;
                                        var12_12 = var16_16 + -1;
                                        if ((var3_3 /* !! */  = (int)var1_1.b(var3_3 /* !! */ , var12_12)) != 0) {
                                            var15_15 += -1;
                                            var16_16 += -1;
                                            continue;
                                        }
                                        break block40;
                                    }
                                    var30_30 = var13_13;
                                }
                                var3_3 /* !! */  = var25_25 + var9_9;
                                var10_10[var3_3 /* !! */ ] = var15_15;
                                if (var23_23 != 0 && (var3_3 /* !! */  = var7_7 /* !! */  - var25_25) >= var19_19 && var3_3 /* !! */  <= var14_14) {
                                    var3_3 /* !! */  += var9_9;
                                    if ((var3_3 /* !! */  = (int)var6_6[var3_3 /* !! */ ]) >= var15_15) {
                                        var28_28 = new Object();
                                        var28_28.a = var15_15;
                                        var28_28.b = var16_16;
                                        var28_28.c = var20_20;
                                        var28_28.d = var17_17;
                                        var23_23 = 1;
                                        var28_28.e = var23_23;
                                        break block41;
                                    }
                                }
                                var13_13 = var30_30;
                                var3_3 /* !! */  = 0;
                                var28_28 = null;
                            }
                            var30_30 = var13_13;
                            var3_3 /* !! */  = 0;
                            var28_28 = null;
                        }
                        if (var28_28 != null) {
                            var29_29 = var28_28;
                            break block39;
                        }
                        var15_15 = var21_21;
                        var5_5 = var22_22;
                        var11_11 = var24_24;
                        var13_13 = var30_30;
                        var3_3 /* !! */  = 1;
                        var7_7 /* !! */  = 0;
                        var8_8 = null;
                    }
                }
                var22_22 = var5_5;
                var24_24 = var11_11;
                var30_30 = var13_13;
                var20_20 = 0;
                var29_29 = null;
            }
            if (var29_29 != null) {
                var3_3 /* !! */  = var29_29.a();
                if (var3_3 /* !! */  > 0) {
                    var3_3 /* !! */  = var29_29.d;
                    var23_23 = var29_29.b;
                    var7_7 /* !! */  = var29_29.c;
                    var25_25 = var29_29.a;
                    if ((var3_3 /* !! */  -= var23_23) != (var7_7 /* !! */  -= var25_25)) {
                        var12_12 = (int)var29_29.e;
                        if (var12_12 != 0) {
                            var7_7 /* !! */  = var29_29.a();
                            var28_28 = new k$c(var25_25, var23_23, var7_7 /* !! */ );
                        } else if (var3_3 /* !! */  > var7_7 /* !! */ ) {
                            var7_7 /* !! */  = var29_29.a();
                            var28_28 = new k$c(var25_25, ++var23_23, var7_7 /* !! */ );
                        } else {
                            var7_7 /* !! */  = var29_29.a();
                            var28_28 = new k$c(++var25_25, var23_23, var7_7 /* !! */ );
                        }
                    } else {
                        var28_28 = new k$c(var25_25, var23_23, var7_7 /* !! */ );
                    }
                    var4_4.add(var28_28);
                }
                if ((var3_3 /* !! */  = (int)var24_24.isEmpty()) != 0) {
                    var28_28 = new k$g();
                    var8_8 = var24_24;
                    var13_13 = var30_30;
                    var23_23 = 1;
                } else {
                    var3_3 /* !! */  = var24_24.size();
                    var23_23 = 1;
                    var8_8 = var24_24;
                    var28_28 = (k$g)var24_24.remove(var3_3 /* !! */  -= var23_23);
                    var13_13 = var30_30;
                }
                var28_28.a = var25_25 = var13_13.a;
                var28_28.c = var25_25 = var13_13.c;
                var28_28.b = var25_25 = var29_29.a;
                var28_28.d = var25_25 = var29_29.b;
                var11_11 = var22_22;
                var22_22.add(var28_28);
                var13_13.b = var3_3 /* !! */  = var13_13.b;
                var13_13.d = var3_3 /* !! */  = var13_13.d;
                var13_13.a = var3_3 /* !! */  = var29_29.c;
                var13_13.c = var3_3 /* !! */  = var29_29.d;
                var22_22.add(var13_13);
            } else {
                var11_11 = var22_22;
                var8_8 = var24_24;
                var13_13 = var30_30;
                var23_23 = 1;
                var24_24.add(var30_30);
            }
            var5_5 = var11_11;
            var3_3 /* !! */  = 1;
            var11_11 = var8_8;
            var7_7 /* !! */  = 0;
            var8_8 = null;
        }
        var28_28 = k.a;
        Collections.sort(var4_4, var28_28);
        var28_28 = new k$d(var1_1, var4_4, (int[])var6_6, var10_10);
        return var28_28;
    }
}

