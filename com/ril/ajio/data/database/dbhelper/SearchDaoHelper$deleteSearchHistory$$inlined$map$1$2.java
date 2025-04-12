/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2$1;
import java.util.ArrayList;
import kotlin.Unit;

public final class SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ ArrayList $searchList$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2(fs0_2 fs0_22, ArrayList arrayList) {
        this.$this_unsafeFlow = fs0_22;
        this.$searchList$inlined = arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var1_1 = ((AppDataBase)var1_1).searchDao();
            var9_9 /* !! */  = this.$searchList$inlined;
            var10_10 = od3_2.a();
            var11_11 = var1_1.removeSearchEntries(var9_9 /* !! */ , var10_10);
            var9_9 /* !! */  = new Integer(var11_11);
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var9_9 /* !! */ , var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

