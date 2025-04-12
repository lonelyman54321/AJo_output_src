/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$getAllCartEntity$$inlined$map$1$2$1;
import com.ril.ajio.data.database.entity.CartEntity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class CartDaoHelper$getAllCartEntity$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ HashMap $cartEntityMap$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CartDaoHelper$getAllCartEntity$$inlined$map$1$2(fs0_2 fs0_22, HashMap hashMap) {
        this.$this_unsafeFlow = fs0_22;
        this.$cartEntityMap$inlined = hashMap;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = null;
        var4_4 = 1;
        var5_5 = var2_2 instanceof CartDaoHelper$getAllCartEntity$$inlined$map$1$2$1;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (CartDaoHelper$getAllCartEntity$$inlined$map$1$2$1)var2_2;
        var7_7 = var6_6.label;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.label = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new CartDaoHelper$getAllCartEntity$$inlined$map$1$2$1(this, (f80_0)var2_2);
        }
        var2_2 = var6_6.result;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.label;
        if (var8_8 == 0) ** GOTO lbl23
        if (var8_8 == var4_4) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.$this_unsafeFlow;
            var1_1 = ((AppDataBase)var1_1).cartDao().loadCarts();
            if (var1_1 != null) {
                var11_11 = var1_1.iterator();
                while (true) {
                    var9_9 = (int)var11_11.hasNext();
                    var12_12 = "access$getTAG$p(...)";
                    if (var9_9 == 0) break;
                    var13_13 = (CartEntity)var11_11.next();
                    var14_14 = this.$cartEntityMap$inlined;
                    var15_15 = var13_13.getCode();
                    var14_14.put(var15_15, var13_13);
                    var14_14 = yn3_0.a;
                    var15_15 = CartDaoHelper.access$getTAG$p();
                    Intrinsics.checkNotNullExpressionValue(var15_15, var12_12);
                    var14_14.l((String)var15_15);
                    var12_12 = var13_13.getCode();
                    var16_16 = var13_13.getValue();
                    var13_13 = String.valueOf(var16_16);
                    var15_15 = new Object[var4_4];
                    var15_15[0] = var13_13;
                    var14_14.a(var12_12, var15_15);
                }
                var11_11 = yn3_0.a;
                var13_13 = CartDaoHelper.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(var13_13, var12_12);
                var11_11.l((String)var13_13);
                var17_17 = var1_1.size();
                var13_13 = new Integer(var17_17);
                var1_1 = new Object[var4_4];
                var1_1[0] = var13_13;
                var3_3 = "count = %s";
                var11_11.a(var3_3, var1_1);
            }
            var1_1 = this.$cartEntityMap$inlined;
            var6_6.label = var4_4;
            if ((var1_1 = var2_2.emit(var1_1, var6_6)) == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

