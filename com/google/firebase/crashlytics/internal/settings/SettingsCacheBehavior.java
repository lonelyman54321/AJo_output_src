/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.settings;

final class SettingsCacheBehavior
extends Enum {
    private static final /* synthetic */ SettingsCacheBehavior[] $VALUES;
    public static final /* enum */ SettingsCacheBehavior IGNORE_CACHE_EXPIRATION;
    public static final /* enum */ SettingsCacheBehavior SKIP_CACHE_LOOKUP;
    public static final /* enum */ SettingsCacheBehavior USE_CACHE;

    private static /* synthetic */ SettingsCacheBehavior[] $values() {
        SettingsCacheBehavior settingsCacheBehavior = USE_CACHE;
        settingsCacheBehavior = SKIP_CACHE_LOOKUP;
        settingsCacheBehavior = IGNORE_CACHE_EXPIRATION;
        SettingsCacheBehavior[] settingsCacheBehaviorArray = new SettingsCacheBehavior[]{settingsCacheBehavior, settingsCacheBehavior, settingsCacheBehavior};
        return settingsCacheBehaviorArray;
    }

    static {
        SettingsCacheBehavior settingsCacheBehavior;
        USE_CACHE = settingsCacheBehavior = new SettingsCacheBehavior("USE_CACHE", 0);
        SKIP_CACHE_LOOKUP = settingsCacheBehavior = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        IGNORE_CACHE_EXPIRATION = settingsCacheBehavior = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        $VALUES = SettingsCacheBehavior.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SettingsCacheBehavior() {
        void var2_-1;
        void var1_-1;
    }

    public static SettingsCacheBehavior valueOf(String string2) {
        return Enum.valueOf(SettingsCacheBehavior.class, string2);
    }

    public static SettingsCacheBehavior[] values() {
        return (SettingsCacheBehavior[])$VALUES.clone();
    }
}

