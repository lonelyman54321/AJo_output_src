/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.common;

import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.common.j;
import com.jio.jioads.common.l;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ int b;

    public /* synthetic */ k(j j3, int n3) {
        this.a = j3;
        this.b = n3;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new StringBuilder();
        Object object3 = ((j)((Object)object)).a.P();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(" onWindowVisibilityChanged()-->");
        int n3 = this.b;
        Object object4 = "message";
        w12_0.b(n3, (String)object4, (StringBuilder)object2);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = Utility.INSTANCE;
        int n4 = 5;
        n3 = (int)(((Utility)object3).checkVisibility((ViewGroup)object, n4) ? 1 : 0);
        if (n3 != 0) {
            object3 = new StringBuilder();
            object4 = ((j)((Object)object)).a;
            String string2 = ": onResume() of JioAdLayout";
            l.a((b)object4, (StringBuilder)object3, string2, (JioAds$Companion)object2);
            object = ((j)((Object)object)).f;
            if (object != null) {
                object.a();
            }
        } else {
            object3 = new StringBuilder();
            object4 = ((j)((Object)object)).a;
            String string3 = ": onPause() of JioAdLayout";
            l.a((b)object4, (StringBuilder)object3, string3, (JioAds$Companion)object2);
            object = ((j)((Object)object)).f;
            if (object != null) {
                object.c();
            }
        }
    }
}

