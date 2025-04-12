/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds;
import com.google.firebase.crashlytics.internal.common.FirebaseInstallationId;

public abstract class InstallIdProvider$InstallIds {
    public static InstallIdProvider$InstallIds create(String string2, FirebaseInstallationId object) {
        String string3 = ((FirebaseInstallationId)object).getFid();
        object = ((FirebaseInstallationId)object).getAuthToken();
        AutoValue_InstallIdProvider_InstallIds autoValue_InstallIdProvider_InstallIds = new AutoValue_InstallIdProvider_InstallIds(string2, string3, (String)object);
        return autoValue_InstallIdProvider_InstallIds;
    }

    public static InstallIdProvider$InstallIds createWithoutFid(String string2) {
        AutoValue_InstallIdProvider_InstallIds autoValue_InstallIdProvider_InstallIds = new AutoValue_InstallIdProvider_InstallIds(string2, null, null);
        return autoValue_InstallIdProvider_InstallIds;
    }

    public abstract String getCrashlyticsInstallId();

    public abstract String getFirebaseAuthenticationToken();

    public abstract String getFirebaseInstallationId();
}

