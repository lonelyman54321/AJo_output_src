/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.Order.NudgeInformation;
import com.ril.ajio.services.data.Order.orderhistory.CancelReturnRequest;
import java.util.Map;

public interface OrderDetailApi {
    public Object cancelOrder(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object cancelOrderNew(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object downloadInvoice(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object getCancelReasons(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object getNewOrderDetail(String var1, String var2, String var3, String var4, String var5, boolean var6, Boolean var7, boolean var8, f80_0 var9);

    public Object getOrderDetail(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object getReturnOrderItemDetails(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object highReturn(String var1, String var2, String var3, String var4, String var5, NudgeInformation var6, f80_0 var7);

    public Object initiateRequestReturnUpdate(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public Object invoiceCheck(String var1, String var2, String var3, String var4, String var5, f80_0 var6);

    public Object returnCancelRequest(String var1, String var2, String var3, CancelReturnRequest var4, f80_0 var5);

    public Object submitFeedback(String var1, String var2, String var3, String var4, String var5, Map var6, f80_0 var7);

    public g53_0 uploadReturnImage(String var1, String var2, String var3, String var4, String var5, cr1$c_0 var6);

    public Object uploadReturnImageWithProgress(String var1, String var2, String var3, String var4, String var5, cr1$c_0 var6, f80_0 var7);
}

