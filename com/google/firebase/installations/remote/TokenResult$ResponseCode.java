/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.remote;

public final class TokenResult$ResponseCode
extends Enum {
    private static final /* synthetic */ TokenResult$ResponseCode[] $VALUES;
    public static final /* enum */ TokenResult$ResponseCode AUTH_ERROR;
    public static final /* enum */ TokenResult$ResponseCode BAD_CONFIG;
    public static final /* enum */ TokenResult$ResponseCode OK;

    private static /* synthetic */ TokenResult$ResponseCode[] $values() {
        TokenResult$ResponseCode tokenResult$ResponseCode = OK;
        tokenResult$ResponseCode = BAD_CONFIG;
        tokenResult$ResponseCode = AUTH_ERROR;
        TokenResult$ResponseCode[] tokenResult$ResponseCodeArray = new TokenResult$ResponseCode[]{tokenResult$ResponseCode, tokenResult$ResponseCode, tokenResult$ResponseCode};
        return tokenResult$ResponseCodeArray;
    }

    static {
        TokenResult$ResponseCode tokenResult$ResponseCode;
        OK = tokenResult$ResponseCode = new TokenResult$ResponseCode("OK", 0);
        BAD_CONFIG = tokenResult$ResponseCode = new TokenResult$ResponseCode("BAD_CONFIG", 1);
        AUTH_ERROR = tokenResult$ResponseCode = new TokenResult$ResponseCode("AUTH_ERROR", 2);
        $VALUES = TokenResult$ResponseCode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TokenResult$ResponseCode() {
        void var2_-1;
        void var1_-1;
    }

    public static TokenResult$ResponseCode valueOf(String string2) {
        return Enum.valueOf(TokenResult$ResponseCode.class, string2);
    }

    public static TokenResult$ResponseCode[] values() {
        return (TokenResult$ResponseCode[])$VALUES.clone();
    }
}

