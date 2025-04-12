/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.SearchRvDao_Impl;
import com.ril.ajio.data.database.entity.SearchRv;

class SearchRvDao_Impl$1
extends BA0 {
    final /* synthetic */ SearchRvDao_Impl this$0;

    public SearchRvDao_Impl$1(SearchRvDao_Impl searchRvDao_Impl, FP2 fP2) {
        this.this$0 = searchRvDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, SearchRv object) {
        String string2 = ((SearchRv)object).getProductCode();
        int n3 = 1;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchRv)object).getProductCode();
            bg3_02.c0(n3, string2);
        }
        string2 = ((SearchRv)object).getPriceValue();
        n3 = 2;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchRv)object).getPriceValue();
            bg3_02.c0(n3, string2);
        }
        string2 = ((SearchRv)object).getSizeSelected();
        n3 = 3;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((SearchRv)object).getSizeSelected();
            bg3_02.c0(n3, string2);
        }
        long l2 = ((SearchRv)object).getEntryTime();
        bg3_02.m0(4, l2);
        int n4 = 5;
        l2 = ((SearchRv)object).getExitTime();
        bg3_02.m0(n4, l2);
        string2 = ((SearchRv)object).getStoreType();
        n3 = 6;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            object = ((SearchRv)object).getStoreType();
            bg3_02.c0(n3, (String)object);
        }
    }

    public String createQuery() {
        return "INSERT OR REPLACE INTO `SearchRv` (`productCode`,`priceValue`,`sizeSelected`,`entryTime`,`exitTime`,`storeType`) VALUES (?,?,?,?,?,?)";
    }
}

