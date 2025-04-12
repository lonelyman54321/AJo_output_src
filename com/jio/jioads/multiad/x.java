/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.b_0;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

public final class x {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ z b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ b_0 e;
    public final /* synthetic */ String f;

    public x(b_0 b_02, z z5, String string2, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        this.a = hashMap;
        this.b = z5;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = b_02;
        this.f = string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a() {
        block123: {
            block97: {
                block98: {
                    block99: {
                        block100: {
                            block122: {
                                block121: {
                                    block103: {
                                        block120: {
                                            block119: {
                                                block118: {
                                                    block117: {
                                                        block104: {
                                                            block116: {
                                                                block115: {
                                                                    block114: {
                                                                        block113: {
                                                                            var1_1 = this;
                                                                            var2_2 = this.a;
                                                                            var3_3 /* !! */  = var2_2.keySet();
                                                                            Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , "<get-keys>(...)");
                                                                            var4_4 = this.b;
                                                                            var5_5 = var4_4.m;
                                                                            var6_6 = "";
                                                                            var7_7 = 0;
                                                                            var8_8 = null;
                                                                            var9_9 = 1;
                                                                            if (var5_5 == null || (var11_11 = var5_5.containsKey(var10_10 = var4_4.d())) != var9_9) ** GOTO lbl-1000
                                                                            var5_5 = var4_4.m;
                                                                            Intrinsics.checkNotNull(var5_5);
                                                                            var10_10 = var4_4.o;
                                                                            if (var10_10 != null) {
                                                                                var10_10 = var10_10.P();
                                                                            } else {
                                                                                var12_12 = 0;
                                                                                var10_10 = null;
                                                                            }
                                                                            var5_5 = (Object[])var5_5.get(var10_10);
                                                                            if (var5_5 != null) {
                                                                                var5_5 = var5_5[0].toString();
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var5_5 = var6_6;
                                                                            }
                                                                            var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                            block72: while (true) {
                                                                                var12_12 = var3_3 /* !! */ .hasNext();
                                                                                var13_13 /* !! */  = "message";
                                                                                var14_14 = var1_1.d;
                                                                                if (var12_12 == 0) break block97;
                                                                                var10_10 = (String)var3_3 /* !! */ .next();
                                                                                var15_15 = var4_4.y;
                                                                                if (var15_15 != null && (var16_16 = var15_15.contains(var10_10)) == var9_9) {
                                                                                    block112: {
                                                                                        block111: {
                                                                                            block110: {
                                                                                                block109: {
                                                                                                    block108: {
                                                                                                        block107: {
                                                                                                            block106: {
                                                                                                                block105: {
                                                                                                                    block102: {
                                                                                                                        block101: {
                                                                                                                            var15_15 = var1_1.c;
                                                                                                                            var17_17 = var15_15.contains(var10_10);
                                                                                                                            if (var17_17 != 0 || (var17_17 = Intrinsics.areEqual(var10_10, var5_5)) != 0 && (var17_17 = var4_4.x) == 0) break block98;
                                                                                                                            var16_16 = (int)var4_4.u;
                                                                                                                            if (var16_16 == 0 || (var16_16 = (int)var4_4.x) != 0) break block99;
                                                                                                                            var15_15 = (f)var2_2.get(var10_10);
                                                                                                                            if (var15_15 == null) break block100;
                                                                                                                            var18_18 /* !! */  = var15_15.b;
                                                                                                                            if (var18_18 /* !! */  == null) break block101;
                                                                                                                            var18_18 /* !! */  = var18_18 /* !! */ .c;
                                                                                                                            break block102;
                                                                                                                        }
                                                                                                                        var17_17 = 0;
                                                                                                                        var18_18 /* !! */  = null;
                                                                                                                    }
                                                                                                                    if (var18_18 /* !! */  == null) break block103;
                                                                                                                    var18_18 /* !! */  = var4_4.m;
                                                                                                                    if (var18_18 /* !! */  == null) break block104;
                                                                                                                    var19_19 = var4_4.d();
                                                                                                                    var17_17 = (int)var18_18 /* !! */ .containsKey(var19_19);
                                                                                                                    if (var17_17 != var9_9) break block104;
                                                                                                                    var18_18 /* !! */  = var4_4.m;
                                                                                                                    Intrinsics.checkNotNull(var18_18 /* !! */ );
                                                                                                                    var19_19 = var4_4.o;
                                                                                                                    if (var19_19 == null) break block105;
                                                                                                                    var19_19 = var19_19.P();
                                                                                                                    break block106;
                                                                                                                }
                                                                                                                var20_20 = 0;
                                                                                                                var19_19 = null;
                                                                                                            }
                                                                                                            var18_18 /* !! */  = var18_18 /* !! */ .get(var19_19);
                                                                                                            var18_18 /* !! */  = var18_18 /* !! */ ;
                                                                                                            var20_20 = 4;
                                                                                                            if (var18_18 /* !! */  == null) break;
                                                                                                            var21_21 /* !! */  = var18_18 /* !! */ [var20_20];
                                                                                                            var22_22 /* !! */  = 0;
                                                                                                            var9_9 = (int)Intrinsics.areEqual(var21_21 /* !! */ , var22_22 /* !! */ );
                                                                                                            if (var9_9 != 0) break;
                                                                                                            var22_22 /* !! */  = new StringBuilder();
                                                                                                            var21_21 /* !! */  = var4_4.o;
                                                                                                            if (var21_21 /* !! */  == null) break block107;
                                                                                                            var21_21 /* !! */  = var21_21 /* !! */ .P();
                                                                                                            break block108;
                                                                                                        }
                                                                                                        var23_23 = 0;
                                                                                                        var21_21 /* !! */  = null;
                                                                                                    }
                                                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = ": Previous  Campaign ACI value: ";
                                                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = var18_18 /* !! */ [var20_20];
                                                                                                    var22_22 /* !! */ .append(var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = " Selected Campaign :";
                                                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = var15_15.a;
                                                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = " ACI value:";
                                                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = var15_15.b;
                                                                                                    if (var21_21 /* !! */  == null) break block109;
                                                                                                    var21_21 /* !! */  = var21_21 /* !! */ .c;
                                                                                                    break block110;
                                                                                                }
                                                                                                var23_23 = 0;
                                                                                                var21_21 /* !! */  = null;
                                                                                            }
                                                                                            var22_22 /* !! */ .append(var21_21 /* !! */ );
                                                                                            var22_22 /* !! */  = var22_22 /* !! */ .toString();
                                                                                            Intrinsics.checkNotNullParameter(var22_22 /* !! */ , var13_13 /* !! */ );
                                                                                            var22_22 /* !! */  = JioAds.Companion;
                                                                                            var21_21 /* !! */  = var22_22 /* !! */ .getInstance();
                                                                                            var21_21 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                            var21_21 /* !! */  = JioAds$LogLevel.NONE;
                                                                                            var18_18 /* !! */  = var18_18 /* !! */ [var20_20];
                                                                                            var15_15 = var15_15.b;
                                                                                            if (var15_15 == null) break block111;
                                                                                            var15_15 = var15_15.c;
                                                                                            break block112;
                                                                                        }
                                                                                        var16_16 = 0;
                                                                                        var15_15 = null;
                                                                                    }
                                                                                    var16_16 = (int)Intrinsics.areEqual(var18_18 /* !! */ , var15_15);
                                                                                    if (var16_16 == 0) break block100;
                                                                                    var14_14 = new StringBuilder();
                                                                                    var15_15 = var4_4.o;
                                                                                    if (var15_15 != null) {
                                                                                        var15_15 = var15_15.P();
                                                                                    } else {
                                                                                        var16_16 = 0;
                                                                                        var15_15 = null;
                                                                                    }
                                                                                    var18_18 /* !! */  = ": Ignoring: ";
                                                                                    var19_19 = " having same category ";
                                                                                    var10_10 = ko_0.a((StringBuilder)var14_14, (String)var15_15, (String)var18_18 /* !! */ , (String)var10_10, (String)var19_19);
                                                                                    v12.a((String)var10_10, var13_13 /* !! */ , (JioAds$Companion)var22_22 /* !! */ );
                                                                                    var22_22 /* !! */  = JioAds$LogLevel.NONE;
                                                                                }
lbl170:
                                                                                // 6 sources

                                                                                while (true) {
                                                                                    var9_9 = 1;
                                                                                    continue block72;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            var22_22 /* !! */  = new StringBuilder();
                                                                            var21_21 /* !! */  = var4_4.o;
                                                                            if (var21_21 /* !! */  == null) break block113;
                                                                            var21_21 /* !! */  = var21_21 /* !! */ .P();
                                                                            break block114;
                                                                        }
                                                                        var23_23 = 0;
                                                                        var21_21 /* !! */  = null;
                                                                    }
                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                    var21_21 /* !! */  = ": Previous Campaign ACI value:";
                                                                    var22_22 /* !! */ .append((String)var21_21 /* !! */ );
                                                                    Intrinsics.checkNotNull(var18_18 /* !! */ );
                                                                    var18_18 /* !! */  = var18_18 /* !! */ [var20_20];
                                                                    var22_22 /* !! */ .append(var18_18 /* !! */ );
                                                                    var18_18 /* !! */  = " current aci value: ";
                                                                    var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                                    var18_18 /* !! */  = var15_15.b;
                                                                    if (var18_18 /* !! */  == null) break block115;
                                                                    var18_18 /* !! */  = var18_18 /* !! */ .c;
                                                                    break block116;
                                                                }
                                                                var17_17 = 0;
                                                                var18_18 /* !! */  = null;
                                                            }
                                                            var22_22 /* !! */ .append(var18_18 /* !! */ );
                                                            var18_18 /* !! */  = "  CampaignId:";
                                                            var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                            var15_15 = var15_15.a;
                                                            var22_22 /* !! */ .append((String)var15_15);
                                                            var22_22 /* !! */  = var22_22 /* !! */ .toString();
                                                            Intrinsics.checkNotNullParameter(var22_22 /* !! */ , var13_13 /* !! */ );
                                                            var22_22 /* !! */  = JioAds.Companion;
                                                            var22_22 /* !! */  = var22_22 /* !! */ .getInstance();
                                                            var22_22 /* !! */  = var22_22 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            var13_13 /* !! */  = JioAds$LogLevel.NONE;
                                                            break block100;
                                                        }
                                                        var22_22 /* !! */  = new StringBuilder();
                                                        var18_18 /* !! */  = var4_4.o;
                                                        if (var18_18 /* !! */  == null) break block117;
                                                        var18_18 /* !! */  = var18_18 /* !! */ .P();
                                                        break block118;
                                                    }
                                                    var17_17 = 0;
                                                    var18_18 /* !! */  = null;
                                                }
                                                var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                var18_18 /* !! */  = ": first campaign so returning true: ";
                                                var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                var18_18 /* !! */  = var15_15.a;
                                                var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                var18_18 /* !! */  = " aci value: ";
                                                var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                                                var15_15 = var15_15.b;
                                                if (var15_15 == null) break block119;
                                                var15_15 = var15_15.c;
                                                break block120;
                                            }
                                            var16_16 = 0;
                                            var15_15 = null;
                                        }
                                        var22_22 /* !! */ .append(var15_15);
                                        var22_22 /* !! */  = var22_22 /* !! */ .toString();
                                        Intrinsics.checkNotNullParameter(var22_22 /* !! */ , var13_13 /* !! */ );
                                        var22_22 /* !! */  = JioAds.Companion;
                                        var22_22 /* !! */  = var22_22 /* !! */ .getInstance();
                                        var22_22 /* !! */  = var22_22 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var13_13 /* !! */  = JioAds$LogLevel.NONE;
                                        break block100;
                                    }
                                    var22_22 /* !! */  = new StringBuilder();
                                    var18_18 /* !! */  = var4_4.o;
                                    if (var18_18 /* !! */  == null) break block121;
                                    var18_18 /* !! */  = var18_18 /* !! */ .P();
                                    break block122;
                                }
                                var17_17 = 0;
                                var18_18 /* !! */  = null;
                            }
                            var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                            var18_18 /* !! */  = ": Selected Campaign have no ACI value consider this campaign";
                            var22_22 /* !! */ .append((String)var18_18 /* !! */ );
                            var15_15 = var15_15.a;
                            var22_22 /* !! */ .append((String)var15_15);
                            var22_22 /* !! */  = var22_22 /* !! */ .toString();
                            Intrinsics.checkNotNullParameter(var22_22 /* !! */ , var13_13 /* !! */ );
                            var22_22 /* !! */  = JioAds.Companion;
                            var22_22 /* !! */  = var22_22 /* !! */ .getInstance();
                            var22_22 /* !! */  = var22_22 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            try {
                                var13_13 /* !! */  = JioAds$LogLevel.NONE;
                            }
                            catch (Exception v0) {
                                ** continue;
                            }
                        }
lbl316:
                        // 2 sources

                        while (true) {
                            var14_14.add(var10_10);
                            ** GOTO lbl170
                            break;
                        }
                    }
                    var14_14.add(var10_10);
                    ** GOTO lbl170
                }
                var22_22 /* !! */  = new StringBuilder();
                var14_14 = var4_4.o;
                if (var14_14 != null) {
                    var14_14 = var14_14.P();
                } else {
                    var24_24 = false;
                    var14_14 = null;
                }
                var18_18 /* !! */  = ": not selecting campaign id ";
                var19_19 = " because: skipped: ";
                X50.a((StringBuilder)var22_22 /* !! */ , (String)var14_14, (String)var18_18 /* !! */ , (String)var10_10, (String)var19_19);
                var24_24 = var15_15.contains(var10_10);
                var22_22 /* !! */ .append(var24_24);
                var14_14 = ", same as last ";
                var22_22 /* !! */ .append((String)var14_14);
                var12_12 = (int)Intrinsics.areEqual(var10_10, var5_5);
                var22_22 /* !! */ .append((boolean)var12_12);
                Intrinsics.checkNotNullParameter(var22_22 /* !! */ .toString(), var13_13 /* !! */ );
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var22_22 /* !! */  = JioAds$LogLevel.NONE;
                ** while (true)
            }
            var25_25 = var14_14.isEmpty();
            var5_5 = var1_1.e;
            if (var25_25 != 0) {
                var5_5.a(null);
                return;
            }
            var25_25 = var14_14.size();
            if (var25_25 == (var9_9 = 1)) {
                var3_3 /* !! */  = new StringBuilder();
                var4_4 = var4_4.o;
                if (var4_4 != null) {
                    var8_8 = var4_4.P();
                }
                var3_3 /* !! */ .append((String)var8_8);
                var3_3 /* !! */ .append(": Single campaign available in ");
                var4_4 = var1_1.f;
                ir3_0.b((StringBuilder)var3_3 /* !! */ , (String)var4_4, var13_13 /* !! */ );
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_3 /* !! */  = JioAds$LogLevel.NONE;
                var3_3 /* !! */  = (String)var14_14.get(0);
                var2_2 = (f)var2_2.get(var3_3 /* !! */ );
                var5_5.a((f)var2_2);
                return;
            }
            var25_25 = var14_14.size();
            var22_22 /* !! */  = new String[var25_25][];
            var10_10 = null;
            for (var12_12 = 0; var12_12 < var25_25; var12_12 += var23_23) {
                var16_16 = 3;
                var18_18 /* !! */  = new String[var16_16];
                var19_19 = null;
                for (var20_20 = 0; var20_20 < var16_16; var20_20 += var23_23) {
                    var18_18 /* !! */ [var20_20] = var6_6;
                    var23_23 = 1;
                }
                var23_23 = 1;
                var22_22 /* !! */ [var12_12] = var18_18 /* !! */ ;
            }
            var26_26 = var14_14.size();
            var12_12 = 0;
            var10_10 = null;
            var16_16 = 0;
            var15_15 = null;
            while (true) {
                var17_17 = 2;
                if (var12_12 >= var26_26) break;
                var19_19 = var14_14.get(var12_12);
                Intrinsics.checkNotNullExpressionValue(var19_19, "get(...)");
                var21_21 /* !! */  = (f)var2_2.get(var19_19);
                if (var21_21 /* !! */  != null) {
                    var27_27 = var22_22 /* !! */ [var12_12];
                    var27_27[0] = var19_19;
                    var19_19 = var22_22 /* !! */ [var12_12];
                    var8_8 = String.valueOf(var21_21 /* !! */ .c);
                    var28_28 = 1;
                    var19_19[var28_28] = var8_8;
                    var7_7 = var21_21 /* !! */ .c;
                    var8_8 = var22_22 /* !! */ [var12_12];
                    var8_8[var17_17] = var19_19 = String.valueOf(var16_16 += var7_7);
                } else {
                    var28_28 = 1;
                }
                ++var12_12;
                var7_7 = 0;
                var8_8 = null;
            }
            var6_6 = new StringBuilder();
            var4_4 = var4_4.o;
            if (var4_4 != null) {
                var4_4 = var4_4.P();
            } else {
                var29_29 = 0;
                var4_4 = null;
            }
            var6_6.append((String)var4_4);
            var6_6.append(":Campaign Probability array: ");
            var4_4 = qp_1.c((Object[])var22_22 /* !! */ );
            ir3_0.b((StringBuilder)var6_6, (String)var4_4, var13_13 /* !! */ );
            var4_4 = JioAds.Companion;
            var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var6_6 = JioAds$LogLevel.NONE;
            if (var16_16 != 0) {
                var6_6 = new Random();
                var26_26 = var6_6.nextInt(var16_16);
                var10_10 = "Random no for campaign selection: ";
                var8_8 = new StringBuilder((String)var10_10);
                var8_8.append(var26_26);
                var8_8 = var8_8.toString();
                Intrinsics.checkNotNullParameter(var8_8, var13_13 /* !! */ );
                var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var4_4 = null;
                for (var29_29 = 0; var29_29 < var25_25; var29_29 += var7_7) {
                    var8_8 = var22_22 /* !! */ [var29_29];
                    var10_10 = var8_8[var17_17];
                    var12_12 = Integer.parseInt((String)var10_10);
                    if (var26_26 < var12_12) {
                        var8_8 = var8_8[0];
                        break block123;
                    }
                    var7_7 = 1;
                }
            }
            var7_7 = 0;
            var8_8 = null;
        }
        var2_2 = (f)var2_2.get(var8_8);
        var5_5.a((f)var2_2);
        return;
    }
}

