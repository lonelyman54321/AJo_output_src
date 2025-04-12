/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.o;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.e;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.json.JSONObject;

public final class l
implements NetworkTaskListener {
    public final /* synthetic */ o a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Context c;

    public l(o o3, boolean bl2, Context context) {
        this.a = o3;
        this.b = bl2;
        this.c = context;
    }

    public final void onError(int n3, Object object, Map map2) {
        Object object2;
        b b2;
        Object object3;
        block12: {
            Object object4;
            block11: {
                l l2;
                block9: {
                    Exception exception22;
                    block10: {
                        block8: {
                            l2 = this;
                            object3 = object;
                            int n4 = 1;
                            object4 = this.a;
                            Object object5 = ((o)object4).a.k0();
                            Object object6 = JioAdView$AdState.DESTROYED;
                            b2 = ((o)object4).a;
                            if (object5 == object6) break block11;
                            object5 = "message";
                            boolean c2 = this.b;
                            if (c2) {
                                object6 = new StringBuilder();
                                String string2 = b2.P();
                                ((StringBuilder)object6).append(string2);
                                string2 = ": Error while getting multi ad response so trying backup ad.Error: ";
                                ((StringBuilder)object6).append(string2);
                                ((StringBuilder)object6).append(object);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), (String)object5);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object3 = JioAds$LogLevel.NONE;
                                ((o)object4).A(false);
                            } else {
                                object6 = new StringBuilder();
                                j_0.n(b2, (StringBuilder)object6, ": onError for: ");
                                Object object7 = b2.P();
                                ((StringBuilder)object6).append((String)object7);
                                object6 = ((StringBuilder)object6).toString();
                                Intrinsics.checkNotNullParameter(object6, (String)object5);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object5 = JioAds$LogLevel.NONE;
                                object5 = ((o)object4).m;
                                if (object5 != null) {
                                    ((c)object5).a();
                                }
                                object6 = Looper.getMainLooper();
                                object5 = new Handler((Looper)object6);
                                object6 = new w22_0(object4, n4);
                                object5.post((Runnable)object6);
                                object5 = JioAdError.Companion;
                                object6 = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR;
                                object5.getClass();
                                JioAdError jioAdError = t_0.a((JioAdError$JioAdErrorType)((Object)object6));
                                object6 = "Ad failed to load: ";
                                object5 = new StringBuilder((String)object6);
                                int n7 = n3;
                                ((StringBuilder)object5).append(n3);
                                char c3 = '-';
                                ((StringBuilder)object5).append(c3);
                                ((StringBuilder)object5).append(object3);
                                object3 = ((StringBuilder)object5).toString();
                                jioAdError.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object3);
                                d d2 = d.a;
                                object7 = object3 = ((o)object4).b;
                                object7 = (V)object3;
                                String string3 = "makeAdRequest:onError";
                                String string4 = "JioAdViewController";
                                String string5 = "";
                                ((V)object7).d(jioAdError, false, d2, string3, string4, string5, null);
                            }
                            object3 = ((o)object4).E("adseq");
                            ((o)object4).z((String)object3, n4 != 0);
                            try {
                                object3 = ((o)object4).t;
                                if (object3 == null) break block8;
                            }
                            catch (Exception exception22) {
                                break block10;
                            }
                            int n8 = com.jio.jioads.utils.e.f((Map)object3);
                            object3 = n8;
                            break block9;
                        }
                        boolean bl2 = false;
                        object3 = null;
                        break block9;
                    }
                    object2 = new StringBuilder("Invalid X-Jio-Block number received ");
                    object4 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object4, exception22, (StringBuilder)object2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = 0;
                }
                object2 = N.a;
                object2 = b2.P();
                object4 = l2.c;
                N.f((Context)object4, (String)object2, (Integer)object3);
                break block12;
            }
            object3 = new StringBuilder();
            object2 = ": JioAdView object already destroyed in onerror of adrequest";
            j_0.i(b2, (StringBuilder)object3, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            ((o)object4).M();
        }
        object3 = b2.P();
        object2 = e.c;
        if (object2 != null) {
            object2 = TypeIntrinsics.asMutableCollection(object2);
            object2.remove(object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(String object, Map object2) {
        boolean bl2;
        int n3;
        String string2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        block11: {
            block13: {
                block14: {
                    Exception exception2;
                    block12: {
                        block7: {
                            block8: {
                                block9: {
                                    block10: {
                                        object7 = "success";
                                        object6 = this.a;
                                        object5 = ((o)object6).a.k0();
                                        object4 = JioAdView$AdState.DESTROYED;
                                        object3 = ((o)object6).a;
                                        string2 = null;
                                        if (object5 == object4) break block13;
                                        object5 = ((o)object6).m;
                                        if (object5 != null) {
                                            ((c)object5).a();
                                        }
                                        ((o)object6).v = object;
                                        ((o)object6).t = object2;
                                        ((o)object6).i();
                                        object5 = new StringBuilder();
                                        object4 = object3.P();
                                        ((StringBuilder)object5).append((String)object4);
                                        ((StringBuilder)object5).append(": Ad headers: ");
                                        ((StringBuilder)object5).append(object2);
                                        j.c(((StringBuilder)object5).toString());
                                        object5 = new StringBuilder();
                                        object4 = object3.P();
                                        ((StringBuilder)object5).append((String)object4);
                                        object4 = ": Ad Response: ";
                                        ((StringBuilder)object5).append((String)object4);
                                        object5 = ((StringBuilder)object5).toString();
                                        j.c((String)object5);
                                        boolean bl3 = this.b;
                                        if (!bl3 && object != null) {
                                            j.d((String)object);
                                        }
                                        if (!bl3) break block14;
                                        try {
                                            object5 = object3.P();
                                            bl3 = TextUtils.isEmpty((CharSequence)object5);
                                            if (bl3 || (bl3 = TextUtils.isEmpty((CharSequence)(object5 = ((o)object6).v)))) break block7;
                                            object4 = ((o)object6).v;
                                            Intrinsics.checkNotNull(object4);
                                            object5 = new JSONObject((String)object4);
                                            n3 = (int)(object5.has((String)object7) ? 1 : 0);
                                            if (n3 == 0) break block8;
                                            n3 = (int)(TextUtils.isEmpty((CharSequence)(object7 = object5.optString((String)object7))) ? 1 : 0);
                                            if (n3 != 0 || !(bl2 = Boolean.parseBoolean((String)object7))) break block9;
                                            object7 = "result";
                                            bl2 = object5.has((String)object7);
                                            if (!bl2) break block10;
                                            object7 = "Multi Ad response";
                                            j.a((String)object7);
                                            object7 = Boolean.FALSE;
                                            ((o)object6).y((String)object, (Map)object2, (Boolean)object7);
                                            break block11;
                                        }
                                        catch (Exception exception2) {
                                            break block12;
                                        }
                                    }
                                    object = new StringBuilder();
                                    object2 = object3.P();
                                    ((StringBuilder)object).append((String)object2);
                                    object2 = ": MultiAd is enabled but result node is not available, trying backup ads";
                                    ((StringBuilder)object).append((String)object2);
                                    object = ((StringBuilder)object).toString();
                                    j.a((String)object);
                                    ((o)object6).A(false);
                                    break block11;
                                }
                                object = new StringBuilder();
                                object2 = object3.P();
                                ((StringBuilder)object).append((String)object2);
                                object2 = ": inside isMultiAdEnabled block and status is not success so trying backup ads";
                                ((StringBuilder)object).append((String)object2);
                                object = ((StringBuilder)object).toString();
                                j.a((String)object);
                                ((o)object6).A(false);
                                break block11;
                            }
                            object = new StringBuilder();
                            object2 = object3.P();
                            ((StringBuilder)object).append((String)object2);
                            object2 = ": inside isMultiAdEnabled block and success node unavailable so trying backup ads";
                            ((StringBuilder)object).append((String)object2);
                            object = ((StringBuilder)object).toString();
                            j.a((String)object);
                            ((o)object6).A(false);
                            break block11;
                        }
                        object = new StringBuilder();
                        object2 = object3.P();
                        ((StringBuilder)object).append((String)object2);
                        object2 = ": adResponse is null so trying backup ad from handleResponse()";
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                        j.a((String)object);
                        ((o)object6).A(false);
                        break block11;
                    }
                    object2 = Utility.INSTANCE;
                    ((Utility)object2).printStacktrace(exception2);
                    break block11;
                }
                object7 = Boolean.FALSE;
                ((o)object6).y((String)object, (Map)object2, (Boolean)object7);
                break block11;
            }
            com.jio.jioads.audioplayer.b.a((b)object3, ": JioAdView object already destroyed in onSuccess adrequest");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            ((o)object6).M();
        }
        object = object3.P();
        object2 = e.c;
        if (object2 != null) {
            object2 = TypeIntrinsics.asMutableCollection(object2);
            object2.remove(object);
        }
        if ((object = this.c) == null) return;
        object2 = "multiad_pref";
        object5 = "eads";
        object7 = String.valueOf(j_0.d((Context)object, (String)object2, 0, "", (String)object5));
        bl2 = TextUtils.isEmpty((CharSequence)object7);
        if (bl2) return;
        com.jio.jioads.audioplayer.b.a((b)object3, ": Removing EADS adIds");
        object7 = JioAds.Companion;
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = ((o)object6).N();
        n3 = ((String)object4).length();
        if (n3 <= 0) return;
        object6 = ((o)object6).N();
        object4 = new JSONObject((String)object6);
        object6 = object3.P();
        int n4 = object4.has((String)object6);
        string2 = "message";
        if (n4 != 0) {
            object6 = object3.P();
            object4.remove((String)object6);
            object6 = new StringBuilder();
            j_0.n((b)object3, (StringBuilder)object6, ": After Removing EADS data for adspotId ");
            String string3 = object3.P();
            ((StringBuilder)object6).append(string3);
            string3 = ": ";
            ((StringBuilder)object6).append(string3);
            ((StringBuilder)object6).append(object4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string2);
            object6 = ((JioAds$Companion)object7).getInstance();
            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((n4 = object4.length()) != 0) {
            object6 = new StringBuilder();
            object3 = object3.P();
            ((StringBuilder)object6).append((String)object3);
            object3 = ": Updating Eads preferences: ";
            ((StringBuilder)object6).append((String)object3);
            ((StringBuilder)object6).append(object4);
            object6 = ((StringBuilder)object6).toString();
            Intrinsics.checkNotNullParameter(object6, string2);
            object7 = ((JioAds$Companion)object7).getInstance();
            ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = j_0.o((Context)object, (String)object2).edit();
            object2 = object4.toString();
            object = object.putString((String)object5, (String)object2);
            object.apply();
            return;
        }
        object6 = new StringBuilder();
        object4 = ": Clearing Eads preferences";
        j_0.i((b)object3, (StringBuilder)object6, (String)object4);
        object7 = ((JioAds$Companion)object7).getInstance();
        ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        j_0.f((Context)object, (String)object2, (String)object5);
    }
}

