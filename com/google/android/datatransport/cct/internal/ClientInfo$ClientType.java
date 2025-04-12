/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

public final class ClientInfo$ClientType
extends Enum {
    private static final /* synthetic */ ClientInfo$ClientType[] $VALUES;
    public static final /* enum */ ClientInfo$ClientType ANDROID_FIREBASE;
    public static final /* enum */ ClientInfo$ClientType UNKNOWN;
    private final int value;

    static {
        ClientInfo$ClientType clientInfo$ClientType;
        ClientInfo$ClientType clientInfo$ClientType2;
        UNKNOWN = clientInfo$ClientType2 = new ClientInfo$ClientType("UNKNOWN", 0, 0);
        int n3 = 1;
        ANDROID_FIREBASE = clientInfo$ClientType = new ClientInfo$ClientType("ANDROID_FIREBASE", n3, 23);
        ClientInfo$ClientType[] clientInfo$ClientTypeArray = new ClientInfo$ClientType[2];
        clientInfo$ClientTypeArray[0] = clientInfo$ClientType2;
        clientInfo$ClientTypeArray[n3] = clientInfo$ClientType;
        $VALUES = clientInfo$ClientTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ClientInfo$ClientType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ClientInfo$ClientType valueOf(String string2) {
        return Enum.valueOf(ClientInfo$ClientType.class, string2);
    }

    public static ClientInfo$ClientType[] values() {
        return (ClientInfo$ClientType[])$VALUES.clone();
    }
}

