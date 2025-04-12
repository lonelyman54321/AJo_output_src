/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.jio.jioads.jioreel.data.PlayerName
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.jioreel.JioReelConfig;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.data.PlayerName;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.data.e;
import com.jio.jioads.jioreel.data.f;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.CreativeResponse;
import com.jio.jioads.jioreel.ssai.TrackerType;
import com.jio.jioads.jioreel.ssai.b;
import com.jio.jioads.jioreel.ssai.l;
import com.jio.jioads.jioreel.ssai.p;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class JioReelPlugin {
    public final Context a;
    public Map b;
    public JioAdsMetadata c;

    public JioReelPlugin(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static /* synthetic */ void init$default(JioReelPlugin jioReelPlugin, PlayerName playerName, String string2, JioReelListener jioReelListener, String string3, Map map2, int n3, StreamType streamType, e e2, int n4, Object object) {
        int n7;
        int n8 = n4 & 0x20;
        if (n8 != 0) {
            n8 = 0;
            n7 = 0;
        } else {
            n7 = n3;
        }
        jioReelPlugin.init(playerName, string2, jioReelListener, string3, map2, n7, streamType, e2);
    }

    public static /* synthetic */ void init$default(JioReelPlugin jioReelPlugin, PlayerName playerName, String string2, JioReelListener jioReelListener, String string3, Map map2, String string4, int n3, StreamType streamType, int n4, Object object) {
        int n7;
        int n8 = n4 & 0x40;
        if (n8 != 0) {
            n8 = 0;
            n7 = 0;
        } else {
            n7 = n3;
        }
        jioReelPlugin.init(playerName, string2, jioReelListener, string3, map2, string4, n7, streamType);
    }

    public static /* synthetic */ void init$default(JioReelPlugin jioReelPlugin, PlayerName playerName, String string2, JioReelListener jioReelListener, Map map2, int n3, int n4, Object object) {
        int n7;
        if ((n4 &= 0x10) != 0) {
            n3 = 0;
            n7 = 0;
        } else {
            n7 = n3;
        }
        jioReelPlugin.init(playerName, string2, jioReelListener, map2, n7);
    }

    public final void fireClickTrackers(JioReelAdMetaData jioReelAdMetaData) {
        Intrinsics.checkNotNullParameter(jioReelAdMetaData, "jioReelAdMetaData");
    }

    public final void fireTrackers(String object, TrackerType object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Object object3 = "trackertype";
        Intrinsics.checkNotNullParameter(object2, object3);
        int n3 = object.length();
        if (n3 == 0) {
            object2 = "message";
            Intrinsics.checkNotNullParameter("Creative ID cannot be empty", (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            object3 = TrackerType.IMPRESSION;
            int n4 = 2;
            if (object2 == object3 && (object3 = p.t) != null && (object3 = ((p)object3).p) != null) {
                JioAdsTracker.triggerImpression$default((JioAdsTracker)object3, object, null, n4, null);
            }
            if (object2 == (object3 = TrackerType.COMPLETE) && (object2 = p.t) != null && (object2 = ((p)object2).p) != null) {
                JioAdsTracker.triggerCompleted$default((JioAdsTracker)object2, object, null, n4, null);
            }
        }
    }

    public final JioAdsMetadata getMetaData() {
        Object object = this.b;
        if (object != null) {
            object = new JioAdsMetadata$Builder();
            Map map2 = this.b;
            object = ((JioAdsMetadata$Builder)object).setCustomMetadata(map2).build();
        } else {
            object = this.c;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final void handleAdClick(JioReelAdMetaData var1_1, boolean var2_2) {
        block29: {
            block28: {
                block32: {
                    block27: {
                        block26: {
                            block31: {
                                block30: {
                                    Intrinsics.checkNotNullParameter(var1_1, "jioReelAdMetaData");
                                    var3_3 = p.t;
                                    if (var3_3 == null) break block29;
                                    var4_4 = null;
                                    if (var1_1 != null) {
                                        var5_5 = var1_1.getAdId();
                                        var6_6 = var5_5;
                                    } else {
                                        var6_6 = null;
                                    }
                                    var7_7 = TextUtils.isEmpty(var6_6);
                                    if (var7_7 != 0) break block29;
                                    if (var1_1 != null) {
                                        var7_7 = var1_1.getAdIndex();
                                        var5_5 = var7_7;
                                    } else {
                                        var7_7 = 0;
                                        var5_5 = null;
                                    }
                                    if (var5_5 != null) {
                                        var1_1.getAdIndex();
                                    }
                                    if (var1_1 != null && (var5_5 = var1_1.getJioReelAdParameter()) != null) {
                                        var5_5 = var5_5.getOpenInApp();
                                    } else {
                                        var7_7 = 0;
                                        var5_5 = null;
                                    }
                                    if (var5_5 != null) {
                                        var5_5 = var1_1.getJioReelAdParameter();
                                        if (var5_5 != null) {
                                            var5_5 = var5_5.getOpenInApp();
                                        } else {
                                            var7_7 = 0;
                                            var5_5 = null;
                                        }
                                        Intrinsics.checkNotNull(var5_5);
                                        var8_8 = "1";
                                        var9_9 = var7_7 = (int)Intrinsics.areEqual(var5_5, var8_8);
                                    } else {
                                        var7_7 = 0;
                                        var5_5 = null;
                                        var9_9 = 0;
                                    }
                                    var5_5 = var3_3.a().e;
                                    if (var5_5 != null) {
                                        Intrinsics.checkNotNull(var5_5);
                                        var10_10 = var5_5 = (String)var5_5.get(var6_6);
                                    } else {
                                        var10_10 = null;
                                    }
                                    var5_5 = var3_3.a().b(var6_6);
                                    var8_8 = (String)var3_3.a().c.get(var6_6);
                                    var11_11 = (String)var3_3.a().c.get(var6_6);
                                    if (var5_5 != null && (var12_12 = var5_5.length()) != 0) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var13_13 = var5_5;
                                            break block26;
                                            break;
                                        }
                                    }
                                    if (!var2_2) break block30;
                                    if (var1_1 == null || (var5_5 = var1_1.getJioReelAdParameter()) == null || (var5_5 = var5_5.getCtaUrl()) == null) break block31;
                                    var5_5 = var5_5.getDeeplink();
                                    ** GOTO lbl-1000
                                }
                                if (var1_1 != null && (var5_5 = var1_1.getJioReelAdParameter()) != null) {
                                    var5_5 = var5_5.getSecondaryCtaUrl();
                                    ** continue;
                                }
                            }
                            var12_12 = 0;
                            var13_13 = null;
                        }
                        if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                            var14_14 = var8_8;
                        } else {
                            if (var2_2) {
                                if (var1_1 != null && (var5_5 = var1_1.getJioReelAdParameter()) != null && (var5_5 = var5_5.getCtaUrl()) != null) {
                                    var5_5 = var5_5.getFallback();
lbl71:
                                    // 2 sources

                                    while (true) {
                                        var14_14 = var5_5;
                                        break block27;
                                        break;
                                    }
                                }
                            } else if (var1_1 != null && (var5_5 = var1_1.getJioReelAdParameter()) != null) {
                                var5_5 = var5_5.getSecondaryCtaUrl();
                                ** continue;
                            }
                            var14_14 = null;
                        }
                    }
                    if (var11_11 == null || (var7_7 = var11_11.length()) == 0) break block32;
                    var15_15 = var11_11;
                    break block28;
                }
                if (var2_2) {
                    if (var1_1 != null && (var5_5 = var1_1.getJioReelAdParameter()) != null && (var5_5 = var5_5.getCtaUrl()) != null) {
                        var4_4 = var5_5.getFallback();
                    }
lbl87:
                    // 5 sources

                    while (true) {
                        var15_15 = var4_4;
                        break block28;
                        break;
                    }
                }
                if (var1_1 == null || (var5_5 = var1_1.getJioReelAdParameter()) == null) ** GOTO lbl87
                var4_4 = var5_5.getSecondaryCtaUrl();
                ** while (true)
            }
            var16_16 = new l(var3_3, var1_1, var2_2);
            Intrinsics.checkNotNull(var6_6);
            var11_11 = var3_3.a;
            var8_8 = var4_4;
            var4_4 = new b((Context)var11_11, (String)var10_10, (String)var13_13, (String)var14_14, var15_15, var16_16, var6_6, var9_9);
            var4_4.a();
        }
    }

    public final void init(PlayerName object, String object2, JioReelListener object3, String string2, Map object4, int n3, StreamType streamType, e e2) {
        Intrinsics.checkNotNullParameter(object, "playerName");
        String string3 = "playerVersion";
        Intrinsics.checkNotNullParameter(object2, string3);
        Object object5 = "listener";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        Intrinsics.checkNotNullParameter(string2, "directUrl");
        Intrinsics.checkNotNullParameter((Object)streamType, "streamType");
        String string4 = "playBackType";
        Intrinsics.checkNotNullParameter((Object)e2, string4);
        String string5 = "message";
        Intrinsics.checkNotNullParameter("Inside Init of JioReelPlugin for DirectPlayBack", string5);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object6 = JioAds$LogLevel.NONE;
        String string6 = "Player name ";
        object6 = new StringBuilder(string6);
        ((StringBuilder)object6).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string5);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        l_0.h("Player version ", (String)object2);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.b = object4;
        object = this.a;
        object6 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object6);
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        object5 = p.t;
        if (object5 == null) {
            object5 = new p((Context)object, (JioReelListener)object3);
        }
        p.t = object5;
        Intrinsics.checkNotNull(object5);
        object = new f(string2, streamType, (Map)object4);
        Intrinsics.checkNotNullParameter(object, "streamDetails");
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter((Object)e2, string4);
        Intrinsics.checkNotNullParameter("SSAI Controller init() for DirectPlayBack", string5);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        string2 = "Meta data ";
        object3 = new StringBuilder(string2);
        ((StringBuilder)object3).append(object4);
        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string5);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((p)object5).j = streamType;
        ((p)object5).k = e2;
        object3 = new JioAdsMetadata$Builder();
        ((p)object5).r = object3 = ((JioAdsMetadata$Builder)object3).setCustomMetadata((Map)object4).build();
        int n4 = ((String)object2).length();
        if (n4 > 0) {
            boolean bl2;
            ((p)object5).s = bl2 = p.d((String)object2);
        }
        object2 = ((p)object5).p;
        ((JioAdsTracker)object2).fetchDefaultTrackerInfo();
        ((p)object5).m = object3 = ((p)object5).n;
        Intrinsics.checkNotNullParameter("Inside init of ssaicontroller for direct playback urls", string5);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = new StringBuilder("Request Timeout set to ");
        ((StringBuilder)object3).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string5);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((JioAdsTracker)object2).fetchDefaultTrackerInfo();
        object2 = ((p)object5).a;
        object4 = "";
        String string7 = "cgi_id";
        object3 = j_0.d((Context)object2, "common_prefs", 0, object4, string7);
        string2 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(object3, string2);
        object3 = (String)object3;
        int n7 = ((String)object3).length();
        if (n7 == 0) {
            object3 = new com.jio.jioads.cohort.b((Context)object2);
            ((com.jio.jioads.cohort.b)object3).a();
            object3 = "defaultCGI";
        }
        ((p)object5).c((f)object, (String)object4, (String)object3, e2);
    }

    public final void init(PlayerName object, String object2, JioReelListener object3, String string2, Map object4, String string3, int n3, StreamType streamType) {
        Intrinsics.checkNotNullParameter(object, "playerName");
        String string4 = "playerVersion";
        Intrinsics.checkNotNullParameter(object2, string4);
        Object object5 = "listener";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        Intrinsics.checkNotNullParameter(string2, "viewUrl");
        String string5 = "adSpot";
        Intrinsics.checkNotNullParameter(string3, string5);
        Intrinsics.checkNotNullParameter((Object)streamType, "streamType");
        String string6 = "message";
        Intrinsics.checkNotNullParameter("Inside Init of JioReelPlugin", string6);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object6 = JioAds$LogLevel.NONE;
        String string7 = "Player name ";
        object6 = new StringBuilder(string7);
        ((StringBuilder)object6).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string6);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        l_0.h("Player version ", (String)object2);
        object = jioAds$Companion.getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.b = object4;
        int n4 = string2.length();
        if (n4 == 0) {
            object = "view url is empty so giving error callback";
            v12.a((String)object, string6, jioAds$Companion);
        } else {
            object = this.a;
            object6 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object6);
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            object5 = p.t;
            if (object5 == null) {
                object5 = new p((Context)object, (JioReelListener)object3);
            }
            p.t = object5;
            Intrinsics.checkNotNull(object5);
            object = new f(string2, streamType, (Map)object4);
            Intrinsics.checkNotNullParameter(object, "streamDetails");
            Intrinsics.checkNotNullParameter(object2, string4);
            Intrinsics.checkNotNullParameter(string3, string5);
            ((p)object5).j = streamType;
            object3 = e.a;
            ((p)object5).k = object3;
            int n7 = ((String)object2).length();
            if (n7 > 0) {
                boolean bl2;
                ((p)object5).s = bl2 = p.d((String)object2);
            }
            if (n3 > 0) {
                ((p)object5).q = n3;
            }
            object2 = ((p)object5).o;
            ((p)object5).m = object2;
            object2 = new StringBuilder("Inside init of ssaicontroller for stream type:  ");
            ((StringBuilder)object2).append((Object)streamType);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string6);
            jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            l_0.h("SSAI adSpot ", string3);
            jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = new StringBuilder("Request Timeout set to ");
            ((StringBuilder)object2).append(n3);
            v12.a(((StringBuilder)object2).toString(), string6, jioAds$Companion);
            ((p)object5).p.fetchDefaultTrackerInfo();
            string2 = ((p)object5).a;
            object4 = "";
            String string8 = "cgi_id";
            object2 = j_0.d((Context)string2, "common_prefs", 0, object4, string8);
            object3 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (String)object2;
            n7 = ((String)object2).length();
            if (n7 == 0) {
                object2 = new com.jio.jioads.cohort.b((Context)string2);
                ((com.jio.jioads.cohort.b)object2).a();
                object2 = "defaultCGI";
            }
            object3 = ((p)object5).k;
            Intrinsics.checkNotNull(object3);
            ((p)object5).c((f)object, string3, (String)object2, (e)((Object)object3));
        }
    }

    public final void init(PlayerName object, String string2, JioReelListener object2, Map map2, int n3) {
        Intrinsics.checkNotNullParameter(object, "playerName");
        String string3 = "playerVersion";
        Intrinsics.checkNotNullParameter(string2, string3);
        Object object3 = "listener";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string4 = "message";
        Intrinsics.checkNotNullParameter("Inside Init of JioReelPlugin for SpotAd", string4);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        String string5 = "Player name ";
        object4 = new StringBuilder(string5);
        ((StringBuilder)object4).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), string4);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        l_0.h("Player version ", string2);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.b = map2;
        object = this.a;
        object4 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = p.t;
        if (object3 == null) {
            object3 = new p((Context)object, (JioReelListener)object2);
        }
        p.t = object3;
        Intrinsics.checkNotNull(object3);
        object2 = StreamType.LIVE;
        object4 = "";
        object = new f((String)object4, (StreamType)((Object)object2), map2);
        Intrinsics.checkNotNullParameter(object, "streamDetails");
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter("SSAI Controller init() for SpotAd", string4);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = "Meta data ";
        object = new StringBuilder((String)object2);
        ((StringBuilder)object).append(map2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = e.a;
        ((p)object3).k = object;
        object = new JioAdsMetadata$Builder();
        ((p)object3).r = object = ((JioAdsMetadata$Builder)object).setCustomMetadata(map2).build();
        int n4 = string2.length();
        if (n4 > 0) {
            n4 = (int)(p.d(string2) ? 1 : 0);
            ((p)object3).s = n4;
        }
        ((p)object3).p.fetchDefaultTrackerInfo();
        ((p)object3).m = object = ((p)object3).n;
    }

    public final void initSpotAdTrackers(String object, CreativeResponse object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Object object3 = "creativeResponse";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = object.length();
        if (n3 == 0) {
            object2 = "message";
            Intrinsics.checkNotNullParameter("Creative ID cannot be empty", (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            object3 = p.t;
            if (object3 != null && (object3 = ((p)object3).p) != null) {
                ((JioAdsTracker)object3).fetchAdTrackers((String)object, (CreativeResponse)object2);
            }
        }
    }

    public final void onDestroy() {
        JioReelConfig.Companion.getClass();
        JioReelConfig jioReelConfig = JioReelConfig.access$getINSTANCE$cp();
        if (jioReelConfig != null) {
            jioReelConfig.destroy();
        }
        p.t = null;
        JioReelConfig.access$setINSTANCE$cp(null);
    }

    public final void onStop() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("onStop JioReelPlugin", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        JioReelConfig.Companion.getClass();
        object = JioReelConfig.access$getINSTANCE$cp();
        if (object != null) {
            ((JioReelConfig)object).clearConfig();
        }
    }

    public final void setMetaData(JioAdsMetadata jioAdsMetadata) {
        Intrinsics.checkNotNullParameter(jioAdsMetadata, "jioAdsMetadata");
        this.c = jioAdsMetadata;
    }

    public final void setSpotAdEMT(String string2) {
        TextUtils.isEmpty((CharSequence)string2);
    }

    public final void setSpotAdMacros(String object, String string2, String string3, String string4) {
        boolean bl2;
        Object object2 = "spotAdId";
        Intrinsics.checkNotNullParameter(object, object2);
        Intrinsics.checkNotNullParameter(string2, "spotAdAppId");
        Intrinsics.checkNotNullParameter(string3, "latitude");
        Object object3 = "longitude";
        Intrinsics.checkNotNullParameter(string4, (String)object3);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        String string5 = "message";
        if (!bl3 && (object3 = p.t) != null) {
            Intrinsics.checkNotNullParameter(object, object2);
            String string6 = "setSpotAdId ";
            object3 = new StringBuilder(string6);
            ((StringBuilder)object3).append((String)object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2)) && (object = p.t) != null) {
            Intrinsics.checkNotNullParameter(string2, object2);
            object2 = "setAppID ";
            object = new StringBuilder((String)object2);
            ((StringBuilder)object).append(string2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string3)) && !(bl2 = TextUtils.isEmpty((CharSequence)string4))) {
            double d2 = Double.parseDouble(string3);
            double d5 = Double.parseDouble(string4);
            object2 = new StringBuilder("Location.Latitude: ");
            ((StringBuilder)object2).append(d2);
            object3 = " ,Longitude: ";
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(d5);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            double d7 = 0.0;
            double d9 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1);
            if (d9 != false && (d9 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1)) != false) {
                object2 = this.a;
                Intrinsics.checkNotNullParameter(object2, "context");
                object2 = j_0.o((Context)object2, "common_prefs").edit();
                long l2 = Double.doubleToRawLongBits(d2);
                object3 = "lat";
                object2.putLong((String)object3, l2);
                l2 = Double.doubleToRawLongBits(d5);
                string3 = "lon";
                object2.putLong(string3, l2);
                object2.apply();
            }
        }
    }
}

