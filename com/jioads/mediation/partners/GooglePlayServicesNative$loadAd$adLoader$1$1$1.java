/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks;
import com.jioads.mediation.partners.JioMediationListener;

public final class GooglePlayServicesNative$loadAd$adLoader$1$1$1
extends VideoController$VideoLifecycleCallbacks {
    public final /* synthetic */ JioMediationListener a;

    public GooglePlayServicesNative$loadAd$adLoader$1$1$1(JioMediationListener jioMediationListener) {
        this.a = jioMediationListener;
    }

    public final void onVideoEnd() {
        super.onVideoEnd();
        JioMediationListener jioMediationListener = this.a;
        if (jioMediationListener != null) {
            boolean bl2 = true;
            jioMediationListener.onVideoAdEnd(bl2);
        }
    }

    public final void onVideoStart() {
        super.onVideoStart();
        JioMediationListener jioMediationListener = this.a;
        if (jioMediationListener != null) {
            jioMediationListener.onAdMediaStart();
        }
    }
}

