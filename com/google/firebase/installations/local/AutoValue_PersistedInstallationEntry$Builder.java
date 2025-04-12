/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.local;

import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$1;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallationEntry$Builder;

final class AutoValue_PersistedInstallationEntry$Builder
extends PersistedInstallationEntry$Builder {
    private String authToken;
    private Long expiresInSecs;
    private String firebaseInstallationId;
    private String fisError;
    private String refreshToken;
    private PersistedInstallation$RegistrationStatus registrationStatus;
    private Long tokenCreationEpochInSecs;

    public AutoValue_PersistedInstallationEntry$Builder() {
    }

    private AutoValue_PersistedInstallationEntry$Builder(PersistedInstallationEntry object) {
        Object object2;
        this.firebaseInstallationId = object2 = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
        object2 = ((PersistedInstallationEntry)object).getRegistrationStatus();
        this.registrationStatus = object2;
        this.authToken = object2 = ((PersistedInstallationEntry)object).getAuthToken();
        this.refreshToken = object2 = ((PersistedInstallationEntry)object).getRefreshToken();
        object2 = ((PersistedInstallationEntry)object).getExpiresInSecs();
        this.expiresInSecs = object2;
        object2 = ((PersistedInstallationEntry)object).getTokenCreationEpochInSecs();
        this.tokenCreationEpochInSecs = object2;
        this.fisError = object = ((PersistedInstallationEntry)object).getFisError();
    }

    public /* synthetic */ AutoValue_PersistedInstallationEntry$Builder(PersistedInstallationEntry persistedInstallationEntry, AutoValue_PersistedInstallationEntry$1 autoValue_PersistedInstallationEntry$1) {
        this(persistedInstallationEntry);
    }

    public PersistedInstallationEntry build() {
        boolean bl2;
        Object object = this.registrationStatus;
        object = object == null ? " registrationStatus" : "";
        Object object2 = this.expiresInSecs;
        if (object2 == null) {
            object2 = " expiresInSecs";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.tokenCreationEpochInSecs) == null) {
            object2 = " tokenCreationEpochInSecs";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            String string2 = this.firebaseInstallationId;
            PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = this.registrationStatus;
            String string3 = this.authToken;
            String string4 = this.refreshToken;
            long l2 = this.expiresInSecs;
            long l3 = this.tokenCreationEpochInSecs;
            String string5 = this.fisError;
            object = new AutoValue_PersistedInstallationEntry(string2, persistedInstallation$RegistrationStatus, string3, string4, l2, l3, string5, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public PersistedInstallationEntry$Builder setAuthToken(String string2) {
        this.authToken = string2;
        return this;
    }

    public PersistedInstallationEntry$Builder setExpiresInSecs(long l2) {
        Long l3;
        this.expiresInSecs = l3 = Long.valueOf(l2);
        return this;
    }

    public PersistedInstallationEntry$Builder setFirebaseInstallationId(String string2) {
        this.firebaseInstallationId = string2;
        return this;
    }

    public PersistedInstallationEntry$Builder setFisError(String string2) {
        this.fisError = string2;
        return this;
    }

    public PersistedInstallationEntry$Builder setRefreshToken(String string2) {
        this.refreshToken = string2;
        return this;
    }

    public PersistedInstallationEntry$Builder setRegistrationStatus(PersistedInstallation$RegistrationStatus object) {
        if (object != null) {
            this.registrationStatus = object;
            return this;
        }
        object = new NullPointerException("Null registrationStatus");
        throw object;
    }

    public PersistedInstallationEntry$Builder setTokenCreationEpochInSecs(long l2) {
        Long l3;
        this.tokenCreationEpochInSecs = l3 = Long.valueOf(l2);
        return this;
    }
}

