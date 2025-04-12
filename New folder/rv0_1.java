/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rv0
 */
public final class rv0_1 {
    /*
     * Unable to fully structure code
     */
    public static final void a(ov0_0 var0, Bv0$d var1_1, uv0_2 var2_2, xv0_2 var3_3, b30_0 var4_4, int var5_5) {
        block17: {
            block19: {
                block20: {
                    block18: {
                        var6_6 = var0;
                        var7_7 = var1_1;
                        var8_8 = var2_2;
                        var9_9 = var3_3;
                        var10_10 = var5_5;
                        Intrinsics.checkNotNullParameter(var0, "viewModel");
                        Intrinsics.checkNotNullParameter(var1_1, "state");
                        Intrinsics.checkNotNullParameter(var2_2, "onCloseClick");
                        Intrinsics.checkNotNullParameter(var3_3, "onResult");
                        var11_11 = 2145469846;
                        var12_12 = var4_4;
                        var13_13 = var4_4.g(var11_11);
                        var12_12 = var13_13.v();
                        var14_14 = b30$a.a;
                        if (var12_12 == var14_14) {
                            var12_12 = Qx2.a(ly0_0.f(f.a, (b30_0)var13_13), (j30_0)var13_13);
                        }
                        var12_12 = (Q30)var12_12;
                        var15_15 = var12_12.a;
                        var16_16 = var7_7.a;
                        var18_18 = var16_16 != null && (var12_12 = var16_16.getQuestions()) != null ? (var17_17 = var12_12.size()) : 0;
                        var12_12 = new bv0_2(var16_16);
                        var19_19 = El2.b((Function0)var12_12, (b30_0)var13_13);
                        var12_12 = (Boolean)var6_6.d.getValue();
                        var20_20 = var12_12.booleanValue();
                        var22_22 = 0.0f;
                        var21_21 = new fv0_1((boolean)var20_20, (hm0_0)var19_19, var6_6, null);
                        ly0_0.d((b30_0)var13_13, var12_12, (Function2)var21_21);
                        var23_23 = LP1$a.b;
                        var12_12 = j.c((LP1)var23_23, 1.0f);
                        var24_24 = Nc$a.n;
                        var4_4 = var19_19;
                        var19_19 = zp.c;
                        var25_25 = 6.7E-44f;
                        var24_24 = oZ.a((zp$l)var19_19, (Gx$a)var24_24, (b30_0)var13_13, 48);
                        var26_26 = var13_13.P;
                        var27_27 = var13_13.P();
                        var12_12 = a30_0.c((b30_0)var13_13, (LP1)var12_12);
                        N20.W.getClass();
                        var28_28 = var19_19;
                        var19_19 = N20$a.b;
                        var29_29 = var13_13.a;
                        var30_30 = var29_29 instanceof mp;
                        if (!var30_30) break block17;
                        var13_13.A();
                        var30_30 = var13_13.O;
                        if (var30_30) {
                            var13_13.C((Function0)var19_19);
                        } else {
                            var13_13.n();
                        }
                        var7_7 = N20$a.e;
                        Ow3.a((b30_0)var13_13, var24_24, (Function2)var7_7);
                        var24_24 = N20$a.d;
                        Ow3.a((b30_0)var13_13, var27_27, (Function2)var24_24);
                        var27_27 = N20$a.f;
                        var31_31 = var24_24;
                        var20_20 = var13_13.O;
                        if (var20_20 != 0) break block18;
                        var24_24 = var13_13.v();
                        var32_32 = var19_19;
                        var19_19 = var26_26;
                        var20_20 = Intrinsics.areEqual(var24_24, var19_19);
                        if (var20_20 != 0) break block19;
                        break block20;
                    }
                    var32_32 = var19_19;
                }
                rk_0.a(var26_26, (j30_0)var13_13, var26_26, (N20$a$a)var27_27);
            }
            var19_19 = N20$a.c;
            Ow3.a((b30_0)var13_13, var12_12, (Function2)var19_19);
            var25_25 = uq0_0.s;
            var12_12 = j.h((LP1)var23_23, var25_25);
            var13_13.K(-1021085983);
            var20_20 = var10_10 & 896 ^ 384;
            var33_33 = var15_15;
            var34_34 = 256;
            var35_35 = 3.59E-43f;
            if (var20_20 > var34_34 && (var20_20 = (int)var13_13.J(var8_8)) != 0 || (var20_20 = var10_10 & 384) == var34_34) {
                var20_20 = 1;
            } else {
                var20_20 = 0;
                var24_24 = null;
            }
            var15_15 = var13_13.v();
            if (var20_20 != 0 || var15_15 == var14_14) {
                var36_36 = 0;
                var37_37 = 0.0f;
                var14_14 = null;
                var15_15 = new cv0_2(var8_8, 0);
                var13_13.o(var15_15);
            }
            var15_15 = (Function0)var15_15;
            var13_13.T(false);
            var37_37 = 9.8E-45f;
            var38_38 = var23_23;
            var12_12 = d.b((LP1)var12_12, false, null, (Function0)var15_15, 7);
            var14_14 = new Object();
            var12_12 = CY2.b((LP1)var12_12, false, (Function1)var14_14);
            var36_36 = R$drawable.ic_cancel_transparent_refresh;
            var14_14 = var36_36;
            var34_34 = R$drawable.ic_cancel_transparent_refresh;
            var39_39 = null;
            var40_40 = 24;
            var41_41 = var31_31;
            var20_20 = var34_34;
            var34_34 = 1065353216;
            var35_35 = 1.0f;
            var26_26 = 0;
            var42_42 = 0;
            var43_43 = 0.0f;
            var44_44 = var23_23;
            var45_45 = var27_27;
            var27_27 = var13_13;
            var46_46 = var4_4;
            var47_47 = var19_19;
            var19_19 = null;
            var48_48 = var29_29;
            Je1.a((LP1)var12_12, var14_14, var20_20, null, null, (b30_0)var13_13, 0, var40_40);
            var38_38 = null;
            var31_31 = null;
            var49_49 = 13;
            var12_12 = j.c(h.i((LP1)var23_23, 0.0f, var25_25, 0.0f, 0.0f, var49_49), var35_35);
            var50_50 = OX.f;
            var25_25 = uq0_0.j;
            var22_22 = 0.0f;
            var27_27 = null;
            var21_21 = SP2.b(var25_25, var25_25, 0.0f, 0.0f, 12);
            var12_12 = a.b((LP1)var12_12, var50_50, (i13)var21_21);
            var14_14 = Nc$a.m;
            var24_24 = var28_28;
            var29_29 = null;
            var14_14 = oZ.a((zp$l)var28_28, (Gx$a)var14_14, (b30_0)var13_13, 0);
            var20_20 = var13_13.P;
            var21_21 = var13_13.P();
            var12_12 = a30_0.c((b30_0)var13_13, (LP1)var12_12);
            var23_23 = var48_48;
            var52_51 = var48_48 instanceof mp;
            if (var52_51) {
                var13_13.A();
                var52_51 = var13_13.O;
                if (var52_51) {
                    var23_23 = var32_32;
                    var13_13.C((Function0)var32_32);
                } else {
                    var13_13.n();
                }
                Ow3.a((b30_0)var13_13, var14_14, (Function2)var7_7);
                var7_7 = var41_41;
                Ow3.a((b30_0)var13_13, var21_21, (Function2)var41_41);
                var30_30 = var13_13.O;
                if (!var30_30 && (var30_30 = Intrinsics.areEqual(var7_7 = var13_13.v(), var14_14 = Integer.valueOf(var20_20)))) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        continue;
                        break;
                    }
                }
                var7_7 = var45_45;
                rk_0.a(var20_20, (j30_0)var13_13, var20_20, (N20$a$a)var45_45);
                ** continue;
                var7_7 = var47_47;
                Ow3.a((b30_0)var13_13, var12_12, (Function2)var47_47);
                var53_52 = uq0_0.o;
                var14_14 = j.c(h.i(var44_44, 0.0f, var53_52, 0.0f, 0.0f, 13), var35_35);
                var12_12 = new kv0_1(var16_16, var9_9, var6_6);
                var38_38 = v10.c(814139812, (fx0_2)var12_12, (b30_0)var13_13);
                var28_28 = null;
                var49_49 = 0x6000030;
                var20_20 = 0;
                var24_24 = null;
                var26_26 = 0;
                var25_25 = 0.0f;
                var21_21 = null;
                var52_51 = false;
                var23_23 = null;
                var22_22 = 0.0f;
                var27_27 = null;
                var19_19 = null;
                var29_29 = null;
                var54_53 = var16_16;
                var55_54 = 0;
                var16_16 = null;
                var39_39 = var33_33;
                var15_15 = null;
                var42_42 = 0;
                var43_43 = 0.0f;
                var56_55 = 3072;
                var57_56 = 7932;
                var12_12 = var46_46;
                var31_31 = var13_13;
                jl2.a((hm0_0)var46_46, (LP1)var14_14, null, null, 0, 0.0f, null, null, false, false, null, null, null, (u10)var38_38, (b30_0)var13_13, var49_49, var56_55, var57_56);
                var13_13.K(-885626298);
                var17_17 = var46_46.j();
                var34_34 = 1;
                var35_35 = 1.4E-45f;
                var36_36 = var18_18 + -1;
                if (var17_17 < var36_36) {
                    var12_12 = var54_53;
                    if (var54_53 != null && (var14_14 = var54_53.getQuestions()) != null && (var14_14 = (Question)CollectionsKt.N(var20_20 = var46_46.j(), (List)var14_14)) != null) {
                        var27_27 = var14_14.getViewType();
                    } else {
                        var27_27 = null;
                        var22_22 = 0.0f;
                    }
                    var14_14 = "QUESTION";
                    var36_36 = (int)Intrinsics.areEqual(var27_27, var14_14);
                    if (var36_36 != 0) {
                        var38_38 = null;
                        var31_31 = null;
                        var49_49 = 13;
                        var7_7 = h.i(var44_44, 0.0f, var53_52, 0.0f, 0.0f, var49_49);
                        var36_36 = 1065353216;
                        var37_37 = 1.0f;
                        var7_7 = j.c((LP1)var7_7, var37_37);
                        var14_14 = fg2_1.a;
                        var22_22 = uq0_0.h;
                        var21_21 = var39_39;
                        var21_21 = (c80)var39_39;
                        var23_23 = var46_46;
                        var24_24 = new qv0_2((c80)var21_21, (hm0_0)var46_46, var6_6, (DressToolModel)var12_12);
                        var17_17 = 1678769792;
                        var19_19 = v10.c(var17_17, (fx0_2)var24_24, (b30_0)var13_13);
                        var58_57 = 0L;
                        var52_51 = false;
                        var23_23 = null;
                        var55_54 = 1769526;
                        var42_42 = 28;
                        var43_43 = 3.9E-44f;
                        var12_12 = var7_7;
                        var29_29 = var13_13;
                        var30_30 = true;
                        var53_52 = 1.4E-45f;
                        var34_34 = var42_42;
                        var35_35 = var43_43;
                        JL.a((LP1)var7_7, (i13)var14_14, var58_57, null, var22_22, (u10)var19_19, (b30_0)var13_13, var55_54, var42_42);
lbl229:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                }
                var30_30 = true;
                var53_52 = 1.4E-45f;
                ** continue;
                var17_17 = 0;
                var12_12 = null;
                var13_13.T(false);
                var13_13.T(var30_30);
                var13_13.T(var30_30);
                var12_12 = var13_13.X();
                if (var12_12 != null) {
                    var13_13 = var14_14;
                    var6_6 = var0;
                    var7_7 = var1_1;
                    var8_8 = var2_2;
                    var9_9 = var3_3;
                    var10_10 = var5_5;
                    var12_12.d = var14_14 = new ev0_0(var0, var1_1, var2_2, var3_3, var5_5);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

