/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch
extends CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String string2, String string3, String string4) {
        this.arch = string2;
        this.libraryName = string3;
        this.buildId = string4;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String string2, String string3, String string4, AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$1 autoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$1) {
        this(string2, string3, string4);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;
        if (bl3) {
            boolean bl4;
            String string2 = this.arch;
            String string3 = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)(object = (CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object)).getArch();
            bl3 = string2.equals(string3);
            if (!(bl3 && (bl3 = (string2 = this.libraryName).equals(string3 = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object).getLibraryName())) && (bl4 = (string2 = this.buildId).equals(object = ((CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch)object).getBuildId())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
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

    public int hashCode() {
        int n3 = this.arch.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.libraryName.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.buildId.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BuildIdMappingForArch{arch=");
        String string2 = this.arch;
        stringBuilder.append(string2);
        stringBuilder.append(", libraryName=");
        string2 = this.libraryName;
        stringBuilder.append(string2);
        stringBuilder.append(", buildId=");
        string2 = this.buildId;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

