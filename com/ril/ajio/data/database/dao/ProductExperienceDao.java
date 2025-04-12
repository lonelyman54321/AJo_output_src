/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.ProductExperience;
import java.util.List;

public interface ProductExperienceDao {
    public int bulkDeleteClosetData(ProductExperience ... var1);

    public void bulkDeleteClosetData(List var1);

    public long[] bulkInsertClosetData(List var1);

    public void deleteAllEntries();

    public int deleteRecentlyViewed(ProductExperience ... var1);

    public Integer doesClosetEntityExist(String var1);

    public Integer doesExist(String var1);

    public List fetchCloset();

    public List fetchClosetInOrder();

    public List fetchLRV(int var1);

    public List fetchRVRowsInOrder(int var1);

    public Integer getNumberOfClosetRows();

    public Integer getNumberOfRVRows();

    public long insertClosetData(ProductExperience var1);

    public long insertRecentlyViewed(ProductExperience var1);

    public void updateClosetData(float var1, long var2, String var4);

    public void updateRecentlyViewed(float var1, long var2, String var4, int var5);
}

