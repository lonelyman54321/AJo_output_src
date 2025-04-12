/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class y
implements q_0 {
    public final /* synthetic */ s a;

    public y(s s7) {
        this.a = s7;
    }

    public final void b(List list) {
        Object object;
        Object object2 = list;
        if (list == null) {
            return;
        }
        Object object3 = new StringBuilder();
        s s7 = this.a;
        l_0.e(s7, (StringBuilder)object3, ": Firing Companion Click tracking");
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(s7, (StringBuilder)object4, ": EVENT_CLICK fired  Companion Click tracking adId: ");
        Object object5 = s7.T();
        ((StringBuilder)object4).append((String)object5);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = object3 = s7.C.getValue();
        object4 = (JioEventTracker)object3;
        object5 = JioEventTracker$TrackingEvents.EVENT_CLICK;
        int n3 = yx_2.o(list, 10);
        object3 = new ArrayList(n3);
        object2 = list.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = ((a)object2.next()).a;
            ((ArrayList)object3).add(object);
        }
        ArrayList arrayList = CollectionsKt.m0(object3);
        int n4 = s7.P;
        String string2 = s7.l;
        boolean bl2 = ((f)s7.e).a.a();
        object3 = s7.m;
        Integer n7 = n4;
        object = s7.d;
        JioEventTracker.fireEvents$default((JioEventTracker)object4, (JioEventTracker$TrackingEvents)((Object)object5), (b)object, arrayList, n7, null, true, false, "", true, null, null, null, bl2, 10, string2, null, (String)object3, null, 163840, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(List list) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        if (list != null) {
            int n3;
            object5 = new ArrayList();
            object4 = list.iterator();
            while ((n3 = object4.hasNext()) != 0) {
                boolean bl2;
                Object t3 = object4.next();
                object3 = t3;
                object3 = (i)t3;
                object2 = ((i)object3).a;
                object = "creativeView";
                boolean bl3 = true;
                boolean bl4 = kotlin.text.b.i((String)object2, (String)object, bl3);
                if (!bl4 && !(bl2 = kotlin.text.b.i((String)(object3 = ((i)object3).a), (String)(object2 = "impression"), bl3))) continue;
                ((ArrayList)object5).add(t3);
            }
            n3 = yx_2.o(object5, 10);
            object4 = new ArrayList(n3);
            object5 = ((ArrayList)object5).iterator();
            while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                String string2 = ((i)object5.next()).b;
                ((ArrayList)object4).add(string2);
            }
            object5 = CollectionsKt.m0(object4);
        } else {
            object5 = new ArrayList();
        }
        object2 = object5;
        object5 = new StringBuilder();
        object4 = this;
        object3 = this.a;
        l_0.e(object3, object5, ": Firing Companion Impression");
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        StringBuilder stringBuilder = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.d(object3, stringBuilder, ": EVENT_IMPRESSION:: - fired for adId: ");
        object = ((s)object3).T();
        stringBuilder.append((String)object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = (JioEventTracker)((s)object3).C.getValue();
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
        int n4 = ((s)object3).P;
        boolean bl5 = ((f)((s)object3).e).a.a();
        String string3 = ((s)object3).l;
        String string4 = ((s)object3).m;
        object = n4;
        object3 = ((s)object3).d;
        object4 = object5;
        JioEventTracker.fireEvents$default((JioEventTracker)object5, jioEventTracker$TrackingEvents, (b)object3, (List)object2, (Integer)object, null, true, false, "", false, null, null, null, bl5, 10, string3, null, string4, null, 163840, null);
    }
}

