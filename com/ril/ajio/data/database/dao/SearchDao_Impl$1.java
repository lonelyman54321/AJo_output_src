/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.SearchDao_Impl;
import com.ril.ajio.data.database.entity.SearchEntry;

class SearchDao_Impl$1
extends BA0 {
    final /* synthetic */ SearchDao_Impl this$0;

    public SearchDao_Impl$1(SearchDao_Impl searchDao_Impl, FP2 fP2) {
        this.this$0 = searchDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, SearchEntry object) {
        String string2 = ((SearchEntry)object).getSearchText();
        int n3 = 1;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchEntry)object).getSearchText();
            bg3_02.c0(n3, string2);
        }
        string2 = ((SearchEntry)object).getCode();
        n3 = 2;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchEntry)object).getCode();
            bg3_02.c0(n3, string2);
        }
        string2 = ((SearchEntry)object).getQuery();
        n3 = 3;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchEntry)object).getQuery();
            bg3_02.c0(n3, string2);
        }
        long l2 = (long)((SearchEntry)object).isAutoSuggested();
        bg3_02.m0(4, l2);
        int n4 = 5;
        long l3 = ((SearchEntry)object).getTime();
        bg3_02.m0(n4, l3);
        string2 = ((SearchEntry)object).getStoreType();
        n3 = 6;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchEntry)object).getStoreType();
            bg3_02.c0(n3, string2);
        }
        string2 = ((SearchEntry)object).getImgUrl();
        n3 = 7;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            object = ((SearchEntry)object).getImgUrl();
            bg3_02.c0(n3, (String)object);
        }
    }

    public String createQuery() {
        return "INSERT OR REPLACE INTO `SearchEntry` (`searchText`,`code`,`query`,`isAutoSuggested`,`time`,`storeType`,`imgUrl`) VALUES (?,?,?,?,?,?,?)";
    }
}

