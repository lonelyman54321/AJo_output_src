/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public class AFVersionDeclaration {
    private static String googleSdkIdentifier;

    private AFVersionDeclaration() {
    }

    public static void init() {
        googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:6.15.2";
    }
}

