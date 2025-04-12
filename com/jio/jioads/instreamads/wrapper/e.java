/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instreamads.wrapper;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.p;
import com.jio.jioads.instreamads.vastparser.q;
import com.jio.jioads.instreamads.vastparser.r;
import com.jio.jioads.instreamads.wrapper.i;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.u;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e
extends Lambda
implements Function1 {
    public final /* synthetic */ i c;
    public final /* synthetic */ Context d;

    public e(i i3, Context context) {
        this.c = i3;
        this.d = context;
        super(1);
    }

    public final Object invoke(Object object) {
        e e2 = this;
        Object object2 = object;
        object2 = (r)object;
        Object object3 = "model";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object2 instanceof q;
        String string2 = "";
        Context context = this.d;
        i i3 = this.c;
        if (bl2) {
            bl2 = ((f)i3.d).a.a();
            object3 = bl2;
            u u3 = new u((Boolean)object3);
            m m2 = ((q)object2).a;
            String string3 = i3.c.P();
            object2 = Utility.INSTANCE;
            object3 = ((Utility)object2).getAdvidFromPreferences(context);
            Object object4 = object3 == null ? string2 : object3;
            String string4 = ((Utility)object2).getUidFromPreferences(context);
            object2 = i3.c.R();
            Object object5 = object2 != null ? (object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
            String string5 = i3.c.q0();
            o.o(((f)i3.d).a, null, null, null);
            JioAdView$AD_TYPE jioAdView$AD_TYPE = i3.c.K();
            int n3 = i3.c.w();
            object2 = ((f)i3.d).a;
            a a2 = ((o)object2).T();
            Context context2 = e2.d;
            u3.b(context2, m2, string3, (String)object4, string4, (HashMap)object5, string5, jioAdView$AD_TYPE, n3, a2);
        } else {
            bl2 = object2 instanceof com.jio.jioads.instreamads.vastparser.o;
            if (bl2) {
                bl2 = ((f)i3.d).a.a();
                object3 = bl2;
                u u4 = new u((Boolean)object3);
                j j3 = ((com.jio.jioads.instreamads.vastparser.o)object2).a;
                String string6 = i3.c.P();
                object2 = Utility.INSTANCE;
                object3 = ((Utility)object2).getAdvidFromPreferences(context);
                Object object6 = object3 == null ? string2 : object3;
                String string7 = ((Utility)object2).getUidFromPreferences(context);
                object2 = i3.c.R();
                Object object7 = object2 != null ? (object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
                String string8 = i3.c.q0();
                o.o(((f)i3.d).a, null, null, null);
                JioAdView$AD_TYPE jioAdView$AD_TYPE = i3.c.K();
                int n4 = i3.c.w();
                object2 = ((f)i3.d).a;
                a a3 = ((o)object2).T();
                Context context3 = e2.d;
                u4.a(context3, j3, string6, (String)object6, string7, (HashMap)object7, string8, jioAdView$AD_TYPE, n4, a3);
            } else {
                boolean cfr_ignored_0 = object2 instanceof p;
            }
        }
        return Unit.a;
    }
}

