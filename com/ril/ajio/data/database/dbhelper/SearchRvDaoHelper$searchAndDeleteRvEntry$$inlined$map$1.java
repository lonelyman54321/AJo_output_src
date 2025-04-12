/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2;
import kotlin.Unit;

public final class SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1
implements es0_2 {
    final /* synthetic */ String $productCode$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1(es0_2 es0_22, String string2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$productCode$inlined = string2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        String string2 = this.$productCode$inlined;
        SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2 searchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2 = new SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2((fs0_2)object, string2);
        if ((object = es0_22.collect(searchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

