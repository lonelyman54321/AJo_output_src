/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.network;

public final class NetworkTask$PostResult
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ NetworkTask$PostResult[] $VALUES;
    public static final /* enum */ NetworkTask$PostResult DONE;
    public static final /* enum */ NetworkTask$PostResult REDIRECT;
    public static final /* enum */ NetworkTask$PostResult RETRY_LATER;

    static {
        NetworkTask$PostResult networkTask$PostResult;
        NetworkTask$PostResult networkTask$PostResult2;
        NetworkTask$PostResult networkTask$PostResult3;
        DONE = networkTask$PostResult3 = new NetworkTask$PostResult("DONE", 0);
        int n3 = 1;
        RETRY_LATER = networkTask$PostResult2 = new NetworkTask$PostResult("RETRY_LATER", n3);
        int n4 = 2;
        REDIRECT = networkTask$PostResult = new NetworkTask$PostResult("REDIRECT", n4);
        Enum[] enumArray = new NetworkTask$PostResult[3];
        enumArray[0] = networkTask$PostResult3;
        enumArray[n3] = networkTask$PostResult2;
        enumArray[n4] = networkTask$PostResult;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public NetworkTask$PostResult() {
        void var2_-1;
        void var1_-1;
    }

    public static NetworkTask$PostResult valueOf(String string2) {
        return Enum.valueOf(NetworkTask$PostResult.class, string2);
    }

    public static NetworkTask$PostResult[] values() {
        return (NetworkTask$PostResult[])$VALUES.clone();
    }
}

