/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 */
package com.jio.jioads.instreamads.vastparser;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.a;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.c;
import com.jio.jioads.instreamads.vastparser.d;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.multiad.f_0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class e
implements f_0 {
    public final /* synthetic */ n a;
    public final /* synthetic */ Context b;

    public e(n n3, Context context) {
        this.a = n3;
        this.b = context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(com.jio.jioads.multiad.model.a object, com.jio.jioads.multiad.model.f object2, String object3) {
        Object object4;
        block21: {
            JioAdView$AdState jioAdView$AdState;
            JioAdView$AdState jioAdView$AdState2;
            JioAdView$AdState jioAdView$AdState3;
            n n3 = this.a;
            boolean bl2 = n3.G;
            Object object5 = n3.c;
            if (bl2) {
                object = new StringBuilder();
                j_0.j(n3, (StringBuilder)object, ": returning from production: onAdSelected");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return;
            }
            object4 = n3.b;
            JioAdView$AdState jioAdView$AdState4 = object4.k0();
            if (jioAdView$AdState4 == (jioAdView$AdState3 = JioAdView$AdState.FAILED) || (jioAdView$AdState2 = object4.k0()) == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) break block21;
            com.jio.jioads.common.c c2 = object5;
            try {
                String string2;
                int n4;
                String string3;
                void var8_49;
                void var3_23;
                int n7;
                String string4;
                int n8;
                block22: {
                    m m2;
                    int n10;
                    block23: {
                        JSONArray jSONArray;
                        void var9_59;
                        String string5;
                        int n14;
                        f f5 = (f)object5;
                        a a2 = f5.i();
                        com.jio.jioads.multiad.model.e e2 = a2.c;
                        n8 = 0;
                        Object var9_57 = null;
                        if (e2 != null) {
                            com.jio.jioads.multiad.model.c c3 = e2.b;
                        } else {
                            n10 = 0;
                            Object var8_48 = null;
                        }
                        string4 = "message";
                        n7 = 1;
                        if (object != null || (n14 = TextUtils.isEmpty((CharSequence)var3_23)) == 0) break block22;
                        if (var8_49 != null) {
                            string5 = var8_49.a;
                        } else {
                            n14 = 0;
                            string5 = null;
                        }
                        n14 = TextUtils.isEmpty((CharSequence)string5);
                        if (n14 != 0) break block23;
                        if (var8_49 != null) {
                            String string6 = var8_49.a;
                        }
                        if ((n8 = TextUtils.isEmpty((CharSequence)var9_59)) != 0 || (jSONArray = n3.A) == null) break block22;
                        Intrinsics.checkNotNull(jSONArray);
                        n8 = jSONArray.length();
                        n14 = n3.B;
                        if (n8 >= n14) break block22;
                    }
                    object = new StringBuilder();
                    String string7 = n3.v();
                    ((StringBuilder)object).append(string7);
                    String string8 = ": onAdSelected on production one";
                    ((StringBuilder)object).append(string8);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, string4);
                    object = JioAds.Companion;
                    JioAds jioAds = ((JioAds$Companion)object).getInstance();
                    jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    int n15 = n3.g;
                    int n16 = -100;
                    if (n15 == n16 && (m2 = n3.E) != null) {
                        Context context = this.b;
                        Integer n17 = object4.B();
                        if (n17 != null) {
                            n10 = n17;
                        } else {
                            n10 = 0;
                            Object var8_51 = null;
                        }
                        d d2 = new d(n3);
                        List list = m2.e(context, n10, d2);
                        if (list != null && (n15 = list.isEmpty() ^ n7) == n7) {
                            object = n3.E;
                            if (object != null) {
                                ((m)object).f = n7;
                            }
                            n3.G();
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    String string9 = n3.v();
                    stringBuilder.append(string9);
                    String string10 = ": onAdSelected on production Backup";
                    stringBuilder.append(string10);
                    String string11 = stringBuilder.toString();
                    Intrinsics.checkNotNullParameter(string11, string4);
                    JioAds jioAds2 = ((JioAds$Companion)object).getInstance();
                    jioAds2.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    String string12 = object4.P();
                    stringBuilder2.append(string12);
                    String string13 = ": Trying to get Backup Ad in getProductionAd";
                    stringBuilder2.append(string13);
                    String string14 = stringBuilder2.toString();
                    Intrinsics.checkNotNullParameter(string14, string4);
                    JioAds jioAds3 = ((JioAds$Companion)object).getInstance();
                    jioAds3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAdView$AD_TYPE jioAdView$AD_TYPE = object4.K();
                    if (jioAdView$AD_TYPE == null) return;
                    com.jio.jioads.common.c c5 = object5;
                    f f6 = (f)object5;
                    o o3 = f6.a;
                    n15 = (int)(o3.g0() ? 1 : 0);
                    if (n15 == 0) {
                        int n18 = n3.i;
                        long l2 = n18;
                        n16 = n3.g;
                        object4 = new c(n3);
                        object5 = (f)object5;
                        ((f)object5).d(l2, n16, (f_0)object4);
                        return;
                    }
                    StringBuilder stringBuilder3 = new StringBuilder();
                    String string15 = object4.P();
                    stringBuilder3.append(string15);
                    String string16 = ": Ignoring backup ad selection inCase of hybrid multi ad.servedAdCount= ";
                    stringBuilder3.append(string16);
                    n16 = n3.t;
                    stringBuilder3.append(n16);
                    String string17 = stringBuilder3.toString();
                    Intrinsics.checkNotNullParameter(string17, string4);
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    int n19 = n3.t;
                    if (n19 > 0) {
                        n3.G();
                        return;
                    }
                    object = JioAdError.Companion;
                    JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object.getClass();
                    object5 = t_0.a(jioAdError$JioAdErrorType);
                    object4 = n3.d;
                    if (object4 == null) return;
                    com.jio.jioads.cdnlogging.d d5 = com.jio.jioads.cdnlogging.d.a;
                    String string18 = "retrieveAndProcessLocalAd";
                    string4 = "JioAdViewController";
                    String string19 = "Ignoring backup ad selection in case of hybrid multi ad";
                    object4.b((JioAdError)object5, d5, string18, string4, string19);
                    return;
                }
                if (var3_23 != null && (n8 = var3_23.equals(string3 = "pgm_add_placeholder")) == n7) {
                    n3.c();
                    return;
                }
                if (var3_23 != null && (n4 = var3_23.equals(string2 = "pgm_load_ad")) == n7) {
                    object5 = (f)object5;
                    object = ((f)object5).a;
                    ((o)object).d();
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                object4 = object4.P();
                stringBuilder.append((String)object4);
                object4 = ": Select Production Ad fom locally saved ad data here";
                stringBuilder.append((String)object4);
                String string20 = stringBuilder.toString();
                Intrinsics.checkNotNullParameter(string20, string4);
                JioAds$Companion jioAds$Companion = JioAds.Companion;
                JioAds jioAds = jioAds$Companion.getInstance();
                jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                n.g(n3, (com.jio.jioads.multiad.model.a)object, (com.jio.jioads.multiad.model.c)var8_49, (com.jio.jioads.multiad.model.f)object2);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        object = new StringBuilder();
        j_0.i((b)object4, (StringBuilder)object, ": JioAdView state is destroyed so returning from getProductionAd() of  JioVastParsingHelper");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

