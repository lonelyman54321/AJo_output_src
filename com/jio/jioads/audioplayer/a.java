/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.audioplayer;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.audioplayer.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements f$c {
    public final /* synthetic */ d a;

    public a(d d2) {
        this.a = d2;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        int n4 = 1;
        int n7 = 0;
        d d2 = this.a;
        String string2 = "message";
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 == n4) {
                    Intrinsics.checkNotNullParameter("Instream Audio ExoPlayer state ENDED", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    Object object = JioAds$LogLevel.NONE;
                    d2.j = n3 = d2.i;
                    object = d2.c;
                    if (object != null) {
                        Intrinsics.checkNotNull(object);
                        object.a(false);
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter("Instream Audio ExoPlayer state is READY", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Object object = JioAds$LogLevel.NONE;
                object = d2.c;
                if (object != null && ((n4 = d2.j) == 0 || n4 == (n7 = d2.e))) {
                    d2.j = n4 = d2.f;
                    Intrinsics.checkNotNull(object);
                    object.f();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter("Instream Audio ExoPlayer state is IDLE", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            d2.getClass();
            d2.j = 0;
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(e e2) {
    }

    public final /* synthetic */ void M() {
    }

    public final /* synthetic */ void P(int n3, int n4) {
    }

    public final /* synthetic */ void Q(f$a f$a) {
    }

    public final /* synthetic */ void T(int n3, f$d f$d, f$d f$d2) {
    }

    public final /* synthetic */ void U(dr_1 dr_12) {
    }

    public final /* synthetic */ void V(Fp3 fp3) {
    }

    public final void W(boolean bl2) {
    }

    public final /* synthetic */ void Y(f f5, f$b f$b) {
    }

    public final /* synthetic */ void Z(int n3, boolean bl2) {
    }

    public final /* synthetic */ void a(wc3_0 wc3_02) {
    }

    public final /* synthetic */ void a0(float f5) {
    }

    public final void c0(g g3, int n3) {
        Intrinsics.checkNotNullParameter(g3, "timeline");
    }

    public final /* synthetic */ void e0(bq3 bq32) {
    }

    public final /* synthetic */ void g0(e e2) {
    }

    public final /* synthetic */ void h0(int n3, boolean bl2) {
    }

    public final /* synthetic */ void j(boolean bl2) {
    }

    public final /* synthetic */ void j0(ot2_0 ot2_02) {
    }

    public final /* synthetic */ void k0(PlaybackException playbackException) {
    }

    public final /* synthetic */ void l(List list) {
    }

    public final void o0(boolean bl2) {
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    public final void p(PlaybackException object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "error");
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Exoplayer Error", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.a;
        ((d)object2).j = n3 = ((d)object2).d;
        object.getClass();
        object = ((d)object2).c;
        if (object != null) {
            object.d();
        }
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

