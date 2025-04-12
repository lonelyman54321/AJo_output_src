/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class PR1$a$a$a
extends rl2_2
implements Function2 {
    public PR1$a$a b;
    public pr1_1 c;
    public long[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pr1_1 l;
    public final /* synthetic */ PR1$a$a m;

    public PR1$a$a$a(pr1_1 pr1_12, PR1$a$a pR1$a$a, f80_0 f80_02) {
        this.l = pr1_12;
        this.m = pR1$a$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pr1_1 pr1_12 = this.l;
        PR1$a$a pR1$a$a = this.m;
        PR1$a$a$a pR1$a$a$a = new PR1$a$a$a(pr1_12, pR1$a$a, f80_02);
        pR1$a$a$a.k = object;
        return pR1$a$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (PR1$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((PR1$a$a$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block7: {
            block5: {
                block6: {
                    var2_2 = this;
                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var4_4 = this.j;
                    var5_5 = 1;
                    var6_6 = 8;
                    if (var4_4 == 0) break block5;
                    if (var4_4 != var5_5) break block6;
                    var4_4 = this.h;
                    var7_7 = this.g;
                    var8_8 = this.i;
                    var10_9 = this.f;
                    var11_10 = this.e;
                    var12_11 = this.d;
                    var13_12 = this.c;
                    var14_13 = this.b;
                    var15_14 = (xz2_2)this.k;
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var3_3 /* !! */ ;
            }
            vl2_2.b(var1_1);
            var16_15 = (xz2_2)this.k;
            var17_16 = this.l;
            var18_17 = var17_16.a;
            var19_18 = var18_17.length + -2;
            if (var19_18 < 0) break block7;
            var20_19 = this.m;
            var11_10 = 0;
            while (true) {
                block8: {
                    var21_20 = var18_17[var11_10];
                    var23_21 = var21_20 ^ (long)-1;
                    var25_22 = 7;
                    var23_21 = var23_21 << var25_22 & var21_20;
                    var26_23 = -9187201950435737472L;
                    cfr_temp_0 = (var23_21 &= var26_23) - var26_23;
                    var28_24 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var28_24 /* !! */  != false) {
                        var29_25 = ~(var11_10 - var19_18) >>> 31;
                        var29_25 = 8 - var29_25;
                        var15_14 = var16_15;
                        var16_15 = null;
                        var13_12 = var17_16;
                        var12_11 = var18_17;
                        var7_7 = var29_25;
                        var14_13 = var20_19;
                        var10_9 = var11_10;
                        var11_10 = var19_18;
                        var8_8 = var21_20;
                        for (var4_4 = 0; var4_4 < var7_7; var4_4 += var5_5) {
                            var26_23 = 255L & var8_8;
                            var30_26 = 128L;
                            cfr_temp_1 = var26_23 - var30_26;
                            var32_27 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var32_27 /* !! */  < 0) {
                                var14_13.a = var25_22 = (var10_9 << 3) + var4_4;
                                var33_28 /* !! */  = var13_12.b[var25_22];
                                var2_2.k = var15_14;
                                var2_2.b = var14_13;
                                var2_2.c = var13_12;
                                var2_2.d = var12_11;
                                var2_2.e = var11_10;
                                var2_2.f = var10_9;
                                var2_2.i = var8_8;
                                var2_2.g = var7_7;
                                var2_2.h = var4_4;
                                var2_2.j = var5_5;
                                if ((var33_28 /* !! */  = var15_14.a(var2_2, var33_28 /* !! */ )) == var3_3 /* !! */ ) {
                                    return var3_3 /* !! */ ;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    }
                    break block8;
lbl-1000:
                    // 5 sources

                    {
                        var8_8 >>= var6_6;
                        continue;
                    }
                    if (var7_7 != var6_6) break;
                    var19_18 = var11_10;
                    var18_17 = var12_11;
                    var17_16 = var13_12;
                    var16_15 = var15_14;
                    var11_10 = var10_9;
                    var20_19 = var14_13;
                }
                if (var11_10 == var19_18) break;
                ++var11_10;
            }
        }
        return Unit.a;
    }
}

