/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2$1;
import kotlin.Unit;

public final class RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ zr1_1 $mutableRVStoreData$inlined;
    final /* synthetic */ zr1_1 $mutableRecentlyViewed$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2(fs0_2 fs0_22, zr1_1 zr1_12, zr1_1 zr1_13) {
        this.$this_unsafeFlow = fs0_22;
        this.$mutableRecentlyViewed$inlined = zr1_12;
        this.$mutableRVStoreData$inlined = zr1_13;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var3_3 = var2_2 instanceof RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2$1;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2$1)var2_2;
                            var5_5 = var4_4.label;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.label = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2$1(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.result;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var4_4.label;
                            var9_9 = 2;
                            var6_6 = 1;
                            if (var5_5 == 0) break block4;
                            if (var5_5 == var6_6) break block5;
                            if (var5_5 != var9_9) break block6;
                            vl2_2.b(var2_2);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = (fs0_2)var4_4.L$0;
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var2_2 = this.$this_unsafeFlow;
                var1_1 = (AppDataBase)var1_1;
                var10_10 = RecentlyViewedDaoHelper.INSTANCE;
                var11_11 = this.$mutableRecentlyViewed$inlined;
                var12_12 = this.$mutableRVStoreData$inlined;
                var4_4.L$0 = var2_2;
                var4_4.label = var6_6;
                var7_7 = 0;
                var1_1 = RecentlyViewedDaoHelper.access$processRecentlyViewed(var10_10, (AppDataBase)var1_1, null, var11_11, null, null, var12_12, var4_4);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
                var1_1 = var2_2;
            }
            var2_2 = Boolean.TRUE;
            var5_5 = 0;
            var10_10 = null;
            var4_4.L$0 = null;
            var4_4.label = var9_9;
            var1_1 = var1_1.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

