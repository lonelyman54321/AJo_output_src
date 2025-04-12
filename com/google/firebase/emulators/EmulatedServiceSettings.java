/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.emulators;

public final class EmulatedServiceSettings {
    private final String host;
    private final int port;

    public EmulatedServiceSettings(String string2, int n3) {
        this.host = string2;
        this.port = n3;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}

