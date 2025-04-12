/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class y83$a
extends rl2_2
implements Function2 {
    public int[] b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y83 g;

    public y83$a(y83 y832, f80_0 f80_02) {
        this.g = y832;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        y83 y832 = this.g;
        y83$a y83$a = new y83$a(y832, f80_02);
        y83$a.f = object;
        return y83$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (y83$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((y83$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block15: {
            block14: {
                block13: {
                    block9: {
                        block10: {
                            block11: {
                                block12: {
                                    var2_2 = this;
                                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var4_4 = this.e;
                                    var5_5 = 64;
                                    var6_6 = 1L;
                                    var8_7 = 3;
                                    var9_8 = 2;
                                    var10_9 = 0L;
                                    var12_10 = this.g;
                                    var13_11 = 1;
                                    if (var4_4 == 0) break block9;
                                    if (var4_4 == var13_11) break block10;
                                    if (var4_4 == var9_8) break block11;
                                    if (var4_4 != var8_7) break block12;
                                    var4_4 = this.c;
                                    var14_12 = (xz2_2)this.f;
                                    vl2_2.b(var1_1);
                                    var15_13 /* !! */  = var4_4;
                                    ** GOTO lbl-1000
                                }
                                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var3_3 /* !! */ ;
                            }
                            var4_4 = this.c;
                            var16_14 = (xz2_2)this.f;
                            vl2_2.b(var1_1);
                            ** GOTO lbl-1000
                        }
                        var4_4 = this.d;
                        var17_15 = this.c;
                        var18_16 = this.b;
                        var19_17 = (xz2_2)this.f;
                        vl2_2.b(var1_1);
                        ** GOTO lbl-1000
                    }
                    vl2_2.b(var1_1);
                    var20_18 = (xz2_2)this.f;
                    var19_17 = var12_10.d;
                    if (var19_17 != null) {
                        var17_15 = ((int[])var19_17).length;
                        var18_16 = var19_17;
                        var19_17 = var20_18;
                        var4_4 = var17_15;
                        var16_14 = null;
                        for (var17_15 = 0; var17_15 < var4_4; var17_15 += var13_11) {
                            var8_7 = var18_16[var17_15];
                            var14_12 = new Integer(var8_7);
                            var2_2.f = var19_17;
                            var2_2.b = var18_16;
                            var2_2.c = var17_15;
                            var2_2.d = var4_4;
                            var2_2.e = var13_11;
                            var21_19 /* !! */  = var19_17.a(var2_2, var14_12);
                            if (var21_19 /* !! */  == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    }
                    break block13;
lbl-1000:
                    // 3 sources

                    {
                        var8_7 = 3;
                        var9_8 = 2;
                        continue;
                    }
                    var20_18 = var19_17;
                }
                if ((var15_13 /* !! */  = (cfr_temp_0 = (var22_20 = var12_10.b) - var10_9) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
                    var16_14 = var20_18;
                    var20_18 = null;
                    for (var4_4 = 0; var4_4 < var5_5; var4_4 += var13_11) {
                        var22_20 = var12_10.b;
                        var24_21 = var6_6 << var4_4;
                        cfr_temp_1 = (var22_20 &= var24_21) - var10_9;
                        var15_13 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var15_13 /* !! */  != false) {
                            var8_7 = var12_10.c + var4_4;
                            var14_12 = new Integer(var8_7);
                            var2_2.f = var16_14;
                            var2_2.b = null;
                            var2_2.c = var4_4;
                            var2_2.e = var8_7 = 2;
                            if ((var14_12 = var16_14.a(var2_2, var14_12)) != var3_3 /* !! */ ) continue;
                            return var3_3 /* !! */ ;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                }
                break block14;
lbl-1000:
                // 3 sources

                {
                    var8_7 = 2;
                    continue;
                }
                var20_18 = var16_14;
            }
            if ((var15_13 /* !! */  = (cfr_temp_2 = (var22_20 = var12_10.a) - var10_9) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) != false) {
                var14_12 = var20_18;
                var19_17 = null;
                for (var15_13 /* !! */  = (long)0; var15_13 /* !! */  < var5_5; var15_13 /* !! */  += var13_11) {
                    var26_22 = var12_10.a;
                    var28_23 = var6_6 << var15_13 /* !! */ ;
                    cfr_temp_3 = (var26_22 &= var28_23) - var10_9;
                    var4_4 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var4_4 != 0) {
                        var4_4 = (int)(var15_13 /* !! */  + 64);
                        var8_7 = var12_10.c;
                        var21_19 /* !! */  = new Integer(var4_4 += var8_7);
                        var2_2.f = var14_12;
                        var2_2.b = null;
                        var2_2.c = (int)var15_13 /* !! */ ;
                        var2_2.e = var4_4 = 3;
                        if ((var21_19 /* !! */  = var14_12.a(var2_2, (Object)var21_19 /* !! */ )) != var3_3 /* !! */ ) continue;
                        return var3_3 /* !! */ ;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            }
            break block15;
lbl-1000:
            // 3 sources

            {
                var4_4 = 3;
                continue;
            }
        }
        return Unit.a;
    }
}

