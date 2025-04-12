/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.HashMap;
import java.util.Map;

public interface BannerAdsServiceApi {
    public Object callBannerImpressionAPI(String var1, f80_0 var2);

    public Object callClickImpressionAPI(String var1, f80_0 var2);

    public Object getBannerAds(String var1, Map var2, String var3, f80_0 var4);

    public Object getBannerAds(String var1, Map var2, HashMap var3, f80_0 var4);

    public Object getBannersForPages(String var1, Map var2, String var3, f80_0 var4);

    public Object getThirdPartyAdBannersForPages(String var1, Map var2, HashMap var3, f80_0 var4);
}

