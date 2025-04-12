/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.instreamads.vastparser.model.j;
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

public final class e
extends Lambda
implements Function1 {
    public final /* synthetic */ m c;
    public final /* synthetic */ Context d;

    public e(m m2, Context context) {
        this.c = m2;
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
        Object object4 = "";
        Context context = this.d;
        m m2 = this.c;
        if (bl2) {
            bl2 = m2.c.a.a();
            object3 = bl2;
            u u3 = new u((Boolean)object3);
            com.jio.jioads.instreamads.vastparser.model.m m3 = ((q)object2).a;
            object2 = m2.a;
            String string2 = object2.P();
            object3 = Utility.INSTANCE;
            String string3 = ((Utility)object3).getAdvidFromPreferences(context);
            Object object5 = string3 == null ? object4 : string3;
            String string4 = ((Utility)object3).getUidFromPreferences(context);
            object3 = object2.R();
            Object object6 = object3 != null ? (object3 = ((JioAdsMetadata)object3).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
            String string5 = object2.q0();
            object3 = m2.c;
            object4 = ((f)object3).a;
            o.o((o)object4, null, null, null);
            JioAdView$AD_TYPE jioAdView$AD_TYPE = object2.K();
            int n3 = object2.w();
            object2 = ((f)object3).a;
            a a2 = ((o)object2).T();
            string3 = e2.d;
            u3.b((Context)string3, m3, string2, (String)object5, string4, (HashMap)object6, string5, jioAdView$AD_TYPE, n3, a2);
        } else {
            bl2 = object2 instanceof com.jio.jioads.instreamads.vastparser.o;
            if (bl2) {
                bl2 = m2.c.a.a();
                object3 = bl2;
                u u4 = new u((Boolean)object3);
                j j3 = ((com.jio.jioads.instreamads.vastparser.o)object2).a;
                object2 = m2.a;
                String string6 = object2.P();
                object3 = Utility.INSTANCE;
                String string7 = ((Utility)object3).getAdvidFromPreferences(context);
                Object object7 = string7 == null ? object4 : string7;
                String string8 = ((Utility)object3).getUidFromPreferences(context);
                object3 = object2.R();
                Object object8 = object3 != null ? (object3 = ((JioAdsMetadata)object3).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context)) : null;
                String string9 = object2.q0();
                object3 = m2.c;
                object4 = ((f)object3).a;
                o.o((o)object4, null, null, null);
                JioAdView$AD_TYPE jioAdView$AD_TYPE = object2.K();
                int n4 = object2.w();
                object2 = ((f)object3).a;
                a a3 = ((o)object2).T();
                string7 = e2.d;
                u4.a((Context)string7, j3, string6, (String)object7, string8, (HashMap)object8, string9, jioAdView$AD_TYPE, n4, a3);
            } else {
                boolean cfr_ignored_0 = object2 instanceof p;
            }
        }
        return Unit.a;
    }
}

