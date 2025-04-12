/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.videomodule;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.d_0;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class U
extends CountDownTimer {
    public final /* synthetic */ s a;
    public final /* synthetic */ int b;

    public U(s s7, int n3, long l2) {
        this.a = s7;
        this.b = n3;
        super(l2, 1000L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onFinish() {
        block50: {
            block52: {
                block51: {
                    block49: {
                        var1_1 = this;
                        var2_2 = this.a;
                        var3_3 = var2_2.A;
                        var4_8 = d_0.a;
                        var5_9 = Intrinsics.areEqual(var3_3, var4_8);
                        if (var5_9) {
                            var2_2.G();
                            return;
                        }
                        var5_9 = var2_2.P;
                        var6_10 = 1;
                        var7_11 = 0;
                        var8_12 = null;
                        if (!var5_9) {
                            var5_9 = false;
                            var3_3 = null;
                        } else {
                            var5_9 += var6_10;
                        }
                        var9_13 = new StringBuilder();
                        com.jio.jioads.jioreel.tracker.model.b.d((s)var2_2, (StringBuilder)var9_13, ": TimeOut timer finished .Timeout considered: ");
                        var10_14 = var1_1.b;
                        var9_13.append(var10_14);
                        var9_13.append(" sec for trackNumber: ");
                        var9_13.append((int)var5_9);
                        var3_3 = var9_13.toString();
                        var9_13 = "message";
                        Intrinsics.checkNotNullParameter(var3_3, (String)var9_13);
                        var3_3 = JioAds.Companion;
                        var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var11_15 = JioAds$LogLevel.NONE;
                        try {
                            var2_2.G();
                            var2_2.M = false;
                            var11_15 = var2_2.g0();
                            var10_14 = (int)var11_15.r;
                            var12_16 = ": player timeout error for adId: ";
                            var13_17 = null;
                            var14_18 = var2_2.b;
                            if (var10_14 == 0) break block49;
                        }
                        catch (Exception var3_4) {
                            break block50;
                        }
                        var10_14 = var2_2.P;
                        if (var10_14 == 0) {
                            var3_3 = var2_2.O;
                            var3_3 = l_0.b(0, (ArrayList)var3_3);
                            if ((var3_3 = (k)var3_3) != null) {
                                var13_17 = var3_3.p;
                            }
                            var3_3 = var2_2.O;
                            var3_3 = l_0.b(0, (ArrayList)var3_3);
                            var3_3 = (k)var3_3;
                            var5_9 = var2_2.q((k)var3_3);
                            var9_13 = var2_2.X;
                            if (var9_13 != null) {
                                var9_13.e();
                            }
                            var2_2.M = false;
                            var8_12 = var2_2.O;
                            var8_12 = l_0.j((ArrayList)var8_12);
                            var8_12 = (k)var8_12;
                            var2_2.N();
                            var11_15 = var13_17;
                            var13_17 = var8_12;
                            var7_11 = var5_9;
                        } else {
                            var11_15 = var2_2.O;
                            var10_14 = l_0.a((ArrayList)var11_15);
                            if (var10_14 > var6_10) {
                                var8_12 = var2_2.O;
                                var8_12 = l_0.b(var6_10, (ArrayList)var8_12);
                                if ((var8_12 = (k)var8_12) != null) {
                                    var8_12 = var8_12.a;
                                } else {
                                    var7_11 = 0;
                                    var8_12 = null;
                                }
                                var11_15 = var2_2.O;
                                var11_15 = l_0.b(var6_10, (ArrayList)var11_15);
                                var11_15 = (k)var11_15;
                                if (var11_15 != null) {
                                    var11_15 = var11_15.p;
                                } else {
                                    var10_14 = 0;
                                    var11_15 = null;
                                }
                                var15_19 = var2_2.O;
                                var15_19 = l_0.b(var6_10, (ArrayList)var15_19);
                                var15_19 = (k)var15_19;
                                if (var15_19 != null) {
                                    var13_17 = var15_19.c;
                                }
                                var15_19 = var2_2.O;
                                var15_19 = l_0.b(var6_10, (ArrayList)var15_19);
                                var15_19 = (k)var15_19;
                                var16_21 = var2_2.q((k)var15_19);
                                var14_18.j((String)var13_17);
                                var14_18 = var2_2.O;
                                var14_18 = l_0.c((ArrayList)var14_18, var6_10);
                                var14_18 = (k)var14_18;
                                var17_23 = new StringBuilder();
                                var18_25 = var2_2.R();
                                var17_23.append(var18_25);
                                var17_23.append((String)var12_16);
                                var17_23.append((String)var13_17);
                                var12_16 = ", errorVideoUrl: ";
                                var17_23.append((String)var12_16);
                                var17_23.append((String)var8_12);
                                var8_12 = var17_23.toString();
                                Intrinsics.checkNotNullParameter(var8_12, (String)var9_13);
                                var8_12 = var3_3.getInstance();
                                var8_12.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var8_12 = new StringBuilder();
                                var12_16 = var2_2.R();
                                var8_12.append((String)var12_16);
                                var12_16 = ": player timeout error fetching new ad";
                                var8_12.append((String)var12_16);
                                var8_12 = var8_12.toString();
                                Intrinsics.checkNotNullParameter(var8_12, (String)var9_13);
                                var3_3 = var3_3.getInstance();
                                var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var13_17 = var14_18;
                                var7_11 = var16_21;
                            } else {
                                var10_14 = 0;
                                var11_15 = null;
                            }
                        }
                        var2_2.x((k)var13_17, (boolean)var6_10);
                        var3_3 = var2_2.z;
                        if (var3_3 == null) return;
                        var3_3.onPlayerError(var7_11, (String)var11_15);
                        return;
                    }
                    var10_14 = (int)var2_2.o;
                    var15_20 = ": player timeout error preparing next ad";
                    var17_24 = ", errorUrl: ";
                    if (var10_14 == 0 && (var10_14 = l_0.a((ArrayList)(var11_15 = var2_2.O))) == var6_10) {
                        var11_15 = var2_2.O;
                        var11_15 = l_0.b(0, (ArrayList)var11_15);
                        if ((var11_15 = (k)var11_15) != null) {
                            var11_15 = var11_15.a;
                        } else {
                            var10_14 = 0;
                            var11_15 = null;
                        }
                        var14_18 = var2_2.O;
                        var14_18 = l_0.b(0, (ArrayList)var14_18);
                        var14_18 = (k)var14_18;
                        var14_18 = var14_18 != null ? var14_18.c : null;
                        var18_26 = var2_2.O;
                        var18_26 = l_0.b(0, (ArrayList)var18_26);
                        var18_26 = (k)var18_26;
                        if (var18_26 != null) {
                            var13_17 = var18_26.p;
                        }
                        var18_26 = var2_2.O;
                        var18_26 = l_0.b(0, (ArrayList)var18_26);
                        var18_26 = (k)var18_26;
                        var19_30 = var2_2.q((k)var18_26);
                        var20_32 = var2_2.O;
                        var20_32 = l_0.j((ArrayList)var20_32);
                        var20_32 = (k)var20_32;
                        var2_2.N();
                        var21_35 = new StringBuilder();
                        var22_39 = var2_2.R();
                        var21_35.append(var22_39);
                        var21_35.append((String)var12_16);
                        var21_35.append((String)var14_18);
                        var21_35.append(var17_24);
                        var21_35.append((String)var11_15);
                        var11_15 = var21_35.toString();
                        Intrinsics.checkNotNullParameter(var11_15, (String)var9_13);
                        var11_15 = var3_3.getInstance();
                        var11_15.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var11_15 = new StringBuilder();
                        var12_16 = var2_2.R();
                        var11_15.append((String)var12_16);
                        var11_15.append((String)var15_20);
                        var11_15 = var11_15.toString();
                        Intrinsics.checkNotNullParameter(var11_15, (String)var9_13);
                        var3_3 = var3_3.getInstance();
                        var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var3_3 = var2_2.X;
                        if (var3_3 != null) {
                            var3_3.e();
                        }
                        var2_2.M = false;
                        var2_2.x((k)var20_32, (boolean)var6_10);
                        var3_3 = var2_2.z;
                        if (var3_3 == null) return;
                        var3_3.onPlayerError(var19_30, (String)var13_17);
                        return;
                    }
                    var10_14 = (int)var2_2.o;
                    var19_31 = 2;
                    if (var10_14 == 0 && (var10_14 = l_0.a((ArrayList)(var11_15 = var2_2.O))) > var19_31) {
                        var11_15 = var2_2.O;
                        var11_15 = l_0.b(0, (ArrayList)var11_15);
                        if ((var11_15 = (k)var11_15) != null) {
                            var11_15 = var11_15.a;
                        } else {
                            var10_14 = 0;
                            var11_15 = null;
                        }
                        var14_18 = var2_2.O;
                        var14_18 = l_0.b(0, (ArrayList)var14_18);
                        var14_18 = (k)var14_18;
                        var14_18 = var14_18 != null ? var14_18.c : null;
                        var18_27 = var2_2.O;
                        var18_27 = l_0.b(0, (ArrayList)var18_27);
                        var18_27 = (k)var18_27;
                        if (var18_27 != null) {
                            var13_17 = var18_27.p;
                        }
                        var18_27 = var2_2.O;
                        var8_12 = l_0.b(0, (ArrayList)var18_27);
                        var8_12 = (k)var8_12;
                        var7_11 = var2_2.q((k)var8_12);
                        var18_27 = var2_2.O;
                        var18_27 = l_0.j((ArrayList)var18_27);
                        var18_27 = (k)var18_27;
                        var2_2.N();
                        var20_33 = new StringBuilder();
                        var21_36 = var2_2.R();
                        var20_33.append(var21_36);
                        var20_33.append((String)var12_16);
                        var20_33.append((String)var14_18);
                        var20_33.append(var17_24);
                        var20_33.append((String)var11_15);
                        var11_15 = var20_33.toString();
                        Intrinsics.checkNotNullParameter(var11_15, (String)var9_13);
                        var11_15 = var3_3.getInstance();
                        var11_15.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var11_15 = new StringBuilder();
                        var12_16 = var2_2.R();
                        var11_15.append((String)var12_16);
                        var11_15.append((String)var15_20);
                        var11_15 = var11_15.toString();
                        Intrinsics.checkNotNullParameter(var11_15, (String)var9_13);
                        var3_3 = var3_3.getInstance();
                        var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var3_3 = var2_2.X;
                        if (var3_3 != null) {
                            var3_3.e();
                        }
                        var2_2.n();
                        var2_2.x((k)var18_27, (boolean)var6_10);
                        var3_3 = var2_2.z;
                        if (var3_3 == null) return;
                        var3_3.onPlayerError(var7_11, (String)var13_17);
                        return;
                    }
                    var11_15 = var2_2.O;
                    var10_14 = l_0.a((ArrayList)var11_15);
                    var20_34 = "";
                    if (var10_14 <= var19_31) ** GOTO lbl379
                    try {
                        var11_15 = var2_2.X;
                        if (var11_15 != null && (var10_14 = (int)var11_15.isPlaying()) == 0) {
                            var11_15 = var2_2.X;
                            if (var11_15 == null) break block51;
                            var11_15 = var11_15.c();
                            break block52;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Exception var3_5) {
                        ** GOTO lbl-1000
                    }
                }
                var10_14 = 0;
                var11_15 = null;
            }
            var18_28 /* !! */  = JioPlayerState.COMPLETED;
            if (var11_15 == var18_28 /* !! */ ) {
                var10_14 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var10_14 = 0;
                var11_15 = null;
            }
            if (var10_14 != 0) {
                var2_2.B(null);
            } else {
                var7_11 = 1;
            }
            var18_28 /* !! */  = var2_2.O;
            var18_28 /* !! */  = l_0.b(var7_11, (ArrayList)var18_28 /* !! */ );
            var18_28 /* !! */  = (k)var18_28 /* !! */ ;
            if (var18_28 /* !! */  != null) {
                var18_28 /* !! */  = var18_28 /* !! */ .a;
            } else {
                var19_31 = 0;
                var18_28 /* !! */  = null;
            }
            var21_37 = var2_2.O;
            var21_37 = l_0.b(var7_11, (ArrayList)var21_37);
            var21_37 = (k)var21_37;
            var21_37 = var21_37 != null ? var21_37.c : null;
            var22_40 = var2_2.O;
            var22_40 = l_0.b(var7_11, (ArrayList)var22_40);
            var22_40 = (k)var22_40;
            var22_40 = var22_40 != null ? var22_40.p : null;
            var4_8 = var2_2.O;
            var4_8 = l_0.b(var7_11, (ArrayList)var4_8);
            var4_8 = (k)var4_8;
            var6_10 = var2_2.q((k)var4_8);
            var14_18.j((String)var21_37);
            var14_18 = var2_2.O;
            var8_12 = l_0.c((ArrayList)var14_18, var7_11);
            var8_12 = (k)var8_12;
            var14_18 = new StringBuilder();
            var13_17 = var2_2.R();
            var14_18.append((String)var13_17);
            var14_18.append((String)var12_16);
            var14_18.append((String)var21_37);
            var14_18.append(var17_24);
            var14_18.append((String)var18_28 /* !! */ );
            var12_16 = var14_18.toString();
            Intrinsics.checkNotNullParameter(var12_16, (String)var9_13);
            var12_16 = var3_3.getInstance();
            var12_16.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var12_16 = new StringBuilder();
            var13_17 = var2_2.R();
            var12_16.append((String)var13_17);
            var12_16.append((String)var15_20);
            var12_16 = var12_16.toString();
            Intrinsics.checkNotNullParameter(var12_16, (String)var9_13);
            var3_3 = var3_3.getInstance();
            var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (var10_14 == 0) {
                var5_9 = false;
                var3_3 = null;
                var2_2.B(null);
            }
            var5_9 = true;
            var2_2.x((k)var8_12, var5_9);
            var3_3 = var2_2.z;
            if (var3_3 == null) return;
            if (var22_40 != null) {
                var20_34 = var22_40;
            }
            var3_3.onPlayerError(var6_10, (String)var20_34);
            return;
lbl-1000:
            // 1 sources

            {
                var4_8 = new StringBuilder();
                var8_12 = var2_2.R();
                var4_8.append((String)var8_12);
                var8_12 = ": error while preparing next: ";
                var4_8.append((String)var8_12);
                var3_6 /* !! */  = var3_5.getMessage();
                var4_8.append((String)var3_6 /* !! */ );
                var3_6 /* !! */  = var4_8.toString();
                Intrinsics.checkNotNullParameter(var3_6 /* !! */ , (String)var9_13);
                var3_6 /* !! */  = JioAds.Companion;
                var3_6 /* !! */  = var3_6 /* !! */ .getInstance();
                var3_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_6 /* !! */  = JioAds$LogLevel.NONE;
                return;
lbl379:
                // 1 sources

                var4_8 = var2_2.O;
                var6_10 = l_0.a((ArrayList)var4_8);
                if (var6_10 != var19_31) ** GOTO lbl453
                var4_8 = var2_2.X;
                if (var4_8 == null || (var6_10 = (int)var4_8.isPlaying()) != 0) ** GOTO lbl398
                var4_8 = var2_2.X;
                if (var4_8 != null) {
                    var4_8 = var4_8.c();
                } else {
                    var6_10 = 0;
                    var4_8 = null;
                }
                var11_15 = JioPlayerState.COMPLETED;
                if (var4_8 != var11_15) ** GOTO lbl398
                var6_10 = 0;
                var4_8 = null;
            }
            {
                block53: {
                    var2_2.B(null);
                    var10_14 = 0;
                    var11_15 = null;
                    break block53;
lbl398:
                    // 2 sources

                    var6_10 = 0;
                    var4_8 = null;
                    var10_14 = 1;
                }
                var13_17 = var2_2.O;
                var13_17 = l_0.b(var10_14, (ArrayList)var13_17);
                var13_17 = (k)var13_17;
                var13_17 = var13_17 != null ? var13_17.c : null;
                var15_20 = var2_2.O;
                var15_20 = l_0.b(var10_14, (ArrayList)var15_20);
                var15_20 = (k)var15_20;
                if (var15_20 != null) {
                    var15_20 = var15_20.p;
                } else {
                    var16_22 = false;
                    var15_20 = null;
                }
                var18_29 = var2_2.O;
                var18_29 = l_0.b(var10_14, (ArrayList)var18_29);
                var18_29 = (k)var18_29;
                if (var18_29 != null) {
                    var4_8 = var18_29.a;
                }
                var18_29 = var2_2.O;
                var18_29 = l_0.b(var10_14, (ArrayList)var18_29);
                var18_29 = (k)var18_29;
                var19_31 = var2_2.q((k)var18_29);
                var21_38 = new StringBuilder();
                var22_41 = var2_2.R();
                var21_38.append(var22_41);
                var21_38.append((String)var12_16);
                var21_38.append((String)var13_17);
                var21_38.append(var17_24);
                var21_38.append((String)var4_8);
                var4_8 = var21_38.toString();
                Intrinsics.checkNotNullParameter(var4_8, (String)var9_13);
                var3_3 = var3_3.getInstance();
                var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_2.M = false;
                var14_18.j((String)var13_17);
                var3_3 = var2_2.O;
                var3_3 = l_0.c((ArrayList)var3_3, var10_14);
                var3_3 = (k)var3_3;
                var6_10 = 1;
                var2_2.x((k)var3_3, (boolean)var6_10);
                var3_3 = var2_2.z;
                if (var3_3 == null) return;
                if (var15_20 != null) {
                    var20_34 = var15_20;
                }
                var3_3.onPlayerError(var19_31, (String)var20_34);
                return;
lbl453:
                // 1 sources

                var3_3 = var2_2.O;
                var3_3 = l_0.j((ArrayList)var3_3);
                var3_3 = (k)var3_3;
                var6_10 = 1;
                var2_2.x((k)var3_3, (boolean)var6_10);
                var3_3 = var2_2.z;
                if (var3_3 != null) {
                    var4_8 = var2_2.T();
                    if (var4_8 != null) {
                        var20_34 = var4_8;
                    }
                    var6_10 = var2_2.P;
                    var7_11 = 1;
                    var3_3.onMediaPrepareTimeOut((String)var20_34, var6_10 += var7_11);
                }
                var2_2.f();
                return;
            }
        }
        var4_8 = new StringBuilder();
        var2_2 = var2_2.R();
        var4_8.append((String)var2_2);
        var2_2 = ": exception in handleTimeOutError: ";
        var4_8.append((String)var2_2);
        com.jio.jioads.jioreel.tracker.model.b.e(var3_4, (StringBuilder)var4_8);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var3_7 = JioAds$LogLevel.NONE;
    }

    public final void onTick(long l2) {
        Object object = this.a;
        Object object2 = ((s)object).A;
        Object object3 = d_0.a;
        int n3 = Intrinsics.areEqual(object2, object3);
        if (n3 != 0) {
            ((s)object).G();
            return;
        }
        n3 = ((s)object).P;
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            ++n3;
        }
        boolean bl2 = ((s)object).c;
        String string2 = ": Player is prepared for trackNumber: ";
        String string3 = "message";
        String string4 = "...";
        if (!bl2) {
            object3 = ((s)object).X;
            Object object4 = ((s)object).t;
            bl2 = Intrinsics.areEqual(object3, object4);
            if (bl2 && (bl2 = ((s)object).w) || (bl2 = Intrinsics.areEqual(object3 = ((s)object).X, object4 = ((s)object).u)) && (bl2 = ((s)object).v)) {
                object3 = new StringBuilder();
                object4 = ((s)object).R();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(string4);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((s)object).Q;
                if (object2 != null) {
                    object2.cancel();
                }
                ((s)object).Q = null;
                return;
            }
        } else {
            bl2 = ((s)object).v;
            if (bl2) {
                object3 = new StringBuilder();
                String string5 = ((s)object).R();
                ((StringBuilder)object3).append(string5);
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(string4);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                ((s)object).G();
                return;
            }
        }
        if (bl2 = ((s)object).c) {
            object3 = new StringBuilder();
            object = ((s)object).R();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(": ExoPlayer is getting prepared for trackNumber: ");
            ((StringBuilder)object3).append(n3);
            ((StringBuilder)object3).append(string4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            object3 = new StringBuilder();
            object = ((s)object).R();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(": MediaPlayer is getting prepared for trackNumber: ");
            ((StringBuilder)object3).append(n3);
            ((StringBuilder)object3).append(string4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }
}

