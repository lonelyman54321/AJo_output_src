/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.Map;

public interface ShippingApi {
    public g53_0 checkoutCart(String var1, String var2, Map var3, String var4);

    public g53_0 getPEToken(String var1, String var2, String var3);

    public g53_0 getShippingEdd(String var1, String var2, String var3);

    public g53_0 placeOrder(String var1, String var2, Map var3, String var4);
}

