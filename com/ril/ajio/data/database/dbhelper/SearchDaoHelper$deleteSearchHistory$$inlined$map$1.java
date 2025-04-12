/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2;
import java.util.ArrayList;
import kotlin.Unit;

public final class SearchDaoHelper$deleteSearchHistory$$inlined$map$1
implements es0_2 {
    final /* synthetic */ ArrayList $searchList$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public SearchDaoHelper$deleteSearchHistory$$inlined$map$1(es0_2 es0_22, ArrayList arrayList) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$searchList$inlined = arrayList;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        ArrayList arrayList = this.$searchList$inlined;
        SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2 searchDaoHelper$deleteSearchHistory$$inlined$map$1$2 = new SearchDaoHelper$deleteSearchHistory$$inlined$map$1$2((fs0_2)object, arrayList);
        if ((object = es0_22.collect(searchDaoHelper$deleteSearchHistory$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

