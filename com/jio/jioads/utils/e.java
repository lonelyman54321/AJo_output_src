/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.utils;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.utils.Constants$HeaderKeys;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class e {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int a(HashMap object) {
        Exception exception2;
        String string2;
        block4: {
            String string3;
            int n3;
            block2: {
                boolean bl2;
                block3: {
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Intrinsics.checkNotNullParameter(object, "<this>");
                    n3 = 0;
                    try {
                        Object object2 = Constants$HeaderKeys.JIO_DATA;
                        String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string4 = string4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        boolean bl3 = object.containsKey(string4);
                        string3 = "at";
                        if (!bl3) break block2;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block3;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string3))) return 0;
                return string2.getInt(string3);
            }
            boolean bl4 = object.containsKey(string3);
            if (!bl4) return 0;
            object = object.get(string3);
            if ((object = (String)object) == null) return n3;
            return Integer.parseInt((String)object);
        }
        string2 = "Exception while getting AD_TYPE value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int b(Map object) {
        Exception exception2;
        String string2;
        block9: {
            String string3;
            block7: {
                boolean bl2;
                block8: {
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Object object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    try {
                        object2 = Constants$HeaderKeys.JIO_DATA;
                        String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string4 = string4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        boolean bl3 = object.containsKey(string4);
                        string3 = "adid";
                        if (!bl3) break block7;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block8;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string3))) return 0;
                object = string2.getString(string3);
                Intrinsics.checkNotNull(object);
                int n3 = ((String)object).length();
                if (n3 <= 0) return 0;
                return Integer.parseInt((String)object);
            }
            int n4 = object.containsKey(string3);
            if (n4 == 0) return 0;
            object = object.get(string3);
            if ((object = (String)object) == null) {
                object = "";
            }
            if ((n4 = ((String)object).length()) <= 0) return 0;
            return Integer.parseInt((String)object);
        }
        string2 = "Exception while getting AD_ID value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int c(Map object) {
        Exception exception2;
        String string2;
        block9: {
            String string3;
            block7: {
                boolean bl2;
                block8: {
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Object object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    try {
                        object2 = Constants$HeaderKeys.JIO_DATA;
                        String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string4 = string4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        boolean bl3 = object.containsKey(string4);
                        string3 = "adr";
                        if (!bl3) break block7;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block8;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string3))) return 0;
                object = string2.getString(string3);
                Intrinsics.checkNotNull(object);
                int n3 = ((String)object).length();
                if (n3 <= 0) return 0;
                return Integer.parseInt((String)object);
            }
            int n4 = object.containsKey(string3);
            if (n4 == 0) return 0;
            object = object.get(string3);
            if ((object = (String)object) == null) {
                object = "";
            }
            if ((n4 = ((String)object).length()) <= 0) return 0;
            return Integer.parseInt((String)object);
        }
        string2 = "Exception while getting AD_REFRESH value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String d(HashMap object) {
        Exception exception2;
        String string2;
        String string3;
        block9: {
            String string4;
            block7: {
                boolean bl2;
                block8: {
                    string3 = "";
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Object object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    try {
                        object2 = Constants$HeaderKeys.JIO_DATA;
                        String string5 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string5 = string5.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string5, string2);
                        boolean bl3 = object.containsKey(string5);
                        string4 = "campaignid";
                        if (!bl3) break block7;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block8;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string4))) return string3;
                object = string2.getString(string4);
                Intrinsics.checkNotNull(object);
                int n3 = ((String)object).length();
                if (n3 <= 0) return string3;
                return object;
            }
            int n4 = object.containsKey(string4);
            if (n4 == 0) return string3;
            object = object.get(string4);
            if ((object = (String)object) == null) {
                object = string3;
            }
            if ((n4 = ((String)object).length()) <= 0) return string3;
            return object;
        }
        string2 = "Exception while getting AD_ID value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int e(HashMap object) {
        Exception exception2;
        Object object2;
        block7: {
            String string2;
            int n3;
            block6: {
                object2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullParameter(object, "<this>");
                n3 = 0;
                try {
                    boolean bl2;
                    Object object3 = Constants$HeaderKeys.JIO_DATA;
                    String string3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    Locale locale = Locale.ROOT;
                    string3 = string3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
                    boolean bl3 = object.containsKey(string3);
                    string2 = "skd";
                    if (!bl3) break block6;
                    object3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    object3 = ((String)object3).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    object = object.get(object3);
                    object = (String)object;
                    if (object == null) {
                        object = "{}";
                    }
                    if (!(bl2 = (object2 = new JSONObject((String)object)).has(string2))) return 0;
                }
                catch (Exception exception2) {}
                object = object2.get(string2);
                int n4 = object instanceof Integer;
                if (n4 != 0) {
                    object = (Number)object;
                    return ((Number)object).intValue();
                }
                n4 = object instanceof String;
                if (n4 == 0) return 0;
                object2 = object;
                object2 = (CharSequence)object;
                n4 = object2.length();
                if (n4 <= 0) return 0;
                object = (String)object;
                return Integer.parseInt((String)object);
                break block7;
            }
            int n7 = object.containsKey(string2);
            if (n7 == 0) return 0;
            object = object.get(string2);
            if ((object = (String)object) == null) return n3;
            n7 = ((String)object).length();
            if (n7 != 0) return Integer.parseInt((String)object);
            return n3;
        }
        object2 = "Exception while getting SKIP_DURATION value: ";
        LO1.b((String)object2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int f(Map object) {
        Exception exception2;
        String string2;
        block4: {
            String string3;
            int n3;
            block2: {
                boolean bl2;
                block3: {
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Intrinsics.checkNotNullParameter(object, "<this>");
                    n3 = 0;
                    try {
                        Object object2 = Constants$HeaderKeys.JIO_DATA;
                        String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string4 = string4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        boolean bl3 = object.containsKey(string4);
                        string3 = "blk";
                        if (!bl3) break block2;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block3;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string3))) return 0;
                return string2.getInt(string3);
            }
            boolean bl4 = object.containsKey(string3);
            if (!bl4) return 0;
            object = object.get(string3);
            if ((object = (String)object) == null) return n3;
            return Integer.parseInt((String)object);
        }
        string2 = "Exception while getting Jio_Block value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Long g(HashMap object) {
        String string2;
        Long l2;
        block23: {
            String string3;
            block24: {
                Object object2;
                string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullParameter(object, "<this>");
                l2 = null;
                try {
                    object2 = Constants$HeaderKeys.JIO_DATA;
                }
                catch (Exception exception) {
                    return l2;
                }
                String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                Locale locale = Locale.ROOT;
                string4 = string4.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                boolean bl2 = object.containsKey(string4);
                string2 = "rwin";
                if (!bl2) break block23;
                object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                object2 = ((String)object2).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = object.get(object2);
                object = (String)object;
                if (object != null) break block24;
                object = "{}";
            }
            string3 = new JSONObject((String)object);
            boolean bl3 = string3.has(string2);
            if (!bl3) return l2;
            long l3 = string3.getLong(string2);
            return l3;
        }
        boolean bl4 = object.containsKey(string2);
        if (!bl4) return l2;
        object = object.get(string2);
        object = (String)object;
        if (object == null) return l2;
        long l4 = Long.parseLong((String)object);
        return l4;
    }

    public static final String h(HashMap object) {
        block21: {
            String string2;
            block19: {
                String string3;
                block20: {
                    string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Object object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    try {
                        object2 = Constants$HeaderKeys.JIO_DATA;
                    }
                    catch (Exception exception) {}
                    String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                    Locale locale = Locale.ROOT;
                    string4 = string4.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string4, string3);
                    boolean bl2 = object.containsKey(string4);
                    string2 = "vim";
                    if (!bl2) break block19;
                    object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                    object2 = ((String)object2).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object = object.get(object2);
                    object = (String)object;
                    if (object != null) break block20;
                    object = "{}";
                }
                string3 = new JSONObject((String)object);
                boolean bl3 = string3.has(string2);
                if (!bl3) break block21;
                return string3.getString(string2);
            }
            boolean bl4 = object.containsKey(string2);
            if (!bl4) break block21;
            object = object.get(string2);
            return (String)object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int i(Map object) {
        Exception exception2;
        String string2;
        block9: {
            String string3;
            block7: {
                boolean bl2;
                block8: {
                    string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Object object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    try {
                        object2 = Constants$HeaderKeys.JIO_DATA;
                        String string4 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        Locale locale = Locale.ROOT;
                        string4 = string4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        boolean bl3 = object.containsKey(string4);
                        string3 = "oia";
                        if (!bl3) break block7;
                        object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                        object2 = ((String)object2).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object = object.get(object2);
                        object = (String)object;
                        if (object != null) break block8;
                        object = "{}";
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                if (!(bl2 = (string2 = new JSONObject((String)object)).has(string3))) return 0;
                object = string2.getString(string3);
                Intrinsics.checkNotNull(object);
                int n3 = ((String)object).length();
                if (n3 <= 0) return 0;
                return Integer.parseInt((String)object);
            }
            int n4 = object.containsKey(string3);
            if (n4 == 0) return 0;
            object = object.get(string3);
            if ((object = (String)object) == null) {
                object = "";
            }
            if ((n4 = ((String)object).length()) <= 0) return 0;
            return Integer.parseInt((String)object);
        }
        string2 = "Exception while getting Jio_OPEN_IN_APP value: ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0;
    }
}

