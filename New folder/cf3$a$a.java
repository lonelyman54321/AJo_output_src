/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class cf3$a$a
extends rl2_2
implements Function2 {
    public aw2_0 b;
    public Nv2 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cf3_1 f;

    public cf3$a$a(df3_1 df3_12, f80_0 f80_02) {
        this.f = df3_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        df3_1 df3_12 = (df3_1)this.f;
        cf3$a$a cf3$a$a = new cf3$a$a(df3_12, f80_02);
        cf3$a$a.e = object;
        return cf3$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (cf3$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cf3$a$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block25: {
            block24: {
                block23: {
                    block19: {
                        block20: {
                            block21: {
                                block22: {
                                    var2_2 = this;
                                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var4_4 = this.d;
                                    var5_5 = 1;
                                    var6_6 /* !! */  = this.f;
                                    var7_7 = 2;
                                    var8_8 = 2.8E-45f;
                                    var9_9 = 3;
                                    if (var4_4 == 0) break block19;
                                    if (var4_4 == var5_5) break block20;
                                    if (var4_4 == var7_7) break block21;
                                    if (var4_4 != var9_9) break block22;
                                    var10_10 = this.b;
                                    var11_11 /* !! */  = (ru_0)this.e;
                                    vl2_2.b(var1_1);
                                    var6_6 /* !! */  = var1_1;
                                    var7_7 = 0;
                                    var8_8 = 0.0f;
                                    var12_12 = null;
                                    var13_13 = 3;
                                    var14_14 = 4.2E-45f;
                                    ** GOTO lbl-1000
                                }
                                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var3_3 /* !! */ ;
                            }
                            var10_10 = this.c;
                            var11_11 /* !! */  = this.b;
                            var15_15 = (ru_0)this.e;
                            vl2_2.b(var1_1);
                            var16_16 = var1_1;
                            ** GOTO lbl96
                        }
                        var10_10 = (ru_0)this.e;
                        vl2_2.b(var1_1);
                        var15_15 = var1_1;
                        break block23;
                    }
                    vl2_2.b(var1_1);
                    var10_10 = (ru_0)this.e;
                    var15_15 = Nv2.Initial;
                    this.e = var10_10;
                    this.d = var5_5;
                    var15_15 = Di3.b((ru_0)var10_10, (boolean)var5_5, (Nv2)var15_15, this);
                    if (var15_15 == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                }
                var15_15 = (aw2_0)var15_15;
                var17_17 /* !! */  = lw2_0.a(var15_15.i, var9_9);
                if (var17_17 /* !! */  == 0) {
                    var18_18 = 5.6E-45f;
                    var19_19 = var15_15.i;
                    var17_17 /* !! */  = lw2_0.a(var19_19, 4);
                    if (var17_17 /* !! */  == 0) {
                        return Unit.a;
                    }
                }
                var20_20 = var15_15.c;
                var22_21 = e72.d(var20_20);
                var23_22 = null;
                cfr_temp_0 = var22_21 - 0.0f;
                var24_23 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var24_23 /* !! */  < 0) break block24;
                var22_21 = e72.d(var20_20);
                var25_24 = var10_10.a();
                var27_25 = 32;
                var28_26 = (int)(var25_24 >>= var27_25);
                var29_27 = var28_26;
                cfr_temp_1 = var22_21 - var29_27;
                var24_23 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                if (var24_23 /* !! */  >= 0 || (var24_23 /* !! */  = (int)((cfr_temp_2 = (var22_21 = e72.e(var20_20)) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) < 0) break block24;
                var18_18 = e72.e(var20_20);
                var30_28 = var10_10.a();
                var32_29 = 0xFFFFFFFFL;
                var24_23 /* !! */  = (int)(var30_28 &= var32_29);
                var34_30 = var24_23 /* !! */ ;
                cfr_temp_3 = var18_18 - var34_30;
                var17_17 /* !! */  = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                if (var17_17 /* !! */  < 0) break block25;
            }
            var5_5 = 0;
            var11_11 /* !! */  = null;
        }
        var17_17 /* !! */  = var6_6 /* !! */ .q;
        var11_11 /* !! */  = var17_17 /* !! */  == 0 && var5_5 == 0 ? Nv2.Main : Nv2.Initial;
        var35_31 = var15_15;
        var15_15 = var10_10;
        var10_10 = var11_11 /* !! */ ;
        var11_11 /* !! */  = var35_31;
        while (true) {
            block29: {
                block30: {
                    block28: {
                        block27: {
                            block26: {
                                block17: {
                                    var2_2.e = var15_15;
                                    var2_2.b = var11_11 /* !! */ ;
                                    var2_2.c = var10_10;
                                    var2_2.d = var7_7;
                                    var16_16 = var15_15.x0((Nv2)var10_10, var2_2);
                                    if (var16_16 == var3_3 /* !! */ ) {
                                        return var3_3 /* !! */ ;
                                    }
lbl96:
                                    // 3 sources

                                    var16_16 = ((mv2_0)var16_16).a;
                                    var19_19 = var16_16.size();
                                    var22_21 = 0.0f;
                                    for (var24_23 /* !! */  = 0; var24_23 /* !! */  < var19_19; ++var24_23 /* !! */ ) {
                                        var36_32 = var23_22 = (aw2_0)var16_16.get(var24_23 /* !! */ );
                                        var36_32 = var23_22;
                                        var28_26 = var36_32.b();
                                        if (var28_26 != 0 || (var7_7 = (int)Yv2.a(var39_34 = var36_32.a, var37_33 = var11_11 /* !! */ .a)) == 0 || (var7_7 = (int)var36_32.d) == 0) {
                                            var7_7 = 2;
                                            var8_8 = 2.8E-45f;
                                            var9_9 = 3;
                                            continue;
                                        }
                                        break block17;
                                    }
                                    var23_22 = null;
                                }
                                var23_22 = var23_22;
                                if (var23_22 == null) break block26;
                                var37_33 = var11_11 /* !! */ .b;
                                var39_34 = var23_22.b - var37_33;
                                var12_12 = var15_15.getViewConfiguration();
                                cfr_temp_4 = var39_34 - (var37_33 = var12_12.b());
                                var17_17 /* !! */  = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                if (var17_17 /* !! */  < 0) break block27;
                            }
                            var23_22 = null;
                            break block28;
                        }
                        var37_33 = var23_22.c;
                        var39_34 = var11_11 /* !! */ .c;
                        var8_8 = e72.c(var37_33 = e72.h(var37_33, var39_34));
                        cfr_temp_5 = var8_8 - (var14_14 = (var41_35 = var15_15.getViewConfiguration()).c());
                        var7_7 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                        if (var7_7 <= 0) break block29;
                    }
                    if (var23_22 != null && (var4_4 = (int)(var10_10 = (Boolean)var6_6 /* !! */ .p.invoke()).booleanValue()) != 0) {
                        var23_22.a();
                        var10_10 = var11_11 /* !! */ ;
                        var11_11 /* !! */  = var15_15;
                        while (true) lbl-1000:
                        // 2 sources

                        {
                            var6_6 /* !! */  = Nv2.Initial;
                            var2_2.e = var11_11 /* !! */ ;
                            var2_2.b = var10_10;
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var12_12 = null;
                            var2_2.c = null;
                            var13_13 = 3;
                            var14_14 = 4.2E-45f;
                            var2_2.d = var13_13;
                            if ((var6_6 /* !! */  = var11_11 /* !! */ .x0((Nv2)var6_6 /* !! */ , var2_2)) == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            } else {
                                ** GOTO lbl-1000
                            }
                            break;
                        }
                    }
                    break block30;
lbl-1000:
                    // 3 sources

                    {
                        block18: {
                            var6_6 /* !! */  = ((mv2_0)var6_6 /* !! */ ).a;
                            var9_9 = var6_6 /* !! */ .size();
                            for (var42_36 = 0; var42_36 < var9_9; ++var42_36) {
                                var16_16 = var15_15 = var6_6 /* !! */ .get(var42_36);
                                var16_16 = (aw2_0)var15_15;
                                var19_19 = (int)var16_16.b();
                                if (var19_19 != 0 || (var19_19 = (int)Yv2.a(var32_29 = var16_16.a, var30_28 = var10_10.a)) == 0 || (var17_17 /* !! */  = (int)var16_16.d) == 0) {
                                    continue;
                                }
                                break block18;
                            }
                            var15_15 = null;
                        }
                        var15_15 = (aw2_0)var15_15;
                        if (var15_15 == null) {
                            return Unit.a;
                        }
                        var15_15.a();
                        ** while (true)
                    }
                }
                return Unit.a;
            }
            var7_7 = 2;
            var8_8 = 2.8E-45f;
            var9_9 = 3;
        }
    }
}

