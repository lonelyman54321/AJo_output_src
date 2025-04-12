/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

public final class T41 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final String k;
    public final DS1$k l;

    public T41(List list, int n3, int n4, int n7, int n8, int n10, int n14, int n15, float f5, int n16, String string2, DS1$k dS1$k) {
        this.a = list;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
        this.f = n10;
        this.g = n14;
        this.h = n15;
        this.i = f5;
        this.j = n16;
        this.k = string2;
        this.l = dS1$k;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static T41 a(Xm2 var0, boolean var1_1, DS1$k var2_2) {
        block18: {
            var3_3 = var0;
            var4_5 = 4;
            if (!var1_1) ** GOTO lbl7
            try {
                block20: {
                    var0.J(var4_5);
                    break block20;
lbl7:
                    // 1 sources

                    var5_7 = 21;
                    var0.J(var5_7);
                }
                var5_7 = var0.w() & 3;
                var6_8 = var0.w();
                var7_9 = var0.d();
                var8_10 = false;
                var9_11 = 0;
                var10_12 = 0;
                break block18;
            }
            catch (ArrayIndexOutOfBoundsException var3_4) {}
            if (var1_1) {
                var33_6 = "L-HEVC config";
                throw ParserException.a("Error parsing".concat((String)var33_6), var3_4);
            }
            var33_6 = "HEVC config";
            throw ParserException.a("Error parsing".concat((String)var33_6), var3_4);
        }
        while (true) {
            var11_13 = 1;
            if (var9_11 >= var6_8) break;
            var3_3.J(var11_13);
            var11_13 = var0.C();
            for (var12_14 = 0; var12_14 < var11_13; var10_12 += var14_16, ++var12_14) {
                var13_15 = var0.C();
                var14_16 = var13_15 + 4;
                var3_3.J(var13_15);
            }
            ++var9_11;
        }
        var3_3.I(var7_9);
        var15_17 = new byte[var10_12];
        var13_15 = 0;
        var16_18 = var2_2;
        var17_19 = null;
        var9_11 = 0;
        var12_14 = 0;
        var18_20 = -1;
        var19_21 = -1;
        var20_22 = -1;
        var21_23 = -1;
        var22_24 = -1;
        var23_25 = 0.0f / 0.0f;
        var24_26 = -1;
        var25_27 = 1065353216;
        var26_28 = 1.0f;
        var27_29 = -1;
        while (true) {
            if (var9_11 >= var6_8) ** GOTO lbl59
            {
                block21: {
                    var13_15 = var0.w() & 63;
                    var14_16 = var0.C();
                    var28_30 = var16_18;
                    break block21;
lbl59:
                    // 1 sources

                    var3_3 = var10_12 == 0 ? Collections.emptyList() : Collections.singletonList(var15_17);
                    var28_30 = var3_3;
                    var4_5 = 1;
                    var29_31 = var5_7 + 1;
                    return new T41((List)var28_30, var29_31, var18_20, var19_21, var20_22, var21_23, var22_24, var24_26, var26_28, var27_29, var17_19, (DS1$k)var16_18);
                }
                for (var29_31 = 0; var29_31 < var14_16; var12_14 += var11_13, ++var29_31) {
                    var11_13 = var0.C();
                    var30_32 = var6_8;
                    var31_33 /* !! */  = DS1.a;
                    System.arraycopy(var31_33 /* !! */ , 0, var15_17, var12_14, var4_5);
                    var31_33 /* !! */  = var0.c();
                    var4_5 = var0.d();
                    System.arraycopy(var31_33 /* !! */ , var4_5, var15_17, var12_14 += 4, var11_13);
                    var4_5 = 32;
                    if (var13_15 == var4_5 && var29_31 == 0) {
                        var4_5 = var12_14 + var11_13;
                        var28_30 = DS1.h(var12_14, var15_17, var4_5);
                        var32_34 = var14_16;
                    } else {
                        var4_5 = 33;
                        if (var13_15 == var4_5 && var29_31 == 0) {
                            var4_5 = var12_14 + var11_13;
                            var33_6 = DS1.g(var15_17, var12_14, var4_5, (DS1$k)var28_30);
                            var6_8 = var33_6.b;
                            var18_20 = var6_8 + 8;
                            var6_8 = var33_6.c;
                            var19_21 = var6_8 + 8;
                            var6_8 = var33_6.h;
                            var8_10 = var33_6.i;
                            var20_22 = var6_8;
                            var21_23 = var6_8 = var33_6.j;
                            var23_25 = var34_35 = var33_6.f;
                            var6_8 = var33_6.g;
                            var33_6 = var33_6.a;
                            if (var33_6 != null) {
                                var25_27 = var6_8;
                                var6_8 = var33_6.a;
                                var27_29 = var8_10;
                                var8_10 = var33_6.b;
                                var32_34 = var14_16;
                                var14_16 = var33_6.c;
                                var35_36 = var18_20;
                                var18_20 = var33_6.d;
                                var36_37 = var19_21;
                                var37_38 = var33_6.e;
                                var4_5 = var33_6.f;
                                var17_19 = LW.a(var6_8, var8_10, var14_16, var18_20, var37_38, var4_5);
                            } else {
                                var25_27 = var6_8;
                                var27_29 = var8_10;
                                var32_34 = var14_16;
                                var35_36 = var18_20;
                                var36_37 = var19_21;
                            }
                            var18_20 = var35_36;
                            var19_21 = var36_37;
                            var8_10 = false;
                            var22_24 = var21_23;
                            var21_23 = var27_29;
                            var27_29 = var25_27;
                            var26_28 = var23_25;
                        } else {
                            var32_34 = var14_16;
                            var4_5 = 39;
                            if (var13_15 == var4_5 && var29_31 == 0 && (var33_6 = DS1.f(var12_14, var15_17, var4_5 = var12_14 + var11_13)) != null && var28_30 != null) {
                                var4_5 = var33_6.a;
                                var31_33 /* !! */  = (byte[])var28_30.a;
                                var8_10 = false;
                                var31_33 /* !! */  = var31_33 /* !! */ .get(0);
                                var31_33 /* !! */  = (byte[])((DS1$a)var31_33 /* !! */ );
                                var6_8 = var31_33 /* !! */ .b;
                                if (var4_5 == var6_8) {
                                    var24_26 = 4;
                                } else {
                                    var4_5 = 5;
                                    var24_26 = 5;
                                }
                            } else {
                                var8_10 = false;
                            }
                        }
                    }
                    var3_3.J(var11_13);
                    var14_16 = var32_34;
                    var6_8 = var30_32;
                    var4_5 = 4;
                    var11_13 = 1;
                }
                var30_32 = var6_8;
                ++var9_11;
                var16_18 = var28_30;
                var4_5 = 4;
                var11_13 = 1;
                continue;
            }
            break;
        }
    }
}

