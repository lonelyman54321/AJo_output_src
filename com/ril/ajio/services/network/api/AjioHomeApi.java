/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.Map;

public interface AjioHomeApi {
    public g53_0 getAjioCouponPromotions(String var1, String var2, String var3, String var4, String var5);

    public Object getBannerAds(String var1, Map var2, f80_0 var3);

    public g53_0 getCuratedWidgetOptions(String var1, String var2, String var3, String var4, String var5, Map var6);

    public g53_0 initiateBuyCouponRequest(String var1, String var2, String var3, String var4, String var5, Map var6);
}

