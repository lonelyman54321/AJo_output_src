/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.local;

public final class PersistedInstallation$RegistrationStatus
extends Enum {
    private static final /* synthetic */ PersistedInstallation$RegistrationStatus[] $VALUES;
    public static final /* enum */ PersistedInstallation$RegistrationStatus ATTEMPT_MIGRATION;
    public static final /* enum */ PersistedInstallation$RegistrationStatus NOT_GENERATED;
    public static final /* enum */ PersistedInstallation$RegistrationStatus REGISTERED;
    public static final /* enum */ PersistedInstallation$RegistrationStatus REGISTER_ERROR;
    public static final /* enum */ PersistedInstallation$RegistrationStatus UNREGISTERED;

    private static /* synthetic */ PersistedInstallation$RegistrationStatus[] $values() {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = ATTEMPT_MIGRATION;
        persistedInstallation$RegistrationStatus = NOT_GENERATED;
        persistedInstallation$RegistrationStatus = UNREGISTERED;
        persistedInstallation$RegistrationStatus = REGISTERED;
        persistedInstallation$RegistrationStatus = REGISTER_ERROR;
        PersistedInstallation$RegistrationStatus[] persistedInstallation$RegistrationStatusArray = new PersistedInstallation$RegistrationStatus[]{persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus};
        return persistedInstallation$RegistrationStatusArray;
    }

    static {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus;
        ATTEMPT_MIGRATION = persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("ATTEMPT_MIGRATION", 0);
        NOT_GENERATED = persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("NOT_GENERATED", 1);
        UNREGISTERED = persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("UNREGISTERED", 2);
        REGISTERED = persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("REGISTERED", 3);
        REGISTER_ERROR = persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("REGISTER_ERROR", 4);
        $VALUES = PersistedInstallation$RegistrationStatus.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PersistedInstallation$RegistrationStatus() {
        void var2_-1;
        void var1_-1;
    }

    public static PersistedInstallation$RegistrationStatus valueOf(String string2) {
        return Enum.valueOf(PersistedInstallation$RegistrationStatus.class, string2);
    }

    public static PersistedInstallation$RegistrationStatus[] values() {
        return (PersistedInstallation$RegistrationStatus[])$VALUES.clone();
    }
}

