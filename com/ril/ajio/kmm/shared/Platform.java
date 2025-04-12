/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.ril.ajio.kmm.shared;

import android.os.Build;

public final class Platform {
    public static final Platform INSTANCE;
    private static String adID;
    private static final String channel;
    private static final String clientType;
    private static String clientVersion;
    private static final String platform;
    private static final String userAgent;

    static {
        Object object = new Platform();
        INSTANCE = object;
        platform = hj0_0.a(Build.VERSION.SDK_INT, "Android ");
        userAgent = object = "Android";
        clientType = object;
        channel = object;
    }

    private Platform() {
    }

    public final String getAdID() {
        return adID;
    }

    public final String getChannel() {
        return channel;
    }

    public final String getClientType() {
        return clientType;
    }

    public final String getClientVersion() {
        return clientVersion;
    }

    public final String getPlatform() {
        return platform;
    }

    public final String getUserAgent() {
        return userAgent;
    }

    public final void setAdID(String string2) {
        adID = string2;
    }

    public final void setClientVersion(String string2) {
        clientVersion = string2;
    }
}

