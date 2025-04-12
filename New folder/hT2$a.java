/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class hT2$a
extends rl2_2
implements Function2 {
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ht2_1 k;

    public hT2$a(ht2_1 ht2_12, f80_0 f80_02) {
        this.k = ht2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ht2_1 ht2_12 = this.k;
        hT2$a hT2$a = new hT2$a(ht2_12, f80_02);
        hT2$a.j = object;
        return hT2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (hT2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hT2$a)object).invokeSuspend(object2);
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
                    var4_4 = this.i;
                    var5_5 = 1;
                    var6_6 = 8;
                    if (var4_4 == 0) break block5;
                    if (var4_4 != var5_5) break block6;
                    var4_4 = this.g;
                    var7_7 = this.f;
                    var8_8 /* !! */  = this.h;
                    var10_9 = this.e;
                    var11_10 = this.d;
                    var12_11 /* !! */  = this.c;
                    var13_12 = this.b;
                    var14_13 = (xz2_2)this.j;
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
                var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var3_3 /* !! */ ;
            }
            vl2_2.b(var1_1);
            var15_14 = (xz2_2)this.j;
            var16_15 = this.k.a;
            var17_16 = var16_15.b;
            var16_15 = var16_15.a;
            var18_17 = ((Object)var16_15).length + -2;
            if (var18_17 < 0) break block7;
            var10_9 = 0;
            while (true) {
                block8: {
                    var19_18 = var16_15[var10_9];
                    var21_19 = var19_18 ^ (long)-1;
                    var23_20 = 7;
                    var21_19 = var21_19 << var23_20 & var19_18;
                    var24_21 = -9187201950435737472L;
                    cfr_temp_0 = (var21_19 &= var24_21) - var24_21;
                    var26_22 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (var26_22 != false) {
                        var27_23 = ~(var10_9 - var18_17) >>> 31;
                        var27_23 = 8 - var27_23;
                        var14_13 = var15_14;
                        var15_14 = null;
                        var12_11 /* !! */  = (long[])var16_15;
                        var11_10 = var18_17;
                        var7_7 = var27_23;
                        var13_12 = var17_16;
                        var8_8 /* !! */  = (long)var19_18;
                        for (var4_4 = 0; var4_4 < var7_7; var4_4 += var5_5) {
                            var24_21 = 255L & var8_8 /* !! */ ;
                            var28_24 = 128L;
                            cfr_temp_1 = var24_21 - var28_24;
                            var30_25 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var30_25 /* !! */  < 0) {
                                var23_20 = (var10_9 << 3) + var4_4;
                                var31_26 /* !! */  = var13_12[var23_20];
                                var2_2.j = var14_13;
                                var2_2.b = var13_12;
                                var2_2.c = var12_11 /* !! */ ;
                                var2_2.d = var11_10;
                                var2_2.e = var10_9;
                                var2_2.h = var8_8 /* !! */ ;
                                var2_2.f = var7_7;
                                var2_2.g = var4_4;
                                var2_2.i = var5_5;
                                if ((var31_26 /* !! */  = var14_13.a(var2_2, var31_26 /* !! */ )) == var3_3 /* !! */ ) {
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
                        var8_8 /* !! */  >>= var6_6;
                        continue;
                    }
                    if (var7_7 != var6_6) break;
                    var18_17 = var11_10;
                    var16_15 = var12_11 /* !! */ ;
                    var17_16 = var13_12;
                    var15_14 = var14_13;
                }
                if (var10_9 == var18_17) break;
                ++var10_9;
            }
        }
        return Unit.a;
    }
}

