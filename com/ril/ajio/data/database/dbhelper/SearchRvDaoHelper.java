/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$deleteSearchRvEntry$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$deleteUnUsedSearchRvEntry$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$getSearchRvEntry$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$loadSearchRvEntries$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper$updatePrice$$inlined$map$1;
import com.ril.ajio.data.database.entity.SearchRv;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class SearchRvDaoHelper {
    public static final int $stable;
    public static final SearchRvDaoHelper INSTANCE;

    static {
        SearchRvDaoHelper searchRvDaoHelper;
        INSTANCE = searchRvDaoHelper = new SearchRvDaoHelper();
    }

    private SearchRvDaoHelper() {
    }

    public final es0_2 deleteSearchRvEntry(String object) {
        Intrinsics.checkNotNullParameter(object, "prodCode");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$deleteSearchRvEntry$$inlined$map$1 searchRvDaoHelper$deleteSearchRvEntry$$inlined$map$1 = new SearchRvDaoHelper$deleteSearchRvEntry$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$deleteSearchRvEntry$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 deleteUnUsedSearchRvEntry() {
        Object object = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$deleteUnUsedSearchRvEntry$$inlined$map$1 searchRvDaoHelper$deleteUnUsedSearchRvEntry$$inlined$map$1 = new SearchRvDaoHelper$deleteUnUsedSearchRvEntry$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$deleteUnUsedSearchRvEntry$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getSearchRvEntry(String object) {
        Intrinsics.checkNotNullParameter(object, "prodCode");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$getSearchRvEntry$$inlined$map$1 searchRvDaoHelper$getSearchRvEntry$$inlined$map$1 = new SearchRvDaoHelper$getSearchRvEntry$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$getSearchRvEntry$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 insertSearchRvEntry(SearchRv object) {
        Intrinsics.checkNotNullParameter(object, "searchRv");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1 searchRvDaoHelper$insertSearchRvEntry$$inlined$map$1 = new SearchRvDaoHelper$insertSearchRvEntry$$inlined$map$1(es0_22, (SearchRv)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$insertSearchRvEntry$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 loadSearchRvEntries() {
        Object object = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$loadSearchRvEntries$$inlined$map$1 searchRvDaoHelper$loadSearchRvEntries$$inlined$map$1 = new SearchRvDaoHelper$loadSearchRvEntries$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$loadSearchRvEntries$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 searchAndDeleteRvEntry(String object) {
        Intrinsics.checkNotNullParameter(object, "productCode");
        es0_2 es0_22 = this.getSearchRvEntry((String)object);
        SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1 searchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1 = new SearchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$searchAndDeleteRvEntry$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 updatePrice(String object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "prodCode");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        SearchRvDaoHelper$updatePrice$$inlined$map$1 searchRvDaoHelper$updatePrice$$inlined$map$1 = new SearchRvDaoHelper$updatePrice$$inlined$map$1(es0_22, (String)object, string2);
        object = ir0_2.a;
        return ms0_1.m(searchRvDaoHelper$updatePrice$$inlined$map$1, (CoroutineContext)object);
    }
}

