/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import java.util.HashMap;
import java.util.Map;

public interface BannerAdsRepository {
    public Object callClickTracker(String var1, f80_0 var2);

    public Object callViewImpressionTracker(String var1, f80_0 var2);

    public Object getBannerAds(String var1, Map var2, String var3, f80_0 var4);

    public Object getBannerAds(String var1, Map var2, HashMap var3, f80_0 var4);

    public Object getBannersForDifferentPages(String var1, Map var2, String var3, f80_0 var4);

    public Object getThirdPartyAdBannersForDifferentPages(String var1, Map var2, HashMap var3, f80_0 var4);
}

