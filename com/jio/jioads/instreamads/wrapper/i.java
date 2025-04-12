/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instreamads.wrapper;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.wrapper.a;
import com.jio.jioads.instreamads.wrapper.b;
import com.jio.jioads.instreamads.wrapper.c;
import com.jio.jioads.instreamads.wrapper.g;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

public final class i {
    public final j a;
    public a b;
    public final com.jio.jioads.common.b c;
    public final com.jio.jioads.common.c d;
    public final hh3_2 e;
    public final HashMap f;
    public int g;
    public int h;
    public boolean i;
    public final hh3_2 j;
    public boolean k;
    public int l;
    public com.jio.jioads.network.c m;
    public String n;
    public String o;
    public Integer p;

    public i(j serializable, a a2, com.jio.jioads.common.b b2, com.jio.jioads.common.c c2) {
        int n3;
        Intrinsics.checkNotNullParameter(serializable, "wrapperVastAd");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        this.a = serializable;
        this.b = a2;
        this.c = b2;
        this.d = c2;
        serializable = yr1_2.b(com.jio.jioads.instreamads.wrapper.g.c);
        this.e = serializable;
        this.f = serializable = new Serializable();
        this.g = n3 = -1;
        this.h = n3;
        this.i = true;
        super(this, 1);
        serializable = yr1_2.b(serializable);
        this.j = serializable;
    }

    public final String a() {
        return (String)this.j.getValue();
    }

    public final void b(j object) {
        int n3;
        String[] stringArray;
        Object object2;
        Object object3 = this.c;
        Object object4 = object3.k0();
        if (object4 == (object2 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object4 = new Ref$ObjectRef();
        Object object5 = ((j)object).m;
        int n4 = 6;
        Object object6 = null;
        object5 = object5 != null && (object5 = ((q)object5).e) != null && (object5 = StringsKt.a0((CharSequence)object5, stringArray = new String[]{"||"}, false, 0, n4)) != null ? (String)object5.get(0) : null;
        ((Ref$ObjectRef)object4).element = object5;
        stringArray = new Object();
        Object object7 = object3.k0();
        int n7 = 1;
        String string2 = "";
        if (object7 != object2) {
            object2 = object3.Y();
            stringArray.p = object2;
            object7 = object3.P();
            stringArray.q = object7;
            stringArray.a = object5;
            object5 = Utility.INSTANCE;
            object7 = object3.P();
            object7 = ((Utility)object5).getCcbValue((String)object7);
            stringArray.b = object7;
            if (object2 != null) {
                Intrinsics.checkNotNullParameter(object2, "context");
                object7 = "common_prefs";
                String string3 = "advid";
                try {
                    object6 = j_0.d((Context)object2, (String)object7, 0, string2, string3);
                    object7 = "null cannot be cast to non-null type kotlin.String";
                }
                catch (Exception exception) {}
                Intrinsics.checkNotNull(object6, (String)object7);
                object6 = (String)object6;
            }
            object6 = null;
            stringArray.r = object6;
            object2 = ((Utility)object5).getUidFromPreferences((Context)object2);
            stringArray.s = object2;
            object2 = n7;
            stringArray.l = object2;
            object2 = Boolean.FALSE;
            stringArray.e = object2;
            stringArray.w = object6 = object3.q0();
            stringArray.m = object6 = Boolean.TRUE;
            stringArray.o = object2;
            stringArray.n = object2;
            object2 = object3.R();
            stringArray.t = object2;
            object3.L();
            object2 = object3.W();
            stringArray.F = object2;
            object2 = object3.K();
            stringArray.u = object2;
            object2 = this.h;
            stringArray.I = object2;
            n3 = this.g;
            object2 = n3;
            stringArray.J = object2;
            string2 = ((Utility)object5).replaceMacros((k)stringArray);
        }
        ((Ref$ObjectRef)object4).element = string2;
        n3 = string2.length();
        object5 = "message";
        if (n3 == 0) {
            object3 = new StringBuilder();
            object4 = this.a();
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(": empty wrapper redirection url for wrapper id: ");
            object = ((j)object).h;
            ir3_0.b((StringBuilder)object3, (String)object, (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        n3 = this.l;
        if (n3 == n4) {
            object3 = new StringBuilder();
            object4 = this.a();
            ((StringBuilder)object3).append((String)object4);
            object4 = ": wrapper redirection limit reached, considered limit: 6";
            ((StringBuilder)object3).append((String)object4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = this.d().c;
            boolean bl2 = object3 instanceof Collection;
            if (!bl2 || !(bl2 = ((Collection)object3).isEmpty())) {
                object3 = ((Iterable)object3).iterator();
                while (bl2 = object3.hasNext()) {
                    object4 = (j)object3.next();
                    if (object4 != null) {
                        object4 = ((j)object4).n;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    if (object4 == null) continue;
                    object = new StringBuilder();
                    object3 = this.a();
                    ((StringBuilder)object).append((String)object3);
                    object3 = ": inline is present in parsed model so giving onRedirectionFinish";
                    ((StringBuilder)object).append((String)object3);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object5);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = this.b;
                    if (object != null) {
                        object3 = this.d();
                        object.a((m)object3);
                    }
                    break;
                }
            } else {
                object3 = this.b;
                if (object3 != null) {
                    object4 = com.jio.jioads.instreamads.wrapper.b.b;
                    object3.b(null, (j)object, (b)((Object)object4));
                }
            }
            return;
        }
        if (n3 > 0) {
            object2 = new StringBuilder();
            String string4 = ((j)object).h;
            ((StringBuilder)object2).append(string4);
            string4 = "**";
            ((StringBuilder)object2).append(string4);
            n4 = this.l;
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
            ((j)object).h = object2;
        }
        this.l = n3 = this.l + n7;
        object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, ": trying wrapper redirected adId: ");
        object2 = ((j)object).h;
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(", url: ");
        object2 = (String)((Ref$ObjectRef)object4).element;
        ir3_0.b((StringBuilder)object3, (String)object2, (String)object5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.m;
        if (object3 != null) {
            object2 = new c(this, (Ref$ObjectRef)object4, (j)object);
            object = (String)((Ref$ObjectRef)object4).element;
            boolean bl3 = ((f)this.d).a.a();
            object4 = bl3;
            ((com.jio.jioads.network.c)object3).c((NetworkTaskListener)object2, (String)object, (Boolean)object4);
        }
    }

    public final void c(String object, String object2, Integer object3) {
        int n3;
        boolean bl2 = this.k;
        Object object4 = "message";
        if (bl2) {
            object = new StringBuilder();
            object2 = this.a();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": redirection is already on-going");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), object4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object5 = new StringBuilder();
        Object object6 = this.a();
        ((StringBuilder)object5).append((String)object6);
        ((StringBuilder)object5).append(": starting wrapper redirection");
        Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), object4);
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object6 = JioAds$LogLevel.NONE;
        object6 = this.a;
        Object object7 = ((j)object6).m;
        String string2 = null;
        if (object7 != null) {
            object7 = ((q)object7).e;
        } else {
            n3 = 0;
            object7 = null;
        }
        if (object7 != null && (n3 = ((String)object7).length()) != 0) {
            boolean bl3;
            object5 = this.c;
            object4 = object5.k0();
            if (object4 == (object7 = JioAdView$AdState.DESTROYED)) {
                return;
            }
            object5 = object5.Y();
            object4 = new com.jio.jioads.network.c((Context)object5);
            this.m = object4;
            this.n = object;
            this.o = object2;
            this.p = object3;
            this.k = bl3 = true;
            object = this.f;
            object2 = ((j)object6).h;
            object3 = ((j)object6).m;
            if (object3 != null) {
                string2 = ((q)object3).e;
            }
            ((HashMap)object).put(object2, string2);
            this.b((j)object6);
            return;
        }
        object = new StringBuilder();
        object2 = this.a();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": null or empty redirection url for wrapper id: ");
        object2 = ((j)object6).h;
        d90_0.b((StringBuilder)object, object2, object4, (JioAds$Companion)object5);
        object = this.b;
        if (object != null) {
            object2 = com.jio.jioads.instreamads.wrapper.b.a;
            object.b(null, (j)object6, (b)((Object)object2));
        }
    }

    public final m d() {
        return (m)this.e.getValue();
    }
}

