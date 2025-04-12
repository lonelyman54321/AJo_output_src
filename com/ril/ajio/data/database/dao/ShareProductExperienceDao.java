/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import java.util.ArrayList;
import java.util.List;

public interface ShareProductExperienceDao {
    public List fetchAllSharedWithMeCloset();

    public g53_0 fetchIncomingClosetShareInOrder();

    public g53_0 fetchShareProducts(long var1);

    public SharedWithMe fetchSharedWithMe(ag3_0 var1);

    public List insertProductsShared(ArrayList var1);

    public long insertShareProductExperience(ShareProductExperience var1);

    public ShareProductExperience isShortLinkAvailable(String var1);

    public int restoreItem(long var1);

    public int updateSharedClosetProduct(List var1);
}

