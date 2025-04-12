/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class DF2
extends Lambda
implements Function1 {
    public final /* synthetic */ CF2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gr1_1 e;

    public DF2(CF2 cF2, int n3, gr1_1 gr1_12) {
        this.c = cF2;
        this.d = n3;
        this.e = gr1_12;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block10: {
            var2_2 = this;
            var3_3 = var1_1;
            var3_3 = (z30_0)var1_1;
            var4_4 = this.c;
            var5_5 = var4_4.e;
            var6_6 = this.d;
            if (var5_5 != var6_6 || (var5_5 = (int)Intrinsics.areEqual(var8_8 = this.e, var7_7 = var4_4.f)) == 0 || (var5_5 = var3_3 instanceof F30) == 0 || (var9_9 = ((Object)(var7_7 = (Object)var8_8.a)).length + -2) < 0) break block10;
            var10_10 = 0;
            while (true) {
                block13: {
                    block11: {
                        var11_11 = var7_7[var10_10];
                        var13_12 = var11_11 ^ (long)-1;
                        var15_13 = 7;
                        var13_12 = var13_12 << var15_13 & var11_11;
                        var16_14 = -9187201950435737472L;
                        cfr_temp_0 = (var13_12 &= var16_14) - var16_14;
                        var18_15 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (var18_15 == false) break block11;
                        var19_16 = ~(var10_10 - var9_9) >>> 31;
                        var19_16 = 8 - var19_16;
                        for (var15_13 = 0; var15_13 < var19_16; ++var15_13) {
                            block12: {
                                var20_17 = 255L & var11_11;
                                var22_18 = 128L;
                                cfr_temp_1 = var20_17 - var22_18;
                                var24_19 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var24_19 /* !! */  >= 0) break block12;
                                var25_20 = (var10_10 << 3) + var15_13;
                                var26_21 = var8_8.b[var25_20];
                                var27_22 = var8_8.c;
                                var28_23 = var27_22[var25_20];
                                if (var28_23 != var6_6) {
                                    var28_23 = 1;
                                } else {
                                    var28_23 = 0;
                                    var27_22 = null;
                                }
                                if (var28_23 == 0) ** GOTO lbl-1000
                                var29_24 = var3_3;
                                var29_24 = (F30)var3_3;
                                var2_2 = var29_24.g;
                                var2_2.b(var26_21, var4_4);
                                var30_25 = var26_21 instanceof np0_0;
                                if (var30_25 != 0) {
                                    var2_2 = var26_21;
                                    var2_2 = (np0_0)var26_21;
                                    var31_26 = var3_3;
                                    var3_3 = var29_24.g.a;
                                    var32_27 = var3_3.a(var2_2);
                                    if (!var32_27) {
                                        var3_3 = var29_24.j;
                                        var3_3.c(var2_2);
                                    }
                                    if ((var2_2 = var4_4.g) != null) {
                                        var2_2.g(var26_21);
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var31_26 = var3_3;
                                }
                                if (var28_23 != 0) {
                                    var8_8.g(var25_20);
                                }
lbl58:
                                // 4 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var31_26 = var3_3;
                            ** continue;
                            var30_25 = 8;
                            var11_11 >>= var30_25;
                            var2_2 = this;
                            var3_3 = var31_26;
                        }
                        var31_26 = var3_3;
                        var30_25 = 8;
                        if (var19_16 != var30_25) break;
                        break block13;
                    }
                    var31_26 = var3_3;
                }
                if (var10_10 == var9_9) break;
                ++var10_10;
                var2_2 = this;
                var3_3 = var31_26;
            }
        }
        return Unit.a;
    }
}

