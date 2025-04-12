/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.HashMap;
import java.util.Map;

public interface SearchApi {
    public Object getProductListDetails(String var1, Map var2, String var3, String var4, f80_0 var5);

    public Object getRecentlyViewedProducts(String var1, Map var2, String var3, String var4, f80_0 var5);

    public Object getSearchProducts(String var1, Map var2, HashMap var3, f80_0 var4);

    public Object getSearchSuggestions(String var1, Map var2, String var3, f80_0 var4);

    public Object getStoreMetadata(String var1, String var2, String var3, f80_0 var4);
}

