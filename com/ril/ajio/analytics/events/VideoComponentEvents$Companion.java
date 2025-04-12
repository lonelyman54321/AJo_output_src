/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import com.ril.ajio.analytics.events.VideoComponentEvents;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class VideoComponentEvents$Companion {
    private VideoComponentEvents$Companion() {
    }

    public /* synthetic */ VideoComponentEvents$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final VideoComponentEvents getInstance() {
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.access$getVideoComponentEvents$cp();
        if (videoComponentEvents == null) {
            videoComponentEvents = new VideoComponentEvents(null);
            VideoComponentEvents.access$setVideoComponentEvents$cp(videoComponentEvents);
        }
        videoComponentEvents = VideoComponentEvents.access$getVideoComponentEvents$cp();
        Intrinsics.checkNotNull(videoComponentEvents, "null cannot be cast to non-null type com.ril.ajio.analytics.events.VideoComponentEvents");
        return videoComponentEvents;
    }
}

