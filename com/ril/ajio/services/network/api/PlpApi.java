/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.HashMap;
import java.util.Map;

public interface PlpApi {
    public g53_0 getCategoryNavigation(String var1, String var2, String var3, String var4);

    public Object getImageUploadUrl(String var1, String var2, String var3, f80_0 var4);

    public Object getMoreProductsFromImageSearch(String var1, Map var2, HashMap var3, f80_0 var4);

    public g53_0 getNewUserBanner(String var1, String var2);

    public g53_0 getProducts(String var1, Map var2, HashMap var3);

    public Object getProductsFromImageSearch(String var1, Map var2, HashMap var3, f80_0 var4);

    public g53_0 getStoreMetadata(String var1, String var2, String var3);

    public g53_0 sendRTBRequest(String var1, String var2);

    public Object uploadImage(String var1, pj2_2 var2, f80_0 var3);
}

