/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.DynamicHeightSearchAdRequest;
import com.google.android.gms.ads.search.zzb;

public final class DynamicHeightSearchAdRequest$Builder {
    private final zzb zza;
    private final Bundle zzb;

    public DynamicHeightSearchAdRequest$Builder() {
        zzb zzb2;
        this.zza = zzb2 = new zzb();
        this.zzb = zzb2;
    }

    public static /* bridge */ /* synthetic */ zzb zza(DynamicHeightSearchAdRequest$Builder dynamicHeightSearchAdRequest$Builder) {
        return dynamicHeightSearchAdRequest$Builder.zza;
    }

    public DynamicHeightSearchAdRequest$Builder addCustomEventExtrasBundle(Class clazz, Bundle bundle) {
        this.zza.zzb(clazz, bundle);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder addNetworkExtras(NetworkExtras networkExtras) {
        this.zza.zzc(networkExtras);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder addNetworkExtrasBundle(Class clazz, Bundle bundle) {
        this.zza.zzd(clazz, bundle);
        return this;
    }

    public DynamicHeightSearchAdRequest build() {
        Object object = this.zza;
        Bundle bundle = this.zzb;
        ((zzb)object).zzd(AdMobAdapter.class, bundle);
        object = new DynamicHeightSearchAdRequest(this, null);
        return object;
    }

    public DynamicHeightSearchAdRequest$Builder setAdBorderSelectors(String string2) {
        this.zzb.putString("csa_adBorderSelectors", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setAdTest(boolean bl2) {
        boolean bl3 = true;
        String string2 = bl3 != bl2 ? "off" : "on";
        this.zzb.putString("csa_adtest", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setAdjustableLineHeight(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_adjustableLineHeight", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setAdvancedOptionValue(String string2, String string3) {
        this.zzb.putString(string2, string3);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setAttributionSpacingBelow(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_attributionSpacingBelow", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setBorderSelections(String string2) {
        this.zzb.putString("csa_borderSelections", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setChannel(String string2) {
        this.zzb.putString("csa_channel", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorAdBorder(String string2) {
        this.zzb.putString("csa_colorAdBorder", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorAdSeparator(String string2) {
        this.zzb.putString("csa_colorAdSeparator", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorAnnotation(String string2) {
        this.zzb.putString("csa_colorAnnotation", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorAttribution(String string2) {
        this.zzb.putString("csa_colorAttribution", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorBackground(String string2) {
        this.zzb.putString("csa_colorBackground", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorBorder(String string2) {
        this.zzb.putString("csa_colorBorder", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorDomainLink(String string2) {
        this.zzb.putString("csa_colorDomainLink", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorText(String string2) {
        this.zzb.putString("csa_colorText", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setColorTitleLink(String string2) {
        this.zzb.putString("csa_colorTitleLink", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setCssWidth(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_width", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setDetailedAttribution(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_detailedAttribution", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontFamily(String string2) {
        this.zzb.putString("csa_fontFamily", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontFamilyAttribution(String string2) {
        this.zzb.putString("csa_fontFamilyAttribution", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontSizeAnnotation(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeAnnotation", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontSizeAttribution(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeAttribution", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontSizeDescription(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeDescription", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontSizeDomainLink(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeDomainLink", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setFontSizeTitle(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeTitle", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setHostLanguage(String string2) {
        this.zzb.putString("csa_hl", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsClickToCallEnabled(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_clickToCall", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsLocationEnabled(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_location", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsPlusOnesEnabled(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_plusOnes", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsSellerRatingsEnabled(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_sellerRatings", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsSiteLinksEnabled(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_siteLinks", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsTitleBold(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_titleBold", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setIsTitleUnderlined(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2 ^= true);
        bundle.putString("csa_noTitleUnderline", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setLocationColor(String string2) {
        this.zzb.putString("csa_colorLocation", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setLocationFontSize(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_fontSizeLocation", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setLongerHeadlines(boolean bl2) {
        Bundle bundle = this.zzb;
        String string2 = Boolean.toString(bl2);
        bundle.putString("csa_longerHeadlines", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setNumber(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_number", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setPage(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_adPage", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setQuery(String string2) {
        this.zza.zze(string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setStyleId(String string2) {
        this.zzb.putString("csa_styleId", string2);
        return this;
    }

    public DynamicHeightSearchAdRequest$Builder setVerticalSpacing(int n3) {
        Bundle bundle = this.zzb;
        String string2 = Integer.toString(n3);
        bundle.putString("csa_verticalSpacing", string2);
        return this;
    }
}

