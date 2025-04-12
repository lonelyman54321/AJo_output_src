/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.events.a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public class PageViewEvent
extends a {
    private AtomicReference endTime;
    private AtomicReference pageName;
    private AtomicReference startTime;

    public PageViewEvent() {
        AtomicReference atomicReference;
        this.pageName = atomicReference = new AtomicReference();
        this.startTime = atomicReference = new AtomicReference();
        this.endTime = atomicReference = new AtomicReference();
    }

    public PageViewEvent(PageViewEvent object) {
        super((a)object);
        AtomicReference atomicReference;
        this.pageName = atomicReference = new AtomicReference();
        this.startTime = atomicReference = new AtomicReference();
        this.endTime = atomicReference = new AtomicReference();
        atomicReference = this.pageName;
        String string2 = ((PageViewEvent)object).getPageName();
        atomicReference.set(string2);
        atomicReference = this.startTime;
        string2 = ((PageViewEvent)object).getStartTime();
        atomicReference.set(string2);
        atomicReference = this.endTime;
        object = ((PageViewEvent)object).getEndTime();
        atomicReference.set(object);
    }

    public PageViewEvent(String string2, String string3, String string4) {
        AtomicReference atomicReference;
        this.pageName = atomicReference = new AtomicReference();
        this.startTime = atomicReference = new AtomicReference();
        this.endTime = atomicReference = new AtomicReference();
        this.setPageName(string2);
        this.setStartTime(string3);
        this.setEndTime(string4);
    }

    public String getEndTime() {
        return (String)this.endTime.get();
    }

    public String getPageName() {
        return (String)this.pageName.get();
    }

    public String getStartTime() {
        return (String)this.startTime.get();
    }

    public void setEndTime(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument endTime must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.endTime.set(object);
    }

    public void setPageName(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument pageName must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.pageName.set(object);
    }

    public void setStartTime(String object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument startTime must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        this.startTime.set(object);
    }
}

