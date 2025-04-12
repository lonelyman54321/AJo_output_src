/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.jio.jioads.native.customsuport;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.D;
import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.P;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.a_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.g;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.utils.e;
import com.jio.jioads.utils.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final int a;
    public com.jio.jioads.native.parser.a b;
    public final Context c;
    public Object d;
    public final JioAdView e;
    public final V f;
    public int g;
    public long h;
    public int i;
    public JioAd j;
    public boolean k;
    public final String l;
    public final int m;
    public int n;
    public final a_0 o;
    public final c p;
    public final HashMap q;
    public m r;

    public a(Context context, JioAdView jioAdView, V v4, String string2, a_0 a_02, c c2, Map map2) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdView, "jioAdView");
        Intrinsics.checkNotNullParameter(v4, "jioAdViewListener");
        Intrinsics.checkNotNullParameter(string2, "ccbString");
        Intrinsics.checkNotNullParameter(a_02, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(map2, "headers");
        this.h = -1;
        this.i = 1;
        this.q = hashMap = new HashMap();
        this.c = context;
        this.e = jioAdView;
        this.o = a_02;
        this.p = c2;
        this.f = v4;
        this.l = string2;
        map2 = (HashMap)map2;
        this.q = map2;
    }

    public a(Context context, JioAdView jioAdView, V v4, String string2, Integer n3, int n4, a_0 a_02, c c2, Map map2) {
        int n7;
        HashMap hashMap;
        int n8;
        long l2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdView, "jioAdView");
        Intrinsics.checkNotNullParameter(v4, "jioAdViewListener");
        Intrinsics.checkNotNullParameter(string2, "ccbString");
        Intrinsics.checkNotNullParameter(a_02, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(map2, "headers");
        this.h = l2 = (long)-1;
        this.i = n8 = 1;
        this.q = hashMap = new HashMap();
        this.c = context;
        this.e = jioAdView;
        this.f = v4;
        this.o = a_02;
        this.p = c2;
        int n10 = -1;
        if (n3 != null && (n7 = n3.intValue()) != n10) {
            long l3;
            n7 = n3;
            this.h = l3 = (long)n7;
        }
        if (n3 != null && (n7 = n3.intValue()) != n10) {
            this.a = n10 = n3.intValue();
        }
        this.l = string2;
        this.m = n4;
        map2 = (HashMap)map2;
        this.q = map2;
    }

    public final void a() {
        Object object = this.j;
        Object object2 = this.f;
        Object object3 = this.e;
        int n3 = 1;
        Object object4 = "message";
        if (object != null) {
            int n4;
            int n7;
            this.i = n3;
            object = new StringBuilder();
            object3 = ((JioAdView)object3).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(": onAdDataPrepared callback : isLast:");
            boolean bl2 = this.k;
            ((StringBuilder)object).append(bl2);
            ((StringBuilder)object).append(" adId: ");
            object3 = this.j;
            n3 = 0;
            if (object3 != null) {
                object3 = ((JioAd)object3).getAdId();
            } else {
                bl2 = false;
                object3 = null;
            }
            ir3_0.b((StringBuilder)object, (String)object3, object4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.j;
            bl2 = this.k;
            object2.getClass();
            Object object5 = Looper.getMainLooper();
            object4 = new Handler(object5);
            String string2 = ((V)object2).b;
            object2 = ((V)object2).a;
            object5 = new D(string2, (JioAdView)object2, bl2, (JioAd)object);
            object4.post((Runnable)object5);
            this.j = null;
            long l2 = this.h;
            long l3 = 2;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 > 0 || (n7 = this.n) < (n4 = this.m)) {
                object = this.o;
                n4 = 0;
                object2 = null;
                this.b(false, (b)object);
            }
        } else {
            boolean bl3 = this.k;
            if (bl3) {
                Intrinsics.checkNotNullParameter("Last Ad is already delivered", object4);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.NONE;
                object4 = new StringBuilder();
                String string3 = ": onAllAdExhausted callback";
                j_0.h((JioAdView)object3, (StringBuilder)object4, string3);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2.getClass();
                object3 = Looper.getMainLooper();
                object = new Handler((Looper)object3);
                object4 = ((V)object2).b;
                object2 = ((V)object2).a;
                object3 = new P((JioAdView)object2, (String)object4);
                object.post((Runnable)object3);
                this.k = n3;
            } else {
                Intrinsics.checkNotNullParameter("Ad is not ready yet", object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(boolean var1_1, b var2_2) {
        block57: {
            block49: {
                block50: {
                    block48: {
                        block51: {
                            var3_3 = this;
                            var4_4 = var1_1;
                            var5_5 = 1;
                            var6_6 = "message";
                            Intrinsics.checkNotNullParameter("inside prepareAd()", var6_6);
                            var7_7 = JioAds.Companion;
                            var7_7.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var8_8 = JioAds$LogLevel.NONE;
                            var8_8 = this.d;
                            var9_9 = this.e;
                            var10_10 = this.f;
                            var11_11 /* !! */  = this.q;
                            if (var8_8 == null || !(var12_12 = var8_8 instanceof m)) break block49;
                            var13_13 = "null cannot be cast to non-null type com.jio.jioads.instreamads.vastparser.model.VastModel";
                            Intrinsics.checkNotNull(var8_8, var13_13);
                            var8_8 = ((m)var8_8).c;
                            if (var8_8 == null) break block50;
                            var8_8 = this.d;
                            Intrinsics.checkNotNull(var8_8, var13_13);
                            var8_8 = ((m)var8_8).c;
                            var14_15 = var8_8.size();
                            var15_17 = this.g;
                            if (var14_15 <= var15_17) break block50;
                            var16_19 = "Preparing video ad with duration equals or less than: ";
                            var8_8 = new StringBuilder((String)var16_19);
                            var17_20 = this.h;
                            var8_8.append(var17_20);
                            var19_21 = " s";
                            var8_8.append(var19_21);
                            var8_8 = var8_8.toString();
                            Intrinsics.checkNotNullParameter(var8_8, var6_6);
                            var7_7.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var7_7 = this.d;
                            var14_15 = var7_7 instanceof m;
                            var20_23 = null;
                            if (var14_15 != 0) {
                                var7_7 = (m)var7_7;
                            } else {
                                var21_24 = 0;
                                var7_7 = null;
                            }
                            if (var7_7 != null) {
                                var7_7 = var7_7.c;
                            } else {
                                var21_24 = 0;
                                var7_7 = null;
                            }
                            var8_8 = var3_3.o;
                            var22_25 = var3_3.m;
                            if (var7_7 == null || (var23_26 = var7_7.isEmpty()) != 0) break block51;
                            var23_26 = var3_3.g;
                            var15_17 = var7_7.size();
                            var24_28 = null;
                            var25_30 = null;
                            while (true) {
                                block53: {
                                    block55: {
                                        block52: {
                                            block56: {
                                                block54: {
                                                    if (var23_26 >= var15_17) break block52;
                                                    var3_3.g = var26_32 = var3_3.g + var5_5;
                                                    var27_33 = var7_7.get(var23_26);
                                                    if (var27_33 == null) break block53;
                                                    var27_33 = var3_3.d;
                                                    Intrinsics.checkNotNull(var27_33, var13_13);
                                                    var27_33 = (m)var27_33;
                                                    var28_35 /* !! */  = (j)var7_7.get(var23_26);
                                                    var27_33.getClass();
                                                    var27_33 = com.jio.jioads.instreamads.vastparser.model.m.i(var28_35 /* !! */ );
                                                    var28_35 /* !! */  = var7_7.get(var23_26);
                                                    if (var28_35 /* !! */  == null || var27_33 == null || (var29_36 = var27_33.b) == null || (var30_38 = var29_36.size()) <= 0) break block53;
                                                    var29_36 = var27_33.b;
                                                    var27_33 = var27_33.d;
                                                    var26_32 = j_0.a((String)var27_33);
                                                    var31_39 /* !! */  = new StringBuilder("Checking video with duration ");
                                                    var31_39 /* !! */ .append(var26_32);
                                                    Intrinsics.checkNotNullParameter(var31_39 /* !! */ .toString(), var6_6);
                                                    var32_41 = JioAds.Companion;
                                                    var32_41.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    var31_39 /* !! */  = JioAds$LogLevel.NONE;
                                                    var33_42 = var3_3.a;
                                                    if (var33_42 == 0) break block54;
                                                    var34_43 = var15_17;
                                                    var35_44 = var26_32;
                                                    var37_45 = var32_41;
                                                    var38_46 = var3_3.h;
                                                    cfr_temp_0 = var35_44 - var38_46;
                                                    var40_47 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                    if (var40_47 /* !! */  > 0 && (var22_25 == 0 || (var4_4 = var3_3.n) >= var22_25)) break block55;
                                                    break block56;
                                                }
                                                var37_45 = var32_41;
                                                var34_43 = var15_17;
                                            }
                                            if ((var41_48 /* !! */  = var3_3.p) == null) ** GOTO lbl-1000
                                            var32_41 = (j)var7_7.get(var23_26);
                                            if (var32_41 != null) {
                                                var32_41 = var32_41.h;
                                            } else {
                                                var5_5 = 0;
                                                var32_41 = null;
                                            }
                                            var16_19 = (j)var7_7.get(var23_26);
                                            if (var16_19 != null) {
                                                var16_19 = var16_19.i;
                                            } else {
                                                var15_17 = 0;
                                                var16_19 = null;
                                            }
                                            var41_48 /* !! */  = (f)var41_48 /* !! */ ;
                                            var4_4 = var41_48 /* !! */ .f((String)var32_41, (String)var16_19, var11_11 /* !! */ );
                                            var5_5 = 1;
                                            if (var4_4 == var5_5) {
                                                var4_4 = 1;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_4 = 0;
                                                var41_48 /* !! */  = null;
                                            }
                                            var16_19 = var3_3.c;
                                            var32_41 = new o((Context)var16_19);
                                            var16_19 = var8_8.B();
                                            var15_17 = var16_19.intValue();
                                            var29_36 = (ArrayList)var29_36;
                                            var24_28 = var32_41.c((ArrayList)var29_36, var15_17, (boolean)var4_4);
                                            var25_30 = var41_48 /* !! */  = var7_7.get(var23_26);
                                            var25_30 = (j)var41_48 /* !! */ ;
                                            if (var24_28 == null || var25_30 == null) break block55;
                                            var32_41 = "selected video with duration ";
                                            var41_48 /* !! */  = new StringBuilder((String)var32_41);
                                            var41_48 /* !! */ .append(var26_32);
                                            Intrinsics.checkNotNullParameter(var41_48 /* !! */ .toString(), var6_6);
                                            var41_48 /* !! */  = var37_45.getInstance();
                                            var41_48 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        }
                                        var41_48 /* !! */  = var25_30;
                                        break block48;
                                    }
lbl138:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var34_43 = var15_17;
                                ** continue;
                                var4_4 = 1;
                                var23_26 += var4_4;
                                var4_4 = var1_1;
                                var15_17 = var34_43;
                                var5_5 = 1;
                            }
                        }
                        var4_4 = 0;
                        var41_48 /* !! */  = null;
                        var24_28 = null;
                    }
                    if (var24_28 != null && var41_48 /* !! */  != null) {
                        var7_7 = var3_3.d;
                        Intrinsics.checkNotNull(var7_7, var13_13);
                        var27_33 = var7_7;
                        var27_33 = (m)var7_7;
                        var21_24 = com.jio.jioads.utils.e.a(var11_11 /* !! */ );
                        var33_42 = 5;
                        if (var21_24 != var33_42) {
                            var42_49 = 11;
                            if (var21_24 != var42_49) {
                                var42_49 = 7;
                                if (var21_24 != var42_49) {
                                    var42_49 = 8;
                                    if (var21_24 != var42_49) {
                                        var42_49 = 9;
                                        if (var21_24 != var42_49) {
                                            var43_50 = 0;
                                            var44_51 = null;
                                        } else {
                                            var43_50 = 9;
                                        }
                                    } else {
                                        var43_50 = 8;
                                    }
                                } else {
                                    var43_50 = 7;
                                }
                            } else {
                                var43_50 = 11;
                            }
                        } else {
                            var43_50 = 5;
                        }
                        var21_24 = var3_3.g;
                        var42_49 = 1;
                        var21_24 += var42_49;
                        var16_19 = var41_48 /* !! */ .i;
                        var29_36 = var3_3.e;
                        var13_13 = var3_3.l;
                        var19_21 = var3_3.c;
                        var45_53 = var3_3.p;
                        var11_11 /* !! */  = var32_41;
                        var46_55 = var9_9;
                        var47_56 = var22_25;
                        var48_57 = var29_36;
                        var29_36 = var10_10;
                        var25_30 = var13_13;
                        var13_13 = var24_28;
                        var24_28 = var16_19;
                        var16_19 = var41_48 /* !! */ ;
                        var4_4 = 5;
                        var33_42 = var43_50;
                        var49_59 = var10_10;
                        var44_51 = var25_30;
                        var25_30 = var8_8;
                        var3_3.j = var32_41 = new JioAd((Context)var19_21, (JioAdView)var48_57, (m)var27_33, (com.jio.jioads.controller.a)var10_10, (g)var13_13, (j)var41_48 /* !! */ , var43_50, var21_24, var44_51, (String)var24_28, (b)var8_8, var45_53);
                        var5_5 = var32_41.getAdCategory();
                        var50_60 = 2;
                        if (var5_5 == var4_4) {
                            var38_46 = var3_3.h;
                            cfr_temp_1 = var38_46 - var50_60;
                            var21_24 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var21_24 > 0) {
                                var41_48 /* !! */  = var3_3.j;
                                if (var41_48 /* !! */  != null) {
                                    var41_48 /* !! */  = var41_48 /* !! */ .getVideoAd();
                                } else {
                                    var4_4 = 0;
                                    var41_48 /* !! */  = null;
                                }
                                if (var41_48 /* !! */  != null) {
                                    var41_48 /* !! */  = var3_3.j;
                                    if (var41_48 /* !! */  != null && (var41_48 /* !! */  = var41_48 /* !! */ .getVideoAd()) != null) {
                                        var20_23 = var41_48 /* !! */ .getDuration();
                                    }
                                    if ((var4_4 = (int)TextUtils.isEmpty(var20_23)) == 0) {
                                        var38_46 = var3_3.h;
                                        var7_7 = var3_3.j;
                                        var52_61 = var7_7 != null && (var7_7 = var7_7.getVideoAd()) != null && (var7_7 = var7_7.getDuration()) != null ? Long.parseLong((String)var7_7) : 0L;
                                        var3_3.h = var38_46 -= var52_61;
                                        var32_41 = "Requested Duration Updated To:";
                                        var41_48 /* !! */  = new StringBuilder((String)var32_41);
                                        var54_62 = var3_3.h;
                                        var41_48 /* !! */ .append(var54_62);
                                        Intrinsics.checkNotNullParameter(var41_48 /* !! */ .toString(), var6_6);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var41_48 /* !! */  = JioAds$LogLevel.NONE;
                                    }
                                }
                            }
                            var4_4 = var3_3.n;
                            var5_5 = 1;
                            var3_3.n = var4_4 += var5_5;
                        }
                        if ((var21_24 = (int)((cfr_temp_2 = (var38_46 = var3_3.h) - (var52_61 = (long)-1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) != 0 && (var21_24 = (int)(var38_46 == var50_60 ? 0 : (var38_46 < var50_60 ? -1 : 1))) > 0 && (var4_4 = var3_3.n) != var47_56) {
                            var5_5 = 0;
                            var32_41 = null;
                        } else {
                            var5_5 = 1;
                        }
                        var3_3.k = var5_5;
                    } else {
                        var46_55 = var9_9;
                        var49_59 = var10_10;
                        this.c();
                    }
                    break block57;
                }
                var46_55 = var9_9;
                var49_59 = var10_10;
                this.c();
                break block57;
            }
            var46_55 = var9_9;
            var49_59 = var10_10;
            var4_4 = 5;
            if (var8_8 != null && (var27_34 = var3_3.b) != null && var2_2 != null) {
                Intrinsics.checkNotNull(var27_34);
                var21_24 = com.jio.jioads.utils.e.a(var11_11 /* !! */ );
                if (var21_24 != var4_4) {
                    var14_16 = 11;
                    if (var21_24 != var14_16) {
                        var4_4 = 7;
                        if (var21_24 != var4_4) {
                            var14_16 = 8;
                            if (var21_24 != var14_16) {
                                var4_4 = 9;
                                if (var21_24 != var4_4) {
                                    var23_27 = 0;
                                    var19_22 = null;
                                } else {
                                    var23_27 = 9;
                                }
                            } else {
                                var23_27 = 8;
                            }
                        } else {
                            var23_27 = 7;
                        }
                    } else {
                        var23_27 = 11;
                    }
                } else {
                    var23_27 = 5;
                }
                var13_14 = var23_27;
                var4_4 = var3_3.g;
                var21_24 = 1;
                var15_18 = var4_4 + 1;
                var10_10 = var46_55.getAdId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var41_48 /* !! */  = var3_3.r;
                var48_58 = var3_3.e;
                var31_40 = var3_3.l;
                var19_22 = var3_3.c;
                var7_7 = var3_3.q;
                var8_8 = var3_3.p;
                var11_11 /* !! */  = var32_41;
                var29_37 = var49_59;
                var44_52 = var2_2;
                var24_29 = var41_48 /* !! */ ;
                var25_31 = var7_7;
                var45_54 = var8_8;
                var3_3.j = var32_41 = new JioAd(var19_22, var48_58, var27_34, (com.jio.jioads.controller.a)var49_59, var13_14, var15_18, var31_40, (String)var10_10, var2_2, (m)var41_48 /* !! */ , (HashMap)var7_7, (c)var8_8);
                var4_4 = 1;
                var3_3.k = var4_4;
            }
        }
        var41_48 /* !! */  = new StringBuilder("inside prepareAd() adState: ");
        var32_41 = var46_55.getMAdState();
        var41_48 /* !! */ .append(var32_41);
        var32_41 = " isFirstAd: ";
        var41_48 /* !! */ .append((String)var32_41);
        var5_5 = var1_1;
        var41_48 /* !! */ .append((boolean)var1_1);
        Intrinsics.checkNotNullParameter(var41_48 /* !! */ .toString(), var6_6);
        var41_48 /* !! */  = JioAds.Companion;
        var41_48 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var7_7 = JioAds$LogLevel.NONE;
        var7_7 = var46_55.getMAdState();
        var8_8 = JioAdView$AdState.NOT_REQUESTED;
        if (var7_7 != var8_8) {
            if (var1_1 == 0) {
                var7_7 = "deliver Ad called for ";
                var32_41 = new StringBuilder((String)var7_7);
                var21_24 = var3_3.g;
                var32_41.append(var21_24);
                var32_41 = var32_41.toString();
                Intrinsics.checkNotNullParameter(var32_41, var6_6);
                var41_48 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var41_48 /* !! */  = var49_59;
                var41_48 /* !! */  = var49_59.a;
                var41_48 /* !! */ .loadAd();
            } else {
                var8_8 = "deliver Ad called for firstAd ";
                var7_7 = new StringBuilder((String)var8_8);
                var7_7.append((boolean)var1_1);
                var32_41 = var7_7.toString();
                Intrinsics.checkNotNullParameter(var32_41, var6_6);
                var41_48 /* !! */  = var41_48 /* !! */ .getInstance();
                var41_48 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.a();
            }
        }
    }

    public final void c() {
        int n3 = this.i;
        Object object = this.f;
        if (n3 != 0) {
            this.i = n3 += -1;
            Object object2 = new StringBuilder("Fetching New Set of Ads for ");
            long l2 = this.h;
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(" s / ");
            int n4 = this.m;
            int n7 = this.n;
            ((StringBuilder)object2).append(n4 -= n7);
            object2 = ((StringBuilder)object2).toString();
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            n3 = 0;
            this.g = 0;
            object2 = JioAdView$AdState.NOT_REQUESTED;
            ((V)object).e((JioAdView$AdState)((Object)object2));
            object2 = this.e;
            long l3 = this.h;
            ((JioAdView)object2).loadCustomAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(l3);
        } else {
            object.getClass();
            Object object3 = Looper.getMainLooper();
            Handler handler = new Handler(object3);
            String string3 = ((V)object).b;
            object = ((V)object).a;
            object3 = new P((JioAdView)object, string3);
            handler.post((Runnable)object3);
        }
    }
}

