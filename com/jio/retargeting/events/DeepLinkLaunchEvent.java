/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.jio.retargeting.events;

import android.net.Uri;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.j;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.events.a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class DeepLinkLaunchEvent
extends a {
    private AtomicReference deeplinkUrl;
    private AtomicReference referrerApp;

    public DeepLinkLaunchEvent(Uri object) {
        AtomicReference atomicReference;
        this.deeplinkUrl = atomicReference = new AtomicReference();
        this.referrerApp = atomicReference = new AtomicReference();
        atomicReference = this.deeplinkUrl;
        if (atomicReference == null) {
            j.b("Argument deeplinkUrl must not be null");
            return;
        }
        object = object.toString();
        atomicReference.set(object);
    }

    public DeepLinkLaunchEvent(DeepLinkLaunchEvent object) {
        super((a)object);
        AtomicReference atomicReference;
        this.deeplinkUrl = atomicReference = new AtomicReference();
        this.referrerApp = atomicReference = new AtomicReference();
        atomicReference = this.deeplinkUrl;
        String string2 = ((DeepLinkLaunchEvent)object).getDeeplinkUrl();
        atomicReference.set(string2);
        atomicReference = this.referrerApp;
        object = ((DeepLinkLaunchEvent)object).getReferrerApp();
        atomicReference.set(object);
    }

    public DeepLinkLaunchEvent(String string2) {
        AtomicReference atomicReference;
        this.deeplinkUrl = atomicReference = new AtomicReference();
        this.referrerApp = atomicReference = new AtomicReference();
        atomicReference = this.deeplinkUrl;
        if (atomicReference == null) {
            j.b("Argument deeplinkUrl must not be null");
            return;
        }
        atomicReference.set(string2);
    }

    public DeepLinkLaunchEvent(String string2, String string3) {
        AtomicReference atomicReference;
        this.deeplinkUrl = atomicReference = new AtomicReference();
        this.referrerApp = atomicReference = new AtomicReference();
        atomicReference = this.deeplinkUrl;
        if (atomicReference == null) {
            j.b("Argument deeplinkUrl must not be null");
            return;
        }
        atomicReference.set(string2);
        this.referrerApp.set(string3);
    }

    public String getDeeplinkUrl() {
        return (String)this.deeplinkUrl.get();
    }

    public String getReferrerApp() {
        return (String)this.referrerApp.get();
    }

    public boolean isFirstLaunch() {
        RetargetPref retargetPref = RetargetPref.INSTANCE;
        int n3 = retargetPref.isFirstLaunch();
        if (n3 == 0) {
            return retargetPref.editSharedPref("firstLaunch", 1);
        }
        return false;
    }

    public void setReferrerApp(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument referrerApp must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.referrerApp.set(object);
    }
}

