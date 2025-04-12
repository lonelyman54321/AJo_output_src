/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class Cl2$e
extends Lambda
implements Function1 {
    public final /* synthetic */ Cl2 c;

    public Cl2$e(Cl2 cl2) {
        this.c = cl2;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block17: {
            block18: {
                var2_2 = var1_1;
                var2_2 = (Number)var1_1;
                var3_3 = var2_2.floatValue();
                var4_4 = this.c;
                var4_4.getClass();
                var5_5 = var4_4.j();
                var7_6 = var4_4.o();
                var8_7 = (long)var7_6;
                var5_5 *= var8_7;
                var10_8 = var4_4.k();
                var11_9 = var4_4.o();
                var12_10 = var11_9;
                var13_11 = var10_8 *= var12_10;
                var8_7 = ok1_1.c(var13_11) + var5_5;
                var15_12 = var4_4.h + var3_3;
                var16_13 = var15_12;
                var18_14 = ok1_1.c(var16_13);
                var20_15 = var18_14;
                var4_4.h = var15_12 -= var20_15;
                var15_12 = Math.abs(var3_3);
                var20_15 = 1.0E-4f;
                var21_16 = var15_12 == var20_15 ? 0 : (var15_12 < var20_15 ? -1 : 1);
                if (var21_16 < 0) break block17;
                var22_17 = var4_4.g;
                var24_18 = var4_4.f;
                var27_20 = (var26_19 = (cfr_temp_0 = (var18_14 += var8_7) - (var5_5 = f.i(var18_14, var22_17, var24_18))) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false;
                var4_4.i = var10_8 = (float)(var5_5 -= var8_7);
                var22_17 = Math.abs(var5_5);
                var24_18 = 0L;
                var11_9 = 0;
                var12_10 = 0.0f;
                var28_21 = null;
                var29_22 /* !! */  = (long)(var22_17 == var24_18 ? 0 : (var22_17 < var24_18 ? -1 : 1));
                if (var29_22 /* !! */  != false) {
                    cfr_temp_1 = var10_8 - 0.0f;
                    var29_22 /* !! */  = (long)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                    if (var29_22 /* !! */  > 0) {
                        var29_22 /* !! */  = 1;
                        var30_23 = 1.4E-45f;
                    } else {
                        var29_22 /* !! */  = 0;
                        var30_23 = 0.0f;
                        var31_24 = null;
                    }
                    var31_24 = (boolean)var29_22 /* !! */ ;
                    var32_25 = var4_4.E;
                    var32_25.setValue(var31_24);
                    cfr_temp_2 = var10_8 - 0.0f;
                    var7_6 = (boolean)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                    if (var7_6 < false) {
                        var7_6 = true;
                        var10_8 = 1.4E-45f;
                    } else {
                        var7_6 = false;
                        var10_8 = 0.0f;
                        var33_26 = null;
                    }
                    var33_26 = var7_6;
                    var31_24 = var4_4.F;
                    var31_24.setValue(var33_26);
                }
                var33_26 = (vl2)var4_4.o.getValue();
                var29_22 /* !! */  = (int)var5_5;
                var26_19 = -var29_22 /* !! */ ;
                var34_27 = var33_26.b;
                var35_28 = var33_26.c;
                var34_27 += var35_28;
                var35_28 = (int)var33_26.p;
                if (var35_28 != 0 || (var37_30 = (var36_29 = var33_26.a).isEmpty()) != 0 || (var38_31 = var33_26.j) == null || (var37_30 = var33_26.m - var26_19) < 0 || var37_30 >= var34_27) ** GOTO lbl-1000
                if (var34_27 != 0) {
                    var39_32 = var26_19;
                    var40_33 = var34_27;
                    var39_32 /= var40_33;
                } else {
                    var37_30 = 0;
                    var39_32 = 0.0f;
                    var38_31 = null;
                }
                var40_33 = var33_26.l - var39_32;
                var28_21 = var33_26.k;
                if (var28_21 == null || (var11_9 = (int)((cfr_temp_3 = var40_33 - (var12_10 = 0.5f)) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) >= 0 || (var11_9 = (int)((cfr_temp_4 = var40_33 - (var12_10 = -0.5f)) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1))) <= 0) ** GOTO lbl-1000
                var28_21 = (fl1_1)CollectionsKt.L(var36_29);
                var41_34 = (fl1_1)CollectionsKt.S(var36_29);
                var42_35 = var33_26.g;
                var43_36 = var33_26.f;
                if (var26_19 >= 0) break block18;
                var11_9 = var28_21.m + var34_27 - var43_36;
                var43_36 = var41_34.m + var34_27 - var42_35;
                if ((var11_9 = Math.min(var11_9, var43_36)) <= (var43_36 = (int)(-var26_19))) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var11_9 = var28_21.m;
            var43_36 -= var11_9;
            var11_9 = var41_34.m;
            if ((var11_9 = Math.min(var43_36, var42_35 -= var11_9)) > var26_19) lbl-1000:
            // 2 sources

            {
                var33_26.l = var12_10 = var33_26.l - var39_32;
                var33_26.m = var11_9 = var33_26.m - var26_19;
                var11_9 = var36_29.size();
                var30_23 = 0.0f;
                var31_24 = null;
                for (var29_22 /* !! */  = (long)0; var29_22 /* !! */  < var11_9; ++var29_22 /* !! */ ) {
                    var44_37 = (fl1_1)var36_29.get((int)var29_22 /* !! */ );
                    var44_37.a((int)var26_19);
                }
                var28_21 = var33_26.q;
                var29_22 /* !! */  = var28_21.size();
                var44_37 = null;
                for (var43_36 = 0; var43_36 < var29_22 /* !! */ ; ++var43_36) {
                    var45_38 = (fl1_1)var28_21.get(var43_36);
                    var45_38.a((int)var26_19);
                }
                var28_21 = var33_26.r;
                var29_22 /* !! */  = var28_21.size();
                var45_38 = null;
                for (var42_35 = 0; var42_35 < var29_22 /* !! */ ; ++var42_35) {
                    var44_37 = (fl1_1)var28_21.get(var42_35);
                    var44_37.a((int)var26_19);
                }
                var11_9 = (int)var33_26.n;
                if (var11_9 == 0 && var26_19 > 0) {
                    var11_9 = 1;
                    var12_10 = 1.4E-45f;
                    var33_26.n = var11_9;
                } else {
                    var11_9 = 1;
                    var12_10 = 1.4E-45f;
                }
                var4_4.h((vl2)var33_26, (boolean)var11_9);
                var4_4 = var4_4.A;
                A62.d((tr1_0)var4_4);
            } else lbl-1000:
            // 4 sources

            {
                var33_26 = var4_4.c;
                var28_21 = var33_26.a;
                var43_36 = var28_21.o();
                if (var43_36 == 0) {
                    var11_9 = 0;
                    var12_10 = 0.0f;
                    var28_21 = null;
                } else {
                    var30_23 = var29_22 /* !! */ ;
                    var11_9 = var28_21.o();
                    var12_10 = var11_9;
                    var12_10 = var30_23 / var12_10;
                }
                var33_26 = var33_26.c;
                var30_23 = var33_26.c() + var12_10;
                var33_26.k(var30_23);
                var4_4 = (hi2_0)var4_4.w.getValue();
                if (var4_4 != null) {
                    var4_4.f();
                }
            }
            var2_2 = var27_20 != false ? Long.valueOf(var5_5) : Float.valueOf(var3_3);
            var3_3 = var2_2.floatValue();
        }
        return Float.valueOf(var3_3);
    }
}

