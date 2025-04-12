/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.SearchDaoHelper$deleteSearchHistory$$inlined$map$1;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class SearchDaoHelper {
    public static final int $stable;
    public static final SearchDaoHelper INSTANCE;

    static {
        SearchDaoHelper searchDaoHelper;
        INSTANCE = searchDaoHelper = new SearchDaoHelper();
    }

    private SearchDaoHelper() {
    }

    public final es0_2 deleteSearchHistory(String object) {
        Intrinsics.checkNotNullParameter(object, "searchWord");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add((String)object);
        object = DatabaseCreator.INSTANCE.getDBInstance();
        SearchDaoHelper$deleteSearchHistory$$inlined$map$1 searchDaoHelper$deleteSearchHistory$$inlined$map$1 = new SearchDaoHelper$deleteSearchHistory$$inlined$map$1((es0_2)object, arrayList);
        object = ir0_2.a;
        return ms0_1.m(searchDaoHelper$deleteSearchHistory$$inlined$map$1, (CoroutineContext)object);
    }
}

