/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.deeplink;

public final class DeepLinkResult$Error
extends Enum {
    public static final /* enum */ DeepLinkResult$Error DEVELOPER_ERROR;
    public static final /* enum */ DeepLinkResult$Error HTTP_STATUS_CODE;
    public static final /* enum */ DeepLinkResult$Error NETWORK;
    public static final /* enum */ DeepLinkResult$Error TIMEOUT;
    public static final /* enum */ DeepLinkResult$Error UNEXPECTED;
    private static final /* synthetic */ DeepLinkResult$Error[] getMonetizationNetwork;

    static {
        DeepLinkResult$Error deepLinkResult$Error;
        DeepLinkResult$Error deepLinkResult$Error2;
        DeepLinkResult$Error deepLinkResult$Error3;
        DeepLinkResult$Error deepLinkResult$Error4;
        DeepLinkResult$Error deepLinkResult$Error5;
        TIMEOUT = deepLinkResult$Error5 = new DeepLinkResult$Error("TIMEOUT", 0);
        int n3 = 1;
        NETWORK = deepLinkResult$Error4 = new DeepLinkResult$Error("NETWORK", n3);
        int n4 = 2;
        HTTP_STATUS_CODE = deepLinkResult$Error3 = new DeepLinkResult$Error("HTTP_STATUS_CODE", n4);
        int n7 = 3;
        UNEXPECTED = deepLinkResult$Error2 = new DeepLinkResult$Error("UNEXPECTED", n7);
        int n8 = 4;
        DEVELOPER_ERROR = deepLinkResult$Error = new DeepLinkResult$Error("DEVELOPER_ERROR", n8);
        DeepLinkResult$Error[] deepLinkResult$ErrorArray = new DeepLinkResult$Error[5];
        deepLinkResult$ErrorArray[0] = deepLinkResult$Error5;
        deepLinkResult$ErrorArray[n3] = deepLinkResult$Error4;
        deepLinkResult$ErrorArray[n4] = deepLinkResult$Error3;
        deepLinkResult$ErrorArray[n7] = deepLinkResult$Error2;
        deepLinkResult$ErrorArray[n8] = deepLinkResult$Error;
        getMonetizationNetwork = deepLinkResult$ErrorArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DeepLinkResult$Error() {
        void var2_-1;
        void var1_-1;
    }

    public static DeepLinkResult$Error valueOf(String string2) {
        return Enum.valueOf(DeepLinkResult$Error.class, string2);
    }

    public static DeepLinkResult$Error[] values() {
        return (DeepLinkResult$Error[])getMonetizationNetwork.clone();
    }
}

