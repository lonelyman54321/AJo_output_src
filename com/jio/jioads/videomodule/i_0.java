/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.p;
import com.jio.jioads.videomodule.b;
import com.jio.jioads.videomodule.d;
import com.jio.jioads.videomodule.d_0;
import com.jio.jioads.videomodule.g_0;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.player.callback.a;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.w_0;
import com.jio.jioads.videomodule.x;
import com.jio.jioads.videomodule.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.videomodule.I
 */
public final class i_0
implements a {
    public boolean a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ s d;

    public i_0(s s7) {
        this.d = s7;
    }

    public final void a() {
        Object object = j_0.a;
        Object object2 = this.d;
        object2.B = object;
        object = object2.e0;
        if (object != null) {
            ((e)object).a();
        }
        object2.g0().getClass();
        object = object2.z;
        if (object != null) {
            object2 = com.jio.jioads.videomodule.b.d;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(boolean var1_1) {
        block49: {
            block48: {
                var2_2 /* !! */  = new StringBuilder();
                var3_3 = this.d;
                var4_4 = ": onComplete: call";
                l_0.e(var3_3, var2_2 /* !! */ , var4_4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_2 /* !! */  = JioAds$LogLevel.NONE;
                var5_5 = false;
                var2_2 /* !! */  = null;
                var3_3.v = false;
                var6_6 = 1;
                this.a = var6_6;
                var3_3.M = false;
                var7_7 /* !! */  = var3_3.e0;
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */ .a(false);
                }
                if ((var8_8 = var3_3.x) <= 0 && (var7_7 /* !! */  = var3_3.L) == (var9_9 = com.jio.jioads.videomodule.d.e) && (var8_8 = (int)this.c) == 0) {
                    var7_7 /* !! */  = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                    var10_10 = var3_3.P;
                    var11_11 /* !! */  = var3_3.T();
                    var3_3.y((JioEventTracker$TrackingEvents)var7_7 /* !! */ , var10_10, var11_11 /* !! */ );
                }
                if (var1_1 != 0 && (var12_12 = var3_3.O) != null) {
                    try {
                        var12_12.clear();
                    }
                    catch (Exception v0) {}
                }
                if ((var1_1 = l_0.a((ArrayList)(var12_12 = var3_3.O))) != var6_6 && (var1_1 = (var12_12 = var3_3.O).isEmpty()) == 0) break block48;
                var12_12 = var3_3.g0();
                var1_1 = var12_12.r;
                if (var1_1 != 0) break block48;
                var12_12 = var3_3.X;
                if (var12_12 != null) {
                    var1_1 = var12_12.getDuration();
                } else {
                    var1_1 = 0;
                    var12_12 = null;
                }
                var8_8 = 1000;
                var1_1 /= var8_8;
                var9_9 = var3_3.R;
                var11_11 /* !! */  = "";
                var13_13 = false;
                var14_14 = null;
                if (var9_9 == null) ** GOTO lbl-1000
                var9_9 = var3_3.V;
                if (var9_9 != null) {
                    var15_15 = var9_9.longValue();
                    var10_10 = (int)var15_15;
                } else {
                    var10_10 = 0;
                    var9_9 = null;
                }
                var17_16 /* !! */  = var3_3.R;
                var18_17 = com.jio.jioads.adinterfaces.j_0.a(var17_16 /* !! */ );
                if (var10_10 > var18_17) {
                    var9_9 = var3_3.z;
                    if (var9_9 != null) {
                        var17_16 /* !! */  = var3_3.T();
                        if (var17_16 /* !! */  != null) {
                            var11_11 /* !! */  = var17_16 /* !! */ ;
                        }
                        var18_17 = var3_3.P;
                        var19_18 = var3_3.R;
                        var20_19 = com.jio.jioads.adinterfaces.j_0.a((String)var19_18);
                        var21_20 = var1_1;
                        var22_21 = var1_1;
                        var9_9.onAdComplete(var11_11 /* !! */ , var18_17, var1_1, var1_1, (Integer)var20_19);
                    }
                } else if ((var9_9 = var3_3.z) != null) {
                    var17_16 /* !! */  = var3_3.T();
                    if (var17_16 /* !! */  != null) {
                        var11_11 /* !! */  = var17_16 /* !! */ ;
                    }
                    var18_17 = var3_3.P;
                    var19_18 = var3_3.V;
                    if (var19_18 != null) {
                        var23_22 = var19_18.longValue();
                        var22_21 = (int)var23_22;
                        var20_19 = var19_18 = Integer.valueOf(var22_21);
                    } else {
                        var20_19 = null;
                    }
                    var21_20 = var1_1;
                    var22_21 = var1_1;
                    var9_9.onAdComplete(var11_11 /* !! */ , var18_17, var1_1, var1_1, (Integer)var20_19);
                }
                var3_3.W = var6_6;
                var9_9 = var3_3.d;
                var11_11 /* !! */  = var9_9.K();
                if (var11_11 /* !! */  == (var17_16 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) {
                    var11_11 /* !! */  = var3_3.y;
                    if (var11_11 /* !! */  != null) {
                        var11_11 /* !! */  = var11_11 /* !! */ .w;
                    } else {
                        var25_23 = false;
                        var11_11 /* !! */  = null;
                    }
                    if (var11_11 /* !! */  != null) {
                        var19_18 = "Close";
                        var11_11 /* !! */ .setText((CharSequence)var19_18);
                    }
                    var11_11 /* !! */  = var3_3.g;
                    var25_23 = com.jio.jioads.adinterfaces.j_0.l((Context)var11_11 /* !! */ );
                    if (var25_23) {
                        var11_11 /* !! */  = var3_3.y;
                        if (var11_11 /* !! */  != null) {
                            var11_11 /* !! */  = var11_11 /* !! */ .w;
                        } else {
                            var25_23 = false;
                            var11_11 /* !! */  = null;
                        }
                        var19_18 = "Close Ad";
                        if (var11_11 /* !! */  != null) {
                            var11_11 /* !! */ .setText((CharSequence)var19_18);
                        }
                        var11_11 /* !! */  = var3_3.y;
                        if (var11_11 /* !! */  != null) {
                            var14_14 = var11_11 /* !! */ .t;
                        }
                        if (var14_14 != null) {
                            var14_14.setText((CharSequence)var19_18);
                        }
                    }
                }
                var11_11 /* !! */  = var3_3.g0();
                var25_23 = var11_11 /* !! */ .s;
                if (var25_23) {
                    var12_12 = var3_3.g0();
                    var1_1 = var12_12.t;
                    if (var1_1 == 0) {
                        var3_3.f();
                        var3_3.N();
                    }
                } else {
                    var11_11 /* !! */  = var9_9.K();
                    if (var11_11 /* !! */  == var17_16 /* !! */ ) {
                        var11_11 /* !! */  = var3_3.e0;
                        if (var11_11 /* !! */  != null && (var19_18 = var11_11 /* !! */ .g.h) != null && (var21_20 = (var19_18 = var19_18.optString("type")).equals(var26_24 = "3")) != 0) {
                            var11_11 /* !! */ .k = var6_6;
                            var19_18 = var11_11 /* !! */ .a;
                            var26_24 = var19_18.Y();
                            var22_21 = (int)com.jio.jioads.adinterfaces.j_0.l((Context)var26_24);
                            var20_19 = var11_11 /* !! */ .d;
                            if (var22_21 != 0) {
                                var26_24 = var20_19.L;
                                if (var26_24 != null) {
                                    var13_13 = var11_11 /* !! */ .k;
                                    var26_24.setFocusable(var13_13);
                                }
                                var26_24 = var20_19.N;
                                if (var26_24 != null) {
                                    var13_13 = var11_11 /* !! */ .k;
                                    var26_24.setFocusable(var13_13);
                                }
                                var26_24 = var20_19.L;
                                if (var26_24 != null) {
                                    var13_13 = var11_11 /* !! */ .k;
                                    var26_24.setFocusableInTouchMode(var13_13);
                                }
                                var26_24 = var20_19.N;
                                if (var26_24 != null) {
                                    var13_13 = var11_11 /* !! */ .k;
                                    var26_24.setFocusableInTouchMode(var13_13);
                                }
                            }
                            if ((var26_24 = var20_19.L) != null) {
                                var13_13 = var11_11 /* !! */ .k;
                                if (var13_13) {
                                    var13_13 = false;
                                    var14_14 = null;
                                } else {
                                    var13_13 = 8 != 0;
                                }
                                var26_24.setVisibility((int)var13_13);
                            }
                            var11_11 /* !! */  = var11_11 /* !! */ .f;
                            var25_23 = var11_11 /* !! */ .h;
                            if (var25_23 && (var25_23 = com.jio.jioads.adinterfaces.j_0.l((Context)(var11_11 /* !! */  = var19_18.Y()))) && (var11_11 /* !! */  = var19_18.K()) != var17_16 /* !! */  && (var11_11 /* !! */  = var20_19.L) != null) {
                                var11_11 /* !! */ .requestFocus();
                            }
                        }
                        if ((var11_11 /* !! */  = var3_3.e0) != null) {
                            var15_15 = var1_1;
                            var11_11 /* !! */ .h(var15_15, var15_15);
                        }
                        var9_9.U();
                        var9_9.o();
                        var12_12 = var3_3.e0;
                        if (var12_12 != null) {
                            var10_10 = (int)var3_3.d();
                            if (var10_10 != 0 && (var9_9 = var3_3.y) != null && (var10_10 = (int)var9_9.c()) == var6_6) {
                                var5_5 = true;
                            }
                            if ((var4_4 = var3_3.R) == null) {
                                var4_4 = "00:00:00";
                            }
                            if ((var9_9 = var3_3.T) != null) {
                                var10_10 = var9_9.intValue();
                                var27_25 = var10_10;
                            } else {
                                var27_25 = 0L;
                            }
                            var15_15 = var8_8;
                            var7_7 /* !! */  = Long.valueOf(var27_25 /= var15_15);
                            var12_12.j(var5_5, var4_4, (Long)var7_7 /* !! */ );
                        }
                        var12_12 = new g_0(var3_3);
                        var29_26 = 500L;
                        com.jio.jioads.util.s.b(var29_26, (Function0)var12_12);
                    }
                }
                break block49;
            }
            if ((var1_1 = var3_3.c) == 0) {
                var1_1 = var3_3.P + var6_6;
                var3_3.P = var1_1;
                s.a0(var3_3);
            }
        }
    }

    public final void b() {
        Object object = h_0.a;
        Object object2 = this.d;
        object2.B = object;
        object = object2.e0;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = object2.z) != null) {
            object2 = com.jio.jioads.videomodule.b.c;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    public final void c() {
        Object object;
        Object object2;
        s s7 = this.d;
        int n3 = s7.x;
        if (n3 <= 0 && (object2 = s7.L) == (object = com.jio.jioads.videomodule.d.e) && (n3 = (int)(this.c ? 1 : 0)) == 0) {
            object2 = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
            int n4 = s7.P;
            String string2 = s7.T();
            s7.y((JioEventTracker$TrackingEvents)((Object)object2), n4, string2);
        }
        if ((object2 = s7.z) != null) {
            object = s7.T();
            if (object == null) {
                object = "";
            }
            int n7 = s7.x;
            object2.playAgainFromMediaPlayer((String)object, n7);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        block54: {
            block56: {
                var1_1 = "";
                var2_2 = this.d;
                var3_3 = null;
                var4_4 = 0;
                var5_5 /* !! */  = null;
                try {
                    this.c = false;
                    var6_6 /* !! */  = var2_2.e0;
                    var2_2.G();
                    var6_6 /* !! */  = var2_2.g0();
                    var7_9 = var6_6 /* !! */ .r;
                }
                catch (Exception var6_7) {
                    break block54;
                }
                var8_10 = (int)var2_2.c;
                var9_11 /* !! */  = var2_2.b;
                var10_12 = ": clearing error prone ad";
                var11_13 /* !! */  = ": clearing first error prone ad";
                var12_14 = ": clearing prev played ad";
                var13_15 /* !! */  = "message";
                var14_16 = 1;
                if (var7_9 == 0) ** GOTO lbl156
                if (var8_10 == 0) ** GOTO lbl114
                var7_9 = (int)var2_2.v;
                if (var7_9 != 0) break block56;
                this.c = var14_16;
                var6_6 /* !! */  = new StringBuilder();
                var15_17 = var2_2.R();
                var6_6 /* !! */ .append((String)var15_17);
                var6_6 /* !! */ .append(var11_13 /* !! */ );
                var6_6 /* !! */  = var6_6 /* !! */ .toString();
                Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                var6_6 /* !! */  = JioAds.Companion;
                var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_6 /* !! */  = JioAds$LogLevel.NONE;
                var6_6 /* !! */  = var2_2.O;
                var6_6 /* !! */  = l_0.b(0, (ArrayList)var6_6 /* !! */ );
                var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ;
                if (var6_6 /* !! */  != null) {
                    var6_6 /* !! */  = var6_6 /* !! */ .p;
                } else {
                    var7_9 = 0;
                    var6_6 /* !! */  = null;
                }
                var15_17 = var2_2.O;
                var15_17 = l_0.b(0, (ArrayList)var15_17);
                var15_17 = (com.jio.jioads.instreamads.vastparser.model.k)var15_17;
                var8_10 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var15_17);
                var9_11 /* !! */  = var2_2.O;
                var9_11 /* !! */  = l_0.j((ArrayList)var9_11 /* !! */ );
                var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                var2_2.N();
                ** GOTO lbl150
            }
            var6_6 /* !! */  = var2_2.O;
            var7_9 = l_0.a((ArrayList)var6_6 /* !! */ );
            if (var7_9 <= var14_16) ** GOTO lbl-1000
            this.c = var14_16;
            var6_6 /* !! */  = var2_2.L;
            var15_18 /* !! */  = com.jio.jioads.videomodule.d.e;
            if (var6_6 /* !! */  != var15_18 /* !! */ ) ** GOTO lbl69
            {
                block57: {
                    var6_6 /* !! */  = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                    var8_10 = var2_2.P;
                    var9_11 /* !! */  = var2_2.T();
                    var2_2.y((JioEventTracker$TrackingEvents)var6_6 /* !! */ , var8_10, (String)var9_11 /* !! */ );
lbl69:
                    // 2 sources

                    var6_6 /* !! */  = new StringBuilder();
                    var15_18 /* !! */  = var2_2.R();
                    var6_6 /* !! */ .append((String)var15_18 /* !! */ );
                    var6_6 /* !! */ .append((String)var12_14);
                    var6_6 /* !! */  = var6_6 /* !! */ .toString();
                    Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                    var6_6 /* !! */  = JioAds.Companion;
                    var15_18 /* !! */  = var6_6 /* !! */ .getInstance();
                    var15_18 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var15_18 /* !! */  = JioAds$LogLevel.NONE;
                    var2_2.N();
                    var15_18 /* !! */  = var2_2.O;
                    var15_18 /* !! */  = l_0.b(0, (ArrayList)var15_18 /* !! */ );
                    var15_18 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var15_18 /* !! */ ;
                    if (var15_18 /* !! */  != null) {
                        var15_18 /* !! */  = var15_18 /* !! */ .p;
                    } else {
                        var8_10 = 0;
                        var15_18 /* !! */  = null;
                    }
                    var9_11 /* !! */  = var2_2.O;
                    var9_11 /* !! */  = l_0.b(0, (ArrayList)var9_11 /* !! */ );
                    var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                    var16_23 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ );
                    var11_13 /* !! */  = var2_2.O;
                    var11_13 /* !! */  = l_0.j((ArrayList)var11_13 /* !! */ );
                    var11_13 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var11_13 /* !! */ ;
                    var12_14 = new StringBuilder();
                    var17_27 = var2_2.R();
                    var12_14.append(var17_27);
                    var12_14.append((String)var10_12);
                    var10_12 = var12_14.toString();
                    Intrinsics.checkNotNullParameter(var10_12, var13_15 /* !! */ );
                    var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                    var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var2_2.N();
                    var6_6 /* !! */  = var15_18 /* !! */ ;
                    var8_10 = var16_23;
                    var9_11 /* !! */  = var11_13 /* !! */ ;
                    break block57;
lbl114:
                    // 1 sources

                    var6_6 /* !! */  = var2_2.O;
                    var7_9 = l_0.a((ArrayList)var6_6 /* !! */ );
                    if (var7_9 > var14_16) {
                        var6_6 /* !! */  = var2_2.O;
                        var6_6 /* !! */  = l_0.b(var14_16, (ArrayList)var6_6 /* !! */ );
                        if ((var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ) != null) {
                            var6_6 /* !! */  = var6_6 /* !! */ .c;
                        } else {
                            var7_9 = 0;
                            var6_6 /* !! */  = null;
                        }
                        var15_19 = var2_2.O;
                        var15_19 = l_0.b(var14_16, (ArrayList)var15_19);
                        var15_19 = (com.jio.jioads.instreamads.vastparser.model.k)var15_19;
                        if (var15_19 != null) {
                            var15_19 = var15_19.p;
                        } else {
                            var8_10 = 0;
                            var15_19 = null;
                        }
                        var10_12 = var2_2.O;
                        var10_12 = l_0.b(var14_16, (ArrayList)var10_12);
                        var10_12 = (com.jio.jioads.instreamads.vastparser.model.k)var10_12;
                        var18_31 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var10_12);
                        var9_11 /* !! */ .j((String)var6_6 /* !! */ );
                        var6_6 /* !! */  = var2_2.O;
                        var6_6 /* !! */  = l_0.c((ArrayList)var6_6 /* !! */ , var14_16);
                        var9_11 /* !! */  = var6_6 /* !! */ ;
                        var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ;
                        var6_6 /* !! */  = var15_19;
                        var8_10 = var18_31;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_9 = 0;
                        var6_6 /* !! */  = null;
                        var16_24 = false;
                        var9_11 /* !! */  = null;
                        var8_10 = 0;
                        var15_20 = null;
                    }
                }
                var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ , false);
                var9_11 /* !! */  = var2_2.z;
                if (var9_11 /* !! */  == null) return;
                var9_11 /* !! */ .onPlayerError(var8_10, (String)var6_6 /* !! */ );
                return;
lbl156:
                // 1 sources

                var7_9 = 2;
                if (var8_10 == 0) ** GOTO lbl303
                var8_10 = (int)var2_2.o;
                if (var8_10 == 0) {
                    this.c = var14_16;
                    var6_6 /* !! */  = new StringBuilder();
                    var15_21 = var2_2.R();
                    var6_6 /* !! */ .append((String)var15_21);
                    var6_6 /* !! */ .append(var11_13 /* !! */ );
                    var6_6 /* !! */  = var6_6 /* !! */ .toString();
                    Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                    var6_6 /* !! */  = JioAds.Companion;
                    var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                    var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var6_6 /* !! */  = JioAds$LogLevel.NONE;
                    var6_6 /* !! */  = var2_2.O;
                    var6_6 /* !! */  = l_0.b(0, (ArrayList)var6_6 /* !! */ );
                    var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ;
                    if (var6_6 /* !! */  != null) {
                        var6_6 /* !! */  = var6_6 /* !! */ .p;
                    } else {
                        var7_9 = 0;
                        var6_6 /* !! */  = null;
                    }
                    var15_21 = var2_2.O;
                    var15_21 = l_0.b(0, (ArrayList)var15_21);
                    var15_21 = (com.jio.jioads.instreamads.vastparser.model.k)var15_21;
                    var8_10 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var15_21);
                    var9_11 /* !! */  = var2_2.O;
                    var9_11 /* !! */  = l_0.j((ArrayList)var9_11 /* !! */ );
                    var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                    var2_2.N();
                    var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ , false);
                    var9_11 /* !! */  = var2_2.z;
                    if (var9_11 /* !! */  == null) return;
                    var9_11 /* !! */ .onPlayerError(var8_10, (String)var6_6 /* !! */ );
                    return;
                }
                var15_18 /* !! */  = var2_2.O;
                var8_10 = l_0.a((ArrayList)var15_18 /* !! */ );
                if (var8_10 != var7_9) ** GOTO lbl226
                this.c = var14_16;
                var6_6 /* !! */  = new StringBuilder();
                var15_18 /* !! */  = var2_2.R();
                var6_6 /* !! */ .append((String)var15_18 /* !! */ );
                var6_6 /* !! */ .append((String)var12_14);
                var6_6 /* !! */  = var6_6 /* !! */ .toString();
                Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                var6_6 /* !! */  = JioAds.Companion;
                var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_6 /* !! */  = JioAds$LogLevel.NONE;
                s.I(var2_2);
                var6_6 /* !! */  = var2_2.L;
                var15_18 /* !! */  = com.jio.jioads.videomodule.d.e;
                if (var6_6 /* !! */  != var15_18 /* !! */ ) ** GOTO lbl220
            }
            {
                var6_6 /* !! */  = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                var8_10 = var2_2.P;
                var9_11 /* !! */  = var2_2.T();
                var2_2.y((JioEventTracker$TrackingEvents)var6_6 /* !! */ , var8_10, (String)var9_11 /* !! */ );
lbl220:
                // 2 sources

                var6_6 /* !! */  = var2_2.O;
                var6_6 /* !! */  = l_0.j((ArrayList)var6_6 /* !! */ );
                var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ;
                var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ , false);
                var2_2.N();
                return;
lbl226:
                // 1 sources

                var6_6 /* !! */  = var2_2.O;
                var7_9 = l_0.a((ArrayList)var6_6 /* !! */ );
                if (var7_9 <= var14_16) ** GOTO lbl283
                this.c = var14_16;
                var6_6 /* !! */  = var2_2.L;
                var15_18 /* !! */  = com.jio.jioads.videomodule.d.e;
                if (var6_6 /* !! */  != var15_18 /* !! */ ) ** GOTO lbl237
            }
            {
                block59: {
                    block58: {
                        var6_6 /* !! */  = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                        var8_10 = var2_2.P;
                        var9_11 /* !! */  = var2_2.T();
                        var2_2.y((JioEventTracker$TrackingEvents)var6_6 /* !! */ , var8_10, (String)var9_11 /* !! */ );
lbl237:
                        // 2 sources

                        var6_6 /* !! */  = new StringBuilder();
                        var15_18 /* !! */  = var2_2.R();
                        var6_6 /* !! */ .append((String)var15_18 /* !! */ );
                        var6_6 /* !! */ .append((String)var12_14);
                        var6_6 /* !! */  = var6_6 /* !! */ .toString();
                        Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                        var6_6 /* !! */  = JioAds.Companion;
                        var15_18 /* !! */  = var6_6 /* !! */ .getInstance();
                        var15_18 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var15_18 /* !! */  = JioAds$LogLevel.NONE;
                        var2_2.N();
                        var15_18 /* !! */  = var2_2.O;
                        var15_18 /* !! */  = l_0.b(0, (ArrayList)var15_18 /* !! */ );
                        var15_18 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var15_18 /* !! */ ;
                        if (var15_18 /* !! */  != null) {
                            var15_18 /* !! */  = var15_18 /* !! */ .p;
                        } else {
                            var8_10 = 0;
                            var15_18 /* !! */  = null;
                        }
                        var9_11 /* !! */  = var2_2.O;
                        var9_11 /* !! */  = l_0.b(0, (ArrayList)var9_11 /* !! */ );
                        var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                        var16_25 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ );
                        var11_13 /* !! */  = var2_2.O;
                        var11_13 /* !! */  = l_0.j((ArrayList)var11_13 /* !! */ );
                        var11_13 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var11_13 /* !! */ ;
                        var12_14 = new StringBuilder();
                        var17_28 = var2_2.R();
                        var12_14.append(var17_28);
                        var12_14.append((String)var10_12);
                        var10_12 = var12_14.toString();
                        Intrinsics.checkNotNullParameter(var10_12, var13_15 /* !! */ );
                        var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                        var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var2_2.N();
                        var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var11_13 /* !! */ , false);
                        var6_6 /* !! */  = var2_2.z;
                        if (var6_6 /* !! */  == null) return;
                        var6_6 /* !! */ .onPlayerError(var16_25, (String)var15_18 /* !! */ );
                        return;
lbl283:
                        // 1 sources

                        var6_6 /* !! */  = JioAdError.Companion;
                        var15_18 /* !! */  = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
                        var6_6 /* !! */ .getClass();
                        var10_12 = t_0.a((JioAdError$JioAdErrorType)var15_18 /* !! */ );
                        var9_11 /* !! */  = var2_2.z;
                        if (var9_11 /* !! */  != null) {
                            var12_14 = com.jio.jioads.cdnlogging.d.a;
                            var13_15 /* !! */  = "onError1";
                            var17_29 = "JioVideoView";
                            var19_35 = "Player preparation failed";
                            var20_38 = false;
                            var11_13 /* !! */  = null;
                            var9_11 /* !! */ .onFailedToLoad((JioAdError)var10_12, false, (com.jio.jioads.cdnlogging.d)var12_14, var13_15 /* !! */ , var17_29, var19_35);
                        }
                        var6_6 /* !! */  = d_0.a;
                        var15_18 /* !! */  = "<set-?>";
                        Intrinsics.checkNotNullParameter(var6_6 /* !! */ , (String)var15_18 /* !! */ );
                        var2_2.A = var6_6 /* !! */ ;
                        var2_2.f();
                        return;
lbl303:
                        // 1 sources

                        var8_10 = var2_2.P;
                        if (var8_10 != 0) break block58;
                        var6_6 /* !! */  = var2_2.O;
                        var6_6 /* !! */  = l_0.b(0, (ArrayList)var6_6 /* !! */ );
                        if ((var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ) != null) {
                            var6_6 /* !! */  = var6_6 /* !! */ .p;
                        } else {
                            var7_9 = 0;
                            var6_6 /* !! */  = null;
                        }
                        var15_22 = var2_2.O;
                        var15_22 = l_0.b(0, (ArrayList)var15_22);
                        var15_22 = (com.jio.jioads.instreamads.vastparser.model.k)var15_22;
                        var8_10 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var15_22);
                        var9_11 /* !! */  = var2_2.O;
                        var9_11 /* !! */  = l_0.j((ArrayList)var9_11 /* !! */ );
                        var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                        var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ , false);
                        var2_2.N();
                        var9_11 /* !! */  = var2_2.z;
                        if (var9_11 /* !! */  != null) {
                            var9_11 /* !! */ .onPlayerError(var8_10, (String)var6_6 /* !! */ );
                        }
                        ** GOTO lbl481
                    }
                    var15_18 /* !! */  = var2_2.O;
                    var8_10 = l_0.a((ArrayList)var15_18 /* !! */ );
                    var10_12 = ", errorUrl: ";
                    var11_13 /* !! */  = ": player error for adId: ";
                    if (var8_10 <= var7_9) break block59;
                    var6_6 /* !! */  = var2_2.O;
                    var6_6 /* !! */  = l_0.b(var14_16, (ArrayList)var6_6 /* !! */ );
                    if ((var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ) != null) {
                        var6_6 /* !! */  = var6_6 /* !! */ .a;
                    } else {
                        var7_9 = 0;
                        var6_6 /* !! */  = null;
                    }
                    var15_18 /* !! */  = var2_2.O;
                    var15_18 /* !! */  = l_0.b(var14_16, (ArrayList)var15_18 /* !! */ );
                    var15_18 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var15_18 /* !! */ ;
                    if (var15_18 /* !! */  != null) {
                        var15_18 /* !! */  = var15_18 /* !! */ .c;
                    } else {
                        var8_10 = 0;
                        var15_18 /* !! */  = null;
                    }
                    var12_14 = var2_2.O;
                    var12_14 = l_0.b(var14_16, (ArrayList)var12_14);
                    var12_14 = (com.jio.jioads.instreamads.vastparser.model.k)var12_14;
                    if (var12_14 != null) {
                        var12_14 = var12_14.p;
                    } else {
                        var21_41 = false;
                        var12_14 = null;
                    }
                    var19_36 = var2_2.O;
                    var19_36 = l_0.b(var14_16, (ArrayList)var19_36);
                    var19_36 = (com.jio.jioads.instreamads.vastparser.model.k)var19_36;
                    var22_44 = var2_2.q((com.jio.jioads.instreamads.vastparser.model.k)var19_36);
                    var9_11 /* !! */ .j((String)var15_18 /* !! */ );
                    var9_11 /* !! */  = var2_2.O;
                    var9_11 /* !! */  = l_0.c((ArrayList)var9_11 /* !! */ , var14_16);
                    var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                    var23_46 = new StringBuilder();
                    var24_48 = var2_2.R();
                    var23_46.append(var24_48);
                    var23_46.append(var11_13 /* !! */ );
                    var23_46.append((String)var15_18 /* !! */ );
                    var23_46.append((String)var10_12);
                    var23_46.append((String)var6_6 /* !! */ );
                    var6_6 /* !! */  = var23_46.toString();
                    Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                    var6_6 /* !! */  = JioAds.Companion;
                    var15_18 /* !! */  = var6_6 /* !! */ .getInstance();
                    var15_18 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var15_18 /* !! */  = JioAds$LogLevel.NONE;
                    var15_18 /* !! */  = new StringBuilder();
                    var10_12 = var2_2.R();
                    var15_18 /* !! */ .append((String)var10_12);
                    var10_12 = ": player error preparing next ad";
                    var15_18 /* !! */ .append((String)var10_12);
                    var15_18 /* !! */  = var15_18 /* !! */ .toString();
                    Intrinsics.checkNotNullParameter(var15_18 /* !! */ , var13_15 /* !! */ );
                    var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                    var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ , false);
                    var6_6 /* !! */  = var2_2.z;
                    if (var6_6 /* !! */  != null) {
                        var6_6 /* !! */ .onPlayerError(var22_44, (String)var12_14);
                    }
                    ** GOTO lbl481
                }
                var6_6 /* !! */  = var2_2.X;
                if (var6_6 /* !! */  == null || (var7_9 = (int)var6_6 /* !! */ .isPlaying()) != 0) ** GOTO lbl439
                var6_6 /* !! */  = var2_2.X;
                if (var6_6 /* !! */  != null) {
                    var6_6 /* !! */  = var6_6 /* !! */ .c();
                } else {
                    var7_9 = 0;
                    var6_6 /* !! */  = null;
                }
                var15_18 /* !! */  = JioPlayerState.COMPLETED;
                if (var6_6 /* !! */  != var15_18 /* !! */ ) ** GOTO lbl439
            }
            {
                block60: {
                    var7_9 = var2_2.P;
                    if (var7_9 > 0) {
                        var6_6 /* !! */  = var2_2.X;
                        if (var6_6 /* !! */  != null) {
                            var7_9 = var6_6 /* !! */ .getDuration();
                        } else {
                            var7_9 = 0;
                            var6_6 /* !! */  = null;
                        }
                        var21_42 = var7_9 / 1000;
                        var6_6 /* !! */  = var2_2.O;
                        var6_6 /* !! */  = l_0.j((ArrayList)var6_6 /* !! */ );
                        var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ;
                        var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ , false);
                        var15_18 /* !! */  = var2_2.z;
                        if (var15_18 /* !! */  != null) {
                            var6_6 /* !! */  = var2_2.T();
                            var9_11 /* !! */  = var6_6 /* !! */  == null ? var1_1 : var6_6 /* !! */ ;
                            var18_32 = var2_2.P;
                            var6_6 /* !! */  = var2_2.V;
                            if (var6_6 /* !! */  != null) {
                                var25_49 = var6_6 /* !! */ .longValue();
                                var7_9 = (int)var25_49;
                                var6_6 /* !! */  = var7_9;
                                var13_15 /* !! */  = var6_6 /* !! */ ;
                            } else {
                                var13_15 /* !! */  = null;
                            }
                            var20_39 = var21_42;
                            var15_18 /* !! */ .onAdComplete((String)var9_11 /* !! */ , var18_32, var21_42, var21_42, (Integer)var13_15 /* !! */ );
                        }
                        var2_2.f();
                    }
                    break block60;
lbl439:
                    // 2 sources

                    var6_6 /* !! */  = var2_2.O;
                    var6_6 /* !! */  = l_0.b(var14_16, (ArrayList)var6_6 /* !! */ );
                    if ((var6_6 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var6_6 /* !! */ ) != null) {
                        var6_6 /* !! */  = var6_6 /* !! */ .a;
                    } else {
                        var7_9 = 0;
                        var6_6 /* !! */  = null;
                    }
                    var15_18 /* !! */  = var2_2.O;
                    var15_18 /* !! */  = l_0.b(var14_16, (ArrayList)var15_18 /* !! */ );
                    var15_18 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var15_18 /* !! */ ;
                    if (var15_18 /* !! */  != null) {
                        var15_18 /* !! */  = var15_18 /* !! */ .c;
                    } else {
                        var8_10 = 0;
                        var15_18 /* !! */  = null;
                    }
                    if (var15_18 /* !! */  != null && (var21_43 = var15_18 /* !! */ .length()) != 0) {
                        var9_11 /* !! */ .j((String)var15_18 /* !! */ );
                        var9_11 /* !! */  = var2_2.O;
                        var9_11 /* !! */  = l_0.c((ArrayList)var9_11 /* !! */ , var14_16);
                        var9_11 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ ;
                        var2_2.x((com.jio.jioads.instreamads.vastparser.model.k)var9_11 /* !! */ , false);
                    }
                    var9_11 /* !! */  = new StringBuilder();
                    var12_14 = var2_2.R();
                    var9_11 /* !! */ .append((String)var12_14);
                    var9_11 /* !! */ .append(var11_13 /* !! */ );
                    var9_11 /* !! */ .append((String)var15_18 /* !! */ );
                    var9_11 /* !! */ .append((String)var10_12);
                    var9_11 /* !! */ .append((String)var6_6 /* !! */ );
                    var6_6 /* !! */  = var9_11 /* !! */ .toString();
                    Intrinsics.checkNotNullParameter(var6_6 /* !! */ , var13_15 /* !! */ );
                    var6_6 /* !! */  = JioAds.Companion;
                    var6_6 /* !! */  = var6_6 /* !! */ .getInstance();
                    var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var6_6 /* !! */  = JioAds$LogLevel.NONE;
                }
                s.I(var2_2);
lbl481:
                // 3 sources

                if ((var6_6 /* !! */  = var2_2.z) == null) return;
                Intrinsics.checkNotNull(var6_6 /* !! */ );
                var7_9 = (int)var6_6 /* !! */ .canPrepareNextVideoAd(var14_16);
                if (var7_9 == 0) return;
                var2_2.B(null);
                return;
            }
        }
        var8_10 = var2_2.P;
        if (var8_10 > 0) {
            var6_8 = var2_2.X;
            if (var6_8 != null) {
                var4_4 = var6_8.getDuration();
            }
            var20_40 = var4_4 / 1000;
            var6_8 = var2_2.z;
            if (var6_8 != null) {
                var5_5 /* !! */  = var2_2.T();
                var15_18 /* !! */  = var5_5 /* !! */  == null ? var1_1 : var5_5 /* !! */ ;
                var16_26 = var2_2.P;
                var1_1 = var2_2.V;
                if (var1_1 != null) {
                    var27_50 = var1_1.longValue();
                    var29_51 = (int)var27_50;
                    var3_3 = var29_51;
                }
                var12_14 = var3_3;
                var18_33 = var20_40;
                var6_8.onAdComplete((String)var15_18 /* !! */ , var16_26, var20_40, var20_40, (Integer)var3_3);
            }
        } else {
            var3_3 = JioAdError.Companion;
            var5_5 /* !! */  = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
            var3_3.getClass();
            var9_11 /* !! */  = t_0.a((JioAdError$JioAdErrorType)var5_5 /* !! */ );
            var15_18 /* !! */  = var2_2.z;
            if (var15_18 /* !! */  != null) {
                block55: {
                    var11_13 /* !! */  = com.jio.jioads.cdnlogging.d.a;
                    var3_3 = new StringBuilder("exception in onError1: ");
                    var5_5 /* !! */  = "<this>";
                    Intrinsics.checkNotNullParameter(var6_7, (String)var5_5 /* !! */ );
                    try {
                        var5_5 /* !! */  = var6_7.getStackTrace();
                        Intrinsics.checkNotNull(var5_5 /* !! */ );
                        var12_14 = tp_2.K(var5_5 /* !! */ );
                        var13_15 /* !! */  = "\n";
                        var23_47 = p.c;
                        var30_52 = 30;
                        var14_16 = 0;
                        var17_30 = null;
                        var22_45 = false;
                        var19_37 = null;
                        var1_1 = CollectionsKt.R((Iterable)var12_14, var13_15 /* !! */ , null, null, var23_47, var30_52);
                    }
                    catch (Exception v0) {
                        var5_5 /* !! */  = var6_7.getMessage();
                        if (var5_5 /* !! */  == null) break block55;
                        var1_1 = var5_5 /* !! */ ;
                    }
                }
                var3_3.append((String)var1_1);
                var17_30 = var3_3.toString();
                var13_15 /* !! */  = "JioVideoView";
                var18_34 = false;
                var10_12 = null;
                var12_14 = "onError()";
                var15_18 /* !! */ .onFailedToLoad((JioAdError)var9_11 /* !! */ , false, (com.jio.jioads.cdnlogging.d)var11_13 /* !! */ , (String)var12_14, var13_15 /* !! */ , var17_30);
            }
        }
        var2_2.f();
    }

    public final void e() {
        s s7 = this.d;
        Object object = s7.t;
        if (object != null) {
            object.start();
        }
        object = x.a;
        s7.getClass();
        Object object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, object2);
        s7.A = object;
        object = s7.e0;
        if (object != null) {
            ((e)object).e();
        }
        if ((object = s7.z) != null) {
            object2 = com.jio.jioads.videomodule.b.a;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
        s7.o();
    }

    public final void f() {
        boolean bl2;
        Object object;
        Object object2;
        s s7 = this.d;
        boolean bl3 = false;
        Object object3 = null;
        s7.M = false;
        int n3 = 1;
        s7.v = n3;
        Object object4 = s7.Q;
        if (object4 != null) {
            object4.cancel();
        }
        boolean bl4 = s7.c;
        Object object5 = "message";
        if (bl4) {
            object2 = new StringBuilder();
            object = ": Exo Player prepared for trackNumber: ";
            com.jio.jioads.jioreel.tracker.model.b.d(s7, (StringBuilder)object2, (String)object);
            int n4 = s7.P;
            if (n4 == 0) {
                n4 = 0;
                object = null;
            } else {
                n4 += n3;
            }
            w12_0.b(n4, (String)object5, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
        } else {
            object2 = new StringBuilder();
            object = ": Media Player 1 prepared for trackNumber: ";
            com.jio.jioads.jioreel.tracker.model.b.d(s7, (StringBuilder)object2, (String)object);
            int n7 = s7.P;
            if (n7 == 0) {
                n7 = 0;
                object = null;
            } else {
                n7 += n3;
            }
            w12_0.b(n7, (String)object5, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
        }
        object5 = s7.u;
        if (object5 != null && !(bl2 = ((k)object5).isPlaying())) {
            object5 = s7.u;
            if (object5 != null) {
                object5 = ((k)object5).i;
            } else {
                bl2 = false;
                object5 = null;
            }
            object2 = JioPlayerState.COMPLETED;
            if (object5 == object2) {
                bl3 = true;
            }
        }
        if (bl4) {
            object4 = s7.g0();
            bl4 = object4.c;
            if (bl4 && (object4 = s7.e0) != null && (object4 = s7.t) != null) {
                object4 = s7.t();
                object5 = (Boolean)object4.a;
                bl2 = (Boolean)object5;
                Object object6 = object4 = object4.b;
                object6 = (String)object4;
                if (!bl2) {
                    object3 = JioAdError.Companion;
                    JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                    object3.getClass();
                    object = t_0.a(jioAdError$JioAdErrorType);
                    object2 = s7.z;
                    if (object2 != null) {
                        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                        String string2 = "JioVideoViewRenderer";
                        String string3 = "adjustAspectRatio";
                        object2.onFailedToLoad((JioAdError)object, false, d2, string3, string2, (String)object6);
                    }
                    return;
                }
            }
        }
        object4 = z.a;
        object5 = "<set-?>";
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        s7.A = object4;
        if (bl3) {
            object3 = s7.t;
            if (object3 != null) {
                object3.start();
            }
            this.i();
        }
        if (!(bl3 = s7.o)) {
            object3 = s7.z;
            if (object3 != null) {
                object4 = s7.T();
                if (object4 == null) {
                    object4 = "";
                }
                object3.onAdPrepared((String)object4);
            }
            s7.o = n3;
        }
    }

    public final void g() {
        Object object = this.d;
        Object object2 = ((s)object).Z;
        if (object2 != null) {
            object2.cancel();
        }
        ((s)object).Z = null;
        object2 = w_0.a;
        object.getClass();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        ((s)object).A = object2;
        object2 = ((s)object).t;
        if (object2 != null) {
            object2.pause();
        }
        if ((object2 = ((s)object).e0) != null) {
            object2.g();
        }
        if ((object = ((s)object).z) != null) {
            object2 = com.jio.jioads.videomodule.b.b;
            object.onMediaPlaybackChange((b)((Object)object2));
        }
    }

    public final void h(long l2, long l3) {
        long l4 = l3;
        int n3 = 0;
        Object object = null;
        Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object2 > 0) {
            object2 = this.a;
            if (object2 == false) {
                this.a(false);
            }
            return;
        }
        Object object3 = l2;
        s s7 = this.d;
        s7.n = object3;
        this.c = false;
        object = s7.f;
        if (object != null) {
            object = s7.J;
            object3 = String.valueOf(l2);
            ((HashMap)object).put("duration", object3);
            object3 = String.valueOf(l3);
            Object object4 = "progress";
            ((HashMap)object).put(object4, object3);
            object3 = s7.f;
            if (object3 != null) {
                JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_PROGRESS;
                object4 = new JioAdEvent(jioAdEvent$AdEventType);
                object3.onJioVmapEvent((JioAdEvent)object4, (HashMap)object);
            }
        }
        if ((object = s7.e0) != null) {
            ((e)object).h(l2, l4);
        }
        object = s7.g0();
        n3 = ((com.jio.jioads.videomodule.config.a)object).t;
        if (n3 != 0) {
            n3 = s7.x;
            if (n3 == 0) {
                s7.p();
                s7.v(l2, l4);
            }
        } else {
            s7.p();
            s7.v(l2, l4);
        }
        if ((object = s7.y) != null) {
            object = ((f)object).P;
        } else {
            n3 = 0;
            object = null;
        }
        object3 = "VideoAdProgressCountTotalDuration";
        n3 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
        if (n3 != 0 && (object = s7.z) != null) {
            long l7 = s7.h0().a;
            object2 = 1000;
            long l8 = object2;
            l7 *= l8;
            object3 = s7.h0();
            l8 = ((com.jio.jioads.videomodule.config.b)object3).c;
            object.onAllAdMediaProgress(l7, l8);
        }
        if ((object = s7.z) != null) {
            object3 = s7.T();
            if (object3 == null) {
                object3 = "";
            }
            l4 = l3;
            object.onAdProgress((String)object3, l3, l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i() {
        block30: {
            block29: {
                var1_1 = this;
                var2_2 = this.d;
                var3_3 = var2_2.e0;
                if (var3_3 != null) {
                    var3_3.t();
                }
                var2_2.X = var3_3 = var2_2.t;
                var4_4 = false;
                var3_3 = null;
                var1_1.a = false;
                var5_5 /* !! */  = var2_2.r;
                if (var5_5 /* !! */  != null && (var5_5 /* !! */  = (Map)var5_5 /* !! */ .invoke()) != null) {
                    var6_6 = var2_2.a;
                    var6_6.clear();
                    var6_6.putAll(var5_5 /* !! */ );
                }
                if ((var5_5 /* !! */  = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(var2_2.O)) == null || (var5_5 /* !! */  = var5_5 /* !! */ .q) == null) {
                    var5_5 /* !! */  = var2_2.T();
                }
                var6_6 = var2_2.V();
                var2_2.E((String)var5_5 /* !! */ , (String)var6_6);
                var5_5 /* !! */  = var2_2.E;
                if (var5_5 /* !! */  == null && (var5_5 /* !! */  = var2_2.e0) != null) {
                    var5_5 /* !! */ .q();
                }
                var2_2.C();
                var5_5 /* !! */  = var2_2.t;
                var7_7 = false;
                var6_6 = null;
                if (var5_5 /* !! */  != null) {
                    var8_8 = var5_5 /* !! */ .getDuration();
                    var5_5 /* !! */  = var8_8;
                } else {
                    var8_8 = 0;
                    var5_5 /* !! */  = null;
                }
                var2_2.T = var5_5 /* !! */ ;
                var5_5 /* !! */  = x.a;
                var9_9 = "<set-?>";
                Intrinsics.checkNotNullParameter(var5_5 /* !! */ , var9_9);
                var2_2.A = var5_5 /* !! */ ;
                var8_8 = (int)var2_2.c;
                var10_10 = 1;
                if (var8_8 != 0) break block29;
                var11_11 = var2_2.z;
                if (var11_11 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var11_11);
                var12_12 = var11_11.canPrepareNextVideoAd(var10_10);
                if (var12_12) {
                    var2_2.B(null);
                } else if ((var11_11 = var2_2.z) == null) {
                    var2_2.B(null);
                }
                break block30;
            }
            var11_11 = var2_2.z;
            if (var11_11 != null) {
                var11_11.canPrepareNextVideoAd(var10_10);
            }
        }
        if (var8_8 != 0) {
            var11_11 = var2_2.g0();
            var12_12 = var11_11.t;
            if (var12_12 && (var11_11 = var2_2.t) != null) {
                var11_11.b();
            }
        }
        var11_11 = var2_2.g;
        var13_13 = var2_2.b;
        var14_14 /* !! */  = "";
        if (var11_11 != null) {
            var15_15 = var2_2.O;
            if ((var11_11 = var13_13.b((Context)var11_11, 0, (ArrayList)var15_15)) == null) {
                var11_11 = var14_14 /* !! */ ;
            }
            var2_2.Y = var11_11;
        }
        var11_11 = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var2_2, (StringBuilder)var11_11, ": onStarted for trackNumber: ");
        var16_16 = var2_2.P;
        var11_11.append(var16_16);
        var11_11.append(", remaining-tracks: ");
        var16_16 = l_0.a(var2_2.O) - var10_10;
        var11_11.append(var16_16);
        var11_11 = var11_11.toString();
        var15_15 = "message";
        Intrinsics.checkNotNullParameter(var11_11, (String)var15_15);
        var11_11 = JioAds.Companion;
        var11_11.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var17_17 /* !! */  = JioAds$LogLevel.NONE;
        var17_17 /* !! */  = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var2_2, (StringBuilder)var17_17 /* !! */ , ": onStarted for url: ");
        var18_18 = var2_2.Y;
        d90_0.b((StringBuilder)var17_17 /* !! */ , (String)var18_18, (String)var15_15, (JioAds$Companion)var11_11);
        if (var8_8 == 0) {
            var5_5 /* !! */  = var2_2.g0();
            var8_8 = (int)var5_5 /* !! */ .c;
            if (var8_8 != 0 && (var5_5 /* !! */  = var2_2.e0) != null && (var5_5 /* !! */  = var2_2.t) != null) {
                var5_5 /* !! */  = var2_2.t();
                var17_17 /* !! */  = (Boolean)var5_5 /* !! */ .a;
                var19_19 = var17_17 /* !! */ .booleanValue();
                var20_20 = var5_5 /* !! */  = var5_5 /* !! */ .b;
                var20_20 = (String)var5_5 /* !! */ ;
                if (!var19_19) {
                    var3_3 = JioAdError.Companion;
                    var5_5 /* !! */  = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                    var3_3.getClass();
                    var21_21 = t_0.a((JioAdError$JioAdErrorType)var5_5 /* !! */ );
                    var18_18 = var2_2.z;
                    if (var18_18 != null) {
                        var22_22 = com.jio.jioads.cdnlogging.d.a;
                        var23_23 = "JioVideoViewRenderer";
                        var24_24 = "adjustAspectRatio";
                        var18_18.onFailedToLoad(var21_21, false, var22_22, var24_24, var23_23, (String)var20_20);
                    }
                    return;
                }
            }
        }
        if ((var8_8 = (int)var1_1.b) == 0) {
            var1_1.b = var10_10;
            var5_5 /* !! */  = var2_2.z;
            if (var5_5 /* !! */  != null) {
                var17_17 /* !! */  = var2_2.i0();
                if (var17_17 /* !! */  == null && (var17_17 /* !! */  = var2_2.T()) == null) {
                    var17_17 /* !! */  = var14_14 /* !! */ ;
                }
                var5_5 /* !! */ .onAdLoaded((String)var17_17 /* !! */ , 0);
            }
            if ((var5_5 /* !! */  = var2_2.z) != null) {
                var17_17 /* !! */  = var2_2.i0();
                if (var17_17 /* !! */  == null && (var17_17 /* !! */  = var2_2.T()) == null) {
                    var17_17 /* !! */  = var14_14 /* !! */ ;
                }
                var5_5 /* !! */ .onAdStarted((String)var17_17 /* !! */ , 0);
            }
        }
        if ((var3_3 = var13_13.a) != null) {
            var5_5 /* !! */  = var2_2.T();
            var6_6 = var3_3 = var3_3.v.get(var5_5 /* !! */ );
            var6_6 = (AdMetaData$AdParams)var3_3;
        }
        var2_2.N = var6_6;
        var3_3 = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(var2_2, (StringBuilder)var3_3, ": currentAdId: ");
        var5_5 /* !! */  = var2_2.T();
        var3_3.append((String)var5_5 /* !! */ );
        var3_3.append(", track: ");
        var8_8 = var2_2.P;
        var3_3.append(var8_8);
        var3_3.append(", isCtaUrlPresent: ");
        var8_8 = (int)var2_2.a();
        var3_3.append((boolean)var8_8);
        var3_3.append(", currentAdParams: ");
        var5_5 /* !! */  = var2_2.N;
        var3_3.append(var5_5 /* !! */ );
        Intrinsics.checkNotNullParameter(var3_3.toString(), (String)var15_15);
        var11_11.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var3_3 = var2_2.e0;
        if (var3_3 != null) {
            var5_5 /* !! */  = var2_2.N;
            var7_7 = var2_2.a();
            var3_3.i((AdMetaData$AdParams)var5_5 /* !! */ , var7_7);
        }
        var3_3 = var2_2.g0();
        var4_4 = var3_3.q;
        if (var4_4 && (var3_3 = var2_2.z) != null) {
            var5_5 /* !! */  = var2_2.T();
            if (var5_5 /* !! */  != null) {
                var14_14 /* !! */  = var5_5 /* !! */ ;
            }
            var8_8 = var2_2.P + var10_10;
            var3_3.onAdChange(var14_14 /* !! */ , var8_8);
        }
        s.Y(var2_2);
        var2_2.o();
        var3_3 = var2_2.e0;
        if (var3_3 != null) {
            var3_3.s();
        }
        var3_3 = var2_2.h0();
        var3_3.b = var8_8 = var2_2.P;
        var3_3 = var2_2.e0;
        if (var3_3 != null) {
            var25_25 = var2_2.U();
            var3_3.c(var8_8, var25_25);
        }
    }
}

