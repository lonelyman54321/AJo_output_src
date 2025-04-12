/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.network;

public final class NetworkConstants {
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_ADID = "ad_id";
    public static final String HEADER_CLIENT_TYPE = "client_type";
    public static final String HEADER_CLIENT_VERSION = "client_version";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final NetworkConstants INSTANCE;

    static {
        NetworkConstants networkConstants;
        INSTANCE = networkConstants = new NetworkConstants();
    }

    private NetworkConstants() {
    }
}

