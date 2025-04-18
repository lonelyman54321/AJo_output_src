/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters;

import com.affise.attribution.parameters.ProviderType$Companion;

public final class ProviderType
extends Enum {
    private static final /* synthetic */ ProviderType[] $VALUES;
    public static final /* enum */ ProviderType ADID;
    public static final /* enum */ ProviderType AD_PERSONALIZATION;
    public static final /* enum */ ProviderType AFFISE_ALT_DEVICE_ID;
    public static final /* enum */ ProviderType AFFISE_APP_ID;
    public static final /* enum */ ProviderType AFFISE_APP_OPENED;
    public static final /* enum */ ProviderType AFFISE_APP_TOKEN;
    public static final /* enum */ ProviderType AFFISE_DEEPLINK;
    public static final /* enum */ ProviderType AFFISE_DEVICE_ID;
    public static final /* enum */ ProviderType AFFISE_EVENTS_COUNT;
    public static final /* enum */ ProviderType AFFISE_EVENT_NAME;
    public static final /* enum */ ProviderType AFFISE_EVENT_TOKEN;
    public static final /* enum */ ProviderType AFFISE_INTERNAL_EVENTS_COUNT;
    public static final /* enum */ ProviderType AFFISE_METRICS_EVENTS_COUNT;
    public static final /* enum */ ProviderType AFFISE_PART_PARAM_NAME;
    public static final /* enum */ ProviderType AFFISE_PART_PARAM_NAME_TOKEN;
    public static final /* enum */ ProviderType AFFISE_PKG_APP_NAME;
    public static final /* enum */ ProviderType AFFISE_SDK_EVENTS_COUNT;
    public static final /* enum */ ProviderType AFFISE_SDK_POS;
    public static final /* enum */ ProviderType AFFISE_SDK_SECRET_ID;
    public static final /* enum */ ProviderType AFFISE_SDK_VERSION;
    public static final /* enum */ ProviderType AFFISE_SESSION_COUNT;
    public static final /* enum */ ProviderType AFF_APP_NAME_DASHBOARD;
    public static final /* enum */ ProviderType ALTSTR_ADID;
    public static final /* enum */ ProviderType ANDROID_ID;
    public static final /* enum */ ProviderType ANDROID_ID_MD5;
    public static final /* enum */ ProviderType API_LEVEL_OS;
    public static final /* enum */ ProviderType APP_VERSION;
    public static final /* enum */ ProviderType APP_VERSION_RAW;
    public static final /* enum */ ProviderType BUILD;
    public static final /* enum */ ProviderType COLOROS_ADID;
    public static final /* enum */ ProviderType CONNECTION_TYPE;
    public static final /* enum */ ProviderType COUNTRY;
    public static final /* enum */ ProviderType CPU_TYPE;
    public static final /* enum */ ProviderType CREATED_TIME;
    public static final /* enum */ ProviderType CREATED_TIME_HOUR;
    public static final /* enum */ ProviderType CREATED_TIME_MILLI;
    public static final ProviderType$Companion Companion;
    public static final /* enum */ ProviderType DEEPLINK_CLICK;
    public static final /* enum */ ProviderType DEVICE;
    public static final /* enum */ ProviderType DEVICE_ATLAS_ID;
    public static final /* enum */ ProviderType DEVICE_MANUFACTURER;
    public static final /* enum */ ProviderType DEVICE_NAME;
    public static final /* enum */ ProviderType DEVICE_TYPE;
    public static final /* enum */ ProviderType FIREOS_ADID;
    public static final /* enum */ ProviderType FIRST_OPEN_HOUR;
    public static final /* enum */ ProviderType FIRST_OPEN_TIME;
    public static final /* enum */ ProviderType FIRST_TRACKER_NAME;
    public static final /* enum */ ProviderType FIRST_TRACKER_TOKEN;
    public static final /* enum */ ProviderType GAID_ADID;
    public static final /* enum */ ProviderType GAID_ADID_MD5;
    public static final /* enum */ ProviderType HARDWARE_NAME;
    public static final /* enum */ ProviderType INSTALLED_HOUR;
    public static final /* enum */ ProviderType INSTALLED_TIME;
    public static final /* enum */ ProviderType INSTALL_BEGIN_TIME;
    public static final /* enum */ ProviderType INSTALL_FINISH_TIME;
    public static final /* enum */ ProviderType INSTALL_FIRST_EVENT;
    public static final /* enum */ ProviderType ISP;
    public static final /* enum */ ProviderType IS_EMULATOR;
    public static final /* enum */ ProviderType IS_ROOTED;
    public static final /* enum */ ProviderType LABEL;
    public static final /* enum */ ProviderType LANGUAGE;
    public static final /* enum */ ProviderType LAST_SESSION_TIME;
    public static final /* enum */ ProviderType LAST_TIME_SESSION;
    public static final /* enum */ ProviderType LAST_TRACKER_NAME;
    public static final /* enum */ ProviderType LAST_TRACKER_TOKEN;
    public static final /* enum */ ProviderType LIFETIME_SESSION_COUNT;
    public static final /* enum */ ProviderType MAC_MD5;
    public static final /* enum */ ProviderType MAC_SHA1;
    public static final /* enum */ ProviderType MCCODE;
    public static final /* enum */ ProviderType MNCODE;
    public static final /* enum */ ProviderType NETWORK_TYPE;
    public static final /* enum */ ProviderType OAID;
    public static final /* enum */ ProviderType OAID_MD5;
    public static final /* enum */ ProviderType OS_AND_VERSION;
    public static final /* enum */ ProviderType OS_NAME;
    public static final /* enum */ ProviderType OS_VERSION;
    public static final /* enum */ ProviderType OUTDATED_TRACKER_TOKEN;
    public static final /* enum */ ProviderType PLATFORM;
    public static final /* enum */ ProviderType PROXY_IP_ADDRESS;
    public static final /* enum */ ProviderType PUSHTOKEN;
    public static final /* enum */ ProviderType RANDOM_USER_ID;
    public static final /* enum */ ProviderType REFERRAL_TIME;
    public static final /* enum */ ProviderType REFERRER;
    public static final /* enum */ ProviderType REFERRER_CLICK_TIME;
    public static final /* enum */ ProviderType REFERRER_CLICK_TIME_SERVER;
    public static final /* enum */ ProviderType REFERRER_GOOGLE_PLAY_INSTANT;
    public static final /* enum */ ProviderType REFERRER_INSTALL_VERSION;
    public static final /* enum */ ProviderType REFTOKEN;
    public static final /* enum */ ProviderType REFTOKENS;
    public static final /* enum */ ProviderType REGION;
    public static final /* enum */ ProviderType REINSTALL_TIME;
    public static final /* enum */ ProviderType SDK_PLATFORM;
    public static final /* enum */ ProviderType STORE;
    public static final /* enum */ ProviderType TIMEZONE_DEV;
    public static final /* enum */ ProviderType TIME_SESSION;
    public static final /* enum */ ProviderType TRACKER_NAME;
    public static final /* enum */ ProviderType TRACKER_TOKEN;
    public static final /* enum */ ProviderType UNINSTALL_TIME;
    public static final /* enum */ ProviderType USER_AGENT;
    public static final /* enum */ ProviderType UUID;
    private final String provider;

    private static final /* synthetic */ ProviderType[] $values() {
        ProviderType providerType = AFFISE_APP_ID;
        providerType = AFFISE_PKG_APP_NAME;
        providerType = AFF_APP_NAME_DASHBOARD;
        providerType = APP_VERSION;
        providerType = APP_VERSION_RAW;
        providerType = STORE;
        providerType = TRACKER_TOKEN;
        providerType = TRACKER_NAME;
        providerType = FIRST_TRACKER_TOKEN;
        providerType = FIRST_TRACKER_NAME;
        providerType = LAST_TRACKER_TOKEN;
        providerType = LAST_TRACKER_NAME;
        providerType = OUTDATED_TRACKER_TOKEN;
        providerType = INSTALLED_TIME;
        providerType = FIRST_OPEN_TIME;
        providerType = INSTALLED_HOUR;
        providerType = FIRST_OPEN_HOUR;
        providerType = INSTALL_FIRST_EVENT;
        providerType = INSTALL_BEGIN_TIME;
        providerType = INSTALL_FINISH_TIME;
        providerType = REFERRER_INSTALL_VERSION;
        providerType = REFERRAL_TIME;
        providerType = REFERRER_CLICK_TIME;
        providerType = REFERRER_CLICK_TIME_SERVER;
        providerType = REFERRER_GOOGLE_PLAY_INSTANT;
        providerType = CREATED_TIME;
        providerType = CREATED_TIME_MILLI;
        providerType = CREATED_TIME_HOUR;
        providerType = UNINSTALL_TIME;
        providerType = REINSTALL_TIME;
        providerType = LAST_SESSION_TIME;
        providerType = CPU_TYPE;
        providerType = HARDWARE_NAME;
        providerType = DEVICE_MANUFACTURER;
        providerType = DEEPLINK_CLICK;
        providerType = DEVICE_ATLAS_ID;
        providerType = AFFISE_DEVICE_ID;
        providerType = AFFISE_ALT_DEVICE_ID;
        providerType = ANDROID_ID;
        providerType = ANDROID_ID_MD5;
        providerType = REFTOKEN;
        providerType = REFTOKENS;
        providerType = REFERRER;
        providerType = USER_AGENT;
        providerType = MCCODE;
        providerType = MNCODE;
        providerType = REGION;
        providerType = COUNTRY;
        providerType = LANGUAGE;
        providerType = DEVICE_NAME;
        providerType = DEVICE_TYPE;
        providerType = OS_NAME;
        providerType = PLATFORM;
        providerType = SDK_PLATFORM;
        providerType = API_LEVEL_OS;
        providerType = AFFISE_SDK_VERSION;
        providerType = OS_VERSION;
        providerType = RANDOM_USER_ID;
        providerType = AFFISE_SDK_POS;
        providerType = TIMEZONE_DEV;
        providerType = AFFISE_EVENT_NAME;
        providerType = AFFISE_EVENT_TOKEN;
        providerType = LAST_TIME_SESSION;
        providerType = TIME_SESSION;
        providerType = AFFISE_SESSION_COUNT;
        providerType = LIFETIME_SESSION_COUNT;
        providerType = AFFISE_DEEPLINK;
        providerType = AFFISE_PART_PARAM_NAME;
        providerType = AFFISE_PART_PARAM_NAME_TOKEN;
        providerType = AFFISE_APP_TOKEN;
        providerType = LABEL;
        providerType = AFFISE_SDK_SECRET_ID;
        providerType = UUID;
        providerType = AFFISE_APP_OPENED;
        providerType = PUSHTOKEN;
        providerType = AFFISE_EVENTS_COUNT;
        providerType = AFFISE_SDK_EVENTS_COUNT;
        providerType = AFFISE_METRICS_EVENTS_COUNT;
        providerType = AFFISE_INTERNAL_EVENTS_COUNT;
        providerType = IS_ROOTED;
        providerType = IS_EMULATOR;
        providerType = OS_AND_VERSION;
        providerType = DEVICE;
        providerType = BUILD;
        providerType = GAID_ADID;
        providerType = GAID_ADID_MD5;
        providerType = OAID;
        providerType = OAID_MD5;
        providerType = ADID;
        providerType = ALTSTR_ADID;
        providerType = FIREOS_ADID;
        providerType = COLOROS_ADID;
        providerType = AD_PERSONALIZATION;
        providerType = MAC_SHA1;
        providerType = MAC_MD5;
        providerType = CONNECTION_TYPE;
        providerType = PROXY_IP_ADDRESS;
        providerType = NETWORK_TYPE;
        providerType = ISP;
        ProviderType[] providerTypeArray = new ProviderType[]{providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType, providerType};
        return providerTypeArray;
    }

    static {
        Object object;
        AFFISE_APP_ID = object = new ProviderType("AFFISE_APP_ID", 0, "affise_app_id");
        AFFISE_PKG_APP_NAME = object = new ProviderType("AFFISE_PKG_APP_NAME", 1, "affise_pkg_app_name");
        AFF_APP_NAME_DASHBOARD = object = new ProviderType("AFF_APP_NAME_DASHBOARD", 2, "affise_app_name_dashboard");
        APP_VERSION = object = new ProviderType("APP_VERSION", 3, "app_version");
        APP_VERSION_RAW = object = new ProviderType("APP_VERSION_RAW", 4, "app_version_raw");
        STORE = object = new ProviderType("STORE", 5, "store");
        TRACKER_TOKEN = object = new ProviderType("TRACKER_TOKEN", 6, "tracker_token");
        TRACKER_NAME = object = new ProviderType("TRACKER_NAME", 7, "tracker_name");
        FIRST_TRACKER_TOKEN = object = new ProviderType("FIRST_TRACKER_TOKEN", 8, "first_tracker_token");
        FIRST_TRACKER_NAME = object = new ProviderType("FIRST_TRACKER_NAME", 9, "first_tracker_name");
        LAST_TRACKER_TOKEN = object = new ProviderType("LAST_TRACKER_TOKEN", 10, "last_tracker_token");
        LAST_TRACKER_NAME = object = new ProviderType("LAST_TRACKER_NAME", 11, "last_tracker_name");
        OUTDATED_TRACKER_TOKEN = object = new ProviderType("OUTDATED_TRACKER_TOKEN", 12, "outdated_tracker_token");
        INSTALLED_TIME = object = new ProviderType("INSTALLED_TIME", 13, "installed_time");
        FIRST_OPEN_TIME = object = new ProviderType("FIRST_OPEN_TIME", 14, "first_open_time");
        INSTALLED_HOUR = object = new ProviderType("INSTALLED_HOUR", 15, "installed_hour");
        FIRST_OPEN_HOUR = object = new ProviderType("FIRST_OPEN_HOUR", 16, "first_open_hour");
        INSTALL_FIRST_EVENT = object = new ProviderType("INSTALL_FIRST_EVENT", 17, "install_first_event");
        INSTALL_BEGIN_TIME = object = new ProviderType("INSTALL_BEGIN_TIME", 18, "install_begin_time");
        INSTALL_FINISH_TIME = object = new ProviderType("INSTALL_FINISH_TIME", 19, "install_finish_time");
        REFERRER_INSTALL_VERSION = object = new ProviderType("REFERRER_INSTALL_VERSION", 20, "referrer_install_version");
        REFERRAL_TIME = object = new ProviderType("REFERRAL_TIME", 21, "referral_time");
        REFERRER_CLICK_TIME = object = new ProviderType("REFERRER_CLICK_TIME", 22, "referrer_click_time");
        REFERRER_CLICK_TIME_SERVER = object = new ProviderType("REFERRER_CLICK_TIME_SERVER", 23, "referrer_click_time_server");
        REFERRER_GOOGLE_PLAY_INSTANT = object = new ProviderType("REFERRER_GOOGLE_PLAY_INSTANT", 24, "referrer_google_play_instant");
        CREATED_TIME = object = new ProviderType("CREATED_TIME", 25, "created_time");
        CREATED_TIME_MILLI = object = new ProviderType("CREATED_TIME_MILLI", 26, "created_time_milli");
        CREATED_TIME_HOUR = object = new ProviderType("CREATED_TIME_HOUR", 27, "created_time_hour");
        UNINSTALL_TIME = object = new ProviderType("UNINSTALL_TIME", 28, "uninstall_time");
        REINSTALL_TIME = object = new ProviderType("REINSTALL_TIME", 29, "reinstall_time");
        LAST_SESSION_TIME = object = new ProviderType("LAST_SESSION_TIME", 30, "last_session_time");
        CPU_TYPE = object = new ProviderType("CPU_TYPE", 31, "cpu_type");
        HARDWARE_NAME = object = new ProviderType("HARDWARE_NAME", 32, "hardware_name");
        DEVICE_MANUFACTURER = object = new ProviderType("DEVICE_MANUFACTURER", 33, "device_manufacturer");
        DEEPLINK_CLICK = object = new ProviderType("DEEPLINK_CLICK", 34, "deeplink_click");
        DEVICE_ATLAS_ID = object = new ProviderType("DEVICE_ATLAS_ID", 35, "device_atlas_id");
        AFFISE_DEVICE_ID = object = new ProviderType("AFFISE_DEVICE_ID", 36, "affise_device_id");
        AFFISE_ALT_DEVICE_ID = object = new ProviderType("AFFISE_ALT_DEVICE_ID", 37, "affise_alt_device_id");
        ANDROID_ID = object = new ProviderType("ANDROID_ID", 38, "android_id");
        ANDROID_ID_MD5 = object = new ProviderType("ANDROID_ID_MD5", 39, "android_id_md5");
        REFTOKEN = object = new ProviderType("REFTOKEN", 40, "reftoken");
        REFTOKENS = object = new ProviderType("REFTOKENS", 41, "reftokens");
        REFERRER = object = new ProviderType("REFERRER", 42, "referrer");
        USER_AGENT = object = new ProviderType("USER_AGENT", 43, "user_agent");
        MCCODE = object = new ProviderType("MCCODE", 44, "mccode");
        MNCODE = object = new ProviderType("MNCODE", 45, "mncode");
        REGION = object = new ProviderType("REGION", 46, "region");
        COUNTRY = object = new ProviderType("COUNTRY", 47, "country");
        LANGUAGE = object = new ProviderType("LANGUAGE", 48, "language");
        DEVICE_NAME = object = new ProviderType("DEVICE_NAME", 49, "device_name");
        DEVICE_TYPE = object = new ProviderType("DEVICE_TYPE", 50, "device_type");
        OS_NAME = object = new ProviderType("OS_NAME", 51, "os_name");
        PLATFORM = object = new ProviderType("PLATFORM", 52, "platform");
        SDK_PLATFORM = object = new ProviderType("SDK_PLATFORM", 53, "sdk_platform");
        API_LEVEL_OS = object = new ProviderType("API_LEVEL_OS", 54, "api_level_os");
        AFFISE_SDK_VERSION = object = new ProviderType("AFFISE_SDK_VERSION", 55, "affise_sdk_version");
        OS_VERSION = object = new ProviderType("OS_VERSION", 56, "os_version");
        RANDOM_USER_ID = object = new ProviderType("RANDOM_USER_ID", 57, "random_user_id");
        AFFISE_SDK_POS = object = new ProviderType("AFFISE_SDK_POS", 58, "affise_sdk_pos");
        TIMEZONE_DEV = object = new ProviderType("TIMEZONE_DEV", 59, "timezone_dev");
        AFFISE_EVENT_NAME = object = new ProviderType("AFFISE_EVENT_NAME", 60, "affise_event_name");
        AFFISE_EVENT_TOKEN = object = new ProviderType("AFFISE_EVENT_TOKEN", 61, "affise_event_token");
        LAST_TIME_SESSION = object = new ProviderType("LAST_TIME_SESSION", 62, "last_time_session");
        TIME_SESSION = object = new ProviderType("TIME_SESSION", 63, "time_session");
        AFFISE_SESSION_COUNT = object = new ProviderType("AFFISE_SESSION_COUNT", 64, "affise_session_count");
        LIFETIME_SESSION_COUNT = object = new ProviderType("LIFETIME_SESSION_COUNT", 65, "lifetime_session_count");
        AFFISE_DEEPLINK = object = new ProviderType("AFFISE_DEEPLINK", 66, "affise_deeplink");
        AFFISE_PART_PARAM_NAME = object = new ProviderType("AFFISE_PART_PARAM_NAME", 67, "affise_part_param_name");
        AFFISE_PART_PARAM_NAME_TOKEN = object = new ProviderType("AFFISE_PART_PARAM_NAME_TOKEN", 68, "affise_part_param_name_token");
        AFFISE_APP_TOKEN = object = new ProviderType("AFFISE_APP_TOKEN", 69, "affise_app_token");
        LABEL = object = new ProviderType("LABEL", 70, "label");
        AFFISE_SDK_SECRET_ID = object = new ProviderType("AFFISE_SDK_SECRET_ID", 71, "affise_sdk_secret_id");
        UUID = object = new ProviderType("UUID", 72, "uuid");
        AFFISE_APP_OPENED = object = new ProviderType("AFFISE_APP_OPENED", 73, "affise_app_opened");
        PUSHTOKEN = object = new ProviderType("PUSHTOKEN", 74, "pushtoken");
        AFFISE_EVENTS_COUNT = object = new ProviderType("AFFISE_EVENTS_COUNT", 75, "affise_events_count");
        AFFISE_SDK_EVENTS_COUNT = object = new ProviderType("AFFISE_SDK_EVENTS_COUNT", 76, "affise_sdk_events_count");
        AFFISE_METRICS_EVENTS_COUNT = object = new ProviderType("AFFISE_METRICS_EVENTS_COUNT", 77, "affise_metrics_events_count");
        AFFISE_INTERNAL_EVENTS_COUNT = object = new ProviderType("AFFISE_INTERNAL_EVENTS_COUNT", 78, "affise_internal_events_count");
        IS_ROOTED = object = new ProviderType("IS_ROOTED", 79, "is_rooted");
        IS_EMULATOR = object = new ProviderType("IS_EMULATOR", 80, "is_emulator");
        OS_AND_VERSION = object = new ProviderType("OS_AND_VERSION", 81, "os_and_version");
        DEVICE = object = new ProviderType("DEVICE", 82, "device");
        BUILD = object = new ProviderType("BUILD", 83, "build");
        GAID_ADID = object = new ProviderType("GAID_ADID", 84, "gaid_adid");
        GAID_ADID_MD5 = object = new ProviderType("GAID_ADID_MD5", 85, "gaid_adid_md5");
        OAID = object = new ProviderType("OAID", 86, "oaid");
        OAID_MD5 = object = new ProviderType("OAID_MD5", 87, "oaid_md5");
        ADID = object = new ProviderType("ADID", 88, "adid");
        ALTSTR_ADID = object = new ProviderType("ALTSTR_ADID", 89, "altstr_adid");
        FIREOS_ADID = object = new ProviderType("FIREOS_ADID", 90, "fireos_adid");
        COLOROS_ADID = object = new ProviderType("COLOROS_ADID", 91, "coloros_adid");
        AD_PERSONALIZATION = object = new ProviderType("AD_PERSONALIZATION", 92, "ad_personalization");
        MAC_SHA1 = object = new ProviderType("MAC_SHA1", 93, "mac_sha1");
        MAC_MD5 = object = new ProviderType("MAC_MD5", 94, "mac_md5");
        CONNECTION_TYPE = object = new ProviderType("CONNECTION_TYPE", 95, "connection_type");
        PROXY_IP_ADDRESS = object = new ProviderType("PROXY_IP_ADDRESS", 96, "proxy_ip_address");
        NETWORK_TYPE = object = new ProviderType("NETWORK_TYPE", 97, "network_type");
        ISP = object = new ProviderType("ISP", 98, "isp");
        $VALUES = ProviderType.$values();
        object = new ProviderType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ProviderType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.provider = var3_2;
    }

    public static final ProviderType from(String string2) {
        return Companion.from(string2);
    }

    public static ProviderType valueOf(String string2) {
        return Enum.valueOf(ProviderType.class, string2);
    }

    public static ProviderType[] values() {
        return (ProviderType[])$VALUES.clone();
    }

    public final String getProvider() {
        return this.provider;
    }
}

