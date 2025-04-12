/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.SearchRvDao_Impl;

class SearchRvDao_Impl$2
extends n23 {
    final /* synthetic */ SearchRvDao_Impl this$0;

    public SearchRvDao_Impl$2(SearchRvDao_Impl searchRvDao_Impl, FP2 fP2) {
        this.this$0 = searchRvDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "DELETE FROM SearchRv where productCode= ?";
    }
}

