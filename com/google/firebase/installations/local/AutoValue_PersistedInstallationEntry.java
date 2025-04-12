/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.local;

import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$1;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry$Builder;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallationEntry$Builder;

final class AutoValue_PersistedInstallationEntry
extends PersistedInstallationEntry {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation$RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(String string2, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String string3, String string4, long l2, long l3, String string5) {
        this.firebaseInstallationId = string2;
        this.registrationStatus = persistedInstallation$RegistrationStatus;
        this.authToken = string3;
        this.refreshToken = string4;
        this.expiresInSecs = l2;
        this.tokenCreationEpochInSecs = l3;
        this.fisError = string5;
    }

    public /* synthetic */ AutoValue_PersistedInstallationEntry(String string2, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String string3, String string4, long l2, long l3, String string5, AutoValue_PersistedInstallationEntry$1 autoValue_PersistedInstallationEntry$1) {
        this(string2, persistedInstallation$RegistrationStatus, string3, string4, l2, l3, string5);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    long l2;
                    Object object2;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl4 = object instanceof PersistedInstallationEntry;
                    if (!bl4) break block4;
                    object = (PersistedInstallationEntry)object;
                    Object object3 = this.firebaseInstallationId;
                    if (!(object3 == null ? (object3 = ((PersistedInstallationEntry)object).getFirebaseInstallationId()) == null : (bl4 = ((String)object3).equals(object2 = ((PersistedInstallationEntry)object).getFirebaseInstallationId()))) || !(bl4 = (object3 = this.registrationStatus).equals(object2 = ((PersistedInstallationEntry)object).getRegistrationStatus())) || !((object3 = this.authToken) == null ? (object3 = ((PersistedInstallationEntry)object).getAuthToken()) == null : (bl4 = ((String)object3).equals(object2 = ((PersistedInstallationEntry)object).getAuthToken()))) || !((object3 = this.refreshToken) == null ? (object3 = ((PersistedInstallationEntry)object).getRefreshToken()) == null : (bl4 = ((String)object3).equals(object2 = ((PersistedInstallationEntry)object).getRefreshToken())))) break block5;
                    long l3 = this.expiresInSecs;
                    long l4 = ((PersistedInstallationEntry)object).getExpiresInSecs();
                    bl4 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                    if (!bl4 && !(bl4 = (l2 = (l3 = this.tokenCreationEpochInSecs) - (l4 = ((PersistedInstallationEntry)object).getTokenCreationEpochInSecs())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) && ((object3 = this.fisError) == null ? (object = ((PersistedInstallationEntry)object).getFisError()) == null : (bl3 = ((String)object3).equals(object = ((PersistedInstallationEntry)object).getFisError())))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public String getFisError() {
        return this.fisError;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public PersistedInstallation$RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    public long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    public int hashCode() {
        int n3;
        String string2 = this.firebaseInstallationId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        int n8 = ((Object)((Object)this.registrationStatus)).hashCode();
        n3 = (n3 ^ n8) * n7;
        String string3 = this.authToken;
        if (string3 == null) {
            n8 = 0;
            string3 = null;
        } else {
            n8 = string3.hashCode();
        }
        n3 = (n3 ^ n8) * n7;
        string3 = this.refreshToken;
        if (string3 == null) {
            n8 = 0;
            string3 = null;
        } else {
            n8 = string3.hashCode();
        }
        n3 = (n3 ^ n8) * n7;
        long l2 = this.expiresInSecs;
        int n10 = 32;
        long l3 = l2 >>> n10;
        int n14 = (int)(l2 ^ l3);
        n3 = (n3 ^ n14) * n7;
        l2 = this.tokenCreationEpochInSecs;
        long l4 = l2 >>> n10;
        n14 = (int)(l2 ^= l4);
        n3 = (n3 ^ n14) * n7;
        String string4 = this.fisError;
        if (string4 != null) {
            n4 = string4.hashCode();
        }
        return n3 ^ n4;
    }

    public PersistedInstallationEntry$Builder toBuilder() {
        AutoValue_PersistedInstallationEntry$Builder autoValue_PersistedInstallationEntry$Builder = new AutoValue_PersistedInstallationEntry$Builder(this, null);
        return autoValue_PersistedInstallationEntry$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        Object object = this.firebaseInstallationId;
        stringBuilder.append((String)object);
        stringBuilder.append(", registrationStatus=");
        object = this.registrationStatus;
        stringBuilder.append(object);
        stringBuilder.append(", authToken=");
        object = this.authToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", refreshToken=");
        object = this.refreshToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", expiresInSecs=");
        long l2 = this.expiresInSecs;
        stringBuilder.append(l2);
        stringBuilder.append(", tokenCreationEpochInSecs=");
        l2 = this.tokenCreationEpochInSecs;
        stringBuilder.append(l2);
        stringBuilder.append(", fisError=");
        object = this.fisError;
        return h30_0.a(stringBuilder, object, "}");
    }
}

