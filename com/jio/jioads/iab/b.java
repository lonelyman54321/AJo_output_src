/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.iab.omid.library.ril.Omid
 *  com.iab.omid.library.ril.adsession.AdSession
 *  com.iab.omid.library.ril.adsession.media.InteractionType
 *  com.iab.omid.library.ril.adsession.media.PlayerState
 */
package com.jio.jioads.iab;

import android.content.Context;
import com.iab.omid.library.ril.Omid;
import com.iab.omid.library.ril.adsession.AdSession;
import com.iab.omid.library.ril.adsession.media.InteractionType;
import com.iab.omid.library.ril.adsession.media.PlayerState;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.c;
import com.jio.jioads.iab.a;
import com.jio.jioads.iab.d;
import com.jio.jioads.iab.h;
import com.jio.jioads.multiad.A;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b {
    public final Context a;
    public final c b;
    public final boolean c;
    public h d;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b(Context object, c c2) {
        void var2_3;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = var2_3;
        String string3 = "com.iab.omid.library.ril.Omid";
        try {
            boolean bl2;
            Class.forName(string3);
            this.c = bl2 = true;
        }
        catch (Exception exception) {}
        this.a();
    }

    public final void a() {
        boolean bl2 = this.c;
        if (bl2) {
            Object object = this.b;
            Object object2 = this.a;
            Object object3 = new h((Context)object2, (c)object);
            this.d = object3;
            Omid.activate((Context)object2);
            object3 = new StringBuilder("Omid Version ");
            object = Omid.getVersion();
            object2 = "message";
            ir3_0.b((StringBuilder)object3, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void b(com.jio.jioads.common.b object, JioAdView$AD_TYPE jioAdView$AD_TYPE) {
        Object object2;
        Object object3 = "iJioAdView";
        Intrinsics.checkNotNullParameter(object, object3);
        Object object4 = "mAdType";
        Intrinsics.checkNotNullParameter((Object)jioAdView$AD_TYPE, (String)object4);
        boolean bl2 = this.c;
        if (bl2 && (bl2 = ((Utility)(object2 = Utility.INSTANCE)).isWebViewEnabled()) && (object2 = this.d) != null) {
            Intrinsics.checkNotNullParameter(object, object3);
            Intrinsics.checkNotNullParameter((Object)jioAdView$AD_TYPE, (String)object4);
            Intrinsics.checkNotNullParameter("Creating OMID ad session", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = new Ref$ObjectRef();
            object4 = new d((h)object2, jioAdView$AD_TYPE, (com.jio.jioads.common.b)object, (Ref$ObjectRef)object3);
            object = "omid_js";
            jioAdView$AD_TYPE = ((h)object2).a;
            l_0.g((String)object, (Context)jioAdView$AD_TYPE, (A)object4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(a object, long l2) {
        Object object2 = "mediaEvent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.c;
        if (!bl2) return;
        h h3 = this.d;
        if (h3 == null) return;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new StringBuilder("Omid ad event: ");
        ((StringBuilder)object2).append(object);
        object2 = ((StringBuilder)object2).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        String string3 = "Omid registerPlaybackEvents adSession: ";
        object3 = new StringBuilder(string3);
        Object object4 = h3.e;
        String string4 = null;
        object4 = object4 != null ? object4.getAdSessionId() : null;
        l_0.i((String)object4, (StringBuilder)object3);
        object3 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        int n3 = ((Enum)object).ordinal();
        float f5 = 1.0f;
        switch (n3) {
            default: {
                return;
            }
            case 14: {
                object = h3.g;
                if (object == null) return;
                InteractionType interactionType = InteractionType.CLICK;
                object.adUserInteraction(interactionType);
                return;
            }
            case 13: {
                object = h3.g;
                if (object == null) return;
                float f6 = 0.0f;
                Object var14_14 = null;
                object.volumeChange(0.0f);
                return;
            }
            case 12: {
                object = h3.g;
                if (object == null) return;
                object.volumeChange(f5);
                return;
            }
            case 11: {
                object = h3.g;
                if (object == null) return;
                PlayerState playerState = PlayerState.EXPANDED;
                object.playerStateChange(playerState);
                return;
            }
            case 10: {
                object = h3.g;
                if (object == null) return;
                PlayerState playerState = PlayerState.COLLAPSED;
                object.playerStateChange(playerState);
                return;
            }
            case 9: {
                object = h3.g;
                if (object == null) return;
                PlayerState playerState = PlayerState.NORMAL;
                object.playerStateChange(playerState);
                return;
            }
            case 8: {
                object = h3.g;
                if (object == null) return;
                PlayerState playerState = PlayerState.FULLSCREEN;
                object.playerStateChange(playerState);
                return;
            }
            case 7: {
                object = h3.g;
                if (object == null) return;
                object.skipped();
                return;
            }
            case 6: {
                object = h3.g;
                if (object == null) return;
                object.resume();
                return;
            }
            case 5: {
                object = h3.g;
                if (object == null) return;
                object.pause();
                return;
            }
            case 4: {
                object = h3.g;
                if (object == null) return;
                object.complete();
                return;
            }
            case 3: {
                object = h3.g;
                if (object == null) return;
                object.thirdQuartile();
                return;
            }
            case 2: {
                object = h3.g;
                if (object == null) return;
                object.midpoint();
                return;
            }
            case 1: {
                object = h3.g;
                if (object == null) return;
                object.firstQuartile();
                return;
            }
            case 0: 
        }
        object = "Omid ad event: IMPRESSION";
        try {
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = new StringBuilder(string3);
            string3 = h3.e;
            if (string3 != null) {
                string4 = string3.getAdSessionId();
            }
            ((StringBuilder)object).append(string4);
            object = ((StringBuilder)object).toString();
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = h3.f;
            Intrinsics.checkNotNull(object);
            object.impressionOccurred();
            object = h3.g;
            if (object == null) return;
            float f7 = l2;
            object.start(f7, f5);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public final AdSession d() {
        h h3 = this.d;
        h3 = h3 != null ? h3.e : null;
        return h3;
    }

    public final void e() {
        boolean bl2 = this.c;
        if (bl2) {
            Object object;
            h h3 = this.d;
            if (h3 != null && (object = h3.e) != null) {
                object = new StringBuilder("Omid ad finish: ");
                Object object2 = h3.e;
                object2 = object2 != null ? object2.getAdSessionId() : null;
                l_0.i((String)object2, (StringBuilder)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = h3.e;
                Intrinsics.checkNotNull(object);
                object.finish();
                h3.e = null;
            }
            this.d = null;
        }
    }
}

