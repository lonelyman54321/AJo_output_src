/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.jio.jioads.adinterfaces;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.AdMetaData;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdDetails;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$Companion;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsLoader;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.W;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.adinterfaces.a_0;
import com.jio.jioads.adinterfaces.b;
import com.jio.jioads.adinterfaces.b0;
import com.jio.jioads.adinterfaces.c0;
import com.jio.jioads.adinterfaces.c_0;
import com.jio.jioads.adinterfaces.d0;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.e0;
import com.jio.jioads.adinterfaces.f0;
import com.jio.jioads.adinterfaces.g0;
import com.jio.jioads.adinterfaces.i_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.d;
import com.jio.jioads.common.j;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.CompanionManager$Companion;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.instreamads.vmapParser.model.c;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.t;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.i;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.f;
import com.jio.jioads.util.k;
import com.jio.jioads.utils.Constants$CompanionAdSize;
import com.jio.jioads.utils.Constants$GENDER;
import com.jio.jioads.utils.Constants$KIDS_PROTECTED;
import com.jio.jioads.videomodule.JioVideoViewState;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioAdView {
    public static final JioAdView$Companion Companion;
    public int A;
    public JioAdView$VideoPlayerViewType A0;
    public int B;
    public com.jio.jioads.native.customsuport.a B0;
    public List C;
    public boolean C0;
    public JioAdView$VideoAdType D;
    public long D0;
    public String E;
    public boolean E0;
    public String F;
    public Integer F0;
    public String G;
    public int G0;
    public String H;
    public boolean H0;
    public String I;
    public boolean I0;
    public String J;
    public String J0;
    public int[] K;
    public String K0;
    public boolean L;
    public String L0;
    public boolean M;
    public String M0;
    public Object[] N;
    public String N0;
    public int O;
    public String O0;
    public boolean P;
    public String P0;
    public boolean Q;
    public String Q0;
    public boolean R;
    public String R0;
    public Integer S;
    public String S0;
    public Integer T;
    public String T0;
    public Integer U;
    public String U0;
    public int V;
    public Constants$KIDS_PROTECTED V0;
    public CountDownTimer W;
    public String W0;
    public int X;
    public String X0;
    public int Y;
    public String Y0;
    public double Z;
    public String Z0;
    public int a;
    public HashMap a0;
    public String a1;
    public boolean b;
    public Integer b0;
    public Constants$GENDER b1;
    public V c;
    public Integer c0;
    public String c1;
    public a_0 d;
    public int d0;
    public String d1;
    public ViewGroup e;
    public Integer e0;
    public String e1;
    public JioVmapAdsLoader$JioVmapListener f;
    public boolean f0;
    public String f1;
    public f g;
    public ViewGroup g0;
    public String g1;
    public boolean h;
    public JioAdView$AdPodVariant h0;
    public boolean h1;
    public W i;
    public Integer i0;
    public String i1;
    public ArrayList j;
    public int j0;
    public boolean k;
    public int k0;
    public Context l;
    public Boolean l0;
    public String m;
    public o m0;
    public JioAdView$AD_TYPE n;
    public int n0;
    public JioAdListener o;
    public boolean o0;
    public JioCompanionListener p;
    public boolean p0;
    public JioAdView$ORIENTATION_TYPE q;
    public JioAdView$AdState q0;
    public int[] r;
    public boolean r0;
    public String s;
    public boolean s0;
    public String t;
    public int t0;
    public String u;
    public boolean u0;
    public JioAdsMetadata v;
    public boolean v0;
    public Map w;
    public JioAds$MediaType w0;
    public boolean x;
    public boolean x0;
    public int y;
    public View y0;
    public boolean z;
    public HashMap z0;

    static {
        JioAdView$Companion jioAdView$Companion;
        Companion = jioAdView$Companion = new JioAdView$Companion();
    }

    public JioAdView(Context object, String object2, JioAdView$AD_TYPE object3) {
        double d2;
        int n3;
        Object object4;
        String string2;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "adspotId");
        Intrinsics.checkNotNullParameter(object3, "adType");
        int n4 = -1;
        Integer n7 = n4;
        this.a = n4;
        this.E = string2 = "";
        this.F = string2;
        this.G = string2;
        this.H = string2;
        this.I = string2;
        this.J = string2;
        this.O = 5;
        int n8 = 1;
        this.R = n8;
        this.S = object4 = Integer.valueOf(0);
        this.U = object4;
        this.V = n3 = 20;
        this.X = n3;
        this.Y = n3;
        this.Z = d2 = 1440.0;
        this.c0 = n7;
        this.d0 = n4;
        object4 = JioAdView$AdPodVariant.NONE;
        this.h0 = object4;
        this.i0 = n7;
        this.j0 = n4;
        this.k0 = n4;
        this.n0 = n4;
        this.l = object;
        int n10 = ((String)object2).length() - n8;
        n4 = 0;
        boolean bl2 = false;
        n7 = null;
        while (n4 <= n10) {
            n3 = !bl2 ? n4 : n10;
            n3 = ((String)object2).charAt(n3);
            int n14 = 32;
            if ((n3 = Intrinsics.compare(n3, n14)) <= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object4 = null;
            }
            if (!bl2) {
                if (n3 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n4;
                continue;
            }
            if (n3 == 0) break;
            n10 += -1;
        }
        object = com.jio.jioads.adinterfaces.a.a(n10, n8, n4, (String)object2);
        this.m = object;
        this.n = object3;
        object = JioAdView$AdState.NOT_REQUESTED;
        this.q0 = object;
        this.y = n10 = 30;
        super("Initializing JioAdView init: ");
        object3 = this.n;
        object3 = object3 != null ? object3.name() : null;
        object.append((String)object3);
        object.append(" - ");
        object3 = this.m;
        object.append((String)object3);
        com.jio.jioads.util.j.a(object.toString());
        object = new a_0(this);
        this.d = object;
        object = new V(this, (String)object2);
        this.c = object;
        object2 = this.d;
        Intrinsics.checkNotNull(object2);
        object3 = this.c;
        Intrinsics.checkNotNull(object3);
        object = new o((com.jio.jioads.common.b)object2, (com.jio.jioads.controller.a)object3);
        this.m0 = object;
        object = JioAds$MediaType.NONE;
        this.w0 = object;
        this.D0 = -1;
        this.G0 = 3;
    }

    public static final void a(JioAdView object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((JioAdView)object).m0;
        Intrinsics.checkNotNull(object);
        ((o)object).r(null);
    }

    public static final void a(JioAdView jioAdView, JioAdError jioAdError) {
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        JioAdListener jioAdListener = jioAdView.o;
        if (jioAdListener != null) {
            boolean bl2;
            jioAdView.I0 = bl2 = true;
            jioAdListener.onAdFailedToLoad(jioAdView, jioAdError);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(JioAdView object, JioAdsMetadata jioAdsMetadata, String string2, boolean bl2, String string3, String object2, String string4, Integer n3) {
        Object object3;
        Object object4;
        JioAdView jioAdView;
        Object object5;
        Object object6 = object;
        JioAdsMetadata jioAdsMetadata2 = jioAdsMetadata;
        Object object7 = string2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$vmapUrl");
        Object object8 = ((JioAdView)object).l;
        if (object8 == null) {
            object7 = JioAdError.Companion;
            object8 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            object8 = j_0.c((t_0)object7, (JioAdError$JioAdErrorType)((Object)object8), "Context is null");
            String string5 = "";
            jioAdsMetadata2 = null;
            String string6 = "JioAdView";
            Object var14_18 = null;
            object7 = object;
            object6 = null;
            Object var15_21 = null;
            String string7 = "cacheAd";
            int n4 = 64;
            Object var18_28 = null;
            JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)object, (JioAdError)object8, false, null, string7, string6, string5, null, n4, null);
            return;
        }
        Object object9 = Utility.INSTANCE;
        Intrinsics.checkNotNull(object8);
        boolean bl3 = ((Utility)object9).isInternetAvailable((Context)object8);
        if (!bl3) {
            object7 = new StringBuilder();
            object8 = ((JioAdView)object).m;
            j_0.k((StringBuilder)object7, (String)object8, ": Not connected to the Internet.Please check your connection and try again.");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object7 = JioAds$LogLevel.NONE;
            object7 = JioAdError.Companion;
            object8 = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
            object8 = j_0.c((t_0)object7, (JioAdError$JioAdErrorType)((Object)object8), "Not connected to the Internet.Please check your connection and try again.");
            object9 = com.jio.jioads.cdnlogging.d.c;
            String string8 = "";
            jioAdsMetadata2 = null;
            Object var13_16 = null;
            Object var14_19 = null;
            object7 = object;
            object6 = null;
            Object var16_24 = null;
            int n7 = 64;
            Object var18_29 = null;
            JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)object, (JioAdError)object8, false, (com.jio.jioads.cdnlogging.d)((Object)object9), null, null, string8, null, n7, null);
            return;
        }
        object8 = JioAdView$AdState.REQUESTED;
        ((JioAdView)object).q0 = object8;
        if (jioAdsMetadata != null) {
            ((JioAdView)object).setMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdsMetadata);
        }
        object8 = ((JioAdView)object6).d;
        Object object10 = null;
        if (object8 != null) {
            object5 = new Object();
            jioAdView = ((a_0)object8).c;
            ((k)object5).p = object4 = jioAdView.l;
            object4 = ((a_0)object8).P();
            ((k)object5).q = object4;
            ((k)object5).a = object7;
            object7 = ((a_0)object8).P();
            object7 = ((Utility)object9).getCcbValue((String)object7);
            ((k)object5).b = object7;
            object7 = jioAdView.l;
            object8 = "";
            if (object7 != null) {
                Intrinsics.checkNotNullParameter(object7, "context");
                object4 = "common_prefs";
                object3 = "advid";
                try {
                    object4 = j_0.d((Context)object7, (String)object4, 0, object8, (String)object3);
                    object3 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(object4, (String)object3);
                    object4 = (String)object4;
                    object10 = object4;
                }
                catch (Exception exception) {}
                ((k)object5).r = object10;
                object7 = ((Utility)object9).getUidFromPreferences((Context)object7);
                ((k)object5).s = object7;
            }
            object7 = Boolean.FALSE;
            ((k)object5).e = object7;
            ((k)object5).l = object10 = Integer.valueOf(0);
            ((k)object5).w = object10 = jioAdView.u;
            ((k)object5).n = object7;
            ((k)object5).o = object7;
            object7 = Boolean.TRUE;
            ((k)object5).m = object7;
            jioAdView.h0;
            int n8 = jioAdView.t0;
            object7 = n8;
            ((k)object5).F = object7;
            ((k)object5).t = jioAdsMetadata2;
            object7 = jioAdView.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((k)object5).u = object7;
            object7 = ((JioAdView)object6).l;
            Intrinsics.checkNotNull(object7);
            object7 = ((Utility)object9).getCbValue((Context)object7, (String)object8);
            ((k)object5).i = object7;
            object10 = ((Utility)object9).replaceMacros((k)object5);
        }
        jioAdView = object10;
        l_0.h("Vmap request Url: ", object10);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object7 = JioAds$LogLevel.NONE;
        if (object10 == null) return;
        object4 = 0;
        object7 = object3;
        bl3 = bl2;
        object6 = object;
        object9 = string3;
        object10 = object2;
        object5 = n3;
        jioAdsMetadata2 = jioAdsMetadata;
        object3 = new f0(bl2, (JioAdView)object, string3, (String)object2, string4, n3, jioAdsMetadata);
        Intrinsics.checkNotNullParameter(jioAdView, "vmapUrl");
        Intrinsics.checkNotNullParameter(object3, "listener");
        bl3 = false;
        object8 = null;
        object6 = null;
        object9 = null;
        object = object7;
        jioAdsMetadata = null;
        string2 = null;
        bl2 = false;
        string3 = object4;
        object2 = object3;
        object7 = new i(0, null, null, (Integer)object4, (NetworkTaskListener)object3);
        Intrinsics.checkNotNull(object7);
        ((i)object7).e((String)((Object)jioAdView));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(JioAdView jioAdView, Integer object, W object2) {
        String string2 = "getAds";
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$adSelectionListener");
        Object object3 = com.jio.jioads.multiad.N.a;
        object3 = jioAdView.l;
        Object object4 = jioAdView.m;
        long l2 = com.jio.jioads.multiad.N.a((Context)object3, (String)object4);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            jioAdView.a(l2, (Integer)object);
            return;
        }
        object3 = jioAdView.m0;
        Intrinsics.checkNotNull(object3);
        int n3 = ((o)object3).B((Integer)object);
        if (n3 != 0) return;
        n3 = -1;
        try {
            jioAdView.t0 = n3;
            object3 = jioAdView.l;
            object4 = null;
            if (object3 == null) {
                object = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                object.getClass();
                object = t_0.a(jioAdError$JioAdErrorType);
                String string3 = "Context is null";
                ((JioAdError)object).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string3);
                String string4 = "";
                jioAdView.a((JioAdError)object, null, string2, string4);
                return;
            }
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(object3);
            n3 = (int)(utility.isInternetAvailable((Context)object3) ? 1 : 0);
            if (n3 == 0) {
                object = new StringBuilder();
                String string5 = jioAdView.m;
                ((StringBuilder)object).append(string5);
                String string6 = ": Not connected to the Internet.Please check your connection and try again.";
                ((StringBuilder)object).append(string6);
                object = ((StringBuilder)object).toString();
                String string7 = "message";
                Intrinsics.checkNotNullParameter(object, string7);
                object = JioAds.Companion;
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                object.getClass();
                object = t_0.a(jioAdError$JioAdErrorType);
                String string8 = "Not connected to the Internet.Please check your connection and try again.";
                ((JioAdError)object).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string8);
                jioAdView.a((JioAdError)object, null, null, string2);
                return;
            }
            object3 = JioAdView$AdState.REQUESTED;
            jioAdView.q0 = object3;
            object3 = jioAdView.m0;
            if (object3 == null) return;
            object4 = new e0(jioAdView, (Integer)object, (W)object2);
            ((o)object3).r((e0)object4);
            return;
        }
        catch (Exception exception) {
            object = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_CACHE_AD;
            object3 = "Error in getAds";
            object = j_0.c((t_0)object, jioAdError$JioAdErrorType, (String)object3);
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            jioAdView.a((JioAdError)object, d2, string2, (String)object3);
        }
    }

    public static final /* synthetic */ void access$adSelectionFailed(JioAdView jioAdView, JioAdError jioAdError, com.jio.jioads.cdnlogging.d d2, String string2, String string3) {
        jioAdView.a(jioAdError, d2, string2, string3);
    }

    public static final ArrayList access$checkForVmapTrackerJson(JioAdView object, String object2, String string2, String string3) {
        int n3;
        long l2;
        long l3;
        int n4;
        int n7;
        object.getClass();
        com.jio.jioads.util.j.a("Checking if cid trackers json need to be downloaded");
        ArrayList<CharSequence> arrayList = new ArrayList<CharSequence>();
        Object object3 = ((JioAdView)object).l;
        String string4 = null;
        String string5 = "";
        String string6 = "vmap_cache_pref";
        if (object3 != null && object2 != null) {
            object3 = String.valueOf(j_0.d((Context)object3, string6, 0, string5, (String)object2));
        } else {
            n7 = 0;
            object3 = null;
        }
        String string7 = " downloaded, expiry is ";
        String string8 = "ex";
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            JSONObject jSONObject = new JSONObject((String)object3);
            l3 = jSONObject.getLong(string8);
            String string9 = "preroll cid tracker: ";
            object3 = new StringBuilder(string9);
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(string7);
            ((StringBuilder)object3).append(l3);
            com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
            object3 = Calendar.getInstance();
            l2 = ((Calendar)object3).getTimeInMillis();
            n7 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
            if (n7 < 0) {
                com.jio.jioads.util.j.a("preroll tracker expired");
                object3 = ((JioAdView)object).l;
                if (object3 != null && object2 != null) {
                    j_0.f((Context)object3, string6, (String)object2);
                }
                if (object2 != null) {
                    arrayList.add((CharSequence)object2);
                }
            }
        } else {
            String string10 = "preroll cid tracker not available: ";
            object3 = new StringBuilder(string10);
            ((StringBuilder)object3).append((String)object2);
            object3 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.a((String)object3);
            if (object2 != null) {
                arrayList.add((CharSequence)object2);
            }
        }
        if ((object2 = ((JioAdView)object).l) != null && string2 != null) {
            object2 = String.valueOf(j_0.d((Context)object2, string6, 0, string5, string2));
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n7 = ((String)object2).length()) != 0) {
            object3 = new JSONObject((String)object2);
            l3 = object3.getLong(string8);
            object3 = "midroll cid tracker: ";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(string7);
            ((StringBuilder)object2).append(l3);
            com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
            object2 = Calendar.getInstance();
            l2 = ((Calendar)object2).getTimeInMillis();
            n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
            if (n3 < 0) {
                com.jio.jioads.util.j.a("midroll tracker expired");
                object2 = ((JioAdView)object).l;
                if (object2 != null && string2 != null) {
                    j_0.f((Context)object2, string6, string2);
                }
                if (string2 != null) {
                    arrayList.add(string2);
                }
            }
        } else {
            object3 = "midroll cid tracker not available: ";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            com.jio.jioads.util.j.a((String)object2);
            if (string2 != null) {
                arrayList.add(string2);
            }
        }
        if ((object2 = ((JioAdView)object).l) != null && string3 != null) {
            object2 = j_0.d((Context)object2, string6, 0, string5, string3);
            string4 = String.valueOf(object2);
        }
        if (string4 != null && (n3 = string4.length()) != 0) {
            object2 = new JSONObject(string4);
            long l4 = object2.getLong(string8);
            string4 = "postroll cid tracker: ";
            object3 = new StringBuilder(string4);
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append(string7);
            ((StringBuilder)object3).append(l4);
            com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
            object3 = Calendar.getInstance();
            long l7 = ((Calendar)object3).getTimeInMillis();
            long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (l8 < 0) {
                object2 = "postroll tracker expired";
                com.jio.jioads.util.j.a((String)object2);
                object = ((JioAdView)object).l;
                if (object != null && string3 != null) {
                    j_0.f((Context)object, string6, string3);
                }
                if (string3 != null) {
                    arrayList.add(string3);
                }
            }
        } else {
            object2 = "postroll cid tracker not available: ";
            object = new StringBuilder((String)object2);
            ((StringBuilder)object).append(string3);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            if (string3 != null) {
                arrayList.add(string3);
            }
        }
        return arrayList;
    }

    public static final void access$endFiboTimer(JioAdView object) {
        boolean bl2;
        boolean bl3;
        Object object2 = ((JioAdView)object).m0;
        object2 = object2 != null ? ((o)object2).U() : null;
        Object object3 = ((JioAdView)object).z0;
        if (object3 != null && (object3 = (f)((HashMap)object3).get(object2)) != null && (bl3 = ((f)object3).i) == (bl2 = true)) {
            l_0.h("Stopping & removing fibotimer for child package ", (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = ((JioAdView)object).z0;
            if (object3 != null && (object3 = (f)((HashMap)object3).get(object2)) != null && (object3 = ((f)object3).h) != null) {
                object3.cancel();
            }
            if ((object = ((JioAdView)object).z0) != null) {
                object = (f)TypeIntrinsics.asMutableMap(object).remove(object2);
            }
        }
    }

    public static final void access$fetchTrackerJson(JioAdView object, String string2, int n3, String string3, String object2, String object3, JioAdsMetadata jioAdsMetadata, ArrayList arrayList) {
        c0 c02;
        Context context = object.l;
        ArrayList<String> arrayList2 = c02;
        Object object4 = string2;
        int n4 = n3;
        Object object5 = string3;
        Object object6 = object2;
        Object object7 = object3;
        Object object8 = jioAdsMetadata;
        c02 = new c0((JioAdView)object, string2, n3, string3, (String)object2, (String)object3, jioAdsMetadata);
        Intrinsics.checkNotNullParameter(arrayList, "cidToDownload");
        Intrinsics.checkNotNullParameter(c02, "networkTaskListener");
        arrayList2 = new ArrayList<String>();
        object4 = arrayList.iterator();
        while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            boolean bl2;
            String string4 = (String)object4.next();
            int n7 = 0;
            object5 = null;
            object6 = null;
            if (context != null) {
                object8 = "";
                object7 = String.valueOf(j_0.d(context, "vmap_cache_pref", 0, object8, string4));
            } else {
                bl2 = false;
                object7 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object7);
            if (bl2) {
                l_0.h("Fetching tracker json for cid: ", string4);
                object6 = JioAds.Companion;
                ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object7 = JioAds$LogLevel.NONE;
                object = object7;
                string2 = context;
                string3 = string4;
                object2 = arrayList;
                object3 = c02;
                object7 = new com.jio.jioads.network.a(context, arrayList2, string4, arrayList, c02);
                string4 = kotlin.text.b.n("https://mercury.akamaized.net/customvmap/[CID].json", "[CID]", string4, false);
                l_0.h("tracker json url: ", string4);
                ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = 0;
                object8 = new com.jio.jioads.network.b((com.jio.jioads.network.a)object7);
                bl2 = false;
                object7 = null;
                object = object6;
                string2 = null;
                n3 = 0;
                string3 = null;
                object2 = object5;
                object3 = object8;
                object6 = new i(0, null, null, (Integer)object5, (NetworkTaskListener)object8);
                Intrinsics.checkNotNull(object6);
                ((i)object6).e(string4);
                continue;
            }
            arrayList2.add(string4);
            n4 = arrayList2.size();
            if (n4 != (n7 = arrayList.size())) continue;
            c02.onSuccess(null, null);
        }
    }

    public static final /* synthetic */ ArrayList access$getAdsSelected$p(JioAdView jioAdView) {
        return jioAdView.j;
    }

    public static final /* synthetic */ Object[] access$getAudioCompanionContainerDetails$p(JioAdView jioAdView) {
        return jioAdView.N;
    }

    public static final /* synthetic */ CountDownTimer access$getCacheAdRequestTimer$p(JioAdView jioAdView) {
        return jioAdView.W;
    }

    public static final /* synthetic */ Integer access$getCloseAfterSeconds$p(JioAdView jioAdView) {
        return jioAdView.b0;
    }

    public static final /* synthetic */ Integer access$getCustomCarousalItemLayout$p(JioAdView jioAdView) {
        return jioAdView.e0;
    }

    public static final /* synthetic */ int access$getCustomClickEventKey$p(JioAdView jioAdView) {
        return jioAdView.j0;
    }

    public static final /* synthetic */ int[] access$getCustomImageSize$p(JioAdView jioAdView) {
        return jioAdView.r;
    }

    public static final /* synthetic */ Integer access$getCustomInStreamAdContainer$p(JioAdView jioAdView) {
        return jioAdView.i0;
    }

    public static final /* synthetic */ Integer access$getCustomNativeAdContainer$p(JioAdView jioAdView) {
        return jioAdView.c0;
    }

    public static final /* synthetic */ int access$getCustomNativeAdMediationContainer$p(JioAdView jioAdView) {
        return jioAdView.d0;
    }

    public static final /* synthetic */ int access$getCustomSkipEventKey$p(JioAdView jioAdView) {
        return jioAdView.k0;
    }

    public static final /* synthetic */ String access$getDynamicDisplayMaxCustomSize$p(JioAdView jioAdView) {
        return jioAdView.s;
    }

    public static final /* synthetic */ boolean access$getEnableSdkBackKeyControl$p(JioAdView jioAdView) {
        return jioAdView.R;
    }

    public static final /* synthetic */ HashMap access$getFiboTimerMap$p(JioAdView jioAdView) {
        return jioAdView.z0;
    }

    public static final /* synthetic */ String access$getIAdFormats$p(JioAdView jioAdView) {
        return jioAdView.i1;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioAdCallback$p(JioAdView jioAdView) {
        return jioAdView.c;
    }

    public static final /* synthetic */ JioAds$MediaType access$getMCacheMode$p(JioAdView jioAdView) {
        return jioAdView.w0;
    }

    public static final /* synthetic */ Integer access$getMCuePoint$p(JioAdView jioAdView) {
        return jioAdView.F0;
    }

    public static final /* synthetic */ HashMap access$getMCustomInterstitialAdContainerMap$p(JioAdView jioAdView) {
        return jioAdView.a0;
    }

    public static final /* synthetic */ int access$getMCustomNativeVideoLayout$p(JioAdView jioAdView) {
        return jioAdView.n0;
    }

    public static final /* synthetic */ boolean access$getMIsAdReqCalledByRefresh$p(JioAdView jioAdView) {
        jioAdView.getClass();
        return false;
    }

    public static final /* synthetic */ o access$getMJioAdViewController$p(JioAdView jioAdView) {
        return jioAdView.m0;
    }

    public static final /* synthetic */ JioVmapAdsLoader$JioVmapListener access$getMJioVmapListener$p(JioAdView jioAdView) {
        return jioAdView.f;
    }

    public static final /* synthetic */ boolean access$getMLoadAdCalled$p(JioAdView jioAdView) {
        return jioAdView.M;
    }

    public static final /* synthetic */ int access$getMediaTimeout$p(JioAdView jioAdView) {
        return jioAdView.Y;
    }

    public static final /* synthetic */ JioAdView$ORIENTATION_TYPE access$getOrientationType$p(JioAdView jioAdView) {
        return jioAdView.q;
    }

    public static final /* synthetic */ int access$getPodTimeout$p(JioAdView jioAdView) {
        return jioAdView.X;
    }

    public static final /* synthetic */ int access$getRefreshRateValue$p(JioAdView jioAdView) {
        return jioAdView.y;
    }

    public static final /* synthetic */ int access$getRequestTimeout$p(JioAdView jioAdView) {
        return jioAdView.V;
    }

    public static final /* synthetic */ Integer access$getRequestedAdCount$p(JioAdView jioAdView) {
        return jioAdView.U;
    }

    public static final /* synthetic */ Integer access$getRequestedMinAdDuration$p(JioAdView jioAdView) {
        jioAdView.getClass();
        return null;
    }

    public static final /* synthetic */ boolean access$getShouldAllowOverlay$p(JioAdView jioAdView) {
        return jioAdView.b;
    }

    public static final /* synthetic */ boolean access$getShouldApplyCarouselItemAnimationOnFocus$p(JioAdView jioAdView) {
        return jioAdView.f0;
    }

    public static final /* synthetic */ String access$getSkipThumbnailUrl$p(JioAdView jioAdView) {
        return jioAdView.t;
    }

    public static final /* synthetic */ int access$getVideoBitRate$p(JioAdView jioAdView) {
        return jioAdView.B;
    }

    public static final /* synthetic */ JioAdView$VideoAdType access$getVideoContentType$p(JioAdView jioAdView) {
        return jioAdView.D;
    }

    public static final /* synthetic */ JioAdView$VideoPlayerViewType access$getVideoViewType$p(JioAdView jioAdView) {
        return jioAdView.A0;
    }

    public static final /* synthetic */ int access$getWrapperLimit$p(JioAdView jioAdView) {
        return jioAdView.O;
    }

    public static final void access$handleCacheAdRequestTimeOut(JioAdView jioAdView) {
        boolean bl2;
        Object object = jioAdView.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (!(object == object2 || (bl2 = jioAdView.b()) || (object = jioAdView.q0) != (object2 = JioAdView$AdState.REQUESTED) && object != (object2 = JioAdView$AdState.RECEIVED) && object == (object2 = JioAdView$AdState.FAILED))) {
            object = new StringBuilder();
            object2 = jioAdView.m;
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": cacheAd timeout: ");
            int n3 = jioAdView.V;
            ((StringBuilder)object).append(n3);
            object2 = " sec";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object, string2);
            JioAds$Companion jioAds$Companion = JioAds.Companion;
            jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = JioAdError.Companion;
            Object object3 = JioAdError$JioAdErrorType.ERROR_CACHE_AD_TIMEOUT;
            object3 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object3), "cacheAd request timeout!");
            Object object4 = com.jio.jioads.cdnlogging.d.a;
            object = new StringBuilder("ad is not prepared in ");
            String string3 = g30.a(jioAdView.V, (String)object2, (StringBuilder)object);
            int n4 = 64;
            object = jioAdView;
            object2 = object3;
            object3 = null;
            String string4 = "handleCacheAdRequestTimeOut";
            String string5 = "JioAdView";
            JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(jioAdView, (JioAdError)object2, false, object4, string4, string5, string3, null, n4, null);
            object = jioAdView.m0;
            n3 = 0;
            object2 = null;
            if (object != null) {
                bl2 = ((o)object).M();
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            object3 = new StringBuilder();
            object4 = jioAdView.m;
            ((StringBuilder)object3).append((String)object4);
            object4 = ": releasing JioAdViewController: ";
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
            jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            jioAdView.m0 = null;
            object2 = jioAdView.d;
            Intrinsics.checkNotNull(object2);
            object3 = jioAdView.c;
            Intrinsics.checkNotNull(object3);
            object = new o((com.jio.jioads.common.b)object2, (com.jio.jioads.controller.a)object3);
            jioAdView.m0 = object;
            bl2 = false;
            jioAdView.p0 = false;
            jioAdView.q0 = object = JioAdView$AdState.FAILED;
        }
    }

    public static final /* synthetic */ boolean access$isAdCurrentlyRunning(JioAdView jioAdView) {
        return jioAdView.b();
    }

    public static final /* synthetic */ Boolean access$isAdPaused$p(JioAdView jioAdView) {
        jioAdView.getClass();
        return null;
    }

    public static final /* synthetic */ Boolean access$isExoEnabledFromPublisher$p(JioAdView jioAdView) {
        return jioAdView.l0;
    }

    public static final /* synthetic */ boolean access$isGetAdsCalled$p(JioAdView jioAdView) {
        return jioAdView.h;
    }

    public static final /* synthetic */ boolean access$isPreparedCallBackGiven$p(JioAdView jioAdView) {
        return jioAdView.p0;
    }

    public static final /* synthetic */ boolean access$isPublisherHandlingFocus$p(JioAdView jioAdView) {
        return jioAdView.Q;
    }

    public static final /* synthetic */ boolean access$isPublisherUsingCustomAd$p(JioAdView jioAdView) {
        return jioAdView.E0;
    }

    public static final /* synthetic */ boolean access$isVerticalAdEnabled$p(JioAdView jioAdView) {
        return jioAdView.h1;
    }

    public static final /* synthetic */ boolean access$isWaitingToCompleteRunningVideoAd$p(JioAdView jioAdView) {
        return jioAdView.o0;
    }

    public static final void access$prepareCustomVideoAdData(JioAdView jioAdView, com.jio.jioads.instreamads.vastparser.model.m m2, com.jio.jioads.common.c c2, Map map2) {
        boolean bl2;
        int n3;
        JioAdView jioAdView2 = jioAdView;
        Object object = Utility.INSTANCE;
        Object object2 = jioAdView.l;
        Object object3 = "com.jio.stb.screensaver";
        boolean n4 = ((Utility)object).isPackage((Context)object2, (String)object3, null);
        if (n4) {
            int n7;
            n3 = n7 = jioAdView.G0;
        } else {
            int n8 = -1;
            n3 = -1;
        }
        object2 = jioAdView2.l;
        if (object2 != null && (object3 = jioAdView2.B0) == null) {
            com.jio.jioads.native.customsuport.a a2;
            Intrinsics.checkNotNull(object2);
            V v4 = jioAdView2.c;
            Intrinsics.checkNotNull(v4);
            object3 = jioAdView2.m;
            String string2 = ((Utility)object).getCcbValue((String)object3);
            object = jioAdView2.d;
            Object object4 = object != null ? (object = ((a_0)object).c.S) : null;
            a_0 a_02 = jioAdView2.d;
            Intrinsics.checkNotNull(a_02);
            object = a2;
            object3 = jioAdView;
            jioAdView2.B0 = a2 = new com.jio.jioads.native.customsuport.a((Context)object2, jioAdView, v4, string2, (Integer)object4, n3, a_02, c2, map2);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        object2 = jioAdView2.B0;
        if (object2 != null) {
            object3 = m2;
            ((com.jio.jioads.native.customsuport.a)object2).d = m2;
            ((com.jio.jioads.native.customsuport.a)object2).b = null;
            ((com.jio.jioads.native.customsuport.a)object2).r = null;
        }
        if (object2 != null) {
            object3 = jioAdView2.d;
            ((com.jio.jioads.native.customsuport.a)object2).b(bl2, (com.jio.jioads.common.b)object3);
        }
    }

    /*
     * Exception decompiling
     */
    public static final void access$processVmapData(JioAdView var0, String var1_1, Integer var2_2, String var3_3, String var4_4, String var5_5, JioAdsMetadata var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [17 : 217->223)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static final /* synthetic */ void access$setAdsSelected$p(JioAdView jioAdView, ArrayList arrayList) {
        jioAdView.j = arrayList;
    }

    public static final /* synthetic */ void access$setCacheAdRequestTimer$p(JioAdView jioAdView, CountDownTimer countDownTimer) {
        jioAdView.W = countDownTimer;
    }

    public static final /* synthetic */ void access$setLastAdDelivered$p(JioAdView jioAdView, boolean bl2) {
        jioAdView.P = bl2;
    }

    public static final /* synthetic */ void access$setMAdResponseType$p(JioAdView jioAdView, int n3) {
        jioAdView.t0 = n3;
    }

    public static final /* synthetic */ void access$setPreparedCallBackGiven$p(JioAdView jioAdView, boolean bl2) {
        jioAdView.p0 = bl2;
    }

    public static final /* synthetic */ void access$setWaitingToCompleteRunningVideoAd$p(JioAdView jioAdView, boolean bl2) {
        jioAdView.o0 = bl2;
    }

    public static /* synthetic */ void adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(JioAdView jioAdView, JioAdError jioAdError, boolean bl2, com.jio.jioads.cdnlogging.d d2, String string2, String string3, String string4, Integer n3, int n4, Object object) {
        Integer n7;
        int n8 = n4 & 0x40;
        if (n8 != 0) {
            n8 = 0;
            n7 = null;
        } else {
            n7 = n3;
        }
        jioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdError, bl2, d2, string2, string3, string4, n7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(JioAdView object) {
        int[] nArray;
        int n3;
        int n4;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ((JioAdView)object).E0 = n4 = 1;
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = ((JioAdView)object).m;
        Object object4 = "message";
        Object object5 = ": Inside load custom ad... sv: AN-3";
        j_0.k(stringBuilder, (String)object3, (String)object5);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = ((JioAdView)object).q0;
        int n7 = -1;
        if (object3 == null) {
            n3 = -1;
        } else {
            nArray = com.jio.jioads.adinterfaces.b0.$EnumSwitchMapping$0;
            n3 = ((Enum)object3).ordinal();
            n3 = nArray[n3];
        }
        if (n3 == n4) {
            object2 = new StringBuilder();
            object = ((JioAdView)object).m;
            object3 = ": Ad is already prepared";
            d_0.a((StringBuilder)object2, (String)object, (String)object3, jioAds$Companion);
            return;
        }
        n4 = 2;
        if (n3 == n4) {
            object2 = new StringBuilder();
            object = ((JioAdView)object).m;
            object3 = ": Ad request is ongoing";
            d_0.a((StringBuilder)object2, (String)object, (String)object3, jioAds$Companion);
            return;
        }
        object2 = com.jio.jioads.multiad.N.a;
        object2 = ((JioAdView)object).l;
        Intrinsics.checkNotNull(object2);
        object3 = ((JioAdView)object).m;
        long l2 = com.jio.jioads.multiad.N.a((Context)object2, (String)object3);
        try {
            long l3;
            long l4;
            long l7;
            ((JioAdView)object).t0 = n7;
            object2 = ((JioAdView)object).l;
            if (object2 == null) {
                object2 = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                object2.getClass();
                object4 = t_0.a(jioAdError$JioAdErrorType);
                object2 = "Context is null";
                ((JioAdError)object4).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                String string2 = "";
                Object var13_21 = null;
                int n8 = 64;
                boolean bl2 = false;
                n7 = 0;
                object5 = null;
                boolean bl3 = false;
                nArray = null;
                object3 = object;
                JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)object, (JioAdError)object4, false, null, null, null, string2, null, n8, null);
                return;
            }
            object3 = Utility.INSTANCE;
            Intrinsics.checkNotNull(object2);
            n4 = (int)(((Utility)object3).isInternetAvailable((Context)object2) ? 1 : 0);
            if (n4 == 0) {
                object2 = new StringBuilder();
                object3 = ((JioAdView)object).m;
                ((StringBuilder)object2).append((String)object3);
                object3 = ": Not connected to the Internet.Please check your connection and try again.";
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object2 = jioAds$Companion.getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                object2.getClass();
                object4 = t_0.a(jioAdError$JioAdErrorType);
                object2 = "Not connected to the Internet.Please check your connection and try again.";
                ((JioAdError)object4).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                String string3 = "";
                Object var13_22 = null;
                int n10 = 64;
                boolean bl4 = false;
                n7 = 0;
                object5 = null;
                boolean bl5 = false;
                nArray = null;
                object3 = object;
                JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)object, (JioAdError)object4, false, null, null, null, string3, null, n10, null);
                return;
            }
            long l8 = 0L;
            n3 = 0;
            object3 = null;
            Object object6 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (object6 >= 0) {
                ((JioAdView)object).a(l2, null);
                return;
            }
            object2 = ((JioAdView)object).n;
            JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            if (object2 == jioAdView$AD_TYPE && (l7 = (l4 = (l8 = ((JioAdView)object).D0) - (l3 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                object2 = ((JioAdView)object).S;
                if (object2 != null) {
                    n4 = (Integer)object2;
                    l3 = n4;
                }
                ((JioAdView)object).D0 = l3;
            }
            object2 = JioAdView$AdState.REQUESTED;
            ((JioAdView)object).q0 = object2;
            object2 = ((JioAdView)object).m0;
            if (object2 == null) return;
            HashMap hashMap = com.jio.jioads.controller.o.T;
            ((o)object2).r(null);
            return;
        }
        catch (Exception exception) {
            object2 = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_CACHE_AD;
            object3 = "Error while Loading Custom Ad";
            object5 = j_0.c((t_0)object2, jioAdError$JioAdErrorType, (String)object3);
            String string4 = "";
            boolean bl6 = false;
            boolean bl7 = false;
            nArray = null;
            Object var12_20 = null;
            int n14 = 64;
            object4 = object;
            JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)object, (JioAdError)object5, false, null, null, null, string4, null, n14, null);
            return;
        }
    }

    public static /* synthetic */ void requestVmap$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(JioAdView jioAdView, String string2, String string3, String string4, String string5, JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener, Integer n3, JioAdsMetadata jioAdsMetadata, boolean bl2, int n4, Object object) {
        Integer n7;
        int n8 = n4 & 0x20;
        if (n8 != 0) {
            Integer n10;
            n8 = 5;
            n7 = n10 = Integer.valueOf(n8);
        } else {
            n7 = n3;
        }
        jioAdView.requestVmap$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, string4, string5, jioVmapAdsLoader$JioVmapListener, n7, jioAdsMetadata, bl2);
    }

    public static /* synthetic */ void setCarouselItemLayout$default(JioAdView jioAdView, Integer n3, boolean bl2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = null;
        }
        if ((n4 &= 2) != 0) {
            bl2 = false;
        }
        jioAdView.setCarouselItemLayout(n3, bl2);
    }

    public final void a(long l2, Integer n3) {
        Object object;
        CharSequence charSequence;
        long l3 = 60000L;
        Object object2 = " Seconds";
        int n4 = 1000;
        Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object3 >= 0) {
            l3 = n4;
            l2 /= l3;
            int n7 = 60;
            l3 = n7;
            long l4 = l2 / l3;
            int n8 = (int)(l2 %= l3);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l4);
            object = " Minutes ";
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(n8);
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            l3 = 1000L;
            long l7 = l2 - l3;
            object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 >= 0) {
                l3 = n4;
                int n10 = (int)(l2 /= l3);
                charSequence = UX.a(n10, (String)object2);
            } else {
                object = " Milliseconds";
                charSequence = UX.b(l2, object);
            }
        }
        Object object4 = new StringBuilder();
        object = this.m;
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append(": Ad request is blocked due to blocked header. Please call cacheAd after ");
        ((StringBuilder)object4).append((String)charSequence);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = JioAdError.Companion;
        object = JioAdError$JioAdErrorType.ERROR_REQUEST_BLOCKED;
        object4.getClass();
        object2 = t_0.a((JioAdError$JioAdErrorType)((Object)object));
        object4 = new StringBuilder("Ad request is blocked. Please call cacheAd after ");
        ((StringBuilder)object4).append((String)charSequence);
        charSequence = ((StringBuilder)object4).toString();
        ((JioAdError)object2).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)charSequence);
        this.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdError)object2, false, null, null, null, "", n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(JioAdError jioAdError, com.jio.jioads.cdnlogging.d d2, String string2, String string3) {
        boolean bl2;
        boolean bl3;
        JioAdView jioAdView = this;
        Object object = jioAdError;
        Object object2 = "message";
        Intrinsics.checkNotNullParameter("adSelectionFailed called", (String)object2);
        Object object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = this.q0;
        Object object5 = JioAdView$AdState.DESTROYED;
        if (object4 == object5) {
            object = "inside adSelectionFailed: object already destroyed";
            v12.a((String)object, (String)object2, (JioAds$Companion)object3);
            return;
        }
        object4 = JioAdView$AdState.FAILED;
        this.q0 = object4;
        this.I0 = bl3 = true;
        object5 = new StringBuilder();
        String string4 = this.m;
        ((StringBuilder)object5).append(string4);
        ((StringBuilder)object5).append(": Callback onAdSelectionFailed: ");
        string4 = null;
        String string5 = jioAdError != null ? jioAdError.getErrorDescription() : null;
        d90_0.b((StringBuilder)object5, string5, (String)object2, (JioAds$Companion)object3);
        if (d2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            object2 = new StringBuilder();
            object5 = jioAdView.m;
            string5 = ": Inside Logging Error From JioAdView Class adSelectionFailed";
            d_0.a((StringBuilder)object2, (String)object5, string5, (JioAds$Companion)object3);
            object2 = jioAdView.m0;
            if (object2 != null) {
                object2 = ((o)object2).T();
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null) {
                object2 = jioAdView.m0;
                Intrinsics.checkNotNull(object2);
                object2 = ((o)object2).T();
            } else {
                object2 = new com.jio.jioads.cdnlogging.a();
            }
            Object object6 = object2;
            Utility utility = Utility.INSTANCE;
            Context context = jioAdView.l;
            String string6 = jioAdView.m;
            Object object7 = object != null ? (object2 = jioAdError.getErrorCode()) : null;
            Object object8 = object != null ? (object2 = jioAdError.getErrorDescription()) : null;
            bl2 = jioAdView.u0;
            Boolean bl4 = bl2;
            object2 = jioAdView.m0;
            Object object9 = object2 != null ? (object2 = ((o)object2).U()) : null;
            if (object != null) {
                string4 = jioAdError.getErrorCode();
            }
            utility.logError(context, string6, d2, (String)object7, (String)object8, (com.jio.jioads.cdnlogging.a)object6, string2, bl4, (String)object9, string4, false);
        }
        if (!(bl2 = jioAdView.k) && (object2 = jioAdView.m0) != null && (bl2 = ((o)object2).g0()) == bl3) {
            jioAdView.k = bl3;
            object = jioAdView.i;
            if (object == null) return;
            object3 = jioAdView.F0;
            jioAdView.getAds$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((W)object, (Integer)object3);
            return;
        }
        object2 = new StringBuilder();
        object4 = jioAdView.m;
        object5 = ": Giving onAdSelectionFailed listener for getAds()...";
        d_0.a((StringBuilder)object2, (String)object4, (String)object5, (JioAds$Companion)object3);
        object3 = jioAdView.i;
        if (object3 == null) return;
        object2 = jioAdView.F0;
        object3.a((JioAdError)object, (Integer)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        JioAdView$AdState jioAdView$AdState;
        Context context = this.l;
        boolean bl2 = context instanceof Activity;
        boolean bl3 = false;
        if (bl2) {
            Object object;
            JioAdView$AD_TYPE jioAdView$AD_TYPE;
            JioAdView$AD_TYPE jioAdView$AD_TYPE2;
            JioAdView$AD_TYPE jioAdView$AD_TYPE3;
            JioAdView$AD_TYPE jioAdView$AD_TYPE4;
            JioAdView$AD_TYPE jioAdView$AD_TYPE5;
            JioAdView$AD_TYPE jioAdView$AD_TYPE6;
            JioAdView$AD_TYPE jioAdView$AD_TYPE7 = this.n;
            JioAdView$AD_TYPE jioAdView$AD_TYPE8 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            boolean bl4 = true;
            String string2 = "message";
            if (jioAdView$AD_TYPE7 != jioAdView$AD_TYPE8 && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE6 = JioAdView$AD_TYPE.INFEED) && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE5 = JioAdView$AD_TYPE.CONTENT_STREAM) && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE4 = JioAdView$AD_TYPE.INSTREAM_VIDEO) && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.INTERSTITIAL) && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && jioAdView$AD_TYPE7 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_AUDIO)) {
                String string3 = "Invalid UX type";
                Intrinsics.checkNotNullParameter(string3, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                Boolean bl5 = Boolean.FALSE;
                object = new Pair(bl5, string3);
            } else {
                String string4 = this.m;
                bl2 = TextUtils.isEmpty((CharSequence)string4);
                if (bl2) {
                    String string5 = "Mandatory parameter Adspot Key missing";
                    Intrinsics.checkNotNullParameter(string5, string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    Boolean bl6 = Boolean.FALSE;
                    object = new Pair(bl6, string5);
                } else {
                    Regex regex;
                    String string6;
                    Regex regex2;
                    String string7 = this.m;
                    if (string7 != null && (bl2 = (regex2 = new Regex((String)(object = ".*[0-9].*"))).c(string7)) == bl4 && (string6 = this.m) != null && (bl2 = (regex = new Regex((String)(object = ".*[a-zA-Z].*"))).c(string6)) == bl4) {
                        Boolean bl7 = Boolean.TRUE;
                        Object var4_47 = null;
                        object = new Pair(bl7, null);
                    } else {
                        String string8 = "Invalid Adspot Key passed";
                        Intrinsics.checkNotNullParameter(string8, string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                        Boolean bl8 = Boolean.FALSE;
                        object = new Pair(bl8, string8);
                    }
                }
            }
            String string9 = this.m;
            bl2 = TextUtils.isEmpty((CharSequence)string9);
            if (bl2) {
                JioAdView$AdState jioAdView$AdState2;
                Intrinsics.checkNotNullParameter("AdSpot id is blank", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                this.q0 = jioAdView$AdState2 = JioAdView$AdState.FAILED;
                t_0 t_02 = JioAdError.Companion;
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                JioAdError jioAdError = j_0.c(t_02, jioAdError$JioAdErrorType, "AdSpot Id not set");
                String string10 = "";
                bl4 = false;
                Object var6_64 = null;
                object = null;
                int n3 = 64;
                JioAdView jioAdView = this;
                JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, null, null, null, string10, null, n3, null);
                return bl3;
            } else {
                Boolean bl9 = (Boolean)((Pair)object).a;
                bl2 = bl9;
                if (!bl2) {
                    JioAdView$AdState jioAdView$AdState3;
                    this.q0 = jioAdView$AdState3 = JioAdView$AdState.FAILED;
                    t_0 t_03 = JioAdError.Companion;
                    JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                    t_03.getClass();
                    JioAdError jioAdError = t_0.a(jioAdError$JioAdErrorType);
                    String string11 = (String)((Pair)object).b;
                    jioAdError.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string11);
                    String string12 = "";
                    bl4 = false;
                    Object var6_65 = null;
                    object = null;
                    int n4 = 64;
                    JioAdView jioAdView = this;
                    JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, null, null, null, string12, null, n4, null);
                    return bl3;
                } else {
                    JioAdView$AdState jioAdView$AdState4;
                    Context context2 = this.l;
                    if (context2 == null) return true;
                    Utility utility = Utility.INSTANCE;
                    Intrinsics.checkNotNull(context2);
                    bl2 = utility.isInternetAvailable(context2);
                    if (bl2) return true;
                    this.q0 = jioAdView$AdState4 = JioAdView$AdState.FAILED;
                    StringBuilder stringBuilder = new StringBuilder();
                    String string13 = this.m;
                    j_0.k(stringBuilder, string13, ": Not connected to the Internet.Please check your connection and try again.");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    t_0 t_04 = JioAdError.Companion;
                    JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                    JioAdError jioAdError = j_0.c(t_04, jioAdError$JioAdErrorType, "Not connected to the Internet.Please check your connection and try again.");
                    com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.c;
                    String string14 = "";
                    bl4 = false;
                    object = null;
                    int n7 = 64;
                    JioAdView jioAdView = this;
                    JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, d2, null, null, string14, null, n7, null);
                }
            }
            return bl3;
        }
        this.q0 = jioAdView$AdState = JioAdView$AdState.FAILED;
        t_0 t_05 = JioAdError.Companion;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
        JioAdError jioAdError = j_0.c(t_05, jioAdError$JioAdErrorType, "context is not type of activity, please pass activity context only");
        JioAdView jioAdView = this;
        JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, null, "JioAdview", null, "", null, 64, null);
        return false;
    }

    public final void adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdError jioAdError, boolean bl2, com.jio.jioads.cdnlogging.d d2, String string2, String string3, String string4, Integer n3) {
        boolean bl3;
        String string5;
        Object object;
        Object object2;
        int n4;
        Object object3;
        boolean bl4;
        JioAdView jioAdView = this;
        Object object4 = jioAdError;
        boolean bl5 = bl2;
        String string6 = string2;
        Intrinsics.checkNotNullParameter(string4, "errorLoggingDescription");
        Object object5 = new StringBuilder();
        Object object6 = this.m;
        ((StringBuilder)object5).append((String)object6);
        object6 = ": Inside Logging Error From JioAdView jioAdError ";
        ((StringBuilder)object5).append((String)object6);
        if (jioAdError != null) {
            object6 = jioAdError.getErrorCode();
        } else {
            bl4 = false;
            object6 = null;
        }
        ((StringBuilder)object5).append((String)object6);
        object6 = ", ";
        ((StringBuilder)object5).append((String)object6);
        if (object4 != null) {
            object3 = jioAdError.getErrorDescription();
        } else {
            n4 = 0;
            object3 = null;
        }
        ((StringBuilder)object5).append((String)object3);
        ((StringBuilder)object5).append((String)object6);
        ((StringBuilder)object5).append(string6);
        object5 = ((StringBuilder)object5).toString();
        String string7 = "message";
        Intrinsics.checkNotNullParameter(object5, string7);
        Object object7 = JioAds.Companion;
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        object5 = jioAdView.q0;
        object6 = JioAdView$AdState.DESTROYED;
        int n7 = 1;
        if (object5 != object6) {
            Object object8;
            Object object9;
            int n8;
            int n10;
            object5 = JioAdView$AdState.FAILED;
            jioAdView.q0 = object5;
            object5 = jioAdView.l;
            if (object5 != null && (object6 = jioAdView.m0) != null && (object6 = ((o)object6).Q) != null) {
                object2 = com.jio.jioads.util.i.a;
                n4 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)object6);
                if (n4 != 0) {
                    object3 = "onPlayerError";
                    n10 = 0;
                    object = null;
                    n4 = kotlin.text.b.i(string6, (String)object3, false);
                    if (n4 != 0) {
                        com.jio.jioads.util.i.i = n8 = com.jio.jioads.util.i.i + n7;
                    } else {
                        object3 = jioAdView.S;
                        if (object3 != null) {
                            n4 = (Integer)object3;
                        } else {
                            n4 = 0;
                            object3 = null;
                        }
                        object9 = jioAdView.U;
                        if (object9 != null) {
                            n10 = (Integer)object9;
                        }
                        object9 = jioAdView.m;
                        Boolean bl6 = Boolean.TRUE;
                        Boolean bl7 = Boolean.FALSE;
                        Integer n14 = n4;
                        Integer n15 = n10;
                        int n16 = 384;
                        object8 = object5;
                        com.jio.jioads.util.i.k((com.jio.jioads.util.i)object2, (Context)object5, (com.jio.jioads.common.c)object6, (String)object9, bl6, bl7, n14, n15, null, null, n16);
                    }
                }
            }
            if (d2 != null && (n8 = TextUtils.isEmpty((CharSequence)string4)) == 0) {
                object5 = new StringBuilder();
                object6 = jioAdView.m;
                object3 = ": Inside Logging Error From JioAdView Class";
                d_0.a((StringBuilder)object5, (String)object6, (String)object3, (JioAds$Companion)object7);
                object5 = jioAdView.m0;
                if (object5 != null) {
                    object5 = ((o)object5).T();
                } else {
                    n8 = 0;
                    object5 = null;
                }
                if (object5 != null) {
                    object5 = jioAdView.m0;
                    Intrinsics.checkNotNull(object5);
                    object5 = ((o)object5).T();
                } else {
                    object5 = new com.jio.jioads.cdnlogging.a();
                }
                object6 = Utility.INSTANCE;
                object3 = jioAdView.l;
                if (object4 != null) {
                    object = jioAdError.getErrorTitle();
                } else {
                    n10 = 0;
                    object = null;
                }
                object9 = ((com.jio.jioads.cdnlogging.a)object5).toString();
                com.jio.jioads.cdnlogging.a a2 = new com.jio.jioads.cdnlogging.a();
                Boolean bl8 = Boolean.FALSE;
                object5 = jioAdView.m0;
                object2 = object5 != null ? (object5 = ((o)object5).U()) : null;
                object8 = object4 != null ? (object5 = jioAdError.getErrorCode()) : null;
                object5 = object6;
                object6 = object3;
                object3 = object;
                object = d2;
                string6 = string2;
                Object object10 = object2;
                object2 = object7;
                object7 = object8;
                string5 = string7;
                string7 = null;
                ((Utility)object5).logError((Context)object6, (String)object3, d2, (String)object9, string4, a2, string2, bl8, (String)object10, (String)object8, false);
            } else {
                object2 = object7;
                string5 = string7;
            }
            object6 = Looper.getMainLooper();
            object5 = new Handler((Looper)object6);
            object6 = new c_0(jioAdView, (JioAdError)object4);
            object5.post((Runnable)object6);
        } else {
            object2 = object7;
            string5 = string7;
        }
        object5 = jioAdView.i;
        if (object5 != null) {
            object6 = n3;
            object5.a((JioAdError)object4, n3);
        }
        object5 = new StringBuilder();
        object6 = jioAdView.m;
        ((StringBuilder)object5).append((String)object6);
        object6 = ": shouldStartFiboTimer-->  ";
        ((StringBuilder)object5).append((String)object6);
        ((StringBuilder)object5).append(bl5);
        Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string5);
        object5 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object4 != null) {
            object4 = jioAdError.getErrorTitle();
        } else {
            bl3 = false;
            object4 = null;
        }
        object5 = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorTitle();
        bl4 = true;
        bl3 = kotlin.text.b.i((String)object4, (String)object5, bl4);
        if (bl3 && bl5) {
            object4 = jioAdView.m0;
            if (object4 != null) {
                object4 = ((o)object4).U();
            } else {
                bl3 = false;
                object4 = null;
            }
            Intrinsics.checkNotNull(object4);
            Object object11 = jioAdView.z0;
            if (object11 == null) {
                jioAdView.z0 = object11 = new HashMap();
            }
            if ((object11 = jioAdView.g) == null) {
                jioAdView.g = object11 = new f();
            }
            if ((object11 = jioAdView.g) != null) {
                double d5;
                object5 = jioAdView.z0;
                Intrinsics.checkNotNull(object5);
                ((HashMap)object5).put(object4, object11);
                ((f)object11).f = d5 = jioAdView.Z;
                object = "Setting maxLimit to- ";
                object3 = new StringBuilder((String)object);
                ((StringBuilder)object3).append(d5);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string5);
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = new StringBuilder();
                object6 = jioAdView.m;
                ((StringBuilder)object5).append((String)object6);
                ((StringBuilder)object5).append(": Starting FiboTimer as it was NO_FILL ");
                object6 = jioAdView.z0;
                if (object6 != null) {
                    object6 = (f)((HashMap)object6).get(object4);
                } else {
                    bl4 = false;
                    object6 = null;
                }
                ((StringBuilder)object5).append(object6);
                Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string5);
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = new i_0(jioAdView, (String)object4);
                ((f)object11).a((com.jio.jioads.util.c)object5);
            }
        }
    }

    public final void allowOverlay(boolean bl2) {
        this.b = bl2;
        Object object = new StringBuilder();
        String string2 = this.m;
        object.append(string2);
        object.append(": allowOverlay: ");
        boolean bl3 = this.b;
        object.append(bl3);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final boolean b() {
        boolean bl2;
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.STARTING;
        if (jioAdView$AdState != jioAdView$AdState2 && jioAdView$AdState != (jioAdView$AdState2 = JioAdView$AdState.STARTED) && jioAdView$AdState != (jioAdView$AdState2 = JioAdView$AdState.EXPANDED) && jioAdView$AdState != (jioAdView$AdState2 = JioAdView$AdState.COLLAPSED) && jioAdView$AdState != (jioAdView$AdState2 = JioAdView$AdState.INTERACTED)) {
            bl2 = false;
            jioAdView$AdState = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void cacheAd() {
        block66: {
            block63: {
                block64: {
                    block65: {
                        block61: {
                            block62: {
                                block60: {
                                    block59: {
                                        var1_1 = 1;
                                        var2_2 = 0;
                                        var3_3 /* !! */  = null;
                                        this.M = false;
                                        var4_4 = com.jio.jioads.multiad.N.e;
                                        var4_4.clear();
                                        var5_5 /* !! */  = this.a();
                                        if (var5_5 /* !! */  == 0) {
                                            return;
                                        }
                                        this.z = false;
                                        var4_4 = new StringBuilder();
                                        var6_6 /* !! */  = this.m;
                                        var4_4.append(var6_6 /* !! */ );
                                        var4_4.append(": Inside cacheAd call and current AdState= ");
                                        var6_6 /* !! */  = this.q0;
                                        var4_4.append((Object)var6_6 /* !! */ );
                                        var4_4.append(", sv: AN-3");
                                        var4_4 = var4_4.toString();
                                        var6_6 /* !! */  = "message";
                                        Intrinsics.checkNotNullParameter(var4_4, var6_6 /* !! */ );
                                        var4_4 = JioAds.Companion;
                                        var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var7_7 = JioAds$LogLevel.NONE;
                                        this.getMetaData();
                                        var7_7 = var4_4.getInstance();
                                        var7_7.getPredefinedMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var8_8 = this.b();
                                        if (var8_8 != 0) {
                                            var9_9 = new StringBuilder();
                                            var3_3 /* !! */  = this.m;
                                            d_0.a(var9_9, var3_3 /* !! */ , ": ad is running, can not call cacheAd()", (JioAds$Companion)var4_4);
                                            return;
                                        }
                                        var7_7 = this.U;
                                        var10_14 = -1;
                                        var8_8 = var7_7 != null ? var7_7.intValue() : -1;
                                        if (var8_8 > 0 || (var8_8 = (var7_7 = this.S) != null ? var7_7.intValue() : -1) > 0) {
                                            var7_7 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                                            this.setAdpodVariant((JioAdView$AdPodVariant)var7_7);
                                        }
                                        if ((var7_7 = this.n) != (var11_15 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO) || (var7_7 = this.q0) != (var11_15 /* !! */  = JioAdView$AdState.PREPARED)) break block61;
                                        var7_7 = new StringBuilder();
                                        var12_16 = this.m;
                                        var7_7.append((String)var12_16);
                                        var7_7.append(": inside checkInstreamVideoForPodOptimisation prevRequestedDuration: ");
                                        var12_16 = this.T;
                                        var7_7.append(var12_16);
                                        var7_7.append(", requestedAdDuration: ");
                                        var12_16 = this.S;
                                        var7_7.append(var12_16);
                                        Intrinsics.checkNotNullParameter(var7_7.toString(), var6_6 /* !! */ );
                                        var7_7 = var4_4.getInstance();
                                        var7_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var7_7 = this.T;
                                        if (var7_7 == null) ** GOTO lbl150
                                        var12_16 = this.S;
                                        var8_8 = (int)Intrinsics.areEqual(var7_7, var12_16);
                                        if (var8_8 != 0) ** GOTO lbl150
                                        var7_7 = new StringBuilder();
                                        var12_16 = this.m;
                                        var7_7.append((String)var12_16);
                                        var12_16 = ": cacheAd called on already prepared ad with diff duration";
                                        var7_7.append((String)var12_16);
                                        var7_7 = var7_7.toString();
                                        Intrinsics.checkNotNullParameter(var7_7, var6_6 /* !! */ );
                                        var7_7 = var4_4.getInstance();
                                        var7_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var7_7 = this.m0;
                                        if (var7_7 == null) ** GOTO lbl-1000
                                        var13_17 = var7_7.o;
                                        if (!var13_17) break block59;
                                        var7_7 = var7_7.r;
                                        if (var7_7 == null) break block59;
                                        var8_8 = (int)var7_7.resetPodIfValid();
                                        break block60;
                                    }
                                    var8_8 = 0;
                                    var7_7 = null;
                                }
                                if (var8_8 == var1_1) {
                                    var8_8 = 1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_8 = 0;
                                    var7_7 = null;
                                }
                                if (var8_8 != 0) {
                                    var7_7 = new StringBuilder();
                                    var12_16 = this.m;
                                    var7_7.append((String)var12_16);
                                    var12_16 = ": pod optimization success";
                                    var7_7.append((String)var12_16);
                                    var7_7 = var7_7.toString();
                                    Intrinsics.checkNotNullParameter(var7_7, var6_6 /* !! */ );
                                    var4_4 = var4_4.getInstance();
                                    var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                } else {
                                    var7_7 = new StringBuilder();
                                    var11_15 /* !! */  = this.m;
                                    var7_7.append((String)var11_15 /* !! */ );
                                    var11_15 /* !! */  = ": pod optimization failure";
                                    var7_7.append((String)var11_15 /* !! */ );
                                    var7_7 = var7_7.toString();
                                    Intrinsics.checkNotNullParameter(var7_7, var6_6 /* !! */ );
                                    var4_4 = var4_4.getInstance();
                                    var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    this.p0 = false;
                                    var11_15 /* !! */  = JioAdView$AdState.NOT_REQUESTED;
                                }
                                this.q0 = var11_15 /* !! */ ;
                                break block61;
lbl150:
                                // 2 sources

                                if ((var4_4 = this.T) == null) break block62;
                                this.q0 = var11_15 /* !! */ ;
                            }
                            this.p0 = false;
                            var4_4 = JioAdView$AdState.NOT_REQUESTED;
                            try {
                                this.q0 = var4_4;
                            }
                            catch (Exception v0) {
                                var4_4 = JioAdView$AdState.NOT_REQUESTED;
                                this.q0 = var4_4;
                            }
                        }
                        var5_5 /* !! */  = this.b();
                        var8_8 = 0;
                        var7_7 = null;
                        if (var5_5 /* !! */  == 0 && (var4_4 = this.n) == (var11_15 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL) && (var4_4 = this.q0) == (var11_15 /* !! */  = JioAdView$AdState.CLOSED)) {
                            var4_4 = new StringBuilder();
                            var11_15 /* !! */  = this.m;
                            var12_16 = ": re-init controller for Interstitial";
                            j_0.k((StringBuilder)var4_4, (String)var11_15 /* !! */ , (String)var12_16);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var4_4 = JioAds$LogLevel.NONE;
                            var4_4 = this.m0;
                            if (var4_4 != null) {
                                var4_4.M();
                            }
                            this.m0 = null;
                            var11_15 /* !! */  = this.d;
                            Intrinsics.checkNotNull(var11_15 /* !! */ );
                            var12_16 = this.c;
                            Intrinsics.checkNotNull(var12_16);
                            var4_4 = new o((com.jio.jioads.common.b)var11_15 /* !! */ , (com.jio.jioads.controller.a)var12_16);
                            this.m0 = var4_4;
                            this.p0 = false;
                            var4_4 = JioAdView$AdState.NOT_REQUESTED;
                            this.q0 = var4_4;
                        }
                        if ((var4_4 = this.q0) == (var11_15 /* !! */  = JioAdView$AdState.DESTROYED)) break block63;
                        if (var4_4 == null) {
                            var5_5 /* !! */  = -1;
                        } else {
                            var12_16 = com.jio.jioads.adinterfaces.b0.$EnumSwitchMapping$0;
                            var5_5 /* !! */  = var4_4.ordinal();
                            var5_5 /* !! */  = (int)var12_16[var5_5 /* !! */ ];
                        }
                        if (var5_5 /* !! */  == var1_1) break block64;
                        var2_2 = 2;
                        if (var5_5 /* !! */  == var2_2) break block65;
                        var3_3 /* !! */  = JioAdView$AdState.NOT_REQUESTED;
                        this.q0 = var3_3 /* !! */ ;
                        var3_3 /* !! */  = this.m0;
                        if (var3_3 /* !! */  == null) ** GOTO lbl-1000
                        var3_3 /* !! */  = this.g;
                        if (var3_3 /* !! */  == null) ** GOTO lbl-1000
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var2_2 = (int)var3_3 /* !! */ .i;
                        if (var2_2 == 0) lbl-1000:
                        // 2 sources

                        {
                            if ((var3_3 /* !! */  = this.n) == (var4_4 = JioAdView$AD_TYPE.INSTREAM_VIDEO) || var3_3 /* !! */  == (var4_4 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                                var3_3 /* !! */  = this.m0;
                                Intrinsics.checkNotNull(var3_3 /* !! */ );
                                var4_4 = com.jio.jioads.controller.o.T;
                                var2_2 = (int)var3_3 /* !! */ .B(null);
                                if (var2_2 != 0) {
                                    return;
                                }
                            }
                            var3_3 /* !! */  = JioAdView$AdState.REQUESTED;
                            this.q0 = var3_3 /* !! */ ;
                            if (var3_3 /* !! */  != var11_15 /* !! */ ) {
                                var3_3 /* !! */  = this.m0;
                                if (var3_3 /* !! */  != null) {
                                    var3_3 /* !! */  = var3_3 /* !! */ .x;
                                } else {
                                    var2_2 = 0;
                                    var3_3 /* !! */  = null;
                                }
                                if (var3_3 /* !! */  == null && (var2_2 = this.V) > 0) {
                                    var3_3 /* !! */  = this.W;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */ .cancel();
                                    }
                                    this.W = null;
                                    var3_3 /* !! */  = new StringBuilder();
                                    var4_4 = this.m;
                                    j_0.k((StringBuilder)var3_3 /* !! */ , (String)var4_4, ": starting cacheAd timer");
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                    var2_2 = this.V * 1000;
                                    var14_18 = var2_2;
                                    var6_6 /* !! */  = new g0(this, var14_18);
                                    var3_3 /* !! */  = var6_6 /* !! */ .start();
                                    this.W = var3_3 /* !! */ ;
                                }
                            }
                            if ((var2_2 = this.d0) != var10_14) {
                                try {
                                    var3_3 /* !! */  = this.l;
                                }
                                catch (Exception v1) {}
                                var3_3 /* !! */  = LayoutInflater.from((Context)var3_3 /* !! */ );
                                var5_5 /* !! */  = this.d0;
                                var3_3 /* !! */  = var3_3 /* !! */ .inflate(var5_5 /* !! */ , null);
                                var3_3 /* !! */  = (ViewGroup)var3_3 /* !! */ ;
                                var7_7 = var3_3 /* !! */ ;
                            }
                            this.g0 = var7_7;
                            var3_3 /* !! */  = Executors.newSingleThreadExecutor();
                            var4_4 = new l9(this, var1_1);
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */ .submit((Runnable)var4_4);
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_10 /* !! */  = new StringBuilder();
                            var3_3 /* !! */  = this.m;
                            var9_10 /* !! */ .append(var3_3 /* !! */ );
                            var9_10 /* !! */ .append(": Please cacheAd after ");
                            var3_3 /* !! */  = this.g;
                            if (var3_3 /* !! */  != null) {
                                var2_2 = var3_3 /* !! */ .j;
                                var7_7 = var2_2;
                            }
                            var9_10 /* !! */ .append(var7_7);
                            var3_3 /* !! */  = " seconds";
                            var9_10 /* !! */ .append(var3_3 /* !! */ );
                            Intrinsics.checkNotNullParameter(var9_10 /* !! */ .toString(), var6_6 /* !! */ );
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var9_10 /* !! */  = JioAds$LogLevel.NONE;
                        }
                        break block66;
                    }
                    var9_11 /* !! */  = new StringBuilder();
                    var3_3 /* !! */  = this.m;
                    var4_4 = ": Ad request is ongoing";
                    j_0.k(var9_11 /* !! */ , var3_3 /* !! */ , (String)var4_4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var9_11 /* !! */  = JioAds$LogLevel.NONE;
                    break block66;
                }
                this.p0 = false;
                var9_12 = new StringBuilder();
                var3_3 /* !! */  = this.m;
                var4_4 = ": Ad is already cached & ready to render";
                j_0.k((StringBuilder)var9_12, var3_3 /* !! */ , (String)var4_4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var9_12 = JioAds$LogLevel.NONE;
                var9_12 = this.c;
                if (var9_12 != null) {
                    var9_12.n();
                }
                break block66;
            }
            var9_13 /* !! */  = new StringBuilder();
            var3_3 /* !! */  = this.m;
            var4_4 = ": JioAdView is destroyed";
            j_0.k(var9_13 /* !! */ , var3_3 /* !! */ , (String)var4_4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_13 /* !! */  = JioAds$LogLevel.NONE;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void checkCuePointMissed$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(long l2) {
        boolean bl2;
        String string2;
        boolean bl3;
        JioAdView$AdState jioAdView$AdState;
        JioAdView$AdState jioAdView$AdState2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener;
        Object object;
        Map.Entry entry;
        String string3;
        int n3;
        int n4;
        long l14;
        long l15;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        Object object5;
        block49: {
            block48: {
                String[] stringArray;
                block47: {
                    object5 = this;
                    n7 = 0;
                    object4 = null;
                    this.p0 = false;
                    object3 = this.m0;
                    if (object3 == null) return;
                    object3 = ((o)object3).g;
                    if (object3 == null) return;
                    object2 = ((m)object3).e;
                    Intrinsics.checkNotNull(object2);
                    Iterator iterator = ((c)object2).a.entrySet().iterator();
                    l15 = 0L;
                    l14 = 0L;
                    while (true) {
                        long l16;
                        void var19_51;
                        Object object6;
                        n4 = iterator.hasNext();
                        int n8 = 1;
                        stringArray = "start";
                        n3 = 1000;
                        string3 = "end";
                        if (n4 == 0) break;
                        entry = iterator.next();
                        Object k2 = entry.getKey();
                        int n10 = Intrinsics.areEqual(k2, stringArray);
                        if (n10 != 0) continue;
                        Object k3 = entry.getKey();
                        n10 = Intrinsics.areEqual(k3, string3);
                        if (n10 != 0) {
                            Long l17 = ((m)object3).n;
                        } else {
                            String string4 = (String)entry.getKey();
                            object = new String[]{":"};
                            List list = StringsKt.a0(string4, (String[])object, false, 0, 6);
                            object = (String)list.get(0);
                            object6 = Integer.parseInt((String)object) * 3600000;
                            entry = (String)list.get(n8);
                            n4 = Integer.parseInt((String)((Object)entry)) * 60000;
                            n8 = 2;
                            double d2 = Double.parseDouble((String)list.get(n8));
                            n10 = (int)d2 * 1000;
                            object6 = object6 + n4 + n10;
                            long l18 = object6;
                            Long l19 = l18;
                        }
                        if (var19_51 == null) continue;
                        long l20 = var19_51.longValue();
                        long l21 = l20 - l2;
                        object6 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                        if (object6 < 0) {
                            long l22;
                            l20 = 0L;
                            long l23 = l15 - l20;
                            object6 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                            if (object6 == false) {
                                long l24;
                                l15 = l24 = var19_51.longValue();
                            }
                            if ((object6 = (l22 = l15 - (l20 = var19_51.longValue())) == 0L ? 0 : (l22 < 0L ? -1 : 1)) >= 0) continue;
                            l15 = var19_51.longValue();
                            continue;
                        }
                        l20 = var19_51.longValue();
                        long l25 = l20 - l2;
                        object6 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                        if (object6 <= 0) continue;
                        l20 = 0L;
                        long l26 = l14 - l20;
                        object6 = l26 == 0L ? 0 : (l26 < 0L ? -1 : 1);
                        if (object6 == false) {
                            l14 = var19_51.longValue();
                        }
                        if ((object6 = (l16 = l14 - (l20 = var19_51.longValue())) == 0L ? 0 : (l16 < 0L ? -1 : 1)) <= 0) continue;
                        l14 = var19_51.longValue();
                    }
                    boolean bl4 = false;
                    Object var8_8 = null;
                    jioVmapAdsLoader$JioVmapListener = ((m)object3).d;
                    long l27 = 0L;
                    long l28 = l15 - l27;
                    Object object7 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                    if (object7 == false && (n4 = l14 == l27 ? 0 : (l14 < l27 ? -1 : 1)) == 0) {
                        if (jioVmapAdsLoader$JioVmapListener == null) return;
                        object3 = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
                        object4 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object3));
                        jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object4, null);
                        return;
                    }
                    if (object7 == false) break block47;
                    l27 = l2 - l15;
                    object = stringArray;
                    l12 = n3;
                    l8 = (l14 - l2) / l12;
                    long l29 = (l27 /= l12) - l8;
                    Object object8 = l29 == 0L ? 0 : (l29 < 0L ? -1 : 1);
                    if (object8 > 0) break block48;
                    l12 = l15;
                    break block49;
                }
                object = stringArray;
            }
            l12 = l14;
        }
        entry = new StringBuilder("vmap: prev cue point: ");
        object4 = ((m)object3).n;
        if (object4 != null && (n7 = (int)((l7 = l15 - (l8 = ((Long)object4).longValue())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) == 0) {
            object4 = string3;
        } else {
            n7 = (int)l15 / n3;
            object4 = com.jio.jioads.instream.video.vodVmap.m.a(n7);
        }
        ((StringBuilder)((Object)entry)).append((String)object4);
        ((StringBuilder)((Object)entry)).append(", next cue point: ");
        object4 = ((m)object3).n;
        if (object4 != null && (n7 = (int)((l4 = l14 - (l8 = ((Long)object4).longValue())) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
            object4 = string3;
        } else {
            n7 = (int)l14 / n3;
            object4 = com.jio.jioads.instream.video.vodVmap.m.a(n7);
        }
        ((StringBuilder)((Object)entry)).append((String)object4);
        com.jio.jioads.util.j.a(((StringBuilder)((Object)entry)).toString());
        object4 = ((m)object3).n;
        if (object4 != null && (n7 = (int)((l3 = l12 - (l8 = ((Long)object4).longValue())) == 0L ? 0 : (l3 < 0L ? -1 : 1))) == 0) {
            object4 = string3;
        } else {
            n7 = (int)l12 / n3;
            object4 = com.jio.jioads.instream.video.vodVmap.m.a(n7);
        }
        StringBuilder stringBuilder = Gn.a("vmap: calculated nearest cuepoint is : ", (String)object4, ", currentCuePoint preparing/prepared is: ");
        entry = ((m)object3).m;
        stringBuilder.append((String)((Object)entry));
        String string5 = stringBuilder.toString();
        com.jio.jioads.util.j.a(string5);
        long l30 = l12 == l15 ? 0 : (l12 < l15 ? -1 : 1);
        if (l30 != false) {
            l14 -= l2;
            l15 = n3;
            int n14 = ((m)object3).g;
            long l31 = (l14 /= l15) - (l15 = (long)n14);
            n4 = (int)(l31 == 0L ? 0 : (l31 < 0L ? -1 : 1));
            if (n4 > 0) {
                if (jioVmapAdsLoader$JioVmapListener == null) return;
                object3 = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
                object4 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object3));
                object3 = null;
                jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object4, null);
                return;
            }
        }
        Intrinsics.checkNotNull(object2);
        Map map2 = ((c)object2).a;
        int n15 = map2.containsKey(object4);
        if (n15 == 0) {
            n7 = 0;
            object4 = null;
            if (jioVmapAdsLoader$JioVmapListener == null) return;
            object3 = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
            object5 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object3));
            jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object5, null);
            return;
        }
        String string6 = ((m)object3).m;
        n15 = Intrinsics.areEqual(string6, object4);
        HashMap hashMap = ((m)object3).w;
        String string7 = "vmap: ExtraData value ";
        entry = "cuePoint";
        String string8 = "midroll";
        object5 = "postroll";
        long l34 = l12;
        String string9 = "preroll";
        String string10 = "adType";
        if (n15 != 0 && l30 == false && (jioAdView$AdState2 = ((m)object3).a.k0()) == (jioAdView$AdState = JioAdView$AdState.PREPARED)) {
            void var8_15;
            s s7 = ((m)object3).r;
            if (s7 != null) {
                JioVideoViewState jioVideoViewState = s7.A;
            } else {
                boolean bl5 = false;
                Object var8_14 = null;
            }
            z z5 = com.jio.jioads.videomodule.z.a;
            boolean bl6 = Intrinsics.areEqual(var8_15, z5);
            if (bl6) {
                String string11 = "vmap: cuepoint: ";
                object2 = new StringBuilder(string11);
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(" already prepared");
                com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
                ((m)object3).l = object4 = ((m)object3).m;
                boolean bl7 = false;
                object2 = null;
                ((m)object3).m = null;
                if (object4 != null) {
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    object4 = ((m)object3).l;
                    bl7 = false;
                    object2 = null;
                    n7 = (int)(kotlin.text.b.i((String)object4, (String)object, false) ? 1 : 0);
                    if (n7 != 0) {
                        if (hashMap != null) {
                            object5 = hashMap.put(string10, string9);
                        }
                    } else {
                        object4 = ((m)object3).l;
                        n7 = (int)(kotlin.text.b.i((String)object4, string3, false) ? 1 : 0);
                        if (n7 != 0) {
                            if (hashMap != null) {
                                object5 = (String)hashMap.put(string10, object5);
                            }
                        } else {
                            if (hashMap != null) {
                                object5 = hashMap.put(string10, string8);
                            }
                            if (hashMap != null) {
                                object5 = ((m)object3).l;
                                Intrinsics.checkNotNull(object5);
                                object5 = (String)hashMap.put(entry, object5);
                            }
                        }
                    }
                }
                object5 = new StringBuilder(string7);
                ((StringBuilder)object5).append(hashMap);
                object5 = ((StringBuilder)object5).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                if (jioVmapAdsLoader$JioVmapListener != null) {
                    object4 = JioAdEvent$AdEventType.CONTENT_PAUSE_REQUESTED;
                    object5 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object4));
                    jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object5, hashMap);
                }
                object5 = JioAdView$AdState.STARTING;
                object4 = (V)((m)object3).b;
                ((V)object4).e((JioAdView$AdState)((Object)object5));
                return;
            }
        }
        if (bl3 = Intrinsics.areEqual(string2 = ((m)object3).l, object4)) return;
        String string12 = ((m)object3).m;
        boolean bl8 = Intrinsics.areEqual(string12, object4);
        if (bl8) return;
        String string13 = "vmap: Preparing cuepoint: ";
        StringBuilder stringBuilder2 = new StringBuilder(string13);
        stringBuilder2.append((String)object4);
        String string14 = string13;
        String string15 = ", starting preparation";
        stringBuilder2.append(string15);
        com.jio.jioads.util.j.a(stringBuilder2.toString());
        s s8 = ((m)object3).r;
        if (s8 != null) {
            s8.u();
        }
        boolean bl9 = false;
        Object var8_22 = null;
        ((m)object3).r = null;
        String string16 = string15;
        ((m)object3).k = n15 = -1;
        ((m)object3).p = null;
        Intrinsics.checkNotNull(object2);
        object2 = (com.jio.jioads.instreamads.vmapParser.model.b)map2.get(object4);
        if (object2 == null) {
            if (jioVmapAdsLoader$JioVmapListener == null) return;
            object4 = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
            object5 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object4));
            n7 = 0;
            object4 = null;
            jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object5, null);
            return;
        }
        Object object9 = l34 == l2 ? 0 : (l34 < l2 ? -1 : 1);
        if (object9 > 0) {
            com.jio.jioads.util.j.a("vmap: Nearest cue point is in future, continuing content and preparing future cue");
            bl2 = false;
            object5 = null;
            ((m)object3).t = false;
            if (jioVmapAdsLoader$JioVmapListener != null) {
                JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
                object5 = new JioAdEvent(jioAdEvent$AdEventType);
                boolean bl10 = false;
                Object var8_24 = null;
                jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object5, null);
            }
        } else {
            String string17 = "vmap: Nearest cue point is in past, preparing past cue point";
            com.jio.jioads.util.j.a(string17);
            int n16 = ((String)object4).length();
            if (n16 > 0) {
                boolean bl11;
                if (hashMap != null) {
                    hashMap.clear();
                }
                if (bl11 = Intrinsics.areEqual(object4, object)) {
                    if (hashMap != null) {
                        object5 = hashMap.put(string10, string9);
                    }
                } else {
                    boolean bl12 = Intrinsics.areEqual(object4, string3);
                    if (bl12) {
                        if (hashMap != null) {
                            object5 = (String)hashMap.put(string10, object5);
                        }
                    } else {
                        if (hashMap != null) {
                            object5 = hashMap.put(string10, string8);
                        }
                        if (hashMap != null) {
                            object5 = (String)hashMap.put(entry, object4);
                        }
                    }
                }
                object5 = new StringBuilder(string7);
                ((StringBuilder)object5).append(hashMap);
                object5 = ((StringBuilder)object5).toString();
                com.jio.jioads.util.j.a((String)object5);
            }
            ((m)object3).t = bl2 = true;
        }
        object5 = (bl2 = Intrinsics.areEqual(object4, string3)) ? ((m)object3).j : ((m)object3).i;
        ((m)object3).o = object5;
        ((m)object3).m = object4;
        object5 = ((m)object3).u;
        ((ArrayList)object5).clear();
        object2 = ((com.jio.jioads.instreamads.vmapParser.model.b)object2).c;
        ((ArrayList)object5).addAll(object2);
        com.jio.jioads.util.j.a("vmap: Fetch ad Source from nearest cue point");
        object2 = ((m)object3).m;
        boolean bl13 = false;
        Object var8_27 = null;
        boolean bl14 = kotlin.text.b.i((String)object2, string3, false);
        if (bl14) {
            String string18 = " and auto postroll preparation disabled is ";
            object2 = Gn.a("vmap: nearest cue point is : ", (String)object4, string18);
            boolean bl15 = ((m)object3).v;
            ((StringBuilder)object2).append(bl15);
            object2 = ((StringBuilder)object2).toString();
            com.jio.jioads.util.j.a((String)object2);
            bl14 = ((m)object3).v;
            if (bl14) return;
            String string19 = string14;
            object2 = new StringBuilder(string14);
            String string20 = ((m)object3).m;
            ((StringBuilder)object2).append(string20);
            String string21 = string16;
            ((StringBuilder)object2).append(string16);
            com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
            bl14 = false;
            object2 = null;
            ((m)object3).e((String)object4, 0, (List)object5);
            return;
        }
        String string22 = string14;
        String string23 = string16;
        bl14 = false;
        object2 = null;
        object = new StringBuilder(string14);
        String string24 = ((m)object3).m;
        ((StringBuilder)object).append(string24);
        ((StringBuilder)object).append(string16);
        String string25 = ((StringBuilder)object).toString();
        com.jio.jioads.util.j.a(string25);
        ((m)object3).e((String)object4, 0, (List)object5);
    }

    public final void checkIfReachingCuePoint$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(long l2, long l3) {
        Object object = this.m0;
        if (object != null && (object = ((o)object).g) != null) {
            int n3;
            Object object2;
            int n4;
            Object object3;
            Object object4;
            int n7;
            Object object5 = l3;
            ((m)object).n = object5;
            long l4 = 0L;
            int n8 = 1000;
            Object object6 = "start";
            String string2 = "end";
            Object object7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object7 == false) {
                object5 = object6;
            } else {
                l4 = n8;
                long l7 = l2 / l4;
                int n10 = (int)l7;
                n7 = (int)(l4 = l3 / l4);
                object5 = n10 == n7 ? string2 : com.jio.jioads.instream.video.vodVmap.m.a(n10);
            }
            n7 = 0;
            String string3 = "message";
            c c2 = ((m)object).e;
            if (c2 != null) {
                Object object8;
                Intrinsics.checkNotNull(c2);
                object4 = c2.a;
                boolean bl2 = object4.containsKey(object5);
                if (bl2 && (object4 = ((m)object).a.k0()) == (object8 = JioAdView$AdState.PREPARED)) {
                    object4 = ((m)object).r;
                    if (object4 != null) {
                        object4 = ((s)object4).A;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    object8 = com.jio.jioads.videomodule.z.a;
                    bl2 = Intrinsics.areEqual(object4, object8);
                    if (bl2) {
                        object4 = new StringBuilder("vmap: cuepoint ");
                        ((StringBuilder)object4).append((String)object5);
                        ((StringBuilder)object4).append(" is prepared");
                        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), string3);
                        object4 = JioAds.Companion;
                        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object8 = JioAds$LogLevel.NONE;
                        ((m)object).l = object5;
                        object3 = ((String)object5).length();
                        HashMap hashMap = ((m)object).w;
                        if (object3 > 0) {
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                            boolean bl3 = Intrinsics.areEqual(object5, object6);
                            object8 = "adType";
                            if (bl3) {
                                if (hashMap != null) {
                                    object5 = hashMap.put(object8, "preroll");
                                }
                            } else {
                                bl3 = Intrinsics.areEqual(object5, string2);
                                if (bl3) {
                                    if (hashMap != null) {
                                        object5 = hashMap.put(object8, "postroll");
                                    }
                                } else {
                                    if (hashMap != null) {
                                        object6 = hashMap.put(object8, "midroll");
                                    }
                                    if (hashMap != null) {
                                        object6 = "cuePoint";
                                        object5 = (String)hashMap.put(object6, object5);
                                    }
                                }
                            }
                        }
                        object5 = new StringBuilder("vmap: _ADS ");
                        ((StringBuilder)object5).append(hashMap);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string3);
                        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = ((m)object).d;
                        Intrinsics.checkNotNull(object5);
                        object4 = JioAdEvent$AdEventType.CONTENT_PAUSE_REQUESTED;
                        object6 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object4));
                        object5.onJioVmapEvent((JioAdEvent)object6, hashMap);
                        object5 = JioAdView$AdState.STARTING;
                        object6 = (V)((m)object).b;
                        ((V)object6).e((JioAdView$AdState)((Object)object5));
                    }
                }
            }
            long l8 = n8;
            l2 /= l8;
            int n14 = ((m)object).g;
            long l12 = n14;
            l3 /= l8;
            l3 = (l2 += l12) / l3;
            l8 = 1L;
            object4 = " seconds, starting preparation";
            object3 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (object3 == false && (n4 = Intrinsics.areEqual(object2 = ((m)object).l, string2)) == 0 && (n4 = Intrinsics.areEqual(object2 = ((m)object).m, string2)) == 0 && c2 != null && (object2 = c2.a) != null && (n4 = object2.containsKey(string2)) == (n3 = 1)) {
                String string4 = "vmap: Reaching end of content in next ";
                Object object9 = new StringBuilder(string4);
                object9.append(n14);
                object9.append((String)object4);
                Intrinsics.checkNotNullParameter(object9.toString(), string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object9 = JioAds$LogLevel.NONE;
                boolean bl4 = ((m)object).v;
                if (!bl4) {
                    ((m)object).i();
                }
            } else {
                int n15 = (int)l2;
                String string5 = com.jio.jioads.instream.video.vodVmap.m.a(n15);
                if (c2 != null) {
                    Intrinsics.checkNotNull(c2);
                    Object object10 = c2.a;
                    n4 = object10.containsKey(string5);
                    if (n4 != 0 && (n4 = Intrinsics.areEqual(object2 = ((m)object).l, string5)) == 0 && (n4 = Intrinsics.areEqual(object2 = ((m)object).m, string5)) == 0) {
                        object2 = new StringBuilder("vmap: Reaching next cuepoint: ");
                        ((StringBuilder)object2).append(string5);
                        ((StringBuilder)object2).append(" in next ");
                        ((StringBuilder)object2).append(n14);
                        ((StringBuilder)object2).append((String)object4);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string3);
                        object2 = JioAds.Companion;
                        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        Object object11 = JioAds$LogLevel.NONE;
                        ((m)object).r = null;
                        ((m)object).k = n3 = -1;
                        Intrinsics.checkNotNull(c2);
                        object10 = (com.jio.jioads.instreamads.vmapParser.model.b)object10.get(string5);
                        if (object10 != null) {
                            object11 = ((m)object).i;
                            ((m)object).o = object11;
                            ((m)object).m = string5;
                            object11 = ((m)object).u;
                            ((ArrayList)object11).clear();
                            object10 = ((com.jio.jioads.instreamads.vmapParser.model.b)object10).c;
                            ((ArrayList)object11).addAll(object10);
                            Intrinsics.checkNotNullParameter("vmap: Fetch ad Source from mid roll", string3);
                            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            n15 = 0;
                            object10 = null;
                            ((m)object).e(string5, 0, (List)object11);
                        }
                    }
                }
            }
        }
    }

    public final boolean closeAd() {
        Object object;
        Object object2;
        Object object3;
        block11: {
            block9: {
                block10: {
                    block8: {
                        object3 = new StringBuilder();
                        object2 = this.m;
                        j_0.k((StringBuilder)object3, object2, ": Publisher called closeAd()");
                        object3 = JioAds.Companion;
                        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                        object2 = this.n;
                        object = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                        if (object2 != object) break block8;
                        object3 = this.q0;
                        object2 = JioAdView$AdState.DESTROYED;
                        if (object3 != object2 && (object3 = this.m0) != null) {
                            Intrinsics.checkNotNull(object3);
                            ((o)object3).J();
                        }
                        break block9;
                    }
                    object = JioAdView$AD_TYPE.INTERSTITIAL;
                    if (object2 != object) break block10;
                    object3 = this.q0;
                    object2 = JioAdView$AdState.DESTROYED;
                    if (object3 != object2 && (object3 = this.m0) != null) {
                        Intrinsics.checkNotNull(object3);
                        ((o)object3).J();
                    }
                    if ((object3 = this.m0) != null && (object3 = ((o)object3).r) != null) {
                        ((d)object3).forceCloseAd();
                    }
                    break block9;
                }
                object = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                if (object2 != object) break block11;
                object3 = this.m0;
                if (object3 != null && (object3 = ((o)object3).r) != null) {
                    ((d)object3).forceCloseAd();
                }
            }
            return true;
        }
        object2 = new StringBuilder();
        object = this.m;
        d_0.a((StringBuilder)object2, (String)object, ": closeAd() API is only available for INSTREAM_VIDEO, INSTREAM_AUDIO & INTERSTITIAL", (JioAds$Companion)object3);
        return false;
    }

    public final void collapseAd() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        String string2 = ": Publisher called collapseAd()";
        j_0.k((StringBuilder)object, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).collapseAd();
            }
        }
    }

    public final void disableCTA(boolean bl2) {
        o o3 = this.m0;
        if (o3 != null) {
            o3.z = bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void disableFocus() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) {
            StringBuilder stringBuilder = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            String string2 = this.m;
            String string3 = "message";
            ir3_0.b(stringBuilder, string2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        Context context = this.l;
        if (context != null) {
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(context);
            int n3 = utility.getCurrentUIModeType(context);
            int n4 = 4;
            if (n3 == n4) {
                this.Q = true;
                n3 = 0;
                Object var1_3 = null;
                this.R = false;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = this.m;
        String string5 = ": setEnableSDKFocusControl() API is only available for tv";
        j_0.k(stringBuilder, string4, string5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void disablePostrollPreparation(boolean bl2) {
        o o3 = this.m0;
        if (o3 != null) {
            o3.y = bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void enableFocus() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) {
            StringBuilder stringBuilder = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            String string2 = this.m;
            String string3 = "message";
            ir3_0.b(stringBuilder, string2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        Context context = this.l;
        if (context != null) {
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(context);
            int n3 = utility.getCurrentUIModeType(context);
            int n4 = 4;
            if (n3 == n4) {
                Object var1_3 = null;
                this.Q = false;
                n3 = 1;
                this.R = n3;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = this.m;
        String string5 = ": setEnableSDKFocusControl() API is only available for tv";
        j_0.k(stringBuilder, string4, string5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void enableMediaCaching(JioAds$MediaType jioAds$MediaType) {
        Intrinsics.checkNotNullParameter((Object)jioAds$MediaType, "mediaType");
        this.w0 = jioAds$MediaType;
    }

    public final void enableVerticalAds(boolean bl2) {
        this.h1 = bl2;
    }

    public final void expandAd() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        String string2 = ": Publisher called expandAd()";
        j_0.k((StringBuilder)object, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).expandAd();
            }
        }
    }

    public final void fetchNextAdData() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        Object object3 = ": Publisher called fetchNextAdData()";
        j_0.k((StringBuilder)object, object2, object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.m0;
        if (object2 != null && (object2 = this.n) == (object3 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            object = this.B0;
            Intrinsics.checkNotNull(object);
            ((com.jio.jioads.native.customsuport.a)object).a();
        } else {
            object2 = new StringBuilder();
            object3 = this.m;
            String string2 = ": fetchNextAdData() available only for adpod case";
            d_0.a((StringBuilder)object2, object3, string2, (JioAds$Companion)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String getAdClickUrl() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE3;
        Object object = yr1_2.b(com.jio.jioads.adinterfaces.d0.c);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.m;
        j_0.k(stringBuilder, string2, ": inside getAdClickUrl");
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        String string3 = null;
        if (jioAdView$AdState == jioAdView$AdState2) {
            object = new StringBuilder();
            String string4 = this.m;
            String string5 = ": JioAdView is already destroyed";
            d_0.a((StringBuilder)object, string4, string5, jioAds$Companion);
            return null;
        }
        JioAdView$AD_TYPE jioAdView$AD_TYPE4 = this.n;
        JioAdView$AD_TYPE jioAdView$AD_TYPE5 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        if (jioAdView$AD_TYPE4 != jioAdView$AD_TYPE5 && jioAdView$AD_TYPE4 != (jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.CUSTOM_NATIVE) && jioAdView$AD_TYPE4 != (jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.INFEED) && jioAdView$AD_TYPE4 != (jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            object = "getAdClickUrl() API is only supported for Native ads and Instream video ad";
            String string6 = "message";
            v12.a((String)object, string6, jioAds$Companion);
            return null;
        }
        JioAdView$AD_TYPE jioAdView$AD_TYPE6 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
        if (jioAdView$AD_TYPE4 != jioAdView$AD_TYPE6 && jioAdView$AD_TYPE4 != (jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.INFEED) && jioAdView$AD_TYPE4 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            if (jioAdView$AD_TYPE4 != jioAdView$AD_TYPE5) return null;
            if ((object = (com.jio.jioads.jioreel.vast.a)((hh3_2)object).getValue()) == null) return null;
            object = this.m0;
            if (object == null) return string3;
            object = ((o)object).r;
            if (object == null) return string3;
            return ((d)object).getInstreamVideoCTAClickUrl();
        }
        object = ((Object)StringsKt.m0(this.G)).toString();
        String string7 = ((Object)StringsKt.m0(this.H)).toString();
        String string8 = ((Object)StringsKt.m0(this.I)).toString();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string8);
        if (!bl2) {
            return string8;
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            return object;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)string7);
        if (bl4) return null;
        return string7;
    }

    public final String getAdCtaText() {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        Object object3 = null;
        if (object != object2) {
            object = this.n;
            object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            if (object == object2) {
                object3 = this.F;
            } else {
                int n3;
                object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                if (object == object2 && (object = (object = this.m0) != null && (object = ((o)object).r) != null ? ((d)object).getCtaText() : null) != null && (n3 = ((String)object).length()) != 0) {
                    object3 = object;
                }
            }
            return object3;
        }
        object = new StringBuilder();
        object2 = this.m;
        j_0.k((StringBuilder)object, (String)object2, ": getAdCtaText() API is only supported for Native and Instream video ad");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return null;
    }

    public final String getAdDuration() {
        return null;
    }

    public final void getAdExposureTime() {
        Object object = this.n;
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_AUDIO;
        if (object == jioAdView$AD_TYPE) {
            object = this.m0;
            if (object != null && (object = ((o)object).r) != null) {
                ((d)object).getAudioCurrentPosition();
            }
        } else {
            object = this.m0;
            if (object != null && (object = ((o)object).r) != null) {
                ((d)object).getVideoCurrentPosition();
            }
        }
    }

    public final String getAdId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.J;
    }

    public final AdMetaData getAdMetadata() {
        return null;
    }

    public final JioAdView$AdState getAdState() {
        return this.q0;
    }

    public final String getAdTitle() {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            object = this.n;
            object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            if (object != object2 && object != (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE)) {
                object = new StringBuilder();
                object2 = this.m;
                String string2 = ": getNativeAdTitle() API is only supported for Native and Instream video ad";
                j_0.k((StringBuilder)object, (String)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            } else {
                return this.E;
            }
        }
        return null;
    }

    public final JioAdView$AD_TYPE getAdType() {
        return this.n;
    }

    public final View getAdView() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).q;
        } else {
            object = null;
        }
        return object;
    }

    public final o getAdViewController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.m0;
    }

    public final void getAds$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(W object, Integer object2) {
        Object object3;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "adSelectionListener");
        Object object4 = new StringBuilder();
        Object object5 = this.m;
        ((StringBuilder)object4).append((String)object5);
        ((StringBuilder)object4).append(": Inside getAds.cuePoint on =");
        ((StringBuilder)object4).append(object2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        this.h = n3;
        this.F0 = object2;
        this.i = object;
        object5 = this.m0;
        if (object5 != null) {
            object3 = this.m;
            Intrinsics.checkNotNull(object3);
            Serializable serializable = this.F0;
            CharSequence charSequence = "adspotId";
            Intrinsics.checkNotNullParameter(object3, (String)charSequence);
            object5 = ((o)object5).f;
            if (object5 != null) {
                boolean bl2;
                Intrinsics.checkNotNullParameter(object3, (String)charSequence);
                if (serializable != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object3);
                    char c2 = '_';
                    ((StringBuilder)charSequence).append(c2);
                    ((StringBuilder)charSequence).append(serializable);
                    object3 = ((StringBuilder)charSequence).toString();
                }
                if (bl2 = ((HashMap)(serializable = ((t)object5).a())).containsKey(object3)) {
                    serializable = ((t)object5).a();
                    ((HashMap)serializable).remove(object3);
                }
                if (bl2 = ((HashMap)(serializable = ((t)object5).c())).containsKey(object3)) {
                    object5 = ((t)object5).c();
                    ((HashMap)object5).remove(object3);
                }
            }
        }
        object5 = JioAdView$AdState.REQUESTED;
        this.q0 = object5;
        object3 = JioAdView$AdState.DESTROYED;
        if (object5 != object3) {
            object4 = Executors.newFixedThreadPool(n3);
            object5 = new Zm0(this, n3, object2, object);
            object4.submit((Runnable)object5);
        } else {
            object = new StringBuilder();
            object2 = this.m;
            String string2 = ": object already destroyed";
            d_0.a((StringBuilder)object, (String)object2, string2, (JioAds$Companion)object4);
        }
    }

    public final String getAdspotId() {
        return this.m;
    }

    public final String getCTABrandPage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.I;
    }

    public final String getCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.H;
    }

    public final Context getContext() {
        return this.l;
    }

    public final String getCtaTextFormView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.F;
    }

    public final JioAdView$AdDetails getCurrentAdDetails() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        j_0.k((StringBuilder)object, object2, ": inside getCurrentAdDetails");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.q0;
        Object object3 = JioAdView$AdState.DESTROYED;
        JioAdView$AdDetails jioAdView$AdDetails = null;
        if (object2 != object3) {
            object = this.m0;
            if (object != null && (object = ((o)object).r) != null) {
                jioAdView$AdDetails = ((d)object).getCurrentAdDetails();
            }
            return jioAdView$AdDetails;
        }
        object2 = new StringBuilder();
        object3 = this.m;
        d_0.a((StringBuilder)object2, (String)object3, ": JioAdView is already destroyed", (JioAds$Companion)object);
        return null;
    }

    public final View getCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.y0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ViewGroup getCustomNativeContainer() {
        int n3;
        int n4;
        Object object = this.m0;
        if (object != null && (n4 = ((o)object).A) == (n3 = 1)) {
            object = new StringBuilder();
            String string2 = this.m;
            ((StringBuilder)object).append(string2);
            string2 = ": JioAdMediationController inside mediation ad getCustomNativeContainer ";
            ((StringBuilder)object).append(string2);
            n3 = this.d0;
            String string3 = "message";
            w12_0.b(n3, string3, (StringBuilder)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n4 = this.d0;
            n3 = -1;
            if (n4 != n3) {
                return this.g0;
            }
            object = this.m0;
            if (object == null) return null;
            object = ((o)object).r;
            if (object == null) return null;
            return ((d)object).getCustomNativeContainer();
        }
        object = new StringBuilder();
        String string4 = this.m;
        String string5 = ": inside without mediation ad getCustomNativeContainer ";
        j_0.k((StringBuilder)object, string4, string5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.m0;
        if (object == null) return null;
        object = ((o)object).r;
        if (object == null) return null;
        return ((d)object).getCustomNativeContainer();
    }

    public final List getDynamicDisplayAdSizes() {
        return this.C;
    }

    public final String getGlobalId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "adspotId");
        Object object = this.l;
        if (object != null) {
            boolean bl2;
            Intrinsics.checkNotNull(object);
            Object object2 = "GlobalId";
            String string3 = "common_prefs";
            object = j_0.d((Context)object, string3, 0, "", (String)object2);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
            object = (String)object;
            JSONObject jSONObject = new JSONObject();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (!bl3) {
                jSONObject = new JSONObject((String)object);
            }
            object = new JSONObject();
            object2 = this.m0;
            if (object2 != null) {
                object2 = ((o)object2).U();
            } else {
                bl3 = false;
                object2 = null;
            }
            bl3 = TextUtils.isEmpty((CharSequence)object2);
            string3 = "optJSONObject(...)";
            if (!bl3) {
                object2 = this.m0;
                Intrinsics.checkNotNull(object2);
                object2 = ((o)object2).U();
                Intrinsics.checkNotNull(object2);
                bl3 = jSONObject.has((String)object2);
                if (bl3) {
                    object = this.m0;
                    Intrinsics.checkNotNull(object);
                    object = ((o)object).U();
                    Intrinsics.checkNotNull(object);
                    object = jSONObject.optJSONObject((String)object);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                }
            } else {
                object2 = this.l;
                if (object2 != null) {
                    object2 = object2.getPackageName();
                } else {
                    bl3 = false;
                    object2 = null;
                }
                bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object2 = this.l;
                    if (object2 != null) {
                        object2 = object2.getPackageName();
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    bl3 = jSONObject.has((String)object2);
                    if (bl3) {
                        object = this.l;
                        object = object != null ? object.getPackageName() : null;
                        object = jSONObject.optJSONObject((String)object);
                        Intrinsics.checkNotNullExpressionValue(object, string3);
                    }
                }
            }
            jSONObject = object.optJSONObject("adspots");
            object2 = "id";
            if (jSONObject != null && (bl2 = jSONObject.has(string2))) {
                string2 = jSONObject.get(string2).toString();
                object = new JSONObject(string2);
                string2 = object.optString((String)object2);
            } else {
                string2 = object.optString((String)object2, null);
            }
            return string2;
        }
        return null;
    }

    public final com.jio.jioads.common.b getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.d;
    }

    public final JioAdsMetadata getJioAdsMetaData() {
        return this.v;
    }

    public final boolean getJioAdskeepScreenOn() {
        return this.x;
    }

    public final JioAdListener getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.o;
    }

    public final JioAdView$AdState getMAdState() {
        return this.q0;
    }

    public final JioAdView$AD_TYPE getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.n;
    }

    public final String getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.m;
    }

    public final Map getMMetaData() {
        return this.w;
    }

    public final int getMediationIndexCounter() {
        return this.A;
    }

    public final void getMetaData() {
        int n3;
        boolean bl2;
        int n4;
        int n7;
        Object object;
        int n8;
        Object object2 = this.v;
        if (object2 == null) {
            object2 = new JioAdsMetadata$Builder();
            this.v = object2 = ((JioAdsMetadata$Builder)object2).build();
        }
        object2 = this.w;
        int n10 = 1;
        if (object2 != null && (n8 = object2.isEmpty() ^ n10) == n10 && (object2 = this.v) != null) {
            Map map2 = this.w;
            ((JioAdsMetadata)object2).setCustomMetadata(map2);
        }
        object2 = this.J0;
        n8 = TextUtils.isEmpty((CharSequence)object2);
        int n14 = 32;
        if (n8 == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.J0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setChannelId((String)object);
        }
        if ((n8 = TextUtils.isEmpty((CharSequence)(object2 = this.L0))) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.L0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setShowName((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.K0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.K0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setChannelName((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.M0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.M0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setPageCategory((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.N0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.N0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setSectionCategory((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.O0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.O0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setLanguageOfArticle((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.P0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.P0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setLanguage((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.Q0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.Q0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setContentId((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.g1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.g1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setContentTitle((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.R0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.R0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setContentType((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.S0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.S0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setVendor((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.T0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.T0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setActor((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.U0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.U0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setObjects((String)object);
        }
        if ((object2 = this.V0) != null && (object = this.v) != null) {
            ((JioAdsMetadata)object).setKIDS_PROTECTED((Constants$KIDS_PROTECTED)((Object)object2));
        }
        if ((object2 = this.b1) != null && (object = this.v) != null) {
            ((JioAdsMetadata)object).setGender((Constants$GENDER)((Object)object2));
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.W0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.W0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setAppVersion((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.X0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.X0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setGenre((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.Y0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.Y0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setState((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.Z0)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.Z0);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setCity((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.a1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.a1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setAge((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.c1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.c1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setCountry((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.d1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.d1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setPincode((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.e1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.e1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            object = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setKeywords((String)object);
        }
        if ((n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.f1)) ? 1 : 0)) == 0 && (object2 = this.v) != null) {
            object = String.valueOf(this.f1);
            n7 = ((String)object).length() - n10;
            n4 = 0;
            bl2 = false;
            while (n4 <= n7) {
                n3 = !bl2 ? n4 : n7;
                n3 = Intrinsics.compare(((String)object).charAt(n3), n14);
                n3 = n3 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n3 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n3 == 0) break;
                n7 += -1;
            }
            String string2 = ((Object)((String)object).subSequence(n4, n7 += n10)).toString();
            ((JioAdsMetadata)object2).setPlacementName(string2);
        }
    }

    public final String getNativeAdClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.G;
    }

    public final ViewGroup getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.e;
    }

    public final int getRequestCode() {
        return this.a;
    }

    public final int[] getSdkDecidedDimensions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.K;
    }

    public final boolean getShouldUseVolley() {
        return this.u0;
    }

    public final String getTitleFromAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.E;
    }

    public final String getUniqueId() {
        return null;
    }

    public final long getUpdatedCustomDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.D0;
    }

    public final Integer getVideoAdDuration() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        String string2 = ": Publisher called getVideoAdDuration()";
        j_0.k((StringBuilder)object, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object = ((d)object).getVideoAdDuration();
            } else {
                int n3 = -1;
                object = n3;
            }
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void handleNativeAdClick() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = this.m;
            String string3 = ": JioAdView is already destroyed";
            j_0.k(stringBuilder, string2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = this.m;
        Object object = ": handleNativeAdClick is called";
        j_0.k(stringBuilder, string4, (String)object);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        Context context = this.l;
        if (context != null) {
            object = Utility.INSTANCE;
            Intrinsics.checkNotNull(context);
            int n3 = ((Utility)object).getCurrentUIModeType(context);
            int n4 = 4;
            if (n3 == n4) {
                o o3;
                JioAdView$AD_TYPE jioAdView$AD_TYPE;
                JioAdView$AD_TYPE jioAdView$AD_TYPE2 = this.n;
                JioAdView$AD_TYPE jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                if (jioAdView$AD_TYPE2 != jioAdView$AD_TYPE3 && jioAdView$AD_TYPE2 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED)) {
                    JioAdView$AD_TYPE jioAdView$AD_TYPE4 = JioAdView$AD_TYPE.CONTENT_STREAM;
                    if (jioAdView$AD_TYPE2 != jioAdView$AD_TYPE4) return;
                }
                if ((o3 = this.m0) == null) return;
                d d2 = o3.r;
                if (d2 == null) return;
                d2.handleClick();
                return;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        object = this.m;
        String string5 = ": handleNativeAdClick function is only supported in TV";
        d_0.a(stringBuilder2, (String)object, string5, jioAds$Companion);
    }

    public final void hideAdControls() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).hideControls();
            }
        }
    }

    public final void hideCTA() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).hideCTAButton();
            }
        }
    }

    public final void hidePlayButton() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).hidePlayButton();
            }
        }
    }

    public final void hideSkip() {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object2 = ((o)object).g;
            if (object2 != null && (object2 = ((m)object2).r) != null) {
                ((s)object2).m();
            }
            if ((object = ((o)object).r) != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).hideSkip();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isAdClickable() {
        Object object = new StringBuilder();
        String string2 = this.m;
        String string3 = ": Publisher called isAdClickable()";
        j_0.k((StringBuilder)object, string2, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object == jioAdView$AdState) return false;
        object = this.m0;
        if (object == null) return false;
        Intrinsics.checkNotNull(object);
        object = ((o)object).r;
        if (object == null) return false;
        Intrinsics.checkNotNull(object);
        return ((d)object).isAdClickable();
    }

    public final boolean isCompanionDetached$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.x0;
    }

    public final boolean isFromLoadCustomAd() {
        return this.H0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isMediaMuted() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) return false;
        o o3 = this.m0;
        if (o3 == null) return false;
        Intrinsics.checkNotNull(o3);
        d d2 = o3.r;
        if (d2 == null) return false;
        Intrinsics.checkNotNull(d2);
        return d2.isMediaMuted();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isMediaPlaying() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) return false;
        o o3 = this.m0;
        if (o3 == null) return false;
        Intrinsics.checkNotNull(o3);
        d d2 = o3.r;
        if (d2 == null) return false;
        Intrinsics.checkNotNull(d2);
        return d2.isMediaPlaying();
    }

    public final boolean isOnAdFailedCalled() {
        return this.I0;
    }

    public final boolean isPgmCampaignAvailable$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.L;
    }

    public final boolean isPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.v0;
    }

    public final boolean isPrimaryAd() {
        return this.s0;
    }

    public final boolean isRefreshStarted() {
        return this.z;
    }

    public final boolean isSystemApp() {
        return this.r0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isVideoAdClickable() {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) return false;
        o o3 = this.m0;
        if (o3 == null) return false;
        Intrinsics.checkNotNull(o3);
        d d2 = o3.r;
        if (d2 == null) return false;
        Intrinsics.checkNotNull(d2);
        return d2.isAdClickable();
    }

    public final void loadAd() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        object.append((String)object2);
        object.append(": Publisher called loadAd(): state: ");
        object2 = this.q0;
        object2 = object2 != null ? ((Enum)object2).name() : null;
        object.append((String)object2);
        com.jio.jioads.util.j.a(object.toString());
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object == object2) {
            object = new StringBuilder();
            object2 = this.m;
            object.append((String)object2);
            object.append(": can not call loadAd as JioAdView is destroyed");
            com.jio.jioads.util.j.b(object.toString());
            return;
        }
        boolean bl2 = this.b();
        if (bl2) {
            object = new StringBuilder();
            object2 = this.m;
            object.append((String)object2);
            object.append(": can not call loadAd as ad is running");
            com.jio.jioads.util.j.b(object.toString());
            return;
        }
        this.M = bl2 = true;
        object = this.q0;
        object2 = JioAdView$AdState.FAILED;
        if (object != object2 && object != (object2 = JioAdView$AdState.CLOSED)) {
            object = this.l;
            if (object != null) {
                object2 = Utility.INSTANCE;
                Intrinsics.checkNotNull(object);
                bl2 = ((Utility)object2).isInternetAvailable((Context)object);
                if (!bl2) {
                    object = new StringBuilder();
                    object2 = this.m;
                    object.append((String)object2);
                    object.append(": Not connected to the Internet.Please check your connection and try again.");
                    com.jio.jioads.util.j.b(object.toString());
                    object = JioAdError.Companion;
                    object2 = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
                    JioAdError jioAdError = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), "Not connected to the Internet.Please check your connection and try again.");
                    JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, null, "loadAd", "JioAdView", "", null, 64, null);
                    return;
                }
            }
            if ((object = this.q0) == (object2 = JioAdView$AdState.PREPARED)) {
                object = JioAdView$AdState.STARTING;
                this.q0 = object;
                object = this.m0;
                if (object != null) {
                    ((o)object).c();
                }
            } else {
                object = new StringBuilder();
                object2 = this.m;
                object.append((String)object2);
                object.append(": can not load ad as current state is ");
                object2 = this.q0;
                object.append(object2);
                object = object.toString();
                com.jio.jioads.util.j.a((String)object);
            }
            return;
        }
        object = new StringBuilder();
        object2 = this.m;
        object.append((String)object2);
        object.append(": Ad is not cached");
        com.jio.jioads.util.j.b(object.toString());
        object = JioAdError.Companion;
        object2 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
        JioAdError jioAdError = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), "Ad is not cached");
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, jioAdError, false, d2, "loadAd", "JioAdView", "Ad is in failed state inside loadad", null, 64, null);
    }

    public final void loadCustomAd() {
        Object object;
        Serializable serializable;
        Object object2;
        int n3 = 1;
        this.H0 = n3;
        boolean bl2 = this.C0;
        char c2 = '_';
        String string2 = null;
        CharSequence charSequence = "adspotId";
        if (bl2) {
            this.C0 = false;
        } else {
            long l2;
            this.D0 = l2 = (long)-1;
            this.setLastAdDelivered(false);
            object2 = this.m0;
            if (object2 != null) {
                string2 = this.m;
                Intrinsics.checkNotNull(string2);
                serializable = this.F0;
                Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                object2 = ((o)object2).f;
                if (object2 != null) {
                    boolean bl3;
                    Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                    if (serializable != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string2);
                        stringBuilder.append(c2);
                        stringBuilder.append(serializable);
                        string2 = stringBuilder.toString();
                    }
                    if (bl3 = ((HashMap)(serializable = ((t)object2).a())).containsKey(string2)) {
                        serializable = ((t)object2).a();
                        ((HashMap)serializable).remove(string2);
                    }
                    if (bl3 = ((HashMap)(serializable = ((t)object2).c())).containsKey(string2)) {
                        object2 = ((t)object2).c();
                        ((HashMap)object2).remove(string2);
                    }
                }
            }
        }
        bl2 = this.P;
        if (bl2 && (object2 = this.m0) != null) {
            string2 = this.m;
            Intrinsics.checkNotNull(string2);
            serializable = this.F0;
            Intrinsics.checkNotNullParameter(string2, (String)charSequence);
            object2 = ((o)object2).f;
            if (object2 != null) {
                Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                if (serializable != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(c2);
                    ((StringBuilder)charSequence).append(serializable);
                    string2 = ((StringBuilder)charSequence).toString();
                }
                if ((c2 = (char)(((HashMap)(object = ((t)object2).a())).containsKey(string2) ? 1 : 0)) != '\u0000') {
                    object = ((t)object2).a();
                    ((HashMap)object).remove(string2);
                }
                if ((c2 = (char)(((HashMap)(object = ((t)object2).c())).containsKey(string2) ? 1 : 0)) != '\u0000') {
                    object2 = ((t)object2).c();
                    ((HashMap)object2).remove(string2);
                }
            }
        }
        if ((object2 = this.q0) != (object = JioAdView$AdState.DESTROYED)) {
            this.getMetaData();
            JioAds.Companion.getInstance().getPredefinedMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = Executors.newFixedThreadPool(n3);
            object = new sr3_0(this, n3);
            object2.submit((Runnable)object);
        } else {
            Object object3 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object2 = this.m;
            object = "message";
            ir3_0.b(object3, (String)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void loadCustomAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(long l2) {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState != jioAdView$AdState2) {
            boolean bl2;
            this.D0 = l2;
            this.C0 = bl2 = true;
            this.loadCustomAd();
        }
    }

    public final void muteVideoAd() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        String string2 = ": Publisher called muteVideoAd()";
        j_0.k((StringBuilder)object, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).muteVideoAd();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDestroy() {
        Exception exception2;
        Object object;
        Object object2;
        block7: {
            Object object3;
            block6: {
                object3 = new StringBuilder();
                object2 = this.m;
                object = " : JioAdView destroy called";
                j_0.k((StringBuilder)object3, (String)object2, (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                try {
                    object3 = JioAdView$AdState.DESTROYED;
                    this.q0 = object3;
                    object3 = this.m0;
                    if (object3 == null) break block6;
                    ((o)object3).M();
                }
                catch (Exception exception2) {
                    break block7;
                }
            }
            object3 = null;
            this.m0 = null;
            this.w = null;
            object2 = this.j;
            if (object2 != null) {
                ((ArrayList)object2).clear();
            }
            this.j = null;
            this.g = null;
            this.v = null;
            this.o = null;
            object2 = this.C;
            if (object2 != null) {
                this.C = null;
            }
            this.D = null;
            this.r = null;
            this.s = null;
            this.K = null;
            this.N = null;
            object2 = null;
            this.p0 = false;
            this.c = null;
            this.d = null;
            object2 = this.W;
            if (object2 != null) {
                object2.cancel();
            }
            this.W = null;
            object2 = CompanionManager.Companion;
            if ((object2 = ((CompanionManager$Companion)object2).getInstance()) != null) {
                ((CompanionManager)object2).release();
            }
            this.l = null;
            return;
        }
        object2 = new StringBuilder("Exception while destroying JioAdView ");
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void pauseAd() {
        boolean bl2 = this.b();
        if (!bl2) {
            Object object = new StringBuilder();
            Object object2 = this.m;
            object.append((String)object2);
            object.append(": can not perform pauseAd as ad state is ");
            object2 = this.q0;
            object.append(object2);
            Intrinsics.checkNotNullParameter(object.toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object = new StringBuilder();
        Object object3 = this.m;
        String string2 = ": Publisher called pauseAd()";
        j_0.k((StringBuilder)object, (String)object3, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.m0;
        if (object != null) {
            object3 = com.jio.jioads.controller.c.b;
            ((o)object).S = object3;
            object3 = ((o)object).g;
            boolean bl3 = true;
            if (object3 != null && (object3 = ((m)object3).r) != null) {
                ((s)object3).K(bl3);
            }
            if ((object = ((o)object).r) != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).pauseAd(bl3);
            }
        }
    }

    public final void pauseRefresh() {
        boolean bl2;
        Object object = new StringBuilder();
        Object object2 = this.m;
        j_0.k((StringBuilder)object, (String)object2, ": publisher called pauseRefresh()...");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.n;
        Object object3 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
        boolean bl3 = true;
        if (object2 != object3 && object2 != (object3 = JioAdView$AD_TYPE.INFEED) && (object2 != (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) || (bl2 = this.t0) == bl3) && object2 != (object3 = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            object2 = new StringBuilder();
            object3 = this.m;
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(": pauseRefresh() API not available for ");
            object3 = this.n;
            if (object3 != null) {
                object3 = ((Enum)object3).name();
            } else {
                bl2 = false;
                object3 = null;
            }
            String string2 = "message";
            d90_0.b((StringBuilder)object2, (String)object3, string2, (JioAds$Companion)object);
        } else {
            object = this.m0;
            if (object != null) {
                object2 = com.jio.jioads.controller.c.b;
                ((o)object).S = object2;
                object2 = ((o)object).g;
                if (object2 != null && (object2 = ((m)object2).r) != null) {
                    ((s)object2).K(bl3);
                }
                if ((object = ((o)object).r) != null) {
                    Intrinsics.checkNotNull(object);
                    ((d)object).pauseAd(bl3);
                }
            }
        }
    }

    public final void playAgainNativeVideo() {
        Object object = this.m0;
        if (object != null && (object = ((o)object).r) != null) {
            ((d)object).callPlayAgainFromPublisher();
        }
    }

    public final void playVmapAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(j j3) {
        Intrinsics.checkNotNullParameter((Object)j3, "adContainer");
        Object object = this.m0;
        if (object != null && (object = ((o)object).g) != null) {
            String string2;
            Intrinsics.checkNotNullParameter((Object)j3, "jioAdLayout");
            Object object2 = ((m)object).r;
            if (object2 != null) {
                ((s)object2).m0 = string2 = ((m)object).o;
            }
            if (object2 != null) {
                string2 = null;
                ((s)object2).w((ViewGroup)j3, null, false);
            }
            object2 = new com.jio.jioads.instream.video.vodVmap.j((m)object);
            ((Object)((Object)j3)).getClass();
            object = "viewListener";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            j3.f = object2;
        }
    }

    public final void prepareCustomAdData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(com.jio.jioads.native.parser.a object, com.jio.jioads.instreamads.vastparser.model.m m2, com.jio.jioads.common.c object2, Map map2) {
        Object object3;
        Intrinsics.checkNotNullParameter(object, "mAdData");
        Intrinsics.checkNotNullParameter(object2, "iJioAdViewController");
        Object object4 = "headers";
        Intrinsics.checkNotNullParameter(map2, (String)object4);
        boolean bl2 = this.P;
        Context context = this.l;
        if (context != null && (object3 = this.B0) == null) {
            Intrinsics.checkNotNull(context);
            V v4 = this.c;
            Intrinsics.checkNotNull(v4);
            object3 = Utility.INSTANCE;
            Object object5 = this.m;
            String string2 = ((Utility)object3).getCcbValue((String)object5);
            a_0 a_02 = this.d;
            Intrinsics.checkNotNull(a_02);
            object3 = object4;
            object5 = this;
            this.B0 = object4 = new com.jio.jioads.native.customsuport.a(context, this, v4, string2, a_02, (com.jio.jioads.common.c)object2, map2);
            bl2 = true;
        }
        if ((object2 = this.B0) != null) {
            ((com.jio.jioads.native.customsuport.a)object2).d = object;
            ((com.jio.jioads.native.customsuport.a)object2).b = object;
            ((com.jio.jioads.native.customsuport.a)object2).r = m2;
        }
        if (object2 != null) {
            object = this.d;
            ((com.jio.jioads.native.customsuport.a)object2).b(bl2, (com.jio.jioads.common.b)object);
        }
    }

    public final void preparePostRoll() {
        Object object = this.m0;
        if (object != null && (object = ((o)object).g) != null) {
            ((m)object).i();
        }
    }

    public final void removeMetaKeys(String[] stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "metaKeys");
    }

    public final void requestVmap$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2, String string3, String string4, String string5, JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener, Integer n3, JioAdsMetadata jioAdsMetadata, boolean bl2) {
        JioAdView jioAdView = this;
        Object object = jioVmapAdsLoader$JioVmapListener;
        String string6 = string2;
        Intrinsics.checkNotNullParameter(string2, "vmapUrl");
        Intrinsics.checkNotNullParameter(jioVmapAdsLoader$JioVmapListener, "jioVmapListener");
        Object object2 = new StringBuilder();
        Object object3 = this.m;
        String string7 = ": Inside requestVmap";
        j_0.k((StringBuilder)object2, object3, string7);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        this.f = jioVmapAdsLoader$JioVmapListener;
        object = this.q0;
        object3 = JioAdView$AdState.DESTROYED;
        if (object != object3) {
            Object object4;
            if (object == null) {
                object4 = -1;
            } else {
                object3 = com.jio.jioads.adinterfaces.b0.$EnumSwitchMapping$0;
                object4 = ((Enum)object).ordinal();
                object4 = object3[object4];
            }
            int n4 = 1;
            if (object4 != n4) {
                n4 = 2;
                if (object4 != n4) {
                    b b2;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    object = b2;
                    object2 = this;
                    object3 = jioAdsMetadata;
                    string6 = string2;
                    b2 = new b(this, jioAdsMetadata, string2, bl2, string3, string4, string5, n3);
                    if (executorService != null) {
                        executorService.submit(b2);
                    }
                } else {
                    object = new StringBuilder();
                    object3 = jioAdView.m;
                    string6 = ": Ad request is ongoing";
                    d_0.a((StringBuilder)object, object3, string6, (JioAds$Companion)object2);
                }
            } else {
                object = new StringBuilder();
                object3 = jioAdView.m;
                string6 = ": Ad is already cached";
                d_0.a((StringBuilder)object, object3, string6, (JioAds$Companion)object2);
            }
        } else {
            object = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object3 = this.m;
            string6 = "message";
            d90_0.b((StringBuilder)object, object3, string6, (JioAds$Companion)object2);
        }
    }

    public final void resumeAd() {
        boolean bl2 = this.b();
        if (!bl2) {
            Object object = new StringBuilder();
            Object object2 = this.m;
            object.append((String)object2);
            object.append(": can not perform resumeAd as ad state is ");
            object2 = this.q0;
            object.append(object2);
            Intrinsics.checkNotNullParameter(object.toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object = new StringBuilder();
        Object object3 = this.m;
        String string2 = ": Publisher called resumeAd()";
        j_0.k((StringBuilder)object, (String)object3, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.m0;
        if (object != null) {
            object3 = com.jio.jioads.controller.c.a;
            ((o)object).S = object3;
            object3 = ((o)object).g;
            boolean bl3 = true;
            if (object3 != null && (object3 = ((m)object3).r) != null) {
                ((s)object3).O(bl3);
            }
            object = ((o)object).r;
            Intrinsics.checkNotNull(object);
            ((d)object).resumeAd(bl3);
        }
    }

    public final void resumeRefresh() {
        boolean bl2;
        Object object = new StringBuilder();
        Object object2 = this.m;
        j_0.k((StringBuilder)object, (String)object2, ": publisher called resumeRefresh()...");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.n;
        Object object3 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
        boolean bl3 = true;
        if (object2 != object3 && object2 != (object3 = JioAdView$AD_TYPE.INFEED) && (object2 != (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) || (bl2 = this.t0) == bl3) && object2 != (object3 = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            object2 = new StringBuilder();
            object3 = this.m;
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(": resumeRefresh() API not available for ");
            object3 = this.n;
            if (object3 != null) {
                object3 = ((Enum)object3).name();
            } else {
                bl2 = false;
                object3 = null;
            }
            String string2 = "message";
            d90_0.b((StringBuilder)object2, (String)object3, string2, (JioAds$Companion)object);
        } else {
            object = this.m0;
            if (object != null) {
                object2 = com.jio.jioads.controller.c.a;
                ((o)object).S = object2;
                object2 = ((o)object).g;
                if (object2 != null && (object2 = ((m)object2).r) != null) {
                    ((s)object2).O(bl3);
                }
                object = ((o)object).r;
                Intrinsics.checkNotNull(object);
                ((d)object).resumeAd(bl3);
            }
        }
    }

    public final void setActor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "actor");
        this.T0 = string2;
    }

    public final void setAdId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.J = string2;
    }

    public final void setAdListener(JioAdListener jioAdListener) {
        this.o = jioAdListener;
    }

    public final void setAdSpotId(String string2) {
        String string3 = "adSpotId";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = string2.length();
        int n4 = 1;
        n3 -= n4;
        int n7 = 0;
        boolean bl2 = false;
        while (n7 <= n3) {
            int n8 = !bl2 ? n7 : n3;
            n8 = string2.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n8 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n3 += -1;
        }
        this.m = string2 = com.jio.jioads.adinterfaces.a.a(n3, n4, n7, string2);
    }

    public final void setAdStarted() {
        o o3 = this.m0;
        if (o3 != null) {
            o3.d0();
        }
    }

    public final void setAdpodVariant(JioAdView$AdPodVariant object) {
        Intrinsics.checkNotNullParameter(object, "adpod");
        Object object2 = this.q0;
        Object object3 = JioAdView$AdState.DESTROYED;
        if (object2 != object3 && (object2 = this.n) == (object3 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            this.h0 = object;
        } else {
            object = new StringBuilder();
            object2 = this.m;
            object3 = " : JioAdView is not instream video / destroyed";
            j_0.k((StringBuilder)object, (String)object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void setAge(String string2) {
        Intrinsics.checkNotNullParameter(string2, "age");
        this.a1 = string2;
    }

    public final void setAppVersion(String string2) {
        Intrinsics.checkNotNullParameter(string2, "appVersion");
        this.W0 = string2;
    }

    public final void setAsSystemApp(Boolean bl2) {
        boolean bl3;
        if (bl2 != null) {
            bl3 = bl2;
        } else {
            bl3 = false;
            bl2 = null;
        }
        this.r0 = bl3;
    }

    public final void setAudioCompanionContainer(ViewGroup viewGroup, Constants$CompanionAdSize constants$CompanionAdSize, Drawable drawable2, Drawable drawable3) {
        Intrinsics.checkNotNullParameter((Object)constants$CompanionAdSize, "companionAdSize");
        Object[] objectArray = new Object[]{viewGroup, constants$CompanionAdSize, drawable2, drawable3};
        this.N = objectArray;
    }

    public final void setCTABrandPage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.I = string2;
    }

    public final void setCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.H = string2;
    }

    public final void setCarouselItemLayout(Integer object, boolean bl2) {
        Object object2 = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object2 != jioAdView$AdState) {
            this.e0 = object;
            this.f0 = bl2;
        } else {
            object = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            String string2 = this.m;
            object2 = "message";
            ir3_0.b((StringBuilder)object, string2, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void setChannelID(String string2) {
        Intrinsics.checkNotNullParameter(string2, "channelId");
        this.J0 = string2;
    }

    public final void setChannelName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "channelName");
        this.K0 = string2;
    }

    public final void setCity(String string2) {
        Intrinsics.checkNotNullParameter(string2, "city");
        this.Z0 = string2;
    }

    public final void setClickEventKey(int n3) {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            boolean bl2;
            boolean bl3;
            object = this.l;
            if (object != null && (bl3 = j_0.l((Context)object)) == (bl2 = true)) {
                this.j0 = n3;
            } else {
                Object object3 = new StringBuilder();
                object = this.m;
                object2 = ": customClickEventKey API is only available for tv";
                j_0.k(object3, (String)object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
            }
        } else {
            Object object4 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object = this.m;
            object2 = "message";
            ir3_0.b(object4, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
        }
    }

    public final void setCloseAfter(int n3) {
        JioAdView$AD_TYPE jioAdView$AD_TYPE = this.n;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.INTERSTITIAL;
        if (jioAdView$AD_TYPE == jioAdView$AD_TYPE2) {
            Integer n4;
            this.b0 = n4 = Integer.valueOf(n3);
        }
    }

    public final void setCompanionAdListener(JioCompanionListener jioCompanionListener) {
        Intrinsics.checkNotNullParameter(jioCompanionListener, "jioCompanionListener");
        this.p = jioCompanionListener;
    }

    public final void setCompanionDetached$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.x0 = bl2;
    }

    public final void setCompanions(JioAdView$JioAdCompanion[] jioAdView$JioAdCompanionArray, JioCompanionListener jioCompanionListener) {
        Intrinsics.checkNotNullParameter(jioAdView$JioAdCompanionArray, "companions");
        Intrinsics.checkNotNullParameter(jioCompanionListener, "jioCompanionListener");
        Object object = CompanionManager.Companion;
        Object object2 = ((CompanionManager$Companion)object).getInstance();
        if (object2 != null) {
            ((CompanionManager)object2).release();
        }
        if ((object2 = ((CompanionManager$Companion)object).getInstance()) != null) {
            ((CompanionManager)object2).setPrimaryAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(this);
        }
        if ((object = ((CompanionManager$Companion)object).getInstance()) != null) {
            object2 = this.d;
            ((CompanionManager)object).setParams(jioCompanionListener, (com.jio.jioads.common.b)object2);
        }
        this.p = jioCompanionListener;
        int n3 = jioAdView$JioAdCompanionArray.length;
        object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = jioAdView$JioAdCompanionArray[i3];
            CompanionManager companionManager = CompanionManager.Companion.getInstance();
            if (companionManager == null) continue;
            companionManager.setCompanionAdview$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$JioAdCompanion)object2);
        }
    }

    public final void setContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adview");
        Object object = new StringBuilder();
        String string2 = this.m;
        j_0.k(object, string2, ": Publisher called setContainer");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.e = viewGroup;
    }

    public final void setContentID(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentId");
        this.Q0 = string2;
    }

    public final void setContentTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentTitle");
        this.g1 = string2;
    }

    public final void setContentType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "contentType");
        this.R0 = string2;
    }

    public final void setCountry(String string2) {
        Intrinsics.checkNotNullParameter(string2, "country");
        this.c1 = string2;
    }

    public final void setCtaTextFormView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.F = string2;
    }

    public final void setCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(View view) {
        this.y0 = view;
    }

    public final void setCustomDisplayAdContainer(int n3, int n4) {
        Integer n7;
        this.c0 = n7 = Integer.valueOf(n3);
        this.n0 = n4;
    }

    public final void setCustomImageSize(int n3, int n4) {
        int[] nArray = new int[]{n3, n4};
        this.r = nArray;
    }

    public final void setCustomInstreamAdContainer(int n3) {
        Integer n4;
        this.i0 = n4 = Integer.valueOf(n3);
    }

    public final void setCustomInterstitialAdContainer(int n3, int n4, int n7) {
        Object object = this.q0;
        Integer[] integerArray = JioAdView$AdState.DESTROYED;
        if (object != integerArray) {
            object = this.a0;
            if (object == null) {
                object = new HashMap();
                this.a0 = object;
            }
            object = this.a0;
            Intrinsics.checkNotNull(object);
            Integer n8 = n7;
            Integer n10 = n3;
            Integer n14 = n4;
            int n15 = 2;
            integerArray = new Integer[n15];
            integerArray[0] = n10;
            n3 = 1;
            integerArray[n3] = n14;
            object.put(n8, integerArray);
        } else {
            Object object2 = new StringBuilder();
            String string2 = this.m;
            String string3 = " : JioAdView is destroyed";
            j_0.k(object2, string2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
    }

    public final void setCustomNativeAdContainer(int n3) {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            Integer n4;
            this.c0 = n4 = Integer.valueOf(n3);
        } else {
            Object object3 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object = this.m;
            object2 = "message";
            ir3_0.b(object3, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void setCustomNativeAdContainer(int n3, int n4) {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            Integer n7;
            this.c0 = n7 = Integer.valueOf(n3);
            this.n0 = n4;
        } else {
            Object object2 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            String string2 = this.m;
            object = "message";
            ir3_0.b(object2, string2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
    }

    public final void setCustomNativeMediationAdContainer(int n3) {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            this.d0 = n3;
        } else {
            Object object3 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object = this.m;
            object2 = "message";
            ir3_0.b(object3, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void setDampeningLimit(long l2) {
        double d2;
        Object object = new StringBuilder();
        String string2 = this.m;
        object.append(string2);
        object.append(": Setting dampeningLimit to: ");
        object.append(l2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.Z = d2 = (double)l2;
    }

    public final void setDisplayAdSize(List list) {
        Intrinsics.checkNotNullParameter(list, "dynamicSizes");
        this.C = list;
    }

    public final void setDisplayMaxSize(int n3, int n4) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append('x');
        stringBuilder.append(n4);
        this.s = string2 = stringBuilder.toString();
    }

    public final void setDynamicDisplayAdSizes(List list) {
        this.C = list;
    }

    public final void setDynamicDisplayResponseType(boolean bl2, boolean bl3, boolean bl4) {
        String string2;
        String string3;
        Object object = new StringBuilder();
        String string4 = this.m;
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(": Publisher called setDynamicDisplayResponseType: ");
        ((StringBuilder)object).append(bl2);
        char c2 = ',';
        ((StringBuilder)object).append(c2);
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(c2);
        ((StringBuilder)object).append(bl4);
        c2 = '}';
        ((StringBuilder)object).append(c2);
        object = ((StringBuilder)object).toString();
        string4 = "message";
        Intrinsics.checkNotNullParameter(object, string4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = new StringBuilder();
        if (bl3) {
            string3 = "0|";
            ((StringBuilder)object).append(string3);
        }
        if (bl4) {
            string3 = "1|";
            ((StringBuilder)object).append(string3);
        }
        if (bl2) {
            string2 = "2|";
            ((StringBuilder)object).append(string2);
        }
        string2 = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.i1 = string2 = StringsKt.V(string2, "|");
    }

    public final void setExoPlayerEnabled(boolean bl2) {
        Comparable<Boolean> comparable = bl2;
        this.l0 = comparable;
        comparable = new Comparable<Boolean>();
        String string2 = this.m;
        ((StringBuilder)comparable).append(string2);
        ((StringBuilder)comparable).append(": setExoPlayerEnabled: ");
        ((StringBuilder)comparable).append(bl2);
        Intrinsics.checkNotNullParameter(((StringBuilder)comparable).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void setFallbackLimit(int n3) {
        int n4 = 15;
        if (n3 <= n4) {
            this.O = n3;
            CharSequence charSequence = new StringBuilder();
            String string2 = this.m;
            charSequence.append(string2);
            string2 = ": Retry FallbackL limit set to : ";
            charSequence.append(string2);
            charSequence.append(n3);
            Object object = charSequence.toString();
            charSequence = "message";
            Intrinsics.checkNotNullParameter(object, (String)charSequence);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            Object object = new StringBuilder();
            String string3 = this.m;
            String string4 = ": Retry FallbackL limit should be less then 15, considering defult value 5";
            j_0.k(object, string3, string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void setFromLoadCustomAd(boolean bl2) {
        this.H0 = bl2;
    }

    public final void setGender(Constants$GENDER constants$GENDER) {
        Intrinsics.checkNotNullParameter((Object)constants$GENDER, "gender");
        this.b1 = constants$GENDER;
    }

    public final void setGenre(String string2) {
        Intrinsics.checkNotNullParameter(string2, "genre");
        this.X0 = string2;
    }

    public final void setIsKidsProtected(Constants$KIDS_PROTECTED constants$KIDS_PROTECTED) {
        Intrinsics.checkNotNullParameter((Object)constants$KIDS_PROTECTED, "isKidsProtected");
        this.V0 = constants$KIDS_PROTECTED;
    }

    public final void setJioAdsLoader$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdsLoader jioAdsLoader) {
        o o3 = this.m0;
        if (o3 != null) {
            o3.x = jioAdsLoader;
        }
    }

    public final void setJioAdsMetaData(JioAdsMetadata jioAdsMetadata) {
        this.v = jioAdsMetadata;
    }

    public final void setJioAdskeepScreenOn(boolean bl2) {
        this.x = bl2;
    }

    public final void setKeywords(String string2) {
        Intrinsics.checkNotNullParameter(string2, "keywords");
        this.e1 = string2;
    }

    public final void setLanguage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "language");
        this.P0 = string2;
    }

    public final void setLanguageOfArticle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "languageOfArticle");
        this.O0 = string2;
    }

    public final void setLastAdDelivered(boolean bl2) {
        com.jio.jioads.native.customsuport.a a2;
        boolean bl3 = this.E0;
        if (bl3 && (a2 = this.B0) != null) {
            a2.k = bl2;
        }
    }

    public final void setMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdListener jioAdListener) {
        this.o = jioAdListener;
    }

    public final void setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView$AdState jioAdView$AdState) {
        this.q0 = jioAdView$AdState;
    }

    public final void setMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdView$AD_TYPE jioAdView$AD_TYPE) {
        this.n = jioAdView$AD_TYPE;
    }

    public final void setMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.m = string2;
    }

    public final void setMMetaData(Map map2) {
        this.w = map2;
    }

    public final void setMediaTimeout(int n3) {
        if (n3 > 0) {
            this.Y = n3;
        }
    }

    public final void setMediationIndexCounter(int n3) {
        this.A = n3;
    }

    public final void setMetaData(Map map2) {
        this.w = map2;
    }

    public final void setMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAdsMetadata jioAdsMetadata) {
        Intrinsics.checkNotNullParameter(jioAdsMetadata, "jioAdsMetadata");
        this.v = jioAdsMetadata;
    }

    public final void setNativeAdClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.G = string2;
    }

    public final void setObjects(String string2) {
        Intrinsics.checkNotNullParameter(string2, "objects");
        this.U0 = string2;
    }

    public final void setOfflineAdLimit(int n3) {
        this.G0 = n3;
    }

    public final void setOnAdFailedCalled(boolean bl2) {
        this.I0 = bl2;
    }

    public final void setOrientation(JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE) {
        this.q = jioAdView$ORIENTATION_TYPE;
    }

    public final void setPackageName(String string2) {
        String string3 = "fPackageName";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = string2.length();
        int n4 = 1;
        n3 -= n4;
        int n7 = 0;
        boolean bl2 = false;
        while (n7 <= n3) {
            int n8 = !bl2 ? n7 : n3;
            n8 = string2.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n8 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n3 += -1;
        }
        this.u = string2 = com.jio.jioads.adinterfaces.a.a(n3, n4, n7, string2);
    }

    public final void setPageCategory(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pageCategory");
        this.M0 = string2;
    }

    public final void setParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public final void setPgmCampaignAvailable$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.L = bl2;
    }

    public final void setPincode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pincode");
        this.d1 = string2;
    }

    public final void setPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.v0 = bl2;
    }

    public final void setPlacementName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "placementName");
        this.f1 = string2;
    }

    public final void setPodTimeout(int n3) {
        if (n3 > 0) {
            this.X = n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.m;
        stringBuilder.append(string2);
        stringBuilder.append(": Pod Timeout set to ");
        stringBuilder.append(n3);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void setPrimaryAd(boolean bl2) {
        this.s0 = bl2;
    }

    public final void setRefreshAnimation(boolean bl2, Integer n3, Integer n4) {
    }

    public final void setRefreshRate(int n3) {
        Object object = this.n;
        Object object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        if (object != object2) {
            object = new StringBuilder();
            object2 = this.m;
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": set refresh rate ->");
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.y = n3;
        }
    }

    public final void setRefreshStarted(boolean bl2) {
        this.z = bl2;
    }

    public final void setRequestCode(int n3) {
        this.a = n3;
    }

    public final void setRequestTimeOut(int n3) {
        if (n3 > 0) {
            this.V = n3;
        }
        Object object = new StringBuilder();
        String string2 = this.m;
        object.append(string2);
        object.append(": Request Timeout set to JioAdView: ");
        w12_0.b(this.V, "message", object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void setRequestedAdCount(int n3) {
        Object object = this.n;
        Object object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        if (object == object2) {
            Integer n4;
            object = new StringBuilder();
            object2 = this.m;
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": Publisher requested ad count: ");
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.U = n4 = Integer.valueOf(n3);
        } else {
            Object object3 = new StringBuilder();
            object = this.m;
            object2 = ": setRequestedAdCount() API is only available for INSTREAM_VIDEO";
            j_0.k(object3, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    public final void setRequestedAdDuration(int n3) {
        Object object = this.n;
        Object object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        if (object == object2) {
            object = new StringBuilder();
            object2 = this.m;
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": Publisher requested ad for duration: ");
            ((StringBuilder)object).append(n3);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
            object = JioAds.Companion;
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            int n4 = 2;
            if (n3 <= n4) {
                StringBuilder stringBuilder = new StringBuilder();
                object2 = this.m;
                String string2 = ": warning:setRequestedAdDuration() API only accepts duration above 2 seconds, this JioAdView will not consider the duration set.";
                d_0.a(stringBuilder, (String)object2, string2, (JioAds$Companion)object);
            } else {
                n4 = -1;
                if (n4 > n3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = this.m;
                    String string3 = ": requestedDuration must be greater then requested min duration";
                    d_0.a(stringBuilder, (String)object2, string3, (JioAds$Companion)object);
                } else {
                    Integer n7;
                    this.T = object = this.S;
                    this.S = n7 = Integer.valueOf(n3);
                }
            }
        } else {
            Object object3 = new StringBuilder();
            object = this.m;
            object2 = ": setRequestedAdDuration() API is only available for INSTREAM_VIDEO";
            j_0.k(object3, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setSDKBackControl(boolean bl2) {
        JioAdView$AdState jioAdView$AdState = this.q0;
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) {
            StringBuilder stringBuilder = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            String string2 = this.m;
            String string3 = "message";
            ir3_0.b(stringBuilder, string2, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        Context context = this.l;
        if (context != null) {
            Utility utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(context);
            int n3 = utility.getCurrentUIModeType(context);
            int n4 = 4;
            if (n3 == n4) {
                this.R = bl2;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = this.m;
        String string5 = ": setSDKBackControl() API is only available for tv";
        j_0.k(stringBuilder, string4, string5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void setSdkDecidedDimensions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int[] nArray) {
        this.K = nArray;
    }

    public final void setSectionCategory(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sectionCategory");
        this.N0 = string2;
    }

    public final void setShouldUseVolley(boolean bl2) {
        this.u0 = bl2;
    }

    public final void setShowName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "showName");
        this.L0 = string2;
    }

    public final void setSkipEventKey(int n3) {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            boolean bl2;
            boolean bl3;
            object = this.l;
            if (object != null && (bl3 = j_0.l((Context)object)) == (bl2 = true)) {
                this.k0 = n3;
            } else {
                Object object3 = new StringBuilder();
                object = this.m;
                object2 = ": customSkipEventKey API is only available for tv";
                j_0.k(object3, (String)object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
            }
        } else {
            Object object4 = new StringBuilder("Trying to access destroyed JioAdView object for adspot Id: ");
            object = this.m;
            object2 = "message";
            ir3_0.b(object4, (String)object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
        }
    }

    public final void setSkipThumbnailUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "thumbnailUrl");
        this.t = string2 = ((Object)StringsKt.m0(string2)).toString();
    }

    public final void setState(String string2) {
        Intrinsics.checkNotNullParameter(string2, "state");
        this.Y0 = string2;
    }

    public final void setSystemApp(boolean bl2) {
        this.r0 = bl2;
    }

    public final void setTitleFromAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.E = string2;
    }

    public final void setVendor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "vendor");
        this.S0 = string2;
    }

    public final void setVideoAdViewType(JioAdView$VideoPlayerViewType jioAdView$VideoPlayerViewType) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$VideoPlayerViewType, "type");
        this.A0 = jioAdView$VideoPlayerViewType;
    }

    public final void setVideoBitRate(int n3) {
        this.B = n3;
    }

    public final void setVideoContentType(JioAdView$VideoAdType jioAdView$VideoAdType) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$VideoAdType, "value");
        Object object = new StringBuilder();
        String string2 = this.m;
        object.append(string2);
        object.append(": videoContentSelected: ");
        string2 = jioAdView$VideoAdType.name();
        object.append(string2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.D = jioAdView$VideoAdType;
    }

    public final void showAdControls() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).showControls();
            }
        }
    }

    public final void showCTA() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).showCTAButton();
            }
        }
    }

    public final void showPlayButton() {
        Object object = this.q0;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).showPlayButton();
            }
        }
    }

    public final void showSkip() {
        Object object = this.q0;
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object2 = ((o)object).g;
            if (object2 != null && (object2 = ((m)object2).r) != null) {
                ((s)object2).m();
            }
            if ((object = ((o)object).r) != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).showSkip();
            }
        }
    }

    public final void unmuteVideoAd() {
        Object object = new StringBuilder();
        Object object2 = this.m;
        String string2 = ": Publisher called unmuteVideoAd()";
        j_0.k((StringBuilder)object, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.q0;
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = this.m0) != null) {
            Intrinsics.checkNotNull(object);
            object = ((o)object).r;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                ((d)object).unmuteVideoAd();
            }
        }
    }
}

