/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.Order.RTORequestData;

public interface RtoAPI {
    public Object getRtoData(String var1, String var2, f80_0 var3);

    public Object submitFeedback(String var1, String var2, RTORequestData var3, f80_0 var4);
}

