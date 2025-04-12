/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.google.gson.JsonObject;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiRequestBody;
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import java.util.Map;

public interface FleekApi {
    public Object getAllBrandsPageData(String var1, String var2, String var3, String var4, int var5, int var6, String var7, Map var8, f80_0 var9);

    public Object getBrandPageData(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getExploreBrandsPageData(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getFeed(String var1, String var2, String var3, String var4, String var5, Map var6, int var7, int var8, f80_0 var9);

    public Object getFleekBottomNavigation(String var1, JsonObject var2, String var3, f80_0 var4);

    public Object getPostDetails(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object getRecentPostData(String var1, String var2, String var3, String var4, int var5, int var6, String var7, Map var8, f80_0 var9);

    public Object getStoreMetadata(String var1, String var2, String var3, f80_0 var4);

    public Object getStories(String var1, String var2, String var3, String var4, String var5, Map var6, int var7, int var8, f80_0 var9);

    public Object postSeenStatusContent(String var1, String var2, String var3, String var4, String var5, SeenApiRequestBody var6, f80_0 var7);

    public Object postSesActionStatus(String var1, String var2, String var3, String var4, String var5, SesActionApiRequestBody var6, f80_0 var7);

    public Object shareContentAction(String var1, String var2, String var3, String var4, String var5, ShareActionRequestBody var6, f80_0 var7);
}

