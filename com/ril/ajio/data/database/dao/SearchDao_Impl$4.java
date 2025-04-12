/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.SearchDao_Impl;

class SearchDao_Impl$4
extends n23 {
    final /* synthetic */ SearchDao_Impl this$0;

    public SearchDao_Impl$4(SearchDao_Impl searchDao_Impl, FP2 fP2) {
        this.this$0 = searchDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "DELETE FROM SearchEntry WHERE searchText NOT IN (  SELECT t1.searchText  FROM (    SELECT searchText    FROM SearchEntry    ORDER BY time DESC    LIMIT ?  ) t1) AND storeType = ? COLLATE NOCASE";
    }
}

