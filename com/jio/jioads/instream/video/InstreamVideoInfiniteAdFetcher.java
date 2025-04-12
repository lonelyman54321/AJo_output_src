/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.video;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.a;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.p;
import com.jio.jioads.instream.video.q;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.model.g;
import com.jio.jioads.multiad.t;
import com.jio.jioads.util.j;
import com.jio.jioads.utils.Constants$HeaderKeys;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InstreamVideoInfiniteAdFetcher {
    public final b a;
    public final c b;
    public final HashMap c;
    public final Function2 d;
    public final jx0_2 e;

    public InstreamVideoInfiniteAdFetcher(b b2, c c2, HashMap hashMap, Function2 function2, jx0_2 jx0_22) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(hashMap, "responseHeaders");
        Intrinsics.checkNotNullParameter(function2, "onAdDataUpdate");
        Intrinsics.checkNotNullParameter(jx0_22, "onError");
        this.a = b2;
        this.b = c2;
        this.c = hashMap;
        this.d = function2;
        this.e = jx0_22;
    }

    public static final void access$getBackupAd(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        c c2 = instreamVideoInfiniteAdFetcher.b;
        p p2 = new p(instreamVideoInfiniteAdFetcher);
        ((f)c2).d(-100, -100, p2);
    }

    public static final /* synthetic */ b access$getIJioAdView$p(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        return instreamVideoInfiniteAdFetcher.a;
    }

    public static final /* synthetic */ c access$getIJioAdViewController$p(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        return instreamVideoInfiniteAdFetcher.b;
    }

    public static final /* synthetic */ jx0_2 access$getOnError$p(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        return instreamVideoInfiniteAdFetcher.e;
    }

    public static final void access$processSelectedAd(InstreamVideoInfiniteAdFetcher object, com.jio.jioads.multiad.model.a object2, com.jio.jioads.multiad.model.f object3, com.jio.jioads.multiad.model.c object4, boolean bl2) {
        object.getClass();
        String string2 = null;
        if (object2 == null && (object4 = object4 != null ? ((com.jio.jioads.multiad.model.c)object4).a : null) == null) {
            object2 = new StringBuilder();
            object = ((InstreamVideoInfiniteAdFetcher)object).a;
            object3 = ": Ad Not Available";
            j_0.i((b)object, (StringBuilder)object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            String string3;
            int n3;
            boolean bl3;
            boolean bl4;
            Object object5;
            object4 = new JSONObject();
            Object object6 = new HashMap();
            if (object2 != null) {
                object5 = ((com.jio.jioads.multiad.model.a)object2).a;
            } else {
                bl4 = false;
                object5 = null;
            }
            Object object7 = "adid";
            object4.put((String)object7, object5);
            if (object3 != null) {
                object5 = ((com.jio.jioads.multiad.model.f)object3).a;
            } else {
                bl4 = false;
                object5 = null;
            }
            object7 = "campaignid";
            object4.put((String)object7, object5);
            if (object3 != null) {
                object5 = ((com.jio.jioads.multiad.model.f)object3).l;
            } else {
                bl4 = false;
                object5 = null;
            }
            object4.put("campaigntype", object5);
            object5 = ((InstreamVideoInfiniteAdFetcher)object).c;
            object7 = Constants$HeaderKeys.JIO_DATA;
            Object object8 = ((Constants$HeaderKeys)((Object)object7)).getKey();
            Object object9 = Locale.ROOT;
            object8 = ((String)object8).toLowerCase((Locale)object9);
            String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(object8, string4);
            bl4 = ((HashMap)object5).containsKey(object8);
            if (bl4) {
                object5 = ((InstreamVideoInfiniteAdFetcher)object).c;
                object8 = ((Constants$HeaderKeys)((Object)object7)).getKey().toLowerCase((Locale)object9);
                Intrinsics.checkNotNullExpressionValue(object8, string4);
                object5 = (String)((HashMap)object5).get(object8);
                bl3 = TextUtils.isEmpty((CharSequence)object5);
                if (!bl3) {
                    Intrinsics.checkNotNull(object5);
                    object8 = new JSONObject((String)object5);
                    object5 = "blk";
                    object8 = object8.optString((String)object5);
                    boolean bl5 = TextUtils.isEmpty((CharSequence)object8);
                    if (!bl5) {
                        object4.put((String)object5, object8);
                    }
                }
            }
            if (object2 != null) {
                object5 = ((com.jio.jioads.multiad.model.a)object2).e;
            } else {
                bl4 = false;
                object5 = null;
            }
            if (object3 != null) {
                object3 = ((com.jio.jioads.multiad.model.f)object3).b;
            } else {
                n3 = 0;
                object3 = null;
            }
            object8 = ((f)((InstreamVideoInfiniteAdFetcher)object).b).i().c;
            if (object8 == null || (object8 = ((e)object8).b) == null) {
                object8 = ((f)((InstreamVideoInfiniteAdFetcher)object).b).i().b;
                if (object8 != null) {
                    object8 = ((e)object8).b;
                } else {
                    bl3 = false;
                    object8 = null;
                }
            }
            if (object5 != null) {
                String string5;
                string3 = ((com.jio.jioads.multiad.model.b)object5).f;
                if (string3 != null) {
                    string3 = Constants$HeaderKeys.Content_Type.getKey().toLowerCase((Locale)object9);
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string5 = "application/xml";
                    object4.put(string3, (Object)string5);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).g) != null) {
                    string5 = "cid";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).h) != null) {
                    string5 = "adr";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).d) != null) {
                    string5 = "vd";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).a) != null) {
                    string5 = "mdc";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).e) != null) {
                    string5 = "skd";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).c) != null) {
                    string5 = "vce";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).b) != null) {
                    string5 = "fbk";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).k) != null) {
                    string5 = "ao";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).i) != null) {
                    string5 = "im";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).j) != null) {
                    string5 = "vim";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).m) != null) {
                    string5 = "inl";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).l) != null) {
                    string5 = "wh";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).o) != null) {
                    string5 = "strm";
                    object4.put(string5, (Object)string3);
                }
                if ((string3 = ((com.jio.jioads.multiad.model.b)object5).p) != null) {
                    string5 = "oia";
                    object4.put(string5, (Object)string3);
                }
                if ((object5 = ((com.jio.jioads.multiad.model.b)object5).q) != null) {
                    string3 = "mim";
                    object4.put(string3, object5);
                }
            }
            if (object3 != null) {
                object5 = ((g)object3).a;
                if (object5 != null) {
                    string3 = "fcr";
                    object4.put(string3, object5);
                }
                if ((object5 = ((g)object3).b) != null) {
                    string3 = "e";
                    object4.put(string3, object5);
                }
                if ((object3 = ((g)object3).c) != null) {
                    object5 = "aci";
                    object4.put((String)object5, object3);
                }
            }
            if (object8 != null) {
                object3 = ((com.jio.jioads.multiad.model.c)object8).g;
                if (object3 != null) {
                    object5 = "adrt";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).e) != null) {
                    object5 = "at";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).d) != null) {
                    object5 = "ma";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).h) != null) {
                    object5 = "mdt";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).a) != null) {
                    object5 = "med";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).j) != null) {
                    object5 = "nwhit";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).i) != null) {
                    object5 = "plr";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).m) != null) {
                    object5 = "pmnd";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).n) != null) {
                    object5 = "pmxd";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).k) != null) {
                    object5 = "pod";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).l) != null) {
                    object5 = "podc";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).f) != null) {
                    object5 = "rwin";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).b) != null) {
                    object5 = "vr";
                    object4.put((String)object5, object3);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.c)object8).s) != null) {
                    object5 = "adseq";
                    object4.put((String)object5, object3);
                }
            }
            if ((object3 = ((f)((InstreamVideoInfiniteAdFetcher)object).b).i().a) != null) {
                object5 = ((com.jio.jioads.multiad.model.d)object3).c;
                if (object5 != null) {
                    object8 = "ae";
                    object4.put((String)object8, object5);
                }
                if ((object5 = ((com.jio.jioads.multiad.model.d)object3).b) != null) {
                    object8 = "ls";
                    object4.put((String)object8, object5);
                }
                if ((object5 = ((com.jio.jioads.multiad.model.d)object3).a) != null) {
                    object8 = "csl";
                    object4.put((String)object8, object5);
                }
                if ((object3 = ((com.jio.jioads.multiad.model.d)object3).d) != null) {
                    object5 = "loc";
                    object4.put((String)object5, object3);
                }
            }
            object3 = ((Constants$HeaderKeys)((Object)object7)).getKey().toLowerCase((Locale)object9);
            Intrinsics.checkNotNullExpressionValue(object3, string4);
            object4 = object4.toString();
            ((HashMap)object6).put(object3, object4);
            object3 = new StringBuilder();
            object4 = ((InstreamVideoInfiniteAdFetcher)object).a.P();
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(": Ad headers : ");
            ((StringBuilder)object3).append(object6);
            j.c(((StringBuilder)object3).toString());
            object3 = new StringBuilder();
            object4 = ((InstreamVideoInfiniteAdFetcher)object).a.P();
            ((StringBuilder)object3).append((String)object4);
            object4 = ": Ad Response";
            ((StringBuilder)object3).append((String)object4);
            object3 = ((StringBuilder)object3).toString();
            j.c((String)object3);
            if (object2 == null || (object3 = ((com.jio.jioads.multiad.model.a)object2).b) == null) {
                object3 = "";
            }
            j.d((String)object3);
            object3 = ((f)((InstreamVideoInfiniteAdFetcher)object).b).a;
            ((o)object3).F((Map)object6);
            if (object2 != null) {
                string2 = ((com.jio.jioads.multiad.model.a)object2).b;
            }
            if (string2 != null && (n3 = string2.length()) != 0) {
                object = ((InstreamVideoInfiniteAdFetcher)object).d;
                Intrinsics.checkNotNull(object2);
                object2 = ((com.jio.jioads.multiad.model.a)object2).b;
                Intrinsics.checkNotNull(object2);
                object.invoke(object6, object2);
            } else {
                object2 = JioAdError.Companion;
                object3 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object4 = "No Ad in Inventory";
                object5 = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), (String)object4);
                object6 = ((InstreamVideoInfiniteAdFetcher)object).e;
                object7 = Boolean.FALSE;
                object8 = com.jio.jioads.cdnlogging.d.a;
                string3 = "Ad response string is empty from server";
                object9 = "processSelectedAd";
                string4 = "InstreamVideoInfiniteAdController";
                object6.invoke(object5, object7, object8, object9, string4, string3);
            }
        }
    }

    public final void fetchAdForInfiniteAdPod() {
        Object object;
        Object object2 = this.a.L();
        if (object2 != (object = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
            object2 = new StringBuilder();
            j_0.n(this.a, (StringBuilder)object2, ": failure on fetchAdForInfiniteAdPod current ad pod ");
            object = this.a.L();
            ((StringBuilder)object2).append(object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return;
        }
        object2 = this.b;
        q q2 = new q(this);
        object2 = (f)object2;
        ((Object)object2).getClass();
        Intrinsics.checkNotNullParameter(q2, "multiAdResponse");
        object2 = ((f)object2).a;
        Object object3 = ((o)object2).S();
        object = ((o)object2).f;
        if (object != null) {
            boolean bl2 = ((o)object2).E;
            long l2 = -100;
            int n3 = -100;
            ((t)object).d((a)object3, l2, n3, q2, bl2);
        } else {
            object = new StringBuilder();
            object2 = ((o)object2).a;
            object3 = ": multiAdUtility is not initialized";
            j_0.i((b)object2, (StringBuilder)object, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
    }
}

