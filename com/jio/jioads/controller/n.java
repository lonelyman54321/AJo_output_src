/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.controller;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.a;
import com.jio.jioads.common.b;
import com.jio.jioads.common.d;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.m;
import com.jio.jioads.controller.o;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.model.g;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.Constants$ResponseHeaderKeys;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
implements f_0 {
    public final /* synthetic */ o a;

    public n(o o3) {
        this.a = o3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(com.jio.jioads.multiad.model.a a2, com.jio.jioads.multiad.model.f f5, String string2) {
        boolean bl2;
        int n3;
        int n4;
        Object object;
        Object object2;
        String string3;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        block41: {
            block39: {
                block38: {
                    String string4;
                    block40: {
                        block37: {
                            object10 = a2;
                            object9 = f5;
                            object8 = string2;
                            object7 = this.a;
                            object6 = ((o)object7).a.k0();
                            object5 = JioAdView$AdState.DESTROYED;
                            object4 = ((o)object7).a;
                            if (object6 == object5) {
                                com.jio.jioads.audioplayer.b.a((b)object4, ": JioAdView state is destroyed so returning from selectFromAdCache() 2");
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object9 = JioAds$LogLevel.NONE;
                                return;
                            }
                            object6 = "blk";
                            object5 = new JSONObject();
                            object3 = new Object();
                            n7 = 1;
                            if (a2 != null) {
                                try {
                                    string3 = a2.b;
                                    break block37;
                                }
                                catch (Exception exception) {
                                    string3 = null;
                                    break block38;
                                }
                                catch (JSONException jSONException) {
                                    string3 = null;
                                    break block39;
                                }
                            }
                            string3 = null;
                        }
                        string3 = string3 != null ? ((com.jio.jioads.multiad.model.a)object10).b : null;
                        object2 = "adid";
                        if (object10 != null) {
                            try {
                                string4 = ((com.jio.jioads.multiad.model.a)object10).a;
                                break block40;
                            }
                            catch (Exception exception) {
                                break block38;
                            }
                            catch (JSONException jSONException) {
                                break block39;
                            }
                        }
                        string4 = null;
                    }
                    object5.put((String)object2, (Object)string4);
                    object2 = "campaignid";
                    string4 = object9 != null ? object9.a : null;
                    object5.put((String)object2, (Object)string4);
                    object2 = "campaigntype";
                    string4 = object9 != null ? object9.l : null;
                    object5.put((String)object2, (Object)string4);
                    object2 = ((o)object7).t;
                    string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    if (object2 != null) {
                        Object object11 = Constants$ResponseHeaderKeys.JIO_DATA;
                        String string5 = ((Constants$ResponseHeaderKeys)((Object)object11)).getResponseHeader();
                        object = Locale.ROOT;
                        string5 = string5.toLowerCase((Locale)object);
                        Intrinsics.checkNotNullExpressionValue(string5, string4);
                        n4 = object2.containsKey(string5);
                        if (n4 == n7) {
                            object2 = ((o)object7).t;
                            Intrinsics.checkNotNull(object2);
                            object11 = ((Constants$ResponseHeaderKeys)((Object)object11)).getResponseHeader();
                            object = ((String)object11).toLowerCase((Locale)object);
                            Intrinsics.checkNotNullExpressionValue(object, string4);
                            object = object2.get(object);
                            object = (String)object;
                            n4 = TextUtils.isEmpty((CharSequence)object);
                            if (n4 == 0) {
                                Intrinsics.checkNotNull(object);
                                object2 = new JSONObject((String)object);
                                object = object2.optString((String)object6);
                                n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                                if (n4 == 0) {
                                    object5.put((String)object6, object);
                                }
                            }
                        }
                    }
                    object6 = object10 != null ? ((com.jio.jioads.multiad.model.a)object10).e : null;
                    if (object9 != null) {
                        object9 = object9.b;
                    } else {
                        n3 = 0;
                        object9 = null;
                    }
                    object = ((o)object7).s;
                    object = object != null && (object = ((a)object).c) != null ? ((e)object).b : null;
                    ((o)object7).t((com.jio.jioads.multiad.model.b)object6, (g)object9, (c)object, (JSONObject)object5);
                    object9 = Constants$HeaderKeys.JIO_DATA;
                    object9 = ((Constants$HeaderKeys)((Object)object9)).getKey();
                    object6 = Locale.ROOT;
                    object9 = ((String)object9).toLowerCase((Locale)object6);
                    Intrinsics.checkNotNullExpressionValue(object9, string4);
                    object6 = object5.toString();
                    object3.put(object9, object6);
                    ((o)object7).F((Map)object3);
                    object9 = new StringBuilder();
                    object6 = object4.P();
                    ((StringBuilder)object9).append((String)object6);
                    object6 = ": Ad headers for ";
                    ((StringBuilder)object9).append((String)object6);
                    object6 = object4.P();
                    ((StringBuilder)object9).append((String)object6);
                    object6 = ": ";
                    ((StringBuilder)object9).append((String)object6);
                    ((StringBuilder)object9).append(object3);
                    object9 = ((StringBuilder)object9).toString();
                    j.c((String)object9);
                    object9 = new StringBuilder();
                    object6 = object4.P();
                    ((StringBuilder)object9).append((String)object6);
                    object6 = ": Ad Response for ";
                    ((StringBuilder)object9).append((String)object6);
                    object6 = object4.P();
                    ((StringBuilder)object9).append((String)object6);
                    object9 = ((StringBuilder)object9).toString();
                    j.c((String)object9);
                    if (string3 != null) {
                        j.d(string3);
                    }
                    break block41;
                }
                object6 = m.a((b)object4, ": Error inside processMultiAdResponse: ");
                object5 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object5, (Exception)object9, (StringBuilder)object6);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object9 = JioAds$LogLevel.NONE;
                break block41;
            }
            object6 = m.a((b)object4, ": Error inside processMultiAdResponse while making header data: ");
            object5 = Utility.INSTANCE;
            object9 = ((Utility)object5).printStacktrace((Exception)object9);
            ((StringBuilder)object6).append((String)object9);
            object9 = ((StringBuilder)object6).toString();
            object6 = "message";
            Intrinsics.checkNotNullParameter(object9, (String)object6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object9 = JioAds$LogLevel.NONE;
        }
        ((o)object7).l();
        ((o)object7).t = object3;
        object9 = new StringBuilder();
        object6 = object4.P();
        ((StringBuilder)object9).append((String)object6);
        object6 = ": Set HeaderValue for Multi ad ";
        ((StringBuilder)object9).append((String)object6);
        j.a(((StringBuilder)object9).toString());
        ((o)object7).i();
        object9 = ((o)object7).b;
        if (object10 == null) {
            object10 = ((o)object7).s;
            if (object10 != null && (object10 = ((a)object10).c) != null && (object10 = ((e)object10).b) != null) {
                object10 = ((c)object10).a;
            } else {
                bl2 = false;
                object10 = null;
            }
            if (object10 == null) {
                object10 = new StringBuilder();
                object8 = object4.P();
                ((StringBuilder)object10).append((String)object8);
                ((StringBuilder)object10).append(": Ad Not Available");
                j.c(((StringBuilder)object10).toString());
                object10 = JioAdError.Companion;
                object8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object7 = "No Ad In Inventory";
                object5 = j_0.c((t_0)object10, (JioAdError$JioAdErrorType)((Object)object8), (String)object7);
                object3 = com.jio.jioads.cdnlogging.d.a;
                object = o.class.getName();
                object10 = "getName(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object10);
                object6 = object9;
                object6 = (V)object9;
                string3 = "No Valid Ads to Select";
                n4 = 0;
                object2 = null;
                boolean bl3 = false;
                object4 = null;
                String string6 = "processMultiAdResponse";
                ((V)object6).d((JioAdError)object5, false, (com.jio.jioads.cdnlogging.d)((Object)object3), string6, (String)object, string3, null);
                return;
            }
        }
        bl2 = object4.c();
        object6 = null;
        object5 = ((o)object7).Q;
        if (bl2 && !(bl2 = object4.N())) {
            object10 = object4.K();
            if (object10 == (object = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
                long l2;
                long l3;
                long l4;
                long l7;
                if (string3 != null) {
                    object9 = Boolean.FALSE;
                    ((o)object7).y(string3, (Map)object3, (Boolean)object9);
                    return;
                }
                bl2 = ((o)object7).E;
                if (bl2) {
                    bl2 = ((o)object7).o;
                    object8 = null;
                    if (bl2 = ((o)object7).C(null, bl2)) {
                        return;
                    }
                    object10 = ((o)object7).F;
                    bl2 = TextUtils.isEmpty((CharSequence)object10);
                    if (bl2) return;
                    object10 = ((o)object7).F;
                    bl2 = TextUtils.isEmpty((CharSequence)object10);
                    if (!bl2) {
                        ((f)object5).a.C = false;
                        object9 = ((o)object7).r;
                        if (object9 == null) return;
                        object10 = ((o)object7).F;
                        ((d)object9).onAdDataUpdate((String)object10, (Map)object3);
                        return;
                    }
                    object10 = new StringBuilder();
                    com.jio.jioads.jioreel.tracker.model.b.a((b)object4, (StringBuilder)object10, ": pgm No fill and there is no backupads ");
                    object10 = JioAdError.Companion;
                    object8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object10.getClass();
                    object6 = t_0.a((JioAdError$JioAdErrorType)((Object)object8));
                    object4 = com.jio.jioads.cdnlogging.d.a;
                    object7 = object9;
                    object7 = (V)object9;
                    object = "NoFillFromPGM";
                    string3 = null;
                    object5 = null;
                    object3 = "processMultiAdResponse";
                    String string7 = "JioAdViewController";
                    ((V)object7).d((JioAdError)object6, false, (com.jio.jioads.cdnlogging.d)((Object)object4), (String)object3, string7, (String)object, null);
                    return;
                }
                object9 = object4.L();
                if (object9 == (object10 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP) && (n3 = object4.g0()) != 0) {
                    ((o)object7).d();
                    return;
                }
                if (object8 != null && (n3 = object8.equals(object9 = "pgm_load_ad")) == n7 || (n3 = ((o)object7).i0()) != 0) {
                    object9 = new StringBuilder();
                    object10 = object4.P();
                    ((StringBuilder)object9).append((String)object10);
                    object10 = ": Pgm only available";
                    ((StringBuilder)object9).append((String)object10);
                    object9 = ((StringBuilder)object9).toString();
                    j.a((String)object9);
                    ((o)object7).k();
                    return;
                }
                if (object8 == null) return;
                object9 = "pgm_add_placeholder";
                n3 = (int)(object8.equals(object9) ? 1 : 0);
                if (n3 != n7) return;
                object9 = new StringBuilder();
                object10 = object4.P();
                ((StringBuilder)object9).append((String)object10);
                object10 = ": pgm exhausted campaign identified which means only PGM theremake isPGMOnlyConfigured=true";
                ((StringBuilder)object9).append((String)object10);
                object9 = ((StringBuilder)object9).toString();
                j.a((String)object9);
                n3 = (int)(((o)object7).i0() ? 1 : 0);
                if (n3 != 0 && (l7 = (l4 = (l3 = ((o)object7).a0()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0 && (n3 = ((o)object7).Z()) <= 0) {
                    ((o)object7).k();
                    return;
                }
                object9 = ((o)object7).r;
                if (object9 == null) return;
                ((d)object9).onAdDataUpdate((String)object8, (Map)object3);
                return;
            }
            object9 = new StringBuilder();
            object10 = ": pgm ad storing response and headers  of back up or promo locally and use in load ad if pgm not available";
            com.jio.jioads.jioreel.tracker.model.b.a((b)object4, (StringBuilder)object9, (String)object10);
            ((o)object7).F = string3;
            n3 = ((o)object7).h0();
            if (n3 != 0) {
                object4.Z(0);
            } else {
                n3 = ((o)object7).b();
                if (n3 != 0) {
                    object4.Z(n7);
                } else {
                    n3 = (int)(((o)object7).f0() ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 2;
                        object4.Z(n3);
                    }
                }
            }
            object9 = JioAdView$AdState.RECEIVED;
            object4.j((JioAdView$AdState)((Object)object9));
            n3 = (int)(object4.p0() ? 1 : 0);
            if (n3 != 0) {
                object9 = new StringBuilder();
                object10 = object4.P();
                ((StringBuilder)object9).append((String)object10);
                object10 = ": pgm ad refresh called and loadpgm Ad getting called";
                ((StringBuilder)object9).append((String)object10);
                object9 = ((StringBuilder)object9).toString();
                j.a((String)object9);
                ((o)object7).d();
                return;
            }
            ((o)object7).k();
            return;
        }
        object9 = ((o)object7).w;
        if (object9 != null) {
            object9 = new StringBuilder();
            object10 = ": called from multiAd";
            com.jio.jioads.jioreel.tracker.model.b.a((b)object4, (StringBuilder)object9, (String)object10);
            object9 = ((o)object7).w;
            if (object9 == null) return;
            bl2 = ((o)object7).o;
            object9.onVmapResponseReceived(string3, bl2);
            return;
        }
        ((o)object7).h();
        n3 = ((o)object7).A;
        if (n3 != 0 && (n3 = ((Boolean)(object9 = (Boolean)((o)object7).X().a)).booleanValue()) != 0) {
            object9 = "Starting mediationFlow";
            j.c((String)object9);
            ((o)object7).x(string3, (Map)object3);
            return;
        }
        ((f)object5).a.C = false;
        object9 = ((o)object7).r;
        if (object9 == null) return;
        ((d)object9).onAdDataUpdate(string3, (Map)object3);
    }
}

