/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.res.Configuration
 *  android.location.LocationManager
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.instreamads.vastparser;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdPartner;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.instream.video.o;
import com.jio.jioads.instreamads.vastparser.JioVastParsingHelper$tryLoadingMediationAd$1;
import com.jio.jioads.instreamads.vastparser.e;
import com.jio.jioads.instreamads.vastparser.f;
import com.jio.jioads.instreamads.vastparser.g;
import com.jio.jioads.instreamads.vastparser.i;
import com.jio.jioads.instreamads.vastparser.k;
import com.jio.jioads.instreamads.vastparser.l;
import com.jio.jioads.instreamads.vastparser.listener.a;
import com.jio.jioads.instreamads.vastparser.listener.b;
import com.jio.jioads.instreamads.vastparser.listener.c;
import com.jio.jioads.instreamads.vastparser.model.d;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.vastparser.s;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.t;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.h;
import com.jioads.mediation.JioMediationSelector;
import com.jioads.mediation.partners.JioMediationListener;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
implements b {
    public JSONArray A;
    public int B;
    public final HashMap C;
    public long D;
    public m E;
    public com.jio.jioads.network.c F;
    public boolean G;
    public final hh3_2 H;
    public HandlerThread I;
    public Handler J;
    public boolean K;
    public com.jio.jioads.utils.l L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final HashMap a;
    public final com.jio.jioads.common.b b;
    public final com.jio.jioads.common.c c;
    public c d;
    public final com.jio.jioads.controller.a e;
    public final hh3_2 f;
    public int g;
    public com.jio.jioads.instreamads.wrapper.i h;
    public int i;
    public boolean j;
    public boolean k;
    public a l;
    public final int m;
    public String n;
    public String o;
    public String p;
    public Integer q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public j v;
    public int w;
    public int x;
    public o y;
    public Pair z;

    public n(HashMap serializable, com.jio.jioads.common.b b2, com.jio.jioads.common.c c2, c c3, com.jio.jioads.controller.a a2) {
        int n3;
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(a2, "jioAdCallbacks");
        this.a = serializable;
        this.b = b2;
        this.c = c2;
        this.d = c3;
        this.e = a2;
        super(this, 1);
        serializable = yr1_2.b((Function0)((Object)serializable));
        this.f = serializable;
        this.g = n3 = -100;
        this.i = n3;
        this.m = 2;
        this.C = serializable = new HashMap();
        this.D = -1;
        super(this);
        serializable = yr1_2.b((Function0)((Object)serializable));
        this.H = serializable;
    }

    public static Integer b(q object) {
        object = ((q)object).j;
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                d d2 = (d)object.next();
                String string2 = d2.d;
                String string3 = "waterfall";
                boolean bl3 = Intrinsics.areEqual(string2, string3);
                if (!bl3) continue;
                return d2.e;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void g(n var0, com.jio.jioads.multiad.model.a var1_1, com.jio.jioads.multiad.model.c var2_2, com.jio.jioads.multiad.model.f var3_3) {
        block94: {
            block101: {
                block100: {
                    block99: {
                        block98: {
                            block97: {
                                block96: {
                                    block95: {
                                        block93: {
                                            block92: {
                                                block91: {
                                                    block90: {
                                                        block89: {
                                                            block88: {
                                                                block87: {
                                                                    block84: {
                                                                        block86: {
                                                                            block85: {
                                                                                var0.getClass();
                                                                                var4_4 = null;
                                                                                if (var2_2 /* !! */  != null) {
                                                                                    var5_5 /* !! */  = var2_2 /* !! */ .a;
                                                                                } else {
                                                                                    var6_6 = false;
                                                                                    var5_5 /* !! */  = null;
                                                                                }
                                                                                try {
                                                                                    var6_6 = TextUtils.isEmpty((CharSequence)var5_5 /* !! */ );
                                                                                    var7_7 = "message";
                                                                                    var8_8 = var0.b;
                                                                                    if (var6_6) break block84;
                                                                                }
                                                                                catch (Exception v0) {
                                                                                    ** continue;
                                                                                }
                                                                                var5_5 /* !! */  = var0.c;
                                                                                var5_5 /* !! */  = (com.jio.jioads.controller.f)var5_5 /* !! */ ;
                                                                                var5_5 /* !! */  = var5_5 /* !! */ .a;
                                                                                var6_6 = var5_5 /* !! */ .A;
                                                                                if (!var6_6) break block84;
                                                                                if (var2_2 /* !! */  == null) break block85;
                                                                                var2_2 /* !! */  = var2_2 /* !! */ .a;
                                                                                break block86;
                                                                            }
                                                                            var9_9 = 0;
                                                                            var2_2 /* !! */  = null;
                                                                        }
                                                                        var5_5 /* !! */  = new JSONArray((String)var2_2 /* !! */ );
                                                                        var0.A = var5_5 /* !! */ ;
                                                                        Intrinsics.checkNotNull(var5_5 /* !! */ );
                                                                        var9_9 = var5_5 /* !! */ .length();
                                                                        if (var9_9 <= 0) ** GOTO lbl57
                                                                        var9_9 = var0.B;
                                                                        if (var9_9 != 0) ** GOTO lbl57
                                                                        var2_2 /* !! */  = new Pair(var1_1 /* !! */ , var3_3);
                                                                        var0.z = var2_2 /* !! */ ;
                                                                        var1_1 /* !! */  = var0.A;
                                                                        Intrinsics.checkNotNull(var1_1 /* !! */ );
                                                                        var9_9 = var0.B;
                                                                        var1_1 /* !! */  = var1_1 /* !! */ .getJSONObject(var9_9);
                                                                        var0.m((JSONObject)var1_1 /* !! */ );
                                                                        ** GOTO lbl274
lbl57:
                                                                        // 2 sources

                                                                        var2_2 /* !! */  = var8_8.k0();
                                                                        var5_5 /* !! */  = JioAdView$AdState.DESTROYED;
                                                                        if (var2_2 /* !! */  == var5_5 /* !! */ ) break block84;
                                                                        var2_2 /* !! */  = com.jio.jioads.multiad.N.a;
                                                                        var2_2 /* !! */  = var8_8.P();
                                                                        var5_5 /* !! */  = "adSpotId";
                                                                        Intrinsics.checkNotNullParameter(var2_2 /* !! */ , (String)var5_5 /* !! */ );
                                                                        var5_5 /* !! */  = com.jio.jioads.multiad.N.e;
                                                                        var10_10 = Boolean.TRUE;
                                                                        var5_5 /* !! */ .put(var2_2 /* !! */ , var10_10);
                                                                        var2_2 /* !! */  = new StringBuilder();
                                                                        var5_5 /* !! */  = var8_8.P();
                                                                        var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                                        var5_5 /* !! */  = ": mediation is already consumed";
                                                                        var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                                        var2_2 /* !! */  = var2_2 /* !! */ .toString();
                                                                        Intrinsics.checkNotNullParameter(var2_2 /* !! */ , var7_7);
                                                                        var2_2 /* !! */  = JioAds.Companion;
                                                                        var2_2 /* !! */  = var2_2 /* !! */ .getInstance();
                                                                        var2_2 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                        var2_2 /* !! */  = JioAds$LogLevel.NONE;
                                                                    }
                                                                    var2_2 /* !! */  = new StringBuilder();
                                                                    var5_5 /* !! */  = var0.v();
                                                                    var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                                    var5_5 /* !! */  = ": onAdSelected => ";
                                                                    var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                                    if (var1_1 /* !! */  == null) break block87;
                                                                    var5_5 /* !! */  = var1_1 /* !! */ .a;
                                                                    break block88;
                                                                }
                                                                var6_6 = false;
                                                                var5_5 /* !! */  = null;
                                                            }
                                                            var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                            var5_5 /* !! */  = ", campaignType: ";
                                                            var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                            if (var3_3 == null) break block89;
                                                            var5_5 /* !! */  = var3_3.l;
                                                            break block90;
                                                        }
                                                        var6_6 = false;
                                                        var5_5 /* !! */  = null;
                                                    }
                                                    var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                    var5_5 /* !! */  = ", adConfig => ";
                                                    var2_2 /* !! */ .append((String)var5_5 /* !! */ );
                                                    if (var1_1 /* !! */  == null) break block91;
                                                    var5_5 /* !! */  = var1_1 /* !! */ .e;
                                                    break block92;
                                                }
                                                var6_6 = false;
                                                var5_5 /* !! */  = null;
                                            }
                                            var2_2 /* !! */ .append(var5_5 /* !! */ );
                                            var2_2 /* !! */  = var2_2 /* !! */ .toString();
                                            Intrinsics.checkNotNullParameter(var2_2 /* !! */ , var7_7);
                                            var2_2 /* !! */  = JioAds.Companion;
                                            var5_5 /* !! */  = var2_2 /* !! */ .getInstance();
                                            var5_5 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            var5_5 /* !! */  = JioAds$LogLevel.NONE;
                                            if (var1_1 /* !! */  == null) ** GOTO lbl204
                                            var2_2 /* !! */  = var1_1 /* !! */ .b;
                                            if (var2_2 /* !! */  != null) break block93;
                                            var9_9 = 0;
                                            var2_2 /* !! */  = null;
                                        }
                                        var5_5 /* !! */  = var1_1 /* !! */ .e;
                                        if (var5_5 /* !! */  == null) break block94;
                                        var1_1 /* !! */  = var1_1 /* !! */ .a;
                                        var0.o = var1_1 /* !! */ ;
                                        if (var3_3 == null) break block95;
                                        var1_1 /* !! */  = var3_3.a;
                                        break block96;
                                    }
                                    var11_11 = 0;
                                    var1_1 /* !! */  = null;
                                }
                                var0.n = var1_1 /* !! */ ;
                                if (var3_3 == null) break block97;
                                var1_1 /* !! */  = var3_3.l;
                                break block98;
                            }
                            var11_11 = 0;
                            var1_1 /* !! */  = null;
                        }
                        var0.p = var1_1 /* !! */ ;
                        if (var3_3 == null) break block99;
                        var1_1 /* !! */  = var3_3.b;
                        if (var1_1 /* !! */  == null) break block99;
                        var1_1 /* !! */  = var1_1 /* !! */ .c;
                        break block100;
                    }
                    var11_11 = 0;
                    var1_1 /* !! */  = null;
                }
                var0.q = var1_1 /* !! */ ;
                break block94;
lbl204:
                // 1 sources

                var11_11 = TextUtils.isEmpty(null);
                if (var11_11 != 0) break block101;
                var1_1 /* !! */  = new StringBuilder();
                var3_3 = var8_8.P();
                var1_1 /* !! */ .append((String)var3_3);
                var3_3 = ": Ad is PGM inside JioVastParsingHelper";
                var1_1 /* !! */ .append((String)var3_3);
                var1_1 /* !! */  = var1_1 /* !! */ .toString();
                Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var7_7);
                var1_1 /* !! */  = var2_2 /* !! */ .getInstance();
                var1_1 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var12_12 = -1;
                var0.D = var12_12;
            }
            var9_9 = 0;
            var2_2 /* !! */  = null;
        }
        if (var2_2 /* !! */  != null) {
            var1_1 /* !! */  = StringsKt.m0((CharSequence)var2_2 /* !! */ );
            var4_4 = var1_1 /* !! */ .toString();
        }
        var11_11 = TextUtils.isEmpty(var4_4);
        if (var11_11 != 0) ** GOTO lbl246
        var1_1 /* !! */  = var0.p;
        var3_3 = var0.q;
        var0.k((String)var2_2 /* !! */ , (String)var1_1 /* !! */ , (Integer)var3_3);
        var0.r();
        ** GOTO lbl274
lbl246:
        // 1 sources

        var1_1 /* !! */  = var8_8.k0();
        var2_2 /* !! */  = JioAdView$AdState.DESTROYED;
        if (var1_1 /* !! */  == var2_2 /* !! */ ) ** GOTO lbl274
        var1_1 /* !! */  = var0.A;
        if (var1_1 /* !! */  == null) ** GOTO lbl264
        var1_1 /* !! */  = com.jio.jioads.multiad.N.a;
        var1_1 /* !! */  = var8_8.P();
        var11_11 = com.jio.jioads.multiad.N.j((String)var1_1 /* !! */ );
        if (var11_11 != 0) ** GOTO lbl264
        var11_11 = var0.B + 1;
        var0.B = var11_11;
lbl264:
        // 3 sources

        var1_1 /* !! */  = var0.v();
        var2_2 /* !! */  = Utility.INSTANCE;
        var3_3 = var8_8.P();
        var2_2 /* !! */ .getCcbValue((String)var3_3);
        var0.s((String)var1_1 /* !! */ );
lbl274:
        // 5 sources

    }

    public static boolean w(String string2) {
        String string3;
        String string4;
        String string5;
        String string6;
        boolean bl2;
        int n3;
        int n4;
        if (string2 != null && !((n4 = string2.hashCode()) != (n3 = -149597992) ? (n4 != (n3 = 97607) ? (n4 != (n3 = 111275) ? n4 != (n3 = 1769986469) || !(bl2 = string2.equals(string6 = "pgm_placeholder_campaign")) : !(bl2 = string2.equals(string5 = "prm"))) : !(bl2 = string2.equals(string4 = "bkp"))) : !(bl2 = string2.equals(string3 = "Mediation")))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final long A() {
        return ((com.jio.jioads.controller.f)this.c).a.a0();
    }

    public final com.jio.jioads.instreamads.vastparser.model.n B() {
        return (com.jio.jioads.instreamads.vastparser.model.n)this.H.getValue();
    }

    public final void C() {
        Enum enum_;
        Object object = this.b;
        Object object2 = object.k0();
        if (object2 == (enum_ = JioAdView$AdState.DESTROYED)) {
            com.jio.jioads.audioplayer.b.a(object, ": JioAdView state is destroyed so returning from handleNoFillPgm()");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object2 = object.K();
        if (object2 == (enum_ = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (object2 = object.L()) != (enum_ = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
            object2 = ": pgm no fill so removing place holder from the list";
            com.jio.jioads.audioplayer.b.a(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.E;
            if (object != null && (object = ((m)object).c) != null) {
                object2 = com.jio.jioads.instreamads.vastparser.f.c;
                cx_2.w((List)object, (Function1)object2);
            }
            boolean bl2 = true;
            this.n(bl2);
        }
    }

    public final void D() {
        boolean bl2 = this.j;
        if (bl2) {
            return;
        }
        bl2 = this.k;
        if (bl2) {
            Object object = new StringBuilder();
            String string2 = ": refreshing video url list from caching";
            com.jio.jioads.common.b b2 = this.b;
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.l;
            if (object != null) {
                object.a();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final boolean E() {
        int n3;
        Object object;
        boolean bl2;
        int n4;
        block6: {
            block7: {
                int n7;
                int bl3 = this.u;
                n4 = 1;
                bl2 = false;
                if (bl3 <= 0 && (n7 = this.t) <= 0) {
                    boolean bl4 = false;
                } else {
                    boolean bl5 = true;
                }
                object = this.c;
                com.jio.jioads.common.c c2 = object;
                c2 = (com.jio.jioads.controller.f)object;
                n3 = ((com.jio.jioads.controller.f)c2).l();
                Object object2 = this.b;
                JioAdView$AdPodVariant jioAdView$AdPodVariant = object2.L();
                JioAdView$AdPodVariant jioAdView$AdPodVariant2 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                if (jioAdView$AdPodVariant == jioAdView$AdPodVariant2) break block6;
                if ((object2 = object2.L()) != (jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE)) break block7;
                object2 = object;
                object2 = (com.jio.jioads.controller.f)object;
                boolean bl6 = ((com.jio.jioads.controller.f)object2).n();
                if (bl6) break block6;
            }
            n4 = 0;
        }
        object = ((com.jio.jioads.controller.f)object).a;
        boolean bl7 = ((com.jio.jioads.controller.o)object).o;
        if (!bl7 || n4 == 0 || n3 <= (n4 = this.u)) {
            void var1_5;
            bl2 = var1_5;
        }
        return bl2;
    }

    public final boolean F() {
        int n3;
        com.jio.jioads.common.b b2 = this.b;
        int n4 = b2.o0();
        if (n4 <= (n3 = 5)) {
            n4 = 5;
        }
        n3 = this.x;
        if (n4 <= n3) {
            n4 = 1;
        } else {
            n4 = 0;
            b2 = null;
        }
        return n4 != 0;
    }

    public final void G() {
        Object object;
        String string2;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3;
        Object object4;
        com.jio.jioads.common.c c2;
        String string3;
        String string4;
        String string5;
        String string6;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        boolean bl2;
        n n8;
        block31: {
            block27: {
                int n10;
                int n14;
                block30: {
                    block29: {
                        block28: {
                            n8 = this;
                            bl2 = this.G;
                            object8 = ": returning from printAdsServed";
                            if (bl2) {
                                Object object9 = new StringBuilder();
                                j_0.j(this, object9, object8);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object9 = JioAds$LogLevel.NONE;
                                return;
                            }
                            object7 = this.b;
                            object6 = object7.k0();
                            if (object6 == (object5 = JioAdView$AdState.DESTROYED)) {
                                return;
                            }
                            object6 = object7.Y();
                            long l2 = this.A();
                            long l3 = -1;
                            string6 = "";
                            string5 = "fill_story_pref";
                            string4 = "key";
                            string3 = "context";
                            c2 = this.c;
                            object4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (object4 <= 0) break block27;
                            object3 = c2;
                            object3 = ((com.jio.jioads.controller.f)c2).a;
                            n7 = ((com.jio.jioads.controller.o)object3).o;
                            if (n7 == 0 || (object3 = object7.k0()) == object5 || (n4 = com.jio.jioads.util.i.l(c2)) == 0) break block27;
                            long l4 = this.A();
                            n7 = (int)l4;
                            n4 = this.i;
                            n3 = n7 - n4;
                            if (object6 == null) break block28;
                            object2 = n4;
                            string2 = object7.P();
                            Intrinsics.checkNotNullParameter(object6, string3);
                            Intrinsics.checkNotNullParameter(string2, string4);
                            SharedPreferences sharedPreferences2 = j_0.o((Context)object6, string5);
                            String string7 = sharedPreferences2.getString(string2, string6);
                            n14 = (int)(TextUtils.isEmpty((CharSequence)string7) ? 1 : 0);
                            if (n14 != 0) break block28;
                            n14 = n7;
                            Intrinsics.checkNotNull(string7);
                            object3 = new JSONObject(string7);
                            string7 = "dl";
                            n10 = object3.optInt(string7);
                            if (n10 != 0) break block29;
                            n10 = n3;
                            object = "null cannot be cast to non-null type kotlin.Int";
                            Intrinsics.checkNotNull(object2, (String)object);
                            if (n4 > 0) {
                                object5 = object3.put(string7, n4);
                                object3 = sharedPreferences2.edit();
                                if (object3 != null) {
                                    object5 = object5.toString();
                                    if ((object5 = object3.putString(string2, (String)object5)) != null) {
                                        object5.apply();
                                    }
                                }
                            }
                            break block30;
                        }
                        n14 = n7;
                    }
                    n10 = n3;
                }
                n7 = n14;
                n3 = n10;
                break block31;
            }
            n7 = 0;
            object3 = null;
            n3 = 0;
            object = null;
        }
        object5 = new StringBuilder();
        object2 = ": ad selection summary -----";
        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object7, (StringBuilder)object5, (String)object2);
        object5 = " secs";
        if (n7 > 0) {
            object2 = new StringBuilder();
            string2 = object7.P();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(": requested duration: ");
            ((StringBuilder)object2).append(n7);
            string2 = " secs, selected ads from local for ";
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append((String)object5);
            object = ((StringBuilder)object2).toString();
            com.jio.jioads.util.j.a((String)object);
        }
        object = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object7, ": Total number of ads selected: ");
        int n15 = n8.t;
        object.append(n15);
        object2 = " & selected duration: ";
        object.append((String)object2);
        n15 = n8.u;
        object.append(n15);
        object.append((String)object5);
        object5 = object.toString();
        com.jio.jioads.util.j.a((String)object5);
        if (object6 != null && (n4 = n8.g) > 0 && n7 == 0 && (n4 = (int)(com.jio.jioads.util.i.l(c2) ? 1 : 0)) != 0) {
            n4 = n8.g;
            object5 = n4;
            object3 = object7.P();
            Intrinsics.checkNotNullParameter(object6, string3);
            Intrinsics.checkNotNullParameter(object3, string4);
            object = j_0.o((Context)object6, string5);
            object2 = object.getString((String)object3, string6);
            boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl3) {
                Intrinsics.checkNotNull(object2);
                string2 = new JSONObject((String)object2);
                object2 = "cl";
                object4 = string2.optInt((String)object2);
                if (object4 == false && (object4 = (Object)com.jio.jioads.util.i.i) == false) {
                    object5 = string2.put((String)object2, object5);
                    if ((object = object.edit()) != null) {
                        object5 = object5.toString();
                        if ((object5 = object.putString((String)object3, (String)object5)) != null) {
                            object5.apply();
                        }
                    }
                }
            }
        }
        if (object6 != null && (n4 = (int)(com.jio.jioads.util.i.l(c2) ? 1 : 0)) != 0) {
            n4 = n8.t;
            object5 = n4;
            object7 = object7.P();
            object3 = n8.r;
            Intrinsics.checkNotNullParameter(object6, string3);
            Intrinsics.checkNotNullParameter(object7, string4);
            object6 = j_0.o((Context)object6, string5);
            object = object6.getString((String)object7, string6);
            com.jio.jioads.util.i.e = object3;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n7 == 0) {
                Intrinsics.checkNotNull(object);
                object3 = new JSONObject((String)object);
                object = "servedAdCount";
                object5 = object3.put((String)object, object5);
                object6 = object6.edit();
                if (object6 != null && (object7 = object6.putString((String)object7, (String)(object5 = object5.toString()))) != null) {
                    object7.apply();
                }
            }
        }
        n8.j = bl2 = true;
        this.r();
        int n16 = this.F();
        if (n16 != 0 && (n16 = n8.s) != 0 && (n16 = n8.t) <= 0 && (n16 = (int)(n8.k ? 1 : 0)) == 0) {
            object7 = JioAdError.Companion;
            object8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object7.getClass();
            object5 = t_0.a((JioAdError$JioAdErrorType)((Object)object8));
            object6 = n8.d;
            if (object6 != null) {
                object3 = com.jio.jioads.cdnlogging.d.a;
                string2 = "retry limit reached!";
                object = "printAdsServed";
                object2 = "JioVastParsingHelper";
                object6.b((JioAdError)object5, (com.jio.jioads.cdnlogging.d)((Object)object3), (String)object, (String)object2, string2);
            }
            return;
        }
        n16 = n8.k;
        if (n16 != 0 && (object6 = n8.l) != null) {
            object5 = n8.E;
            object6.a((m)object5);
        }
        if ((n16 = (int)(n8.k ? 1 : 0)) == 0) {
            object6 = "Vast Response received & level 1 parsed";
            com.jio.jioads.util.j.a((String)object6);
            n16 = (int)(this.E() ? 1 : 0);
            if (n16 != 0) {
                n16 = (int)(n8.G ? 1 : 0);
                if (n16 != 0) {
                    object7 = new StringBuilder();
                    object6 = this.v();
                    ((StringBuilder)object7).append((String)object6);
                    ((StringBuilder)object7).append((String)object8);
                    com.jio.jioads.util.j.a(((StringBuilder)object7).toString());
                    return;
                }
                c2 = (com.jio.jioads.controller.f)c2;
                object8 = ((com.jio.jioads.controller.f)c2).a;
                int n17 = ((com.jio.jioads.controller.o)object8).A;
                if (n17 == 0 || (n17 = n8.t) > 0) {
                    object8 = n8.d;
                    if (object8 != null) {
                        object6 = n8.E;
                        object8.a((m)object6);
                    }
                    n8.k = bl2;
                    object7 = n8.l;
                    if (object7 != null) {
                        object8 = n8.E;
                        object7.a((m)object8);
                    }
                }
                if (!(bl2 = n8.k)) {
                    object7 = JioAdError.Companion;
                    object8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    object7.getClass();
                    object5 = t_0.a((JioAdError$JioAdErrorType)((Object)object8));
                    object6 = n8.d;
                    if (object6 != null) {
                        object3 = com.jio.jioads.cdnlogging.d.a;
                        string2 = "No Ads Available";
                        object = "printAdsServed";
                        object2 = "JioVastParsingHelper";
                        object6.b((JioAdError)object5, (com.jio.jioads.cdnlogging.d)((Object)object3), (String)object, (String)object2, string2);
                    }
                }
            } else {
                object7 = new StringBuilder();
                object8 = this.v();
                ((StringBuilder)object7).append((String)object8);
                ((StringBuilder)object7).append(": Minimum duration requirement is not fulfilled");
                com.jio.jioads.util.j.b(((StringBuilder)object7).toString());
                object7 = JioAdError.Companion;
                object8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object6 = "Minimum duration requirement is not fulfilled";
                object3 = j_0.c((t_0)object7, (JioAdError$JioAdErrorType)((Object)object8), (String)object6);
                object5 = n8.d;
                if (object5 != null) {
                    object = com.jio.jioads.cdnlogging.d.a;
                    string6 = "";
                    object2 = "downloadRedirectAd.onError";
                    string2 = "JioVastParsingHelper";
                    object5.b((JioAdError)object3, (com.jio.jioads.cdnlogging.d)((Object)object), (String)object2, string2, string6);
                }
            }
        }
    }

    public final void H() {
        int n3;
        this.B = n3 = this.B + 1;
        Object object = this.b;
        Object object2 = object.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        String string2 = null;
        if (object2 != object3 && (object2 = this.z) != null) {
            Intrinsics.checkNotNull(object2);
            Object object4 = (com.jio.jioads.multiad.model.a)((Pair)object2).a;
            object2 = (com.jio.jioads.multiad.model.f)((Pair)object2).b;
            Object object5 = new StringBuilder();
            String string3 = this.v();
            object5.append(string3);
            object5.append(": prmAd -- ");
            object5.append(object4);
            object5 = object5.toString();
            string3 = "message";
            Intrinsics.checkNotNullParameter(object5, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            if (object4 != null) {
                int n4;
                object3 = ((com.jio.jioads.multiad.model.a)object4).b;
                if (object3 != null) {
                    this.z = null;
                } else {
                    object3 = null;
                }
                if (object3 != null) {
                    object4 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                if (object4 != null && (n4 = ((String)object4).length()) != 0) {
                    if (object2 != null) {
                        string2 = ((com.jio.jioads.multiad.model.f)object2).l;
                    }
                    this.p = string2;
                    object = this.q;
                    this.k((String)object3, string2, (Integer)object);
                    this.r();
                } else {
                    object2 = object.P();
                    object3 = Utility.INSTANCE;
                    object = object.P();
                    ((Utility)object3).getCcbValue((String)object);
                    this.s((String)object2);
                }
            } else {
                object2 = object.k0();
                if (object2 != object3) {
                    object2 = object.P();
                    object3 = Utility.INSTANCE;
                    object = object.P();
                    ((Utility)object3).getCcbValue((String)object);
                    this.s((String)object2);
                }
            }
        } else {
            this.A = null;
            n3 = 0;
            this.B = 0;
            object = this.v();
            this.q((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(m m2, String charSequence, String object) {
        Exception exception2;
        block6: {
            int n3;
            Object object2;
            block5: {
                object2 = new StringBuilder();
                Object object3 = this.b;
                String string2 = ": inside onParseFinish";
                j_0.i(object3, (StringBuilder)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = object3.k0();
                object3 = JioAdView$AdState.DESTROYED;
                if (object2 == object3) {
                    return;
                }
                if (m2 != null) {
                    try {
                        object2 = m2.c;
                        break block5;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                }
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (n3 = (object2 = m2.c).size()) > 0) {
                this.i(m2);
                return;
            }
            this.p(m2, (String)charSequence, (String)object);
            return;
        }
        charSequence = new StringBuilder("Error in parsing Vast Ad.Error: ");
        object = Utility.INSTANCE;
        String string3 = ((Utility)object).printStacktrace(exception2);
        ((StringBuilder)charSequence).append(string3);
        string3 = ((StringBuilder)charSequence).toString();
        this.y(string3);
    }

    public final void a(String string2) {
    }

    public final void c() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, ": pgm Adding place holder for pgm selection");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.E;
        Object object3 = "pgm_placeholder_campaign";
        if (object != null && (object = ((m)object).c) != null) {
            j j3 = new j();
            j3.j = object3;
            j3.h = "pid";
            Object object4 = new com.jio.jioads.instreamads.vastparser.model.g();
            ArrayList<com.jio.jioads.instreamads.vastparser.model.g> arrayList = new ArrayList<com.jio.jioads.instreamads.vastparser.model.g>();
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).j = "";
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).b = "817";
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).a = "progressive";
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).f = "720";
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).g = "video/mp4";
            ((com.jio.jioads.instreamads.vastparser.model.g)object4).e = "580";
            arrayList.add((com.jio.jioads.instreamads.vastparser.model.g)object4);
            object4 = new com.jio.jioads.instreamads.vastparser.model.e();
            ArrayList<com.jio.jioads.instreamads.vastparser.model.c> arrayList2 = new ArrayList<com.jio.jioads.instreamads.vastparser.model.c>();
            com.jio.jioads.instreamads.vastparser.model.c c2 = new com.jio.jioads.instreamads.vastparser.model.c();
            com.jio.jioads.instreamads.vastparser.model.f f5 = new com.jio.jioads.instreamads.vastparser.model.f();
            f5.b = arrayList;
            c2.c = f5;
            arrayList2.add(c2);
            ((com.jio.jioads.instreamads.vastparser.model.e)object4).g = arrayList2;
            j3.n = object4;
            object.add(j3);
        }
        this.p = object3;
        object = 0;
        this.q = object;
        object = this.v();
        object3 = Utility.INSTANCE;
        object2 = object2.P();
        ((Utility)object3).getCcbValue((String)object2);
        this.s((String)object);
    }

    public final void d(int n3) {
        Object object;
        Object object2 = this.b;
        JioAdView$AdState jioAdView$AdState = object2.k0();
        if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        jioAdView$AdState = object2.Y();
        if ((object2 = object2.k0()) == object) {
            return;
        }
        object2 = Utility.INSTANCE;
        boolean bl2 = ((Utility)object2).isInternetAvailable((Context)jioAdView$AdState);
        if (!bl2) {
            return;
        }
        object2 = Executors.newSingleThreadExecutor();
        object = new l(this, (Context)jioAdView$AdState, n3, (ExecutorService)object2);
        if (object2 != null) {
            object2.submit((Runnable)object);
        }
    }

    public final void e(int n3, j j3) {
        Object object;
        String string2;
        int n4;
        int n7;
        Object object2;
        Object object3;
        block18: {
            boolean bl2;
            object3 = this.E;
            object2 = null;
            if (object3 != null && (object3 = ((m)object3).c) != null && (object3 = (j)CollectionsKt.N(n3, (List)object3)) != null) {
                object3 = ((j)object3).j;
            } else {
                bl2 = false;
                object3 = null;
            }
            Object object4 = new StringBuilder();
            Object object5 = this.v();
            ((StringBuilder)object4).append((String)object5);
            ((StringBuilder)object4).append(": pgm replacement: ");
            ((StringBuilder)object4).append((String)object3);
            Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
            object4 = JioAds.Companion;
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            n7 = -1;
            if (object3 == null) break block18;
            n4 = ((String)object3).hashCode();
            string2 = "pgm_placeholder_campaign";
            switch (n4) {
                default: {
                    break block18;
                }
                case 1769986469: {
                    n4 = (int)(((String)object3).equals(string2) ? 1 : 0);
                    if (n4 != 0) break;
                    break block18;
                }
                case 111275: {
                    object = "prm";
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 != 0) break;
                    break block18;
                }
                case 98711: {
                    object = "cpd";
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 != 0) break;
                    break block18;
                }
                case 97607: {
                    object = "bkp";
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 != 0) break;
                    break block18;
                }
                case 3200: {
                    object = "dd";
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 != 0) break;
                    break block18;
                }
                case -149597992: {
                    object = "Mediation";
                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                    if (n4 == 0) break block18;
                }
            }
            if (n3 <= (n4 = (object = this.E) != null && (object = ((m)object).c) != null ? xx_2.h((List)object) : -1)) {
                object = this.E;
                Intrinsics.checkNotNull(object);
                object = (j)((m)object).c.remove(n3);
                this.h((j)object);
            }
            if (bl2 = Intrinsics.areEqual(object3, string2)) {
                object3 = this.E;
                if (object3 != null && (object3 = ((m)object3).c) != null && (object3 = (j)CollectionsKt.N(n3, (List)object3)) != null) {
                    object3 = ((j)object3).j;
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object = this.E;
                Intrinsics.checkNotNull(object);
                object = (j)((m)object).c.remove(n3);
                this.h((j)object);
                object = new StringBuilder();
                string2 = this.v();
                ((StringBuilder)object).append(string2);
                string2 = ": removed ";
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" backup from vastAd after pgm replacement");
                object3 = ((StringBuilder)object).toString();
                com.jio.jioads.jioreel.tracker.model.b.g((String)object3, (JioAds$Companion)object4);
            }
        }
        object3 = this.E;
        Intrinsics.checkNotNull(object3);
        object3 = ((m)object3).c;
        int n8 = 1;
        if (j3 != null) {
            object2 = new StringBuilder();
            object = j3.h;
            ((StringBuilder)object2).append((String)object);
            object = "**pgm_";
            ((StringBuilder)object2).append((String)object);
            this.N = n4 = this.N + n8;
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
            j3.h = object2;
            j3.j = "pgm";
            object2 = Unit.a;
        } else {
            j3 = null;
        }
        object3.add(n3, j3);
        Object object6 = this.E;
        if (object6 != null && (object6 = ((m)object6).c) != null) {
            n7 = object6.size();
        }
        if (n7 == n8) {
            String string3 = this.v();
            object = object6 = this.c;
            object = (com.jio.jioads.controller.f)object6;
            String string4 = "pid";
            String string5 = "pid";
            String string6 = "pgm";
            string2 = null;
            ((com.jio.jioads.controller.f)object).c(0, string3, string4, string5, string6);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(int n3, m object) {
        int n4;
        block18: {
            Object object2;
            com.jio.jioads.common.c c2;
            int n7;
            g g3;
            Object object3;
            j j3;
            com.jio.jioads.common.b b2;
            boolean bl2;
            block19: {
                List list;
                List list2 = ((m)object).c;
                int n8 = list2.isEmpty();
                bl2 = false;
                if (n8 != 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    j_0.j(this, stringBuilder, ": empty vast ads");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    this.n(false);
                    return;
                }
                n8 = this.G;
                b2 = this.b;
                if (n8 != 0) {
                    com.jio.jioads.audioplayer.b.a(b2, ": returning from processVastAds");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                }
                if (n3 >= (n8 = (list = ((m)object).c).size())) {
                    com.jio.jioads.audioplayer.b.a(b2, ": No unique redirections available");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    this.n(false);
                    return;
                }
                List list3 = ((m)object).c;
                j3 = (j)CollectionsKt.N(n3, list3);
                if (j3 == null) {
                    return;
                }
                object3 = j3.m;
                g3 = null;
                if (object3 != null) {
                    object3 = ((q)object3).e;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                n4 = 1;
                if (object3 == null || (n7 = ((String)object3).length()) == 0) break block18;
                n7 = (int)(this.s ? 1 : 0);
                c2 = this.c;
                if (n7 == 0) break block19;
                com.jio.jioads.audioplayer.b.a(b2, ": pgm check for pgm wrapper ad");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = c2;
                object3 = ((com.jio.jioads.controller.f)c2).a;
                n7 = (int)(((com.jio.jioads.controller.o)object3).D ? 1 : 0);
                if (n7 == 0 || (object3 = this.p) == null || (n7 = (int)(Intrinsics.areEqual(object3, object2 = "pgm") ? 1 : 0)) == 0) break block18;
            }
            if ((n7 = (int)(this.G ? 1 : 0)) == 0) {
                object3 = new StringBuilder();
                object2 = this.v();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(": Trying wrapper from redirect list ");
                object2 = j3.h;
                String string2 = "message";
                ir3_0.b((StringBuilder)object3, (String)object2, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = this.h;
                if (object3 != null) {
                    object2 = ((com.jio.jioads.instreamads.wrapper.i)object3).m;
                    if (object2 != null) {
                        ((com.jio.jioads.network.c)object2).a();
                    }
                    ((com.jio.jioads.instreamads.wrapper.i)object3).b = null;
                }
                g3 = new g(this, j3, n3, (m)object);
                object3 = new com.jio.jioads.instreamads.wrapper.i(j3, g3, b2, c2);
                ((com.jio.jioads.instreamads.wrapper.i)object3).h = n3 = this.g;
                ((com.jio.jioads.instreamads.wrapper.i)object3).g = n3 = this.i;
                c2 = (com.jio.jioads.controller.f)c2;
                com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)c2).a;
                n3 = (int)(o3.o ? 1 : 0);
                if (n3 == 0) {
                    List list = ((m)object).c;
                    n3 = list.size();
                    if (n3 == n4) {
                        ((com.jio.jioads.instreamads.wrapper.i)object3).i = n4;
                    } else {
                        Integer n10 = j3.k;
                        if (n10 == null) {
                            bl2 = true;
                        }
                        ((com.jio.jioads.instreamads.wrapper.i)object3).i = bl2;
                    }
                } else {
                    Integer n14 = j3.k;
                    if (n14 == null) {
                        bl2 = true;
                    }
                    ((com.jio.jioads.instreamads.wrapper.i)object3).i = bl2;
                }
                String string3 = this.n;
                object = this.p;
                Integer n15 = this.q;
                ((com.jio.jioads.instreamads.wrapper.i)object3).c(string3, (String)object, n15);
                this.h = object3;
                return;
            }
        }
        this.f(n3 += n4, (m)object);
    }

    public final void h(j object) {
        block12: {
            if (object == null) {
                return;
            }
            String string2 = this.v();
            object = ((j)object).h;
            if (object == null) {
                object = "";
            }
            Object object2 = (com.jio.jioads.controller.f)this.c;
            object2.getClass();
            Object object3 = "adspotId";
            Intrinsics.checkNotNullParameter(string2, (String)object3);
            String string3 = "selectedAdKey";
            Intrinsics.checkNotNullParameter(object, string3);
            object2 = ((com.jio.jioads.controller.f)object2).a.f;
            if (object2 != null) {
                Intrinsics.checkNotNullParameter(string2, (String)object3);
                Intrinsics.checkNotNullParameter(object, string3);
                object3 = ((t)object2).a();
                boolean n3 = ((HashMap)object3).containsKey(string2);
                if (!n3) break block12;
                object2 = ((t)object2).a();
                object2 = ((HashMap)object2).get(string2);
                Intrinsics.checkNotNull(object2);
                object2 = (Object[])object2;
                int n4 = 2;
                object2 = object2[n4];
                object3 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (ArrayList)object2;
                try {
                    ((ArrayList)object2).remove(object);
                }
                catch (Exception exception) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(string2);
                    string2 = ": error in removeFromSessionMap adId: ";
                    ((StringBuilder)object3).append(string2);
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(", ");
                    l_0.f(exception, (StringBuilder)object3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void i(m var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [5 : 57->61)] java.lang.Exception
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

    public final void j(String object, JioMediationVideoController object2, Integer n3, int n4, Integer n7, Integer n8, String object3) {
        Intrinsics.checkNotNullParameter(object, "url");
        Object object4 = "jioMediationVideoController";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        int n10 = this.G;
        if (n10 != 0) {
            object = new StringBuilder();
            j_0.j(this, (StringBuilder)object, ": returning from addMediationUrl");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object4 = new StringBuilder();
        String string2 = this.v();
        ((StringBuilder)object4).append(string2);
        ((StringBuilder)object4).append(": Inside addMediationUrl");
        com.jio.jioads.util.j.a(((StringBuilder)object4).toString());
        object4 = new StringBuilder();
        string2 = this.v();
        ((StringBuilder)object4).append(string2);
        ((StringBuilder)object4).append(": adding med vast ad ");
        int n14 = this.i;
        ((StringBuilder)object4).append(n14);
        ((StringBuilder)object4).append(' ');
        n14 = this.g;
        ((StringBuilder)object4).append(n14);
        object4 = ((StringBuilder)object4).toString();
        com.jio.jioads.util.j.a((String)object4);
        n10 = this.i;
        string2 = ": mediation ad added: ";
        String string3 = "Mediation";
        com.jio.jioads.common.c c2 = this.c;
        com.jio.jioads.common.b b2 = this.b;
        List list = null;
        int n15 = 1;
        if (n10 > 0) {
            int n16;
            int n17;
            Object object5;
            c2 = (com.jio.jioads.controller.f)c2;
            object4 = ((com.jio.jioads.controller.f)c2).i().c;
            if (object4 != null && (object4 = ((com.jio.jioads.multiad.model.e)object4).b) != null) {
                object4 = ((com.jio.jioads.multiad.model.c)object4).a;
            } else {
                n10 = 0;
                object4 = null;
            }
            n10 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
            if (n10 == 0 && (object4 = this.A) == null) {
                object5 = ((com.jio.jioads.controller.f)c2).i().c;
                if (object5 != null && (object5 = ((com.jio.jioads.multiad.model.e)object5).b) != null) {
                    object5 = ((com.jio.jioads.multiad.model.c)object5).a;
                } else {
                    n17 = 0;
                    object5 = null;
                }
                object4 = new JSONArray((String)object5);
                this.A = object4;
            }
            if ((n10 = this.i) > 0 && (n10 = n3.intValue()) > 0) {
                n10 = this.i;
                n17 = n3;
                this.i = n10 -= n17;
                n10 = this.u;
                this.u = n17 = n3 + n10;
            }
            this.t = n10 = this.t + n15;
            this.B = n10 = this.B + n15;
            object4 = new j();
            object5 = "**med_";
            object3 = nn_2.a((String)object3, (String)object5);
            this.O = n17 = this.O + n15;
            ((StringBuilder)object3).append(n17);
            ((j)object4).h = object3 = ((StringBuilder)object3).toString();
            ((j)object4).n = object3 = new com.jio.jioads.instreamads.vastparser.model.e();
            ((j)object4).d = n15;
            ((j)object4).e = object;
            ((j)object4).c = object2;
            ((j)object4).b = n4;
            if (n7 != null) {
                object = n7.toString();
            } else {
                n16 = 0;
                object = null;
            }
            ((j)object4).f = object;
            if (n8 != null) {
                object = n8.toString();
            } else {
                n16 = 0;
                object = null;
            }
            ((j)object4).g = object;
            ((j)object4).a = n3;
            ((j)object4).j = string3;
            object = this.E;
            if (object != null && (object = ((m)object).c) != null) {
                object.add(object4);
            }
            object = new StringBuilder();
            object2 = this.v();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(string2);
            object2 = ((j)object4).h;
            ((StringBuilder)object).append((String)object2);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = new StringBuilder();
            object2 = b2.P();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": AdPOD Duration for mediation ad selection: ");
            ((StringBuilder)object).append(n3);
            object2 = " and leftoverAdDuration :: ";
            ((StringBuilder)object).append((String)object2);
            int n18 = this.i;
            ((StringBuilder)object).append(n18);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = this.E;
            if (object != null) {
                list = ((m)object).c;
            }
            if (list != null && (n16 = list.isEmpty()) == 0) {
                object = this.E;
                Intrinsics.checkNotNull(object);
                object = ((m)object).c;
                this.l((List)object);
            }
            object = com.jio.jioads.controller.m.a(b2, ": Trying to get Mediation Ad--");
            object2 = com.jio.jioads.multiad.N.a;
            object2 = b2.P();
            n18 = (int)(com.jio.jioads.multiad.N.j((String)object2) ? 1 : 0);
            ((StringBuilder)object).append(n18 != 0);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            n16 = this.i;
            n18 = this.m;
            if (n16 <= n18) {
                this.s = n15;
            }
            if ((object = this.E) != null) {
                ((m)object).e = n15;
            }
            if ((object = this.l) != null) {
                object.a();
            }
            ((com.jio.jioads.controller.f)c2).a.B = n15;
            object = b2.P();
            this.q((String)object);
        } else {
            int n19 = this.g;
            if (n19 > 0) {
                int n20;
                int n21;
                c2 = (com.jio.jioads.controller.f)c2;
                object3 = ((com.jio.jioads.controller.f)c2).i().c;
                if (object3 != null && (object3 = ((com.jio.jioads.multiad.model.e)object3).b) != null) {
                    object3 = ((com.jio.jioads.multiad.model.c)object3).a;
                } else {
                    n19 = 0;
                    object3 = null;
                }
                n19 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n19 == 0 && (object3 = this.A) == null) {
                    object4 = ((com.jio.jioads.controller.f)c2).i().c;
                    if (object4 != null && (object4 = ((com.jio.jioads.multiad.model.e)object4).b) != null) {
                        object4 = ((com.jio.jioads.multiad.model.c)object4).a;
                    } else {
                        n10 = 0;
                        object4 = null;
                    }
                    object3 = new JSONArray((String)object4);
                    this.A = object3;
                }
                if ((n19 = this.g) > 0) {
                    this.g = n19 -= n15;
                    n19 = this.u;
                    this.u = n10 = n3 + n19;
                }
                object3 = new j();
                String string4 = "med_";
                object4 = new StringBuilder(string4);
                this.O = n21 = this.O + n15;
                ((StringBuilder)object4).append(n21);
                ((j)object3).h = object4 = ((StringBuilder)object4).toString();
                ((j)object3).n = object4 = new com.jio.jioads.instreamads.vastparser.model.e();
                ((j)object3).d = n15;
                ((j)object3).e = object;
                ((j)object3).c = object2;
                ((j)object3).b = n4;
                if (n7 != null) {
                    object = n7.toString();
                } else {
                    n20 = 0;
                    object = null;
                }
                ((j)object3).f = object;
                if (n8 != null) {
                    object = n8.toString();
                } else {
                    n20 = 0;
                    object = null;
                }
                ((j)object3).g = object;
                ((j)object3).a = n3;
                ((j)object3).j = string3;
                object = this.E;
                if (object != null && (object = ((m)object).c) != null) {
                    object.add(object3);
                }
                object = new StringBuilder();
                object2 = this.v();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(string2);
                object2 = ((j)object3).h;
                ((StringBuilder)object).append((String)object2);
                com.jio.jioads.util.j.a(((StringBuilder)object).toString());
                object = new StringBuilder();
                object2 = ": AdPOD Count for mediation ad selection PodCount :: ";
                j_0.n(b2, (StringBuilder)object, (String)object2);
                int n22 = this.g;
                ((StringBuilder)object).append(n22);
                com.jio.jioads.util.j.a(((StringBuilder)object).toString());
                object = this.E;
                if (object != null) {
                    list = ((m)object).c;
                }
                if (list != null && (n20 = list.isEmpty()) == 0) {
                    object = this.E;
                    Intrinsics.checkNotNull(object);
                    object = ((m)object).c;
                    this.l((List)object);
                }
                this.t = n20 = this.t + n15;
                this.B = n20 = this.B + n15;
                n20 = this.g;
                if (n20 == 0 && (n20 = this.i) <= 0) {
                    this.s = n15;
                }
                if ((object = this.E) != null) {
                    ((m)object).e = n15;
                }
                if ((object = this.l) != null) {
                    object.a();
                }
                ((com.jio.jioads.controller.f)c2).a.B = n15;
                object = b2.P();
                this.q((String)object);
            } else {
                object = new StringBuilder();
                object2 = b2.P();
                ((StringBuilder)object).append((String)object2);
                object2 = ": AdPodVariant is NONE So giving setVastModelParsed callback";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                com.jio.jioads.util.j.a((String)object);
                this.G();
            }
        }
    }

    public final void k(String object, String string2, Integer n3) {
        int n4;
        if (object != null && (n4 = ((String)object).length()) != 0) {
            int n7;
            s s7;
            Object object2;
            Object object3 = this.b;
            JioAdView$AdState jioAdView$AdState = object3.k0();
            if (jioAdView$AdState == (object2 = JioAdView$AdState.DESTROYED)) {
                return;
            }
            jioAdView$AdState = object3.Y();
            String string3 = object3.P();
            object2 = Utility.INSTANCE;
            String string4 = ((Utility)object2).getAdvidFromPreferences((Context)jioAdView$AdState);
            ((Utility)object2).getUidFromPreferences((Context)jioAdView$AdState);
            object2 = object3.R();
            Object object4 = object2 != null ? (object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)jioAdView$AdState)) : null;
            object3.q0();
            object3 = ((com.jio.jioads.controller.f)this.c).a;
            com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object3, null, null, null);
            i i3 = new i(this, (Context)jioAdView$AdState);
            object2 = s7;
            s7 = new s(this, null, string3, string4, (Map)object4, (String)object, i3);
            if (string2 != null && (n7 = string2.equals(object = "pgm")) == (n4 = 1)) {
                this.n = null;
                this.p = string2;
                n7 = 0;
                this.q = object = Integer.valueOf(0);
            }
            object = this.n;
            s7.a(n3, null, (String)object, string2);
        }
    }

    public final void l(List object) {
        Object object2;
        Object object3;
        Object object4;
        boolean bl2 = object.isEmpty();
        boolean bl3 = true;
        if ((bl2 ^= bl3) && (object4 = ((JioAds$Companion)(object3 = JioAds.Companion)).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (object2 = JioAds$LogLevel.DEBUG)) {
            object4 = new StringBuilder();
            object2 = ": final ordered vastAdList: ";
            j_0.j(this, (StringBuilder)object4, (String)object2);
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = new StringBuilder();
            object = object.iterator();
            while (true) {
                boolean bl4 = object.hasNext();
                boolean bl5 = false;
                object2 = null;
                if (!bl4) break;
                object4 = (j)object.next();
                StringBuilder stringBuilder = new StringBuilder("- [id=");
                String string2 = null;
                Object object5 = object4 != null ? ((j)object4).h : null;
                stringBuilder.append((String)object5);
                object5 = ", seq=";
                stringBuilder.append((String)object5);
                object5 = object4 != null ? ((j)object4).k : null;
                stringBuilder.append(object5);
                object5 = ", isInline=";
                stringBuilder.append((String)object5);
                object5 = object4 != null ? ((j)object4).n : null;
                if (object5 != null) {
                    bl5 = true;
                }
                stringBuilder.append(bl5);
                object2 = ", campaignType=";
                stringBuilder.append((String)object2);
                if (object4 != null) {
                    string2 = ((j)object4).j;
                }
                stringBuilder.append(string2);
                stringBuilder.append("] -");
                object4 = stringBuilder.toString();
                ((StringBuilder)object3).append((String)object4);
            }
            object = new StringBuilder();
            String string3 = this.v();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(object3);
            object = ((StringBuilder)object).toString();
            string3 = "message";
            Intrinsics.checkNotNullParameter(object, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = "<this>";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            ((StringBuilder)object3).setLength(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(JSONObject object) {
        Object object2;
        Enum enum_;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        com.jio.jioads.common.b b2;
        Object object3;
        com.jio.jioads.common.c c2;
        Object object4;
        block31: {
            Object object5;
            Object object6;
            block30: {
                int n3;
                Object object7;
                block26: {
                    block29: {
                        block28: {
                            block27: {
                                boolean bl2;
                                object4 = "location";
                                c2 = this.c;
                                object3 = "Mediation adType ";
                                b2 = this.b;
                                jioAdView$AD_TYPE = b2.K();
                                object6 = new StringBuilder();
                                j_0.j(this, (StringBuilder)object6, ": inside tryLoadingMediationAd");
                                object6 = JioAds.Companion;
                                ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                enum_ = JioAds$LogLevel.NONE;
                                enum_ = b2.k0();
                                JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
                                if (enum_ == jioAdView$AdState) {
                                    return;
                                }
                                enum_ = b2.Y();
                                if (object == null) {
                                    this.H();
                                    return;
                                }
                                object2 = new StringBuilder("loadMediationAd header appid vastAdController: ");
                                object5 = object.optString("appid");
                                ((StringBuilder)object2).append((String)object5);
                                object2 = ((StringBuilder)object2).toString();
                                object5 = "message";
                                Intrinsics.checkNotNullParameter(object2, (String)object5);
                                ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = null;
                                object7 = "type";
                                object7 = object.optString(object7);
                                Object object8 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                                n3 = 1;
                                if (jioAdView$AD_TYPE != object8 || !(bl2 = kotlin.text.b.i(object7, (String)(object8 = "video"), n3 != 0))) break block26;
                                object3 = new HashMap();
                                object6 = "adview";
                                try {
                                    int n4;
                                    object5 = b2.n();
                                    ((HashMap)object3).put(object6, object5);
                                    object6 = "jioAdPartner";
                                    object5 = new JioAdPartner();
                                    ((HashMap)object3).put(object6, object5);
                                    object6 = "timeOut";
                                    int n7 = b2.g();
                                    object5 = n7;
                                    ((HashMap)object3).put(object6, object5);
                                    object6 = new JioAdsMetadata$Builder();
                                    object5 = ((JioAdsMetadata$Builder)object6).getGender();
                                    if (object5 != null) {
                                        object5 = "gender";
                                        object7 = ((JioAdsMetadata$Builder)object6).getGender();
                                        ((HashMap)object3).put(object5, object7);
                                    }
                                    if ((object5 = ((JioAdsMetadata$Builder)object6).getCity()) != null && (n7 = (int)(TextUtils.isEmpty((CharSequence)(object5 = ((JioAdsMetadata$Builder)object6).getCity())) ? 1 : 0)) == 0) {
                                        object5 = "city";
                                        object7 = ((JioAdsMetadata$Builder)object6).getCity();
                                        ((HashMap)object3).put(object5, object7);
                                    }
                                    if ((n7 = (int)(TextUtils.isEmpty((CharSequence)(object5 = ((JioAdsMetadata$Builder)object6).getAge())) ? 1 : 0)) != 0) {
                                        object5 = "age";
                                        object6 = ((JioAdsMetadata$Builder)object6).getAge();
                                        ((HashMap)object3).put(object5, object6);
                                    }
                                    if (enum_ != null && (object6 = enum_.getResources()) != null && (object6 = object6.getConfiguration()) != null) {
                                        object6 = ((Configuration)object6).locale;
                                    } else {
                                        n4 = 0;
                                        object6 = null;
                                    }
                                    if (object6 != null) {
                                        object5 = "language";
                                        object6 = ((Locale)object6).getISO3Language();
                                        ((HashMap)object3).put(object5, object6);
                                    }
                                    if (enum_ != null && (object6 = enum_.getPackageName()) != null && (object5 = enum_.getPackageManager()) != null) {
                                        object2 = null;
                                        object2 = object5.getPackageInfo((String)object6, 0);
                                    }
                                    if (object2 != null) {
                                        object6 = "appversion";
                                        object2 = ((PackageInfo)object2).versionName;
                                        ((HashMap)object3).put(object6, object2);
                                    }
                                    object6 = "packagename";
                                    object2 = c2;
                                    object2 = (com.jio.jioads.controller.f)c2;
                                    object2 = ((com.jio.jioads.controller.f)object2).a;
                                    object2 = ((com.jio.jioads.controller.o)object2).U();
                                    ((HashMap)object3).put(object6, object2);
                                    if (enum_ != null && (n4 = enum_.checkCallingOrSelfPermission((String)(object6 = "android.permission.ACCESS_FINE_LOCATION"))) == 0) {
                                        object6 = enum_.getSystemService((String)object4);
                                        object2 = "null cannot be cast to non-null type android.location.LocationManager";
                                        Intrinsics.checkNotNull(object6, (String)object2);
                                        object6 = (LocationManager)object6;
                                        object2 = "gps";
                                        object2 = object6.getLastKnownLocation((String)object2);
                                        if (object2 == null) {
                                            object2 = "network";
                                            object2 = object6.getLastKnownLocation((String)object2);
                                        }
                                        if (object2 != null) {
                                            ((HashMap)object3).put(object4, object2);
                                        }
                                    }
                                    object4 = c2;
                                    object4 = (com.jio.jioads.controller.f)c2;
                                    object6 = ((com.jio.jioads.controller.f)object4).a;
                                    object6 = ((com.jio.jioads.controller.o)object6).a;
                                    if ((object6 = object6.Y()) != null) {
                                        object4 = ((com.jio.jioads.controller.f)object4).a;
                                        object4 = ((com.jio.jioads.controller.o)object4).a;
                                        if ((object4 = object4.k0()) != jioAdView$AdState) {
                                            object4 = Utility.INSTANCE;
                                            ((Utility)object4).getAdvidFromPreferences((Context)object6);
                                        }
                                    }
                                    object4 = "advid";
                                    object6 = c2;
                                    object6 = (com.jio.jioads.controller.f)c2;
                                    object2 = ((com.jio.jioads.controller.f)object6).a;
                                    object2 = ((com.jio.jioads.controller.o)object2).a;
                                    if ((object2 = object2.Y()) == null) break block27;
                                    object6 = ((com.jio.jioads.controller.f)object6).a;
                                    object6 = ((com.jio.jioads.controller.o)object6).a;
                                    if ((object6 = object6.k0()) == jioAdView$AdState) break block27;
                                }
                                catch (Exception exception) {
                                    break block29;
                                }
                                object6 = Utility.INSTANCE;
                                object6 = ((Utility)object6).getAdvidFromPreferences((Context)object2);
                                object6 = String.valueOf(object6);
                                break block28;
                            }
                            object6 = "";
                        }
                        ((HashMap)object3).put(object4, object6);
                        object4 = "UX_TYPE";
                        object6 = b2.K();
                        ((HashMap)object3).put(object4, object6);
                    }
                    object2 = object3;
                    break block31;
                }
                try {
                    int n8;
                    object4 = new StringBuilder((String)object3);
                    ((StringBuilder)object4).append((String)object7);
                    object3 = " present in ";
                    ((StringBuilder)object4).append((String)object3);
                    int n10 = this.B;
                    ((StringBuilder)object4).append(n10);
                    object3 = " index is not matching with publisher adType so moving to next index";
                    ((StringBuilder)object4).append((String)object3);
                    object4 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    object4 = ((JioAds$Companion)object6).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    this.B = n8 = this.B + n3;
                    object4 = this.A;
                    if (object4 == null) break block30;
                    Intrinsics.checkNotNull(object4);
                    n8 = object4.length();
                    n10 = this.B;
                    if (n8 > n10) {
                        object4 = this.A;
                        Intrinsics.checkNotNull(object4);
                        n10 = this.B;
                        object4 = object4.optJSONObject(n10);
                        this.m((JSONObject)object4);
                        return;
                    }
                }
                catch (Exception exception) {}
                break block31;
            }
            object4 = "Trying promotion mediation ad as all the mediation ad failed";
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            object4 = ((JioAds$Companion)object6).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        object4 = c2;
        object4 = (com.jio.jioads.controller.f)c2;
        object3 = ((com.jio.jioads.controller.f)object4).a.p;
        if (object3 == null && enum_ != null) {
            object3 = new JioMediationSelector(b2, (Map)object2, (JSONObject)object, c2);
            Intrinsics.checkNotNullParameter(object3, "value");
            object = ((com.jio.jioads.controller.f)object4).a;
            ((com.jio.jioads.controller.o)object).p = object3;
        }
        if (jioAdView$AD_TYPE != (object = JioAdView$AD_TYPE.INSTREAM_VIDEO)) return;
        object = ((com.jio.jioads.controller.f)object4).a.p;
        if (object == null) return;
        object4 = new JioVastParsingHelper$tryLoadingMediationAd$1(this);
        ((JioMediationSelector)object).loadAd((JioMediationListener)object4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void n(boolean bl2) {
        String string2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AdPodVariant jioAdView$AdPodVariant;
        JioAdView$AdPodVariant jioAdView$AdPodVariant2;
        m m2;
        com.jio.jioads.common.b b2;
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        int n8;
        int n10;
        Object object3;
        Object object4;
        Object object5;
        int n14;
        block38: {
            block36: {
                JioAdView$AdPodVariant jioAdView$AdPodVariant3;
                JioAdView$AdPodVariant jioAdView$AdPodVariant4;
                block37: {
                    a a2;
                    JioAds$MediaType jioAds$MediaType;
                    JioAds$MediaType jioAds$MediaType2;
                    m m3;
                    List list;
                    String string3;
                    block34: {
                        m m4;
                        int n15;
                        block35: {
                            block33: {
                                n14 = 1;
                                object5 = this.E;
                                if (object5 == null) break block33;
                                Intrinsics.checkNotNull(object5);
                                object5 = ((m)object5).c;
                                int n16 = object5.size();
                                if (n16 <= 0 && !bl2) break block33;
                                bl2 = this.F();
                                if (bl2) {
                                    this.s = n14;
                                }
                                object4 = (com.jio.jioads.controller.f)this.c;
                                object5 = ((com.jio.jioads.controller.f)object4).a;
                                n16 = (int)(((com.jio.jioads.controller.o)object5).o ? 1 : 0);
                                Object var6_7 = null;
                                string3 = "message";
                                if (n16 != 0) break block34;
                                break block35;
                            }
                            if (!(bl2 = this.s)) return;
                            t_0 t_02 = JioAdError.Companion;
                            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
                            t_02.getClass();
                            JioAdError jioAdError = t_0.a(jioAdError$JioAdErrorType);
                            object5 = this.d;
                            if (object5 == null) return;
                            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                            String string4 = "Ignoring backup ad selection in case of hybrid multi ad";
                            String string5 = "retrieveAndProcessLocalAd";
                            String string6 = "JioAdViewController";
                            object5.b(jioAdError, d2, string5, string6, string4);
                            return;
                        }
                        object5 = new ArrayList();
                        ArrayList<Object> arrayList = new ArrayList<Object>();
                        ArrayList<Object> arrayList2 = new ArrayList<Object>();
                        object3 = this.E;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((m)object3).c.iterator();
                        while (true) {
                            com.jio.jioads.instreamads.vastparser.model.e e2;
                            void var15_73;
                            n10 = object3.hasNext();
                            n8 = 0;
                            object2 = null;
                            if (n10 == 0) break;
                            object = (j)object3.next();
                            if (object != null) {
                                q q2 = ((j)object).m;
                            } else {
                                n15 = 0;
                                Object var15_72 = null;
                            }
                            if (var15_73 != null && (e2 = ((j)object).n) == null) {
                                arrayList.add(object);
                                continue;
                            }
                            if (object != null) {
                                object2 = ((j)object).n;
                            }
                            if (object2 != null && (object2 = ((j)object).m) == null) {
                                arrayList2.add(object);
                                continue;
                            }
                            if (object == null || (n8 = ((j)object).d) != n14) continue;
                            arrayList2.add(object);
                        }
                        ((ArrayList)object5).addAll(arrayList);
                        n7 = arrayList2.size();
                        object3 = null;
                        for (n4 = 0; n4 < n7; n4 += n14) {
                            int n17;
                            object = this.E;
                            if (object != null) {
                                object = com.jio.jioads.instreamads.vastparser.model.m.i((j)arrayList2.get(n4));
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            if (object == null) continue;
                            Object e5 = arrayList2.get(n4);
                            ((ArrayList)object5).add(e5);
                            this.t = n15 = this.t + n14;
                            object = ((com.jio.jioads.instreamads.vastparser.model.f)object).d;
                            n10 = j_0.a((String)object);
                            this.u = n15 = this.u + n10;
                            n15 = this.i;
                            if (n15 > 0 && n10 > 0) {
                                this.i = n15 -= n10;
                                StringBuilder stringBuilder = new StringBuilder();
                                String string7 = this.v();
                                stringBuilder.append(string7);
                                string7 = ": left over duration: ";
                                stringBuilder.append(string7);
                                w12_0.b(this.i, string3, stringBuilder);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                n15 = this.i;
                                n17 = this.m;
                                if (n15 <= n17) break;
                            }
                            if ((n15 = this.g) == (n17 = -100) || n15 <= 0 || n10 <= 0) continue;
                            this.g = n15 += -1;
                            object = new StringBuilder();
                            String string8 = this.v();
                            ((StringBuilder)object).append(string8);
                            String string9 = ": leftover ad count: ";
                            ((StringBuilder)object).append(string9);
                            n15 = this.g;
                            w12_0.b(n15, string3, (StringBuilder)object);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object = JioAds$LogLevel.NONE;
                            n10 = this.g;
                            if (n10 == 0) break;
                        }
                        if ((m4 = this.E) != null) {
                            String string10 = "<set-?>";
                            Intrinsics.checkNotNullParameter(object5, string10);
                            m4.c = object5;
                        }
                    }
                    object5 = this.B();
                    m m7 = this.E;
                    Intrinsics.checkNotNull(m7);
                    ((com.jio.jioads.instreamads.vastparser.model.n)object5).i(m7);
                    object5 = new StringBuilder();
                    String string11 = this.v();
                    ((StringBuilder)object5).append(string11);
                    ((StringBuilder)object5).append(": mTrackingEvents size-->");
                    n7 = this.B().b.size();
                    ((StringBuilder)object5).append(n7);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string3);
                    object5 = JioAds.Companion;
                    ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    StringBuilder stringBuilder = new StringBuilder();
                    String string12 = this.v();
                    stringBuilder.append(string12);
                    stringBuilder.append(": ImpressionUrls size-->");
                    HashMap hashMap = this.B().c;
                    n3 = hashMap.size();
                    stringBuilder.append(n3);
                    String string13 = stringBuilder.toString();
                    Intrinsics.checkNotNullParameter(string13, string3);
                    ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    m m8 = this.E;
                    if (m8 != null && (list = m8.c) != null) {
                        this.l(list);
                    }
                    if ((m3 = this.E) != null) {
                        m3.e = n14;
                    }
                    this.r();
                    b2 = this.b;
                    JioAds$MediaType jioAds$MediaType3 = b2.r();
                    JioAds$MediaType jioAds$MediaType4 = JioAds$MediaType.ALL;
                    if (jioAds$MediaType3 != jioAds$MediaType4 && (jioAds$MediaType2 = b2.r()) != (jioAds$MediaType = JioAds$MediaType.VIDEO) && (n7 = (int)(this.k ? 1 : 0)) != 0 && (a2 = this.l) != null) {
                        a2.a();
                    }
                    if ((n7 = (int)(b2.f0() ? 1 : 0)) != 0) {
                        object4 = this.d;
                        if (object4 == null) return;
                        m m11 = this.E;
                        object4.a(m11);
                        return;
                    }
                    JioAdView$AdPodVariant jioAdView$AdPodVariant5 = b2.L();
                    if (jioAdView$AdPodVariant5 != (jioAdView$AdPodVariant4 = JioAdView$AdPodVariant.NONE)) break block36;
                    JioAdView$AdPodVariant jioAdView$AdPodVariant6 = b2.L();
                    if (jioAdView$AdPodVariant6 != jioAdView$AdPodVariant4) break block37;
                    com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)object4).a;
                    n7 = (int)(o3.o ? 1 : 0);
                    if (n7 == 0) break block36;
                }
                if ((jioAdView$AdPodVariant3 = b2.L()) != jioAdView$AdPodVariant4) break block38;
                com.jio.jioads.controller.o o6 = ((com.jio.jioads.controller.f)object4).a;
                n7 = (int)(o6.o ? 1 : 0);
                if (n7 == 0 || (n7 = (int)(this.j ? 1 : 0)) == 0) break block38;
            }
            if ((n7 = (int)(this.k ? 1 : 0)) == 0 && (n7 = (int)(this.E() ? 1 : 0)) != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                String string14 = ": onResponseReceived given";
                j_0.j(this, stringBuilder, string14);
                ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                c c2 = this.d;
                if (c2 != null) {
                    m m12 = this.E;
                    c2.a(m12);
                }
                this.k = n14;
            }
        }
        if ((m2 = this.E) != null) {
            Intrinsics.checkNotNull(m2);
            n7 = (int)(m2.d ? 1 : 0);
            if (n7 != 0) {
                j j3;
                m m14 = this.E;
                if (m14 == null) {
                    n4 = 0;
                    object3 = null;
                } else {
                    Intrinsics.checkNotNull(m14);
                    List list = m14.c;
                    n7 = list.size();
                    Object var9_60 = null;
                    n4 = 0;
                    object3 = null;
                    for (n3 = 0; n3 < n7; n3 += n14) {
                        object = this.E;
                        Intrinsics.checkNotNull(object);
                        object = (j)((m)object).c.get(n3);
                        if (object == null || (n8 = (int)(Intrinsics.areEqual(object, object2 = this.v) ? 1 : 0)) != 0) continue;
                        object2 = this.E;
                        Intrinsics.checkNotNull(object2);
                        object2.getClass();
                        object = com.jio.jioads.instreamads.vastparser.model.m.i((j)object);
                        if (object != null && (object = ((com.jio.jioads.instreamads.vastparser.model.f)object).b) != null) {
                            n10 = object.size();
                        } else {
                            n10 = 0;
                            object = null;
                        }
                        if (n10 <= 0) continue;
                        n4 = 1;
                    }
                }
                if (n4 != 0 && (j3 = this.v) != null) {
                    object4 = this.E;
                    if (object4 != null && (object4 = ((m)object4).c) != null) {
                        object4.remove(j3);
                    }
                    if ((object4 = this.E) == null) return;
                    ((m)object4).e = n14;
                    return;
                }
            }
        }
        com.jio.jioads.controller.o o7 = ((com.jio.jioads.controller.f)object4).a;
        n7 = (int)(o7.D ? 1 : 0);
        if (n7 == 0 || (jioAdView$AdPodVariant2 = b2.L()) == (jioAdView$AdPodVariant = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP) || (bl2 = ((com.jio.jioads.controller.o)(object4 = ((com.jio.jioads.controller.f)object4).a)).i0()) || (object4 = b2.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            n14 = 0;
            string2 = null;
        }
        if (n14 != 0) {
            object4 = new StringBuilder();
            string2 = " Stop further selection it is pgm replacement";
            j_0.j(this, (StringBuilder)object4, string2);
            object4 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.G();
            return;
        }
        object4 = this.v();
        this.q((String)object4);
    }

    public final void o(int n3) {
        int n4;
        long l2;
        int n7 = 0;
        String string2 = null;
        this.G = false;
        long l3 = this.A();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            this.i = n4 = this.i + n3;
        }
        this.s = false;
        this.u = n4 = this.u - n3;
        this.t = n3 = this.t + -1;
        this.P = n4 = this.P + 1;
        this.r = n3 += n4;
        this.j = false;
        this.g = n3 = this.g + 1;
        this.x = n3 = this.x + 1;
        Object object2 = new StringBuilder();
        string2 = this.v();
        object2.append(string2);
        object2.append(": reInitLeftOverCountAndDuration called - leftoverAdDuration: ");
        n7 = this.i;
        object2.append(n7);
        object2.append(", leftoverAdCount: ");
        w12_0.b(this.g, "message", object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void p(m object, String object2, String object3) {
        int n3;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AdPodVariant jioAdView$AdPodVariant;
        Object object4;
        JioAdView$AdPodVariant jioAdView$AdPodVariant2;
        JioAdView$AdPodVariant jioAdView$AdPodVariant3;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE3;
        List list;
        String string2;
        int n4;
        int n7 = 2;
        m m2 = this.E;
        String string3 = ": error while trying wrapper ";
        String string4 = ": PGM ad empty";
        int n8 = 1;
        String string5 = "message";
        com.jio.jioads.common.c c2 = this.c;
        if (m2 != null && (n4 = m2.d) == n8 && (n4 = (string2 = this.v()).length()) > 0) {
            com.jio.jioads.common.c c3 = c2;
            com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)c2;
            com.jio.jioads.controller.o o3 = f5.a;
            boolean bl2 = o3.o;
            if (bl2) {
                Object object5;
                int n10;
                boolean bl3 = o3.D;
                if (bl3) {
                    object = new StringBuilder();
                    j_0.j(this, (StringBuilder)object, string4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = f5.a;
                    ((com.jio.jioads.controller.o)object).E = n8;
                }
                object = new StringBuilder();
                String string6 = this.v();
                ((StringBuilder)object).append(string6);
                ((StringBuilder)object).append(string3);
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(", trying next in list if available");
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                n4 = this.w;
                if (n4 < n7) {
                    this.w = n4 += n8;
                    object = this.v();
                    object2 = Utility.INSTANCE;
                    object3 = this.v();
                    ((Utility)object2).getCcbValue((String)object3);
                    this.s((String)object);
                    return;
                }
                n7 = (int)(this.s ? 1 : 0);
                if (n7 == 0) return;
                if (object2 != null && (n10 = ((String)object2).length()) != 0 || object3 != null && (n10 = ((String)object3).length()) != 0) {
                    object2 = JioAdError.Companion;
                    object3 = JioAdError$JioAdErrorType.WRAPPER_NOFILL;
                    object5 = "Wrapper Ad not available";
                    object2 = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), (String)object5);
                } else {
                    object2 = JioAdError.Companion;
                    object3 = JioAdError$JioAdErrorType.ERROR_PARSING;
                    object5 = "redirect url empty";
                    object2 = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), (String)object5);
                }
                Object object6 = object2;
                n10 = (int)(this.G ? 1 : 0);
                if (n10 == 0) {
                    object5 = this.d;
                    if (object5 == null) return;
                    com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.b;
                    String string7 = "JioVastParsingHelper";
                    string5 = "redirect url/id is empty,inside fallback attempts exceeded";
                    string4 = "onParseFinish";
                    object5.b((JioAdError)object2, d2, string4, string7, string5);
                    return;
                }
                object2 = new StringBuilder();
                j_0.j(this, (StringBuilder)object2, ": returning from processEmptyAds");
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
        }
        object3 = this.b;
        if (object != null && (list = ((m)object).c) != null && (n4 = list.size()) == 0 && (jioAdView$AD_TYPE3 = object3.K()) == (jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (jioAdView$AdPodVariant3 = object3.L()) == (jioAdView$AdPodVariant2 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
            com.jio.jioads.common.c c5 = c2;
            com.jio.jioads.controller.f f6 = (com.jio.jioads.controller.f)c2;
            com.jio.jioads.controller.o o6 = f6.a;
            boolean bl4 = o6.D;
            if (bl4) {
                object = new StringBuilder();
                j_0.j(this, (StringBuilder)object, string4);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = new StringBuilder();
                object3 = ": pgm no fill in infinite so prepare next video";
                j_0.j(this, (StringBuilder)object2, (String)object3);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                f6.a.E = n8;
                object = Executors.newFixedThreadPool(n8);
                object2 = new l32(this, n7);
                object.submit((Runnable)object2);
                return;
            }
        }
        if (object != null && (object4 = ((m)object).c) != null && (n7 = object4.size()) == 0 && (object4 = object3.L()) != (jioAdView$AdPodVariant = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP) && (object4 = object3.K()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            object4 = c2;
            object4 = (com.jio.jioads.controller.f)c2;
            com.jio.jioads.controller.o o7 = ((com.jio.jioads.controller.f)object4).a;
            n4 = (int)(o7.D ? 1 : 0);
            if (n4 != 0) {
                object = new StringBuilder();
                j_0.j(this, (StringBuilder)object, string4);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = new StringBuilder();
                String string8 = this.v();
                ((StringBuilder)object2).append(string8);
                ((StringBuilder)object2).append(": pgm no fill in ");
                JioAdView$AdPodVariant jioAdView$AdPodVariant4 = object3.L();
                ((StringBuilder)object2).append((Object)jioAdView$AdPodVariant4);
                object2 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object2, string5);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = ((com.jio.jioads.controller.f)object4).a;
                ((com.jio.jioads.controller.o)object).E = n8;
                boolean bl5 = ((com.jio.jioads.controller.o)object).i0();
                if (bl5) {
                    object = this.v();
                    object2 = Utility.INSTANCE;
                    object3 = object3.P();
                    ((Utility)object2).getCcbValue((String)object3);
                    this.s((String)object);
                    return;
                }
                this.C();
                return;
            }
        }
        if (object != null && (object = ((m)object).c) != null && (n3 = object.size()) == 0 && (object = object3.K()) != (object4 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            object = c2;
            object = (com.jio.jioads.controller.f)c2;
            object4 = ((com.jio.jioads.controller.f)object).a;
            n7 = (int)(((com.jio.jioads.controller.o)object4).D ? 1 : 0);
            if (n7 != 0) {
                object2 = new StringBuilder();
                j_0.j(this, (StringBuilder)object2, string4);
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.NONE;
                object4 = new StringBuilder();
                String string9 = this.v();
                ((StringBuilder)object4).append(string9);
                String string10 = ": pgm no fill in";
                ((StringBuilder)object4).append(string10);
                object3 = object3.K();
                ((StringBuilder)object4).append(object3);
                object3 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object3, string5);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = ((com.jio.jioads.controller.f)object).a;
                ((com.jio.jioads.controller.o)object).E = n8;
                ((com.jio.jioads.controller.o)object).f();
                return;
            }
        }
        if ((object = this.E) != null && (object = ((m)object).c) != null && (n3 = object.isEmpty() ^ n8) == n8) {
            c2 = (com.jio.jioads.controller.f)c2;
            object = ((com.jio.jioads.controller.f)c2).a;
            n3 = (int)(((com.jio.jioads.controller.o)object).D ? 1 : 0);
            if (n3 != 0) {
                object = new StringBuilder();
                j_0.j(this, (StringBuilder)object, string4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = ((com.jio.jioads.controller.f)c2).a;
                ((com.jio.jioads.controller.o)object).E = n8;
            }
            object = new StringBuilder();
            object3 = this.v();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append((String)object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n3 = 0;
            object = null;
            this.n(false);
            return;
        }
        n3 = (int)(com.jio.jioads.util.i.l(c2) ? 1 : 0);
        if (n3 != 0) {
            com.jio.jioads.util.i.i = n3 = com.jio.jioads.util.i.i + n8;
        }
        object = JioAdError.Companion;
        object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
        object.getClass();
        JioAdError jioAdError = t_0.a((JioAdError$JioAdErrorType)((Object)object2));
        object4 = this.d;
        if (object4 == null) return;
        com.jio.jioads.cdnlogging.d d5 = com.jio.jioads.cdnlogging.d.b;
        string5 = "";
        string4 = "onParseFinish";
        String string11 = "JioVastParsingHelper";
        object4.b(jioAdError, d5, string4, string11, string5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(String object) {
        Exception exception2;
        com.jio.jioads.common.b b2;
        Object object2;
        block13: {
            Object object3;
            Object object4;
            Object object5;
            int n3;
            block12: {
                long l2;
                int n4;
                boolean bl2;
                int n7;
                Object object6;
                n3 = 1;
                object2 = "adpod-selection";
                object5 = "message";
                b2 = this.b;
                try {
                    JioAdView$AD_TYPE jioAdView$AD_TYPE;
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    object3 = ": checking if further ad selection needed";
                    ((StringBuilder)object4).append((String)object3);
                    object4 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    object4 = JioAds.Companion;
                    object3 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    object6 = ": adPodVariant: ";
                    ((StringBuilder)object3).append((String)object6);
                    object6 = b2.L();
                    ((StringBuilder)object3).append(object6);
                    object6 = ", leftoverAdDuration: ";
                    ((StringBuilder)object3).append((String)object6);
                    n7 = this.i;
                    ((StringBuilder)object3).append(n7);
                    object6 = " & leftoverAdCount: ";
                    ((StringBuilder)object3).append((String)object6);
                    n7 = this.g;
                    ((StringBuilder)object3).append(n7);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, (String)object5);
                    object3 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = b2.L();
                    object6 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                    bl2 = false;
                    int n8 = this.m;
                    if (object3 == object6 && ((n4 = this.i) > n8 || (n4 = this.g) > 0)) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    object6 = b2.L();
                    JioAdView$AdPodVariant jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE;
                    if (object6 == jioAdView$AdPodVariant && ((n7 = this.i) > n8 || (n7 = this.g) > 0 || n7 == (n8 = -100))) {
                        bl2 = true;
                    }
                    if (object == null || (n7 = (int)(this.s ? 1 : 0)) != 0 || (object6 = b2.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) break block12;
                }
                catch (Exception exception2) {}
                object6 = this.c;
                object6 = (com.jio.jioads.controller.f)object6;
                object6 = ((com.jio.jioads.controller.f)object6).a;
                n7 = (int)(((com.jio.jioads.controller.o)object6).o ? 1 : 0);
                if (n7 != 0 && (n4 != 0 || bl2)) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    object6 = ": continuing further selection >> ";
                    ((StringBuilder)object3).append((String)object6);
                    object6 = Thread.currentThread();
                    object6 = ((Thread)object6).getName();
                    ((StringBuilder)object3).append((String)object6);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, (String)object5);
                    object5 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    int n10 = this.t;
                    int n14 = 10;
                    l2 = n10 > n14 ? (long)15 : 0L;
                }
                break block12;
                break block13;
                object5 = Utility.INSTANCE;
                object5 = ((Utility)object5).getCcbValue((String)object);
                object6 = Thread.currentThread();
                object6 = ((Thread)object6).getName();
                n7 = (int)(Intrinsics.areEqual(object2, object6) ? 1 : 0);
                if (n7 != 0) {
                    Handler handler = this.J;
                    if (handler == null) return;
                    object2 = new k(this, (String)object, (String)object5);
                    handler.postDelayed((Runnable)object2, l2);
                    return;
                }
                object6 = new HandlerThread((String)object2);
                this.I = object6;
                Intrinsics.checkNotNull(object6);
                ((Thread)object6).start();
                object2 = this.I;
                Intrinsics.checkNotNull(object2);
                object2 = object2.getLooper();
                object6 = "getLooper(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                object6 = new Handler((Looper)object2);
                this.J = object6;
                Intrinsics.checkNotNull(object6);
                object2 = new ji3_1(this, n3, object, object5);
                object6.postDelayed((Runnable)object2, l2);
                return;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            object3 = ": further selection not needed >>";
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object2 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object == null) return;
            int n15 = ((String)object).length();
            if (n15 == 0) {
                return;
            }
            b2.L();
            object = this.E;
            if (object != null) {
                ((m)object).f = n3;
            }
            this.G();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object2 = b2.P();
        stringBuilder.append((String)object2);
        stringBuilder.append(": Exception in checkIfAdPodSelectionNeeded ");
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object2);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void r() {
        boolean bl2;
        Enum enum_;
        Object object;
        Object object2;
        boolean bl3 = this.K;
        if (!bl3 && ((object2 = ((com.jio.jioads.controller.f)this.c).a.G) == (object = JioAds$MediaType.ALL) || object2 == (object = JioAds$MediaType.VIDEO)) && (object = (object2 = this.b).k0()) != (enum_ = JioAdView$AdState.DESTROYED) && (bl2 = com.jio.jioads.utils.h.e((Context)(object = object2.Y()), (JioAds$MediaType)(enum_ = JioAds$MediaType.VIDEO)))) {
            this.K = bl2 = true;
            object = ": caching video ads";
            com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            bl3 = false;
            object2 = null;
            this.d(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(String object) {
        JioAdView$AdState jioAdView$AdState;
        Object object2 = "message";
        Object object3 = this.b;
        JioAdView$AdState jioAdView$AdState2 = object3.k0();
        if (jioAdView$AdState2 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            return;
        }
        int n3 = object3.f0();
        if (n3 != 0) return;
        try {
            JSONArray jSONArray;
            JSONArray jSONArray2;
            JioAdView$AdPodVariant jioAdView$AdPodVariant;
            JioAdView$AdPodVariant jioAdView$AdPodVariant2;
            int n4;
            JSONArray jSONArray3;
            int n7;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            object = ": mediation array size: ";
            stringBuilder.append((String)object);
            object = this.A;
            if (object != null) {
                n7 = object.length();
                object = n7;
            } else {
                n7 = 0;
                object = null;
            }
            stringBuilder.append(object);
            object = " & mediationCounter: ";
            stringBuilder.append((String)object);
            n7 = this.B;
            stringBuilder.append(n7);
            object = stringBuilder.toString();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = JioAds.Companion;
            JioAds jioAds = ((JioAds$Companion)object).getInstance();
            jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            JioAdView$AdPodVariant jioAdView$AdPodVariant3 = object3.L();
            JioAdView$AdPodVariant jioAdView$AdPodVariant4 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
            com.jio.jioads.common.c c2 = this.c;
            if (jioAdView$AdPodVariant3 == jioAdView$AdPodVariant4 && (jSONArray3 = this.A) != null) {
                com.jio.jioads.common.c c3 = c2;
                com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)c2;
                com.jio.jioads.controller.o o3 = f5.a;
                n4 = o3.B;
                if (n4 != 0) {
                    Intrinsics.checkNotNull(jSONArray3);
                    n7 = 0;
                    object = null;
                    object = jSONArray3.getJSONObject(0);
                    this.m((JSONObject)object);
                    return;
                }
            }
            if ((jioAdView$AdPodVariant2 = object3.L()) == (jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE) && (jSONArray2 = this.A) != null) {
                Intrinsics.checkNotNull(jSONArray2);
                n3 = jSONArray2.length();
                n4 = this.B;
                if (n3 > n4) {
                    object = this.A;
                    Intrinsics.checkNotNull(object);
                    int n8 = this.B;
                    object = object.getJSONObject(n8);
                    this.m((JSONObject)object);
                    return;
                }
            }
            if ((jSONArray = this.A) != null && (n3 = jSONArray.length()) == (n4 = this.B)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                String string2 = object3.P();
                stringBuilder2.append(string2);
                String string3 = ": Trying to get backup Ad";
                stringBuilder2.append(string3);
                String string4 = stringBuilder2.toString();
                Intrinsics.checkNotNullParameter(string4, (String)object2);
                JioAds jioAds2 = ((JioAds$Companion)object).getInstance();
                jioAds2.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                String string5 = "inside process backup....";
                Intrinsics.checkNotNullParameter(string5, (String)object2);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                c2 = (com.jio.jioads.controller.f)c2;
                object = ((com.jio.jioads.controller.f)c2).i();
                object = ((com.jio.jioads.common.a)object).c;
                if (object != null) {
                    object = ((com.jio.jioads.multiad.model.e)object).b;
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null) {
                    ((com.jio.jioads.multiad.model.c)object).a = null;
                }
                object = com.jio.jioads.multiad.N.a;
                object = object3.P();
                object2 = "adSpotId";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = com.jio.jioads.multiad.N.e;
                object3 = Boolean.TRUE;
                ((HashMap)object2).put(object, object3);
                this.H();
                return;
            }
            JioAdView$AdState jioAdView$AdState3 = object3.k0();
            if (jioAdView$AdState3 == jioAdView$AdState) return;
        }
        catch (Exception exception) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object3 = object3.P();
        stringBuilder.append((String)object3);
        object3 = ": Trying to get Production Ad";
        stringBuilder.append((String)object3);
        object3 = stringBuilder.toString();
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object = ((JioAds$Companion)object).getInstance();
        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.x();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t() {
        boolean bl2;
        this.G = bl2 = true;
        Object object = this.h;
        if (object != null) {
            com.jio.jioads.network.c c2 = ((com.jio.jioads.instreamads.wrapper.i)object).m;
            if (c2 != null) {
                c2.a();
            }
            ((com.jio.jioads.instreamads.wrapper.i)object).b = null;
        }
        try {
            object = this.c;
            object = (com.jio.jioads.controller.f)object;
            object = ((com.jio.jioads.controller.f)object).a;
            object = ((com.jio.jioads.controller.o)object).p;
            if (object != null) {
                ((JioMediationSelector)object).onDestroy();
            }
        }
        catch (Exception exception) {}
        try {
            object = this.I;
            if (object != null) {
                object.quit();
            }
        }
        catch (Exception exception) {}
        try {
            object = this.L;
            if (object != null && (object = ((com.jio.jioads.utils.l)object).k) != null) {
                object.shutdown();
            }
        }
        catch (Exception exception) {}
        this.B().b.clear();
        this.B().c.clear();
        this.B().d.clear();
        this.B().e.clear();
        object = this.F;
        if (object != null) {
            ((com.jio.jioads.network.c)object).a();
            this.F = null;
        }
    }

    /*
     * Exception decompiling
     */
    public final void u(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 1284->1288)] java.lang.Exception
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

    public final String v() {
        return (String)this.f.getValue();
    }

    public final void x() {
        Object object = new StringBuilder();
        Object object2 = this.b;
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, ": Inside getProductionAd leftoverAdDuration: ");
        int n3 = this.i;
        w12_0.b(n3, "message", (StringBuilder)object);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = object2.k0();
        Object object4 = JioAdView$AdState.DESTROYED;
        if (object3 == object4) {
            return;
        }
        if ((object2 = object2.Y()) == null) {
            return;
        }
        n3 = this.i;
        long l2 = n3;
        int n4 = this.g;
        e e2 = new e(this, (Context)object2);
        object2 = (com.jio.jioads.controller.f)this.c;
        object2.getClass();
        object3 = "multiAdResponse";
        Intrinsics.checkNotNullParameter(e2, (String)object3);
        object2 = ((com.jio.jioads.controller.f)object2).a;
        com.jio.jioads.common.a a2 = ((com.jio.jioads.controller.o)object2).S();
        object4 = ((com.jio.jioads.controller.o)object2).f;
        if (object4 != null) {
            boolean bl2 = ((com.jio.jioads.controller.o)object2).E;
            ((t)object4).d(a2, l2, n4, e2, bl2);
        } else {
            object3 = new StringBuilder();
            object2 = ((com.jio.jioads.controller.o)object2).a;
            object4 = ": multiAdUtility is not initialized";
            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object4, (JioAds$Companion)object);
        }
    }

    public final void y(String string2) {
        String string3;
        String string4;
        Object object;
        n n3 = this;
        Object object2 = new StringBuilder();
        com.jio.jioads.common.b b2 = this.b;
        l_0.d(b2, (StringBuilder)object2, ": Exception in onParseFinish.Exception: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = JioAdError.Companion;
        Object object3 = JioAdError$JioAdErrorType.ERROR_PARSING;
        Object object4 = "Error in parsing Vast Ad";
        object2 = j_0.c((t_0)object2, object3, (String)object4);
        Object object5 = this.d;
        if (object5 != null) {
            object = com.jio.jioads.cdnlogging.d.a;
            String string5 = "";
            string4 = "onAdError";
            string3 = "JioVastParsingHelper";
            object5.b((JioAdError)object2, (com.jio.jioads.cdnlogging.d)((Object)object), string4, string3, string5);
        }
        object4 = Utility.INSTANCE;
        Context context = b2.Y();
        String string6 = b2.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        object3 = (com.jio.jioads.controller.f)n3.c;
        object5 = ((com.jio.jioads.controller.f)object3).a.T();
        object = ((com.jio.jioads.controller.f)object3).a.a();
        string4 = b2.q0();
        string3 = ((JioAdError)object2).getErrorCode();
        ((Utility)object4).logError(context, string6, d2, "VAST parsing exception", string2, (com.jio.jioads.cdnlogging.a)object5, "onParseFinish", (Boolean)object, string4, string3, false);
    }

    public final int z() {
        long l2;
        long l3;
        long l4;
        long l7 = this.A();
        int n3 = (int)l7;
        int n4 = -1;
        int n7 = -100;
        if (n3 != n4 && (l4 = (l3 = (l7 = this.A()) - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            return n7;
        }
        com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)this.c;
        n4 = f5.k();
        Integer n8 = this.b.q();
        n3 = n8 != null ? n8 : -100;
        int n10 = 1;
        if (n10 <= n3 && n3 < n4) {
            return n3;
        }
        if (n4 > 0) {
            return n4;
        }
        if (n3 > 0) {
            return n3;
        }
        return n7;
    }
}

