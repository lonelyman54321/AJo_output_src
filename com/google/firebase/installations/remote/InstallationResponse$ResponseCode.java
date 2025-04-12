/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.remote;

public final class InstallationResponse$ResponseCode
extends Enum {
    private static final /* synthetic */ InstallationResponse$ResponseCode[] $VALUES;
    public static final /* enum */ InstallationResponse$ResponseCode BAD_CONFIG;
    public static final /* enum */ InstallationResponse$ResponseCode OK;

    private static /* synthetic */ InstallationResponse$ResponseCode[] $values() {
        InstallationResponse$ResponseCode installationResponse$ResponseCode = OK;
        installationResponse$ResponseCode = BAD_CONFIG;
        InstallationResponse$ResponseCode[] installationResponse$ResponseCodeArray = new InstallationResponse$ResponseCode[]{installationResponse$ResponseCode, installationResponse$ResponseCode};
        return installationResponse$ResponseCodeArray;
    }

    static {
        InstallationResponse$ResponseCode installationResponse$ResponseCode;
        OK = installationResponse$ResponseCode = new InstallationResponse$ResponseCode("OK", 0);
        BAD_CONFIG = installationResponse$ResponseCode = new InstallationResponse$ResponseCode("BAD_CONFIG", 1);
        $VALUES = InstallationResponse$ResponseCode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InstallationResponse$ResponseCode() {
        void var2_-1;
        void var1_-1;
    }

    public static InstallationResponse$ResponseCode valueOf(String string2) {
        return Enum.valueOf(InstallationResponse$ResponseCode.class, string2);
    }

    public static InstallationResponse$ResponseCode[] values() {
        return (InstallationResponse$ResponseCode[])$VALUES.clone();
    }
}

