/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class sh0$a
implements hx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ ProductReview g;

    public sh0$a(List list, List list2, int n3, Boolean bl2, Function0 function0, gx0_2 gx0_22, ProductReview productReview) {
        this.a = list;
        this.b = list2;
        this.c = n3;
        this.d = bl2;
        this.e = function0;
        this.f = gx0_22;
        this.g = productReview;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block14: {
            block15: {
                block13: {
                    var5_5 = this;
                    var6_6 = var1_1;
                    var6_6 = (wr1_2)var1_1;
                    var7_7 = var2_2;
                    var7_7 = (Number)var2_2;
                    var8_8 = var7_7.intValue();
                    var9_9 = var3_3;
                    var9_9 = (b30_0)var3_3;
                    var10_10 = var4_4;
                    var10_10 = (Number)var4_4;
                    var11_11 = var10_10.intValue();
                    var12_12 = "$this$items";
                    Intrinsics.checkNotNullParameter(var6_6, (String)var12_12);
                    var13_13 = var11_11 & 112;
                    if (var13_13 == 0) {
                        var13_13 = (int)var9_9.c(var8_8);
                        if (var13_13 != 0) {
                            var13_13 = 32;
                            var14_14 = 4.5E-44f;
                        } else {
                            var13_13 = 16;
                            var14_14 = 2.2E-44f;
                        }
                        var11_11 |= var13_13;
                    }
                    if ((var13_13 = var11_11 & 721) != (var11_11 = 144) || (var13_13 = (int)var9_9.h()) == 0) break block13;
                    var9_9.D();
                    break block14;
                }
                var10_10 = var5_5.a;
                if (var10_10 != null) {
                    var10_10 = (String)CollectionsKt.N(var8_8, (List)var10_10);
                } else {
                    var11_11 = 0;
                    var10_10 = null;
                }
                if (var10_10 == null || (var11_11 = var10_10.length()) == 0) break block14;
                var11_11 = 8;
                var15_15 = var11_11;
                var16_16 = SP2.a(var15_15);
                var17_17 = LP1$a.b;
                var18_18 = 1.0f;
                var12_12 = j.c(var17_17, var18_18);
                var19_19 = 54;
                var20_20 = 7.6E-44f;
                var21_21 = var19_19;
                var12_12 = androidx.compose.foundation.layout.c.a(j.d((LP1)var12_12, var21_21), var18_18);
                var22_22 = OX.f;
                var12_12 = QV.a(androidx.compose.foundation.a.b((LP1)var12_12, var22_22, (i13)var16_16), (i13)var16_16);
                var24_23 = HA.e(Nc$a.a, false);
                var25_24 = var9_9.F();
                var26_25 = var9_9.m();
                var12_12 = a30_0.c((b30_0)var9_9, (LP1)var12_12);
                var27_26 = N20.W;
                var27_26.getClass();
                var6_6 = N20$a.b;
                var28_27 = var9_9.i();
                var29_28 = var28_27 instanceof mp;
                if (!var29_28) break block15;
                var9_9.A();
                var29_28 = var9_9.e();
                if (var29_28) {
                    var9_9.C((Function0)var6_6);
                } else {
                    var9_9.n();
                }
                var6_6 = N20$a.e;
                Ow3.a((b30_0)var9_9, var24_23, (Function2)var6_6);
                var6_6 = N20$a.d;
                Ow3.a((b30_0)var9_9, var26_25, (Function2)var6_6);
                var6_6 = N20$a.f;
                var19_19 = (int)var9_9.e();
                if (var19_19 != 0 || (var19_19 = (int)Intrinsics.areEqual(var24_23 = var9_9.v(), var26_25 = Integer.valueOf(var25_24))) == 0) {
                    re0_0.a(var25_24, (b30_0)var9_9, var25_24, (N20$a$a)var6_6);
                }
                var6_6 = N20$a.c;
                Ow3.a((b30_0)var9_9, var12_12, (Function2)var6_6);
                var6_6 = androidx.compose.foundation.layout.d.a;
                var12_12 = var5_5.b;
                if (var12_12 != null) {
                    var12_12 = (String)CollectionsKt.N(var8_8, (List)var12_12);
                } else {
                    var30_29 = 0;
                    var15_15 = 0.0f;
                    var12_12 = null;
                }
                var9_9.u(1998134191);
                var10_10 = u63.a(var12_12, (b30_0)var9_9, var11_11);
                var9_9.I();
                var26_25 = i70$a.a;
                var12_12 = j.d(j.c(var17_17, var18_18), var21_21);
                var19_19 = 1061997773;
                var20_20 = 0.8f;
                var12_12 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.a((LP1)var12_12, var20_20), var22_22, (i13)var16_16);
                var28_27 = var5_5.f;
                var31_30 = var5_5.d;
                var32_31 = var5_5.g;
                var24_23 = new ph0_0((gx0_2)var28_27, var8_8, (Boolean)var31_30, var32_31);
                var27_26 = var32_31;
                var4_4 = var31_30;
                var2_2 = var28_27;
                var24_23 = QV.a(androidx.compose.foundation.d.b((LP1)var12_12, false, null, (Function0)var24_23, 7), (i13)var16_16);
                var33_32 = 24624;
                var34_33 = 3.4506E-41f;
                var35_34 = 104;
                var36_35 = 1.46E-43f;
                var12_12 = "";
                var25_24 = 0;
                var31_30 = null;
                var37_36 = var28_27;
                var29_28 = false;
                var28_27 = null;
                var38_37 = var22_22;
                var40_38 = var21_21;
                var21_21 = var34_33;
                var2_2 = var6_6;
                var13_13 = 1065353216;
                var14_14 = 1.0f;
                var18_18 = var36_35;
                Pd1.a((im2)var10_10, (String)var12_12, (LP1)var24_23, null, (i70_0)var26_25, 0.0f, null, (b30_0)var9_9, var33_32, var35_34);
                var9_9.K(1096293406);
                var11_11 = 5;
                var30_29 = var5_5.c;
                if (var30_29 <= var11_11) ** GOTO lbl-1000
                var24_23 = Boolean.TRUE;
                var31_30 = var4_4;
                var19_19 = (int)Intrinsics.areEqual(var4_4, var24_23);
                if (var19_19 == 0) ** GOTO lbl-1000
                var19_19 = 4;
                var20_20 = 5.6E-45f;
                if (var8_8 == var19_19) {
                    var6_6 = j.c(var17_17, var14_14);
                    var20_20 = var40_38;
                    var6_6 = j.d((LP1)var6_6, var40_38);
                    var41_39 = OX.b;
                    var19_19 = 0x3F000000;
                    var20_20 = 0.5f;
                    var41_39 = OX.b(var41_39, var20_20);
                    var6_6 = androidx.compose.foundation.a.b((LP1)var6_6, var41_39, (i13)var16_16);
                    var26_25 = var37_36;
                    var28_27 = var32_31;
                    var24_23 = new qh0_1((gx0_2)var37_36, var8_8, (Boolean)var4_4, var32_31);
                    var25_24 = 0;
                    var31_30 = null;
                    var43_40 = 7;
                    HA.a(QV.a(androidx.compose.foundation.d.b((LP1)var6_6, false, null, (Function0)var24_23, var43_40), (i13)var16_16), (b30_0)var9_9, 0);
                    var12_12 = hj0_0.a(var30_29 -= var11_11, "+");
                    var6_6 = Nc$a.e;
                    var7_7 = var2_2;
                    var6_6 = var2_2.a(var17_17, (Nc)var6_6);
                    var8_8 = 1096319343;
                    var9_9.K(var8_8);
                    var7_7 = var5_5.e;
                    var11_11 = (int)var9_9.J(var7_7);
                    var24_23 = var9_9.v();
                    if (var11_11 != 0 || var24_23 == (var10_10 = b30$a.a)) {
                        var24_23 = new rh0_1((Function0)var7_7);
                        var9_9.o(var24_23);
                    }
                    var24_23 = (Function0)var24_23;
                    var9_9.E();
                    var8_8 = 0;
                    var10_10 = androidx.compose.foundation.d.b((LP1)var6_6, false, null, (Function0)var24_23, var43_40);
                    var44_41 = Em3.f(12);
                    var46_42 = Em3.f(2);
                    var48_43 = 1597824;
                    var13_13 = 40;
                    var14_14 = 5.6E-44f;
                    var43_40 = 0;
                    var26_25 = null;
                    var16_16 = var9_9;
                    var7_7 = var9_9;
                    mm3_0.a((LP1)var10_10, (String)var12_12, var38_37, null, var44_41, null, var46_42, (b30_0)var9_9, var48_43, var13_13);
                } else lbl-1000:
                // 3 sources

                {
                    var7_7 = var9_9;
                }
                var7_7.E();
                var7_7.p();
                break block14;
            }
            s20.a();
            throw null;
        }
        return Unit.a;
    }
}

