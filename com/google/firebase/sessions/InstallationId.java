/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InstallationId {
    public static final InstallationId$Companion Companion;
    private static final String TAG = "InstallationId";
    private final String authToken;
    private final String fid;

    static {
        InstallationId$Companion installationId$Companion;
        Companion = installationId$Companion = new InstallationId$Companion(null);
    }

    private InstallationId(String string2, String string3) {
        this.fid = string2;
        this.authToken = string3;
    }

    public /* synthetic */ InstallationId(String string2, String string3, DefaultConstructorMarker defaultConstructorMarker) {
        this(string2, string3);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }
}

