/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

public class BuildIdInfo {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    public BuildIdInfo(String string2, String string3, String string4) {
        this.libraryName = string2;
        this.arch = string3;
        this.buildId = string4;
    }

    public String getArch() {
        return this.arch;
    }

    public String getBuildId() {
        return this.buildId;
    }

    public String getLibraryName() {
        return this.libraryName;
    }
}

