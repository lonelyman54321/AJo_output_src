/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.ajiocash.BankTransferRequestBody;

public interface AjioCashApi {
    public Object getACData(String var1, String var2, String var3, f80_0 var4);

    public Object getAjioCashT(String var1, String var2, String var3, f80_0 var4);

    public g53_0 getAjioCashTransferStatus(String var1, String var2, String var3, BankTransferRequestBody var4);

    public g53_0 getAjioWallet(String var1, String var2, String var3);

    public Object getEarnPoint(String var1, String var2, String var3, boolean var4, f80_0 var5);

    public g53_0 getWalletDetails(String var1, String var2, String var3);
}

