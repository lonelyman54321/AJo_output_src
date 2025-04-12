/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from lk3$a
 */
public final class lk3$a_0
extends Lambda
implements jx0_2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ln0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ wr1_1 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ i13 l;
    public final /* synthetic */ pl3 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ mk2_0 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Function2 r;

    public lk3$a_0(Function2 function2, Function2 function22, String string2, ln0 ln02, boolean bl2, boolean bl3, wr1_1 wr1_12, Function2 function23, Function2 function24, i13 i132, pl3 pl32, Function2 function25, boolean bl4, mk2_0 mk2_02, boolean bl5, Function2 function26) {
        this.c = function2;
        this.d = function22;
        this.e = string2;
        this.f = ln02;
        this.g = bl2;
        this.h = bl3;
        this.i = wr1_12;
        this.j = function23;
        this.k = function24;
        this.l = i132;
        this.m = pl32;
        this.n = function25;
        this.o = bl4;
        this.p = mk2_02;
        this.q = bl5;
        this.r = function26;
        super(6);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4, Object var5_5, Object var6_6) {
        block23: {
            block22: {
                var7_7 = this;
                var8_8 = var1_1;
                var8_8 = (Number)var1_1;
                var9_9 = var8_8.floatValue();
                var10_10 = var2_2;
                var10_10 = (OX)var2_2;
                var11_11 = var3_3;
                var12_12 = ((OX)var3_3).a;
                var11_11 = var4_4;
                var14_13 = ((Number)var4_4).floatValue();
                var15_14 = var5_5;
                var15_14 = (b30_0)var5_5;
                var11_11 = var6_6;
                var11_11 = (Number)var6_6;
                var16_15 = var11_11.intValue();
                var17_16 = var16_15 & 6;
                var18_17 = 4;
                var19_18 = 2;
                if (var17_16 == 0) {
                    var17_16 = (int)var15_14.b(var9_9);
                    var17_16 = var17_16 != 0 ? 4 : 2;
                    var17_16 |= var16_15;
                } else {
                    var17_16 = var16_15;
                }
                var20_19 = var16_15 & 48;
                var21_20 = var10_10.a;
                if (var20_19 == 0) {
                    var23_21 = var15_14.d(var21_20);
                    var23_21 = var23_21 != 0 ? 32 : 16;
                    var17_16 |= var23_21;
                }
                if ((var23_21 = var16_15 & 384) == 0) {
                    var23_21 = (int)var15_14.d(var12_12);
                    var23_21 = var23_21 != 0 ? 256 : 128;
                    var17_16 |= var23_21;
                }
                if ((var23_21 = var16_15 & 3072) == 0) {
                    var23_21 = (int)var15_14.b(var14_13);
                    var23_21 = var23_21 != 0 ? 2048 : 1024;
                    var17_16 |= var23_21;
                }
                var24_22 = var17_16;
                var23_21 = var17_16 & 9363;
                var16_15 = 9362;
                if (var23_21 != var16_15 || (var23_21 = (int)var15_14.h()) == 0) break block22;
                var15_14.D();
                break block23;
            }
            var25_23 = var7_7.c;
            if (var25_23 == null) {
                var23_21 = -1572365903;
                var15_14.K(var23_21);
                var15_14.E();
                var26_24 = null;
            } else {
                var15_14.K(-1572365902);
                var16_15 = (int)var7_7.q;
                var10_10 = var27_25;
                var28_26 = var16_15;
                var26_24 = var27_25;
                var20_19 = var16_15;
                var27_25 = new mk3_0(var9_9, var12_12, (Function2)var25_23, (boolean)var16_15, var21_20);
                var23_21 = -1865025495;
                var10_10 = v10.c(var23_21, (fx0_2)var27_25, (b30_0)var15_14);
                var15_14.E();
                var26_24 = var10_10;
            }
            var10_10 = var7_7.f;
            var16_15 = (int)var7_7.g;
            var29_27 = var7_7.d;
            if (var29_27 == null || (var31_29 = (var30_28 = var7_7.e).length()) != 0) ** GOTO lbl-1000
            var30_28 = null;
            cfr_temp_0 = var14_13 - 0.0f;
            var31_29 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var31_29 > 0) {
                var31_29 = -1571586748;
                var15_14.K(var31_29);
                var30_28 = new ok3_0(var14_13, (ln0)var10_10, (boolean)var16_15, (Function2)var29_27);
                var32_30 = -413527723;
                var29_27 = v10.c(var32_30, (fx0_2)var30_28, (b30_0)var15_14);
                var15_14.E();
                var30_28 = var29_27;
            } else lbl-1000:
            // 2 sources

            {
                var32_30 = -1571160716;
                var15_14.K(var32_30);
                var15_14.E();
                var31_29 = 0;
                var30_28 = null;
            }
            var32_30 = (int)var7_7.h;
            var25_23 = (OX)var10_10.e((boolean)var16_15, (boolean)var32_30, (b30_0)var15_14).getValue();
            var33_31 = var25_23.a;
            var35_32 = var7_7.j;
            if (var35_32 == null) {
                var15_14.K(-1570983241);
                var15_14.E();
                var17_16 = 0;
                var25_23 = null;
            } else {
                var36_33 = -1570983240;
                var15_14.K(var36_33);
                var37_34 = new nk3_0(var33_31, var35_32);
                var17_16 = -1165144581;
                var25_23 = v10.c(var17_16, (fx0_2)var37_34, (b30_0)var15_14);
                var15_14.E();
            }
            var11_11 = (OX)var10_10.h((boolean)var16_15, (boolean)var32_30, (b30_0)var15_14).getValue();
            var38_35 = var11_11.a;
            var27_25 = var7_7.k;
            if (var27_25 == null) {
                var16_15 = -1570681642;
                var15_14.K(var16_15);
                var15_14.E();
                var20_19 = 0;
                var27_25 = null;
            } else {
                var40_36 = -1570681641;
                var15_14.K(var40_36);
                var35_32 = new pk3_0(var38_35, (Function2)var27_25);
                var16_15 = 1694126319;
                var11_11 = v10.c(var16_15, var35_32, (b30_0)var15_14);
                var15_14.E();
                var27_25 = var11_11;
            }
            var11_11 = LP1$a.b;
            var21_20 = ((OX)var10_10.a((b30_0)var15_14).getValue()).a;
            var10_10 = var7_7.l;
            var10_10 = a.b((LP1)var11_11, var21_20, (i13)var10_10);
            var11_11 = lk3$a$a.$EnumSwitchMapping$0;
            var29_27 = var7_7.m;
            var32_30 = var29_27.ordinal();
            var16_15 = (int)var11_11[var32_30];
            var32_30 = 1;
            var40_36 = 0x1C00000;
            if (var16_15 != var32_30) {
                if (var16_15 != var19_18) {
                    var41_37 = -1568365383;
                    var9_9 = -3.595308E-18f;
                    var15_14.K(var41_37);
                    var15_14.E();
                } else {
                    var16_15 = -1569791817;
                    var15_14.K(var16_15);
                    var11_11 = var15_14.v();
                    var37_34 = b30$a.a;
                    if (var11_11 == var37_34) {
                        var1_1 = var30_28;
                        var12_12 = 0L;
                        var11_11 = new C63(var12_12);
                        var11_11 = J83.g(var11_11);
                        var15_14.o(var11_11);
                    } else {
                        var1_1 = var30_28;
                    }
                    var11_11 = (tr1_0)var11_11;
                    var30_28 = var7_7.p;
                    var42_38 = var7_7.r;
                    var29_27 = new qk3_0((tr1_0)var11_11, (mk2_0)var30_28, (Function2)var42_38);
                    var31_29 = -1212965554;
                    var43_40 = v10.c(var31_29, (fx0_2)var29_27, (b30_0)var15_14);
                    var32_30 = var24_22 & 14;
                    if (var32_30 == var18_17) {
                        var32_30 = 1;
                    } else {
                        var32_30 = 0;
                        var29_27 = null;
                    }
                    var30_28 = var15_14.v();
                    if (var32_30 != 0 || var30_28 == var37_34) {
                        var30_28 = new kk3((tr1_0)var11_11, var9_9);
                        var15_14.o(var30_28);
                    }
                    var42_38 = var30_28;
                    var42_38 = (Function1)var30_28;
                    var16_15 = var24_22 << 21 & var40_36;
                    var32_30 = 0x30000000;
                    var28_26 = var16_15 | var32_30;
                    var11_11 = var7_7.n;
                    var40_36 = (int)var7_7.o;
                    var44_41 = var7_7.p;
                    var29_27 = var1_1;
                    var30_28 = var26_24;
                    var45_42 = var43_40;
                    var43_40 = var44_41;
                    var44_41 = var15_14;
                    var8_8 = var15_14;
                    var15_14 = null;
                    Jg2.a((LP1)var10_10, (Function2)var11_11, (u10)var1_1, (u10)var26_24, (u10)var25_23, (u10)var27_25, (boolean)var40_36, var9_9, (Function1)var42_38, var45_42, (mk2_0)var43_40, (b30_0)var44_41, var28_26, 0);
                    var44_41.E();
                }
            } else {
                var1_1 = var30_28;
                var15_14.K(-1570370153);
                var16_15 = var24_22 << 21;
                var19_18 = var16_15 & var40_36;
                var42_39 = var7_7.p;
                var11_11 = var7_7.n;
                var40_36 = (int)var7_7.o;
                var29_27 = var26_24;
                var45_43 = var15_14;
                Fk3.a((LP1)var10_10, (Function2)var11_11, (u10)var26_24, (u10)var30_28, (u10)var25_23, (u10)var27_25, (boolean)var40_36, var9_9, var42_39, (b30_0)var15_14, var19_18);
                var15_14.E();
            }
        }
        return Unit.a;
    }
}

