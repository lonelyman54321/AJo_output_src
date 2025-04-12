/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.google.gson.JsonObject;

public interface CategoryNavigationApi {
    public g53_0 getCMSCategoryNavigation(String var1, JsonObject var2, String var3, String var4, String var5);

    public g53_0 getCategoryNavigation(String var1, String var2, String var3, String var4);

    public g53_0 getLuxBrandCategory(String var1, String var2);

    public g53_0 getStoreInfo(String var1, String var2);
}

