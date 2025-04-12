/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAd$NativeAd;
import com.jio.jioads.adinterfaces.JioAd$VideoAd;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.n_0;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.jioreel.ssai.b;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.i;
import com.jio.jioads.utils.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AdEventTracker {
    public final Context a;
    public final JioAdView b;
    public final JioAd c;
    public final c d;
    public boolean e;
    public final HashMap f;

    public AdEventTracker(Context object, JioAdView jioAdView, JioAd jioAd, com.jio.jioads.controller.a a2, c c2) {
        Intrinsics.checkNotNullParameter(object, "mContext");
        Intrinsics.checkNotNullParameter(jioAdView, "mJioAdView");
        Intrinsics.checkNotNullParameter(jioAd, "mJioAd");
        Intrinsics.checkNotNullParameter(a2, "mJioAdViewListener");
        this.a = object;
        this.b = jioAdView;
        this.c = jioAd;
        this.d = c2;
        this.f = object;
    }

    public static final /* synthetic */ void access$fireEvent(AdEventTracker adEventTracker, String string2, List list) {
        adEventTracker.a(string2, list);
    }

    public static final /* synthetic */ JioAdView access$getMJioAdView$p(AdEventTracker adEventTracker) {
        return adEventTracker.b;
    }

    public final void a(String string2, List list) {
        boolean bl2;
        AdEventTracker adEventTracker = this;
        Object object = string2;
        int n3 = 1;
        String string3 = "message";
        if (list != null && (bl2 = list.isEmpty() ^ n3)) {
            boolean bl3;
            Object object2;
            Object object3;
            Iterator iterator = list.iterator();
            boolean bl32 = false;
            Object object4 = null;
            int n4 = 0;
            while (true) {
                int n7;
                Object object5;
                boolean bl4 = iterator.hasNext();
                object3 = "impression";
                object2 = null;
                if (!bl4) break;
                String string4 = (String)iterator.next();
                boolean bl5 = TextUtils.isEmpty((CharSequence)string4);
                if (bl5 || (bl5 = ((HashMap)(object5 = adEventTracker.f)).containsKey(string4))) continue;
                object4 = adEventTracker.a;
                boolean bl6 = kotlin.text.b.i((String)object, (String)object3, n3 != 0);
                object5 = i.a;
                Object object6 = adEventTracker.d;
                boolean bl7 = i.l((c)object6);
                String string5 = "[frt]";
                n7 = string4 != null && (n7 = StringsKt.F(string4, string5, false)) == n3 ? 1 : 0;
                Object object7 = adEventTracker.a;
                if (object7 != null && bl7 && n7 != 0) {
                    i.g = n4 += n3;
                }
                if (object4 != null && bl6 && bl7 && n7 != 0) {
                    object3 = new StringBuilder("fre=");
                    object6 = adEventTracker.d;
                    if (object6 != null) {
                        object6 = ((f)object6).j();
                    } else {
                        bl7 = false;
                        object6 = null;
                    }
                    ((StringBuilder)object3).append(object6);
                    object6 = "&[frt]";
                    ((StringBuilder)object3).append((String)object6);
                    object3 = ((StringBuilder)object3).toString();
                    if (string4 != null) {
                        string4 = kotlin.text.b.n(string4, string5, (String)object3, false);
                    } else {
                        bl4 = false;
                        string4 = null;
                    }
                    object3 = adEventTracker.b.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object6 = adEventTracker.d;
                    string4 = ((i)object5).m((Context)object4, string4, (String)object3, (c)object6);
                }
                object4 = new StringBuilder();
                object3 = adEventTracker.b.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append(": Firing ");
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append(" from JioAdTracker for url = ");
                ir3_0.b((StringBuilder)object4, string4, string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.NONE;
                object4 = adEventTracker.f;
                Intrinsics.checkNotNull(string4);
                object3 = Boolean.TRUE;
                ((HashMap)object4).put(string4, object3);
                object4 = adEventTracker.a;
                object5 = new com.jio.jioads.network.c((Context)object4);
                bl3 = string4.length() - n3;
                bl6 = false;
                object3 = null;
                bl7 = false;
                object6 = null;
                while (bl6 <= bl3) {
                    boolean bl8 = !bl7 ? bl6 : bl3;
                    bl8 = string4.charAt((int)(bl8 ? 1 : 0)) != 0;
                    n7 = 32;
                    if ((bl8 = Intrinsics.compare((int)(bl8 ? 1 : 0), n7)) <= false) {
                        bl8 = true;
                    } else {
                        bl8 = false;
                        string5 = null;
                    }
                    if (!bl7) {
                        if (!bl8) {
                            bl7 = true;
                            continue;
                        }
                        bl6 += n3;
                        continue;
                    }
                    if (!bl8) break;
                    bl3 += -1;
                }
                string5 = com.jio.jioads.adinterfaces.a.a((int)(bl3 ? 1 : 0), n3, (int)(bl6 ? 1 : 0), string4);
                object4 = Utility.INSTANCE;
                string4 = adEventTracker.a;
                object7 = ((Utility)object4).getUserAgentHeader((Context)string4);
                Integer n8 = 0;
                object4 = adEventTracker.d;
                if (object4 != null) {
                    object4 = ((f)object4).a;
                    bl3 = ((o)object4).a();
                    object2 = bl3;
                }
                n7 = 0;
                bl7 = false;
                object6 = null;
                ((com.jio.jioads.network.c)object5).b(0, string5, null, (Map)object7, n8, null, (Boolean)object2);
                bl3 = true;
            }
            if (bl3) {
                int n10;
                int n14;
                String string6;
                int n15;
                n3 = string2.hashCode();
                if (n3 != (n15 = -599445191)) {
                    n15 = 65197416;
                    if (n3 != n15) {
                        boolean bl9;
                        n15 = 120623625;
                        if (n3 == n15 && (bl9 = ((String)object).equals(object3))) {
                            object2 = "i";
                        }
                    } else {
                        string6 = "Click";
                        boolean bl10 = ((String)object).equals(string6);
                        if (bl10) {
                            object2 = "c";
                        }
                    }
                } else {
                    string6 = "complete";
                    boolean bl11 = ((String)object).equals(string6);
                    if (bl11) {
                        object2 = "cv";
                    }
                }
                if (object2 != null && (n14 = ((String)object2).length()) != 0 && (object = adEventTracker.d) != null && (object = adEventTracker.c.getCampaignId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null && (n10 = ((String)object).length()) != 0) {
                    object = adEventTracker.d;
                    string6 = adEventTracker.c.getCampaignId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    Intrinsics.checkNotNull(string6);
                    object = (f)object;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(string6, "campaignid");
                    string3 = "type";
                    Intrinsics.checkNotNullParameter(object2, string3);
                    object = ((f)object).a;
                    ((o)object).v(string6, (String)object2);
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            String string7 = adEventTracker.b.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            stringBuilder.append(string7);
            string7 = ": No urls are available for firing ";
            stringBuilder.append(string7);
            stringBuilder.append((String)object);
            stringBuilder.append(" from JioAdTracker");
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void destroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        this.e = true;
    }

    /*
     * Unable to fully structure code
     */
    public final void trackClick() {
        block25: {
            block22: {
                block24: {
                    block23: {
                        var1_1 = new StringBuilder();
                        var2_2 = this.b;
                        var3_3 = ": publisher called jioAd.adEventTracker.trackClick()";
                        j_0.h((JioAdView)var2_2, (StringBuilder)var1_1, (String)var3_3);
                        var1_1 = JioAds.Companion;
                        var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var2_2 = JioAds$LogLevel.NONE;
                        var4_4 = this.e;
                        if (var4_4 != 0) break block22;
                        var1_1 = this.c;
                        var5_5 = var1_1.getAdCategory();
                        var4_4 = 5;
                        var3_3 = null;
                        if (var5_5 != var4_4) break block23;
                        var1_1 = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var1_1 != null) {
                            var1_1 = var1_1.getClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        if (var1_1 == null) ** GOTO lbl-1000
                        var1_1 = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var1_1 != null) {
                            var1_1 = var1_1.getClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        Intrinsics.checkNotNull(var1_1);
                        var5_5 = var1_1.length();
                        if (var5_5 > 0) {
                            var1_1 = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (var1_1 != null) {
                                var1_1 = var1_1.getClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            } else {
                                var5_5 = 0;
                                var1_1 = null;
                            }
                            Intrinsics.checkNotNull(var1_1);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        var2_2 = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var2_2 != null) {
                            var2_2 = var2_2.getBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var4_4 = 0;
                            var2_2 = null;
                        }
                        var6_6 = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var6_6 != null) {
                            var6_6 = var6_6.getClickTrackingUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var7_8 = var1_1;
                            var8_9 = var2_2;
                            var9_10 = null;
                            var3_3 = var6_6;
                        } else {
                            var7_8 = var1_1;
                            var8_9 = var2_2;
                            var9_10 = null;
                        }
                        break block24;
                    }
                    var1_1 = this.c;
                    var5_5 = var1_1.getAdCategory();
                    if (var5_5 != (var4_4 = 7) && (var5_5 = (var1_1 = this.c).getAdCategory()) != (var4_4 = 8)) {
                        var8_9 = null;
                        var7_8 = null;
                        var9_10 = null;
                    } else {
                        var1_1 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var1_1 != null) {
                            var1_1 = var1_1.getClickTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var5_5 = 0;
                            var1_1 = null;
                        }
                        var2_2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var2_2 != null) {
                            var2_2 = var2_2.getCtaUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var4_4 = 0;
                            var2_2 = null;
                        }
                        var6_6 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var6_6 = var6_6 != null ? var6_6.getBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
                        var10_11 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var10_11 != null) {
                            var3_3 = var10_11.getLinkFallback$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        var7_8 = var2_2;
                        var9_10 = var3_3;
                        var8_9 = var6_6;
                        var3_3 = var1_1;
                    }
                }
                var1_1 = this.c;
                var5_5 = var1_1.getAdCategory();
                var4_4 = 1;
                if (var5_5 != var4_4) {
                    var1_1 = this.c;
                    var1_1.getAdCategory();
                }
                var10_11 = this.a;
                var11_12 = new n_0(this, (List)var3_3);
                var12_13 = this.b.getAdId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.c.getSequence$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_2 = this.d;
                if (var2_2 != null && (var2_2 = ((f)var2_2).a.t) != null) {
                    var13_14 = var4_4 = com.jio.jioads.utils.e.i((Map)var2_2);
                } else {
                    var4_4 = 0;
                    var2_2 = null;
                    var13_14 = 0;
                }
                var6_6 = var1_1;
                var1_1 = new b((Context)var10_11, (String)var8_9, (String)var7_8, (String)var9_10, null, var11_12, var12_13, var13_14);
                var1_1.a();
                break block25;
            }
            var2_2 = new StringBuilder();
            var3_3 = this.b;
            var6_7 = ": jioad destroyed";
            jr3_0.b((JioAdView)var3_3, (StringBuilder)var2_2, var6_7, (JioAds$Companion)var1_1);
        }
    }

    public final void trackComplete() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackComplete()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            String string2 = "complete";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = object != null ? ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
                if (object != null) {
                    object = (List)((HashMap)object).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    Intrinsics.checkNotNull(object2);
                    object2 = ((JioAd$NativeAd)object2).getVideoData();
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$NativeAd)object).getVideoData();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null) {
                            object = (List)((HashMap)object).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        string2 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackError(String object) {
        object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackError()";
        j_0.h(object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object = this.c;
            int n4 = ((JioAd)object).getAdCategory();
            if (n4 == (n3 = 5)) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object = ((JioAd$VideoAd)object).getErrorUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    n4 = 0;
                    object = null;
                }
                object2 = "Error";
                this.a((String)object2, (List)object);
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string2 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
        }
    }

    public final void trackExitFullScreen() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackExitFullScreen()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "exitFullscreen";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackFirstQuartile() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackFirstQuartile()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "firstQuartile";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackFullScreen() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackFullScreen()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "fullscreen";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackImpression() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackImpression()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            String string2 = "impression";
            List list = null;
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    list = ((JioAd$VideoAd)object).getImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                this.a(string2, list);
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getImpressionTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    this.a(string2, (List)object2);
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            list = ((JioAd$VideoAd)object).getImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        this.a(string2, list);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackMidQuartile() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackMidQuartile()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "midpoint";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackMute() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackMute()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "mute";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackPause() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackPause()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "pause";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object4 = ((JioAd$NativeAd)object2).getVideoData();
                    }
                    if (object4 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$NativeAd)object).getVideoData();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null) {
                            object = (List)((HashMap)object).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string3 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void trackResume() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackResume()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 != 0) {
            object2 = new StringBuilder();
            object3 = this.b;
            String string2 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
            return;
        }
        object2 = this.c;
        n3 = ((JioAd)object2).getAdCategory();
        int n4 = 5;
        Object object4 = null;
        String string3 = "resume";
        if (n3 == n4) {
            object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object != null) {
                object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            if (object4 == null) return;
            object = (List)((HashMap)object4).get(string3);
            this.a(string3, (List)object);
            return;
        }
        object2 = this.c;
        n3 = ((JioAd)object2).getAdCategory();
        if (n3 != (n4 = 7)) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            if (n3 != (n4 = 8)) return;
        }
        if ((object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object2 != null) {
                object4 = ((JioAd$NativeAd)object2).getVideoData();
            }
            if (object4 != null) {
                object2 = new StringBuilder();
                object3 = this.b;
                object4 = ": Firing Native Video event";
                jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object);
                object = ((JioAd$NativeAd)object).getVideoData();
                Intrinsics.checkNotNull(object);
                object = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object == null) return;
                object = (List)((HashMap)object).get(string3);
                this.a(string3, (List)object);
                return;
            }
        }
        object2 = new StringBuilder();
        object3 = this.b;
        object4 = ": Not a Native Video Ad";
        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
    }

    public final void trackSkip() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackSkip()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            int n4;
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            if (n3 == (n4 = 5)) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = object != null ? ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
                if (object != null) {
                    object2 = "skip";
                    object = (List)((HashMap)object).get(object2);
                    this.a((String)object2, (List)object);
                }
            } else {
                object2 = new StringBuilder();
                object3 = this.b;
                String string2 = ": This Tracker is only available for Instream Video Ads";
                jr3_0.b((JioAdView)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string3 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
        }
    }

    public final void trackStart() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackStart()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "start";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackStop() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackStop()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "close";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackThirdQuartile() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackThirdQuartile()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "thirdQuartile";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object4 = ((JioAd$NativeAd)object2).getVideoData();
                    }
                    if (object4 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$NativeAd)object).getVideoData();
                        Intrinsics.checkNotNull(object);
                        object = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null) {
                            object = (List)((HashMap)object).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string3 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
        }
    }

    public final void trackUnmute() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackUnmute()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            Object object4 = null;
            String string2 = "unmute";
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object4 != null) {
                    object = (List)((HashMap)object4).get(string2);
                    this.a(string2, (List)object);
                }
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            object4 = ((JioAd$VideoAd)object).getTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (object4 != null) {
                            object = (List)((HashMap)object4).get(string2);
                            this.a(string2, (List)object);
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        object4 = ": Not a Native Video Ad";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }

    public final void trackViewableImpression() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        Object object3 = ": publisher called jioAd.adEventTracker.trackViewableImpression()";
        j_0.h((JioAdView)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = this.e;
        if (n3 == 0) {
            object2 = this.c;
            n3 = ((JioAd)object2).getAdCategory();
            int n4 = 5;
            String string2 = "viewableImpression";
            List list = null;
            if (n3 == n4) {
                object = this.c.getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null) {
                    list = ((JioAd$VideoAd)object).getViewableImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                this.a(string2, list);
            } else {
                object2 = this.c;
                n3 = ((JioAd)object2).getAdCategory();
                if (n3 == (n4 = 7) || (n3 = ((JioAd)(object2 = this.c)).getAdCategory()) == (n4 = 8)) {
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getViewableImpressionTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    this.a(string2, (List)object2);
                    object2 = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null) {
                        object2 = ((JioAd$NativeAd)object2).getVideoData();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = new StringBuilder();
                        object3 = this.b;
                        String string3 = ": Firing Native Video event";
                        jr3_0.b((JioAdView)object3, (StringBuilder)object2, string3, (JioAds$Companion)object);
                        object = this.c.getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = ((JioAd$NativeAd)object).getVideoData()) != null) {
                            list = ((JioAd$VideoAd)object).getViewableImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        this.a(string2, list);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object3 = this.b;
            String string4 = ": jioad destroyed";
            jr3_0.b((JioAdView)object3, (StringBuilder)object2, string4, (JioAds$Companion)object);
        }
    }
}

