/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.controller;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsLoader;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.a;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.d;
import com.jio.jioads.controller.JioAdRequestGenerator;
import com.jio.jioads.controller.o;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.t;
import com.jio.jioads.util.j;
import com.jioads.mediation.JioMediationSelector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements c {
    public final /* synthetic */ o a;

    public f(o o3) {
        this.a = o3;
    }

    public final String a(String string2) {
        Intrinsics.checkNotNull(string2);
        string2 = this.a.E(string2);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final Pair b() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = this.a;
        Object object6 = object5.a.b();
        HashMap hashMap = null;
        if (object6 != null) {
            object4 = new StringBuilder();
            object3 = null;
            object2 = object6[0];
            object4.append((int)object2);
            object4.append('x');
            object2 = true;
            Object object7 = object6[object2];
            object4.append((int)object7);
            object = object6 = object4.toString();
        } else {
            object = null;
        }
        object6 = object5.a;
        object4 = object6.k0();
        object3 = JioAdView$AdState.DESTROYED;
        Object object8 = "";
        String string2 = "destroyed";
        if (object4 == object3) {
            object5 = new String[]{string2};
            object6 = new Pair(object8, object5);
        } else {
            object4 = object6.Y();
            if (object4 == null) {
                object5 = new String[]{string2};
                object6 = new Pair(object8, object5);
            } else {
                object3 = new JioAdRequestGenerator((Context)object4);
                boolean bl2 = object5.o;
                String string3 = object5.n;
                Object object9 = object6.P();
                object8 = object6.R();
                if (object8 != null) {
                    hashMap = ((JioAdsMetadata)object8).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object4);
                }
                JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE = object6.H();
                String string4 = object5.U();
                JioAdView$AD_TYPE jioAdView$AD_TYPE = object6.K();
                List list = object6.a();
                Integer n3 = object6.q();
                Integer n4 = object6.J();
                Integer n7 = object6.b0();
                Integer n8 = object5.R();
                String string5 = object5.N();
                String string6 = object5.W();
                boolean bl3 = object6.v();
                object5 = object5.x;
                String string7 = object6.m0();
                String string8 = object6.G();
                boolean bl4 = true;
                object8 = null;
                object4 = object3;
                object2 = bl2;
                string2 = string3;
                string3 = object9;
                object9 = hashMap;
                object6 = ((JioAdRequestGenerator)object3).getAdRequestData(bl2, null, string2, string3, hashMap, jioAdView$ORIENTATION_TYPE, string4, jioAdView$AD_TYPE, list, n3, n4, n7, (String)object, n8, string5, string6, bl3, (JioAdsLoader)object5, bl4, string7, string8);
            }
        }
        return object6;
    }

    public final void c(int n3, String objectArray, String object, String string2, String string3) {
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        ArrayList<String> arrayList = "adspotId";
        Intrinsics.checkNotNullParameter(objectArray, (String)((Object)arrayList));
        Object[] objectArray2 = "campaignId";
        Intrinsics.checkNotNullParameter(object, (String)objectArray2);
        String string4 = "selectedAdKey";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "campaignType";
        Intrinsics.checkNotNullParameter(string3, string5);
        t t3 = this.a.f;
        if (t3 != null) {
            Intrinsics.checkNotNullParameter(objectArray, (String)((Object)arrayList));
            Intrinsics.checkNotNullParameter(object, (String)objectArray2);
            Intrinsics.checkNotNullParameter(string2, string4);
            Intrinsics.checkNotNullParameter(string3, string5);
            arrayList = t3.a();
            boolean bl2 = ((HashMap)((Object)arrayList)).containsKey(objectArray);
            if (bl2) {
                arrayList = t3.a();
                objectArray = ((HashMap)((Object)arrayList)).get(objectArray);
                Intrinsics.checkNotNull(objectArray);
                objectArray = objectArray;
                objectArray[0] = object;
                objectArray[n10] = string2;
                object = objectArray[n8];
                String string6 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }";
                Intrinsics.checkNotNull(object, string6);
                object = (ArrayList)object;
                ((ArrayList)object).add(string2);
                objectArray[n7] = string3;
                Integer n14 = n3;
                objectArray[n4] = n14;
            } else {
                arrayList = new ArrayList<String>();
                arrayList.add(string2);
                Serializable serializable = Integer.valueOf(n3);
                int n15 = 5;
                objectArray2 = new Object[n15];
                objectArray2[0] = object;
                objectArray2[n10] = string2;
                objectArray2[n8] = arrayList;
                objectArray2[n7] = string3;
                objectArray2[n4] = serializable;
                serializable = t3.a();
                serializable.put(objectArray, objectArray2);
            }
        }
    }

    public final void d(long l2, int n3, f_0 f_02) {
        Object object = f_02;
        Intrinsics.checkNotNullParameter(f_02, "multiAdResponse");
        Object object2 = this.a;
        boolean bl2 = ((o)object2).g0();
        if (bl2) {
            Intrinsics.checkNotNullParameter("Ignoring backup ad selection incase of hybrid multi ad", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object3 = JioAds$LogLevel.NONE;
            object3 = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
            String string2 = "No ad in Inventory";
            object = j_0.c((t_0)object3, jioAdError$JioAdErrorType, string2);
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            Object object4 = object2 = ((o)object2).b;
            object4 = (V)object2;
            String string3 = "selectFromAdCache";
            String string4 = "JioAdViewController";
            boolean bl3 = false;
            String string5 = "Ignoring backup ad selection incase of hybrid multi ad";
            ((V)object4).d((JioAdError)object, false, d2, string3, string4, string5, null);
        } else {
            a a2 = ((o)object2).S();
            t t3 = ((o)object2).f;
            if (t3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiAdUtility");
                t3 = null;
            }
            boolean bl4 = ((o)object2).E;
            object2 = t3;
            object = f_02;
            t3.b(a2, l2, n3, f_02, bl4);
        }
    }

    public final void e(JioMediationSelector jioMediationSelector) {
        Intrinsics.checkNotNullParameter(jioMediationSelector, "value");
        this.a.p = jioMediationSelector;
    }

    public final boolean f(String string2, String string3, Map map2) {
        Intrinsics.checkNotNullParameter(map2, "headers");
        return o.G(this.a, string2, string3, map2);
    }

    public final void g() {
        this.a.O(null);
    }

    public final void h(String object) {
        boolean bl2;
        Object object2 = this.a;
        ((o)object2).A = false;
        ((o)object2).C = bl2 = true;
        ((o)object2).B = false;
        Object object3 = N.a;
        object3 = ((o)object2).a;
        Object object4 = object3.P();
        Intrinsics.checkNotNullParameter(object4, "adSpotId");
        Object object5 = N.e;
        Object object6 = Boolean.TRUE;
        ((HashMap)object5).put(object4, object6);
        object4 = object3.L();
        object5 = JioAdView$AdPodVariant.NONE;
        if (object4 == object5 && !(bl2 = TextUtils.isEmpty((CharSequence)object)) && object != null) {
            object4 = new StringBuilder();
            object3 = object3.P();
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(": Response already stored prm: ");
            j.d(object);
            object3 = Unit.a;
            ((StringBuilder)object4).append(object3);
            ((StringBuilder)object4).append(" and Headers: ");
            object3 = ((o)object2).t;
            ((StringBuilder)object4).append(object3);
            j.a(((StringBuilder)object4).toString());
            object3 = ((o)object2).r;
            if (object3 != null) {
                object2 = ((o)object2).t;
                ((d)object3).onAdDataUpdate((String)object, (Map)object2);
            }
        } else {
            object4 = object3.L();
            if (object4 == object5 && ((bl2 = TextUtils.isEmpty((CharSequence)object)) || object == null)) {
                object = object3.K();
                if (object == (object4 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
                    com.jio.jioads.audioplayer.b.a((b)object3, ": Response not stored so trying so checking for backupAd");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = ((o)object2).r;
                    if (object != null) {
                        ((d)object).continueWithPromoBackSelection();
                    }
                } else {
                    com.jio.jioads.audioplayer.b.a((b)object3, ": Mediation Failed and no ads in inventory");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = JioAdError.Companion;
                    object3 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object4 = "No ads in inventory";
                    object6 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object3), object4);
                    com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                    object5 = object = ((o)object2).b;
                    object5 = (V)object;
                    String string2 = "processSelectedPromotionalResponse";
                    String string3 = "JioAdViewController";
                    String string4 = "NoFillFromMediation";
                    ((V)object5).d((JioAdError)object6, false, d2, string2, string3, string4, null);
                }
            } else {
                object = object3.L();
                if (object == (object4 = JioAdView$AdPodVariant.DEFAULT_ADPOD)) {
                    com.jio.jioads.audioplayer.b.a((b)object3, ": Response already stored prm DEFAULT_ADPOD ");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = ((o)object2).r;
                    if (object != null) {
                        ((d)object).continueWithPromoBackSelection();
                    }
                }
            }
        }
    }

    public final a i() {
        o o3 = this.a;
        a a2 = o3.s;
        if (a2 == null) {
            a2 = o3.S();
        }
        return a2;
    }

    public final Integer j() {
        int n3;
        Object object = this.a.s;
        if (object != null && (object = ((a)object).b) != null && (object = ((e)object).b) != null && (object = ((com.jio.jioads.multiad.model.c)object).u) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int k() {
        int n3;
        Object object;
        Object object2;
        Object object3 = this.a;
        Object object4 = ((o)object3).a;
        int n4 = object4.f0();
        if (n4 == 0 && (object2 = (object4 = ((o)object3).a).K()) == (object = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            object2 = object4.k0();
            object = JioAdView$AdState.DESTROYED;
            n3 = -100;
            if (object2 != object) {
                int n7;
                object2 = object4.q();
                int n8 = object2 != null ? (Integer)object2 : -1;
                object = "podc";
                object3 = ((o)object3).n((String)object);
                int n10 = 1;
                n4 = (object4 = object4.q()) != null ? (Integer)object4 : -100;
                if (n10 <= n4 && n4 < (n7 = object3 != null ? (Integer)object3 : -100)) {
                    n3 = n4;
                } else if (object3 != null) {
                    n4 = (Integer)object3;
                    n3 = n4 == 0 ? (n8 > 0 ? n8 : 1) : (Integer)object3;
                }
            }
        } else {
            n3 = 0;
        }
        return n3;
    }

    public final int l() {
        int n3;
        block6: {
            Object object;
            block4: {
                block8: {
                    int n4;
                    block7: {
                        Object object2;
                        Object object3;
                        block5: {
                            object3 = this.a;
                            object2 = ((o)object3).a.k0();
                            if (object2 == (object = JioAdView$AdState.DESTROYED)) break block4;
                            object2 = ((o)object3).a;
                            object = object2.J();
                            n4 = -1;
                            n3 = object != null ? (Integer)object : -1;
                            Object object4 = "pmnd";
                            if ((object3 = ((o)object3).n((String)object4)) != null) {
                                n4 = (Integer)object3;
                            }
                            if ((object3 = object2.L()) != (object4 = JioAdView$AdPodVariant.DEFAULT_ADPOD)) break block5;
                            if (n3 > 0) break block6;
                            if (n4 <= 0) break block4;
                            break block7;
                        }
                        object3 = object2.L();
                        if (object3 != (object2 = JioAdView$AdPodVariant.NONE)) break block4;
                        if (n4 <= 0) break block8;
                    }
                    n3 = n4;
                    break block6;
                }
                if (n3 > 0) break block6;
            }
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int m() {
        int n3;
        Object object;
        Object object2;
        Object object3 = this.a;
        Object object4 = ((o)object3).a;
        int n4 = object4.f0();
        if (n4 == 0 && (object2 = (object4 = ((o)object3).a).K()) == (object = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            object2 = object4.k0();
            object = JioAdView$AdState.DESTROYED;
            n3 = -100;
            if (object2 != object) {
                object2 = object4.q();
                int n7 = object2 != null ? (Integer)object2 : -1;
                object = "podc";
                object3 = ((o)object3).n((String)object);
                int n8 = 1;
                n4 = (object4 = object4.q()) != null ? (Integer)object4 : -100;
                if (n8 <= n4 && n4 < (n8 = object3 != null ? (Integer)object3 : -100)) {
                    n3 = n4;
                } else if (object3 != null) {
                    n4 = (Integer)object3;
                    n3 = n4 == 0 ? (n7 > 0 ? n7 : (Integer)object3) : (Integer)object3;
                }
            }
        } else {
            n3 = 0;
        }
        return n3;
    }

    public final boolean n() {
        boolean bl2;
        block8: {
            block7: {
                int n3;
                o o3 = this.a;
                Integer n4 = o3.n("podc");
                bl2 = false;
                if (n4 != null) {
                    n3 = n4;
                } else {
                    n3 = 0;
                    n4 = null;
                }
                if (n3 > 0) break block7;
                n4 = o3.n("pmxd");
                if (n4 != null) {
                    n3 = n4;
                } else {
                    n3 = 0;
                    n4 = null;
                }
                if (n3 <= 0) break block8;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final void o() {
        o o3 = this.a;
        Object object = o3.a;
        boolean bl2 = true;
        object.i(bl2);
        o3.I = bl2;
        object = o3.f;
        if (object != null) {
            String string2 = o3.a.P();
            Intrinsics.checkNotNullParameter(string2, "adspotId");
            HashMap hashMap = ((t)object).a();
            boolean bl3 = hashMap.containsKey(string2);
            if (bl3) {
                hashMap = ((t)object).a();
                hashMap.remove(string2);
            }
            if (bl3 = (hashMap = ((t)object).c()).containsKey(string2)) {
                object = ((t)object).c();
                ((HashMap)object).remove(string2);
            }
        }
        o3.r(null);
    }
}

