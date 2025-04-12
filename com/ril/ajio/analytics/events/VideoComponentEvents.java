/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.events;

import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.VideoComponentEvents$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class VideoComponentEvents {
    public static final int $stable;
    public static final VideoComponentEvents$Companion Companion;
    private static VideoComponentEvents videoComponentEvents;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final String previousScreen;
    private final String previousScreenType;

    static {
        VideoComponentEvents$Companion videoComponentEvents$Companion;
        Companion = videoComponentEvents$Companion = new VideoComponentEvents$Companion(null);
        $stable = 8;
    }

    private VideoComponentEvents() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.newCustomEventsRevamp = object2;
        this.previousScreen = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.previousScreenType = object = cv_0.a((AnalyticsManager$Companion)object);
    }

    public /* synthetic */ VideoComponentEvents(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ VideoComponentEvents access$getVideoComponentEvents$cp() {
        return videoComponentEvents;
    }

    public static final /* synthetic */ void access$setVideoComponentEvents$cp(VideoComponentEvents videoComponentEvents) {
        VideoComponentEvents.videoComponentEvents = videoComponentEvents;
    }

    public static final VideoComponentEvents getInstance() {
        return Companion.getInstance();
    }

    public static /* synthetic */ void logCloseVideoEvent$default(VideoComponentEvents videoComponentEvents, String string2, boolean bl2, long l2, String string3, String string4, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 1;
        String string5 = "";
        String string6 = n4 != 0 ? string5 : string2;
        n4 = n3 & 2;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n4 = n3 & 4;
        long l3 = n4 != 0 ? 0L : l2;
        n4 = n3 & 8;
        String string7 = n4 != 0 ? string5 : string3;
        videoComponentEvents.logCloseVideoEvent(string6, bl3, l3, string7, string4);
    }

    public static /* synthetic */ void logExpandMinimizeEvent$default(VideoComponentEvents videoComponentEvents, boolean bl2, String string2, boolean bl3, long l2, String string3, String string4, String string5, int n3, Object object) {
        long l3;
        boolean bl4;
        int n4 = n3 & 2;
        String string6 = "";
        String string7 = n4 != 0 ? string6 : string2;
        n4 = n3 & 4;
        if (n4 != 0) {
            n4 = 0;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        n4 = n3 & 8;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        n4 = n3 & 0x10;
        String string8 = n4 != 0 ? string6 : string3;
        n4 = n3 & 0x40;
        String string9 = n4 != 0 ? string6 : string5;
        videoComponentEvents.logExpandMinimizeEvent(bl2, string7, bl4, l4, string8, string4, string9);
    }

    public static /* synthetic */ void logMuteUnMuteEvent$default(VideoComponentEvents videoComponentEvents, String string2, boolean bl2, boolean bl3, String string3, boolean bl4, long l2, String string4, int n3, Object object) {
        long l3;
        boolean bl5;
        int n4 = n3 & 1;
        String string5 = "";
        String string6 = n4 != 0 ? string5 : string2;
        n4 = n3 & 8;
        String string7 = n4 != 0 ? string5 : string3;
        n4 = n3 & 0x10;
        if (n4 != 0) {
            n4 = 0;
            bl5 = false;
        } else {
            bl5 = bl4;
        }
        n4 = n3 & 0x20;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        videoComponentEvents.logMuteUnMuteEvent(string6, bl2, bl3, string7, bl5, l4, string4);
    }

    public static /* synthetic */ void logPlayPauseEvent$default(VideoComponentEvents videoComponentEvents, String string2, boolean bl2, long l2, String string3, String string4, boolean bl3, boolean bl4, String string5, String string6, int n3, Object object) {
        boolean bl5;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = "";
        String string8 = n7 != 0 ? string7 : string2;
        n7 = n4 & 2;
        if (n7 != 0) {
            n7 = 0;
            bl5 = false;
        } else {
            bl5 = bl2;
        }
        n7 = n4 & 4;
        long l3 = n7 != 0 ? 0L : l2;
        String string9 = (n4 &= 0x80) != 0 ? string7 : string5;
        videoComponentEvents.logPlayPauseEvent(string8, bl5, l3, string3, string4, bl3, bl4, string9, string6);
    }

    public static /* synthetic */ void logPrevNextSwipeEvent$default(VideoComponentEvents videoComponentEvents, boolean bl2, String string2, boolean bl3, long l2, int n3, Object object) {
        boolean bl4;
        int n4 = n3 & 2;
        if (n4 != 0) {
            string2 = "";
        }
        String string3 = string2;
        int n7 = n3 & 4;
        if (n7 != 0) {
            bl3 = false;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        n7 = n3 & 8;
        if (n7 != 0) {
            l2 = 0L;
        }
        videoComponentEvents.logPrevNextSwipeEvent(bl2, string3, bl4, l2);
    }

    public static /* synthetic */ void logReplayEvent$default(VideoComponentEvents videoComponentEvents, boolean bl2, String string2, boolean bl3, long l2, String string3, String string4, String string5, int n3, Object object) {
        long l3;
        boolean bl4;
        int n4 = n3 & 2;
        String string6 = "";
        String string7 = n4 != 0 ? string6 : string2;
        n4 = n3 & 4;
        if (n4 != 0) {
            n4 = 0;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        n4 = n3 & 8;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        n4 = n3 & 0x10;
        String string8 = n4 != 0 ? string6 : string3;
        n4 = n3 & 0x40;
        String string9 = n4 != 0 ? string6 : string5;
        videoComponentEvents.logReplayEvent(bl2, string7, bl4, l4, string8, string4, string9);
    }

    public static /* synthetic */ void logShopCta$default(VideoComponentEvents videoComponentEvents, String string2, String string3, boolean bl2, long l2, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 2;
        if (n4 != 0) {
            string3 = "";
        }
        String string4 = string3;
        int n7 = n3 & 4;
        if (n7 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n7 = n3 & 8;
        if (n7 != 0) {
            l2 = 0L;
        }
        videoComponentEvents.logShopCta(string2, string4, bl3, l2);
    }

    public static /* synthetic */ void logVideoPauseEvent$default(VideoComponentEvents videoComponentEvents, String string2, String string3, boolean bl2, long l2, String string4, String string5, int n3, Object object) {
        long l3;
        boolean bl3;
        int n4 = n3 & 4;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n4 = n3 & 8;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        videoComponentEvents.logVideoPauseEvent(string2, string3, bl3, l4, string4, string5);
    }

    public static /* synthetic */ void logVideoPlayEvent$default(VideoComponentEvents videoComponentEvents, boolean bl2, boolean bl3, String string2, boolean bl4, long l2, int n3, Object object) {
        boolean bl5;
        int n4 = n3 & 4;
        if (n4 != 0) {
            string2 = "";
        }
        String string3 = string2;
        int n7 = n3 & 8;
        if (n7 != 0) {
            bl4 = false;
            bl5 = false;
        } else {
            bl5 = bl4;
        }
        n7 = n3 & 0x10;
        if (n7 != 0) {
            l2 = 0L;
        }
        videoComponentEvents.logVideoPlayEvent(bl2, bl3, string3, bl5, l2);
    }

    public static /* synthetic */ void logVideoThumbnailEvent$default(VideoComponentEvents videoComponentEvents, String string2, boolean bl2, long l2, String string3, String string4, String string5, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 1;
        String string6 = "";
        String string7 = n4 != 0 ? string6 : string2;
        n4 = n3 & 2;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n4 = n3 & 4;
        long l3 = n4 != 0 ? 0L : l2;
        n4 = n3 & 8;
        String string8 = n4 != 0 ? string6 : string3;
        n4 = n3 & 0x20;
        String string9 = n4 != 0 ? string6 : string5;
        videoComponentEvents.logVideoThumbnailEvent(string7, bl3, l3, string8, string4, string9);
    }

    public static /* synthetic */ void logVideoViewTime$default(VideoComponentEvents videoComponentEvents, String string2, boolean bl2, long l2, long l3, String string3, String string4, int n3, Object object) {
        boolean bl3;
        String string5;
        int n4 = n3 & 1;
        String string6 = n4 != 0 ? (string5 = "") : string2;
        n4 = n3 & 2;
        if (n4 != 0) {
            n4 = 0;
            string5 = null;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n4 = n3 & 4;
        long l4 = 0L;
        long l7 = n4 != 0 ? l4 : l2;
        n4 = n3 & 8;
        long l8 = n4 != 0 ? l4 : l3;
        l4 = l7;
        l7 = l8;
        videoComponentEvents.logVideoViewTime(string6, bl3, l4, l8, string3, string4);
    }

    public static /* synthetic */ void logVideoWatchEvent$default(VideoComponentEvents videoComponentEvents, boolean bl2, String string2, boolean bl3, long l2, String string3, String string4, int n3, Object object) {
        long l3;
        boolean bl4;
        int n4 = n3 & 4;
        if (n4 != 0) {
            n4 = 0;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        n4 = n3 & 8;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        videoComponentEvents.logVideoWatchEvent(bl2, string2, bl4, l4, string3, string4);
    }

    public final void logCloseVideoEvent(String string2, boolean bl2, long l2, String string3, String string4) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Bundle bundle = dm_1.a(string3, "categoryName", string4, "eventName");
        String string5 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string5, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = this.previousScreen;
        String string9 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, "video close", "", string4, string6, string7, string8, bundle, string9, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logExpandMinimizeEvent(boolean bl2, String string2, boolean bl3, long l2, String string3, String string4, String string5) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Intrinsics.checkNotNullParameter(string3, "categoryName");
        Object object2 = "actionName";
        Bundle bundle = dm_1.a(string4, "eventName", string5, (String)object2);
        String string6 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string6, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl3);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = bl2 ? "expand full screen" : "minimize full screen";
        String string7 = object;
        object2 = videoComponentEvents.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = videoComponentEvents.previousScreen;
        String string11 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string5, string7, string4, string8, string9, string10, bundle, string11, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logMuteUnMuteEvent(String string2, boolean bl2, boolean bl3, String string3, boolean bl4, long l2, String string4) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string3;
        Intrinsics.checkNotNullParameter(string2, "categoryName");
        Object object2 = "eventName";
        Bundle bundle = dm_1.a(string3, "videoName", string4, (String)object2);
        String string5 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string5, string3);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl4);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = this.newCustomEventsRevamp;
        object = bl2 ? ((NewCustomEventsRevamp)object).getEA_FULL_SCREEN() : ((NewCustomEventsRevamp)object).getEA_MINIMIZED();
        Object object3 = object;
        object = bl3 ? "mute" : "un mute";
        Object object4 = object;
        object2 = videoComponentEvents.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = videoComponentEvents.previousScreen;
        String string9 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, (String)object3, (String)object4, string4, string6, string7, string8, bundle, string9, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logPlayPauseEvent(String string2, boolean bl2, long l2, String string3, String string4, boolean bl3, boolean bl4, String string5, String string6) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Intrinsics.checkNotNullParameter(string3, "productId");
        Intrinsics.checkNotNullParameter(string4, "productName");
        String string7 = "eventName";
        Bundle bundle = dm_1.a(string5, "categoryName", string6, string7);
        String string8 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string8, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        bundle.putString("product_id", string3);
        bundle.putString("product_name", string4);
        object = this.newCustomEventsRevamp;
        object = bl3 ? ((NewCustomEventsRevamp)object).getEA_FULL_SCREEN() : ((NewCustomEventsRevamp)object).getEA_MINIMIZED();
        Object object2 = object;
        object = videoComponentEvents.newCustomEventsRevamp;
        object = bl4 ? ((NewCustomEventsRevamp)object).getEA_VIDEO_PLAYED() : ((NewCustomEventsRevamp)object).getEA_VIDEO_PAUSED();
        Object object3 = object;
        NewCustomEventsRevamp newCustomEventsRevamp = videoComponentEvents.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = av_0.a((AnalyticsManager$Companion)object);
        String string11 = videoComponentEvents.previousScreen;
        String string12 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, (String)object3, (String)object2, string6, string9, string10, string11, bundle, string12, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logPrevNextSwipeEvent(boolean bl2, String string2, boolean bl3, long l2) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Bundle bundle = new Bundle();
        String string3 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string3, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl3);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = bl2 ? "next video" : "previous video";
        String string4 = object;
        NewCustomEventsRevamp newCustomEventsRevamp = videoComponentEvents.newCustomEventsRevamp;
        String string5 = newCustomEventsRevamp.getEC_SHOP_THE_LOOK();
        String string6 = videoComponentEvents.newCustomEventsRevamp.getEV_NAME_VIDEO_SCREEN_INTERACTION();
        object = AnalyticsManager.Companion;
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = videoComponentEvents.previousScreen;
        String string10 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string4, "", string6, string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logReplayEvent(boolean bl2, String string2, boolean bl3, long l2, String string3, String string4, String string5) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Intrinsics.checkNotNullParameter(string3, "categoryName");
        Object object2 = "actionName";
        Bundle bundle = dm_1.a(string4, "eventName", string5, (String)object2);
        String string6 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string6, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        boolean bl4 = bl3;
        bundle.putBoolean((String)object, bl3);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = this.newCustomEventsRevamp.getVIDEO_LOOPS();
        int n3 = 1;
        bundle.putInt((String)object, n3);
        object = bl2 ? "reload click" : "video looped";
        String string7 = object;
        object2 = videoComponentEvents.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = videoComponentEvents.previousScreen;
        String string11 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string5, string7, string4, string8, string9, string10, bundle, string11, false, null, 1536, null);
    }

    public final void logShopCta(String string2, String string3, boolean bl2, long l2) {
        Object object = string3;
        Bundle bundle = dm_1.a(string2, "ctaText", string3, "videoName");
        String string4 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string4, string3);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        String string5 = newCustomEventsRevamp.getEV_NAME_VIDEO_SCREEN_INTERACTION();
        String string6 = this.newCustomEventsRevamp.getEA_FULL_SCREEN_CTA();
        String string7 = this.newCustomEventsRevamp.getEV_NAME_VIDEO_SCREEN_INTERACTION();
        object = AnalyticsManager.Companion;
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = this.previousScreen;
        String string11 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string6, string2, string7, string8, string9, string10, bundle, string11, false, null, 1536, null);
    }

    public final void logVideoPauseEvent(String string2, String string3, boolean bl2, long l2, String string4, String string5) {
        Object object = string3;
        Intrinsics.checkNotNullParameter(string2, "categoryName");
        Intrinsics.checkNotNullParameter(string3, "videoName");
        Bundle bundle = dm_1.a(string4, "eventName", string5, "actionName");
        String string6 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string6, string3);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = this.previousScreen;
        String string10 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, "press & hold", string4, string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logVideoPlayEvent(boolean bl2, boolean bl3, String string2, boolean bl4, long l2) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Bundle bundle = new Bundle();
        String string3 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string3, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl4);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = bl2 ? "full screen" : "minimize";
        String string4 = object;
        object = videoComponentEvents.newCustomEventsRevamp;
        object = bl3 ? ((NewCustomEventsRevamp)object).getEV_NAME_LANDING_SCREEN_INTERACTION() : ((NewCustomEventsRevamp)object).getEV_NAME_VIDEO_SCREEN_INTERACTION();
        Object object2 = object;
        NewCustomEventsRevamp newCustomEventsRevamp = videoComponentEvents.newCustomEventsRevamp;
        String string5 = newCustomEventsRevamp.getEC_SHOP_THE_LOOK();
        String string6 = videoComponentEvents.newCustomEventsRevamp.getEA_VIDEO_PLAY();
        object = AnalyticsManager.Companion;
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = videoComponentEvents.previousScreen;
        String string10 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string6, string4, (String)object2, string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    public final void logVideoThumbnailEvent(String string2, boolean bl2, long l2, String string3, String string4, String string5) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Intrinsics.checkNotNullParameter(string3, "categoryName");
        Bundle bundle = dm_1.a(string4, "eventName", string5, "actionName");
        String string6 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string6, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        object = AnalyticsManager.Companion;
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = this.previousScreen;
        String string10 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string5, "", string4, string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    public final void logVideoViewTime(String string2, boolean bl2, long l2, long l3, String string3, String string4) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        Bundle bundle = dm_1.a(string3, "eventName", string4, "categoryName");
        String string5 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string5, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        bundle.putBoolean((String)object, bl2);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = this.newCustomEventsRevamp.getVIDEO_TOTAL_VIEW_TIME();
        bundle.putLong((String)object, l3);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        String string6 = newCustomEventsRevamp.getEA_VIDEO_VIEW_TIME();
        object = AnalyticsManager.Companion;
        String string7 = av_0.a((AnalyticsManager$Companion)object);
        String string8 = av_0.a((AnalyticsManager$Companion)object);
        String string9 = this.previousScreen;
        String string10 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string6, "", string3, string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void logVideoWatchEvent(boolean bl2, String string2, boolean bl3, long l2, String string3, String string4) {
        VideoComponentEvents videoComponentEvents = this;
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "videoName");
        String string5 = "event";
        Bundle bundle = dm_1.a(string3, "categoryName", string4, string5);
        String string6 = this.newCustomEventsRevamp.getVIDEO_NAME();
        bundle.putString(string6, string2);
        object = this.newCustomEventsRevamp.getIS_AUTO_PLAY_ENABLED();
        boolean bl4 = bl3;
        bundle.putBoolean((String)object, bl3);
        object = this.newCustomEventsRevamp.getVIDEO_LOAD_TIME();
        bundle.putLong((String)object, l2);
        object = this.newCustomEventsRevamp.getVIDEO_VIEWS();
        int n3 = 1;
        bundle.putInt((String)object, n3);
        object = bl2 ? "full screen" : "minimize";
        String string7 = object;
        NewCustomEventsRevamp newCustomEventsRevamp = videoComponentEvents.newCustomEventsRevamp;
        String string8 = newCustomEventsRevamp.getEA_VIDEO_VIEW();
        object = AnalyticsManager.Companion;
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = av_0.a((AnalyticsManager$Companion)object);
        String string11 = videoComponentEvents.previousScreen;
        String string12 = videoComponentEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string8, string7, string4, string9, string10, string11, bundle, string12, false, null, 1536, null);
    }
}

