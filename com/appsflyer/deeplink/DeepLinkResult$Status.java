/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.deeplink;

public final class DeepLinkResult$Status
extends Enum {
    public static final /* enum */ DeepLinkResult$Status ERROR;
    public static final /* enum */ DeepLinkResult$Status FOUND;
    public static final /* enum */ DeepLinkResult$Status NOT_FOUND;
    private static final /* synthetic */ DeepLinkResult$Status[] getMonetizationNetwork;

    static {
        DeepLinkResult$Status deepLinkResult$Status;
        DeepLinkResult$Status deepLinkResult$Status2;
        DeepLinkResult$Status deepLinkResult$Status3;
        FOUND = deepLinkResult$Status3 = new DeepLinkResult$Status("FOUND", 0);
        int n3 = 1;
        NOT_FOUND = deepLinkResult$Status2 = new DeepLinkResult$Status("NOT_FOUND", n3);
        int n4 = 2;
        ERROR = deepLinkResult$Status = new DeepLinkResult$Status("ERROR", n4);
        DeepLinkResult$Status[] deepLinkResult$StatusArray = new DeepLinkResult$Status[3];
        deepLinkResult$StatusArray[0] = deepLinkResult$Status3;
        deepLinkResult$StatusArray[n3] = deepLinkResult$Status2;
        deepLinkResult$StatusArray[n4] = deepLinkResult$Status;
        getMonetizationNetwork = deepLinkResult$StatusArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DeepLinkResult$Status() {
        void var2_-1;
        void var1_-1;
    }

    public static DeepLinkResult$Status valueOf(String string2) {
        return Enum.valueOf(DeepLinkResult$Status.class, string2);
    }

    public static DeepLinkResult$Status[] values() {
        return (DeepLinkResult$Status[])getMonetizationNetwork.clone();
    }
}

