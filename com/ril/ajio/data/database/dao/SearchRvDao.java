/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.SearchRv;
import java.util.List;

public interface SearchRvDao {
    public int deleteAllSearchRvEntries();

    public int deleteRows();

    public int deleteSearchRvEntry(String var1);

    public int getSearchRvEntry(String var1);

    public long insertSearchRv(SearchRv var1);

    public List loadAllSearchRvEntries();

    public int updatePrice(String var1, String var2);
}

