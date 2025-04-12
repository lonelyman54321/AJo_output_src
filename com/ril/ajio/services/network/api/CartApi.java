/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.google.gson.JsonObject;
import com.ril.ajio.services.data.Cart.BulkMoveToWishlist;
import java.util.HashMap;
import java.util.Map;

public interface CartApi {
    public Object addToCart(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, f80_0 var10);

    public Object addToCartWithCommercialType(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, f80_0 var9);

    public Object addToCartWithImsBatchId(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, f80_0 var9);

    public Object addToCartWithOutImsBatchIdCommercialType(String var1, String var2, String var3, String var4, String var5, String var6, String var7, f80_0 var8);

    public g53_0 addToCloset(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, boolean var9);

    public Object addToCloset2(String var1, String var2, String var3, String var4, String var5, String var6, boolean var7, f80_0 var8);

    public Object calculatePrice(String var1, String var2, JsonObject var3, String var4, f80_0 var5);

    public Object checkCartInventory(String var1, String var2, String var3, f80_0 var4);

    public g53_0 deleteProductFromCart(String var1, String var2, String var3, String var4, String var5);

    public Object deleteProductFromCart2(String var1, String var2, String var3, f80_0 var4);

    public Object getAddresses(String var1, String var2, String var3, f80_0 var4);

    public Object getAssuredGift(String var1, String var2, String var3, f80_0 var4);

    public Object getCartBulkDelete(String var1, String var2, String var3, String var4, f80_0 var5);

    public Object getCartBulkMoveWishlist(String var1, JsonObject var2, String var3, String var4, f80_0 var5);

    public Object getCartBulkMoveWishlistV2(String var1, BulkMoveToWishlist var2, String var3, String var4, String var5, f80_0 var6);

    public Object getCartData(String var1, String var2, String var3, String var4, f80_0 var5);

    public Object getCartIdDetails(String var1, String var2, String var3, f80_0 var4);

    public g53_0 getCartWishListCount(String var1, Map var2, String var3, String var4);

    public Object getMergeCartData(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, f80_0 var9);

    public Object getPriorityDelivery(String var1, JsonObject var2, String var3, String var4, f80_0 var5);

    public Object getProductSize(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object getQuickView(String var1, String var2, String var3, f80_0 var4);

    public Object getSimilarProductsCart(String var1, HashMap var2, HashMap var3, String var4, String var5, f80_0 var6);

    public Object getUpdateAddressToCartURL(String var1, HashMap var2, String var3, String var4, f80_0 var5);

    public Object handlePanCardVerification(String var1, Map var2, String var3, String var4, String var5, f80_0 var6);

    public g53_0 sendRTBRequest(String var1, String var2);

    public Object updateItemCountForProduct(String var1, String var2, String var3, String var4, String var5, String var6, f80_0 var7);
}

