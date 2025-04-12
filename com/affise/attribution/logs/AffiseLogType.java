/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

public final class AffiseLogType
extends Enum {
    private static final /* synthetic */ AffiseLogType[] $VALUES;
    public static final /* enum */ AffiseLogType DEVICEDATA;
    public static final /* enum */ AffiseLogType NETWORK;
    public static final /* enum */ AffiseLogType SDKLOG;
    public static final /* enum */ AffiseLogType USERDATA;
    private final String type;

    private static final /* synthetic */ AffiseLogType[] $values() {
        AffiseLogType affiseLogType = NETWORK;
        affiseLogType = DEVICEDATA;
        affiseLogType = USERDATA;
        affiseLogType = SDKLOG;
        AffiseLogType[] affiseLogTypeArray = new AffiseLogType[]{affiseLogType, affiseLogType, affiseLogType, affiseLogType};
        return affiseLogTypeArray;
    }

    static {
        AffiseLogType affiseLogType;
        NETWORK = affiseLogType = new AffiseLogType("NETWORK", 0, "affise_sdklog_network");
        DEVICEDATA = affiseLogType = new AffiseLogType("DEVICEDATA", 1, "affise_sdklog_ddata");
        USERDATA = affiseLogType = new AffiseLogType("USERDATA", 2, "affise_sdklog_udata");
        SDKLOG = affiseLogType = new AffiseLogType("SDKLOG", 3, "affise_sdklog_main");
        $VALUES = AffiseLogType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AffiseLogType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static AffiseLogType valueOf(String string2) {
        return Enum.valueOf(AffiseLogType.class, string2);
    }

    public static AffiseLogType[] values() {
        return (AffiseLogType[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

