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
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.s;
import com.jio.jioads.instreamads.wrapper.b;
import com.jio.jioads.instreamads.wrapper.d;
import com.jio.jioads.instreamads.wrapper.e;
import com.jio.jioads.instreamads.wrapper.i;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class c
implements NetworkTaskListener {
    public final /* synthetic */ i a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ j c;

    public c(i i3, Ref$ObjectRef ref$ObjectRef, j j3) {
        this.a = i3;
        this.b = ref$ObjectRef;
        this.c = j3;
    }

    public final void onError(int n3, Object object, Map map2) {
        Object object2;
        Object object3 = this.a;
        Object object4 = ((i)object3).c.k0();
        if (object4 == (object2 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object4 = new StringBuilder();
        object2 = ((i)object3).a();
        ((StringBuilder)object4).append((String)object2);
        object2 = ": error in wrapper responseCode: ";
        ((StringBuilder)object4).append((String)object2);
        ((StringBuilder)object4).append(n3);
        ((StringBuilder)object4).append(", error: ");
        ((StringBuilder)object4).append(object);
        ((StringBuilder)object4).append(", headers: ");
        ((StringBuilder)object4).append(map2);
        Object object5 = ((StringBuilder)object4).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object5, (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        object5 = ((i)object3).b;
        if (object5 != null) {
            object = com.jio.jioads.instreamads.wrapper.b.d;
            map2 = null;
            object3 = this.c;
            object5.b(null, (j)object3, (b)((Object)object));
        }
    }

    public final void onSuccess(String string2, Map map2) {
        int n3;
        Object object;
        Object object2 = this.a;
        Object object3 = ((i)object2).c.k0();
        if (object3 == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object3 = new StringBuilder();
        com.jio.jioads.common.b b2 = ((i)object2).c;
        j_0.n(b2, (StringBuilder)object3, ": download redirected ad onSuccess res for redirect Url: ");
        Object object4 = this.b;
        String string3 = (String)((Ref$ObjectRef)object4).element;
        ((StringBuilder)object3).append(string3);
        com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
        com.jio.jioads.util.j.d(String.valueOf(string2));
        object3 = this.c;
        string3 = null;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object5 = new StringBuilder();
            j_0.n(b2, object5, ": parsing wrapper response ");
            Object object6 = ((j)object3).h;
            object5.append((String)object6);
            com.jio.jioads.util.j.a(object5.toString());
            object5 = ((j)object3).h;
            if (object5 == null) {
                object5 = "";
            }
            CharSequence charSequence = object5;
            Object object7 = object4 = ((Ref$ObjectRef)object4).element;
            object7 = (String)object4;
            object4 = b2.k0();
            if (object4 != object) {
                object = b2.Y();
                object6 = new d((i)object2, (j)object3);
                String string4 = b2.P();
                object3 = Utility.INSTANCE;
                String string5 = ((Utility)object3).getAdvidFromPreferences((Context)object);
                ((Utility)object3).getUidFromPreferences((Context)object);
                object3 = b2.R();
                JioAdView$AdState jioAdView$AdState = object3 != null ? (object3 = ((JioAdsMetadata)object3).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object)) : null;
                b2.q0();
                o.o(((f)((i)object2).d).a, null, null, null);
                e e2 = new e((i)object2, (Context)object);
                object5 = object4;
                object4 = new s((com.jio.jioads.instreamads.vastparser.listener.b)object6, (String)object7, string4, string5, (Map)((Object)jioAdView$AdState), string2, e2);
                object3 = ((i)object2).n;
                object = ((i)object2).o;
                object2 = ((i)object2).p;
                ((s)object4).a((Integer)object2, (String)charSequence, (String)object3, (String)object);
            }
            return;
        }
        object = new StringBuilder();
        object4 = ((i)object2).a();
        ((StringBuilder)object).append((String)object4);
        object4 = ": empty response in wrapper";
        ((StringBuilder)object).append((String)object4);
        object = ((StringBuilder)object).toString();
        com.jio.jioads.util.j.a((String)object);
        object2 = ((i)object2).b;
        if (object2 != null) {
            object = com.jio.jioads.instreamads.wrapper.b.d;
            object2.b(null, (j)object3, (b)((Object)object));
        }
    }
}

