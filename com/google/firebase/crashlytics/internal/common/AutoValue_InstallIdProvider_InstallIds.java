/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider$InstallIds;

final class AutoValue_InstallIdProvider_InstallIds
extends InstallIdProvider$InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;

    public AutoValue_InstallIdProvider_InstallIds(String object, String string2, String string3) {
        if (object != null) {
            this.crashlyticsInstallId = object;
            this.firebaseInstallationId = string2;
            this.firebaseAuthenticationToken = string3;
            return;
        }
        object = new NullPointerException("Null crashlyticsInstallId");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof InstallIdProvider$InstallIds;
        if (bl3) {
            boolean bl4;
            String string2 = this.crashlyticsInstallId;
            String string3 = ((InstallIdProvider$InstallIds)(object = (InstallIdProvider$InstallIds)object)).getCrashlyticsInstallId();
            bl3 = string2.equals(string3);
            if (!(bl3 && ((string2 = this.firebaseInstallationId) == null ? (string2 = ((InstallIdProvider$InstallIds)object).getFirebaseInstallationId()) == null : (bl3 = string2.equals(string3 = ((InstallIdProvider$InstallIds)object).getFirebaseInstallationId()))) && ((string2 = this.firebaseAuthenticationToken) == null ? (object = ((InstallIdProvider$InstallIds)object).getFirebaseAuthenticationToken()) == null : (bl4 = string2.equals(object = ((InstallIdProvider$InstallIds)object).getFirebaseAuthenticationToken()))))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    public String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.crashlyticsInstallId;
        int n4 = string2.hashCode();
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        String string3 = this.firebaseInstallationId;
        int n8 = 0;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        String string4 = this.firebaseAuthenticationToken;
        if (string4 != null) {
            n8 = string4.hashCode();
        }
        return n4 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InstallIds{crashlyticsInstallId=");
        String string2 = this.crashlyticsInstallId;
        stringBuilder.append(string2);
        stringBuilder.append(", firebaseInstallationId=");
        string2 = this.firebaseInstallationId;
        stringBuilder.append(string2);
        stringBuilder.append(", firebaseAuthenticationToken=");
        string2 = this.firebaseAuthenticationToken;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

