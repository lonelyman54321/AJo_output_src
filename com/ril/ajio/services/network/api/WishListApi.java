/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.Map;

public interface WishListApi {
    public Object addToCloset(String var1, String var2, String var3, String var4, String var5, String var6, String var7, boolean var8, String var9, f80_0 var10);

    public g53_0 getProductSize(String var1, String var2, String var3, String var4, String var5, String var6);

    public g53_0 getProductSizeChart(String var1, String var2, String var3, Map var4);

    public g53_0 getWishList(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9);

    public Object getWishlistProducts(String var1, String var2, String var3, f80_0 var4);

    public Object removeFromCloset(String var1, String var2, String var3, String var4, String var5, f80_0 var6);
}

