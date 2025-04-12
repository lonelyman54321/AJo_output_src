/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdp.data;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class KYPSettings
implements Serializable {
    public static final int $stable = 8;
    private AudioSettings audioSettings;
    private boolean enableKyp;
    private VideoSetting videoSettings;

    public KYPSettings(boolean bl2, VideoSetting videoSetting, AudioSettings audioSettings) {
        Intrinsics.checkNotNullParameter(videoSetting, "videoSettings");
        Intrinsics.checkNotNullParameter(audioSettings, "audioSettings");
        this.enableKyp = bl2;
        this.videoSettings = videoSetting;
        this.audioSettings = audioSettings;
    }

    public static /* synthetic */ KYPSettings copy$default(KYPSettings kYPSettings, boolean bl2, VideoSetting videoSetting, AudioSettings audioSettings, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = kYPSettings.enableKyp;
        }
        if ((n4 = n3 & 2) != 0) {
            videoSetting = kYPSettings.videoSettings;
        }
        if ((n3 &= 4) != 0) {
            audioSettings = kYPSettings.audioSettings;
        }
        return kYPSettings.copy(bl2, videoSetting, audioSettings);
    }

    public final boolean component1() {
        return this.enableKyp;
    }

    public final VideoSetting component2() {
        return this.videoSettings;
    }

    public final AudioSettings component3() {
        return this.audioSettings;
    }

    public final KYPSettings copy(boolean bl2, VideoSetting videoSetting, AudioSettings audioSettings) {
        Intrinsics.checkNotNullParameter(videoSetting, "videoSettings");
        Intrinsics.checkNotNullParameter(audioSettings, "audioSettings");
        KYPSettings kYPSettings = new KYPSettings(bl2, videoSetting, audioSettings);
        return kYPSettings;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KYPSettings;
        if (!bl3) {
            return false;
        }
        object = (KYPSettings)object;
        bl3 = this.enableKyp;
        boolean bl4 = ((KYPSettings)object).enableKyp;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.videoSettings;
        VideoSetting videoSetting = ((KYPSettings)object).videoSettings;
        bl3 = Intrinsics.areEqual(object2, videoSetting);
        if (!bl3) {
            return false;
        }
        object2 = this.audioSettings;
        object = ((KYPSettings)object).audioSettings;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final AudioSettings getAudioSettings() {
        return this.audioSettings;
    }

    public final boolean getEnableKyp() {
        return this.enableKyp;
    }

    public final VideoSetting getVideoSettings() {
        return this.videoSettings;
    }

    public int hashCode() {
        int n3 = this.enableKyp;
        n3 = n3 != 0 ? 1231 : 1237;
        int n4 = (this.videoSettings.hashCode() + (n3 *= 31)) * 31;
        return this.audioSettings.hashCode() + n4;
    }

    public final void setAudioSettings(AudioSettings audioSettings) {
        Intrinsics.checkNotNullParameter(audioSettings, "<set-?>");
        this.audioSettings = audioSettings;
    }

    public final void setEnableKyp(boolean bl2) {
        this.enableKyp = bl2;
    }

    public final void setVideoSettings(VideoSetting videoSetting) {
        Intrinsics.checkNotNullParameter(videoSetting, "<set-?>");
        this.videoSettings = videoSetting;
    }

    public String toString() {
        boolean bl2 = this.enableKyp;
        VideoSetting videoSetting = this.videoSettings;
        AudioSettings audioSettings = this.audioSettings;
        StringBuilder stringBuilder = new StringBuilder("KYPSettings(enableKyp=");
        stringBuilder.append(bl2);
        stringBuilder.append(", videoSettings=");
        stringBuilder.append(videoSetting);
        stringBuilder.append(", audioSettings=");
        stringBuilder.append(audioSettings);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

