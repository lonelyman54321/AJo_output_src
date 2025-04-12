/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.native;

import com.jio.jioads.native.NativeAdController;
import com.jioads.mediation.JioAdsMediationCallback;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class NativeAdController$mediationListener$1
implements JioAdsMediationCallback {
    public final /* synthetic */ NativeAdController a;

    public NativeAdController$mediationListener$1(NativeAdController nativeAdController) {
        this.a = nativeAdController;
    }

    public final void addMediationUrl(String string2, JioMediationVideoController jioMediationVideoController, int n3, int n4, Integer n7, Integer n8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(jioMediationVideoController, "jioMediationVideoController");
    }

    public final int getCurrentPosition() {
        return 0;
    }

    public final int getVideoAdDuration() {
        return 0;
    }

    public final int getVolume() {
        return 0;
    }

    public final void mediationData(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "nativejson");
        object = object.toString();
        NativeAdController nativeAdController = this.a;
        HashMap hashMap = NativeAdController.access$getResponseHeaders(nativeAdController);
        nativeAdController.onAdDataUpdate((String)object, hashMap);
    }

    public final void onLoadAdCalledForVideoMediationIMA() {
    }

    public final void pauseAdFromMediation(boolean bl2) {
    }

    public final void resumeAdFromMediation(boolean bl2) {
    }

    public final void stopAds(boolean bl2) {
    }
}

