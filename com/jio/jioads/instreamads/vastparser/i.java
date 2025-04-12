/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instreamads.vastparser;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.instreamads.vastparser.o;
import com.jio.jioads.instreamads.vastparser.p;
import com.jio.jioads.instreamads.vastparser.q;
import com.jio.jioads.instreamads.vastparser.r;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.u;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i
extends Lambda
implements Function1 {
    public final /* synthetic */ n c;
    public final /* synthetic */ Context d;

    public i(n n3, Context context) {
        this.c = n3;
        this.d = context;
        super(1);
    }

    public final Object invoke(Object object) {
        i i3 = this;
        Object object2 = object;
        object2 = (r)object;
        Object object3 = "model";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object2 instanceof q;
        String string2 = "";
        Context context = this.d;
        n n3 = this.c;
        if (bl2) {
            bl2 = ((f)n3.c).a.a();
            object3 = bl2;
            u u3 = new u((Boolean)object3);
            m m2 = ((q)object2).a;
            String string3 = n3.b.P();
            object2 = Utility.INSTANCE;
            object3 = ((Utility)object2).getAdvidFromPreferences(context);
            Object object4 = object3 == null ? string2 : object3;
            String string4 = ((Utility)object2).getUidFromPreferences(context);
            object2 = n3.b.R();
            Object object5 = object2 != null ? (object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
            String string5 = n3.b.q0();
            com.jio.jioads.controller.o.o(((f)n3.c).a, null, null, null);
            JioAdView$AD_TYPE jioAdView$AD_TYPE = n3.b.K();
            int n4 = n3.b.w();
            object2 = ((f)n3.c).a;
            a a2 = ((com.jio.jioads.controller.o)object2).T();
            Context context2 = i3.d;
            u3.b(context2, m2, string3, (String)object4, string4, (HashMap)object5, string5, jioAdView$AD_TYPE, n4, a2);
        } else {
            bl2 = object2 instanceof o;
            if (bl2) {
                bl2 = ((f)n3.c).a.a();
                object3 = bl2;
                u u4 = new u((Boolean)object3);
                j j3 = ((o)object2).a;
                String string6 = n3.b.P();
                object2 = Utility.INSTANCE;
                object3 = ((Utility)object2).getAdvidFromPreferences(context);
                Object object6 = object3 == null ? string2 : object3;
                String string7 = ((Utility)object2).getUidFromPreferences(context);
                object2 = n3.b.R();
                Object object7 = object2 != null ? (object2 = ((JioAdsMetadata)object2).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
                String string8 = n3.b.q0();
                com.jio.jioads.controller.o.o(((f)n3.c).a, null, null, null);
                JioAdView$AD_TYPE jioAdView$AD_TYPE = n3.b.K();
                int n7 = n3.b.w();
                object2 = ((f)n3.c).a;
                a a3 = ((com.jio.jioads.controller.o)object2).T();
                Context context3 = i3.d;
                u4.a(context3, j3, string6, (String)object6, string7, (HashMap)object7, string8, jioAdView$AD_TYPE, n7, a3);
            } else {
                boolean cfr_ignored_0 = object2 instanceof p;
            }
        }
        return Unit.a;
    }
}

