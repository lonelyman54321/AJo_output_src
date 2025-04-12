/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import com.jio.jioads.utils.Constants$Companion;

public final class Constants {
    public static final String BPID_APPNAME = "RJIL_JioAds_Android";
    public static final Constants$Companion Companion;
    public static final int DEFAULT_REFRESH_RATE = 30;
    public static final long DELAYED_DURATION_TO_AVOID_STACKOVERFLOW_EXCEPTION = 15L;
    public static final int IMPRESSION_FIRING_PERC_DEFAULT = 5;
    public static final String JIOADS_PUSH_ADSERVICE_CONTENT_URI2 = "content://com.jio.stbpushservice.SubscriberIdProvider2/cte";
    public static final long JS_TARGETTING_OPERATION_TIMEOUT = 3L;
    public static final String MEDIATION = "Mediation";
    public static final String OMSDK_JS_FILE_NAME = "OmSdkJs.js";
    public static final long ONE_DAY = 86400000L;
    public static final int ONE_SECOND_MILLIS = 1000;
    public static final String PGM_ADD_PLACEHOLDER = "pgm_add_placeholder";
    public static final String PGM_LOAD_AD = "pgm_load_ad";
    public static final String PGM_PLACEHOLDER_CAMPAIGN = "pgm_placeholder_campaign";
    public static final String PLACEHOLDER_PGM_ID = "pid";
    public static final String PLACEHOLDER_PGM_MEDIA = "";
    public static final int RETRY_ATTEMPT_THRESHOLD = 5;
    public static final String STB_BPID_API_KEY = "l7xx546797181c79495e84ca90a1bbe2ff64";
    public static final String STB_BPID_APP_NAME = "RJIL_JioPush2";
    public static final String TARGETING_JS_FILE_NAME = "TargetingValidator.js";
    public static final long UID_FETCH_OPERATION_TIMEOUT = 2L;
    public static final int VIDEO_AD_SELECTION_THRESHOLD = 2;
    public static final int VIEWABLE_IMPRESSION_FIRING_PERC_DEFAULT = 50;
    public static final long VIEWABLE_TIME_DISPLAY_AD = 1000L;
    public static final long VIEWABLE_TIME_VIDEO_AD = 2000L;
    public static final String VMAP_CUSTOM_TRACKER_JSON_URL = "https://mercury.akamaized.net/customvmap/[CID].json";
    public static final int WRAPPER_REDIRECTION_THRESHOLD = 6;
    public static final boolean isSSAILoggingEnabled = true;

    static {
        Constants$Companion constants$Companion;
        Companion = constants$Companion = new Constants$Companion(null);
    }
}

