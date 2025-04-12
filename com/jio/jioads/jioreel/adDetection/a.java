/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.jioreel.adDetection;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.iab.b;
import com.jio.jioads.iab.f;
import com.jio.jioads.iab.h;
import com.jio.jioads.jioreel.adDetection.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class a
implements Runnable {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c c2) {
        this.a = c2;
    }

    public final void run() {
        Object object = "this$0";
        c c2 = this.a;
        Intrinsics.checkNotNullParameter(c2, (String)object);
        boolean bl2 = c2.v;
        if (bl2 && (object = c2.h) == null) {
            Object object2 = c2.a;
            f f5 = null;
            c2.h = object = new b((Context)object2, null);
            boolean bl3 = ((b)object).c;
            if (bl3 && (object = ((b)object).d) != null) {
                Intrinsics.checkNotNullParameter("Creating OMID ad session for SSAI", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = new Ref$ObjectRef();
                f5 = new f((h)object, (Ref$ObjectRef)object2);
                object2 = "omid_js";
                object = ((h)object).a;
                l_0.g((String)object2, (Context)object, f5);
            }
            object = c2.h;
            Intrinsics.checkNotNull(object);
            object2 = "omHelper";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            c2.h = object;
        }
    }
}

