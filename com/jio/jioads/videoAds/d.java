/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.videoAds;

import android.content.Context;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.p;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.m;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.j;
import com.jio.jioads.videoAds.e;
import com.jio.jioads.videoAds.f;
import com.jio.jioads.videoAds.h;
import com.jio.jioads.videomodule.i_0;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements f$c {
    public final /* synthetic */ h a;

    public d(h h3) {
        this.a = h3;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        int n4 = 1;
        h h3 = this.a;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n4 = 4;
                    if (n3 == n4) {
                        h.i(h3);
                        Object object = JioPlayerState.COMPLETED;
                        h3.o = object;
                        h3.l();
                        n3 = (int)(h3.f ? 1 : 0);
                        if (n3 == 0 && (object = h3.b) != null) {
                            ((i_0)object).a(false);
                        }
                    }
                } else {
                    h.i(h3);
                    Object object = new StringBuilder();
                    Object object2 = h3.c;
                    Object object3 = ": onPrepared ExoPlayer";
                    j_0.i(object2, (StringBuilder)object, object3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = h3.b;
                    if (object != null && ((object2 = h3.o) == (object3 = JioPlayerState.IDEAL) || object2 == (object3 = JioPlayerState.PREPARING))) {
                        h3.h = n4;
                        object2 = JioPlayerState.PREPARED;
                        h3.o = object2;
                        n7 = (int)(h3.f ? 1 : 0);
                        if (n7 == 0 && (n7 = (int)(h3.j ? 1 : 0)) == 0) {
                            ((i_0)object).f();
                        }
                        if ((n3 = (int)(h3.f ? 1 : 0)) != 0 && (n3 = (int)(h3.j ? 1 : 0)) != 0) {
                            h3.m();
                        }
                        h3.j = n4;
                        h3.f = false;
                        h3.g = false;
                        h3.e = false;
                    }
                }
            } else {
                e e2 = h3.x;
                if (e2 == null) {
                    n3 = ((com.jio.jioads.controller.f)h3.d).a.l;
                    long l2 = n3;
                    h3.x = e2 = new e(h3, l2);
                }
            }
        } else {
            JioPlayerState jioPlayerState;
            h.i(h3);
            h3.o = jioPlayerState = JioPlayerState.IDEAL;
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(androidx.media3.common.e e2) {
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
        if (!bl2) {
            h h3 = this.a;
            h.i(h3);
        }
    }

    public final /* synthetic */ void Y(androidx.media3.common.f f5, f$b f$b) {
    }

    public final /* synthetic */ void Z(int n3, boolean bl2) {
    }

    public final void a(wc3_0 object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "videoSize");
        int n4 = ((wc3_0)object).b;
        h h3 = this.a;
        h3.t = n4;
        h3.s = n3 = ((wc3_0)object).a;
        object = new StringBuilder();
        com.jio.jioads.common.b b2 = h3.c;
        j_0.n(b2, (StringBuilder)object, ": mVideoHeight in exo size change ");
        n4 = h3.t;
        String string2 = "message";
        w12_0.b(n4, string2, (StringBuilder)object);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = m.a(b2, ": mVideoWidth in exo size change ");
        int n7 = h3.s;
        ((StringBuilder)object2).append(n7);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final /* synthetic */ void a0(float f5) {
    }

    public final void c0(g g3, int n3) {
        Intrinsics.checkNotNullParameter(g3, "timeline");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e0(bq3 var1_1) {
        block30: {
            block31: {
                var2_2 = 1;
                var3_3 = var1_1;
                Intrinsics.checkNotNullParameter(var1_1, "tracks");
                var3_3 = this.a;
                var3_3.getClass();
                var4_4 = var3_3.n;
                if (var4_4 == null) break block30;
                var4_4 = new StringBuilder();
                var5_5 = var3_3.c;
                j_0.n(var5_5, (StringBuilder)var4_4, ": onTracksChanged ");
                var6_6 = var3_3.q;
                var7_7 /* !! */  = "message";
                w12_0.b(var6_6, var7_7 /* !! */ , (StringBuilder)var4_4);
                var4_4 = JioAds.Companion;
                var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 = JioAds$LogLevel.NONE;
                var8_8 = var3_3.b;
                if (var8_8 == null) break block31;
                var9_9 = var3_3.q;
                var10_10 = var8_8.d;
                var11_11 = var10_10.O;
                var12_12 = var11_11.isEmpty();
                if (var12_12) break block31;
                var11_11 = var10_10.e0;
                if (var11_11 != null) {
                    var11_11.t();
                }
                var10_10.c0 = false;
                var10_10.d0 = false;
                var11_11 = "";
                if (var9_9 > 0 && var9_9 != (var13_13 = var10_10.P)) {
                    var13_13 = (int)var8_8.a;
                    if (!var13_13 && (var13_13 = var10_10.x) <= 0 && !(var13_13 = (int)var8_8.c)) {
                        var14_14 = var10_10.r;
                        if (var14_14 != null && (var14_14 = (Map)var14_14.invoke()) != null) {
                            var15_15 = var10_10.a;
                            var15_15.clear();
                            var15_15.putAll(var14_14);
                        }
                        var14_14 = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                        var16_16 = var9_9 + -1;
                        var17_17 = var10_10.T();
                        var10_10.y((JioEventTracker$TrackingEvents)var14_14, var16_16, (String)var17_17);
                    }
                    var14_14 = var10_10.g0();
                    var13_13 = (int)var14_14.t;
                    if (!var13_13) {
                        var6_6 = (int)var8_8.c;
                        if (var6_6 == 0) {
                            var10_10.N();
                        }
                    } else {
                        var8_8 = var10_10.O;
                        var6_6 = l_0.a((ArrayList)var8_8);
                        if (var6_6 == var2_2) {
                            var10_10.x = var6_6 = var10_10.x + var2_2;
                            var8_8 = var10_10.z;
                            if (var8_8 != null) {
                                var14_14 = var10_10.T();
                                if (var14_14 == null) {
                                    var14_14 = var11_11;
                                }
                                var16_16 = var10_10.x;
                                var8_8.onPlayAgain((String)var14_14, var16_16);
                            }
                        }
                    }
                    if ((var8_8 = (k)l_0.j(var10_10.O)) == null || (var8_8 = var8_8.q) == null) {
                        var8_8 = var10_10.T();
                    }
                    var14_14 = var10_10.V();
                    var10_10.E((String)var8_8, (String)var14_14);
                }
                var8_8 = com.jio.jioads.videomodule.d.a;
                var10_10.L = var8_8;
                var8_8 = var10_10.g0();
                var6_6 = (int)var8_8.c;
                if (var6_6 == 0 || (var8_8 = var10_10.e0) == null || (var8_8 = var10_10.t) == null) ** GOTO lbl-1000
                var8_8 = var10_10.t();
                var14_14 = (Boolean)var8_8.a;
                var13_13 = (int)var14_14.booleanValue();
                var18_18 = var8_8 = var8_8.b;
                var18_18 = (String)var8_8;
                if (!var13_13) {
                    var8_8 = JioAdError.Companion;
                    var7_7 /* !! */  = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                    var8_8.getClass();
                    var17_17 = t_0.a((JioAdError$JioAdErrorType)var7_7 /* !! */ );
                    var15_15 = var10_10.z;
                    if (var15_15 != null) {
                        var19_19 = com.jio.jioads.cdnlogging.d.a;
                        var20_20 = "adjustAspectRatio";
                        var21_21 = "JioVideoViewRenderer";
                        var15_15.onFailedToLoad((JioAdError)var17_17, false, var19_19, var20_20, var21_21, (String)var18_18);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var8_8 = new StringBuilder();
                    var14_14 = var10_10.R();
                    var8_8.append((String)var14_14);
                    var8_8.append(": onTrackChanged ");
                    var8_8.append(var9_9);
                    var8_8.append(' ');
                    var14_14 = var10_10.O;
                    var13_13 = var14_14.size();
                    var8_8.append(var13_13);
                    Intrinsics.checkNotNullParameter(var8_8.toString(), var7_7 /* !! */ );
                    var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = var10_10.h;
                    if (var8_8 != null && (var6_6 = var8_8.getVisibility()) == 0) {
                        var8_8 = var10_10.O;
                        var6_6 = var8_8.size();
                        if (var6_6 > var2_2 && (var8_8 = var10_10.z) != null) {
                            var8_8.canPrepareNextVideoAd(var2_2);
                        }
                        var8_8 = var10_10.t;
                        var13_13 = 0;
                        var14_14 = null;
                        if (var8_8 != null) {
                            var6_6 = var8_8.getDuration();
                            var8_8 = var6_6;
                        } else {
                            var6_6 = 0;
                            var8_8 = null;
                        }
                        var10_10.T = var8_8;
                        var10_10.P = var9_9;
                        if (var9_9 > 0) {
                            var10_10.i();
                            var8_8 = var10_10.b;
                            var15_15 = var8_8.a;
                            if (var15_15 != null) {
                                var14_14 = var10_10.T();
                                var15_15 = var15_15.v;
                                var14_14 = (AdMetaData$AdParams)var15_15.get(var14_14);
                            }
                            var10_10.N = var14_14;
                            var14_14 = var10_10.g;
                            if (var14_14 != null) {
                                var15_15 = var10_10.O;
                                if ((var8_8 = var8_8.b((Context)var14_14, 0, (ArrayList)var15_15)) == null) {
                                    var8_8 = var11_11;
                                }
                                var10_10.Y = var8_8;
                            }
                            var8_8 = new StringBuilder();
                            com.jio.jioads.jioreel.tracker.model.b.d(var10_10, (StringBuilder)var8_8, ": onStarted for trackNumber: ");
                            var13_13 = var10_10.P;
                            var8_8.append(var13_13);
                            var8_8.append(", remaining-tracks: ");
                            var13_13 = l_0.a(var10_10.O) - var2_2;
                            var8_8.append(var13_13);
                            Intrinsics.checkNotNullParameter(var8_8.toString(), var7_7 /* !! */ );
                            var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var8_8 = new StringBuilder();
                            com.jio.jioads.jioreel.tracker.model.b.d(var10_10, (StringBuilder)var8_8, ": onStarted for url: ");
                            var14_14 = var10_10.Y;
                            var8_8.append((String)var14_14);
                            Intrinsics.checkNotNullParameter(var8_8.toString(), var7_7 /* !! */ );
                            var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var8_8 = new StringBuilder();
                            com.jio.jioads.jioreel.tracker.model.b.d(var10_10, (StringBuilder)var8_8, ": currentAdId: ");
                            var14_14 = var10_10.T();
                            var8_8.append((String)var14_14);
                            var8_8.append(", track: ");
                            var13_13 = var10_10.P;
                            var8_8.append(var13_13);
                            var8_8.append(", isCtaUrlPresent: ");
                            var13_13 = (int)var10_10.a();
                            var8_8.append((boolean)var13_13);
                            var8_8.append(", currentAdParams: ");
                            var14_14 = var10_10.N;
                            var8_8.append(var14_14);
                            Intrinsics.checkNotNullParameter(var8_8.toString(), var7_7 /* !! */ );
                            var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var8_8 = var10_10.e0;
                            if (var8_8 != null) {
                                var7_7 /* !! */  = var10_10.N;
                                var13_13 = var10_10.a();
                                var8_8.i((AdMetaData$AdParams)var7_7 /* !! */ , (boolean)var13_13);
                            }
                        }
                        s.Y(var10_10);
                        var10_10.o();
                        var8_8 = var10_10.g0();
                        var6_6 = (int)var8_8.q;
                        if (var6_6 != 0 && (var8_8 = var10_10.z) != null) {
                            var7_7 /* !! */  = var10_10.T();
                            if (var7_7 /* !! */  != null) {
                                var11_11 = var7_7 /* !! */ ;
                            }
                            var22_22 = var10_10.P + var2_2;
                            var8_8.onAdChange((String)var11_11, var22_22);
                        }
                    }
                    var8_8 = var10_10.h0();
                    var8_8.b = var22_22 = var10_10.P;
                    var8_8 = var10_10.e0;
                    if (var8_8 != null) {
                        var22_22 = var10_10.U();
                        var8_8.c(var9_9, var22_22);
                    }
                }
            }
            if ((var6_6 = (int)var3_3.z) != 0 && (var8_8 = var3_3.k) != null && (var6_6 = var8_8.getRepeatMode()) == var2_2) {
                var6_6 = 0;
                var8_8 = null;
            } else {
                var6_6 = 1;
            }
            var22_22 = var3_3.q;
            if (var22_22 > 0 && var6_6 != 0) {
                var8_8 = var3_3.p;
                var6_6 = var8_8 != null ? var8_8.I() : -1;
                if (var6_6 > 0 && (var6_6 = (int)var3_3.g) == 0) {
                    var8_8 = new StringBuilder();
                    var7_7 /* !! */  = ": removing prev played track";
                    j_0.i(var5_5, (StringBuilder)var8_8, var7_7 /* !! */ );
                    var4_4 = var4_4.getInstance();
                    var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    h.e((h)var3_3);
                    var3_3.g = false;
                }
            }
            var3_3.q = var23_23 = var3_3.q + var2_2;
        }
    }

    public final /* synthetic */ void g0(androidx.media3.common.e e2) {
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
        if (bl2) {
            h h3 = this.a;
            h3.l();
            h3.m();
        }
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    /*
     * WARNING - void declaration
     */
    public final void p(PlaybackException object) {
        void var9_11;
        Intrinsics.checkNotNullParameter(object, "error");
        StringBuilder stringBuilder = new StringBuilder();
        h h3 = this.a;
        Object object2 = h3.c;
        Object object3 = ": Exoplayer Error: ";
        j_0.n((com.jio.jioads.common.b)object2, stringBuilder, (String)object3);
        object = ((Throwable)object).getMessage();
        stringBuilder.append((String)object);
        j.b(stringBuilder.toString());
        object = h3.k;
        stringBuilder = null;
        if (object != null) {
            ((p)object).setPlayWhenReady(false);
        }
        object = JioPlayerState.ERROR;
        h3.o = object;
        object2 = h3.b;
        if (object2 != null) {
            ((i_0)object2).d();
        }
        object3 = new StringBuilder();
        Object object4 = h3.c;
        String string2 = object4.P();
        ((StringBuilder)object3).append(string2);
        string2 = ": ExoPlayer Failure";
        ((StringBuilder)object3).append(string2);
        j.b(((StringBuilder)object3).toString());
        object3 = h3.n;
        int n3 = -1;
        if (object3 != null) {
            int bl2 = ((ArrayList)object3).size();
        } else {
            int n4 = -1;
        }
        String string3 = ": removing error prone track";
        boolean bl2 = true;
        if (var9_11 > bl2) {
            object = h3.k;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                int n7 = ((b)object).getNextMediaItemIndex();
                object3 = ": removing prev played track";
                if (n7 != n3) {
                    long l2;
                    int n8;
                    h3.l();
                    h3.g = bl2;
                    n7 = h3.q;
                    if (n7 > 0) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        object2 = null;
                    }
                    h3.f = n8;
                    if (n7 > 0 && (n7 = (int)(h3.j ? 1 : 0)) != 0) {
                        object = new StringBuilder();
                        com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object, (String)object3);
                        h.e(h3);
                        object = new StringBuilder();
                        com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object, string3);
                        h.e(h3);
                    } else {
                        object = new StringBuilder();
                        com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object, string3);
                        h.e(h3);
                    }
                    object = h3.k;
                    Intrinsics.checkNotNull(object);
                    object2 = new StringBuilder();
                    object3 = ": Inside run of exoplayer";
                    com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object2, (String)object3);
                    object2 = JioPlayerState.PREPARING;
                    h3.o = object2;
                    ((p)object).setPlayWhenReady(false);
                    h3.k();
                    object2 = h3.y;
                    if (object2 == null) {
                        n8 = ((com.jio.jioads.controller.f)h3.d).a.l;
                        l2 = n8;
                        object4 = new f(h3, l2);
                        object2 = object4.start();
                        h3.y = object2;
                    }
                    l2 = -9223372036854775807L;
                    ((b)object).seekTo(0, l2);
                    n8 = (int)(h3.j ? 1 : 0);
                    if (n8 == 0 || (n8 = h3.q) <= 0) {
                        bl2 = false;
                    }
                    ((p)object).setPlayWhenReady(bl2);
                    n7 = h3.q;
                    if (n7 > 0 && (n8 = (int)(h3.h ? 1 : 0)) != 0) {
                        h3.q = n7 += n3;
                    }
                    h3.h = false;
                } else {
                    h3.e = bl2;
                    h3.g = bl2;
                    object = new StringBuilder();
                    com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object, (String)object3);
                    h.e(h3);
                    object = new StringBuilder();
                    com.jio.jioads.jioreel.tracker.model.b.a(object4, (StringBuilder)object, string3);
                    h.e(h3);
                    h3.l();
                    object = JioPlayerState.COMPLETED;
                    h3.o = object;
                    if (object2 != null) {
                        ((i_0)object2).a(false);
                    }
                }
            }
        } else {
            h3.e = bl2;
            h3.g = bl2;
            stringBuilder = new StringBuilder();
            com.jio.jioads.jioreel.tracker.model.b.a(object4, stringBuilder, string3);
            h.e(h3);
            h3.o = object;
        }
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

