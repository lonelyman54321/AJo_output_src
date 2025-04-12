/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.audio;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.e;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements e {
    public final /* synthetic */ j a;

    public d(j j3) {
        this.a = j3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a() {
        JioAdView$AdState jioAdView$AdState;
        Object object = this.a;
        JioAdView$AdState jioAdView$AdState2 = ((j)object).b.k0();
        if (jioAdView$AdState2 != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            void var2_14;
            Object object2;
            void var2_5;
            Object object3;
            m m2 = ((j)object).d;
            n n3 = m2.a;
            if (n3 != null) {
                object3 = ((j)object).o();
                ArrayList arrayList = CollectionsKt.m0(n3.e(m2, (String)object3));
            } else {
                ArrayList arrayList = new ArrayList();
            }
            void var5_22 = var2_5;
            StringBuilder stringBuilder = new StringBuilder();
            j_0.n(((j)object).b, stringBuilder, ": CLICKED fired for adId: ");
            String string2 = ((j)object).o();
            stringBuilder.append(string2);
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            Object object4 = object2 = ((j)object).z.getValue();
            JioEventTracker jioEventTracker = (JioEventTracker)object2;
            object3 = JioEventTracker$TrackingEvents.EVENT_CLICK;
            Integer n4 = 1;
            String string3 = ((j)object).o();
            Object object5 = ((j)object).p();
            Object object6 = ((j)object).c;
            c c2 = object6;
            c2 = (f)object6;
            object6 = ((f)c2).a;
            Map map2 = ((j)object).e;
            String string4 = o.o((o)object6, string3, (String)object5, map2);
            boolean bl2 = ((f)c2).a.a();
            int n7 = ((f)c2).a.k;
            String string5 = ((j)object).M;
            object5 = ((j)object).b;
            object6 = null;
            boolean bl3 = true;
            boolean bl4 = true;
            c c3 = c2;
            c2 = null;
            int n8 = 229376;
            JioEventTracker.fireEvents$default(jioEventTracker, (JioEventTracker$TrackingEvents)((Object)object3), (b)object5, (List)var5_22, n4, null, bl3, false, string4, bl4, null, null, null, bl2, n7, string5, null, null, null, n8, null);
            String string6 = ((j)object).p();
            if (string6 == null) {
                String string7 = "";
            }
            c3.getClass();
            Intrinsics.checkNotNullParameter(var2_14, "campaignid");
            String string8 = "c";
            Intrinsics.checkNotNullParameter(string8, "type");
            object6 = c3;
            object3 = ((f)c3).a;
            ((o)object3).v((String)var2_14, string8);
            object = (V)((j)object).a;
            ((V)object).a();
        }
    }

    public final void b() {
    }
}

