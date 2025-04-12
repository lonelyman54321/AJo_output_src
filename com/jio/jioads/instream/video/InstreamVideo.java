/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.video;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdDetails;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.c;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.instream.video.InstreamVideo$a;
import com.jio.jioads.instream.video.InstreamVideo$mediationListener$1;
import com.jio.jioads.instream.video.InstreamVideoInfiniteAdFetcher;
import com.jio.jioads.instream.video.a;
import com.jio.jioads.instream.video.b;
import com.jio.jioads.instream.video.d;
import com.jio.jioads.instream.video.e;
import com.jio.jioads.instream.video.f;
import com.jio.jioads.instream.video.h;
import com.jio.jioads.instream.video.j;
import com.jio.jioads.instream.video.l;
import com.jio.jioads.instream.video.n;
import com.jio.jioads.instream.video.o;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.multiad.t;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.i;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.videomodule.JioVideoViewState;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.w_0;
import com.jio.jioads.videomodule.x;
import com.jioads.mediation.JioAdMediationController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InstreamVideo
extends com.jio.jioads.common.d {
    public ViewGroup a;
    public final com.jio.jioads.controller.a b;
    public final com.jio.jioads.common.b c;
    public final c d;
    public boolean e;
    public boolean f;
    public final rq1_2 g;
    public String h;
    public CountDownTimer i;
    public com.jio.jioads.instreamads.vastparser.n j;
    public InstreamVideoInfiniteAdFetcher k;
    public CountDownTimer l;
    public boolean m;
    public boolean n;
    public final rq1_2 o;
    public String p;
    public s q;
    public final InstreamVideo$a r;
    public boolean s;
    public final InstreamVideo$mediationListener$1 t;

    public InstreamVideo(ViewGroup object, com.jio.jioads.controller.a object2, com.jio.jioads.common.b b2, c c2) {
        Intrinsics.checkNotNullParameter(object2, "jioAdCallbacks");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        super((com.jio.jioads.controller.a)object2, b2, c2);
        this.a = object;
        this.b = object2;
        this.c = b2;
        this.d = c2;
        super(this, 1);
        object = yr1_2.b((Function0)object);
        this.g = object;
        object = yr1_2.b(com.jio.jioads.instream.video.b.c);
        this.o = object;
        this.p = "";
        super();
        object2 = b2.P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": init InstreamVideo");
        com.jio.jioads.util.j.a(((StringBuilder)object).toString());
        this.r = object = new InstreamVideo$a(this);
        this.t = object = new InstreamVideo$mediationListener$1(this);
    }

    public static final void access$closeAdPod(InstreamVideo instreamVideo) {
        com.jio.jioads.instreamads.vastparser.n n3 = instreamVideo.j;
        if (n3 != null) {
            n3.l = null;
        }
        if (n3 != null) {
            n3.t();
        }
        instreamVideo.j = null;
    }

    public static final void access$fireFillRateBeacon(InstreamVideo object) {
        object.getClass();
        object = ((InstreamVideo)object).d;
        int n3 = com.jio.jioads.util.i.l((c)object);
        if (n3 != 0) {
            com.jio.jioads.util.i.i = n3 = com.jio.jioads.util.i.i + 1;
        }
    }

    public static final String access$getCcbValue(InstreamVideo instreamVideo) {
        return (String)instreamVideo.g.getValue();
    }

    public static final int access$getDefaultLayout(InstreamVideo instreamVideo) {
        instreamVideo.getClass();
        return R$layout.jio_instream_layout;
    }

    public static final int access$getDefaultLayoutForSTB(InstreamVideo instreamVideo) {
        instreamVideo.getClass();
        return R$layout.jio_instream_stb_layout;
    }

    public static final /* synthetic */ HashMap access$getHeaders(InstreamVideo instreamVideo) {
        return instreamVideo.getHeaders();
    }

    public static final /* synthetic */ com.jio.jioads.common.b access$getIJioAdView$p(InstreamVideo instreamVideo) {
        return instreamVideo.c;
    }

    public static final /* synthetic */ c access$getIJioAdViewController$p(InstreamVideo instreamVideo) {
        return instreamVideo.d;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioAdCallbacks$p(InstreamVideo instreamVideo) {
        return instreamVideo.b;
    }

    public static final /* synthetic */ com.jio.jioads.instreamads.vastparser.n access$getJioVastParsingHelper$p(InstreamVideo instreamVideo) {
        return instreamVideo.j;
    }

    public static final /* synthetic */ s access$getJioVideoView$p(InstreamVideo instreamVideo) {
        return instreamVideo.q;
    }

    public static final /* synthetic */ InstreamVideo$a access$getListener$p(InstreamVideo instreamVideo) {
        return instreamVideo.r;
    }

    public static final /* synthetic */ CountDownTimer access$getPodSelectionTimer$p(InstreamVideo instreamVideo) {
        return instreamVideo.l;
    }

    public static final /* synthetic */ CountDownTimer access$getPodViewingTimer$p(InstreamVideo instreamVideo) {
        return instreamVideo.i;
    }

    public static final /* synthetic */ String access$getPrevPlayingAdId$p(InstreamVideo instreamVideo) {
        return instreamVideo.h;
    }

    public static final long access$getRequiredAdDuration(InstreamVideo instreamVideo) {
        return ((com.jio.jioads.controller.f)instreamVideo.d).a.a0();
    }

    public static final void access$handleNoAdInInventory(InstreamVideo object) {
        boolean bl2 = ((InstreamVideo)object).s;
        if (!bl2) {
            ((InstreamVideo)object).s = true;
            bl2 = false;
            ((InstreamVideo)object).j = null;
            t_0 t_02 = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
            String string2 = "No ad in inventory";
            JioAdError jioAdError = j_0.c(t_02, jioAdError$JioAdErrorType, string2);
            object = ((InstreamVideo)object).b;
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            Object object2 = object;
            object2 = (V)object;
            String string3 = "";
            String string4 = "startVideoProcessing->onResponseReceived";
            String string5 = "InstreamVideo";
            ((V)object2).d(jioAdError, false, d2, string4, string5, string3, null);
        }
    }

    public static final void access$initConfiguration(InstreamVideo object, s s7) {
        Object object2;
        Enum enum_ = ((InstreamVideo)object).c.k0();
        if (enum_ != (object2 = JioAdView$AdState.DESTROYED)) {
            boolean bl2;
            Object object3;
            long l2;
            long l3;
            long l4;
            enum_ = ((InstreamVideo)object).c.Y();
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().getClass();
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            Object object4 = s7.g0();
            int n3 = 1;
            ((com.jio.jioads.videomodule.config.a)object4).a = n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object4 = s7.g0();
            object4.getClass();
            int n4 = j_0.l((Context)enum_) ^ n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            Object object5 = s7.g0();
            object5.c = n4;
            n4 = j_0.l((Context)enum_);
            n4 = n4 != 0 ? j_0.r((Context)enum_) : 1;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object5 = s7.g0();
            object5.d = n4;
            object4 = ((com.jio.jioads.controller.f)((InstreamVideo)object).d).a;
            int n7 = ((com.jio.jioads.controller.o)object4).o;
            boolean bl3 = n7 ^ true;
            boolean bl4 = false;
            if ((n7 != 0 && (n4 = (l4 = (l3 = ((com.jio.jioads.controller.o)object4).a0()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0 && (n4 = ((com.jio.jioads.controller.f)(object4 = (com.jio.jioads.controller.f)((InstreamVideo)object).d)).k()) > 0 || bl3) && (object4 = ((InstreamVideo)object).c.L()) != (object5 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                n4 = 1;
            } else {
                n4 = 0;
                object4 = null;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().b = n4;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().getClass();
            n4 = j_0.l((Context)enum_) ^ n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().e = n4;
            n4 = j_0.l((Context)enum_) ^ n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().f = n4;
            n4 = (int)(j_0.r((Context)enum_) ? 1 : 0);
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object5 = s7.g0();
            object5.g = n4;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().getClass();
            object4 = ((InstreamVideo)object).c.b0();
            n7 = -1;
            n4 = object4 != null ? (Integer)object4 : -1;
            if (n4 <= 0 && (object4 = ((InstreamVideo)object).c.L()) != (object3 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                n4 = 1;
            } else {
                n4 = 0;
                object4 = null;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().j = n4;
            object4 = ((InstreamVideo)object).c.E();
            object3 = JioAdView$VideoAdType.VOD;
            if (object4 == object3) {
                n4 = 1;
            } else {
                n4 = 0;
                object4 = null;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object3 = s7.g0();
            ((com.jio.jioads.videomodule.config.a)object3).m = n4;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().t = false;
            object4 = ((InstreamVideo)object).c.I();
            if (object4 != null && (n4 = ((Integer)object4).intValue()) != n7) {
                n4 = 0;
                object4 = null;
            } else {
                n4 = 1;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().h = n4;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object4 = s7.g0();
            ((com.jio.jioads.videomodule.config.a)object4).k = n3;
            n4 = 4;
            object5 = n4;
            object3 = "com.jio.media.stb.ondemand.patchwall";
            n7 = (int)(j_0.m((Context)enum_, (String)object3, (Integer)object5) ? 1 : 0);
            String string2 = "com.yupptv.androidtv";
            if (n7 == 0) {
                object5 = n4;
                j_0.m((Context)enum_, string2, (Integer)object5);
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().getClass();
            object5 = n4;
            n7 = (int)(j_0.m((Context)enum_, (String)object3, (Integer)object5) ? 1 : 0);
            if (n7 == 0 && !(bl2 = j_0.m((Context)enum_, string2, (Integer)(object4 = Integer.valueOf(n4))))) {
                bl2 = false;
                enum_ = null;
            } else {
                bl2 = true;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().i = bl2;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().l = n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().n = n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().p = n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().q = n3;
            enum_ = ((InstreamVideo)object).c.L();
            object4 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
            if (enum_ == object4) {
                object = ((com.jio.jioads.controller.f)((InstreamVideo)object).d).a;
                boolean bl5 = ((com.jio.jioads.controller.o)object).o;
                if (bl5) {
                    bl4 = true;
                }
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().r = bl4;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object = s7.g0();
            ((com.jio.jioads.videomodule.config.a)object).s = n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void access$initJioVideoViewIfNull(InstreamVideo instreamVideo, m object, Map object2) {
        synchronized (instreamVideo) {
            try {
                boolean bl2 = instreamVideo.e;
                if (bl2) {
                    object = new StringBuilder();
                    object2 = instreamVideo.c;
                    object2 = object2.P();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ": returning from initJioVideoViewIfNull";
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    object2 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                } else {
                    Object object3 = instreamVideo.q;
                    if (object3 == null) {
                        Object object4;
                        object3 = instreamVideo.c;
                        if ((object3 = object3.k0()) != (object4 = JioAdView$AdState.DESTROYED)) {
                            object3 = instreamVideo.c;
                            object3 = object3.Y();
                            try {
                                object4 = new d(instreamVideo, (Context)object3, (Map)object2, (m)object);
                                com.jio.jioads.util.s.d((Function0)object4);
                            }
                            catch (Exception exception) {
                                object2 = new StringBuilder();
                                object3 = instreamVideo.c;
                                object3 = object3.P();
                                ((StringBuilder)object2).append((String)object3);
                                object3 = ": Exception while creating JioVideoView ";
                                ((StringBuilder)object2).append((String)object3);
                                object3 = yc0_2.b(exception);
                                ((StringBuilder)object2).append((String)object3);
                                object2 = ((StringBuilder)object2).toString();
                                object3 = "message";
                                Intrinsics.checkNotNullParameter(object2, (String)object3);
                                object2 = JioAds.Companion;
                                object2 = ((JioAds$Companion)object2).getInstance();
                                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = JioAds$LogLevel.NONE;
                                object2 = instreamVideo.b;
                                object3 = JioAdView$AdState.FAILED;
                                object2 = (V)object2;
                                ((V)object2).e((JioAdView$AdState)((Object)object3));
                                object2 = JioAdError.Companion;
                                object3 = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
                                object2.getClass();
                                JioAdError jioAdError = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
                                object3 = "Exception while creating JioVideoView: ";
                                object2 = new StringBuilder((String)object3);
                                object3 = yc0_2.b(exception);
                                ((StringBuilder)object2).append((String)object3);
                                object2 = ((StringBuilder)object2).toString();
                                jioAdError.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                                object2 = instreamVideo.b;
                                com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                                String string2 = exception.getMessage();
                                String string3 = String.valueOf(string2);
                                String string4 = "initJioVideoView";
                                String string5 = "InstreamVideo";
                                object4 = object2;
                                object4 = (V)object2;
                                ((V)object4).d(jioAdError, false, d2, string4, string5, string3, null);
                            }
                        }
                    }
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final /* synthetic */ boolean access$isAdPrepared$p(InstreamVideo instreamVideo) {
        return instreamVideo.n;
    }

    public static final /* synthetic */ boolean access$isAdPreparedCallbackGiven$p(InstreamVideo instreamVideo) {
        return instreamVideo.f;
    }

    public static final /* synthetic */ boolean access$isExoPlayerEnabled(InstreamVideo instreamVideo) {
        return instreamVideo.a();
    }

    public static final /* synthetic */ boolean access$isInstreamVideoClassReleased$p(InstreamVideo instreamVideo) {
        return instreamVideo.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean access$isPGMQueued(InstreamVideo var0, int var1_1) {
        block11: {
            block12: {
                block10: {
                    var2_2 = "message";
                    var0 /* !! */ .getClass();
                    try {
                        var3_3 = new StringBuilder();
                        var4_4 = var0 /* !! */ .c;
                        var4_4 = var4_4.P();
                        var3_3.append((String)var4_4);
                        var4_4 = ": checking pgm ad is available for next track number: ";
                        var3_3.append((String)var4_4);
                        var3_3.append(var1_1);
                        var3_3 = var3_3.toString();
                        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                        var3_3 = JioAds.Companion;
                        var4_4 = var3_3.getInstance();
                        var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_4 = JioAds$LogLevel.NONE;
                        var4_4 = var0 /* !! */ .c;
                        var4_4 = var4_4.L();
                        var5_5 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                        if (var4_4 != var5_5) break block10;
                        return (boolean)0;
                    }
                    catch (Exception var8_8) {
                        break block11;
                    }
                }
                var4_4 = var0 /* !! */ .c;
                var6_6 = var4_4.c();
                if (var6_6 == 0) return (boolean)0;
                var4_4 = var0 /* !! */ .c;
                var4_4 = var4_4.z();
                var7_7 = 1;
                if (var4_4 != null && (var6_6 = var4_4.i0()) == var7_7) return (boolean)0;
                var4_4 = var0 /* !! */ .c;
                if ((var4_4 = var4_4.z()) != null && (var6_6 = var4_4.E) == var7_7) return (boolean)0;
                var4_4 = var0 /* !! */ .q;
                var9_10 = null;
                if (var4_4 != null) {
                    var4_4 = var4_4.O;
                } else {
                    var6_6 = 0;
                    var4_4 = null;
                }
                Intrinsics.checkNotNull(var4_4);
                var6_6 = var4_4.size();
                if (var6_6 <= var1_1) break block12;
                var4_4 = var0 /* !! */ .q;
                if (var4_4 == null || (var4_4 = var4_4.O) == null) ** GOTO lbl-1000
                var8_9 = var4_4.get(var1_1);
                if ((var8_9 = (k)var8_9) != null) {
                    var8_9 = var8_9.p;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = 0;
                    var8_9 = null;
                }
                var4_4 = new StringBuilder();
                var10_11 = var0 /* !! */ .c;
                var10_11 = var10_11.P();
                var4_4.append((String)var10_11);
                var10_11 = ": Next available campaign type is: ";
                var4_4.append((String)var10_11);
                var4_4.append((String)var8_9);
                var4_4 = var4_4.toString();
                Intrinsics.checkNotNullParameter(var4_4, (String)var2_2);
                var4_4 = var3_3.getInstance();
                var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var4_4 = var0 /* !! */ .j;
                if (var4_4 != null && (var1_1 = (int)com.jio.jioads.instreamads.vastparser.n.w((String)var8_9)) == var7_7) {
                    var8_9 = new StringBuilder();
                    var4_4 = var0 /* !! */ .c;
                    var4_4 = var4_4.P();
                    var8_9.append((String)var4_4);
                    var4_4 = ": pgm was identified so calling loadPgmAd";
                    var8_9.append((String)var4_4);
                    var8_9 = var8_9.toString();
                    Intrinsics.checkNotNullParameter(var8_9, (String)var2_2);
                    var8_9 = var3_3.getInstance();
                    var8_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_9 = var0 /* !! */ .d;
                    var8_9 = (com.jio.jioads.controller.f)var8_9;
                    var8_9 = var8_9.a;
                    var8_9.d();
                    return (boolean)var7_7;
                }
            }
            if ((var8_9 = var0 /* !! */ .q) != null && (var8_9 = var8_9.O) != null) {
                var8_9 = CollectionsKt.N(var7_7, (List)var8_9);
                if ((var8_9 = (k)var8_9) != null) {
                    var9_10 = var8_9.a;
                }
            }
            if (var9_10 == null) return (boolean)var7_7;
            var11_12 = var9_10.length();
            if (var11_12 != 0) return (boolean)0;
            return (boolean)var7_7;
        }
        var2_2 = new StringBuilder();
        var0 /* !! */  = var0 /* !! */ .c.P();
        var2_2.append((String)var0 /* !! */ );
        var2_2.append(": pgm exception in pgm queue verification: ");
        Intrinsics.checkNotNullParameter(var8_8, "<this>");
        com.jio.jioads.jioreel.tracker.model.b.e(var8_8, (StringBuilder)var2_2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var0 /* !! */  = JioAds$LogLevel.NONE;
        return (boolean)0;
    }

    public static final boolean access$isPGMQueuedInReq(InstreamVideo object, int n3) {
        int n4;
        block36: {
            JioAdView$AdPodVariant jioAdView$AdPodVariant;
            block28: {
                Object object2;
                String string2;
                block37: {
                    block33: {
                        Object object3;
                        block35: {
                            block34: {
                                block32: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                object.getClass();
                                                object3 = ((InstreamVideo)object).c;
                                                object3 = object3.L();
                                                jioAdView$AdPodVariant = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                                                if (object3 == jioAdView$AdPodVariant) break block28;
                                                object3 = ((InstreamVideo)object).c;
                                                boolean n7 = object3.c();
                                                if (!n7) break block28;
                                                object3 = ((InstreamVideo)object).c;
                                                object3 = object3.z();
                                                n4 = 1;
                                                if (object3 == null) break block29;
                                                int n8 = ((com.jio.jioads.controller.o)object3).i0();
                                                if (n8 == n4) break block28;
                                            }
                                            object3 = ((InstreamVideo)object).c;
                                            object3 = object3.z();
                                            if (object3 == null) break block30;
                                            int n10 = ((com.jio.jioads.controller.o)object3).E;
                                            if (n10 == n4) break block28;
                                        }
                                        object3 = ((InstreamVideo)object).q;
                                        string2 = null;
                                        if (object3 == null) break block31;
                                        object3 = ((s)object3).O;
                                        break block32;
                                    }
                                    boolean bl2 = false;
                                    object3 = null;
                                }
                                Intrinsics.checkNotNull(object3);
                                int n14 = ((ArrayList)object3).size();
                                if (n14 <= n3) break block33;
                                object3 = ((InstreamVideo)object).q;
                                if (object3 == null) break block34;
                                object3 = ((s)object3).O;
                                if (object3 == null) break block34;
                                object2 = ((ArrayList)object3).get(n3);
                                object2 = (k)object2;
                                if (object2 == null) break block34;
                                object2 = ((k)object2).p;
                                break block35;
                            }
                            n3 = 0;
                            object2 = null;
                        }
                        object3 = ((InstreamVideo)object).j;
                        if (object3 == null) break block33;
                        n3 = (int)(com.jio.jioads.instreamads.vastparser.n.w((String)object2) ? 1 : 0);
                        if (n3 == n4) break block36;
                    }
                    object2 = ((InstreamVideo)object).q;
                    if (object2 == null) break block37;
                    object2 = ((s)object2).O;
                    if (object2 == null) break block37;
                    object2 = CollectionsKt.N(n4, (List)object2);
                    object2 = (k)object2;
                    if (object2 == null) break block37;
                    string2 = ((k)object2).a;
                }
                if (string2 == null) break block36;
                try {
                    int n15 = string2.length();
                    if (n15 != 0) break block28;
                    break block36;
                }
                catch (Exception exception) {
                    object2 = new StringBuilder();
                    object = ((InstreamVideo)object).c.P();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(": pgm exception in pgm queue verification");
                    object = Unit.a;
                    ((StringBuilder)object2).append(object);
                    object = ((StringBuilder)object2).toString();
                    object2 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
            }
            n4 = 0;
            jioAdView$AdPodVariant = null;
        }
        return n4 != 0;
    }

    public static final boolean access$isPodEnabledWithCount(InstreamVideo object) {
        object = (com.jio.jioads.controller.f)((InstreamVideo)object).d;
        int n3 = ((com.jio.jioads.controller.f)object).k();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public static final boolean access$isPodEnabledWithDuration(InstreamVideo object) {
        long l2;
        object = ((com.jio.jioads.controller.f)((InstreamVideo)object).d).a;
        long l3 = ((com.jio.jioads.controller.o)object).a0();
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 > 0) {
            object2 = 1;
        } else {
            object2 = 0;
            object = null;
        }
        return (boolean)object2;
    }

    public static final void access$onErrorForInfiniteAdPod(InstreamVideo object, JioAdError object2, boolean bl2, com.jio.jioads.cdnlogging.d d2, String string2, String string3, String string4) {
        boolean bl3 = ((InstreamVideo)object).e;
        if (bl3) {
            object2 = new StringBuilder();
            object = ((InstreamVideo)object).c;
            String string5 = ": returning from onErrorForInfiniteAdPod as InstreamVideo is released";
            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            Object object3 = object = ((InstreamVideo)object).b;
            object3 = (V)object;
            ((V)object3).d((JioAdError)object2, bl2, d2, string2, string3, string4, null);
        }
    }

    public static final void access$onResponseReceivedForInfiniteAdPod(InstreamVideo object, HashMap hashMap, String string2) {
        ((InstreamVideo)object).getHeaders().clear();
        HashMap hashMap2 = ((InstreamVideo)object).getHeaders();
        hashMap2.putAll(hashMap);
        object = ((InstreamVideo)object).j;
        if (object != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).u(string2);
        }
    }

    public static final void access$processCustomAd(InstreamVideo object, m object2) {
        if (object2 == null) {
            object.getClass();
            object2 = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_PARSING;
            String string2 = "Error in parsing Video Data";
            JioAdError jioAdError = j_0.c((t_0)object2, jioAdError$JioAdErrorType, string2);
            object = ((InstreamVideo)object).b;
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            Object object3 = object;
            object3 = (V)object;
            String string3 = "processCustomAd";
            String string4 = "InstreamVideo";
            String string5 = "Error in parsing Video Data";
            ((V)object3).d(jioAdError, false, d2, string3, string4, string5, null);
        } else {
            Object object4 = new StringBuilder();
            j_0.i(((InstreamVideo)object).c, (StringBuilder)object4, ": Give ad prepared callback for Load custom ad");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object4 = ((InstreamVideo)object).b;
            c c2 = ((InstreamVideo)object).d;
            object = ((InstreamVideo)object).getHeaders();
            object4 = (V)object4;
            object4.getClass();
            Intrinsics.checkNotNullParameter(object2, "vastModel");
            Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
            String string6 = "headers";
            Intrinsics.checkNotNullParameter(object, string6);
            object4 = ((V)object4).a;
            JioAdView.access$prepareCustomVideoAdData((JioAdView)object4, (m)object2, c2, (Map)object);
        }
    }

    public static final /* synthetic */ void access$releaseInstream(InstreamVideo instreamVideo) {
        instreamVideo.b();
    }

    public static final /* synthetic */ void access$setAdPrepared$p(InstreamVideo instreamVideo, boolean bl2) {
        instreamVideo.n = bl2;
    }

    public static final /* synthetic */ void access$setAdPreparedCallbackGiven$p(InstreamVideo instreamVideo, boolean bl2) {
        instreamVideo.f = bl2;
    }

    public static final /* synthetic */ void access$setCustomLayout$p(InstreamVideo instreamVideo, Integer n3) {
        instreamVideo.getClass();
    }

    public static final /* synthetic */ void access$setJioVastParsingHelper$p(InstreamVideo instreamVideo, com.jio.jioads.instreamads.vastparser.n n3) {
        instreamVideo.j = n3;
    }

    public static final /* synthetic */ void access$setJioVideoView$p(InstreamVideo instreamVideo, s s7) {
        instreamVideo.q = s7;
    }

    public static final /* synthetic */ void access$setPodSelectionTimer$p(InstreamVideo instreamVideo, CountDownTimer countDownTimer) {
        instreamVideo.l = countDownTimer;
    }

    public static final /* synthetic */ void access$setPodTimeOut$p(InstreamVideo instreamVideo, boolean bl2) {
        instreamVideo.m = bl2;
    }

    public static final /* synthetic */ void access$setPodViewingTimer$p(InstreamVideo instreamVideo, CountDownTimer countDownTimer) {
        instreamVideo.i = countDownTimer;
    }

    public static final /* synthetic */ void access$setPrevPlayingAdId$p(InstreamVideo instreamVideo, String string2) {
        instreamVideo.h = string2;
    }

    public static final void access$startFetchingAdsForInfinite(InstreamVideo instreamVideo) {
        Object object;
        Object object2 = instreamVideo.c.L();
        if (object2 == (object = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
            object2 = new StringBuilder();
            object = instreamVideo.c;
            Object object3 = ": inside startFetchingAdsForInfinite";
            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = instreamVideo.k;
            if (object2 == null) {
                InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher;
                f f5;
                e e2;
                com.jio.jioads.common.b b2 = instreamVideo.c;
                c c2 = instreamVideo.d;
                HashMap hashMap = instreamVideo.getHeaders();
                object2 = e2;
                object3 = instreamVideo;
                e2 = new FunctionReferenceImpl(2, instreamVideo, InstreamVideo.class, "onResponseReceivedForInfiniteAdPod", "onResponseReceivedForInfiniteAdPod(Ljava/util/HashMap;Ljava/lang/String;)V", 0);
                int n3 = 6;
                object2 = f5;
                f5 = new FunctionReferenceImpl(n3, instreamVideo, InstreamVideo.class, "onErrorForInfiniteAdPod", "onErrorForInfiniteAdPod(Lcom/jio/jioads/adinterfaces/JioAdError;ZLcom/jio/jioads/cdnlogging/ErrorRequestModel$Severity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                object = instreamVideoInfiniteAdFetcher;
                object3 = b2;
                instreamVideo.k = instreamVideoInfiniteAdFetcher = new InstreamVideoInfiniteAdFetcher(b2, c2, hashMap, e2, f5);
            }
            if ((object2 = instreamVideo.k) != null) {
                ((InstreamVideoInfiniteAdFetcher)object2).fetchAdForInfiniteAdPod();
            }
        }
    }

    public static final void access$startPodViewingTimer(InstreamVideo instreamVideo) {
        instreamVideo.getClass();
        j j3 = new j(instreamVideo);
        com.jio.jioads.util.s.d(j3);
    }

    public final void a(int n3, int n4) {
        Object object;
        Object object2;
        int n7;
        Object object3;
        ArrayList<JioAdView$AdState> arrayList;
        int n8;
        int n10;
        InstreamVideo instreamVideo = this;
        int n14 = n3;
        int n15 = n4;
        int n16 = 1;
        Object object4 = new ArrayList();
        Object object5 = this.q;
        if (object5 != null) {
            object5 = ((s)object5).O;
        } else {
            n10 = 0;
            object5 = null;
        }
        if (object5 != null && (n8 = ((ArrayList)object5).size()) > n14) {
            n8 = ((ArrayList)object5).size();
            arrayList = ((ArrayList)object5).subList(n14, n8);
            Intrinsics.checkNotNullExpressionValue(arrayList, "subList(...)");
            ((ArrayList)object4).addAll(arrayList);
            arrayList = new ArrayList<JioAdView$AdState>();
            n14 += n16;
            object3 = null;
            for (n7 = 0; n7 < n14; n7 += n16) {
                object2 = ((ArrayList)object5).get(n7);
                arrayList.add((JioAdView$AdState)((Object)object2));
            }
            ((ArrayList)object5).clear();
            ((ArrayList)object5).addAll(arrayList);
        }
        if ((object = instreamVideo.j) != null) {
            if (object5 == null) {
                object5 = new ArrayList();
            }
            Intrinsics.checkNotNullParameter(object4, "removeUrlList");
            Intrinsics.checkNotNullParameter(object5, "videoUrlList");
            arrayList = ((com.jio.jioads.instreamads.vastparser.n)object).E;
            if (arrayList != null) {
                Object object6;
                arrayList = ((com.jio.jioads.instreamads.vastparser.n)object).c;
                object3 = arrayList;
                object3 = ((com.jio.jioads.controller.f)((Object)arrayList)).a;
                n7 = ((com.jio.jioads.controller.o)object3).o;
                if (n7 != 0 && (object2 = (object3 = ((com.jio.jioads.instreamads.vastparser.n)object).b).k0()) != (object6 = JioAdView$AdState.DESTROYED)) {
                    Object object7;
                    int n17;
                    String string2;
                    Object object8;
                    Object object9;
                    com.jio.jioads.instreamads.vastparser.model.j j3;
                    int n18;
                    object2 = new ArrayList();
                    int n19 = ((ArrayList)object4).isEmpty() ^ n16;
                    if (n19 != 0) {
                        object6 = ((com.jio.jioads.instreamads.vastparser.n)object).E;
                        Intrinsics.checkNotNull(object6);
                        object6 = ((m)object6).c.iterator();
                        while ((n18 = object6.hasNext()) != 0) {
                            boolean bl2;
                            j3 = (com.jio.jioads.instreamads.vastparser.model.j)object6.next();
                            object9 = ((ArrayList)object4).iterator();
                            while (bl2 = object9.hasNext()) {
                                object8 = (k)object9.next();
                                string2 = ((k)object8).c;
                                if (j3 == null || (n17 = Intrinsics.areEqual(object7 = j3.h, string2)) == 0 || (n17 = Intrinsics.areEqual(object7 = j3.i, object8 = ((k)object8).n)) == 0) continue;
                                ((ArrayList)object2).add(j3);
                            }
                        }
                    }
                    object4 = ((ArrayList)object2).iterator();
                    while ((n17 = object4.hasNext()) != 0) {
                        object7 = (com.jio.jioads.instreamads.vastparser.model.j)object4.next();
                        object6 = ((com.jio.jioads.instreamads.vastparser.n)object).E;
                        if (object6 == null || (object6 = ((m)object6).c) == null) continue;
                        object6.remove(object7);
                    }
                    long l2 = ((com.jio.jioads.instreamads.vastparser.n)object).A();
                    long l3 = 1L;
                    long l4 = n15;
                    long l7 = l3 - l4;
                    Object object10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object10 <= 0 && (object10 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) <= 0) {
                        l2 = ((com.jio.jioads.instreamads.vastparser.n)object).A();
                        object10 = (int)l2 - n15;
                    } else {
                        l2 = ((com.jio.jioads.instreamads.vastparser.n)object).A();
                        object10 = (int)l2;
                    }
                    ((com.jio.jioads.instreamads.vastparser.n)object).i = (int)object10;
                    object4 = ((com.jio.jioads.instreamads.vastparser.n)object).E;
                    if (object4 != null) {
                        ((m)object4).e = n16;
                    }
                    ((com.jio.jioads.instreamads.vastparser.n)object).s = false;
                    ((com.jio.jioads.instreamads.vastparser.n)object).u = n15;
                    Intrinsics.checkNotNull(object4);
                    object4 = ((m)object4).c;
                    n17 = object4 instanceof Collection;
                    if (n17 != 0 && (n17 = ((Collection)object4).isEmpty()) != 0) {
                        n17 = 0;
                        object7 = null;
                    } else {
                        object4 = ((Iterable)object4).iterator();
                        n17 = 0;
                        object7 = null;
                        while ((n19 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                            object6 = (com.jio.jioads.instreamads.vastparser.model.j)object4.next();
                            if (object6 != null) {
                                object6 = ((com.jio.jioads.instreamads.vastparser.model.j)object6).n;
                            } else {
                                n19 = 0;
                                object6 = null;
                            }
                            if (object6 == null || (n17 += n16) >= 0) continue;
                            xx_2.m();
                            throw null;
                        }
                    }
                    ((com.jio.jioads.instreamads.vastparser.n)object).t = n17;
                    Object object11 = ((com.jio.jioads.instreamads.vastparser.n)object).E;
                    if (object11 != null) {
                        ((m)object11).f = false;
                    }
                    object11 = ((com.jio.jioads.instreamads.vastparser.n)object).v();
                    object4 = arrayList;
                    object4 = (com.jio.jioads.controller.f)((Object)arrayList);
                    object4.getClass();
                    object7 = "adspotId";
                    Intrinsics.checkNotNullParameter(object11, (String)object7);
                    object4 = ((com.jio.jioads.controller.f)object4).a;
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object11, (String)object7);
                    object4 = ((com.jio.jioads.controller.o)object4).f;
                    if (object4 != null) {
                        Intrinsics.checkNotNullParameter(object11, (String)object7);
                        object7 = ((t)object4).a();
                        n17 = (int)(((HashMap)object7).containsKey(object11) ? 1 : 0);
                        if (n17 != 0) {
                            object7 = ((t)object4).a();
                            ((HashMap)object7).remove(object11);
                        }
                        if ((n17 = (int)(((HashMap)(object7 = ((t)object4).c())).containsKey(object11) ? 1 : 0)) != 0) {
                            object4 = ((t)object4).c();
                            ((HashMap)object4).remove(object11);
                        }
                    }
                    if ((object11 = object3.k0()) != (object4 = JioAdView$AdState.DESTROYED)) {
                        object11 = object5.iterator();
                        while ((object10 = (Object)object11.hasNext()) != false) {
                            object4 = (k)object11.next();
                            string2 = ((k)object4).c;
                            if (string2 == null || (n10 = string2.length()) == 0 || (object8 = ((k)object4).n) == null || (n10 = ((String)object8).length()) == 0) continue;
                            object5 = ((k)object4).r;
                            if (object5 != null) {
                                n18 = n10 = ((Integer)object5).intValue();
                            } else {
                                n18 = 0;
                                j3 = null;
                            }
                            object9 = ((com.jio.jioads.instreamads.vastparser.n)object).v();
                            object4 = ((k)object4).p;
                            if (object4 == null) {
                                object4 = "";
                            }
                            object6 = arrayList;
                            object6 = (com.jio.jioads.controller.f)((Object)arrayList);
                            ((com.jio.jioads.controller.f)object6).c(n18, (String)object9, (String)object8, string2, (String)object4);
                        }
                    }
                    object11 = new StringBuilder();
                    object4 = ((com.jio.jioads.instreamads.vastparser.n)object).v();
                    ((StringBuilder)object11).append((String)object4);
                    object4 = ": checking if further selection needed after pod optimization durationRetained ";
                    ((StringBuilder)object11).append((String)object4);
                    ((StringBuilder)object11).append(n15);
                    ((StringBuilder)object11).append(", servedAdCount: ");
                    n15 = ((com.jio.jioads.instreamads.vastparser.n)object).t;
                    ((StringBuilder)object11).append(n15);
                    ((StringBuilder)object11).append(", leftoverAdDuration: ");
                    n15 = ((com.jio.jioads.instreamads.vastparser.n)object).i;
                    ((StringBuilder)object11).append(n15);
                    ((StringBuilder)object11).append(", removeList: ");
                    n15 = ((ArrayList)object2).size();
                    ((StringBuilder)object11).append(n15);
                    ((StringBuilder)object11).append(", vastAds: ");
                    Object object12 = ((com.jio.jioads.instreamads.vastparser.n)object).E;
                    Intrinsics.checkNotNull(object12);
                    n15 = ((m)object12).c.size();
                    ((StringBuilder)object11).append(n15);
                    object12 = ((StringBuilder)object11).toString();
                    object11 = "message";
                    Intrinsics.checkNotNullParameter(object12, (String)object11);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object12 = JioAds$LogLevel.NONE;
                    object12 = ((com.jio.jioads.instreamads.vastparser.n)object).l;
                    if (object12 != null) {
                        object12.a();
                    }
                    object12 = ((com.jio.jioads.instreamads.vastparser.n)object).v();
                    ((com.jio.jioads.instreamads.vastparser.n)object).q((String)object12);
                }
            }
        }
        if ((object = instreamVideo.q) != null) {
            ((s)object).J(false);
        }
    }

    public final void a(String string2, Map object) {
        com.jio.jioads.instreamads.vastparser.n n3 = this.j;
        if (n3 == null) {
            HashMap hashMap = this.getHeaders();
            com.jio.jioads.common.b b2 = this.c;
            c c2 = this.d;
            l l2 = new l(this, (Map)object);
            com.jio.jioads.controller.a a2 = this.b;
            Object object2 = n3;
            this.j = n3 = new com.jio.jioads.instreamads.vastparser.n(hashMap, b2, c2, l2, a2);
            n3.l = object2 = new n(this, (Map)object);
            n3.y = object = new o(this);
            n3.u(string2);
        } else {
            Object object3;
            n3 = null;
            if (object != null) {
                object3 = "pgm_expiry";
                object = (String)object.get(object3);
            } else {
                object = null;
            }
            object = object != null ? "pgm" : null;
            object3 = this.j;
            if (object3 != null) {
                ((com.jio.jioads.instreamads.vastparser.n)object3).k(string2, (String)object, null);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Exception exception2;
        Object object;
        CharSequence charSequence;
        Object object2;
        block4: {
            int n3;
            block3: {
                object2 = "plr";
                charSequence = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                object = ((com.jio.jioads.controller.f)this.d).a;
                boolean bl2 = ((com.jio.jioads.controller.o)object).u;
                if (!bl2) return 0 != 0;
                object = this.c.n0();
                if (object != null) {
                    return (boolean)((Boolean)object).booleanValue();
                }
                try {
                    object = this.getHeaders();
                    Object object3 = Constants$HeaderKeys.JIO_DATA;
                    String string2 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    Locale locale = Locale.ROOT;
                    string2 = string2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string2, charSequence);
                    bl2 = ((HashMap)object).containsKey(string2);
                    if (!bl2) return 0 != 0;
                    object = this.getHeaders();
                    object3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    object3 = ((String)object3).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, charSequence);
                    charSequence = ((HashMap)object).get(object3);
                    if (charSequence != null) break block3;
                    charSequence = "{}";
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if ((n3 = (object = new JSONObject(charSequence)).has(object2)) == 0) return 0 != 0;
            int n4 = object.getInt(object2);
            if (n4 != (n3 = 1)) return 0 != 0;
            return 1 != 0;
        }
        charSequence = new StringBuilder();
        object = this.c;
        String string3 = ": Exception while getting PLAYER flag ";
        j_0.n((com.jio.jioads.common.b)object, (StringBuilder)charSequence, string3);
        l_0.f(exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        return 0 != 0;
    }

    public final void b() {
        boolean bl2;
        this.s = false;
        Object object = this.d;
        String string2 = this.c.P();
        object = (com.jio.jioads.controller.f)object;
        object.getClass();
        Object object2 = "adspotId";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = ((com.jio.jioads.controller.f)object).a;
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = ((com.jio.jioads.controller.o)object).f;
        if (object != null) {
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            object2 = ((t)object).a();
            bl2 = ((HashMap)object2).containsKey(string2);
            if (bl2) {
                object2 = ((t)object).a();
                ((HashMap)object2).remove(string2);
            }
            if (bl2 = ((HashMap)(object2 = ((t)object).c())).containsKey(string2)) {
                object = ((t)object).c();
                ((HashMap)object).remove(string2);
            }
        }
        object = CompanionManager.Companion.getInstance();
        string2 = null;
        if (object != null) {
            ((CompanionManager)object).setCompanionTrackerReceiver$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(null);
        }
        if ((object = this.q) != null && (bl2 = Utility.ifOmSdkIsAvailable()) && (object2 = ((s)object).p) != null) {
            ((com.jio.jioads.iab.b)object2).e();
            ((s)object).p = null;
        }
        if ((object = this.i) != null) {
            object.cancel();
        }
        this.i = null;
        object = this.q;
        if (object != null) {
            ((s)object).l();
        }
        this.q = null;
        object = this.j;
        if (object != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).t();
        }
        if ((object = this.j) != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).l = null;
        }
        if (object != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).y = null;
        }
        if (object != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).d = null;
        }
        this.j = null;
        this.k = null;
        object = this.l;
        if (object != null) {
            object.cancel();
        }
        this.l = null;
        this.getHeaders().clear();
        this.h = null;
        this.f = false;
        this.n = false;
        this.m = false;
    }

    public final boolean checkEligibilityForReward$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3, int n4, Integer n7) {
        int n8;
        n3 = n7 != null && ((n8 = n7.intValue()) == 0 && n3 == n4 || (n4 = n7.intValue()) > 0 && n3 >= (n4 = n7.intValue())) ? 1 : 0;
        return n3 != 0;
    }

    public void closeAd() {
        Object object = new StringBuilder();
        Object object2 = this.c;
        String string2 = ": closeAd InstreamVideo ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, string2);
        object2 = this.q;
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q;
        if (object != null) {
            ((s)object).u();
        }
    }

    public void collapseAd() {
        super.collapseAd();
        s s7 = this.q;
        if (s7 != null) {
            boolean bl2;
            com.jio.jioads.instream.video.a.a(s7, ": collapseAd called isCalledByDev: true");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            s7.F = bl2 = true;
            s7.P();
        }
    }

    public void continueWithPromoBackSelection() {
        super.continueWithPromoBackSelection();
        Object object = new StringBuilder();
        Object object2 = this.c;
        Object object3 = ": inside continueWithPromoBackSelection";
        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.j;
        if (object2 == null) {
            object2 = null;
            this.a(null, null);
        }
        if ((object2 = this.j) != null) {
            object3 = new StringBuilder();
            Object object4 = ((com.jio.jioads.instreamads.vastparser.n)object2).b;
            String string2 = ": pgm continue ad pod selection promo& backupselection because pgm giving no fill";
            j_0.i((com.jio.jioads.common.b)object4, (StringBuilder)object3, string2);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = object4.P();
            object3 = Utility.INSTANCE;
            object4 = object4.P();
            ((Utility)object3).getCcbValue((String)object4);
            ((com.jio.jioads.instreamads.vastparser.n)object2).s((String)object);
        }
    }

    public void expandAd() {
        super.expandAd();
        s s7 = this.q;
        if (s7 != null) {
            com.jio.jioads.instream.video.a.a(s7, ": expandAd called isCalledByDev: true");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            s7.F = false;
            s7.P();
        }
    }

    public String getCtaText() {
        boolean bl2;
        Object object = this.q;
        object = object != null && (bl2 = ((s)object).a()) && (object = ((s)object).y) != null && (object = ((com.jio.jioads.videomodule.renderer.f)object).L) != null && (object = object.getText()) != null ? object.toString() : null;
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public JioAdView$AdDetails getCurrentAdDetails() {
        var1_1 = this.c.P();
        var2_2 = this.q;
        var3_3 = null;
        var4_4 = var2_2 != null ? (var2_2 = var2_2.S()) : null;
        var2_2 = this.q;
        if (var2_2 == null) ** GOTO lbl-1000
        var5_5 = var2_2.b;
        var6_6 = var5_5.a;
        if (var6_6 != null) {
            var2_2 = var2_2.T();
            var7_7 = var2_2 = var6_6.e((m)var5_5, (String)var2_2);
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = null;
        }
        var8_8 = this.getTrackNumber();
        var9_9 = var8_8 + 1;
        if (var7_7 != null && (var8_8 = (int)var7_7.isEmpty()) == 0) {
            var8_8 = var7_7.size();
            var5_5 = new String[var8_8];
            var6_6 = null;
            for (var10_10 = 0; var10_10 < var8_8; ++var10_10) {
                var11_11 /* !! */  = new Object();
                var12_12 /* !! */  = this.c.k0();
                if (var12_12 /* !! */  == (var13_13 = JioAdView$AdState.DESTROYED)) {
                    return null;
                }
                var12_12 /* !! */  = this.c.Y();
                var11_11 /* !! */ .p = var12_12 /* !! */ ;
                var12_12 /* !! */  = (String)var7_7.get(var10_10);
                var11_11 /* !! */ .a = var12_12 /* !! */ ;
                var12_12 /* !! */  = this.c.P();
                var11_11 /* !! */ .q = var12_12 /* !! */ ;
                var12_12 /* !! */  = (String)this.g.getValue();
                var11_11 /* !! */ .b = var12_12 /* !! */ ;
                var11_11 /* !! */ .c = null;
                var11_11 /* !! */ .v = null;
                var12_12 /* !! */  = Integer.valueOf(var9_9);
                var11_11 /* !! */ .l = var12_12 /* !! */ ;
                var12_12 /* !! */  = Boolean.TRUE;
                var11_11 /* !! */ .m = var12_12 /* !! */ ;
                var13_13 = Boolean.FALSE;
                var11_11 /* !! */ .n = var13_13;
                var14_14 = this.d;
                var15_15 = this.getHeaders();
                var16_16 = this.q;
                var16_16 = var16_16 != null ? var16_16.T() : null;
                var17_17 = this.q;
                var17_17 = var17_17 != null ? var17_17.V() : null;
                var11_11 /* !! */ .d = var14_14 = com.jio.jioads.controller.o.o(((com.jio.jioads.controller.f)var14_14).a, (String)var16_16, (String)var17_17, var15_15);
                var11_11 /* !! */ .e = var12_12 /* !! */ ;
                var11_11 /* !! */ .f = null;
                var11_11 /* !! */ .o = var13_13;
                var12_12 /* !! */  = "";
                var11_11 /* !! */ .g = var12_12 /* !! */ ;
                var11_11 /* !! */ .x = var12_12 /* !! */ ;
                var11_11 /* !! */ .h = var12_12 /* !! */ ;
                var13_13 = Utility.INSTANCE;
                var14_14 = var11_11 /* !! */ .p;
                Intrinsics.checkNotNull(var14_14);
                var12_12 /* !! */  = var13_13.getCbValue((Context)var14_14, (String)var12_12 /* !! */ );
                var11_11 /* !! */ .i = var12_12 /* !! */ ;
                var11_11 /* !! */ .j = null;
                var11_11 /* !! */ .k = null;
                var12_12 /* !! */  = Unit.a;
                var5_5[var10_10] = var11_11 /* !! */  = var13_13.replaceMacros((com.jio.jioads.util.k)var11_11 /* !! */ );
            }
            var11_11 /* !! */  = var5_5;
        } else {
            var11_11 /* !! */  = null;
        }
        var2_2 = this.q;
        if (var2_2 != null) {
            var2_2 = var2_2.V();
        } else {
            var8_8 = 0;
            var2_2 = null;
        }
        if (var2_2 != null && (var8_8 = var2_2.length()) != 0) {
            var2_2 = this.q;
            if (var2_2 != null) {
                var2_2 = var2_2.T();
            } else {
                var8_8 = 0;
                var2_2 = null;
            }
            if (var2_2 != null && (var8_8 = var2_2.length()) != 0) {
                var5_5 = this.q;
                var5_5 = var5_5 != null ? var5_5.V() : null;
                Intrinsics.checkNotNull(var5_5);
                var6_6 = this.q;
                if (var6_6 != null) {
                    var3_3 = var6_6.T();
                }
                var6_6 = var3_3;
                Intrinsics.checkNotNull(var3_3);
                var16_16 = var3_3 = this.g.getValue();
                var16_16 = (String)var3_3;
                var13_13 = "";
                var14_14 = "";
                var12_12 /* !! */  = "";
                var15_15 = null;
                var3_3 = var2_2;
                var2_2 = new JioAdView$AdDetails((String)var5_5, (String)var6_6, var1_1, (String)var4_4, var11_11 /* !! */ , (String)var12_12 /* !! */ , (String)var13_13, (String)var14_14, null, var9_9, (String)var16_16, (List)var7_7);
            }
        }
        return var3_3;
    }

    public String getCurrentCampaignId() {
        Object object = this.q;
        if (object == null || (object = ((s)object).V()) == null) {
            object = super.getCurrentCampaignId();
        }
        return object;
    }

    public int getCurrentPosition() {
        int n3;
        Object object = this.q;
        if (object != null && (object = ((s)object).Z()) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final HashMap getHeaders() {
        return (HashMap)this.o.getValue();
    }

    public String getInstreamVideoCTAClickUrl() {
        Object object = this.q;
        object = object != null ? ((s)object).S() : null;
        return object;
    }

    public int getTrackNumber() {
        s s7 = this.q;
        int n3 = s7 != null ? s7.P : super.getTrackNumber();
        return n3;
    }

    public Integer getVideoAdDuration() {
        Object object = this.q;
        if (object == null || (object = ((s)object).b0()) == null) {
            object = super.getVideoAdDuration();
        }
        return object;
    }

    public Integer getVideoCurrentPosition() {
        Object object = this.q;
        if (object == null || (object = ((s)object).Z()) == null) {
            object = super.getVideoCurrentPosition();
        }
        return object;
    }

    public final int getVolume$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        int n3;
        Object object = this.q;
        if (object != null) {
            n3 = ((s)object).X();
        } else {
            object = new StringBuilder();
            com.jio.jioads.common.b b2 = this.c;
            String string2 = ": Current jioVideoView is Getting Null so retuning Zero ";
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public void hideCTAButton() {
        super.hideCTAButton();
        Object object = this.q;
        if (object != null) {
            boolean bl2;
            Object object2 = ((s)object).h0();
            ((com.jio.jioads.videomodule.config.b)object2).f = bl2 = true;
            object2 = ((s)object).X;
            if (object2 != null && (object = ((s)object).e0) != null) {
                ((com.jio.jioads.videomodule.renderer.e)object).u();
            }
        }
    }

    public void hideControls() {
        JioVideoViewState jioVideoViewState;
        boolean bl2;
        Object object;
        super.hideControls();
        Object object2 = this.q;
        if (!(object2 == null || (object = ((s)object2).X) == null || (object = ((s)object2).e0) == null || (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = x.a)) && (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = w_0.a)) || (object2 = ((s)object2).e0) == null)) {
            ((com.jio.jioads.videomodule.renderer.e)object2).j = bl2 = true;
            ((com.jio.jioads.videomodule.renderer.e)object2).l(bl2);
        }
    }

    public void hidePlayButton() {
        super.hidePlayButton();
        Object object = this.q;
        if (object != null && (object = ((s)object).e0) != null) {
            boolean bl2;
            com.jio.jioads.videomodule.config.b b2 = ((com.jio.jioads.videomodule.renderer.e)object).g;
            b2.d = bl2 = true;
            object = ((com.jio.jioads.videomodule.renderer.e)object).d.q;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public void hideSkip() {
        Object object;
        super.hideSkip();
        Object object2 = this.q;
        if (object2 != null) {
            object2 = ((s)object2).e0;
            if (object2 != null) {
                object2 = ((com.jio.jioads.videomodule.renderer.e)object2).d;
                object = ((com.jio.jioads.videomodule.renderer.f)object2).w;
                int n3 = 8;
                if (object != null) {
                    object.setVisibility(n3);
                }
                object = ((com.jio.jioads.videomodule.renderer.f)object2).A;
                if (object != null) {
                    object.setVisibility(n3);
                }
                object2 = ((com.jio.jioads.videomodule.renderer.f)object2).i;
                if (object2 != null) {
                    object2.setVisibility(n3);
                }
            }
            object2 = Unit.a;
        } else {
            object2 = null;
        }
        if (object2 == null) {
            object2 = new StringBuilder();
            object = this.c;
            String string2 = ": jioVideoView is null";
            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
    }

    public boolean isMediaMuted() {
        boolean bl2;
        Object object = this.q;
        if (object != null) {
            object = ((s)object).B;
            h_0 h_02 = h_0.a;
            bl2 = Intrinsics.areEqual(object, h_02);
        } else {
            bl2 = super.isMediaMuted();
        }
        return bl2;
    }

    public boolean isMediaPlaying() {
        s s7 = this.q;
        boolean bl2 = s7 != null ? s7.c() : super.isMediaPlaying();
        return bl2;
    }

    public void muteVideoAd() {
        super.muteVideoAd();
        s s7 = this.q;
        if (s7 != null) {
            boolean bl2 = true;
            s7.F(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void notifyAdContainerSizeChange() {
        s s7 = this.q;
        if (s7 == null) return;
        ViewGroup viewGroup = null;
        try {
            s7.U = false;
            viewGroup = s7.h;
            if (viewGroup == null) return;
            int n3 = 2;
            wz_1 wz_12 = new wz_1(s7, n3);
            viewGroup.post((Runnable)wz_12);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAdDataUpdate(String object, Map object2) {
        Exception exception2;
        block10: {
            Object object3;
            Object object4;
            boolean bl2;
            try {
                bl2 = this.e;
                object4 = "message";
                if (bl2) {
                    object = new StringBuilder();
                    object2 = this.c;
                    object2 = object2.P();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ": returning from onAdDataUpdate";
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    return;
                }
            }
            catch (Exception exception2) {
                break block10;
            }
            bl2 = false;
            Object object5 = null;
            this.s = false;
            boolean bl3 = false;
            Object object6 = null;
            if (object2 != null) {
                object3 = "pgm_expiry";
                object3 = object2.get(object3);
            } else {
                object3 = null;
            }
            if (object3 == null) {
                object3 = this.l;
                if (object3 != null) {
                    object3.cancel();
                }
                if ((object3 = this.i) != null) {
                    object3.cancel();
                }
                this.m = false;
                this.l = null;
                this.i = null;
                this.n = false;
                this.f = false;
            }
            if ((bl2 = (object5 = this.c).W()) != (bl3 = true) && !(bl2 = (boolean)Intrinsics.areEqual(object, object5 = "pgm_add_placeholder"))) {
                boolean bl4 = TextUtils.isEmpty((CharSequence)object);
                if (bl4) {
                    object = new StringBuilder();
                    object2 = this.c;
                    object2 = object2.P();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ": No ads in inventory";
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = JioAdError.Companion;
                    object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object.getClass();
                    object4 = t_0.a((JioAdError$JioAdErrorType)((Object)object2));
                    object = "No ads in inventory";
                    ((JioAdError)object4).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
                    object = this.b;
                    object3 = com.jio.jioads.cdnlogging.d.a;
                    String string2 = "onAdDataUpdate";
                    String string3 = "InstreamVideo";
                    String string4 = "No ads in inventory";
                    object5 = object;
                    object5 = (V)object;
                    bl3 = true;
                    ((V)object5).d((JioAdError)object4, bl3, (com.jio.jioads.cdnlogging.d)((Object)object3), string2, string3, string4, null);
                    return;
                }
                object = new StringBuilder();
                object2 = this.c;
                object2 = object2.P();
                ((StringBuilder)object).append((String)object2);
                object2 = ": Mismatch Ad Type";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object = JioAds.Companion;
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError.Companion;
                object2 = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
                object.getClass();
                object4 = t_0.a((JioAdError$JioAdErrorType)((Object)object2));
                object = "Mismatch Ad Type";
                ((JioAdError)object4).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
                object = this.b;
                object3 = com.jio.jioads.cdnlogging.d.a;
                String string5 = "onAdDataUpdate";
                String string6 = "InstreamVideo";
                String string7 = "Mismatch Ad Type";
                object5 = object;
                object5 = (V)object;
                bl3 = false;
                object6 = null;
                ((V)object5).d((JioAdError)object4, false, (com.jio.jioads.cdnlogging.d)((Object)object3), string5, string6, string7, null);
                return;
            }
            object5 = new StringBuilder();
            object6 = this.c;
            object6 = object6.P();
            ((StringBuilder)object5).append((String)object6);
            object6 = ": InstreamVideo onAdDataUpdate";
            ((StringBuilder)object5).append((String)object6);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            object5 = JioAds.Companion;
            object5 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            object5 = this.getHeaders();
            ((HashMap)object5).clear();
            object5 = this.getHeaders();
            object4 = object2 == null ? fh1_2.f() : object2;
            ((HashMap)object5).putAll(object4);
            object5 = new h(this);
            com.jio.jioads.util.s.d((Function0)object5);
            this.a((String)object, (Map)object2);
            return;
        }
        object2 = new StringBuilder();
        j_0.n(this.c, (StringBuilder)object2, ": ");
        com.jio.jioads.common.b b2 = this.c;
        String string8 = ": exception onAdDataUpdate: ";
        j_0.n(b2, (StringBuilder)object2, string8);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public void onCacheAd() {
    }

    public void onCacheMediationAd(JSONObject jSONObject, String object, Map object2) {
        Object object3 = new StringBuilder();
        Object object4 = this.c;
        Object object5 = ": InstreamVideo onCacheMediationAd() called";
        j_0.i((com.jio.jioads.common.b)object4, (StringBuilder)object3, (String)object5);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        this.getHeaders().clear();
        object4 = this.getHeaders();
        if (object2 == null) {
            object2 = fh1_2.f();
        }
        ((HashMap)object4).putAll(object2);
        object2 = object == null ? "" : object;
        this.p = object2;
        l_0.h("inside check mediation so passing promotion response to controller: ", (String)object);
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = this.a;
        object5 = this.b;
        com.jio.jioads.common.b b2 = this.c;
        c c2 = this.d;
        InstreamVideo$mediationListener$1 instreamVideo$mediationListener$1 = this.t;
        object3 = object;
        object = new JioAdMediationController((ViewGroup)object4, (com.jio.jioads.controller.a)object5, b2, c2, instreamVideo$mediationListener$1);
        object2 = this.p;
        object3 = this.getHeaders();
        ((JioAdMediationController)object).cacheMediationAd(jSONObject, (String)object2, (Map)object3);
    }

    public void onDestroy() {
        boolean bl2;
        boolean bl3;
        Object object = new StringBuilder();
        Object object2 = this.c;
        Object object3 = ": InstreamVideo: onDestroy(): ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, (String)object3);
        object2 = this.q;
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.e = bl3 = true;
        object = this.q;
        if (object != null) {
            ((s)object).u();
        }
        object = this.q;
        object2 = null;
        if (object != null) {
            ((s)object).z = null;
        }
        if (object != null && (bl2 = Utility.ifOmSdkIsAvailable()) && (object3 = ((s)object).p) != null) {
            ((com.jio.jioads.iab.b)object3).e();
            ((s)object).p = null;
        }
        if ((object = this.j) != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).t();
        }
        if ((object = this.q) == null) {
            this.b();
        }
    }

    public void onHandleNoFillPgm() {
        super.onHandleNoFillPgm();
        com.jio.jioads.instreamads.vastparser.n n3 = this.j;
        if (n3 != null) {
            n3.C();
        }
    }

    public View onShowAdView() {
        Object object = new StringBuilder();
        j_0.i(this.c, (StringBuilder)object, ": InstreamVideo onShowAdView called");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        boolean bl2 = this.e;
        if (bl2) {
            object2 = new StringBuilder();
            com.jio.jioads.common.l.a(this.c, (StringBuilder)object2, ": returning from onShowAdView as InstreamVideo is released", (JioAds$Companion)object);
            return null;
        }
        object2 = this.a;
        if (object2 != null) {
            bl2 = this.m;
            if (!bl2) {
                object = this.b;
                object2 = JioAdView$AdState.STARTING;
                ((V)object).e((JioAdView$AdState)((Object)object2));
                object = this.q;
                if (object != null) {
                    object2 = this.a;
                    Intrinsics.checkNotNull(object2);
                    int n3 = 14;
                    Object var5_5 = null;
                    com.jio.jioads.videomodule.s.A((s)object, (ViewGroup)object2, null, false, n3);
                }
            } else {
                object2 = new StringBuilder();
                com.jio.jioads.common.b b2 = this.c;
                String string2 = ": pod timeout";
                com.jio.jioads.common.l.a(b2, (StringBuilder)object2, string2, (JioAds$Companion)object);
            }
        } else {
            object2 = new StringBuilder();
            j_0.n(this.c, (StringBuilder)object2, ": ");
            com.jio.jioads.common.l.a(this.c, (StringBuilder)object2, ": error in loading: adContainer is null", (JioAds$Companion)object);
            object = this.b;
            object2 = JioAdView$AdState.FAILED;
            ((V)object).e((JioAdView$AdState)((Object)object2));
            object = this.b;
            object2 = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
            object2.getClass();
            JioAdError jioAdError = t_0.a(jioAdError$JioAdErrorType);
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.c;
            Object object3 = object;
            object3 = (V)object;
            String string3 = "onShowAdView";
            String string4 = "InstreamVideo";
            String string5 = "adContainer is null";
            ((V)object3).d(jioAdError, false, d2, string3, string4, string5, null);
        }
        return null;
    }

    public void pauseAd(boolean bl2) {
        boolean bl3;
        boolean bl4;
        Object object = new StringBuilder();
        String string2 = this.c.P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": InstreamVideo pauseAd called ");
        ((StringBuilder)object).append(bl2);
        object = ((StringBuilder)object).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q;
        if (object != null && (bl4 = ((s)object).c()) == (bl3 = true) && (object = this.q) != null) {
            ((s)object).K(bl2 ^= bl3);
        }
    }

    public void prepareNextVideoAd() {
        super.prepareNextVideoAd();
        com.jio.jioads.instreamads.vastparser.n n3 = this.j;
        if (n3 != null) {
            int n4 = 1;
            ExecutorService executorService = Executors.newFixedThreadPool(n4);
            int n7 = 2;
            l32 l322 = new l32(n3, n7);
            executorService.submit(l322);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean resetPodIfValid() {
        int n3;
        block19: {
            Object object;
            block17: {
                long l2;
                long l3;
                long l4;
                int n4;
                int n7;
                int n8;
                long l7;
                block18: {
                    Object object2;
                    InstreamVideo instreamVideo = this;
                    n3 = 1;
                    Object object3 = "message";
                    Object object4 = ((com.jio.jioads.controller.f)this.d).a;
                    boolean bl2 = ((com.jio.jioads.controller.o)object4).o;
                    if (!bl2) {
                        this.b();
                        return false;
                    }
                    this.s = false;
                    object4 = this.l;
                    if (object4 != null) {
                        object4.cancel();
                    }
                    if ((object4 = instreamVideo.i) != null) {
                        object4.cancel();
                    }
                    instreamVideo.m = false;
                    bl2 = false;
                    object4 = null;
                    instreamVideo.l = null;
                    instreamVideo.i = null;
                    instreamVideo.n = false;
                    instreamVideo.f = false;
                    try {
                        Object object5 = instreamVideo.j;
                        if (object5 == null || (object5 = instreamVideo.q) == null) break block17;
                        object5 = instreamVideo.d;
                        object5 = (com.jio.jioads.controller.f)object5;
                        object5 = ((com.jio.jioads.controller.f)object5).a;
                        l7 = ((com.jio.jioads.controller.o)object5).a0();
                        c c2 = instreamVideo.d;
                        c2 = (com.jio.jioads.controller.f)c2;
                        n8 = ((com.jio.jioads.controller.f)c2).l();
                        object2 = instreamVideo.q;
                        if (object2 != null) {
                            object4 = ((s)object2).O;
                        }
                    }
                    catch (Exception exception) {
                        break block17;
                    }
                    {
                        boolean bl3;
                        if (object4 == null || (bl2 = object4.isEmpty())) break block17;
                        object4 = new StringBuilder();
                        object2 = instreamVideo.c;
                        object2 = object2.P();
                        ((StringBuilder)object4).append((String)object2);
                        object2 = ": checking existing cached ad for pod optimisation";
                        ((StringBuilder)object4).append((String)object2);
                        object4 = ((StringBuilder)object4).toString();
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        object4 = JioAds.Companion;
                        object4 = ((JioAds$Companion)object4).getInstance();
                        ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        object4 = instreamVideo.q;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((s)object4).O;
                        object4 = ((ArrayList)object4).iterator();
                        n7 = 0;
                        object2 = null;
                        n4 = 0;
                        while (bl3 = object4.hasNext()) {
                            int n10;
                            Object object6 = object4.next();
                            object6 = (k)object6;
                            Integer n14 = ((k)object6).o;
                            if (n14 != null) {
                                n10 = n14;
                            } else {
                                n10 = 0;
                                n14 = null;
                            }
                            int n15 = n8 + 1;
                            int n16 = n7 + n10;
                            long l8 = n16;
                            String string2 = object3;
                            long l12 = n15;
                            n15 = (int)(l12 == l8 ? 0 : (l12 < l8 ? -1 : 1));
                            if (n15 <= 0 && (n3 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1)) <= 0) {
                                object = new StringBuilder();
                                object3 = instreamVideo.c;
                                object3 = object3.P();
                                ((StringBuilder)object).append((String)object3);
                                object3 = ": vastAd: ";
                                ((StringBuilder)object).append((String)object3);
                                object3 = ((k)object6).c;
                                ((StringBuilder)object).append((String)object3);
                                object3 = ", duration: ";
                                ((StringBuilder)object).append((String)object3);
                                ((StringBuilder)object).append(n10);
                                object = ((StringBuilder)object).toString();
                                object3 = string2;
                                Intrinsics.checkNotNullParameter(object, string2);
                                object = JioAds.Companion;
                                object = ((JioAds$Companion)object).getInstance();
                                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object = JioAds$LogLevel.NONE;
                                n3 = 1;
                                n4 += n3;
                                n7 = n16;
                                continue;
                            }
                            object3 = string2;
                            break;
                        }
                        object = new StringBuilder();
                        object4 = instreamVideo.c;
                        object4 = object4.P();
                        ((StringBuilder)object).append((String)object4);
                        object4 = ": pod optimisation - total duration retained: ";
                        ((StringBuilder)object).append((String)object4);
                        ((StringBuilder)object).append(n7);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        object = JioAds.Companion;
                        object = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        if (n7 <= 0) break block18;
                        instreamVideo.a(n4, n7);
                    }
                }
                if ((n4 = (int)((l4 = (l3 = (long)(n8 += (n3 = 1))) - (l2 = (long)n7)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) <= 0 && (n8 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1))) <= 0) break block19;
            }
            n3 = 0;
            object = null;
        }
        if (n3 == 0) {
            this.b();
        }
        return n3 != 0;
    }

    public void resumeAd(boolean bl2) {
        s s7 = this.q;
        if (s7 != null) {
            s7.O(bl2 ^= true);
        }
    }

    public void setParentContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        this.a = viewGroup;
    }

    public void showCTAButton() {
        super.showCTAButton();
        Object object = this.q;
        if (object != null) {
            ((s)object).h0().f = false;
            com.jio.jioads.videomodule.player.o o3 = ((s)object).X;
            if (o3 != null && (object = ((s)object).e0) != null) {
                ((com.jio.jioads.videomodule.renderer.e)object).u();
            }
        }
    }

    public void showControls() {
        JioVideoViewState jioVideoViewState;
        boolean bl2;
        Object object;
        super.showControls();
        Object object2 = this.q;
        if (!(object2 == null || (object = ((s)object2).X) == null || (object = ((s)object2).e0) == null || (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = x.a)) && (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = w_0.a)) || (object2 = ((s)object2).e0) == null)) {
            object = null;
            ((com.jio.jioads.videomodule.renderer.e)object2).j = false;
            bl2 = true;
            ((com.jio.jioads.videomodule.renderer.e)object2).l(bl2);
        }
    }

    public void showPlayButton() {
        super.showPlayButton();
        Object object = this.q;
        if (object != null && (object = ((s)object).e0) != null) {
            com.jio.jioads.videomodule.config.b b2 = ((com.jio.jioads.videomodule.renderer.e)object).g;
            b2.d = false;
            object = ((com.jio.jioads.videomodule.renderer.e)object).d.q;
            if (object != null) {
                object.setVisibility(0);
            }
        }
    }

    public void showSkip() {
        super.showSkip();
        Object object = this.q;
        if (object != null) {
            ((s)object).m();
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            object = new StringBuilder();
            com.jio.jioads.common.b b2 = this.c;
            String string2 = ": jioVideoView is null";
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public void unmuteVideoAd() {
        super.unmuteVideoAd();
        s s7 = this.q;
        if (s7 != null) {
            boolean bl2 = true;
            s7.Q(bl2);
        }
    }
}

