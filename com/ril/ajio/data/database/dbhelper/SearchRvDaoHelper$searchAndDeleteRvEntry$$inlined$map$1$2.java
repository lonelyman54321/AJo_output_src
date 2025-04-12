/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2$1;
import kotlin.Unit;

public final class SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $productCode$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2(fs0_2 fs0_22, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.$productCode$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2$1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.result;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.label;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.$this_unsafeFlow;
            var1_1 = (Number)var1_1;
            var9_9 = var1_1.intValue();
            if (var9_9 > 0) {
                var1_1 = SearchRvDaoHelper.INSTANCE;
                var10_10 = this.$productCode$inlined;
                var1_1.deleteSearchRvEntry(var10_10);
            }
            var1_1 = Boolean.TRUE;
            var4_4.label = var7_7;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

