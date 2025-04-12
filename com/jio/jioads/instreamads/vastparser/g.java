/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.instreamads.vastparser;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.h;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.instreamads.wrapper.a;
import com.jio.jioads.util.Utility;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class g
implements a {
    public final /* synthetic */ n a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;
    public final /* synthetic */ m d;

    public g(n n3, j j3, int n4, m m2) {
        this.a = n3;
        this.b = j3;
        this.c = n4;
        this.d = m2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(m var1_1) {
        block41: {
            var2_2 = this;
            var3_3 /* !! */  = var1_1;
            var4_4 = 1;
            Intrinsics.checkNotNullParameter(var1_1, "wrapperVastModel");
            var5_5 = this.a;
            var6_6 = var5_5.G;
            var7_7 = var5_5.b;
            if (var6_6) {
                com.jio.jioads.audioplayer.b.a((b)var7_7, ": returning from onRedirectionFinish");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_3 /* !! */  = JioAds$LogLevel.NONE;
                return;
            }
            var6_6 = false;
            var5_5.x = 0;
            var8_8 = new StringBuilder();
            var9_9 /* !! */  = var5_5.v();
            var8_8.append(var9_9 /* !! */ );
            var8_8.append(": onRedirectionFinish for ");
            var9_9 /* !! */  = this.b.h;
            var10_10 = "message";
            ir3_0.b((StringBuilder)var8_8, var9_9 /* !! */ , var10_10);
            var8_8 = JioAds.Companion;
            var8_8.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_9 /* !! */  = JioAds$LogLevel.NONE;
            var9_9 /* !! */  = new StringBuilder();
            var11_11 = ": wrapper redirection finished storing all wrapper and inline ads";
            j_0.j(var5_5, (StringBuilder)var9_9 /* !! */ , var11_11);
            var8_8.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var8_8 = var5_5.c;
            var9_9 /* !! */  = var8_8;
            var9_9 /* !! */  = ((f)var8_8).a;
            var12_12 = var9_9 /* !! */ .o;
            var13_13 = this.c;
            var12_12 = var12_12 != 0 ? -1 : var13_13;
            var14_14 = var3_3 /* !! */ .c;
            var15_15 = var14_14.isEmpty();
            if (var15_15) break block41;
            var14_14 = var3_3 /* !! */ .c.iterator();
            block0: while ((var16_16 = var14_14.hasNext()) != 0) {
                block44: {
                    block43: {
                        block42: {
                            var17_17 = (j)var14_14.next();
                            if (var17_17 == null) continue;
                            if (var12_12 >= 0 && var12_12 < (var19_19 = (var18_18 = var5_5.E) != null && (var18_18 = var18_18.c) != null ? var18_18.size() : -1)) {
                                var18_18 = var5_5.E;
                                if (var18_18 != null && (var18_18 = var18_18.c) != null) {
                                    var18_18.add(var12_12, var17_17);
                                }
                                var12_12 += var4_4;
                            } else {
                                var18_18 = var5_5.E;
                                if (var18_18 != null && (var18_18 = var18_18.c) != null) {
                                    var18_18.add(var17_17);
                                }
                            }
                            var18_18 = var17_17.m;
                            if (var18_18 == null) break block42;
                            var18_18 = var18_18.i;
                            if (var18_18 != null && (var19_19 = var18_18.isEmpty() ^ var4_4) == var4_4) {
                                var18_18 = var17_17.m;
                                if (var18_18 != null && (var18_18 = var18_18.i) != null) {
                                    var18_18 = (c)CollectionsKt.N(0, (List)var18_18);
                                } else {
                                    var19_19 = 0;
                                    var18_18 = null;
                                }
                                if (var18_18 != null && (var18_18 = var17_17.h) != null && (var18_18 = var17_17.m) != null && (var18_18 = var18_18.i) != null && (var18_18 = (c)var18_18.get(0)) != null && (var18_18 = var18_18.c) != null && (var18_18 = var18_18.f) != null) {
                                    var20_20 = var5_5.B().v;
                                    var17_17 = var17_17.h;
                                    Intrinsics.checkNotNull(var17_17);
                                    var17_17 = (AdMetaData$AdParams)var20_20.put(var17_17, var18_18);
                                }
                            }
                            break block43;
                        }
                        var19_19 = (int)var3_3 /* !! */ .d;
                        if (var19_19 != 0) {
                            var5_5.v = var17_17;
                            var18_18 = var17_17.n;
                            if (var18_18 != null) {
                                var18_18.k = var4_4;
                            }
                        }
                        if ((var18_18 = var17_17.p) == null || (var19_19 = var18_18.length()) == 0 || (var19_19 = (int)(var18_18 = var5_5.B().v).containsKey(var20_20 = var17_17.p)) == 0) ** GOTO lbl-1000
                        var18_18 = var5_5.B().v;
                        var20_20 = var17_17.p;
                        if ((var18_18 = var18_18.get(var20_20)) != null) {
                            var18_18 = var5_5.B().v;
                            var20_20 = var17_17.h;
                            Intrinsics.checkNotNull(var20_20);
                            var21_21 = var5_5.B().v;
                            var22_22 = var17_17.p;
                            var22_22 = var21_21.get(var22_22);
                            Intrinsics.checkNotNull(var22_22);
                            var18_18.put(var20_20, var22_22);
                        } else if ((var22_22 = var17_17.n) != null && (var22_22 = var22_22.g) != null && (var23_23 = var22_22.isEmpty() ^ var4_4) == var4_4) {
                            var22_22 = var17_17.n;
                            if (var22_22 != null && (var22_22 = var22_22.g) != null && (var22_22 = (c)CollectionsKt.N(0, (List)var22_22)) != null && (var22_22 = var22_22.c) != null) {
                                var22_22 = var22_22.f;
                            } else {
                                var23_23 = 0;
                                var22_22 = null;
                            }
                            if (var22_22 != null) {
                                var22_22 = var5_5.B().v;
                                var21_21 = var17_17.h;
                                Intrinsics.checkNotNull(var21_21);
                                var18_18 = var17_17.n;
                                if (var18_18 != null && (var18_18 = var18_18.g) != null && (var18_18 = (c)var18_18.get(0)) != null && (var18_18 = var18_18.c) != null) {
                                    var18_18 = var18_18.f;
                                } else {
                                    var19_19 = 0;
                                    var18_18 = null;
                                }
                                Intrinsics.checkNotNull(var18_18);
                                var22_22.put(var21_21, var18_18);
                            }
                        }
                        var22_22 = var17_17.p;
                        if (var22_22 != null && (var23_23 = (int)(var21_21 = var5_5.C).containsKey(var22_22)) != 0) {
                            var22_22 = var17_17.p;
                            var17_17.k = var22_22 = (Integer)var21_21.get(var22_22);
                        }
                        if ((var23_23 = (int)var7_7.f0()) != 0) break block43;
                        var22_22 = var5_5.E;
                        if (var22_22 != null) {
                            var22_22 = m.i((j)var17_17);
                        } else {
                            var23_23 = 0;
                            var22_22 = null;
                        }
                        var21_21 = var17_17.n;
                        if (var21_21 == null || (var24_24 = var21_21.k) != 0) break block43;
                        if (var22_22 != null) {
                            var21_21 = var22_22.d;
                        } else {
                            var24_24 = 0;
                            var21_21 = null;
                        }
                        if (var21_21 != null && (var24_24 = var21_21.length()) != 0) break block44;
                    }
lbl134:
                    // 3 sources

                    while (true) {
                        var23_23 = -1;
                        continue block0;
                        break;
                    }
                }
                var21_21 = var8_8;
                var21_21 = ((f)var8_8).a;
                var24_24 = (int)var21_21.o;
                if (var24_24 == 0) ** GOTO lbl134
                if (var22_22 != null) {
                    var22_22 = var22_22.d;
                } else {
                    var23_23 = 0;
                    var22_22 = null;
                }
                var23_23 = j_0.a((String)var22_22);
                var5_5.u = var24_24 = var5_5.u + var23_23;
                var5_5.t = var24_24 = var5_5.t + var4_4;
                var21_21 = new StringBuilder();
                var17_17 = var5_5.v();
                var21_21.append((String)var17_17);
                var21_21.append(": currAdDuration: ");
                var21_21.append(var23_23);
                var21_21.append(" currAdCount: ");
                w12_0.b(var5_5.t, var10_10, (StringBuilder)var21_21);
                var21_21 = JioAds.Companion;
                var21_21.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var17_17 = JioAds$LogLevel.NONE;
                var16_16 = var5_5.i;
                if (var16_16 > 0 && var23_23 > 0) {
                    var5_5.i = var16_16 -= var23_23;
                    var17_17 = new StringBuilder();
                    var18_18 = var5_5.v();
                    var17_17.append((String)var18_18);
                    var18_18 = ": leftover duration: ";
                    var17_17.append((String)var18_18);
                    var19_19 = var5_5.i;
                    var17_17.append(var19_19);
                    Intrinsics.checkNotNullParameter(var17_17.toString(), var10_10);
                    var17_17 = var21_21.getInstance();
                    var17_17.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var16_16 = var5_5.i;
                    var19_19 = var5_5.m;
                    if (var16_16 <= var19_19) {
                        var5_5.s = var4_4;
                        break;
                    }
                }
                if ((var16_16 = var5_5.g) != (var19_19 = -100) && var16_16 > 0 && var23_23 > 0) ** break;
                ** continue;
                var23_23 = -1;
                var5_5.g = var16_16 += var23_23;
                var17_17 = com.jio.jioads.controller.m.a((b)var7_7, ": leftover ad count: ");
                var19_19 = var5_5.g;
                var17_17.append(var19_19);
                var17_17 = var17_17.toString();
                Intrinsics.checkNotNullParameter(var17_17, var10_10);
                var21_21 = var21_21.getInstance();
                var21_21.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var24_24 = var5_5.g;
                if (var24_24 != 0 || (var24_24 = var5_5.i) > 0) continue;
                var5_5.s = var4_4;
                break;
            }
        }
        var23_23 = var3_3 /* !! */ .d;
        if (var23_23 != 0 || (var22_22 = var5_5.E) != null && (var23_23 = var22_22.d) == var4_4) {
            var22_22 = var5_5.E;
            if (var22_22 != null) {
                var22_22.d = var4_4;
            }
            var22_22 = var3_3 /* !! */ .c;
            if (var22_22 != null && (var22_22 = CollectionsKt.e0((Iterable)var22_22, (Comparator)(var8_8 = new com.jio.jioads.instreamads.vastparser.m((h)(var7_7 = new h(var5_5)))))) != null) {
                var21_21 = CollectionsKt.m0((Collection)var22_22);
            } else {
                var24_24 = 0;
                var21_21 = null;
            }
            if (var21_21 == null) {
                var21_21 = var3_3 /* !! */ .c;
            }
            var22_22 = "<set-?>";
            Intrinsics.checkNotNullParameter(var21_21, (String)var22_22);
            var3_3 /* !! */ .c = var21_21;
        }
        var3_3 /* !! */  = new StringBuilder();
        var22_22 = ": wrapper ads moved into current model";
        j_0.j(var5_5, (StringBuilder)var3_3 /* !! */ , (String)var22_22);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var3_3 /* !! */  = JioAds$LogLevel.NONE;
        var25_25 = var5_5.s;
        if (!var25_25) {
            var3_3 /* !! */  = var2_2.d;
            var5_5.f(var13_13 += var4_4, var3_3 /* !! */ );
        } else {
            var5_5.n(false);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(m object, j object2, com.jio.jioads.instreamads.wrapper.b object3) {
        Intrinsics.checkNotNullParameter(object3, "error");
        n n3 = this.a;
        int n4 = n3.G;
        if (n4 != 0) {
            object = new StringBuilder();
            j_0.i(n3.b, (StringBuilder)object, ": returning from onRedirectionFinish");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object4 = new StringBuilder();
        String string2 = n3.v();
        ((StringBuilder)object4).append(string2);
        ((StringBuilder)object4).append(": onRedirectionError for ");
        string2 = this.b.h;
        ((StringBuilder)object4).append(string2);
        com.jio.jioads.util.j.a(((StringBuilder)object4).toString());
        object4 = new StringBuilder();
        string2 = n3.v();
        ((StringBuilder)object4).append(string2);
        string2 = ": onRedirectionError error: ";
        ((StringBuilder)object4).append(string2);
        ((StringBuilder)object4).append(object3);
        object4 = ((StringBuilder)object4).toString();
        com.jio.jioads.util.j.a((String)object4);
        n4 = n3.x;
        int n7 = 1;
        n3.x = n4 += n7;
        n4 = this.c + n7;
        m m2 = this.d;
        Object object5 = m2.c;
        int n8 = object5.size();
        Object object6 = ": retry limit reaching ";
        Object object7 = null;
        if (n4 < n8) {
            boolean bl2 = n3.F();
            if (bl2) {
                object = new StringBuilder();
                object2 = n3.v();
                ((StringBuilder)object).append((String)object2);
                object2 = ": retry limit reached!!";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                com.jio.jioads.util.j.a((String)object);
                n3.s = n7;
                n3.n(false);
                return;
            }
            object = new StringBuilder();
            object2 = n3.v();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append((String)object6);
            int n10 = n3.x;
            ((StringBuilder)object).append(n10);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = new StringBuilder();
            object2 = n3.v();
            ((StringBuilder)object).append((String)object2);
            object2 = ": processing next ad in queue";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            n3.f(n4, m2);
            return;
        }
        n4 = (int)(n3.F() ? 1 : 0);
        if (n4 != 0) {
            object = new StringBuilder();
            object2 = n3.v();
            ((StringBuilder)object).append((String)object2);
            object2 = ": retry limit reached!";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            n3.s = n7;
            n3.n(false);
            return;
        }
        object4 = new StringBuilder();
        String string3 = n3.v();
        ((StringBuilder)object4).append(string3);
        ((StringBuilder)object4).append((String)object6);
        int n14 = n3.x;
        ((StringBuilder)object4).append(n14);
        com.jio.jioads.util.j.a(((StringBuilder)object4).toString());
        object4 = new StringBuilder();
        j_0.j(n3, (StringBuilder)object4, ": handleRedirectionError");
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        int n15 = ((Enum)object3).ordinal();
        if (n15 != 0 && n15 != n7 && n15 != (n14 = 2)) {
            int n16;
            n8 = 3;
            if (n15 != n8 && n15 != (n8 = 4)) {
                return;
            }
            n15 = 0;
            Object var3_4 = null;
            if (object != null) {
                void var3_6;
                if (object2 != null) {
                    object4 = ((j)object2).h;
                } else {
                    n4 = 0;
                    object4 = null;
                }
                if (object2 != null && (object2 = ((j)object2).m) != null) {
                    String string4 = ((q)object2).e;
                }
                n3.p((m)object, (String)object4, (String)var3_6);
                return;
            }
            object = n3.E;
            object5 = "Invalid request URL: 0-error in success response";
            if (object != null && (n16 = ((m)object).d) == n7 && (n16 = (int)(TextUtils.isEmpty((CharSequence)(object = n3.v())) ? 1 : 0)) == 0) {
                object = (f)n3.c;
                object6 = ((f)object).a;
                boolean bl3 = ((o)object6).o;
                if (bl3) {
                    void var3_8;
                    boolean bl4 = ((o)object6).D;
                    if (bl4) {
                        object6 = new StringBuilder();
                        object7 = ": PGM ad empty";
                        j_0.j(n3, (StringBuilder)object6, (String)object7);
                        object6 = ((JioAds$Companion)object4).getInstance();
                        ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = ((f)object).a;
                        ((o)object).E = n7;
                    }
                    object = new StringBuilder();
                    object6 = n3.v();
                    ((StringBuilder)object).append((String)object6);
                    object6 = ": error while trying wrapper ";
                    ((StringBuilder)object).append((String)object6);
                    if (object2 != null) {
                        String string5 = ((j)object2).h;
                    }
                    object2 = ", trying next in list if available";
                    d_0.a((StringBuilder)object, (String)var3_8, (String)object2, (JioAds$Companion)object4);
                    n16 = n3.w;
                    if (n16 < n14) {
                        n3.w = n16 += n7;
                        object = n3.v();
                        object2 = Utility.INSTANCE;
                        String string6 = n3.v();
                        ((Utility)object2).getCcbValue(string6);
                        n3.s((String)object);
                        return;
                    }
                    object = JioAdError.Companion;
                    object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object7 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), (String)object5);
                    object6 = n3.d;
                    if (object6 == null) return;
                    d d2 = com.jio.jioads.cdnlogging.d.a;
                    String string7 = "fallback attempts exceeded while trying wrapper ads";
                    String string8 = "downloadRedirectAd.onError";
                    String string9 = "JioVastParsingHelper";
                    object6.b((JioAdError)object7, d2, string8, string9, string7);
                    return;
                }
            }
            if ((object = n3.E) != null && (object = ((m)object).c) != null && (n16 = object.isEmpty() ^ n7) == n7) {
                void var3_11;
                object = new StringBuilder();
                string2 = n3.v();
                ((StringBuilder)object).append(string2);
                string2 = ": wrapper with id ";
                ((StringBuilder)object).append(string2);
                if (object2 != null) {
                    String string10 = ((j)object2).h;
                }
                object2 = " failed, trying next in list if available";
                d_0.a((StringBuilder)object, (String)var3_11, (String)object2, (JioAds$Companion)object4);
                n3.n(false);
                return;
            }
            object = JioAdError.Companion;
            object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object7 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), (String)object5);
            object6 = n3.d;
            if (object6 == null) return;
            d d5 = com.jio.jioads.cdnlogging.d.a;
            String string11 = "wrapper response is empty";
            String string12 = "downloadRedirectAd.onSucess.else ";
            String string13 = "JioVastParsingHelper";
            object6.b((JioAdError)object7, d5, string12, string13, string11);
            return;
        }
        n3.n(false);
    }
}

