/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class O83$b
extends Lambda
implements Function2 {
    public final /* synthetic */ dr_2 c;

    public O83$b(le_2 le_22) {
        this.c = le_22;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block9: {
            block10: {
                var3_3 = var1_1;
                var3_3 = (Set)var1_1;
                var4_4 = var2_2;
                var4_4 = (v83_0)var2_2;
                var5_5 = var3_3 instanceof ht2_1;
                var6_6 = 4;
                if (var5_5) {
                    var4_4 = var3_3;
                    var4_4 = ((ht2_1)var3_3).a;
                    var7_7 = var4_4.b;
                    var4_4 = var4_4.a;
                    var8_9 = ((Object)var4_4).length + -2;
                    if (var8_9 >= 0) {
                        var9_11 = 0;
                        while (true) {
                            var10_12 = var4_4[var9_11];
                            var12_13 = var10_12 ^ (long)-1;
                            var14_14 = 7;
                            var12_13 = var12_13 << var14_14 & var10_12;
                            var15_15 = -9187201950435737472L;
                            cfr_temp_0 = (var12_13 &= var15_15) - var15_15;
                            var17_16 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var17_16 != false) {
                                var18_17 = ~(var9_11 - var8_9) >>> 31;
                                var19_18 = 8;
                                var18_17 = 8 - var18_17;
                                for (var14_14 = 0; var14_14 < var18_17; ++var14_14) {
                                    var20_19 = 255L & var10_12;
                                    var22_20 = 128L;
                                    cfr_temp_1 = var20_19 - var22_20;
                                    var24_21 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var24_21 /* !! */  < 0 && ((var17_16 = (Object)((var26_23 = var7_7[var25_22 = (var9_11 << 3) + var14_14]) instanceof qb3_0)) == false || (var25_22 = (int)(var26_23 = (qb3_0)var26_23).t(var6_6)) != 0)) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var10_12 >>= var19_18;
                                }
                                if (var18_17 != var19_18) break;
                            }
                            if (var9_11 == var8_9) break;
                            ++var9_11;
                        }
                    }
lbl41:
                    // 6 sources

                    while (true) {
                        var4_4 = this;
                        break block9;
                        break;
                    }
                }
                var4_4 = var3_3;
                var4_4 = (Iterable)var3_3;
                var27_24 = var4_4 instanceof Collection;
                if (!var27_24) break block10;
                var7_8 = var4_4;
                var7_8 = (Collection)var4_4;
                var27_24 = var7_8.isEmpty();
                if (var27_24) ** GOTO lbl41
            }
            var4_4 = ((Iterable)var4_4).iterator();
            do {
                if (var27_24 = var4_4.hasNext()) ** break;
                ** continue;
            } while ((var8_10 = (var7_8 = var4_4.next()) instanceof qb3_0) && !(var27_24 = (var7_8 = (qb3_0)var7_8).t(var6_6)));
            ** while (true)
            var4_4 = this;
            var28_25 = this.c;
            var28_25.j(var3_3);
        }
        return Unit.a;
    }
}

