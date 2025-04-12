/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.CompanionManager$Companion;
import com.jio.jioads.iab.a;
import com.jio.jioads.iab.b;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.data.e;
import com.jio.jioads.jioreel.data.g;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.d;
import com.jio.jioads.jioreel.ssai.i;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public abstract class f {
    public final Context a;
    public final JioReelListener b;
    public Handler c;
    public final ArrayList d;
    public boolean e;
    public final LinkedHashMap f;
    public String g;
    public b h;
    public final HashMap i;

    public f(Context object, JioReelListener jioReelListener) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(jioReelListener, "jioReelListener");
        this.a = object;
        this.b = jioReelListener;
        this.d = object;
        super();
        this.f = object;
        super();
        this.i = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(long var1_1, long var3_2, long var5_3, String var7_4, int var8_5, g var9_6) {
        block99: {
            block96: {
                block98: {
                    block97: {
                        block95: {
                            block94: {
                                block93: {
                                    block92: {
                                        block91: {
                                            block90: {
                                                block89: {
                                                    block88: {
                                                        block87: {
                                                            block86: {
                                                                block85: {
                                                                    block79: {
                                                                        block84: {
                                                                            block83: {
                                                                                block80: {
                                                                                    block82: {
                                                                                        block81: {
                                                                                            var10_7 = this;
                                                                                            var11_8 = var7_4;
                                                                                            var12_9 = var8_5;
                                                                                            var13_10 = var9_6;
                                                                                            var14_11 = "message";
                                                                                            var15_12 /* !! */  = "ad served duration ";
                                                                                            Intrinsics.checkNotNullParameter(var7_4, "adId");
                                                                                            var16_13 = "streamingType";
                                                                                            Intrinsics.checkNotNullParameter((Object)var9_6, var16_13);
                                                                                            this.g = var7_4;
                                                                                            var17_14 = 1000;
                                                                                            var18_15 = var17_14;
                                                                                            var20_16 = var5_3 / var18_15;
                                                                                            var22_17 = (int)var20_16;
                                                                                            var23_18 = var22_17;
                                                                                            var25_19 = (int)(0.25 * var23_18);
                                                                                            var26_20 = 0.5 * var23_18;
                                                                                            var28_21 = (int)var26_20;
                                                                                            var29_22 = 0.75;
                                                                                            var31_23 = (int)(var23_18 *= var29_22);
                                                                                            var32_24 = var3_2 - var1_1;
                                                                                            var32_24 /= var18_15;
                                                                                            var18_15 = var22_17;
                                                                                            var32_24 = var18_15 - var32_24;
                                                                                            var34_25 = (int)var32_24;
                                                                                            var35_26 = new StringBuilder((String)var15_12 /* !! */ );
                                                                                            var35_26.append(var34_25);
                                                                                            var15_12 /* !! */  = " seconds for ad ID ";
                                                                                            var35_26.append((String)var15_12 /* !! */ );
                                                                                            var35_26.append(var7_4);
                                                                                            var15_12 /* !! */  = var35_26.toString();
                                                                                            Intrinsics.checkNotNullParameter(var15_12 /* !! */ , var14_11);
                                                                                            var15_12 /* !! */  = JioAds.Companion;
                                                                                            var15_12 /* !! */  = var15_12 /* !! */ .getInstance();
                                                                                            var15_12 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                            var15_12 /* !! */  = JioAds$LogLevel.NONE;
                                                                                            var36_27 = 1;
                                                                                            var37_28 = 2;
                                                                                            if (var36_27 > var34_25 || var34_25 >= (var36_27 = 3)) break block79;
                                                                                            var15_12 /* !! */  = com.jio.jioads.jioreel.data.g.a;
                                                                                            if (var9_6 == var15_12 /* !! */ ) break block80;
                                                                                            var15_12 /* !! */  = com.jio.jioads.jioreel.data.g.b;
                                                                                            if (var9_6 != var15_12 /* !! */ ) ** GOTO lbl75
                                                                                            var15_12 /* !! */  = p.t;
                                                                                            if (var15_12 /* !! */  == null) break block81;
                                                                                            var15_12 /* !! */  = var15_12 /* !! */ .k;
                                                                                            break block82;
                                                                                        }
                                                                                        var36_27 = 0;
                                                                                        var15_12 /* !! */  = null;
                                                                                    }
                                                                                    var38_29 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                                                                                    if (var15_12 /* !! */  != var38_29 /* !! */ ) ** GOTO lbl75
                                                                                }
                                                                                var10_7.g((String)var11_8);
lbl75:
                                                                                // 3 sources

                                                                                if ((var15_12 /* !! */  = p.t) == null) break block83;
                                                                                var15_12 /* !! */  = var15_12 /* !! */ .k;
                                                                                break block84;
                                                                            }
                                                                            var36_27 = 0;
                                                                            var15_12 /* !! */  = null;
                                                                        }
                                                                        var38_29 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                                                                        if (var15_12 /* !! */  != var38_29 /* !! */ ) break block79;
                                                                        var15_12 /* !! */  = p.t;
                                                                        if (var15_12 /* !! */  == null) ** GOTO lbl92
                                                                        var38_29 /* !! */  = "start";
                                                                        var15_12 /* !! */ .b(var12_9, (String)var38_29 /* !! */ , (String)var11_8);
lbl92:
                                                                        // 2 sources

                                                                        if ((var36_27 = (int)var10_7.e) == 0) ** GOTO lbl101
                                                                        var15_12 /* !! */  = p.t;
                                                                        if (var15_12 /* !! */  == null) ** GOTO lbl101
                                                                        var15_12 /* !! */  = var15_12 /* !! */ .p;
                                                                        if (var15_12 /* !! */  == null) ** GOTO lbl101
                                                                        JioAdsTracker.triggerStart$default((JioAdsTracker)var15_12 /* !! */ , (String)var11_8, null, var37_28, null);
lbl101:
                                                                        // 4 sources

                                                                        if ((var15_12 /* !! */  = var10_7.h) == null) break block79;
                                                                        var15_12 /* !! */  = var15_12 /* !! */ .d();
                                                                        if (var15_12 /* !! */  == null) break block79;
                                                                        var15_12 /* !! */  = com.jio.jioads.iab.a.a;
                                                                        var10_7.b((a)var15_12 /* !! */ , var18_15, (String)var11_8);
                                                                    }
                                                                    if (var34_25 != var25_19) break block87;
                                                                    var15_12 /* !! */  = p.t;
                                                                    if (var15_12 /* !! */  == null) break block85;
                                                                    var15_12 /* !! */  = var15_12 /* !! */ .k;
                                                                    break block86;
                                                                }
                                                                var36_27 = 0;
                                                                var15_12 /* !! */  = null;
                                                            }
                                                            var39_30 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                                                            if (var15_12 /* !! */  != var39_30 /* !! */ ) break block87;
                                                            var15_12 /* !! */  = p.t;
                                                            if (var15_12 /* !! */  == null) ** GOTO lbl130
                                                            var39_30 /* !! */  = "firstQuartile";
                                                            var15_12 /* !! */ .b(var12_9, (String)var39_30 /* !! */ , (String)var11_8);
lbl130:
                                                            // 2 sources

                                                            if ((var36_27 = (int)var10_7.e) == 0) ** GOTO lbl139
                                                            var15_12 /* !! */  = p.t;
                                                            if (var15_12 /* !! */  == null) ** GOTO lbl139
                                                            var15_12 /* !! */  = var15_12 /* !! */ .p;
                                                            if (var15_12 /* !! */  == null) ** GOTO lbl139
                                                            JioAdsTracker.triggerFirst$default((JioAdsTracker)var15_12 /* !! */ , (String)var11_8, null, var37_28, null);
lbl139:
                                                            // 4 sources

                                                            if ((var15_12 /* !! */  = var10_7.h) == null) break block87;
                                                            var15_12 /* !! */  = var15_12 /* !! */ .d();
                                                            if (var15_12 /* !! */  == null) break block87;
                                                            var15_12 /* !! */  = com.jio.jioads.iab.a.b;
                                                            var10_7.b((a)var15_12 /* !! */ , var18_15, (String)var11_8);
                                                        }
                                                        if (var34_25 != var28_21) break block90;
                                                        var15_12 /* !! */  = p.t;
                                                        if (var15_12 /* !! */  == null) break block88;
                                                        var15_12 /* !! */  = var15_12 /* !! */ .k;
                                                        break block89;
                                                    }
                                                    var36_27 = 0;
                                                    var15_12 /* !! */  = null;
                                                }
                                                var39_30 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                                                if (var15_12 /* !! */  != var39_30 /* !! */ ) break block90;
                                                var15_12 /* !! */  = p.t;
                                                if (var15_12 /* !! */  == null) ** GOTO lbl168
                                                var39_30 /* !! */  = "midpoint";
                                                var15_12 /* !! */ .b(var12_9, (String)var39_30 /* !! */ , (String)var11_8);
lbl168:
                                                // 2 sources

                                                if ((var36_27 = (int)var10_7.e) == 0) ** GOTO lbl177
                                                var15_12 /* !! */  = p.t;
                                                if (var15_12 /* !! */  == null) ** GOTO lbl177
                                                var15_12 /* !! */  = var15_12 /* !! */ .p;
                                                if (var15_12 /* !! */  == null) ** GOTO lbl177
                                                JioAdsTracker.triggerMid$default((JioAdsTracker)var15_12 /* !! */ , (String)var11_8, null, var37_28, null);
lbl177:
                                                // 4 sources

                                                if ((var15_12 /* !! */  = var10_7.h) == null) break block90;
                                                var15_12 /* !! */  = var15_12 /* !! */ .d();
                                                if (var15_12 /* !! */  == null) break block90;
                                                var15_12 /* !! */  = com.jio.jioads.iab.a.c;
                                                var10_7.b((a)var15_12 /* !! */ , var18_15, (String)var11_8);
                                            }
                                            if (var34_25 != var31_23) break block93;
                                            var15_12 /* !! */  = p.t;
                                            if (var15_12 /* !! */  == null) break block91;
                                            var15_12 /* !! */  = var15_12 /* !! */ .k;
                                            break block92;
                                        }
                                        var36_27 = 0;
                                        var15_12 /* !! */  = null;
                                    }
                                    var39_30 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                                    if (var15_12 /* !! */  != var39_30 /* !! */ ) break block93;
                                    var15_12 /* !! */  = p.t;
                                    if (var15_12 /* !! */  == null) ** GOTO lbl206
                                    var39_30 /* !! */  = "thirdQuartile";
                                    var15_12 /* !! */ .b(var12_9, (String)var39_30 /* !! */ , (String)var11_8);
lbl206:
                                    // 2 sources

                                    if ((var36_27 = (int)var10_7.e) == 0) ** GOTO lbl215
                                    var15_12 /* !! */  = p.t;
                                    if (var15_12 /* !! */  == null) ** GOTO lbl215
                                    var15_12 /* !! */  = var15_12 /* !! */ .p;
                                    if (var15_12 /* !! */  == null) ** GOTO lbl215
                                    JioAdsTracker.triggerThird$default((JioAdsTracker)var15_12 /* !! */ , (String)var11_8, null, var37_28, null);
lbl215:
                                    // 4 sources

                                    if ((var15_12 /* !! */  = var10_7.h) == null) break block93;
                                    var15_12 /* !! */  = var15_12 /* !! */ .d();
                                    if (var15_12 /* !! */  == null) break block93;
                                    var15_12 /* !! */  = com.jio.jioads.iab.a.d;
                                    var10_7.b((a)var15_12 /* !! */ , var18_15, (String)var11_8);
                                }
                                if (var34_25 != var22_17) break block99;
                                var15_12 /* !! */  = p.t;
                                if (var15_12 /* !! */  == null) break block94;
                                var15_12 /* !! */  = var15_12 /* !! */ .k;
                                break block95;
                            }
                            var36_27 = 0;
                            var15_12 /* !! */  = null;
                        }
                        var39_30 /* !! */  = com.jio.jioads.jioreel.data.e.a;
                        if (var15_12 /* !! */  != var39_30 /* !! */ ) ** GOTO lbl261
                        var15_12 /* !! */  = p.t;
                        if (var15_12 /* !! */  == null) ** GOTO lbl244
                        var40_31 = "complete";
                        var15_12 /* !! */ .b(var12_9, var40_31, (String)var11_8);
lbl244:
                        // 2 sources

                        if ((var12_9 = (int)var10_7.e) == 0) ** GOTO lbl253
                        var41_32 /* !! */  = p.t;
                        if (var41_32 /* !! */  == null) ** GOTO lbl253
                        var41_32 /* !! */  = var41_32 /* !! */ .p;
                        if (var41_32 /* !! */  == null) ** GOTO lbl253
                        JioAdsTracker.triggerCompleted$default((JioAdsTracker)var41_32 /* !! */ , (String)var11_8, null, var37_28, null);
lbl253:
                        // 4 sources

                        if ((var41_32 /* !! */  = var10_7.h) == null) ** GOTO lbl261
                        var41_32 /* !! */  = var41_32 /* !! */ .d();
                        if (var41_32 /* !! */  == null) ** GOTO lbl261
                        var41_32 /* !! */  = com.jio.jioads.iab.a.e;
                        var10_7.b((a)var41_32 /* !! */ , var18_15, (String)var11_8);
lbl261:
                        // 4 sources

                        if (var13_10 == (var41_32 /* !! */  = com.jio.jioads.jioreel.data.g.a)) break block96;
                        var41_32 /* !! */  = com.jio.jioads.jioreel.data.g.b;
                        if (var13_10 != var41_32 /* !! */ ) ** GOTO lbl279
                        var41_32 /* !! */  = p.t;
                        if (var41_32 /* !! */  == null) break block97;
                        var41_32 /* !! */  = var41_32 /* !! */ .k;
                        break block98;
                    }
                    var12_9 = 0;
                    var41_32 /* !! */  = null;
                }
                if (var41_32 /* !! */  != var39_30 /* !! */ ) ** GOTO lbl279
            }
            var10_7.c((String)var11_8);
lbl279:
            // 3 sources

            if ((var41_32 /* !! */  = p.t) == null) ** GOTO lbl290
            var41_32 /* !! */  = var41_32 /* !! */ .i;
            var41_32 /* !! */  = TypeIntrinsics.asMutableMap((Object)var41_32 /* !! */ );
            var41_32 /* !! */ .remove(var11_8);
            var11_8 = Utility.INSTANCE;
            try {
                var11_8.setCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(null);
lbl290:
                // 2 sources

                this.e();
            }
            catch (Exception v0) {
                Intrinsics.checkNotNullParameter("Exception in percentageWatched", var14_11);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var11_8 = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void b(a a2, long l2, String object) {
        block5: {
            char c2;
            Object object2;
            HashMap hashMap;
            block4: {
                hashMap = this.i;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                c2 = ':';
                ((StringBuilder)object2).append(c2);
                ((StringBuilder)object2).append((Object)a2);
                object2 = ((StringBuilder)object2).toString();
                object2 = hashMap.get(object2);
                if (object2 == null) break block4;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(c2);
                ((StringBuilder)object2).append((Object)a2);
                object2 = ((StringBuilder)object2).toString();
                object2 = hashMap.get(object2);
                Boolean bl2 = Boolean.FALSE;
                boolean bl3 = Intrinsics.areEqual(object2, bl2);
                if (!bl3) break block5;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append((Object)a2);
            object = ((StringBuilder)object2).toString();
            object2 = Boolean.TRUE;
            hashMap.put(object, object2);
            object = this.h;
            if (object != null) {
                ((b)object).c(a2, l2);
            }
        }
    }

    public final void c(String object) {
        Object object2;
        boolean bl2;
        Object object3;
        Object object4;
        Object object5 = this.d;
        boolean bl3 = ((ArrayList)object5).contains(object);
        if (bl3 && (object4 = ((LinkedHashMap)(object3 = this.f)).get(object)) != null && (bl2 = Intrinsics.areEqual(object4 = ((LinkedHashMap)object3).get(object), object2 = Boolean.TRUE))) {
            object4 = CompanionManager.Companion;
            object2 = ((CompanionManager$Companion)object4).getInstance();
            if (object2 != null) {
                ((CompanionManager)object2).doCloseCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
            }
            if ((object4 = ((CompanionManager$Companion)object4).getInstance()) != null) {
                ((CompanionManager)object4).removeCompanionCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
            }
            object4 = Boolean.FALSE;
            object3.put(object, object4);
            ((ArrayList)object5).remove(object);
            object3 = "called companion close ";
            object5 = new StringBuilder((String)object3);
            ((StringBuilder)object5).append((String)object);
            object = ((StringBuilder)object5).toString();
            object5 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void d(String string2, int n3, List object) {
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        p p2 = p.t;
        if (p2 != null && (bl2 = Intrinsics.areEqual(object4 = p2.l, object3 = Boolean.TRUE)) && object != null && !(bl2 = object.isEmpty())) {
            object4 = p2.h;
            Intrinsics.checkNotNull(string2);
            boolean bl3 = ((HashMap)object4).containsKey(string2);
            if (!bl3) {
                ((HashMap)object4).put(string2, object3);
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    Object object5;
                    object4 = (String)object.next();
                    object3 = new Object();
                    ((k)object3).p = object5 = p2.a;
                    ((k)object3).a = object4;
                    ((k)object3).b = object4 = p2.f(string2);
                    Intrinsics.checkNotNullParameter(object5, "context");
                    object4 = "common_prefs";
                    Object object6 = "advid";
                    String string3 = "";
                    object4 = j_0.d(object5, (String)object4, 0, string3, (String)object6);
                    object6 = "null cannot be cast to non-null type kotlin.String";
                    try {
                        Intrinsics.checkNotNull(object4, (String)object6);
                        object4 = (String)object4;
                    }
                    catch (Exception exception) {
                        bl2 = false;
                        object4 = null;
                    }
                    ((k)object3).r = object4;
                    object4 = Utility.INSTANCE;
                    object6 = ((Utility)object4).getUidFromPreferences((Context)object5);
                    ((k)object3).s = object6;
                    ((k)object3).t = object6 = p2.r;
                    ((k)object3).e = object6 = Boolean.FALSE;
                    ((k)object3).l = object6 = Integer.valueOf(n3);
                    object5 = object5.getPackageName();
                    ((k)object3).w = object5;
                    object5 = "video";
                    ((k)object3).f = object5;
                    if ((object4 = ((Utility)object4).replaceMacros((k)object3)) == null) continue;
                    object3 = new com.jio.jioads.jioreel.network.b();
                    object5 = new i(string2, (String)object4);
                    int n4 = 8;
                    ((com.jio.jioads.jioreel.network.b)object3).a(n4, (String)object4, (Function1)object5);
                }
            }
        }
        if (string2 != null && (n3 = (int)(this.e ? 1 : 0)) != 0 && (object2 = p.t) != null && (object2 = ((p)object2).p) != null) {
            int n7 = 2;
            JioAdsTracker.triggerImpression$default((JioAdsTracker)object2, string2, null, n7, null);
        }
    }

    public final void e() {
        Object object;
        boolean bl2 = Utility.ifOmSdkIsAvailable();
        if (bl2 && (object = this.h) != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("finishing omid session", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.h;
            if (object != null) {
                ((b)object).e();
            }
            bl2 = false;
            this.h = null;
            object = this.i;
            ((HashMap)object).clear();
        }
    }

    public final void f() {
        Object object;
        Object object2 = this.c;
        if (object2 == null) {
            object = Looper.getMainLooper();
            object2 = new Handler(object);
            this.c = object2;
        }
        if ((object2 = CompanionManager.Companion.getInstance()) != null) {
            object = new d(this);
            ((CompanionManager)object2).setCompanionTrackerReceiver$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((q_0)object);
        }
    }

    public final void g(String object) {
        Object object2;
        boolean bl2;
        LinkedHashMap linkedHashMap;
        Object object3;
        l_0.h("showCompanion for ", object);
        Object object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object5 = JioAds$LogLevel.NONE;
        object5 = this.d;
        boolean bl3 = ((ArrayList)object5).contains(object);
        if (bl3 && ((object3 = (linkedHashMap = this.f).get(object)) == null || (bl2 = Intrinsics.areEqual(object3 = linkedHashMap.get(object), object2 = Boolean.FALSE)))) {
            object2 = "companionVastIds ";
            object3 = new StringBuilder((String)object2);
            ((StringBuilder)object3).append(object5);
            object5 = ((StringBuilder)object3).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object5, (String)object3);
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = CompanionManager.Companion;
            object5 = ((CompanionManager$Companion)object4).getInstance();
            if (object5 != null && (object5 = ((CompanionManager)object5).jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object)) != null) {
                Object object6;
                object5 = ((CompanionManager$Companion)object4).getInstance();
                object2 = null;
                if (object5 != null) {
                    object6 = p.t;
                    object6 = object6 != null ? ((p)object6).f((String)object) : null;
                    Intrinsics.checkNotNull(object6);
                    ((CompanionManager)object5).doShowCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object, (String)object6);
                }
                if ((object5 = p.t) != null) {
                    object6 = "adId";
                    Intrinsics.checkNotNullParameter(object, (String)object6);
                    object4 = ((CompanionManager$Companion)object4).getInstance();
                    object4 = object4 != null ? ((CompanionManager)object4).jioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object) : null;
                    if (object4 != null && (object6 = (List)((Pair)object4).a) != null) {
                        boolean bl4;
                        object6 = object6.iterator();
                        while (bl4 = object6.hasNext()) {
                            boolean bl5;
                            boolean bl6;
                            boolean bl7;
                            Object object7;
                            Iterator<Object> iterator = (JioAdView$JioAdCompanion)object6.next();
                            Object object8 = (Map)((Pair)object4).b;
                            if (object8 != null) {
                                object7 = ((JioAdView$JioAdCompanion)((Object)iterator)).getAdSlotId();
                                object7 = (ArrayList)object8.get(object7);
                            } else {
                                bl7 = false;
                                object7 = null;
                            }
                            if (object7 == null || (bl6 = object7.isEmpty())) {
                                if (object8 != null) {
                                    iterator = ((JioAdView$JioAdCompanion)((Object)iterator)).getDisplaySize().getDynamicSize();
                                    iterator = object8.get(iterator);
                                    object7 = iterator;
                                    object7 = (ArrayList)((Object)iterator);
                                } else {
                                    bl7 = false;
                                    object7 = null;
                                }
                            }
                            if (object7 == null) continue;
                            iterator = object7.iterator();
                            while (bl5 = iterator.hasNext()) {
                                Object object9;
                                Object object10;
                                Object object11;
                                object8 = ((com.jio.jioads.companionads.f)iterator.next()).d;
                                if (object8 == null) continue;
                                object7 = new ArrayList();
                                object8 = object8.iterator();
                                while (bl6 = object8.hasNext()) {
                                    object10 = object11 = object8.next();
                                    object10 = ((com.jio.jioads.instreamads.vastparser.model.i)object11).a;
                                    object9 = "creativeView";
                                    boolean bl8 = true;
                                    boolean bl9 = kotlin.text.b.i(object10, (String)object9, bl8);
                                    if (!bl9) continue;
                                    ((ArrayList)object7).add(object11);
                                }
                                object8 = ((ArrayList)object7).iterator();
                                while (bl7 = object8.hasNext()) {
                                    int n3;
                                    object7 = (com.jio.jioads.instreamads.vastparser.model.i)object8.next();
                                    object11 = new Object();
                                    object10 = ((p)object5).a;
                                    ((k)object11).p = object10;
                                    ((k)object11).a = object7 = ((com.jio.jioads.instreamads.vastparser.model.i)object7).b;
                                    ((k)object11).b = object7 = ((p)object5).f((String)object);
                                    Intrinsics.checkNotNullParameter(object10, "context");
                                    bl7 = false;
                                    object7 = null;
                                    object9 = "common_prefs";
                                    Object object12 = "advid";
                                    String string2 = "";
                                    object9 = j_0.d(object10, (String)object9, 0, string2, (String)object12);
                                    object12 = "null cannot be cast to non-null type kotlin.String";
                                    try {
                                        Intrinsics.checkNotNull(object9, (String)object12);
                                        object9 = (String)object9;
                                    }
                                    catch (Exception exception) {
                                        n3 = 0;
                                        object9 = null;
                                    }
                                    ((k)object11).r = object9;
                                    object9 = Utility.INSTANCE;
                                    object12 = ((Utility)object9).getUidFromPreferences((Context)object10);
                                    ((k)object11).s = object12;
                                    ((k)object11).t = object12 = ((p)object5).r;
                                    ((k)object11).e = object12 = Boolean.FALSE;
                                    ((k)object11).l = object7 = Integer.valueOf(0);
                                    ((k)object11).w = object7 = object10.getPackageName();
                                    ((k)object11).f = "video";
                                    object7 = ((Utility)object9).replaceMacros((k)object11);
                                    object11 = new Object();
                                    object10 = new Object((String)object7);
                                    n3 = 8;
                                    ((com.jio.jioads.jioreel.network.b)object11).a(n3, (String)object7, (Function1)object10);
                                    object7 = p.t;
                                    if (object7 != null) {
                                        object7 = ((p)object7).j;
                                    } else {
                                        bl7 = false;
                                        object7 = null;
                                    }
                                    if (object7 != (object11 = StreamType.VOD)) continue;
                                }
                            }
                        }
                    }
                }
                object4 = Boolean.TRUE;
                linkedHashMap.put(object, object4);
                object5 = "called companion render ";
                object4 = new StringBuilder((String)object5);
                ((StringBuilder)object4).append((String)object);
                Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void h() {
        HashMap hashMap;
        Object object = this.g;
        if (object != null) {
            this.c((String)object);
        }
        if ((object = p.t) != null) {
            hashMap = ((p)object).h;
            hashMap.clear();
            object = ((p)object).g;
            ((HashMap)object).clear();
        }
        this.f.clear();
        object = p.t;
        if (object != null) {
            ((p)object).i.clear();
            object = Utility.INSTANCE;
            hashMap = null;
            ((Utility)object).setCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(null);
        }
    }
}

