/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.events.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class CustomDataEvent
extends a {
    private AtomicReference customData;

    public CustomDataEvent() {
        AtomicReference atomicReference;
        this.customData = atomicReference = new AtomicReference();
    }

    public CustomDataEvent(CustomDataEvent object) {
        super((a)object);
        AtomicReference atomicReference;
        this.customData = atomicReference = new AtomicReference();
        object = ((CustomDataEvent)object).getCustomData();
        this.setCustomData((HashMap)object);
    }

    public HashMap getCustomData() {
        return (HashMap)this.customData.get();
    }

    public void setCustomData(HashMap object) {
        Object object2 = "message";
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument customData must not be null", object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("CustomData:");
        stringBuilder.append(object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.customData.set(object);
    }
}

