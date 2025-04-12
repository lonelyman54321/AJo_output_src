/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.google.gson.JsonObject;
import com.ril.ajio.services.query.FetchWalletsRequest;
import java.util.Map;

public interface PaymentApi {
    public g53_0 abortTransaction(String var1, Map var2, String var3);

    public Object calculatePrice(String var1, JsonObject var2, String var3, f80_0 var4);

    public g53_0 deleteSavedInstrument(String var1, String var2, JsonObject var3);

    public Object fetchEmiPlans(String var1, JsonObject var2, String var3, String var4, f80_0 var5);

    public Object fetchInternalWallets(String var1, FetchWalletsRequest var2, String var3, f80_0 var4);

    public g53_0 generateCaptcha(String var1, JsonObject var2, String var3);

    public g53_0 getBinInfo(String var1, JsonObject var2, String var3);

    public g53_0 getBulkStoredCardLpBalance(String var1, JsonObject var2, String var3);

    public g53_0 getLPOtp(String var1, JsonObject var2, String var3);

    public g53_0 getLpBalance(String var1, JsonObject var2, String var3);

    public Object getPaymentInstruments(String var1, String var2, JsonObject var3, f80_0 var4);

    public g53_0 getSavedCard(String var1, String var2, JsonObject var3);

    public g53_0 payNow(String var1, String var2, Map var3);

    public g53_0 payNowJson(String var1, String var2, JsonObject var3);

    public g53_0 resendLpOtp(String var1, JsonObject var2, String var3);

    public Object sendOTP(String var1, JsonObject var2, f80_0 var3);

    public g53_0 transactionGetStatusRequest(String var1, JsonObject var2, String var3);

    public g53_0 transactionStatusRequest(String var1, JsonObject var2, String var3);

    public g53_0 urlRedirect(String var1, Map var2, String var3);

    public g53_0 validateCaptcha(String var1, JsonObject var2, String var3);

    public Object validateOTP(String var1, JsonObject var2, f80_0 var3);

    public g53_0 verifyVpa(String var1, JsonObject var2, String var3);
}

