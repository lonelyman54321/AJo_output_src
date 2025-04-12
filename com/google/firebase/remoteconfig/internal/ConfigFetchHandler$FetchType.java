/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

public final class ConfigFetchHandler$FetchType
extends Enum {
    private static final /* synthetic */ ConfigFetchHandler$FetchType[] $VALUES;
    public static final /* enum */ ConfigFetchHandler$FetchType BASE;
    public static final /* enum */ ConfigFetchHandler$FetchType REALTIME;
    private final String value;

    private static /* synthetic */ ConfigFetchHandler$FetchType[] $values() {
        ConfigFetchHandler$FetchType configFetchHandler$FetchType = BASE;
        configFetchHandler$FetchType = REALTIME;
        ConfigFetchHandler$FetchType[] configFetchHandler$FetchTypeArray = new ConfigFetchHandler$FetchType[]{configFetchHandler$FetchType, configFetchHandler$FetchType};
        return configFetchHandler$FetchTypeArray;
    }

    static {
        ConfigFetchHandler$FetchType configFetchHandler$FetchType;
        String string2 = "BASE";
        BASE = configFetchHandler$FetchType = new ConfigFetchHandler$FetchType(string2, 0, string2);
        string2 = "REALTIME";
        REALTIME = configFetchHandler$FetchType = new ConfigFetchHandler$FetchType(string2, 1, string2);
        $VALUES = ConfigFetchHandler$FetchType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ConfigFetchHandler$FetchType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ConfigFetchHandler$FetchType valueOf(String string2) {
        return Enum.valueOf(ConfigFetchHandler$FetchType.class, string2);
    }

    public static ConfigFetchHandler$FetchType[] values() {
        return (ConfigFetchHandler$FetchType[])$VALUES.clone();
    }

    public String getValue() {
        return this.value;
    }
}

