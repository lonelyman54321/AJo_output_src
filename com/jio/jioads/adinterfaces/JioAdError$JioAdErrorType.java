/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public final class JioAdError$JioAdErrorType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ JioAdError$JioAdErrorType[] $VALUES;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_ADPOD_TIMEOUT;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_ADSPOT_NOT_LINKED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_AD_DOWNLOADING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_AD_SPOT_DOES_NOT_EXIST;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_CACHE_AD;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_CACHE_AD_TIMEOUT;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_DAILY_CLICK_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_DAILY_IMPRESSION_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_DAILY_VIEW_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_FETCHING_UID;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_HOUR_CLICK_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_HOUR_IMPRESSION_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_HOUR_VIEW_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IMAGE_DOWNLOAD;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_INSUFFICIENT_ELEMENTS;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_INTERNET_NOT_AVAILABLE;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_INVALID_AD_REQUEST_PARAMETERS;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_INVALID_RESTRICTED_ORIGIN_REQUEST;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_ADJUSTING_ASPECT_RATIO;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_AD_CLICK;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_AD_PARAM_RENDERING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_CTA_RENDERING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_FIRING_TRACKERS;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_JS_TARGETING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_LOAD_AD;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_MEDIATION;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_REQUEST_MASTER_CONFIG;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_SKIP_RENDERING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_IN_VMAP_BUILDER;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_LIFETIME_CLICK_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_LIFETIME_IMPRESSION_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_LIFETIME_VIEW_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MANDATORY_PARAM_MISSING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MEDIA_FILES_EMPTY;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MINUTE_CLICK_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MINUTE_IMPRESSION_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MINUTE_VIEW_LIMIT_REACHED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_MISMATCH_AD_TYPE;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_NETWORK_ERROR;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_NOFILL;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_OS_INVALID;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_PARSING;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_PLAYER_PREPARATION_FAILED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_RENDITION_ERROR;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_REQUEST_BLOCKED;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_RESTRICTED_API;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_TIMEOUT;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_UA_INVALID;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_VIDEO_TIMEOUT;
    public static final /* enum */ JioAdError$JioAdErrorType ERROR_WRONG_AD_SIZE;
    public static final /* enum */ JioAdError$JioAdErrorType IO_ERROR;
    public static final /* enum */ JioAdError$JioAdErrorType SPOT_AD;
    public static final /* enum */ JioAdError$JioAdErrorType WRAPPER_NOFILL;
    private final String errorCode;
    private final String errorDescription;
    private final String errorTitle;

    static {
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType2;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType3;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType4;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType5;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType6;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType7;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType8;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType9;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType10;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType11;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType12;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType13;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType14;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType15;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType16;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType17;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType18;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType19;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType20;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType21;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType22;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType23;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType24;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType25;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType26;
        Enum[] enumArray;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType27;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType28;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType29;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType30;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType31;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType32;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType33;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType34;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType35;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType36;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType37;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType38 = jioAdError$JioAdErrorType37;
        ERROR_FETCHING_UID = jioAdError$JioAdErrorType37 = new JioAdError$JioAdErrorType(0, "ERROR_FETCHING_UID", "m101", "Error while fetching UID", "Error while fetching UID");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType39 = jioAdError$JioAdErrorType38;
        ERROR_NOFILL = jioAdError$JioAdErrorType38 = new JioAdError$JioAdErrorType(1, "ERROR_NOFILL", "m102", "No Fill", "No ads in inventory");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType40 = jioAdError$JioAdErrorType36;
        ERROR_INTERNET_NOT_AVAILABLE = jioAdError$JioAdErrorType36 = new JioAdError$JioAdErrorType(2, "ERROR_INTERNET_NOT_AVAILABLE", "m103", "Internet Is Not Available", "Not connected to the internet");
        jioAdError$JioAdErrorType39 = jioAdError$JioAdErrorType35;
        ERROR_TIMEOUT = jioAdError$JioAdErrorType35 = new JioAdError$JioAdErrorType(3, "ERROR_TIMEOUT", "m104", "Timeout while fetching ad", "Timeout while fetching media file");
        jioAdError$JioAdErrorType40 = jioAdError$JioAdErrorType34;
        ERROR_MISMATCH_AD_TYPE = jioAdError$JioAdErrorType34 = new JioAdError$JioAdErrorType(4, "ERROR_MISMATCH_AD_TYPE", "m105", "Wrong UX type", "Wrong ad type passed");
        jioAdError$JioAdErrorType39 = jioAdError$JioAdErrorType33;
        ERROR_NETWORK_ERROR = jioAdError$JioAdErrorType33 = new JioAdError$JioAdErrorType(5, "ERROR_NETWORK_ERROR", "m106", "Network Error", "Error while network call");
        jioAdError$JioAdErrorType40 = jioAdError$JioAdErrorType32;
        ERROR_MANDATORY_PARAM_MISSING = jioAdError$JioAdErrorType32 = new JioAdError$JioAdErrorType(6, "ERROR_MANDATORY_PARAM_MISSING", "m107", "Mandatory params missing", null);
        jioAdError$JioAdErrorType39 = jioAdError$JioAdErrorType40;
        ERROR_RENDITION_ERROR = jioAdError$JioAdErrorType40 = new JioAdError$JioAdErrorType(7, "ERROR_RENDITION_ERROR", "m108", "Ad rendition error", "Error while rendering ad");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType41 = jioAdError$JioAdErrorType39;
        ERROR_PARSING = jioAdError$JioAdErrorType39 = new JioAdError$JioAdErrorType(8, "ERROR_PARSING", "m109", "Parsing error", "No ads in inventory");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType42 = jioAdError$JioAdErrorType31;
        ERROR_CACHE_AD = jioAdError$JioAdErrorType31 = new JioAdError$JioAdErrorType(9, "ERROR_CACHE_AD", "m110", "CacheAd failed", null);
        jioAdError$JioAdErrorType41 = jioAdError$JioAdErrorType30;
        ERROR_AD_DOWNLOADING = jioAdError$JioAdErrorType30 = new JioAdError$JioAdErrorType(10, "ERROR_AD_DOWNLOADING", "m111", "Error while downloading ad", null);
        jioAdError$JioAdErrorType42 = jioAdError$JioAdErrorType29;
        ERROR_AD_SPOT_DOES_NOT_EXIST = jioAdError$JioAdErrorType29 = new JioAdError$JioAdErrorType(11, "ERROR_AD_SPOT_DOES_NOT_EXIST", "m112", "Ad Spot doesn't exists", null);
        jioAdError$JioAdErrorType41 = jioAdError$JioAdErrorType28;
        ERROR_REQUEST_BLOCKED = jioAdError$JioAdErrorType28 = new JioAdError$JioAdErrorType(12, "ERROR_REQUEST_BLOCKED", "m113", "AD request not allowed", null);
        jioAdError$JioAdErrorType42 = jioAdError$JioAdErrorType27;
        ERROR_ADSPOT_NOT_LINKED = jioAdError$JioAdErrorType27 = new JioAdError$JioAdErrorType(13, "ERROR_ADSPOT_NOT_LINKED", "m114", "AD Spot not linked to application", null);
        jioAdError$JioAdErrorType41 = jioAdError$JioAdErrorType42;
        ERROR_INVALID_RESTRICTED_ORIGIN_REQUEST = jioAdError$JioAdErrorType42 = new JioAdError$JioAdErrorType(14, "ERROR_INVALID_RESTRICTED_ORIGIN_REQUEST", "m115", "Request from Invalid/restricted origin", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType43 = jioAdError$JioAdErrorType41;
        ERROR_UA_INVALID = jioAdError$JioAdErrorType41 = new JioAdError$JioAdErrorType(15, "ERROR_UA_INVALID", "m116", "UA is Invalid/doesn't exist", null);
        Enum[] enumArray2 = enumArray;
        enumArray = new JioAdError$JioAdErrorType(16, "ERROR_OS_INVALID", "m117", "OS is Invalid/doesn't exist", null);
        ERROR_OS_INVALID = enumArray;
        jioAdError$JioAdErrorType43 = jioAdError$JioAdErrorType26;
        ERROR_ADPOD_TIMEOUT = jioAdError$JioAdErrorType26 = new JioAdError$JioAdErrorType(17, "ERROR_ADPOD_TIMEOUT", "m118", "Ad Pod timeout error", null);
        enumArray2 = jioAdError$JioAdErrorType25;
        ERROR_RESTRICTED_API = jioAdError$JioAdErrorType25 = new JioAdError$JioAdErrorType(18, "ERROR_RESTRICTED_API", "m119", "Restricted API, please make your app as trusted app from JioAds dashboard", "Restricted API, please make your app as trusted app from JioAds dashboard");
        jioAdError$JioAdErrorType43 = jioAdError$JioAdErrorType24;
        ERROR_PLAYER_PREPARATION_FAILED = jioAdError$JioAdErrorType24 = new JioAdError$JioAdErrorType(19, "ERROR_PLAYER_PREPARATION_FAILED", "m120", "Player preparation failed", null);
        enumArray2 = jioAdError$JioAdErrorType23;
        ERROR_DAILY_IMPRESSION_LIMIT_REACHED = jioAdError$JioAdErrorType23 = new JioAdError$JioAdErrorType(20, "ERROR_DAILY_IMPRESSION_LIMIT_REACHED", "m121", "User daily impression limit reached", null);
        jioAdError$JioAdErrorType43 = enumArray2;
        enumArray2 = new JioAdError$JioAdErrorType(21, "ERROR_LIFETIME_IMPRESSION_LIMIT_REACHED", "m122", "user lifetime impression limit reached", null);
        ERROR_LIFETIME_IMPRESSION_LIMIT_REACHED = enumArray2;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType44 = jioAdError$JioAdErrorType43;
        ERROR_DAILY_CLICK_LIMIT_REACHED = jioAdError$JioAdErrorType43 = new JioAdError$JioAdErrorType(22, "ERROR_DAILY_CLICK_LIMIT_REACHED", "m123", "user click daily limit reached", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType45 = jioAdError$JioAdErrorType22;
        ERROR_LIFETIME_CLICK_LIMIT_REACHED = jioAdError$JioAdErrorType22 = new JioAdError$JioAdErrorType(23, "ERROR_LIFETIME_CLICK_LIMIT_REACHED", "m124", "user click lifetime limit reached", null);
        jioAdError$JioAdErrorType44 = jioAdError$JioAdErrorType21;
        ERROR_DAILY_VIEW_LIMIT_REACHED = jioAdError$JioAdErrorType21 = new JioAdError$JioAdErrorType(24, "ERROR_DAILY_VIEW_LIMIT_REACHED", "m125", "user completed view daily limit reached", null);
        jioAdError$JioAdErrorType45 = jioAdError$JioAdErrorType20;
        ERROR_LIFETIME_VIEW_LIMIT_REACHED = jioAdError$JioAdErrorType20 = new JioAdError$JioAdErrorType(25, "ERROR_LIFETIME_VIEW_LIMIT_REACHED", "m126", "user completed view lifetime limit reached", null);
        jioAdError$JioAdErrorType44 = jioAdError$JioAdErrorType19;
        ERROR_MINUTE_IMPRESSION_LIMIT_REACHED = jioAdError$JioAdErrorType19 = new JioAdError$JioAdErrorType(26, "ERROR_MINUTE_IMPRESSION_LIMIT_REACHED", "m127", "user minute wise impression limit reached", null);
        jioAdError$JioAdErrorType45 = jioAdError$JioAdErrorType18;
        ERROR_HOUR_IMPRESSION_LIMIT_REACHED = jioAdError$JioAdErrorType18 = new JioAdError$JioAdErrorType(27, "ERROR_HOUR_IMPRESSION_LIMIT_REACHED", "m128", "user hourly impression limit reached", null);
        jioAdError$JioAdErrorType44 = jioAdError$JioAdErrorType45;
        ERROR_MINUTE_CLICK_LIMIT_REACHED = jioAdError$JioAdErrorType45 = new JioAdError$JioAdErrorType(28, "ERROR_MINUTE_CLICK_LIMIT_REACHED", "m129", "user click minute wise limit reached", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType46 = jioAdError$JioAdErrorType44;
        ERROR_HOUR_CLICK_LIMIT_REACHED = jioAdError$JioAdErrorType44 = new JioAdError$JioAdErrorType(29, "ERROR_HOUR_CLICK_LIMIT_REACHED", "m130", "user click hourly limit reached", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType47 = jioAdError$JioAdErrorType17;
        ERROR_MINUTE_VIEW_LIMIT_REACHED = jioAdError$JioAdErrorType17 = new JioAdError$JioAdErrorType(30, "ERROR_MINUTE_VIEW_LIMIT_REACHED", "m131", "user completed view minute wise limit reached", null);
        jioAdError$JioAdErrorType46 = jioAdError$JioAdErrorType16;
        ERROR_HOUR_VIEW_LIMIT_REACHED = jioAdError$JioAdErrorType16 = new JioAdError$JioAdErrorType(31, "ERROR_HOUR_VIEW_LIMIT_REACHED", "m132", "user completed view hourly limit reached", null);
        jioAdError$JioAdErrorType47 = jioAdError$JioAdErrorType15;
        ERROR_INVALID_AD_REQUEST_PARAMETERS = jioAdError$JioAdErrorType15 = new JioAdError$JioAdErrorType(32, "ERROR_INVALID_AD_REQUEST_PARAMETERS", "m133", "Invalid Ad Request Parameters", null);
        jioAdError$JioAdErrorType46 = jioAdError$JioAdErrorType14;
        ERROR_IN_REQUEST_MASTER_CONFIG = jioAdError$JioAdErrorType14 = new JioAdError$JioAdErrorType(33, "ERROR_IN_REQUEST_MASTER_CONFIG", "m134", "Master Config Download failed", null);
        jioAdError$JioAdErrorType47 = jioAdError$JioAdErrorType13;
        ERROR_IN_AD_CLICK = jioAdError$JioAdErrorType13 = new JioAdError$JioAdErrorType(34, "ERROR_IN_AD_CLICK", "m135", "Error during CTA click", "Error while ad click");
        jioAdError$JioAdErrorType46 = jioAdError$JioAdErrorType47;
        ERROR_IN_MEDIATION = jioAdError$JioAdErrorType47 = new JioAdError$JioAdErrorType(35, "ERROR_IN_MEDIATION", "m136", "Mediation Error", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType48 = jioAdError$JioAdErrorType46;
        ERROR_IN_JS_TARGETING = jioAdError$JioAdErrorType46 = new JioAdError$JioAdErrorType(36, "ERROR_IN_JS_TARGETING", "m137", "JS Exception during targeting", null);
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType49 = jioAdError$JioAdErrorType12;
        ERROR_IN_VMAP_BUILDER = jioAdError$JioAdErrorType12 = new JioAdError$JioAdErrorType(37, "ERROR_IN_VMAP_BUILDER", "m138", "VMAP builder error", null);
        jioAdError$JioAdErrorType48 = jioAdError$JioAdErrorType11;
        ERROR_IN_LOAD_AD = jioAdError$JioAdErrorType11 = new JioAdError$JioAdErrorType(38, "ERROR_IN_LOAD_AD", "m139", "LoadAd failed", null);
        jioAdError$JioAdErrorType49 = jioAdError$JioAdErrorType10;
        ERROR_VIDEO_TIMEOUT = jioAdError$JioAdErrorType10 = new JioAdError$JioAdErrorType(39, "ERROR_VIDEO_TIMEOUT", "m140", "Video Ad Timeout Error", null);
        jioAdError$JioAdErrorType48 = jioAdError$JioAdErrorType9;
        ERROR_IMAGE_DOWNLOAD = jioAdError$JioAdErrorType9 = new JioAdError$JioAdErrorType(40, "ERROR_IMAGE_DOWNLOAD", "m141", "Image file failed to download", null);
        jioAdError$JioAdErrorType49 = jioAdError$JioAdErrorType8;
        ERROR_WRONG_AD_SIZE = jioAdError$JioAdErrorType8 = new JioAdError$JioAdErrorType(41, "ERROR_WRONG_AD_SIZE", "m142", "Wrong Ad size received", "");
        jioAdError$JioAdErrorType48 = jioAdError$JioAdErrorType49;
        WRAPPER_NOFILL = jioAdError$JioAdErrorType49 = new JioAdError$JioAdErrorType(42, "WRAPPER_NOFILL", "m143", "Wrapper NO Fill", "Wrapper Ads Not Available");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType50 = jioAdError$JioAdErrorType48;
        ERROR_CACHE_AD_TIMEOUT = jioAdError$JioAdErrorType48 = new JioAdError$JioAdErrorType(43, "ERROR_CACHE_AD_TIMEOUT", "m144", "Cache Ad Timeout", "Timeout while caching ad");
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType51 = jioAdError$JioAdErrorType7;
        ERROR_IN_CTA_RENDERING = jioAdError$JioAdErrorType7 = new JioAdError$JioAdErrorType(44, "ERROR_IN_CTA_RENDERING", "m145", "Error In Cta Rendering", "Error while rendering cta button");
        jioAdError$JioAdErrorType50 = jioAdError$JioAdErrorType6;
        ERROR_IN_SKIP_RENDERING = jioAdError$JioAdErrorType6 = new JioAdError$JioAdErrorType(45, "ERROR_IN_SKIP_RENDERING", "m146", "Error In SKIP Rendering", "Error while rendering skip button");
        jioAdError$JioAdErrorType51 = jioAdError$JioAdErrorType5;
        ERROR_IN_AD_PARAM_RENDERING = jioAdError$JioAdErrorType5 = new JioAdError$JioAdErrorType(46, "ERROR_IN_AD_PARAM_RENDERING", "m147", "Error In AdParams Rendering", "Error while rendering skip button");
        jioAdError$JioAdErrorType50 = jioAdError$JioAdErrorType4;
        ERROR_IN_ADJUSTING_ASPECT_RATIO = jioAdError$JioAdErrorType4 = new JioAdError$JioAdErrorType(47, "ERROR_IN_ADJUSTING_ASPECT_RATIO", "m148", "Error In Adjusting Aspect Ratio", "Error while adjusting aspect ratio");
        jioAdError$JioAdErrorType51 = jioAdError$JioAdErrorType3;
        ERROR_IN_FIRING_TRACKERS = jioAdError$JioAdErrorType3 = new JioAdError$JioAdErrorType(48, "ERROR_IN_FIRING_TRACKERS", "m149", "Error In Firing Trackers", "Error while firing trackers");
        jioAdError$JioAdErrorType50 = jioAdError$JioAdErrorType51;
        ERROR_MEDIA_FILES_EMPTY = jioAdError$JioAdErrorType51 = new JioAdError$JioAdErrorType(49, "ERROR_MEDIA_FILES_EMPTY", "m150", "All ad media file are empty", "");
        ERROR_INSUFFICIENT_ELEMENTS = jioAdError$JioAdErrorType50 = new JioAdError$JioAdErrorType(50, "ERROR_INSUFFICIENT_ELEMENTS", "m151", "Insufficient Element", "Insufficient element present in ad response");
        IO_ERROR = jioAdError$JioAdErrorType2 = new JioAdError$JioAdErrorType(51, "IO_ERROR", "s101", "IOException while network call", null);
        SPOT_AD = jioAdError$JioAdErrorType = new JioAdError$JioAdErrorType(52, "SPOT_AD", "s102", "Spot Ads Failure", null);
        Enum[] enumArray3 = enumArray;
        enumArray = new JioAdError$JioAdErrorType[]{jioAdError$JioAdErrorType37, jioAdError$JioAdErrorType38, jioAdError$JioAdErrorType36, jioAdError$JioAdErrorType35, jioAdError$JioAdErrorType34, jioAdError$JioAdErrorType33, jioAdError$JioAdErrorType32, jioAdError$JioAdErrorType40, jioAdError$JioAdErrorType39, jioAdError$JioAdErrorType31, jioAdError$JioAdErrorType30, jioAdError$JioAdErrorType29, jioAdError$JioAdErrorType28, jioAdError$JioAdErrorType27, jioAdError$JioAdErrorType42, jioAdError$JioAdErrorType41, enumArray3, jioAdError$JioAdErrorType26, jioAdError$JioAdErrorType25, jioAdError$JioAdErrorType24, jioAdError$JioAdErrorType23, enumArray2, jioAdError$JioAdErrorType43, jioAdError$JioAdErrorType22, jioAdError$JioAdErrorType21, jioAdError$JioAdErrorType20, jioAdError$JioAdErrorType19, jioAdError$JioAdErrorType18, jioAdError$JioAdErrorType45, jioAdError$JioAdErrorType44, jioAdError$JioAdErrorType17, jioAdError$JioAdErrorType16, jioAdError$JioAdErrorType15, jioAdError$JioAdErrorType14, jioAdError$JioAdErrorType13, jioAdError$JioAdErrorType47, jioAdError$JioAdErrorType46, jioAdError$JioAdErrorType12, jioAdError$JioAdErrorType11, jioAdError$JioAdErrorType10, jioAdError$JioAdErrorType9, jioAdError$JioAdErrorType8, jioAdError$JioAdErrorType49, jioAdError$JioAdErrorType48, jioAdError$JioAdErrorType7, jioAdError$JioAdErrorType6, jioAdError$JioAdErrorType5, jioAdError$JioAdErrorType4, jioAdError$JioAdErrorType3, jioAdError$JioAdErrorType51, jioAdError$JioAdErrorType50, jioAdError$JioAdErrorType2, jioAdError$JioAdErrorType};
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public JioAdError$JioAdErrorType(String string3) {
        void var5_3;
        void var4_2;
        void var1_-1;
        void var2_-1;
        this.errorCode = string3;
        this.errorTitle = var4_2;
        this.errorDescription = var5_3;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static JioAdError$JioAdErrorType valueOf(String string2) {
        return Enum.valueOf(JioAdError$JioAdErrorType.class, string2);
    }

    public static JioAdError$JioAdErrorType[] values() {
        return (JioAdError$JioAdErrorType[])$VALUES.clone();
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }
}

