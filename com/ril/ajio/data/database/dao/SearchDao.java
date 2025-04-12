/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.SearchEntry;
import java.util.List;

public interface SearchDao {
    public static final int SEARCH_HISTORY_LIMIT = 10;

    public int deleteAllEntries();

    public SearchEntry getLastEnteredRow();

    public long insertSearch(SearchEntry var1);

    public es0_2 loadAllSearchEntries(String var1);

    public List loadRowsExceptFirst(int var1);

    public List loadSearches();

    public void removeLastSearchEntry();

    public void removeOldEntries(String var1, int var2);

    public int removeSearchEntries(List var1);

    public int removeSearchEntries(List var1, String var2);

    public int updateSearchWIthImgUrl(String var1, String var2, String var3);
}

