/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.URLUtil
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.audioplayer.d;
import com.jio.jioads.controller.m;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.audio.audiointerfaces.a;
import com.jio.jioads.instream.audio.b;
import com.jio.jioads.instream.audio.c;
import com.jio.jioads.instream.audio.e;
import com.jio.jioads.instream.audio.f;
import com.jio.jioads.instream.audio.h;
import com.jio.jioads.instream.audio.i;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.s;
import com.jio.jioads.utils.Constants$HeaderKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class j
implements com.jio.jioads.videomodule.player.callback.a {
    public f A;
    public final int B;
    public long C;
    public boolean D;
    public com.jio.jioads.instreamads.vastparser.model.b E;
    public x F;
    public int G;
    public int H;
    public Drawable I;
    public Drawable J;
    public String K;
    public String L;
    public String M;
    public WebView N;
    public boolean O;
    public boolean P;
    public com.jio.jioads.videomodule.d Q;
    public final com.jio.jioads.controller.a a;
    public final com.jio.jioads.common.b b;
    public final com.jio.jioads.common.c c;
    public final com.jio.jioads.instreamads.vastparser.model.m d;
    public final Map e;
    public final ArrayList f;
    public final String g;
    public RelativeLayout h;
    public RelativeLayout i;
    public ProgressBar j;
    public TextView k;
    public TextView l;
    public a m;
    public boolean n;
    public CountDownTimer o;
    public ViewGroup p;
    public final boolean q;
    public boolean r;
    public Drawable[] s;
    public String t;
    public int u;
    public final int v;
    public List w;
    public boolean x;
    public boolean y;
    public final hh3_2 z;

    public j(com.jio.jioads.controller.a object, com.jio.jioads.common.b b2, com.jio.jioads.common.c object2, com.jio.jioads.instreamads.vastparser.model.m object3, boolean bl2, Map object4) {
        float f5;
        int n3;
        Intrinsics.checkNotNullParameter(object, "jioAdCallbacks");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(object2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(object3, "vastData");
        Intrinsics.checkNotNullParameter(object4, "headers");
        this.a = object;
        this.b = b2;
        this.c = object2;
        this.d = object3;
        this.e = object4;
        this.f = object = new Object();
        object2 = "";
        this.t = object2;
        this.u = -1;
        this.z = object4 = yr1_2.b(com.jio.jioads.instream.audio.b.c);
        this.B = n3 = 1000;
        this.M = object2;
        object2 = new StringBuilder();
        object4 = b2.P();
        object2.append((String)object4);
        object2.append(": inside InStreamAudioRenderer");
        com.jio.jioads.util.j.c(object2.toString());
        object.clear();
        object2 = b2.k0();
        object4 = JioAdView$AdState.DESTROYED;
        String string2 = "message";
        List list = null;
        if (object2 != object4) {
            Object object5;
            object2 = b2.Y();
            if (object2 != null) {
                object4 = b2.B();
                if (object4 != null) {
                    n3 = (Integer)object4;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                object5 = new c(this);
                object2 = ((com.jio.jioads.instreamads.vastparser.model.m)object3).e((Context)object2, n3, (Function2)object5);
            } else {
                object2 = null;
                f5 = 0.0f;
            }
            if (object2 != null) {
                object.addAll(object2);
            } else {
                object2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                object4 = "showCompanion";
                object5 = "AudioUrl is found null";
                String string3 = "URl Params missing for audio";
                this.j((String)object4, (String)object5, string3, (JioAdError$JioAdErrorType)((Object)object2));
            }
            object2 = com.jio.jioads.controller.m.a(b2, ": size of mVideoUrlList: ");
            n3 = object.size();
            object2.append(n3);
            Intrinsics.checkNotNullParameter(object2.toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
        this.q = bl2;
        int n4 = object.isEmpty() ^ 1;
        if (n4 != 0) {
            float f6;
            object = ((com.jio.jioads.instreamads.vastparser.model.m)object3).a;
            if (object != null) {
                object2 = this.o();
                object = ((n)object).p((String)object2);
            } else {
                n4 = 0;
                object = null;
                f6 = 0.0f;
            }
            this.g = object;
            n4 = TextUtils.isEmpty((CharSequence)object);
            if (n4 == 0) {
                object = this.g;
                Intrinsics.checkNotNull(object);
                object2 = "%";
                n4 = (int)(StringsKt.F((CharSequence)object, (CharSequence)object2, false) ? 1 : 0);
                if (n4 != 0) {
                    object = ((com.jio.jioads.instreamads.vastparser.model.m)object3).a;
                    if (object != null) {
                        object3 = this.o();
                        object = ((n)object).j((String)object3);
                    } else {
                        n4 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    boolean bl3 = TextUtils.isEmpty(object);
                    if (!bl3) {
                        n4 = j_0.a(object);
                        object3 = this.g;
                        if (object3 != null) {
                            list = fT1.a((String)object2, (String)object3);
                        }
                        Intrinsics.checkNotNull(list);
                        object2 = new String[]{};
                        object2 = list.toArray((T[])object2)[0];
                        f6 = Integer.parseInt((String)object2) * n4;
                        f5 = 100.0f;
                        double d2 = Math.ceil(f6 /= f5);
                        this.v = n4 = (int)d2;
                    }
                } else {
                    object = this.g;
                    this.v = n4 = Utility.convertTimeToSec((String)object);
                }
            }
            this.u = n4 = this.v;
            object = com.jio.jioads.controller.m.a(b2, " : Audio ad Skip offset value: ");
            int n7 = this.u;
            w12_0.b(n7, string2, (StringBuilder)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        object = com.jio.jioads.videomodule.d.a;
        this.Q = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(j j3) {
        Exception exception2;
        Object object;
        block4: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            block3: {
                j3.getClass();
                object = j3.b;
                try {
                    object5 = JioAdError.Companion;
                    object4 = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
                    object5.getClass();
                    object3 = t_0.a(object4);
                    object5 = new StringBuilder();
                    object4 = object.P();
                    ((StringBuilder)object5).append((String)object4);
                    object4 = " : Audio Ad Timeout Error";
                    ((StringBuilder)object5).append((String)object4);
                    object5 = ((StringBuilder)object5).toString();
                    ((JioAdError)object3).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object5);
                    object5 = j3.a;
                    com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                    String string2 = "cancelAudioPreparing()";
                    String string3 = "InStreamAudioRenderer";
                    String string4 = "error as audio Ad Player took long time to prepare";
                    object2 = object5;
                    object2 = (V)object5;
                    ((V)object2).d((JioAdError)object3, false, d2, string2, string3, string4, null);
                    object5 = j3.m;
                    if (object5 == null) break block3;
                    Intrinsics.checkNotNull(object5);
                    object5.b();
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if ((object5 = j3.j) != null) {
                int n3 = 8;
                object5.setVisibility(n3);
            }
            object5 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            object4 = "showCompanion";
            object2 = "AudioUrl is found null";
            object3 = "URl Params missing for audio";
            j3.j((String)object4, (String)object2, (String)object3, (JioAdError$JioAdErrorType)((Object)object5));
            j3.l();
            return;
        }
        object = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, ": Exception while cancel Audio Preparing: ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void a() {
    }

    public final void a(boolean bl2) {
        this.y = bl2 = true;
        Object object = JioAdView$AdState.CLOSED;
        Object object2 = (V)this.a;
        ((V)object2).e((JioAdView$AdState)((Object)object));
        object = new StringBuilder();
        Object object3 = this.b;
        j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object, ": Callback onAdClose()");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        int n3 = this.q;
        if (n3 == 0) {
            object2 = new StringBuilder();
            object4 = " :InStream AudioAd Completed";
            j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object4);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.m();
            this.t();
        } else {
            n3 = this.y;
            if (n3 != 0) {
                object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, " :Interstitial AudioAd Completed.Player CurrentPosition= ");
                object4 = this.m;
                if (object4 != null) {
                    n3 = object4.getCurrentPosition();
                    object4 = n3;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                ((StringBuilder)object3).append(object4);
                object3 = ((StringBuilder)object3).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
                object3 = this.o();
                this.i((String)object3, (JioEventTracker$TrackingEvents)((Object)object));
                ((V)object2).l();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(ArrayList object) {
        boolean bl2;
        String string2 = "ads";
        String string3 = "cmps";
        Object object2 = "pod";
        Object object3 = null;
        Object object4 = this.c;
        if (object != null && !(bl2 = object.isEmpty())) {
            Object object5 = object4;
            object5 = ((com.jio.jioads.controller.f)object4).a;
            bl2 = ((o)object5).o;
            if (!bl2) {
                object4 = Constants$HeaderKeys.JIO_DATA;
                object5 = ((Constants$HeaderKeys)((Object)object4)).getKey();
                Object object6 = Locale.ROOT;
                object5 = ((String)object5).toLowerCase((Locale)object6);
                String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullExpressionValue(object5, string4);
                Map map2 = this.e;
                bl2 = map2.containsKey(object5);
                if (!bl2) return object3;
                object4 = ((Constants$HeaderKeys)((Object)object4)).getKey().toLowerCase((Locale)object6);
                Intrinsics.checkNotNullExpressionValue(object4, string4);
                object4 = (String)map2.get(object4);
                if (object4 == null) {
                    object4 = "";
                }
                try {
                    object5 = new JSONObject((String)object4);
                    boolean bl3 = object5.has((String)object2);
                    if (!bl3) return object3;
                    bl3 = (object2 = object5.getJSONObject((String)object2)).has(string3);
                    if (!bl3) return object3;
                    string3 = object2.getJSONObject(string3);
                    object2 = string3.keys();
                    Intrinsics.checkNotNull(object2);
                    block2: while (bl3 = object2.hasNext()) {
                        boolean bl4;
                        object4 = object2.next();
                        object5 = string3.getJSONObject((String)(object4 = (String)object4));
                        boolean bl5 = object5.has(string2);
                        if (!bl5) continue;
                        object5 = object5.getJSONObject(string2);
                        object6 = ((ArrayList)object).iterator();
                        do {
                            if (!(bl4 = object6.hasNext())) continue block2;
                            string4 = object6.next();
                        } while (!(bl4 = object5.has(string4)));
                        object3 = object4;
                    }
                    return object3;
                }
                catch (Exception exception) {
                    return object3;
                }
            }
        }
        object4 = (com.jio.jioads.controller.f)object4;
        object = ((com.jio.jioads.controller.f)object4).a;
        boolean bl6 = ((o)object).o;
        if (!bl6) return object3;
        object = (k)CollectionsKt.firstOrNull(this.f);
        if (object == null) return object3;
        return ((k)object).n;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void c(ViewGroup object, int n3, int n4, Drawable object2, Drawable object3) {
        Object object4;
        int n7 = 1;
        Object object5 = this.b;
        Object object6 = object5.k0();
        if (object6 == (object4 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object6 = object5.Y();
        this.G = n3;
        this.H = n4;
        this.p = object;
        this.I = object2;
        this.J = object3;
        int n8 = this.q;
        Object object7 = this.d;
        n4 = 0;
        Object object8 = null;
        if (n8 == 0) {
            int n10;
            int n14;
            object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object5, " :selecting CompanionAd for Width : ");
            int n15 = this.G;
            object2.append(n15);
            object2.append(" & Height : ");
            n15 = this.H;
            object6 = "message";
            w12_0.b(n15, (String)object6, (StringBuilder)object2);
            object2 = JioAds.Companion;
            object2.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = new ArrayList();
            object4 = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder(" ");
            j_0.n((com.jio.jioads.common.b)object5, stringBuilder, ": companionAdsList: ");
            Object object9 = this.w;
            if (object9 != null) {
                n14 = object9.size();
                object9 = n14;
            } else {
                n14 = 0;
                object9 = null;
            }
            stringBuilder.append(object9);
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)object6);
            object2.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = this.w;
            boolean bl2 = false;
            stringBuilder = null;
            if (object2 != null && (n10 = object2.isEmpty()) == 0) {
                object2 = this.w;
                Intrinsics.checkNotNull(object2);
                n10 = object2.size();
                object9 = null;
                for (n14 = 0; n14 < n10; n14 += n7) {
                    int n16;
                    String string2;
                    Object object10 = this.w;
                    Intrinsics.checkNotNull(object10);
                    object10 = (com.jio.jioads.instreamads.vastparser.model.b)object10.get(n14);
                    if (object10 != null) {
                        string2 = ((com.jio.jioads.instreamads.vastparser.model.b)object10).e;
                    } else {
                        n16 = 0;
                        string2 = null;
                    }
                    n16 = TextUtils.isEmpty((CharSequence)string2);
                    if (n16 == 0) {
                        if (object10 != null) {
                            string2 = ((com.jio.jioads.instreamads.vastparser.model.b)object10).d;
                        } else {
                            n16 = 0;
                            string2 = null;
                        }
                        n16 = TextUtils.isEmpty((CharSequence)string2);
                        if (n16 == 0) {
                            int n17;
                            String string3;
                            if (object10 != null) {
                                string2 = ((com.jio.jioads.instreamads.vastparser.model.b)object10).e;
                            } else {
                                n16 = 0;
                                string2 = null;
                            }
                            Intrinsics.checkNotNull(string2);
                            n16 = Integer.parseInt(string2);
                            if (object10 != null) {
                                string3 = ((com.jio.jioads.instreamads.vastparser.model.b)object10).d;
                            } else {
                                n17 = 0;
                                string3 = null;
                            }
                            Intrinsics.checkNotNull(string3);
                            n17 = Integer.parseInt(string3);
                            int n18 = this.G;
                            if (n18 != n16 || (n16 = this.H) != n17) continue;
                            ((ArrayList)object3).add(object10);
                            continue;
                        }
                    }
                    Intrinsics.checkNotNull(object10);
                    ((ArrayList)object4).add(object10);
                }
            }
            if ((n10 = ((ArrayList)object3).size()) > 0) {
                com.jio.jioads.audioplayer.b.a(object5, " :Publisher requested companion ad is available");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            } else {
                n10 = ((ArrayList)object4).size();
                if (n10 > 0) {
                    com.jio.jioads.audioplayer.b.a(object5, " : Publisher requested companion is not available so selecting companion without size");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object3 = object4;
                } else {
                    n15 = 0;
                    object3 = null;
                }
            }
            if (object3 != null && (n10 = (int)(object3.isEmpty() ? 1 : 0)) == 0 && (n10 = object3.size()) > 0) {
                n10 = object3.size();
                if (n10 > n7) {
                    object2 = new Random();
                    n7 = object3.size();
                    n10 = object2.nextInt(n7);
                    object2 = (com.jio.jioads.instreamads.vastparser.model.b)object3.get(n10);
                    this.E = object2;
                } else {
                    object2 = (com.jio.jioads.instreamads.vastparser.model.b)object3.get(0);
                    this.E = object2;
                }
                object2 = com.jio.jioads.controller.m.a(object5, " :Audio companion ad selected: ");
                object3 = this.E;
                if (object3 != null) {
                    object3 = ((com.jio.jioads.instreamads.vastparser.model.b)object3).f;
                } else {
                    n15 = 0;
                    object3 = null;
                }
                ir3_0.b((StringBuilder)object2, (String)object3, (String)object6);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object7 = ((com.jio.jioads.instreamads.vastparser.model.m)object7).a;
                if (object7 != null) {
                    object2 = this.E;
                    if (object2 != null) {
                        object8 = object2.f;
                    }
                    ((n)object7).z = object8;
                }
                if ((n3 = (int)(this.D ? 1 : 0)) != 0 && n8 == 0) {
                    this.w();
                }
            }
        } else if (object6 != null && (object = object6.getResources()) != null) {
            boolean bl3;
            object = object6.getResources().getConfiguration();
            n8 = object.orientation;
            com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object5, ": Selecting companion ad for interstital audio ad");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.f;
            if (object2 != null && !(bl3 = object2.isEmpty()) && (object2 = object5.k0()) != object4 && (object2 = object5.Y()) != null) {
                boolean bl4;
                object3 = this.o();
                object7.getClass();
                Intrinsics.checkNotNullParameter(object2, "context");
                object5 = ((com.jio.jioads.instreamads.vastparser.model.m)object7).a;
                if (object5 != null) {
                    object8 = (List)((n)object5).q.get(object3);
                }
                if (object8 != null && !(bl4 = object8.isEmpty())) {
                    boolean bl5;
                    object5 = new Object();
                    object6 = object8.iterator();
                    while (bl5 = object6.hasNext()) {
                        Object object11 = object4 = object6.next();
                        object11 = ((com.jio.jioads.instreamads.vastparser.model.b)object4).g;
                        String string4 = "end-card";
                        boolean bl6 = kotlin.text.b.i((String)object11, string4, n7 != 0);
                        if (!bl6) continue;
                        ((ArrayList)object5).add(object4);
                    }
                    int n19 = ((ArrayList)object5).size();
                    if (n19 == n7) {
                        object = (com.jio.jioads.instreamads.vastparser.model.b)CollectionsKt.firstOrNull(object5);
                        if (object != null && (object8 = ((com.jio.jioads.instreamads.vastparser.model.m)object7).a) != null) {
                            object2 = object.a;
                            ((n)object8).n.put(object3, object2);
                            object2 = object.b;
                            HashMap hashMap = ((n)object8).m;
                            hashMap.put(object3, object2);
                            object = object.f;
                            ((n)object8).z = object;
                        }
                    } else {
                        n19 = ((ArrayList)object5).size();
                        if (n19 > n7) {
                            ((com.jio.jioads.instreamads.vastparser.model.m)object7).g(n8, (Context)object2, (String)object3, (List)object5);
                        } else {
                            ((com.jio.jioads.instreamads.vastparser.model.m)object7).g(n8, (Context)object2, (String)object3, (List)object8);
                        }
                    }
                }
                if ((object = ((com.jio.jioads.instreamads.vastparser.model.m)object7).a) != null && (object = (String)object.m.get(object8 = this.o())) == null && (object = ((com.jio.jioads.instreamads.vastparser.model.m)object7).a) != null) {
                    object7 = this.o();
                    object = (String)object.n.get(object7);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Exception exception2;
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        j j3;
        block9: {
            int n3;
            Object object4;
            block8: {
                block7: {
                    j3 = this;
                    object4 = "message";
                    object3 = this.b;
                    object2 = object3.k0();
                    if (object2 == (object = JioAdView$AdState.DESTROYED)) return;
                    bl2 = false;
                    object2 = null;
                    try {
                        object = new StringBuilder();
                        String string2 = object3.P();
                        ((StringBuilder)object).append(string2);
                        string2 = " :Error while showing audio ad";
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        object4 = JioAds.Companion;
                        object4 = ((JioAds$Companion)object4).getInstance();
                        ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        object4 = object3.z();
                        if (object4 == null) break block7;
                        object4 = ((o)object4).Q;
                        break block8;
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                n3 = 0;
                object4 = null;
            }
            n3 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)object4);
            if (n3 != 0) {
                com.jio.jioads.util.i.i = n3 = com.jio.jioads.util.i.i + 1;
            }
            if ((object4 = j3.j) != null) {
                int n4 = 8;
                object4.setVisibility(n4);
            }
            object4 = j3.o;
            if (object4 != null) {
                Intrinsics.checkNotNull(object4);
                object4.onFinish();
                object4 = j3.o;
                Intrinsics.checkNotNull(object4);
                object4.cancel();
                j3.o = null;
            }
            if ((object4 = j3.p) != null) {
                object = j3.h;
                object4.removeView((View)object);
            }
            this.l();
            return;
        }
        object = new StringBuilder("onError() of audio ad: ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioAdError.Companion;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        object.getClass();
        object = t_0.a(jioAdError$JioAdErrorType);
        JioAdView$AdState jioAdView$AdState = object3.k0();
        Object object5 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState != object5) {
            object2 = object3.Y();
        }
        jioAdView$AdState = object2;
        object5 = object3.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        Object object6 = "exception:";
        object2 = new StringBuilder((String)object6);
        String string3 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object2);
        object2 = (com.jio.jioads.controller.f)j3.c;
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)object2).a.T();
        bl2 = ((com.jio.jioads.controller.f)object2).a.a();
        Boolean bl3 = bl2;
        object3 = object3.q0();
        String string4 = ((JioAdError)object).getErrorCode();
        String string5 = "Exception in onError() of audio ad";
        String string6 = "onError";
        object2 = object6;
        object6 = object3;
        utility.logError((Context)jioAdView$AdState, (String)object5, d2, string5, string3, a2, string6, bl3, (String)object3, string4, false);
        object3 = new StringBuilder((String)object2);
        String string7 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object3);
        object3 = "onError";
        object2 = "Exception in onError() of audio ad";
        j3.j((String)object3, (String)object2, string7, jioAdError$JioAdErrorType);
    }

    public final void e() {
    }

    public final void e(String object) {
        Object object2 = Utility.INSTANCE;
        boolean bl2 = ((Utility)object2).isWebViewEnabled();
        Object object3 = "message";
        if (bl2) {
            int n3;
            float f5;
            int n4;
            Object object4;
            Object object5 = this.b;
            Object object6 = object5.k0();
            if (object6 == (object4 = JioAdView$AdState.DESTROYED)) {
                return;
            }
            object6 = object5.Y();
            if (object6 == null) {
                return;
            }
            object4 = new WebView((Context)object6);
            this.N = object4;
            int bl3 = this.G;
            int n7 = -1;
            float f6 = 0.0f / 0.0f;
            if (bl3 != n7 && (n4 = this.H) != n7) {
                f6 = this.G;
                int n8 = ((Utility)object2).convertDpToPixel(f6);
                f5 = this.H;
                n3 = ((Utility)object2).convertDpToPixel(f5);
                object4 = new ViewGroup.LayoutParams(n8, n3);
            } else {
                object4 = new ViewGroup.LayoutParams(n7, n7);
            }
            Object object7 = this.N;
            if (object7 != null) {
                f5 = 2.461195E-38f;
                n3 = t70.getColor((Context)object6, 17170445);
                object7.setBackgroundColor(n3);
            }
            if ((object7 = this.N) != null) {
                object7.setLayoutParams((ViewGroup.LayoutParams)object4);
            }
            object7 = this.N;
            Intrinsics.checkNotNull(object7);
            Object object8 = new e(this);
            object4 = new x((Context)object6, (WebView)object7, (com.jio.jioads.interstitial.o)object8, (com.jio.jioads.common.b)object5);
            this.F = object4;
            object6 = ((Object)StringsKt.m0((CharSequence)object)).toString();
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            boolean bl4 = URLUtil.isValidUrl((String)object);
            if (bl4) {
                object = this.F;
                if (object != null) {
                    object4 = "url";
                    Intrinsics.checkNotNullParameter(object6, (String)object4);
                    object = ((x)object).a;
                    object.loadUrl((String)object6);
                }
            } else {
                object = this.F;
                if (object != null) {
                    ((x)object).c((String)object6);
                }
            }
            object = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object5, ": adContainer value is : ");
            object6 = this.i;
            ((StringBuilder)object).append(object6);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.i;
            if (object != null) {
                object2 = this.N;
                object.addView((View)object2);
            } else {
                object = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                object.getClass();
                object = t_0.a(jioAdError$JioAdErrorType);
                object3 = object5.Y();
                object6 = object5.P();
                object4 = com.jio.jioads.cdnlogging.d.a;
                object7 = (com.jio.jioads.controller.f)this.c;
                object8 = object7.a.T();
                boolean bl5 = object7.a.a();
                Boolean bl6 = bl5;
                String string2 = object5.q0();
                String string3 = ((JioAdError)object).getErrorCode();
                object7 = "InStreamAudioAdContainer is null found";
                String string4 = "loadHtmlCompanionAdToWebView";
                object5 = object3;
                object3 = object6;
                object6 = object4;
                object4 = "InStreamAudioAdContainer";
                ((Utility)object2).logError((Context)object5, (String)object3, (com.jio.jioads.cdnlogging.d)((Object)object6), (String)object4, (String)object7, (com.jio.jioads.cdnlogging.a)object8, string4, bl6, string2, string3, false);
                object = "InStreamAudioAdContainer is null";
                object2 = "loadHtmlCompanionAdToWebView";
                object5 = "InStreamAudioAdContainer is null found";
                this.j((String)object2, (String)object5, (String)object, jioAdError$JioAdErrorType);
            }
        } else {
            Intrinsics.checkNotNullParameter("loading default companion ad webview is not available", object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.s();
        }
    }

    /*
     * Loose catch block
     */
    public final void f() {
        block31: {
            Object object;
            j j3 = this;
            Object object2 = "message";
            Object object3 = this.b;
            Object object4 = object3.k0();
            if (object4 != (object = JioAdView$AdState.DESTROYED)) {
                Object object5;
                boolean bl2;
                block30: {
                    bl2 = false;
                    object4 = null;
                    object = new StringBuilder();
                    object5 = object3.P();
                    ((StringBuilder)object).append((String)object5);
                    object5 = ": Instream audio ad prepared";
                    ((StringBuilder)object).append((String)object5);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, object2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    boolean bl3 = true;
                    this.n = bl3;
                    object = this.o;
                    if (object == null) break block30;
                    Intrinsics.checkNotNull(object);
                    object.onFinish();
                    object = this.o;
                    Intrinsics.checkNotNull(object);
                    object.cancel();
                    try {
                        this.o = null;
                    }
                    catch (Exception exception) {
                        object = new StringBuilder();
                        object5 = object3.P();
                        ((StringBuilder)object).append((String)object5);
                        object5 = ": Error in Audio Preparation Timer: ";
                        ((StringBuilder)object).append((String)object5);
                        object5 = Unit.a;
                        ((StringBuilder)object).append(object5);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, object2);
                        object2 = JioAds.Companion;
                        object2 = ((JioAds$Companion)object2).getInstance();
                        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                    }
                }
                object2 = JioAdView$AdState.PREPARED;
                object3.j((JioAdView$AdState)((Object)object2));
                object2 = j3.a;
                object2 = (V)object2;
                ((V)object2).n();
                boolean bl4 = object3.g0();
                if (!bl4) break block31;
                object2 = j3.m;
                if (object2 == null) break block31;
                this.x();
                {
                    catch (Exception exception) {
                        object = new StringBuilder("Exception in onPrepared() callback of audio ad: ");
                        Utility utility = Utility.INSTANCE;
                        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception, (StringBuilder)object);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = JioAdError.Companion;
                        object5 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                        object.getClass();
                        object = t_0.a((JioAdError$JioAdErrorType)((Object)object5));
                        JioAdView$AdState jioAdView$AdState = object3.k0();
                        Object object6 = JioAdView$AdState.DESTROYED;
                        if (jioAdView$AdState != object6) {
                            object4 = object3.Y();
                        }
                        jioAdView$AdState = object4;
                        object6 = object3.P();
                        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                        Object object7 = "exception:";
                        object4 = new StringBuilder((String)object7);
                        String string2 = com.jio.jioads.instream.audio.a.a(exception, (StringBuilder)object4);
                        object4 = (com.jio.jioads.controller.f)j3.c;
                        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)object4).a.T();
                        bl2 = ((com.jio.jioads.controller.f)object4).a.a();
                        Boolean bl5 = bl2;
                        object3 = object3.q0();
                        String string3 = ((JioAdError)object).getErrorCode();
                        String string4 = "Exception in onPrepared() callback of audio ad";
                        String string5 = "onPrepared";
                        object4 = object7;
                        object7 = object3;
                        utility.logError((Context)jioAdView$AdState, (String)object6, d2, string4, string2, a2, string5, bl5, (String)object3, string3, false);
                        object3 = new StringBuilder((String)object4);
                        String string6 = com.jio.jioads.instream.audio.a.a(exception, (StringBuilder)object3);
                        object3 = "onPrepared";
                        object4 = "Exception in onPrepared() callback of audio ad";
                        j3.j((String)object3, (String)object4, string6, (JioAdError$JioAdErrorType)((Object)object5));
                    }
                }
            }
        }
    }

    public final void g() {
        boolean bl2;
        boolean bl3;
        Object object = this.m;
        if (object != null && (bl3 = object.isPlaying()) == (bl2 = true)) {
            object = this.m;
            if (object != null) {
                object.pause();
            }
            object = JioEventTracker$TrackingEvents.EVENT_PAUSE;
            String string2 = this.o();
            this.i(string2, (JioEventTracker$TrackingEvents)((Object)object));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(long l2, long l3) {
        block17: {
            block15: {
                Exception exception2;
                com.jio.jioads.common.b b2;
                Object object;
                Object object2;
                block16: {
                    long l4;
                    char c2;
                    String string2;
                    int n3;
                    int n4;
                    Object object3;
                    block12: {
                        float f5;
                        float f6;
                        Object object4;
                        Object object5;
                        CharSequence charSequence;
                        float f7;
                        char c3;
                        char c5;
                        block13: {
                            char c6;
                            block14: {
                                float f8;
                                Object object6;
                                float f11;
                                char c7;
                                Object object7;
                                object3 = this.m;
                                Intrinsics.checkNotNull(object3);
                                n4 = object3.getCurrentPosition();
                                object2 = this.m;
                                Intrinsics.checkNotNull(object2);
                                int n7 = object2.a();
                                object = new StringBuilder();
                                b2 = this.b;
                                String string3 = ": onProgress of trackNumber: 1 progress: ";
                                j_0.n(b2, (StringBuilder)object, string3);
                                n3 = 1000;
                                int n8 = n4 / 1000;
                                ((StringBuilder)object).append(n8);
                                ((StringBuilder)object).append(", duration: ");
                                n8 = n7 / 1000;
                                ((StringBuilder)object).append(n8);
                                object = ((StringBuilder)object).toString();
                                string2 = "message";
                                Intrinsics.checkNotNullParameter(object, string2);
                                object = JioAds.Companion;
                                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                Object object8 = JioAds$LogLevel.NONE;
                                object8 = this.m;
                                if (object8 == null) break block17;
                                object8 = "";
                                if (n7 > 0 && (object7 = this.k) != null) {
                                    int n10 = (n7 - n4) / n3;
                                    c5 = n10 / 3600;
                                    c3 = c5 * 3600;
                                    n10 -= c3;
                                    c3 = n10 / 60;
                                    c6 = c3 * 60;
                                    n10 -= c6;
                                    c6 = ':';
                                    f7 = 8.1E-44f;
                                    c7 = '\n';
                                    f11 = 1.4E-44f;
                                    if (c5 > '\u0000') {
                                        object6 = c5 < c7 ? "0" : object8;
                                        charSequence = new StringBuilder();
                                        ((StringBuilder)charSequence).append((String)object6);
                                        ((StringBuilder)charSequence).append((int)c5);
                                        ((StringBuilder)charSequence).append(c6);
                                        object5 = ((StringBuilder)charSequence).toString();
                                    } else {
                                        object5 = object8;
                                    }
                                    c2 = '0';
                                    if (c3 < c7) {
                                        charSequence = new StringBuilder();
                                        ((StringBuilder)charSequence).append((String)object5);
                                        ((StringBuilder)charSequence).append(c2);
                                        object5 = ((StringBuilder)charSequence).toString();
                                    }
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append((String)object5);
                                    ((StringBuilder)charSequence).append((int)c3);
                                    ((StringBuilder)charSequence).append(c6);
                                    object5 = ((StringBuilder)charSequence).toString();
                                    if (n10 < c7) {
                                        object4 = new StringBuilder();
                                        ((StringBuilder)object4).append((String)object5);
                                        ((StringBuilder)object4).append(c2);
                                        object5 = ((StringBuilder)object4).toString();
                                    }
                                    object4 = new StringBuilder();
                                    ((StringBuilder)object4).append((String)object5);
                                    ((StringBuilder)object4).append(n10);
                                    object7 = ((StringBuilder)object4).toString();
                                    object5 = this.k;
                                    Intrinsics.checkNotNull(object5);
                                    String string4 = "Ad : ";
                                    object4 = new StringBuilder(string4);
                                    ((StringBuilder)object4).append((String)object7);
                                    object7 = ((StringBuilder)object4).toString();
                                    object5.setText((CharSequence)object7);
                                }
                                if ((object7 = this.a) != null) {
                                    object5 = this.o();
                                    object6 = object5 == null ? object8 : object5;
                                    long l7 = n7;
                                    long l8 = n4;
                                    object4 = object7;
                                    object4 = (V)object7;
                                    ((V)object4).c(l7, (String)object6, l8);
                                }
                                l4 = n7;
                                l2 = n4;
                                f6 = l4;
                                c3 = '\u40800000';
                                f5 = f6 / 4.0f;
                                c6 = '\u40000000';
                                f7 = f6 / 2.0f;
                                c7 = '\u3faaaaab';
                                f11 = 1.3333334f;
                                f6 /= f11;
                                try {
                                    com.jio.jioads.videomodule.d d2 = this.Q;
                                    c7 = d2.ordinal();
                                    c2 = '\u0001';
                                    if (c7 == '\u0000') break block12;
                                    charSequence = " of ";
                                    if (c7 == c2) break block13;
                                    c3 = '\u0002';
                                    f5 = 2.8E-45f;
                                    if (c7 == c3) break block14;
                                    c3 = '\u0003';
                                    f5 = 4.2E-45f;
                                }
                                catch (Exception exception2) {
                                    break block16;
                                }
                                if (c7 != c3 || (c5 = (char)((f8 = (f5 = (float)l2) - f6) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) < '\u0000' || (c5 = (char)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) > '\u0000') break block15;
                                object5 = com.jio.jioads.videomodule.d.e;
                                this.Q = object5;
                                object5 = new StringBuilder();
                                object4 = b2.P();
                                ((StringBuilder)object5).append((String)object4);
                                object4 = ": QuartileEvent: Third Quartile Event at ";
                                ((StringBuilder)object5).append((String)object4);
                                long l12 = n3;
                                ((StringBuilder)object5).append(l2 /= l12);
                                ((StringBuilder)object5).append((String)charSequence);
                                ((StringBuilder)object5).append(l4 /= l12);
                                object3 = ((StringBuilder)object5).toString();
                                Intrinsics.checkNotNullParameter(object3, string2);
                                object3 = ((JioAds$Companion)object).getInstance();
                                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object3 = JioEventTracker$TrackingEvents.EVENT_THIRD_QUARTILE;
                                object2 = this.o();
                                this.i((String)object2, (JioEventTracker$TrackingEvents)((Object)object3));
                                break block15;
                            }
                            f5 = l2;
                            float f12 = f5 - f7;
                            c6 = (char)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                            if (c6 < '\u0000' || (c5 = (char)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1))) > '\u0000') break block15;
                            object5 = com.jio.jioads.videomodule.d.d;
                            this.Q = object5;
                            object5 = new StringBuilder();
                            object4 = b2.P();
                            ((StringBuilder)object5).append((String)object4);
                            object4 = ": QuartileEvent: Mid Quartile Event at ";
                            ((StringBuilder)object5).append((String)object4);
                            long l14 = n3;
                            ((StringBuilder)object5).append(l2 /= l14);
                            ((StringBuilder)object5).append((String)charSequence);
                            ((StringBuilder)object5).append(l4 /= l14);
                            object3 = ((StringBuilder)object5).toString();
                            Intrinsics.checkNotNullParameter(object3, string2);
                            object3 = ((JioAds$Companion)object).getInstance();
                            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object3 = JioEventTracker$TrackingEvents.EVENT_MID_QUARTILE;
                            object2 = this.o();
                            this.i((String)object2, (JioEventTracker$TrackingEvents)((Object)object3));
                            break block15;
                        }
                        f6 = l2;
                        float f14 = f6 - f5;
                        c3 = (char)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                        if (c3 < '\u0000' || (c5 = (char)(f6 == f7 ? 0 : (f6 < f7 ? -1 : 1))) > '\u0000') break block15;
                        object5 = com.jio.jioads.videomodule.d.c;
                        this.Q = object5;
                        object5 = new StringBuilder();
                        object4 = b2.P();
                        ((StringBuilder)object5).append((String)object4);
                        object4 = ": QuartileEvent: First Quartile Event at ";
                        ((StringBuilder)object5).append((String)object4);
                        long l15 = n3;
                        ((StringBuilder)object5).append(l2 /= l15);
                        ((StringBuilder)object5).append((String)charSequence);
                        ((StringBuilder)object5).append(l4 /= l15);
                        object3 = ((StringBuilder)object5).toString();
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object3 = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioEventTracker$TrackingEvents.EVENT_FIRST_QUARTILE;
                        object2 = this.o();
                        this.i((String)object2, (JioEventTracker$TrackingEvents)((Object)object3));
                        break block15;
                    }
                    l4 = 0L;
                    long l16 = l2 - l4;
                    n3 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n3 >= 0 && (object3 = this.m) != null && (n4 = (int)(object3.isPlaying() ? 1 : 0)) == c2) {
                        object3 = com.jio.jioads.videomodule.d.b;
                        this.Q = object3;
                        object3 = new StringBuilder();
                        object2 = b2.P();
                        ((StringBuilder)object3).append((String)object2);
                        object2 = ": QuartileEvent: Ad Start Event";
                        ((StringBuilder)object3).append((String)object2);
                        object3 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object3 = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioEventTracker$TrackingEvents.EVENT_CREATIVE;
                        object2 = this.o();
                        this.i((String)object2, (JioEventTracker$TrackingEvents)((Object)object3));
                        object3 = JioEventTracker$TrackingEvents.EVENT_START;
                        object2 = this.o();
                        this.i((String)object2, (JioEventTracker$TrackingEvents)((Object)object3));
                    }
                    break block15;
                }
                object2 = com.jio.jioads.controller.m.a(b2, ": Exception while fireEvents: ");
                object = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
            this.n();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(String string2, JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents) {
        void var12_40;
        void var12_37;
        void var12_32;
        Object object;
        Object object2;
        boolean bl2;
        int n3;
        Context context;
        Object object3;
        Object object4;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents2;
        Object object5;
        j j3;
        block27: {
            block26: {
                j3 = this;
                object5 = string2;
                jioEventTracker$TrackingEvents2 = jioEventTracker$TrackingEvents;
                object4 = this.b;
                JioAdView$AdState jioAdView$AdState = object4.k0();
                if (jioAdView$AdState == (object3 = JioAdView$AdState.DESTROYED)) {
                    return;
                }
                context = object4.Y();
                object3 = this.f;
                n3 = 1;
                try {
                    bl2 = ((ArrayList)object3).isEmpty() ^ n3;
                    if (!bl2) break block26;
                    object2 = CollectionsKt.firstOrNull((List)object3);
                    if ((object2 = (k)object2) == null) break block26;
                    object2 = ((k)object2).j;
                    Boolean bl3 = Boolean.TRUE;
                    bl2 = Intrinsics.areEqual(object2, bl3);
                    break block27;
                }
                catch (Exception exception) {}
            }
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object4, ": Mediation ad, event will be fired through IMA SDK");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            return;
        }
        object2 = j3.d;
        n n4 = ((com.jio.jioads.instreamads.vastparser.model.m)object2).a;
        if (n4 != null) {
            object = jioEventTracker$TrackingEvents.getType();
            ArrayList arrayList = n4.f((com.jio.jioads.instreamads.vastparser.model.m)object2, (String)object, (String)object5);
        } else {
            ArrayList arrayList = new ArrayList();
        }
        void var14_42 = var12_32;
        n n7 = ((com.jio.jioads.instreamads.vastparser.model.m)object2).a;
        if (n7 != null) {
            ArrayList arrayList = n7.k((com.jio.jioads.instreamads.vastparser.model.m)object2, (String)object5);
        } else {
            Object var12_36 = null;
        }
        Object object6 = JioEventTracker$TrackingEvents.EVENT_CREATIVE;
        if (jioEventTracker$TrackingEvents2 == object6 && var12_37 != null) {
            var14_42.addAll(var12_37);
            JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents3 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
        } else {
            JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents4 = jioEventTracker$TrackingEvents2;
        }
        int n8 = var14_42.size();
        Object object7 = "message";
        Object object8 = ": ";
        com.jio.jioads.common.c c2 = j3.c;
        if (n8 > 0) {
            void var25_67;
            void var5_12;
            int n10;
            StringBuilder stringBuilder = new StringBuilder();
            object6 = object4.P();
            stringBuilder.append((String)object6);
            stringBuilder.append((String)object8);
            stringBuilder.append(var12_40);
            object6 = " fired for adId: ";
            stringBuilder.append((String)object6);
            ir3_0.b(stringBuilder, object5, (String)object7);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            int[] nArray = object4.b();
            if (nArray != null) {
                object4 = new StringBuilder();
                object6 = "<this>";
                Intrinsics.checkNotNullParameter(nArray, (String)object6);
                int n14 = nArray.length;
                if (n14 == 0) {
                    boolean bl4 = false;
                    object6 = null;
                } else {
                    int n15 = nArray[0];
                    object6 = n15;
                }
                if (object6 != null) {
                    object6 = ((Integer)object6).toString();
                } else {
                    boolean bl5 = false;
                    object6 = null;
                }
                ((StringBuilder)object4).append((String)object6);
                char c3 = 'x';
                ((StringBuilder)object4).append(c3);
                Integer n16 = tp_2.D(nArray, n3);
                ((StringBuilder)object4).append(n16);
                String string3 = ((StringBuilder)object4).toString();
            } else {
                Object var5_11 = null;
            }
            object4 = (JioEventTracker)j3.z.getValue();
            object8 = n3;
            String string4 = this.p();
            object6 = c2;
            object6 = (com.jio.jioads.controller.f)c2;
            object7 = ((com.jio.jioads.controller.f)object6).a;
            object = j3.e;
            String string5 = com.jio.jioads.controller.o.o((o)object7, object5, string4, (Map)object);
            object5 = j3.i;
            if (object5 != null) {
                n10 = object5.getWidth();
                object5 = n10;
            } else {
                n10 = 0;
                object5 = null;
            }
            String string6 = String.valueOf(object5);
            object5 = j3.i;
            if (object5 != null) {
                n10 = object5.getHeight();
                object5 = n10;
            } else {
                n10 = 0;
                object5 = null;
            }
            String string7 = String.valueOf(object5);
            if (context != null) {
                Object object9 = object5 = ((com.jio.jioads.instreamads.vastparser.model.m)object2).b(context, 0, (ArrayList)object3);
            } else {
                Object var25_66 = null;
            }
            boolean bl6 = ((com.jio.jioads.controller.f)object6).a.a();
            n10 = ((com.jio.jioads.controller.f)object6).a.k;
            String string8 = j3.M;
            object7 = j3.b;
            boolean bl7 = true;
            int n17 = 229376;
            object = object4;
            object6 = var12_40;
            object5 = c2;
            void var19_54 = var5_12;
            JioEventTracker.fireEvents$default((JioEventTracker)object4, (JioEventTracker$TrackingEvents)var12_40, (com.jio.jioads.common.b)object7, (List)var14_42, (Integer)object8, (String)var5_12, bl7, false, string5, false, string6, string7, (String)var25_67, bl6, n10, string8, null, null, null, n17, null);
        } else {
            object5 = c2;
            StringBuilder stringBuilder = new StringBuilder();
            object4 = object4.P();
            stringBuilder.append((String)object4);
            stringBuilder.append((String)object8);
            stringBuilder.append((Object)jioEventTracker$TrackingEvents2);
            stringBuilder.append(" url is not present in response");
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)object7);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents5 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
        object4 = "type";
        String string9 = "campaignid";
        if (var12_40 == jioEventTracker$TrackingEvents5) {
            String string10 = this.p();
            if (string10 == null) return;
            Object object10 = object5;
            com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)object5;
            f5.getClass();
            Intrinsics.checkNotNullParameter(string10, string9);
            object5 = "i";
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            object4 = f5.a;
            ((o)object4).v(string10, (String)object5);
            return;
        }
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents6 = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
        if (var12_40 != jioEventTracker$TrackingEvents6) return;
        String string11 = this.p();
        if (string11 == null) return;
        Object object11 = object5;
        com.jio.jioads.controller.f f6 = (com.jio.jioads.controller.f)object5;
        f6.getClass();
        Intrinsics.checkNotNullParameter(string11, string9);
        object5 = "cv";
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object4 = f6.a;
        ((o)object4).v(string11, (String)object5);
    }

    public final void j(String string2, String string3, String object, JioAdError$JioAdErrorType jioAdError$JioAdErrorType) {
        Object object2 = new StringBuilder();
        l_0.d(this.b, object2, ": Error in Audio Renderer: ", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        JioAdError jioAdError = j_0.c(JioAdError.Companion, jioAdError$JioAdErrorType, (String)object);
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        object = this.a;
        ((V)object).d(jioAdError, false, d2, string2, "NativeAdController", string3, null);
    }

    public final void k(int n3) {
        TextView textView = new StringBuilder();
        Object object = this.b.P();
        textView.append((String)object);
        textView.append(" :initializing Skip for instream audio ad.skipOffset: ");
        textView.append(n3);
        textView = textView.toString();
        object = "message";
        Intrinsics.checkNotNullParameter(textView, object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        textView = JioAds$LogLevel.NONE;
        textView = this.l;
        if (textView != null) {
            int n4 = 3;
            int n7 = 2;
            int n8 = 1;
            Drawable[] drawableArray = null;
            if (n3 >= 0) {
                if (n3 == 0) {
                    ((V)this.a).p();
                    Object object2 = this.l;
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object2);
                        object2 = object2.getContentDescription();
                        if (object2 != null) {
                            object2 = this.l;
                            Intrinsics.checkNotNull(object2);
                            object2 = ((Object)object2.getContentDescription()).toString();
                            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                            if (!bl2) {
                                textView = this.l;
                                Intrinsics.checkNotNull(textView);
                                textView.setText((CharSequence)object2);
                            }
                        }
                    }
                    if ((object2 = this.s) != null) {
                        object2 = this.l;
                        Intrinsics.checkNotNull(object2);
                        textView = this.s;
                        Intrinsics.checkNotNull(textView);
                        textView = textView[0];
                        Drawable[] drawableArray2 = this.s;
                        Intrinsics.checkNotNull(drawableArray2);
                        Drawable drawable2 = drawableArray2[n8];
                        drawableArray2 = this.s;
                        Intrinsics.checkNotNull(drawableArray2);
                        Drawable drawable3 = drawableArray2[n7];
                        drawableArray2 = this.s;
                        Intrinsics.checkNotNull(drawableArray2);
                        object = drawableArray2[n4];
                        object2.setCompoundDrawables((Drawable)textView, drawable2, drawable3, (Drawable)object);
                    }
                    object2 = this.l;
                    Intrinsics.checkNotNull(object2);
                    object2.setVisibility(0);
                } else {
                    f f5;
                    int n10 = this.B;
                    long l2 = n3 *= n10;
                    long l3 = n10;
                    object = f5;
                    j j3 = this;
                    this.A = f5 = new f(this, l2, l3);
                    f5.start();
                }
            } else {
                Intrinsics.checkNotNull(textView);
                Object object3 = textView.getContentDescription();
                if (object3 != null) {
                    object3 = this.l;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((Object)object3.getContentDescription()).toString();
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                    if (!bl3) {
                        textView = this.l;
                        Intrinsics.checkNotNull(textView);
                        textView.setText((CharSequence)object3);
                    }
                }
                if ((object3 = this.s) != null) {
                    object3 = this.l;
                    Intrinsics.checkNotNull(object3);
                    textView = this.s;
                    Intrinsics.checkNotNull(textView);
                    textView = textView[0];
                    drawableArray = this.s;
                    Intrinsics.checkNotNull(drawableArray);
                    Drawable drawable4 = drawableArray[n8];
                    drawableArray = this.s;
                    Intrinsics.checkNotNull(drawableArray);
                    Drawable drawable5 = drawableArray[n7];
                    drawableArray = this.s;
                    Intrinsics.checkNotNull(drawableArray);
                    object = drawableArray[n4];
                    object3.setCompoundDrawables((Drawable)textView, drawable4, drawable5, (Drawable)object);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        Exception exception2;
        Object object;
        block4: {
            Object object2;
            block3: {
                object2 = "message";
                object = this.b;
                try {
                    boolean bl2;
                    CharSequence charSequence = new StringBuilder();
                    String string2 = object.P();
                    charSequence.append(string2);
                    string2 = " :Doing resource cleanup for audio ad";
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    Intrinsics.checkNotNullParameter(charSequence, (String)object2);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    this.r = bl2 = true;
                    object2 = this.F;
                    charSequence = null;
                    if (object2 == null) break block3;
                    this.F = null;
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if ((object2 = this.m) != null) {
                Intrinsics.checkNotNull(object2);
                object2.pause();
                object2 = this.m;
                Intrinsics.checkNotNull(object2);
                object2.b();
                this.m = null;
            }
            object2 = this.f;
            ((ArrayList)object2).clear();
            this.p = null;
            this.i = null;
            return;
        }
        object = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, " :Getting error in resource cleanup for audio ad : ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void m() {
        String string2;
        Object object;
        boolean bl2 = this.y;
        com.jio.jioads.controller.a a2 = this.a;
        boolean bl3 = this.q;
        if (bl2 && !bl3) {
            object = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
            string2 = this.o();
            this.i(string2, (JioEventTracker$TrackingEvents)((Object)object));
            object = a2;
            object = (V)a2;
            ((V)object).l();
        } else if (!bl3) {
            object = JioEventTracker$TrackingEvents.EVENT_SKIP;
            string2 = this.o();
            this.i(string2, (JioEventTracker$TrackingEvents)((Object)object));
        }
        object = JioEventTracker$TrackingEvents.EVENT_CLOSE;
        string2 = this.o();
        this.i(string2, (JioEventTracker$TrackingEvents)((Object)object));
        bl2 = this.y;
        ((V)a2).h(bl2, false);
    }

    public final void n() {
        Object object;
        j j3 = this;
        boolean bl2 = this.O;
        if (!bl2) {
            return;
        }
        bl2 = this.P;
        if (bl2) {
            return;
        }
        Object object2 = this.h;
        if (object2 != null) {
            object = Utility.INSTANCE;
            Intrinsics.checkNotNull(object2);
            int n3 = 5;
            bl2 = ((Utility)object).checkVisibility((ViewGroup)object2, n3);
            if (!bl2) {
                return;
            }
        }
        object2 = j3.E;
        object = j3.b;
        if (object2 != null && (object2 = object2.j) != null) {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            boolean bl3;
            int n4;
            Object object7 = new ArrayList();
            object2 = object2.iterator();
            while (true) {
                n4 = object2.hasNext();
                bl3 = true;
                if (n4 == 0) break;
                object5 = object6 = object2.next();
                object5 = (com.jio.jioads.instreamads.vastparser.model.i)object6;
                object4 = ((com.jio.jioads.instreamads.vastparser.model.i)object5).a;
                object3 = "creativeView";
                boolean bl4 = kotlin.text.b.i(object4, (String)object3, bl3);
                if (!bl4 && !(bl3 = kotlin.text.b.i(object5 = ((com.jio.jioads.instreamads.vastparser.model.i)object5).a, object4 = "impression", bl3))) continue;
                ((ArrayList)object7).add(object6);
            }
            n4 = yx_2.o(object7, 10);
            object2 = new ArrayList(n4);
            object7 = ((ArrayList)object7).iterator();
            while ((n4 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                object6 = ((com.jio.jioads.instreamads.vastparser.model.i)object7.next()).b;
                object2.add(object6);
            }
            ArrayList arrayList = CollectionsKt.m0((Collection)object2);
            object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, ": EVENT_IMPRESSION fired  Companion adId: ");
            object = this.o();
            object2.append((String)object);
            Intrinsics.checkNotNullParameter(object2.toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            j3.P = bl3;
            object2 = j3.z.getValue();
            object5 = object2;
            object5 = (JioEventTracker)object2;
            object4 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
            boolean bl5 = ((com.jio.jioads.controller.f)j3.c).a.a();
            object2 = j3.M;
            Integer n7 = 0;
            object3 = j3.b;
            JioEventTracker.fireEvents$default(object5, (JioEventTracker$TrackingEvents)((Object)object4), (com.jio.jioads.common.b)object3, arrayList, n7, null, true, false, "", false, null, null, null, bl5, 10, (String)object2, null, null, null, 229376, null);
            return;
        }
        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": impression url not found for selected companion ad!");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }

    public final String o() {
        Object object;
        block5: {
            try {
                object = this.f;
            }
            catch (Exception exception) {}
            object = CollectionsKt.firstOrNull((List)object);
            object = (k)object;
            if (object == null) break block5;
            object = ((k)object).c;
        }
        object = null;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String p() {
        Object object;
        block16: {
            boolean bl2;
            block15: {
                block14: {
                    String string2 = null;
                    try {
                        object = this.c;
                    }
                    catch (Exception exception) {
                        return string2;
                    }
                    object = (com.jio.jioads.controller.f)object;
                    object = ((com.jio.jioads.controller.f)object).a;
                    bl2 = ((o)object).o;
                    if (!bl2) break block14;
                    object = this.f;
                    object = CollectionsKt.firstOrNull((List)object);
                    object = (k)object;
                    if (object == null) return string2;
                    return ((k)object).n;
                }
                object = this.d;
                object = ((com.jio.jioads.instreamads.vastparser.model.m)object).a;
                if (object == null) break block15;
                object = ((n)object).f;
                break block16;
            }
            bl2 = false;
            object = null;
        }
        return this.b((ArrayList)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q() {
        Exception exception2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        Object object6;
        Object object7;
        j j3;
        block23: {
            int n3;
            String string2;
            Object object8;
            int n4;
            int n7;
            Object object9;
            block21: {
                block22: {
                    block20: {
                        j3 = this;
                        object9 = "null cannot be cast to non-null type android.widget.TextView";
                        object7 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                        object6 = "message";
                        object5 = this.b;
                        bl2 = false;
                        object4 = null;
                        try {
                            object3 = Utility.INSTANCE;
                            object2 = object5.P();
                            this.M = object3 = ((Utility)object3).getCcbValue((String)object2);
                            object3 = new StringBuilder();
                            object2 = object5.P();
                            ((StringBuilder)object3).append((String)object2);
                            object2 = " :Inflating instream audio layout";
                            ((StringBuilder)object3).append((String)object2);
                            object3 = ((StringBuilder)object3).toString();
                            Intrinsics.checkNotNullParameter(object3, object6);
                            object3 = JioAds.Companion;
                            object2 = ((JioAds$Companion)object3).getInstance();
                            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            object2 = object5.k0();
                            object = JioAdView$AdState.DESTROYED;
                            if (object2 == object) {
                                return;
                            }
                            object2 = object5.Y();
                            if (object2 != null) {
                                object = "layout_inflater";
                                object = object2.getSystemService((String)object);
                                break block20;
                            }
                            n7 = 0;
                            object = null;
                        }
                        catch (Exception exception2) {}
                    }
                    n4 = object instanceof LayoutInflater;
                    if (n4 == 0) break block22;
                    object = (LayoutInflater)object;
                    break block21;
                    break block23;
                }
                n7 = 0;
                object = null;
            }
            if (object != null) {
                n4 = R$layout.jio_instream_audio_ad_layout;
                object = object.inflate(n4, null);
            } else {
                n7 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object, (String)object7);
            object = (RelativeLayout)object;
            j3.h = object;
            String string3 = "id";
            if (object != null) {
                object8 = object2.getResources();
                string2 = "audioAdContainer";
                String string4 = object2.getPackageName();
                int n8 = object8.getIdentifier(string2, string3, string4);
                object = object.findViewById(n8);
            } else {
                n7 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object, (String)object7);
            object = (RelativeLayout)object;
            j3.i = object;
            if (object != null) {
                n3 = 17170445;
                n3 = t70.getColor((Context)object2, n3);
                object.setBackgroundColor(n3);
            }
            if ((object7 = j3.h) != null) {
                object = object2.getResources();
                object8 = "audioAdProgressCounter";
                string2 = object2.getPackageName();
                n7 = object.getIdentifier((String)object8, string3, string2);
                object7 = object7.findViewById(n7);
            } else {
                n3 = 0;
                object7 = null;
            }
            Intrinsics.checkNotNull(object7, (String)object9);
            object7 = (TextView)object7;
            j3.k = object7;
            object7 = j3.h;
            if (object7 != null) {
                object = object2.getResources();
                object8 = "audioAdProgressBar";
                string2 = object2.getPackageName();
                n7 = object.getIdentifier((String)object8, string3, string2);
                object7 = object7.findViewById(n7);
            } else {
                n3 = 0;
                object7 = null;
            }
            object = "null cannot be cast to non-null type android.widget.ProgressBar";
            Intrinsics.checkNotNull(object7, (String)object);
            object7 = (ProgressBar)object7;
            j3.j = object7;
            object7 = j3.h;
            if (object7 != null) {
                object = object2.getResources();
                object8 = "skipAdTextView";
                string2 = object2.getPackageName();
                n7 = object.getIdentifier((String)object8, string3, string2);
                object7 = object7.findViewById(n7);
            } else {
                n3 = 0;
                object7 = null;
            }
            Intrinsics.checkNotNull(object7, (String)object9);
            object7 = (TextView)object7;
            j3.l = object7;
            boolean bl3 = this.r();
            if (bl3) {
                object9 = new StringBuilder();
                object7 = object5.P();
                ((StringBuilder)object9).append((String)object7);
                object7 = ": Exoplayer Enable";
                ((StringBuilder)object9).append((String)object7);
                object9 = ((StringBuilder)object9).toString();
                Intrinsics.checkNotNullParameter(object9, object6);
                object9 = ((JioAds$Companion)object3).getInstance();
                ((JioAds)object9).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                j3.m = object9 = new d((com.jio.jioads.common.b)object5);
            } else {
                object9 = new StringBuilder();
                object7 = object5.P();
                ((StringBuilder)object9).append((String)object7);
                object7 = ": MediaPlayer Enable";
                ((StringBuilder)object9).append((String)object7);
                object9 = ((StringBuilder)object9).toString();
                Intrinsics.checkNotNullParameter(object9, object6);
                object9 = ((JioAds$Companion)object3).getInstance();
                ((JioAds)object9).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                j3.m = object9 = new com.jio.jioads.instream.audio.mediaplayerforaudio.e((Context)object2);
            }
            this.u();
            return;
        }
        object7 = new StringBuilder("Error while inflating audio ad layout: ");
        object3 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception2, (StringBuilder)object7);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object7 = JioAds$LogLevel.NONE;
        object7 = JioAdError.Companion;
        object6 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        Object object10 = "Error in InStream audio ad";
        object7 = j_0.c((t_0)object7, (JioAdError$JioAdErrorType)((Object)object6), (String)object10);
        object2 = object5.k0();
        object = JioAdView$AdState.DESTROYED;
        if (object2 != object) {
            object4 = object5.Y();
        }
        object2 = object4;
        object = object5.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        String string5 = "exception:";
        object4 = new StringBuilder(string5);
        String string6 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object4);
        object4 = (com.jio.jioads.controller.f)j3.c;
        com.jio.jioads.cdnlogging.a a2 = object4.a.T();
        bl2 = object4.a.a();
        object4 = bl2;
        object5 = object5.q0();
        String string7 = ((JioAdError)object7).getErrorCode();
        String string8 = "Exception in inflating layout in InStream Audio Ad";
        String string9 = "InStreamAudioRenderer";
        object7 = string5;
        string5 = object4;
        object4 = object10;
        object10 = object5;
        ((Utility)object3).logError((Context)object2, (String)object, d2, string8, string6, a2, string9, (Boolean)((Object)string5), (String)object5, string7, false);
        object5 = new StringBuilder((String)object7);
        String string10 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object5);
        object7 = "InStreamAudioRenderer";
        j3.j((String)object7, string10, (String)object4, (JioAdError$JioAdErrorType)((Object)object6));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean r() {
        Exception exception2;
        Object object;
        Object object2;
        CharSequence charSequence;
        block3: {
            int n3;
            String string2;
            block2: {
                string2 = "plr";
                charSequence = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                object2 = this.e;
                object = ((com.jio.jioads.controller.f)this.c).a;
                boolean bl2 = ((o)object).u;
                if (!bl2) return 0 != 0;
                try {
                    object = Constants$HeaderKeys.JIO_DATA;
                    String string3 = ((Constants$HeaderKeys)((Object)object)).getKey();
                    Locale locale = Locale.ROOT;
                    string3 = string3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string3, charSequence);
                    boolean bl3 = object2.containsKey(string3);
                    if (!bl3) return 0 != 0;
                    object = ((Constants$HeaderKeys)((Object)object)).getKey();
                    object = ((String)object).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object, charSequence);
                    charSequence = object2.get(object);
                    if (charSequence != null) break block2;
                    charSequence = "{}";
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            if ((n3 = (object2 = new JSONObject(charSequence)).has(string2)) == 0) return 0 != 0;
            int n4 = object2.getInt(string2);
            if (n4 != (n3 = 1)) return 0 != 0;
            return n3 != 0;
        }
        charSequence = new StringBuilder();
        object2 = this.b;
        object = ": Exception while getting PLAYER flag ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)charSequence, (String)object);
        l_0.f(exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return 0 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s() {
        block25: {
            block26: {
                block24: {
                    var1_1 = this;
                    var2_2 = -1;
                    var3_3 = 1;
                    var4_4 = this.c;
                    var5_5 = this.b;
                    var6_6 = null;
                    try {
                        var7_7 = this.d;
                        var7_7 = var7_7.a;
                        var8_8 = null;
                        if (var7_7 == null || (var7_7 = var7_7.b(var9_9 /* !! */  = this.o())) == null) break block24;
                        var10_10 = var7_7.length() - var3_3;
                        var11_11 = 0;
                        var12_12 = null;
                        var13_13 = 0;
                        var14_14 = 0.0f;
                        var15_15 /* !! */  = null;
                    }
                    catch (Exception var20_20) {
                        break block25;
                    }
                    while (var11_11 <= var10_10) {
                        var16_16 = var13_13 == 0 ? var11_11 : var10_10;
                        var16_16 = var7_7.charAt(var16_16);
                        var17_17 = 32;
                        if ((var16_16 = Intrinsics.compare(var16_16, var17_17)) <= 0) {
                            var16_16 = 1;
                            var18_18 = 1.4E-45f;
                        } else {
                            var16_16 = 0;
                            var18_18 = 0.0f;
                            var19_19 = null;
                        }
                        if (var13_13 == 0) {
                            if (var16_16 == 0) {
                                var13_13 = 1;
                                var14_14 = 1.4E-45f;
                                continue;
                            }
                            var11_11 += var3_3;
                            continue;
                        }
                        if (var16_16 == 0) break;
                        var10_10 += var2_2;
                    }
                    var7_7 = var7_7.subSequence(var11_11, var10_10 += var3_3);
                    var7_7 = var7_7.toString();
                    break block26;
                }
                var7_7 = null;
            }
            var9_9 /* !! */  = new StringBuilder();
            var12_12 = var5_5.P();
            var9_9 /* !! */ .append((String)var12_12);
            var12_12 = " :Showing default companion ad.Audio click url= ";
            var9_9 /* !! */ .append((String)var12_12);
            var9_9 /* !! */ .append((String)var7_7);
            var9_9 /* !! */  = var9_9 /* !! */ .toString();
            com.jio.jioads.util.j.a(var9_9 /* !! */ );
            var9_9 /* !! */  = var1_1.k;
            if (var9_9 /* !! */  != null) {
                Intrinsics.checkNotNull(var9_9 /* !! */ );
                var9_9 /* !! */ .setVisibility(0);
            }
            if ((var8_8 = var5_5.k0()) != (var9_9 /* !! */  = JioAdView$AdState.DESTROYED)) ** GOTO lbl-1000
            return;
lbl-1000:
            // 1 sources

            {
                var8_8 = var5_5.Y();
                var9_9 /* !! */  = new ImageView((Context)var8_8);
                var11_11 = var1_1.G;
                if (var11_11 == var2_2 || (var11_11 = var1_1.H) == var2_2) ** GOTO lbl78
                var12_12 = Utility.INSTANCE;
                var13_13 = var1_1.G;
            }
            var14_14 = var13_13;
            {
                var13_13 = var12_12.convertDpToPixel(var14_14);
                var16_16 = var1_1.H;
            }
            var18_18 = var16_16;
            {
                block27: {
                    var11_11 = var12_12.convertDpToPixel(var18_18);
                    var20_21 = new ViewGroup.LayoutParams(var13_13, var11_11);
                    break block27;
lbl78:
                    // 1 sources

                    var20_21 = var12_12 = new ViewGroup.LayoutParams(var2_2, var2_2);
                }
                var9_9 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)var20_21);
                if (var8_8 != null && (var20_21 = var8_8.getResources()) != null && (var20_21 = var20_21.getConfiguration()) != null) {
                    var2_2 = var20_21.orientation;
                    var20_21 = var2_2;
                } else {
                    var2_2 = 0;
                    var20_21 = null;
                }
                var12_12 = "drawable";
                if (var20_21 == null) ** GOTO lbl-1000
                var13_13 = var20_21.intValue();
                var16_16 = 2;
                var18_18 = 2.8E-45f;
                if (var13_13 == var16_16) {
                    var20_21 = var1_1.J;
                    if (var20_21 != null) {
                        var21_23 = "Selecting publisher passed landscape default image";
                        com.jio.jioads.util.j.a((String)var21_23);
                    } else {
                        var20_21 = var8_8.getResources();
                        var21_23 = var8_8.getResources();
                        var15_15 /* !! */  = "jio_audio_landscape_default";
                        var8_8 = var8_8.getPackageName();
                        var3_3 = var21_23.getIdentifier((String)var15_15 /* !! */ , (String)var12_12, (String)var8_8);
                        var8_8 = WK2.a;
                        var20_21 = var20_21.getDrawable(var3_3, null);
                        var21_23 = new StringBuilder();
                        var8_8 = var5_5.P();
                        var21_23.append((String)var8_8);
                        var8_8 = ": Selecting predefined landscape default image";
                        var21_23.append((String)var8_8);
                        var21_23 = var21_23.toString();
                        com.jio.jioads.util.j.a((String)var21_23);
                    }
                    var9_9 /* !! */ .setImageDrawable((Drawable)var20_21);
                    var20_21 = new StringBuilder();
                    var21_23 = var5_5.P();
                    var20_21.append((String)var21_23);
                    var21_23 = ": default landscape Companion visible";
                    var20_21.append((String)var21_23);
                    var20_21 = var20_21.toString();
                    com.jio.jioads.util.j.a((String)var20_21);
                } else if (var20_21 != null && (var2_2 = var20_21.intValue()) == var3_3) {
                    var20_21 = var1_1.I;
                    if (var20_21 != null) {
                        var21_24 /* !! */  = new StringBuilder();
                        var8_8 = var5_5.P();
                        var21_24 /* !! */ .append((String)var8_8);
                        var8_8 = ": Selecting publisher passed portrait default image";
                        var21_24 /* !! */ .append((String)var8_8);
                        var21_24 /* !! */  = var21_24 /* !! */ .toString();
                        com.jio.jioads.util.j.a((String)var21_24 /* !! */ );
                    } else {
                        var20_21 = var8_8.getResources();
                        var21_25 = var8_8.getResources();
                        var15_15 /* !! */  = "jio_audio_portrait_default";
                        var8_8 = var8_8.getPackageName();
                        var3_3 = var21_25.getIdentifier((String)var15_15 /* !! */ , (String)var12_12, (String)var8_8);
                        var8_8 = WK2.a;
                        var20_21 = var20_21.getDrawable(var3_3, null);
                        var21_25 = new StringBuilder();
                        var8_8 = var5_5.P();
                        var21_25.append((String)var8_8);
                        var8_8 = ": Selecting predefined portrait default image";
                        var21_25.append((String)var8_8);
                        var21_25 = var21_25.toString();
                        com.jio.jioads.util.j.a((String)var21_25);
                    }
                    var9_9 /* !! */ .setImageDrawable((Drawable)var20_21);
                }
                var20_21 = new i(var1_1, (String)var7_7);
                var9_9 /* !! */ .setOnClickListener((View.OnClickListener)var20_21);
                var20_21 = var1_1.i;
                if (var20_21 != null) {
                    var20_21.removeAllViews();
                }
                if ((var20_21 = var1_1.i) != null) {
                    var20_21.addView((View)var9_9 /* !! */ );
                }
                var20_21 = var4_4;
                var20_21 = (com.jio.jioads.controller.f)var4_4;
                var20_21.g();
                var2_2 = var1_1.u;
                var1_1.k(var2_2);
                return;
            }
        }
        var21_26 = new StringBuilder("Error while loading DefaultCompanion audio ad : ");
        var8_8 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var8_8, var20_20, (StringBuilder)var21_26);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var21_26 = JioAds$LogLevel.NONE;
        var21_26 = JioAdError.Companion;
        var7_7 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        var21_26.getClass();
        var21_26 = t_0.a((JioAdError$JioAdErrorType)var7_7);
        var9_9 /* !! */  = var5_5.k0();
        var12_12 = JioAdView$AdState.DESTROYED;
        if (var9_9 /* !! */  != var12_12) {
            var6_6 = var5_5.Y();
        }
        var9_9 /* !! */  = var6_6;
        var12_12 = var5_5.P();
        var15_15 /* !! */  = com.jio.jioads.cdnlogging.d.a;
        var19_19 = var7_7.getErrorTitle();
        var22_27 = "exception:";
        var6_6 = new StringBuilder((String)var22_27);
        var23_28 = com.jio.jioads.instream.audio.a.a(var20_20, (StringBuilder)var6_6);
        var4_4 = (com.jio.jioads.controller.f)var4_4;
        var6_6 = var4_4.a;
        var24_29 = var6_6.T();
        var25_30 = var4_4.a.a();
        var4_4 = var25_30;
        var26_31 = var5_5.q0();
        var27_32 = var21_26.getErrorCode();
        var28_33 = "resumeAudioAd";
        var21_26 = var22_27;
        var22_27 = var4_4;
        var8_8.logError((Context)var9_9 /* !! */ , (String)var12_12, var15_15 /* !! */ , var19_19, var23_28, var24_29, var28_33, (Boolean)var4_4, var26_31, var27_32, false);
        var4_4 = var7_7.getErrorTitle();
        var5_5 = new StringBuilder((String)var21_26);
        var20_22 = com.jio.jioads.instream.audio.a.a(var20_20, (StringBuilder)var5_5);
        var21_26 = "resumeAudioAd";
        var1_1.j((String)var21_26, (String)var4_4, var20_22, (JioAdError$JioAdErrorType)var7_7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t() {
        Exception exception2;
        Object object;
        boolean bl2;
        Object object2;
        j j3;
        block8: {
            CharSequence charSequence;
            Object object3;
            block7: {
                j3 = this;
                object3 = "message";
                object2 = this.b;
                bl2 = false;
                object = null;
                try {
                    charSequence = new StringBuilder();
                    String string2 = object2.P();
                    charSequence.append(string2);
                    string2 = ": inside performCompletionTask of JioInstreamAudio";
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    Intrinsics.checkNotNullParameter(charSequence, (String)object3);
                    object3 = JioAds.Companion;
                    object3 = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = this.A;
                    if (object3 == null) break block7;
                    this.A = null;
                }
                catch (Exception exception2) {
                    break block8;
                }
            }
            if ((object3 = j3.m) != null) {
                object3.pause();
            }
            if ((object3 = j3.m) != null) {
                object3.b();
            }
            j3.m = null;
            object3 = j3.p;
            if (object3 == null) {
                this.l();
                return;
            }
            charSequence = j3.h;
            object3.removeView((View)charSequence);
            object3 = j3.i;
            if (object3 != null) {
                object3.removeAllViews();
            }
            this.l();
            return;
        }
        Object object4 = new StringBuilder("Exception while performing CompletionTask of audio ad: ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, (StringBuilder)object4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = JioAdError.Companion;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        object4.getClass();
        object4 = t_0.a(jioAdError$JioAdErrorType);
        JioAdView$AdState jioAdView$AdState = object2.k0();
        Object object5 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState != object5) {
            object = object2.Y();
        }
        jioAdView$AdState = object;
        object5 = object2.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        Object object6 = "exception:";
        object = new StringBuilder((String)object6);
        String string3 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object);
        object = (com.jio.jioads.controller.f)j3.c;
        com.jio.jioads.cdnlogging.a a2 = object.a.T();
        bl2 = object.a.a();
        Boolean bl3 = bl2;
        object2 = object2.q0();
        String string4 = ((JioAdError)object4).getErrorCode();
        String string5 = "Exception while performing CompletionTask of audio ad";
        String string6 = "performCompletionTask";
        object = object6;
        object6 = object2;
        utility.logError((Context)jioAdView$AdState, (String)object5, d2, string5, string3, a2, string6, bl3, (String)object2, string4, false);
        object2 = new StringBuilder((String)object);
        String string7 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object2);
        object2 = "preparePlayer";
        object = "Exception while performing CompletionTask of audio ad";
        j3.j((String)object2, (String)object, string7, jioAdError$JioAdErrorType);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u() {
        var1_1 = this;
        var2_2 = "context";
        var3_5 = this.d;
        var4_6 = this.c;
        var5_7 /* !! */  = "message";
        var6_8 = this.b;
        var7_9 = null;
        try {
            var8_10 = var6_8.k0();
            var9_11 /* !! */  = JioAdView$AdState.DESTROYED;
            if (var8_10 == var9_11 /* !! */ ) {
                return;
            }
        }
        catch (Exception var2_3) {
            ** GOTO lbl118
        }
        var8_10 = var6_8.Y();
        if (var8_10 == null) {
            return;
        }
        var9_11 /* !! */  = this.f;
        var10_12 /* !! */  = null;
        if ((var9_11 /* !! */  = var3_5.b((Context)var8_10, 0, (ArrayList)var9_11 /* !! */ )) == null) {
            return;
        }
        this.K = var9_11 /* !! */ ;
        var11_13 = TextUtils.isEmpty((CharSequence)var9_11 /* !! */ );
        if (var11_13 || (var9_11 /* !! */  = this.m) == null) ** GOTO lbl157
        var9_11 /* !! */  = new StringBuilder();
        var12_14 /* !! */  = var6_8.P();
        var9_11 /* !! */ .append((String)var12_14 /* !! */ );
        var12_14 /* !! */  = " :preparing Instream Audio Player.Audio Ad Url: ";
        var9_11 /* !! */ .append((String)var12_14 /* !! */ );
        var12_14 /* !! */  = this.K;
        var9_11 /* !! */ .append((String)var12_14 /* !! */ );
        var9_11 /* !! */  = var9_11 /* !! */ .toString();
        Intrinsics.checkNotNullParameter((Object)var9_11 /* !! */ , var5_7 /* !! */ );
        var9_11 /* !! */  = JioAds.Companion;
        var9_11 /* !! */  = var9_11 /* !! */ .getInstance();
        var9_11 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var9_11 /* !! */  = JioAds$LogLevel.NONE;
        var3_5 = var3_5.c;
        var3_5 = CollectionsKt.N(0, (List)var3_5);
        var3_5 = (com.jio.jioads.instreamads.vastparser.model.j)var3_5;
        if (var3_5 != null) {
            var9_11 /* !! */  = var3_5.n;
        } else {
            var11_13 = false;
            var9_11 /* !! */  = null;
        }
        var12_14 /* !! */  = "";
        if (var9_11 /* !! */  == null || (var13_15 = (var9_11 /* !! */  = var3_5.n) != null ? var9_11 /* !! */ .b : null) == null) ** GOTO lbl-1000
        if (var9_11 /* !! */  != null) {
            var9_11 /* !! */  = var9_11 /* !! */ .b;
        } else {
            var11_13 = false;
            var9_11 /* !! */  = null;
        }
        var11_13 = TextUtils.isEmpty((CharSequence)var9_11 /* !! */ );
        if (!var11_13) {
            var3_5 = var3_5.n;
            if (var3_5 != null) {
                var3_5 = var3_5.b;
            } else {
                var14_17 = false;
                var3_5 = null;
            }
        } else lbl-1000:
        // 2 sources

        {
            var3_5 = var12_14 /* !! */ ;
        }
        var1_1.L = var3_5;
        var3_5 = var1_1.m;
        if (var3_5 != null) {
            var3_5.a(var1_1);
        }
        if ((var3_5 = var1_1.m) != null) {
            var9_11 /* !! */  = var1_1.K;
            var3_5.b((String)var9_11 /* !! */ );
        }
        if ((var3_5 = var1_1.m) == null) ** GOTO lbl102
        var9_11 /* !! */  = var1_1.L;
        var6_8.P();
        Intrinsics.checkNotNullParameter(var8_10, (String)var2_2);
        var13_15 = "common_prefs";
        var15_16 = "advid";
        var10_12 /* !! */  = j_0.d((Context)var8_10, var13_15, 0, (Object)var12_14 /* !! */ , var15_16);
        var12_14 /* !! */  = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull((Object)var10_12 /* !! */ , (String)var12_14 /* !! */ );
        var10_12 /* !! */  = (String)var10_12 /* !! */ ;
        {
            catch (Exception v0) {
                ** continue;
            }
lbl90:
            // 2 sources

            while (true) {
                Intrinsics.checkNotNullParameter(var8_10, (String)var2_2);
                var2_2 = var6_8.R();
                if (var2_2 != null) {
                    var2_2.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var8_10);
                }
                var2_2 = var4_6;
                var2_2 = (com.jio.jioads.controller.f)var4_6;
                var2_2 = var2_2.a;
                var2_2.a();
                var3_5.a((String)var9_11 /* !! */ );
lbl102:
                // 2 sources

                var2_2 = new StringBuilder();
                var3_5 = var6_8.P();
                var2_2.append((String)var3_5);
                var3_5 = " :calling startAudioAdPreprationTimer()";
                var2_2.append((String)var3_5);
                var2_2 = var2_2.toString();
                Intrinsics.checkNotNullParameter(var2_2, var5_7 /* !! */ );
                var2_2 = JioAds.Companion;
                var2_2 = var2_2.getInstance();
                var2_2.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_2 = JioAds$LogLevel.NONE;
                this.y();
                return;
            }
lbl118:
            // 1 sources

            var3_5 = new StringBuilder("Exception while preparing audio ad: ");
            var8_10 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var8_10, var2_3, (StringBuilder)var3_5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var3_5 = JioAds$LogLevel.NONE;
            var3_5 = JioAdError.Companion;
            var5_7 /* !! */  = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            var3_5.getClass();
            var3_5 = t_0.a((JioAdError$JioAdErrorType)var5_7 /* !! */ );
            var9_11 /* !! */  = var6_8.k0();
            var10_12 /* !! */  = JioAdView$AdState.DESTROYED;
            if (var9_11 /* !! */  != var10_12 /* !! */ ) {
                var7_9 = var6_8.Y();
            }
            var9_11 /* !! */  = var7_9;
            var10_12 /* !! */  = var6_8.P();
            var12_14 /* !! */  = com.jio.jioads.cdnlogging.d.a;
            var16_19 = "exception:";
            var7_9 = new StringBuilder((String)var16_19);
            var15_16 = com.jio.jioads.instream.audio.a.a(var2_3, (StringBuilder)var7_9);
            var4_6 = (com.jio.jioads.controller.f)var4_6;
            var7_9 = var4_6.a;
            var17_20 = var7_9.T();
            var18_21 = var4_6.a.a();
            var4_6 = var18_21;
            var19_22 = var6_8.q0();
            var20_23 = var3_5.getErrorCode();
            var13_15 = "Exception while preparing audio ad";
            var21_24 = "preparePlayer";
            var3_5 = var16_19;
            var16_19 = var4_6;
            var8_10.logError((Context)var9_11 /* !! */ , (String)var10_12 /* !! */ , var12_14 /* !! */ , var13_15, var15_16, var17_20, var21_24, (Boolean)var4_6, var19_22, var20_23, false);
            var4_6 = new StringBuilder((String)var3_5);
            var2_4 = com.jio.jioads.instream.audio.a.a(var2_3, (StringBuilder)var4_6);
            var3_5 = "preparePlayer";
            var4_6 = "Exception while preparing audio ad";
            var1_1.j((String)var3_5, (String)var4_6, var2_4, (JioAdError$JioAdErrorType)var5_7 /* !! */ );
            return;
lbl157:
            // 1 sources

            var2_2 = var1_1.j;
            if (var2_2 != null) {
                var14_18 = 8;
                var2_2.setVisibility(var14_18);
            }
            var2_2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            var3_5 = "showCompanion";
            var5_7 /* !! */  = "AudioUrl is found null";
            var8_10 = "URl Params missing for audio";
            var1_1.j((String)var3_5, var5_7 /* !! */ , (String)var8_10, (JioAdError$JioAdErrorType)var2_2);
            return;
        }
    }

    public final void v() {
        Object object;
        Object object2 = this.f;
        boolean bl2 = ((ArrayList)object2).isEmpty() ^ true;
        int n3 = 0;
        Integer n4 = null;
        if (bl2) {
            object2 = this.d.a;
            if (object2 != null) {
                object = this.o();
                object2 = (List)((n)object2).q.get(object);
            } else {
                bl2 = false;
                object2 = null;
            }
            this.w = object2;
            this.q();
        }
        object2 = new StringBuilder();
        object = this.b;
        String string2 = " : companionAdsList ----:";
        j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object2, string2);
        object = this.w;
        if (object != null) {
            n3 = object.size();
            n4 = n3;
        }
        ((StringBuilder)object2).append(n4);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w() {
        block33: {
            var1_1 = this;
            var2_2 = 1;
            var3_3 = "message";
            var4_4 = this.c;
            var5_5 = this.d;
            var6_6 = this.b;
            var7_7 = null;
            var8_8 = new StringBuilder();
            var9_9 /* !! */  = var6_6.P();
            var8_8.append(var9_9 /* !! */ );
            var9_9 /* !! */  = " :showAudioCompanionAd()";
            var8_8.append(var9_9 /* !! */ );
            var8_8 = var8_8.toString();
            com.jio.jioads.util.j.a((String)var8_8);
            var8_8 = this.p;
            if (var8_8 == null) ** GOTO lbl150
            var8_8 = this.E;
            if (var8_8 == null) ** GOTO lbl148
            var9_9 /* !! */  = var8_8.b;
            if (var9_9 /* !! */  != null) {
                var10_10 = new StringBuilder();
                var3_3 = var6_6.P();
                var10_10.append((String)var3_3);
                var3_3 = " :Loading companion ad with html resource:: ";
                var10_10.append((String)var3_3);
                var3_3 = this.E;
                var3_3 = var3_3 != null ? var3_3.b : null;
                var10_10.append((String)var3_3);
                var10_10 = var10_10.toString();
                com.jio.jioads.util.j.a((String)var10_10);
                var10_10 = var1_1.E;
                if (var10_10 != null) {
                    var10_10 = var10_10.b;
                } else {
                    var2_2 = 0;
                    var10_10 = null;
                }
                Intrinsics.checkNotNull(var10_10);
                var1_1.e((String)var10_10);
                return;
            }
            var9_9 /* !! */  = var8_8.a;
            if (var9_9 /* !! */  == null) ** GOTO lbl89
            var8_8 = new StringBuilder();
            var9_9 /* !! */  = var6_6.P();
            var8_8.append(var9_9 /* !! */ );
            var9_9 /* !! */  = " :Loading companion ad with static resource";
            var8_8.append(var9_9 /* !! */ );
            var8_8 = var8_8.toString();
            com.jio.jioads.util.j.a((String)var8_8);
            var8_8 = var5_5.a;
            if (var8_8 != null) {
                var9_9 /* !! */  = this.o();
                var11_16 /* !! */  = var5_5.a;
                var11_16 /* !! */  = var11_16 /* !! */  != null ? var11_16 /* !! */ .z : null;
                var8_8 = var8_8.c(var9_9 /* !! */ , (String)var11_16 /* !! */ );
            } else {
                var12_21 = 0;
                var8_8 = null;
            }
            var13_22 = 32;
            var11_16 /* !! */  = null;
            if (var8_8 == null || (var8_8 = var5_5.a) == null) break block33;
            var14_17 /* !! */  = this.o();
            var15_18 = var5_5.a;
            if (var15_18 != null) {
                var15_18 = var15_18.z;
            } else {
                var16_23 = 0;
                var15_18 = null;
            }
            var8_8 = var8_8.c((String)var14_17 /* !! */ , (String)var15_18);
            if (var8_8 == null) break block33;
            var17_24 = var8_8.length() - var2_2;
            var16_23 = 0;
            var15_18 = null;
            var18_25 = 0;
            var19_19 = null;
            ** GOTO lbl202
        }
        var12_21 = 0;
        var8_8 = null;
        ** GOTO lbl221
        {
            catch (Exception var10_11) {}
lbl89:
            // 1 sources

            Intrinsics.checkNotNull(var8_8);
            var10_13 = var8_8.c;
            if (var10_13 == null) return;
            var10_13 = new StringBuilder();
            var3_3 = var6_6.P();
            var10_13.append((String)var3_3);
            var3_3 = " :Loading companion ad with iframe resource";
            var10_13.append((String)var3_3);
            var10_13 = var10_13.toString();
            com.jio.jioads.util.j.a((String)var10_13);
            var10_13 = this.E;
            if (var10_13 != null) {
                var10_13 = var10_13.c;
            } else {
                var2_2 = 0;
                var10_13 = null;
            }
            Intrinsics.checkNotNull(var10_13);
            var10_13 = StringsKt.m0((CharSequence)var10_13);
            var10_13 = var10_13.toString();
            var2_2 = URLUtil.isValidUrl((String)var10_13);
            if (var2_2 != 0) {
                var10_13 = new StringBuilder();
                var3_3 = var6_6.P();
                var10_13.append((String)var3_3);
                var3_3 = " :Loading companion ad with iFrame URL resource";
                var10_13.append((String)var3_3);
                var10_13 = var10_13.toString();
                com.jio.jioads.util.j.a((String)var10_13);
                var10_13 = var1_1.E;
                if (var10_13 != null) {
                    var10_13 = var10_13.c;
                } else {
                    var2_2 = 0;
                    var10_13 = null;
                }
                Intrinsics.checkNotNull(var10_13);
                var1_1.e((String)var10_13);
                return;
            }
            var10_13 = new StringBuilder();
            var3_3 = var6_6.P();
            var10_13.append((String)var3_3);
            var3_3 = " :Loading companion ad with iFrame script resource";
            var10_13.append((String)var3_3);
            var10_13 = var10_13.toString();
            com.jio.jioads.util.j.a((String)var10_13);
            var10_13 = var1_1.E;
            if (var10_13 != null) {
                var10_13 = var10_13.c;
            } else {
                var2_2 = 0;
                var10_13 = null;
            }
            Intrinsics.checkNotNull(var10_13);
            var1_1.e((String)var10_13);
            return;
lbl148:
            // 1 sources

            this.s();
            return;
lbl150:
            // 1 sources

            var10_14 = new StringBuilder();
            var3_3 = var6_6.P();
            var10_14.append((String)var3_3);
            var3_3 = " :Container is null. Do not render companion ad";
            var10_14.append((String)var3_3);
            var10_14 = var10_14.toString();
            com.jio.jioads.util.j.a((String)var10_14);
            var10_14 = var4_4;
            var10_14 = (com.jio.jioads.controller.f)var4_4;
            var10_14.g();
            return;
            var3_3 = new StringBuilder("Exception while showing Audio CompanionAd: ");
            var8_8 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var8_8, var10_11, (StringBuilder)var3_3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var3_3 = JioAds$LogLevel.NONE;
            var3_3 = JioAdError.Companion;
            var5_5 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            var3_3.getClass();
            var3_3 = t_0.a((JioAdError$JioAdErrorType)var5_5);
            var9_9 /* !! */  = var6_6.k0();
            var11_16 /* !! */  = JioAdView$AdState.DESTROYED;
            if (var9_9 /* !! */  != var11_16 /* !! */ ) {
                var7_7 = var6_6.Y();
            }
            var9_9 /* !! */  = var7_7;
            var11_16 /* !! */  = var6_6.P();
            var14_17 /* !! */  = com.jio.jioads.cdnlogging.d.a;
            var15_18 = var10_11.toString();
            var22_27 = "exception:";
            var7_7 = new StringBuilder((String)var22_27);
            var19_19 = com.jio.jioads.instream.audio.a.a(var10_11, (StringBuilder)var7_7);
            var4_4 = (com.jio.jioads.controller.f)var4_4;
            var7_7 = var4_4.a;
            var21_20 = var7_7.T();
            var23_28 = var4_4.a.a();
            var4_4 = var23_28;
            var24_29 = var6_6.q0();
            var25_30 = var3_3.getErrorCode();
            var26_31 = "showCompanion";
            var3_3 = var22_27;
            var22_27 = var4_4;
            var8_8.logError((Context)var9_9 /* !! */ , (String)var11_16 /* !! */ , var14_17 /* !! */ , (String)var15_18, var19_19, var21_20, var26_31, (Boolean)var4_4, var24_29, var25_30, false);
            var4_4 = String.valueOf(var10_11.getMessage());
            var6_6 = new StringBuilder((String)var3_3);
            var10_15 = com.jio.jioads.instream.audio.a.a(var10_11, (StringBuilder)var6_6);
            var3_3 = "showCompanion";
            var1_1.j((String)var3_3, (String)var4_4, var10_15, (JioAdError$JioAdErrorType)var5_5);
            return;
lbl202:
            // 4 sources

            while (var16_23 <= var17_24) {
                var20_26 = var18_25 == 0 ? var16_23 : var17_24;
                var20_26 = var8_8.charAt(var20_26);
                if ((var20_26 = Intrinsics.compare(var20_26, var13_22)) <= 0) {
                    var20_26 = 1;
                } else {
                    var20_26 = 0;
                    var21_20 = null;
                }
                if (var18_25 == 0) {
                    if (var20_26 == 0) {
                        var18_25 = 1;
                        continue;
                    }
                    var16_23 += var2_2;
                    continue;
                }
                if (var20_26 == 0) break;
                var17_24 += -1;
            }
            var8_8 = var8_8.subSequence(var16_23, var17_24 += var2_2);
            var8_8 = var8_8.toString();
lbl221:
            // 2 sources

            var17_24 = TextUtils.isEmpty((CharSequence)var8_8);
            if (var17_24 != 0) {
                var5_5 = var5_5.a;
                if (var5_5 == null || (var5_5 = var5_5.b((String)(var8_8 = this.o()))) == null) {
                    var12_21 = 0;
                    var8_8 = null;
                } else {
                    var12_21 = var5_5.length() - var2_2;
                    var17_24 = 0;
                    var14_17 /* !! */  = null;
                    var16_23 = 0;
                    var15_18 = null;
                    while (var17_24 <= var12_21) {
                        var18_25 = var16_23 == 0 ? var17_24 : var12_21;
                        var18_25 = var5_5.charAt(var18_25);
                        if ((var18_25 = Intrinsics.compare(var18_25, var13_22)) <= 0) {
                            var18_25 = 1;
                        } else {
                            var18_25 = 0;
                            var19_19 = null;
                        }
                        if (var16_23 == 0) {
                            if (var18_25 == 0) {
                                var16_23 = 1;
                                continue;
                            }
                            var17_24 += var2_2;
                            continue;
                        }
                        if (var18_25 == 0) break;
                        var12_21 += -1;
                    }
                    var10_12 = var5_5.subSequence(var17_24, var12_21 += var2_2);
                    var8_8 = var10_12.toString();
                }
            }
            if ((var2_2 = TextUtils.isEmpty((CharSequence)var8_8)) != 0) {
                var8_8 = "#";
            }
            var10_12 = var1_1.E;
            Intrinsics.checkNotNull(var10_12);
            var10_12 = var10_12.a;
            Intrinsics.checkNotNull(var10_12);
            var5_5 = new StringBuilder();
            var9_9 /* !! */  = var6_6.P();
            var5_5.append(var9_9 /* !! */ );
            var9_9 /* !! */  = " : Loading companion ad with static resource.url= ";
            var5_5.append(var9_9 /* !! */ );
            var5_5.append((String)var10_12);
            var5_5 = var5_5.toString();
            Intrinsics.checkNotNullParameter(var5_5, (String)var3_3);
            var3_3 = JioAds.Companion;
            var3_3 = var3_3.getInstance();
            var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var3_3 = JioAds$LogLevel.NONE;
            var3_3 = new StringBuilder();
            var5_5 = "<!DOCTYPE html><html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>img {max-width: 100%; height:auto; position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);}</style></head><body><center><img onclick=\"window.open('";
            var3_3.append((String)var5_5);
            var3_3.append((String)var8_8);
            var5_5 = "')\" src=";
            var3_3.append((String)var5_5);
            var3_3.append((String)var10_12);
            var10_12 = "></center></body></html>";
            var3_3.append((String)var10_12);
            var10_12 = var3_3.toString();
            var1_1.e((String)var10_12);
            return;
        }
    }

    public final void x() {
        int n3;
        Object object;
        int n4;
        Object object2 = new StringBuilder();
        Object object3 = this.b;
        String string2 = ": inside startAudioAd ";
        j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2);
        boolean bl2 = this.q;
        ((StringBuilder)object2).append(bl2);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = new StringBuilder();
        j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object2, ": inside startAudioAd audioAdCompanionContainer ");
        Object object4 = this.p;
        ((StringBuilder)object2).append(object4);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = this.p;
        int n7 = 0;
        object4 = null;
        if (object2 != null && !bl2) {
            object2.removeAllViews();
            object2 = this.h;
            if (object2 != null) {
                object2 = object2.getParent();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object2 = this.h;
                if (object2 != null) {
                    object2 = object2.getParent();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.ViewGroup");
                object2 = (ViewGroup)object2;
                object = this.h;
                object2.removeView((View)object);
            }
            n3 = -2;
            object2 = new ViewGroup.LayoutParams(n3, n3);
            object = this.h;
            if (object != null) {
                object.setLayoutParams((ViewGroup.LayoutParams)object2);
            }
            object2 = this.p;
            if (object2 != null) {
                object = this.h;
                object2.addView((View)object);
            } else {
                object2 = new StringBuilder();
                object = ": Audio Companion Container is null so not showing companion ad";
                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object);
            }
            object2 = this.h;
            n3 = 0;
            object = null;
            if (object2 != null) {
                object2.setVisibility(0);
            }
            n4 = (int)(this.n ? 1 : 0);
            if (n4 == 0 && (object2 = this.j) != null) {
                object2.setVisibility(0);
            }
        }
        if ((n4 = this.r) == 0 && (n4 = this.n) != 0) {
            object2 = new StringBuilder();
            object = " :starting instream audio ad";
            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object);
            object2 = this.j;
            if (object2 != null) {
                n3 = 8;
                object2.setVisibility(n3);
            }
            object2 = this.m;
            if (object2 != null) {
                object2.start();
                object2 = JioAdView$AdState.STARTED;
                object3.j((JioAdView$AdState)((Object)object2));
                object2 = this.o();
                object = (V)this.a;
                ((V)object).i((String)object2);
                ((V)object).m();
            }
            object2 = this.l;
            n3 = 1;
            if (object2 != null && !bl2) {
                Intrinsics.checkNotNull(object2);
                object2 = object2.getCompoundDrawables();
                this.s = object2;
                object2 = this.l;
                Intrinsics.checkNotNull(object2);
                object2 = object2.getText();
                if (object2 != null) {
                    object2 = this.l;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((Object)object2.getText()).toString();
                    this.t = object2;
                }
                if ((object2 = this.l) != null) {
                    object2.setCompoundDrawables(null, null, null, null);
                }
                if ((n4 = this.u) == 0) {
                    object2 = this.l;
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object2);
                        int n8 = 3;
                        object4 = new sb_2(this, n8);
                        object2.setOnClickListener((View.OnClickListener)object4);
                    }
                    this.x = n3;
                }
            }
            if ((object2 = this.m) != null) {
                n7 = this.u;
                Intrinsics.checkNotNull(object2);
                n4 = object2.a() / 1000;
                if (n7 >= n4) {
                    object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, " :Skip offset is more or equal to audio ad duration so not showing skip button.ad duration: ");
                    object3 = this.m;
                    Intrinsics.checkNotNull(object3);
                    int n10 = object3.a() / 1000;
                    ((StringBuilder)object2).append(n10);
                    object3 = " and Skip offset: ";
                    ((StringBuilder)object2).append((String)object3);
                    n10 = this.u;
                    ((StringBuilder)object2).append(n10);
                    object2 = ((StringBuilder)object2).toString();
                    com.jio.jioads.util.j.a((String)object2);
                    this.u = n4 = -1;
                }
            }
            this.D = n3;
            if (!bl2) {
                this.w();
            }
        } else {
            object2 = new StringBuilder();
            string2 = ": Player is not yet prepared so audio will start once prepapration is completed";
            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2);
        }
    }

    public final void y() {
        int n3 = ((com.jio.jioads.controller.f)this.c).a.l;
        Object object = new StringBuilder();
        String string2 = this.b.P();
        object.append(string2);
        object.append(" :Inside startAudioAdPreprationTimer(): ");
        object.append(n3);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = new h(this, n3);
        com.jio.jioads.util.s.d((Function0)object);
    }
}

