/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.VideoSetting$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class VideoSetting {
    public static final VideoSetting$Companion Companion;
    private final Boolean autoPlay;
    private final Boolean fullScreen;
    private final Boolean loop;
    private final Boolean showTimestamp;

    static {
        VideoSetting$Companion videoSetting$Companion;
        Companion = videoSetting$Companion = new VideoSetting$Companion(null);
    }

    public VideoSetting() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ VideoSetting(int n3, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.autoPlay = n4 == 0 ? null : bl2;
        int n7 = n3 & 2;
        this.loop = n7 == 0 ? null : bl3;
        n7 = n3 & 4;
        this.showTimestamp = n7 == 0 ? null : bl4;
        this.fullScreen = (n3 &= 8) == 0 ? null : bl5;
    }

    public VideoSetting(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
        this.autoPlay = bl2;
        this.loop = bl3;
        this.showTimestamp = bl4;
        this.fullScreen = bl5;
    }

    public /* synthetic */ VideoSetting(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            bl4 = null;
        }
        if ((n3 &= 8) != 0) {
            bl5 = null;
        }
        this(bl2, bl3, bl4, bl5);
    }

    public static /* synthetic */ VideoSetting copy$default(VideoSetting videoSetting, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = videoSetting.autoPlay;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = videoSetting.loop;
        }
        if ((n4 = n3 & 4) != 0) {
            bl4 = videoSetting.showTimestamp;
        }
        if ((n3 &= 8) != 0) {
            bl5 = videoSetting.fullScreen;
        }
        return videoSetting.copy(bl2, bl3, bl4, bl5);
    }

    public static final /* synthetic */ void write$Self$shared_release(VideoSetting object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Boolean bl2;
        Object object2;
        int n3 = 0;
        boolean bl3 = u30_02.I(serialDescriptor, 0);
        if (bl3 || (object2 = ((VideoSetting)object).autoPlay) != null) {
            object2 = cz_2.a;
            bl2 = ((VideoSetting)object).autoPlay;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, bl2);
        }
        if ((bl3 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((VideoSetting)object).loop) != null) {
            object2 = cz_2.a;
            bl2 = ((VideoSetting)object).loop;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, bl2);
        }
        if ((bl3 = u30_02.I(serialDescriptor, n3 = 2)) || (object2 = ((VideoSetting)object).showTimestamp) != null) {
            object2 = cz_2.a;
            bl2 = ((VideoSetting)object).showTimestamp;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, bl2);
        }
        if ((bl3 = u30_02.I(serialDescriptor, n3 = 3)) || (object2 = ((VideoSetting)object).fullScreen) != null) {
            object2 = cz_2.a;
            object = ((VideoSetting)object).fullScreen;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Boolean component1() {
        return this.autoPlay;
    }

    public final Boolean component2() {
        return this.loop;
    }

    public final Boolean component3() {
        return this.showTimestamp;
    }

    public final Boolean component4() {
        return this.fullScreen;
    }

    public final VideoSetting copy(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
        VideoSetting videoSetting = new VideoSetting(bl2, bl3, bl4, bl5);
        return videoSetting;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VideoSetting;
        if (!bl3) {
            return false;
        }
        object = (VideoSetting)object;
        Boolean bl4 = this.autoPlay;
        Boolean bl5 = ((VideoSetting)object).autoPlay;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.loop;
        bl5 = ((VideoSetting)object).loop;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.showTimestamp;
        bl5 = ((VideoSetting)object).showTimestamp;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.fullScreen;
        object = ((VideoSetting)object).fullScreen;
        boolean bl6 = Intrinsics.areEqual(bl4, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final Boolean getFullScreen() {
        return this.fullScreen;
    }

    public final Boolean getLoop() {
        return this.loop;
    }

    public final Boolean getShowTimestamp() {
        return this.showTimestamp;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.autoPlay;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Boolean bl3 = this.loop;
        if (bl3 == null) {
            n3 = 0;
            bl3 = null;
        } else {
            n3 = ((Object)bl3).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl3 = this.showTimestamp;
        if (bl3 == null) {
            n3 = 0;
            bl3 = null;
        } else {
            n3 = ((Object)bl3).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl3 = this.fullScreen;
        if (bl3 != null) {
            n7 = ((Object)bl3).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.autoPlay;
        Boolean bl3 = this.loop;
        Boolean bl4 = this.showTimestamp;
        Boolean bl5 = this.fullScreen;
        StringBuilder stringBuilder = new StringBuilder("VideoSetting(autoPlay=");
        stringBuilder.append(bl2);
        stringBuilder.append(", loop=");
        stringBuilder.append(bl3);
        stringBuilder.append(", showTimestamp=");
        stringBuilder.append(bl4);
        stringBuilder.append(", fullScreen=");
        stringBuilder.append(bl5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

