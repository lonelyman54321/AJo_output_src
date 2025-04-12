/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

public final class AnonymousToken {
    public static final AnonymousToken INSTANCE;
    private static String accessToken;

    static {
        AnonymousToken anonymousToken;
        INSTANCE = anonymousToken = new AnonymousToken();
    }

    private AnonymousToken() {
    }

    public static final String getAccessToken() {
        return accessToken;
    }

    public static final void setAccessToken(String string2) {
        accessToken = string2;
    }
}

