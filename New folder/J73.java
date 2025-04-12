/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.graphics.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class J73
extends Lambda
implements gx0_2 {
    public final /* synthetic */ D73 c;
    public final /* synthetic */ D73 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ QI0 f;

    public J73(D73 d73, D73 d732, ArrayList arrayList, QI0 qI0) {
        this.c = d73;
        this.d = d732;
        this.e = arrayList;
        this.f = qI0;
        super(3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        block24: {
            block23: {
                block22: {
                    var4_4 = this;
                    var5_5 = var1_1;
                    var5_5 = (Function2)var1_1;
                    var6_6 = var2_2;
                    var6_6 = (b30_0)var2_2;
                    var7_7 = var3_3;
                    var7_7 = (Number)var3_3;
                    var8_8 = var7_7.intValue();
                    var9_9 = var8_8 & 6;
                    if (var9_9 == 0) {
                        var9_9 = (int)var6_6.x(var5_5);
                        var9_9 = var9_9 != 0 ? 4 : 2;
                        var8_8 |= var9_9;
                    }
                    if ((var9_9 = var8_8 & 19) != (var10_10 = 18) || (var9_9 = (int)var6_6.h()) == 0) break block22;
                    var6_6.D();
                    break block23;
                }
                var11_11 = var4_4.d;
                var12_12 = var4_4.c;
                var9_9 = (int)Intrinsics.areEqual(var12_12, var11_11);
                var13_13 = 75;
                var14_14 = 1.05E-43f;
                if (var9_9 != 0) {
                    var15_15 = 150;
                    var16_16 = 150;
                } else {
                    var16_16 = 75;
                }
                if (var9_9 == 0) ** GOTO lbl-1000
                var17_17 = (ArrayList)var4_4.e;
                var19_19 = var17_17.size();
                var18_18 = new ArrayList(var19_19);
                var19_19 = var17_17.size();
                var21_21 = null;
                for (var20_20 = 0; var20_20 < var19_19; ++var20_20) {
                    var22_22 /* !! */  = var17_17.get(var20_20);
                    if (var22_22 /* !! */  == null) continue;
                    var18_18.add(var22_22 /* !! */ );
                }
                var15_15 = var18_18.size();
                if (var15_15 != (var23_23 = 1)) {
                    var24_24 = 75;
                } else lbl-1000:
                // 2 sources

                {
                    var24_24 = 0;
                }
                var25_25 = ex0_0.c;
                var26_26 = new Qs3(var16_16, var24_24, (cx0_0)var25_25);
                var13_13 = (int)var6_6.x(var12_12);
                var17_17 = var4_4.f;
                var23_23 = var6_6.x(var17_17);
                var18_18 = var6_6.v();
                var27_27 = b30$a.a;
                if ((var13_13 |= var23_23) != 0 || var18_18 == var27_27) {
                    var18_18 = new i73_0((D73)var12_12, (QI0)var17_17);
                    var6_6.o(var18_18);
                }
                var21_21 = var18_18;
                var21_21 = (Function0)var18_18;
                var25_25 = var6_6.v();
                var28_28 = 1.0f;
                if (var25_25 == var27_27) {
                    if (var9_9 == 0) {
                        var13_13 = 1065353216;
                        var14_14 = 1.0f;
                    } else {
                        var13_13 = 0;
                        var14_14 = 0.0f;
                        var25_25 = null;
                    }
                    var25_25 = Rj.a(var14_14);
                    var6_6.o(var25_25);
                }
                var22_22 /* !! */  = var25_25;
                var22_22 /* !! */  = (Lj)var25_25;
                var18_18 = (boolean)var9_9;
                var13_13 = (int)var6_6.x(var22_22 /* !! */ );
                var15_15 = (int)var6_6.a((boolean)var9_9);
                var13_13 |= var15_15;
                var15_15 = (int)var6_6.x(var26_26);
                var13_13 |= var15_15;
                var15_15 = (int)var6_6.J(var21_21);
                var17_17 = var6_6.v();
                if ((var13_13 |= var15_15) == 0 && var17_17 != var27_27) {
                    var29_29 = var18_18;
                    var4_4 = var22_22 /* !! */ ;
                } else {
                    var30_30 = 0.0f;
                    var25_25 = var17_17;
                    var17_17 = var22_22 /* !! */ ;
                    var29_29 = var18_18;
                    var23_23 = var9_9;
                    var4_4 = var22_22 /* !! */ ;
                    var22_22 /* !! */  = null;
                    var25_25((Lj)var17_17, (boolean)var9_9, var26_26, (Function0)var21_21, null);
                    var6_6.o(var25_25);
                    var17_17 = var25_25;
                }
                var17_17 = (Function2)var17_17;
                var25_25 = var29_29;
                ly0_0.d((b30_0)var6_6, var29_29, (Function2)var17_17);
                var4_4 = var4_4.c;
                var25_25 = ex0_0.a;
                var17_17 = new Qs3(var16_16, var24_24, (cx0_0)var25_25);
                var25_25 = var6_6.v();
                if (var25_25 == var27_27) {
                    if (var9_9 != 0) {
                        var28_28 = 0.8f;
                    }
                    var25_25 = Rj.a(var28_28);
                    var6_6.o(var25_25);
                }
                var25_25 = (Lj)var25_25;
                var18_18 = (boolean)var9_9;
                var19_19 = (int)var6_6.x(var25_25);
                var20_20 = (int)var6_6.a((boolean)var9_9);
                var19_19 |= var20_20;
                var20_20 = (int)var6_6.x(var17_17);
                var21_21 = var6_6.v();
                var22_22 /* !! */  = null;
                if ((var19_19 |= var20_20) != 0 || var21_21 == var27_27) {
                    var21_21 = new q73_0((Lj)var25_25, (boolean)var9_9, (Qs3)var17_17, null);
                    var6_6.o(var21_21);
                }
                var21_21 = (Function2)var21_21;
                ly0_0.d((b30_0)var6_6, var18_18, (Function2)var21_21);
                var11_11 = var25_25.c;
                var31_31 = LP1$a.b;
                var30_30 = ((Number)var11_11.b.getValue()).floatValue();
                var11_11 = (Number)var11_11.b.getValue();
                var32_32 = var11_11.floatValue();
                var33_33 = ((Number)var4_4.b.getValue()).floatValue();
                var34_34 = 131064;
                var4_4 = a.b(var31_31, var30_30, var32_32, var33_33, 0.0f, null, false, var34_34);
                var9_9 = var6_6.x(var12_12);
                var25_25 = var6_6.v();
                if (var9_9 != 0 || var25_25 == var27_27) {
                    var25_25 = new g73_0((D73)var12_12);
                    var6_6.o(var25_25);
                }
                var25_25 = (Function1)var25_25;
                var9_9 = 0;
                var4_4 = CY2.b((LP1)var4_4, false, (Function1)var25_25);
                var12_12 = Nc$a.a;
                var11_11 = HA.e((Nc)var12_12, false);
                var10_10 = var6_6.F();
                var25_25 = var6_6.m();
                var4_4 = a30_0.c((b30_0)var6_6, (LP1)var4_4);
                N20.W.getClass();
                var17_17 = N20$a.b;
                var18_18 = var6_6.i();
                var23_23 = var18_18 instanceof mp;
                if (var23_23 == 0) break block24;
                var6_6.A();
                var23_23 = (int)var6_6.e();
                if (var23_23 != 0) {
                    var6_6.C((Function0)var17_17);
                } else {
                    var6_6.n();
                }
                var17_17 = N20$a.e;
                Ow3.a((b30_0)var6_6, var11_11, (Function2)var17_17);
                var11_11 = N20$a.d;
                Ow3.a((b30_0)var6_6, var25_25, (Function2)var11_11);
                var11_11 = N20$a.f;
                var13_13 = (int)var6_6.e();
                if (var13_13 != 0 || (var13_13 = (int)Intrinsics.areEqual(var25_25 = var6_6.v(), var17_17 = Integer.valueOf(var10_10))) == 0) {
                    re0_0.a(var10_10, (b30_0)var6_6, var10_10, (N20$a$a)var11_11);
                }
                var11_11 = N20$a.c;
                Ow3.a((b30_0)var6_6, var4_4, (Function2)var11_11);
                var35_35 = var8_8 & 14;
                var4_4 = var35_35;
                var5_5.invoke(var6_6, var4_4);
                var6_6.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

