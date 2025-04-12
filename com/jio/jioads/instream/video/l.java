/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instream.video.k;
import com.jio.jioads.instreamads.vastparser.listener.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements c {
    public final /* synthetic */ InstreamVideo a;
    public final /* synthetic */ Map b;

    public l(InstreamVideo instreamVideo, Map map2) {
        this.a = instreamVideo;
        this.b = map2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(m var1_1) {
        block11: {
            block12: {
                var2_2 = this.a;
                var3_3 /* !! */  = InstreamVideo.access$getIJioAdView$p((InstreamVideo)var2_2);
                var4_4 = var3_3 /* !! */ .f0();
                var5_5 = false;
                var6_6 = null;
                if (var4_4) {
                    InstreamVideo.access$setJioVastParsingHelper$p((InstreamVideo)var2_2, null);
                    InstreamVideo.access$processCustomAd((InstreamVideo)var2_2, (m)var1_1);
                    return;
                }
                if (var1_1 == null) break block11;
                var3_3 /* !! */  = InstreamVideo.access$getJioVideoView$p((InstreamVideo)var2_2);
                if (var3_3 /* !! */  != null) break block12;
                var3_3 /* !! */  = InstreamVideo.access$getIJioAdView$p((InstreamVideo)var2_2).k0();
                if (var3_3 /* !! */  == (var7_7 = JioAdView$AdState.DESTROYED)) {
                    return;
                }
                var3_3 /* !! */  = InstreamVideo.access$getIJioAdView$p((InstreamVideo)var2_2).Y();
                if (var3_3 /* !! */  != null) {
                    var7_7 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)var2_2).B();
                    if (var7_7 != null) {
                        var8_8 = var7_7.intValue();
                    } else {
                        var8_8 = 0;
                        var7_7 = null;
                    }
                    var9_9 = new k((InstreamVideo)var2_2);
                    var3_3 /* !! */  = var1_1.e((Context)var3_3 /* !! */ , var8_8, var9_9);
                } else {
                    var4_4 = false;
                    var3_3 /* !! */  = null;
                }
                if (var3_3 /* !! */  == null || (var8_8 = (int)var3_3 /* !! */ .isEmpty()) != 0) ** GOTO lbl-1000
                var7_7 = (com.jio.jioads.instreamads.vastparser.model.k)CollectionsKt.firstOrNull((List)var3_3 /* !! */ );
                if (var7_7 != null) {
                    var6_6 = var7_7.p;
                }
                if (!(var5_5 = Intrinsics.areEqual(var6_6, var7_7 = "pgm_placeholder_campaign"))) {
                    var3_3 /* !! */  = this.b;
                    InstreamVideo.access$initJioVideoViewIfNull((InstreamVideo)var2_2, (m)var1_1, (Map)var3_3 /* !! */ );
                } else if ((var3_3 /* !! */  == null || (var10_10 = var3_3 /* !! */ .isEmpty())) && (var1_1 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)var2_2)) != null && (var10_10 = var1_1.j) == (var4_4 = true)) {
                    InstreamVideo.access$handleNoAdInInventory((InstreamVideo)var2_2);
                    return;
                }
            }
            if ((var1_1 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)var2_2)) != null) {
                var2_2 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)var2_2);
                Intrinsics.checkNotNull(var2_2);
                var11_11 = var2_2.u;
                var1_1 = var1_1.h0();
                var1_1.a = var12_12 = (long)var11_11;
            }
        }
    }

    public final void b(JioAdError jioAdError, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        Object object = this.a;
        Object object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
        if (object2 == null) {
            object2 = InstreamVideo.access$getPodSelectionTimer$p((InstreamVideo)object);
            if (object2 != null) {
                object2.cancel();
            }
            InstreamVideo.access$setPodSelectionTimer$p((InstreamVideo)object, null);
            object2 = new StringBuilder();
            Object object3 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object).P();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(": onError ");
            object3 = jioAdError.getErrorDescription();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(", methodName: ");
            X50.a((StringBuilder)object2, string2, ", className: ", string3, ", errorDesc: ");
            ir3_0.b((StringBuilder)object2, string4, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = object = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
            object2 = (V)object;
            object3 = jioAdError;
            ((V)object2).d(jioAdError, false, d2, string2, string3, string4, null);
        }
    }
}

