/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.interstitial;

import android.text.TextUtils;
import com.jio.jioads.common.b;
import com.jio.jioads.interstitial.InterstitialViewUtility$ResponseHeaderKeys;
import com.jio.jioads.utils.Constants$ResponseHeaderKeys;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class InterstitialViewUtility$Companion {
    public InterstitialViewUtility$Companion() {
    }

    public /* synthetic */ InterstitialViewUtility$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getStringValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2, Map object) {
        block16: {
            Intrinsics.checkNotNullParameter(string2, "key");
            Object object2 = InterstitialViewUtility$ResponseHeaderKeys.JIO_DATA;
            String string3 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object2)).a();
            Locale locale = Locale.ROOT;
            string3 = string3.toLowerCase(locale);
            String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            boolean bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2) {
                if (object != null) {
                    string2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object2)).a().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string2, string4);
                    boolean bl3 = object.containsKey(string2);
                    if (bl3) {
                        string2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object2)).a().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string2, string4);
                        return (String)object.get(string2);
                    }
                }
            } else if (object != null) {
                string3 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object2)).a().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                bl2 = object.containsKey(string3);
                if (bl2) {
                    try {
                        object2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object2)).a();
                    }
                    catch (Exception exception) {}
                    object2 = ((String)object2).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                    object = object.get(object2);
                    object = (String)object;
                    object2 = new JSONObject((String)object);
                    boolean bl4 = object2.has(string2);
                    if (!bl4) break block16;
                    return object2.getString(string2);
                }
            }
        }
        return "";
    }

    public final long getViewableTime$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(b b2) {
        int n3;
        String string2 = "jioAdView";
        Intrinsics.checkNotNullParameter(b2, string2);
        int n4 = b2.W();
        long l2 = n4 != 0 && n4 == (n3 = 1) ? 2000L : 1000L;
        return l2;
    }

    public final boolean isHtmlResponse(Map object) {
        boolean bl2;
        Locale locale;
        CharSequence charSequence;
        InterstitialViewUtility$ResponseHeaderKeys interstitialViewUtility$ResponseHeaderKeys;
        boolean bl3 = true;
        String string2 = "application/xhtml+xml";
        String string3 = "text/html";
        String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (object != null) {
            interstitialViewUtility$ResponseHeaderKeys = InterstitialViewUtility$ResponseHeaderKeys.Content_Type;
            charSequence = interstitialViewUtility$ResponseHeaderKeys.a();
            locale = Locale.ROOT;
            charSequence = charSequence.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(charSequence, string4);
            boolean bl4 = object.containsKey(charSequence);
            if (bl4) {
                charSequence = Constants$ResponseHeaderKeys.Content_Type.getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(charSequence, string4);
                charSequence = (CharSequence)object.get(charSequence);
                bl4 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl4) {
                    charSequence = interstitialViewUtility$ResponseHeaderKeys.a().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(charSequence, string4);
                    charSequence = object.get(charSequence);
                    Intrinsics.checkNotNull(charSequence);
                    charSequence = charSequence;
                    boolean bl5 = StringsKt.F(charSequence, string3, false);
                    if (!bl5) {
                        string3 = interstitialViewUtility$ResponseHeaderKeys.a().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string3, string4);
                        object = object.get(string3);
                        Intrinsics.checkNotNull(object);
                        object = (CharSequence)object;
                        boolean bl6 = StringsKt.F((CharSequence)object, string2, false);
                        if (!bl6) {
                            bl3 = false;
                        }
                    }
                    return bl3;
                }
            }
        }
        interstitialViewUtility$ResponseHeaderKeys = InterstitialViewUtility$ResponseHeaderKeys.Content_Type;
        charSequence = interstitialViewUtility$ResponseHeaderKeys.a();
        locale = Locale.ROOT;
        charSequence = charSequence.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(charSequence, string4);
        charSequence = this.getStringValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)charSequence, (Map)object);
        if (charSequence != null) {
            bl2 = StringsKt.F(charSequence, string2, false);
        } else {
            bl2 = false;
            string2 = null;
        }
        if (!bl2) {
            boolean bl7;
            string2 = interstitialViewUtility$ResponseHeaderKeys.a().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            object = this.getStringValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, (Map)object);
            if (object != null) {
                bl7 = StringsKt.F((CharSequence)object, string3, false);
            } else {
                bl7 = false;
                object = null;
            }
            if (!bl7) {
                bl3 = false;
            }
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isNativeResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Map object) {
        Object object2;
        Object object3;
        String string2 = "application/json";
        boolean bl2 = false;
        String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (object != null) {
            object3 = InterstitialViewUtility$ResponseHeaderKeys.Content_Type;
            object2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a();
            Locale locale = Locale.ROOT;
            object2 = ((String)object2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            boolean bl3 = object.containsKey(object2);
            if (bl3) {
                object2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object2 = (CharSequence)object.get(object2);
                bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object3 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    object = object.get(object3);
                    Intrinsics.checkNotNull(object);
                    object = (CharSequence)object;
                    return StringsKt.F((CharSequence)object, string2, false);
                }
            }
        }
        object3 = InterstitialViewUtility$ResponseHeaderKeys.Content_Type.a();
        object2 = Locale.ROOT;
        object3 = ((String)object3).toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object = this.getStringValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object3, (Map)object);
        if (object == null) return bl2;
        return StringsKt.F((CharSequence)object, string2, false);
    }

    public final boolean isValidHtml$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        boolean bl2;
        boolean bl3;
        String string3;
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl5 = false;
        if (bl4) {
            return false;
        }
        if (string2 != null && (bl4 = StringsKt.F(string2, string3 = "<html", false)) == (bl3 = true) && (bl2 = StringsKt.F(string2, string3 = "</html>", false)) == bl3) {
            bl5 = true;
        }
        return bl5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isVastResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Map object) {
        Object object2;
        Object object3;
        String string2 = "application/xml";
        boolean bl2 = false;
        String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (object != null) {
            object3 = InterstitialViewUtility$ResponseHeaderKeys.Content_Type;
            object2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a();
            Locale locale = Locale.ROOT;
            object2 = ((String)object2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            boolean bl3 = object.containsKey(object2);
            if (bl3) {
                object2 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object2 = (CharSequence)object.get(object2);
                bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object3 = ((InterstitialViewUtility$ResponseHeaderKeys)((Object)object3)).a().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    object = object.get(object3);
                    Intrinsics.checkNotNull(object);
                    object = (CharSequence)object;
                    return StringsKt.F((CharSequence)object, string2, false);
                }
            }
        }
        object3 = InterstitialViewUtility$ResponseHeaderKeys.Content_Type.a();
        object2 = Locale.ROOT;
        object3 = ((String)object3).toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object = this.getStringValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object3, (Map)object);
        if (object == null) return bl2;
        return StringsKt.F((CharSequence)object, string2, false);
    }
}

