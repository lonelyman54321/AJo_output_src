/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1$2;
import com.ril.ajio.data.database.entity.SearchRv;
import kotlin.Unit;

public final class SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1
implements es0_2 {
    final /* synthetic */ SearchRv $searchRv$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1(es0_2 es0_22, SearchRv searchRv) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$searchRv$inlined = searchRv;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        SearchRv searchRv = this.$searchRv$inlined;
        SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1$2 searchRvDaoHelper$insertSearchRvEntry$$inlined$map$1$2 = new SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1$2((fs0_2)object, searchRv);
        if ((object = es0_22.collect(searchRvDaoHelper$insertSearchRvEntry$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

