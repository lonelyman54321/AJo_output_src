/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAd$VideoAd$Media;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class JioAd$VideoAd {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    public List g;
    public List h;
    public JioAd$VideoAd$Media i;
    public String j;
    public String k;
    public String l;
    public List m;
    public HashMap n;
    public String o;
    public List p;

    public JioAd$VideoAd(JioAd jioAd) {
    }

    public final String getAdSystem() {
        return this.a;
    }

    public final String getAdSystem$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.a;
    }

    public final String getBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.k;
    }

    public final String getClickThroughUrl() {
        return this.j;
    }

    public final String getClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.j;
    }

    public final List getClickTrackers() {
        return this.m;
    }

    public final List getClickTrackingUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.m;
    }

    public final String getCtaText() {
        return this.o;
    }

    public final String getCtaText$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.o;
    }

    public final String getCtaUrl() {
        return this.l;
    }

    public final String getCtaUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.l;
    }

    public final String getDesc$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.c;
    }

    public final String getDescription() {
        return this.c;
    }

    public final String getDuration() {
        return String.valueOf(this.f);
    }

    public final long getDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.f;
    }

    public final List getErrorTrackers() {
        return this.p;
    }

    public final List getErrorUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.p;
    }

    public final String getId() {
        return this.d;
    }

    public final String getId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.d;
    }

    public final List getImpressionTrackers() {
        return this.g;
    }

    public final List getImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.g;
    }

    public final JioAd$VideoAd$Media getMedia() {
        return this.i;
    }

    public final JioAd$VideoAd$Media getMedia$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.i;
    }

    public final String getSkipOffset() {
        return this.e;
    }

    public final String getSkipOffset$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.e;
    }

    public final String getTitle() {
        return this.b;
    }

    public final String getTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List getTrackingEventUrls(String object) {
        Intrinsics.checkNotNullParameter(object, "event");
        HashMap hashMap = this.n;
        if (hashMap == null) return null;
        Intrinsics.checkNotNull(hashMap);
        boolean bl2 = hashMap.containsKey(object);
        if (!bl2) return null;
        hashMap = this.n;
        Intrinsics.checkNotNull(hashMap);
        return (List)hashMap.get(object);
    }

    public final HashMap getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.n;
    }

    public final HashMap getTrackingEventsUrls() {
        return this.n;
    }

    public final List getViewableImpressionTrackers() {
        return this.h;
    }

    public final List getViewableImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.h;
    }

    public final void setAdSystem$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.a = string2;
    }

    public final void setBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.k = string2;
    }

    public final void setClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.j = string2;
    }

    public final void setClickTrackingUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(List list) {
        this.m = list;
    }

    public final void setCtaText$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.o = string2;
    }

    public final void setCtaUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.l = string2;
    }

    public final void setDesc$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.c = string2;
    }

    public final void setDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(long l2) {
        this.f = l2;
    }

    public final void setErrorUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(List list) {
        this.p = list;
    }

    public final void setId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.d = string2;
    }

    public final void setImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(List list) {
        this.g = list;
    }

    public final void setMedia$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2, String string3, String string4, String string5, String string6, String string7, long l2) {
        JioAd$VideoAd$Media jioAd$VideoAd$Media;
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "delivery");
        Intrinsics.checkNotNullParameter(string4, "bitrate");
        Intrinsics.checkNotNullParameter(string5, "width");
        Intrinsics.checkNotNullParameter(string6, "height");
        Intrinsics.checkNotNullParameter(string7, "type");
        this.i = jioAd$VideoAd$Media = new JioAd$VideoAd$Media(this, string2, string3, string4, string5, string6, string7, l2);
    }

    public final void setSkipOffset$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.e = string2;
    }

    public final void setTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.b = string2;
    }

    public final void setTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(HashMap hashMap) {
        this.n = hashMap;
    }

    public final void setViewableImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(List list) {
        this.h = list;
    }
}

