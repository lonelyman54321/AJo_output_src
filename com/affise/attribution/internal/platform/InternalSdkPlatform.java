/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal.platform;

public final class InternalSdkPlatform {
    public static final String ANDROID = "android";
    private static final String FLUTTER = "flutter";
    public static final InternalSdkPlatform INSTANCE;
    private static final String REACT = "react";
    private static final String UNITY = "unity";
    private static String data;

    static {
        InternalSdkPlatform internalSdkPlatform;
        INSTANCE = internalSdkPlatform = new InternalSdkPlatform();
        data = ANDROID;
    }

    private InternalSdkPlatform() {
    }

    public final void flutter() {
        data = "flutter android";
    }

    public final String getInfo$attribution_release() {
        return data;
    }

    public final void react() {
        data = "react android";
    }

    public final void unity() {
        data = "unity android";
    }
}

