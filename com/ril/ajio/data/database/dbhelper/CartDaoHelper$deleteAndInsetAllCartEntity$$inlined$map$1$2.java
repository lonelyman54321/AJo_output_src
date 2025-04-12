/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2$1;
import java.util.List;
import kotlin.Unit;

public final class CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ List $cartEntityList$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2(fs0_2 fs0_22, List list) {
        this.$this_unsafeFlow = fs0_22;
        this.$cartEntityList$inlined = list;
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
                            var3_3 = var2_2 instanceof CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2$1;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2$1)var2_2;
                            var5_5 = var4_4.label;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.label = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2$1(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.result;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.label;
                            var7_7 = 2;
                            var9_9 = 1;
                            if (var6_6 == 0) break block4;
                            if (var6_6 == var9_9) break block5;
                            if (var6_6 != var7_7) break block6;
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
                var10_10 = CartDaoHelper.INSTANCE;
                var11_11 = this.$cartEntityList$inlined;
                var4_4.L$0 = var2_2;
                var4_4.label = var9_9;
                var1_1 = CartDaoHelper.access$deleteAndInsert(var10_10, (AppDataBase)var1_1, var11_11, var4_4);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
                var1_1 = var2_2;
            }
            var2_2 = Unit.a;
            var6_6 = 0;
            var10_10 = null;
            var4_4.L$0 = null;
            var4_4.label = var7_7;
            var1_1 = var1_1.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

