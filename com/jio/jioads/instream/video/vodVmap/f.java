/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.vodVmap.d;
import com.jio.jioads.instream.video.vodVmap.e;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.instreamads.vastparser.s;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements NetworkTaskListener {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ HashMap e;
    public final /* synthetic */ List f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    public f(m m2, String string2, String string3, Context context, HashMap hashMap, List list, int n3, String string4) {
        this.a = m2;
        this.b = string2;
        this.c = string3;
        this.d = context;
        this.e = hashMap;
        this.f = list;
        this.g = n3;
        this.h = string4;
    }

    public final void onError(int n3, Object object, Map object2) {
        int n4;
        int n7;
        object = new StringBuilder("vmap: Redirection for id ");
        object2 = this.b;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" resulted in error - ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" for adTagUrl- ");
        Object object3 = this.c;
        Object object4 = "message";
        ir3_0.b((StringBuilder)object, (String)object3, (String)object4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.a;
        object = ((m)object3).q;
        if (object != null && (n7 = (int)(object.containsKey(object2) ? 1 : 0)) == (n4 = 1)) {
            object = ((m)object3).q;
            Intrinsics.checkNotNull(object);
            object.remove(object2);
        }
        n7 = this.g;
        object2 = this.h;
        object4 = this.f;
        ((m)object3).g((String)object2, n7, (List)object4);
    }

    public final void onSuccess(String string2, Map map2) {
        int n3;
        Object object;
        int n4;
        f f5 = this;
        m m2 = this.a;
        Object object2 = m2.q;
        if (object2 != null && (n4 = (int)(object2.containsKey(object = this.b) ? 1 : 0)) == (n3 = 1)) {
            object2 = m2.q;
            Intrinsics.checkNotNull(object2);
            object2.remove(object);
        }
        if (string2 != null && (n4 = string2.length()) != 0) {
            String string3;
            d d2;
            object2 = map2;
            m2.s = map2;
            object = f5.f;
            int n7 = f5.g;
            String string4 = f5.h;
            String string5 = f5.b;
            String string6 = f5.c;
            object2 = d2;
            Object object3 = m2;
            d2 = new d((List)object, m2, n7, string4, string5, string6);
            object2 = m2.a;
            String string7 = object2.P();
            object = Utility.INSTANCE;
            object3 = f5.d;
            String string8 = ((Utility)object).getAdvidFromPreferences((Context)object3);
            ((Utility)object).getUidFromPreferences((Context)object3);
            Map map3 = fh1_2.o(f5.e);
            object2.q0();
            object2 = m2.c.a;
            object = null;
            o.o((o)object2, null, null, null);
            object2 = new e(m2, (Context)object3);
            s s7 = string3;
            object3 = string3;
            string3 = string2;
            s7(d2, string6, string7, string8, map3, string2, (Function1)object2);
            s7.a(null, null, null, null);
        } else {
            Intrinsics.checkNotNullParameter("vmap: redirection response empty", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = f5.h;
            object = f5.f;
            n3 = f5.g;
            m2.g((String)object2, n3, (List)object);
        }
    }
}

