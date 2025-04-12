/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.d;
import com.jio.jioads.controller.g;
import com.jio.jioads.controller.o;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements com.jio.jioads.common.g {
    public final /* synthetic */ o a;

    public h(o o3) {
        this.a = o3;
    }

    public final void a() {
        Object object;
        Object object2 = new StringBuilder();
        o o3 = this.a;
        Object object3 = o3.a;
        Object object4 = ": onResume from viewport, publisher's prev state: ";
        j_0.n(object3, (StringBuilder)object2, (String)object4);
        object3 = o3.S;
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = o3.S;
        int n3 = -1;
        if (object2 == null) {
            object = -1;
        } else {
            object4 = g.$EnumSwitchMapping$0;
            object = ((Enum)object2).ordinal();
            object = object4[object];
        }
        if (object == n3 && (object2 = o3.r) != null) {
            o3 = null;
            n3 = 0;
            object3 = null;
            int n4 = 1;
            d.resumeAd$default((d)object2, false, n4, null);
        }
    }

    public final void b() {
        d d2 = this.a.r;
        if (d2 != null) {
            d2.notifyAdContainerSizeChange();
        }
    }

    public final void c() {
        Object object;
        Object object2 = new StringBuilder();
        o o3 = this.a;
        Object object3 = o3.a;
        Object object4 = ": onPause from viewport, publisher's prev state: ";
        j_0.n(object3, (StringBuilder)object2, (String)object4);
        object3 = o3.S;
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = o3.S;
        int n3 = -1;
        if (object2 == null) {
            object = -1;
        } else {
            object4 = g.$EnumSwitchMapping$0;
            object = ((Enum)object2).ordinal();
            object = object4[object];
        }
        int n4 = 1;
        if (object != n3) {
            n3 = 2;
            if (object == n3) {
                o3.S = null;
                object2 = o3.r;
                if (object2 != null) {
                    d.pauseAd$default((d)object2, false, n4, null);
                }
            }
        } else {
            object2 = o3.r;
            if (object2 != null) {
                d.pauseAd$default((d)object2, false, n4, null);
            }
        }
    }
}

