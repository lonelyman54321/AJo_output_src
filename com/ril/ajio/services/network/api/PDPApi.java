/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public interface PDPApi {
    public g53_0 getBankOffers(String var1, String var2, String var3, String var4);

    public Object getCrossCellWidget(String var1, String var2, String var3, HashMap var4, String var5, f80_0 var6);

    public g53_0 getCuratedWidgetOptionsV2(String var1, String var2, String var3, String var4, String var5, Map var6);

    public Object getPdpFraudEngine(String var1, JsonObject var2, String var3, String var4, String var5, f80_0 var6);

    public Object getProductDetails(String var1, String var2, HashMap var3, f80_0 var4);

    public g53_0 getProductEdd(String var1, String var2, String var3, String var4);

    public Object getProductEddNew(String var1, String var2, String var3, String var4, f80_0 var5);

    public g53_0 getProductRecommendations(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12, String var13, String var14, String var15, String var16, String var17);

    public Object getSimilarProducts(String var1, String var2, String var3, String var4, HashMap var5, String var6, f80_0 var7);

    public g53_0 getUepView(String var1, String var2, String var3, String var4);

    public g53_0 getWishListCount(String var1, String var2, String var3, String var4, String var5, String var6);

    public g53_0 postUepView(String var1, JsonObject var2, String var3, String var4, String var5);
}

