/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsLoader;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$Info;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$VMAPInfo;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$VMAPInfoWithID;
import com.jio.jioads.adinterfaces.b_0;
import com.jio.jioads.adinterfaces.h_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.adinterfaces.y_0;
import com.jio.jioads.adinterfaces.z_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.j;
import com.jio.jioads.util.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class JioVmapAdsLoader {
    public Context a;
    public JioVmapAdsLoader$Info b;
    public JioVmapAdsLoader$JioVmapListener c;
    public JioAdView$AdState d;
    public boolean e;
    public int f;
    public JioAdView g;
    public boolean h;
    public Handler i;
    public final j j;
    public final Runnable k;

    public JioVmapAdsLoader(Context object, JioVmapAdsLoader$Info object2, JioVmapAdsLoader$JioVmapListener object3) {
        Object object4;
        this.a = object;
        this.b = object2;
        this.c = object3;
        com.jio.jioads.util.j.a("JioVmapAdsLoader init(), sv: AN-3");
        object = this.b;
        boolean bl2 = object instanceof JioVmapAdsLoader$VMAPInfo;
        object3 = "";
        if (bl2) {
            object2 = this.g;
            if (object2 != null) {
                object4 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfo";
                Intrinsics.checkNotNull(object, object4);
                object = ((JioVmapAdsLoader$VMAPInfo)object).getAdTargetting();
                ((JioAdView)object2).setJioAdsMetaData((JioAdsMetadata)object);
            }
        } else {
            bl2 = object instanceof JioVmapAdsLoader$VMAPInfoWithID;
            if (bl2) {
                object2 = this.g;
                object3 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfoWithID";
                if (object2 != null) {
                    Intrinsics.checkNotNull(object, (String)object3);
                    object = ((JioVmapAdsLoader$VMAPInfoWithID)object).getAdTargetting();
                    ((JioAdView)object2).setJioAdsMetaData((JioAdsMetadata)object);
                }
                object = this.b;
                Intrinsics.checkNotNull(object, (String)object3);
                object = (JioVmapAdsLoader$VMAPInfoWithID)object;
                object3 = ((JioVmapAdsLoader$VMAPInfoWithID)object).getVmapId();
            }
        }
        object2 = this.a;
        Intrinsics.checkNotNull(object2);
        object4 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        super((Context)object2, (String)object3, (JioAdView$AD_TYPE)((Object)object4));
        this.g = object;
        Intrinsics.checkNotNull(object);
        object = ((JioAdView)object).getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object != null) {
            object3 = this.a;
            Intrinsics.checkNotNull(object3);
            object2 = new j((Context)object3, (b)object);
        } else {
            bl2 = false;
            object2 = null;
        }
        this.j = object2;
        this.k = object = new fn1_1(this, 1);
    }

    public static final void a(JioVmapAdsLoader object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        j j3 = ((JioVmapAdsLoader)object).j;
        if (j3 != null && (object = ((JioVmapAdsLoader)object).g) != null) {
            ((JioAdView)object).playVmapAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(j3);
        }
    }

    public static final /* synthetic */ JioVmapAdsLoader$JioVmapListener access$getJioVmapListener$p(JioVmapAdsLoader jioVmapAdsLoader) {
        return jioVmapAdsLoader.c;
    }

    public static final /* synthetic */ JioAdView access$getMJioAdView$p(JioVmapAdsLoader jioVmapAdsLoader) {
        return jioVmapAdsLoader.g;
    }

    public static final /* synthetic */ void access$setAdState$p(JioVmapAdsLoader jioVmapAdsLoader, JioAdView$AdState jioAdView$AdState) {
        jioVmapAdsLoader.d = jioAdView$AdState;
    }

    public static final /* synthetic */ void access$setVmapLoaded$p(JioVmapAdsLoader jioVmapAdsLoader, boolean bl2) {
        jioVmapAdsLoader.e = bl2;
    }

    public static final void access$stopPlayerTimeObserver(JioVmapAdsLoader jioVmapAdsLoader) {
        jioVmapAdsLoader.getClass();
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Stopping player time observer", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = jioVmapAdsLoader.k;
        if (object != null) {
            string2 = jioVmapAdsLoader.i;
            if (string2 != null) {
                Intrinsics.checkNotNull(object);
                string2.removeCallbacks((Runnable)object);
            }
            object = null;
            jioVmapAdsLoader.i = null;
        }
    }

    public static final void b(JioVmapAdsLoader object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdError.Companion;
        Object object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        Object object4 = "Ad container is not visible";
        object2 = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), object4);
        object3 = ((JioVmapAdsLoader)object).g;
        if (object3 != null) {
            object4 = JioAdView$AdState.FAILED;
            ((JioAdView)object3).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$AdState)((Object)object4));
        }
        object = ((JioVmapAdsLoader)object).c;
        if (object != null) {
            object.onJioVmapError((JioAdError)object2);
        }
    }

    public static final void c(JioVmapAdsLoader object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdError.Companion;
        Object object3 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
        Object object4 = "Vmap is not loaded";
        object2 = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), object4);
        object3 = ((JioVmapAdsLoader)object).g;
        if (object3 != null) {
            object4 = JioAdView$AdState.FAILED;
            ((JioAdView)object3).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$AdState)((Object)object4));
        }
        object = ((JioVmapAdsLoader)object).c;
        if (object != null) {
            object.onJioVmapError((JioAdError)object2);
        }
    }

    public static final void d(JioVmapAdsLoader object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((JioVmapAdsLoader)object).k;
        if (object2 != null) {
            object2 = ((JioVmapAdsLoader)object).c;
            if (object2 != null) {
                object2.notifyPlayerTime();
            }
            if ((object2 = ((JioVmapAdsLoader)object).i) != null) {
                Runnable runnable2 = ((JioVmapAdsLoader)object).k;
                Intrinsics.checkNotNull(runnable2);
                object2.removeCallbacks(runnable2);
            }
            if ((object2 = ((JioVmapAdsLoader)object).i) != null) {
                object = ((JioVmapAdsLoader)object).k;
                Intrinsics.checkNotNull(object);
                long l2 = 500L;
                object2.postDelayed((Runnable)object, l2);
            }
        }
    }

    public final boolean a() {
        Intrinsics.checkNotNullParameter("validating setup", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = new Ref$ObjectRef();
        ((Ref$ObjectRef)object).element = "Following setup is missing: ";
        Object object2 = this.b;
        int n3 = object2 instanceof JioVmapAdsLoader$VMAPInfo;
        boolean bl2 = false;
        boolean bl3 = true;
        if (n3 != 0) {
            int n4;
            String string2;
            String string3;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfo");
            object2 = (JioVmapAdsLoader$VMAPInfo)object2;
            CharSequence charSequence = ((JioVmapAdsLoader$VMAPInfo)object2).getVmapUrl();
            n3 = TextUtils.isEmpty((CharSequence)charSequence);
            if (n3 != 0) {
                charSequence = new StringBuilder();
                string3 = (String)((Ref$ObjectRef)object).element;
                string2 = " vmap url";
                charSequence = h30_0.a((StringBuilder)charSequence, string3, string2);
                ((Ref$ObjectRef)object).element = charSequence;
                bl3 = false;
                string3 = null;
            }
            if ((charSequence = ((JioVmapAdsLoader$VMAPInfo)object2).getPrerollCid()) == null || (n3 = ((String)charSequence).length()) == 0) {
                charSequence = new StringBuilder();
                string3 = (String)((Ref$ObjectRef)object).element;
                string2 = " preroll cid";
                charSequence = h30_0.a((StringBuilder)charSequence, string3, string2);
                ((Ref$ObjectRef)object).element = charSequence;
                bl3 = false;
                string3 = null;
            }
            if ((charSequence = ((JioVmapAdsLoader$VMAPInfo)object2).getMidrollCid()) == null || (n3 = ((String)charSequence).length()) == 0) {
                charSequence = new StringBuilder();
                string3 = (String)((Ref$ObjectRef)object).element;
                string2 = " midroll cid";
                charSequence = h30_0.a((StringBuilder)charSequence, string3, string2);
                ((Ref$ObjectRef)object).element = charSequence;
                bl3 = false;
                string3 = null;
            }
            if ((object2 = ((JioVmapAdsLoader$VMAPInfo)object2).getPostrollCid()) != null && (n4 = ((String)object2).length()) != 0) {
                bl2 = bl3;
            } else {
                object2 = new StringBuilder();
                charSequence = (String)((Ref$ObjectRef)object).element;
                string3 = " postroll cid";
                ((Ref$ObjectRef)object).element = object2 = h30_0.a((StringBuilder)object2, (String)charSequence, string3);
            }
        } else {
            String string4 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfoWithID";
            Intrinsics.checkNotNull(object2, string4);
            object2 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getVmapId();
            int n7 = ((String)object2).length();
            if (n7 == 0) {
                object2 = new StringBuilder();
                string4 = (String)((Ref$ObjectRef)object).element;
                String string5 = " vmapId missing";
                ((Ref$ObjectRef)object).element = object2 = h30_0.a((StringBuilder)object2, string4, string5);
            } else {
                bl2 = true;
            }
        }
        if (!bl2) {
            object2 = new b_0((Ref$ObjectRef)object, this);
            s.d((Function0)object2);
        }
        return bl2;
    }

    public final void allowOverlay(boolean bl2) {
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            jioAdView.allowOverlay(bl2);
        }
    }

    public final void closeVmp() {
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            jioAdView.closeAd();
        }
    }

    public final void destroy() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("JioVmapAdsLoader destroy()", string2);
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = "Stopping player time observer";
        v12.a((String)object2, string2, (JioAds$Companion)object);
        object = this.k;
        string2 = null;
        if (object != null) {
            object2 = this.i;
            if (object2 != null) {
                Intrinsics.checkNotNull(object);
                object2.removeCallbacks((Runnable)object);
            }
            this.i = null;
        }
        this.h = true;
        object = this.g;
        Intrinsics.checkNotNull(object);
        ((JioAdView)object).onDestroy();
        this.g = null;
        this.b = null;
        this.c = null;
        this.a = null;
    }

    public final void disableCTA(boolean bl2) {
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            jioAdView.disableCTA(bl2);
        }
    }

    public final void disableDefaultFocus() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called disable focus", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).disableFocus();
        }
    }

    public final void disablePostrollPreparation(boolean bl2) {
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            jioAdView.disablePostrollPreparation(bl2);
        }
    }

    public final JioAdView$AdState getAdState() {
        Object object = this.g;
        object = object != null ? object.getMAdState() : null;
        return object;
    }

    public final int getCurrentAdBreakCount() {
        return this.f;
    }

    public final void hideCta() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called hideCta for jiovmaploader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).hideCTA();
        }
    }

    public final void hideSkip() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called hideSkip for jiovmapadloader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).hideSkip();
        }
    }

    public final void notifyCuePointMissed(long l2) {
        Object object = new StringBuilder("JioVmapAdsLoader notified cue point missed: current player time - ");
        ((StringBuilder)object).append(l2);
        object = ((StringBuilder)object).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.g;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            ((JioAdView)object2).checkCuePointMissed$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(l2);
        } else {
            String string3 = "AdView not initialized yet";
            v12.a(string3, string2, (JioAds$Companion)object);
        }
    }

    public final void notifyOnContentCompleted() {
        Object object = "message";
        Intrinsics.checkNotNullParameter("Inside notifyOnContentCompleted and preparing postroll ads", object);
        Object object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.g;
        if (object3 != null) {
            object3 = new StringBuilder("adstate is ");
            JioAdView$AdState jioAdView$AdState = this.d;
            ((StringBuilder)object3).append((Object)jioAdView$AdState);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, object);
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = this.d;
            object = JioAdView$AdState.PREPARED;
            if (object2 != object && object2 != (object = JioAdView$AdState.REQUESTED)) {
                object2 = this.g;
                if (object2 != null) {
                    ((JioAdView)object2).preparePostRoll();
                }
                this.d = object;
            }
        }
    }

    public final void pauseAd() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called pauseAd() for jiovmapadloader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).pauseAd();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void playAd() {
        boolean bl2;
        int n3 = 1;
        String string2 = "message";
        Intrinsics.checkNotNullParameter("JioVmapAdsLoader playAd()", string2);
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        JioAdView jioAdView = this.g;
        if (jioAdView != null && (bl2 = this.e)) {
            object = this.b;
            int n4 = object instanceof JioVmapAdsLoader$VMAPInfo;
            if (n4 != 0) {
                String string3 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfo";
                Intrinsics.checkNotNull(object, string3);
                object = ((JioVmapAdsLoader$VMAPInfo)object).getAdContainer();
            } else {
                n4 = object instanceof JioVmapAdsLoader$VMAPInfoWithID;
                if (n4 != 0) {
                    String string4 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfoWithID";
                    Intrinsics.checkNotNull(object, string4);
                    object = ((JioVmapAdsLoader$VMAPInfoWithID)object).getAdContainer();
                } else {
                    if (object != null) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    object = null;
                }
            }
            if (object != null && (n4 = object.getVisibility()) == 0) {
                object.removeAllViews();
                JioAdView jioAdView2 = this.g;
                Intrinsics.checkNotNull(jioAdView2);
                View view = jioAdView2.getAdView();
                if (view != null) {
                    bl2 = false;
                    Object var4_15 = null;
                    view.setVisibility(0);
                }
                j j3 = this.j;
                object.addView((View)j3);
                gn1_1 gn1_12 = new gn1_1(this, n3);
                object.post((Runnable)gn1_12);
                return;
            }
            Looper looper = Looper.getMainLooper();
            object = new Handler(looper);
            hn1_1 hn1_12 = new hn1_1(this, n3);
            object.post((Runnable)hn1_12);
            return;
        }
        Intrinsics.checkNotNullParameter("Vmap not loaded", string2);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = Looper.getMainLooper();
        Handler handler = new Handler((Looper)object);
        object = new h_0(this);
        handler.post((Runnable)object);
    }

    public final void request() {
        Object object = "message";
        Intrinsics.checkNotNullParameter("JioVmapAdsLoader request()...", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        boolean bl2 = this.a();
        if (!bl2) {
            return;
        }
        object2 = this.b;
        boolean bl3 = object2 instanceof JioVmapAdsLoader$VMAPInfo;
        if (bl3) {
            object = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfo";
            Intrinsics.checkNotNull(object2, (String)object);
            object2 = (JioVmapAdsLoader$VMAPInfo)object2;
            bl3 = true;
            this.requestVmap((JioVmapAdsLoader$VMAPInfo)object2, bl3);
        } else {
            bl3 = object2 instanceof JioVmapAdsLoader$VMAPInfoWithID;
            if (bl3) {
                Object object3;
                object = this.g;
                Object object4 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioVmapAdsLoader.VMAPInfoWithID";
                if (object != null) {
                    Intrinsics.checkNotNull(object2, (String)object4);
                    object2 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getAdTargetting();
                    if (object2 != null) {
                        object3 = this.a;
                        object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object3);
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    ((JioAdView)object).setMetaData((Map)object2);
                }
                object2 = this.b;
                Intrinsics.checkNotNull(object2, (String)object4);
                object2 = (JioVmapAdsLoader$VMAPInfoWithID)object2;
                object = this.g;
                if (object != null && (object4 = this.a) != null) {
                    Intrinsics.checkNotNull(object);
                    object3 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getVmapId();
                    Context context = this.a;
                    Intrinsics.checkNotNull(context);
                    z_0 z_02 = new z_0(this, (JioVmapAdsLoader$VMAPInfoWithID)object2);
                    object4 = new JioAdsLoader((JioAdView)object, (String)object3, context, z_02);
                    long l2 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getContentVideoLength();
                    ((JioAdsLoader)object4).setContentVideoLength(l2);
                    object = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getCuePoints();
                    ((JioAdsLoader)object4).setContentVideoCuePoint((ArrayList)object);
                    object2 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getPackageName();
                    ((JioAdsLoader)object4).setPackageName((String)object2);
                    ((JioAdsLoader)object4).getVmap();
                }
            }
        }
    }

    public final void requestVmap(JioVmapAdsLoader$VMAPInfo object, boolean bl2) {
        Object object2 = "jioAdsVMAPInfo";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = this.h;
        Object object3 = "message";
        if (n3 == 0 && (object2 = this.a) != null && (object2 = this.c) != null) {
            Intrinsics.checkNotNullParameter("initiating player time observer", (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object3 = Looper.getMainLooper();
            object2 = new Handler((Looper)object3);
            this.i = object2;
            object2 = this.k;
            if (object2 != null) {
                object2 = this.c;
                if (object2 != null) {
                    object2.notifyPlayerTime();
                }
                if ((object2 = this.i) != null) {
                    object3 = this.k;
                    Intrinsics.checkNotNull(object3);
                    object2.removeCallbacks((Runnable)object3);
                }
                if ((object2 = this.i) != null) {
                    object3 = this.k;
                    Intrinsics.checkNotNull(object3);
                    long l2 = 500L;
                    object2.postDelayed((Runnable)object3, l2);
                }
            }
            JioAdView jioAdView = this.g;
            Intrinsics.checkNotNull(jioAdView);
            String string2 = ((JioVmapAdsLoader$VMAPInfo)object).getVmapUrl();
            String string3 = ((JioVmapAdsLoader$VMAPInfo)object).getPrerollCid();
            String string4 = ((JioVmapAdsLoader$VMAPInfo)object).getMidrollCid();
            String string5 = ((JioVmapAdsLoader$VMAPInfo)object).getPostrollCid();
            y_0 y_02 = new y_0(this);
            object2 = ((JioVmapAdsLoader$VMAPInfo)object).getThreshold();
            n3 = object2 != null ? (Integer)object2 : 5;
            Integer n4 = n3;
            JioAdsMetadata jioAdsMetadata = ((JioVmapAdsLoader$VMAPInfo)object).getAdTargetting();
            jioAdView.requestVmap$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, string4, string5, y_02, n4, jioAdsMetadata, bl2);
        } else {
            Intrinsics.checkNotNullParameter("JioVmapHelper object is already destroyed", (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void resumeAd() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called resumeAd() for jiovmapadloader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).resumeAd();
        }
    }

    public final void setCompanionContainers(List object) {
        String string2 = "JioVmapAdsLoader companions set: ";
        CharSequence charSequence = new StringBuilder(string2);
        if (object != null) {
            int n3 = object.size();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        charSequence.append(object);
        object = charSequence.toString();
        charSequence = "message";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            boolean bl3 = true;
            ((JioAdView)object).setPrimaryAd(bl3);
        }
    }

    public final void setCurrentAdBreakCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        this.f = n3;
    }

    public final void setCurrentPlayerTime(long l2, long l3) {
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            Intrinsics.checkNotNull(jioAdView);
            jioAdView.checkIfReachingCuePoint$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(l2, l3);
        } else {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("JioAdView already destroyed", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void setCustomLayout(int n3) {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called setCustomLayout for jiovmapadloader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).setCustomInstreamAdContainer(n3);
        }
    }

    public final void setExoPlayerEnabled(boolean bl2) {
        Object object = new StringBuilder("vmap: setExoPlayerEnabled: ");
        ((StringBuilder)object).append(bl2);
        object = ((StringBuilder)object).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).setExoPlayerEnabled(bl2);
        }
    }

    public final void showCta() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called showCta for jiovmaploader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).showCTA();
        }
    }

    public final void showSkip() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Publisher called showSkip for jiovmapadloader", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.g;
        if (object != null) {
            ((JioAdView)object).showSkip();
        }
    }
}

