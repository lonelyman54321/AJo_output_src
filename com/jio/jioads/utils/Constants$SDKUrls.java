/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import com.jio.jioads.utils.Constants$SDKUrls$Companion;

public interface Constants$SDKUrls {
    public static final String BASE_URL_MERCURY_DEV = "http://49.40.64.244:6080/proxy.api.php";
    public static final String BASE_URL_MERCURY_DEV_VMAP = "http://49.40.64.244:6080/proxy.vapi.php";
    public static final String BASE_URL_MERCURY_PRODUCTION = "https://mercury.jio.com/delivery/api.php";
    public static final String BASE_URL_MERCURY_PRODUCTION_VMAP = "https://mercury.jio.com/delivery/vapi.php";
    public static final String BASE_URL_MERCURY_SIT = "http://49.40.64.244:6080/sit.goapi.php";
    public static final String BASE_URL_MERCURY_SIT_VMAP = "http://49.40.64.244:6080/sit.vapi.php";
    public static final String BASE_URL_MERCURY_STAGING = "https://mercury-stg.jio.com/delivery/api.php";
    public static final String BASE_URL_MERCURY_STAGING_VMAP = "https://mercury-stg.jio.com/delivery/vapi.php";
    public static final String BPID_FILLSTATUS_URL = "https://jioads.akamaized.net/beacon/anb.gif";
    public static final String CDN_ERROR_LOGGING = "https://mercury.akamaized.net/an/<PACKAGE_NAME>/err.gif";
    public static final String CDN_ERROR_LOGGING_AN_TV = "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand.atv/err.gif";
    public static final String CDN_ERROR_LOGGING_FIRETV = "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand.firetv/err.gif";
    public static final String CDN_ERROR_LOGGING_STB = "https://mercury.akamaized.net/an/com.jio.media.stb.ondemand/err.gif";
    public static final String CDN_SLOT_DETAILS_URL = "https://mercury.akamaized.net/prism/";
    public static final String CDN_SLOT_DETAILS_URL_STG = "https://mercury.akamaized.net/preprodprism/";
    public static final Constants$SDKUrls$Companion Companion = Constants$SDKUrls$Companion.a;
    public static final String FTTH_NETWORK_CHECK_URL = "http://api.jio.com/ftth/v1/network/check";
    public static final String JIO_NUDGE_URL = "https://pp-api-raasgw.jio.com/v1/get_likes/";
    public static final String MASTER_CONFIG_DEV_URL = "https://mercury.akamaized.net/cfg/dev/an/";
    public static final String MASTER_CONFIG_PROD_URL = "https://mercury.akamaized.net/cfg/an/";
    public static final String MASTER_CONFIG_SIT_URL = "https://mercury.akamaized.net/cfg/sit/an/";
    public static final String MASTER_CONFIG_STG_URL = "https://mercury.akamaized.net/cfg/stg/an/";
    public static final String MERCURY_CONVERSION_TRIGGER_PROD = "https://mercury-ck.jio.com/delivery/cn.php";
    public static final String MERCURY_CONVERSION_TRIGGER_STG = "https://mercury-ck-stg.jio.com/delivery/cn.php";
    public static final String MOBILE_BPID_URL = "http://api.jio.com/v2/users/me";
    public static final String MULTI_AD_BASE_URL_DEV = "http://49.40.64.244:6080/proxy.mads.php";
    public static final String MULTI_AD_BASE_URL_PROD = "https://mercury.jio.com/delivery/mapi.php";
    public static final String MULTI_AD_BASE_URL_SIT = "http://49.40.64.244:6080/sit.gomapi.php";
    public static final String MULTI_AD_BASE_URL_STAGING = "https://mercury-stg.jio.com/delivery/mapi.php";
    public static final String OMSDK_JS_URL = "https://mercury.akamaized.net/jioads/om/omsdk-js-1.3.36/Service/omsdk-v1.js";
    public static final String STB_BPID_URL = "http://api.jio.com/ftth/v2/users/me";
    public static final String TARGETING_JS_URL = "https://mercury.akamaized.net/mdt/TargetingValidator.js";
    public static final String TRACKER_URL = "https://mercury.akamaized.net/cfg/jioAdsTracker/{tracker}.json";
    public static final String TRACKER_URL_SIT = "https://mercury.akamaized.net/cfg/sit/jioAdsTracker/{tracker}.json";
}

