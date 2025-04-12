/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video.vodVmap;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.instreamads.vastparser.listener.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements b {
    public final /* synthetic */ List a;
    public final /* synthetic */ m b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public d(List list, m m2, int n3, String string2, String string3, String string4) {
        this.a = list;
        this.b = m2;
        this.c = n3;
        this.d = string2;
        this.e = string3;
        this.f = string4;
    }

    public final void a(com.jio.jioads.instreamads.vastparser.model.m m2, String string2, String object) {
        object = new StringBuilder("vmap: process Vast Model called from finish parse adSource ");
        Object object2 = this.a;
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        if (m2 != null) {
            object = "vmap";
            m2.h((String)object);
        }
        String string3 = this.d;
        object2 = this.b;
        List list = this.a;
        int n3 = this.c;
        ((m)object2).d(0, list, n3, m2, string2, string3);
    }

    public final void a(String object) {
        CharSequence charSequence = new StringBuilder("vmap: Redirection for id ");
        Object object2 = this.e;
        X50.a(charSequence, (String)object2, " resulted in parse error - ", object, " for adTagUrl- ");
        object = this.f;
        ir3_0.b(charSequence, object, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        int n3 = this.c;
        charSequence = this.d;
        object2 = this.b;
        List list = this.a;
        ((m)object2).g((String)charSequence, n3, list);
    }
}

